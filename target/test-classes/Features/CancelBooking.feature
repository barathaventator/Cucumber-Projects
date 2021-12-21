Feature: Verify the order cancelled sucessfull

  @Reg
  Scenario Outline: Verifying the Error message in booked itinerary page
    Given User is on AdactinHotel
    When User should enter "<userName>" , "<password>" and login
    When User should search hotel "<location>","<hotel>","<roomType>","<noOfRoom>","<checkInDate>","<checkOutDate>","<adultsPerRoom>"and"<childPerRoom>"
    When User should select one hotel and continue
    When User should enter the details "<firstName>","<lastName>","<address>","<cvvNo>" and Book Now
      | creditCardNo     | cardType         | month     | year |
      | 1234567890123456 | American Express | January   | 2022 |
      | 1234567890123456 | VISA             | Februray  | 2022 |
      | 1234567890123456 | Master Card      | March     | 2022 |
      | 1234567890123456 | Other            | April     | 2022 |
      | 1234567890123456 | American Express | May       | 2022 |
      | 1234567890123456 | VISA             | June      | 2022 |
      | 1234567890123456 | Master Card      | July      | 2022 |
      | 1234567890123456 | Other            | August    | 2022 |
      | 1234567890123456 | American Express | September | 2022 |
      | 1234567890123456 | VISA             | October   | 2022 |
      | 1234567890123456 | Master Card      | November  | 2022 |
      | 1234567890123456 | Other            | December  | 2022 |
    When User should go to the booked itinerary page from booking confirmation page
    Then Cancel the order ID and verify "The booking has been cancelled." message

    Examples: 
      | userName        | password        | location | hotel          | roomType | noOfRoom | checkInDate | checkOutDate | adultsPerRoom | childPerRoom | firstName | lastName | address              | cvvNo |
      | barathaventator | barathaventator | Sydney   | Hotel Sunshine | Double   | 2 - Two  | 17-12-2021  | 18-12-2021   | 2 - Two       | 0 - None     | Barath    | Kumar    | No.22, Omr, Chennai. |   123 |

  Scenario Outline: Verifying the Cancellation of the booking
    Given User is on AdactinHotel
    When User should enter "<userName>" , "<password>" and login
    When User should go to the booked itinerary page
    Then Cancel the order ID and verify the "The booking has been cancelled." message

    Examples: 
      | userName        | password        |
      | barathaventator | barathaventator |
