package com.google.firebase.perf.util;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public abstract class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f124244b = new a("TERABYTES", 0, org.apache.commons.io.k.f336697h);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f124245c = new j("GIGABYTES", 1, org.apache.commons.io.k.f336695f) { // from class: com.google.firebase.perf.util.j.b
        {
            a aVar = null;
        }

        @Override // com.google.firebase.perf.util.j
        public long l(long j10, j jVar) {
            return jVar.o(j10);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f124246d = new j("MEGABYTES", 2, 1048576) { // from class: com.google.firebase.perf.util.j.c
        {
            a aVar = null;
        }

        @Override // com.google.firebase.perf.util.j
        public long l(long j10, j jVar) {
            return jVar.q(j10);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f124247e = new j("KILOBYTES", 3, 1024) { // from class: com.google.firebase.perf.util.j.d
        {
            a aVar = null;
        }

        @Override // com.google.firebase.perf.util.j
        public long l(long j10, j jVar) {
            return jVar.p(j10);
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final j f124248f = new j("BYTES", 4, 1) { // from class: com.google.firebase.perf.util.j.e
        {
            a aVar = null;
        }

        @Override // com.google.firebase.perf.util.j
        public long l(long j10, j jVar) {
            return jVar.n(j10);
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ j[] f124249g = k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f124250a;

    final enum a extends j {
        a(String str, int i10, long j10) {
            super(str, i10, j10, null);
        }

        @Override // com.google.firebase.perf.util.j
        public long l(long j10, j jVar) {
            return jVar.r(j10);
        }
    }

    /* synthetic */ j(String str, int i10, long j10, a aVar) {
        this(str, i10, j10);
    }

    private static /* synthetic */ j[] k() {
        return new j[]{f124244b, f124245c, f124246d, f124247e, f124248f};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f124249g.clone();
    }

    public abstract long l(long j10, j jVar);

    public long n(long j10) {
        return j10 * this.f124250a;
    }

    public long o(long j10) {
        return (j10 * this.f124250a) / f124245c.f124250a;
    }

    public long p(long j10) {
        return (j10 * this.f124250a) / f124247e.f124250a;
    }

    public long q(long j10) {
        return (j10 * this.f124250a) / f124246d.f124250a;
    }

    public long r(long j10) {
        return (j10 * this.f124250a) / f124244b.f124250a;
    }

    private j(String str, int i10, long j10) {
        super(str, i10);
        this.f124250a = j10;
    }
}
