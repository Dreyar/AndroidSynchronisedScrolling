package com.example.nick.synchronisedscrolling

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.AttributeSet
import android.view.View

class CustomRecyclerView @JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet? = null,
        defStyleAttr: Int = 0
) : RecyclerView(context, attrs, defStyleAttr) {

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        try {
            super.onSizeChanged(w, h, oldw, oldh)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    override fun focusSearch(direction: Int): View? {
        return try {
            super.focusSearch(direction)
        } catch (e: Exception) {
            null
        }
    }

    override fun onScrollStateChanged(state: Int) {
        if (state == RecyclerView.SCROLL_STATE_DRAGGING) {
            val currentView = findFocus()
            currentView?.clearFocus()
        }
        super.onScrollStateChanged(state)
    }
}