package ui

import entity.Element
import utils.createFile
import writerToFile

fun main(args: Array<String>) {
//    createFile()
    writerToFile(Element.values())
}
