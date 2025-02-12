def call(){
  sh "curl localhost:3000 >> log.txt; curl localhost:3000/api/users >> log.txt; curl localhost:3000/api/status >> log.txt; curl localhost:3000/api/products >> log.txt;"
  sh "docker stop container1"
}
