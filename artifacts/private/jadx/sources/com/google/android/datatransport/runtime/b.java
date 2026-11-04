package com.google.android.datatransport.runtime;

import androidx.annotation.p0;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class b extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f103448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f103449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i f103450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f103451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f103452e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<String, String> f103453f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Integer f103454g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f103455h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final byte[] f103456i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final byte[] f103457j;

    /* JADX INFO: renamed from: com.google.android.datatransport.runtime.b$b, reason: collision with other inner class name */
    static final class C0940b extends j.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f103458a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f103459b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private i f103460c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Long f103461d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Long f103462e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Map<String, String> f103463f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Integer f103464g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f103465h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private byte[] f103466i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private byte[] f103467j;

        C0940b() {
        }

        @Override // com.google.android.datatransport.runtime.j.a
        public j d() {
            String str = "";
            if (this.f103458a == null) {
                str = " transportName";
            }
            if (this.f103460c == null) {
                str = str + " encodedPayload";
            }
            if (this.f103461d == null) {
                str = str + " eventMillis";
            }
            if (this.f103462e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f103463f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new b(this.f103458a, this.f103459b, this.f103460c, this.f103461d.longValue(), this.f103462e.longValue(), this.f103463f, this.f103464g, this.f103465h, this.f103466i, this.f103467j);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.runtime.j.a
        protected Map<String, String> e() {
            Map<String, String> map = this.f103463f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // com.google.android.datatransport.runtime.j.a
        protected j.a f(Map<String, String> map) {
            if (map == null) {
                throw new NullPointerException("Null autoMetadata");
            }
            this.f103463f = map;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.j.a
        public j.a g(Integer num) {
            this.f103459b = num;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.j.a
        public j.a h(i iVar) {
            if (iVar == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.f103460c = iVar;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.j.a
        public j.a i(long j10) {
            this.f103461d = Long.valueOf(j10);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.j.a
        public j.a j(byte[] bArr) {
            this.f103466i = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.j.a
        public j.a k(byte[] bArr) {
            this.f103467j = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.j.a
        public j.a l(Integer num) {
            this.f103464g = num;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.j.a
        public j.a m(String str) {
            this.f103465h = str;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.j.a
        public j.a n(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f103458a = str;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.j.a
        public j.a o(long j10) {
            this.f103462e = Long.valueOf(j10);
            return this;
        }
    }

    @Override // com.google.android.datatransport.runtime.j
    protected Map<String, String> c() {
        return this.f103453f;
    }

    @Override // com.google.android.datatransport.runtime.j
    @p0
    public Integer d() {
        return this.f103449b;
    }

    @Override // com.google.android.datatransport.runtime.j
    public i e() {
        return this.f103450c;
    }

    public boolean equals(Object obj) {
        Integer num;
        Integer num2;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f103448a.equals(jVar.p()) && ((num = this.f103449b) != null ? num.equals(jVar.d()) : jVar.d() == null) && this.f103450c.equals(jVar.e()) && this.f103451d == jVar.f() && this.f103452e == jVar.q() && this.f103453f.equals(jVar.c()) && ((num2 = this.f103454g) != null ? num2.equals(jVar.n()) : jVar.n() == null) && ((str = this.f103455h) != null ? str.equals(jVar.o()) : jVar.o() == null)) {
                boolean z10 = jVar instanceof b;
                if (Arrays.equals(this.f103456i, z10 ? ((b) jVar).f103456i : jVar.g())) {
                    if (Arrays.equals(this.f103457j, z10 ? ((b) jVar).f103457j : jVar.h())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.j
    public long f() {
        return this.f103451d;
    }

    @Override // com.google.android.datatransport.runtime.j
    @p0
    public byte[] g() {
        return this.f103456i;
    }

    @Override // com.google.android.datatransport.runtime.j
    @p0
    public byte[] h() {
        return this.f103457j;
    }

    public int hashCode() {
        int iHashCode = (this.f103448a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f103449b;
        boolean z10 = true & false;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f103450c.hashCode()) * 1000003;
        long j10 = this.f103451d;
        int i10 = (iHashCode2 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f103452e;
        int iHashCode3 = (((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f103453f.hashCode()) * 1000003;
        Integer num2 = this.f103454g;
        int iHashCode4 = (iHashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.f103455h;
        return Arrays.hashCode(this.f103457j) ^ ((((iHashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.f103456i)) * 1000003);
    }

    @Override // com.google.android.datatransport.runtime.j
    @p0
    public Integer n() {
        return this.f103454g;
    }

    @Override // com.google.android.datatransport.runtime.j
    @p0
    public String o() {
        return this.f103455h;
    }

    @Override // com.google.android.datatransport.runtime.j
    public String p() {
        return this.f103448a;
    }

    @Override // com.google.android.datatransport.runtime.j
    public long q() {
        return this.f103452e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f103448a + ", code=" + this.f103449b + ", encodedPayload=" + this.f103450c + ", eventMillis=" + this.f103451d + ", uptimeMillis=" + this.f103452e + ", autoMetadata=" + this.f103453f + ", productId=" + this.f103454g + ", pseudonymousId=" + this.f103455h + ", experimentIdsClear=" + Arrays.toString(this.f103456i) + ", experimentIdsEncrypted=" + Arrays.toString(this.f103457j) + "}";
    }

    private b(String str, @p0 Integer num, i iVar, long j10, long j11, Map<String, String> map, @p0 Integer num2, @p0 String str2, @p0 byte[] bArr, @p0 byte[] bArr2) {
        this.f103448a = str;
        this.f103449b = num;
        this.f103450c = iVar;
        this.f103451d = j10;
        this.f103452e = j11;
        this.f103453f = map;
        this.f103454g = num2;
        this.f103455h = str2;
        this.f103456i = bArr;
        this.f103457j = bArr2;
    }
}
