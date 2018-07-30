# template-test

브라우저에서 
* http://localhost:8080/template
* http://localhost:8080/h2-console

curl 명령어로 

```bash
$ curl -X GET http://localhost:8080/template -H "Content-Type: application/json; charset=utf-8"

$ curl -X GET http://localhost:8080/template/?condition=yujin -H "Content-Type: application/json; charset=utf-8"

$ curl -X POST http://localhost:8080/template -d '{"condition":"yujin", "attr1":"2", "attr2":"2"}' -H "Content-Type: application/json; charset=utf-8"

$ curl -X GET http://localhost:8080/template/8d2fa0eb-93c1-11e8-8a10-adb23dcb34da -H "Content-Type: application/json; charset=utf-8"

$ curl -X PUT http://localhost:8080/template/8d2fa0eb-93c1-11e8-8a10-adb23dcb34da -d '{"condition":"yujin", "attr1":"11", "attr2":"12"}' -H "Content-Type: application/json; charset=utf-8"

$ curl -X DELETE http://localhost:8080/template/8d2fa0eb-93c1-11e8-8a10-adb23dcb34da -H "Content-Type: application/json; charset=utf-8"
```