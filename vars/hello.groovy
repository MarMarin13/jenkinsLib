def call(String name = 'human') {
  echo "Hello, ${name}. AAAAAAA"
  docker.build(name)
}

def build_stage(String name, String image) {
  echo "Creating image ${image} in stage ${name}"
}