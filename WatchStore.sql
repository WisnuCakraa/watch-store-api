DROP DATABASE WatchStore;
CREATE DATABASE WatchStore;

USE WatchStore;

CREATE TABLE watch_series (
	id int(11) not null auto_increment primary key,
    series varchar(10) not null
);

INSERT INTO watch_series (series)
VALUES 
('M'),
('P'),
('Q'),
('S'),
('T'),
('V'),
('W');

CREATE TABLE watch_detail (
    id int(11) not null auto_increment primary key,
    product_name varchar(50),
    description varchar(250),
    price decimal(10,2),
    stock int(3)
);

INSERT INTO watch_detail (product_name,description,price,stock)
VALUES 
(	
	"P3C/09 - ORANGE CARBON", 
	"LIMITED EDITION At SEVENFRIDAY, we like bold statements, we love being colorful. After seeing Red, after feeling frosty White, we now urge you to take your vitamin C! And that vitamin C can only be found in SEVENFRIDAY’s new Orange Carbon.", 
    22000000,
    10
),
(	
	"P3C/07 - WHITE CARBON", 
	"LIMITED EDITION At SEVENFRIDAY, After seeing red, now, with the new P3C/07 white storm will blanket all. Whereas the Red Carbon got your heart pumping to dangerous levels, the wicked designers at SF have now decided to inject ice cold stuff into your veins by introducing the White Carbon!", 
    22000000,
    10
),
(
	"P3C/02 RACER III WITH LEATHER STRAP",
    "Two wheeled motor sport and High octane have inspires SEVENFRIDAY’S latest release - welcome the P3C/02 Racer",
    18000000,
    10
);

CREATE TABLE auth_user(
	id varchar(150) not null primary key,
    username varchar(50) not null unique,
    email varchar(50) not null unique,
    password varchar(150) not null
);
INSERT INTO auth_user 
VALUES
(uuid(),'wisnuadmin', 'wisnucakraa@gmail.com', 'wisnuadmin');

SELECT * FROM auth_user u WHERE u.username = u.username AND u.password = u.password;
SELECT * FROM watch_detail;
SELECT * FROM auth_user;

commit;