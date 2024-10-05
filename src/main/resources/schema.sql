Drop TABLE IF EXISTS product_tags;
Drop TABLE IF EXISTS tags;
DROP TABLE IF EXISTS products;
CREATE TABLE tags
(
    tag_id    varchar(36) PRIMARY KEY,
    tag_title varchar(15)
);


INSERT INTO tags (tag_id, tag_title)
VALUES (random_uuid(), 'drink'),
       (random_uuid(), 'food'),
       (random_uuid(), 'clothes'),
       (random_uuid(), 'limited');

CREATE TABLE products
(
    product_id VARCHAR(36) PRIMARY KEY,
    name       VARCHAR(36) UNIQUE,
    price      decimal(13, 4),
    added_at   date
);
CREATE TABLE product_tags
(
    tag_item_id varchar(36) DEFAULT(random_uuid()) PRIMARY KEY,
    tag_id varchar(36),
    product_id varchar(36),
    FOREIGN KEY (tag_id) REFERENCES tags(tag_id),
    FOREIGN KEY (product_id) REFERENCES products(product_id)

);