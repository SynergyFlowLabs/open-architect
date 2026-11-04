package androidx.media2.exoplayer.external.video;

import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.util.x;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f57755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f57756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f57757c;

    private b(int profile, int level, String codecs) {
        this.f57755a = profile;
        this.f57756b = level;
        this.f57757c = codecs;
    }

    @p0
    public static b a(x data) {
        String str;
        data.R(2);
        int iD = data.D();
        int i10 = iD >> 1;
        int iD2 = ((data.D() >> 3) & 31) | ((iD & 1) << 5);
        if (i10 == 4 || i10 == 5) {
            str = "dvhe";
        } else if (i10 == 8) {
            str = "hev1";
        } else {
            if (i10 != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 26);
        sb2.append(str);
        sb2.append(".0");
        sb2.append(i10);
        sb2.append(".0");
        sb2.append(iD2);
        return new b(i10, iD2, sb2.toString());
    }
}
