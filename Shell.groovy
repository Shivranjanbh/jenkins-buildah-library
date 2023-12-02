class Shell {
    private final Script script
    Shell(Script script) {
        this.script = script
    }
    def sh(def cmd, def quite = false){
        def o = script.sh(script: "${cmd}", returnStdout: true).trim()
        return o;
    }
}
