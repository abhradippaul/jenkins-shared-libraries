def call(String url, String branch){
  sh "mkdir /test"
  sh "cd /test"
  git clone ${url}
}
