-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 11, 2023 at 06:56 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `laporajapbo`
--

-- --------------------------------------------------------

--
-- Table structure for table `kontakpenting`
--

CREATE TABLE `kontakpenting` (
  `id` int(10) NOT NULL,
  `namainstansi` varchar(255) NOT NULL,
  `nomorinstansi` varchar(255) NOT NULL,
  `alamat` varchar(255) NOT NULL,
  `jenisinstansi` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `kontakpenting`
--

INSERT INTO `kontakpenting` (`id`, `namainstansi`, `nomorinstansi`, `alamat`, `jenisinstansi`) VALUES
(1, 'Rumah Sakit Umum Bina Sehat', '(022) 5207964', 'Dayeuhkolot, Kabupaten Bandung, Jawa Barat', 'Rumah Sakit'),
(2, 'Polsek Dayeuhkolot', '(022) 5206316', 'Buah Batu, Kabupaten Bandung, Jawa Barat', 'Kantor Polisi'),
(3, 'RS Sartika Asih Bandung', '(022) 5229544', 'Regol, Kabupaten Bandung, Jawa Barat', 'Rumah Sakit'),
(4, 'Polsek Banjaran', '(022) 5940398', 'Banjaran, Kabupaten Bandung, Jawa Barat', 'Kantor Polisi'),
(5, 'Dinas Pemadam Kebakaran dan Penyelamatan', '(022) 5891113', 'Soreang, Kabupaten Bandung, Jawa Barat', 'Kantor Pemadam');

-- --------------------------------------------------------

--
-- Table structure for table `laporan`
--

CREATE TABLE `laporan` (
  `id` int(10) NOT NULL,
  `user_id` int(10) NOT NULL,
  `judul` varchar(255) NOT NULL,
  `alamat` varchar(255) NOT NULL,
  `deskripsi` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `laporan`
--

INSERT INTO `laporan` (`id`, `user_id`, `judul`, `alamat`, `deskripsi`) VALUES
(1, 2, 'Tolong ada maling', 'Jl. Sukasari', 'Motor saya kemalingan'),
(2, 3, 'Butuh uang cicilan', 'Jl. Golf', 'Tolong banget saya butuh uang');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(10) NOT NULL,
  `firstname` varchar(255) NOT NULL,
  `lastname` varchar(255) NOT NULL,
  `nomorhp` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `firstname`, `lastname`, `nomorhp`, `email`, `password`) VALUES
(1, 'Surya', 'Mirya', '0889234245', 'suryamirya@gmail.com', 'suryaadmin'),
(2, 'Rizky', 'Nur', '089422342772', 'rizkynur@gmail.com', 'akurizky'),
(3, 'Muhammad', 'Nuh', '08972449234', 'muhnuh@gmail.com', 'akumuhnuh');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `kontakpenting`
--
ALTER TABLE `kontakpenting`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `laporan`
--
ALTER TABLE `laporan`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK_user_id` (`user_id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `kontakpenting`
--
ALTER TABLE `kontakpenting`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `laporan`
--
ALTER TABLE `laporan`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `laporan`
--
ALTER TABLE `laporan`
  ADD CONSTRAINT `FK_user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
