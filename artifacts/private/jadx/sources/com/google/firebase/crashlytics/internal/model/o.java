package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes5.dex */
final class o extends f0.f.d.a.b.AbstractC1134a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f121681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f121682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f121683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f121684d;

    static final class b extends f0.f.d.a.b.AbstractC1134a.AbstractC1135a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f121685a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f121686b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f121687c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f121688d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private byte f121689e;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.AbstractC1134a.AbstractC1135a
        public f0.f.d.a.b.AbstractC1134a a() {
            String str;
            if (this.f121689e == 3 && (str = this.f121687c) != null) {
                int i10 = 5 ^ 0;
                return new o(this.f121685a, this.f121686b, str, this.f121688d);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f121689e & 1) == 0) {
                sb2.append(" baseAddress");
            }
            if ((this.f121689e & 2) == 0) {
                sb2.append(" size");
            }
            if (this.f121687c == null) {
                sb2.append(" name");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.AbstractC1134a.AbstractC1135a
        public f0.f.d.a.b.AbstractC1134a.AbstractC1135a b(long j10) {
            this.f121685a = j10;
            this.f121689e = (byte) (this.f121689e | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.AbstractC1134a.AbstractC1135a
        public f0.f.d.a.b.AbstractC1134a.AbstractC1135a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f121687c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.AbstractC1134a.AbstractC1135a
        public f0.f.d.a.b.AbstractC1134a.AbstractC1135a d(long j10) {
            this.f121686b = j10;
            this.f121689e = (byte) (this.f121689e | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.AbstractC1134a.AbstractC1135a
        public f0.f.d.a.b.AbstractC1134a.AbstractC1135a e(@p0 String str) {
            this.f121688d = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.AbstractC1134a
    @NonNull
    public long b() {
        return this.f121681a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.AbstractC1134a
    @NonNull
    public String c() {
        return this.f121683c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.AbstractC1134a
    public long d() {
        return this.f121682b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.AbstractC1134a
    @k8.a.b
    @p0
    public String e() {
        return this.f121684d;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.f.d.a.b.AbstractC1134a) {
            f0.f.d.a.b.AbstractC1134a abstractC1134a = (f0.f.d.a.b.AbstractC1134a) obj;
            if (this.f121681a == abstractC1134a.b() && this.f121682b == abstractC1134a.d() && this.f121683c.equals(abstractC1134a.c()) && ((str = this.f121684d) != null ? str.equals(abstractC1134a.e()) : abstractC1134a.e() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f121681a;
        long j11 = this.f121682b;
        int iHashCode = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f121683c.hashCode()) * 1000003;
        String str = this.f121684d;
        return (str == null ? 0 : str.hashCode()) ^ iHashCode;
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.f121681a + ", size=" + this.f121682b + ", name=" + this.f121683c + ", uuid=" + this.f121684d + "}";
    }

    private o(long j10, long j11, String str, @p0 String str2) {
        this.f121681a = j10;
        this.f121682b = j11;
        this.f121683c = str;
        this.f121684d = str2;
    }
}
