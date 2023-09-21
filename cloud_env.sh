printenv > .env

echo "PROJECT_ID = $PROJECT_ID"

sed -i 's/%MONGO_DB_URL_DEV%/'$MONGO_DB_URL'/g' app.yaml
sed -i 's/%COLLECTION_NAME_DEV%/'$COLLECTION_NAME'/g' app.yaml

cat app.yaml
