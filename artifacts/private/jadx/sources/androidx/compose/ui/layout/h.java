package androidx.compose.ui.layout;

import androidx.compose.runtime.k7;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nApproachMeasureScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApproachMeasureScope.kt\nandroidx/compose/ui/layout/ApproachMeasureScopeImpl\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegateKt\n*L\n1#1,117:1\n115#2,5:118\n115#2,5:126\n57#2,2:132\n60#2:136\n1#3:123\n30#4:124\n80#5:125\n394#6:131\n395#6,2:134\n398#6:137\n*S KotlinDebug\n*F\n+ 1 ApproachMeasureScope.kt\nandroidx/compose/ui/layout/ApproachMeasureScopeImpl\n*L\n59#1:118,5\n79#1:126,5\n99#1:132,2\n99#1:136\n64#1:124\n64#1:125\n99#1:131\n99#1:134,2\n99#1:137\n*E\n"})
public final class h implements g, c1, w0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f39344d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.node.h0 f39345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private e f39346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f39347c;

    public static final class a implements b1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f39348a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f39349b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map<androidx.compose.ui.layout.a, Integer> f39350c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Function1<v2, Unit> f39351d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<i2.a, Unit> f39352e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ h f39353f;

        /* JADX WARN: Multi-variable type inference failed */
        a(int i10, int i11, Map<androidx.compose.ui.layout.a, Integer> map, Function1<? super v2, Unit> function1, Function1<? super i2.a, Unit> function2, h hVar) {
            this.f39352e = function2;
            this.f39353f = hVar;
            this.f39348a = i10;
            this.f39349b = i11;
            this.f39350c = map;
            this.f39351d = function1;
        }

        public static /* synthetic */ void a() {
        }

        @Override // androidx.compose.ui.layout.b1
        public int getHeight() {
            return this.f39349b;
        }

        @Override // androidx.compose.ui.layout.b1
        public int getWidth() {
            return this.f39348a;
        }

        @Override // androidx.compose.ui.layout.b1
        public Function1<v2, Unit> j() {
            return this.f39351d;
        }

        @Override // androidx.compose.ui.layout.b1
        public Map<androidx.compose.ui.layout.a, Integer> x() {
            return this.f39350c;
        }

        @Override // androidx.compose.ui.layout.b1
        public void y() {
            this.f39352e.invoke(this.f39353f.q0().t2());
        }
    }

    public h(@NotNull androidx.compose.ui.node.h0 h0Var, @NotNull e eVar) {
        this.f39345a = h0Var;
        this.f39346b = eVar;
    }

    @Override // androidx.compose.ui.unit.d
    @k7
    public long C0(long j10) {
        return this.f39345a.C0(j10);
    }

    @Override // androidx.compose.ui.layout.c
    public long C4() {
        androidx.compose.ui.unit.b bVarH8 = this.f39345a.h8();
        if (bVarH8 != null) {
            return bVarH8.x();
        }
        s0.a.h("Error: Lookahead constraints requested before lookahead measure.");
        throw new kotlin.a0();
    }

    @Override // androidx.compose.ui.unit.d
    @k7
    public float D3(int i10) {
        return this.f39345a.D3(i10);
    }

    @Override // androidx.compose.ui.unit.d
    @k7
    public float F3(float f10) {
        return this.f39345a.F3(f10);
    }

    @Override // androidx.compose.ui.layout.w0
    @NotNull
    public g0 K(@NotNull g0 g0Var) {
        u0 u0VarP3;
        if (g0Var instanceof u0) {
            return g0Var;
        }
        if (g0Var instanceof androidx.compose.ui.node.k1) {
            androidx.compose.ui.node.v0 v0VarN4 = ((androidx.compose.ui.node.k1) g0Var).N4();
            return (v0VarN4 == null || (u0VarP3 = v0VarN4.p3()) == null) ? g0Var : u0VarP3;
        }
        s0.a.h("Unsupported LayoutCoordinates");
        throw new kotlin.a0();
    }

    @Override // androidx.compose.ui.layout.w0
    @NotNull
    public g0 N(@NotNull i2.a aVar) {
        androidx.compose.ui.node.k1 k1VarE0;
        androidx.compose.ui.node.l0 l0VarT0 = this.f39345a.i4().t0();
        if (l0VarT0 == null) {
            s0.a.h("Error: Requesting LookaheadScopeCoordinates is not permitted from outside of a LookaheadScope.");
            throw new kotlin.a0();
        }
        if (!l0VarT0.k1()) {
            return l0VarT0.F0();
        }
        androidx.compose.ui.node.l0 l0VarJ0 = l0VarT0.J0();
        return (l0VarJ0 == null || (k1VarE0 = l0VarJ0.e0()) == null) ? l0VarT0.Z().get(0).F0() : k1VarE0;
    }

    @Override // androidx.compose.ui.unit.d
    @k7
    @NotNull
    public n0.j N3(@NotNull androidx.compose.ui.unit.k kVar) {
        return this.f39345a.N3(kVar);
    }

    @Override // androidx.compose.ui.layout.z
    public boolean P5() {
        return false;
    }

    @Override // androidx.compose.ui.layout.c1
    @NotNull
    public b1 S6(int i10, int i11, @NotNull Map<androidx.compose.ui.layout.a, Integer> map, @NotNull Function1<? super i2.a, Unit> function1) {
        return this.f39345a.S6(i10, i11, map, function1);
    }

    @Override // androidx.compose.ui.unit.d
    @k7
    public float S7(float f10) {
        return this.f39345a.S7(f10);
    }

    @Override // androidx.compose.ui.unit.d
    @k7
    public int c8(long j10) {
        return this.f39345a.c8(j10);
    }

    @Override // androidx.compose.ui.unit.n
    @k7
    public long d0(float f10) {
        return this.f39345a.d0(f10);
    }

    @Override // androidx.compose.ui.layout.c1
    @NotNull
    public b1 f8(int i10, int i11, @NotNull Map<androidx.compose.ui.layout.a, Integer> map, @Nullable Function1<? super v2, Unit> function1, @NotNull Function1<? super i2.a, Unit> function2) {
        if (!((i10 & (-16777216)) == 0 && ((-16777216) & i11) == 0)) {
            s0.a.i("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new a(i10, i11, map, function1, function2, this);
    }

    @Override // androidx.compose.ui.unit.d
    @k7
    public int g6(float f10) {
        return this.f39345a.g6(f10);
    }

    @Override // androidx.compose.ui.unit.d
    public float getDensity() {
        return this.f39345a.getDensity();
    }

    @Override // androidx.compose.ui.layout.z
    @NotNull
    public androidx.compose.ui.unit.w getLayoutDirection() {
        return this.f39345a.getLayoutDirection();
    }

    @Override // androidx.compose.ui.unit.d
    @k7
    public long j1(int i10) {
        return this.f39345a.j1(i10);
    }

    @Override // androidx.compose.ui.unit.d
    @k7
    public long k4(long j10) {
        return this.f39345a.k4(j10);
    }

    @Override // androidx.compose.ui.unit.n
    public float m0() {
        return this.f39345a.m0();
    }

    @Override // androidx.compose.ui.unit.d
    @k7
    public long m1(float f10) {
        return this.f39345a.m1(f10);
    }

    public final boolean n0() {
        return this.f39347c;
    }

    @NotNull
    public final e p0() {
        return this.f39346b;
    }

    @Override // androidx.compose.ui.unit.d
    @k7
    public float p6(long j10) {
        return this.f39345a.p6(j10);
    }

    @NotNull
    public final androidx.compose.ui.node.h0 q0() {
        return this.f39345a;
    }

    public final void r0(boolean z10) {
        this.f39347c = z10;
    }

    public final void s0(@NotNull e eVar) {
        this.f39346b = eVar;
    }

    @Override // androidx.compose.ui.layout.c
    public long s2() {
        androidx.compose.ui.node.v0 v0VarN4 = this.f39345a.N4();
        Intrinsics.checkNotNull(v0VarN4);
        b1 b1VarL2 = v0VarN4.l2();
        return androidx.compose.ui.unit.u.e((((long) b1VarL2.getWidth()) << 32) | (((long) b1VarL2.getHeight()) & com.rabbitmq.client.k0.f265952a));
    }

    @Override // androidx.compose.ui.unit.n
    @k7
    public float y(long j10) {
        return this.f39345a.y(j10);
    }
}
