Feature: reg
Scenario: Reg functionality

Given Launch TestMe application
And  user enters userName as "jdcboas"
And User enters firstName as "Rahuldf"
And User enters lastName as "rjn"
And User enters password as "Rahurag01"
And User enters confirmPassword as "Rahurag01"
And User select gender as "Male"  
And User enters emailAddress as "rahurag01@gmail.com"
And User enters mobileNumber as "8870078456"
And User enters dob as "28/04/1998"
And User enters address as "ffgrthgh"
And User enters answer as "on earth"
And User clicks on login button
Then reg successful
