package com.google.android.datatransport.cct.internal;

/* JADX INFO: loaded from: classes4.dex */
final class l extends v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f103352b;

    l(long j10) {
        this.f103352b = j10;
    }

    @Override // com.google.android.datatransport.cct.internal.v
    public long c() {
        return this.f103352b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof v) && this.f103352b == ((v) obj).c();
    }

    public int hashCode() {
        long j10 = this.f103352b;
        return ((int) (j10 ^ (j10 >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f103352b + "}";
    }
}
