package com.google.android.datatransport.runtime.backends;

/* JADX INFO: loaded from: classes4.dex */
final class b extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h.a f103472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f103473b;

    b(h.a aVar, long j10) {
        if (aVar == null) {
            throw new NullPointerException("Null status");
        }
        this.f103472a = aVar;
        this.f103473b = j10;
    }

    @Override // com.google.android.datatransport.runtime.backends.h
    public long b() {
        return this.f103473b;
    }

    @Override // com.google.android.datatransport.runtime.backends.h
    public h.a c() {
        return this.f103472a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f103472a.equals(hVar.c()) && this.f103473b == hVar.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f103472a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f103473b;
        return ((int) (j10 ^ (j10 >>> 32))) ^ iHashCode;
    }

    public String toString() {
        return "BackendResponse{status=" + this.f103472a + ", nextRequestWaitMillis=" + this.f103473b + "}";
    }
}
