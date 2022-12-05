@loginNext
Feature: Авторизация Next

  @C19000/1
  Scenario: Авторизация под оператором с одной ролью и одним основным филиалом Next
    Given Перейти на урл
    And Ввести СНИЛС "00000000777" и пароль "devMFC123" и нажать кнопку Войти
    And Открыть меню пользователя Некст
    And Проверить роль в меню пользователя Некст: "Оператор"
    And Проверить МФЦ в меню пользователя Некст: "МФЦ Автоматизация Основной"
    And Проверить ФИО в хедере Некст: "Автоматизация Оператор Один филиал"
    And Проверить, что пользователь на странице грида заявлений Некст
    And Выйти из профиля Некст
    And Закрытие окно браузера

  @C19000/2
  Scenario: Авторизация под оператором с одной ролью и одним родительским филиалом Next
    Given Перейти на урл
    And Ввести СНИЛС "00000000677" и пароль "devMFC123" и нажать кнопку Войти
    And Открыть меню пользователя Некст
    And Проверить роль в меню пользователя Некст: "Оператор"
    And Проверить МФЦ в меню пользователя Некст: "МФЦ Автоматизация Родительский"
    And Проверить ФИО в хедере Некст: "Автоматизация Оператор Родительский филиал"
    And Проверить, что пользователь на странице грида заявлений Некст
    And Выйти из профиля Некст
    And Закрытие окно браузера


  @C19000/3
  Scenario: Авторизация под оператором с одной ролью и одним филиалом Тосп Next
    Given Перейти на урл
    And Ввести СНИЛС "00000000675" и пароль "devMFC123" и нажать кнопку Войти
    And Открыть меню пользователя Некст
    And Проверить роль в меню пользователя Некст: "Оператор"
    And Проверить МФЦ в меню пользователя Некст: "МФЦ Автоматизация ТОСП"
    And Проверить ФИО в хедере Некст: "Автоматизация Оператор Тосп"
    And Проверить, что пользователь на странице грида заявлений Некст
    And Выйти из профиля Некст
    And Закрытие окно браузера


  @C19000/4
  Scenario: Авторизация под аудитором с одной ролью и одним основным филиалом  Next
    Given Перейти на урл
    And Ввести СНИЛС "00000000779" и пароль "devMFC123" и нажать кнопку Войти
    And Открыть меню пользователя Некст
    And Проверить роль в меню пользователя Некст: "Аудитор"
    And Проверить МФЦ в меню пользователя Некст: "МФЦ Автоматизация Основной"
    And Проверить ФИО в хедере Некст: "Автоматизация Аудитор Один филиал"
    And Проверить, что пользователь на странице грида заявлений Некст
    And Выйти из профиля Некст
    And Закрытие окно браузера

  @C19000/5
  Scenario: Авторизация под аудитором с одной ролью и одним родительским филиалом Next
    Given Перейти на урл
    And Ввести СНИЛС "00000000663" и пароль "devMFC123" и нажать кнопку Войти
    And Открыть меню пользователя Некст
    And Проверить роль в меню пользователя Некст: "Аудитор"
    And Проверить МФЦ в меню пользователя Некст: "МФЦ Автоматизация Родительский"
    And Проверить ФИО в хедере Некст: "Автоматизация Аудитор Родительский филиал"
    And Проверить, что пользователь на странице грида заявлений Некст
    And Выйти из профиля Некст
    And Закрытие окно браузера


  @C19000/6
  Scenario: Авторизация под аудитором с одной ролью и одним филиалом Тосп Next
    Given Перейти на урл
    And Ввести СНИЛС "00000000662" и пароль "devMFC123" и нажать кнопку Войти
    And Открыть меню пользователя Некст
    And Проверить роль в меню пользователя Некст: "Аудитор"
    And Проверить МФЦ в меню пользователя Некст: "МФЦ Автоматизация ТОСП"
    And Проверить ФИО в хедере Некст: "Автоматизация Аудитор филиал ТОСП"
    And Проверить, что пользователь на странице грида заявлений Некст
    And Выйти из профиля Некст
    And Закрытие окно браузера

  @C19000/7
  Scenario: Авторизация под обработчиком с одной ролью и одним основным филиалом  Next
    Given Перейти на урл
    And Ввести СНИЛС "00000000661" и пароль "devMFC123" и нажать кнопку Войти
    And Открыть меню пользователя Некст
    And Проверить роль в меню пользователя Некст: "Обработчик"
    And Проверить МФЦ в меню пользователя Некст: "МФЦ Автоматизация Основной"
    And Проверить ФИО в хедере Некст: "Автоматизация Обработчик Один филиал"
    And Проверить, что пользователь на странице грида заявлений Некст
    And Выйти из профиля Некст
    And Закрытие окно браузера

  @C19000/8
  Scenario: Авторизация под обработчиком с одной ролью и одним родительским филиалом Next
    Given Перейти на урл
    And Ввести СНИЛС "00000000660" и пароль "devMFC123" и нажать кнопку Войти
    And Открыть меню пользователя Некст
    And Проверить роль в меню пользователя Некст: "Обработчик"
    And Проверить МФЦ в меню пользователя Некст: "МФЦ Автоматизация Родительский"
    And Проверить ФИО в хедере Некст: "Автоматизация Обработчик Родительский филиал"
    And Проверить, что пользователь на странице грида заявлений Некст
    And Выйти из профиля Некст
    And Закрытие окно браузера

  @C19000/9
  Scenario: Авторизация под обработчиком с одной ролью и одним филиалом Тосп Next
    Given Перейти на урл
    And Ввести СНИЛС "00000000664" и пароль "devMFC123" и нажать кнопку Войти
    And Открыть меню пользователя Некст
    And Проверить роль в меню пользователя Некст: "Обработчик"
    And Проверить МФЦ в меню пользователя Некст: "МФЦ Автоматизация ТОСП"
    And Проверить ФИО в хедере Некст: "Автоматизация Обработчик филиал ТОСП"
    And Проверить, что пользователь на странице грида заявлений Некст
    And Выйти из профиля Некст
    And Закрытие окно браузера

    @C13230\1
  Scenario: Авторизация. Все роли Оператор Все филиалы Основной Некст
    Given Перейти на урл
    And Ввести СНИЛС "88900000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать филиал МФЦ при авторизации: "МФЦ Автоматизация Основной"
    And Выбрать роль при авторизации: "Оператор"
    And Нажать Продолжить при авторизации
    And Проверить, что пользователь на странице грида заявлений Некст
    And Проверить ФИО в хедере Некст: " Автоматизация Все роли Все филиалы Интерфейс Next "
    And Открыть меню пользователя Некст
    And Проверить роль в меню пользователя Некст: "Оператор"
    And Проверить МФЦ в меню пользователя Некст: "МФЦ Автоматизация Основной"
    And Выйти из профиля Некст
    And Закрытие окно браузера

  @C13230\2
  Scenario: Авторизация. Все роли Оператор Все филиалы Родительский Некст
    Given Перейти на урл
    And Ввести СНИЛС "88900000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать филиал МФЦ при авторизации: "МФЦ Автоматизация Родительский"
    And Выбрать роль при авторизации: "Оператор"
    And Нажать Продолжить при авторизации
    And Проверить, что пользователь на странице грида заявлений Некст
    And Проверить ФИО в хедере Некст: " Автоматизация Все роли Все филиалы Интерфейс Next "
    And Открыть меню пользователя Некст
    And Проверить роль в меню пользователя Некст: "Оператор"
    And Проверить МФЦ в меню пользователя Некст: "МФЦ Автоматизация Родительский"
    And Выйти из профиля Некст
    And Закрытие окно браузера

  @C13230\3
  Scenario: Авторизация. Все роли Оператор Все филиалы ТОСП Некст
    Given Перейти на урл
    And Ввести СНИЛС "88900000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать филиал МФЦ при авторизации: "МФЦ Автоматизация ТОСП"
    And Выбрать роль при авторизации: "Оператор"
    And Нажать Продолжить при авторизации
    And Проверить, что пользователь на странице грида заявлений Некст
    And Проверить ФИО в хедере Некст: " Автоматизация Все роли Все филиалы Интерфейс Next "
    And Открыть меню пользователя Некст
    And Проверить роль в меню пользователя Некст: "Оператор"
    And Проверить МФЦ в меню пользователя Некст: "МФЦ Автоматизация ТОСП"
    And Выйти из профиля Некст
    And Закрытие окно браузера

  @C13230\4
  Scenario: Авторизация. Все роли Обработчик заявок Все филиалы Основной Некст
    Given Перейти на урл
    And Ввести СНИЛС "88900000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать филиал МФЦ при авторизации: "МФЦ Автоматизация Основной"
    And Выбрать роль при авторизации: "Обработчик заявок"
    And Нажать Продолжить при авторизации
    And Проверить, что пользователь на странице грида заявлений Некст
    And Проверить ФИО в хедере Некст: " Автоматизация Все роли Все филиалы Интерфейс Next "
    And Открыть меню пользователя Некст
    And Проверить роль в меню пользователя Некст: "Обработчик заявок"
    And Проверить МФЦ в меню пользователя Некст: "МФЦ Автоматизация Основной"
    And Выйти из профиля Некст
    And Закрытие окно браузера

  @@C13230\5
  Scenario: Авторизация. Все роли Обработчик заявок Все филиалы Родительский Некст
    Given Перейти на урл
    And Ввести СНИЛС "88900000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать филиал МФЦ при авторизации: "МФЦ Автоматизация Родительский"
    And Выбрать роль при авторизации: "Обработчик заявок"
    And Нажать Продолжить при авторизации
    And Проверить, что пользователь на странице грида заявлений Некст
    And Проверить ФИО в хедере Некст: " Автоматизация Все роли Все филиалы Интерфейс Next "
    And Открыть меню пользователя Некст
    And Проверить роль в меню пользователя Некст: "Обработчик заявок"
    And Проверить МФЦ в меню пользователя Некст: "МФЦ Автоматизация Родительский"
    And Выйти из профиля Некст
    And Закрытие окно браузера

  @C13230\6
  Scenario: Авторизация. Все роли Обработчик заявок Все филиалы ТОСП Некст
    Given Перейти на урл
    And Ввести СНИЛС "88900000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать филиал МФЦ при авторизации: "МФЦ Автоматизация ТОСП"
    And Выбрать роль при авторизации: "Обработчик заявок"
    And Нажать Продолжить при авторизации
    And Проверить, что пользователь на странице грида заявлений Некст
    And Проверить ФИО в хедере Некст: " Автоматизация Все роли Все филиалы Интерфейс Next "
    And Открыть меню пользователя Некст
    And Проверить роль в меню пользователя Некст: "Обработчик заявок"
    And Проверить МФЦ в меню пользователя Некст: "МФЦ Автоматизация ТОСП"
    And Выйти из профиля Некст
    And Закрытие окно браузера

  @C13230\7
  Scenario: Авторизация. Все роли Аудитор Все филиалы Основной Некст
    Given Перейти на урл
    And Ввести СНИЛС "88900000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать филиал МФЦ при авторизации: "МФЦ Автоматизация Основной"
    And Выбрать роль при авторизации: "Аудитор"
    And Нажать Продолжить при авторизации
    And Проверить, что пользователь на странице грида заявлений Некст
    And Проверить ФИО в хедере Некст: " Автоматизация Все роли Все филиалы Интерфейс Next "
    And Открыть меню пользователя Некст
    And Проверить роль в меню пользователя Некст: "Аудитор"
    And Проверить МФЦ в меню пользователя Некст: "МФЦ Автоматизация Основной"
    And Выйти из профиля Некст
    And Закрытие окно браузера

  @C13230\8
  Scenario: Авторизация. Все роли Аудитор Все филиалы Родительский Некст
    Given Перейти на урл
    And Ввести СНИЛС "88900000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать филиал МФЦ при авторизации: "МФЦ Автоматизация Родительский"
    And Выбрать роль при авторизации: "Аудитор"
    And Нажать Продолжить при авторизации
    And Проверить, что пользователь на странице грида заявлений Некст
    And Проверить ФИО в хедере Некст: " Автоматизация Все роли Все филиалы Интерфейс Next "
    And Открыть меню пользователя Некст
    And Проверить роль в меню пользователя Некст: "Аудитор"
    And Проверить МФЦ в меню пользователя Некст: "МФЦ Автоматизация Родительский"
    And Выйти из профиля Некст
    And Закрытие окно браузера

  @C13230\9
  Scenario: Авторизация. Все роли Аудитор Все филиалы ТОСП Некст
    Given Перейти на урл
    And Ввести СНИЛС "88900000000" и пароль "QWEqwe123" и нажать кнопку Войти
    And Выбрать филиал МФЦ при авторизации: "МФЦ Автоматизация ТОСП"
    And Выбрать роль при авторизации: "Аудитор"
    And Нажать Продолжить при авторизации
    And Проверить, что пользователь на странице грида заявлений Некст
    And Проверить ФИО в хедере Некст: " Автоматизация Все роли Все филиалы Интерфейс Next "
    And Открыть меню пользователя Некст
    And Проверить роль в меню пользователя Некст: "Аудитор"
    And Проверить МФЦ в меню пользователя Некст: "МФЦ Автоматизация ТОСП"
    And Выйти из профиля Некст
    And Закрытие окно браузера

  @C17494
  Scenario: Авторизация. Нажатие на кнопку "Войти" без ввода данных
    Given Перейти на урл
    And Нажать кнопку Войти при авторизации
    And Проверить текст сообщения Неверный СНИЛС или пароль
    And Закрытие окно браузера

  @C20993/1
  Scenario: Авторизация. Ввод не существующего СНИЛС
    Given Перейти на урл
    And Ввести СНИЛС "12121212454" и пароль "123" и нажать кнопку Войти
    And Проверить текст сообщения Неверный СНИЛС или пароль
    And Закрытие окно браузера

  @C20993/2
  Scenario: Авторизация. Войти без ввода СНИЛС
    Given Перейти на урл
    And Ввести пароль "123456Qa" и нажать кнопку Войти
    And Проверить текст сообщения Неверный СНИЛС или пароль
    And Закрытие окно браузера

  @C17498/1
  Scenario: Авторизация. Ввод не существующего пароля
    Given Перейти на урл
    And Ввести СНИЛС "00000000000" и пароль "000" и нажать кнопку Войти
    And Проверить текст сообщения Неверный СНИЛС или пароль
    And Закрытие окно браузера

  @C17498/2
  Scenario: Авторизация. Войти без ввода пароля
    Given Перейти на урл
    And Ввести СНИЛС "00000000000" и нажать кнопку Войти
    And Проверить текст сообщения Неверный СНИЛС или пароль
    And Закрытие окно браузера

  @MFCN896
  Scenario: Авторизация уволенного сотрудника
    Given Перейти на урл
    And Ввести СНИЛС "999-888-777 00" и пароль "123456Qa" и нажать кнопку Войти
    And Проверить текст сообщения Пользователь уволен. В авторизации отказано.
    And Закрытие окно браузера