package androidx.compose.foundation.text;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nTextFieldDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDelegate.kt\nandroidx/compose/foundation/text/TextFieldDelegateKt\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 Rect.kt\nandroidx/compose/ui/geometry/Rect\n+ 9 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,455:1\n30#2:456\n80#3:457\n90#3:459\n53#3,3:461\n60#3:465\n70#3:468\n53#3,3:470\n59#4:458\n30#5:460\n30#5:469\n65#6:464\n69#6:467\n22#7:466\n57#8,6:473\n33#9:479\n*S KotlinDebug\n*F\n+ 1 TextFieldDelegate.kt\nandroidx/compose/foundation/text/TextFieldDelegateKt\n*L\n91#1:456\n91#1:457\n449#1:459\n452#1:461,3\n453#1:465\n453#1:468\n453#1:470,3\n449#1:458\n452#1:460\n453#1:469\n453#1:464\n453#1:467\n453#1:466\n453#1:473,6\n453#1:479\n*E\n"})
public final class r5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f20806a = 10;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f20807b = StringsKt.g2("H", 10);

    public static final long a(@NotNull androidx.compose.ui.text.y3 y3Var, @NotNull androidx.compose.ui.unit.d dVar, @NotNull androidx.compose.ui.text.font.y.b bVar, @NotNull String str, int i10) {
        androidx.compose.ui.text.n0 n0VarI = androidx.compose.ui.text.s0.i(str, y3Var, androidx.compose.ui.unit.c.b(0, 0, 0, 0, 15, null), dVar, bVar, (64 & 32) != 0 ? CollectionsKt.emptyList() : CollectionsKt.emptyList(), (64 & 64) != 0 ? CollectionsKt.emptyList() : null, (64 & 128) != 0 ? Integer.MAX_VALUE : i10, (64 & 256) != 0 ? androidx.compose.ui.text.style.v.f42256b.a() : androidx.compose.ui.text.style.v.f42256b.a());
        return androidx.compose.ui.unit.u.e((((long) j5.a(n0VarI.f())) << 32) | (((long) j5.a(n0VarI.getHeight())) & com.rabbitmq.client.k0.f265952a));
    }

    public static /* synthetic */ long b(androidx.compose.ui.text.y3 y3Var, androidx.compose.ui.unit.d dVar, androidx.compose.ui.text.font.y.b bVar, String str, int i10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            str = f20807b;
        }
        if ((i11 & 16) != 0) {
            i10 = 1;
        }
        return a(y3Var, dVar, bVar, str, i10);
    }

    @NotNull
    public static final n0.j c(@NotNull androidx.compose.ui.text.p3 p3Var, @NotNull androidx.compose.ui.layout.g0 g0Var, int i10, @NotNull Function0<androidx.compose.ui.unit.u> function0) {
        n0.j jVarD;
        if (i10 < p3Var.l().n().length()) {
            jVarD = p3Var.d(i10);
        } else {
            jVarD = i10 != 0 ? p3Var.d(i10 - 1) : new n0.j(0.0f, 0.0f, 1.0f, (int) (function0.invoke().q() & com.rabbitmq.client.k0.f265952a));
        }
        long jK0 = g0Var.k0(n0.g.g((((long) Float.floatToRawIntBits(jVarD.B())) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(jVarD.t())) << 32)));
        return n0.k.c(n0.g.g((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jK0 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jK0 & com.rabbitmq.client.k0.f265952a)))) & com.rabbitmq.client.k0.f265952a)), n0.n.f((((long) Float.floatToRawIntBits(jVarD.j() - jVarD.B())) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(jVarD.x() - jVarD.t())) << 32)));
    }

    @NotNull
    public static final String d() {
        return f20807b;
    }
}
