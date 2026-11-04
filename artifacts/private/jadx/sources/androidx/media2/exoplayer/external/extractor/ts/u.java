package androidx.media2.exoplayer.external.extractor.ts;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.util.k0;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class u implements h0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f55094p = "PesReader";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f55095q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f55096r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f55097s = 2;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f55098t = 3;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f55099u = 9;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f55100v = 10;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f55101w = 10;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final m f55102d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.util.w f55103e = new androidx.media2.exoplayer.external.util.w(new byte[10]);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f55104f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f55105g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private k0 f55106h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f55107i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f55108j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f55109k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f55110l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f55111m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f55112n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f55113o;

    public u(m reader) {
        this.f55102d = reader;
    }

    private boolean d(androidx.media2.exoplayer.external.util.x source, byte[] target, int targetLength) {
        int iMin = Math.min(source.a(), targetLength - this.f55105g);
        if (iMin <= 0) {
            return true;
        }
        if (target == null) {
            source.R(iMin);
        } else {
            source.i(target, this.f55105g, iMin);
        }
        int i10 = this.f55105g + iMin;
        this.f55105g = i10;
        return i10 == targetLength;
    }

    private boolean e() {
        this.f55103e.n(0);
        int iH = this.f55103e.h(24);
        if (iH != 1) {
            StringBuilder sb2 = new StringBuilder(41);
            sb2.append("Unexpected start code prefix: ");
            sb2.append(iH);
            androidx.media2.exoplayer.external.util.p.l(f55094p, sb2.toString());
            this.f55111m = -1;
            return false;
        }
        this.f55103e.p(8);
        int iH2 = this.f55103e.h(16);
        this.f55103e.p(5);
        this.f55112n = this.f55103e.g();
        this.f55103e.p(2);
        this.f55107i = this.f55103e.g();
        this.f55108j = this.f55103e.g();
        this.f55103e.p(6);
        int iH3 = this.f55103e.h(8);
        this.f55110l = iH3;
        if (iH2 == 0) {
            this.f55111m = -1;
        } else {
            this.f55111m = (iH2 - 3) - iH3;
        }
        return true;
    }

    private void f() {
        this.f55103e.n(0);
        this.f55113o = -9223372036854775807L;
        if (this.f55107i) {
            this.f55103e.p(4);
            long jH = ((long) this.f55103e.h(3)) << 30;
            this.f55103e.p(1);
            long jH2 = jH | ((long) (this.f55103e.h(15) << 15));
            this.f55103e.p(1);
            long jH3 = jH2 | ((long) this.f55103e.h(15));
            this.f55103e.p(1);
            if (!this.f55109k && this.f55108j) {
                this.f55103e.p(4);
                long jH4 = ((long) this.f55103e.h(3)) << 30;
                this.f55103e.p(1);
                long jH5 = jH4 | ((long) (this.f55103e.h(15) << 15));
                this.f55103e.p(1);
                long jH6 = jH5 | ((long) this.f55103e.h(15));
                this.f55103e.p(1);
                this.f55106h.b(jH6);
                this.f55109k = true;
            }
            this.f55113o = this.f55106h.b(jH3);
        }
    }

    private void g(int state) {
        this.f55104f = state;
        this.f55105g = 0;
    }

    @Override // androidx.media2.exoplayer.external.extractor.ts.h0
    public final void a() {
        this.f55104f = 0;
        this.f55105g = 0;
        this.f55109k = false;
        this.f55102d.a();
    }

    @Override // androidx.media2.exoplayer.external.extractor.ts.h0
    public void b(k0 timestampAdjuster, androidx.media2.exoplayer.external.extractor.k extractorOutput, h0.e idGenerator) {
        this.f55106h = timestampAdjuster;
        this.f55102d.e(extractorOutput, idGenerator);
    }

    @Override // androidx.media2.exoplayer.external.extractor.ts.h0
    public final void c(androidx.media2.exoplayer.external.util.x data, int flags) throws androidx.media2.exoplayer.external.k0 {
        if ((flags & 1) != 0) {
            int i10 = this.f55104f;
            if (i10 != 0 && i10 != 1) {
                if (i10 == 2) {
                    androidx.media2.exoplayer.external.util.p.l(f55094p, "Unexpected start indicator reading extended header");
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException();
                    }
                    int i11 = this.f55111m;
                    if (i11 != -1) {
                        StringBuilder sb2 = new StringBuilder(59);
                        sb2.append("Unexpected start indicator: expected ");
                        sb2.append(i11);
                        sb2.append(" more bytes");
                        androidx.media2.exoplayer.external.util.p.l(f55094p, sb2.toString());
                    }
                    this.f55102d.f();
                }
            }
            g(1);
        }
        while (data.a() > 0) {
            int i12 = this.f55104f;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        if (d(data, this.f55103e.f57716a, Math.min(10, this.f55110l)) && d(data, null, this.f55110l)) {
                            f();
                            flags |= this.f55112n ? 4 : 0;
                            this.f55102d.c(this.f55113o, flags);
                            g(3);
                        }
                    } else {
                        if (i12 != 3) {
                            throw new IllegalStateException();
                        }
                        int iA = data.a();
                        int i13 = this.f55111m;
                        int i14 = i13 != -1 ? iA - i13 : 0;
                        if (i14 > 0) {
                            iA -= i14;
                            data.P(data.c() + iA);
                        }
                        this.f55102d.d(data);
                        int i15 = this.f55111m;
                        if (i15 != -1) {
                            int i16 = i15 - iA;
                            this.f55111m = i16;
                            if (i16 == 0) {
                                this.f55102d.f();
                                g(1);
                            }
                        }
                    }
                } else if (d(data, this.f55103e.f57716a, 9)) {
                    g(e() ? 2 : 0);
                }
            } else {
                data.R(data.a());
            }
        }
    }
}
