CREATE TABLE `airplane`
(
    `id`              int(10) unsigned NOT NULL AUTO_INCREMENT,
    `destination_id`  int(10) unsigned NOT NULL,
    `head_pilot_id`   int(10) unsigned NOT NULL,
    `capacity`        int(5)           NOT NULL,
    `model`           varchar(45)      NOT NULL,
    `company`         varchar(45)      NOT NULL,
    `crew_size`       int(45)          NOT NULL,
    `is_active`   tinyint(4)       DEFAULT '1',
    `created_on`  datetime         DEFAULT CURRENT_TIMESTAMP,
    `updated_on`  datetime         DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;
