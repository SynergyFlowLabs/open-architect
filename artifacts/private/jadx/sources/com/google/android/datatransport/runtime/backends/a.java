package com.google.android.datatransport.runtime.backends;

import androidx.annotation.p0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
final class a extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Iterable<com.google.android.datatransport.runtime.j> f103468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f103469b;

    static final class b extends g.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Iterable<com.google.android.datatransport.runtime.j> f103470a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte[] f103471b;

        b() {
        }

        @Override // com.google.android.datatransport.runtime.backends.g.a
        public g a() {
            String str = "";
            if (this.f103470a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new a(this.f103470a, this.f103471b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.runtime.backends.g.a
        public g.a b(Iterable<com.google.android.datatransport.runtime.j> iterable) {
            if (iterable == null) {
                throw new NullPointerException("Null events");
            }
            this.f103470a = iterable;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.backends.g.a
        public g.a c(@p0 byte[] bArr) {
            this.f103471b = bArr;
            return this;
        }
    }

    @Override // com.google.android.datatransport.runtime.backends.g
    public Iterable<com.google.android.datatransport.runtime.j> c() {
        return this.f103468a;
    }

    @Override // com.google.android.datatransport.runtime.backends.g
    @p0
    public byte[] d() {
        return this.f103469b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f103468a.equals(gVar.c())) {
                if (Arrays.equals(this.f103469b, gVar instanceof a ? ((a) gVar).f103469b : gVar.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f103469b) ^ ((this.f103468a.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f103468a + ", extras=" + Arrays.toString(this.f103469b) + "}";
    }

    private a(Iterable<com.google.android.datatransport.runtime.j> iterable, @p0 byte[] bArr) {
        this.f103468a = iterable;
        this.f103469b = bArr;
    }
}
