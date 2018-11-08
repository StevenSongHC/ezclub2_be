FROM steven/ubuntu-ssh

MAINTAINER steven

RUN echo "deb http://apt.postgresql.org/pub/repos/apt/ xenial-pgdg main" > /etc/apt/sources.list.d/pgdg.list
RUN wget --quiet -O - https://www.postgresql.org/media/keys/ACCC4CF8.asc | \
    apt-key add -

RUN apt-get update
RUN apt-get install -y -q postgresql-9.6 postgresql-client-9.6 postgresql-contrib-9.6

USER postgres
RUN /etc/init.d/postgresql start &&\
    psql --command "CREATE USER ezclub WITH SUPERUSER PASSWORD 'ezclub123456';" &&\
    createdb -O ezclub ezclub

USER root
RUN echo "local all all md5" >> /etc/postgresql/9.6/main/pg_hba.conf
RUN echo "host all all 0.0.0.0/0 md5" >> /etc/postgresql/9.6/main/pg_hba.conf
RUN echo "listen_addresses='*'" >> /etc/postgresql/9.6/main/postgresql.conf

EXPOSE 5432

VOLUME ["/etc/postgresql", "/var/log/postgresql", "/var/lib/postgresql"]

CMD ["/usr/lib/postgresql/9.6/bin/postgres", "-D", "/var/lib/postgresql/9.6/main", "-c", "config_file=/etc/postgresql/9.6/main/postgresql.conf"]
