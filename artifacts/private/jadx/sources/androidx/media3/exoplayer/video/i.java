package androidx.media3.exoplayer.video;

import androidx.annotation.l1;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f66314g = 15;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @l1
    static final long f66315h = 1000000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f66318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f66319d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f66321f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f66316a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f66317b = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f66320e = -9223372036854775807L;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f66322a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f66323b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f66324c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f66325d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f66326e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f66327f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean[] f66328g = new boolean[15];

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f66329h;

        private static int c(long j10) {
            return (int) (j10 % 15);
        }

        public long a() {
            long j10 = this.f66326e;
            if (j10 == 0) {
                return 0L;
            }
            return this.f66327f / j10;
        }

        public long b() {
            return this.f66327f;
        }

        public boolean d() {
            long j10 = this.f66325d;
            if (j10 == 0) {
                return false;
            }
            return this.f66328g[c(j10 - 1)];
        }

        public boolean e() {
            return this.f66325d > 15 && this.f66329h == 0;
        }

        public void f(long j10) {
            long j11 = this.f66325d;
            if (j11 == 0) {
                this.f66322a = j10;
            } else if (j11 == 1) {
                long j12 = j10 - this.f66322a;
                this.f66323b = j12;
                this.f66327f = j12;
                this.f66326e = 1L;
            } else {
                long j13 = j10 - this.f66324c;
                int iC = c(j11);
                if (Math.abs(j13 - this.f66323b) <= 1000000) {
                    this.f66326e++;
                    this.f66327f += j13;
                    boolean[] zArr = this.f66328g;
                    if (zArr[iC]) {
                        zArr[iC] = false;
                        this.f66329h--;
                    }
                } else {
                    boolean[] zArr2 = this.f66328g;
                    if (!zArr2[iC]) {
                        zArr2[iC] = true;
                        this.f66329h++;
                    }
                }
            }
            this.f66325d++;
            this.f66324c = j10;
        }

        public void g() {
            this.f66325d = 0L;
            this.f66326e = 0L;
            this.f66327f = 0L;
            this.f66329h = 0;
            Arrays.fill(this.f66328g, false);
        }
    }

    public long a() {
        if (e()) {
            return this.f66316a.a();
        }
        return -9223372036854775807L;
    }

    public float b() {
        if (e()) {
            return (float) (1.0E9d / this.f66316a.a());
        }
        return -1.0f;
    }

    public int c() {
        return this.f66321f;
    }

    public long d() {
        if (e()) {
            return this.f66316a.b();
        }
        return -9223372036854775807L;
    }

    public boolean e() {
        return this.f66316a.e();
    }

    public void f(long j10) {
        this.f66316a.f(j10);
        int i10 = 0;
        if (this.f66316a.e() && !this.f66319d) {
            this.f66318c = false;
        } else if (this.f66320e != -9223372036854775807L) {
            if (!this.f66318c || this.f66317b.d()) {
                this.f66317b.g();
                this.f66317b.f(this.f66320e);
            }
            this.f66318c = true;
            this.f66317b.f(j10);
        }
        if (this.f66318c && this.f66317b.e()) {
            a aVar = this.f66316a;
            this.f66316a = this.f66317b;
            this.f66317b = aVar;
            this.f66318c = false;
            this.f66319d = false;
        }
        this.f66320e = j10;
        if (!this.f66316a.e()) {
            i10 = this.f66321f + 1;
        }
        this.f66321f = i10;
    }

    public void g() {
        this.f66316a.g();
        this.f66317b.g();
        this.f66318c = false;
        this.f66320e = -9223372036854775807L;
        this.f66321f = 0;
    }
}
