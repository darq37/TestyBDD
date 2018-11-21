Feature: Login Feature
  Verify is program is able to parse CSV file

  Scenario Outline: Load a CSV file
    Given current month is <month>
    When i get the next month
    Then the current month is <nextMonth>
    Examples:
      | month | nextMonth |
      | 12    | 1         |
      | 1     | 2         |
      | 2     | 3         |
      | -1    | 1         |

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
