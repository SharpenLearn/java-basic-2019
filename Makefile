.PHONY: provision
provision:
	docker-compose build

.PHONY: clean
clean:
	docker-compose run --rm mvn clean

.PHONY: compile
compile:
	docker-compose run --rm mvn compile

.PHONY: test
test:
	docker-compose run --rm mvn test || true

.PHONY: doc
doc:
	docker-compose run --rm gitbook build

.PHONY: pdf
pdf:
	docker-compose run --rm gitbook pdf

.PHONY: up
up:
	docker-compose up -d gitbook

.PHONY: down
down:
	docker-compose down
