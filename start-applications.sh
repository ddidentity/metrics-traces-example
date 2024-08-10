#!/bin/bash

echo "Starting Springboot Application"
cd dependent-service 
./mvnw spring-boot:run &
sleep 30
cd -
cd metrics-traces
./mvnw spring-boot:run &
sleep 30
cd -

docker-compose up -d

