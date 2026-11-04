package org.slf4j.simple;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.slf4j.h;
import org.slf4j.helpers.g;
import org.slf4j.helpers.i;
import org.slf4j.helpers.o;

/* JADX INFO: loaded from: classes14.dex */
public class b extends g {
    public static final String H1 = "org.slf4j.simpleLogger.showLogName";
    public static final String X = "org.slf4j.simpleLogger.cacheOutputStream";
    public static final String Y = "org.slf4j.simpleLogger.warnLevelString";
    public static final String Z = "org.slf4j.simpleLogger.levelInBrackets";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f339693f = -632788891211436180L;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public static final String f339695g3 = "org.slf4j.simpleLogger.showThreadId";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected static final int f339696h = 0;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    public static final String f339697h3 = "org.slf4j.simpleLogger.dateTimeFormat";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected static final int f339698i = 10;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    public static final String f339699i3 = "org.slf4j.simpleLogger.showDateTime";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected static final int f339700j = 20;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    public static final String f339701j3 = "org.slf4j.simpleLogger.defaultLogLevel";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected static final int f339702k = 30;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected static final int f339703l = 40;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final String f339705n = "tid=";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected static final int f339706o = 50;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final String f339707p0 = "org.slf4j.simpleLogger.logFile";

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final String f339708p1 = "org.slf4j.simpleLogger.showShortLogName";

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public static final String f339709p2 = "org.slf4j.simpleLogger.showThreadName";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f339712v = "org.slf4j.simpleLogger.";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f339713w = "org.slf4j.simpleLogger.log.";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f339714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient String f339715e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f339694g = System.currentTimeMillis();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static char f339704m = ' ';

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static boolean f339710s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final d f339711t = new d();

    b(String str) {
        this.f339714d = 20;
        this.f339617a = str;
        String strE0 = E0();
        if (strE0 != null) {
            this.f339714d = d.h(strE0);
        } else {
            this.f339714d = f339711t.f339729a;
        }
    }

    private void A0(org.slf4j.event.e eVar, List<h> list, String str, Object[] objArr, Throwable th2) {
        StringBuilder sb2 = new StringBuilder(32);
        d dVar = f339711t;
        if (dVar.f339730b) {
            if (dVar.f339731c != null) {
                sb2.append(y0());
                sb2.append(f339704m);
            } else {
                sb2.append(System.currentTimeMillis() - f339694g);
                sb2.append(f339704m);
            }
        }
        if (dVar.f339732d) {
            sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
            sb2.append(Thread.currentThread().getName());
            sb2.append("] ");
        }
        if (dVar.f339733e) {
            sb2.append(f339705n);
            sb2.append(Thread.currentThread().getId());
            sb2.append(f339704m);
        }
        if (dVar.f339736h) {
            sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
        }
        sb2.append(eVar.name());
        if (dVar.f339736h) {
            sb2.append(AbstractJsonLexerKt.END_LIST);
        }
        sb2.append(f339704m);
        if (dVar.f339735g) {
            if (this.f339715e == null) {
                this.f339715e = x0();
            }
            sb2.append(String.valueOf(this.f339715e));
            sb2.append(" - ");
        } else if (dVar.f339734f) {
            sb2.append(String.valueOf(this.f339617a));
            sb2.append(" - ");
        }
        if (list != null) {
            sb2.append(f339704m);
            Iterator<h> it = list.iterator();
            while (it.hasNext()) {
                sb2.append(it.next().getName());
                sb2.append(f339704m);
            }
        }
        sb2.append(i.c(str, objArr));
        F0(sb2, th2);
    }

    static void C0() {
        if (f339710s) {
            return;
        }
        f339710s = true;
        z0();
    }

    private String x0() {
        String str = this.f339617a;
        return str.substring(str.lastIndexOf(".") + 1);
    }

    private String y0() {
        String str;
        Date date = new Date();
        d dVar = f339711t;
        synchronized (dVar.f339731c) {
            try {
                str = dVar.f339731c.format(date);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    static void z0() {
        f339711t.f();
    }

    protected boolean B0(int i10) {
        return i10 >= this.f339714d;
    }

    public void D0(org.slf4j.event.f fVar) {
        if (B0(fVar.g().n())) {
            o oVarF = o.f(fVar);
            A0(fVar.g(), fVar.e(), oVarF.b(), oVarF.a(), fVar.b());
        }
    }

    String E0() {
        String strSubstring = this.f339617a;
        int length = strSubstring.length();
        String strE = null;
        while (strE == null && length > -1) {
            strSubstring = strSubstring.substring(0, length);
            strE = f339711t.e(f339713w + strSubstring, null);
            length = String.valueOf(strSubstring).lastIndexOf(".");
        }
        return strE;
    }

    void F0(StringBuilder sb2, Throwable th2) {
        d dVar = f339711t;
        PrintStream printStreamA = dVar.f339738j.a();
        synchronized (dVar) {
            printStreamA.println(sb2.toString());
            G0(th2, printStreamA);
            printStreamA.flush();
        }
    }

    protected void G0(Throwable th2, PrintStream printStream) {
        if (th2 != null) {
            th2.printStackTrace(printStream);
        }
    }

    @Override // org.slf4j.c
    public boolean M() {
        return B0(30);
    }

    @Override // org.slf4j.c
    public boolean O() {
        return B0(10);
    }

    @Override // org.slf4j.c
    public boolean R() {
        return B0(0);
    }

    @Override // org.slf4j.c
    public boolean l() {
        return B0(20);
    }

    @Override // org.slf4j.helpers.a
    protected String r0() {
        return null;
    }

    @Override // org.slf4j.helpers.a
    protected void u0(org.slf4j.event.e eVar, h hVar, String str, Object[] objArr, Throwable th2) {
        ArrayList arrayList;
        if (hVar != null) {
            arrayList = new ArrayList();
            arrayList.add(hVar);
        } else {
            arrayList = null;
        }
        A0(eVar, arrayList, str, objArr, th2);
    }

    @Override // org.slf4j.c
    public boolean z() {
        return B0(40);
    }
}
