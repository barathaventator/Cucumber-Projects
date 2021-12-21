Feature: Verify the Adactin hotel webpage

  Scenario Outline: Verify the select all fields on search hotel page
    Given User is on AdactinHotel
    When User should enter "<userName>" , "<password>" and login
    When User should search hotel "<location>","<hotel>","<roomType>","<noOfRoom>","<checkInDate>","<checkOutDate>","<adultsPerRoom>","<childPerRoom>"
    Then Verify "Select Hotel" in that page

    Examples: 
      | userName | password | location | hotels | roomType | noOfRoom | checkIn | checkOut | adultsPerRoom | childPerRoom |

  Scenario Outline: Verify the select mandatory fields on search hotel page
    Given User is on AdactinHotel
    When User should enter "<userName>" , "<password>" and login
    When User should select mandatory fields "<location>","<noOfRoom>","<checkIn>","<checkOut>","<adultsPerRoom>" and search
    Then Verify "Select Hotel" in that page

    Examples: 
      | userName | password | location | noOfRoom | checkIn | checkOut | adultsPerRoom |

  Scenario Outline: Verify the checkiIn date in search hotel page
    Given User is on AdactinHotel
    When User should enter "<userName>" , "<password>" and login
    When User should enter improper dates "<checkIn>","<checkOut>" and search
    Then Verify the error messsages "Check-In Date shall be before than Check-Out Date" and "Check-Out Date shall be after than Check-In Date"

    Examples: 
      | userName | password | checkIn | checkOut |

  Scenario Outline: Verify search the hotel without entering data
    Given User is on AdactinHotel
    When User should enter "<userName>" , "<password>" and login
    When User enter without entering data and search
    Then Verify the "Please Select a Location" message

    Examples: 
      | userName | password |
