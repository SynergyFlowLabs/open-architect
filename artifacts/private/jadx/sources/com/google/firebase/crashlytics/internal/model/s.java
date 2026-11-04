package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes5.dex */
final class s extends f0.f.d.a.b.e.AbstractC1141b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f121715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f121716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f121717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f121718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f121719e;

    static final class b extends f0.f.d.a.b.e.AbstractC1141b.AbstractC1142a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f121720a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f121721b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f121722c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f121723d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f121724e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private byte f121725f;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.e.AbstractC1141b.AbstractC1142a
        public f0.f.d.a.b.e.AbstractC1141b a() {
            String str;
            if (this.f121725f == 7 && (str = this.f121721b) != null) {
                return new s(this.f121720a, str, this.f121722c, this.f121723d, this.f121724e);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f121725f & 1) == 0) {
                sb2.append(" pc");
            }
            if (this.f121721b == null) {
                sb2.append(" symbol");
            }
            if ((this.f121725f & 2) == 0) {
                sb2.append(" offset");
            }
            if ((this.f121725f & 4) == 0) {
                sb2.append(" importance");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.e.AbstractC1141b.AbstractC1142a
        public f0.f.d.a.b.e.AbstractC1141b.AbstractC1142a b(String str) {
            this.f121722c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.e.AbstractC1141b.AbstractC1142a
        public f0.f.d.a.b.e.AbstractC1141b.AbstractC1142a c(int i10) {
            this.f121724e = i10;
            this.f121725f = (byte) (this.f121725f | 4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.e.AbstractC1141b.AbstractC1142a
        public f0.f.d.a.b.e.AbstractC1141b.AbstractC1142a d(long j10) {
            this.f121723d = j10;
            this.f121725f = (byte) (this.f121725f | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.e.AbstractC1141b.AbstractC1142a
        public f0.f.d.a.b.e.AbstractC1141b.AbstractC1142a e(long j10) {
            this.f121720a = j10;
            this.f121725f = (byte) (this.f121725f | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.e.AbstractC1141b.AbstractC1142a
        public f0.f.d.a.b.e.AbstractC1141b.AbstractC1142a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            this.f121721b = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.e.AbstractC1141b
    @p0
    public String b() {
        return this.f121717c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.e.AbstractC1141b
    public int c() {
        return this.f121719e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.e.AbstractC1141b
    public long d() {
        return this.f121718d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.e.AbstractC1141b
    public long e() {
        return this.f121715a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.f.d.a.b.e.AbstractC1141b) {
            f0.f.d.a.b.e.AbstractC1141b abstractC1141b = (f0.f.d.a.b.e.AbstractC1141b) obj;
            if (this.f121715a == abstractC1141b.e() && this.f121716b.equals(abstractC1141b.f()) && ((str = this.f121717c) != null ? str.equals(abstractC1141b.b()) : abstractC1141b.b() == null) && this.f121718d == abstractC1141b.d() && this.f121719e == abstractC1141b.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.e.AbstractC1141b
    @NonNull
    public String f() {
        return this.f121716b;
    }

    public int hashCode() {
        int iHashCode;
        long j10 = this.f121715a;
        int iHashCode2 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f121716b.hashCode()) * 1000003;
        String str = this.f121717c;
        if (str == null) {
            iHashCode = 0;
            int i10 = 7 | 0;
        } else {
            iHashCode = str.hashCode();
        }
        int i11 = (iHashCode2 ^ iHashCode) * 1000003;
        long j11 = this.f121718d;
        return this.f121719e ^ ((i11 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003);
    }

    public String toString() {
        return "Frame{pc=" + this.f121715a + ", symbol=" + this.f121716b + ", file=" + this.f121717c + ", offset=" + this.f121718d + ", importance=" + this.f121719e + "}";
    }

    private s(long j10, String str, @p0 String str2, long j11, int i10) {
        this.f121715a = j10;
        this.f121716b = str;
        this.f121717c = str2;
        this.f121718d = j11;
        this.f121719e = i10;
    }
}
