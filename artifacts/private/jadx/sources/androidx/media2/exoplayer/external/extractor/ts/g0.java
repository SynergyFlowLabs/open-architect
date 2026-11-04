package androidx.media2.exoplayer.external.extractor.ts;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.annotation.b1;
import androidx.media2.exoplayer.external.util.k0;
import androidx.media2.exoplayer.external.util.q0;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class g0 implements androidx.media2.exoplayer.external.extractor.i {
    public static final int A = 4;
    public static final int B = 15;
    public static final int C = 17;
    public static final int D = 129;
    public static final int E = 138;
    public static final int F = 130;
    public static final int G = 135;
    public static final int H = 172;
    public static final int I = 2;
    public static final int J = 27;
    public static final int K = 36;
    public static final int L = 21;
    public static final int M = 134;
    public static final int N = 89;
    public static final int O = 188;
    public static final int P = 71;
    private static final int Q = 0;
    private static final int R = 8192;
    private static final long S = 1094921523;
    private static final long T = 1161904947;
    private static final long U = 1094921524;
    private static final long V = 1212503619;
    private static final int W = 9400;
    private static final int X = 5;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final androidx.media2.exoplayer.external.extractor.l f54786v = f0.f54784a;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f54787w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f54788x = 1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f54789y = 2;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f54790z = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f54791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<k0> f54792e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.util.x f54793f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final SparseIntArray f54794g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final h0.c f54795h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final SparseArray<h0> f54796i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final SparseBooleanArray f54797j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final SparseBooleanArray f54798k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final e0 f54799l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private d0 f54800m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private androidx.media2.exoplayer.external.extractor.k f54801n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f54802o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f54803p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f54804q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f54805r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private h0 f54806s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f54807t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f54808u;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    private class b implements z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.media2.exoplayer.external.util.w f54809a = new androidx.media2.exoplayer.external.util.w(new byte[4]);

        public b() {
        }

        @Override // androidx.media2.exoplayer.external.extractor.ts.z
        public void b(k0 timestampAdjuster, androidx.media2.exoplayer.external.extractor.k extractorOutput, h0.e idGenerator) {
        }

        @Override // androidx.media2.exoplayer.external.extractor.ts.z
        public void d(androidx.media2.exoplayer.external.util.x sectionData) {
            if (sectionData.D() != 0) {
                return;
            }
            sectionData.R(7);
            int iA = sectionData.a() / 4;
            for (int i10 = 0; i10 < iA; i10++) {
                sectionData.g(this.f54809a, 4);
                int iH = this.f54809a.h(16);
                this.f54809a.p(3);
                if (iH == 0) {
                    this.f54809a.p(13);
                } else {
                    int iH2 = this.f54809a.h(13);
                    g0.this.f54796i.put(iH2, new a0(g0.this.new c(iH2)));
                    g0.j(g0.this);
                }
            }
            if (g0.this.f54791d != 2) {
                g0.this.f54796i.remove(0);
            }
        }
    }

    private class c implements z {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f54811f = 5;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final int f54812g = 10;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final int f54813h = 106;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final int f54814i = 122;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final int f54815j = 123;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final int f54816k = 127;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final int f54817l = 89;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final int f54818m = 21;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.media2.exoplayer.external.util.w f54819a = new androidx.media2.exoplayer.external.util.w(new byte[5]);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SparseArray<h0> f54820b = new SparseArray<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final SparseIntArray f54821c = new SparseIntArray();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f54822d;

        public c(int pid) {
            this.f54822d = pid;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0049  */
        /* JADX WARN: Code duplicated, block: B:24:0x0067  */
        private h0.b a(androidx.media2.exoplayer.external.util.x data, int length) {
            int iC = data.c();
            int i10 = length + iC;
            int i11 = -1;
            String strTrim = null;
            ArrayList arrayList = null;
            while (data.c() < i10) {
                int iD = data.D();
                int iC2 = data.c() + data.D();
                if (iD == 5) {
                    long jF = data.F();
                    if (jF == g0.S) {
                        i11 = 129;
                    } else if (jF == g0.T) {
                        i11 = 135;
                    } else if (jF == g0.U) {
                        i11 = 172;
                    } else if (jF == g0.V) {
                        i11 = 36;
                    }
                } else if (iD == 106) {
                    i11 = 129;
                } else if (iD == f54814i) {
                    i11 = 135;
                } else if (iD == 127) {
                    if (data.D() == 21) {
                        i11 = 172;
                    }
                } else if (iD == f54815j) {
                    i11 = 138;
                } else if (iD == 10) {
                    strTrim = data.A(3).trim();
                } else if (iD == 89) {
                    ArrayList arrayList2 = new ArrayList();
                    while (data.c() < iC2) {
                        String strTrim2 = data.A(3).trim();
                        int iD2 = data.D();
                        byte[] bArr = new byte[4];
                        data.i(bArr, 0, 4);
                        arrayList2.add(new h0.a(strTrim2, iD2, bArr));
                    }
                    arrayList = arrayList2;
                    i11 = 89;
                }
                data.R(iC2 - data.c());
            }
            data.Q(i10);
            return new h0.b(i11, strTrim, arrayList, Arrays.copyOfRange(data.f57720a, iC, i10));
        }

        @Override // androidx.media2.exoplayer.external.extractor.ts.z
        public void b(k0 timestampAdjuster, androidx.media2.exoplayer.external.extractor.k extractorOutput, h0.e idGenerator) {
        }

        @Override // androidx.media2.exoplayer.external.extractor.ts.z
        public void d(androidx.media2.exoplayer.external.util.x sectionData) {
            k0 k0Var;
            if (sectionData.D() != 2) {
                return;
            }
            if (g0.this.f54791d == 1 || g0.this.f54791d == 2 || g0.this.f54802o == 1) {
                k0Var = (k0) g0.this.f54792e.get(0);
            } else {
                k0Var = new k0(((k0) g0.this.f54792e.get(0)).c());
                g0.this.f54792e.add(k0Var);
            }
            sectionData.R(2);
            int iJ = sectionData.J();
            int i10 = 3;
            sectionData.R(3);
            sectionData.g(this.f54819a, 2);
            this.f54819a.p(3);
            int i11 = 13;
            g0.this.f54808u = this.f54819a.h(13);
            sectionData.g(this.f54819a, 2);
            int i12 = 4;
            this.f54819a.p(4);
            sectionData.R(this.f54819a.h(12));
            if (g0.this.f54791d == 2 && g0.this.f54806s == null) {
                h0.b bVar = new h0.b(21, null, null, q0.f57631f);
                g0 g0Var = g0.this;
                g0Var.f54806s = g0Var.f54795h.b(21, bVar);
                g0.this.f54806s.b(k0Var, g0.this.f54801n, new h0.e(iJ, 21, 8192));
            }
            this.f54820b.clear();
            this.f54821c.clear();
            int iA = sectionData.a();
            while (iA > 0) {
                sectionData.g(this.f54819a, 5);
                int iH = this.f54819a.h(8);
                this.f54819a.p(i10);
                int iH2 = this.f54819a.h(i11);
                this.f54819a.p(i12);
                int iH3 = this.f54819a.h(12);
                h0.b bVarA = a(sectionData, iH3);
                if (iH == 6) {
                    iH = bVarA.f54847a;
                }
                iA -= iH3 + 5;
                int i13 = g0.this.f54791d == 2 ? iH : iH2;
                if (!g0.this.f54797j.get(i13)) {
                    h0 h0VarB = (g0.this.f54791d == 2 && iH == 21) ? g0.this.f54806s : g0.this.f54795h.b(iH, bVarA);
                    if (g0.this.f54791d != 2 || iH2 < this.f54821c.get(i13, 8192)) {
                        this.f54821c.put(i13, iH2);
                        this.f54820b.put(i13, h0VarB);
                    }
                }
                i10 = 3;
                i12 = 4;
                i11 = 13;
            }
            int size = this.f54821c.size();
            for (int i14 = 0; i14 < size; i14++) {
                int iKeyAt = this.f54821c.keyAt(i14);
                int iValueAt = this.f54821c.valueAt(i14);
                g0.this.f54797j.put(iKeyAt, true);
                g0.this.f54798k.put(iValueAt, true);
                h0 h0VarValueAt = this.f54820b.valueAt(i14);
                if (h0VarValueAt != null) {
                    if (h0VarValueAt != g0.this.f54806s) {
                        h0VarValueAt.b(k0Var, g0.this.f54801n, new h0.e(iJ, iKeyAt, 8192));
                    }
                    g0.this.f54796i.put(iValueAt, h0VarValueAt);
                }
            }
            if (g0.this.f54791d == 2) {
                if (g0.this.f54803p) {
                    return;
                }
                g0.this.f54801n.l();
                g0.this.f54802o = 0;
                g0.this.f54803p = true;
                return;
            }
            g0.this.f54796i.remove(this.f54822d);
            g0 g0Var2 = g0.this;
            g0Var2.f54802o = g0Var2.f54791d != 1 ? g0.this.f54802o - 1 : 0;
            if (g0.this.f54802o == 0) {
                g0.this.f54801n.l();
                g0.this.f54803p = true;
            }
        }
    }

    public g0() {
        this(0);
    }

    static /* synthetic */ int j(g0 g0Var) {
        int i10 = g0Var.f54802o;
        g0Var.f54802o = i10 + 1;
        return i10;
    }

    private boolean t(androidx.media2.exoplayer.external.extractor.j input) throws InterruptedException, IOException {
        androidx.media2.exoplayer.external.util.x xVar = this.f54793f;
        byte[] bArr = xVar.f57720a;
        if (9400 - xVar.c() < 188) {
            int iA = this.f54793f.a();
            if (iA > 0) {
                System.arraycopy(bArr, this.f54793f.c(), bArr, 0, iA);
            }
            this.f54793f.O(bArr, iA);
        }
        while (this.f54793f.a() < 188) {
            int iD = this.f54793f.d();
            int i10 = input.read(bArr, iD, 9400 - iD);
            if (i10 == -1) {
                return false;
            }
            this.f54793f.P(iD + i10);
        }
        return true;
    }

    private int u() throws androidx.media2.exoplayer.external.k0 {
        int iC = this.f54793f.c();
        int iD = this.f54793f.d();
        int iA = i0.a(this.f54793f.f57720a, iC, iD);
        this.f54793f.Q(iA);
        int i10 = iA + 188;
        if (i10 <= iD) {
            this.f54807t = 0;
            return i10;
        }
        int i11 = this.f54807t + (iA - iC);
        this.f54807t = i11;
        if (this.f54791d != 2 || i11 <= 376) {
            return i10;
        }
        throw new androidx.media2.exoplayer.external.k0("Cannot find sync byte. Most likely not a Transport Stream.");
    }

    static final /* synthetic */ androidx.media2.exoplayer.external.extractor.i[] v() {
        return new androidx.media2.exoplayer.external.extractor.i[]{new g0()};
    }

    private void w(long inputLength) {
        if (this.f54804q) {
            return;
        }
        this.f54804q = true;
        if (this.f54799l.b() == -9223372036854775807L) {
            this.f54801n.q(new androidx.media2.exoplayer.external.extractor.q.b(this.f54799l.b()));
            return;
        }
        d0 d0Var = new d0(this.f54799l.c(), this.f54799l.b(), inputLength, this.f54808u);
        this.f54800m = d0Var;
        this.f54801n.q(d0Var.b());
    }

    private void x() {
        this.f54797j.clear();
        this.f54796i.clear();
        SparseArray<h0> sparseArrayA = this.f54795h.a();
        int size = sparseArrayA.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f54796i.put(sparseArrayA.keyAt(i10), sparseArrayA.valueAt(i10));
        }
        this.f54796i.put(0, new a0(new b()));
        this.f54806s = null;
    }

    private boolean y(int packetPid) {
        if (this.f54791d != 2 && !this.f54803p && this.f54798k.get(packetPid, false)) {
            return false;
        }
        return true;
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public void a(long position, long timeUs) {
        d0 d0Var;
        androidx.media2.exoplayer.external.util.a.i(this.f54791d != 2);
        int size = this.f54792e.size();
        for (int i10 = 0; i10 < size; i10++) {
            k0 k0Var = this.f54792e.get(i10);
            if (k0Var.e() == -9223372036854775807L || (k0Var.e() != 0 && k0Var.c() != timeUs)) {
                k0Var.g();
                k0Var.h(timeUs);
            }
        }
        if (timeUs != 0 && (d0Var = this.f54800m) != null) {
            d0Var.h(timeUs);
        }
        this.f54793f.L();
        this.f54794g.clear();
        for (int i11 = 0; i11 < this.f54796i.size(); i11++) {
            this.f54796i.valueAt(i11).a();
        }
        this.f54807t = 0;
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public boolean b(androidx.media2.exoplayer.external.extractor.j input) throws InterruptedException, IOException {
        byte[] bArr = this.f54793f.f57720a;
        input.i(bArr, 0, 940);
        for (int i10 = 0; i10 < 188; i10++) {
            int i11 = 0;
            while (true) {
                if (i11 >= 5) {
                    input.o(i10);
                    return true;
                }
                if (bArr[(i11 * 188) + i10] != 71) {
                    break;
                }
                i11++;
            }
        }
        return false;
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public void c(androidx.media2.exoplayer.external.extractor.k output) {
        this.f54801n = output;
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public int f(androidx.media2.exoplayer.external.extractor.j input, androidx.media2.exoplayer.external.extractor.p seekPosition) throws InterruptedException, IOException {
        long j10;
        long length = input.getLength();
        if (this.f54803p) {
            if (length != -1 && this.f54791d != 2 && !this.f54799l.d()) {
                return this.f54799l.e(input, seekPosition, this.f54808u);
            }
            w(length);
            if (this.f54805r) {
                this.f54805r = false;
                a(0L, 0L);
                if (input.getPosition() != 0) {
                    seekPosition.f54695a = 0L;
                    return 1;
                }
            }
            d0 d0Var = this.f54800m;
            if (d0Var != null && d0Var.d()) {
                return this.f54800m.c(input, seekPosition, null);
            }
        }
        if (!t(input)) {
            return -1;
        }
        int iU = u();
        int iD = this.f54793f.d();
        if (iU > iD) {
            return 0;
        }
        int iL = this.f54793f.l();
        if ((8388608 & iL) != 0) {
            this.f54793f.Q(iU);
            return 0;
        }
        int i10 = (4194304 & iL) != 0 ? 1 : 0;
        int i11 = (2096896 & iL) >> 8;
        boolean z10 = (iL & 32) != 0;
        h0 h0Var = (iL & 16) != 0 ? this.f54796i.get(i11) : null;
        if (h0Var == null) {
            this.f54793f.Q(iU);
            return 0;
        }
        if (this.f54791d != 2) {
            int i12 = iL & 15;
            j10 = -1;
            int i13 = this.f54794g.get(i11, i12 - 1);
            this.f54794g.put(i11, i12);
            if (i13 == i12) {
                this.f54793f.Q(iU);
                return 0;
            }
            if (i12 != ((i13 + 1) & 15)) {
                h0Var.a();
            }
        } else {
            j10 = -1;
        }
        if (z10) {
            int iD2 = this.f54793f.D();
            i10 |= (this.f54793f.D() & 64) != 0 ? 2 : 0;
            this.f54793f.R(iD2 - 1);
        }
        boolean z11 = this.f54803p;
        if (y(i11)) {
            this.f54793f.P(iU);
            h0Var.c(this.f54793f, i10);
            this.f54793f.P(iD);
        }
        if (this.f54791d != 2 && !z11 && this.f54803p && length != j10) {
            this.f54805r = true;
        }
        this.f54793f.Q(iU);
        return 0;
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public void release() {
    }

    public g0(int defaultTsPayloadReaderFlags) {
        this(1, defaultTsPayloadReaderFlags);
    }

    public g0(int mode, int defaultTsPayloadReaderFlags) {
        this(mode, new k0(0L), new j(defaultTsPayloadReaderFlags));
    }

    public g0(int mode, k0 timestampAdjuster, h0.c payloadReaderFactory) {
        this.f54795h = (h0.c) androidx.media2.exoplayer.external.util.a.g(payloadReaderFactory);
        this.f54791d = mode;
        if (mode != 1 && mode != 2) {
            ArrayList arrayList = new ArrayList();
            this.f54792e = arrayList;
            arrayList.add(timestampAdjuster);
        } else {
            this.f54792e = Collections.singletonList(timestampAdjuster);
        }
        this.f54793f = new androidx.media2.exoplayer.external.util.x(new byte[W], 0);
        this.f54797j = new SparseBooleanArray();
        this.f54798k = new SparseBooleanArray();
        this.f54796i = new SparseArray<>();
        this.f54794g = new SparseIntArray();
        this.f54799l = new e0();
        this.f54808u = -1;
        x();
    }
}
