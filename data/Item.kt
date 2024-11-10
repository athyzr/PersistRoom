/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.inventory.data

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Mewakili entitiy database di aplikasi. class data utamanya digunakan untuk
 menyimpan data di kotlin. 
 */
@Entity(tableName = "items")/* anotasi pada class data. tableName untuk menetepkan items sebagai nama tabel SQLite*/
data class Item(/*Keyowrd data untuk konversi jadi class data*/
    @PrimaryKey(autoGenerate = true) /*primary key untuk identifikasi tiap catatan dalam tabel item secara unik*/
    /*Semua parameter konstruktor utama harus berupa val atau var untuk memstikan konsistensi, 
    serta class data tidak boleh berupa abstract, open atau sealed*/
    val id: Int = 0,
    val name: String,
    val price: Double,
    val quantity: Int
)
