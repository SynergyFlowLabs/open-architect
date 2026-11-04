package androidx.media2.exoplayer.external.util;

import androidx.annotation.b1;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f57508a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f57509b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f57510c = 2;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    private b0() {
    }

    public static int a(int currentMode, int enabledModes) {
        for (int i10 = 1; i10 <= 2; i10++) {
            int i11 = (currentMode + i10) % 3;
            if (b(i11, enabledModes)) {
                return i11;
            }
        }
        return currentMode;
    }

    public static boolean b(int repeatMode, int enabledModes) {
        if (repeatMode == 0) {
            return true;
        }
        if (repeatMode != 1) {
            return repeatMode == 2 && (enabledModes & 2) != 0;
        }
        return (enabledModes & 1) != 0;
    }
}
