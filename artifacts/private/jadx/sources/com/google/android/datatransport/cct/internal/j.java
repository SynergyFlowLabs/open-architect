package com.google.android.datatransport.cct.internal;

import androidx.annotation.p0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
final class j extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f103320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f103321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p f103322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f103323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f103324e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f103325f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f103326g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final w f103327h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final q f103328i;

    static final class b extends t.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f103329a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f103330b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private p f103331c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Long f103332d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private byte[] f103333e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f103334f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Long f103335g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private w f103336h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private q f103337i;

        b() {
        }

        @Override // com.google.android.datatransport.cct.internal.t.a
        public t a() {
            String str = "";
            if (this.f103329a == null) {
                str = " eventTimeMs";
            }
            if (this.f103332d == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f103335g == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new j(this.f103329a.longValue(), this.f103330b, this.f103331c, this.f103332d.longValue(), this.f103333e, this.f103334f, this.f103335g.longValue(), this.f103336h, this.f103337i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.cct.internal.t.a
        public t.a b(@p0 p pVar) {
            this.f103331c = pVar;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.t.a
        public t.a c(@p0 Integer num) {
            this.f103330b = num;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.t.a
        public t.a d(long j10) {
            this.f103329a = Long.valueOf(j10);
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.t.a
        public t.a e(long j10) {
            this.f103332d = Long.valueOf(j10);
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.t.a
        public t.a f(@p0 q qVar) {
            this.f103337i = qVar;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.t.a
        public t.a g(@p0 w wVar) {
            this.f103336h = wVar;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.t.a
        t.a h(@p0 byte[] bArr) {
            this.f103333e = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.t.a
        t.a i(@p0 String str) {
            this.f103334f = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.t.a
        public t.a j(long j10) {
            this.f103335g = Long.valueOf(j10);
            return this;
        }
    }

    @Override // com.google.android.datatransport.cct.internal.t
    @p0
    public p b() {
        return this.f103322c;
    }

    @Override // com.google.android.datatransport.cct.internal.t
    @p0
    public Integer c() {
        return this.f103321b;
    }

    @Override // com.google.android.datatransport.cct.internal.t
    public long d() {
        return this.f103320a;
    }

    @Override // com.google.android.datatransport.cct.internal.t
    public long e() {
        return this.f103323d;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0051  */
    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    /* JADX WARN: Code duplicated, block: B:28:0x005e  */
    /* JADX WARN: Code duplicated, block: B:31:0x006a  */
    /* JADX WARN: Code duplicated, block: B:33:0x006f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0075  */
    /* JADX WARN: Code duplicated, block: B:36:0x0077  */
    /* JADX WARN: Code duplicated, block: B:38:0x0082  */
    /* JADX WARN: Code duplicated, block: B:40:0x008f  */
    public boolean equals(Object obj) {
        Integer num;
        byte[] bArr;
        byte[] bArrH;
        String str;
        w wVar;
        q qVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof t) {
            t tVar = (t) obj;
            if (this.f103320a == tVar.d() && ((num = this.f103321b) != null ? num.equals(tVar.c()) : tVar.c() == null)) {
                p pVar = this.f103322c;
                if (pVar == null) {
                    if (tVar.b() == null) {
                        if (this.f103323d == tVar.e()) {
                            bArr = this.f103324e;
                            if (tVar instanceof j) {
                                bArrH = ((j) tVar).f103324e;
                            } else {
                                bArrH = tVar.h();
                            }
                            if (Arrays.equals(bArr, bArrH)) {
                                str = this.f103325f;
                                if (str == null) {
                                    if (tVar.i() == null) {
                                        if (this.f103326g != tVar.j() && ((wVar = this.f103327h) != null ? wVar.equals(tVar.g()) : tVar.g() == null) && ((qVar = this.f103328i) != null ? qVar.equals(tVar.f()) : tVar.f() == null)) {
                                            return true;
                                        }
                                    }
                                } else if (str.equals(tVar.i())) {
                                    if (this.f103326g != tVar.j()) {
                                    }
                                }
                            }
                        }
                    }
                } else if (pVar.equals(tVar.b())) {
                    if (this.f103323d == tVar.e()) {
                        bArr = this.f103324e;
                        if (tVar instanceof j) {
                            bArrH = ((j) tVar).f103324e;
                        } else {
                            bArrH = tVar.h();
                        }
                        if (Arrays.equals(bArr, bArrH)) {
                            str = this.f103325f;
                            if (str == null) {
                                if (tVar.i() == null) {
                                    if (this.f103326g != tVar.j()) {
                                    }
                                }
                            } else if (str.equals(tVar.i())) {
                                if (this.f103326g != tVar.j()) {
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.t
    @p0
    public q f() {
        return this.f103328i;
    }

    @Override // com.google.android.datatransport.cct.internal.t
    @p0
    public w g() {
        return this.f103327h;
    }

    @Override // com.google.android.datatransport.cct.internal.t
    @p0
    public byte[] h() {
        return this.f103324e;
    }

    public int hashCode() {
        long j10 = this.f103320a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f103321b;
        int iHashCode = 0;
        int iHashCode2 = (i10 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        p pVar = this.f103322c;
        int iHashCode3 = pVar == null ? 0 : pVar.hashCode();
        long j11 = this.f103323d;
        int iHashCode4 = (((((iHashCode2 ^ iHashCode3) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f103324e)) * 1000003;
        String str = this.f103325f;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        long j12 = this.f103326g;
        int i11 = (((iHashCode4 ^ iHashCode5) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003;
        w wVar = this.f103327h;
        int iHashCode6 = (i11 ^ (wVar == null ? 0 : wVar.hashCode())) * 1000003;
        q qVar = this.f103328i;
        if (qVar != null) {
            iHashCode = qVar.hashCode();
        }
        return iHashCode6 ^ iHashCode;
    }

    @Override // com.google.android.datatransport.cct.internal.t
    @p0
    public String i() {
        return this.f103325f;
    }

    @Override // com.google.android.datatransport.cct.internal.t
    public long j() {
        return this.f103326g;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f103320a + ", eventCode=" + this.f103321b + ", complianceData=" + this.f103322c + ", eventUptimeMs=" + this.f103323d + ", sourceExtension=" + Arrays.toString(this.f103324e) + ", sourceExtensionJsonProto3=" + this.f103325f + ", timezoneOffsetSeconds=" + this.f103326g + ", networkConnectionInfo=" + this.f103327h + ", experimentIds=" + this.f103328i + "}";
    }

    private j(long j10, @p0 Integer num, @p0 p pVar, long j11, @p0 byte[] bArr, @p0 String str, long j12, @p0 w wVar, @p0 q qVar) {
        this.f103320a = j10;
        this.f103321b = num;
        this.f103322c = pVar;
        this.f103323d = j11;
        this.f103324e = bArr;
        this.f103325f = str;
        this.f103326g = j12;
        this.f103327h = wVar;
        this.f103328i = qVar;
    }
}
