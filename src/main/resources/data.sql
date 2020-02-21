-- INSERT AIRPORT --
INSERT INTO `airport`
VALUES
(1, "Reagan Airport", "Reagan Airport", "Arlington", "Virginia", "United States of America", "22202"),
(2, "Singapore Changi Airport", "Airport Blvd", "Changi", "", "Singapore", "486762"),
(3, "Airport 3","Airport Address 3", "City 3","State 3", "Country 3", "333333"),
(4, "Airport 4","Airport Address 4", "City 4","State 4", "Country 4", "444444"),
(5, "Airport 5","Airport Address 5", "City 5","State 5", "Country 5", "555555"),
(6, "Airport 6","Airport Address 6", "City 6","State 6", "Country 6", "666666"),
(7, "Airport 7","Airport Address 7", "City 7","State 7", "Country 7", "777777"),
(8, "Airport 8","Airport Address 8", "City 8","State 8", "Country 8", "888888"),
(9, "Airport 9","Airport Address 9", "City 9","State 9", "Country 9", "999999"),
(10, "Airport 10","Airport Address 10", "City 10","State 10", "Country 10", "101010"),
(11, "Airport 11","Airport Address 11", "City 11","State 11", "Country 11", "111111"),
(12, "Airport 12","Airport Address 12", "City 12","State 12", "Country 12", "121212"),
(13, "Airport 13","Airport Address 13", "City 13","State 13", "Country 13", "131313"),
(14, "Airport 14","Airport Address 14", "City 14","State 14", "Country 14", "141414"),
(15, "Airport 15","Airport Address 15", "City 15","State 15", "Country 15", "151515");


-- INSERT FLIGHT --
INSERT INTO `flight`
VALUES
(1, 1, 2, 50, 300, DATE_ADD(CURRENT_TIMESTAMP, INTERVAL 2 DAY), CURRENT_TIMESTAMP),
(2, 1, 3, 50, 310, DATE_ADD(CURRENT_TIMESTAMP, INTERVAL 2 DAY) , CURRENT_TIMESTAMP),
(3, 1, 4, 50, 320, DATE_ADD(CURRENT_TIMESTAMP, INTERVAL 1 DAY) , CURRENT_TIMESTAMP),
(4, 1, 5, 50, 330, DATE_ADD(CURRENT_TIMESTAMP, INTERVAL 1 DAY) , CURRENT_TIMESTAMP),
(5, 1, 6, 50, 340, DATE_ADD(CURRENT_TIMESTAMP, INTERVAL 1 DAY) , CURRENT_TIMESTAMP),
(6, 1, 7, 50, 350, DATE_ADD(CURRENT_TIMESTAMP, INTERVAL 2 DAY) , CURRENT_TIMESTAMP),
(7, 1, 8, 50, 360, DATE_ADD(CURRENT_TIMESTAMP, INTERVAL 2 DAY) , CURRENT_TIMESTAMP),
(8, 1, 9, 50, 100, DATE_ADD(CURRENT_TIMESTAMP, INTERVAL 2 DAY) , CURRENT_TIMESTAMP),
(9, 1, 10, 50, 110, DATE_ADD(CURRENT_TIMESTAMP, INTERVAL 2 DAY) , CURRENT_TIMESTAMP),
(10, 2, 1, 50, 300, DATE_ADD(CURRENT_TIMESTAMP, INTERVAL 2 DAY) , CURRENT_TIMESTAMP),
(11, 3, 1, 50, 310, DATE_ADD(CURRENT_TIMESTAMP, INTERVAL 2 DAY) , CURRENT_TIMESTAMP),
(12, 4, 1, 50, 320, DATE_ADD(CURRENT_TIMESTAMP, INTERVAL 2 DAY) , CURRENT_TIMESTAMP),
(13, 5, 1, 50, 330, DATE_ADD(CURRENT_TIMESTAMP, INTERVAL 2 DAY) , CURRENT_TIMESTAMP),
(14, 6, 1, 50, 340, DATE_ADD(CURRENT_TIMESTAMP, INTERVAL 1 DAY) , CURRENT_TIMESTAMP),
(15, 7, 1, 50, 350, DATE_ADD(CURRENT_TIMESTAMP, INTERVAL 1 DAY) , CURRENT_TIMESTAMP),
(16, 8, 1, 50, 360, DATE_ADD(CURRENT_TIMESTAMP, INTERVAL 1 DAY) , CURRENT_TIMESTAMP),
(17, 9, 1, 50, 370, DATE_ADD(CURRENT_TIMESTAMP, INTERVAL 2 DAY) , CURRENT_TIMESTAMP),
(18, 10, 1, 50, 100, DATE_ADD(CURRENT_TIMESTAMP, INTERVAL 2 DAY) , CURRENT_TIMESTAMP);

