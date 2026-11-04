package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes5.dex */
final class l extends f0.f.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f121643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f121644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f0.f.d.a f121645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f0.f.d.c f121646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final f0.f.d.AbstractC1144d f121647e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final f0.f.d.AbstractC1145f f121648f;

    static final class b extends f0.f.d.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f121649a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f121650b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private f0.f.d.a f121651c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private f0.f.d.c f121652d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private f0.f.d.AbstractC1144d f121653e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private f0.f.d.AbstractC1145f f121654f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private byte f121655g;

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.b
        public f0.f.d a() {
            String str;
            f0.f.d.a aVar;
            f0.f.d.c cVar;
            if (this.f121655g == 1 && (str = this.f121650b) != null && (aVar = this.f121651c) != null && (cVar = this.f121652d) != null) {
                return new l(this.f121649a, str, aVar, cVar, this.f121653e, this.f121654f);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((1 & this.f121655g) == 0) {
                sb2.append(" timestamp");
            }
            if (this.f121650b == null) {
                sb2.append(" type");
            }
            if (this.f121651c == null) {
                sb2.append(" app");
            }
            if (this.f121652d == null) {
                sb2.append(" device");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.b
        public f0.f.d.b b(f0.f.d.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null app");
            }
            this.f121651c = aVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.b
        public f0.f.d.b c(f0.f.d.c cVar) {
            if (cVar == null) {
                throw new NullPointerException("Null device");
            }
            this.f121652d = cVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.b
        public f0.f.d.b d(f0.f.d.AbstractC1144d abstractC1144d) {
            this.f121653e = abstractC1144d;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.b
        public f0.f.d.b e(f0.f.d.AbstractC1145f abstractC1145f) {
            this.f121654f = abstractC1145f;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.b
        public f0.f.d.b f(long j10) {
            this.f121649a = j10;
            this.f121655g = (byte) (this.f121655g | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.b
        public f0.f.d.b g(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.f121650b = str;
            return this;
        }

        b() {
        }

        private b(f0.f.d dVar) {
            this.f121649a = dVar.f();
            this.f121650b = dVar.g();
            this.f121651c = dVar.b();
            this.f121652d = dVar.c();
            this.f121653e = dVar.d();
            this.f121654f = dVar.e();
            int i10 = 6 | 1;
            this.f121655g = (byte) 1;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d
    @NonNull
    public f0.f.d.a b() {
        return this.f121645c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d
    @NonNull
    public f0.f.d.c c() {
        return this.f121646d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d
    @p0
    public f0.f.d.AbstractC1144d d() {
        return this.f121647e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d
    @p0
    public f0.f.d.AbstractC1145f e() {
        return this.f121648f;
    }

    public boolean equals(Object obj) {
        f0.f.d.AbstractC1144d abstractC1144d;
        f0.f.d.AbstractC1145f abstractC1145f;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.f.d) {
            f0.f.d dVar = (f0.f.d) obj;
            if (this.f121643a == dVar.f() && this.f121644b.equals(dVar.g()) && this.f121645c.equals(dVar.b()) && this.f121646d.equals(dVar.c()) && ((abstractC1144d = this.f121647e) != null ? abstractC1144d.equals(dVar.d()) : dVar.d() == null) && ((abstractC1145f = this.f121648f) != null ? abstractC1145f.equals(dVar.e()) : dVar.e() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d
    public long f() {
        return this.f121643a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d
    @NonNull
    public String g() {
        return this.f121644b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d
    public f0.f.d.b h() {
        return new b(this);
    }

    public int hashCode() {
        long j10 = this.f121643a;
        int iHashCode = (((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f121644b.hashCode()) * 1000003) ^ this.f121645c.hashCode()) * 1000003) ^ this.f121646d.hashCode()) * 1000003;
        f0.f.d.AbstractC1144d abstractC1144d = this.f121647e;
        int iHashCode2 = 0;
        int iHashCode3 = (iHashCode ^ (abstractC1144d == null ? 0 : abstractC1144d.hashCode())) * 1000003;
        f0.f.d.AbstractC1145f abstractC1145f = this.f121648f;
        if (abstractC1145f != null) {
            iHashCode2 = abstractC1145f.hashCode();
        }
        return iHashCode3 ^ iHashCode2;
    }

    public String toString() {
        return "Event{timestamp=" + this.f121643a + ", type=" + this.f121644b + ", app=" + this.f121645c + ", device=" + this.f121646d + ", log=" + this.f121647e + ", rollouts=" + this.f121648f + "}";
    }

    private l(long j10, String str, f0.f.d.a aVar, f0.f.d.c cVar, @p0 f0.f.d.AbstractC1144d abstractC1144d, @p0 f0.f.d.AbstractC1145f abstractC1145f) {
        this.f121643a = j10;
        this.f121644b = str;
        this.f121645c = aVar;
        this.f121646d = cVar;
        this.f121647e = abstractC1144d;
        this.f121648f = abstractC1145f;
    }
}
