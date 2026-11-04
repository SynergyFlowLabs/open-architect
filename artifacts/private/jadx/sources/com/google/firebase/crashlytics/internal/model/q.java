package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
final class q extends f0.f.d.a.b.AbstractC1138d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f121701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f121702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f121703c;

    static final class b extends f0.f.d.a.b.AbstractC1138d.AbstractC1139a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f121704a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f121705b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f121706c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte f121707d;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.AbstractC1138d.AbstractC1139a
        public f0.f.d.a.b.AbstractC1138d a() {
            String str;
            String str2;
            if (this.f121707d == 1 && (str = this.f121704a) != null && (str2 = this.f121705b) != null) {
                return new q(str, str2, this.f121706c);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f121704a == null) {
                sb2.append(" name");
            }
            if (this.f121705b == null) {
                sb2.append(" code");
            }
            if ((this.f121707d & 1) == 0) {
                sb2.append(" address");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.AbstractC1138d.AbstractC1139a
        public f0.f.d.a.b.AbstractC1138d.AbstractC1139a b(long j10) {
            this.f121706c = j10;
            this.f121707d = (byte) (this.f121707d | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.AbstractC1138d.AbstractC1139a
        public f0.f.d.a.b.AbstractC1138d.AbstractC1139a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null code");
            }
            this.f121705b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.AbstractC1138d.AbstractC1139a
        public f0.f.d.a.b.AbstractC1138d.AbstractC1139a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f121704a = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.AbstractC1138d
    @NonNull
    public long b() {
        return this.f121703c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.AbstractC1138d
    @NonNull
    public String c() {
        return this.f121702b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.AbstractC1138d
    @NonNull
    public String d() {
        return this.f121701a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.f.d.a.b.AbstractC1138d) {
            f0.f.d.a.b.AbstractC1138d abstractC1138d = (f0.f.d.a.b.AbstractC1138d) obj;
            if (this.f121701a.equals(abstractC1138d.d()) && this.f121702b.equals(abstractC1138d.c()) && this.f121703c == abstractC1138d.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.f121701a.hashCode() ^ 1000003) * 1000003) ^ this.f121702b.hashCode()) * 1000003;
        long j10 = this.f121703c;
        return ((int) (j10 ^ (j10 >>> 32))) ^ iHashCode;
    }

    public String toString() {
        return "Signal{name=" + this.f121701a + ", code=" + this.f121702b + ", address=" + this.f121703c + "}";
    }

    private q(String str, String str2, long j10) {
        this.f121701a = str;
        this.f121702b = str2;
        this.f121703c = j10;
    }
}
