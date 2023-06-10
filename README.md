# sprirud
This is crud built using springboot .

### Random Data With h2 database.

```sql
INSERT INTO student (stud_id, age, first_name, last_name)
VALUES
    (1, ROUND(RAND() * 10 + 10), CONCAT('First', ROUND(RAND() * 100)), CONCAT('Last', ROUND(RAND() * 100))),
    (2, ROUND(RAND() * 10 + 10), CONCAT('First', ROUND(RAND() * 100)), CONCAT('Last', ROUND(RAND() * 100))),
    (3, ROUND(RAND() * 10 + 10), CONCAT('First', ROUND(RAND() * 100)), CONCAT('Last', ROUND(RAND() * 100))),
    (4, ROUND(RAND() * 10 + 10), CONCAT('First', ROUND(RAND() * 100)), CONCAT('Last', ROUND(RAND() * 100))),
    (5, ROUND(RAND() * 10 + 10), CONCAT('First', ROUND(RAND() * 100)), CONCAT('Last', ROUND(RAND() * 100))),
    (6, ROUND(RAND() * 10 + 10), CONCAT('First', ROUND(RAND() * 100)), CONCAT('Last', ROUND(RAND() * 100))),
    (7, ROUND(RAND() * 10 + 10), CONCAT('First', ROUND(RAND() * 100)), CONCAT('Last', ROUND(RAND() * 100))),
    (8, ROUND(RAND() * 10 + 10), CONCAT('First', ROUND(RAND() * 100)), CONCAT('Last', ROUND(RAND() * 100))),
    (9, ROUND(RAND() * 10 + 10), CONCAT('First', ROUND(RAND() * 100)), CONCAT('Last', ROUND(RAND() * 100))),
    (10, ROUND(RAND() * 10 + 10), CONCAT('First', ROUND(RAND() * 100)), CONCAT('Last', ROUND(RAND() * 100))),
    (11, ROUND(RAND() * 10 + 10), CONCAT('First', ROUND(RAND() * 100)), CONCAT('Last', ROUND(RAND() * 100))),
    (12, ROUND(RAND() * 10 + 10), CONCAT('First', ROUND(RAND() * 100)), CONCAT('Last', ROUND(RAND() * 100))),
    (13, ROUND(RAND() * 10 + 10), CONCAT('First', ROUND(RAND() * 100)), CONCAT('Last', ROUND(RAND() * 100))),
    (14, ROUND(RAND() * 10 + 10), CONCAT('First', ROUND(RAND() * 100)), CONCAT('Last', ROUND(RAND() * 100))),
    (15, ROUND(RAND() * 10 + 10), CONCAT('First', ROUND(RAND() * 100)), CONCAT('Last', ROUND(RAND() * 100))),
    (16, ROUND(RAND() * 10 + 10), CONCAT('First', ROUND(RAND() * 100)), CONCAT('Last', ROUND(RAND() * 100))),
    (17, ROUND(RAND() * 10 + 10), CONCAT('First', ROUND(RAND() * 100)), CONCAT('Last', ROUND(RAND() * 100))),
    (18, ROUND(RAND() * 10 + 10), CONCAT('First', ROUND(RAND() * 100)), CONCAT('Last', ROUND(RAND() * 100))),
    (19, ROUND(RAND() * 10 + 10), CONCAT('First', ROUND(RAND() * 100)), CONCAT('Last', ROUND(RAND() * 100))),
    (20, ROUND(RAND() * 10 + 10), CONCAT('First', ROUND(RAND() * 100)), CONCAT('Last', ROUND(RAND() * 100)));
```
