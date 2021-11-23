/* CREATE TABLE */
CREATE TABLE if NOT EXISTS testessch.city(
                     id bigint primary key ,
                     name VARCHAR(100),
                     economic_region_id bigint
);

/* INSERT QUERY NO: 1 */
INSERT INTO testessch.city(id, name, economic_region_id)
VALUES
(1, 'Bakı', 1);

/* INSERT QUERY NO: 2 */
INSERT INTO testessch.city(id, name, economic_region_id)
VALUES
(2, 'Sumqayıt', 2);