-- INSERT TRAVELER --

INSERT INTO `traveler`
VALUES
(1, 'Traveler 1 First Name', 'Traveler 1 Last Name', '1990-01-01', '123-234-9999', 'some1@email.com','Street Number 1', 'Some Country 1', null, 'City 1', '111111'),
(2, 'Traveler 2 First Name', 'Traveler 2 Last Name', '1991-02-02', '123-234-8888', 'some2@email.com','Street Number 2', 'Some Country 1', null, 'City 1', '111111'),
(3, 'Traveler 3 First Name', 'Traveler 3 Last Name', '1992-03-03', '123-234-7777', 'some3@email.com','Street Number 3', 'Some Country 1', null, 'City 2', '222222'),
(4, 'Traveler 3 First Name', 'Traveler 4 Last Name', '1993-04-04', '123-234-6666', 'some4@email.com','Street Number 4', 'Some Country 2', null, 'City 3', '333333'),
(5, 'Traveler 4 First Name', 'Traveler 5 Last Name', '1994-05-05', '123-234-5555', 'some5@email.com','Street Number 5', 'Some Country 2', null, 'City 4', '444444'),
(6, 'Traveler 5 First Name', 'Traveler 6 Last Name', '1995-06-06', '123-234-4444', 'some6@email.com','Street Number 6', 'Some Country 3', null, 'City 5', '555555'),
(7, 'Traveler 6 First Name', 'Traveler 7 Last Name', '1996-07-07', '123-234-3333', 'some7@email.com','Street Number 7', 'Some Country 4', null, 'City 6', '666666'),
(8, 'Traveler 7 First Name', 'Traveler 8 Last Name', '1997-08-08', '123-234-2222', 'some8@email.com','Street Number 8', 'Some Country 2', null, 'City 7', '777777'),
(9, 'Traveler 8 First Name', 'Traveler 9 Last Name', '1998-09-09', '123-234-1111', 'some9@email.com','Street Number 9', 'Some Country 3', null, 'City 8', '888888'),
(10, 'Traveler 9 First Name', 'Traveler 10 Last Name', '1999-10-10', '123-233-9999', 'some10@email.com','Street Number 10', 'Some Country 5', null, 'City 5', '555555'),
(11, 'Traveler 10 First Name', 'Traveler 11 Last Name', '1989-11-11', '123-235-9999', 'some11@email.com','Street Number 11', 'Some Country 6', null, 'City 5', '555555');


-- INSERT TRAVEL_AGENCY --
INSERT INTO `travel_agency`
VALUES
(1, 'Travel Agency 1', '222-222-2222', 'agency1@email.com', 10),
(2, 'Travel Agency 2', '222-222-3333', 'agency2@email.com', 15),
(3, 'Travel Agency 3', '222-222-2223', 'agency3@email.com', 11),
(4, 'Travel Agency 4', '222-222-2224', 'agency4@email.com', 20),
(5, 'Travel Agency 5', '222-222-2225', 'agency5@email.com', 30);

