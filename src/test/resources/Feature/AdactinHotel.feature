Feature: AdactinHotel Webpage

  Scenario Outline: Verify the login page with valid credentials
    Given User navigates to the loginpage
    When User should enter "<username>" and "<password>"
    And User should click login page
    Then User navigates to the search page
    Then User should select the "<location>","<Hotels>","<Room Type>","<Number of Rooms>","<CheckIn>","<CheckOut>","<AdultsPerRoom>","<ChildrenPerRoom>","<First Name>","<Last Name>","<Billing Address>","<CC num>","<CC Type>","<Expiry>","<CVV num>"
    Then User click the search option
    And User navigates to the select page
    And User should click the radio button and click the continue button
    Then User navigates to the booking page and Click the booknow button
    Then User successfully Booked the hotel
    
    Examples: 
      | username | password | location | Hotels         | Room Type | Number of Rooms | CheckIn    | CheckOut   | AdultsPerRoom | ChildrenPerRoom | First Name | Last Name | Billing Address  | CC num           | CC Type | Expiry     | CVV num |
      | sahachan | 9556M9   | London   | Hotel Sunshine | Double    | 2-Two           | 25/06/2023 | 26/06/2023 | 2-Two         | 2-Two           | saha       | krishnan  | chennai -6000124 | 1234567812345678 | Visa    | 25/03/2033 |     245 |
