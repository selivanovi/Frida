package com.example.frida

import android.graphics.Color
import android.graphics.PorterDuff

class Filter(val color: Int, val mode: PorterDuff.Mode)


val filters = listOf<Filter>(
    Filter(Color.BLUE, PorterDuff.Mode.OVERLAY),
    Filter(Color.YELLOW, PorterDuff.Mode.OVERLAY),
    Filter(Color.GREEN, PorterDuff.Mode.OVERLAY)
)