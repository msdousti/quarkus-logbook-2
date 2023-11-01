# Quarkus :heart: Logbook (Old versions)

This is a sample project to use Quarkus/Resteasy/Logbook together.

> Similar to [quarkus-logbook](https://github.com/msdousti/quarkus-logbook), but for older versions of Quarkus/Logbook

It was created as a reponse to [Logbook issue 1384](https://github.com/zalando/logbook/issues/1384), which claims:

> Quarkus Resteasy endpoint returning 500 to client after HEAD request because of Logbook NullPointerException

Note that the versions of Quarkus & Logbook in the ticket above is **exactly the same** as in this repository.

## How to test

1. **Terminal 1:** Run the project
```
./mvnw compile quarkus:dev
```

2. **Terminal 2:** Send a HEAD request, and note `200 OK`.

```bash
curl -vI http://localhost:8080/handler/test
*   Trying 127.0.0.1:8080...
* Connected to localhost (127.0.0.1) port 8080 (#0)
> HEAD /handler/test HTTP/1.1
> Host: localhost:8080
> User-Agent: curl/8.1.2
> Accept: */*
>
< HTTP/1.1 200 OK
HTTP/1.1 200 OK
< Content-Type: application/json
Content-Type: application/json

<
* Connection #0 to host localhost left intact
```

3. **Terminal 1:** Notince that Logbook has added the following logs:

```
2023-11-01 09:49:02,531 TRACE [org.zal.log.Logbook] (executor-thread-0) Incoming Request: 8633f81edbb45924
Remote: localhost:8080
HEAD http://localhost:8080/handler/test HTTP/1.1
Accept: */*
Host: localhost:8080
User-Agent: curl/8.1.2
```
