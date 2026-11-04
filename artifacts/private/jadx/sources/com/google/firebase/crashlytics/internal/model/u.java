package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.p0;

/* JADX INFO: loaded from: classes5.dex */
final class u extends f0.f.d.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Double f121736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f121737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f121738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f121739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f121740e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f121741f;

    static final class b extends f0.f.d.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Double f121742a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f121743b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f121744c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f121745d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f121746e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f121747f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private byte f121748g;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.c.a
        public f0.f.d.c a() {
            if (this.f121748g == 31) {
                return new u(this.f121742a, this.f121743b, this.f121744c, this.f121745d, this.f121746e, this.f121747f);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f121748g & 1) == 0) {
                sb2.append(" batteryVelocity");
            }
            if ((this.f121748g & 2) == 0) {
                sb2.append(" proximityOn");
            }
            if ((this.f121748g & 4) == 0) {
                sb2.append(" orientation");
            }
            if ((this.f121748g & 8) == 0) {
                sb2.append(" ramUsed");
            }
            if ((this.f121748g & com.google.common.base.c.f116465r) == 0) {
                sb2.append(" diskUsed");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.c.a
        public f0.f.d.c.a b(Double d10) {
            this.f121742a = d10;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.c.a
        public f0.f.d.c.a c(int i10) {
            this.f121743b = i10;
            this.f121748g = (byte) (this.f121748g | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.c.a
        public f0.f.d.c.a d(long j10) {
            this.f121747f = j10;
            this.f121748g = (byte) (this.f121748g | com.google.common.base.c.f116465r);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.c.a
        public f0.f.d.c.a e(int i10) {
            this.f121745d = i10;
            this.f121748g = (byte) (this.f121748g | 4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.c.a
        public f0.f.d.c.a f(boolean z10) {
            this.f121744c = z10;
            this.f121748g = (byte) (this.f121748g | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.c.a
        public f0.f.d.c.a g(long j10) {
            this.f121746e = j10;
            this.f121748g = (byte) (this.f121748g | 8);
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.c
    @p0
    public Double b() {
        return this.f121736a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.c
    public int c() {
        return this.f121737b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.c
    public long d() {
        return this.f121741f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.c
    public int e() {
        return this.f121739d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.f.d.c) {
            f0.f.d.c cVar = (f0.f.d.c) obj;
            Double d10 = this.f121736a;
            if (d10 == null) {
                if (cVar.b() == null) {
                    if (this.f121737b == cVar.c() && this.f121738c == cVar.g() && this.f121739d == cVar.e() && this.f121740e == cVar.f() && this.f121741f == cVar.d()) {
                        return true;
                    }
                }
            } else if (d10.equals(cVar.b())) {
                if (this.f121737b == cVar.c()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.c
    public long f() {
        return this.f121740e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.c
    public boolean g() {
        return this.f121738c;
    }

    public int hashCode() {
        Double d10 = this.f121736a;
        int iHashCode = ((((((((d10 == null ? 0 : d10.hashCode()) ^ 1000003) * 1000003) ^ this.f121737b) * 1000003) ^ (this.f121738c ? 1231 : 1237)) * 1000003) ^ this.f121739d) * 1000003;
        long j10 = this.f121740e;
        long j11 = this.f121741f;
        return ((int) (j11 ^ (j11 >>> 32))) ^ ((iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003);
    }

    public String toString() {
        return "Device{batteryLevel=" + this.f121736a + ", batteryVelocity=" + this.f121737b + ", proximityOn=" + this.f121738c + ", orientation=" + this.f121739d + ", ramUsed=" + this.f121740e + ", diskUsed=" + this.f121741f + "}";
    }

    private u(@p0 Double d10, int i10, boolean z10, int i11, long j10, long j11) {
        this.f121736a = d10;
        this.f121737b = i10;
        this.f121738c = z10;
        this.f121739d = i11;
        this.f121740e = j10;
        this.f121741f = j11;
    }
}
