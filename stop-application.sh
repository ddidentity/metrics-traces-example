#!/bin/bash

docker-compose down

pkill -f api-calls.sh
kill `cat ./metrics-traces/application.pid`
kill `cat ./dependent-service/application.pid`

