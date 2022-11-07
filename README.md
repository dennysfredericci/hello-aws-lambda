# Hello Lambda

This project contains a Spring Cloud Function ready to be deployed on AWS Lambda.

### Build

```
./gradlew clean build 
```

### Deploy

```
sam deploy --profile fredericci --template-file ./cloudformation/lambda.yaml --resolve-s3 --stack-name hello-lambda  --capabilities CAPABILITY_IAM
```

### Cleanup

```
sam delete --profile fredericci --stack-name hello-lambda
```