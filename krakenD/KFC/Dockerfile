FROM krakend:2.9.4 as builder
ARG ENV=dev

# Copy template and configuration files
COPY krakend-config.tmpl .
COPY partials ./partials
COPY endpoints ./endpoints
COPY settings ./settings

RUN FC_ENABLE=1 \
    FC_OUT=/tmp/krakend.json \
    krakend check -d -t -c krakend-config.tmpl

# The linting needs the final krakend.json file
RUN krakend check -c /tmp/krakend.json --lint

FROM krakend:2.9.4
COPY --from=builder --chown=krakend /tmp/krakend.json .

EXPOSE 8080
#CMD ["krakend", "run", "-c", "/etc/krakend/krakend.json"]
