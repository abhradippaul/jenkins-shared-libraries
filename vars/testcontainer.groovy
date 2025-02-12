def call(){
  sh "sudo curl localhost:3000 >> log.txt; sudo curl localhost:3000/api/users >> log.txt; sudo curl localhost:3000/api/status >> log.txt; sudo curl localhost:3000/api/products >> log.txt;"
  sh "docker stop container1"
}
