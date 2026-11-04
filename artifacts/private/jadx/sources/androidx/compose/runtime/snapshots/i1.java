package androidx.compose.runtime.snapshots;

import androidx.collection.l2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class i1 extends e {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f36504z = 8;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    private final e f36505t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final boolean f36506u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final boolean f36507v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    private Function1<Object, Unit> f36508w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    private Function1<Object, Unit> f36509x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final long f36510y;

    public i1(@Nullable e eVar, @Nullable Function1<Object, Unit> function1, @Nullable Function1<Object, Unit> function2, boolean z10, boolean z11) {
        Function1<Object, Unit> function1R;
        Function1<Object, Unit> function1L;
        super(b0.f36443b, v.f36597e.a(), b0.U(function1, (eVar == null || (function1L = eVar.l()) == null) ? b0.f36452k.l() : function1L, z10), b0.X(function2, (eVar == null || (function1R = eVar.r()) == null) ? b0.f36452k.r() : function1R));
        this.f36505t = eVar;
        this.f36506u = z10;
        this.f36507v = z11;
        this.f36508w = super.l();
        this.f36509x = super.r();
        this.f36510y = androidx.compose.runtime.internal.a1.a();
    }

    private final e k0() {
        e eVar = this.f36505t;
        if (eVar == null) {
            eVar = b0.f36452k;
        }
        return eVar;
    }

    @Override // androidx.compose.runtime.snapshots.m
    public void D(@NotNull v vVar) {
        m0.b();
        throw new kotlin.a0();
    }

    @Override // androidx.compose.runtime.snapshots.m
    public void E(long j10) {
        m0.b();
        throw new kotlin.a0();
    }

    @Override // androidx.compose.runtime.snapshots.e, androidx.compose.runtime.snapshots.m
    public void F(int i10) {
        k0().F(i10);
    }

    @Override // androidx.compose.runtime.snapshots.e, androidx.compose.runtime.snapshots.m
    @NotNull
    public m G(@Nullable Function1<Object, Unit> function1) {
        Function1<Object, Unit> function1V = b0.V(function1, l(), false, 4, null);
        return !this.f36506u ? b0.J(k0().G(null), function1V, true) : k0().G(function1V);
    }

    @Override // androidx.compose.runtime.snapshots.e
    @NotNull
    public o P() {
        return k0().P();
    }

    @Override // androidx.compose.runtime.snapshots.e, androidx.compose.runtime.snapshots.m
    @Nullable
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public Function1<Object, Unit> l() {
        return this.f36508w;
    }

    @Override // androidx.compose.runtime.snapshots.e, androidx.compose.runtime.snapshots.m
    public void d() {
        e eVar;
        C(true);
        if (this.f36507v && (eVar = this.f36505t) != null) {
            eVar.d();
        }
    }

    @Override // androidx.compose.runtime.snapshots.e
    public void d0(@Nullable l2<c1> l2Var) {
        m0.b();
        throw new kotlin.a0();
    }

    @Override // androidx.compose.runtime.snapshots.e
    @NotNull
    public e g0(@Nullable Function1<Object, Unit> function1, @Nullable Function1<Object, Unit> function2) {
        Function1<Object, Unit> function1V = b0.V(function1, l(), false, 4, null);
        Function1<Object, Unit> function1X = b0.X(function2, r());
        return !this.f36506u ? new i1(k0().g0(null, function1X), function1V, function1X, false, true) : k0().g0(function1V, function1X);
    }

    @Override // androidx.compose.runtime.snapshots.m
    @NotNull
    public v i() {
        return k0().i();
    }

    @Override // androidx.compose.runtime.snapshots.e, androidx.compose.runtime.snapshots.m
    @Nullable
    public l2<c1> j() {
        return k0().j();
    }

    public final long l0() {
        return this.f36510y;
    }

    @Override // androidx.compose.runtime.snapshots.e, androidx.compose.runtime.snapshots.m
    @NotNull
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public Void v(@NotNull m mVar) {
        m0.b();
        throw new kotlin.a0();
    }

    @Override // androidx.compose.runtime.snapshots.e, androidx.compose.runtime.snapshots.m
    public boolean n() {
        return k0().n();
    }

    @Override // androidx.compose.runtime.snapshots.e, androidx.compose.runtime.snapshots.m
    @NotNull
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public Void w(@NotNull m mVar) {
        m0.b();
        throw new kotlin.a0();
    }

    public void o0(@Nullable Function1<Object, Unit> function1) {
        this.f36508w = function1;
    }

    @Override // androidx.compose.runtime.snapshots.m
    public long p() {
        return k0().p();
    }

    public void p0(@Nullable Function1<Object, Unit> function1) {
        this.f36509x = function1;
    }

    @Override // androidx.compose.runtime.snapshots.e, androidx.compose.runtime.snapshots.m
    public int q() {
        return k0().q();
    }

    @Override // androidx.compose.runtime.snapshots.e, androidx.compose.runtime.snapshots.m
    @Nullable
    public Function1<Object, Unit> r() {
        return this.f36509x;
    }

    @Override // androidx.compose.runtime.snapshots.e, androidx.compose.runtime.snapshots.m
    public boolean s() {
        return k0().s();
    }

    @Override // androidx.compose.runtime.snapshots.e, androidx.compose.runtime.snapshots.m
    public void x() {
        k0().x();
    }

    @Override // androidx.compose.runtime.snapshots.e, androidx.compose.runtime.snapshots.m
    public void y(@NotNull c1 c1Var) {
        k0().y(c1Var);
    }
}
