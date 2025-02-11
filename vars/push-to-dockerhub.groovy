def call(){
  withCredentials([usernamePasssword(credentialsId: "DockerHub", usernameVariable: "username", passwordVariable: "password")]){
    sh "docker login -u ${username} -p ${password}"
    sh "docker tag backend-image abhradippaul/backend-image"
    sh "docker push abhradippaul/backend-image"
  }
}
