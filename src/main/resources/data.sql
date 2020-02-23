INSERT INTO AccountDetail (account_number, account_name, account_type, currency_type, available_balance) VALUES
  (001, 'Abhishek', 'saving', 'USD', 205680),
  (002, 'Jitendra', 'current', 'AUD', 4543200),
  (003, 'Manoj', 'saving', 'SDG', 788780900),
  (004, 'Ramesh', 'saving', 'SDG', 228800),
  (005, 'Shilpa', 'current', 'USD', 8989665);



INSERT INTO AccountTransaction (account_number, transaction_date, amount, transaction_type, transaction_narrative) VALUES
  (002, '2018-04-23', 89334, 'credit', 'saving pot'),
  (002, '2018-04-28', 909034, 'credit', 'saving pot'),
  (001, '2019-11-23', 23432, 'debit', 'weekend shopping'),
  (003, '2019-09-12', 808045, 'credit', 'saving pot'),
  (004, '2018-02-23', 7878, 'credit', 'saving pot');

