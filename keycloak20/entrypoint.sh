#!/bin/bash
set -e

# Start Keycloak in the background
/opt/keycloak/bin/kc.sh "$@" &

# Wait for Keycloak to be ready
until curl -s http://57.129.44.18:8080/auth/realms/master; do
  sleep 5
done

# Configure Keycloak
/opt/keycloak/bin/kcadm.sh config credentials --server http://57.129.44.18:8080 --realm master --user $KEYCLOAK_ADMIN --password $KEYCLOAK_ADMIN_PASSWORD
/opt/keycloak/bin/kcadm.sh update realms/master -s sslRequired=NONE

# Wait indefinitely to keep the container running
wait

