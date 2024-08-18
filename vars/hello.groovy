def call(String name = 'human') {
  echo "Hello, ${name}. AAAAAAA"
  docker.build(name)
}

def build(String name) {
  echo "Creating image in stage ${name}"
}