@Reg
Feature: Verifying Adactin detail

  Scenario Outline: Verifying Adactin hotel login with valid credentials
    Given user is on the adactin hotel
    When user should enter "<username>" and "<password>"
    Then user should search hotel "<location>""<hotels>""<roomtype>""<roomNos>""<chechInDate>""<checkOutDate>""<adultRoom>""<childRoom>"
    Then user should select the hotel
    Then user should book hotel "<firstName>""<lastName>""<address>""<ccNumber>""<ccType>""<ccExpMonth>""<ccExpYear>""<ccCvv>"
    Then user should confirm hotel by order id

    Examples: 
      | username        | password        | location | hotels         | roomtype | roomNos | chechInDate | checkOutDate | adultRoom | childRoom | firstName | lastName | address              | ccNumber         | ccType           | ccExpMonth   | ccExpYear | ccCvv |
      | barathaventator | barathaventator | Sydney   | Hotel Sunshine | Double   | 2 - Two | 17-12-2021  | 18-12-2021   | 2 - Two   | 0 - None  | Barath    | Kumar    | No.22, Omr, Chennai. | 1234656712320980 | American Express | January	2022 |      2022 |   123 |
