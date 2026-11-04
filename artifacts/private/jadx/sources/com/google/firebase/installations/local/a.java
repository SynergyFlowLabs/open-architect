package com.google.firebase.installations.local;

import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes5.dex */
final class a extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f123208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c.a f123209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f123210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f123211e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f123212f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f123213g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f123214h;

    static final class b extends d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f123215a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c.a f123216b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f123217c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f123218d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Long f123219e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Long f123220f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f123221g;

        @Override // com.google.firebase.installations.local.d.a
        public d a() {
            String str = "";
            if (this.f123216b == null) {
                str = " registrationStatus";
            }
            if (this.f123219e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f123220f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new a(this.f123215a, this.f123216b, this.f123217c, this.f123218d, this.f123219e.longValue(), this.f123220f.longValue(), this.f123221g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.local.d.a
        public d.a b(@p0 String str) {
            this.f123217c = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.d.a
        public d.a c(long j10) {
            this.f123219e = Long.valueOf(j10);
            return this;
        }

        @Override // com.google.firebase.installations.local.d.a
        public d.a d(String str) {
            this.f123215a = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.d.a
        public d.a e(@p0 String str) {
            this.f123221g = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.d.a
        public d.a f(@p0 String str) {
            this.f123218d = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.d.a
        public d.a g(c.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.f123216b = aVar;
            return this;
        }

        @Override // com.google.firebase.installations.local.d.a
        public d.a h(long j10) {
            this.f123220f = Long.valueOf(j10);
            return this;
        }

        b() {
        }

        private b(d dVar) {
            this.f123215a = dVar.d();
            this.f123216b = dVar.g();
            this.f123217c = dVar.b();
            this.f123218d = dVar.f();
            this.f123219e = Long.valueOf(dVar.c());
            this.f123220f = Long.valueOf(dVar.h());
            this.f123221g = dVar.e();
        }
    }

    @Override // com.google.firebase.installations.local.d
    @p0
    public String b() {
        return this.f123210d;
    }

    @Override // com.google.firebase.installations.local.d
    public long c() {
        return this.f123212f;
    }

    @Override // com.google.firebase.installations.local.d
    @p0
    public String d() {
        return this.f123208b;
    }

    @Override // com.google.firebase.installations.local.d
    @p0
    public String e() {
        return this.f123214h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x008f, code lost:
    
        if (r8.equals(r9.e()) != false) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            r7 = 0
            if (r9 != r8) goto L5
            return r0
        L5:
            boolean r1 = r9 instanceof com.google.firebase.installations.local.d
            r2 = 0
            if (r1 == 0) goto L92
            com.google.firebase.installations.local.d r9 = (com.google.firebase.installations.local.d) r9
            java.lang.String r1 = r8.f123208b
            if (r1 != 0) goto L17
            java.lang.String r1 = r9.d()
            if (r1 != 0) goto L92
            goto L23
        L17:
            r7 = 5
            java.lang.String r3 = r9.d()
            boolean r1 = r1.equals(r3)
            r7 = 1
            if (r1 == 0) goto L92
        L23:
            com.google.firebase.installations.local.c$a r1 = r8.f123209c
            com.google.firebase.installations.local.c$a r3 = r9.g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L92
            java.lang.String r1 = r8.f123210d
            if (r1 != 0) goto L3b
            java.lang.String r1 = r9.b()
            r7 = 0
            if (r1 != 0) goto L92
            goto L45
        L3b:
            java.lang.String r3 = r9.b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L92
        L45:
            java.lang.String r1 = r8.f123211e
            r7 = 6
            if (r1 != 0) goto L52
            java.lang.String r1 = r9.f()
            r7 = 6
            if (r1 != 0) goto L92
            goto L5e
        L52:
            r7 = 5
            java.lang.String r3 = r9.f()
            boolean r1 = r1.equals(r3)
            r7 = 0
            if (r1 == 0) goto L92
        L5e:
            r7 = 0
            long r3 = r8.f123212f
            r7 = 0
            long r5 = r9.c()
            r7 = 4
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r7 = 2
            if (r1 != 0) goto L92
            long r3 = r8.f123213g
            r7 = 5
            long r5 = r9.h()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r7 = 5
            if (r1 != 0) goto L92
            java.lang.String r8 = r8.f123214h
            if (r8 != 0) goto L86
            r7 = 0
            java.lang.String r8 = r9.e()
            r7 = 7
            if (r8 != 0) goto L92
            r7 = 3
            goto L91
        L86:
            java.lang.String r9 = r9.e()
            boolean r8 = r8.equals(r9)
            r7 = 0
            if (r8 == 0) goto L92
        L91:
            return r0
        L92:
            r7 = 5
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.local.a.equals(java.lang.Object):boolean");
    }

    @Override // com.google.firebase.installations.local.d
    @p0
    public String f() {
        return this.f123211e;
    }

    @Override // com.google.firebase.installations.local.d
    @NonNull
    public c.a g() {
        return this.f123209c;
    }

    @Override // com.google.firebase.installations.local.d
    public long h() {
        return this.f123213g;
    }

    public int hashCode() {
        String str = this.f123208b;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f123209c.hashCode()) * 1000003;
        String str2 = this.f123210d;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f123211e;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j10 = this.f123212f;
        int i10 = (iHashCode3 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f123213g;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f123214h;
        return i11 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // com.google.firebase.installations.local.d
    public d.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f123208b + ", registrationStatus=" + this.f123209c + ", authToken=" + this.f123210d + ", refreshToken=" + this.f123211e + ", expiresInSecs=" + this.f123212f + ", tokenCreationEpochInSecs=" + this.f123213g + ", fisError=" + this.f123214h + "}";
    }

    private a(@p0 String str, c.a aVar, @p0 String str2, @p0 String str3, long j10, long j11, @p0 String str4) {
        this.f123208b = str;
        this.f123209c = aVar;
        this.f123210d = str2;
        this.f123211e = str3;
        this.f123212f = j10;
        this.f123213g = j11;
        this.f123214h = str4;
    }
}
