package androidx.media2.exoplayer.external.drm;

import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.drm.t;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public interface p<T extends t> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f53890a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f53891b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f53892c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f53893d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f53894e = 4;

    public static class a extends IOException {
        public a(Throwable cause) {
            super(cause);
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    @p0
    a T();

    @p0
    Map<String, String> U();

    @p0
    byte[] V();

    @p0
    T W();

    void X();

    void Y();

    int getState();
}
