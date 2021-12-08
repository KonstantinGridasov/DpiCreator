import com.google.gson.stream.JsonWriter
import entity.Element
import java.io.File
import java.io.FileWriter
import java.io.IOException


@Throws(IOException::class)
fun writerToFile(list: Array<Element>) {
    val file = File("webp.json")
    val writer = JsonWriter(FileWriter(file))
    writer.setIndent("  ")
    writeJsonArray(writer, list)
    writer.close()

}

@Throws(IOException::class)
private fun writeJsonArray(writer: JsonWriter, list: Array<Element>) {
    writer.beginArray()
    for (el in list) {
        for (i in 1..5)
            writeWear(writer, el, i)
    }
    writer.endArray()
}

@Throws(IOException::class)
private fun writeWear(writer: JsonWriter, el: Element, index: Int) {
    writer.beginObject()
    writer.name("goodstyle_category_id").value(el.id)
    writer.name("goodstyle_category").value(el.nameCategory)
    writer.name("sexcategory").value(el.gender)
    writer.name("layer_index").value(createLayerIndex(el.id))
    writer.name("length").value(createTypeLine(el.id))

    writer.name("picturesHandled")
    if (el.gender.equals("woman"))
        getSetWoman(writer, el, index)
    else
        getSetMan(writer, el, index)

    writer.endObject()

}

@Throws(IOException::class)
private fun getSetWoman(writer: JsonWriter, el: Element, mIndex: Int) {
    writer.beginObject()
    writer.name("size").value("s")
    writer.name("image").value("https://vipit.link/images/webp/woman/${el.nameEn}_${mIndex}.webp")
    writer.endObject()
}

@Throws(IOException::class)
private fun getSetMan(writer: JsonWriter, el: Element, mIndex: Int) {
    writer.beginObject()
    writer.name("size").value("s")
    writer.name("image").value("https://vipit.link/images/webp/man/${el.nameEn}_${mIndex}.webp")
    writer.endObject()
}


private fun createTypeLine(categoryId: Int): Int {
    return if (categoryId == 16) 3 else 2
}

private fun createLayerIndex(categoryId: Int): Int {
    var indexLayer = 0
    when (categoryId) {
        15, 19, 26, 33, 34, 51, 55, 67 -> indexLayer = 10
        22, 28, 53, 59, 64 -> indexLayer = 20
        18, 54, 56 -> indexLayer = 30
        31, 62, 66 -> indexLayer = 40
        16, 52 -> indexLayer = 50
    }
    return indexLayer
}