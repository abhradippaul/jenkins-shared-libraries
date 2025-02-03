def call(){
  sh "echo Clonning the code"
  git url: "https://github.com/abhradippaul/Jenkins.git", branch: "main"
  sh "echo Code clonning completed"
  
}
