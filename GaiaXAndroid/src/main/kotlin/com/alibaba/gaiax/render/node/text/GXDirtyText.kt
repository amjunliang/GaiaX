package com.alibaba.gaiax.render.node.text

import app.visly.stretch.Style
import com.alibaba.fastjson.JSONObject
import com.alibaba.gaiax.context.GXTemplateContext
import com.alibaba.gaiax.render.node.GXStretchNode
import com.alibaba.gaiax.render.node.GXTemplateNode

data class GXDirtyText(
    val gxTemplateContext: GXTemplateContext,
    val gxTemplateNode: GXTemplateNode,
    val gxStretchNode: GXStretchNode,
    val templateData: JSONObject,
    val stretchStyle: Style
)