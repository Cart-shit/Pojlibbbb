package pojlib.util.json;

public class ModsJson {
    public Version[] versions;

    public static class Version {
        public String name;
        public ModInfo[] coreMods;
        public ModInfo[] defaultMods;
    }
}
