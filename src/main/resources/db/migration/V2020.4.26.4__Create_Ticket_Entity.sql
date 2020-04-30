CREATE TABLE `ticket`
(
    `id`           int(10) unsigned NOT NULL AUTO_INCREMENT,
    `plane_id`     int(10) unsigned NOT NULL,
    `passenger_id` int(10) unsigned NOT NULL,
    `seat_number`  int(4)           NOT NULL,
    `ticket_cost`  varchar(10)      NOT NULL,
    `is_active`  tinyint(4)       DEFAULT '1',
    `created_on` datetime         DEFAULT CURRENT_TIMESTAMP,
    `updated_on` datetime         DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;
