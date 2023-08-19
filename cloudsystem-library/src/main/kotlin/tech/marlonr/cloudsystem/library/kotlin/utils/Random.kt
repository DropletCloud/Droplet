package tech.marlonr.cloudsystem.library.kotlin.utils

import java.util.concurrent.ThreadLocalRandom
import kotlin.streams.asSequence

// @author https://www.baeldung.com/kotlin/random-alphanumeric-string
val charPool : List<Char> = ('a'..'z') + ('A'..'Z') + ('0'..'9')

fun randomStringByJavaRandom() = ThreadLocalRandom.current()
    .ints(40.toLong(), 0, charPool.size)
    .asSequence()
    .map(charPool::get)
    .joinToString("")