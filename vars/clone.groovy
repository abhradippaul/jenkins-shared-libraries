def(){
  git url: "https://github.com/abhradippaul/Jenkins.git", branch: "main"
  sh "mkdir /test"
  sh "cd /test"
  git clone "https://github.com/abhradippaul/Jenkins.git"
}
