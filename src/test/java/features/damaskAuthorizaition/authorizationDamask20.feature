@login20Damask
Feature: Авторизация с Дамаск версия 2.0

  @1434/4
  Scenario: 2.0.Авторизация с Дамаск. Суперпользователь. Все роли и все филиалы,филиал Основной
    Given Перейти на урл
    And Ввести СНИЛС "88900000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать филиал МФЦ при авторизации: "МФЦ Автоматизация Основной ЭО Дамаск"
    And Выбрать роль при авторизации: "Суперпользователь"
    And Нажать Продолжить при авторизации
    And Проверить, что элемент Пульт ЭО 2.0 не отображается на странице
    And Проверить ФИО в хедере 2.0 "Автоматизация Все роли"
    And Проверить роль в хедере 2.0: "Суперпользователь"
    And Проверить МФЦ в хедере 2.0: "МФЦ Автоматизация Основной ЭО Дамаск"

  @1434/5
  Scenario: 2.0.Авторизация с Дамаск. Суперпользователь. Все роли и все филиалы,филиал Родительский
    Given Перейти на урл
    And Ввести СНИЛС "88900000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать филиал МФЦ при авторизации: "МФЦ Автоматизация Родительский ЭО Дамаск"
    And Выбрать роль при авторизации: "Суперпользователь"
    And Нажать Продолжить при авторизации
    And Проверить, что элемент Пульт ЭО 2.0 не отображается на странице
    And Проверить ФИО в хедере 2.0 "Автоматизация Все роли"
    And Проверить роль в хедере 2.0: "Суперпользователь"
    And Проверить МФЦ в хедере 2.0: "МФЦ Автоматизация Родительский ЭО Дамаск"

  @1434/6
  Scenario: 2.0.Авторизация с Дамаск. Администратор. Все роли и все филиалы,филиал ТОСП
    Given Перейти на урл
    And Ввести СНИЛС "88900000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать филиал МФЦ при авторизации: "МФЦ Автоматизация ТОСП ЭО Дамаск"
    And Выбрать роль при авторизации: "Администратор"
    And Нажать Продолжить при авторизации
    And Проверить, что элемент Пульт ЭО 2.0 не отображается на странице
    And Проверить ФИО в хедере 2.0 "Автоматизация Все роли"
    And Проверить роль в хедере 2.0: "Администратор"
    And Проверить МФЦ в хедере 2.0: "МФЦ Автоматизация ТОСП ЭО Дамаск"

  @1434/7
  Scenario: 2.0.Авторизация с Дамаск. Администратор. Все роли и все филиалы,филиал Основной
    Given Перейти на урл
    And Ввести СНИЛС "88900000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать филиал МФЦ при авторизации: "МФЦ Автоматизация Основной ЭО Дамаск"
    And Выбрать роль при авторизации: "Администратор"
    And Нажать Продолжить при авторизации
    And Проверить, что элемент Пульт ЭО 2.0 не отображается на странице
    And Проверить ФИО в хедере 2.0 "Автоматизация Все роли"
    And Проверить роль в хедере 2.0: "Администратор"
    And Проверить МФЦ в хедере 2.0: "МФЦ Автоматизация Основной ЭО Дамаск"

  @1434/8
  Scenario: 2.0.Авторизация с Дамаск. Администратор. Все роли и все филиалы,филиал Родительский
    Given Перейти на урл
    And Ввести СНИЛС "88900000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать филиал МФЦ при авторизации: "МФЦ Автоматизация Родительский ЭО Дамаск"
    And Выбрать роль при авторизации: "Администратор"
    And Нажать Продолжить при авторизации
    And Проверить, что элемент Пульт ЭО 2.0 не отображается на странице
    And Проверить ФИО в хедере 2.0 "Автоматизация Все роли"
    And Проверить роль в хедере 2.0: "Администратор"
    And Проверить МФЦ в хедере 2.0: "МФЦ Автоматизация Родительский ЭО Дамаск"

  @1434/9
  Scenario: 2.0.Авторизация с Дамаск. Администратор. Все роли и все филиалы,филиал ТОСП
    Given Перейти на урл
    And Ввести СНИЛС "88900000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать филиал МФЦ при авторизации: "МФЦ Автоматизация ТОСП ЭО Дамаск"
    And Выбрать роль при авторизации: "Администратор"
    And Нажать Продолжить при авторизации
    And Проверить, что элемент Пульт ЭО 2.0 не отображается на странице
    And Проверить ФИО в хедере 2.0 "Автоматизация Все роли"
    And Проверить роль в хедере 2.0: "Администратор"
    And Проверить МФЦ в хедере 2.0: "МФЦ Автоматизация ТОСП ЭО Дамаск"

  @1627/4
  Scenario: 2.0.Авторизация с Дамаск. Суперпользователь. Одна роль и один филиал Основной
    Given Перейти на урл
    And Ввести СНИЛС "86200000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Проверить, что элемент Пульт ЭО 2.0 не отображается на странице
    And Проверить ФИО в хедере 2.0 "Автоматизация Одна роль"
    And Проверить роль в хедере 2.0: "Суперпользователь"
    And Проверить МФЦ в хедере 2.0: "МФЦ Автоматизация Основной ЭО Дамаск"

  @1627/5
  Scenario: 2.0.Авторизация с Дамаск. Суперпользователь. Одна роль и один филиал Родительский
    Given Перейти на урл
    And Ввести СНИЛС "86300000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Проверить, что элемент Пульт ЭО 2.0 не отображается на странице
    And Проверить ФИО в хедере 2.0 "Автоматизация Одна роль"
    And Проверить роль в хедере 2.0: "Суперпользователь"
    And Проверить МФЦ в хедере 2.0: "МФЦ Автоматизация Родительский ЭО Дамаск"

  @1627/6
  Scenario: 2.0.Авторизация с Дамаск. Суперпользователь. Одна роль и один филиал ТОСП
    Given Перейти на урл
    And Ввести СНИЛС "86400000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Проверить, что элемент Пульт ЭО 2.0 не отображается на странице
    And Проверить ФИО в хедере 2.0 "Автоматизация Одна роль"
    And Проверить роль в хедере 2.0: "Суперпользователь"
    And Проверить МФЦ в хедере 2.0: "МФЦ Автоматизация ТОСП ЭО Дамаск"

  @1627/7
  Scenario: 2.0.Авторизация с Дамаск. Администратор. Одна роль и один филиал Основной
    Given Перейти на урл
    And Ввести СНИЛС "85900000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Проверить, что элемент Пульт ЭО 2.0 не отображается на странице
    And Проверить ФИО в хедере 2.0 "Автоматизация Одна роль"
    And Проверить роль в хедере 2.0: "Администратор"
    And Проверить МФЦ в хедере 2.0: "МФЦ Автоматизация Основной ЭО Дамаск"

  @1627/8
  Scenario: 2.0.Авторизация с Дамаск. Суперпользователь. Одна роль и один филиал Родительский
    Given Перейти на урл
    And Ввести СНИЛС "86000000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Проверить, что элемент Пульт ЭО 2.0 не отображается на странице
    And Проверить ФИО в хедере 2.0 "Автоматизация Одна роль"
    And Проверить роль в хедере 2.0: "Администратор"
    And Проверить МФЦ в хедере 2.0: "МФЦ Автоматизация Родительский ЭО Дамаск"

  @1627/9
  Scenario: 2.0.Авторизация с Дамаск. Суперпользователь. Одна роль и один филиал ТОСП
    Given Перейти на урл
    And Ввести СНИЛС "86100000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Проверить, что элемент Пульт ЭО 2.0 не отображается на странице
    And Проверить ФИО в хедере 2.0 "Автоматизация Одна роль"
    And Проверить роль в хедере 2.0: "Администратор"
    And Проверить МФЦ в хедере 2.0: "МФЦ Автоматизация ТОСП ЭО Дамаск"

  @2810/1
  Scenario: 2.0.Авторизация с Дамаск. Оператор. Одна роль и один филиал Основной, выбор окна пульта ЭО
    Given Перейти на урл
    And Ввести СНИЛС "89000000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать окно Дамаск при авторизации: "Окно 1"
    And Нажать Продолжить при авторизации
    And Проверить отображение пульта ЭО Дамаск в версии 2.0 и нажать
    And Нажать кнопку Начать работу пульта ЭО 2.0 после авторизации
    And Проверить номер окна в меню Дамаск 2.0: "Окно: Окно 1"
    And Нажать кнопку Закончить работу пульта ЭО 2.0 после авторизации
    And Закрыть окно пульта ЭО Дамаск 2.0
    And Проверить ФИО в хедере 2.0 "Автоматизация Одна роль"
    And Проверить роль в хедере 2.0: "Оператор"
    And Проверить МФЦ в хедере 2.0: "МФЦ Автоматизация Основной ЭО Дамаск"

  @2810/2
  Scenario: 2.0.Авторизация с Дамаск. Оператор. Одна роль и один филиал Родительский, выбор окна пульта ЭО
    Given Перейти на урл
    And Ввести СНИЛС "89100000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать окно Дамаск при авторизации: "Окно 2"
    And Нажать Продолжить при авторизации
    And Проверить отображение пульта ЭО Дамаск в версии 2.0 и нажать
    And Нажать кнопку Начать работу пульта ЭО 2.0 после авторизации
    And Проверить номер окна в меню Дамаск 2.0: "Окно: Окно 2"
    And Нажать кнопку Закончить работу пульта ЭО 2.0 после авторизации
    And Закрыть окно пульта ЭО Дамаск 2.0
    And Проверить ФИО в хедере 2.0 "Автоматизация Одна роль"
    And Проверить роль в хедере 2.0: "Оператор"
    And Проверить МФЦ в хедере 2.0: "МФЦ Автоматизация Родительский ЭО Дамаск"

  @2810/3
  Scenario: 2.0.Авторизация с Дамаск. Оператор. Одна роль и один филиал ТОСП, выбор окна пульта ЭО
    Given Перейти на урл
    And Ввести СНИЛС "89200000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать окно Дамаск при авторизации: "Окно 3"
    And Нажать Продолжить при авторизации
    And Проверить отображение пульта ЭО Дамаск в версии 2.0 и нажать
    And Нажать кнопку Начать работу пульта ЭО 2.0 после авторизации
    And Проверить номер окна в меню Дамаск 2.0: "Окно: Окно 3"
    And Нажать кнопку Закончить работу пульта ЭО 2.0 после авторизации
    And Закрыть окно пульта ЭО Дамаск 2.0
    And Проверить ФИО в хедере 2.0 "Автоматизация Одна роль"
    And Проверить роль в хедере 2.0: "Оператор"
    And Проверить МФЦ в хедере 2.0: "МФЦ Автоматизация ТОСП ЭО Дамаск"

  @2810/4
  Scenario: 2.0.Авторизация с Дамаск. Аудитор. Одна роль и один филиал Основной, выбор окна пульта ЭО
    Given Перейти на урл
    And Ввести СНИЛС "85500000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать окно Дамаск при авторизации: "Окно 1"
    And Нажать Продолжить при авторизации
    And Проверить отображение пульта ЭО Дамаск в версии 2.0 и нажать
    And Нажать кнопку Начать работу пульта ЭО 2.0 после авторизации
    And Проверить номер окна в меню Дамаск 2.0: "Окно: Окно 1"
    And Нажать кнопку Закончить работу пульта ЭО 2.0 после авторизации
    And Закрыть окно пульта ЭО Дамаск 2.0
    And Проверить ФИО в хедере 2.0 "Автоматизация Одна роль"
    And Проверить роль в хедере 2.0: "Аудитор"
    And Проверить МФЦ в хедере 2.0: "МФЦ Автоматизация Основной ЭО Дамаск"

  @2810/5
  Scenario: 2.0.Авторизация с Дамаск. Аудитор. Одна роль и один филиал Родительский, выбор окна пульта ЭО
    Given Перейти на урл
    And Ввести СНИЛС "85000000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать окно Дамаск при авторизации: "Окно 2"
    And Нажать Продолжить при авторизации
    And Проверить отображение пульта ЭО Дамаск в версии 2.0 и нажать
    And Нажать кнопку Начать работу пульта ЭО 2.0 после авторизации
    And Проверить номер окна в меню Дамаск 2.0: "Окно: Окно 2"
    And Нажать кнопку Закончить работу пульта ЭО 2.0 после авторизации
    And Закрыть окно пульта ЭО Дамаск 2.0
    And Проверить ФИО в хедере 2.0 "Автоматизация Одна роль"
    And Проверить роль в хедере 2.0: "Аудитор"
    And Проверить МФЦ в хедере 2.0: "МФЦ Автоматизация Родительский ЭО Дамаск"

  @2810/6
  Scenario: 2.0.Авторизация с Дамаск. Аудитор. Одна роль и один филиал ТОСП, выбор окна пульта ЭО
    Given Перейти на урл
    And Ввести СНИЛС "85100000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать окно Дамаск при авторизации: "Окно 3"
    And Нажать Продолжить при авторизации
    And Проверить отображение пульта ЭО Дамаск в версии 2.0 и нажать
    And Нажать кнопку Начать работу пульта ЭО 2.0 после авторизации
    And Проверить номер окна в меню Дамаск 2.0: "Окно: Окно 3"
    And Нажать кнопку Закончить работу пульта ЭО 2.0 после авторизации
    And Закрыть окно пульта ЭО Дамаск 2.0
    And Проверить ФИО в хедере 2.0 "Автоматизация Одна роль"
    And Проверить роль в хедере 2.0: "Аудитор"
    And Проверить МФЦ в хедере 2.0: "МФЦ Автоматизация ТОСП ЭО Дамаск"

  @3005/1
  Scenario: 2.0.Авторизация с Дамаск. Оператор. Одна роль и один филиал Основной, без подключения пульта ЭО
    Given Перейти на урл
    And Ввести СНИЛС "89000000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать окно Дамаск при авторизации: "Без подключения пульта"
    And Нажать Продолжить при авторизации
    And Проверить, что элемент Пульт ЭО 2.0 не отображается на странице
    And Проверить ФИО в хедере 2.0 "Автоматизация Одна роль"
    And Проверить роль в хедере 2.0: "Оператор"
    And Проверить МФЦ в хедере 2.0: "МФЦ Автоматизация Основной ЭО Дамаск"

  @3005/2
  Scenario: 2.0.Авторизация с Дамаск. Оператор. Одна роль и один филиал Родительский, без подключения пульта ЭО
    Given Перейти на урл
    And Ввести СНИЛС "89100000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать окно Дамаск при авторизации: "Без подключения пульта"
    And Нажать Продолжить при авторизации
    And Проверить, что элемент Пульт ЭО 2.0 не отображается на странице
    And Проверить ФИО в хедере 2.0 "Автоматизация Одна роль"
    And Проверить роль в хедере 2.0: "Оператор"
    And Проверить МФЦ в хедере 2.0: "МФЦ Автоматизация Родительский ЭО Дамаск"

  @3005/3
  Scenario: 2.0.Авторизация с Дамаск. Оператор. Одна роль и один филиал ТОСП, без подключения пульта ЭО
    Given Перейти на урл
    And Ввести СНИЛС "89200000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать окно Дамаск при авторизации: "Без подключения пульта"
    And Нажать Продолжить при авторизации
    And Проверить, что элемент Пульт ЭО 2.0 не отображается на странице
    And Проверить ФИО в хедере 2.0 "Автоматизация Одна роль"
    And Проверить роль в хедере 2.0: "Оператор"
    And Проверить МФЦ в хедере 2.0: "МФЦ Автоматизация ТОСП ЭО Дамаск"

  @3005/4
  Scenario: 2.0.Авторизация с Дамаск. Аудитор. Одна роль и один филиал Основной, без подключения пульта ЭО
    Given Перейти на урл
    And Ввести СНИЛС "85500000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать окно Дамаск при авторизации: "Без подключения пульта"
    And Нажать Продолжить при авторизации
    And Проверить, что элемент Пульт ЭО 2.0 не отображается на странице
    And Проверить ФИО в хедере 2.0 "Автоматизация Одна роль"
    And Проверить роль в хедере 2.0: "Аудитор"
    And Проверить МФЦ в хедере 2.0: "МФЦ Автоматизация Основной ЭО Дамаск"

  @3005/5
  Scenario: 2.0.Авторизация с Дамаск. Аудитор. Одна роль и один филиал Родительский, без подключения пульта ЭО
    Given Перейти на урл
    And Ввести СНИЛС "85000000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать окно Дамаск при авторизации: "Без подключения пульта"
    And Нажать Продолжить при авторизации
    And Проверить, что элемент Пульт ЭО 2.0 не отображается на странице
    And Проверить ФИО в хедере 2.0 "Автоматизация Одна роль"
    And Проверить роль в хедере 2.0: "Аудитор"
    And Проверить МФЦ в хедере 2.0: "МФЦ Автоматизация Родительский ЭО Дамаск"

  @3005/6
  Scenario: 2.0.Авторизация с Дамаск. Аудитор. Одна роль и один филиал ТОСП, без подключения пульта ЭО
    Given Перейти на урл
    And Ввести СНИЛС "85100000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать окно Дамаск при авторизации: "Без подключения пульта"
    And Нажать Продолжить при авторизации
    And Проверить, что элемент Пульт ЭО 2.0 не отображается на странице
    And Проверить ФИО в хедере 2.0 "Автоматизация Одна роль"
    And Проверить роль в хедере 2.0: "Аудитор"
    And Проверить МФЦ в хедере 2.0: "МФЦ Автоматизация ТОСП ЭО Дамаск"

  @3145/1
  Scenario: 2.0.Авторизация с Дамаск. Оператор.  Все роли и все филиалы,филиал Основной, выбор окна пульта ЭО
    Given Перейти на урл
    And Ввести СНИЛС "88600000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать филиал МФЦ при авторизации: "МФЦ Автоматизация Основной ЭО Дамаск"
    And Выбрать роль при авторизации: "Оператор"
    And Выбрать окно Дамаск при авторизации: "Окно 1"
    And Нажать Продолжить при авторизации
    And Проверить отображение пульта ЭО Дамаск в версии 2.0 и нажать
    And Нажать кнопку Начать работу пульта ЭО 2.0 после авторизации
    And Проверить номер окна в меню Дамаск 2.0: "Окно: Окно 1"
    And Нажать кнопку Закончить работу пульта ЭО 2.0 после авторизации
    And Закрыть окно пульта ЭО Дамаск 2.0
    And Проверить ФИО в хедере 2.0 "Автоматизация Все роли"
    And Проверить роль в хедере 2.0: "Оператор"
    And Проверить МФЦ в хедере 2.0: "МФЦ Автоматизация Основной ЭО Дамаск"

  @3145/2
  Scenario: 2.0.Авторизация с Дамаск. Оператор. Все роли и все филиалы,филиал Родительский, выбор окна пульта ЭО
    Given Перейти на урл
    And Ввести СНИЛС "88600000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать филиал МФЦ при авторизации: "МФЦ Автоматизация Родительский ЭО Дамаск"
    And Выбрать роль при авторизации: "Оператор"
    And Выбрать окно Дамаск при авторизации: "Окно 2"
    And Нажать Продолжить при авторизации
    And Проверить отображение пульта ЭО Дамаск в версии 2.0 и нажать
    And Нажать кнопку Начать работу пульта ЭО 2.0 после авторизации
    And Проверить номер окна в меню Дамаск 2.0: "Окно: Окно 2"
    And Нажать кнопку Закончить работу пульта ЭО 2.0 после авторизации
    And Закрыть окно пульта ЭО Дамаск 2.0
    And Проверить ФИО в хедере 2.0 "Автоматизация Все роли"
    And Проверить роль в хедере 2.0: "Оператор"
    And Проверить МФЦ в хедере 2.0: "МФЦ Автоматизация Родительский ЭО Дамаск"

  @3145/3
  Scenario: 2.0.Авторизация с Дамаск. Оператор.  Все роли и все филиалы,филиал ТОСП, выбор окна пульта ЭО
    Given Перейти на урл
    And Ввести СНИЛС "88600000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать филиал МФЦ при авторизации: "МФЦ Автоматизация ТОСП ЭО Дамаск"
    And Выбрать роль при авторизации: "Оператор"
    And Выбрать окно Дамаск при авторизации: "Окно 3"
    And Нажать Продолжить при авторизации
    And Проверить отображение пульта ЭО Дамаск в версии 2.0 и нажать
    And Нажать кнопку Начать работу пульта ЭО 2.0 после авторизации
    And Проверить номер окна в меню Дамаск 2.0: "Окно: Окно 3"
    And Нажать кнопку Закончить работу пульта ЭО 2.0 после авторизации
    And Закрыть окно пульта ЭО Дамаск 2.0
    And Проверить ФИО в хедере 2.0 "Автоматизация Все роли"
    And Проверить роль в хедере 2.0: "Оператор"
    And Проверить МФЦ в хедере 2.0: "МФЦ Автоматизация ТОСП ЭО Дамаск"

  @3145/4
  Scenario: 2.0.Авторизация с Дамаск. Аудитор.  Все роли и все филиалы,филиал Основной, выбор окна пульта ЭО
    Given Перейти на урл
    And Ввести СНИЛС "88600000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать филиал МФЦ при авторизации: "МФЦ Автоматизация Основной ЭО Дамаск"
    And Выбрать роль при авторизации: "Аудитор"
    And Выбрать окно Дамаск при авторизации: "Окно 1"
    And Нажать Продолжить при авторизации
    And Проверить отображение пульта ЭО Дамаск в версии 2.0 и нажать
    And Нажать кнопку Начать работу пульта ЭО 2.0 после авторизации
    And Проверить номер окна в меню Дамаск 2.0: "Окно: Окно 1"
    And Нажать кнопку Закончить работу пульта ЭО 2.0 после авторизации
    And Закрыть окно пульта ЭО Дамаск 2.0
    And Проверить ФИО в хедере 2.0 "Автоматизация Все роли"
    And Проверить роль в хедере 2.0: "Аудитор"
    And Проверить МФЦ в хедере 2.0: "МФЦ Автоматизация Основной ЭО Дамаск"

  @3145/5
  Scenario: 2.0.Авторизация с Дамаск. Аудитор.  Все роли и все филиалы,филиал Родительский, выбор окна пульта ЭО
    Given Перейти на урл
    And Ввести СНИЛС "88600000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать филиал МФЦ при авторизации: "МФЦ Автоматизация Родительский ЭО Дамаск"
    And Выбрать роль при авторизации: "Аудитор"
    And Выбрать окно Дамаск при авторизации: "Окно 2"
    And Нажать Продолжить при авторизации
    And Проверить отображение пульта ЭО Дамаск в версии 2.0 и нажать
    And Нажать кнопку Начать работу пульта ЭО 2.0 после авторизации
    And Проверить номер окна в меню Дамаск 2.0: "Окно: Окно 2"
    And Нажать кнопку Закончить работу пульта ЭО 2.0 после авторизации
    And Закрыть окно пульта ЭО Дамаск 2.0
    And Проверить ФИО в хедере 2.0 "Автоматизация Все роли"
    And Проверить роль в хедере 2.0: "Аудитор"
    And Проверить МФЦ в хедере 2.0: "МФЦ Автоматизация Родительский ЭО Дамаск"

  @3145/6
  Scenario: 2.0.Авторизация с Дамаск. Аудитор.  Все роли и все филиалы,филиал ТОСП, выбор окна пульта ЭО
    Given Перейти на урл
    And Ввести СНИЛС "88600000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать филиал МФЦ при авторизации: "МФЦ Автоматизация ТОСП ЭО Дамаск"
    And Выбрать роль при авторизации: "Аудитор"
    And Выбрать окно Дамаск при авторизации: "Окно 3"
    And Нажать Продолжить при авторизации
    And Проверить отображение пульта ЭО Дамаск в версии 2.0 и нажать
    And Нажать кнопку Начать работу пульта ЭО 2.0 после авторизации
    And Проверить номер окна в меню Дамаск 2.0: "Окно: Окно 3"
    And Нажать кнопку Закончить работу пульта ЭО 2.0 после авторизации
    And Закрыть окно пульта ЭО Дамаск 2.0
    And Проверить ФИО в хедере 2.0 "Автоматизация Все роли"
    And Проверить роль в хедере 2.0: "Аудитор"
    And Проверить МФЦ в хедере 2.0: "МФЦ Автоматизация ТОСП ЭО Дамаск"

  @2921/1
  Scenario: 2.0.Авторизация с Дамаск. Оператор.  Все роли и все филиалы,филиал Основной, без подключения пульта ЭО
    Given Перейти на урл
    And Ввести СНИЛС "88600000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать филиал МФЦ при авторизации: "МФЦ Автоматизация Основной ЭО Дамаск"
    And Выбрать роль при авторизации: "Оператор"
    And Выбрать окно Дамаск при авторизации: "Без подключения пульта"
    And Нажать Продолжить при авторизации
    And Проверить, что элемент Пульт ЭО 2.0 не отображается на странице
    And Проверить ФИО в хедере 2.0 "Автоматизация Все роли"
    And Проверить роль в хедере 2.0: "Оператор"
    And Проверить МФЦ в хедере 2.0: "МФЦ Автоматизация Основной ЭО Дамаск"

  @2921/2
  Scenario: 2.0.Авторизация с Дамаск. Оператор.  Все роли и все филиалы,филиал Родительский, без подключения пульта ЭО
    Given Перейти на урл
    And Ввести СНИЛС "88600000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать филиал МФЦ при авторизации: "МФЦ Автоматизация Родительский ЭО Дамаск"
    And Выбрать роль при авторизации: "Оператор"
    And Выбрать окно Дамаск при авторизации: "Без подключения пульта"
    And Нажать Продолжить при авторизации
    And Проверить, что элемент Пульт ЭО 2.0 не отображается на странице
    And Проверить ФИО в хедере 2.0 "Автоматизация Все роли"
    And Проверить роль в хедере 2.0: "Оператор"
    And Проверить МФЦ в хедере 2.0: "МФЦ Автоматизация Родительский ЭО Дамаск"

  @2921/3
  Scenario: 2.0.Авторизация с Дамаск. Оператор.  Все роли и все филиалы,филиал ТОСП, без подключения пульта ЭО
    Given Перейти на урл
    And Ввести СНИЛС "88600000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать филиал МФЦ при авторизации: "МФЦ Автоматизация ТОСП ЭО Дамаск"
    And Выбрать роль при авторизации: "Оператор"
    And Выбрать окно Дамаск при авторизации: "Без подключения пульта"
    And Нажать Продолжить при авторизации
    And Проверить, что элемент Пульт ЭО 2.0 не отображается на странице
    And Проверить ФИО в хедере 2.0 "Автоматизация Все роли"
    And Проверить роль в хедере 2.0: "Оператор"
    And Проверить МФЦ в хедере 2.0: "МФЦ Автоматизация ТОСП ЭО Дамаск"

  @2921/4
  Scenario: 2.0.Авторизация с Дамаск. Аудитор.  Все роли и все филиалы,филиал Основной, без подключения пульта ЭО
    Given Перейти на урл
    And Ввести СНИЛС "88600000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать филиал МФЦ при авторизации: "МФЦ Автоматизация Основной ЭО Дамаск"
    And Выбрать роль при авторизации: "Аудитор"
    And Выбрать окно Дамаск при авторизации: "Без подключения пульта"
    And Нажать Продолжить при авторизации
    And Проверить, что элемент Пульт ЭО 2.0 не отображается на странице
    And Проверить ФИО в хедере 2.0 "Автоматизация Все роли"
    And Проверить роль в хедере 2.0: "Аудитор"
    And Проверить МФЦ в хедере 2.0: "МФЦ Автоматизация Основной ЭО Дамаск"

  @2921/5
  Scenario: 2.0.Авторизация с Дамаск. Аудитор. Все роли и все филиалы,филиал Родительский, без подключения пульта ЭО
    Given Перейти на урл
    And Ввести СНИЛС "88600000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать филиал МФЦ при авторизации: "МФЦ Автоматизация Родительский ЭО Дамаск"
    And Выбрать роль при авторизации: "Аудитор"
    And Выбрать окно Дамаск при авторизации: "Без подключения пульта"
    And Нажать Продолжить при авторизации
    And Проверить, что элемент Пульт ЭО 2.0 не отображается на странице
    And Проверить ФИО в хедере 2.0 "Автоматизация Все роли"
    And Проверить роль в хедере 2.0: "Аудитор"
    And Проверить МФЦ в хедере 2.0: "МФЦ Автоматизация Родительский ЭО Дамаск"

  @2921/6
  Scenario: 2.0.Авторизация с Дамаск. Аудитор.  Все роли и все филиалы,филиал ТОСП, без подключения пульта ЭО
    Given Перейти на урл
    And Ввести СНИЛС "88600000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать филиал МФЦ при авторизации: "МФЦ Автоматизация ТОСП ЭО Дамаск"
    And Выбрать роль при авторизации: "Аудитор"
    And Выбрать окно Дамаск при авторизации: "Без подключения пульта"
    And Нажать Продолжить при авторизации
    And Проверить, что элемент Пульт ЭО 2.0 не отображается на странице
    And Проверить ФИО в хедере 2.0 "Автоматизация Все роли"
    And Проверить роль в хедере 2.0: "Аудитор"
    And Проверить МФЦ в хедере 2.0: "МФЦ Автоматизация ТОСП ЭО Дамаск"

  @2465/1
  Scenario: 2.0.Авторизация с Дамаск. Обработчик заявок. Все роли и все филиалы,филиал Основной
    Given Перейти на урл
    And Ввести СНИЛС "88600000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать филиал МФЦ при авторизации: "МФЦ Автоматизация Основной ЭО Дамаск"
    And Выбрать роль при авторизации: "Обработчик заявок"
    And Нажать Продолжить при авторизации
    And Проверить, что элемент Пульт ЭО 2.0 не отображается на странице
    And Проверить ФИО в хедере 2.0 "Автоматизация Все роли"
    And Проверить роль в хедере 2.0: "Обработчик заявок"
    And Проверить МФЦ в хедере 2.0: "МФЦ Автоматизация Основной ЭО Дамаск"

  @2465/2
  Scenario: 2.0.Авторизация с Дамаск. Обработчик заявок. Все роли и все филиалы,филиал Родительский
    Given Перейти на урл
    And Ввести СНИЛС "88600000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать филиал МФЦ при авторизации: "МФЦ Автоматизация Родительский ЭО Дамаск"
    And Выбрать роль при авторизации: "Обработчик заявок"
    And Нажать Продолжить при авторизации
    And Проверить, что элемент Пульт ЭО 2.0 не отображается на странице
    And Проверить ФИО в хедере 2.0 "Автоматизация Все роли"
    And Проверить роль в хедере 2.0: "Обработчик заявок"
    And Проверить МФЦ в хедере 2.0: "МФЦ Автоматизация Родительский ЭО Дамаск"

  @2465/3
  Scenario: 2.0.Авторизация с Дамаск. Обработчик заявок. Все роли и все филиалы,филиал ТОСП
    Given Перейти на урл
    And Ввести СНИЛС "88600000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать филиал МФЦ при авторизации: "МФЦ Автоматизация ТОСП ЭО Дамаск"
    And Выбрать роль при авторизации: "Обработчик заявок"
    And Нажать Продолжить при авторизации
    And Проверить, что элемент Пульт ЭО 2.0 не отображается на странице
    And Проверить ФИО в хедере 2.0 "Автоматизация Все роли"
    And Проверить роль в хедере 2.0: "Обработчик заявок"
    And Проверить МФЦ в хедере 2.0: "МФЦ Автоматизация ТОСП ЭО Дамаск"

  @2465/4
  Scenario: 2.0.Авторизация с Дамаск. Администратор ИБ. Все роли и все филиалы,филиал Основной
    Given Перейти на урл
    And Ввести СНИЛС "88600000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать филиал МФЦ при авторизации: "МФЦ Автоматизация Основной ЭО Дамаск"
    And Выбрать роль при авторизации: "Администратор ИБ"
    And Нажать Продолжить при авторизации
    And Проверить, что элемент Пульт ЭО 2.0 не отображается на странице
    And Проверить ФИО в хедере 2.0 "Автоматизация Все роли"
    And Проверить роль в хедере 2.0: "Администратор ИБ"
    And Проверить МФЦ в хедере 2.0: "МФЦ Автоматизация Основной ЭО Дамаск"

  @2465/5
  Scenario: 2.0.Авторизация с Дамаск. Администратор ИБ. Все роли и все филиалы,филиал Родительский
    Given Перейти на урл
    And Ввести СНИЛС "88600000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать филиал МФЦ при авторизации: "МФЦ Автоматизация Родительский ЭО Дамаск"
    And Выбрать роль при авторизации: "Администратор ИБ"
    And Нажать Продолжить при авторизации
    And Проверить, что элемент Пульт ЭО 2.0 не отображается на странице
    And Проверить ФИО в хедере 2.0 "Автоматизация Все роли"
    And Проверить роль в хедере 2.0: "Администратор ИБ"
    And Проверить МФЦ в хедере 2.0: "МФЦ Автоматизация Родительский ЭО Дамаск"

  @2465/6
  Scenario: 2.0.Авторизация с Дамаск. Администратор ИБ. Все роли и все филиалы,филиал ТОСП
    Given Перейти на урл
    And Ввести СНИЛС "88600000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать филиал МФЦ при авторизации: "МФЦ Автоматизация ТОСП ЭО Дамаск"
    And Выбрать роль при авторизации: "Администратор ИБ"
    And Нажать Продолжить при авторизации
    And Проверить, что элемент Пульт ЭО 2.0 не отображается на странице
    And Проверить ФИО в хедере 2.0 "Автоматизация Все роли"
    And Проверить роль в хедере 2.0: "Администратор ИБ"
    And Проверить МФЦ в хедере 2.0: "МФЦ Автоматизация ТОСП ЭО Дамаск"

  @2414/1
  Scenario: 2.0.Авторизация с Дамаск. Сотрудник контакт-центра. Все роли и все филиалы,филиал Основной
    Given Перейти на урл
    And Ввести СНИЛС "88600000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать филиал МФЦ при авторизации: "МФЦ Автоматизация Основной ЭО Дамаск"
    And Выбрать роль при авторизации: "Сотрудник контакт-центра"
    And Ввести в поле Введите номер линии колл-центра SMARTCALL значение "1"
    And Нажать Продолжить при авторизации
    And Проверить, что элемент Пульт ЭО 2.0 не отображается на странице
    And Проверить ФИО в хедере 2.0 "Автоматизация Все роли"
    And Проверить роль в хедере 2.0: "Сотрудник контакт-центра"
    And Проверить МФЦ в хедере 2.0: "МФЦ Автоматизация Основной ЭО Дамаск"

  @2414/2
  Scenario: 2.0.Авторизация с Дамаск. Сотрудник контакт-центра. Все роли и все филиалы,филиал Родительский
    Given Перейти на урл
    And Ввести СНИЛС "88600000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать филиал МФЦ при авторизации: "МФЦ Автоматизация Родительский ЭО Дамаск"
    And Выбрать роль при авторизации: "Сотрудник контакт-центра"
    And Ввести в поле Введите номер линии колл-центра SMARTCALL значение "1"
    And Нажать Продолжить при авторизации
    And Проверить, что элемент Пульт ЭО 2.0 не отображается на странице
    And Проверить ФИО в хедере 2.0 "Автоматизация Все роли"
    And Проверить роль в хедере 2.0: "Сотрудник контакт-центра"
    And Проверить МФЦ в хедере 2.0: "МФЦ Автоматизация Родительский ЭО Дамаск"

  @2414/3
  Scenario: 2.0.Авторизация с Дамаск. Сотрудник контакт-центра. Все роли и все филиалы,филиал ТОСП
    Given Перейти на урл
    And Ввести СНИЛС "88600000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать филиал МФЦ при авторизации: "МФЦ Автоматизация ТОСП ЭО Дамаск"
    And Выбрать роль при авторизации: "Сотрудник контакт-центра"
    And Ввести в поле Введите номер линии колл-центра SMARTCALL значение "1"
    And Нажать Продолжить при авторизации
    And Проверить, что элемент Пульт ЭО 2.0 не отображается на странице
    And Проверить ФИО в хедере 2.0 "Автоматизация Все роли"
    And Проверить роль в хедере 2.0: "Сотрудник контакт-центра"
    And Проверить МФЦ в хедере 2.0: "МФЦ Автоматизация ТОСП ЭО Дамаск"

  @2892/1
  Scenario: 2.0.Авторизация с Дамаск. Обработчик заявок. Одна роль и один филиал Основной
    Given Перейти на урл
    And Ввести СНИЛС "86500000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Проверить, что элемент Пульт ЭО 2.0 не отображается на странице
    And Проверить ФИО в хедере 2.0 "Автоматизация Одна роль"
    And Проверить роль в хедере 2.0: "Обработчик заявок"
    And Проверить МФЦ в хедере 2.0: "МФЦ Автоматизация Основной ЭО Дамаск"

  @2892/2
  Scenario: 2.0.Авторизация с Дамаск. Обработчик заявок. Одна роль и один филиал Родительский
    Given Перейти на урл
    And Ввести СНИЛС "86600000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Проверить, что элемент Пульт ЭО 2.0 не отображается на странице
    And Проверить ФИО в хедере 2.0 "Автоматизация Одна роль"
    And Проверить роль в хедере 2.0: "Обработчик заявок"
    And Проверить МФЦ в хедере 2.0: "МФЦ Автоматизация Родительский ЭО Дамаск"

  @2892/3
  Scenario: 2.0.Авторизация с Дамаск. Обработчик заявок. Одна роль и один филиал ТОСП
    Given Перейти на урл
    And Ввести СНИЛС "86700000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Проверить, что элемент Пульт ЭО 2.0 не отображается на странице
    And Проверить ФИО в хедере 2.0 "Автоматизация Одна роль"
    And Проверить роль в хедере 2.0: "Обработчик заявок"
    And Проверить МФЦ в хедере 2.0: "МФЦ Автоматизация ТОСП ЭО Дамаск"

  @2892/4
  Scenario: 2.0.Авторизация с Дамаск. Администратор ИБ. Одна роль и один филиал Основной
    Given Перейти на урл
    And Ввести СНИЛС "87100000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Проверить, что элемент Пульт ЭО 2.0 не отображается на странице
    And Проверить ФИО в хедере 2.0 "Автоматизация Одна роль"
    And Проверить роль в хедере 2.0: "Администратор ИБ"
    And Проверить МФЦ в хедере 2.0: "МФЦ Автоматизация Основной ЭО Дамаск"

  @2892/5
  Scenario: 2.0.Авторизация с Дамаск. Администратор ИБ. Одна роль и один филиал Родительский
    Given Перейти на урл
    And Ввести СНИЛС "87200000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Проверить, что элемент Пульт ЭО 2.0 не отображается на странице
    And Проверить ФИО в хедере 2.0 "Автоматизация Одна роль"
    And Проверить роль в хедере 2.0: "Администратор ИБ"
    And Проверить МФЦ в хедере 2.0: "МФЦ Автоматизация Родительский ЭО Дамаск"

  @2892/6
  Scenario: 2.0.Авторизация с Дамаск. Администратор ИБ. Одна роль и один филиал ТОСП
    Given Перейти на урл
    And Ввести СНИЛС "87300000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Проверить, что элемент Пульт ЭО 2.0 не отображается на странице
    And Проверить ФИО в хедере 2.0 "Автоматизация Одна роль"
    And Проверить роль в хедере 2.0: "Администратор ИБ"
    And Проверить МФЦ в хедере 2.0: "МФЦ Автоматизация ТОСП ЭО Дамаск"

  @2510/1
  Scenario: 2.0.Авторизация с Дамаск. Сотрудник контакт-центра. Одна роль и один филиал Основной
    Given Перейти на урл
    And Ввести СНИЛС "86800000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Ввести в поле Введите номер линии колл-центра SMARTCALL значение "1"
    And Нажать Продолжить при авторизации
    And Проверить, что элемент Пульт ЭО 2.0 не отображается на странице
    And Проверить ФИО в хедере 2.0 "Автоматизация Одна роль"
    And Проверить роль в хедере 2.0: "Сотрудник контакт-центра"
    And Проверить МФЦ в хедере 2.0: "МФЦ Автоматизация Основной ЭО Дамаск"

  @2510/2
  Scenario: 2.0.Авторизация с Дамаск. Сотрудник контакт-центра. Одна роль и один филиал Родительский
    Given Перейти на урл
    And Ввести СНИЛС "86900000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Ввести в поле Введите номер линии колл-центра SMARTCALL значение "1"
    And Нажать Продолжить при авторизации
    And Проверить, что элемент Пульт ЭО 2.0 не отображается на странице
    And Проверить ФИО в хедере 2.0 "Автоматизация Одна роль"
    And Проверить роль в хедере 2.0: "Сотрудник контакт-центра"
    And Проверить МФЦ в хедере 2.0: "МФЦ Автоматизация Родительский ЭО Дамаск"

  @2510/3
  Scenario: 2.0.Авторизация с Дамаск. Сотрудник контакт-центра. Одна роль и один филиал ТОСП
    Given Перейти на урл
    And Ввести СНИЛС "87000000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Ввести в поле Введите номер линии колл-центра SMARTCALL значение "1"
    And Нажать Продолжить при авторизации
    And Проверить, что элемент Пульт ЭО 2.0 не отображается на странице
    And Проверить ФИО в хедере 2.0 "Автоматизация Одна роль"
    And Проверить роль в хедере 2.0: "Сотрудник контакт-центра"
    And Проверить МФЦ в хедере 2.0: "МФЦ Автоматизация ТОСП ЭО Дамаск"