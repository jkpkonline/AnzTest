DROP TABLE IF EXISTS TBL_EMPLOYEES;

CREATE TABLE AccountDetail (
  account_number INT PRIMARY KEY,
  account_name VARCHAR(50) NOT NULL,
  account_type VARCHAR(20) NOT NULL,
  currency_type VARCHAR(10) DEFAULT 'USD',
  available_balance INT
);



CREATE TABLE AccountTransaction (
  transaction_id INT AUTO_INCREMENT PRIMARY KEY,
  account_number INT,
  transaction_date DATE NOT NULL,
  amount INT,
  transaction_type VARCHAR(10) NOT NULL,
  transaction_narrative VARCHAR(200)
);