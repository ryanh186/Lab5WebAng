CREATE TABLE `destination`
(
    `id`          int(10) unsigned NOT NULL AUTO_INCREMENT,
    `airport`     varchar(45)      NOT NULL,
    `city`        varchar(45)      NOT NULL,
    `state`       varchar(2)       NOT NULL,
    `is_active`   tinyint(4)       DEFAULT '1',
    `created_on`  datetime         DEFAULT CURRENT_TIMESTAMP,
    `updated_on`  datetime         DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;
