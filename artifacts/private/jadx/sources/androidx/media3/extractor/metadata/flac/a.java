package androidx.media3.extractor.metadata.flac;

import androidx.annotation.p0;
import androidx.media3.common.q0;
import androidx.media3.common.r0;
import androidx.media3.common.s0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.o0;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class a implements r0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f67493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f67494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f67495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f67496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f67497e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f67498f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f67499g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f67500h;

    public a(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f67493a = i10;
        this.f67494b = str;
        this.f67495c = str2;
        this.f67496d = i11;
        this.f67497e = i12;
        this.f67498f = i13;
        this.f67499g = i14;
        this.f67500h = bArr;
    }

    public static a b(o0 o0Var) {
        int iS = o0Var.s();
        String strW = s0.w(o0Var.J(o0Var.s(), StandardCharsets.US_ASCII));
        String strI = o0Var.I(o0Var.s());
        int iS2 = o0Var.s();
        int iS3 = o0Var.s();
        int iS4 = o0Var.s();
        int iS5 = o0Var.s();
        int iS6 = o0Var.s();
        byte[] bArr = new byte[iS6];
        o0Var.n(bArr, 0, iS6);
        return new a(iS, strW, strI, iS2, iS3, iS4, iS5, bArr);
    }

    @Override // androidx.media3.common.r0.a
    public void a(q0.b bVar) {
        bVar.K(this.f67500h, this.f67493a);
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f67493a == aVar.f67493a && this.f67494b.equals(aVar.f67494b) && this.f67495c.equals(aVar.f67495c) && this.f67496d == aVar.f67496d && this.f67497e == aVar.f67497e && this.f67498f == aVar.f67498f && this.f67499g == aVar.f67499g && Arrays.equals(this.f67500h, aVar.f67500h)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((527 + this.f67493a) * 31) + this.f67494b.hashCode()) * 31) + this.f67495c.hashCode()) * 31) + this.f67496d) * 31) + this.f67497e) * 31) + this.f67498f) * 31) + this.f67499g) * 31) + Arrays.hashCode(this.f67500h);
    }

    public String toString() {
        return "Picture: mimeType=" + this.f67494b + ", description=" + this.f67495c;
    }
}
