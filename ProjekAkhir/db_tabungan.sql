-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 15, 2024 at 05:29 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_tabungan`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_login`
--

CREATE TABLE `tb_login` (
  `id` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tb_login`
--

INSERT INTO `tb_login` (`id`, `username`, `password`) VALUES
(1, 'mutiara', '12345'),
(2, 'Intan', '67890'),
(3, 'Dhelia', '23114');

-- --------------------------------------------------------

--
-- Table structure for table `tb_tabung`
--

CREATE TABLE `tb_tabung` (
  `id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `tabungan` varchar(100) NOT NULL,
  `jumlah_uang` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tb_tabung`
--

INSERT INTO `tb_tabung` (`id`, `user_id`, `tabungan`, `jumlah_uang`) VALUES
(1, 1, 'Tas', 10000),
(2, 2, 'Laptop', 200000),
(3, 3, 'tablet', 1000);

-- --------------------------------------------------------

--
-- Table structure for table `tb_tambah_tabungan`
--

CREATE TABLE `tb_tambah_tabungan` (
  `id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `tabungan` varchar(50) NOT NULL,
  `target` int(11) NOT NULL,
  `waktu_deadline` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tb_tambah_tabungan`
--

INSERT INTO `tb_tambah_tabungan` (`id`, `user_id`, `tabungan`, `target`, `waktu_deadline`) VALUES
(1, 1, 'Tas', 400000, '2024-12-15'),
(2, 2, 'Laptop', 6000000, '2025-05-15'),
(3, 3, 'tablet', 5000000, '2024-11-29');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_login`
--
ALTER TABLE `tb_login`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tb_tabung`
--
ALTER TABLE `tb_tabung`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tb_tambah_tabungan`
--
ALTER TABLE `tb_tambah_tabungan`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tb_login`
--
ALTER TABLE `tb_login`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `tb_tabung`
--
ALTER TABLE `tb_tabung`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `tb_tambah_tabungan`
--
ALTER TABLE `tb_tambah_tabungan`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
