package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
final class e extends f0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f121563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f121564b;

    static final class b extends f0.d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f121565a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f121566b;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.d.a
        public f0.d a() {
            String str;
            String str2 = this.f121565a;
            if (str2 != null && (str = this.f121566b) != null) {
                return new e(str2, str);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f121565a == null) {
                sb2.append(" key");
            }
            if (this.f121566b == null) {
                sb2.append(" value");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.d.a
        public f0.d.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            this.f121565a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.d.a
        public f0.d.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null value");
            }
            this.f121566b = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.d
    @NonNull
    public String b() {
        return this.f121563a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.d
    @NonNull
    public String c() {
        return this.f121564b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.d) {
            f0.d dVar = (f0.d) obj;
            if (this.f121563a.equals(dVar.b()) && this.f121564b.equals(dVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f121564b.hashCode() ^ ((this.f121563a.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "CustomAttribute{key=" + this.f121563a + ", value=" + this.f121564b + "}";
    }

    private e(String str, String str2) {
        this.f121563a = str;
        this.f121564b = str2;
    }
}
