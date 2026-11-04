package com.squareup.moshi;

import android.support.v4.media.session.PlaybackStateCompat;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.IOException;
import okio.b1;
import okio.e1;

/* JADX INFO: loaded from: classes13.dex */
final class r implements b1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final okio.o f267246h = okio.o.x("[]{}\"'/#");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final okio.o f267247i = okio.o.x("'\\");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final okio.o f267248j = okio.o.x("\"\\");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final okio.o f267249k = okio.o.x("\r\n");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final okio.o f267250l = okio.o.x("*");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final okio.o f267251m = okio.o.f335048f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final okio.n f267252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final okio.l f267253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final okio.l f267254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private okio.o f267255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f267256e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f267257f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f267258g;

    r(okio.n nVar) {
        this(nVar, new okio.l(), f267246h, 0);
    }

    private void a(long j10) throws IOException {
        while (true) {
            long j11 = this.f267257f;
            if (j11 >= j10) {
                return;
            }
            okio.o oVar = this.f267255d;
            okio.o oVar2 = f267251m;
            if (oVar == oVar2) {
                return;
            }
            if (j11 == this.f267253b.size()) {
                if (this.f267257f > 0) {
                    return;
                } else {
                    this.f267252a.q1(1L);
                }
            }
            long jF5 = this.f267253b.f5(this.f267255d, this.f267257f);
            if (jF5 == -1) {
                this.f267257f = this.f267253b.size();
            } else {
                byte bI = this.f267253b.I(jF5);
                okio.o oVar3 = this.f267255d;
                okio.o oVar4 = f267246h;
                if (oVar3 == oVar4) {
                    if (bI == 34) {
                        this.f267255d = f267248j;
                        this.f267257f = jF5 + 1;
                    } else if (bI == 35) {
                        this.f267255d = f267249k;
                        this.f267257f = jF5 + 1;
                    } else if (bI == 39) {
                        this.f267255d = f267247i;
                        this.f267257f = jF5 + 1;
                    } else if (bI != 47) {
                        if (bI != 91) {
                            if (bI != 93) {
                                if (bI != 123) {
                                    if (bI != 125) {
                                    }
                                }
                            }
                            int i10 = this.f267256e - 1;
                            this.f267256e = i10;
                            if (i10 == 0) {
                                this.f267255d = oVar2;
                            }
                            this.f267257f = jF5 + 1;
                        }
                        this.f267256e++;
                        this.f267257f = jF5 + 1;
                    } else {
                        long j12 = 2 + jF5;
                        this.f267252a.q1(j12);
                        long j13 = jF5 + 1;
                        byte bI2 = this.f267253b.I(j13);
                        if (bI2 == 47) {
                            this.f267255d = f267249k;
                            this.f267257f = j12;
                        } else if (bI2 == 42) {
                            this.f267255d = f267250l;
                            this.f267257f = j12;
                        } else {
                            this.f267257f = j13;
                        }
                    }
                } else if (oVar3 == f267247i || oVar3 == f267248j) {
                    if (bI == 92) {
                        long j14 = jF5 + 2;
                        this.f267252a.q1(j14);
                        this.f267257f = j14;
                    } else {
                        if (this.f267256e > 0) {
                            oVar2 = oVar4;
                        }
                        this.f267255d = oVar2;
                        this.f267257f = jF5 + 1;
                    }
                } else if (oVar3 == f267250l) {
                    long j15 = 2 + jF5;
                    this.f267252a.q1(j15);
                    long j16 = jF5 + 1;
                    if (this.f267253b.I(j16) == 47) {
                        this.f267257f = j15;
                        this.f267255d = oVar4;
                    } else {
                        this.f267257f = j16;
                    }
                } else {
                    if (oVar3 != f267249k) {
                        throw new AssertionError();
                    }
                    this.f267257f = jF5 + 1;
                    this.f267255d = oVar4;
                }
            }
        }
    }

    public void b() throws IOException {
        this.f267258g = true;
        while (this.f267255d != f267251m) {
            a(PlaybackStateCompat.f9665p2);
            this.f267252a.skip(this.f267257f);
        }
    }

    @Override // okio.b1, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f267258g = true;
    }

    @Override // okio.b1
    public long read(okio.l lVar, long j10) throws IOException {
        if (this.f267258g) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        if (j10 == 0) {
            return 0L;
        }
        if (!this.f267254c.y1()) {
            long j11 = this.f267254c.read(lVar, j10);
            long j12 = j10 - j11;
            if (!this.f267253b.y1()) {
                long j13 = read(lVar, j12);
                if (j13 != -1) {
                    return j13 + j11;
                }
            }
            return j11;
        }
        a(j10);
        long j14 = this.f267257f;
        if (j14 == 0) {
            if (this.f267255d == f267251m) {
                return -1L;
            }
            throw new AssertionError();
        }
        long jMin = Math.min(j10, j14);
        lVar.Ga(this.f267253b, jMin);
        this.f267257f -= jMin;
        return jMin;
    }

    @Override // okio.b1
    public e1 timeout() {
        return this.f267252a.timeout();
    }

    r(okio.n nVar, okio.l lVar, okio.o oVar, int i10) {
        this.f267257f = 0L;
        this.f267258g = false;
        this.f267252a = nVar;
        this.f267253b = nVar.n();
        this.f267254c = lVar;
        this.f267255d = oVar;
        this.f267256e = i10;
    }
}
