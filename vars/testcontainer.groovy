def call(){
  // sh "url=localhost:3000"
  sh "url='localhost:3000'; curl ${url} >> log.txt; curl ${url}/api/users >> log.txt; curl ${url}/api/status >> log.txt; curl ${url}/api/products >> log.txt;"
  sh "docker stop container1"
}
