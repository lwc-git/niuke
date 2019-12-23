//package pom.imooc;
//
//import redis.clients.jedis.Jedis;
//import redis.clients.jedis.JedisPool;
//import redis.clients.jedis.JedisPoolConfig;
//
//public class jedisDemo1 {
//
//    /**
//     * 单实例的测试
//     */
//    public static void Main(String[] args) {
//        /*
//
//        //设置ip地址和端口
//        Jedis jedis = new Jedis("127.0.0.1",6379);
//        //2.保存数据
//        jedis.set("name","imooc");
//        //3.获取数据
//        System.out.println(jedis.get("name"));
//        jedis.close();
//
//        */
//
//
//        //连接池方式链接
//        //获得连接池的配置对象
//        JedisPoolConfig config = new JedisPoolConfig();
//        //设置最大的连接数
//        config.setMaxTotal(30);
//        //设置最大空闲连接数
//        config.setMaxIdle(10);
//        //获得连接池
//        JedisPool jedisPool = new JedisPool(config,"127.0.0.1",6379);
//
//        //获得核心对象
//        Jedis jedis = null;
//        try{
//            jedis = jedisPool.getResource();
//            jedis.set("name","001");
//            System.out.println(jedis.get("name"));
//        }catch (Exception e){
//        }finally {
//            if(jedis!=null)jedis.close();
//            if(jedisPool!=null)jedisPool.close();
//        }
//
//    }
//}
