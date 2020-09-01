package com.example

suspend fun sequentialRequests() {
    val client = HttpClient()

    // Get the content of an URL.
    val firstBytes = client.get<ByteArray>("https://127.0.0.1:8080/a")

    // Once the previous request is done, get the content of an URL.
    val secondBytes = client.get<ByteArray>("https://127.0.0.1:8080/b")

    client.close()
}