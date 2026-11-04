package org.apache.commons.lang3;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, rk.a> f336881a = new HashMap();

    static {
        e();
    }

    private static void a(String str, rk.a aVar) throws IllegalStateException {
        Map<String, rk.a> map = f336881a;
        if (!map.containsKey(str)) {
            map.put(str, aVar);
            return;
        }
        throw new IllegalStateException("Key " + str + " already exists in processor map");
    }

    private static void b(rk.a aVar, String... strArr) throws IllegalStateException {
        for (String str : strArr) {
            a(str, aVar);
        }
    }

    public static rk.a c() {
        return d(a0.M);
    }

    public static rk.a d(String str) {
        return f336881a.get(str);
    }

    private static void e() {
        j();
        k();
        f();
        g();
        h();
        i();
    }

    private static void f() {
        b(new rk.a(rk.a.EnumC2474a.BIT_32, rk.a.b.IA_64), "ia64_32", "ia64n");
    }

    private static void g() {
        b(new rk.a(rk.a.EnumC2474a.BIT_64, rk.a.b.IA_64), "ia64", "ia64w");
    }

    private static void h() {
        b(new rk.a(rk.a.EnumC2474a.BIT_32, rk.a.b.PPC), "ppc", "power", "powerpc", "power_pc", "power_rs");
    }

    private static void i() {
        b(new rk.a(rk.a.EnumC2474a.BIT_64, rk.a.b.PPC), "ppc64", "power64", "powerpc64", "power_pc64", "power_rs64");
    }

    private static void j() {
        b(new rk.a(rk.a.EnumC2474a.BIT_32, rk.a.b.X86), "x86", "i386", "i486", "i586", "i686", "pentium");
    }

    private static void k() {
        b(new rk.a(rk.a.EnumC2474a.BIT_64, rk.a.b.X86), "x86_64", "amd64", "em64t", "universal");
    }
}
