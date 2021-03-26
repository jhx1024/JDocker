# Docker image for springboot file run
# VERSION 0.0.1
# Author: eangulee
# 基础镜像使用java
FROM java:8
# 作者
MAINTAINER xz <xz@gmail.com>
VOLUME /tmp
ADD jDocker-1.0-SNAPSHOT.jar jDocker.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/jDocker.jar"]