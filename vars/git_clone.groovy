def call(String url, String branch){
  echo "Git Cloning started"
  git url: "${url}", branch: "${branch}"
  echo "Git Cloning completed"
}
