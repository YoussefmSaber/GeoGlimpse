package com.saber.aiintegration.utils.icons

import androidx.compose.ui.graphics.vector.ImageVector
import com.saber.aiintegration.utils.icons.iconly.Capture
import com.saber.aiintegration.utils.icons.iconly.Setting
import com.saber.aiintegration.utils.icons.iconly.`Back-arrow`
import com.saber.aiintegration.utils.icons.iconly.`World-pana`
import kotlin.collections.List as ____KtList

public object Iconly

private var __Iconly: ____KtList<ImageVector>? = null

public val Iconly.Iconly: ____KtList<ImageVector>
  get() {
    if (__Iconly != null) {
      return __Iconly!!
    }
    __Iconly = listOf(`Back-arrow`, Capture, Setting, `World-pana`)
    return __Iconly!!
  }