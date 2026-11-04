package com.google.android.datatransport.cct.internal;

import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
final class m extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w.c f103353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w.b f103354b;

    static final class b extends w.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private w.c f103355a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private w.b f103356b;

        b() {
        }

        @Override // com.google.android.datatransport.cct.internal.w.a
        public w a() {
            return new m(this.f103355a, this.f103356b);
        }

        @Override // com.google.android.datatransport.cct.internal.w.a
        public w.a b(@p0 w.b bVar) {
            this.f103356b = bVar;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.w.a
        public w.a c(@p0 w.c cVar) {
            this.f103355a = cVar;
            return this;
        }
    }

    @Override // com.google.android.datatransport.cct.internal.w
    @p0
    public w.b b() {
        return this.f103354b;
    }

    @Override // com.google.android.datatransport.cct.internal.w
    @p0
    public w.c c() {
        return this.f103353a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            w.c cVar = this.f103353a;
            if (cVar != null ? cVar.equals(wVar.c()) : wVar.c() == null) {
                w.b bVar = this.f103354b;
                if (bVar != null ? bVar.equals(wVar.b()) : wVar.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        w.c cVar = this.f103353a;
        int iHashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        w.b bVar = this.f103354b;
        return iHashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f103353a + ", mobileSubtype=" + this.f103354b + "}";
    }

    private m(@p0 w.c cVar, @p0 w.b bVar) {
        this.f103353a = cVar;
        this.f103354b = bVar;
    }
}
