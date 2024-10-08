package com.niladri.lloydsdemo.utils

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater
import android.widget.TextView
import com.niladri.lloydsdemo.R
/**
 * This ProgressDialogue can be reused by passing context from anywhere across the application
 * */
class ProgressDialogue {
    companion object {
        fun progressDialog(
            context: Context,
            titleTxt: String? = null,
            msgTxt: String? = null
        ): Dialog {
            val dialog = Dialog(context)
            val inflate = LayoutInflater.from(context).inflate(R.layout.progress_dialog, null)
            dialog.setContentView(inflate)
            dialog.setCancelable(false)
            val title = inflate.findViewById<TextView>(R.id.title)
            val msg = inflate.findViewById<TextView>(R.id.msg)
            title.text = titleTxt
            msg.text = msgTxt
            dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            return dialog
        }
    }
}