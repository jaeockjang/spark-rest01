# spring-spark-example
An example of setting up Spring-Boot with Spark.


#docker build -t jojang91/spark-api:0.0.1 .
## kubernetes deploy yaml 만들기

# kubectl create deployment spark-api --image=jojang91/spark-api:0.0.1 --dry-run=client -o=yaml > deployment.yaml
# echo --- >> deployment.yaml
# kubectl create service clusterip spark-api --tcp=8902:8902 --dry-run=client -o=yaml >> deployment.yaml

# kubectl port-forward svc/spark-api 8902:8902
