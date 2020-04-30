CREATE TABLE `pilot`
(
    `id`          int(10) unsigned NOT NULL AUTO_INCREMENT,
    `plane_id`    int(10) unsigned NOT NULL,
    `first_name`  varchar(128)      NOT NULL,
    `last_name`   varchar(128)      NOT NULL,
    `is_active`   tinyint(4) DEFAULT '1',
    `created_on`  datetime   DEFAULT CURRENT_TIMESTAMP,
    `updated_on`  datetime   DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;