def call(){
  sh "docker build -t backend-image -f Dockerfile"
}
