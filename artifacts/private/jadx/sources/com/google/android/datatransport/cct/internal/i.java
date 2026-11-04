package com.google.android.datatransport.cct.internal;

import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
final class i extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f103318a;

    static final class b extends s.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private r f103319a;

        b() {
        }

        @Override // com.google.android.datatransport.cct.internal.s.a
        public s a() {
            return new i(this.f103319a);
        }

        @Override // com.google.android.datatransport.cct.internal.s.a
        public s.a b(@p0 r rVar) {
            this.f103319a = rVar;
            return this;
        }
    }

    @Override // com.google.android.datatransport.cct.internal.s
    @p0
    public r b() {
        return this.f103318a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        r rVar = this.f103318a;
        if (rVar == null) {
            return sVar.b() == null;
        }
        return rVar.equals(sVar.b());
    }

    public int hashCode() {
        int iHashCode;
        r rVar = this.f103318a;
        if (rVar == null) {
            iHashCode = 0;
            int i10 = 6 | 0;
        } else {
            iHashCode = rVar.hashCode();
        }
        return iHashCode ^ 1000003;
    }

    public String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f103318a + "}";
    }

    private i(@p0 r rVar) {
        this.f103318a = rVar;
    }
}
