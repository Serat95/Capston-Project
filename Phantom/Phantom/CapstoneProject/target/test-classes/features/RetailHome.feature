Feature: Retail Home Page  
Background:
Given User is on retail website
When User click on Sign in option
And User enter email 'Seratnazir@gmail.com' and password 'Sirat95608!!'
And User click on login button
And User should be logged in into Account

  @RetHomeTC01
  Scenario Outline: Verify department sidebar options
        When User click on All section
        And User on <department>
        Then below options are present in department
          | <optionOne> | <optionTwo> | 
      
    Examples: 
          | department    | optionOne                      | optionTwo                |
          | 'Electronics' | TV & Video                     | Video Games              |
          | 'Computers'   | Accessories                    | Networking               |
          | 'Smart Home'  | Smart Home Lightning           | Plugs and Outlets        |
          | 'Sports'      | Athletic Clothing              | Exercise & Fitness       |
          | 'Automotive'  | Automative Parts & Accessories | MotorCycle & Powersports |


  @RetHomeTC02
Scenario: Verify User can add an item to cart 
And User change the category to 'Smart Home'
And User search for an item 'Kasa Outdoor Smart Plug'
And User click on Search icon
And User click on item 
And User select quantity '2'
And User click add to Cart button 
Then the cart icon quantity should change to ‘2’

@RetHomeTC03
Scenario: Verify User can place an order without shipping address and payment method on file
And User click on Cart option 
And User click on Proceed to Checkout button
And User click Add a new address link for shipping address 
And User fill new address form with below information 
 | country       | fullName | phoneNumber | streetAddress | apt | city       | state      | zipCode |
 | United States | Nazirr   |  9183247824 | 4720 Marconi  |   5 | Carmichael | California |   95609 |
      
And User click Add Address button 
And User click add a Cridet or Debit Card button for payement method 
And User fill below card information 
| cardNumber       | nameOnCard   | expirationMonth   | expirationYear | securityCode |
| 4080699373891018 | NASirat      |  5                | 2028           |          548 |

And User click on Add card button 
And User click Place Your Order button
Then a message should be displayed ‘Order Placed, Thanks’

@RetHomeTC04
Scenario: Verify User can place an order with Shipping address and payment Method on file
And User change the category to 'Electronics'
And User search for an item 'Apex Legends'
And User click on Search icon
And User click on item 
And User select quantity '5'
And User click add to Cart button 
Then the cart icon quantity should change to ‘5’
And User click on Cart option 
And User click on Proceed to Checkout button
And User click Place Your Order button
Then a message should be displayed ‘Order Placed, Thanks’






