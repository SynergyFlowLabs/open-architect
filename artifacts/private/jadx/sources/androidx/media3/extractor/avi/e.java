package androidx.media3.extractor.avi;

import androidx.media3.common.util.k1;
import androidx.media3.extractor.p0;
import androidx.media3.extractor.q0;
import androidx.media3.extractor.s;
import androidx.media3.extractor.u0;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f67090o = 512;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f67091p = 1667497984;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f67092q = 1650720768;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f67093r = 1651965952;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f67094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u0 f67095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f67096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f67097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f67098e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f67099f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f67100g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f67101h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f67102i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f67103j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f67104k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f67105l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long[] f67106m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int[] f67107n;

    public e(int i10, d dVar, u0 u0Var) {
        this.f67094a = dVar;
        int iD = dVar.d();
        boolean z10 = true;
        if (iD != 1 && iD != 2) {
            z10 = false;
        }
        androidx.media3.common.util.a.a(z10);
        this.f67096c = d(i10, iD == 2 ? f67091p : f67093r);
        this.f67098e = dVar.a();
        this.f67095b = u0Var;
        this.f67097d = iD == 2 ? d(i10, f67092q) : -1;
        this.f67105l = -1L;
        this.f67106m = new long[512];
        this.f67107n = new int[512];
        this.f67099f = dVar.f67087e;
    }

    private static int d(int i10, int i11) {
        return (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48) | i11;
    }

    private long e(int i10) {
        return (this.f67098e * ((long) i10)) / ((long) this.f67099f);
    }

    private q0 h(int i10) {
        return new q0(((long) this.f67107n[i10]) * g(), this.f67106m[i10]);
    }

    public void a() {
        this.f67102i++;
    }

    public void b(long j10, boolean z10) {
        if (this.f67105l == -1) {
            this.f67105l = j10;
        }
        if (z10) {
            if (this.f67104k == this.f67107n.length) {
                long[] jArr = this.f67106m;
                this.f67106m = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                int[] iArr = this.f67107n;
                this.f67107n = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
            }
            long[] jArr2 = this.f67106m;
            int i10 = this.f67104k;
            jArr2[i10] = j10;
            this.f67107n[i10] = this.f67103j;
            this.f67104k = i10 + 1;
        }
        this.f67103j++;
    }

    public void c() {
        int i10;
        this.f67106m = Arrays.copyOf(this.f67106m, this.f67104k);
        this.f67107n = Arrays.copyOf(this.f67107n, this.f67104k);
        if (!k() || this.f67094a.f67089g == 0 || (i10 = this.f67104k) <= 0) {
            return;
        }
        this.f67099f = i10;
    }

    public long f() {
        return e(this.f67102i);
    }

    public long g() {
        return e(1);
    }

    public p0.a i(long j10) {
        if (this.f67104k == 0) {
            return new p0.a(new q0(0L, this.f67105l));
        }
        int iG = (int) (j10 / g());
        int iM = k1.m(this.f67107n, iG, true, true);
        if (this.f67107n[iM] == iG) {
            return new p0.a(h(iM));
        }
        q0 q0VarH = h(iM);
        int i10 = iM + 1;
        return i10 < this.f67106m.length ? new p0.a(q0VarH, h(i10)) : new p0.a(q0VarH);
    }

    public boolean j(int i10) {
        return this.f67096c == i10 || this.f67097d == i10;
    }

    public boolean k() {
        return (this.f67096c & f67093r) == f67093r;
    }

    public boolean l() {
        return Arrays.binarySearch(this.f67107n, this.f67102i) >= 0;
    }

    public boolean m() {
        return (this.f67096c & f67091p) == f67091p;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public boolean n(s sVar) throws IOException {
        int i10 = this.f67101h;
        int iF = i10 - this.f67095b.f(sVar, i10, false);
        this.f67101h = iF;
        boolean z10 = iF == 0;
        if (z10) {
            if (this.f67100g > 0) {
                this.f67095b.g(f(), l() ? 1 : 0, this.f67100g, 0, null);
            }
            a();
        }
        return z10;
    }

    public void o(int i10) {
        this.f67100g = i10;
        this.f67101h = i10;
    }

    public void p(long j10) {
        if (this.f67104k == 0) {
            this.f67102i = 0;
        } else {
            this.f67102i = this.f67107n[k1.n(this.f67106m, j10, true, true)];
        }
    }
}
