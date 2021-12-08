package utils

import entity.Dimension
import java.io.BufferedWriter
import java.io.File

const val lastItem: Int = 1000

fun createFile() {
    for (Dimension in Dimension.values()) {
        val root = File("src/res")
        if (!root.exists())
            root.mkdir()
        var folder = "values"
        if (Dimension.path.isNotEmpty()) {
            folder += "-${Dimension.path}"
        }
        val directory = File("$root/$folder")
        if (!directory.exists())
            directory.mkdir()

        val file = File(directory, "dimens.xml")
        file
            .bufferedWriter()
            .use { out ->
                for (i in 0..lastItem) {
                    if (i == 0)
                        out.writeLn(
                            "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                                    " <!-- ${Dimension.index} ${Dimension.used} -->\n<resources>"
                        )
                    else {
                        out.writeLn("<dimen name=\"_${i}gkdp\">${i * Dimension.index}dp</dimen>")
                        out.writeLn("<dimen name=\"_minus${i}gkdp\">${-i * Dimension.index}dp</dimen>")
                    }
                    if (i == lastItem)
                        out.writeLn("\n </resources>")
                }
            }
    }
}


fun BufferedWriter.writeLn(line: String) {
    this.write(line)
    this.newLine()
}