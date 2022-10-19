INSERT INTO `moons` (`moon_id`,`name`,`my_planet`) 
  VALUES (1, 'The Moon', 'Earth'),
	   (2, 'Deimos', 'Mars'),
	   (3, 'Phobos', 'Mars'),
 	   (4, 'Random rock', 'Venus');

alter sequence HIBERNATE_SEQUENCE restart with 5;