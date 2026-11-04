package androidx.compose.ui.node;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nLookaheadDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegate\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,686:1\n30#2:687\n30#2:690\n80#3:688\n80#3:691\n1#4:689\n*S KotlinDebug\n*F\n+ 1 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegate\n*L\n439#1:687\n450#1:690\n439#1:688\n450#1:691\n*E\n"})
public abstract class v0 extends u0 implements androidx.compose.ui.layout.z0 {
    public static final int H1 = 0;

    @Nullable
    private Map<androidx.compose.ui.layout.a, Integer> Y;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.layout.b1 f40037p0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private final k1 f40039w;
    private long X = androidx.compose.ui.unit.q.f42709b.b();

    @NotNull
    private final androidx.compose.ui.layout.u0 Z = new androidx.compose.ui.layout.u0(this);

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @NotNull
    private final androidx.collection.f2<androidx.compose.ui.layout.a> f40038p1 = androidx.collection.r2.d();

    public v0(@NotNull k1 k1Var) {
        this.f40039w = k1Var;
    }

    private final void A3(long j10) {
        if (!androidx.compose.ui.unit.q.k(u2(), j10)) {
            E3(j10);
            x0 x0VarU = i4().k0().u();
            if (x0VarU != null) {
                x0VarU.Z2();
            }
            w2(this.f40039w);
        }
        if (B2()) {
            return;
        }
        J1(l2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G3(androidx.compose.ui.layout.b1 b1Var) {
        Map<androidx.compose.ui.layout.a, Integer> map;
        if (b1Var != null) {
            q1(androidx.compose.ui.unit.u.e((((long) b1Var.getHeight()) & com.rabbitmq.client.k0.f265952a) | (((long) b1Var.getWidth()) << 32)));
        } else {
            q1(androidx.compose.ui.unit.u.f42720b.a());
        }
        if (!Intrinsics.areEqual(this.f40037p0, b1Var) && b1Var != null && ((((map = this.Y) != null && !map.isEmpty()) || !b1Var.x().isEmpty()) && !Intrinsics.areEqual(b1Var.x(), this.Y))) {
            S1().x().q();
            Map linkedHashMap = this.Y;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
                this.Y = linkedHashMap;
            }
            linkedHashMap.clear();
            linkedHashMap.putAll(b1Var.x());
        }
        this.f40037p0 = b1Var;
    }

    public final void B3(long j10) {
        A3(androidx.compose.ui.unit.q.s(j10, b1()));
    }

    public final long C3(@NotNull v0 v0Var, boolean z10) {
        long jB = androidx.compose.ui.unit.q.f42709b.b();
        while (!Intrinsics.areEqual(this, v0Var)) {
            if (!this.H0() || !z10) {
                jB = androidx.compose.ui.unit.q.s(jB, this.u2());
            }
            k1 k1VarA5 = this.f40039w.a5();
            Intrinsics.checkNotNull(k1VarA5);
            this = k1VarA5.N4();
            Intrinsics.checkNotNull(this);
        }
        return jB;
    }

    public int D0(int i10) {
        k1 k1VarY4 = this.f40039w.Y4();
        Intrinsics.checkNotNull(k1VarY4);
        v0 v0VarN4 = k1VarY4.N4();
        Intrinsics.checkNotNull(v0VarN4);
        return v0VarN4.D0(i10);
    }

    public void E3(long j10) {
        this.X = j10;
    }

    public int L0(int i10) {
        k1 k1VarY4 = this.f40039w.Y4();
        Intrinsics.checkNotNull(k1VarY4);
        v0 v0VarN4 = k1VarY4.N4();
        Intrinsics.checkNotNull(v0VarN4);
        return v0VarN4.L0(i10);
    }

    public int M0(int i10) {
        k1 k1VarY4 = this.f40039w.Y4();
        Intrinsics.checkNotNull(k1VarY4);
        v0 v0VarN4 = k1VarY4.N4();
        Intrinsics.checkNotNull(v0VarN4);
        return v0VarN4.M0(i10);
    }

    @Override // androidx.compose.ui.node.u0, androidx.compose.ui.layout.z
    public boolean P5() {
        return true;
    }

    @Override // androidx.compose.ui.node.u0
    @NotNull
    public b S1() {
        b bVarO = this.f40039w.i4().k0().o();
        Intrinsics.checkNotNull(bVarO);
        return bVarO;
    }

    @Override // androidx.compose.ui.node.u0
    @Nullable
    public u0 T1() {
        k1 k1VarY4 = this.f40039w.Y4();
        if (k1VarY4 != null) {
            return k1VarY4.N4();
        }
        return null;
    }

    @Override // androidx.compose.ui.node.u0
    public void W2() {
        p1(u2(), 0.0f, null);
    }

    @Override // androidx.compose.ui.node.u0
    public boolean b2() {
        return this.f40037p0 != null;
    }

    @Override // androidx.compose.ui.layout.e1, androidx.compose.ui.layout.y
    @Nullable
    public Object c() {
        return this.f40039w.c();
    }

    @Override // androidx.compose.ui.unit.d
    public float getDensity() {
        return this.f40039w.getDensity();
    }

    @Override // androidx.compose.ui.layout.z
    @NotNull
    public androidx.compose.ui.unit.w getLayoutDirection() {
        return this.f40039w.getLayoutDirection();
    }

    @Override // androidx.compose.ui.node.u0, androidx.compose.ui.node.b1
    @NotNull
    public l0 i4() {
        return this.f40039w.i4();
    }

    public final int k3(@NotNull androidx.compose.ui.layout.a aVar) {
        return this.f40038p1.r(aVar, Integer.MIN_VALUE);
    }

    @Override // androidx.compose.ui.node.u0
    @NotNull
    public androidx.compose.ui.layout.b1 l2() {
        androidx.compose.ui.layout.b1 b1Var = this.f40037p0;
        if (b1Var != null) {
            return b1Var;
        }
        s0.a.j("LookaheadDelegate has not been measured yet when measureResult is requested.");
        throw new kotlin.a0();
    }

    @Override // androidx.compose.ui.unit.n
    public float m0() {
        return this.f40039w.m0();
    }

    @NotNull
    protected final androidx.collection.f2<androidx.compose.ui.layout.a> m3() {
        return this.f40038p1;
    }

    @Override // androidx.compose.ui.node.u0
    @NotNull
    public androidx.compose.ui.layout.g0 n() {
        return this.Z;
    }

    public final long n3() {
        return g1();
    }

    @NotNull
    public final k1 o3() {
        return this.f40039w;
    }

    public int p0(int i10) {
        k1 k1VarY4 = this.f40039w.Y4();
        Intrinsics.checkNotNull(k1VarY4);
        v0 v0VarN4 = k1VarY4.N4();
        Intrinsics.checkNotNull(v0VarN4);
        return v0VarN4.p0(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.i2
    public final void p1(long j10, float f10, @Nullable Function1<? super androidx.compose.ui.graphics.r1, Unit> function1) {
        A3(j10);
        if (K2()) {
            return;
        }
        z3();
    }

    @NotNull
    public final androidx.compose.ui.layout.u0 p3() {
        return this.Z;
    }

    @Override // androidx.compose.ui.node.u0
    @Nullable
    public u0 q2() {
        k1 k1VarA5 = this.f40039w.a5();
        if (k1VarA5 != null) {
            return k1VarA5.N4();
        }
        return null;
    }

    public final long s3() {
        return androidx.compose.ui.unit.u.e((((long) h1()) << 32) | (((long) c1()) & com.rabbitmq.client.k0.f265952a));
    }

    @Override // androidx.compose.ui.node.u0
    public long u2() {
        return this.X;
    }

    @NotNull
    public final androidx.compose.ui.layout.i2 v3(long j10, @NotNull Function0<? extends androidx.compose.ui.layout.b1> function0) {
        s1(j10);
        G3(function0.invoke());
        return this;
    }

    protected void z3() {
        l2().y();
    }
}
