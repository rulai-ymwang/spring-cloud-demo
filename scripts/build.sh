#!/usr/bin/env bash

CURRENT_PATH=`pwd`
SCRIPT_PATH="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null && pwd )"
echo "script path: ${SCRIPT_PATH}"

cd $SCRIPT_PATH/../scd-infrastructure/scd-zuul
docker build -t scd-zuul .

cd $SCRIPT_PATH/../scd-infrastructure/scd-eureka
docker build -t scd-eureka .

cd $SCRIPT_PATH/../scd-subsys-foobar/scd-foo-service
docker build -t scd-foo-service .

cd $SCRIPT_PATH/../scd-subsys-foobar/scd-bar-service
docker build -t scd-bar-service .

