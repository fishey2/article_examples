testAll:
	../gradlew clean test


runLocal:
	../gradlew clean build -x test
	docker-compose build
	docker-compose up &
