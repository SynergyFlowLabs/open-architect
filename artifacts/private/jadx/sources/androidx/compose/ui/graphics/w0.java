package androidx.compose.ui.graphics;

import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nColorMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorMatrix.kt\nandroidx/compose/ui/graphics/ColorMatrixKt\n+ 2 ColorMatrix.kt\nandroidx/compose/ui/graphics/ColorMatrix\n*L\n1#1,375:1\n88#2:376\n88#2:377\n88#2:378\n88#2:379\n*S KotlinDebug\n*F\n+ 1 ColorMatrix.kt\nandroidx/compose/ui/graphics/ColorMatrixKt\n*L\n370#1:376\n371#1:377\n372#1:378\n373#1:379\n*E\n"})
public final class w0 {
    private static final float a(float[] fArr, int i10, float[] fArr2, int i11) {
        int i12 = i10 * 5;
        return (fArr[i12] * fArr2[i11]) + (fArr[i12 + 1] * fArr2[5 + i11]) + (fArr[i12 + 2] * fArr2[10 + i11]) + (fArr[i12 + 3] * fArr2[15 + i11]);
    }
}
