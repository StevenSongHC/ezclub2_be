FROM ubuntu:16.04

MAINTAINER steven

RUN apt-get update
RUN apt-get install -y vim openssh-server openssh-client wget net-tools iputils-ping
RUN ssh-keygen -t rsa -f ~/.ssh/id_rsa -P '' \
    && cat ~/.ssh/id_rsa.pub >> ~/.ssh/authorized_keys \
    && apt-get purge -y --auto-remove $buildDeps \
    && mkdir /var/run/sshd \
    && echo "root:123456" | chpasswd \
    && sed -i 's/PermitRootLogin prohibit-password/PermitRootLogin yes/' /etc/ssh/sshd_config \
    && sed 's@session\s*required\s*pam_loginuid.so@session optional pam_loginuid.so@g' -i /etc/pam.d/sshd

EXPOSE 22

CMD ["/usr/sbin/sshd", "-D"]
