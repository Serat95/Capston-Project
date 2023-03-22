Feature: Retail Account Page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'Seratnazir@gmail.com' and password 'Sirat95608!!'
    And User click on login button
    And User should be logged in into Account
    When User click on Account option

  @AccPageTC01
  Scenario: Verify User can update Profile Information
    And User update Name 'Johnn' and Phone '9163585520'
    And User click on Update button
    Then user profile information should be updated

  @AccPageTC02
  Scenario: Verify User can Update password
    And User enter below information
      | previousPassword | newPassword  | confirmPassword |
      | Sirat95608!!      | Sirat95608! | Sirat95608!     |
    And User click on Change Password button
    Then a message should be displayed 'Password Updated Successfully'

  @AccPageTC03
  Scenario: Verify User can add a payment method
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 6011621358712871 | Sirat      |               8 |           2027 |          584 |
    And User click on Add your card button
    Then a message should be displayed ‘Payment Method added successfully’

  @AccPageTC04
  Scenario: Verify User can edit Debit or Credit card
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 6011621222712327 | Seraat     |              12 |           2030 |          667 |
    And user click on Update Your Card button
    Then a message should be displayed ‘Payment Method updated Successfully

  @AccPageTC05
  Scenario: Verify User can remove Debit or Credit card
    And User click on remove option of card section
    Then payment details should be removed

  @AccPageTC06
  Scenario: Verify User can add an Address
    And User click on Add address option
    And user fill new address form with below information
      | country       | fullName | phoneNumber | streetAddress    | apt | city       | state      | zipCode |
      | United States | Serat    |  9167775463 | 4700 Marconi Ave | 123 | Carmichael | California |   95608 |
    And User click Add Your Address button
    Then a message should be displayed ‘Address Added Successfully’

  @AccPageTC07
  Scenario: Verify User can edit an Address added on account
    And User click on edit address option
    And user fill new updated address form with below information
      | country       | fullName | phoneNumber | streetAddress | apt | city       | state      | zipCode |
      | United States | Nazir    |  9183248234 | 4729 Marconi  |   5 | Carmichael | California |   95609 |
    And User click update Your Address button
    Then a message should be displayed ‘Address Updated Successfully’

  @AccPageTC08
  Scenario: Verify User can remove Address from Account
    And User click on remove option of Address section
    Then Address details should be removed
