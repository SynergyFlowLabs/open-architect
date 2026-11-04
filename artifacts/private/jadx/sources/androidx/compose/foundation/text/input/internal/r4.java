package androidx.compose.foundation.text.input.internal;

import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nTextFieldCoreModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldCoreModifier.kt\nandroidx/compose/foundation/text/input/internal/TextFieldCoreModifierKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,683:1\n640#2:684\n113#3:685\n*S KotlinDebug\n*F\n+ 1 TextFieldCoreModifier.kt\nandroidx/compose/foundation/text/input/internal/TextFieldCoreModifierKt\n*L\n640#1:684\n636#1:685\n*E\n"})
public final class r4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f19779a = androidx.compose.ui.unit.h.r(2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final n0.j d(androidx.compose.ui.unit.d dVar, n0.j jVar, boolean z10, int i10) {
        return n0.j.h(jVar, z10 ? i10 - jVar.x() : jVar.t(), 0.0f, (z10 ? i10 - jVar.x() : jVar.t()) + dVar.g6(f19779a), 0.0f, 10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(androidx.compose.ui.graphics.i0 i0Var) {
        return ((i0Var instanceof androidx.compose.ui.graphics.s3) && ((androidx.compose.ui.graphics.s3) i0Var).c() == 16) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float f(float f10) {
        if (Float.isNaN(f10) || Float.isInfinite(f10)) {
            return f10;
        }
        return (float) (f10 > 0.0f ? Math.ceil(f10) : Math.floor(f10));
    }
}
