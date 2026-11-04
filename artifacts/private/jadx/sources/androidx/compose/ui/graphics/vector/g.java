package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.graphics.i0;
import androidx.compose.ui.graphics.k2;
import androidx.compose.ui.graphics.s2;
import java.util.List;
import kotlin.f0;
import kotlin.g0;
import kotlin.j0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/PathComponent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,645:1\n1#2:646\n*E\n"})
public final class g extends l {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f38401x = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private String f38402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private i0 f38403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f38404e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private List<? extends h> f38405f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f38406g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f38407h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f38408i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private i0 f38409j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f38410k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f38411l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f38412m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f38413n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f38414o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f38415p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f38416q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f38417r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f38418s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.graphics.drawscope.n f38419t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    private final k2 f38420u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private k2 f38421v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private final f0 f38422w;

    static final class a extends l0 implements Function0<s2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f38423a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final s2 invoke() {
            return androidx.compose.ui.graphics.t.a();
        }
    }

    public g() {
        super(null);
        this.f38402c = "";
        this.f38404e = 1.0f;
        this.f38405f = s.h();
        this.f38406g = s.c();
        this.f38407h = 1.0f;
        this.f38410k = s.d();
        this.f38411l = s.e();
        this.f38412m = 4.0f;
        this.f38414o = 1.0f;
        this.f38416q = true;
        this.f38417r = true;
        k2 k2VarA = androidx.compose.ui.graphics.u.a();
        this.f38420u = k2VarA;
        this.f38421v = k2VarA;
        this.f38422w = g0.b(j0.NONE, a.f38423a);
    }

    private final void H() {
        k.d(this.f38405f, this.f38420u);
        I();
    }

    private final void I() {
        if (this.f38413n == 0.0f && this.f38414o == 1.0f) {
            this.f38421v = this.f38420u;
            return;
        }
        if (Intrinsics.areEqual(this.f38421v, this.f38420u)) {
            this.f38421v = androidx.compose.ui.graphics.u.a();
        } else {
            int iX = this.f38421v.x();
            this.f38421v.P();
            this.f38421v.M(iX);
        }
        j().d(this.f38420u, false);
        float length = j().getLength();
        float f10 = this.f38413n;
        float f11 = this.f38415p;
        float f12 = ((f10 + f11) % 1.0f) * length;
        float f13 = ((this.f38414o + f11) % 1.0f) * length;
        if (f12 <= f13) {
            j().b(f12, f13, this.f38421v, true);
        } else {
            j().b(f12, length, this.f38421v, true);
            j().b(0.0f, f13, this.f38421v, true);
        }
    }

    private final s2 j() {
        return (s2) this.f38422w.getValue();
    }

    public final void A(int i10) {
        this.f38410k = i10;
        this.f38417r = true;
        c();
    }

    public final void B(int i10) {
        this.f38411l = i10;
        this.f38417r = true;
        c();
    }

    public final void C(float f10) {
        this.f38412m = f10;
        this.f38417r = true;
        c();
    }

    public final void D(float f10) {
        this.f38408i = f10;
        this.f38417r = true;
        c();
    }

    public final void E(float f10) {
        this.f38414o = f10;
        this.f38418s = true;
        c();
    }

    public final void F(float f10) {
        this.f38415p = f10;
        this.f38418s = true;
        c();
    }

    public final void G(float f10) {
        this.f38413n = f10;
        this.f38418s = true;
        c();
    }

    @Override // androidx.compose.ui.graphics.vector.l
    public void a(@NotNull androidx.compose.ui.graphics.drawscope.f fVar) {
        androidx.compose.ui.graphics.drawscope.n nVar;
        if (this.f38416q) {
            H();
        } else if (this.f38418s) {
            I();
        }
        this.f38416q = false;
        this.f38418s = false;
        i0 i0Var = this.f38403d;
        if (i0Var != null) {
            androidx.compose.ui.graphics.drawscope.f.L3(fVar, this.f38421v, i0Var, this.f38404e, null, null, 0, 56, null);
        }
        i0 i0Var2 = this.f38409j;
        if (i0Var2 != null) {
            androidx.compose.ui.graphics.drawscope.n nVar2 = this.f38419t;
            if (this.f38417r || nVar2 == null) {
                androidx.compose.ui.graphics.drawscope.n nVar3 = new androidx.compose.ui.graphics.drawscope.n(this.f38408i, this.f38412m, this.f38410k, this.f38411l, null, 16, null);
                this.f38419t = nVar3;
                this.f38417r = false;
                nVar = nVar3;
            } else {
                nVar = nVar2;
            }
            androidx.compose.ui.graphics.drawscope.f.L3(fVar, this.f38421v, i0Var2, this.f38407h, nVar, null, 0, 48, null);
        }
    }

    @Nullable
    public final i0 e() {
        return this.f38403d;
    }

    public final float f() {
        return this.f38404e;
    }

    @NotNull
    public final String g() {
        return this.f38402c;
    }

    @NotNull
    public final List<h> h() {
        return this.f38405f;
    }

    public final int i() {
        return this.f38406g;
    }

    @Nullable
    public final i0 k() {
        return this.f38409j;
    }

    public final float l() {
        return this.f38407h;
    }

    public final int m() {
        return this.f38410k;
    }

    public final int n() {
        return this.f38411l;
    }

    public final float o() {
        return this.f38412m;
    }

    public final float p() {
        return this.f38408i;
    }

    public final float q() {
        return this.f38414o;
    }

    public final float r() {
        return this.f38415p;
    }

    public final float s() {
        return this.f38413n;
    }

    public final void t(@Nullable i0 i0Var) {
        this.f38403d = i0Var;
        c();
    }

    @NotNull
    public String toString() {
        return this.f38420u.toString();
    }

    public final void u(float f10) {
        this.f38404e = f10;
        c();
    }

    public final void v(@NotNull String str) {
        this.f38402c = str;
        c();
    }

    public final void w(@NotNull List<? extends h> list) {
        this.f38405f = list;
        this.f38416q = true;
        c();
    }

    public final void x(int i10) {
        this.f38406g = i10;
        this.f38421v.M(i10);
        c();
    }

    public final void y(@Nullable i0 i0Var) {
        this.f38409j = i0Var;
        c();
    }

    public final void z(float f10) {
        this.f38407h = f10;
        c();
    }
}
