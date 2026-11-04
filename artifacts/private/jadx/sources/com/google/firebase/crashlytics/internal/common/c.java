package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
final class c extends o0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f120984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f120985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f120986c;

    c(String str, @androidx.annotation.p0 String str2, @androidx.annotation.p0 String str3) {
        if (str == null) {
            throw new NullPointerException("Null crashlyticsInstallId");
        }
        this.f120984a = str;
        this.f120985b = str2;
        this.f120986c = str3;
    }

    @Override // com.google.firebase.crashlytics.internal.common.o0.a
    @NonNull
    public String c() {
        return this.f120984a;
    }

    @Override // com.google.firebase.crashlytics.internal.common.o0.a
    @androidx.annotation.p0
    public String d() {
        return this.f120986c;
    }

    @Override // com.google.firebase.crashlytics.internal.common.o0.a
    @androidx.annotation.p0
    public String e() {
        return this.f120985b;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0038  */
    /* JADX WARN: Code duplicated, block: B:20:0x0040  */
    /* JADX WARN: Code duplicated, block: B:21:0x0042  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        if (r5.equals(r6.d()) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof com.google.firebase.crashlytics.internal.common.o0.a
            r2 = 0
            if (r1 == 0) goto L50
            com.google.firebase.crashlytics.internal.common.o0$a r6 = (com.google.firebase.crashlytics.internal.common.o0.a) r6
            java.lang.String r1 = r5.f120984a
            java.lang.String r3 = r6.c()
            r4 = 7
            boolean r1 = r1.equals(r3)
            r4 = 2
            if (r1 == 0) goto L50
            java.lang.String r1 = r5.f120985b
            r4 = 0
            if (r1 != 0) goto L27
            java.lang.String r1 = r6.e()
            r4 = 1
            if (r1 != 0) goto L50
            r4 = 1
            goto L33
        L27:
            java.lang.String r3 = r6.e()
            r4 = 0
            boolean r1 = r1.equals(r3)
            r4 = 7
            if (r1 == 0) goto L50
        L33:
            java.lang.String r5 = r5.f120986c
            r4 = 2
            if (r5 != 0) goto L42
            r4 = 2
            java.lang.String r5 = r6.d()
            r4 = 3
            if (r5 != 0) goto L50
            r4 = 6
            goto L4e
        L42:
            java.lang.String r6 = r6.d()
            r4 = 6
            boolean r5 = r5.equals(r6)
            r4 = 2
            if (r5 == 0) goto L50
        L4e:
            r4 = 3
            return r0
        L50:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.common.c.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int iHashCode = (this.f120984a.hashCode() ^ 1000003) * 1000003;
        String str = this.f120985b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f120986c;
        return iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "InstallIds{crashlyticsInstallId=" + this.f120984a + ", firebaseInstallationId=" + this.f120985b + ", firebaseAuthenticationToken=" + this.f120986c + "}";
    }
}
