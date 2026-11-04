package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
final class z extends f0.f.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f121766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f121767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f121768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f121769d;

    static final class b extends f0.f.e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f121770a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f121771b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f121772c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f121773d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private byte f121774e;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.e.a
        public f0.f.e a() {
            String str;
            String str2;
            if (this.f121774e == 3 && (str = this.f121771b) != null && (str2 = this.f121772c) != null) {
                return new z(this.f121770a, str, str2, this.f121773d);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f121774e & 1) == 0) {
                sb2.append(" platform");
            }
            if (this.f121771b == null) {
                sb2.append(" version");
            }
            if (this.f121772c == null) {
                sb2.append(" buildVersion");
            }
            if ((this.f121774e & 2) == 0) {
                sb2.append(" jailbroken");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.e.a
        public f0.f.e.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.f121772c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.e.a
        public f0.f.e.a c(boolean z10) {
            this.f121773d = z10;
            this.f121774e = (byte) (this.f121774e | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.e.a
        public f0.f.e.a d(int i10) {
            this.f121770a = i10;
            this.f121774e = (byte) (this.f121774e | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.e.a
        public f0.f.e.a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.f121771b = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.e
    @NonNull
    public String b() {
        return this.f121768c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.e
    public int c() {
        return this.f121766a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.e
    @NonNull
    public String d() {
        return this.f121767b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.e
    public boolean e() {
        return this.f121769d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.f.e) {
            f0.f.e eVar = (f0.f.e) obj;
            if (this.f121766a == eVar.c() && this.f121767b.equals(eVar.d()) && this.f121768c.equals(eVar.b()) && this.f121769d == eVar.e()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f121769d ? 1231 : 1237) ^ ((((((this.f121766a ^ 1000003) * 1000003) ^ this.f121767b.hashCode()) * 1000003) ^ this.f121768c.hashCode()) * 1000003);
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.f121766a + ", version=" + this.f121767b + ", buildVersion=" + this.f121768c + ", jailbroken=" + this.f121769d + "}";
    }

    private z(int i10, String str, String str2, boolean z10) {
        this.f121766a = i10;
        this.f121767b = str;
        this.f121768c = str2;
        this.f121769d = z10;
    }
}
