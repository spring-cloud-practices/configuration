#!/usr/bin/env bash

## Server calls

echo "#################################################################"
echo "Call application: demo, profiles: default"
curl -XGET "http://127.0.0.1:8888/config-server/demo/default" | jq .

echo "#################################################################"
echo "Call application: demo, profiles: dev"
curl -XGET "http://127.0.0.1:8888/config-server/demo/dev" | jq .

echo "#################################################################"
echo "Call application: demo, profiles: default, dev"
curl -XGET "http://127.0.0.1:8888/config-server/demo/default,dev" | jq .

## Client calls
