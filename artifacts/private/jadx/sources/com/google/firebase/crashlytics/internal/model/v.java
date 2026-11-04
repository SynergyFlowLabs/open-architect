package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
final class v extends f0.f.d.AbstractC1144d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f121749a;

    static final class b extends f0.f.d.AbstractC1144d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f121750a;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.AbstractC1144d.a
        public f0.f.d.AbstractC1144d a() {
            String str = this.f121750a;
            if (str != null) {
                return new v(str);
            }
            throw new IllegalStateException("Missing required properties: content");
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.AbstractC1144d.a
        public f0.f.d.AbstractC1144d.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null content");
            }
            this.f121750a = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.AbstractC1144d
    @NonNull
    public String b() {
        return this.f121749a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.f.d.AbstractC1144d) {
            return this.f121749a.equals(((f0.f.d.AbstractC1144d) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f121749a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Log{content=" + this.f121749a + "}";
    }

    private v(String str) {
        this.f121749a = str;
    }
}
