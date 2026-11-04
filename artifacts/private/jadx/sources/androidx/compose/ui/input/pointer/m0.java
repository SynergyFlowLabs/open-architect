package androidx.compose.ui.input.pointer;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nPointerInputTestUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInputTestUtil.kt\nandroidx/compose/ui/input/pointer/PointerInputTestUtilKt\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,147:1\n30#2:148\n30#2:152\n30#2:156\n30#2:165\n53#3,3:149\n53#3,3:153\n53#3,3:157\n60#3:161\n70#3:164\n53#3,3:166\n80#3:170\n80#3:172\n80#3:174\n80#3:182\n65#4:160\n69#4:163\n22#5:162\n30#6:169\n30#6:171\n30#6:173\n30#6:181\n1#7:175\n35#8,5:176\n*S KotlinDebug\n*F\n+ 1 PointerInputTestUtil.kt\nandroidx/compose/ui/input/pointer/PointerInputTestUtilKt\n*L\n38#1:148\n42#1:152\n63#1:156\n76#1:165\n38#1:149,3\n42#1:153,3\n63#1:157,3\n76#1:161\n76#1:164\n76#1:166,3\n102#1:170\n119#1:172\n130#1:174\n141#1:182\n76#1:160\n76#1:163\n76#1:162\n102#1:169\n119#1:171\n130#1:173\n141#1:181\n145#1:176,5\n*E\n"})
public final class m0 {
    @NotNull
    public static final c0 a(long j10, long j11, float f10, float f11, @Nullable List<f> list) {
        c0 c0Var = new c0(b0.b(j10), j11, n0.g.g((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11)) & com.rabbitmq.client.k0.f265952a)), true, 1.0f, j11, n0.g.g((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11)) & com.rabbitmq.client.k0.f265952a)), false, false, 0, 0L, 1536, (DefaultConstructorMarker) null);
        List<f> list2 = list;
        return (list2 == null || list2.isEmpty()) ? c0Var : c0.i(c0Var, 0L, 0L, 0L, false, 0L, 0L, false, 0, list, 0L, 767, null);
    }

    public static /* synthetic */ c0 b(long j10, long j11, float f10, float f11, List list, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j11 = 0;
        }
        long j12 = j11;
        float f12 = (i10 & 4) != 0 ? 0.0f : f10;
        float f13 = (i10 & 8) != 0 ? 0.0f : f11;
        if ((i10 & 16) != 0) {
            list = null;
        }
        return a(j10, j12, f12, f13, list);
    }

    public static final void c(@NotNull pj.n<? super q, ? super s, ? super androidx.compose.ui.unit.u, Unit> nVar, @NotNull q qVar, long j10) {
        g(nVar, qVar, CollectionsKt.listOf((Object[]) new s[]{s.Initial, s.Main, s.Final}), j10);
    }

    public static /* synthetic */ void d(pj.n nVar, q qVar, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            long j11 = Integer.MAX_VALUE;
            j10 = androidx.compose.ui.unit.u.e((j11 & com.rabbitmq.client.k0.f265952a) | (j11 << 32));
        }
        c(nVar, qVar, j10);
    }

    public static final void e(@NotNull pj.n<? super q, ? super s, ? super androidx.compose.ui.unit.u, Unit> nVar, @NotNull q qVar, @NotNull s sVar, long j10) {
        g(nVar, qVar, CollectionsKt.listOf(sVar), j10);
    }

    public static /* synthetic */ void f(pj.n nVar, q qVar, s sVar, long j10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            long j11 = Integer.MAX_VALUE;
            j10 = androidx.compose.ui.unit.u.e((j11 & com.rabbitmq.client.k0.f265952a) | (j11 << 32));
        }
        e(nVar, qVar, sVar, j10);
    }

    public static final void g(@NotNull pj.n<? super q, ? super s, ? super androidx.compose.ui.unit.u, Unit> nVar, @NotNull q qVar, @NotNull List<? extends s> list, long j10) {
        if (qVar.e().isEmpty()) {
            throw new IllegalArgumentException("invokeOverPasses called with no changes");
        }
        List<? extends s> list2 = list;
        if (list2.isEmpty()) {
            throw new IllegalArgumentException("invokeOverPasses called with no passes");
        }
        int size = list2.size();
        for (int i10 = 0; i10 < size; i10++) {
            nVar.invoke(qVar, list.get(i10), androidx.compose.ui.unit.u.b(j10));
        }
    }

    public static final void h(@NotNull pj.n<? super q, ? super s, ? super androidx.compose.ui.unit.u, Unit> nVar, @NotNull q qVar, @NotNull s[] sVarArr, long j10) {
        g(nVar, qVar, ArraysKt.toList(sVarArr), j10);
    }

    public static /* synthetic */ void i(pj.n nVar, q qVar, List list, long j10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            long j11 = Integer.MAX_VALUE;
            j10 = androidx.compose.ui.unit.u.e((j11 & com.rabbitmq.client.k0.f265952a) | (j11 << 32));
        }
        g(nVar, qVar, list, j10);
    }

    public static /* synthetic */ void j(pj.n nVar, q qVar, s[] sVarArr, long j10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            long j11 = Integer.MAX_VALUE;
            j10 = androidx.compose.ui.unit.u.e((j11 & com.rabbitmq.client.k0.f265952a) | (j11 << 32));
        }
        h(nVar, qVar, sVarArr, j10);
    }

    @NotNull
    public static final c0 k(@NotNull c0 c0Var, long j10, float f10, float f11) {
        long jS = c0Var.s();
        long jD = c0Var.D();
        boolean zW = c0Var.w();
        long jU = c0Var.u();
        long jD2 = c0Var.D() + j10;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c0Var.u() >> 32)) + f10;
        return new c0(jS, jD2, n0.g.g((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (c0Var.u() & com.rabbitmq.client.k0.f265952a)) + f11)) & com.rabbitmq.client.k0.f265952a) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)), true, 1.0f, jD, jU, zW, false, 0, 0L, 1536, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ c0 l(c0 c0Var, long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            f11 = 0.0f;
        }
        return k(c0Var, j10, f10, f11);
    }

    @NotNull
    public static final c0 m(@NotNull c0 c0Var, long j10, float f10, float f11) {
        long jS = c0Var.s();
        long jD = c0Var.D();
        boolean zW = c0Var.w();
        return new c0(jS, j10, n0.g.g((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11)) & com.rabbitmq.client.k0.f265952a)), true, 1.0f, jD, c0Var.u(), zW, false, 0, 0L, 1536, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ c0 n(c0 c0Var, long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            f11 = 0.0f;
        }
        return m(c0Var, j10, f10, f11);
    }

    @NotNull
    public static final c0 o(@NotNull c0 c0Var, long j10) {
        long jS = c0Var.s();
        long jD = c0Var.D();
        boolean zW = c0Var.w();
        return new c0(jS, j10, c0Var.u(), false, 1.0f, jD, c0Var.u(), zW, false, 0, 0L, 1536, (DefaultConstructorMarker) null);
    }
}
