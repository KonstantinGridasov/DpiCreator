package entity

 enum class Dimension(val index: Float, val path: String, val used: String) {
    DEFAULT(1f, "", " normal"),
    MDPI(1f, "mdpi", " Mobile 320x480 and nearer resolution"),
    HDPI(1.5f, "hdpi", " Mobile 480x800, 540x960 and nearer resolution"),
    XHDPI(2f, "xhdpi", " Mobile 720x1280 - Samsung S3, Micromax Canvas HD, etc"),
    XXHDPI(2f, "xxhdpi", " Mobile 1080x1920 - Samsung S4, HTC one, etc"),
    XXXHDPI(2f, "xxxhdpi", " Mobile 5.5\" 1440x2560"),

    SW600DP(2f, "sw600dp", " Tablet 600x1024"),
    SW720DP(3f, "sw720dp", " Tablet  10\" 800x1280"),
    LARGE_XHDPI(3f, "large-xhdpi", " Tablet 1200x1920 - Nexus 7\"(latest)"),
    XLARGE_XHDPI(4f, "xlarge-xhdpi", " Tablet 2560x1600 - Nexus 10")
}