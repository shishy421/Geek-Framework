#!/bin/sh
git pull deploy deploy
mvn package -Dmaven.test.skip=true
