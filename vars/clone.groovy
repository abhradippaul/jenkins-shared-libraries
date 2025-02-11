def call(){
  echo "Git Cloning started"
  git url: "https://github.com/abhradippaul/Jenkins.git", branch: "main"
  echo "Git Cloning completed"
}
