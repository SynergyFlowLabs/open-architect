package androidx.media2.exoplayer.external;

import android.os.SystemClock;
import androidx.annotation.b1;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class i extends Exception {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f55259e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f55260f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f55261g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f55262h = 3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f55263i = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f55264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f55265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f55266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.p0
    private final Throwable f55267d;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    private i(int type, Throwable cause, int rendererIndex) {
        super(cause);
        this.f55264a = type;
        this.f55267d = cause;
        this.f55265b = rendererIndex;
        this.f55266c = SystemClock.elapsedRealtime();
    }

    public static i a(OutOfMemoryError cause) {
        return new i(4, cause, -1);
    }

    public static i b(String message) {
        return new i(3, message);
    }

    public static i c(Exception cause, int rendererIndex) {
        return new i(1, cause, rendererIndex);
    }

    public static i d(IOException cause) {
        return new i(0, cause, -1);
    }

    public static i e(RuntimeException cause) {
        return new i(2, cause, -1);
    }

    public OutOfMemoryError f() {
        androidx.media2.exoplayer.external.util.a.i(this.f55264a == 4);
        return (OutOfMemoryError) androidx.media2.exoplayer.external.util.a.g(this.f55267d);
    }

    public Exception g() {
        androidx.media2.exoplayer.external.util.a.i(this.f55264a == 1);
        return (Exception) androidx.media2.exoplayer.external.util.a.g(this.f55267d);
    }

    public IOException h() {
        androidx.media2.exoplayer.external.util.a.i(this.f55264a == 0);
        return (IOException) androidx.media2.exoplayer.external.util.a.g(this.f55267d);
    }

    public RuntimeException i() {
        androidx.media2.exoplayer.external.util.a.i(this.f55264a == 2);
        return (RuntimeException) androidx.media2.exoplayer.external.util.a.g(this.f55267d);
    }

    private i(int type, String message) {
        super(message);
        this.f55264a = type;
        this.f55265b = -1;
        this.f55267d = null;
        this.f55266c = SystemClock.elapsedRealtime();
    }
}
