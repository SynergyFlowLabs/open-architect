package com.google.android.datatransport.cct.internal;

import androidx.annotation.p0;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class k extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f103338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f103339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o f103340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f103341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f103342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<t> f103343f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final x f103344g;

    static final class b extends u.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f103345a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f103346b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private o f103347c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f103348d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f103349e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List<t> f103350f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private x f103351g;

        b() {
        }

        @Override // com.google.android.datatransport.cct.internal.u.a
        public u a() {
            String str = "";
            if (this.f103345a == null) {
                str = " requestTimeMs";
            }
            if (this.f103346b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new k(this.f103345a.longValue(), this.f103346b.longValue(), this.f103347c, this.f103348d, this.f103349e, this.f103350f, this.f103351g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.cct.internal.u.a
        public u.a b(@p0 o oVar) {
            this.f103347c = oVar;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.u.a
        public u.a c(@p0 List<t> list) {
            this.f103350f = list;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.u.a
        u.a d(@p0 Integer num) {
            this.f103348d = num;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.u.a
        u.a e(@p0 String str) {
            this.f103349e = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.u.a
        public u.a f(@p0 x xVar) {
            this.f103351g = xVar;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.u.a
        public u.a g(long j10) {
            this.f103345a = Long.valueOf(j10);
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.u.a
        public u.a h(long j10) {
            this.f103346b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // com.google.android.datatransport.cct.internal.u
    @p0
    public o b() {
        return this.f103340c;
    }

    @Override // com.google.android.datatransport.cct.internal.u
    @k8.a.InterfaceC2244a(name = "logEvent")
    @p0
    public List<t> c() {
        return this.f103343f;
    }

    @Override // com.google.android.datatransport.cct.internal.u
    @p0
    public Integer d() {
        return this.f103341d;
    }

    @Override // com.google.android.datatransport.cct.internal.u
    @p0
    public String e() {
        return this.f103342e;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0064  */
    /* JADX WARN: Code duplicated, block: B:35:0x0074  */
    /* JADX WARN: Code duplicated, block: B:38:0x007b  */
    /* JADX WARN: Code duplicated, block: B:42:0x008b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0092  */
    public boolean equals(Object obj) {
        Integer num;
        String str;
        List<t> list;
        x xVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (this.f103338a == uVar.g() && this.f103339b == uVar.h()) {
                o oVar = this.f103340c;
                if (oVar == null) {
                    if (uVar.b() == null) {
                        num = this.f103341d;
                        if (num == null ? num.equals(uVar.d()) : uVar.d() == null) {
                            str = this.f103342e;
                            if (str == null ? str.equals(uVar.e()) : uVar.e() == null) {
                                list = this.f103343f;
                                if (list == null ? list.equals(uVar.c()) : uVar.c() == null) {
                                    xVar = this.f103344g;
                                    if (xVar == null ? xVar.equals(uVar.f()) : uVar.f() == null) {
                                    }
                                }
                            }
                        }
                    }
                } else if (oVar.equals(uVar.b())) {
                    num = this.f103341d;
                    if (num == null) {
                        str = this.f103342e;
                        if (str == null) {
                            list = this.f103343f;
                            if (list == null) {
                                xVar = this.f103344g;
                                return xVar == null ? true : true;
                            }
                            xVar = this.f103344g;
                            if (xVar == null) {
                            }
                        }
                        list = this.f103343f;
                        if (list == null) {
                            xVar = this.f103344g;
                            if (xVar == null) {
                            }
                        }
                        xVar = this.f103344g;
                        if (xVar == null) {
                        }
                    }
                    str = this.f103342e;
                    if (str == null) {
                        list = this.f103343f;
                        if (list == null) {
                            xVar = this.f103344g;
                            if (xVar == null) {
                            }
                        }
                        xVar = this.f103344g;
                        if (xVar == null) {
                        }
                    }
                    list = this.f103343f;
                    if (list == null) {
                        xVar = this.f103344g;
                        if (xVar == null) {
                        }
                    }
                    xVar = this.f103344g;
                    if (xVar == null) {
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.u
    @p0
    public x f() {
        return this.f103344g;
    }

    @Override // com.google.android.datatransport.cct.internal.u
    public long g() {
        return this.f103338a;
    }

    @Override // com.google.android.datatransport.cct.internal.u
    public long h() {
        return this.f103339b;
    }

    public int hashCode() {
        long j10 = this.f103338a;
        long j11 = this.f103339b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        o oVar = this.f103340c;
        int iHashCode = (i10 ^ (oVar == null ? 0 : oVar.hashCode())) * 1000003;
        Integer num = this.f103341d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f103342e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<t> list = this.f103343f;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        x xVar = this.f103344g;
        return iHashCode4 ^ (xVar != null ? xVar.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f103338a + ", requestUptimeMs=" + this.f103339b + ", clientInfo=" + this.f103340c + ", logSource=" + this.f103341d + ", logSourceName=" + this.f103342e + ", logEvents=" + this.f103343f + ", qosTier=" + this.f103344g + "}";
    }

    private k(long j10, long j11, @p0 o oVar, @p0 Integer num, @p0 String str, @p0 List<t> list, @p0 x xVar) {
        this.f103338a = j10;
        this.f103339b = j11;
        this.f103340c = oVar;
        this.f103341d = num;
        this.f103342e = str;
        this.f103343f = list;
        this.f103344g = xVar;
    }
}
