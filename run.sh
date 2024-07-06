#!/bin/bash

function start_server {
    D:\projects\java\com.uniandes.miso.daytrader.monolith-mono2micro\daytrader-ee7\target\liberty\wlp\bin start daytrader7Sample
}

function test {
    echo "Hello world!"
}

# Main script
case "$1" in
    test)
        test
        ;;
    start_server)
        start_server
        ;;
    *)
        echo "Usage: ./run.sh {test|start_server}"
        exit 1
        ;;
esac