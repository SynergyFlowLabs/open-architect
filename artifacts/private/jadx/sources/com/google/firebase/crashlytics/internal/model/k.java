package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
final class k extends f0.f.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f121624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f121625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f121626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f121627d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f121628e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f121629f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f121630g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f121631h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f121632i;

    static final class b extends f0.f.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f121633a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f121634b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f121635c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f121636d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f121637e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f121638f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f121639g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f121640h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f121641i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private byte f121642j;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.c.a
        public f0.f.c a() {
            String str;
            String str2;
            String str3;
            if (this.f121642j == 63 && (str = this.f121634b) != null && (str2 = this.f121640h) != null && (str3 = this.f121641i) != null) {
                return new k(this.f121633a, str, this.f121635c, this.f121636d, this.f121637e, this.f121638f, this.f121639g, str2, str3);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f121642j & 1) == 0) {
                sb2.append(" arch");
            }
            if (this.f121634b == null) {
                sb2.append(" model");
            }
            if ((this.f121642j & 2) == 0) {
                sb2.append(" cores");
            }
            if ((this.f121642j & 4) == 0) {
                sb2.append(" ram");
            }
            if ((this.f121642j & 8) == 0) {
                sb2.append(" diskSpace");
            }
            if ((this.f121642j & com.google.common.base.c.f116465r) == 0) {
                sb2.append(" simulator");
            }
            if ((this.f121642j & 32) == 0) {
                sb2.append(" state");
            }
            if (this.f121640h == null) {
                sb2.append(" manufacturer");
            }
            if (this.f121641i == null) {
                sb2.append(" modelClass");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.c.a
        public f0.f.c.a b(int i10) {
            this.f121633a = i10;
            this.f121642j = (byte) (this.f121642j | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.c.a
        public f0.f.c.a c(int i10) {
            this.f121635c = i10;
            this.f121642j = (byte) (this.f121642j | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.c.a
        public f0.f.c.a d(long j10) {
            this.f121637e = j10;
            this.f121642j = (byte) (this.f121642j | 8);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.c.a
        public f0.f.c.a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null manufacturer");
            }
            this.f121640h = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.c.a
        public f0.f.c.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null model");
            }
            this.f121634b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.c.a
        public f0.f.c.a g(String str) {
            if (str == null) {
                throw new NullPointerException("Null modelClass");
            }
            this.f121641i = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.c.a
        public f0.f.c.a h(long j10) {
            this.f121636d = j10;
            this.f121642j = (byte) (this.f121642j | 4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.c.a
        public f0.f.c.a i(boolean z10) {
            this.f121638f = z10;
            this.f121642j = (byte) (this.f121642j | com.google.common.base.c.f116465r);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.c.a
        public f0.f.c.a j(int i10) {
            this.f121639g = i10;
            this.f121642j = (byte) (this.f121642j | 32);
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.c
    @NonNull
    public int b() {
        return this.f121624a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.c
    public int c() {
        return this.f121626c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.c
    public long d() {
        return this.f121628e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.c
    @NonNull
    public String e() {
        return this.f121631h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.f.c) {
            f0.f.c cVar = (f0.f.c) obj;
            if (this.f121624a == cVar.b() && this.f121625b.equals(cVar.f()) && this.f121626c == cVar.c() && this.f121627d == cVar.h() && this.f121628e == cVar.d() && this.f121629f == cVar.j() && this.f121630g == cVar.i() && this.f121631h.equals(cVar.e()) && this.f121632i.equals(cVar.g())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.c
    @NonNull
    public String f() {
        return this.f121625b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.c
    @NonNull
    public String g() {
        return this.f121632i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.c
    public long h() {
        return this.f121627d;
    }

    public int hashCode() {
        int iHashCode = (((((this.f121624a ^ 1000003) * 1000003) ^ this.f121625b.hashCode()) * 1000003) ^ this.f121626c) * 1000003;
        long j10 = this.f121627d;
        int i10 = (iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f121628e;
        return this.f121632i.hashCode() ^ ((((((((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ (this.f121629f ? 1231 : 1237)) * 1000003) ^ this.f121630g) * 1000003) ^ this.f121631h.hashCode()) * 1000003);
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.c
    public int i() {
        return this.f121630g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.c
    public boolean j() {
        return this.f121629f;
    }

    public String toString() {
        return "Device{arch=" + this.f121624a + ", model=" + this.f121625b + ", cores=" + this.f121626c + ", ram=" + this.f121627d + ", diskSpace=" + this.f121628e + ", simulator=" + this.f121629f + ", state=" + this.f121630g + ", manufacturer=" + this.f121631h + ", modelClass=" + this.f121632i + "}";
    }

    private k(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
        this.f121624a = i10;
        this.f121625b = str;
        this.f121626c = i11;
        this.f121627d = j10;
        this.f121628e = j11;
        this.f121629f = z10;
        this.f121630g = i12;
        this.f121631h = str2;
        this.f121632i = str3;
    }
}
