def call(String name = 'human') {
  echo "Hello, ${name}. AAAAAAA"
}

def buildStage(String name, String image) {
  echo "Creating image ${image} in stage ${name}"
  docker.build(image)
}