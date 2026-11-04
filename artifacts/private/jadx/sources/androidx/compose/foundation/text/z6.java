package androidx.compose.foundation.text;

import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nTextLayoutResultProxy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayoutResultProxy.kt\nandroidx/compose/foundation/text/TextLayoutResultProxyKt\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,133:1\n65#2:134\n65#2:137\n65#2:140\n69#2:143\n69#2:146\n69#2:149\n60#3:135\n60#3:138\n60#3:141\n70#3:144\n70#3:147\n70#3:150\n53#3,3:153\n22#4:136\n22#4:139\n22#4:142\n22#4:145\n22#4:148\n22#4:151\n30#5:152\n*S KotlinDebug\n*F\n+ 1 TextLayoutResultProxy.kt\nandroidx/compose/foundation/text/TextLayoutResultProxyKt\n*L\n121#1:134\n122#1:137\n123#1:140\n127#1:143\n128#1:146\n129#1:149\n121#1:135\n122#1:138\n123#1:141\n127#1:144\n128#1:147\n129#1:150\n131#1:153,3\n121#1:136\n122#1:139\n123#1:142\n127#1:145\n128#1:148\n129#1:151\n131#1:152\n*E\n"})
public final class z6 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long b(long j10, n0.j jVar) {
        float fX;
        float fJ;
        int i10 = (int) (j10 >> 32);
        if (Float.intBitsToFloat(i10) < jVar.t()) {
            fX = jVar.t();
        } else {
            fX = Float.intBitsToFloat(i10) > jVar.x() ? jVar.x() : Float.intBitsToFloat(i10);
        }
        int i11 = (int) (j10 & com.rabbitmq.client.k0.f265952a);
        if (Float.intBitsToFloat(i11) < jVar.B()) {
            fJ = jVar.B();
        } else {
            fJ = Float.intBitsToFloat(i11) > jVar.j() ? jVar.j() : Float.intBitsToFloat(i11);
        }
        return n0.g.g((((long) Float.floatToRawIntBits(fX)) << 32) | (((long) Float.floatToRawIntBits(fJ)) & com.rabbitmq.client.k0.f265952a));
    }
}
