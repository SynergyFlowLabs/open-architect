package com.google.firebase;

/* JADX INFO: loaded from: classes5.dex */
final class a extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f120421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f120422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f120423c;

    a(long j10, long j11, long j12) {
        this.f120421a = j10;
        this.f120422b = j11;
        this.f120423c = j12;
    }

    @Override // com.google.firebase.v
    public long b() {
        return this.f120422b;
    }

    @Override // com.google.firebase.v
    public long c() {
        return this.f120421a;
    }

    @Override // com.google.firebase.v
    public long d() {
        return this.f120423c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            if (this.f120421a == vVar.c() && this.f120422b == vVar.b() && this.f120423c == vVar.d()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f120421a;
        long j11 = this.f120422b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f120423c;
        return ((int) ((j12 >>> 32) ^ j12)) ^ i10;
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f120421a + ", elapsedRealtime=" + this.f120422b + ", uptimeMillis=" + this.f120423c + "}";
    }
}
