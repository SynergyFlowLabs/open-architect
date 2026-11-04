package com.google.android.datatransport.runtime.scheduling.persistence;

/* JADX INFO: loaded from: classes4.dex */
final class b extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f103717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.r f103718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.j f103719c;

    b(long j10, com.google.android.datatransport.runtime.r rVar, com.google.android.datatransport.runtime.j jVar) {
        this.f103717a = j10;
        if (rVar == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f103718b = rVar;
        if (jVar == null) {
            throw new NullPointerException("Null event");
        }
        this.f103719c = jVar;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.k
    public com.google.android.datatransport.runtime.j b() {
        return this.f103719c;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.k
    public long c() {
        return this.f103717a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.k
    public com.google.android.datatransport.runtime.r d() {
        return this.f103718b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f103717a == kVar.c() && this.f103718b.equals(kVar.d()) && this.f103719c.equals(kVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f103717a;
        return this.f103719c.hashCode() ^ ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f103718b.hashCode()) * 1000003);
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f103717a + ", transportContext=" + this.f103718b + ", event=" + this.f103719c + "}";
    }
}
