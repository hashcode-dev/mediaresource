printenv > .env

echo "MONGODB_COLLECTION = $MONGODB_COLLECTION"

printf "\n" > app.yaml
echo -e "env_variables:\n  MONGODB_URL: $MONGODB_URL\n  MONGODB_COLLECTION: $MONGODB_COLLECTION" > app.yaml

cat app.yaml
