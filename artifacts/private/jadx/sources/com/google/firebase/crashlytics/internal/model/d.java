package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
final class d extends f0.a.AbstractC1129a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f121548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f121549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f121550c;

    static final class b extends f0.a.AbstractC1129a.AbstractC1130a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f121551a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f121552b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f121553c;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.a.AbstractC1129a.AbstractC1130a
        public f0.a.AbstractC1129a a() {
            String str;
            String str2;
            String str3 = this.f121551a;
            if (str3 != null && (str = this.f121552b) != null && (str2 = this.f121553c) != null) {
                return new d(str3, str, str2);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f121551a == null) {
                sb2.append(" arch");
            }
            if (this.f121552b == null) {
                sb2.append(" libraryName");
            }
            if (this.f121553c == null) {
                sb2.append(" buildId");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.a.AbstractC1129a.AbstractC1130a
        public f0.a.AbstractC1129a.AbstractC1130a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null arch");
            }
            this.f121551a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.a.AbstractC1129a.AbstractC1130a
        public f0.a.AbstractC1129a.AbstractC1130a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildId");
            }
            this.f121553c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.a.AbstractC1129a.AbstractC1130a
        public f0.a.AbstractC1129a.AbstractC1130a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null libraryName");
            }
            this.f121552b = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.a.AbstractC1129a
    @NonNull
    public String b() {
        return this.f121548a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.a.AbstractC1129a
    @NonNull
    public String c() {
        return this.f121550c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.a.AbstractC1129a
    @NonNull
    public String d() {
        return this.f121549b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.a.AbstractC1129a) {
            f0.a.AbstractC1129a abstractC1129a = (f0.a.AbstractC1129a) obj;
            if (this.f121548a.equals(abstractC1129a.b()) && this.f121549b.equals(abstractC1129a.d()) && this.f121550c.equals(abstractC1129a.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f121550c.hashCode() ^ ((((this.f121548a.hashCode() ^ 1000003) * 1000003) ^ this.f121549b.hashCode()) * 1000003);
    }

    public String toString() {
        return "BuildIdMappingForArch{arch=" + this.f121548a + ", libraryName=" + this.f121549b + ", buildId=" + this.f121550c + "}";
    }

    private d(String str, String str2, String str3) {
        this.f121548a = str;
        this.f121549b = str2;
        this.f121550c = str3;
    }
}
