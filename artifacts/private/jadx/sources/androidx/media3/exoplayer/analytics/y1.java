package androidx.media3.exoplayer.analytics;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class y1 implements g4 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final com.google.common.base.s0<String> f63126i = new com.google.common.base.s0() { // from class: androidx.media3.exoplayer.analytics.x1
        @Override // com.google.common.base.s0
        public final Object get() {
            return y1.n();
        }
    };

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Random f63127j = new Random();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f63128k = 12;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.media3.common.z3.d f63129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.media3.common.z3.b f63130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, a> f63131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.common.base.s0<String> f63132d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private g4.a f63133e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private androidx.media3.common.z3 f63134f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.p0
    private String f63135g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f63136h;

    private final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f63137a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f63138b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f63139c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private androidx.media3.exoplayer.source.t0.b f63140d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f63141e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f63142f;

        public a(String str, @androidx.annotation.p0 int i10, androidx.media3.exoplayer.source.t0.b bVar) {
            this.f63137a = str;
            this.f63138b = i10;
            this.f63139c = bVar == null ? -1L : bVar.f65470d;
            if (bVar == null || !bVar.c()) {
                return;
            }
            this.f63140d = bVar;
        }

        private int l(androidx.media3.common.z3 z3Var, androidx.media3.common.z3 z3Var2, int i10) {
            if (i10 >= z3Var.v()) {
                if (i10 < z3Var2.v()) {
                    return i10;
                }
                return -1;
            }
            z3Var.t(i10, y1.this.f63129a);
            for (int i11 = y1.this.f63129a.f62001n; i11 <= y1.this.f63129a.f62002o; i11++) {
                int iF = z3Var2.f(z3Var.s(i11));
                if (iF != -1) {
                    return z3Var2.j(iF, y1.this.f63130b).f61969c;
                }
            }
            return -1;
        }

        public boolean i(int i10, @androidx.annotation.p0 androidx.media3.exoplayer.source.t0.b bVar) {
            if (bVar == null) {
                return i10 == this.f63138b;
            }
            androidx.media3.exoplayer.source.t0.b bVar2 = this.f63140d;
            if (bVar2 == null) {
                return !bVar.c() && bVar.f65470d == this.f63139c;
            }
            return bVar.f65470d == bVar2.f65470d && bVar.f65468b == bVar2.f65468b && bVar.f65469c == bVar2.f65469c;
        }

        public boolean j(b.C0577b c0577b) {
            androidx.media3.exoplayer.source.t0.b bVar = c0577b.f62841d;
            if (bVar == null) {
                return this.f63138b != c0577b.f62840c;
            }
            long j10 = this.f63139c;
            if (j10 == -1) {
                return false;
            }
            if (bVar.f65470d > j10) {
                return true;
            }
            if (this.f63140d == null) {
                return false;
            }
            int iF = c0577b.f62839b.f(bVar.f65467a);
            int iF2 = c0577b.f62839b.f(this.f63140d.f65467a);
            androidx.media3.exoplayer.source.t0.b bVar2 = c0577b.f62841d;
            if (bVar2.f65470d < this.f63140d.f65470d || iF < iF2) {
                return false;
            }
            if (iF > iF2) {
                return true;
            }
            if (!bVar2.c()) {
                int i10 = c0577b.f62841d.f65471e;
                return i10 == -1 || i10 > this.f63140d.f65468b;
            }
            androidx.media3.exoplayer.source.t0.b bVar3 = c0577b.f62841d;
            int i11 = bVar3.f65468b;
            int i12 = bVar3.f65469c;
            androidx.media3.exoplayer.source.t0.b bVar4 = this.f63140d;
            int i13 = bVar4.f65468b;
            return i11 > i13 || (i11 == i13 && i12 > bVar4.f65469c);
        }

        public void k(int i10, @androidx.annotation.p0 androidx.media3.exoplayer.source.t0.b bVar) {
            if (this.f63139c != -1 || i10 != this.f63138b || bVar == null || bVar.f65470d < y1.this.o()) {
                return;
            }
            this.f63139c = bVar.f65470d;
        }

        public boolean m(androidx.media3.common.z3 z3Var, androidx.media3.common.z3 z3Var2) {
            int iL = l(z3Var, z3Var2, this.f63138b);
            this.f63138b = iL;
            if (iL == -1) {
                return false;
            }
            androidx.media3.exoplayer.source.t0.b bVar = this.f63140d;
            return bVar == null || z3Var2.f(bVar.f65467a) != -1;
        }
    }

    public y1() {
        this(f63126i);
    }

    private void m(a aVar) {
        if (aVar.f63139c != -1) {
            this.f63136h = aVar.f63139c;
        }
        this.f63135g = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String n() {
        byte[] bArr = new byte[12];
        f63127j.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long o() {
        a aVar = this.f63131c.get(this.f63135g);
        return (aVar == null || aVar.f63139c == -1) ? this.f63136h + 1 : aVar.f63139c;
    }

    private a p(int i10, @androidx.annotation.p0 androidx.media3.exoplayer.source.t0.b bVar) {
        a aVar = null;
        long j10 = Long.MAX_VALUE;
        for (a aVar2 : this.f63131c.values()) {
            aVar2.k(i10, bVar);
            if (aVar2.i(i10, bVar)) {
                long j11 = aVar2.f63139c;
                if (j11 == -1 || j11 < j10) {
                    aVar = aVar2;
                    j10 = j11;
                } else if (j11 == j10 && ((a) androidx.media3.common.util.k1.o(aVar)).f63140d != null && aVar2.f63140d != null) {
                    aVar = aVar2;
                }
            }
        }
        if (aVar != null) {
            return aVar;
        }
        String str = this.f63132d.get();
        a aVar3 = new a(str, i10, bVar);
        this.f63131c.put(str, aVar3);
        return aVar3;
    }

    @il.m({com.google.android.gms.common.internal.z.a.f106673a})
    private void q(b.C0577b c0577b) {
        if (c0577b.f62839b.w()) {
            String str = this.f63135g;
            if (str != null) {
                m((a) androidx.media3.common.util.a.g(this.f63131c.get(str)));
            }
        } else {
            a aVar = this.f63131c.get(this.f63135g);
            a aVarP = p(c0577b.f62840c, c0577b.f62841d);
            this.f63135g = aVarP.f63137a;
            a(c0577b);
            androidx.media3.exoplayer.source.t0.b bVar = c0577b.f62841d;
            if (bVar != null && bVar.c() && (aVar == null || aVar.f63139c != c0577b.f62841d.f65470d || aVar.f63140d == null || aVar.f63140d.f65468b != c0577b.f62841d.f65468b || aVar.f63140d.f65469c != c0577b.f62841d.f65469c)) {
                androidx.media3.exoplayer.source.t0.b bVar2 = c0577b.f62841d;
                this.f63133e.a(c0577b, p(c0577b.f62840c, new androidx.media3.exoplayer.source.t0.b(bVar2.f65467a, bVar2.f65470d)).f63137a, aVarP.f63137a);
            }
        }
    }

    @Override // androidx.media3.exoplayer.analytics.g4
    public synchronized void a(b.C0577b c0577b) {
        androidx.media3.common.util.a.g(this.f63133e);
        if (c0577b.f62839b.w()) {
            return;
        }
        androidx.media3.exoplayer.source.t0.b bVar = c0577b.f62841d;
        if (bVar != null) {
            if (bVar.f65470d < o()) {
                return;
            }
            a aVar = this.f63131c.get(this.f63135g);
            if (aVar != null && aVar.f63139c == -1 && aVar.f63138b != c0577b.f62840c) {
                return;
            }
        }
        a aVarP = p(c0577b.f62840c, c0577b.f62841d);
        if (this.f63135g == null) {
            this.f63135g = aVarP.f63137a;
        }
        androidx.media3.exoplayer.source.t0.b bVar2 = c0577b.f62841d;
        if (bVar2 != null && bVar2.c()) {
            androidx.media3.exoplayer.source.t0.b bVar3 = c0577b.f62841d;
            androidx.media3.exoplayer.source.t0.b bVar4 = new androidx.media3.exoplayer.source.t0.b(bVar3.f65467a, bVar3.f65470d, bVar3.f65468b);
            a aVarP2 = p(c0577b.f62840c, bVar4);
            if (!aVarP2.f63141e) {
                aVarP2.f63141e = true;
                c0577b.f62839b.l(c0577b.f62841d.f65467a, this.f63130b);
                this.f63133e.z0(new b.C0577b(c0577b.f62838a, c0577b.f62839b, c0577b.f62840c, bVar4, Math.max(0L, androidx.media3.common.util.k1.A2(this.f63130b.g(c0577b.f62841d.f65468b)) + this.f63130b.p()), c0577b.f62843f, c0577b.f62844g, c0577b.f62845h, c0577b.f62846i, c0577b.f62847j), aVarP2.f63137a);
            }
        }
        if (!aVarP.f63141e) {
            aVarP.f63141e = true;
            this.f63133e.z0(c0577b, aVarP.f63137a);
        }
        if (aVarP.f63137a.equals(this.f63135g) && !aVarP.f63142f) {
            aVarP.f63142f = true;
            this.f63133e.B0(c0577b, aVarP.f63137a);
        }
    }

    @Override // androidx.media3.exoplayer.analytics.g4
    public void b(g4.a aVar) {
        this.f63133e = aVar;
    }

    @Override // androidx.media3.exoplayer.analytics.g4
    public synchronized void c(b.C0577b c0577b, int i10) {
        try {
            androidx.media3.common.util.a.g(this.f63133e);
            boolean z10 = i10 == 0;
            Iterator<a> it = this.f63131c.values().iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.j(c0577b)) {
                    it.remove();
                    if (next.f63141e) {
                        boolean zEquals = next.f63137a.equals(this.f63135g);
                        boolean z11 = z10 && zEquals && next.f63142f;
                        if (zEquals) {
                            m(next);
                        }
                        this.f63133e.F(c0577b, next.f63137a, z11);
                    }
                }
            }
            q(c0577b);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // androidx.media3.exoplayer.analytics.g4
    @androidx.annotation.p0
    public synchronized String d() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f63135g;
    }

    @Override // androidx.media3.exoplayer.analytics.g4
    public synchronized String e(androidx.media3.common.z3 z3Var, androidx.media3.exoplayer.source.t0.b bVar) {
        return p(z3Var.l(bVar.f65467a, this.f63130b).f61969c, bVar).f63137a;
    }

    @Override // androidx.media3.exoplayer.analytics.g4
    public synchronized boolean f(b.C0577b c0577b, String str) {
        try {
            a aVar = this.f63131c.get(str);
            if (aVar == null) {
                return false;
            }
            aVar.k(c0577b.f62840c, c0577b.f62841d);
            return aVar.i(c0577b.f62840c, c0577b.f62841d);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // androidx.media3.exoplayer.analytics.g4
    public synchronized void g(b.C0577b c0577b) {
        try {
            androidx.media3.common.util.a.g(this.f63133e);
            androidx.media3.common.z3 z3Var = this.f63134f;
            this.f63134f = c0577b.f62839b;
            Iterator<a> it = this.f63131c.values().iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (!next.m(z3Var, this.f63134f) || next.j(c0577b)) {
                    it.remove();
                    if (next.f63141e) {
                        if (next.f63137a.equals(this.f63135g)) {
                            m(next);
                        }
                        this.f63133e.F(c0577b, next.f63137a, false);
                    }
                }
            }
            q(c0577b);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // androidx.media3.exoplayer.analytics.g4
    public synchronized void h(b.C0577b c0577b) {
        g4.a aVar;
        try {
            String str = this.f63135g;
            if (str != null) {
                m((a) androidx.media3.common.util.a.g(this.f63131c.get(str)));
            }
            Iterator<a> it = this.f63131c.values().iterator();
            while (it.hasNext()) {
                a next = it.next();
                it.remove();
                if (next.f63141e && (aVar = this.f63133e) != null) {
                    aVar.F(c0577b, next.f63137a, false);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public y1(com.google.common.base.s0<String> s0Var) {
        this.f63132d = s0Var;
        this.f63129a = new androidx.media3.common.z3.d();
        this.f63130b = new androidx.media3.common.z3.b();
        this.f63131c = new HashMap<>();
        this.f63134f = androidx.media3.common.z3.f61958a;
        this.f63136h = -1L;
    }
}
