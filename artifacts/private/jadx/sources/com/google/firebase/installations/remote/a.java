package com.google.firebase.installations.remote;

import androidx.annotation.p0;

/* JADX INFO: loaded from: classes5.dex */
final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f123252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f123253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f123254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f f123255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d.b f123256e;

    static final class b extends d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f123257a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f123258b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f123259c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private f f123260d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private d.b f123261e;

        @Override // com.google.firebase.installations.remote.d.a
        public d a() {
            return new a(this.f123257a, this.f123258b, this.f123259c, this.f123260d, this.f123261e);
        }

        @Override // com.google.firebase.installations.remote.d.a
        public d.a b(f fVar) {
            this.f123260d = fVar;
            return this;
        }

        @Override // com.google.firebase.installations.remote.d.a
        public d.a c(String str) {
            this.f123258b = str;
            return this;
        }

        @Override // com.google.firebase.installations.remote.d.a
        public d.a d(String str) {
            this.f123259c = str;
            return this;
        }

        @Override // com.google.firebase.installations.remote.d.a
        public d.a e(d.b bVar) {
            this.f123261e = bVar;
            return this;
        }

        @Override // com.google.firebase.installations.remote.d.a
        public d.a f(String str) {
            this.f123257a = str;
            return this;
        }

        b() {
        }

        private b(d dVar) {
            this.f123257a = dVar.f();
            this.f123258b = dVar.c();
            this.f123259c = dVar.d();
            this.f123260d = dVar.b();
            this.f123261e = dVar.e();
        }
    }

    @Override // com.google.firebase.installations.remote.d
    @p0
    public f b() {
        return this.f123255d;
    }

    @Override // com.google.firebase.installations.remote.d
    @p0
    public String c() {
        return this.f123253b;
    }

    @Override // com.google.firebase.installations.remote.d
    @p0
    public String d() {
        return this.f123254c;
    }

    @Override // com.google.firebase.installations.remote.d
    @p0
    public d.b e() {
        return this.f123256e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str = this.f123252a;
            if (str != null ? str.equals(dVar.f()) : dVar.f() == null) {
                String str2 = this.f123253b;
                if (str2 != null ? str2.equals(dVar.c()) : dVar.c() == null) {
                    String str3 = this.f123254c;
                    if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
                        f fVar = this.f123255d;
                        if (fVar != null ? fVar.equals(dVar.b()) : dVar.b() == null) {
                            d.b bVar = this.f123256e;
                            if (bVar != null ? bVar.equals(dVar.e()) : dVar.e() == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.installations.remote.d
    @p0
    public String f() {
        return this.f123252a;
    }

    @Override // com.google.firebase.installations.remote.d
    public d.a g() {
        return new b(this);
    }

    public int hashCode() {
        String str = this.f123252a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f123253b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f123254c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        f fVar = this.f123255d;
        int iHashCode4 = (iHashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        d.b bVar = this.f123256e;
        return iHashCode4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f123252a + ", fid=" + this.f123253b + ", refreshToken=" + this.f123254c + ", authToken=" + this.f123255d + ", responseCode=" + this.f123256e + "}";
    }

    private a(@p0 String str, @p0 String str2, @p0 String str3, @p0 f fVar, @p0 d.b bVar) {
        this.f123252a = str;
        this.f123253b = str2;
        this.f123254c = str3;
        this.f123255d = fVar;
        this.f123256e = bVar;
    }
}
