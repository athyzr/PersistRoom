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

package com.example.inventory.ui.navigation

/**
Interface untuk menjelaskan tujuan navigasi untuk aplikasi */
interface NavigationDestination {
    /**
    untuk pendefinisian jalur */
    val route: String

    /**
    ID sumber daya string yang berisi judul yang akan ditampilkan di layar tersebut.     */
    val titleRes: Int
}
