-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 27, 2022 at 01:38 AM
-- Server version: 10.4.20-MariaDB
-- PHP Version: 8.0.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hospital management system`
--

-- --------------------------------------------------------

--
-- Table structure for table `cardiology_clinic`
--

CREATE TABLE `cardiology_clinic` (
  `P_No` int(100) NOT NULL,
  `Patient_ID` int(100) NOT NULL,
  `Patient_Name` varchar(100) NOT NULL,
  `Date` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `cardiology_clinic`
--

INSERT INTO `cardiology_clinic` (`P_No`, `Patient_ID`, `Patient_Name`, `Date`) VALUES
(1, 0, 'nethmi', '2022-01-11'),
(2, 0, 'name1', '2022-01-13'),
(3, 0, 'nethmi', '2022-01-13'),
(4, 0, 'nethmi', '2022-01-19'),
(5, 0, 'nethmi', '2022-01-10'),
(6, 0, 'nethmi', '2022-01-13'),
(7, 0, 'nethmi', '2022-01-13');

-- --------------------------------------------------------

--
-- Table structure for table `clinic`
--

CREATE TABLE `clinic` (
  `Clinic_ID` int(100) NOT NULL,
  `Clinic_Name` varchar(100) NOT NULL,
  `Doctor_ID` int(100) NOT NULL,
  `Date` varchar(20) NOT NULL,
  `Time` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `clinic`
--

INSERT INTO `clinic` (`Clinic_ID`, `Clinic_Name`, `Doctor_ID`, `Date`, `Time`) VALUES
(1, 'Eye clinic', 1, 'Monday', '08:00 - 12:00'),
(2, 'Cardiology clinic', 2, 'Tuesday', '08:00 - 12:00'),
(3, 'Ear, nose and throat', 3, 'Thursday ', '08:00 - 12:00'),
(4, 'Orthopedic Clinic', 4, 'Friday', '08:00 - 12:00');

-- --------------------------------------------------------

--
-- Table structure for table `doctor`
--

CREATE TABLE `doctor` (
  `Doctor_ID` int(100) NOT NULL,
  `Doctor_Name` varchar(100) NOT NULL,
  `DOB` date NOT NULL,
  `Age` int(5) NOT NULL,
  `Gender` varchar(20) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `Contact_Number` varchar(10) NOT NULL,
  `Charge` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `doctor`
--

INSERT INTO `doctor` (`Doctor_ID`, `Doctor_Name`, `DOB`, `Age`, `Gender`, `Address`, `Contact_Number`, `Charge`) VALUES
(1, 'Sandun', '1996-08-07', 25, 'Male', 'Anuradhapura', '0785689421', 1500),
(2, 'Nanduni', '1995-09-21', 26, 'Female', 'Colombo', '0785621136', 1800),
(3, 'Nethmini', '1998-04-22', 23, 'Female', 'Galnewa', '0711332965', 1500),
(4, 'Supun ', '1997-07-15', 24, 'Male', 'Anuradhapura', '0712546891', 1500);

-- --------------------------------------------------------

--
-- Table structure for table `ent_clinic`
--

CREATE TABLE `ent_clinic` (
  `P_No` int(100) NOT NULL,
  `Patient_ID` int(100) NOT NULL,
  `Patient_Name` varchar(100) NOT NULL,
  `Date` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `ent_clinic`
--

INSERT INTO `ent_clinic` (`P_No`, `Patient_ID`, `Patient_Name`, `Date`) VALUES
(1, 2, 'hdhd', '2022-01-11'),
(2, 1, 'nethmi', '2022-01-13'),
(3, 0, 'nethmi', '2022-01-14'),
(4, 1, 'nethmi', '2022-01-18'),
(5, 1, 'nethmi', '2022-01-14');

-- --------------------------------------------------------

--
-- Table structure for table `eye_clinic`
--

CREATE TABLE `eye_clinic` (
  `P_No` int(100) NOT NULL,
  `Patient_ID` int(100) NOT NULL,
  `Patient_Name` varchar(100) NOT NULL,
  `Date` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `eye_clinic`
--

INSERT INTO `eye_clinic` (`P_No`, `Patient_ID`, `Patient_Name`, `Date`) VALUES
(1, 2, 'hdhd', '2022-01-11'),
(2, 1, 'nethmi', '2022-01-11'),
(3, 3, 'name1', '2022-01-13'),
(4, 4, 'aaaa', '2022-01-13'),
(5, 1, 'nethmi', '2022-01-13');

-- --------------------------------------------------------

--
-- Table structure for table `health_record`
--

CREATE TABLE `health_record` (
  `HR_ID` int(100) NOT NULL,
  `Patient_ID` int(100) NOT NULL,
  `Clinic_ID` int(100) NOT NULL,
  `LAB_ID` int(100) NOT NULL,
  `Medicine` text NOT NULL,
  `Last_Updated_date` date NOT NULL,
  `Note` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `health_record`
--

INSERT INTO `health_record` (`HR_ID`, `Patient_ID`, `Clinic_ID`, `LAB_ID`, `Medicine`, `Last_Updated_date`, `Note`) VALUES
(1, 1, 2, 2, 'sajdghkjqstgd', '2022-01-13', 'kjhigh'),
(2, 1, 4, 4, '', '2022-01-13', ''),
(3, 2, 1, 4, '', '2022-01-13', ''),
(4, 2, 3, 2, '', '2022-01-13', ''),
(5, 1, 1, 1, '', '2022-01-13', ''),
(6, 1, 3, 4, 'kkkkkk', '2022-01-14', 'kkkkk'),
(7, 3, 2, 3, '', '2022-01-13', ''),
(8, 3, 1, 1, '', '2022-01-13', ''),
(9, 4, 1, 1, '', '2022-01-13', '');

-- --------------------------------------------------------

--
-- Table structure for table `laboratory`
--

CREATE TABLE `laboratory` (
  `LAB_ID` int(100) NOT NULL,
  `Lab_Name` varchar(100) NOT NULL,
  `Contact_Number` varchar(10) NOT NULL,
  `Charge` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `laboratory`
--

INSERT INTO `laboratory` (`LAB_ID`, `Lab_Name`, `Contact_Number`, `Charge`) VALUES
(1, 'Clinic and Medical Laboratory', '0252222123', 1000),
(2, 'Analytical Laboratory', '0252223123', 1000),
(3, 'Production Laboratory', '0252224123', 1200),
(4, 'none', 'none', 0);

-- --------------------------------------------------------

--
-- Table structure for table `lab_result`
--

CREATE TABLE `lab_result` (
  `LabResult_ No` int(100) NOT NULL,
  `Patient_ID` int(100) NOT NULL,
  `Lab_result` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `orthopedic_clinic`
--

CREATE TABLE `orthopedic_clinic` (
  `P_No` int(100) NOT NULL,
  `Patient_ID` int(100) NOT NULL,
  `Patient_Name` varchar(100) NOT NULL,
  `Date` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `orthopedic_clinic`
--

INSERT INTO `orthopedic_clinic` (`P_No`, `Patient_ID`, `Patient_Name`, `Date`) VALUES
(2, 1, 'nethmi', '2022-01-11'),
(3, 1, 'nethmi', '2022-01-14'),
(4, 1, 'nethmi', '2022-01-25'),
(5, 1, 'nethmi', '2022-01-25');

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

CREATE TABLE `patient` (
  `Patient_ID` int(100) NOT NULL,
  `Patient_Name` varchar(100) NOT NULL,
  `NIC` int(20) NOT NULL,
  `DOB` date NOT NULL,
  `Age` int(5) NOT NULL,
  `Gender` varchar(20) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `Contact_Number` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `patient`
--

INSERT INTO `patient` (`Patient_ID`, `Patient_Name`, `NIC`, `DOB`, `Age`, `Gender`, `Address`, `Contact_Number`) VALUES
(1, 'nethmi', 986130535, '2020-01-18', 2, 'Female', 'jgfjhfjhf', '3476768'),
(2, 'hdhd', 971972840, '2019-01-26', 3, 'Male', 'gfhgj', '231456768'),
(3, 'name1', 11111, '2021-01-13', 1, 'Male', 'addr1', '123456'),
(4, 'aaaa', 123, '2020-01-13', 2, 'Male', 'asfasd', '1234');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cardiology_clinic`
--
ALTER TABLE `cardiology_clinic`
  ADD PRIMARY KEY (`P_No`);

