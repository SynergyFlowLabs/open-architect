package com.google.android.datatransport;

import androidx.annotation.p0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
final class b extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f103177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f103178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f103179c;

    /* JADX INFO: renamed from: com.google.android.datatransport.b$b, reason: collision with other inner class name */
    static final class C0936b extends g.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f103180a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte[] f103181b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private byte[] f103182c;

        C0936b() {
        }

        @Override // com.google.android.datatransport.g.a
        public g a() {
            return new b(this.f103180a, this.f103181b, this.f103182c);
        }

        @Override // com.google.android.datatransport.g.a
        public g.a b(byte[] bArr) {
            this.f103181b = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.g.a
        public g.a c(byte[] bArr) {
            this.f103182c = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.g.a
        public g.a d(String str) {
            this.f103180a = str;
            return this;
        }
    }

    @Override // com.google.android.datatransport.g
    @p0
    public byte[] b() {
        return this.f103178b;
    }

    @Override // com.google.android.datatransport.g
    @p0
    public byte[] c() {
        return this.f103179c;
    }

    @Override // com.google.android.datatransport.g
    @p0
    public String d() {
        return this.f103177a;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Code duplicated, block: B:20:0x0040  */
    /* JADX WARN: Code duplicated, block: B:22:0x0045  */
    /* JADX WARN: Code duplicated, block: B:23:0x004b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0058 A[RETURN] */
    public boolean equals(Object obj) {
        byte[] bArr;
        boolean z10;
        byte[] bArrB;
        byte[] bArr2;
        byte[] bArrC;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            String str = this.f103177a;
            if (str == null) {
                if (gVar.d() == null) {
                    bArr = this.f103178b;
                    z10 = gVar instanceof b;
                    if (z10) {
                        bArrB = ((b) gVar).f103178b;
                    } else {
                        bArrB = gVar.b();
                    }
                    if (Arrays.equals(bArr, bArrB)) {
                        bArr2 = this.f103179c;
                        if (z10) {
                            bArrC = ((b) gVar).f103179c;
                        } else {
                            bArrC = gVar.c();
                        }
                        if (Arrays.equals(bArr2, bArrC)) {
                            return true;
                        }
                    }
                }
            } else if (str.equals(gVar.d())) {
                bArr = this.f103178b;
                z10 = gVar instanceof b;
                if (z10) {
                    bArrB = ((b) gVar).f103178b;
                } else {
                    bArrB = gVar.b();
                }
                if (Arrays.equals(bArr, bArrB)) {
                    bArr2 = this.f103179c;
                    if (z10) {
                        bArrC = ((b) gVar).f103179c;
                    } else {
                        bArrC = gVar.c();
                    }
                    if (Arrays.equals(bArr2, bArrC)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f103177a;
        return Arrays.hashCode(this.f103179c) ^ (((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f103178b)) * 1000003);
    }

    public String toString() {
        return "EventContext{pseudonymousId=" + this.f103177a + ", experimentIdsClear=" + Arrays.toString(this.f103178b) + ", experimentIdsEncrypted=" + Arrays.toString(this.f103179c) + "}";
    }

    private b(@p0 String str, @p0 byte[] bArr, @p0 byte[] bArr2) {
        this.f103177a = str;
        this.f103178b = bArr;
        this.f103179c = bArr2;
    }
}
