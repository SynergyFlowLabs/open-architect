package androidx.media3.exoplayer.drm;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.datasource.p1;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f63754a = 5;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f63755b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f63756c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f63757d = 3;

    @androidx.annotation.w0(23)
    private static final class a {
        private a() {
        }

        public static boolean a(@androidx.annotation.p0 Throwable th2) {
            return th2 instanceof MediaDrmResetException;
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    private x() {
    }

    public static byte[] a(androidx.media3.datasource.p pVar, String str, @androidx.annotation.p0 byte[] bArr, Map<String, String> map) throws p0 {
        p1 p1Var = new p1(pVar);
        androidx.media3.datasource.x xVarA = new androidx.media3.datasource.x.b().k(str).f(map).e(2).d(bArr).c(1).a();
        int i10 = 0;
        androidx.media3.datasource.x xVarA2 = xVarA;
        while (true) {
            try {
                androidx.media3.datasource.v vVar = new androidx.media3.datasource.v(p1Var, xVarA2);
                try {
                    try {
                        byte[] bArrU = com.google.common.io.h.u(vVar);
                        k1.t(vVar);
                        return bArrU;
                    } catch (androidx.media3.datasource.g0.f e10) {
                        String strC = c(e10, i10);
                        if (strC == null) {
                            throw e10;
                        }
                        i10++;
                        xVarA2 = xVarA2.a().k(strC).a();
                        k1.t(vVar);
                    }
                } catch (Throwable th2) {
                    k1.t(vVar);
                    throw th2;
                }
            } catch (Exception e11) {
                throw new p0(xVarA, p1Var.v(), p1Var.a(), p1Var.u(), e11);
            }
        }
    }

    public static int b(Throwable th2, int i10) {
        if (th2 instanceof MediaDrm.MediaDrmStateException) {
            return k1.t0(k1.u0(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo()));
        }
        if (k1.f61540a >= 23 && a.a(th2)) {
            return androidx.media3.common.x0.F3;
        }
        if ((th2 instanceof NotProvisionedException) || d(th2)) {
            return androidx.media3.common.x0.B3;
        }
        if (th2 instanceof DeniedByServerException) {
            return androidx.media3.common.x0.G3;
        }
        if (th2 instanceof w0) {
            return androidx.media3.common.x0.A3;
        }
        if (th2 instanceof h.e) {
            return androidx.media3.common.x0.C3;
        }
        if (th2 instanceof m0) {
            return androidx.media3.common.x0.H3;
        }
        if (i10 == 1) {
            return androidx.media3.common.x0.F3;
        }
        if (i10 == 2) {
            return androidx.media3.common.x0.D3;
        }
        if (i10 == 3) {
            return androidx.media3.common.x0.B3;
        }
        throw new IllegalArgumentException();
    }

    @androidx.annotation.p0
    private static String c(androidx.media3.datasource.g0.f fVar, int i10) {
        Map<String, List<String>> map;
        List<String> list;
        int i11 = fVar.f62493h;
        if ((i11 != 307 && i11 != 308) || i10 >= 5 || (map = fVar.f62495j) == null || (list = map.get(com.google.common.net.d.f119539t0)) == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static boolean d(@androidx.annotation.p0 Throwable th2) {
        return k1.f61540a == 34 && (th2 instanceof NoSuchMethodError) && th2.getMessage() != null && th2.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    public static boolean e(@androidx.annotation.p0 Throwable th2) {
        return k1.f61540a == 34 && (th2 instanceof NoSuchMethodError) && th2.getMessage() != null && th2.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }
}
