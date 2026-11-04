package androidx.media3.datasource;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class u extends IOException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.media3.common.util.b1
    @Deprecated
    public static final int f62579b = 2008;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f62580a;

    @androidx.media3.common.util.b1
    public u(int i10) {
        this.f62580a = i10;
    }

    @androidx.media3.common.util.b1
    public static boolean a(IOException iOException) {
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof u) && ((u) cause).f62580a == 2008) {
                return true;
            }
        }
        return false;
    }

    @androidx.media3.common.util.b1
    public u(@androidx.annotation.p0 Throwable th2, int i10) {
        super(th2);
        this.f62580a = i10;
    }

    @androidx.media3.common.util.b1
    public u(@androidx.annotation.p0 String str, int i10) {
        super(str);
        this.f62580a = i10;
    }

    @androidx.media3.common.util.b1
    public u(@androidx.annotation.p0 String str, @androidx.annotation.p0 Throwable th2, int i10) {
        super(str, th2);
        this.f62580a = i10;
    }
}
