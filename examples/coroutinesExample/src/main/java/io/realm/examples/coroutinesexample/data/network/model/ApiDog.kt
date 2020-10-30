package io.realm.examples.coroutinesexample.data.network.model

data class ApiDog(
        val name: String,
        val age: Int,
        val owner: String,
        val somethingElse: Any      // Shown to illustrate uninteresting data from an API
)