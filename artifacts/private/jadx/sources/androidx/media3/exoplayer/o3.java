package androidx.media3.exoplayer;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class o3 extends RuntimeException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f64342b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f64343c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f64344d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f64345e = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f64346a;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public o3(int i10) {
        super(a(i10));
        this.f64346a = i10;
    }

    private static String a(int i10) {
        if (i10 == 1) {
            return "Player release timed out.";
        }
        if (i10 != 2) {
            return i10 != 3 ? "Undefined timeout." : "Detaching surface timed out.";
        }
        return "Setting foreground mode timed out.";
    }
}
