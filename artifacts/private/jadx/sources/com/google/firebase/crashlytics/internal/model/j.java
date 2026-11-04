package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
final class j extends f0.f.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f121622a;

    static final class b extends f0.f.a.b.AbstractC1132a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f121623a;

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.a.b.AbstractC1132a
        public f0.f.a.b a() {
            String str = this.f121623a;
            if (str != null) {
                return new j(str);
            }
            throw new IllegalStateException("Missing required properties: clsId");
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.a.b.AbstractC1132a
        public f0.f.a.b.AbstractC1132a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null clsId");
            }
            this.f121623a = str;
            return this;
        }

        b() {
        }

        private b(f0.f.a.b bVar) {
            this.f121623a = bVar.b();
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.a.b
    @NonNull
    public String b() {
        return this.f121622a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.a.b
    protected f0.f.a.b.AbstractC1132a c() {
        return new b(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.f.a.b) {
            return this.f121622a.equals(((f0.f.a.b) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f121622a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Organization{clsId=" + this.f121622a + "}";
    }

    private j(String str) {
        this.f121622a = str;
    }
}
