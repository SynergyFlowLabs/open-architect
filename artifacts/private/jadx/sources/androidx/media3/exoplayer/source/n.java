package androidx.media3.exoplayer.source;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import androidx.media3.common.z3;
import com.google.common.collect.l6;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class n extends h<Integer> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f65253s = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final l6<d> f65254k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final IdentityHashMap<s0, d> f65255l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.p0
    private Handler f65256m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f65257n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private androidx.media3.common.k0 f65258o;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final l6.a<d> f65259a = l6.s();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f65260b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.p0
        private androidx.media3.common.k0 f65261c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.p0
        private t0.a f65262d;

        @z7.a
        public b a(androidx.media3.common.k0 k0Var) {
            return b(k0Var, -9223372036854775807L);
        }

        @z7.a
        public b b(androidx.media3.common.k0 k0Var, long j10) {
            androidx.media3.common.util.a.g(k0Var);
            if (j10 == -9223372036854775807L) {
                androidx.media3.common.k0.d dVar = k0Var.f60826f;
                if (dVar.f60858c != Long.MIN_VALUE) {
                    j10 = androidx.media3.common.util.k1.A2(dVar.f60859d - dVar.f60857b);
                }
            }
            androidx.media3.common.util.a.l(this.f65262d, "Must use useDefaultMediaSourceFactory or setMediaSourceFactory first.");
            return d(this.f65262d.h(k0Var), j10);
        }

        @z7.a
        public b c(t0 t0Var) {
            return d(t0Var, -9223372036854775807L);
        }

        @z7.a
        public b d(t0 t0Var, long j10) {
            androidx.media3.common.util.a.g(t0Var);
            androidx.media3.common.util.a.j(((t0Var instanceof m1) && j10 == -9223372036854775807L) ? false : true, "Progressive media source must define an initial placeholder duration.");
            l6.a<d> aVar = this.f65259a;
            int i10 = this.f65260b;
            this.f65260b = i10 + 1;
            aVar.a(new d(t0Var, i10, androidx.media3.common.util.k1.D1(j10)));
            return this;
        }

        public n e() {
            androidx.media3.common.util.a.b(this.f65260b > 0, "Must add at least one source to the concatenation.");
            if (this.f65261c == null) {
                this.f65261c = androidx.media3.common.k0.c(Uri.EMPTY);
            }
            return new n(this.f65261c, this.f65259a.e());
        }

        @z7.a
        public b f(androidx.media3.common.k0 k0Var) {
            this.f65261c = k0Var;
            return this;
        }

        @z7.a
        public b g(t0.a aVar) {
            this.f65262d = (t0.a) androidx.media3.common.util.a.g(aVar);
            return this;
        }

        @z7.a
        public b h(Context context) {
            return g(new q(context));
        }
    }

    private static final class c extends z3 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final androidx.media3.common.k0 f65263e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final l6<z3> f65264f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final l6<Integer> f65265g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final l6<Long> f65266h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f65267i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final boolean f65268j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final long f65269k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final long f65270l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @androidx.annotation.p0
        private final Object f65271m;

        public c(androidx.media3.common.k0 k0Var, l6<z3> l6Var, l6<Integer> l6Var2, l6<Long> l6Var3, boolean z10, boolean z11, long j10, long j11, @androidx.annotation.p0 Object obj) {
            this.f65263e = k0Var;
            this.f65264f = l6Var;
            this.f65265g = l6Var2;
            this.f65266h = l6Var3;
            this.f65267i = z10;
            this.f65268j = z11;
            this.f65269k = j10;
            this.f65270l = j11;
            this.f65271m = obj;
        }

        private long A(z3.b bVar, int i10) {
            if (bVar.f61970d == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return (i10 == this.f65266h.size() + (-1) ? this.f65269k : this.f65266h.get(i10 + 1).longValue()) - this.f65266h.get(i10).longValue();
        }

        private int z(int i10) {
            return androidx.media3.common.util.k1.l(this.f65265g, Integer.valueOf(i10 + 1), false, false);
        }

        @Override // androidx.media3.common.z3
        public int f(Object obj) {
            if (!(obj instanceof Pair) || !(((Pair) obj).first instanceof Integer)) {
                return -1;
            }
            int iI0 = n.I0(obj);
            int iF = this.f65264f.get(iI0).f(n.K0(obj));
            if (iF == -1) {
                return -1;
            }
            return this.f65265g.get(iI0).intValue() + iF;
        }

        @Override // androidx.media3.common.z3
        public z3.b k(int i10, z3.b bVar, boolean z10) {
            int iZ = z(i10);
            this.f65264f.get(iZ).k(i10 - this.f65265g.get(iZ).intValue(), bVar, z10);
            bVar.f61969c = 0;
            bVar.f61971e = this.f65266h.get(i10).longValue();
            bVar.f61970d = A(bVar, i10);
            if (z10) {
                bVar.f61968b = n.O0(iZ, androidx.media3.common.util.a.g(bVar.f61968b));
            }
            return bVar;
        }

        @Override // androidx.media3.common.z3
        public z3.b l(Object obj, z3.b bVar) {
            int iI0 = n.I0(obj);
            Object objK0 = n.K0(obj);
            z3 z3Var = this.f65264f.get(iI0);
            int iIntValue = this.f65265g.get(iI0).intValue() + z3Var.f(objK0);
            z3Var.l(objK0, bVar);
            bVar.f61969c = 0;
            bVar.f61971e = this.f65266h.get(iIntValue).longValue();
            bVar.f61970d = A(bVar, iIntValue);
            bVar.f61968b = obj;
            return bVar;
        }

        @Override // androidx.media3.common.z3
        public int m() {
            return this.f65266h.size();
        }

        @Override // androidx.media3.common.z3
        public Object s(int i10) {
            int iZ = z(i10);
            return n.O0(iZ, this.f65264f.get(iZ).s(i10 - this.f65265g.get(iZ).intValue()));
        }

        @Override // androidx.media3.common.z3
        public z3.d u(int i10, z3.d dVar, long j10) {
            return dVar.j(z3.d.f61978q, this.f65263e, this.f65271m, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f65267i, this.f65268j, null, this.f65270l, this.f65269k, 0, m() - 1, -this.f65266h.get(0).longValue());
        }

        @Override // androidx.media3.common.z3
        public int v() {
            return 1;
        }
    }

    static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g0 f65272a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f65273b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f65274c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final HashMap<Object, Long> f65275d = new HashMap<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f65276e;

        public d(t0 t0Var, int i10, long j10) {
            this.f65272a = new g0(t0Var, false);
            this.f65273b = i10;
            this.f65274c = j10;
        }
    }

    private void H0() {
        for (int i10 = 0; i10 < this.f65254k.size(); i10++) {
            d dVar = this.f65254k.get(i10);
            if (dVar.f65276e == 0) {
                v0(Integer.valueOf(dVar.f65273b));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int I0(Object obj) {
        return ((Integer) ((Pair) obj).first).intValue();
    }

    private static int J0(long j10, int i10) {
        return (int) (j10 % ((long) i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object K0(Object obj) {
        return ((Pair) obj).second;
    }

    private static long L0(long j10, int i10, int i11) {
        return (j10 * ((long) i10)) + ((long) i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object O0(int i10, Object obj) {
        return Pair.create(Integer.valueOf(i10), obj);
    }

    private static long Q0(long j10, int i10) {
        return j10 / ((long) i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean R0(Message message) {
        if (message.what == 1) {
            V0();
        }
        return true;
    }

    @androidx.annotation.p0
    private c S0() {
        long j10;
        long j11;
        z3.d dVar;
        boolean z10;
        n nVar = this;
        z3.d dVar2 = new z3.d();
        z3.b bVar = new z3.b();
        l6.a aVarS = l6.s();
        l6.a aVarS2 = l6.s();
        l6.a aVarS3 = l6.s();
        int size = nVar.f65254k.size();
        boolean z11 = true;
        boolean z12 = true;
        boolean z13 = true;
        int i10 = 0;
        Object obj = null;
        int iM = 0;
        boolean z14 = false;
        boolean z15 = false;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        while (i10 < size) {
            d dVar3 = nVar.f65254k.get(i10);
            z3 z3VarT0 = dVar3.f65272a.T0();
            androidx.media3.common.util.a.b(z3VarT0.w() ^ z11, "Can't concatenate empty child Timeline.");
            aVarS.a(z3VarT0);
            aVarS2.a(Integer.valueOf(iM));
            iM += z3VarT0.m();
            int i11 = 0;
            while (i11 < z3VarT0.v()) {
                z3VarT0.t(i11, dVar2);
                if (!z14) {
                    z14 = z11;
                    obj = dVar2.f61991d;
                }
                z12 = (z12 && Objects.equals(obj, dVar2.f61991d)) ? z11 : false;
                z3 z3Var = z3VarT0;
                long j15 = dVar2.f62000m;
                if (j15 == -9223372036854775807L) {
                    j15 = dVar3.f65274c;
                    if (j15 == -9223372036854775807L) {
                        return null;
                    }
                }
                j12 += j15;
                if (dVar3.f65273b == 0 && i11 == 0) {
                    j13 = dVar2.f61999l;
                    j14 = -dVar2.f62003p;
                }
                z13 &= dVar2.f61995h || dVar2.f61998k;
                z15 |= dVar2.f61996i;
                int i12 = dVar2.f62001n;
                while (i12 <= dVar2.f62002o) {
                    aVarS3.a(Long.valueOf(j14));
                    z3 z3Var2 = z3Var;
                    z3Var2.k(i12, bVar, true);
                    l6.a aVar = aVarS3;
                    long j16 = bVar.f61970d;
                    if (j16 == -9223372036854775807L) {
                        androidx.media3.common.util.a.b(dVar2.f62001n == dVar2.f62002o, "Can't apply placeholder duration to multiple periods with unknown duration in a single window.");
                        j16 = dVar2.f62003p + j15;
                    }
                    if (i12 != dVar2.f62001n || ((dVar3.f65273b == 0 && i11 == 0) || j16 == -9223372036854775807L)) {
                        j10 = j16;
                        j11 = 0;
                    } else {
                        j11 = -dVar2.f62003p;
                        j10 = j16 + j11;
                    }
                    Object objG = androidx.media3.common.util.a.g(bVar.f61968b);
                    int i13 = i12;
                    if (dVar3.f65276e == 0 || !dVar3.f65275d.containsKey(objG)) {
                        dVar = dVar2;
                    } else {
                        dVar = dVar2;
                        if (!dVar3.f65275d.get(objG).equals(Long.valueOf(j11))) {
                            z10 = false;
                        }
                        androidx.media3.common.util.a.b(z10, "Can't handle windows with changing offset in first period.");
                        dVar3.f65275d.put(objG, Long.valueOf(j11));
                        j14 += j10;
                        i12 = i13 + 1;
                        aVarS3 = aVar;
                        z3Var = z3Var2;
                        dVar2 = dVar;
                    }
                    z10 = true;
                    androidx.media3.common.util.a.b(z10, "Can't handle windows with changing offset in first period.");
                    dVar3.f65275d.put(objG, Long.valueOf(j11));
                    j14 += j10;
                    i12 = i13 + 1;
                    aVarS3 = aVar;
                    z3Var = z3Var2;
                    dVar2 = dVar;
                }
                i11++;
                aVarS = aVarS;
                aVarS2 = aVarS2;
                z3VarT0 = z3Var;
                z11 = true;
            }
            i10++;
            nVar = this;
            z11 = true;
        }
        return new c(g(), aVarS.e(), aVarS2.e(), aVarS3.e(), z13, z15, j12, j13, z12 ? obj : null);
    }

    private void U0() {
        if (!this.f65257n) {
            ((Handler) androidx.media3.common.util.a.g(this.f65256m)).obtainMessage(1).sendToTarget();
            this.f65257n = true;
        }
    }

    private void V0() {
        this.f65257n = false;
        c cVarS0 = S0();
        if (cVarS0 != null) {
            k0(cVarS0);
        }
    }

    @Override // androidx.media3.exoplayer.source.t0
    public synchronized void K(androidx.media3.common.k0 k0Var) {
        try {
            this.f65258o = k0Var;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.h
    @androidx.annotation.p0
    /* JADX INFO: renamed from: M0, reason: merged with bridge method [inline-methods] */
    public t0.b x0(Integer num, t0.b bVar) {
        if (num.intValue() != J0(bVar.f65470d, this.f65254k.size())) {
            return null;
        }
        return bVar.a(O0(num.intValue(), bVar.f65467a)).b(Q0(bVar.f65470d, this.f65254k.size()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.h
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public long y0(Integer num, long j10, @androidx.annotation.p0 t0.b bVar) {
        Long l10;
        if (j10 != -9223372036854775807L && bVar != null && !bVar.c() && (l10 = this.f65254k.get(num.intValue()).f65275d.get(bVar.f65467a)) != null) {
            j10 += androidx.media3.common.util.k1.A2(l10.longValue());
        }
        return j10;
    }

    @Override // androidx.media3.exoplayer.source.t0
    public boolean O(androidx.media3.common.k0 k0Var) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.h
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public int z0(Integer num, int i10) {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.h
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public void A0(Integer num, t0 t0Var, z3 z3Var) {
        U0();
    }

    @Override // androidx.media3.exoplayer.source.h, androidx.media3.exoplayer.source.a
    protected void d0() {
    }

    @Override // androidx.media3.exoplayer.source.t0
    public synchronized androidx.media3.common.k0 g() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f65258o;
    }

    @Override // androidx.media3.exoplayer.source.h, androidx.media3.exoplayer.source.a
    protected void j0(@androidx.annotation.p0 androidx.media3.datasource.r1 r1Var) {
        super.j0(r1Var);
        this.f65256m = new Handler(new Handler.Callback() { // from class: androidx.media3.exoplayer.source.m
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f65190a.R0(message);
            }
        });
        for (int i10 = 0; i10 < this.f65254k.size(); i10++) {
            B0(Integer.valueOf(i10), this.f65254k.get(i10).f65272a);
        }
        U0();
    }

    @Override // androidx.media3.exoplayer.source.t0
    public void l(s0 s0Var) {
        d dVar = (d) androidx.media3.common.util.a.g(this.f65255l.remove(s0Var));
        dVar.f65272a.l(((c2) s0Var).a());
        dVar.f65276e--;
        if (this.f65255l.isEmpty()) {
            return;
        }
        H0();
    }

    @Override // androidx.media3.exoplayer.source.h, androidx.media3.exoplayer.source.a
    protected void l0() {
        super.l0();
        Handler handler = this.f65256m;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f65256m = null;
        }
        this.f65257n = false;
    }

    @Override // androidx.media3.exoplayer.source.t0
    @androidx.annotation.p0
    public z3 u() {
        return S0();
    }

    @Override // androidx.media3.exoplayer.source.t0
    public s0 x(t0.b bVar, androidx.media3.exoplayer.upstream.b bVar2, long j10) {
        d dVar = this.f65254k.get(I0(bVar.f65467a));
        t0.b bVarB = bVar.a(K0(bVar.f65467a)).b(L0(bVar.f65470d, this.f65254k.size(), dVar.f65273b));
        w0(Integer.valueOf(dVar.f65273b));
        dVar.f65276e++;
        long jLongValue = bVar.c() ? 0L : ((Long) androidx.media3.common.util.a.g(dVar.f65275d.get(bVarB.f65467a))).longValue();
        c2 c2Var = new c2(dVar.f65272a.x(bVarB, bVar2, j10 - jLongValue), jLongValue);
        this.f65255l.put(c2Var, dVar);
        H0();
        return c2Var;
    }

    private n(androidx.media3.common.k0 k0Var, l6<d> l6Var) {
        this.f65258o = k0Var;
        this.f65254k = l6Var;
        this.f65255l = new IdentityHashMap<>();
    }
}
