## Init the account with the following command : 
```bash
 docker run --entrypoint htpasswd httpd:2 -Bbn feriel 123 > auth/htpasswd

```
## Start up the registry

```bash
docker run -d -p 5001:5000 --restart=always --name brezy-registry -v "$(pwd)"/auth:/auth -e "REGISTRY_AUTH=htpasswd" -e "REGISTRY_AUTH_HTPASSWD_REALM=Registry Realm" -e REGISTRY_AUTH_HTPASSWD_PATH=/auth/htpasswd registry:2
```
