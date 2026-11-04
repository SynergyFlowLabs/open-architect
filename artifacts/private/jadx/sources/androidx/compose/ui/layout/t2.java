package androidx.compose.ui.layout;

import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nRuler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ruler.kt\nandroidx/compose/ui/layout/RulerKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,164:1\n13409#2,2:165\n*S KotlinDebug\n*F\n+ 1 Ruler.kt\nandroidx/compose/ui/layout/RulerKt\n*L\n156#1:165,2\n*E\n"})
public final class t2 {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:11:0x0021  */
    public static final float b(i2.a aVar, boolean z10, s2[] s2VarArr, float f10) {
        float f11 = Float.NaN;
        for (s2 s2Var : s2VarArr) {
            float fI = aVar.I(s2Var, Float.NaN);
            if (Float.isNaN(f11)) {
                f11 = fI;
            } else if (z10 == (fI > f11)) {
                f11 = fI;
            }
        }
        return Float.isNaN(f11) ? f10 : f11;
    }
}
