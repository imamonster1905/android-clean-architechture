package com.android.architechture

/**
 * Created by Hữu Nguyễn on 21/05/2020.
 * Email: huuntt1905@gmail.com.
 */
class Person (
    val name: String?,
    val age: Int
) {
    private constructor(builder: Builder) : this(builder.name, builder.age)

    class Builder {
        var name : String? = null
        private set
        var age : Int = 0
        private set

        fun name(name: String?) = apply { this.name = name }

        fun age(age: Int) = apply { this.age = age }

        fun build() = Person(this)
    }
}