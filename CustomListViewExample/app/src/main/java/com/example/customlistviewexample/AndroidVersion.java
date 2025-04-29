package com.example.customlistviewexample;

public class AndroidVersion {
    private String name;
    private String version;
    private int iconId;

    public AndroidVersion(String name, String version, int iconId) {
        this.name = name;
        this.version = version;
        this.iconId = iconId;
    }

    public String getName() { return name; }
    public String getVersion() { return version; }
    public int getIconId() { return iconId; }
}
