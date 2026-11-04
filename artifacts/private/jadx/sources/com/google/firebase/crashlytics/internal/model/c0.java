package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: loaded from: classes5.dex */
final class c0 extends g0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f121542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f121543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f121544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f121545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f121546e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.f f121547f;

    c0(String str, String str2, String str3, String str4, int i10, com.google.firebase.crashlytics.internal.f fVar) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.f121542a = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.f121543b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.f121544c = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.f121545d = str4;
        this.f121546e = i10;
        if (fVar == null) {
            throw new NullPointerException("Null developmentPlatformProvider");
        }
        this.f121547f = fVar;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.a
    public String a() {
        return this.f121542a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.a
    public int c() {
        return this.f121546e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.a
    public com.google.firebase.crashlytics.internal.f d() {
        return this.f121547f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.a
    public String e() {
        return this.f121545d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g0.a) {
            g0.a aVar = (g0.a) obj;
            if (this.f121542a.equals(aVar.a()) && this.f121543b.equals(aVar.f()) && this.f121544c.equals(aVar.g()) && this.f121545d.equals(aVar.e()) && this.f121546e == aVar.c() && this.f121547f.equals(aVar.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.a
    public String f() {
        return this.f121543b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.a
    public String g() {
        return this.f121544c;
    }

    public int hashCode() {
        return this.f121547f.hashCode() ^ ((((((((((this.f121542a.hashCode() ^ 1000003) * 1000003) ^ this.f121543b.hashCode()) * 1000003) ^ this.f121544c.hashCode()) * 1000003) ^ this.f121545d.hashCode()) * 1000003) ^ this.f121546e) * 1000003);
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.f121542a + ", versionCode=" + this.f121543b + ", versionName=" + this.f121544c + ", installUuid=" + this.f121545d + ", deliveryMechanism=" + this.f121546e + ", developmentPlatformProvider=" + this.f121547f + "}";
    }
}
