package klipper;

import com.devtodev.core.data.consts.RequestParams;
import io.ktor.http.t1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final k f312263a = new k(0, 0, 3, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final k f312264b = new k(0, 0, 3, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final k f312265c = new k(0, 0, 3, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final k f312266d = new k(0, 0, 3, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f312267e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private z f312268f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private h f312269g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f312270h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f312271i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f312272j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f312273k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b0 f312274l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b0 f312275m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private b0 f312276n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    private b0 f312277o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    private b0 f312278p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    private b0 f312279q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    private b0 f312280r;

    public final void A(@Nullable b0 b0Var) {
        this.f312276n = b0Var;
    }

    public final void B(@Nullable b0 b0Var) {
        this.f312279q = b0Var;
    }

    public final void C(int i10) {
        this.f312273k = i10;
    }

    public final void D(@Nullable z zVar) {
        this.f312268f = zVar;
    }

    public final void E(@NotNull b0 b0Var) {
        Intrinsics.checkNotNullParameter(b0Var, "<set-?>");
        this.f312275m = b0Var;
    }

    public final void F(@Nullable b0 b0Var) {
        this.f312278p = b0Var;
    }

    public final void G(@Nullable b0 b0Var) {
        this.f312280r = b0Var;
    }

    public final void H(@Nullable h hVar) {
        this.f312269g = hVar;
    }

    public final void I(int i10) {
        this.f312271i = i10;
    }

    public final void J(int i10) {
        this.f312272j = i10;
    }

    public final void K(int i10) {
        this.f312270h = i10;
    }

    @NotNull
    public final k a() {
        return this.f312263a;
    }

    @NotNull
    public final k b() {
        return this.f312264b;
    }

    @NotNull
    public final k c() {
        return this.f312266d;
    }

    public final double d() {
        return this.f312267e;
    }

    @NotNull
    public final b0 e() {
        b0 b0Var = this.f312274l;
        if (b0Var != null) {
            return b0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException(t1.b.f296120h);
        int i10 = 7 & 0;
        return null;
    }

    @Nullable
    public final b0 f() {
        return this.f312277o;
    }

    @Nullable
    public final b0 g() {
        return this.f312276n;
    }

    @Nullable
    public final b0 h() {
        return this.f312279q;
    }

    public final int i() {
        return this.f312273k;
    }

    @Nullable
    public final z j() {
        return this.f312268f;
    }

    @NotNull
    public final b0 k() {
        b0 b0Var = this.f312275m;
        if (b0Var != null) {
            return b0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException(RequestParams.PREV);
        return null;
    }

    @Nullable
    public final b0 l() {
        return this.f312278p;
    }

    @Nullable
    public final b0 m() {
        return this.f312280r;
    }

    @Nullable
    public final h n() {
        return this.f312269g;
    }

    @NotNull
    public final k o() {
        return this.f312265c;
    }

    public final int p() {
        return this.f312271i;
    }

    public final int q() {
        return this.f312272j;
    }

    public final int r() {
        return this.f312270h;
    }

    public final void s(@NotNull z polyType) {
        Intrinsics.checkNotNullParameter(polyType, "polyType");
        if (this.f312264b.f() >= e().f312264b.f()) {
            this.f312263a.j(this.f312264b);
            this.f312265c.j(e().f312264b);
        } else {
            this.f312265c.j(this.f312264b);
            this.f312263a.j(e().f312264b);
        }
        w();
        this.f312268f = polyType;
    }

    public final void t(@NotNull b0 eNext, @NotNull b0 ePrev, @NotNull k pt) {
        Intrinsics.checkNotNullParameter(eNext, "eNext");
        Intrinsics.checkNotNullParameter(ePrev, "ePrev");
        Intrinsics.checkNotNullParameter(pt, "pt");
        y(eNext);
        E(ePrev);
        this.f312264b.j(pt);
        this.f312273k = -1;
    }

    public final boolean u() {
        return this.f312266d.f() == 0;
    }

    public final void v() {
        long jE = this.f312265c.e();
        this.f312265c.k(this.f312263a.e());
        this.f312263a.k(jE);
    }

    public final void w() {
        this.f312266d.k(this.f312265c.e() - this.f312263a.e());
        this.f312266d.l(this.f312265c.f() - this.f312263a.f());
        this.f312267e = this.f312266d.f() == 0 ? -3.4E38d : this.f312266d.e() / this.f312266d.f();
    }

    public final void x(double d10) {
        this.f312267e = d10;
    }

    public final void y(@NotNull b0 b0Var) {
        Intrinsics.checkNotNullParameter(b0Var, "<set-?>");
        this.f312274l = b0Var;
    }

    public final void z(@Nullable b0 b0Var) {
        this.f312277o = b0Var;
    }
}
