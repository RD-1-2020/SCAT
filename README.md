# Автотесты Digit МФЦ Next

Автотесты построены вокруг продукта АИС МФЦ с целью тестирования продуктивной среды после автодеплоя и сокращения времени регресса

## Архитектура
Основной костяк это:
- Springboot для работы с общим контекстом в рамках сценария
- Cucmber7 написание сценариев
- Selenide библиотека для запуска автотестов и работы с Web элементами

Основной смысл связки Springboot + Cucumber - это использование CDI в шагах Cucumber, для переиспользования некоторых кусков кода и максимальное избегание какое-либо статики в тестах, возможность конфигурации через application.properties, и в целом использование всех возможностей Springboot в тестировании

## Интеграции
- TestIt для анализа результатов работы автотестов, документация по настройке 
<br> https://docs.testit.software/user-guide/autotests 
<br> https://github.com/testit-tms/adapters-java/tree/main/testit-adapter-cucumber7
<br> https://testit.software/blog/post/zapusk-avtotestov-iz-test-it-v-integracii-s-frejmvorkom-pytest-i-gitlab-ci
