printenv > .env

echo "PROJECT_ID = $PROJECT_ID"
echo "MONGODB_DB_URL = $MONGODB_DB_URL"
echo "COLLECTION_NAME = $COLLECTION_NAME"

sed -i 's/%MONGODB_URL_VALUE%/'"$COLLECTION_NAME"'/g' app.yaml;
sed -i 's/%COLLECTION_NAME_VALUE%/'"$COLLECTION_NAME"'/g' app.yaml;

cat app.yaml
