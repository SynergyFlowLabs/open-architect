package com.google.firebase.heartbeatinfo;

/* JADX INFO: loaded from: classes5.dex */
final class b extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f122078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f122079b;

    b(String str, long j10) {
        if (str == null) {
            throw new NullPointerException("Null sdkName");
        }
        this.f122078a = str;
        this.f122079b = j10;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            if (this.f122078a.equals(sVar.l()) && this.f122079b == sVar.k()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f122078a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f122079b;
        return ((int) (j10 ^ (j10 >>> 32))) ^ iHashCode;
    }

    @Override // com.google.firebase.heartbeatinfo.s
    public long k() {
        return this.f122079b;
    }

    @Override // com.google.firebase.heartbeatinfo.s
    public String l() {
        return this.f122078a;
    }

    public String toString() {
        return "SdkHeartBeatResult{sdkName=" + this.f122078a + ", millis=" + this.f122079b + "}";
    }
}
