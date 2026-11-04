package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
final class d extends g.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f103626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f103627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<g.c> f103628c;

    static final class b extends g.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f103629a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f103630b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Set<g.c> f103631c;

        b() {
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.g.b.a
        public g.b a() {
            String str = "";
            if (this.f103629a == null) {
                str = " delta";
            }
            if (this.f103630b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f103631c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new d(this.f103629a.longValue(), this.f103630b.longValue(), this.f103631c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.g.b.a
        public g.b.a b(long j10) {
            this.f103629a = Long.valueOf(j10);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.g.b.a
        public g.b.a c(Set<g.c> set) {
            if (set == null) {
                throw new NullPointerException("Null flags");
            }
            this.f103631c = set;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.g.b.a
        public g.b.a d(long j10) {
            this.f103630b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.g.b
    long b() {
        return this.f103626a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.g.b
    Set<g.c> c() {
        return this.f103628c;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.g.b
    long d() {
        return this.f103627b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g.b) {
            g.b bVar = (g.b) obj;
            if (this.f103626a == bVar.b() && this.f103627b == bVar.d() && this.f103628c.equals(bVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f103626a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        long j11 = this.f103627b;
        return this.f103628c.hashCode() ^ ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003);
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f103626a + ", maxAllowedDelay=" + this.f103627b + ", flags=" + this.f103628c + "}";
    }

    private d(long j10, long j11, Set<g.c> set) {
        this.f103626a = j10;
        this.f103627b = j11;
        this.f103628c = set;
    }
}
