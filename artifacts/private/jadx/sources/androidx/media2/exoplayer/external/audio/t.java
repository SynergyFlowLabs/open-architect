package androidx.media2.exoplayer.external.audio;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.util.q0;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class t {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f53461g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f53462h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f53463i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f53464j = 3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f53465k = 4;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f53466l = 5000;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f53467m = 10000000;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f53468n = 500000;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f53469o = 500000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private final a f53470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f53471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f53472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f53473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f53474e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f53475f;

    @e.b(19)
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AudioTrack f53476a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AudioTimestamp f53477b = new AudioTimestamp();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f53478c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f53479d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f53480e;

        public a(AudioTrack audioTrack) {
            this.f53476a = audioTrack;
        }

        public long a() {
            return this.f53480e;
        }

        public long b() {
            return this.f53477b.nanoTime / 1000;
        }

        public boolean c() {
            boolean timestamp = this.f53476a.getTimestamp(this.f53477b);
            if (timestamp) {
                long j10 = this.f53477b.framePosition;
                if (this.f53479d > j10) {
                    this.f53478c++;
                }
                this.f53479d = j10;
                this.f53480e = j10 + (this.f53478c << 32);
            }
            return timestamp;
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    private @interface b {
    }

    public t(AudioTrack audioTrack) {
        if (q0.f57626a >= 19) {
            this.f53470a = new a(audioTrack);
            h();
        } else {
            this.f53470a = null;
            i(3);
        }
    }

    private void i(int state) {
        this.f53471b = state;
        if (state == 0) {
            this.f53474e = 0L;
            this.f53475f = -1L;
            this.f53472c = System.nanoTime() / 1000;
            this.f53473d = 5000L;
            return;
        }
        if (state == 1) {
            this.f53473d = 5000L;
            return;
        }
        if (state == 2 || state == 3) {
            this.f53473d = 10000000L;
        } else {
            if (state != 4) {
                throw new IllegalStateException();
            }
            this.f53473d = 500000L;
        }
    }

    public void a() {
        if (this.f53471b == 4) {
            h();
        }
    }

    public long b() {
        a aVar = this.f53470a;
        if (aVar != null) {
            return aVar.a();
        }
        return -1L;
    }

    public long c() {
        a aVar = this.f53470a;
        if (aVar != null) {
            return aVar.b();
        }
        return -9223372036854775807L;
    }

    public boolean d() {
        int i10 = this.f53471b;
        return i10 == 1 || i10 == 2;
    }

    public boolean e() {
        return this.f53471b == 2;
    }

    public boolean f(long systemTimeUs) {
        a aVar = this.f53470a;
        if (aVar == null || systemTimeUs - this.f53474e < this.f53473d) {
            return false;
        }
        this.f53474e = systemTimeUs;
        boolean zC = aVar.c();
        int i10 = this.f53471b;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (zC) {
                        h();
                        return zC;
                    }
                } else if (!zC) {
                    h();
                    return zC;
                }
            } else {
                if (!zC) {
                    h();
                    return zC;
                }
                if (this.f53470a.a() > this.f53475f) {
                    i(2);
                    return zC;
                }
            }
        } else {
            if (zC) {
                if (this.f53470a.b() < this.f53472c) {
                    return false;
                }
                this.f53475f = this.f53470a.a();
                i(1);
                return zC;
            }
            if (systemTimeUs - this.f53472c > 500000) {
                i(3);
            }
        }
        return zC;
    }

    public void g() {
        i(4);
    }

    public void h() {
        if (this.f53470a != null) {
            i(0);
        }
    }
}
