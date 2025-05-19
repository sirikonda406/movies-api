FROM krakend:2.9.4 as builder
ARG ENV=dev

COPY pulse-api-gateway-config.tmpl .
COPY config .

## Save temporary file to /tmp to avoid permission errors
RUN FC_ENABLE=1 FC_OUT=/tmp/pulse-api-gateway-config.json FC_PARTIALS="/etc/krakend/partials" FC_SETTINGS="/etc/krakend/settings/$ENV" FC_TEMPLATES="/etc/krakend/templates" krakend check -d -t -c pulse-api-gateway-config.tmpl

# The linting needs the final krakend.json file
RUN krakend check -c /tmp/pulse-api-gateway-config.json --lint

FROM krakend
COPY --from=builder --chown=krakend /tmp/pulse-api-gateway-config.json .

EXPOSE 8080
