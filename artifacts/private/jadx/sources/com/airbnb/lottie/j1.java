package com.airbnb.lottie;

/* JADX INFO: loaded from: classes3.dex */
public enum j1 {
    AUTOMATIC,
    HARDWARE,
    SOFTWARE;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f88297a;

        static {
            int[] iArr = new int[j1.values().length];
            f88297a = iArr;
            try {
                iArr[j1.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f88297a[j1.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f88297a[j1.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public boolean l(int i10, boolean z10, int i11) {
        int i12 = a.f88297a[ordinal()];
        if (i12 == 1) {
            return false;
        }
        if (i12 != 2) {
            return (z10 && i10 < 28) || i11 > 4 || i10 <= 25;
        }
        return true;
    }
}
