CREATE TABLE `event` (
  `id` int(11) NOT NULL,
  `title` varchar(255) DEFAULT NULL,
  `detail` varchar(255) DEFAULT NULL,
  `startDate` date DEFAULT NULL,
  `endDate` date DEFAULT NULL,
  `isActive` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `program` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `student` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `student_no` varchar(10) DEFAULT NULL,
  `program_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `program_id` (`program_id`),
  CONSTRAINT `student_ibfk_1` FOREIGN KEY (`program_id`) REFERENCES `program` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `event`(`id`, `title`, `detail`, `startDate`, `endDate`,`isActive`) VALUES
(1, 'Testing 1', 'Detail 1', '2019-01-01', '2019-01-31', 1),
(2, 'Testing 2', 'Detail 2', '2019-01-01', '2019-01-29', 0);

INSERT INTO `program`(`id`, `name`)
VALUES(7, 'Java Programming'), (8, 'English');

INSERT INTO `student`(`id`, `name`, `student_no`, `program_id`) VALUES
(5, 'USTADHO', 'S01', 1),
(6, 'FAHEEM', 'S01', 1),
(7, 'FATIH', 'S01', 1),
(8, 'ANA', 'S01', 2);
