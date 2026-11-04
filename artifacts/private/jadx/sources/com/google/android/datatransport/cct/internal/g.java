package com.google.android.datatransport.cct.internal;

import androidx.annotation.p0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
final class g extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f103312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f103313b;

    static final class b extends q.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private byte[] f103314a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte[] f103315b;

        b() {
        }

        @Override // com.google.android.datatransport.cct.internal.q.a
        public q a() {
            return new g(this.f103314a, this.f103315b);
        }

        @Override // com.google.android.datatransport.cct.internal.q.a
        public q.a b(@p0 byte[] bArr) {
            this.f103314a = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.q.a
        public q.a c(@p0 byte[] bArr) {
            this.f103315b = bArr;
            return this;
        }
    }

    @Override // com.google.android.datatransport.cct.internal.q
    @p0
    public byte[] b() {
        return this.f103312a;
    }

    @Override // com.google.android.datatransport.cct.internal.q
    @p0
    public byte[] c() {
        return this.f103313b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            boolean z10 = qVar instanceof g;
            if (Arrays.equals(this.f103312a, z10 ? ((g) qVar).f103312a : qVar.b())) {
                if (Arrays.equals(this.f103313b, z10 ? ((g) qVar).f103313b : qVar.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f103313b) ^ ((Arrays.hashCode(this.f103312a) ^ 1000003) * 1000003);
    }

    public String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f103312a) + ", encryptedBlob=" + Arrays.toString(this.f103313b) + "}";
    }

    private g(@p0 byte[] bArr, @p0 byte[] bArr2) {
        this.f103312a = bArr;
        this.f103313b = bArr2;
    }
}
