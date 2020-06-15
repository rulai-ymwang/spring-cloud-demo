#!/usr/bin/env bash

CURRENT_PATH=`pwd`
SCRIPT_PATH="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null && pwd )"
echo "script path: ${SCRIPT_PATH}"

cd $SCRIPT_PATH
docker-compose up -d



