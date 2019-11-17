package com.example.junittesting

import android.content.Context
import android.content.SharedPreferences
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito.mock
import org.mockito.runners.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class SharedPreferencesHandlerTest {


    @Mock
    lateinit var context: Context
    @InjectMocks
    lateinit var prefs: SharedPreferencesHandler
    @Test
    fun addResult() {

        checkNotNull(prefs)
    }

    @Test
    fun getResult() {
    }
}