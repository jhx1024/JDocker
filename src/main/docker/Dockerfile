# Docker image for springboot file run
# VERSION 0.0.1
# Author: eangulee
# 基础镜像使用java
FROM jenkinsDocker:8
# 作者
MAINTAINER xz <xz@gmail.com>
VOLUME /tmp
ADD demo01-0.0.1-SNAPSHOT.jar demo01.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/demo01.jar"]