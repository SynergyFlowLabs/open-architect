package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
final class w extends f0.f.d.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f0.f.d.e.b f121751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f121752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f121753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f121754d;

    static final class b extends f0.f.d.e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private f0.f.d.e.b f121755a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f121756b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f121757c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f121758d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private byte f121759e;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.e.a
        public f0.f.d.e a() {
            f0.f.d.e.b bVar;
            String str;
            String str2;
            if (this.f121759e == 1 && (bVar = this.f121755a) != null && (str = this.f121756b) != null && (str2 = this.f121757c) != null) {
                return new w(bVar, str, str2, this.f121758d);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f121755a == null) {
                sb2.append(" rolloutVariant");
            }
            if (this.f121756b == null) {
                sb2.append(" parameterKey");
            }
            if (this.f121757c == null) {
                sb2.append(" parameterValue");
            }
            if ((this.f121759e & 1) == 0) {
                sb2.append(" templateVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.e.a
        public f0.f.d.e.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterKey");
            }
            this.f121756b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.e.a
        public f0.f.d.e.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterValue");
            }
            this.f121757c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.e.a
        public f0.f.d.e.a d(f0.f.d.e.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("Null rolloutVariant");
            }
            this.f121755a = bVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.e.a
        public f0.f.d.e.a e(long j10) {
            this.f121758d = j10;
            this.f121759e = (byte) (this.f121759e | 1);
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.e
    @NonNull
    public String b() {
        return this.f121752b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.e
    @NonNull
    public String c() {
        return this.f121753c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.e
    @NonNull
    public f0.f.d.e.b d() {
        return this.f121751a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.e
    @NonNull
    public long e() {
        return this.f121754d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.f.d.e) {
            f0.f.d.e eVar = (f0.f.d.e) obj;
            if (this.f121751a.equals(eVar.d()) && this.f121752b.equals(eVar.b()) && this.f121753c.equals(eVar.c()) && this.f121754d == eVar.e()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((((this.f121751a.hashCode() ^ 1000003) * 1000003) ^ this.f121752b.hashCode()) * 1000003) ^ this.f121753c.hashCode()) * 1000003;
        long j10 = this.f121754d;
        return ((int) (j10 ^ (j10 >>> 32))) ^ iHashCode;
    }

    public String toString() {
        return "RolloutAssignment{rolloutVariant=" + this.f121751a + ", parameterKey=" + this.f121752b + ", parameterValue=" + this.f121753c + ", templateVersion=" + this.f121754d + "}";
    }

    private w(f0.f.d.e.b bVar, String str, String str2, long j10) {
        this.f121751a = bVar;
        this.f121752b = str;
        this.f121753c = str2;
        this.f121754d = j10;
    }
}
