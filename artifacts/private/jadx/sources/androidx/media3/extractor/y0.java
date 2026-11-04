package androidx.media3.extractor;

import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f69654a = 1380533830;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f69655b = 1463899717;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f69656c = 1718449184;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f69657d = 1684108385;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f69658e = 1380333108;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f69659f = 1685272116;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f69660g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f69661h = 3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f69662i = 6;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f69663j = 7;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f69664k = 17;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f69665l = 65534;

    private y0() {
    }

    public static int a(int i10, int i11) {
        if (i10 != 1) {
            if (i10 == 3) {
                return i11 == 32 ? 4 : 0;
            }
            if (i10 != 65534) {
                return 0;
            }
        }
        return k1.B0(i11);
    }

    public static int b(int i10) {
        if (i10 != 2 && i10 != 3) {
            if (i10 == 4) {
                return 3;
            }
            if (i10 != 21 && i10 != 22) {
                throw new IllegalArgumentException();
            }
        }
        return 1;
    }
}
