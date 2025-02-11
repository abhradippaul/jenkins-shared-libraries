def call(){
  withCredentials([usernamePassword(credentialsId: 'DockerHub', usernameVariable: 'username', passwordVariable: 'password')]){
    sh "docker login -u ${username} -p ${password}"
    sh "docker tag backend-image ${username}/backend-image"
    sh "docker push ${username}/backend-image"
  }
}
