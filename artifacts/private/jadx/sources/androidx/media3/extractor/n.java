package androidx.media3.extractor;

import androidx.media3.common.util.b1;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f68156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f68157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f68158c;

    private n(int i10, int i11, String str) {
        this.f68156a = i10;
        this.f68157b = i11;
        this.f68158c = str;
    }

    @androidx.annotation.p0
    public static n a(androidx.media3.common.util.o0 o0Var) {
        String str;
        o0Var.b0(2);
        int iL = o0Var.L();
        int i10 = iL >> 1;
        int iL2 = ((o0Var.L() >> 3) & 31) | ((iL & 1) << 5);
        if (i10 == 4 || i10 == 5 || i10 == 7 || i10 == 8) {
            str = "dvhe";
        } else if (i10 == 9) {
            str = "dvav";
        } else {
            if (i10 != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(i10 < 10 ? ".0" : ".");
        sb2.append(i10);
        sb2.append(iL2 < 10 ? ".0" : ".");
        sb2.append(iL2);
        return new n(i10, iL2, sb2.toString());
    }
}
