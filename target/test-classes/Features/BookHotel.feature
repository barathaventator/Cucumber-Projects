Feature: Verify the booking confirmation

  Scenario Outline: Verifying the Booking
    Given User is on AdactinHotel
    When User should enter "<userName>" , "<password>" and login
    When User should search hotel "<location>","<hotel>","<roomType>","<noOfRoom>","<checkInDate>","<checkOutDate>","<adultsPerRoom>","<childPerRoom>"
    When User should select one hotel and continue
    When User should enter the details "<firstName>","<lastName>","<address>","<creditCardNo>","<cardType>","<month>","<year>","<cvvNo>" and Book Now
    Then Verify the "Booking Confirmation" message get sucessfull

    Examples: 
      | userName | password | location | hotel | roomType | noOfRoom | checkInDate | checkOutDate | adultsPerRoom | childPerRoom | firstName | lastName | address | creditCardNo | cardType | month | year | cvvNo |

  Scenario Outline: Verifying the error message on book a hotel page
    Given User is on AdactinHotel
    When User should enter "<userName>" , "<password>" and login
    When User should search hotel "<location>","<hotel>","<roomType>","<noOfRoom>","<checkInDate>","<checkOutDate>","<adultsPerRoom>","<childPerRoom>"
    When User should select one hotel and continue
    When Book a hotel without entering details
    Then Verify the " Please Enter your First Name","Please Enter you Last Name","Please Enter your Address"," Please Enter your 16 Digit Credit Card Number"," Please Select your Credit Card Type"," Please Select your Credit Card Expiry Month"and " Please Enter your Credit Card CVV Number"

    Examples: 
      | userName | password | location | hotel | roomType | noOfRoom | checkInDate | checkOutDate | adultsPerRoom | childPerRoom |
