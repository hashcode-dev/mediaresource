printenv > .env

echo "MONGODB_URL = $MONGODB_URL"

sed -i 's/%MONGODB_URL%/'"$MONGODB_URL"'/g' app.yaml
sed -i 's/%MONGODB_COLLECTION%/'"$MONGODB_COLLECTION"'/g' app.yaml

cat app.yaml
