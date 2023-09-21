printenv > .env

echo "PROJECT_ID = $PROJECT_ID"
echo "MONGO_DB_URL = $MONGO_DB_URL"
echo "COLLECTION_NAME = $COLLECTION_NAME"

sed -i 's/%MONGO_DB_URL_VALUE%/'$MONGO_DB_URL'/g' app.yaml
sed -i 's/%COLLECTION_NAME_VALUE%/'$COLLECTION_NAME'/g' app.yaml

cat app.yaml
