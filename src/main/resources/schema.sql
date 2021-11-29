-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS user;
CREATE TABLE user
(
    id                           bigint(20) NOT NULL COMMENT '序号',
    name                         varchar(50) NOT NULL COMMENT '姓名',
    age                          varchar(20) NULL DEFAULT NULL COMMENT '年龄',
    balance                      number(10,2) NULL DEFAULT NULL COMMENT '数值'
);