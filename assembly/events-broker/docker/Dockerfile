#FROM enmasseproject/activemq-artemis:2.2.0-1
FROM danielzhulin/apache-artemis:2.18.0-SNAPSHOT

COPY maven /

USER root

#RUN chown -R artemis:root /opt/activemq-artemis && \
#    chmod -R g=u /opt/activemq-artemis
RUN chown -R artemis:artemis /var/lib/artemis-instance

#chown -R artemis:artemis /var/lib/artemis-instance
#RUN chmod -R a+rw /var/lib/artemis-instance

USER artemis

#VOLUME [ "/var/lib/artemis-instance/data" ]

WORKDIR /var/lib/artemis-instance
VOLUME ["/var/lib/artemis-instance"]
#VOLUME [ "/var/lib/artemis-instance/data" ]
ENTRYPOINT ["/run-artemis"]
#CMD ["run"]

