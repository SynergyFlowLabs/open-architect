package androidx.compose.ui.input.pointer;

import kotlin.b1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nPointerEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerEvent.kt\nandroidx/compose/ui/input/pointer/PointerEventKt\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 6 Size.kt\nandroidx/compose/ui/geometry/Size\n*L\n1#1,1056:1\n1055#1:1067\n65#2:1057\n69#2:1060\n65#2:1068\n69#2:1071\n60#3:1058\n70#3:1061\n85#3:1064\n90#3:1066\n60#3:1069\n70#3:1072\n60#3:1075\n85#3:1078\n70#3:1080\n90#3:1083\n22#4:1059\n22#4:1062\n22#4:1070\n22#4:1073\n22#4:1076\n22#4:1081\n54#5:1063\n59#5:1065\n54#5:1077\n59#5:1082\n57#6:1074\n61#6:1079\n*S KotlinDebug\n*F\n+ 1 PointerEvent.kt\nandroidx/compose/ui/input/pointer/PointerEventKt\n*L\n1037#1:1067\n1019#1:1057\n1020#1:1060\n1040#1:1068\n1041#1:1071\n1019#1:1058\n1020#1:1061\n1021#1:1064\n1022#1:1066\n1040#1:1069\n1041#1:1072\n1044#1:1075\n1045#1:1078\n1048#1:1080\n1049#1:1083\n1019#1:1059\n1020#1:1062\n1040#1:1070\n1041#1:1073\n1044#1:1076\n1048#1:1081\n1021#1:1063\n1022#1:1065\n1045#1:1077\n1049#1:1082\n1044#1:1074\n1048#1:1079\n*E\n"})
public final class r {
    @kotlin.l(message = "Partial consumption has been deprecated. Use isConsumed instead", replaceWith = @b1(expression = "isConsumed", imports = {}))
    public static final boolean a(@NotNull c0 c0Var) {
        return c0Var.F();
    }

    public static final boolean b(@NotNull c0 c0Var) {
        return (c0Var.F() || c0Var.z() || !c0Var.w()) ? false : true;
    }

    public static final boolean c(@NotNull c0 c0Var) {
        return !c0Var.z() && c0Var.w();
    }

    public static final boolean d(@NotNull c0 c0Var) {
        return (c0Var.F() || !c0Var.z() || c0Var.w()) ? false : true;
    }

    public static final boolean e(@NotNull c0 c0Var) {
        return c0Var.z() && !c0Var.w();
    }

    @kotlin.l(message = "Use consume() instead", replaceWith = @b1(expression = "consume()", imports = {}))
    public static final void f(@NotNull c0 c0Var) {
        c0Var.a();
    }

    @kotlin.l(message = "Partial consumption has been deprecated. Use consume() instead.", replaceWith = @b1(expression = "if (pressed != previousPressed) consume()", imports = {}))
    public static final void g(@NotNull c0 c0Var) {
        if (c0Var.w() != c0Var.z()) {
            c0Var.a();
        }
    }

    @kotlin.l(message = "Partial consumption has been deprecated. Use consume() instead.", replaceWith = @b1(expression = "if (positionChange() != Offset.Zero) consume()", imports = {}))
    public static final void h(@NotNull c0 c0Var) {
        if (n0.g.l(k(c0Var), n0.g.f332700b.e())) {
            return;
        }
        c0Var.a();
    }

    @kotlin.l(message = "Use isOutOfBounds() that supports minimum touch target", replaceWith = @b1(expression = "this.isOutOfBounds(size, extendedTouchPadding)", imports = {}))
    public static final boolean i(@NotNull c0 c0Var, long j10) {
        long jU = c0Var.u();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jU >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jU & com.rabbitmq.client.k0.f265952a));
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & com.rabbitmq.client.k0.f265952a);
        return (fIntBitsToFloat > ((float) i10)) | (fIntBitsToFloat < 0.0f) | (fIntBitsToFloat2 < 0.0f) | (fIntBitsToFloat2 > ((float) i11));
    }

    public static final boolean j(@NotNull c0 c0Var, long j10, long j11) {
        boolean zI = r0.i(c0Var.C(), r0.f39113b.d());
        long jU = c0Var.u();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jU >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jU & com.rabbitmq.client.k0.f265952a));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j11 >> 32));
        float f10 = zI ? 1.0f : 0.0f;
        float f11 = fIntBitsToFloat3 * f10;
        float f12 = ((int) (j10 >> 32)) + f11;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j11 & com.rabbitmq.client.k0.f265952a)) * f10;
        return (fIntBitsToFloat > f12) | (fIntBitsToFloat < (-f11)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((int) (j10 & com.rabbitmq.client.k0.f265952a)) + fIntBitsToFloat4);
    }

    public static final long k(@NotNull c0 c0Var) {
        return n(c0Var, false);
    }

    @kotlin.l(message = "Partial consumption has been deprecated. Use isConsumed instead", replaceWith = @b1(expression = "isConsumed", imports = {}))
    public static final boolean l(@NotNull c0 c0Var) {
        return c0Var.F();
    }

    public static final long m(@NotNull c0 c0Var) {
        return n(c0Var, true);
    }

    private static final long n(c0 c0Var, boolean z10) {
        return (z10 || !c0Var.F()) ? n0.g.v(c0Var.u(), c0Var.y()) : n0.g.f332700b.e();
    }

    static /* synthetic */ long o(c0 c0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return n(c0Var, z10);
    }

    public static final boolean p(@NotNull c0 c0Var) {
        return !n0.g.l(n(c0Var, false), n0.g.f332700b.e());
    }

    public static final boolean q(@NotNull c0 c0Var) {
        return !n0.g.l(n(c0Var, true), n0.g.f332700b.e());
    }

    private static final int r(boolean z10) {
        return z10 ? 1 : 0;
    }
}
