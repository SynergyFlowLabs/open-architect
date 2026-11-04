package com.google.android.datatransport.runtime;

import androidx.annotation.b1;
import androidx.annotation.p0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
final class d extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f103509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f103510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.datatransport.h f103511c;

    static final class b extends r.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f103512a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte[] f103513b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private com.google.android.datatransport.h f103514c;

        b() {
        }

        @Override // com.google.android.datatransport.runtime.r.a
        public r a() {
            String str = "";
            if (this.f103512a == null) {
                str = " backendName";
            }
            if (this.f103514c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new d(this.f103512a, this.f103513b, this.f103514c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.runtime.r.a
        public r.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f103512a = str;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.r.a
        public r.a c(@p0 byte[] bArr) {
            this.f103513b = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.r.a
        public r.a d(com.google.android.datatransport.h hVar) {
            if (hVar == null) {
                throw new NullPointerException("Null priority");
            }
            this.f103514c = hVar;
            return this;
        }
    }

    @Override // com.google.android.datatransport.runtime.r
    public String b() {
        return this.f103509a;
    }

    @Override // com.google.android.datatransport.runtime.r
    @p0
    public byte[] c() {
        return this.f103510b;
    }

    @Override // com.google.android.datatransport.runtime.r
    @b1({b1.a.LIBRARY_GROUP})
    public com.google.android.datatransport.h d() {
        return this.f103511c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (this.f103509a.equals(rVar.b())) {
                if (Arrays.equals(this.f103510b, rVar instanceof d ? ((d) rVar).f103510b : rVar.c()) && this.f103511c.equals(rVar.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f103511c.hashCode() ^ ((((this.f103509a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f103510b)) * 1000003);
    }

    private d(String str, @p0 byte[] bArr, com.google.android.datatransport.h hVar) {
        this.f103509a = str;
        this.f103510b = bArr;
        this.f103511c = hVar;
    }
}
