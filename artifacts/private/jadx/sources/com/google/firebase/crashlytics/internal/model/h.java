package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class h extends f0.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f121583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f121584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f121585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f121586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Long f121587e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f121588f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final f0.f.a f121589g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final f0.f.AbstractC1146f f121590h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final f0.f.e f121591i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final f0.f.c f121592j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List<f0.f.d> f121593k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f121594l;

    static final class b extends f0.f.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f121595a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f121596b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f121597c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f121598d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Long f121599e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f121600f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private f0.f.a f121601g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private f0.f.AbstractC1146f f121602h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private f0.f.e f121603i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private f0.f.c f121604j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private List<f0.f.d> f121605k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f121606l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private byte f121607m;

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.b
        public f0.f a() {
            String str;
            String str2;
            f0.f.a aVar;
            if (this.f121607m == 7 && (str = this.f121595a) != null && (str2 = this.f121596b) != null && (aVar = this.f121601g) != null) {
                return new h(str, str2, this.f121597c, this.f121598d, this.f121599e, this.f121600f, aVar, this.f121602h, this.f121603i, this.f121604j, this.f121605k, this.f121606l);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f121595a == null) {
                sb2.append(" generator");
            }
            if (this.f121596b == null) {
                sb2.append(" identifier");
            }
            if ((this.f121607m & 1) == 0) {
                sb2.append(" startedAt");
            }
            if ((this.f121607m & 2) == 0) {
                sb2.append(" crashed");
            }
            if (this.f121601g == null) {
                sb2.append(" app");
            }
            if ((this.f121607m & 4) == 0) {
                sb2.append(" generatorType");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.b
        public f0.f.b b(f0.f.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null app");
            }
            this.f121601g = aVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.b
        public f0.f.b c(@p0 String str) {
            this.f121597c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.b
        public f0.f.b d(boolean z10) {
            this.f121600f = z10;
            this.f121607m = (byte) (this.f121607m | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.b
        public f0.f.b e(f0.f.c cVar) {
            this.f121604j = cVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.b
        public f0.f.b f(Long l10) {
            this.f121599e = l10;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.b
        public f0.f.b g(List<f0.f.d> list) {
            this.f121605k = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.b
        public f0.f.b h(String str) {
            if (str == null) {
                throw new NullPointerException("Null generator");
            }
            this.f121595a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.b
        public f0.f.b i(int i10) {
            this.f121606l = i10;
            this.f121607m = (byte) (this.f121607m | 4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.b
        public f0.f.b j(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f121596b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.b
        public f0.f.b l(f0.f.e eVar) {
            this.f121603i = eVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.b
        public f0.f.b m(long j10) {
            this.f121598d = j10;
            this.f121607m = (byte) (this.f121607m | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.b
        public f0.f.b n(f0.f.AbstractC1146f abstractC1146f) {
            this.f121602h = abstractC1146f;
            return this;
        }

        b() {
        }

        private b(f0.f fVar) {
            this.f121595a = fVar.g();
            this.f121596b = fVar.i();
            this.f121597c = fVar.c();
            this.f121598d = fVar.l();
            this.f121599e = fVar.e();
            this.f121600f = fVar.n();
            this.f121601g = fVar.b();
            this.f121602h = fVar.m();
            this.f121603i = fVar.k();
            this.f121604j = fVar.d();
            this.f121605k = fVar.f();
            this.f121606l = fVar.h();
            this.f121607m = (byte) 7;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f
    @NonNull
    public f0.f.a b() {
        return this.f121589g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f
    @p0
    public String c() {
        return this.f121585c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f
    @p0
    public f0.f.c d() {
        return this.f121592j;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f
    @p0
    public Long e() {
        return this.f121587e;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00de  */
    public boolean equals(Object obj) {
        String str;
        Long l10;
        f0.f.AbstractC1146f abstractC1146f;
        f0.f.c cVar;
        List<f0.f.d> list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.f) {
            f0.f fVar = (f0.f) obj;
            if (this.f121583a.equals(fVar.g()) && this.f121584b.equals(fVar.i()) && ((str = this.f121585c) != null ? str.equals(fVar.c()) : fVar.c() == null) && this.f121586d == fVar.l() && ((l10 = this.f121587e) != null ? l10.equals(fVar.e()) : fVar.e() == null) && this.f121588f == fVar.n() && this.f121589g.equals(fVar.b()) && ((abstractC1146f = this.f121590h) != null ? abstractC1146f.equals(fVar.m()) : fVar.m() == null)) {
                f0.f.e eVar = this.f121591i;
                if (eVar == null) {
                    if (fVar.k() == null) {
                        cVar = this.f121592j;
                        if (cVar == null ? cVar.equals(fVar.d()) : fVar.d() == null) {
                            list = this.f121593k;
                            if (list == null ? list.equals(fVar.f()) : fVar.f() == null) {
                                if (this.f121594l == fVar.h()) {
                                    return true;
                                }
                            }
                        }
                    }
                } else if (eVar.equals(fVar.k())) {
                    cVar = this.f121592j;
                    if (cVar == null) {
                        list = this.f121593k;
                        if (list == null) {
                            if (this.f121594l == fVar.h()) {
                                return true;
                            }
                        } else if (this.f121594l == fVar.h()) {
                            return true;
                        }
                    } else {
                        list = this.f121593k;
                        if (list == null) {
                            if (this.f121594l == fVar.h()) {
                                return true;
                            }
                        } else if (this.f121594l == fVar.h()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f
    @p0
    public List<f0.f.d> f() {
        return this.f121593k;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f
    @NonNull
    public String g() {
        return this.f121583a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f
    public int h() {
        return this.f121594l;
    }

    public int hashCode() {
        int iHashCode = (((this.f121583a.hashCode() ^ 1000003) * 1000003) ^ this.f121584b.hashCode()) * 1000003;
        String str = this.f121585c;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j10 = this.f121586d;
        int i10 = (((iHashCode ^ iHashCode2) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        Long l10 = this.f121587e;
        int iHashCode3 = (((((i10 ^ (l10 == null ? 0 : l10.hashCode())) * 1000003) ^ (this.f121588f ? 1231 : 1237)) * 1000003) ^ this.f121589g.hashCode()) * 1000003;
        f0.f.AbstractC1146f abstractC1146f = this.f121590h;
        int iHashCode4 = (iHashCode3 ^ (abstractC1146f == null ? 0 : abstractC1146f.hashCode())) * 1000003;
        f0.f.e eVar = this.f121591i;
        int iHashCode5 = (iHashCode4 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        f0.f.c cVar = this.f121592j;
        int iHashCode6 = (iHashCode5 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        List<f0.f.d> list = this.f121593k;
        return this.f121594l ^ ((iHashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003);
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f
    @NonNull
    @k8.a.b
    public String i() {
        return this.f121584b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f
    @p0
    public f0.f.e k() {
        return this.f121591i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f
    public long l() {
        return this.f121586d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f
    @p0
    public f0.f.AbstractC1146f m() {
        return this.f121590h;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f
    public boolean n() {
        return this.f121588f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f
    public f0.f.b o() {
        return new b(this);
    }

    public String toString() {
        return "Session{generator=" + this.f121583a + ", identifier=" + this.f121584b + ", appQualitySessionId=" + this.f121585c + ", startedAt=" + this.f121586d + ", endedAt=" + this.f121587e + ", crashed=" + this.f121588f + ", app=" + this.f121589g + ", user=" + this.f121590h + ", os=" + this.f121591i + ", device=" + this.f121592j + ", events=" + this.f121593k + ", generatorType=" + this.f121594l + "}";
    }

    private h(String str, String str2, @p0 String str3, long j10, @p0 Long l10, boolean z10, f0.f.a aVar, @p0 f0.f.AbstractC1146f abstractC1146f, @p0 f0.f.e eVar, @p0 f0.f.c cVar, @p0 List<f0.f.d> list, int i10) {
        this.f121583a = str;
        this.f121584b = str2;
        this.f121585c = str3;
        this.f121586d = j10;
        this.f121587e = l10;
        this.f121588f = z10;
        this.f121589g = aVar;
        this.f121590h = abstractC1146f;
        this.f121591i = eVar;
        this.f121592j = cVar;
        this.f121593k = list;
        this.f121594l = i10;
    }
}
