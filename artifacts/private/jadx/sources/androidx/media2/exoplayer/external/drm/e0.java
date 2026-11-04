package androidx.media2.exoplayer.external.drm;

import androidx.annotation.b1;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class e0 extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f53831b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f53832c = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f53833a;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public e0(int reason) {
        this.f53833a = reason;
    }

    public e0(int reason, Exception cause) {
        super(cause);
        this.f53833a = reason;
    }
}
