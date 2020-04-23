CREATE TABLE `order`
(
    `id`          int(10) unsigned NOT NULL AUTO_INCREMENT,
    `customer_id` int(10) unsigned NOT NULL,
    `total_cost`  int(10)          NOT NULL,
    `is_active`   tinyint(4) DEFAULT '1',
    `created_on`  datetime   DEFAULT CURRENT_TIMESTAMP,
    `updated_on`  datetime   DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;