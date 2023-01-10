@tagForFile
Feature: Авторизация с Дамаск версия Next

 @1919/1
  Scenario: Next.Авторизация с Дамаск. Оператор. Одна роль и один филиал Основной, выбор окна пульта ЭО
    Given Перейти на урл
    And Ввести СНИЛС "89600000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать окно Дамаск при авторизации: "Окно 2"
    And Нажать Продолжить при авторизации
    And Нажать кнопку открытия пульта ЭО Некст после авторизации
    And Проверить номер окна в выпадающем меню Дамаск Некст: "Окно 2"
    And Закрыть окно пульта ЭО Дамаск Некст
    And Открыть меню пользователя Некст
    And Проверить роль в меню пользователя Некст: "Оператор"
    And Проверить МФЦ в меню пользователя Некст: "МФЦ Автоматизация Основной ЭО Дамаск"
    And Проверить ФИО в хедере Некст: "Автоматизация Одна роль Оператор ЭО Дамаск Next Один филиал Основной"
    And Проверить, что пользователь на странице грида заявлений Некст

  @1919/2
  Scenario: Next.Авторизация с Дамаск. Оператор. Одна роль и один филиал Родительский, выбор окна пульта ЭО
    Given Перейти на урл
    And Ввести СНИЛС "89700000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать окно Дамаск при авторизации: "Окно 2"
    And Нажать Продолжить при авторизации
    And Нажать кнопку открытия пульта ЭО Некст после авторизации
    And Проверить номер окна в выпадающем меню Дамаск Некст: "Окно 2"
    And Закрыть окно пульта ЭО Дамаск Некст
    And Открыть меню пользователя Некст
    And Проверить роль в меню пользователя Некст: "Оператор"
    And Проверить МФЦ в меню пользователя Некст: "МФЦ Автоматизация Родительский ЭО Дамаск"
    And Проверить ФИО в хедере Некст: "Автоматизация Одна роль Оператор ЭО Дамаск Next Один филиал Родительский"
    And Проверить, что пользователь на странице грида заявлений Некст

  @1919/3
  Scenario: Next.Авторизация с Дамаск. Оператор. Одна роль и один филиал ТОСП, выбор окна пульта ЭО
    Given Перейти на урл
    And Ввести СНИЛС "89800000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать окно Дамаск при авторизации: "Окно 3"
    And Нажать Продолжить при авторизации
    And Нажать кнопку открытия пульта ЭО Некст после авторизации
    And Проверить номер окна в выпадающем меню Дамаск Некст: "Окно 3"
    And Закрыть окно пульта ЭО Дамаск Некст
    And Открыть меню пользователя Некст
    And Проверить роль в меню пользователя Некст: "Оператор"
    And Проверить МФЦ в меню пользователя Некст: "МФЦ Автоматизация ТОСП ЭО Дамаск"
    And Проверить ФИО в хедере Некст: "Автоматизация Одна роль Оператор ЭО Дамаск Next Один филиал ТОСП"
    And Проверить, что пользователь на странице грида заявлений Некст

  @1919/4
  Scenario: Next.Авторизация с Дамаск. Аудитор. Одна роль и один филиал Основной, выбор окна пульта ЭО
    Given Перейти на урл
    And Ввести СНИЛС "85200000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать окно Дамаск при авторизации: "Окно 2"
    And Нажать Продолжить при авторизации
    And Нажать кнопку открытия пульта ЭО Некст после авторизации
    And Проверить номер окна в выпадающем меню Дамаск Некст: "Окно 2"
    And Закрыть окно пульта ЭО Дамаск Некст
    And Открыть меню пользователя Некст
    And Проверить роль в меню пользователя Некст: "Аудитор"
    And Проверить МФЦ в меню пользователя Некст: "МФЦ Автоматизация Основной ЭО Дамаск"
    And Проверить ФИО в хедере Некст: "Автоматизация Одна роль Аудитор ЭО Дамаск Next Один филиал Основной"
    And Проверить, что пользователь на странице грида заявлений Некст

  @1919/5
  Scenario: Next.Авторизация с Дамаск. Аудитор. Одна роль и один филиал Родительский, выбор окна пульта ЭО
    Given Перейти на урл
    And Ввести СНИЛС "85300000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать окно Дамаск при авторизации: "Окно 2"
    And Нажать Продолжить при авторизации
    And Нажать кнопку открытия пульта ЭО Некст после авторизации
    And Проверить номер окна в выпадающем меню Дамаск Некст: "Окно 2"
    And Закрыть окно пульта ЭО Дамаск Некст
    And Открыть меню пользователя Некст
    And Проверить роль в меню пользователя Некст: "Аудитор"
    And Проверить МФЦ в меню пользователя Некст: "МФЦ Автоматизация Родительский ЭО Дамаск"
    And Проверить ФИО в хедере Некст: "Автоматизация Одна роль Аудитор ЭО Дамаск Next Один филиал Родительский"
    And Проверить, что пользователь на странице грида заявлений Некст

  @1919/6
  Scenario: Next.Авторизация с Дамаск. Аудитор. Одна роль и один филиал ТОСП, выбор окна пульта ЭО
    Given Перейти на урл
    And Ввести СНИЛС "85400000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать окно Дамаск при авторизации: "Окно 3"
    And Нажать Продолжить при авторизации
    And Нажать кнопку открытия пульта ЭО Некст после авторизации
    And Проверить номер окна в выпадающем меню Дамаск Некст: "Окно 3"
    And Закрыть окно пульта ЭО Дамаск Некст
    And Открыть меню пользователя Некст
    And Проверить роль в меню пользователя Некст: "Аудитор"
    And Проверить МФЦ в меню пользователя Некст: "МФЦ Автоматизация ТОСП ЭО Дамаск"
    And Проверить ФИО в хедере Некст: "Автоматизация Одна роль Аудитор ЭО Дамаск Next Один филиал ТОСП"
    And Проверить, что пользователь на странице грида заявлений Некст

  @1696/1
  Scenario: Next.Авторизация с Дамаск. Оператор. Одна роль и один филиал Основной, без подключения пульта ЭО
    Given Перейти на урл
    And Ввести СНИЛС "89600000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать окно Дамаск при авторизации: "Без подключения пульта"
    And Нажать Продолжить при авторизации
    And Проверить, что элемент Пульт ЭО Некст не отображается на странице
    And Открыть меню пользователя Некст
    And Проверить роль в меню пользователя Некст: "Оператор"
    And Проверить МФЦ в меню пользователя Некст: "МФЦ Автоматизация Основной ЭО Дамаск"
    And Проверить ФИО в хедере Некст: "Автоматизация Одна роль Оператор ЭО Дамаск Next Один филиал Основной"
    And Проверить, что пользователь на странице грида заявлений Некст


  @1696/2
  Scenario: Next.Авторизация с Дамаск. Оператор. Одна роль и один филиал Родительский, без подключения пульта ЭО
    Given Перейти на урл
    And Ввести СНИЛС "89700000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать окно Дамаск при авторизации: "Без подключения пульта"
    And Нажать Продолжить при авторизации
    And Проверить, что элемент Пульт ЭО Некст не отображается на странице
    And Открыть меню пользователя Некст
    And Проверить роль в меню пользователя Некст: "Оператор"
    And Проверить МФЦ в меню пользователя Некст: "МФЦ Автоматизация Родительский ЭО Дамаск"
    And Проверить ФИО в хедере Некст: "Автоматизация Одна роль Оператор ЭО Дамаск Next Один филиал Родительский"
    And Проверить, что пользователь на странице грида заявлений Некст

  @1696/3
  Scenario: Next.Авторизация с Дамаск. Оператор. Одна роль и один филиал ТОСП, без подключения пульта ЭО
    Given Перейти на урл
    And Ввести СНИЛС "89800000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать окно Дамаск при авторизации: "Без подключения пульта"
    And Нажать Продолжить при авторизации
    And Проверить, что элемент Пульт ЭО Некст не отображается на странице
    And Открыть меню пользователя Некст
    And Проверить роль в меню пользователя Некст: "Оператор"
    And Проверить МФЦ в меню пользователя Некст: "МФЦ Автоматизация ТОСП ЭО Дамаск"
    And Проверить ФИО в хедере Некст: "Автоматизация Одна роль Оператор ЭО Дамаск Next Один филиал ТОСП"
    And Проверить, что пользователь на странице грида заявлений Некст

  @1696/4
  Scenario: Next.Авторизация с Дамаск. Аудитор. Одна роль и один филиал Основной, без подключения пульта ЭО
    Given Перейти на урл
    And Ввести СНИЛС "85200000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать окно Дамаск при авторизации: "Без подключения пульта"
    And Нажать Продолжить при авторизации
    And Проверить, что элемент Пульт ЭО Некст не отображается на странице
    And Открыть меню пользователя Некст
    And Проверить роль в меню пользователя Некст: "Аудитор"
    And Проверить МФЦ в меню пользователя Некст: "МФЦ Автоматизация Основной ЭО Дамаск"
    And Проверить ФИО в хедере Некст: "Автоматизация Одна роль Аудитор ЭО Дамаск Next Один филиал Основной"
    And Проверить, что пользователь на странице грида заявлений Некст

  @1696/5
  Scenario: Next.Авторизация с Дамаск. Аудитор. Одна роль и один филиал Родительский, без подключения пульта ЭО
    Given Перейти на урл
    And Ввести СНИЛС "85300000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать окно Дамаск при авторизации: "Без подключения пульта"
    And Нажать Продолжить при авторизации
    And Проверить, что элемент Пульт ЭО Некст не отображается на странице
    And Открыть меню пользователя Некст
    And Проверить роль в меню пользователя Некст: "Аудитор"
    And Проверить МФЦ в меню пользователя Некст: "МФЦ Автоматизация Родительский ЭО Дамаск"
    And Проверить ФИО в хедере Некст: "Автоматизация Одна роль Аудитор ЭО Дамаск Next Один филиал Родительский"
    And Проверить, что пользователь на странице грида заявлений Некст

  @1696/6
  Scenario: Next.Авторизация с Дамаск. Аудитор. Одна роль и один филиал ТОСП, без подключения пульта ЭО
    Given Перейти на урл
    And Ввести СНИЛС "85400000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать окно Дамаск при авторизации: "Без подключения пульта"
    And Нажать Продолжить при авторизации
    And Проверить, что элемент Пульт ЭО Некст не отображается на странице
    And Открыть меню пользователя Некст
    And Проверить роль в меню пользователя Некст: "Аудитор"
    And Проверить МФЦ в меню пользователя Некст: "МФЦ Автоматизация ТОСП ЭО Дамаск"
    And Проверить ФИО в хедере Некст: "Автоматизация Одна роль Аудитор ЭО Дамаск Next Один филиал ТОСП"
    And Проверить, что пользователь на странице грида заявлений Некст

  @1250/1
  Scenario: Next.Авторизация с Дамаск. Оператор. Все роли и все филиалы,филиал Основной, с выбором окна пульта ЭО
    Given Перейти на урл
    And Ввести СНИЛС "88900000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать филиал МФЦ при авторизации: "МФЦ Автоматизация Основной ЭО Дамаск"
    And Выбрать роль при авторизации: "Оператор"
    And Выбрать окно Дамаск при авторизации: "Окно 2"
    And Нажать Продолжить при авторизации
    And Нажать кнопку открытия пульта ЭО Некст после авторизации
    And Проверить номер окна в выпадающем меню Дамаск Некст: "Окно 2"
    And Закрыть окно пульта ЭО Дамаск Некст
    And Открыть меню пользователя Некст
    And Проверить роль в меню пользователя Некст: "Оператор"
    And Проверить МФЦ в меню пользователя Некст: "МФЦ Автоматизация Основной ЭО Дамаск"
    And Проверить ФИО в хедере Некст: "Автоматизация Все роли Все филиалы Интерфейс Next"
    And Проверить, что пользователь на странице грида заявлений Некст

  @1250/2
  Scenario: Next.Авторизация с Дамаск. Оператор. Все роли и все филиалы,филиал Родительский, с выбором окна пульта ЭО
    Given Перейти на урл
    And Ввести СНИЛС "88900000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать филиал МФЦ при авторизации: "МФЦ Автоматизация Родительский ЭО Дамаск"
    And Выбрать роль при авторизации: "Оператор"
    And Выбрать окно Дамаск при авторизации: "Окно 2"
    And Нажать Продолжить при авторизации
    And Нажать кнопку открытия пульта ЭО Некст после авторизации
    And Проверить номер окна в выпадающем меню Дамаск Некст: "Окно 2"
    And Закрыть окно пульта ЭО Дамаск Некст
    And Открыть меню пользователя Некст
    And Проверить роль в меню пользователя Некст: "Оператор"
    And Проверить МФЦ в меню пользователя Некст: "МФЦ Автоматизация Родительский ЭО Дамаск"
    And Проверить ФИО в хедере Некст: "Автоматизация Все роли Все филиалы Интерфейс Next"
    And Проверить, что пользователь на странице грида заявлений Некст

  @1250/3
  Scenario: Next.Авторизация с Дамаск. Оператор. Все роли и все филиалы,филиал ТОСП, с выбором окна пульта ЭО
    Given Перейти на урл
    And Ввести СНИЛС "88900000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать филиал МФЦ при авторизации: "МФЦ Автоматизация ТОСП ЭО Дамаск"
    And Выбрать роль при авторизации: "Оператор"
    And Выбрать окно Дамаск при авторизации: "Окно 3"
    And Нажать Продолжить при авторизации
    And Нажать кнопку открытия пульта ЭО Некст после авторизации
    And Проверить номер окна в выпадающем меню Дамаск Некст: "Окно 3"
    And Закрыть окно пульта ЭО Дамаск Некст
    And Открыть меню пользователя Некст
    And Проверить роль в меню пользователя Некст: "Оператор"
    And Проверить МФЦ в меню пользователя Некст: "МФЦ Автоматизация ТОСП ЭО Дамаск"
    And Проверить ФИО в хедере Некст: "Автоматизация Все роли Все филиалы Интерфейс Next"
    And Проверить, что пользователь на странице грида заявлений Некст

  @1250/4
  Scenario: Next.Авторизация с Дамаск. Аудитор. Все роли и все филиалы,филиал Основной, с выбором окна пульта ЭО
    Given Перейти на урл
    And Ввести СНИЛС "88900000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать филиал МФЦ при авторизации: "МФЦ Автоматизация Основной ЭО Дамаск"
    And Выбрать роль при авторизации: "Аудитор"
    And Выбрать окно Дамаск при авторизации: "Окно 2"
    And Нажать Продолжить при авторизации
    And Нажать кнопку открытия пульта ЭО Некст после авторизации
    And Проверить номер окна в выпадающем меню Дамаск Некст: "Окно 2"
    And Закрыть окно пульта ЭО Дамаск Некст
    And Открыть меню пользователя Некст
    And Проверить роль в меню пользователя Некст: "Аудитор"
    And Проверить МФЦ в меню пользователя Некст: "МФЦ Автоматизация Основной ЭО Дамаск"
    And Проверить ФИО в хедере Некст: "Автоматизация Все роли Все филиалы Интерфейс Next"
    And Проверить, что пользователь на странице грида заявлений Некст

  @1250/5
  Scenario: Next.Авторизация с Дамаск. Аудитор. Все роли и все филиалы,филиал Родительский, с выбором окна пульта ЭО
    Given Перейти на урл
    And Ввести СНИЛС "88900000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать филиал МФЦ при авторизации: "МФЦ Автоматизация Родительский ЭО Дамаск"
    And Выбрать роль при авторизации: "Аудитор"
    And Выбрать окно Дамаск при авторизации: "Окно 2"
    And Нажать Продолжить при авторизации
    And Нажать кнопку открытия пульта ЭО Некст после авторизации
    And Проверить номер окна в выпадающем меню Дамаск Некст: "Окно 2"
    And Закрыть окно пульта ЭО Дамаск Некст
    And Открыть меню пользователя Некст
    And Проверить роль в меню пользователя Некст: "Аудитор"
    And Проверить МФЦ в меню пользователя Некст: "МФЦ Автоматизация Родительский ЭО Дамаск"
    And Проверить ФИО в хедере Некст: "Автоматизация Все роли Все филиалы Интерфейс Next"
    And Проверить, что пользователь на странице грида заявлений Некст

  @1250/6
  Scenario: Next.Авторизация с Дамаск. Аудитор. Все роли и все филиалы,филиал ТОСП, с выбором окна пульта ЭО
    Given Перейти на урл
    And Ввести СНИЛС "88900000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать филиал МФЦ при авторизации: "МФЦ Автоматизация ТОСП ЭО Дамаск"
    And Выбрать роль при авторизации: "Аудитор"
    And Выбрать окно Дамаск при авторизации: "Окно 3"
    And Нажать Продолжить при авторизации
    And Нажать кнопку открытия пульта ЭО Некст после авторизации
    And Проверить номер окна в выпадающем меню Дамаск Некст: "Окно 3"
    And Закрыть окно пульта ЭО Дамаск Некст
    And Открыть меню пользователя Некст
    And Проверить роль в меню пользователя Некст: "Аудитор"
    And Проверить МФЦ в меню пользователя Некст: "МФЦ Автоматизация ТОСП ЭО Дамаск"
    And Проверить ФИО в хедере Некст: "Автоматизация Все роли Все филиалы Интерфейс Next"
    And Проверить, что пользователь на странице грида заявлений Некст

  @1888/1
  Scenario: Next.Авторизация с Дамаск. Оператор. Все роли и все филиалы,филиал Основной, без подключения пульта ЭО
    Given Перейти на урл
    And Ввести СНИЛС "88900000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать филиал МФЦ при авторизации: "МФЦ Автоматизация Основной ЭО Дамаск"
    And Выбрать роль при авторизации: "Оператор"
    And Выбрать окно Дамаск при авторизации: "Без подключения пульта"
    And Нажать Продолжить при авторизации
    And Проверить, что элемент Пульт ЭО Некст не отображается на странице
    And Открыть меню пользователя Некст
    And Проверить роль в меню пользователя Некст: "Оператор"
    And Проверить МФЦ в меню пользователя Некст: "МФЦ Автоматизация Основной ЭО Дамаск"
    And Проверить ФИО в хедере Некст: "Автоматизация Все роли Все филиалы Интерфейс Next"
    And Проверить, что пользователь на странице грида заявлений Некст


  @1888/2
  Scenario: Next.Авторизация с Дамаск. Оператор. Все роли и все филиалы,филиал Родительский, без подключения пульта ЭО
    Given Перейти на урл
    And Ввести СНИЛС "88900000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать филиал МФЦ при авторизации: "МФЦ Автоматизация Родительский ЭО Дамаск"
    And Выбрать роль при авторизации: "Оператор"
    And Выбрать окно Дамаск при авторизации: "Без подключения пульта"
    And Нажать Продолжить при авторизации
    And Проверить, что элемент Пульт ЭО Некст не отображается на странице
    And Открыть меню пользователя Некст
    And Проверить роль в меню пользователя Некст: "Оператор"
    And Проверить МФЦ в меню пользователя Некст: "МФЦ Автоматизация Родительский ЭО Дамаск"
    And Проверить ФИО в хедере Некст: "Автоматизация Все роли Все филиалы Интерфейс Next"
    And Проверить, что пользователь на странице грида заявлений Некст

  @1888/3
  Scenario: Next.Авторизация с Дамаск. Оператор. Все роли и все филиалы,филиал ТОСП, без подключения пульта ЭО
    Given Перейти на урл
    And Ввести СНИЛС "88900000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать филиал МФЦ при авторизации: "МФЦ Автоматизация ТОСП ЭО Дамаск"
    And Выбрать роль при авторизации: "Оператор"
    And Выбрать окно Дамаск при авторизации: "Без подключения пульта"
    And Нажать Продолжить при авторизации
    And Проверить, что элемент Пульт ЭО Некст не отображается на странице
    And Открыть меню пользователя Некст
    And Проверить роль в меню пользователя Некст: "Оператор"
    And Проверить МФЦ в меню пользователя Некст: "МФЦ Автоматизация ТОСП ЭО Дамаск"
    And Проверить ФИО в хедере Некст: "Автоматизация Все роли Все филиалы Интерфейс Next"
    And Проверить, что пользователь на странице грида заявлений Некст

  @1888/4
  Scenario: Next.Авторизация с Дамаск. Аудитор. Все роли и все филиалы,филиал Основной, без подключения пульта ЭО
    Given Перейти на урл
    And Ввести СНИЛС "88900000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать филиал МФЦ при авторизации: "МФЦ Автоматизация Основной ЭО Дамаск"
    And Выбрать роль при авторизации: "Аудитор"
    And Выбрать окно Дамаск при авторизации: "Без подключения пульта"
    And Нажать Продолжить при авторизации
    And Проверить, что элемент Пульт ЭО Некст не отображается на странице
    And Открыть меню пользователя Некст
    And Проверить роль в меню пользователя Некст: "Аудитор"
    And Проверить МФЦ в меню пользователя Некст: "МФЦ Автоматизация Основной ЭО Дамаск"
    And Проверить ФИО в хедере Некст: "Автоматизация Все роли Все филиалы Интерфейс Next"
    And Проверить, что пользователь на странице грида заявлений Некст

  @1888/5
  Scenario: Next.Авторизация с Дамаск. Аудитор. Все роли и все филиалы,филиал Родительский, без подключения пульта ЭО
    Given Перейти на урл
    And Ввести СНИЛС "88900000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать филиал МФЦ при авторизации: "МФЦ Автоматизация Родительский ЭО Дамаск"
    And Выбрать роль при авторизации: "Аудитор"
    And Выбрать окно Дамаск при авторизации: "Без подключения пульта"
    And Нажать Продолжить при авторизации
    And Проверить, что элемент Пульт ЭО Некст не отображается на странице
    And Открыть меню пользователя Некст
    And Проверить роль в меню пользователя Некст: "Аудитор"
    And Проверить МФЦ в меню пользователя Некст: "МФЦ Автоматизация Родительский ЭО Дамаск"
    And Проверить ФИО в хедере Некст: "Автоматизация Все роли Все филиалы Интерфейс Next"
    And Проверить, что пользователь на странице грида заявлений Некст

  @1888/6
  Scenario: Next.Авторизация с Дамаск. Аудитор. Все роли и все филиалы,филиал ТОСП, без подключения пульта ЭО
    Given Перейти на урл
    And Ввести СНИЛС "88900000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать филиал МФЦ при авторизации: "МФЦ Автоматизация ТОСП ЭО Дамаск"
    And Выбрать роль при авторизации: "Аудитор"
    And Выбрать окно Дамаск при авторизации: "Без подключения пульта"
    And Нажать Продолжить при авторизации
    And Проверить, что элемент Пульт ЭО Некст не отображается на странице
    And Открыть меню пользователя Некст
    And Проверить роль в меню пользователя Некст: "Аудитор"
    And Проверить МФЦ в меню пользователя Некст: "МФЦ Автоматизация ТОСП ЭО Дамаск"
    And Проверить ФИО в хедере Некст: "Автоматизация Все роли Все филиалы Интерфейс Next"
    And Проверить, что пользователь на странице грида заявлений Некст

  @1434/1
  Scenario: Next.Авторизация с Дамаск. Обработчик заявок. Все роли и все филиалы,филиал Основной
    Given Перейти на урл
    And Ввести СНИЛС "88900000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать филиал МФЦ при авторизации: "МФЦ Автоматизация Основной ЭО Дамаск"
    And Выбрать роль при авторизации: "Обработчик заявок"
    And Нажать Продолжить при авторизации
    And Проверить, что элемент Пульт ЭО Некст не отображается на странице
    And Открыть меню пользователя Некст
    And Проверить роль в меню пользователя Некст: "Обработчик заявок"
    And Проверить МФЦ в меню пользователя Некст: "МФЦ Автоматизация Основной ЭО Дамаск"
    And Проверить ФИО в хедере Некст: "Автоматизация Все роли Все филиалы Интерфейс Next"
    And Проверить, что пользователь на странице грида заявлений Некст

  @1434/2
  Scenario: Next.Авторизация с Дамаск. Обработчик заявок. Все роли и все филиалы,филиал Родительский
    Given Перейти на урл
    And Ввести СНИЛС "88900000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать филиал МФЦ при авторизации: "МФЦ Автоматизация Родительский ЭО Дамаск"
    And Выбрать роль при авторизации: "Обработчик заявок"
    And Нажать Продолжить при авторизации
    And Проверить, что элемент Пульт ЭО Некст не отображается на странице
    And Открыть меню пользователя Некст
    And Проверить роль в меню пользователя Некст: "Обработчик заявок"
    And Проверить МФЦ в меню пользователя Некст: "МФЦ Автоматизация Родительский ЭО Дамаск"
    And Проверить ФИО в хедере Некст: "Автоматизация Все роли Все филиалы Интерфейс Next"
    And Проверить, что пользователь на странице грида заявлений Некст

  @1434/3
  Scenario: Next.Авторизация с Дамаск. Обработчик заявок. Все роли и все филиалы,филиал ТОСП
    Given Перейти на урл
    And Ввести СНИЛС "88900000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать филиал МФЦ при авторизации: "МФЦ Автоматизация ТОСП ЭО Дамаск"
    And Выбрать роль при авторизации: "Обработчик заявок"
    And Нажать Продолжить при авторизации
    And Проверить, что элемент Пульт ЭО Некст не отображается на странице
    And Открыть меню пользователя Некст
    And Проверить роль в меню пользователя Некст: "Обработчик заявок"
    And Проверить МФЦ в меню пользователя Некст: "МФЦ Автоматизация ТОСП ЭО Дамаск"
    And Проверить ФИО в хедере Некст: "Автоматизация Все роли Все филиалы Интерфейс Next"
    And Проверить, что пользователь на странице грида заявлений Некст

  @1627/1
  Scenario: Next.Авторизация с Дамаск. Обработчик заявок. Одна роль и один филиал Основной
    Given Перейти на урл
    And Ввести СНИЛС "85600000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Проверить, что элемент Пульт ЭО Некст не отображается на странице
    And Открыть меню пользователя Некст
    And Проверить роль в меню пользователя Некст: "Обработчик заявок"
    And Проверить МФЦ в меню пользователя Некст: "МФЦ Автоматизация Основной ЭО Дамаск"
    And Проверить ФИО в хедере Некст: "Автоматизация Одна роль Обработчик ЭО Дамаск Next Один филиал Основной"
    And Проверить, что пользователь на странице грида заявлений Некст

  @1627/2
  Scenario: Next.Авторизация с Дамаск. Обработчик заявок. Одна роль и один филиал Родительский
    Given Перейти на урл
    And Ввести СНИЛС "85700000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Проверить, что элемент Пульт ЭО Некст не отображается на странице
    And Открыть меню пользователя Некст
    And Проверить роль в меню пользователя Некст: "Обработчик заявок"
    And Проверить МФЦ в меню пользователя Некст: "МФЦ Автоматизация Родительский ЭО Дамаск"
    And Проверить ФИО в хедере Некст: "Автоматизация Одна роль Обработчик ЭО Дамаск Next Один филиал Родительский"
    And Проверить, что пользователь на странице грида заявлений Некст

  @1627/3
  Scenario: Next.Авторизация с Дамаск. Обработчик заявок. Одна роль и один филиал ТОСП
    Given Перейти на урл
    And Ввести СНИЛС "85800000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Проверить, что элемент Пульт ЭО Некст не отображается на странице
    And Открыть меню пользователя Некст
    And Проверить роль в меню пользователя Некст: "Обработчик заявок"
    And Проверить МФЦ в меню пользователя Некст: "МФЦ Автоматизация ТОСП ЭО Дамаск"
    And Проверить ФИО в хедере Некст: "Автоматизация Одна роль Обработчик ЭО Дамаск Next Один филиал ТОСП"
    And Проверить, что пользователь на странице грида заявлений Некст