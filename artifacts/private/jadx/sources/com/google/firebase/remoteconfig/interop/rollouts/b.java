package com.google.firebase.remoteconfig.interop.rollouts;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
final class b extends d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f124721g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f124722h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f124723i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f124724j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f124725k;

    /* JADX INFO: renamed from: com.google.firebase.remoteconfig.interop.rollouts.b$b, reason: collision with other inner class name */
    static final class C1185b extends d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f124726a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f124727b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f124728c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f124729d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f124730e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private byte f124731f;

        C1185b() {
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.d.a
        public d a() {
            if (this.f124731f == 1 && this.f124726a != null && this.f124727b != null && this.f124728c != null && this.f124729d != null) {
                return new b(this.f124726a, this.f124727b, this.f124728c, this.f124729d, this.f124730e);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f124726a == null) {
                sb2.append(" rolloutId");
            }
            if (this.f124727b == null) {
                sb2.append(" variantId");
            }
            if (this.f124728c == null) {
                sb2.append(" parameterKey");
            }
            if (this.f124729d == null) {
                sb2.append(" parameterValue");
            }
            if ((this.f124731f & 1) == 0) {
                sb2.append(" templateVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.d.a
        public d.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterKey");
            }
            this.f124728c = str;
            return this;
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.d.a
        public d.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterValue");
            }
            this.f124729d = str;
            return this;
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.d.a
        public d.a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null rolloutId");
            }
            this.f124726a = str;
            return this;
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.d.a
        public d.a e(long j10) {
            this.f124730e = j10;
            this.f124731f = (byte) (this.f124731f | 1);
            return this;
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.d.a
        public d.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            this.f124727b = str;
            return this;
        }
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.d
    @NonNull
    public String d() {
        return this.f124723i;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.d
    @NonNull
    public String e() {
        return this.f124724j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f124721g.equals(dVar.f()) && this.f124722h.equals(dVar.h()) && this.f124723i.equals(dVar.d()) && this.f124724j.equals(dVar.e()) && this.f124725k == dVar.g()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.d
    @NonNull
    public String f() {
        return this.f124721g;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.d
    public long g() {
        return this.f124725k;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.d
    @NonNull
    public String h() {
        return this.f124722h;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f124721g.hashCode() ^ 1000003) * 1000003) ^ this.f124722h.hashCode()) * 1000003) ^ this.f124723i.hashCode()) * 1000003) ^ this.f124724j.hashCode()) * 1000003;
        long j10 = this.f124725k;
        return ((int) (j10 ^ (j10 >>> 32))) ^ iHashCode;
    }

    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.f124721g + ", variantId=" + this.f124722h + ", parameterKey=" + this.f124723i + ", parameterValue=" + this.f124724j + ", templateVersion=" + this.f124725k + "}";
    }

    private b(String str, String str2, String str3, String str4, long j10) {
        this.f124721g = str;
        this.f124722h = str2;
        this.f124723i = str3;
        this.f124724j = str4;
        this.f124725k = j10;
    }
}
