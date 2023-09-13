package ir.syrent.velocityvanish.spigot.hook

class CMIHook : Dependency("CMI") {

    override fun features(): List<String> {
        return mutableListOf(
            "Prevent join and quit message for vanished players"
        )
    }

}
