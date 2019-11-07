CREATE TABLE `tb_test` (
  `test_id` int(11) NOT NULL AUTO_INCREMENT,
  `test_name` varchar(45) NOT NULL,
  `test_desc` varchar(45) DEFAULT NULL,
  `reg_admin` varchar(50) NOT NULL,
  `reg_date` datetime NOT NULL,
  `mod_admin` varchar(50) DEFAULT NULL,
  `mod_date` datetime DEFAULT NULL,
  `is_active` char(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`test_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
