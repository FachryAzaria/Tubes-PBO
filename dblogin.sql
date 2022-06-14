-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 13, 2022 at 04:28 AM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dblogin`
--

-- --------------------------------------------------------

--
-- Table structure for table `tblogin`
--

CREATE TABLE `tblogin` (
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `firstname` varchar(45) NOT NULL,
  `lastname` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tblogin`
--

INSERT INTO `tblogin` (`username`, `password`, `firstname`, `lastname`) VALUES
('admin', 'admin', 'admin', 'admin'),
('Fachry', '123', 'Fachry', 'Azaria'),
('FachryAzaria@gmail.com', 'aduhakulupa', 'Fachry', 'Azaria'),
('Felix', '123', 'Felix', 'Dean'),
('rafid', '123', 'Rafid', 'Al');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tblogin`
--
ALTER TABLE `tblogin`
  ADD PRIMARY KEY (`username`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
