package androidx.media2.exoplayer.external.audio;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.util.q0;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f53431a = 1380533830;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f53432b = 1463899717;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f53433c = 1718449184;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f53434d = 1684108385;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f53435e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f53436f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f53437g = 6;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f53438h = 7;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f53439i = 65534;

    private j0() {
    }

    public static int a(int type, int bitsPerSample) {
        if (type != 1) {
            if (type == 3) {
                return bitsPerSample == 32 ? 4 : 0;
            }
            if (type != 65534) {
                if (type != 6) {
                    return type != 7 ? 0 : 268435456;
                }
                return 536870912;
            }
        }
        return q0.U(bitsPerSample);
    }

    public static int b(int encoding) {
        if (encoding != Integer.MIN_VALUE) {
            if (encoding == 268435456) {
                return 7;
            }
            if (encoding == 536870912) {
                return 6;
            }
            if (encoding != 1073741824 && encoding != 2 && encoding != 3) {
                if (encoding == 4) {
                    return 3;
                }
                throw new IllegalArgumentException();
            }
        }
        return 1;
    }
}
