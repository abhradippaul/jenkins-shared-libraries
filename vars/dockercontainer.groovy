def call(){
  sh "docker run -d --rm --name container1 -p 3000:3000 backend-image"
}
