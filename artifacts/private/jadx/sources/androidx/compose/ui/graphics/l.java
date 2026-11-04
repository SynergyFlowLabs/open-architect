package androidx.compose.ui.graphics;

import android.graphics.Paint;
import android.graphics.Shader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private Paint f37834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f37835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Shader f37836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private r0 f37837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private l2 f37838e;

    public l(@NotNull Paint paint) {
        this.f37834a = paint;
        this.f37835b = d0.f37693b.B();
    }

    @Override // androidx.compose.ui.graphics.h2
    public void A(int i10) {
        m.v(this.f37834a, i10);
    }

    @Override // androidx.compose.ui.graphics.h2
    public int B() {
        return m.h(this.f37834a);
    }

    @Override // androidx.compose.ui.graphics.h2
    public float C() {
        return m.i(this.f37834a);
    }

    @Override // androidx.compose.ui.graphics.h2
    @NotNull
    public Paint D() {
        return this.f37834a;
    }

    @Override // androidx.compose.ui.graphics.h2
    public void E(float f10) {
        m.w(this.f37834a, f10);
    }

    @Override // androidx.compose.ui.graphics.h2
    public boolean F() {
        return m.d(this.f37834a);
    }

    @Override // androidx.compose.ui.graphics.h2
    public void G(int i10) {
        m.y(this.f37834a, i10);
    }

    @Override // androidx.compose.ui.graphics.h2
    public void H(float f10) {
        m.x(this.f37834a, f10);
    }

    @Override // androidx.compose.ui.graphics.h2
    public float I() {
        return m.j(this.f37834a);
    }

    @Override // androidx.compose.ui.graphics.h2
    public int J() {
        return m.k(this.f37834a);
    }

    @Override // androidx.compose.ui.graphics.h2
    public void K(@Nullable l2 l2Var) {
        m.s(this.f37834a, l2Var);
        this.f37838e = l2Var;
    }

    @Override // androidx.compose.ui.graphics.h2
    @Nullable
    public l2 L() {
        return this.f37838e;
    }

    @Override // androidx.compose.ui.graphics.h2
    public void M(@Nullable Shader shader) {
        this.f37836c = shader;
        m.t(this.f37834a, shader);
    }

    @Override // androidx.compose.ui.graphics.h2
    public int N() {
        return m.f(this.f37834a);
    }

    @Override // androidx.compose.ui.graphics.h2
    public void S(long j10) {
        m.p(this.f37834a, j10);
    }

    @Override // androidx.compose.ui.graphics.h2
    @Nullable
    public r0 e() {
        return this.f37837d;
    }

    @Override // androidx.compose.ui.graphics.h2
    public void f(@Nullable r0 r0Var) {
        this.f37837d = r0Var;
        m.q(this.f37834a, r0Var);
    }

    @Override // androidx.compose.ui.graphics.h2
    public float r() {
        return m.c(this.f37834a);
    }

    @Override // androidx.compose.ui.graphics.h2
    public void s(int i10) {
        if (!d0.G(this.f37835b, i10)) {
            this.f37835b = i10;
            m.o(this.f37834a, i10);
        }
    }

    @Override // androidx.compose.ui.graphics.h2
    public void setAlpha(float f10) {
        m.m(this.f37834a, f10);
    }

    @Override // androidx.compose.ui.graphics.h2
    public int t() {
        return this.f37835b;
    }

    @Override // androidx.compose.ui.graphics.h2
    public long u() {
        return m.e(this.f37834a);
    }

    @Override // androidx.compose.ui.graphics.h2
    @Nullable
    public Shader v() {
        return this.f37836c;
    }

    @Override // androidx.compose.ui.graphics.h2
    public void w(boolean z10) {
        m.n(this.f37834a, z10);
    }

    @Override // androidx.compose.ui.graphics.h2
    public void x(int i10) {
        m.u(this.f37834a, i10);
    }

    @Override // androidx.compose.ui.graphics.h2
    public void y(int i10) {
        m.r(this.f37834a, i10);
    }

    @Override // androidx.compose.ui.graphics.h2
    public int z() {
        return m.g(this.f37834a);
    }

    public l() {
        this(m.l());
    }
}
