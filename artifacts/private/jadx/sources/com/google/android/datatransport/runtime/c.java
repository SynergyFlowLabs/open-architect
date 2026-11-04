package com.google.android.datatransport.runtime;

/* JADX INFO: loaded from: classes4.dex */
final class c extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f103499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f103500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.datatransport.f<?> f103501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.datatransport.k<?, byte[]> f103502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.datatransport.e f103503e;

    static final class b extends q.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private r f103504a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f103505b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private com.google.android.datatransport.f<?> f103506c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private com.google.android.datatransport.k<?, byte[]> f103507d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private com.google.android.datatransport.e f103508e;

        b() {
        }

        @Override // com.google.android.datatransport.runtime.q.a
        public q a() {
            String str = "";
            if (this.f103504a == null) {
                str = " transportContext";
            }
            if (this.f103505b == null) {
                str = str + " transportName";
            }
            if (this.f103506c == null) {
                str = str + " event";
            }
            if (this.f103507d == null) {
                str = str + " transformer";
            }
            if (this.f103508e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new c(this.f103504a, this.f103505b, this.f103506c, this.f103507d, this.f103508e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.runtime.q.a
        q.a b(com.google.android.datatransport.e eVar) {
            if (eVar == null) {
                throw new NullPointerException("Null encoding");
            }
            this.f103508e = eVar;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.q.a
        q.a c(com.google.android.datatransport.f<?> fVar) {
            if (fVar == null) {
                throw new NullPointerException("Null event");
            }
            this.f103506c = fVar;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.q.a
        q.a e(com.google.android.datatransport.k<?, byte[]> kVar) {
            if (kVar == null) {
                throw new NullPointerException("Null transformer");
            }
            this.f103507d = kVar;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.q.a
        public q.a f(r rVar) {
            if (rVar == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.f103504a = rVar;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.q.a
        public q.a g(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f103505b = str;
            return this;
        }
    }

    @Override // com.google.android.datatransport.runtime.q
    public com.google.android.datatransport.e b() {
        return this.f103503e;
    }

    @Override // com.google.android.datatransport.runtime.q
    com.google.android.datatransport.f<?> c() {
        return this.f103501c;
    }

    @Override // com.google.android.datatransport.runtime.q
    com.google.android.datatransport.k<?, byte[]> e() {
        return this.f103502d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.f103499a.equals(qVar.f()) && this.f103500b.equals(qVar.g()) && this.f103501c.equals(qVar.c()) && this.f103502d.equals(qVar.e()) && this.f103503e.equals(qVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.q
    public r f() {
        return this.f103499a;
    }

    @Override // com.google.android.datatransport.runtime.q
    public String g() {
        return this.f103500b;
    }

    public int hashCode() {
        return this.f103503e.hashCode() ^ ((((((((this.f103499a.hashCode() ^ 1000003) * 1000003) ^ this.f103500b.hashCode()) * 1000003) ^ this.f103501c.hashCode()) * 1000003) ^ this.f103502d.hashCode()) * 1000003);
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f103499a + ", transportName=" + this.f103500b + ", event=" + this.f103501c + ", transformer=" + this.f103502d + ", encoding=" + this.f103503e + "}";
    }

    private c(r rVar, String str, com.google.android.datatransport.f<?> fVar, com.google.android.datatransport.k<?, byte[]> kVar, com.google.android.datatransport.e eVar) {
        this.f103499a = rVar;
        this.f103500b = str;
        this.f103501c = fVar;
        this.f103502d = kVar;
        this.f103503e = eVar;
    }
}