-- INSERT USER --
INSERT INTO `user`
VALUES
(1, 'counter1@email.com','counterpassword1', 'COUNTER', null, 'Counter 1 First Name', 'Counter 1 Last Name', '1990-01-01','123-233-1231','Street Number 1','Some Country 1', null ,'City 1','111111'),
(2, 'some1@email.com', 'travelerpassword1', 'TRAVELER', null, 'Traveler 1 First Name', 'Traveler 1 Last Name', '1990-01-01', '123-234-9999', 'Street Number 1', 'Some Country 1', null, 'City 1', '111111'),
(3, 'some2@email.com', 'travelerpassword2', 'TRAVELER', null, 'Traveler 2 First Name', 'Traveler 2 Last Name', '1991-02-02', '123-234-9998', 'Street Number 2', 'Some Country 1', null, 'City 1', '111111'),
(4, 'some3@email.com', 'travelerpassword3', 'TRAVELER', null, 'Traveler 3 First Name', 'Traveler 3 Last Name', '1992-03-03', '123-234-9997', 'Street Number 3', 'Some Country 1', null, 'City 2', '222222'),
(5, 'someagent1@email.com', 'agentpassword1', 'TRAVEL_AGENT', 1, 'Agent 1 First Name', 'Agent 1 Last Name', '1989-02-01', '123-234-9996', 'Street Number 11', 'Some Country 1', null, 'City 1', '111111'),
(6, 'someagent2@email.com', 'agentpassword2', 'TRAVEL_AGENT', 1, 'Agent 2 First Name', 'Agent 2 Last Name', '1989-01-01', '123-234-9933', 'Street Number 12', 'Some Country 2', null, 'City 3', '444444'),
(7, 'someagent3@email.com', 'agentpassword2', 'TRAVEL_AGENT', 2, 'Agent 3 First Name', 'Agent 3 Last Name', '1988-04-05', '123-234-2233', 'Street Number 13', 'Some Country 3', null, 'City 5', '555555'),
(8, 'someagent4@email.com', 'agentpassword2', 'TRAVEL_AGENT', 3, 'Agent 4 First Name', 'Agent 4 Last Name', '1987-04-06', '123-234-3333', 'Street Number 14', 'Some Country 3', null, 'City 5', '555555'),
(9, 'someagent5@email.com', 'agentpassword2', 'TRAVEL_AGENT', 4, 'Agent 5 First Name', 'Agent 5 Last Name', '1986-04-07', '123-234-9433', 'Street Number 15', 'Some Country 3', null, 'City 5', '555555'),
(10, 'someagent6@email.com', 'agentpassword2', 'TRAVEL_AGENT', 5, 'Agent 6 First Name', 'Agent 6 Last Name', '1985-04-08', '123-234-9633', 'Street Number 16', 'Some Country 3', null, 'City 5', '555555');

-- ITINERARY --
INSERT INTO `itinerary`
VALUES
(1, 1, 2, null, 600, CURRENT_TIMESTAMP),
(2, 2, 2, null, 620, CURRENT_TIMESTAMP),
(3, 3, 1, 1, 640, CURRENT_TIMESTAMP),
(4, 4, 1, 2, 660, CURRENT_TIMESTAMP),
(5, 5, 5, 3, 680, CURRENT_TIMESTAMP),
(6, 6, 6, 4, 700, CURRENT_TIMESTAMP),
(7, 7, 7, 5, 750, CURRENT_TIMESTAMP),
(8, 8, 8, null, 80, CURRENT_TIMESTAMP);

-- INSERT TICKET --
INSERT INTO `ticket`
VALUES
(1, 1, 1, 'ACTIVE', '1A'),
(2, 10, 1, 'ACTIVE', '2A'),
(3, 3, 2, 'ACTIVE', '1B'),
(4, 12, 2, 'ACTIVE', '1B'),
(5, 1, 3, 'ACTIVE', '2B'),
(6, 10, 3, 'ACTIVE', '3B'),
(7, 2, 4, 'ACTIVE', '4B'),
(8, 11, 4, 'ACTIVE', '5B'),
(9, 11, 5, 'ACTIVE', '1B'),
(10, 2, 5, 'ACTIVE', '1C'),
(11, 4, 6, 'ACTIVE', '1C'),
(12, 13, 6, 'ACTIVE', '1D'),
(13, 13, 7, 'ACTIVE', '2D'),
(14, 14, 7, 'ACTIVE', '3D');

-- INSERT BOARDING PASS --
INSERT INTO `boarding_pass`
VALUES
(1, 1, '1D', '2A'),
(2, 2, '2D', '1A'), 
(3, 3, '3D', '2A'), 
(4, 4, '5D', '1A'), 
(5, 5, '6D', '3A'), 
(6, 6, '4D', '4A'), 
(7, 7, '3D', '5A'), 
(8, 8, '2D', '1A'), 
(9, 9, '3D', '2A'), 
(10, 10, '4D', '3A'), 
(11, 11, '5D', '4A'), 
(12, 12, '3D', '5A'), 
(13, 13, '4D', '4A'), 
(14, 14, '4D', '3A'); 
