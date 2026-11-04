package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.graphics.c2;
import androidx.compose.ui.graphics.i0;
import androidx.compose.ui.graphics.k2;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.graphics.s3;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/GroupComponent\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,645:1\n635#2:646\n640#2:647\n249#3,8:648\n257#3:657\n259#3,4:663\n1#4:656\n35#5,5:658\n35#5,5:667\n*S KotlinDebug\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/GroupComponent\n*L\n409#1:646\n410#1:647\n608#1:648,8\n608#1:657\n608#1:663,4\n615#1:658,5\n621#1:667,5\n*E\n"})
public final class c extends l {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f38304u = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private float[] f38305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<l> f38306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f38307e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f38308f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private List<? extends h> f38309g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f38310h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private k2 f38311i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private Function1<? super l, Unit> f38312j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final Function1<l, Unit> f38313k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private String f38314l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f38315m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f38316n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f38317o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f38318p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f38319q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f38320r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f38321s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f38322t;

    static final class a extends l0 implements Function1<l, Unit> {
        a() {
            super(1);
        }

        public final void c(l lVar) {
            c.this.w(lVar);
            Function1<l, Unit> function1B = c.this.b();
            if (function1B != null) {
                function1B.invoke(lVar);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(l lVar) {
            c(lVar);
            return Unit.f312394a;
        }
    }

    public c() {
        super(null);
        this.f38306d = new ArrayList();
        this.f38307e = true;
        this.f38308f = q0.f38131b.u();
        this.f38309g = s.h();
        this.f38310h = true;
        this.f38313k = new a();
        this.f38314l = "";
        this.f38318p = 1.0f;
        this.f38319q = 1.0f;
        this.f38322t = true;
    }

    private final void I() {
        if (q()) {
            k2 k2VarA = this.f38311i;
            if (k2VarA == null) {
                k2VarA = androidx.compose.ui.graphics.u.a();
                this.f38311i = k2VarA;
            }
            k.d(this.f38309g, k2VarA);
        }
    }

    private final void J() {
        float[] fArrC = this.f38305c;
        if (fArrC == null) {
            fArrC = c2.c(null, 1, null);
            this.f38305c = fArrC;
        } else {
            c2.m(fArrC);
        }
        float[] fArr = fArrC;
        c2.z(fArr, this.f38316n + this.f38320r, this.f38317o + this.f38321s, 0.0f, 4, null);
        c2.r(fArr, this.f38315m);
        c2.s(fArr, this.f38318p, this.f38319q, 1.0f);
        c2.z(fArr, -this.f38316n, -this.f38317o, 0.0f, 4, null);
    }

    private final boolean q() {
        return !this.f38309g.isEmpty();
    }

    private final void t() {
        this.f38307e = false;
        this.f38308f = q0.f38131b.u();
    }

    private final void u(i0 i0Var) {
        if (this.f38307e && i0Var != null) {
            if (i0Var instanceof s3) {
                v(((s3) i0Var).c());
            } else {
                t();
            }
        }
    }

    private final void v(long j10) {
        if (this.f38307e && j10 != 16) {
            long j11 = this.f38308f;
            if (j11 == 16) {
                this.f38308f = j10;
            } else {
                if (s.i(j11, j10)) {
                    return;
                }
                t();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(l lVar) {
        if (lVar instanceof g) {
            g gVar = (g) lVar;
            u(gVar.e());
            u(gVar.k());
        } else if (lVar instanceof c) {
            c cVar = (c) lVar;
            if (cVar.f38307e && this.f38307e) {
                v(cVar.f38308f);
            } else {
                t();
            }
        }
    }

    public final void A(@NotNull String str) {
        this.f38314l = str;
        c();
    }

    public final void B(float f10) {
        this.f38316n = f10;
        this.f38322t = true;
        c();
    }

    public final void C(float f10) {
        this.f38317o = f10;
        this.f38322t = true;
        c();
    }

    public final void D(float f10) {
        this.f38315m = f10;
        this.f38322t = true;
        c();
    }

    public final void E(float f10) {
        this.f38318p = f10;
        this.f38322t = true;
        c();
    }

    public final void F(float f10) {
        this.f38319q = f10;
        this.f38322t = true;
        c();
    }

    public final void G(float f10) {
        this.f38320r = f10;
        this.f38322t = true;
        c();
    }

    public final void H(float f10) {
        this.f38321s = f10;
        this.f38322t = true;
        c();
    }

    @Override // androidx.compose.ui.graphics.vector.l
    public void a(@NotNull androidx.compose.ui.graphics.drawscope.f fVar) {
        if (this.f38322t) {
            J();
            this.f38322t = false;
        }
        if (this.f38310h) {
            I();
            this.f38310h = false;
        }
        androidx.compose.ui.graphics.drawscope.d dVarZ3 = fVar.Z3();
        long jD = dVarZ3.d();
        dVarZ3.f().save();
        try {
            androidx.compose.ui.graphics.drawscope.j jVarI = dVarZ3.i();
            float[] fArr = this.f38305c;
            if (fArr != null) {
                jVarI.a(c2.a(fArr).A());
            }
            k2 k2Var = this.f38311i;
            if (q() && k2Var != null) {
                androidx.compose.ui.graphics.drawscope.j.k(jVarI, k2Var, 0, 2, null);
            }
            List<l> list = this.f38306d;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                list.get(i10).a(fVar);
            }
            dVarZ3.f().B();
        } finally {
            dVarZ3.f().B();
            dVarZ3.g(jD);
        }
    }

    @Override // androidx.compose.ui.graphics.vector.l
    @Nullable
    public Function1<l, Unit> b() {
        return this.f38312j;
    }

    @Override // androidx.compose.ui.graphics.vector.l
    public void d(@Nullable Function1<? super l, Unit> function1) {
        this.f38312j = function1;
    }

    @NotNull
    public final List<h> f() {
        return this.f38309g;
    }

    @NotNull
    public final String g() {
        return this.f38314l;
    }

    public final int h() {
        return this.f38306d.size();
    }

    public final float i() {
        return this.f38316n;
    }

    public final float j() {
        return this.f38317o;
    }

    public final float k() {
        return this.f38315m;
    }

    public final float l() {
        return this.f38318p;
    }

    public final float m() {
        return this.f38319q;
    }

    public final long n() {
        return this.f38308f;
    }

    public final float o() {
        return this.f38320r;
    }

    public final float p() {
        return this.f38321s;
    }

    public final void r(int i10, @NotNull l lVar) {
        if (i10 < h()) {
            this.f38306d.set(i10, lVar);
        } else {
            this.f38306d.add(lVar);
        }
        w(lVar);
        lVar.d(this.f38313k);
        c();
    }

    public final boolean s() {
        return this.f38307e;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("VGroup: ");
        sb2.append(this.f38314l);
        List<l> list = this.f38306d;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            l lVar = list.get(i10);
            sb2.append("\t");
            sb2.append(lVar.toString());
            sb2.append("\n");
        }
        return sb2.toString();
    }

    public final void x(int i10, int i11, int i12) {
        int i13 = 0;
        if (i10 > i11) {
            while (i13 < i12) {
                l lVar = this.f38306d.get(i10);
                this.f38306d.remove(i10);
                this.f38306d.add(i11, lVar);
                i11++;
                i13++;
            }
        } else {
            while (i13 < i12) {
                l lVar2 = this.f38306d.get(i10);
                this.f38306d.remove(i10);
                this.f38306d.add(i11 - 1, lVar2);
                i13++;
            }
        }
        c();
    }

    public final void y(int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            if (i10 < this.f38306d.size()) {
                this.f38306d.get(i10).d(null);
                this.f38306d.remove(i10);
            }
        }
        c();
    }

    public final void z(@NotNull List<? extends h> list) {
        this.f38309g = list;
        this.f38310h = true;
        c();
    }
}
