package com.google.firebase.inappmessaging.model;

/* JADX INFO: loaded from: classes5.dex */
final class b extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f123039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f123040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f123041c;

    /* JADX INFO: renamed from: com.google.firebase.inappmessaging.model.b$b, reason: collision with other inner class name */
    static final class C1166b extends m.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f123042a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f123043b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f123044c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte f123045d;

        C1166b() {
        }

        @Override // com.google.firebase.inappmessaging.model.m.a
        public m a() {
            String str;
            if (this.f123045d == 3 && (str = this.f123042a) != null) {
                return new b(str, this.f123043b, this.f123044c);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f123042a == null) {
                sb2.append(" limiterKey");
            }
            if ((this.f123045d & 1) == 0) {
                sb2.append(" limit");
            }
            if ((this.f123045d & 2) == 0) {
                sb2.append(" timeToLiveMillis");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.google.firebase.inappmessaging.model.m.a
        public m.a b(long j10) {
            this.f123043b = j10;
            this.f123045d = (byte) (this.f123045d | 1);
            return this;
        }

        @Override // com.google.firebase.inappmessaging.model.m.a
        public m.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null limiterKey");
            }
            this.f123042a = str;
            return this;
        }

        @Override // com.google.firebase.inappmessaging.model.m.a
        public m.a d(long j10) {
            this.f123044c = j10;
            this.f123045d = (byte) (this.f123045d | 2);
            return this;
        }
    }

    @Override // com.google.firebase.inappmessaging.model.m
    public long b() {
        return this.f123040b;
    }

    @Override // com.google.firebase.inappmessaging.model.m
    public String c() {
        return this.f123039a;
    }

    @Override // com.google.firebase.inappmessaging.model.m
    public long d() {
        return this.f123041c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.f123039a.equals(mVar.c()) && this.f123040b == mVar.b() && this.f123041c == mVar.d()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f123039a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f123040b;
        long j11 = this.f123041c;
        return ((int) (j11 ^ (j11 >>> 32))) ^ ((iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003);
    }

    public String toString() {
        return "RateLimit{limiterKey=" + this.f123039a + ", limit=" + this.f123040b + ", timeToLiveMillis=" + this.f123041c + "}";
    }

    private b(String str, long j10, long j11) {
        this.f123039a = str;
        this.f123040b = j10;
        this.f123041c = j11;
    }
}
