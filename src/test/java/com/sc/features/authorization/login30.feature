@login30
Feature: Авторизация 3.0

  @C19593\1
  Scenario: Авторизация. Все роли Оператор Все филиалы Основной 3.0
    Given Открыта АИС МФЦ
    And Ввести СНИЛС "887-000-000 00" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать филиал МФЦ при авторизации: "МФЦ Автоматизация Основной"
    And Выбрать роль при авторизации: "Оператор"
    And Нажать Продолжить при авторизации
    And Проверить ФИО в хедере 3.0 "Автоматизация В. В."
    And Проверить роль в хедере 3.0: "Оператор"
    And Проверить МФЦ в хедере 3.0 несколько ролей и несколько мфц: "МФЦ \"МФЦ Автоматизация Основной\""

  @C19593\2
  Scenario: Авторизация. Все роли Оператор Все филиалы Родительский 3.0
    Given Открыта АИС МФЦ
    And Ввести СНИЛС "887-000-000 00" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать филиал МФЦ при авторизации: "МФЦ Автоматизация Родительский"
    And Выбрать роль при авторизации: "Оператор"
    And Нажать Продолжить при авторизации
    And Проверить ФИО в хедере 3.0 "Автоматизация В. В."
    And Проверить роль в хедере 3.0: "Оператор"
    And Проверить МФЦ в хедере 3.0 несколько ролей и несколько мфц: "МФЦ \"МФЦ Автоматизация Родительский..."

  @C19593\3
  Scenario: Авторизация. Все роли Оператор Все филиалы Тосп 3.0
    Given Открыта АИС МФЦ
    And Ввести СНИЛС "887-000-000 00" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать филиал МФЦ при авторизации: "МФЦ Автоматизация ТОСП"
    And Выбрать роль при авторизации: "Оператор"
    And Нажать Продолжить при авторизации
    And Проверить ФИО в хедере 3.0 "Автоматизация В. В."
    And Проверить роль в хедере 3.0: "Оператор"
    And Проверить МФЦ в хедере 3.0 несколько ролей и несколько мфц: "МФЦ \"МФЦ Автоматизация ТОСП\""

  @C19591/1
  Scenario: Авторизация под оператором с одной ролью и одним основным филиалом 3.0
    Given Открыта АИС МФЦ
    And Ввести СНИЛС "77000000000" и пароль "789456Qa" и нажать кнопку Войти
    And Проверить роль в хедере 3.0: "Оператор"
    And Проверить МФЦ в хедере 3.0: "МФЦ \"МФЦ Автоматизация Основной\""
    And Проверить ФИО в хедере 3.0 "Автоматизация О. О."

  @C19591/2
  Scenario: Авторизация под оператором с одной ролью и одним родительским филиалом 3.0
    Given Открыта АИС МФЦ
    And Ввести СНИЛС "77100000000" и пароль "789456Qa" и нажать кнопку Войти
    And Проверить роль в хедере 3.0: "Оператор"
    And Проверить МФЦ в хедере 3.0: "МФЦ \"МФЦ Автоматизация Родительский..."
    And Проверить ФИО в хедере 3.0 "Автоматизация О. О."

  @C19591/3
  Scenario: Авторизация под оператором с одной ролью и одним филиалом Тосп 3.0
    Given Открыта АИС МФЦ
    And Ввести СНИЛС "77200000000" и пароль "789456Qa" и нажать кнопку Войти
    And Проверить роль в хедере 3.0: "Оператор"
    And Проверить МФЦ в хедере 3.0: "МФЦ \"МФЦ Автоматизация ТОСП\""
    And Проверить ФИО в хедере 3.0 "Автоматизация О. О."

