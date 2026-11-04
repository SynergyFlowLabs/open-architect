package com.google.android.datatransport.cct.internal;

import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
final class f extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f103308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p.b f103309b;

    static final class b extends p.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private s f103310a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private p.b f103311b;

        b() {
        }

        @Override // com.google.android.datatransport.cct.internal.p.a
        public p a() {
            return new f(this.f103310a, this.f103311b);
        }

        @Override // com.google.android.datatransport.cct.internal.p.a
        public p.a b(@p0 s sVar) {
            this.f103310a = sVar;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.p.a
        public p.a c(@p0 p.b bVar) {
            this.f103311b = bVar;
            return this;
        }
    }

    @Override // com.google.android.datatransport.cct.internal.p
    @p0
    public s b() {
        return this.f103308a;
    }

    @Override // com.google.android.datatransport.cct.internal.p
    @p0
    public p.b c() {
        return this.f103309b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            s sVar = this.f103308a;
            if (sVar != null ? sVar.equals(pVar.b()) : pVar.b() == null) {
                p.b bVar = this.f103309b;
                if (bVar != null ? bVar.equals(pVar.c()) : pVar.c() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        s sVar = this.f103308a;
        int iHashCode = ((sVar == null ? 0 : sVar.hashCode()) ^ 1000003) * 1000003;
        p.b bVar = this.f103309b;
        return iHashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "ComplianceData{privacyContext=" + this.f103308a + ", productIdOrigin=" + this.f103309b + "}";
    }

    private f(@p0 s sVar, @p0 p.b bVar) {
        this.f103308a = sVar;
        this.f103309b = bVar;
    }
}
