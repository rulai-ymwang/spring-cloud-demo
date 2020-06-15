#!/usr/bin/env bash

CURRENT_PATH=`pwd`
SCRIPT_PATH="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null && pwd )"
echo "script path: ${SCRIPT_PATH}"

#cd $SCRIPT_PATH
#mvn clean install

cd $SCRIPT_PATH/infrastructure-zuul
docker build -t scd-zuul .

cd $SCRIPT_PATH/infrastructure-eureka
docker build -t scd-eureka .

cd $SCRIPT_PATH/foo-service/foo-service-standalone
docker build -t scd-foo-service .

cd $SCRIPT_PATH/bar-service/bar-service-standalone
docker build -t scd-bar-service .

