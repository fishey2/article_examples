# Swagger, Spring Boot with a Reverse-Proxy in Docker

Requirements:
* Java 11
* Docker (and docker-compose)
* Make

To run locally:
```
make runLocal
```

## Usage

Proves you can reach the service behind the reverse proxy.

```
http://localhost/api/valid/1234 - false
http://localhost/api/valid/abc123 - true
```
