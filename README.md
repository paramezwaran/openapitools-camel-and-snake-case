# Read Me First
Project with simple example of handing both Camel and Snake case

#Build and run
`mvn clean install
mvn spring-boot:run`

#Example payload for Snake case
`curl --location --request POST 'http://localhost:8080/snakeCase/pet' \
--header 'Content-Type: application/json' \
--data-raw '{
"id": 101,
"pet_name":"my test pet name"
}'
`
#Example payload for Camel case

`curl --location --request POST 'http://localhost:8080/camelCase/pet' \
--header 'Content-Type: application/json' \
--data-raw '{
"id": 101,
"petName":"my test pet name"
}'`
