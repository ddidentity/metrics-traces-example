
#!/bin/bash

# The command you want to execute
COMMAND1="curl http://localhost:8080/hello-metrics"
COMMAND2="curl http://localhost:8080/hello-traces"

# Infinite loop
while true; do
  # Execute the command 5 times
  for i in {1..5}; do
    $COMMAND1
    $COMMAND2
  done

  # Sleep for 30 seconds
  sleep 30
done

