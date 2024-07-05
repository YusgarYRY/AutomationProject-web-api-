Feature: Api Automation

  @api
  Scenario: Get User By Id
    Given Prepare Url for "GET_ALL_USERS"
    And hit api get list users
    And verify status code is 200
    Then verify response body get list users
    Then Hit api for get user by id 7014393
    And verify status code is 200
    And verify body response for get user by id
    And verify using json schema "GET_USER_BY_ID.json"

    @api
  Scenario: Create New User
    Given Prepare Url for "CREATE_NEW_USER"
    Then Hit api for Create new user
    And verify status code is 201
    And verify body response for create new user

    @api
  Scenario: Update Data Active User
    Given Prepare Url for "CREATE_NEW_USER"
    When Hit api for Create new user
    And verify status code is 201
    And verify body response for create new user
    Then Hit api for update data active user
    And verify status code is 200
    And verify body response for update data active user

    @api
  Scenario: Delete Active User
    Given Prepare Url for "CREATE_NEW_USER"
    When Hit api for Create new user
    And verify status code is 201
    And verify body response for create new user
    Then Hit api for Delete Active User
    And verify status code is 204
