-- Insertar datos en la tabla `user`
INSERT INTO `mydb`.`user` (`username`, `email`, `password`, `active`)
VALUES
    ('johndoe', 'johndoe@example.com', 'password123', true),
    ('janedoe', 'janedoe@example.com', 'securepassword', true),
    ('mikebrown', 'mikebrown@example.com', 'mikepass', true),
    ('emilyjones', 'emilyjones@example.com', 'emilypassword', true),
    ('chrissmith', 'chrissmith@example.com', 'chrispass', true),
    ('sarahwilson', 'sarahwilson@example.com', 'sarah123', true),
    ('alexthomas', 'alexthomas@example.com', 'alexpass', true),
    ('laurawalker', 'laurawalker@example.com', 'laurapassword', true),
    ('brianroberts', 'brianroberts@example.com', 'brianpass', true),
    ('amycollins', 'amycollins@example.com', 'amypassword', true);

-- Insertar datos en la tabla `product`
INSERT INTO `mydb`.`product` (`name`, `brand`, `description`, `url_Image`, `price`, `active`, `created_by`)
VALUES
    ('Smartphone', 'Samsung', 'Samsung Galaxy S21', 'samsung_s21.jpg', 999.99, true, 1),
    ('Laptop', 'Apple', 'MacBook Pro', 'macbook_pro.jpg', 1999.99, true, 2),
    ('Headphones', 'Sony', 'Sony WH-1000XM4', 'sony_headphones.jpg', 299.99, true, 3),
    ('Smartwatch', 'Apple', 'Apple Watch Series 6', 'apple_watch.jpg', 399.99, true, 4),
    ('TV', 'LG', 'LG OLED CX', 'lg_tv.jpg', 1499.99, true, 5),
    ('Camera', 'Canon', 'Canon EOS R5', 'canon_camera.jpg', 2999.99, true, 6),
    ('Speaker', 'Bose', 'Bose SoundLink Revolve+', 'bose_speaker.jpg', 199.99, true, 7),
    ('Gaming Console', 'Sony', 'PlayStation 5', 'ps5.jpg', 499.99, true, 8),
    ('Tablet', 'Microsoft', 'Microsoft Surface Pro 7', 'surface_pro.jpg', 899.99, true, 9),
    ('Fitness Tracker', 'Fitbit', 'Fitbit Charge 4', 'fitbit_tracker.jpg', 149.99, true, 10);

-- Insertar datos en la tabla `order_table`
INSERT INTO `mydb`.`order_table` (`user_id`)
VALUES
    (1),
    (2),
    (3),
    (4),
    (5),
    (6),
    (7),
    (8),
    (9),
    (10);

-- Insertar datos en la tabla `order_detail`
INSERT INTO `mydb`.`order_detail` (`order_id`, `product_id`)
VALUES
    (1, 1),
    (1, 2),
    (2, 3),
    (2, 4),
    (3, 5),
    (3, 6),
    (4, 7),
    (4, 8),
    (5, 9),
    (5, 10);
