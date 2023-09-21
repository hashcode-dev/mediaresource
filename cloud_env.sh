printenv > .env

echo "PROJECT_ID = $PROJECT_ID"
echo "MONGODB_DB_URL = $MONGODB_DB_URL"
echo "COLLECTION_NAME = $COLLECTION_NAME"

sed -e 's/%MONGODB_URL_VALUE%/'"$MONGODB_DB_URL"'/g'; 's/%COLLECTION_NAME_VALUE%/'"$COLLECTION_NAME"'/g' app.yaml

cat app.yaml
