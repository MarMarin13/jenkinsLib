def call(String name = 'human') {
  echo "Hello, ${name}. AAAAAAA"
  docker.build(name)
}

def build(String image, String name) {
  echo "Creating image ${image} in stage ${name}"
}