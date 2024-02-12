#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Title of your feature
  I want to use this template for my loginto FB Application

  @tag1
  Scenario: Facebook Login
    Given Launch the facebook portal
    And provide my login credentials
    When I complete login process
    And Go Home with a cup of coffee
    
    @tag2
  Scenario: Facebook Login with Parameterized values
    Given Launch the facebook portal
    And provide my login credentials "username" and "password"
    When I complete login process
    And Go Home with a cup of coffee
    
    @tag3
  Scenario: Facebook Login with Parameterized array values
    Given Launch the facebook portal
    And provide my login credentials "<Username>" and "<password>"
    When I complete login process
    And Go Home with a cup of coffee
    
    Examples:
    
    	| Username	|	password	|
    	|	chrisk		|	1234			|
    	|	indu			|	12345			|
    	|	navya			|	123456		|
    
   