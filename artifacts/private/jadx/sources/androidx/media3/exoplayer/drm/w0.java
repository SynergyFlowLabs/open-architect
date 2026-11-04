package androidx.media3.exoplayer.drm;

import androidx.media3.common.util.b1;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class w0 extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f63751b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f63752c = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f63753a;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public w0(int i10) {
        this.f63753a = i10;
    }

    public w0(int i10, Exception exc) {
        super(exc);
        this.f63753a = i10;
    }
}
