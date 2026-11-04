package androidx.media3.exoplayer.audio;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* JADX INFO: loaded from: classes3.dex */
final class y {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f63454g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f63455h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f63456i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f63457j = 3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f63458k = 4;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f63459l = 10000;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f63460m = 10000000;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f63461n = 500000;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f63462o = 500000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.p0
    private final a f63463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f63464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f63465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f63466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f63467e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f63468f;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AudioTrack f63469a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AudioTimestamp f63470b = new AudioTimestamp();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f63471c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f63472d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f63473e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f63474f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f63475g;

        public a(AudioTrack audioTrack) {
            this.f63469a = audioTrack;
        }

        public void a() {
            this.f63474f = true;
        }

        public long b() {
            return this.f63473e;
        }

        public long c() {
            return this.f63470b.nanoTime / 1000;
        }

        public boolean d() {
            boolean timestamp = this.f63469a.getTimestamp(this.f63470b);
            if (timestamp) {
                long j10 = this.f63470b.framePosition;
                long j11 = this.f63472d;
                if (j11 > j10) {
                    if (this.f63474f) {
                        this.f63475g += j11;
                        this.f63474f = false;
                    } else {
                        this.f63471c++;
                    }
                }
                this.f63472d = j10;
                this.f63473e = j10 + this.f63475g + (this.f63471c << 32);
            }
            return timestamp;
        }
    }

    public y(AudioTrack audioTrack) {
        this.f63463a = new a(audioTrack);
        i();
    }

    private void j(int i10) {
        this.f63464b = i10;
        if (i10 == 0) {
            this.f63467e = 0L;
            this.f63468f = -1L;
            this.f63465c = System.nanoTime() / 1000;
            this.f63466d = 10000L;
            return;
        }
        if (i10 == 1) {
            this.f63466d = 10000L;
            return;
        }
        if (i10 == 2 || i10 == 3) {
            this.f63466d = 10000000L;
        } else {
            if (i10 != 4) {
                throw new IllegalStateException();
            }
            this.f63466d = 500000L;
        }
    }

    public void a() {
        if (this.f63464b == 4) {
            i();
        }
    }

    public void b() {
        a aVar = this.f63463a;
        if (aVar != null) {
            aVar.a();
        }
    }

    public long c() {
        a aVar = this.f63463a;
        if (aVar != null) {
            return aVar.b();
        }
        return -1L;
    }

    public long d() {
        a aVar = this.f63463a;
        if (aVar != null) {
            return aVar.c();
        }
        return -9223372036854775807L;
    }

    public boolean e() {
        return this.f63464b == 2;
    }

    public boolean f() {
        int i10 = this.f63464b;
        return i10 == 1 || i10 == 2;
    }

    public boolean g(long j10) {
        a aVar = this.f63463a;
        if (aVar == null || j10 - this.f63467e < this.f63466d) {
            return false;
        }
        this.f63467e = j10;
        boolean zD = aVar.d();
        int i10 = this.f63464b;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (zD) {
                        i();
                        return zD;
                    }
                } else if (!zD) {
                    i();
                    return zD;
                }
            } else {
                if (!zD) {
                    i();
                    return zD;
                }
                if (this.f63463a.b() > this.f63468f) {
                    j(2);
                    return zD;
                }
            }
        } else {
            if (zD) {
                if (this.f63463a.c() < this.f63465c) {
                    return false;
                }
                this.f63468f = this.f63463a.b();
                j(1);
                return zD;
            }
            if (j10 - this.f63465c > 500000) {
                j(3);
            }
        }
        return zD;
    }

    public void h() {
        j(4);
    }

    public void i() {
        if (this.f63463a != null) {
            j(0);
        }
    }
}
