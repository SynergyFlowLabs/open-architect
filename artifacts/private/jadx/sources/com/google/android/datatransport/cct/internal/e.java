package com.google.android.datatransport.cct.internal;

import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
final class e extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o.b f103304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.datatransport.cct.internal.a f103305b;

    static final class b extends o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private o.b f103306a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.google.android.datatransport.cct.internal.a f103307b;

        b() {
        }

        @Override // com.google.android.datatransport.cct.internal.o.a
        public o a() {
            return new e(this.f103306a, this.f103307b);
        }

        @Override // com.google.android.datatransport.cct.internal.o.a
        public o.a b(@p0 com.google.android.datatransport.cct.internal.a aVar) {
            this.f103307b = aVar;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.o.a
        public o.a c(@p0 o.b bVar) {
            this.f103306a = bVar;
            return this;
        }
    }

    @Override // com.google.android.datatransport.cct.internal.o
    @p0
    public com.google.android.datatransport.cct.internal.a b() {
        return this.f103305b;
    }

    @Override // com.google.android.datatransport.cct.internal.o
    @p0
    public o.b c() {
        return this.f103304a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            o.b bVar = this.f103304a;
            if (bVar != null ? bVar.equals(oVar.c()) : oVar.c() == null) {
                com.google.android.datatransport.cct.internal.a aVar = this.f103305b;
                if (aVar != null ? aVar.equals(oVar.b()) : oVar.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        o.b bVar = this.f103304a;
        int iHashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        com.google.android.datatransport.cct.internal.a aVar = this.f103305b;
        return iHashCode ^ (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f103304a + ", androidClientInfo=" + this.f103305b + "}";
    }

    private e(@p0 o.b bVar, @p0 com.google.android.datatransport.cct.internal.a aVar) {
        this.f103304a = bVar;
        this.f103305b = aVar;
    }
}
