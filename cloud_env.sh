printenv > .env

echo "MONGODB_URL = $MONGODB_URL"
echo "$MONGODB_URL" > mongo.txt

sed -i 's/%MONGODB_URL%/'$(cat mongo.txt)'/g' app.yaml
sed -i 's/%MONGODB_COLLECTION%/'"$MONGODB_COLLECTION"'/g' app.yaml

cat app.yaml
