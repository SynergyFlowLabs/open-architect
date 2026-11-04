package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
final class g extends f0.e.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f121579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f121580b;

    static final class b extends f0.e.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f121581a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte[] f121582b;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.e.b.a
        public f0.e.b a() {
            byte[] bArr;
            String str = this.f121581a;
            if (str != null && (bArr = this.f121582b) != null) {
                return new g(str, bArr);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f121581a == null) {
                sb2.append(" filename");
            }
            if (this.f121582b == null) {
                sb2.append(" contents");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.e.b.a
        public f0.e.b.a b(byte[] bArr) {
            if (bArr == null) {
                throw new NullPointerException("Null contents");
            }
            this.f121582b = bArr;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.e.b.a
        public f0.e.b.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null filename");
            }
            this.f121581a = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.e.b
    @NonNull
    public byte[] b() {
        return this.f121580b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.e.b
    @NonNull
    public String c() {
        return this.f121579a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.e.b) {
            f0.e.b bVar = (f0.e.b) obj;
            if (this.f121579a.equals(bVar.c())) {
                if (Arrays.equals(this.f121580b, bVar instanceof g ? ((g) bVar).f121580b : bVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f121580b) ^ ((this.f121579a.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "File{filename=" + this.f121579a + ", contents=" + Arrays.toString(this.f121580b) + "}";
    }

    private g(String str, byte[] bArr) {
        this.f121579a = str;
        this.f121580b = bArr;
    }
}
