FROM quay.io/keycloak/keycloak:20.0.2

USER root

COPY entrypoint.sh /tmp/entrypoint.sh
RUN chmod +x /tmp/entrypoint.sh && mv /tmp/entrypoint.sh /opt/keycloak/bin/entrypoint.sh
USER keycloak
