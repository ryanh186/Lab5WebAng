CREATE TABLE `passenger`
(
    `id`               int(10) unsigned NOT NULL AUTO_INCREMENT,
    `ticket_id`        int(10) unsigned NOT NULL,
    `first_name`       varchar(128)     NOT NULL,
    `last_name`        varchar(128)     NOT NULL,
    `phone_number`     varchar(15)      NOT NULL,
    `luggage_amount`   int(5)           NOT NULL,
    `is_active`   tinyint(4)       DEFAULT '1',
    `created_on`  datetime         DEFAULT CURRENT_TIMESTAMP,
    `updated_on`  datetime         DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;
