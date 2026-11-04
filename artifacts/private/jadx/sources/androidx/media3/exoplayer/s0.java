package androidx.media3.exoplayer;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class s0 extends androidx.media3.common.x0 {

    @androidx.media3.common.util.b1
    public static final int Z3 = 0;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final int f64673a4 = 1;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final int f64674b4 = 2;

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final int f64675c4 = 3;

    @androidx.media3.common.util.b1
    public final int S3;

    @androidx.media3.common.util.b1
    @androidx.annotation.p0
    public final String T3;

    @androidx.media3.common.util.b1
    public final int U3;

    @androidx.media3.common.util.b1
    @androidx.annotation.p0
    public final androidx.media3.common.w V3;

    @androidx.media3.common.util.b1
    public final int W3;

    @androidx.media3.common.util.b1
    @androidx.annotation.p0
    public final androidx.media3.exoplayer.source.t0.b X3;
    final boolean Y3;

    @androidx.media3.common.util.b1
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    private s0(int i10, Throwable th2, int i11) {
        this(i10, th2, null, i11, null, -1, null, 4, false);
    }

    @androidx.media3.common.util.b1
    public static s0 k(String str) {
        return new s0(3, null, str, 1001, null, -1, null, 4, false);
    }

    @androidx.media3.common.util.b1
    public static s0 l(Throwable th2, String str, int i10, @androidx.annotation.p0 androidx.media3.common.w wVar, int i11, boolean z10, int i12) {
        if (wVar == null) {
            i11 = 4;
        }
        return new s0(1, th2, null, i12, str, i10, wVar, i11, z10);
    }

    @androidx.media3.common.util.b1
    public static s0 m(IOException iOException, int i10) {
        return new s0(0, iOException, i10);
    }

    @androidx.media3.common.util.b1
    @Deprecated
    public static s0 n(RuntimeException runtimeException) {
        return o(runtimeException, 1000);
    }

    @androidx.media3.common.util.b1
    public static s0 o(RuntimeException runtimeException, int i10) {
        return new s0(2, runtimeException, i10);
    }

    private static String p(int i10, @androidx.annotation.p0 String str, @androidx.annotation.p0 String str2, int i11, @androidx.annotation.p0 androidx.media3.common.w wVar, int i12) {
        String str3;
        if (i10 == 0) {
            str3 = "Source error";
        } else if (i10 != 1) {
            str3 = i10 != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            str3 = str2 + " error, index=" + i11 + ", format=" + wVar + ", format_supported=" + androidx.media3.common.util.k1.v0(i12);
        }
        if (!TextUtils.isEmpty(str)) {
            str3 = str3 + ": " + str;
        }
        return str3;
    }

    @Override // androidx.media3.common.x0
    public boolean c(@androidx.annotation.p0 androidx.media3.common.x0 x0Var) {
        if (!super.c(x0Var)) {
            return false;
        }
        s0 s0Var = (s0) androidx.media3.common.util.k1.o(x0Var);
        return this.S3 == s0Var.S3 && Objects.equals(this.T3, s0Var.T3) && this.U3 == s0Var.U3 && Objects.equals(this.V3, s0Var.V3) && this.W3 == s0Var.W3 && Objects.equals(this.X3, s0Var.X3) && this.Y3 == s0Var.Y3;
    }

    @androidx.annotation.j
    s0 j(@androidx.annotation.p0 androidx.media3.exoplayer.source.t0.b bVar) {
        return new s0((String) androidx.media3.common.util.k1.o(getMessage()), getCause(), this.f61851a, this.S3, this.T3, this.U3, this.V3, this.W3, bVar, this.f61852b, this.Y3);
    }

    @androidx.media3.common.util.b1
    public Exception q() {
        androidx.media3.common.util.a.i(this.S3 == 1);
        return (Exception) androidx.media3.common.util.a.g(getCause());
    }

    @androidx.media3.common.util.b1
    public IOException r() {
        androidx.media3.common.util.a.i(this.S3 == 0);
        return (IOException) androidx.media3.common.util.a.g(getCause());
    }

    @androidx.media3.common.util.b1
    public RuntimeException s() {
        androidx.media3.common.util.a.i(this.S3 == 2);
        return (RuntimeException) androidx.media3.common.util.a.g(getCause());
    }

    private s0(int i10, @androidx.annotation.p0 Throwable th2, @androidx.annotation.p0 String str, int i11, @androidx.annotation.p0 String str2, int i12, @androidx.annotation.p0 androidx.media3.common.w wVar, int i13, boolean z10) {
        this(p(i10, str, str2, i12, wVar, i13), th2, i11, i10, str2, i12, wVar, i13, null, SystemClock.elapsedRealtime(), z10);
    }

    private s0(String str, @androidx.annotation.p0 Throwable th2, int i10, int i11, @androidx.annotation.p0 String str2, int i12, @androidx.annotation.p0 androidx.media3.common.w wVar, int i13, @androidx.annotation.p0 androidx.media3.exoplayer.source.t0.b bVar, long j10, boolean z10) {
        super(str, th2, i10, Bundle.EMPTY, j10);
        androidx.media3.common.util.a.a(!z10 || i11 == 1);
        androidx.media3.common.util.a.a(th2 != null || i11 == 3);
        this.S3 = i11;
        this.T3 = str2;
        this.U3 = i12;
        this.V3 = wVar;
        this.W3 = i13;
        this.X3 = bVar;
        this.Y3 = z10;
    }
}
