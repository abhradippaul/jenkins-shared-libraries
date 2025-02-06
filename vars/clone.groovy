def(){
  git url: "https://github.com/abhradippaul/Jenkins.git", branch: "main"
  mkdir /test
  cd /test
  git clone "https://github.com/abhradippaul/Jenkins.git"
}
