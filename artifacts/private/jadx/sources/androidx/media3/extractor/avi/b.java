package androidx.media3.extractor.avi;

import androidx.annotation.p0;
import androidx.media3.common.s0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.o0;
import androidx.media3.common.util.z;
import androidx.media3.common.v0;
import androidx.media3.common.w;
import androidx.media3.extractor.l0;
import androidx.media3.extractor.n0;
import androidx.media3.extractor.r;
import androidx.media3.extractor.s;
import androidx.media3.extractor.t;
import androidx.media3.extractor.u0;
import com.google.common.collect.nb;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class b implements r {
    public static final int A = 1769369453;
    public static final int B = 829973609;
    public static final int C = 1263424842;
    public static final int D = 1718776947;
    public static final int E = 1852994675;
    public static final int F = 1752331379;
    public static final int G = 1935963489;
    public static final int H = 1937012852;
    public static final int I = 1935960438;
    private static final int J = 0;
    private static final int K = 1;
    private static final int L = 2;
    private static final int M = 3;
    private static final int N = 4;
    private static final int O = 5;
    private static final int P = 6;
    private static final int Q = 16;
    public static final int R = 1;
    private static final long S = 262144;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f67049t = "AviExtractor";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f67050u = 1179011410;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f67051v = 541677121;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f67052w = 1414744396;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f67053x = 1751742049;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f67054y = 1819436136;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f67055z = 1819440243;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o0 f67056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c f67057e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f67058f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final androidx.media3.extractor.text.r.a f67059g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f67060h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private t f67061i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private androidx.media3.extractor.avi.c f67062j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f67063k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private e[] f67064l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f67065m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @p0
    private e f67066n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f67067o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f67068p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f67069q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f67070r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f67071s;

    /* JADX INFO: renamed from: androidx.media3.extractor.avi.b$b, reason: collision with other inner class name */
    private class C0601b implements androidx.media3.extractor.p0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f67072d;

        public C0601b(long j10) {
            this.f67072d = j10;
        }

        @Override // androidx.media3.extractor.p0
        public long Q1() {
            return this.f67072d;
        }

        @Override // androidx.media3.extractor.p0
        public androidx.media3.extractor.p0.a R1(long j10) {
            androidx.media3.extractor.p0.a aVarI = b.this.f67064l[0].i(j10);
            int i10 = 3 << 1;
            for (int i11 = 1; i11 < b.this.f67064l.length; i11++) {
                androidx.media3.extractor.p0.a aVarI2 = b.this.f67064l[i11].i(j10);
                if (aVarI2.f68280a.f68290b < aVarI.f68280a.f68290b) {
                    aVarI = aVarI2;
                }
            }
            return aVarI;
        }

        @Override // androidx.media3.extractor.p0
        public boolean S1() {
            return true;
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f67074a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f67075b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f67076c;

        private c() {
        }

        public void a(o0 o0Var) {
            this.f67074a = o0Var.w();
            this.f67075b = o0Var.w();
            this.f67076c = 0;
        }

        public void b(o0 o0Var) throws v0 {
            a(o0Var);
            if (this.f67074a == 1414744396) {
                this.f67076c = o0Var.w();
                return;
            }
            throw v0.a("LIST expected, found: " + this.f67074a, null);
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    @Deprecated
    public b() {
        this(1, androidx.media3.extractor.text.r.a.f68570a);
    }

    private static void e(s sVar) throws IOException {
        if ((sVar.getPosition() & 1) == 1) {
            sVar.o(1);
        }
    }

    @p0
    private e i(int i10) {
        for (e eVar : this.f67064l) {
            if (eVar.j(i10)) {
                return eVar;
            }
        }
        return null;
    }

    private void j(o0 o0Var) throws IOException {
        f fVarD = f.d(f67054y, o0Var);
        if (fVarD.c() != 1819436136) {
            throw v0.a("Unexpected header list type " + fVarD.c(), null);
        }
        androidx.media3.extractor.avi.c cVar = (androidx.media3.extractor.avi.c) fVarD.b(androidx.media3.extractor.avi.c.class);
        if (cVar == null) {
            throw v0.a("AviHeader not found", null);
        }
        this.f67062j = cVar;
        this.f67063k = ((long) cVar.f67080c) * ((long) cVar.f67078a);
        ArrayList arrayList = new ArrayList();
        nb<androidx.media3.extractor.avi.a> it = fVarD.f67108a.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            androidx.media3.extractor.avi.a next = it.next();
            if (next.c() == 1819440243) {
                int i11 = i10 + 1;
                e eVarM = m((f) next, i10);
                if (eVarM != null) {
                    arrayList.add(eVarM);
                }
                i10 = i11;
            }
        }
        this.f67064l = (e[]) arrayList.toArray(new e[0]);
        this.f67061i.l();
    }

    private void k(o0 o0Var) {
        int i10;
        long jL = l(o0Var);
        while (true) {
            if (o0Var.a() < 16) {
                break;
            }
            int iW = o0Var.w();
            int iW2 = o0Var.w();
            long jW = ((long) o0Var.w()) + jL;
            o0Var.b0(4);
            e eVarI = i(iW);
            if (eVarI != null) {
                eVarI.b(jW, (iW2 & 16) == 16);
            }
        }
        for (e eVar : this.f67064l) {
            eVar.c();
        }
        this.f67071s = true;
        if (this.f67064l.length == 0) {
            this.f67061i.u(new androidx.media3.extractor.p0.b(this.f67063k));
        } else {
            this.f67061i.u(new C0601b(this.f67063k));
        }
    }

    private long l(o0 o0Var) {
        long j10 = 0;
        if (o0Var.a() < 16) {
            return 0L;
        }
        int iF = o0Var.f();
        o0Var.b0(8);
        long jW = o0Var.w();
        long j11 = this.f67068p;
        if (jW <= j11) {
            j10 = j11 + 8;
        }
        o0Var.a0(iF);
        return j10;
    }

    @p0
    private e m(f fVar, int i10) {
        androidx.media3.extractor.avi.d dVar = (androidx.media3.extractor.avi.d) fVar.b(androidx.media3.extractor.avi.d.class);
        g gVar = (g) fVar.b(g.class);
        if (dVar == null) {
            z.n(f67049t, "Missing Stream Header");
            return null;
        }
        if (gVar == null) {
            z.n(f67049t, "Missing Stream Format");
            return null;
        }
        long jA = dVar.a();
        w wVar = gVar.f67111a;
        w.b bVarB = wVar.b();
        bVarB.e0(i10);
        int i11 = dVar.f67088f;
        if (i11 != 0) {
            bVarB.k0(i11);
        }
        h hVar = (h) fVar.b(h.class);
        if (hVar != null) {
            bVarB.h0(hVar.f67112a);
        }
        int iM = s0.m(wVar.f61761o);
        if (iM != 1 && iM != 2) {
            return null;
        }
        u0 u0VarA = this.f67061i.a(i10, iM);
        u0VarA.e(bVarB.N());
        u0VarA.c(jA);
        this.f67063k = Math.max(this.f67063k, jA);
        return new e(i10, dVar, u0VarA);
    }

    private int n(s sVar) throws IOException {
        if (sVar.getPosition() >= this.f67069q) {
            return -1;
        }
        e eVar = this.f67066n;
        if (eVar == null) {
            e(sVar);
            sVar.i(this.f67056d.e(), 0, 12);
            this.f67056d.a0(0);
            int iW = this.f67056d.w();
            if (iW == 1414744396) {
                this.f67056d.a0(8);
                sVar.o(this.f67056d.w() != 1769369453 ? 8 : 12);
                sVar.l();
                return 0;
            }
            int iW2 = this.f67056d.w();
            if (iW == 1263424842) {
                this.f67065m = sVar.getPosition() + ((long) iW2) + 8;
                return 0;
            }
            sVar.o(8);
            sVar.l();
            e eVarI = i(iW);
            if (eVarI == null) {
                this.f67065m = sVar.getPosition() + ((long) iW2);
                return 0;
            }
            eVarI.o(iW2);
            this.f67066n = eVarI;
        } else if (eVar.n(sVar)) {
            this.f67066n = null;
        }
        return 0;
    }

    private boolean o(s sVar, n0 n0Var) throws IOException {
        boolean z10;
        if (this.f67065m != -1) {
            long position = sVar.getPosition();
            long j10 = this.f67065m;
            if (j10 < position || j10 > 262144 + position) {
                n0Var.f68159a = j10;
                z10 = true;
            } else {
                sVar.o((int) (j10 - position));
                z10 = false;
            }
        } else {
            z10 = false;
        }
        this.f67065m = -1L;
        return z10;
    }

    @Override // androidx.media3.extractor.r
    public void a(long j10, long j11) {
        this.f67065m = -1L;
        this.f67066n = null;
        for (e eVar : this.f67064l) {
            eVar.p(j10);
        }
        if (j10 != 0) {
            this.f67060h = 6;
        } else if (this.f67064l.length == 0) {
            this.f67060h = 0;
        } else {
            this.f67060h = 3;
        }
    }

    @Override // androidx.media3.extractor.r
    public int f(s sVar, n0 n0Var) throws IOException {
        if (o(sVar, n0Var)) {
            return 1;
        }
        switch (this.f67060h) {
            case 0:
                if (!g(sVar)) {
                    throw v0.a("AVI Header List not found", null);
                }
                sVar.o(12);
                this.f67060h = 1;
                return 0;
            case 1:
                sVar.readFully(this.f67056d.e(), 0, 12);
                this.f67056d.a0(0);
                this.f67057e.b(this.f67056d);
                c cVar = this.f67057e;
                if (cVar.f67076c == 1819436136) {
                    this.f67067o = cVar.f67075b;
                    this.f67060h = 2;
                    return 0;
                }
                throw v0.a("hdrl expected, found: " + this.f67057e.f67076c, null);
            case 2:
                int i10 = this.f67067o - 4;
                o0 o0Var = new o0(i10);
                sVar.readFully(o0Var.e(), 0, i10);
                j(o0Var);
                this.f67060h = 3;
                return 0;
            case 3:
                if (this.f67068p != -1) {
                    long position = sVar.getPosition();
                    long j10 = this.f67068p;
                    if (position != j10) {
                        this.f67065m = j10;
                        return 0;
                    }
                }
                sVar.i(this.f67056d.e(), 0, 12);
                sVar.l();
                this.f67056d.a0(0);
                this.f67057e.a(this.f67056d);
                int iW = this.f67056d.w();
                int i11 = this.f67057e.f67074a;
                if (i11 == 1179011410) {
                    sVar.o(12);
                    return 0;
                }
                if (i11 != 1414744396 || iW != 1769369453) {
                    this.f67065m = sVar.getPosition() + ((long) this.f67057e.f67075b) + 8;
                    return 0;
                }
                long position2 = sVar.getPosition();
                this.f67068p = position2;
                this.f67069q = position2 + ((long) this.f67057e.f67075b) + 8;
                if (!this.f67071s) {
                    if (((androidx.media3.extractor.avi.c) androidx.media3.common.util.a.g(this.f67062j)).a()) {
                        this.f67060h = 4;
                        this.f67065m = this.f67069q;
                        return 0;
                    }
                    this.f67061i.u(new androidx.media3.extractor.p0.b(this.f67063k));
                    this.f67071s = true;
                }
                this.f67065m = sVar.getPosition() + 12;
                this.f67060h = 6;
                return 0;
            case 4:
                sVar.readFully(this.f67056d.e(), 0, 8);
                this.f67056d.a0(0);
                int iW2 = this.f67056d.w();
                int iW3 = this.f67056d.w();
                if (iW2 == 829973609) {
                    this.f67060h = 5;
                    this.f67070r = iW3;
                } else {
                    this.f67065m = sVar.getPosition() + ((long) iW3);
                }
                return 0;
            case 5:
                o0 o0Var2 = new o0(this.f67070r);
                sVar.readFully(o0Var2.e(), 0, this.f67070r);
                k(o0Var2);
                this.f67060h = 6;
                this.f67065m = this.f67068p;
                return 0;
            case 6:
                return n(sVar);
            default:
                throw new AssertionError();
        }
    }

    @Override // androidx.media3.extractor.r
    public boolean g(s sVar) throws IOException {
        int i10 = 5 ^ 0;
        sVar.i(this.f67056d.e(), 0, 12);
        this.f67056d.a0(0);
        if (this.f67056d.w() != 1179011410) {
            return false;
        }
        this.f67056d.b0(4);
        return this.f67056d.w() == 541677121;
    }

    @Override // androidx.media3.extractor.r
    public void h(t tVar) {
        this.f67060h = 0;
        if (this.f67058f) {
            tVar = new androidx.media3.extractor.text.t(tVar, this.f67059g);
        }
        this.f67061i = tVar;
        this.f67065m = -1L;
    }

    @Override // androidx.media3.extractor.r
    public void release() {
    }

    public b(int i10, androidx.media3.extractor.text.r.a aVar) {
        this.f67059g = aVar;
        this.f67058f = (i10 & 1) == 0;
        this.f67056d = new o0(12);
        this.f67057e = new c();
        this.f67061i = new l0();
        this.f67064l = new e[0];
        this.f67068p = -1L;
        this.f67069q = -1L;
        this.f67067o = -1;
        this.f67063k = -9223372036854775807L;
    }
}
