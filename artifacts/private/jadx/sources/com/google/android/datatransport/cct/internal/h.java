package com.google.android.datatransport.cct.internal;

import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
final class h extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f103316a;

    static final class b extends r.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f103317a;

        b() {
        }

        @Override // com.google.android.datatransport.cct.internal.r.a
        public r a() {
            return new h(this.f103317a);
        }

        @Override // com.google.android.datatransport.cct.internal.r.a
        public r.a b(@p0 Integer num) {
            this.f103317a = num;
            return this;
        }
    }

    @Override // com.google.android.datatransport.cct.internal.r
    @p0
    public Integer b() {
        return this.f103316a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        Integer num = this.f103316a;
        if (num == null) {
            return rVar.b() == null;
        }
        return num.equals(rVar.b());
    }

    public int hashCode() {
        Integer num = this.f103316a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.f103316a + "}";
    }

    private h(@p0 Integer num) {
        this.f103316a = num;
    }
}
