# metrics-traces-example
![screenshot](metric-traces-example.jpg)

## To start the application and other services 
`./start-applications.sh`


## To stop all services and application
`./stop-application.sh `

## To generate some data for metrics
`./api-calls.sh`

## To trace API 
`curl http://localhost:8080/hello-traces`

Alternately you can use postman or any other app to make a rest API call

## Metrics Details
Springboot3 actuator , along with prometheus backend and Grafana UI is used for metrics demo. Sprinboot service exposes "/actuator/prometheus" end point on port 8080 and prometheus pulls data from there and expose the data on prometheus port 9090. Grafana gets data from port 9090 of prometheus and exposes those on port 3000

## Traces details
I have used two spring boot service, one calls another. Used micrometer-bridge and zipkin reporter to send trace information to Grafana tempo which is listening on port 9411 and grafana is pulling data from port 3110 of Tempo. Grafana display is available on port 3000.

## How to see traces and metrics
Go to menu and then explore.
You can choose prometheus for Metrics and Tempo for Traces.

From traces get the trace ID and use traceQL.

