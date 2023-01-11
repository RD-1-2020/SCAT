@tagForFile
Feature: Авторизация с Дамаск версия 3.0

  @643/1
  Scenario: 3.0.Авторизация с Дамаск. Оператор. Одна роль и один филиал Основной, выбор окна пульта ЭО
    Given Перейти на урл
    And Ввести СНИЛС "89300000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать окно Дамаск при авторизации: "Окно 1"
    And Нажать Продолжить при авторизации
    And Нажать кнопку открытия пульта  ЭО 3.0 после авторизации
    And Нажать кнопку Начать работу пульта ЭО 3.0 после авторизации
    And Проверить номер окна в меню Дамаск 3.0: "Окно 1"
    And Нажать кнопку запущенного пульта ЭО 3.0 после начала работы
    And Нажать кнопку Завершить работу пульта ЭО 3.0
    And Проверить роль в хедере 3.0: "Оператор"
    And Проверить ФИО в хедере 3.0 "Автоматизация О. О."
    And Проверить МФЦ в хедере 3.0: "МФЦ \"МФЦ Автоматизация Основной ЭО ..."

  @643/2
  Scenario: 3.0.Авторизация с Дамаск. Оператор. Одна роль и один филиал Родительский, выбор окна пульта ЭО
    Given Перейти на урл
    And Ввести СНИЛС "89400000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать окно Дамаск при авторизации: "Окно 2"
    And Нажать Продолжить при авторизации
    And Нажать кнопку открытия пульта  ЭО 3.0 после авторизации
    And Нажать кнопку Начать работу пульта ЭО 3.0 после авторизации
    And Проверить номер окна в меню Дамаск 3.0: "Окно 2"
    And Нажать кнопку запущенного пульта ЭО 3.0 после начала работы
    And Нажать кнопку Завершить работу пульта ЭО 3.0
    And Проверить роль в хедере 3.0: "Оператор"
    And Проверить ФИО в хедере 3.0 "Автоматизация О. О."
    And Проверить МФЦ в хедере 3.0: "МФЦ \"МФЦ Автоматизация Родительский..."

  @643/3
  Scenario: 3.0.Авторизация с Дамаск. Оператор. Одна роль и один филиал ТОСП, выбор окна пульта ЭО
    Given Перейти на урл
    And Ввести СНИЛС "89500000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать окно Дамаск при авторизации: "Окно 3"
    And Нажать Продолжить при авторизации
    And Нажать кнопку открытия пульта  ЭО 3.0 после авторизации
    And Нажать кнопку Начать работу пульта ЭО 3.0 после авторизации
    And Проверить номер окна в меню Дамаск 3.0: "Окно 3"
    And Нажать кнопку запущенного пульта ЭО 3.0 после начала работы
    And Нажать кнопку Завершить работу пульта ЭО 3.0
    And Проверить роль в хедере 3.0: "Оператор"
    And Проверить ФИО в хедере 3.0 "Автоматизация О. О."
    And Проверить МФЦ в хедере 3.0: "МФЦ \"МФЦ Автоматизация ТОСП ЭО Дама..."

  @793/1
  Scenario: 3.0.Авторизация с Дамаск. Оператор. Одна роль и один филиал Основной, без подключения пульта ЭО
    Given Перейти на урл
    And Ввести СНИЛС "89300000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать окно Дамаск при авторизации: "Окно 1"
    And Нажать Продолжить при авторизации
    And Проверить, что элемент Пульт ЭО 3.0 не отображается на странице
    And Проверить роль в хедере 3.0: "Оператор"
    And Проверить ФИО в хедере 3.0 "Автоматизация О. О."
    And Проверить МФЦ в хедере 3.0: "МФЦ \"МФЦ Автоматизация Основной ЭО ..."

  @793/2
  Scenario: 3.0.Авторизация с Дамаск. Оператор. Одна роль и один филиал Родительский, без подключения пульта ЭО
    Given Перейти на урл
    And Ввести СНИЛС "89400000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать окно Дамаск при авторизации: "Без подключения пульта"
    And Нажать Продолжить при авторизации
    And Проверить, что элемент Пульт ЭО 3.0 не отображается на странице
    And Проверить роль в хедере 3.0: "Оператор"
    And Проверить ФИО в хедере 3.0 "Автоматизация О. О."
    And Проверить МФЦ в хедере 3.0: "МФЦ \"МФЦ Автоматизация Родительский..."

  @793/3
  Scenario: 3.0.Авторизация с Дамаск. Оператор. Одна роль и один филиал ТОСП, без подключения пульта ЭО
    Given Перейти на урл
    And Ввести СНИЛС "89500000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать окно Дамаск при авторизации: "Без подключения пульта"
    And Нажать Продолжить при авторизации
    And Проверить, что элемент Пульт ЭО 3.0 не отображается на странице
    And Проверить роль в хедере 3.0: "Оператор"
    And Проверить ФИО в хедере 3.0 "Автоматизация О. О."
    And Проверить МФЦ в хедере 3.0: "МФЦ \"МФЦ Автоматизация ТОСП ЭО Дама..."

  @782/1
  Scenario: 3.0.Авторизация с Дамаск. Оператор. Все роли и все филиалы,филиал Основной, выбор окна пульта ЭО
    Given Перейти на урл
    And Ввести СНИЛС "88700000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать филиал МФЦ при авторизации: "МФЦ Автоматизация Основной ЭО Дамаск"
    And Выбрать роль при авторизации: "Оператор"
    And Выбрать окно Дамаск при авторизации: "Окно 1"
    And Нажать Продолжить при авторизации
    And Нажать кнопку открытия пульта  ЭО 3.0 после авторизации
    And Нажать кнопку Начать работу пульта ЭО 3.0 после авторизации
    And Проверить номер окна в меню Дамаск 3.0: "Окно 1"
    And Нажать кнопку запущенного пульта ЭО 3.0 после начала работы
    And Нажать кнопку Завершить работу пульта ЭО 3.0
    And Проверить роль в хедере 3.0: "Оператор"
    And Проверить ФИО в хедере 3.0 "Автоматизация В. В."
    And Проверить МФЦ в хедере 3.0: "МФЦ \"МФЦ Автоматизация Основной\""

  @782/2
  Scenario: 3.0.Авторизация с Дамаск. Оператор. Все роли и все филиалы,филиал Родительский, выбор окна пульта ЭО
    Given Перейти на урл
    And Ввести СНИЛС "88700000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать филиал МФЦ при авторизации: "МФЦ Автоматизация Родительский ЭО Дамаск"
    And Выбрать роль при авторизации: "Оператор"
    And Выбрать окно Дамаск при авторизации: "Окно 2"
    And Нажать Продолжить при авторизации
    And Нажать кнопку открытия пульта  ЭО 3.0 после авторизации
    And Нажать кнопку Начать работу пульта ЭО 3.0 после авторизации
    And Проверить номер окна в меню Дамаск 3.0: "Окно 2"
    And Нажать кнопку запущенного пульта ЭО 3.0 после начала работы
    And Нажать кнопку Завершить работу пульта ЭО 3.0
    And Проверить роль в хедере 3.0: "Оператор"
    And Проверить ФИО в хедере 3.0 "Автоматизация В. В."
    And Проверить МФЦ в хедере 3.0: "МФЦ \"МФЦ Автоматизация Родительский..."

  @782/3
  Scenario: 3.0.Авторизация с Дамаск. Оператор. Все роли и все филиалы,филиал ТОСП, выбор окна пульта ЭО
    Given Перейти на урл
    And Ввести СНИЛС "88700000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать филиал МФЦ при авторизации: "МФЦ Автоматизация ТОСП ЭО Дамаск"
    And Выбрать роль при авторизации: "Оператор"
    And Выбрать окно Дамаск при авторизации: "Окно 3"
    And Нажать Продолжить при авторизации
    And Нажать кнопку открытия пульта  ЭО 3.0 после авторизации
    And Нажать кнопку Начать работу пульта ЭО 3.0 после авторизации
    And Проверить номер окна в меню Дамаск 3.0: "Окно 3"
    And Нажать кнопку запущенного пульта ЭО 3.0 после начала работы
    And Нажать кнопку Завершить работу пульта ЭО 3.0
    And Проверить роль в хедере 3.0: "Оператор"
    And Проверить ФИО в хедере 3.0 "Автоматизация В. В."
    And Проверить МФЦ в хедере 3.0: "МФЦ \"МФЦ Автоматизация ТОСП\""

  @657/1
  Scenario: 3.0.Авторизация с Дамаск. Оператор. Все роли и все филиалы,филиал Основной, без подключения пульта ЭО
    Given Перейти на урл
    And Ввести СНИЛС "88700000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать филиал МФЦ при авторизации: "МФЦ Автоматизация Основной ЭО Дамаск"
    And Выбрать роль при авторизации: "Оператор"
    And Выбрать окно Дамаск при авторизации: "Окно 1"
    And Нажать Продолжить при авторизации
    And Проверить, что элемент Пульт ЭО 3.0 не отображается на странице
    And Проверить роль в хедере 3.0: "Оператор"
    And Проверить ФИО в хедере 3.0 "Автоматизация В. В."
    And Проверить МФЦ в хедере 3.0: "МФЦ \"МФЦ Автоматизация Основной\""

  @657/2
  Scenario: 3.0.Авторизация с Дамаск. Оператор.Все роли и все филиалы,филиал Родительский, без подключения пульта ЭО
    Given Перейти на урл
    And Ввести СНИЛС "88700000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать филиал МФЦ при авторизации: "МФЦ Автоматизация Родительский ЭО Дамаск"
    And Выбрать роль при авторизации: "Оператор"
    And Выбрать окно Дамаск при авторизации: "Без подключения пульта"
    And Нажать Продолжить при авторизации
    And Проверить, что элемент Пульт ЭО 3.0 не отображается на странице
    And Проверить роль в хедере 3.0: "Оператор"
    And Проверить ФИО в хедере 3.0 "Автоматизация В. В."
    And Проверить МФЦ в хедере 3.0: "МФЦ \"МФЦ Автоматизация Родительский..."

  @657/3
  Scenario: 3.0.Авторизация с Дамаск. Оператор. Все роли и все филиалы,филиал ТОСП, без подключения пульта ЭО
    Given Перейти на урл
    And Ввести СНИЛС "88700000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать филиал МФЦ при авторизации: "МФЦ Автоматизация ТОСП ЭО Дамаск"
    And Выбрать роль при авторизации: "Оператор"
    And Выбрать окно Дамаск при авторизации: "Без подключения пульта"
    And Нажать Продолжить при авторизации
    And Проверить, что элемент Пульт ЭО 3.0 не отображается на странице
    And Проверить роль в хедере 3.0: "Оператор"
    And Проверить ФИО в хедере 3.0 "Автоматизация В. В."
    And Проверить МФЦ в хедере 3.0: "МФЦ \"МФЦ Автоматизация ТОСП\""