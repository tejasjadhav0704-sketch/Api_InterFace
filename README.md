# 🌐 Retrofit API Example

A simple Android application demonstrating how to fetch data from a REST API using Retrofit and display it in a RecyclerView.

This project was made to understand APIs because hardcoding data gets boring after the third ArrayList.

---

## OUTPUT

<p align="center">
  <img src="Screenshots/Screenshot.jpeg" width="300">
</p>

---

## Features

* Retrofit Integration
* REST API Consumption
* JSON Parsing with Gson
* RecyclerView Implementation
* Custom Adapter
* Dynamic Data Loading
* Beginner Friendly

---

## Tech Stack

* Android Studio
* Kotlin
* Retrofit
* Gson Converter
* RecyclerView
* View Binding
* XML Layouts

---

## API Used

Base URL:

https://dummyjson.com/

Endpoint:

```text
/products
```

---

## Project Structure

* Retrofit Builder
* API Interface
* Data Classes
* RecyclerView
* Custom Adapter
* ViewHolder
* Main Activity

Simple.

No backend.
No database.
Just your app politely asking someone else's server for data.

---

## How It Works

* Retrofit is initialized with a Base URL
* API Interface defines endpoints
* Retrofit sends a GET request
* Server returns JSON data
* Gson converts JSON into Kotlin Objects
* RecyclerView Adapter receives the data
* ViewHolder binds the data to views
* RecyclerView displays everything

Basically:

API ➜ JSON ➜ Retrofit ➜ Object ➜ Adapter ➜ ViewHolder ➜ RecyclerView

Android's way of saying:

"Why store data locally when someone else can store it for you?"

---

## How to Run

Download Git in your system from your favourite browser

Clone the repository

```bash
git clone https://github.com/your-username/Retrofit-API-Example.git
```

Open the project in Android Studio

Sync Gradle

Run the application

If the API is working and your internet is working, everything should work.

If not, welcome to networking.

---

## What I Learned

* Retrofit Basics
* REST APIs
* GET Requests
* JSON Parsing
* RecyclerView Integration
* Working with Callbacks
* Debugging Problems Caused By One Wrong URL

---

## Future Improvements

* Search Products
* Product Details Screen
* Pagination
* Error Handling
* Pull To Refresh
* Firebase Integration
* MVVM Architecture

---

## Developer Notes

Built with:

* Kotlin ☕
* Retrofit 🌐
* Android Studio 🚀
* Stack Overflow 📚
* Internet Connection 📡
* Patience 🧘
* Console Logs 😭

Fetching data from an API is easy.

Finding out why it isn't fetching is where the real learning begins.

---

## 👨‍💻 Author

Tejas Jadhav

If the API returns 404, the bug is probably not in the RecyclerView.
