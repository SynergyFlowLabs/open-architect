package org.apache.commons.lang3.time;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
public class l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f337511f = 1000000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f337512a = c.f337520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f337513b = b.UNSPLIT;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f337514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f337515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f337516e;

    private enum b {
        SPLIT,
        UNSPLIT
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f337520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f337521b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f337522c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f337523d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ c[] f337524e;

        static enum a extends c {
            a(String str, int i10) {
                super(str, i10);
            }

            @Override // org.apache.commons.lang3.time.l.c
            boolean k() {
                return false;
            }

            @Override // org.apache.commons.lang3.time.l.c
            boolean l() {
                return true;
            }

            @Override // org.apache.commons.lang3.time.l.c
            boolean n() {
                return false;
            }
        }

        static enum b extends c {
            b(String str, int i10) {
                super(str, i10);
            }

            @Override // org.apache.commons.lang3.time.l.c
            boolean k() {
                return true;
            }

            @Override // org.apache.commons.lang3.time.l.c
            boolean l() {
                return false;
            }

            @Override // org.apache.commons.lang3.time.l.c
            boolean n() {
                return false;
            }
        }

        /* JADX INFO: renamed from: org.apache.commons.lang3.time.l$c$c, reason: collision with other inner class name */
        static enum C2412c extends c {
            C2412c(String str, int i10) {
                super(str, i10);
            }

            @Override // org.apache.commons.lang3.time.l.c
            boolean k() {
                return false;
            }

            @Override // org.apache.commons.lang3.time.l.c
            boolean l() {
                return true;
            }

            @Override // org.apache.commons.lang3.time.l.c
            boolean n() {
                return false;
            }
        }

        static enum d extends c {
            d(String str, int i10) {
                super(str, i10);
            }

            @Override // org.apache.commons.lang3.time.l.c
            boolean k() {
                return true;
            }

            @Override // org.apache.commons.lang3.time.l.c
            boolean l() {
                return false;
            }

            @Override // org.apache.commons.lang3.time.l.c
            boolean n() {
                return true;
            }
        }

        static {
            a aVar = new a("UNSTARTED", 0);
            f337520a = aVar;
            b bVar = new b(kotlinx.coroutines.debug.internal.j.f313977b, 1);
            f337521b = bVar;
            C2412c c2412c = new C2412c("STOPPED", 2);
            f337522c = c2412c;
            d dVar = new d(kotlinx.coroutines.debug.internal.j.f313978c, 3);
            f337523d = dVar;
            int i10 = 3 >> 4;
            f337524e = new c[]{aVar, bVar, c2412c, dVar};
        }

        private c(String str, int i10) {
            super(str, i10);
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f337524e.clone();
        }

        abstract boolean k();

        abstract boolean l();

        abstract boolean n();
    }

    public static l a() {
        l lVar = new l();
        lVar.n();
        return lVar;
    }

    public long b() {
        long jNanoTime;
        long j10;
        c cVar = this.f337512a;
        if (cVar == c.f337522c || cVar == c.f337523d) {
            jNanoTime = this.f337516e;
            j10 = this.f337514c;
        } else {
            if (cVar == c.f337520a) {
                return 0L;
            }
            if (cVar != c.f337521b) {
                throw new RuntimeException("Illegal running state has occurred.");
            }
            jNanoTime = System.nanoTime();
            j10 = this.f337514c;
        }
        return jNanoTime - j10;
    }

    public long c() {
        if (this.f337513b == b.SPLIT) {
            return this.f337516e - this.f337514c;
        }
        throw new IllegalStateException("Stopwatch must be split to get the split time. ");
    }

    public long d() {
        return c() / 1000000;
    }

    public long e() {
        if (this.f337512a != c.f337520a) {
            return this.f337515d;
        }
        throw new IllegalStateException("Stopwatch has not been started");
    }

    public long f() {
        return b() / 1000000;
    }

    public long g(TimeUnit timeUnit) {
        return timeUnit.convert(b(), TimeUnit.NANOSECONDS);
    }

    public boolean h() {
        return this.f337512a.k();
    }

    public boolean i() {
        return this.f337512a.l();
    }

    public boolean j() {
        return this.f337512a.n();
    }

    public void k() {
        this.f337512a = c.f337520a;
        this.f337513b = b.UNSPLIT;
    }

    public void l() {
        if (this.f337512a != c.f337523d) {
            throw new IllegalStateException("Stopwatch must be suspended to resume. ");
        }
        this.f337514c += System.nanoTime() - this.f337516e;
        this.f337512a = c.f337521b;
    }

    public void m() {
        if (this.f337512a != c.f337521b) {
            throw new IllegalStateException("Stopwatch is not running. ");
        }
        this.f337516e = System.nanoTime();
        this.f337513b = b.SPLIT;
    }

    public void n() {
        c cVar = this.f337512a;
        if (cVar == c.f337522c) {
            throw new IllegalStateException("Stopwatch must be reset before being restarted. ");
        }
        if (cVar != c.f337520a) {
            throw new IllegalStateException("Stopwatch already started. ");
        }
        this.f337514c = System.nanoTime();
        this.f337515d = System.currentTimeMillis();
        this.f337512a = c.f337521b;
    }

    public void o() {
        c cVar = this.f337512a;
        c cVar2 = c.f337521b;
        if (cVar != cVar2 && cVar != c.f337523d) {
            throw new IllegalStateException("Stopwatch is not running. ");
        }
        if (cVar == cVar2) {
            this.f337516e = System.nanoTime();
        }
        this.f337512a = c.f337522c;
    }

    public void p() {
        if (this.f337512a != c.f337521b) {
            throw new IllegalStateException("Stopwatch must be running to suspend. ");
        }
        this.f337516e = System.nanoTime();
        this.f337512a = c.f337523d;
    }

    public String q() {
        return e.d(d());
    }

    public void r() {
        if (this.f337513b != b.SPLIT) {
            throw new IllegalStateException("Stopwatch has not been split. ");
        }
        this.f337513b = b.UNSPLIT;
    }

    public String toString() {
        return e.d(f());
    }
}
