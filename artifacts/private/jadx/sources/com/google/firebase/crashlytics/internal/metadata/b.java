package com.google.firebase.crashlytics.internal.metadata;

/* JADX INFO: loaded from: classes5.dex */
final class b extends j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f121265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f121266d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f121267e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f121268f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f121269g;

    b(String str, String str2, String str3, String str4, long j10) {
        if (str == null) {
            throw new NullPointerException("Null rolloutId");
        }
        this.f121265c = str;
        if (str2 == null) {
            throw new NullPointerException("Null parameterKey");
        }
        this.f121266d = str2;
        if (str3 == null) {
            throw new NullPointerException("Null parameterValue");
        }
        this.f121267e = str3;
        if (str4 == null) {
            throw new NullPointerException("Null variantId");
        }
        this.f121268f = str4;
        this.f121269g = j10;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.j
    public String c() {
        return this.f121266d;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.j
    public String d() {
        return this.f121267e;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.j
    public String e() {
        return this.f121265c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f121265c.equals(jVar.e()) && this.f121266d.equals(jVar.c()) && this.f121267e.equals(jVar.d()) && this.f121268f.equals(jVar.g()) && this.f121269g == jVar.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.j
    public long f() {
        return this.f121269g;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.j
    public String g() {
        return this.f121268f;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f121265c.hashCode() ^ 1000003) * 1000003) ^ this.f121266d.hashCode()) * 1000003) ^ this.f121267e.hashCode()) * 1000003) ^ this.f121268f.hashCode()) * 1000003;
        long j10 = this.f121269g;
        return ((int) (j10 ^ (j10 >>> 32))) ^ iHashCode;
    }

    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.f121265c + ", parameterKey=" + this.f121266d + ", parameterValue=" + this.f121267e + ", variantId=" + this.f121268f + ", templateVersion=" + this.f121269g + "}";
    }
}
