package org.locationtech.jts.util;

import java.io.PrintStream;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import org.locationtech.jts.geom.r;
import org.locationtech.jts.geom.v;

/* JADX INFO: loaded from: classes14.dex */
public class f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f339122e = "jts.debug";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f339123f = "on";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static String f339124g = "true";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f339125h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static l f339126i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static long f339127j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final f f339128k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final r f339129l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f339130m = "D! ";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Class[] f339132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f339133c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object[] f339134d = new Object[1];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private PrintStream f339131a = System.out;

    private static class a implements org.locationtech.jts.geom.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private org.locationtech.jts.geom.a f339135a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private org.locationtech.jts.geom.a f339136b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f339137c = false;

        public a(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2) {
            this.f339135a = aVar;
            this.f339136b = aVar2;
        }

        @Override // org.locationtech.jts.geom.h
        public void a(org.locationtech.jts.geom.e eVar, int i10) {
            if (i10 == 0) {
                return;
            }
            this.f339137c = this.f339135a.p(eVar.w4(i10 + (-1))) && this.f339136b.p(eVar.w4(i10));
        }

        @Override // org.locationtech.jts.geom.h
        public boolean b() {
            return false;
        }

        public boolean c() {
            return this.f339137c;
        }

        @Override // org.locationtech.jts.geom.h
        public boolean isDone() {
            return this.f339137c;
        }
    }

    static {
        String property = System.getProperty("jts.debug");
        if (property != null && (property.equalsIgnoreCase(f339123f) || property.equalsIgnoreCase(f339124g))) {
            f339125h = true;
        }
        f339126i = new l();
        f339128k = new f();
        f339129l = new r();
    }

    private f() {
        Class[] clsArr = new Class[1];
        this.f339132b = clsArr;
        try {
            clsArr[0] = Class.forName("java.io.PrintStream");
        } catch (Exception unused) {
        }
    }

    private static String A(int i10) {
        char[] cArr = new char[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            cArr[i11] = ' ';
        }
        return new String(cArr);
    }

    public static v B(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2) {
        return f339129l.h(new org.locationtech.jts.geom.a[]{aVar, aVar2});
    }

    public static v C(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3) {
        return f339129l.h(new org.locationtech.jts.geom.a[]{aVar, aVar2, aVar3});
    }

    public static v D(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3, org.locationtech.jts.geom.a aVar4) {
        return f339129l.h(new org.locationtech.jts.geom.a[]{aVar, aVar2, aVar3, aVar4});
    }

    public static void a(Object obj) {
        f339128k.i(obj);
    }

    public static void b(boolean z10) {
        if (z10) {
            e();
        }
    }

    public static void c(Object obj, Object obj2) {
        if (obj.equals(obj2)) {
            e();
        }
    }

    public static void d(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, double d10) {
        if (aVar.l(aVar2) <= d10) {
            e();
        }
    }

    private static void e() {
    }

    public static boolean f(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, double d10) {
        return aVar.l(aVar2) <= d10;
    }

    private static String g(String str, int i10) {
        int length = i10 - str.length();
        if (length <= 0) {
            return str;
        }
        String str2 = A(length) + str;
        return str2.substring(str2.length() - i10);
    }

    public static boolean h(org.locationtech.jts.geom.n nVar, org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2) {
        a aVar3 = new a(aVar, aVar2);
        nVar.c(aVar3);
        return aVar3.c();
    }

    private void i(Object obj) {
        this.f339133c = obj;
    }

    private void k(String str) {
        this.f339131a.print(f339130m);
        this.f339131a.print(str);
    }

    public static boolean p() {
        return f339125h;
    }

    public static void q(String[] strArr) {
        PrintStream printStream = System.out;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("JTS Debugging is ");
        sb2.append(f339125h ? "ON" : "OFF");
        printStream.println(sb2.toString());
    }

    public static void r(Object obj) {
        if (f339125h) {
            f339128k.j(obj);
        }
    }

    public static void s(String str) {
        if (f339125h) {
            f339128k.k(str);
        }
    }

    public static void t(boolean z10, Object obj) {
        if (f339125h && z10) {
            f339128k.j(obj);
        }
    }

    public static void u(Object obj) {
        f339128k.m(obj);
    }

    public static void v(String str) {
        if (f339125h) {
            long jA = f339126i.a();
            long j10 = jA - f339127j;
            f fVar = f339128k;
            fVar.k(g(l.c(jA), 10) + " (" + g(l.c(j10), 10) + " ) " + str);
            fVar.x();
            f339127j = jA;
        }
    }

    public static void w() {
        f339128k.o();
    }

    public static void y(Object obj) {
        if (f339125h) {
            f fVar = f339128k;
            fVar.j(obj);
            fVar.x();
        }
    }

    public static void z() {
        f339126i.d();
        f339127j = f339126i.a();
    }

    public void j(Object obj) {
        if (obj instanceof Collection) {
            l(((Collection) obj).iterator());
        } else if (obj instanceof Iterator) {
            l((Iterator) obj);
        } else {
            n(obj);
        }
    }

    public void l(Iterator it) {
        while (it.hasNext()) {
            n(it.next());
        }
    }

    public void m(Object obj) {
        Object obj2 = this.f339133c;
        if (obj == obj2 && obj2 != null) {
            j(obj2);
        }
    }

    public void n(Object obj) {
        try {
            try {
                Method method = obj.getClass().getMethod("print", this.f339132b);
                Object[] objArr = this.f339134d;
                PrintStream printStream = this.f339131a;
                objArr[0] = printStream;
                printStream.print(f339130m);
                method.invoke(obj, this.f339134d);
            } catch (NoSuchMethodException unused) {
                k(obj.toString());
            }
        } catch (Exception e10) {
            e10.printStackTrace(this.f339131a);
        }
    }

    public void o() {
        Object obj = this.f339133c;
        if (obj == null) {
            return;
        }
        j(obj);
    }

    public void x() {
        this.f339131a.println();
    }
}
