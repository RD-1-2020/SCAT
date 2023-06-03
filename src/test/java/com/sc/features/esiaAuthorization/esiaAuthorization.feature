@loginEsia
Feature: Авторизация ЕСИА

  @1165
  Scenario: Авторизация существующего пользователя
    Given Открыта АИС МФЦ
    And Нажать на гипертекст 'Войти с помощью ЕСИА'
    And Ввести номер СНИЛС ЕСИА "000-003-003 57" и пароль ЕСИА "216700" и нажать кнопку Войти
    And Проверить выбор филиала МФЦ при авторизации ЕСИА: "МФЦ Автоматизация Основной"
    And Проверить выбор роли МФЦ при авторизации ЕСИА: "Оператор"
    And Нажать Продолжить при авторизации

  @7624
  Scenario: Авторизация уволенного пользователя
    Given Открыта АИС МФЦ
    And Нажать на гипертекст 'Войти с помощью ЕСИА'
    And Ввести номер СНИЛС ЕСИА "000-123-345 50" и пароль ЕСИА "!Smart0Smart!" и нажать кнопку Войти
    And Проверить отображение текста 'Пользователь заблокирован администратором'
    And Нажать кнопку 'На главную'
    And Проверить отображение первой страницы авторизации

  @7626
  Scenario: Авторизация существующего пользователя с отменой прохождения
    Given Открыта АИС МФЦ
    And Нажать на гипертекст 'Войти с помощью ЕСИА'
    And Ввести номер СНИЛС ЕСИА "000-003-003 57" и пароль ЕСИА "216700" и нажать кнопку Войти
    And Нажать на кнопку 'Назад'
    And Проверить отображение первой страницы авторизации


  @7625
  Scenario: Авторизация несуществующего пользователя
    Given Открыта АИС МФЦ
    And Нажать на гипертекст 'Войти с помощью ЕСИА'
    And Ввести номер СНИЛС ЕСИА "000-000-600 06" и пароль ЕСИА "11111111" и нажать кнопку Войти
    And Проверить отображение текста 'Пользователь в системе не зарегистрирован'
    And Нажать кнопку 'На главную'
    And Проверить отображение первой страницы авторизации
