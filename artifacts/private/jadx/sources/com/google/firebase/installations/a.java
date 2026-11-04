package com.google.firebase.installations;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
final class a extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f123154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f123155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f123156c;

    static final class b extends p.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f123157a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f123158b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Long f123159c;

        @Override // com.google.firebase.installations.p.a
        public p a() {
            String str = "";
            if (this.f123157a == null) {
                str = " token";
            }
            if (this.f123158b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f123159c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new a(this.f123157a, this.f123158b.longValue(), this.f123159c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.p.a
        public p.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            this.f123157a = str;
            return this;
        }

        @Override // com.google.firebase.installations.p.a
        public p.a c(long j10) {
            this.f123159c = Long.valueOf(j10);
            return this;
        }

        @Override // com.google.firebase.installations.p.a
        public p.a d(long j10) {
            this.f123158b = Long.valueOf(j10);
            return this;
        }

        b() {
        }

        private b(p pVar) {
            this.f123157a = pVar.b();
            this.f123158b = Long.valueOf(pVar.d());
            this.f123159c = Long.valueOf(pVar.c());
        }
    }

    @Override // com.google.firebase.installations.p
    @NonNull
    public String b() {
        return this.f123154a;
    }

    @Override // com.google.firebase.installations.p
    @NonNull
    public long c() {
        return this.f123156c;
    }

    @Override // com.google.firebase.installations.p
    @NonNull
    public long d() {
        return this.f123155b;
    }

    @Override // com.google.firebase.installations.p
    public p.a e() {
        return new b(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.f123154a.equals(pVar.b()) && this.f123155b == pVar.d() && this.f123156c == pVar.c()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f123154a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f123155b;
        long j11 = this.f123156c;
        return ((int) (j11 ^ (j11 >>> 32))) ^ ((iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003);
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f123154a + ", tokenExpirationTimestamp=" + this.f123155b + ", tokenCreationTimestamp=" + this.f123156c + "}";
    }

    private a(String str, long j10, long j11) {
        this.f123154a = str;
        this.f123155b = j10;
        this.f123156c = j11;
    }
}
