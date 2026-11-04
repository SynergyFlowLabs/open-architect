package androidx.compose.material3;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
final class t80 implements androidx.compose.ui.graphics.q3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3<androidx.compose.ui.graphics.c2> f33161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.graphics.q3 f33162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.graphics.q3 f33163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.graphics.k2 f33164d = androidx.compose.ui.graphics.u.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.graphics.k2 f33165e = androidx.compose.ui.graphics.u.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.graphics.k2 f33166f = androidx.compose.ui.graphics.u.a();

    public t80(@NotNull androidx.compose.runtime.n3<androidx.compose.ui.graphics.c2> n3Var, @NotNull androidx.compose.ui.graphics.q3 q3Var, @NotNull androidx.compose.ui.graphics.q3 q3Var2) {
        this.f33161a = n3Var;
        this.f33162b = q3Var;
        this.f33163c = q3Var2;
    }

    @NotNull
    public final androidx.compose.ui.graphics.k2 a() {
        return this.f33166f;
    }

    @NotNull
    public final androidx.compose.ui.graphics.k2 b() {
        return this.f33165e;
    }

    @NotNull
    public final androidx.compose.ui.graphics.k2 c() {
        return this.f33164d;
    }

    @Override // androidx.compose.ui.graphics.q3
    @NotNull
    /* JADX INFO: renamed from: createOutline-Pq9zytI */
    public androidx.compose.ui.graphics.f2 mo0createOutlinePq9zytI(long j10, @NotNull androidx.compose.ui.unit.w wVar, @NotNull androidx.compose.ui.unit.d dVar) {
        this.f33164d.reset();
        this.f33165e.reset();
        this.f33166f.reset();
        androidx.compose.ui.graphics.f2 f2VarMo0createOutlinePq9zytI = this.f33162b.mo0createOutlinePq9zytI(j10, wVar, dVar);
        androidx.compose.ui.graphics.f2 f2VarMo0createOutlinePq9zytI2 = this.f33163c.mo0createOutlinePq9zytI(j10, wVar, dVar);
        if (f2VarMo0createOutlinePq9zytI instanceof androidx.compose.ui.graphics.f2.a) {
            androidx.compose.ui.graphics.k2.y(this.f33164d, ((androidx.compose.ui.graphics.f2.a) f2VarMo0createOutlinePq9zytI).b(), 0L, 2, null);
        } else if (f2VarMo0createOutlinePq9zytI instanceof androidx.compose.ui.graphics.f2.c) {
            androidx.compose.ui.graphics.k2.S(this.f33164d, ((androidx.compose.ui.graphics.f2.c) f2VarMo0createOutlinePq9zytI).b(), null, 2, null);
        } else {
            if (!(f2VarMo0createOutlinePq9zytI instanceof androidx.compose.ui.graphics.f2.b)) {
                throw new kotlin.k0();
            }
            androidx.compose.ui.graphics.k2.g(this.f33164d, ((androidx.compose.ui.graphics.f2.b) f2VarMo0createOutlinePq9zytI).b(), null, 2, null);
        }
        if (f2VarMo0createOutlinePq9zytI2 instanceof androidx.compose.ui.graphics.f2.a) {
            androidx.compose.ui.graphics.k2.y(this.f33166f, ((androidx.compose.ui.graphics.f2.a) f2VarMo0createOutlinePq9zytI2).b(), 0L, 2, null);
        } else if (f2VarMo0createOutlinePq9zytI2 instanceof androidx.compose.ui.graphics.f2.c) {
            androidx.compose.ui.graphics.k2.S(this.f33166f, ((androidx.compose.ui.graphics.f2.c) f2VarMo0createOutlinePq9zytI2).b(), null, 2, null);
        } else {
            if (!(f2VarMo0createOutlinePq9zytI2 instanceof androidx.compose.ui.graphics.f2.b)) {
                throw new kotlin.k0();
            }
            androidx.compose.ui.graphics.k2.g(this.f33166f, ((androidx.compose.ui.graphics.f2.b) f2VarMo0createOutlinePq9zytI2).b(), null, 2, null);
        }
        this.f33166f.a(this.f33161a.getValue().A());
        this.f33165e.X(this.f33164d, this.f33166f, androidx.compose.ui.graphics.t2.f38235b.d());
        return new androidx.compose.ui.graphics.f2.a(this.f33165e);
    }
}
