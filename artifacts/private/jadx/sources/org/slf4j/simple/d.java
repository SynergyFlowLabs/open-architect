package org.slf4j.simple;

import com.facebook.internal.z0;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Properties;
import kotlinx.coroutines.w0;
import org.slf4j.helpers.v;

/* JADX INFO: loaded from: classes14.dex */
public class d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f339716n = "simplelogger.properties";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static int f339717o = 20;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final boolean f339718p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f339719q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static String f339720r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final boolean f339721s = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final boolean f339722t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    static final boolean f339723u = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final boolean f339724v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final boolean f339725w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f339726x = "System.err";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final boolean f339727y = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f339728z = "WARN";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f339729a = f339717o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f339730b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    DateFormat f339731c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f339732d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f339733e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f339734f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f339735g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f339736h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f339737i = f339726x;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    a f339738j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f339739k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    String f339740l = f339728z;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Properties f339741m = new Properties();

    public static /* synthetic */ InputStream a() {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        return contextClassLoader != null ? contextClassLoader.getResourceAsStream(f339716n) : ClassLoader.getSystemResourceAsStream(f339716n);
    }

    private static a b(String str, boolean z10) {
        if (f339726x.equalsIgnoreCase(str)) {
            return z10 ? new a(a.b.CACHED_SYS_ERR) : new a(a.b.SYS_ERR);
        }
        if ("System.out".equalsIgnoreCase(str)) {
            return z10 ? new a(a.b.CACHED_SYS_OUT) : new a(a.b.SYS_OUT);
        }
        try {
            return new a(new PrintStream(new FileOutputStream(str)));
        } catch (FileNotFoundException e10) {
            v.d("Could not open [" + str + "]. Defaulting to System.err", e10);
            return new a(a.b.SYS_ERR);
        }
    }

    private void g() {
        InputStream inputStream = (InputStream) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.slf4j.simple.c
            @Override // java.security.PrivilegedAction
            public final Object run() {
                return d.a();
            }
        });
        try {
            if (inputStream != null) {
                try {
                    this.f339741m.load(inputStream);
                    inputStream.close();
                } catch (IOException unused) {
                    inputStream.close();
                } catch (Throwable th2) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                    }
                    throw th2;
                }
            }
        } catch (IOException unused3) {
        }
    }

    static int h(String str) {
        if ("trace".equalsIgnoreCase(str)) {
            return 0;
        }
        if ("debug".equalsIgnoreCase(str)) {
            return 10;
        }
        if ("info".equalsIgnoreCase(str)) {
            return 20;
        }
        if ("warn".equalsIgnoreCase(str)) {
            return 30;
        }
        if ("error".equalsIgnoreCase(str)) {
            return 40;
        }
        return w0.f315667e.equalsIgnoreCase(str) ? 50 : 20;
    }

    boolean c(String str, boolean z10) {
        String strD = d(str);
        return strD == null ? z10 : z0.P.equalsIgnoreCase(strD);
    }

    String d(String str) {
        String property;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        return property == null ? this.f339741m.getProperty(str) : property;
    }

    String e(String str, String str2) {
        String strD = d(str);
        return strD == null ? str2 : strD;
    }

    void f() {
        g();
        String strE = e(b.f339701j3, null);
        if (strE != null) {
            this.f339729a = h(strE);
        }
        this.f339734f = c(b.H1, true);
        boolean z10 = false & false;
        this.f339735g = c(b.f339708p1, false);
        this.f339730b = c(b.f339699i3, false);
        this.f339732d = c(b.f339709p2, true);
        this.f339733e = c(b.f339695g3, false);
        f339720r = e(b.f339697h3, f339719q);
        this.f339736h = c(b.Z, false);
        this.f339740l = e(b.Y, f339728z);
        this.f339737i = e(b.f339707p0, this.f339737i);
        boolean zC = c(b.X, false);
        this.f339739k = zC;
        this.f339738j = b(this.f339737i, zC);
        if (f339720r != null) {
            try {
                this.f339731c = new SimpleDateFormat(f339720r);
            } catch (IllegalArgumentException e10) {
                v.d("Bad date format in simplelogger.properties; will output relative time", e10);
            }
        }
    }
}
