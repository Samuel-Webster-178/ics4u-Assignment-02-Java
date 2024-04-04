{ pkgs }: {
    deps = [
      pkgs.wget
      pkgs.tree
        pkgs.graalvm17-ce
        pkgs.maven
        pkgs.replitPackages.jdt-language-server
        pkgs.replitPackages.java-debug
    ];
}