package androidx.media3.common.util;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f61595a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f61596b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f61597c = 2;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    private p0() {
    }

    public static int a(int i10, int i11) {
        for (int i12 = 1; i12 <= 2; i12++) {
            int i13 = (i10 + i12) % 3;
            if (b(i13, i11)) {
                return i13;
            }
        }
        return i10;
    }

    public static boolean b(int i10, int i11) {
        if (i10 == 0) {
            return true;
        }
        if (i10 != 1) {
            return i10 == 2 && (i11 & 2) != 0;
        }
        return (i11 & 1) != 0;
    }
}
