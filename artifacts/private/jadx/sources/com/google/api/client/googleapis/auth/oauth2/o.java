package com.google.api.client.googleapis.auth.oauth2;

import com.google.api.client.http.b0;
import com.google.api.client.http.q;
import com.google.api.client.http.u;
import com.google.api.client.http.x;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
@com.google.api.client.util.f
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Charset f115365a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f115366b = Logger.getLogger(o.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f115367c = "http://169.254.169.254";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f115368d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f115369e = 500;

    static <T extends Throwable> T a(T t10, Throwable th2) {
        t10.initCause(th2);
        return t10;
    }

    public static String b() {
        return c(p.f115370a);
    }

    static String c(p pVar) {
        String strA = pVar.a("GCE_METADATA_HOST");
        if (strA == null) {
            return f115367c;
        }
        return "http://" + strA;
    }

    static boolean d(q qVar, String str, String str2) {
        Object obj = qVar.get(str);
        if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                if ((obj2 instanceof String) && ((String) obj2).equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean e(b0 b0Var, p pVar) {
        if (Boolean.parseBoolean(pVar.a("NO_GCE_CHECK"))) {
            return false;
        }
        com.google.api.client.http.j jVar = new com.google.api.client.http.j(c(pVar));
        for (int i10 = 1; i10 <= 3; i10++) {
            try {
                u uVarB = b0Var.c().b(jVar);
                uVarB.D(500);
                x xVarA = uVarB.a();
                try {
                    boolean zD = d(xVarA.h(), "Metadata-Flavor", "Google");
                    xVarA.a();
                    return zD;
                } catch (Throwable th2) {
                    xVarA.a();
                    throw th2;
                }
            } catch (SocketTimeoutException unused) {
                continue;
            } catch (IOException e10) {
                f115366b.log(Level.WARNING, "Failed to detect whether we are running on Google Compute Engine.", (Throwable) e10);
            }
        }
        return false;
    }
}
