package androidx.compose.ui.layout;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nLookaheadLayoutCoordinates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadLayoutCoordinates.kt\nandroidx/compose/ui/layout/LookaheadLayoutCoordinates\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 6 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 7 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,201:1\n1#2:202\n30#3:203\n80#4:204\n53#4,3:215\n53#4,3:220\n53#4,3:225\n57#5,4:205\n57#5,4:209\n159#6:213\n159#6:218\n159#6:223\n30#7:214\n30#7:219\n30#7:224\n*S KotlinDebug\n*F\n+ 1 LookaheadLayoutCoordinates.kt\nandroidx/compose/ui/layout/LookaheadLayoutCoordinates\n*L\n35#1:203\n35#1:204\n116#1:215,3\n135#1:220,3\n155#1:225,3\n42#1:205,4\n50#1:209,4\n116#1:213\n135#1:218\n155#1:223\n116#1:214\n135#1:219\n155#1:224\n*E\n"})
public final class u0 implements g0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f39557b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.node.v0 f39558a;

    public u0(@NotNull androidx.compose.ui.node.v0 v0Var) {
        this.f39558a = v0Var;
    }

    private final long d() {
        androidx.compose.ui.node.v0 v0VarA = v0.a(this.f39558a);
        g0 g0VarN = v0VarA.n();
        n0.g.a aVar = n0.g.f332700b;
        return n0.g.v(r0(g0VarN, aVar.e()), b().r0(v0VarA.o3(), aVar.e()));
    }

    @Override // androidx.compose.ui.layout.g0
    public boolean I() {
        return b().I();
    }

    @Override // androidx.compose.ui.layout.g0
    public long K(long j10) {
        return b().K(n0.g.w(j10, d()));
    }

    @Override // androidx.compose.ui.layout.g0
    public void K0(@NotNull float[] fArr) {
        b().K0(fArr);
    }

    @Override // androidx.compose.ui.layout.g0
    public int M(@NotNull a aVar) {
        return this.f39558a.M(aVar);
    }

    @Override // androidx.compose.ui.layout.g0
    @NotNull
    public Set<a> S0() {
        return b().S0();
    }

    @Override // androidx.compose.ui.layout.g0
    public boolean U() {
        return this.f39558a.H0();
    }

    @Override // androidx.compose.ui.layout.g0
    public long V(@NotNull g0 g0Var, long j10, boolean z10) {
        if (!(g0Var instanceof u0)) {
            androidx.compose.ui.node.v0 v0VarA = v0.a(this.f39558a);
            long jV = V(v0VarA.p3(), j10, z10);
            long jU2 = v0VarA.u2();
            float fN = androidx.compose.ui.unit.q.n(jU2);
            long jV2 = n0.g.v(jV, n0.g.g((com.rabbitmq.client.k0.f265952a & ((long) Float.floatToRawIntBits(androidx.compose.ui.unit.q.p(jU2)))) | (Float.floatToRawIntBits(fN) << 32)));
            g0 g0VarS0 = v0VarA.o3().s0();
            if (g0VarS0 == null) {
                g0VarS0 = v0VarA.o3().n();
            }
            return n0.g.w(jV2, g0VarS0.V(g0Var, n0.g.f332700b.e(), z10));
        }
        androidx.compose.ui.node.v0 v0Var = ((u0) g0Var).f39558a;
        v0Var.o3().M5();
        androidx.compose.ui.node.v0 v0VarN4 = b().b4(v0Var.o3()).N4();
        if (v0VarN4 != null) {
            long jR = androidx.compose.ui.unit.q.r(androidx.compose.ui.unit.q.s(v0Var.C3(v0VarN4, !z10), androidx.compose.ui.unit.r.g(j10)), this.f39558a.C3(v0VarN4, !z10));
            return n0.g.g((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.q.n(jR))) << 32) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.q.p(jR))) & com.rabbitmq.client.k0.f265952a));
        }
        androidx.compose.ui.node.v0 v0VarA2 = v0.a(v0Var);
        long jS = androidx.compose.ui.unit.q.s(androidx.compose.ui.unit.q.s(v0Var.C3(v0VarA2, !z10), v0VarA2.u2()), androidx.compose.ui.unit.r.g(j10));
        androidx.compose.ui.node.v0 v0VarA3 = v0.a(this.f39558a);
        long jR2 = androidx.compose.ui.unit.q.r(jS, androidx.compose.ui.unit.q.s(this.f39558a.C3(v0VarA3, !z10), v0VarA3.u2()));
        long jG = n0.g.g((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.q.n(jR2))) << 32) | (com.rabbitmq.client.k0.f265952a & ((long) Float.floatToRawIntBits(androidx.compose.ui.unit.q.p(jR2)))));
        androidx.compose.ui.node.k1 k1VarA5 = v0VarA3.o3().a5();
        Intrinsics.checkNotNull(k1VarA5);
        androidx.compose.ui.node.k1 k1VarA6 = v0VarA2.o3().a5();
        Intrinsics.checkNotNull(k1VarA6);
        return k1VarA5.V(k1VarA6, jG, z10);
    }

    @Override // androidx.compose.ui.layout.g0
    public long a() {
        androidx.compose.ui.node.v0 v0Var = this.f39558a;
        return androidx.compose.ui.unit.u.e((((long) v0Var.h1()) << 32) | (((long) v0Var.c1()) & com.rabbitmq.client.k0.f265952a));
    }

    @NotNull
    public final androidx.compose.ui.node.k1 b() {
        return this.f39558a.o3();
    }

    @NotNull
    public final androidx.compose.ui.node.v0 c() {
        return this.f39558a;
    }

    @Override // androidx.compose.ui.layout.g0
    public long c0(long j10) {
        return b().c0(n0.g.w(j10, d()));
    }

    @Override // androidx.compose.ui.layout.g0
    @NotNull
    public n0.j e0(@NotNull g0 g0Var, boolean z10) {
        return b().e0(g0Var, z10);
    }

    @Override // androidx.compose.ui.layout.g0
    @Nullable
    public g0 g0() {
        androidx.compose.ui.node.v0 v0VarN4;
        if (!I()) {
            s0.a.i(androidx.compose.ui.node.k1.f39798y3);
        }
        androidx.compose.ui.node.k1 k1VarA5 = b().i4().F0().a5();
        if (k1VarA5 == null || (v0VarN4 = k1VarA5.N4()) == null) {
            return null;
        }
        return v0VarN4.n();
    }

    @Override // androidx.compose.ui.layout.g0
    public long k0(long j10) {
        return b().k0(n0.g.w(j10, d()));
    }

    @Override // androidx.compose.ui.layout.g0
    public long r0(@NotNull g0 g0Var, long j10) {
        return V(g0Var, j10, true);
    }

    @Override // androidx.compose.ui.layout.g0
    @Nullable
    public g0 s0() {
        androidx.compose.ui.node.v0 v0VarN4;
        if (!I()) {
            s0.a.i(androidx.compose.ui.node.k1.f39798y3);
        }
        androidx.compose.ui.node.k1 k1VarA5 = b().a5();
        if (k1VarA5 == null || (v0VarN4 = k1VarA5.N4()) == null) {
            return null;
        }
        return v0VarN4.n();
    }

    @Override // androidx.compose.ui.layout.g0
    public long w(long j10) {
        return n0.g.w(b().w(j10), d());
    }

    @Override // androidx.compose.ui.layout.g0
    public long w0(long j10) {
        return n0.g.w(b().w0(j10), d());
    }

    @Override // androidx.compose.ui.layout.g0
    public void y0(@NotNull g0 g0Var, @NotNull float[] fArr) {
        b().y0(g0Var, fArr);
    }
}
