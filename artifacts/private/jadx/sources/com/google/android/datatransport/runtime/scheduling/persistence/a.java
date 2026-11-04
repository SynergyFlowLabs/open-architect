package com.google.android.datatransport.runtime.scheduling.persistence;

/* JADX INFO: loaded from: classes4.dex */
final class a extends e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f103707g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f103708h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f103709i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f103710j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f103711k;

    static final class b extends e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f103712a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f103713b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f103714c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Long f103715d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Integer f103716e;

        b() {
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.e.a
        e a() {
            String str = "";
            if (this.f103712a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f103713b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f103714c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f103715d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f103716e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new a(this.f103712a.longValue(), this.f103713b.intValue(), this.f103714c.intValue(), this.f103715d.longValue(), this.f103716e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.e.a
        e.a b(int i10) {
            this.f103714c = Integer.valueOf(i10);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.e.a
        e.a c(long j10) {
            this.f103715d = Long.valueOf(j10);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.e.a
        e.a d(int i10) {
            this.f103713b = Integer.valueOf(i10);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.e.a
        e.a e(int i10) {
            this.f103716e = Integer.valueOf(i10);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.e.a
        e.a f(long j10) {
            this.f103712a = Long.valueOf(j10);
            return this;
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.e
    int b() {
        return this.f103709i;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.e
    long c() {
        return this.f103710j;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.e
    int d() {
        return this.f103708h;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.e
    int e() {
        return this.f103711k;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f103707g == eVar.f() && this.f103708h == eVar.d() && this.f103709i == eVar.b() && this.f103710j == eVar.c() && this.f103711k == eVar.e()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.e
    long f() {
        return this.f103707g;
    }

    public int hashCode() {
        long j10 = this.f103707g;
        int i10 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f103708h) * 1000003) ^ this.f103709i) * 1000003;
        long j11 = this.f103710j;
        return this.f103711k ^ ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003);
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f103707g + ", loadBatchSize=" + this.f103708h + ", criticalSectionEnterTimeoutMs=" + this.f103709i + ", eventCleanUpAge=" + this.f103710j + ", maxBlobByteSizePerRow=" + this.f103711k + "}";
    }

    private a(long j10, int i10, int i11, long j11, int i12) {
        this.f103707g = j10;
        this.f103708h = i10;
        this.f103709i = i11;
        this.f103710j = j11;
        this.f103711k = i12;
    }
}
