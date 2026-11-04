package vf;

import kotlin.k0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public enum b {
    ERROR,
    WARNING,
    DEBUG;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f385756a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.DEBUG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f385756a = iArr;
        }
    }

    static {
        int i10 = 7 >> 1;
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        int i10 = a.f385756a[ordinal()];
        if (i10 == 1) {
            return "ERROR";
        }
        if (i10 == 2) {
            return com.google.common.net.d.f119495g;
        }
        if (i10 == 3) {
            return "Debug";
        }
        throw new k0();
    }
}
