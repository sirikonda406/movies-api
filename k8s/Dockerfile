FROM quay.io/keycloak/keycloak:26.2.0
LABEL maintainer="IRISPulse team"

# Enable health and metrics support
ENV KC_HEALTH_ENABLED=true
ENV KC_METRICS_ENABLED=true
ENV KC_DB=postgres

COPY /cache/cache-ispn.xml /opt/keycloak/conf/cache-ispn.xml
COPY /properties/quarkus.properties /opt/keycloak/conf/quarkus.properties

#COPY server.keystore /opt/keycloak/conf/

COPY themes /opt/keycloak/themes/
COPY modules /opt/keycloak/modules/
COPY version.txt version.txt

#COPY AzureRootCert.crt /opt/keycloak/.postgresql/root.crt

RUN /opt/keycloak/bin/kc.sh build

RUN /opt/keycloak/bin/kc.sh show-config