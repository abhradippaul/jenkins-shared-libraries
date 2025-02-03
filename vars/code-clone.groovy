def call(){
  echo "Clonning the code"
  git url: "https://github.com/abhradippaul/Jenkins.git", branch: "main"
  echo "Code clonning completed"
}