--
-- Indexes for table `clinic`
--
ALTER TABLE `clinic`
  ADD PRIMARY KEY (`Clinic_ID`),
  ADD KEY `Doctor_ID` (`Doctor_ID`);

--
-- Indexes for table `doctor`
--
ALTER TABLE `doctor`
  ADD PRIMARY KEY (`Doctor_ID`);

--
-- Indexes for table `ent_clinic`
--
ALTER TABLE `ent_clinic`
  ADD PRIMARY KEY (`P_No`),
  ADD KEY `Patient_ID` (`Patient_ID`);

--
-- Indexes for table `eye_clinic`
--
ALTER TABLE `eye_clinic`
  ADD PRIMARY KEY (`P_No`),
  ADD KEY `Patient_ID` (`Patient_ID`);

--
-- Indexes for table `health_record`
--
ALTER TABLE `health_record`
  ADD PRIMARY KEY (`HR_ID`),
  ADD KEY `LAB_ID` (`LAB_ID`),
  ADD KEY `Patient_ID` (`Patient_ID`),
  ADD KEY `Clinic_ID` (`Clinic_ID`);

--
-- Indexes for table `laboratory`
--
ALTER TABLE `laboratory`
  ADD PRIMARY KEY (`LAB_ID`);

--
-- Indexes for table `lab_result`
--
ALTER TABLE `lab_result`
  ADD PRIMARY KEY (`LabResult_ No`),
  ADD KEY `Patient_ID` (`Patient_ID`);

