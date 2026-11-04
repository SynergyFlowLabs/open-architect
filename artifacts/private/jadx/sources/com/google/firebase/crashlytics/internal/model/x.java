package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
final class x extends f0.f.d.e.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f121760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f121761b;

    static final class b extends f0.f.d.e.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f121762a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f121763b;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.e.b.a
        public f0.f.d.e.b a() {
            String str;
            String str2 = this.f121762a;
            if (str2 != null && (str = this.f121763b) != null) {
                return new x(str2, str);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f121762a == null) {
                sb2.append(" rolloutId");
            }
            if (this.f121763b == null) {
                sb2.append(" variantId");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.e.b.a
        public f0.f.d.e.b.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null rolloutId");
            }
            this.f121762a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.e.b.a
        public f0.f.d.e.b.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            this.f121763b = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.e.b
    @NonNull
    public String b() {
        return this.f121760a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.e.b
    @NonNull
    public String c() {
        return this.f121761b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.f.d.e.b) {
            f0.f.d.e.b bVar = (f0.f.d.e.b) obj;
            if (this.f121760a.equals(bVar.b()) && this.f121761b.equals(bVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f121761b.hashCode() ^ ((this.f121760a.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "RolloutVariant{rolloutId=" + this.f121760a + ", variantId=" + this.f121761b + "}";
    }

    private x(String str, String str2) {
        this.f121760a = str;
        this.f121761b = str2;
    }
}
