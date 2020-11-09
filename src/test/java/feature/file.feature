Feature: Browse the Website

Scenario Outline: Browse the websites

Given user enters the website
And click on login button
When user enters the "<username>" and "<password>"
Then  validate the credantial

Examples:
|username    |password|
|demo		 |123	  |
|sam		 |345	  |

