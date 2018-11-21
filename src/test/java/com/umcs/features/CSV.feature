Feature: TestyBDD

  Scenario: User encounters a record with empty price
    Given a list of records from file fileWithEmptyPrices.csv
    When I process the records
    Then the price is calculated using previous and next day prices to be 150

  Scenario: Prices are doubled for one company
    Given a list of records from file fileWithDoubledPrices.csv
    When I process the records
    Then only the 107.5 price is taken into account

  Scenario: There is no price in a record.
    Given a list of records from file filewithEmptyPrices.csv
    When I process the records
    Then getRaportMSG "Firma nie byla notowana na giełdzie"

  Scenario: There is no price in a continous records.
    Given Continous records have empty price
    When I process the records
    Then set price as average price from known prices

  Scenario: A price is in wrong format
    Given a list of records from file fileWithWrongFormats.csv
    When I process the records
    Then Change the format to mainFormat

  Scenario: Making monthly summary
    Given Records from entire month
    When Making year summary
    Then Cumulate all records

  Scenario: Making year summary
    Given Records from entire year
    When Making year summary
    Then Cumulate all records

  Scenario: Making a final report.
    Given a list of records from file fileWithRecords.csv
    When Analysing trends
    Then Get 3 companies with highest percentage increase of their prices

  Scenario: Making average price for a company
    Given multiple files including same company
    When Making monthly summary
    Then Add multiple records and get average price

  Scenario: Data not appearing in right order
    Given a list of not-ordered records
    When  I process the records
    Then  List records in correct order

  Scenario: Checking the highest price
    Given a list of records from file <exampleFile>
    When finding the highest price
    Then  Tag price as highest


  Scenario: Checking the lowest price
    Given a list of records from file <exampleFile>
    When finding the lowest price
    Then  Tag price as lowest

  Scenario: Getting data every day
    Given a list of records from file <string>
    When Getting new data
    Then repeat the process on next day
