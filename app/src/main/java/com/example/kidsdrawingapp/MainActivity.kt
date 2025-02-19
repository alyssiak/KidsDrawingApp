package com.example.kidsdrawingapp

import android.graphics.Color
import android.view.View // Импортируем View
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.ViewAnimator
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var drawingView: DrawingView
    private lateinit var colorRed: View
    private lateinit var colorGreen: View
    private lateinit var colorBlue: View
    private lateinit var btnChooseTemplate: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drawingView = findViewById(R.id.drawingView)
        btnChooseTemplate = findViewById(R.id.btnChooseTemplate)
        colorRed = findViewById(R.id.colorRed)
        colorGreen = findViewById(R.id.colorGreen)
        colorBlue = findViewById(R.id.colorBlue)

        // Обработчик выбора шаблона
        btnChooseTemplate.setOnClickListener {
            val bitmap = BitmapFactory.decodeResource(resources, R.drawable.template_example)
            drawingView.setTemplate(bitmap)
        }

        // Обработчики для изменения цвета
        colorRed.setOnClickListener { drawingView.setColor(Color.RED) }
        colorGreen.setOnClickListener { drawingView.setColor(Color.GREEN) }
        colorBlue.setOnClickListener { drawingView.setColor(Color.BLUE) }
    }
}
