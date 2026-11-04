package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
final class a0 extends f0.f.AbstractC1146f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f121493a;

    static final class b extends f0.f.AbstractC1146f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f121494a;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.AbstractC1146f.a
        public f0.f.AbstractC1146f a() {
            String str = this.f121494a;
            if (str != null) {
                return new a0(str);
            }
            throw new IllegalStateException("Missing required properties: identifier");
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.AbstractC1146f.a
        public f0.f.AbstractC1146f.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f121494a = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.AbstractC1146f
    @NonNull
    public String b() {
        return this.f121493a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.f.AbstractC1146f) {
            return this.f121493a.equals(((f0.f.AbstractC1146f) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f121493a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "User{identifier=" + this.f121493a + "}";
    }

    private a0(String str) {
        this.f121493a = str;
    }
}
