package org.slf4j.helpers;

import java.io.PrintStream;

/* JADX INFO: loaded from: classes14.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final String f339649a = "SLF4J(D): ";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final String f339650b = "SLF4J(I): ";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String f339651c = "SLF4J(W): ";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final String f339652d = "SLF4J(E): ";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f339653e = "slf4j.internal.report.stream";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f339655g = "slf4j.internal.verbosity";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String[] f339654f = {"System.out", "stdout", "sysout"};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final b f339656h = e();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final a f339657i = g();

    private enum a {
        DEBUG(0),
        INFO(1),
        WARN(2),
        ERROR(3);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f339663a;

        a(int i10) {
            this.f339663a = i10;
        }

        private int l() {
            return this.f339663a;
        }
    }

    private enum b {
        Stderr,
        Stdout
    }

    public static void a(String str) {
        if (h(a.DEBUG)) {
            d().println(f339649a + str);
        }
    }

    public static final void b(String str) {
        d().println(f339652d + str);
    }

    public static final void c(String str, Throwable th2) {
        d().println(f339652d + str);
        d().println("SLF4J(E): Reported exception:");
        th2.printStackTrace(d());
    }

    private static PrintStream d() {
        return f339656h.ordinal() != 1 ? System.err : System.out;
    }

    private static b e() {
        String property = System.getProperty(f339653e);
        if (property == null || property.isEmpty()) {
            return b.Stderr;
        }
        for (String str : f339654f) {
            if (str.equalsIgnoreCase(property)) {
                return b.Stdout;
            }
        }
        return b.Stderr;
    }

    public static void f(String str) {
        if (h(a.INFO)) {
            d().println(f339650b + str);
        }
    }

    private static a g() {
        String property = System.getProperty(f339655g);
        if (property == null || property.isEmpty()) {
            return a.INFO;
        }
        if (property.equalsIgnoreCase("DEBUG")) {
            return a.DEBUG;
        }
        if (property.equalsIgnoreCase("ERROR")) {
            return a.ERROR;
        }
        return property.equalsIgnoreCase("WARN") ? a.WARN : a.INFO;
    }

    static boolean h(a aVar) {
        return aVar.f339663a >= f339657i.f339663a;
    }

    public static final void i(String str) {
        if (h(a.WARN)) {
            d().println(f339651c + str);
        }
    }
}
