package org.slf4j;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.helpers.m;
import org.slf4j.helpers.p;
import org.slf4j.helpers.r;
import org.slf4j.helpers.t;
import org.slf4j.helpers.v;
import org.slf4j.spi.j;

/* JADX INFO: loaded from: classes14.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final String f339543a = "https://www.slf4j.org/codes.html";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final String f339544b = "https://www.slf4j.org/codes.html#noProviders";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String f339545c = "https://www.slf4j.org/codes.html#ignoredBindings";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final String f339546d = "https://www.slf4j.org/codes.html#multiple_bindings";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final String f339547e = "https://www.slf4j.org/codes.html#version_mismatch";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final String f339548f = "https://www.slf4j.org/codes.html#substituteLogger";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final String f339549g = "https://www.slf4j.org/codes.html#loggerNameMismatch";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final String f339550h = "https://www.slf4j.org/codes.html#replay";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final String f339551i = "https://www.slf4j.org/codes.html#unsuccessfulInit";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final String f339552j = "org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final String f339553k = "Connected with provider of type [";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f339554l = "slf4j.provider";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final int f339555m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final int f339556n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final int f339557o = 2;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final int f339558p = 3;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final int f339559q = 4;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static volatile int f339560r = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static final String f339564v = "java.vendor.url";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    static volatile j f339566x = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f339568z = "org/slf4j/impl/StaticLoggerBinder.class";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static final t f339561s = new t();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final m f339562t = new m();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    static final String f339563u = "slf4j.detectLoggerNameMismatch";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static boolean f339565w = v.f(f339563u);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String[] f339567y = {"2.0"};

    private e() {
    }

    private static final void A() {
        try {
            String strD = f339566x.d();
            boolean z10 = false;
            for (String str : f339567y) {
                if (strD.startsWith(str)) {
                    z10 = true;
                }
            }
            if (z10) {
                return;
            }
            p.i("The requested version " + strD + " by your slf4j provider is not compatible with " + Arrays.asList(f339567y).toString());
            p.i("See https://www.slf4j.org/codes.html#version_mismatch for further details.");
        } catch (Throwable th2) {
            p.c("Unexpected problem occurred during version sanity check", th2);
        }
    }

    private static final void b() {
        try {
            List<j> listH = h();
            x(listH);
            if (listH == null || listH.isEmpty()) {
                f339560r = 4;
                p.i("No SLF4J providers were found.");
                p.i("Defaulting to no-operation (NOP) logger implementation");
                p.i("See https://www.slf4j.org/codes.html#noProviders for further details.");
                w(g());
            } else {
                f339566x = listH.get(0);
                f339566x.initialize();
                int i10 = 4 | 3;
                f339560r = 3;
                v(listH);
            }
            s();
        } catch (Exception e10) {
            f(e10);
            throw new IllegalStateException("Unexpected initialization failure", e10);
        }
    }

    private static void c(org.slf4j.event.g gVar, int i10) {
        if (gVar.l().t0()) {
            d(i10);
        } else {
            if (gVar.l().u0()) {
                return;
            }
            e();
        }
    }

    private static void d(int i10) {
        p.i("A number (" + i10 + ") of logging calls during the initialization phase have been intercepted and are");
        p.i("now being replayed. These are subject to the filtering rules of the underlying logging system.");
        p.i("See also https://www.slf4j.org/codes.html#replay");
    }

    private static void e() {
        p.i("The following set of substitute loggers may have been accessed");
        p.i("during the initialization phase. Logging calls during this");
        p.i("phase were not honored. However, subsequent logging calls to these");
        p.i("loggers will work as normally expected.");
        p.i("See also https://www.slf4j.org/codes.html#substituteLogger");
    }

    static void f(Throwable th2) {
        f339560r = 2;
        p.c("Failed to instantiate SLF4J LoggerFactory", th2);
    }

    static Set<URL> g() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = e.class.getClassLoader();
            Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources(f339568z) : classLoader.getResources(f339568z);
            while (systemResources.hasMoreElements()) {
                linkedHashSet.add(systemResources.nextElement());
            }
            return linkedHashSet;
        } catch (IOException e10) {
            p.c("Error getting resources from path", e10);
            return linkedHashSet;
        }
    }

    static List<j> h() {
        ArrayList arrayList = new ArrayList();
        ClassLoader classLoader = e.class.getClassLoader();
        j jVarP = p(classLoader);
        if (jVarP != null) {
            arrayList.add(jVarP);
            return arrayList;
        }
        Iterator<j> it = n(classLoader).iterator();
        while (it.hasNext()) {
            z(arrayList, it);
        }
        return arrayList;
    }

    private static void i() {
        t tVar = f339561s;
        synchronized (tVar) {
            try {
                tVar.e().f();
                for (r rVar : tVar.e().e()) {
                    rVar.x0(l(rVar.getName()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static a j() {
        return m().a();
    }

    public static c k(Class<?> cls) {
        Class<?> clsA;
        c cVarL = l(cls.getName());
        if (f339565w && (clsA = v.a()) != null && q(cls, clsA)) {
            p.i(String.format("Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\".", cVarL.getName(), clsA.getName()));
            p.i("See https://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
        }
        return cVarL;
    }

    public static c l(String str) {
        return j().a(str);
    }

    static j m() {
        if (f339560r == 0) {
            synchronized (e.class) {
                try {
                    if (f339560r == 0) {
                        f339560r = 1;
                        r();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        int i10 = f339560r;
        if (i10 == 1) {
            return f339561s;
        }
        if (i10 == 2) {
            throw new IllegalStateException(f339552j);
        }
        int i11 = 1 & 3;
        if (i10 == 3) {
            return f339566x;
        }
        if (i10 == 4) {
            return f339562t;
        }
        throw new IllegalStateException("Unreachable code");
    }

    private static ServiceLoader<j> n(final ClassLoader classLoader) {
        return System.getSecurityManager() == null ? ServiceLoader.load(j.class, classLoader) : (ServiceLoader) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.slf4j.d
            @Override // java.security.PrivilegedAction
            public final Object run() {
                return ServiceLoader.load(j.class, classLoader);
            }
        });
    }

    private static boolean o(List<j> list) {
        return list.size() > 1;
    }

    static j p(ClassLoader classLoader) {
        String property = System.getProperty(f339554l);
        if (property != null && !property.isEmpty()) {
            try {
                p.f(String.format("Attempting to load provider \"%s\" specified via \"%s\" system property", property, f339554l));
                return (j) classLoader.loadClass(property).getConstructor(null).newInstance(null);
            } catch (ClassCastException e10) {
                p.c(String.format("Specified SLF4JServiceProvider (%s) does not implement SLF4JServiceProvider interface", property), e10);
                return null;
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e11) {
                p.c(String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", property), e11);
            }
        }
        return null;
    }

    private static boolean q(Class<?> cls, Class<?> cls2) {
        return !cls2.isAssignableFrom(cls);
    }

    private static final void r() {
        b();
        if (f339560r == 3) {
            A();
        }
    }

    private static void s() {
        i();
        t();
        f339561s.e().b();
    }

    private static void t() {
        LinkedBlockingQueue<org.slf4j.event.g> linkedBlockingQueueC = f339561s.e().c();
        int size = linkedBlockingQueueC.size();
        ArrayList<org.slf4j.event.g> arrayList = new ArrayList(128);
        int i10 = 0;
        while (linkedBlockingQueueC.drainTo(arrayList, 128) != 0) {
            for (org.slf4j.event.g gVar : arrayList) {
                u(gVar);
                int i11 = i10 + 1;
                if (i10 == 0) {
                    c(gVar, size);
                }
                i10 = i11;
            }
            arrayList.clear();
        }
    }

    private static void u(org.slf4j.event.g gVar) {
        if (gVar != null) {
            r rVarL = gVar.l();
            String name = rVarL.getName();
            if (rVarL.v0()) {
                throw new IllegalStateException("Delegate logger cannot be null at this state.");
            }
            if (!rVarL.u0()) {
                if (!rVarL.t0()) {
                    p.i(name);
                } else if (rVarL.T(gVar.g())) {
                    rVarL.w0(gVar);
                }
            }
        }
    }

    private static void v(List<j> list) {
        if (list.isEmpty()) {
            throw new IllegalStateException("No providers were found which is impossible after successful initialization.");
        }
        if (o(list)) {
            p.f("Actual provider is of type [" + list.get(0) + "]");
            return;
        }
        p.a(f339553k + list.get(0).getClass().getName() + "]");
    }

    private static void w(Set<URL> set) {
        if (set.isEmpty()) {
            return;
        }
        p.i("Class path contains SLF4J bindings targeting slf4j-api versions 1.7.x or earlier.");
        Iterator<URL> it = set.iterator();
        while (it.hasNext()) {
            p.i("Ignoring binding found at [" + it.next() + "]");
        }
        p.i("See https://www.slf4j.org/codes.html#ignoredBindings for an explanation.");
    }

    private static void x(List<j> list) {
        if (o(list)) {
            p.i("Class path contains multiple SLF4J providers.");
            Iterator<j> it = list.iterator();
            while (it.hasNext()) {
                p.i("Found provider [" + it.next() + "]");
            }
            p.i("See https://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    static void y() {
        f339560r = 0;
    }

    private static void z(List<j> list, Iterator<j> it) {
        try {
            list.add(it.next());
        } catch (ServiceConfigurationError e10) {
            p.b("A service provider failed to instantiate:\n" + e10.getMessage());
        }
    }
}
