package leetcode;/**
 * @author lwc
 * @date 2020/9/27 20:03
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName: leetcode.asia_001
 * @Description: 将Asia的log map转换为json格式
 * @version: v1.0.0
 * @author: lwc
 * @date: 2020/9/27 20:03
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/9/27      lwc          v1.0.0               修改原因
 */
public class LogToJson {

    /*
        报文示例
        {outMap={msg_head={from=CRM, to=SF, time=2020-09-27 17:39:12, version=0.1.1}, msg_content={cust_info={activate_date=2006-09-22, cust_service_level=0, cust_type=100000000, terminal_date=2099-12-31, cust_name=平措, cust_id=21911001826887, cust_status_id=100000001}, prod_list=[], busi_cha_list=[{busi_cha_info={cha_val=13518997567, cha_code=SPEC_FVPN_MAINNO, cha_name=家长号码}}, {busi_cha_info={cha_val=891, cha_code=SPEC_FVPN_GRPAREA, cha_name=家长地市}}, {busi_cha_info={cha_val=555, cha_code=SPEC_FVPN_PHONENO, cha_name=家长短号}}], order_info={new_type=0, mgmt_county=1001, so_order_id=200911244175794, done_date=2020-09-27 17:38:46.829, mgmt_district=891, so_co_serial=200911142338415, op_id=91110029, apply_channel=, is_normal=0, in_order_id=, org_id=10000001, busi_code=500000020038, channel_id=1000}}}}
     */
    public String logToJson(String log){
        char[] ch = log.toCharArray();
        List<Character> list = new ArrayList<>();
        for(char c : ch) list.add(c);
        for(int i = 0; i < list.size(); i++){
            char c = list.get(i);
            if(c == '{'){
                list.add(i+1,'\"');
                i = i + 1;
            }
            else if(c == '}'){
                if(Character.isLetterOrDigit(list.get(i-1))){
                    list.add(i, '\"');
                    i = i + 1;
                }
            }
            else if(c == '='){
                list.set(i,':');
                list.add(i,'\"');
                i = i + 1;
                if(Character.isLetterOrDigit(list.get(i+1))){
                    list.add(i+1, '\"');
                    i = i + 1;
                }
                if(list.get(i+1) == '['){
                    if(Character.isLetterOrDigit(list.get(i+2))){
                        list.add(i+1, '\"');
                        i = i + 1;
                    }
                }
                if(list.get(i+1) == ','){
                    list.add(i+1, '\"');
                    i = i + 1;
                    list.add(i+1, '\"');
                    i = i + 1;
                }
            }
            else if(c == '['){

            }
            else if(c == ']'){
                if(Character.isLetterOrDigit(list.get(i-1))){
                    list.add(i+1, '\"');
                    i = i + 1;
                }
            }
            else if(c == ','){
                if(Character.isLetterOrDigit(list.get(i-1))){
                    list.add(i,'\"');
                    i = i + 1;
                }
                if(Character.isLetterOrDigit(list.get(i+1))){
                    list.add(i+1, '\"');
                    i = i + 1;
                }
            }
        }

        String res = new String();
        for(int i = 0; i < list.size(); i++){
            res += list.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String json = scanner.nextLine();
        json = json.replace(" ","");
        System.out.println(new LogToJson().logToJson(json));
    }
}
