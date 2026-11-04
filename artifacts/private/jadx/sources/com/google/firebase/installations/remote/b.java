package com.google.firebase.installations.remote;

import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes5.dex */
final class b extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f123262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f123263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f.b f123264c;

    /* JADX INFO: renamed from: com.google.firebase.installations.remote.b$b, reason: collision with other inner class name */
    static final class C1170b extends f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f123265a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f123266b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private f.b f123267c;

        @Override // com.google.firebase.installations.remote.f.a
        public f a() {
            String str = "";
            if (this.f123266b == null) {
                str = " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new b(this.f123265a, this.f123266b.longValue(), this.f123267c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.remote.f.a
        public f.a b(f.b bVar) {
            this.f123267c = bVar;
            return this;
        }

        @Override // com.google.firebase.installations.remote.f.a
        public f.a c(String str) {
            this.f123265a = str;
            return this;
        }

        @Override // com.google.firebase.installations.remote.f.a
        public f.a d(long j10) {
            this.f123266b = Long.valueOf(j10);
            return this;
        }

        C1170b() {
        }

        private C1170b(f fVar) {
            this.f123265a = fVar.c();
            this.f123266b = Long.valueOf(fVar.d());
            this.f123267c = fVar.b();
        }
    }

    @Override // com.google.firebase.installations.remote.f
    @p0
    public f.b b() {
        return this.f123264c;
    }

    @Override // com.google.firebase.installations.remote.f
    @p0
    public String c() {
        return this.f123262a;
    }

    @Override // com.google.firebase.installations.remote.f
    @NonNull
    public long d() {
        return this.f123263b;
    }

    @Override // com.google.firebase.installations.remote.f
    public f.a e() {
        return new C1170b(this);
    }

    public boolean equals(Object obj) {
        f.b bVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            String str = this.f123262a;
            if (str != null ? str.equals(fVar.c()) : fVar.c() == null) {
                if (this.f123263b == fVar.d() && ((bVar = this.f123264c) != null ? bVar.equals(fVar.b()) : fVar.b() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f123262a;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j10 = this.f123263b;
        int i10 = (((iHashCode2 ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        f.b bVar = this.f123264c;
        if (bVar != null) {
            iHashCode = bVar.hashCode();
        }
        return i10 ^ iHashCode;
    }

    public String toString() {
        return "TokenResult{token=" + this.f123262a + ", tokenExpirationTimestamp=" + this.f123263b + ", responseCode=" + this.f123264c + "}";
    }

    private b(@p0 String str, long j10, @p0 f.b bVar) {
        this.f123262a = str;
        this.f123263b = j10;
        this.f123264c = bVar;
    }
}
