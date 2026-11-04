package androidx.compose.runtime.snapshots;

import androidx.collection.l2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class j1 extends m {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f36516o = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private final m f36517h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f36518i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f36519j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private Function1<Object, Unit> f36520k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private final Function1<Object, Unit> f36521l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f36522m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final m f36523n;

    public j1(@Nullable m mVar, @Nullable Function1<Object, Unit> function1, boolean z10, boolean z11) {
        Function1<Object, Unit> function1L;
        super(b0.f36443b, v.f36597e.a(), (DefaultConstructorMarker) null);
        this.f36517h = mVar;
        this.f36518i = z10;
        this.f36519j = z11;
        this.f36520k = b0.U(function1, (mVar == null || (function1L = mVar.l()) == null) ? b0.f36452k.l() : function1L, z10);
        this.f36522m = androidx.compose.runtime.internal.a1.a();
        this.f36523n = this;
    }

    private final m M() {
        m mVar = this.f36517h;
        if (mVar == null) {
            mVar = b0.f36452k;
        }
        return mVar;
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

    @Override // androidx.compose.runtime.snapshots.m
    @NotNull
    public m G(@Nullable Function1<Object, Unit> function1) {
        Function1<Object, Unit> function1V = b0.V(function1, l(), false, 4, null);
        return !this.f36518i ? b0.J(M().G(null), function1V, true) : M().G(function1V);
    }

    @Override // androidx.compose.runtime.snapshots.m
    @Nullable
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public Function1<Object, Unit> l() {
        return this.f36520k;
    }

    public final long O() {
        return this.f36522m;
    }

    @Override // androidx.compose.runtime.snapshots.m
    @NotNull
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public Void v(@NotNull m mVar) {
        m0.b();
        throw new kotlin.a0();
    }

    @Override // androidx.compose.runtime.snapshots.m
    @NotNull
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public Void w(@NotNull m mVar) {
        m0.b();
        throw new kotlin.a0();
    }

    public void R(@Nullable l2<c1> l2Var) {
        m0.b();
        throw new kotlin.a0();
    }

    public void S(@Nullable Function1<Object, Unit> function1) {
        this.f36520k = function1;
    }

    @Override // androidx.compose.runtime.snapshots.m
    public void d() {
        m mVar;
        C(true);
        if (!this.f36519j || (mVar = this.f36517h) == null) {
            return;
        }
        mVar.d();
    }

    @Override // androidx.compose.runtime.snapshots.m
    @NotNull
    public v i() {
        return M().i();
    }

    @Override // androidx.compose.runtime.snapshots.m
    @Nullable
    public l2<c1> j() {
        return M().j();
    }

    @Override // androidx.compose.runtime.snapshots.m
    public boolean n() {
        return M().n();
    }

    @Override // androidx.compose.runtime.snapshots.m
    @NotNull
    public m o() {
        return this.f36523n;
    }

    @Override // androidx.compose.runtime.snapshots.m
    public long p() {
        return M().p();
    }

    @Override // androidx.compose.runtime.snapshots.m
    @Nullable
    public Function1<Object, Unit> r() {
        return this.f36521l;
    }

    @Override // androidx.compose.runtime.snapshots.m
    public boolean s() {
        return M().s();
    }

    @Override // androidx.compose.runtime.snapshots.m
    public void x() {
        M().x();
    }

    @Override // androidx.compose.runtime.snapshots.m
    public void y(@NotNull c1 c1Var) {
        M().y(c1Var);
    }
}
