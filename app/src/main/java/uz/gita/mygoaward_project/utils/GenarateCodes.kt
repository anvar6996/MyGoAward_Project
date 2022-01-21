package uz.gita.mygoaward_project.utils

import android.graphics.Bitmap
import android.graphics.Color
import com.google.zxing.common.BitMatrix



private fun setBitmapPixels(bitMatrix: BitMatrix): IntArray {
    val pixels = IntArray(bitMatrix.width * bitMatrix.height)

    for (y in 0 until bitMatrix.height) {
        val offset = y * bitMatrix.width
        for (x in 0 until bitMatrix.width)
            pixels[offset + x] = if (bitMatrix.get(x, y)) Color.BLACK else Color.WHITE
    }
    return pixels
}

private fun encodeBitmap(pixels: IntArray, width: Int, height: Int): Bitmap {
    val bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888)
    bitmap.setPixels(pixels, 0, width, 0, 0, width, height)
    return bitmap
}