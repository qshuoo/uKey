# 1 数据库主键

通过数据库递增策略，保证key唯一性

    begin;
    REPLACE INTO Tickets64 (stub) VALUES ('a');
    SELECT LAST_INSERT_ID();
    commit;

优点
* 设置简单

缺点
* 性能严重依赖DB，扩展性较差。

