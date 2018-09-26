load("nashorn:mozilla_compat.js");
importPackage(com.ftkj.db.conn.dao);
importPackage(com.ftkj.tool.redis);
importPackage(com.ftkj.tool.zookeep);
//importClass(com.ftkj.db.conn.dao);
//importClass(com.ftkj.redis);
$.setShardid(101);
$.setCharset("zh");
$.setZKPath("/zgame");
$.setPool("route");
$.setServerName("route-dev");

//---zookeep-------------------------------------------
zk = new ZookeepConfig();
zk.setIpPort("127.0.0.1:2181"); //local
// zk.setIpPort("192.168.10.69:2181"); //69
zk.setUser("tim");
zk.setPwd("xgame2016");

//---redis--------------------------------------------
j = new Jredis();
j.setHost("127.0.0.1"); //69
//j.setPassword(""); //69
// j.setHost("192.168.12.115");//lex
// j.setPassword("YSaVUXw8cE9G2YTM97JHc2L6mAXmyX"); //lex
j.setPort(6379);
j.setDatabase(1);
j.setConnectionCount(10);

$.addResource(ResourceType.Jredis, new JedisUtil(j));

jdbc_game = new Jdbc();
jdbc_game.setUsername("root");
jdbc_game.setPassword("zgame2017");
jdbc_game.setDriver("com.mysql.jdbc.Driver");
// jdbc_game.setUrl("jdbc:mysql://192.168.10.181:3306/nba_101?useUnicode=true&characterEncoding=utf8");
jdbc_game.setUrl("jdbc:mysql://192.168.10.181:3306/nba_101?useUnicode=true&characterEncoding=utf8");
jdbc_game.setMinConnectionsPerPartition(10);
jdbc_game.setMaxConnectionsPerPartition(30);
jdbc_game.setAcquireIncrement(10);
jdbc_game.setPartitionCount(3);
jdbc_game.setIdleConnectionTestPeriodInSeconds(60 * 5);
jdbc_game.setStatementsCacheSize(400);

jdbc_data = new Jdbc();
jdbc_data.setUsername("root");
jdbc_data.setPassword("zgame2017");
jdbc_data.setDriver("com.mysql.jdbc.Driver");
jdbc_data.setUrl("jdbc:mysql://192.168.10.181:3306/nba_data?useUnicode=true&characterEncoding=utf8");
jdbc_data.setMinConnectionsPerPartition(1);
jdbc_data.setMaxConnectionsPerPartition(5);
jdbc_data.setAcquireIncrement(10);
jdbc_data.setPartitionCount(3);
jdbc_data.setIdleConnectionTestPeriodInSeconds(60 * 5);
jdbc_data.setStatementsCacheSize(400);

jdbc_nba = new Jdbc();
jdbc_nba.setUsername("root");
jdbc_nba.setPassword("zgame2017");
jdbc_nba.setDriver("com.mysql.jdbc.Driver");
jdbc_nba.setUrl("jdbc:mysql://192.168.10.181:3306/nba_data?useUnicode=true&characterEncoding=utf8");
jdbc_nba.setMinConnectionsPerPartition(1);
jdbc_nba.setMaxConnectionsPerPartition(5);
jdbc_nba.setAcquireIncrement(10);
jdbc_nba.setPartitionCount(3);
jdbc_nba.setIdleConnectionTestPeriodInSeconds(60 * 5);
jdbc_nba.setStatementsCacheSize(400);

$.addResource(ResourceType.DB_nba, new Database(jdbc_nba));
$.addResource(ResourceType.DB_data, new Database(jdbc_data));
$.addResource(ResourceType.DB_game, new Database(jdbc_game));
$.addResource(ResourceType.Zookeep, zk);