--
-- Indexes for table `orthopedic_clinic`
--
ALTER TABLE `orthopedic_clinic`
  ADD PRIMARY KEY (`P_No`),
  ADD KEY `Patient_ID` (`Patient_ID`);

--
-- Indexes for table `patient`
--
ALTER TABLE `patient`
  ADD PRIMARY KEY (`Patient_ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cardiology_clinic`
--
ALTER TABLE `cardiology_clinic`
  MODIFY `P_No` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `clinic`
--
ALTER TABLE `clinic`
  MODIFY `Clinic_ID` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `doctor`
--
ALTER TABLE `doctor`
  MODIFY `Doctor_ID` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `ent_clinic`
--
ALTER TABLE `ent_clinic`
  MODIFY `P_No` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `eye_clinic`
--
ALTER TABLE `eye_clinic`
  MODIFY `P_No` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `health_record`
--
ALTER TABLE `health_record`
  MODIFY `HR_ID` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `laboratory`
--
ALTER TABLE `laboratory`
  MODIFY `LAB_ID` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `lab_result`
--
ALTER TABLE `lab_result`
  MODIFY `LabResult_ No` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `orthopedic_clinic`
--
ALTER TABLE `orthopedic_clinic`
  MODIFY `P_No` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `patient`
--
ALTER TABLE `patient`
  MODIFY `Patient_ID` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `clinic`
--
ALTER TABLE `clinic`
  ADD CONSTRAINT `clinic_ibfk_1` FOREIGN KEY (`Doctor_ID`) REFERENCES `doctor` (`Doctor_ID`);

--
-- Constraints for table `eye_clinic`
--
ALTER TABLE `eye_clinic`
  ADD CONSTRAINT `eye_clinic_ibfk_1` FOREIGN KEY (`Patient_ID`) REFERENCES `patient` (`Patient_ID`);

--
-- Constraints for table `health_record`
--
ALTER TABLE `health_record`
  ADD CONSTRAINT `health_record_ibfk_1` FOREIGN KEY (`LAB_ID`) REFERENCES `laboratory` (`LAB_ID`),
  ADD CONSTRAINT `health_record_ibfk_2` FOREIGN KEY (`Patient_ID`) REFERENCES `patient` (`Patient_ID`),
  ADD CONSTRAINT `health_record_ibfk_3` FOREIGN KEY (`Clinic_ID`) REFERENCES `clinic` (`Clinic_ID`);

--
-- Constraints for table `lab_result`
--
ALTER TABLE `lab_result`
  ADD CONSTRAINT `lab_result_ibfk_1` FOREIGN KEY (`Patient_ID`) REFERENCES `patient` (`Patient_ID`);

--
-- Constraints for table `orthopedic_clinic`
--
ALTER TABLE `orthopedic_clinic`
  ADD CONSTRAINT `orthopedic_clinic_ibfk_1` FOREIGN KEY (`Patient_ID`) REFERENCES `patient` (`Patient_ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
