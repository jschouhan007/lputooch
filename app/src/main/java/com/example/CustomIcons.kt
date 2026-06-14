package com.example

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

object CustomIcons {
    val Attendance: ImageVector
        get() = ImageVector.Builder(
            name = "Attendance",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(10f, 12f)
                curveTo(12.21f, 12f, 14f, 10.21f, 14f, 8f)
                curveTo(14f, 5.79f, 12.21f, 4f, 10f, 4f)
                curveTo(7.79f, 4f, 6f, 5.79f, 6f, 8f)
                curveTo(6f, 10.21f, 7.79f, 12f, 10f, 12f)
                close()
                moveTo(10f, 13.5f)
                curveTo(6.67f, 13.5f, 0f, 15.17f, 0f, 18.5f)
                lineTo(0f, 20f)
                lineTo(13f, 20f)
                lineTo(13f, 18.5f)
                curveTo(13f, 16.96f, 14f, 15.12f, 16f, 14.1f)
                curveTo(14.63f, 13.72f, 12.5f, 13.5f, 10f, 13.5f)
                close()
            }
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(14f, 15f)
                lineTo(18f, 19f)
                lineTo(24f, 11f)
            }
        }.build()

    val QrScanner: ImageVector
        get() = ImageVector.Builder(
            name = "QrScanner",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = null,
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 8f)
                lineTo(4f, 4f)
                lineTo(8f, 4f)
                moveTo(16f, 4f)
                lineTo(20f, 4f)
                lineTo(20f, 8f)
                moveTo(4f, 16f)
                lineTo(4f, 20f)
                lineTo(8f, 20f)
                moveTo(16f, 20f)
                lineTo(20f, 20f)
                lineTo(20f, 16f)
            }
            path(
                fill = SolidColor(Color.Black)
            ) {
                moveTo(6f, 6f)
                lineTo(10f, 6f)
                lineTo(10f, 10f)
                lineTo(6f, 10f)
                close()
                moveTo(14f, 6f)
                lineTo(18f, 6f)
                lineTo(18f, 10f)
                lineTo(14f, 10f)
                close()
                moveTo(6f, 14f)
                lineTo(10f, 14f)
                lineTo(10f, 18f)
                lineTo(6f, 18f)
                close()
            }
            path(
                fill = SolidColor(Color.Black)
            ) {
                moveTo(14f, 14f)
                lineTo(16f, 14f)
                lineTo(16f, 16f)
                lineTo(14f, 16f)
                close()
                moveTo(16f, 16f)
                lineTo(18f, 16f)
                lineTo(18f, 18f)
                lineTo(16f, 18f)
                close()
            }
        }.build()

    val DeskPerson: ImageVector
        get() = ImageVector.Builder(
            name = "DeskPerson",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = null,
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 8f)
                curveTo(13.5f, 8f, 14.5f, 6.5f, 14.5f, 5f)
                curveTo(14.5f, 3.5f, 13.5f, 2f, 12f, 2f)
                curveTo(10.5f, 2f, 9.5f, 3.5f, 9.5f, 5f)
                curveTo(9.5f, 6.5f, 10.5f, 8f, 12f, 8f)
                close()
                moveTo(6.5f, 14f)
                curveTo(6.5f, 10.5f, 9f, 9f, 12f, 9f)
                curveTo(15f, 9f, 17.5f, 10.5f, 17.5f, 14f)
                moveTo(3f, 14f)
                lineTo(21f, 14f)
                lineTo(20f, 17f)
                lineTo(4f, 17f)
                close()
                moveTo(4.5f, 17f)
                lineTo(4.5f, 22f)
                moveTo(19.5f, 17f)
                lineTo(19.5f, 22f)
                moveTo(8f, 17f)
                lineTo(8f, 21f)
                lineTo(16f, 21f)
                lineTo(16f, 17f)
                moveTo(15f, 14f)
                lineTo(15f, 11f)
                lineTo(19f, 11f)
                lineTo(19f, 14f)
                moveTo(5f, 14f)
                lineTo(5f, 12f)
                lineTo(9f, 12f)
                lineTo(9f, 14f)
                moveTo(6f, 12f)
                lineTo(6f, 10f)
                lineTo(8f, 10f)
                lineTo(8f, 12f)
            }
        }.build()

    val Checklist: ImageVector
        get() = ImageVector.Builder(
            name = "Checklist",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = null,
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 4f)
                lineTo(18f, 4f)
                curveTo(19.1f, 4f, 20f, 4.9f, 20f, 6f)
                lineTo(20f, 20f)
                curveTo(20f, 21.1f, 19.1f, 22f, 18f, 22f)
                lineTo(6f, 22f)
                curveTo(4.9f, 22f, 4f, 21.1f, 4f, 20f)
                lineTo(4f, 6f)
                curveTo(4f, 4.9f, 4.9f, 4f, 6f, 4f)
                lineTo(8f, 4f)
            }
            path(
                fill = null,
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 2f)
                lineTo(14f, 2f)
                curveTo(14.5f, 2f, 15f, 2.5f, 15f, 3f)
                lineTo(15f, 5f)
                curveTo(15f, 5.5f, 14.5f, 6f, 14f, 6f)
                lineTo(10f, 6f)
                curveTo(9.5f, 6f, 9f, 5.5f, 9f, 5f)
                lineTo(9f, 3f)
                curveTo(9f, 2.5f, 9.5f, 2f, 10f, 2f)
                close()
            }
            path(
                fill = null,
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 9f)
                lineTo(11f, 9f)
                lineTo(11f, 11f)
                lineTo(7f, 11f)
                close()
                moveTo(7f, 13f)
                lineTo(11f, 13f)
                lineTo(11f, 15f)
                lineTo(7f, 15f)
                close()
                moveTo(7f, 17f)
                lineTo(11f, 17f)
                lineTo(11f, 19f)
                lineTo(7f, 19f)
                close()
            }
            path(
                fill = null,
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 14f)
                lineTo(14f, 16f)
                lineTo(18f, 10f)
            }
        }.build()

    val ChangePassword: ImageVector
        get() = ImageVector.Builder(
             name = "ChangePassword",
             defaultWidth = 24.dp,
             defaultHeight = 24.dp,
             viewportWidth = 24f,
             viewportHeight = 24f
        ).apply {
             path(
                 fill = null,
                 stroke = SolidColor(Color.Black),
                 strokeLineWidth = 2f,
                 strokeLineCap = StrokeCap.Round,
                 strokeLineJoin = StrokeJoin.Round
             ) {
                 moveTo(14f, 4f)
                 lineTo(5f, 4f)
                 lineTo(5f, 20f)
                 lineTo(14f, 20f)
                 moveTo(9f, 12f)
                 lineTo(23f, 12f)
                 moveTo(18f, 7f)
                 lineTo(23f, 12f)
                 lineTo(18f, 17f)
             }
        }.build()

    val Newspaper: ImageVector
        get() = ImageVector.Builder(
            name = "Newspaper",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = null,
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 4f)
                lineTo(16f, 4f)
                lineTo(20f, 8f)
                lineTo(20f, 20f)
                lineTo(4f, 20f)
                close()
                moveTo(15f, 4f)
                lineTo(15f, 9f)
                lineTo(20f, 9f)
                moveTo(7f, 13f)
                lineTo(17f, 13f)
                moveTo(7f, 16f)
                lineTo(13f, 16f)
                moveTo(7f, 6f)
                lineTo(11f, 6f)
                lineTo(11f, 9f)
                lineTo(7f, 9f)
                close()
            }
        }.build()

    val Stethoscope: ImageVector
        get() = ImageVector.Builder(
            name = "Stethoscope",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = null,
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                // Earpieces
                moveTo(7f, 3f)
                lineTo(7f, 2f)
                moveTo(15f, 3f)
                lineTo(15f, 2f)
                // Tubes
                moveTo(7f, 3f)
                lineTo(7f, 8f)
                curveTo(7f, 10.2f, 9.8f, 12f, 11f, 12f)
                moveTo(15f, 3f)
                lineTo(15f, 8f)
                curveTo(15f, 10.2f, 12.2f, 12f, 11f, 12f)
                // Main tube
                moveTo(11f, 12f)
                lineTo(11f, 17f)
                curveTo(11f, 20f, 14f, 22f, 16.5f, 22f)
                curveTo(19f, 22f, 21f, 20f, 21f, 17f)
                lineTo(21f, 16f)
            }
            path(
                fill = null,
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                // Chest piece
                moveTo(21f, 15f)
                curveTo(20f, 15f, 19f, 14f, 19f, 13f)
                curveTo(19f, 12f, 20f, 11f, 21f, 11f)
                curveTo(22f, 11f, 23f, 12f, 23f, 13f)
                curveTo(23f, 14f, 22f, 15f, 21f, 15f)
                close()
            }
        }.build()

    private val OutlineColor = Color(0xFF333333)
    private val AccentColor = Color(0xFFF28854)
    private val StrokeWidth = 1.8f

    val Megaphone: ImageVector
        get() = ImageVector.Builder(
            name = "Megaphone", defaultWidth = 24.dp, defaultHeight = 24.dp,
            viewportWidth = 24f, viewportHeight = 24f
        ).apply {
            // Outline
            path(
                fill = null, stroke = SolidColor(OutlineColor),
                strokeLineWidth = StrokeWidth, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 13f)
                lineTo(13f, 4f)
                lineTo(7f, 7f)
                curveTo(4f, 8f, 3f, 10f, 3f, 12f)
                lineTo(3f, 14f)
                curveTo(3f, 16f, 5f, 17f, 7f, 17f)
                lineTo(8f, 16f)
                lineTo(10f, 21f)
                curveTo(11f, 22f, 13f, 21f, 14f, 20f)
                lineTo(11f, 15f)
                lineTo(18f, 13f)
                close()
                // Side lines
                moveTo(6.5f, 15f)
                lineTo(6.5f, 15.01f)
                moveTo(9f, 6.5f)
                lineTo(9f, 6.51f)
            }
            // Orange accents
            path(
                fill = null, stroke = SolidColor(AccentColor),
                strokeLineWidth = StrokeWidth, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 3f)
                lineTo(18f, 1f)
                moveTo(19f, 6f)
                lineTo(22f, 4f)
                moveTo(20f, 9f)
                lineTo(22f, 9f)
                moveTo(21f, 1.5f)
                lineTo(21.05f, 1.5f) // dot
            }
        }.build()

    val EduRevolution: ImageVector
        get() = ImageVector.Builder(
            name = "EduRevolution", defaultWidth = 24.dp, defaultHeight = 24.dp,
            viewportWidth = 24f, viewportHeight = 24f
        ).apply {
            // Orange Grad Cap
            path(
                fill = null, stroke = SolidColor(AccentColor),
                strokeLineWidth = StrokeWidth, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 1f)
                lineTo(4f, 4.5f)
                lineTo(12f, 8f)
                lineTo(20f, 4.5f)
                close()
                moveTo(6f, 5.5f)
                lineTo(6f, 10f)
                curveTo(6f, 11f, 9f, 13f, 12f, 13f)
                curveTo(15f, 13f, 18f, 11f, 18f, 10f)
                lineTo(18f, 5.5f)
                moveTo(16f, 6f)
                lineTo(16f, 11f)
                // Tassel loop
                moveTo(16f, 15f)
                curveTo(16f, 16f, 15f, 16f, 15f, 15f)
                curveTo(15f, 14f, 16f, 14f, 16f, 15f)
                // Drop
                moveTo(16f, 16f)
                lineTo(16f, 17f)
            }
            // Outline Laptop
            path(
                fill = null, stroke = SolidColor(OutlineColor),
                strokeLineWidth = StrokeWidth, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 18f)
                lineTo(20f, 18f)
                curveTo(21f, 18f, 22f, 17f, 22f, 16f)
                lineTo(22f, 9f)
                moveTo(2f, 9f)
                lineTo(2f, 16f)
                curveTo(2f, 17f, 3f, 18f, 4f, 18f)
                
                moveTo(1f, 18f)
                lineTo(1f, 21f)
                curveTo(1f, 22f, 2f, 23f, 3f, 23f)
                lineTo(21f, 23f)
                curveTo(22f, 23f, 23f, 22f, 23f, 21f)
                lineTo(23f, 18f)
                // Bottom laptop indent
                moveTo(10f, 23f)
                curveTo(10f, 22.5f, 11f, 22f, 12f, 22f)
                curveTo(13f, 22f, 14f, 22.5f, 14f, 23f)
                
                moveTo(6f, 14f)
                lineTo(10f, 14f)
                moveTo(6f, 16f)
                lineTo(12f, 16f)
            }
        }.build()

    val FeeStatement: ImageVector
        get() = ImageVector.Builder(
            name = "FeeStatement", defaultWidth = 24.dp, defaultHeight = 24.dp,
            viewportWidth = 24f, viewportHeight = 24f
        ).apply {
            // Hand (Outline)
            path(
                fill = null, stroke = SolidColor(OutlineColor),
                strokeLineWidth = StrokeWidth, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 12f)
                curveTo(17f, 12f, 18f, 11f, 18f, 9f)
                curveTo(18f, 7f, 12f, 2f, 9f, 2f)
                curveTo(7f, 2f, 3f, 5f, 3f, 7f)
                curveTo(3f, 9f, 4f, 12f, 4f, 13f)
                curveTo(4f, 15f, 6f, 17f, 8f, 17f)
                curveTo(10f, 17f, 12f, 15f, 12f, 12f)
                
                moveTo(10f, 9f)
                curveTo(10f, 13f, 15f, 15f, 15f, 15f)
            }
            // Cash (Orange)
            path(
                fill = null, stroke = SolidColor(AccentColor),
                strokeLineWidth = StrokeWidth, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 14f)
                lineTo(22f, 14f)
                lineTo(22f, 22f)
                lineTo(8f, 22f)
                close()
                // Cash details
                moveTo(8f, 16f)
                curveTo(10f, 16f, 10f, 14f, 10f, 14f)
                moveTo(20f, 14f)
                curveTo(20f, 16f, 22f, 16f, 22f, 16f)
                moveTo(8f, 20f)
                curveTo(10f, 20f, 10f, 22f, 10f, 22f)
                moveTo(20f, 22f)
                curveTo(20f, 20f, 22f, 20f, 22f, 20f)
                // Center C mark
                moveTo(16f, 16f)
                curveTo(14f, 16f, 13f, 17f, 13f, 18f)
                curveTo(13f, 19f, 14f, 20f, 16f, 20f)
            }
        }.build()

    val ClipboardCheck: ImageVector
        get() = ImageVector.Builder(
            name = "ClipboardCheck", defaultWidth = 24.dp, defaultHeight = 24.dp,
            viewportWidth = 24f, viewportHeight = 24f
        ).apply {
            // Outline (Clipboard & Clip)
            path(
                fill = null, stroke = SolidColor(OutlineColor),
                strokeLineWidth = StrokeWidth, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 4f)
                lineTo(18f, 4f)
                curveTo(20f, 4f, 21f, 5f, 21f, 7f)
                lineTo(21f, 21f)
                curveTo(21f, 23f, 20f, 24f, 18f, 24f)
                lineTo(6f, 24f)
                curveTo(4f, 24f, 3f, 23f, 3f, 21f)
                lineTo(3f, 7f)
                curveTo(3f, 5f, 4f, 4f, 6f, 4f)
                lineTo(8f, 4f)
                
                moveTo(9f, 2f)
                lineTo(15f, 2f)
                curveTo(16f, 2f, 16f, 3f, 16f, 4f)
                lineTo(16f, 5f)
                curveTo(16f, 6f, 16f, 6f, 15f, 6f)
                lineTo(9f, 6f)
                curveTo(8f, 6f, 8f, 6f, 8f, 5f)
                lineTo(8f, 4f)
                curveTo(8f, 3f, 8f, 2f, 9f, 2f)
                close()
                moveTo(12f, 3.5f)
                lineTo(12.01f, 3.5f)
            }
            // Inner Document (Orange)
            path(
                fill = null, stroke = SolidColor(AccentColor),
                strokeLineWidth = StrokeWidth, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 7f)
                lineTo(18f, 7f)
                lineTo(18f, 21f)
                lineTo(6f, 21f)
                close()
                // Big check circle
                moveTo(12f, 11f)
                curveTo(14.5f, 11f, 16f, 12.5f, 16f, 14f)
                curveTo(16f, 15.5f, 14.5f, 17f, 12f, 17f)
                curveTo(9.5f, 17f, 8f, 15.5f, 8f, 14f)
                curveTo(8f, 12.5f, 9.5f, 11f, 12f, 11f)
                close()
                // check
                moveTo(10f, 14f)
                lineTo(11.5f, 15.5f)
                lineTo(14f, 12.5f)
                
                // small lines
                moveTo(9f, 19f)
                lineTo(15f, 19f)
            }
        }.build()

    val ChecklistPencil: ImageVector
        get() = ImageVector.Builder(
            name = "ChecklistPencil", defaultWidth = 24.dp, defaultHeight = 24.dp,
            viewportWidth = 24f, viewportHeight = 24f
        ).apply {
            // Document and Pencil (Outline)
            path(
                fill = null, stroke = SolidColor(OutlineColor),
                strokeLineWidth = StrokeWidth, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round
            ) {
                // Secondary doc background
                moveTo(18f, 6f)
                lineTo(20f, 6f)
                lineTo(20f, 22f)
                lineTo(8f, 22f)
                lineTo(8f, 20f)
                
                // Pencil
                moveTo(4f, 6f)
                lineTo(4f, 18f)
                lineTo(2f, 22f)
                lineTo(6f, 20f)
                lineTo(6f, 6f)
                lineTo(4f, 4f)
                close()
                moveTo(4f, 6f)
                lineTo(6f, 6f)
                moveTo(4f, 18f)
                lineTo(6f, 18f)
                
                // Main Document
                moveTo(7f, 2f)
                lineTo(18f, 2f)
                lineTo(18f, 20f)
                lineTo(7f, 20f)
                close()
            }
            // Checklist contents (Orange)
            path(
                fill = null, stroke = SolidColor(AccentColor),
                strokeLineWidth = StrokeWidth, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round
            ) {
                // First Row
                moveTo(11f, 5f)
                curveTo(12f, 5f, 12f, 6f, 12f, 6f)
                curveTo(12f, 6f, 12f, 7f, 11f, 7f)
                curveTo(10f, 7f, 10f, 6f, 10f, 6f)
                curveTo(10f, 6f, 10f, 5f, 11f, 5f)
                moveTo(10.5f, 6f)
                lineTo(11f, 6.5f)
                lineTo(11.5f, 5.5f)
                moveTo(14f, 5.5f)
                lineTo(16f, 5.5f)
                moveTo(14f, 6.5f)
                lineTo(17f, 6.5f)
                
                // Second Row
                moveTo(11f, 9f)
                curveTo(12f, 9f, 12f, 10f, 12f, 10f)
                curveTo(12f, 10f, 12f, 11f, 11f, 11f)
                curveTo(10f, 11f, 10f, 10f, 10f, 10f)
                curveTo(10f, 10f, 10f, 9f, 11f, 9f)
                moveTo(10.5f, 10f)
                lineTo(11f, 10.5f)
                lineTo(11.5f, 9.5f)
                moveTo(14f, 9.5f)
                lineTo(16f, 9.5f)
                moveTo(14f, 10.5f)
                lineTo(17f, 10.5f)

                // Third Row
                moveTo(11f, 13f)
                curveTo(12f, 13f, 12f, 14f, 12f, 14f)
                curveTo(12f, 14f, 12f, 15f, 11f, 15f)
                curveTo(10f, 15f, 10f, 14f, 10f, 14f)
                curveTo(10f, 14f, 10f, 13f, 11f, 13f)
                moveTo(10.5f, 14f)
                lineTo(11f, 14.5f)
                lineTo(11.5f, 13.5f)
                moveTo(14f, 13.5f)
                lineTo(16f, 13.5f)
                moveTo(14f, 14.5f)
                lineTo(17f, 14.5f)
                
                // Fourth Row
                moveTo(11f, 17f)
                curveTo(12f, 17f, 12f, 18f, 12f, 18f)
                curveTo(12f, 18f, 12f, 19f, 11f, 19f)
                curveTo(10f, 19f, 10f, 18f, 10f, 18f)
                curveTo(10f, 18f, 10f, 17f, 11f, 17f)
                moveTo(10.5f, 18f)
                lineTo(11f, 18.5f)
                lineTo(11.5f, 17.5f)
                moveTo(14f, 17.5f)
                lineTo(16f, 17.5f)
                moveTo(14f, 18.5f)
                lineTo(17f, 18.5f)
            }
        }.build()

    val ResultsDocument: ImageVector
        get() = ImageVector.Builder(
            name = "ResultsDocument", defaultWidth = 24.dp, defaultHeight = 24.dp,
            viewportWidth = 24f, viewportHeight = 24f
        ).apply {
            // Outline Documents
            path(
                fill = null, stroke = SolidColor(OutlineColor),
                strokeLineWidth = StrokeWidth, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 4f)
                lineTo(5f, 4f)
                curveTo(4f, 4f, 3f, 5f, 3f, 7f)
                lineTo(3f, 21f)
                curveTo(3f, 23f, 4f, 24f, 6f, 24f)
                lineTo(17f, 24f)
                curveTo(19f, 24f, 20f, 23f, 20f, 21f)
                lineTo(20f, 19f)
                
                moveTo(10f, 2f)
                lineTo(21f, 2f)
                curveTo(22f, 2f, 23f, 3f, 23f, 5f)
                lineTo(23f, 19f)
                curveTo(23f, 21f, 22f, 22f, 21f, 22f)
                lineTo(10f, 22f)
                curveTo(8f, 22f, 7f, 21f, 7f, 19f)
                lineTo(7f, 5f)
                curveTo(7f, 3f, 8f, 2f, 10f, 2f)
                close()
            }
            // Orange contents
            path(
                fill = null, stroke = SolidColor(AccentColor),
                strokeLineWidth = StrokeWidth, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round
            ) {
                // Pie chart
                moveTo(15f, 5f)
                curveTo(12.5f, 5f, 10.5f, 7f, 10.5f, 9.5f)
                curveTo(10.5f, 12f, 12.5f, 14f, 15f, 14f)
                curveTo(17.5f, 14f, 19.5f, 12f, 19.5f, 9.5f)
                curveTo(19.5f, 7f, 17.5f, 5f, 15f, 5f)
                moveTo(15f, 5f)
                lineTo(15f, 9.5f)
                lineTo(19f, 11f)
                moveTo(15f, 9.5f)
                lineTo(11f, 11f)
                
                // Boxes and lines
                moveTo(10f, 15f)
                lineTo(12f, 15f)
                lineTo(12f, 17f)
                lineTo(10f, 17f)
                close()
                moveTo(14f, 15.5f)
                lineTo(18f, 15.5f)
                moveTo(14f, 16.5f)
                lineTo(18f, 16.5f)
                
                moveTo(10f, 18f)
                lineTo(12f, 18f)
                lineTo(12f, 20f)
                lineTo(10f, 20f)
                close()

                moveTo(14f, 18.5f)
                lineTo(18f, 18.5f)
                moveTo(14f, 19.5f)
                lineTo(18f, 19.5f)
            }
        }.build()

    val ExamsDocument: ImageVector
        get() = ImageVector.Builder(
            name = "ExamsDocument", defaultWidth = 24.dp, defaultHeight = 24.dp,
            viewportWidth = 24f, viewportHeight = 24f
        ).apply {
            // Outline (Paper and Pencil)
            path(
                fill = null, stroke = SolidColor(OutlineColor),
                strokeLineWidth = StrokeWidth, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 2f)
                lineTo(18f, 2f)
                lineTo(18f, 19f)
                lineTo(8f, 19f)
                curveTo(6f, 19f, 5f, 20f, 5f, 21.5f)
                curveTo(5f, 23f, 6f, 24f, 8f, 24f)
                lineTo(19f, 24f)
                moveTo(5f, 2f)
                lineTo(5f, 21.5f)
                
                // Pencil
                moveTo(20f, 3f)
                lineTo(23f, 3f)
                lineTo(23f, 15f)
                lineTo(21.5f, 18f)
                lineTo(20f, 15f)
                close()
                moveTo(20f, 5f)
                lineTo(23f, 5f)
                moveTo(21.5f, 18f)
                lineTo(21.5f, 15f)
            }
            // Accent contents
            path(
                fill = null, stroke = SolidColor(AccentColor),
                strokeLineWidth = StrokeWidth, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round
            ) {
                // E X A M
                moveTo(7f, 5f)
                lineTo(10f, 5f)
                moveTo(7f, 6.5f)
                lineTo(9f, 6.5f)
                moveTo(7f, 8f)
                lineTo(10f, 8f)
                moveTo(7f, 5f)
                lineTo(7f, 8f)
                
                moveTo(11f, 5f)
                lineTo(13f, 8f)
                moveTo(13f, 5f)
                lineTo(11f, 8f)
                
                moveTo(14f, 8f)
                lineTo(15f, 5f)
                lineTo(16f, 8f)
                moveTo(14.5f, 7f)
                lineTo(15.5f, 7f)
                
                moveTo(17f, 8f)
                lineTo(17f, 5f)
                lineTo(18f, 7f)
                lineTo(19f, 5f)
                lineTo(19f, 8f)
                
                // Content
                moveTo(9f, 11f)
                lineTo(10f, 12f)
                lineTo(12f, 10f)
                moveTo(13f, 11f)
                lineTo(17f, 11f)
                
                moveTo(8.5f, 14f)
                lineTo(10.5f, 14f)
                lineTo(10.5f, 16f)
                lineTo(8.5f, 16f)
                close()
                moveTo(13f, 15f)
                lineTo(17f, 15f)
                
                moveTo(8.5f, 17f)
                lineTo(10.5f, 17f)
                lineTo(10.5f, 19f)
                lineTo(8.5f, 19f)
                close()
                moveTo(13f, 18f)
                lineTo(17f, 18f)
            }
        }.build()

    val CalendarCheck: ImageVector
        get() = ImageVector.Builder(
            name = "CalendarCheck", defaultWidth = 24.dp, defaultHeight = 24.dp,
            viewportWidth = 24f, viewportHeight = 24f
        ).apply {
            // Outline Calendar + Checkmark wrapper
            path(
                fill = null, stroke = SolidColor(OutlineColor),
                strokeLineWidth = StrokeWidth, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 5f)
                lineTo(4f, 5f)
                curveTo(3f, 5f, 2f, 6f, 2f, 8f)
                lineTo(2f, 20f)
                curveTo(2f, 22f, 3f, 23f, 5f, 23f)
                lineTo(20f, 23f)
                curveTo(22f, 23f, 23f, 22f, 23f, 20f)
                lineTo(23f, 8f)
                curveTo(23f, 6f, 22f, 5f, 20f, 5f)
                close()
                
                moveTo(7f, 3f)
                lineTo(7f, 7f)
                moveTo(17f, 3f)
                lineTo(17f, 7f)
                
                moveTo(2f, 10f)
                lineTo(23f, 10f)
                
                // Big Checkmark in circle
                moveTo(18f, 15f)
                curveTo(20.5f, 15f, 22.5f, 17f, 22.5f, 19.5f)
                curveTo(22.5f, 22f, 20.5f, 24f, 18f, 24f)
                curveTo(15.5f, 24f, 13.5f, 22f, 13.5f, 19.5f)
                curveTo(13.5f, 17f, 15.5f, 15f, 18f, 15f)
                close()
                
                moveTo(15.5f, 19.5f)
                lineTo(17f, 21f)
                lineTo(20f, 17.5f)
            }
            // Orange Grids
            path(
                fill = null, stroke = SolidColor(AccentColor),
                strokeLineWidth = StrokeWidth, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 12f)
                lineTo(7f, 12f)
                lineTo(7f, 14f)
                lineTo(5f, 14f)
                close()
                
                moveTo(9f, 12f)
                lineTo(11f, 12f)
                lineTo(11f, 14f)
                lineTo(9f, 14f)
                close()
                
                moveTo(13f, 12f)
                lineTo(15f, 12f)
                lineTo(15f, 14f)
                lineTo(13f, 14f)
                close()
                
                moveTo(17f, 12f)
                lineTo(19f, 12f)
                lineTo(19f, 14f)
                lineTo(17f, 14f)
                close()
                
                moveTo(5f, 16f)
                lineTo(7f, 16f)
                lineTo(7f, 18f)
                lineTo(5f, 18f)
                close()
                
                moveTo(9f, 16f)
                lineTo(11f, 16f)
                lineTo(11f, 18f)
                lineTo(9f, 18f)
                close()
                
                moveTo(13f, 16f)
                lineTo(15f, 16f)
                lineTo(15f, 18f)
                lineTo(13f, 18f)
                close()
                
                moveTo(5f, 20f)
                lineTo(7f, 20f)
                lineTo(7f, 22f)
                lineTo(5f, 22f)
                close()
                
                moveTo(9f, 20f)
                lineTo(11f, 20f)
                lineTo(11f, 22f)
                lineTo(9f, 22f)
                close()
            }
        }.build()

    val EventsBoard: ImageVector
        get() = ImageVector.Builder(
            name = "EventsBoard", defaultWidth = 24.dp, defaultHeight = 24.dp,
            viewportWidth = 24f, viewportHeight = 24f
        ).apply {
            // Outline Board
            path(
                fill = null, stroke = SolidColor(OutlineColor),
                strokeLineWidth = StrokeWidth, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 4f)
                lineTo(3f, 4f)
                curveTo(2f, 4f, 1f, 5f, 1f, 7f)
                lineTo(1f, 17f)
                curveTo(1f, 19f, 2f, 20f, 3f, 20f)
                lineTo(21f, 20f)
                curveTo(22f, 20f, 23f, 19f, 23f, 17f)
                lineTo(23f, 7f)
                curveTo(23f, 5f, 22f, 4f, 21f, 4f)
                close()
                moveTo(6f, 2f)
                lineTo(6f, 6f)
                moveTo(12f, 2f)
                lineTo(12f, 6f)
                moveTo(18f, 2f)
                lineTo(18f, 6f)
                moveTo(1f, 8f)
                lineTo(23f, 8f)
            }
            // Orange contents
            path(
                fill = null, stroke = SolidColor(AccentColor),
                strokeLineWidth = StrokeWidth, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round
            ) {
                // Star
                moveTo(12f, 10f)
                lineTo(13f, 12.5f)
                lineTo(16f, 13f)
                lineTo(14f, 15f)
                lineTo(14.5f, 18f)
                lineTo(12f, 16.5f)
                lineTo(9.5f, 18f)
                lineTo(10f, 15f)
                lineTo(8f, 13f)
                lineTo(11f, 12.5f)
                close()
                
                // People
                // Left
                moveTo(4f, 23f)
                curveTo(4f, 21f, 5f, 19f, 7f, 19f)
                curveTo(9f, 19f, 10f, 21f, 10f, 23f)
                lineTo(4f, 23f)
                close()
                moveTo(7f, 19f)
                curveTo(8.5f, 19f, 9.5f, 17.5f, 9.5f, 16f)
                curveTo(9.5f, 14.5f, 8.5f, 13f, 7f, 13f)
                curveTo(5.5f, 13f, 4.5f, 14.5f, 4.5f, 16f)
                curveTo(4.5f, 17.5f, 5.5f, 19f, 7f, 19f)
                
                // Right
                moveTo(14f, 23f)
                curveTo(14f, 21f, 15f, 19f, 17f, 19f)
                curveTo(19f, 19f, 20f, 21f, 20f, 23f)
                lineTo(14f, 23f)
                close()
                moveTo(17f, 19f)
                curveTo(18.5f, 19f, 19.5f, 17.5f, 19.5f, 16f)
                curveTo(19.5f, 14.5f, 18.5f, 13f, 17f, 13f)
                curveTo(15.5f, 13f, 14.5f, 14.5f, 14.5f, 16f)
                curveTo(14.5f, 17.5f, 15.5f, 19f, 17f, 19f)
                
                // Center person
                moveTo(9.5f, 24f)
                curveTo(9.5f, 21f, 11f, 19.5f, 12f, 19.5f)
                curveTo(13f, 19.5f, 14.5f, 21f, 14.5f, 24f)
                lineTo(9.5f, 24f)
                close()
                moveTo(12f, 19.5f)
                curveTo(13.5f, 19.5f, 14.5f, 18f, 14.5f, 16f)
                curveTo(14.5f, 14f, 13.5f, 12f, 12f, 12f)
                curveTo(10.5f, 12f, 9.5f, 14f, 9.5f, 16f)
                curveTo(9.5f, 18f, 10.5f, 19.5f, 12f, 19.5f)
            }
        }.build()

    val MenuGrids: ImageVector
        get() = ImageVector.Builder(
            name = "MenuGrids", defaultWidth = 24.dp, defaultHeight = 24.dp,
            viewportWidth = 24f, viewportHeight = 24f
        ).apply {
            // Outline
            path(
                fill = null, stroke = SolidColor(OutlineColor),
                strokeLineWidth = StrokeWidth, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round
            ) {
                // Top check circle
                moveTo(12f, 10f)
                curveTo(14f, 10f, 16f, 8f, 16f, 6f)
                curveTo(16f, 4f, 14f, 2f, 12f, 2f)
                curveTo(10f, 2f, 8f, 4f, 8f, 6f)
                curveTo(8f, 8f, 10f, 10f, 12f, 10f)
                close()
                moveTo(10f, 6f)
                lineTo(11.5f, 7.5f)
                lineTo(14f, 4f)
                
                // Connecting lines
                moveTo(12f, 10f)
                lineTo(12f, 12f)
                moveTo(5f, 12f)
                lineTo(19f, 12f)
                moveTo(5f, 12f)
                lineTo(5f, 13f)
                moveTo(12f, 12f)
                lineTo(12f, 13f)
                moveTo(19f, 12f)
                lineTo(19f, 13f)
                
                moveTo(5f, 18f)
                lineTo(5f, 19f)
                moveTo(12f, 18f)
                lineTo(12f, 19f)
                moveTo(19f, 18f)
                lineTo(19f, 19f)
                
                // Left column boxes
                moveTo(2f, 13f)
                lineTo(8f, 13f)
                lineTo(8f, 18f)
                lineTo(2f, 18f)
                close()
                moveTo(3.5f, 14f)
                lineTo(5.5f, 14f)
                lineTo(5.5f, 15f)
                lineTo(3.5f, 15f)
                close()
                moveTo(3.5f, 16f)
                lineTo(5.5f, 16f)
                
                moveTo(2f, 19f)
                lineTo(8f, 19f)
                lineTo(8f, 24f)
                lineTo(2f, 24f)
                close()
                moveTo(3.5f, 20f)
                lineTo(5.5f, 20f)
                lineTo(5.5f, 21f)
                lineTo(3.5f, 21f)
                close()
                moveTo(3.5f, 22f)
                lineTo(5.5f, 22f)
                
                // Right column boxes
                moveTo(16f, 13f)
                lineTo(22f, 13f)
                lineTo(22f, 18f)
                lineTo(16f, 18f)
                close()
                moveTo(17.5f, 14f)
                lineTo(19.5f, 14f)
                lineTo(19.5f, 15f)
                lineTo(17.5f, 15f)
                close()
                moveTo(17.5f, 16f)
                lineTo(19.5f, 16f)
                
                moveTo(16f, 19f)
                lineTo(22f, 19f)
                lineTo(22f, 24f)
                lineTo(16f, 24f)
                close()
                moveTo(17.5f, 20f)
                lineTo(19.5f, 20f)
                lineTo(19.5f, 21f)
                lineTo(17.5f, 21f)
                close()
                moveTo(17.5f, 22f)
                lineTo(19.5f, 22f)
            }
            // Orange contents
            path(
                fill = null, stroke = SolidColor(AccentColor),
                strokeLineWidth = StrokeWidth, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round
            ) {
                // Middle column boxes
                moveTo(9f, 13f)
                lineTo(15f, 13f)
                lineTo(15f, 18f)
                lineTo(9f, 18f)
                close()
                moveTo(10.5f, 14f)
                lineTo(12.5f, 14f)
                lineTo(12.5f, 15f)
                lineTo(10.5f, 15f)
                close()
                moveTo(10.5f, 16f)
                lineTo(12.5f, 16f)
                
                moveTo(9f, 19f)
                lineTo(15f, 19f)
                lineTo(15f, 24f)
                lineTo(9f, 24f)
                close()
                moveTo(10.5f, 20f)
                lineTo(12.5f, 20f)
                lineTo(12.5f, 21f)
                lineTo(10.5f, 21f)
                close()
                moveTo(10.5f, 22f)
                lineTo(12.5f, 22f)
            }
        }.build()

    val MenuThreeLines: ImageVector
        get() = ImageVector.Builder(
            name = "MenuThreeLines", defaultWidth = 24.dp, defaultHeight = 24.dp,
            viewportWidth = 24f, viewportHeight = 24f
        ).apply {
            path(
                fill = null, stroke = SolidColor(AccentColor),
                strokeLineWidth = 4f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 6f)
                lineTo(20f, 6f)
                moveTo(4f, 12f)
                lineTo(20f, 12f)
                moveTo(4f, 18f)
                lineTo(14f, 18f)
            }
        }.build()

    val NotificationBell: ImageVector
        get() = ImageVector.Builder(
            name = "NotificationBell", defaultWidth = 24.dp, defaultHeight = 24.dp,
            viewportWidth = 24f, viewportHeight = 24f
        ).apply {
            path(
                fill = null, stroke = SolidColor(OutlineColor),
                strokeLineWidth = 2.5f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 12f)
                curveTo(18f, 7.5f, 16f, 6f, 12f, 6f)
                curveTo(8f, 6f, 6f, 7.5f, 6f, 12f)
                lineTo(6f, 16f)
                lineTo(3f, 18f)
                lineTo(3f, 20f)
                lineTo(21f, 20f)
                lineTo(21f, 18f)
                lineTo(18f, 16f)
                lineTo(18f, 12f)
                close()
                moveTo(9f, 20f)
                curveTo(9f, 21.66f, 10.34f, 23f, 12f, 23f)
                curveTo(13.66f, 23f, 15f, 21.66f, 15f, 20f)
            }
        }.build()

    val NavDashboard: ImageVector
        get() = ImageVector.Builder(
            name = "NavDashboard", defaultWidth = 24.dp, defaultHeight = 24.dp,
            viewportWidth = 24f, viewportHeight = 24f
        ).apply {
            path(
                fill = null, stroke = SolidColor(Color.Black),
                strokeLineWidth = 2.5f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round
            ) {
                // top left
                moveTo(5f, 4f)
                lineTo(8f, 4f)
                curveTo(9.5f, 4f, 11f, 5.5f, 11f, 7f)
                lineTo(11f, 8f)
                curveTo(11f, 9.5f, 9.5f, 11f, 8f, 11f)
                lineTo(5f, 11f)
                curveTo(3.5f, 11f, 2f, 9.5f, 2f, 8f)
                lineTo(2f, 7f)
                curveTo(2f, 5.5f, 3.5f, 4f, 5f, 4f)
                close()

                // top right
                moveTo(16f, 4f)
                lineTo(19f, 4f)
                curveTo(20.5f, 4f, 22f, 5.5f, 22f, 7f)
                lineTo(22f, 8f)
                curveTo(22f, 9.5f, 20.5f, 11f, 19f, 11f)
                lineTo(16f, 11f)
                curveTo(14.5f, 11f, 13f, 9.5f, 13f, 8f)
                lineTo(13f, 7f)
                curveTo(13f, 5.5f, 14.5f, 4f, 16f, 4f)
                close()

                // bottom left
                moveTo(5f, 13f)
                lineTo(8f, 13f)
                curveTo(9.5f, 13f, 11f, 14.5f, 11f, 16f)
                lineTo(11f, 17f)
                curveTo(11f, 18.5f, 9.5f, 20f, 8f, 20f)
                lineTo(5f, 20f)
                curveTo(3.5f, 20f, 2f, 18.5f, 2f, 17f)
                lineTo(2f, 16f)
                curveTo(2f, 14.5f, 3.5f, 13f, 5f, 13f)
                close()

                // bottom right
                moveTo(16f, 13f)
                lineTo(19f, 13f)
                curveTo(20.5f, 13f, 22f, 14.5f, 22f, 16f)
                lineTo(22f, 17f)
                curveTo(22f, 18.5f, 20.5f, 20f, 19f, 20f)
                lineTo(16f, 20f)
                curveTo(14.5f, 20f, 13f, 18.5f, 13f, 17f)
                lineTo(13f, 16f)
                curveTo(13f, 14.5f, 14.5f, 13f, 16f, 13f)
                close()
            }
        }.build()

    val NavHappenings: ImageVector
        get() = ImageVector.Builder(
            name = "NavHappenings", defaultWidth = 24.dp, defaultHeight = 24.dp,
            viewportWidth = 24f, viewportHeight = 24f
        ).apply {
            path(
                fill = null, stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round
            ) {
                // newspaper shape
                moveTo(16f, 22f)
                lineTo(6f, 22f)
                curveTo(4.9f, 22f, 4f, 21.1f, 4f, 20f)
                lineTo(4f, 4f)
                curveTo(4f, 2.9f, 4.9f, 2f, 6f, 2f)
                lineTo(16f, 2f)
                curveTo(17.1f, 2f, 18f, 2.9f, 18f, 4f)
                lineTo(18f, 19f)
                curveTo(18f, 20.66f, 19.34f, 22f, 21f, 22f)
                lineTo(21f, 8f)

                // Fill the empty space and box
                moveTo(7f, 6f)
                lineTo(11f, 6f)
                lineTo(11f, 10f)
                lineTo(7f, 10f)
                close()

                moveTo(13f, 7f)
                lineTo(15f, 7f)
                moveTo(13f, 10f)
                lineTo(15f, 10f)

                moveTo(7f, 13f)
                lineTo(15f, 13f)
                moveTo(7f, 16f)
                lineTo(15f, 16f)
                moveTo(7f, 19f)
                lineTo(15f, 19f)
            }
        }.build()

    val NavRMS: ImageVector
        get() = ImageVector.Builder(
            name = "NavRMS", defaultWidth = 24.dp, defaultHeight = 24.dp,
            viewportWidth = 24f, viewportHeight = 24f
        ).apply {
            path(
                fill = null, stroke = SolidColor(Color.Black),
                strokeLineWidth = 2.5f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round
            ) {
                // outer box
                moveTo(13f, 5f)
                lineTo(7f, 5f)
                curveTo(5.3f, 5f, 4f, 6.3f, 4f, 8f)
                lineTo(4f, 17f)
                curveTo(4f, 18.7f, 5.3f, 20f, 7f, 20f)
                lineTo(15f, 20f)
                curveTo(16.7f, 20f, 18f, 18.7f, 18f, 17f)
                lineTo(18f, 9f)

                // pencil main line
                moveTo(10f, 12f)
                lineTo(18f, 4f)
            }
            path(
                fill = SolidColor(Color.Black), stroke = SolidColor(Color.Black),
                strokeLineWidth = 1f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round
            ) {
                // pencil tip
                moveTo(10f, 12f)
                lineTo(8f, 13f)
                lineTo(9f, 11f)
                close()
            }
            // Dot at the top right of the pencil
            path(
                fill = SolidColor(Color.Black), stroke = null,
                strokeLineWidth = 0f
            ) {
                moveTo(20.5f, 1.5f)
                curveTo(21.3f, 1.5f, 22f, 2.2f, 22f, 3f)
                curveTo(22f, 3.8f, 21.3f, 4.5f, 20.5f, 4.5f)
                curveTo(19.7f, 4.5f, 19f, 3.8f, 19f, 3f)
                curveTo(19f, 2.2f, 19.7f, 1.5f, 20.5f, 1.5f)
                close()
            }
        }.build()

    val NavViewMarks: ImageVector
        get() = ImageVector.Builder(
            name = "NavViewMarks", defaultWidth = 24.dp, defaultHeight = 24.dp,
            viewportWidth = 24f, viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black), stroke = null,
                strokeLineWidth = 0f
            ) {
                // circle 1
                moveTo(5f, 4f)
                curveTo(6.6f, 4f, 8f, 5.4f, 8f, 7f)
                curveTo(8f, 8.6f, 6.6f, 10f, 5f, 10f)
                curveTo(3.4f, 10f, 2f, 8.6f, 2f, 7f)
                curveTo(2f, 5.4f, 3.4f, 4f, 5f, 4f)
                close()

                // circle 2
                moveTo(5f, 11f)
                curveTo(6.6f, 11f, 8f, 12.4f, 8f, 14f)
                curveTo(8f, 15.6f, 6.6f, 17f, 5f, 17f)
                curveTo(3.4f, 17f, 2f, 15.6f, 2f, 14f)
                curveTo(2f, 12.4f, 3.4f, 11f, 5f, 11f)
                close()

                // circle 3
                moveTo(5f, 18f)
                curveTo(6.6f, 18f, 8f, 19.4f, 8f, 21f)
                curveTo(8f, 22.6f, 6.6f, 24f, 5f, 24f)
                curveTo(3.4f, 24f, 2f, 22.6f, 2f, 21f)
                curveTo(2f, 19.4f, 3.4f, 18f, 5f, 18f)
                close()
            }
            path(
                fill = null, stroke = SolidColor(Color.Black),
                strokeLineWidth = 4f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 7f)
                lineTo(22f, 7f)

                moveTo(11f, 14f)
                lineTo(22f, 14f)

                moveTo(11f, 21f)
                lineTo(22f, 21f)
            }
        }.build()
}
