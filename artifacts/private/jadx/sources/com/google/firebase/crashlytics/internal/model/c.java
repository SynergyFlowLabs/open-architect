package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class c extends f0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f121523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f121524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f121525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f121526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f121527e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f121528f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f121529g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f121530h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List<f0.a.AbstractC1129a> f121531i;

    static final class b extends f0.a.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f121532a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f121533b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f121534c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f121535d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f121536e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f121537f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f121538g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f121539h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private List<f0.a.AbstractC1129a> f121540i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private byte f121541j;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.a.b
        public f0.a a() {
            String str;
            if (this.f121541j == 63 && (str = this.f121533b) != null) {
                return new c(this.f121532a, str, this.f121534c, this.f121535d, this.f121536e, this.f121537f, this.f121538g, this.f121539h, this.f121540i);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f121541j & 1) == 0) {
                sb2.append(" pid");
            }
            if (this.f121533b == null) {
                sb2.append(" processName");
            }
            if ((this.f121541j & 2) == 0) {
                sb2.append(" reasonCode");
            }
            if ((this.f121541j & 4) == 0) {
                sb2.append(" importance");
            }
            if ((this.f121541j & 8) == 0) {
                sb2.append(" pss");
            }
            if ((this.f121541j & com.google.common.base.c.f116465r) == 0) {
                sb2.append(" rss");
            }
            if ((this.f121541j & 32) == 0) {
                sb2.append(" timestamp");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.a.b
        public f0.a.b b(@p0 List<f0.a.AbstractC1129a> list) {
            this.f121540i = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.a.b
        public f0.a.b c(int i10) {
            this.f121535d = i10;
            this.f121541j = (byte) (this.f121541j | 4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.a.b
        public f0.a.b d(int i10) {
            this.f121532a = i10;
            this.f121541j = (byte) (this.f121541j | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.a.b
        public f0.a.b e(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.f121533b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.a.b
        public f0.a.b f(long j10) {
            this.f121536e = j10;
            this.f121541j = (byte) (this.f121541j | 8);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.a.b
        public f0.a.b g(int i10) {
            this.f121534c = i10;
            this.f121541j = (byte) (this.f121541j | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.a.b
        public f0.a.b h(long j10) {
            this.f121537f = j10;
            this.f121541j = (byte) (this.f121541j | com.google.common.base.c.f116465r);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.a.b
        public f0.a.b i(long j10) {
            this.f121538g = j10;
            this.f121541j = (byte) (this.f121541j | 32);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.a.b
        public f0.a.b j(@p0 String str) {
            this.f121539h = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.a
    @p0
    public List<f0.a.AbstractC1129a> b() {
        return this.f121531i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.a
    @NonNull
    public int c() {
        return this.f121526d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.a
    @NonNull
    public int d() {
        return this.f121523a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.a
    @NonNull
    public String e() {
        return this.f121524b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.a) {
            f0.a aVar = (f0.a) obj;
            if (this.f121523a == aVar.d() && this.f121524b.equals(aVar.e()) && this.f121525c == aVar.g() && this.f121526d == aVar.c() && this.f121527e == aVar.f() && this.f121528f == aVar.h() && this.f121529g == aVar.i() && ((str = this.f121530h) != null ? str.equals(aVar.j()) : aVar.j() == null)) {
                List<f0.a.AbstractC1129a> list = this.f121531i;
                if (list == null) {
                    if (aVar.b() == null) {
                        return true;
                    }
                } else if (list.equals(aVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.a
    @NonNull
    public long f() {
        return this.f121527e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.a
    @NonNull
    public int g() {
        return this.f121525c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.a
    @NonNull
    public long h() {
        return this.f121528f;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f121523a ^ 1000003) * 1000003) ^ this.f121524b.hashCode()) * 1000003) ^ this.f121525c) * 1000003) ^ this.f121526d) * 1000003;
        long j10 = this.f121527e;
        int i10 = (iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f121528f;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f121529g;
        int i12 = (i11 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        String str = this.f121530h;
        int iHashCode2 = (i12 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<f0.a.AbstractC1129a> list = this.f121531i;
        return iHashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.a
    @NonNull
    public long i() {
        return this.f121529g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.a
    @p0
    public String j() {
        return this.f121530h;
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.f121523a + ", processName=" + this.f121524b + ", reasonCode=" + this.f121525c + ", importance=" + this.f121526d + ", pss=" + this.f121527e + ", rss=" + this.f121528f + ", timestamp=" + this.f121529g + ", traceFile=" + this.f121530h + ", buildIdMappingForArch=" + this.f121531i + "}";
    }

    private c(int i10, String str, int i11, int i12, long j10, long j11, long j12, @p0 String str2, @p0 List<f0.a.AbstractC1129a> list) {
        this.f121523a = i10;
        this.f121524b = str;
        this.f121525c = i11;
        this.f121526d = i12;
        this.f121527e = j10;
        this.f121528f = j11;
        this.f121529g = j12;
        this.f121530h = str2;
        this.f121531i = list;
    }
}
