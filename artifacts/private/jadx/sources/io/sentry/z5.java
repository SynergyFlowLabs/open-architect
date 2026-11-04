package io.sentry;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public abstract class z5 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f307154s = "java";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private io.sentry.protocol.v f307155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final io.sentry.protocol.c f307156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private io.sentry.protocol.p f307157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private io.sentry.protocol.m f307158d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private Map<String, String> f307159e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private String f307160f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private String f307161g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private String f307162h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private io.sentry.protocol.g0 f307163i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    protected transient Throwable f307164j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private String f307165k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private String f307166l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private List<f> f307167m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private io.sentry.protocol.d f307168n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f307169o;

    public static final class a {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean a(@NotNull z5 z5Var, @NotNull String str, @NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            str.getClass();
            byte b10 = -1;
            switch (str.hashCode()) {
                case -1840434063:
                    if (str.equals("debug_meta")) {
                        b10 = 0;
                    }
                    break;
                case -758770169:
                    if (str.equals(b.f307179j)) {
                        b10 = 1;
                    }
                    break;
                case -567312220:
                    if (str.equals("contexts")) {
                        b10 = 2;
                    }
                    break;
                case -85904877:
                    if (str.equals("environment")) {
                        b10 = 3;
                    }
                    break;
                case -51457840:
                    if (str.equals(b.f307181l)) {
                        b10 = 4;
                    }
                    break;
                case 113722:
                    if (str.equals("sdk")) {
                        b10 = 5;
                    }
                    break;
                case 3083686:
                    if (str.equals(b.f307180k)) {
                        b10 = 6;
                    }
                    break;
                case 3552281:
                    if (str.equals("tags")) {
                        b10 = 7;
                    }
                    break;
                case 3599307:
                    if (str.equals("user")) {
                        b10 = 8;
                    }
                    break;
                case 96965648:
                    if (str.equals(b.f307183n)) {
                        b10 = 9;
                    }
                    break;
                case 278118624:
                    if (str.equals("event_id")) {
                        b10 = 10;
                    }
                    break;
                case 1090594823:
                    if (str.equals("release")) {
                        b10 = 11;
                    }
                    break;
                case 1095692943:
                    if (str.equals("request")) {
                        b10 = com.google.common.base.c.f116461n;
                    }
                    break;
                case 1874684019:
                    if (str.equals("platform")) {
                        b10 = com.google.common.base.c.f116462o;
                    }
                    break;
            }
            switch (b10) {
                case 0:
                    z5Var.f307168n = (io.sentry.protocol.d) y3Var.i4(iLogger, new io.sentry.protocol.d.a());
                    return true;
                case 1:
                    z5Var.f307165k = y3Var.n6();
                    return true;
                case 2:
                    z5Var.f307156b.s(new io.sentry.protocol.c.a().a(y3Var, iLogger));
                    return true;
                case 3:
                    z5Var.f307161g = y3Var.n6();
                    return true;
                case 4:
                    z5Var.f307167m = y3Var.p8(iLogger, new f.a());
                    return true;
                case 5:
                    z5Var.f307157c = (io.sentry.protocol.p) y3Var.i4(iLogger, new io.sentry.protocol.p.a());
                    return true;
                case 6:
                    z5Var.f307166l = y3Var.n6();
                    return true;
                case 7:
                    z5Var.f307159e = io.sentry.util.d.f((Map) y3Var.re());
                    return true;
                case 8:
                    z5Var.f307163i = (io.sentry.protocol.g0) y3Var.i4(iLogger, new io.sentry.protocol.g0.a());
                    return true;
                case 9:
                    z5Var.f307169o = io.sentry.util.d.f((Map) y3Var.re());
                    return true;
                case 10:
                    z5Var.f307155a = (io.sentry.protocol.v) y3Var.i4(iLogger, new io.sentry.protocol.v.a());
                    return true;
                case 11:
                    z5Var.f307160f = y3Var.n6();
                    return true;
                case 12:
                    z5Var.f307158d = (io.sentry.protocol.m) y3Var.i4(iLogger, new io.sentry.protocol.m.a());
                    return true;
                case 13:
                    z5Var.f307162h = y3Var.n6();
                    return true;
                default:
                    return false;
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f307170a = "event_id";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f307171b = "contexts";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f307172c = "sdk";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f307173d = "request";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f307174e = "tags";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f307175f = "release";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f307176g = "environment";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f307177h = "platform";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f307178i = "user";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final String f307179j = "server_name";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final String f307180k = "dist";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f307181l = "breadcrumbs";

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final String f307182m = "debug_meta";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String f307183n = "extra";
    }

    public static final class c {
        public void a(@NotNull z5 z5Var, @NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
            if (z5Var.f307155a != null) {
                z3Var.f("event_id").j(iLogger, z5Var.f307155a);
            }
            z3Var.f("contexts").j(iLogger, z5Var.f307156b);
            if (z5Var.f307157c != null) {
                z3Var.f("sdk").j(iLogger, z5Var.f307157c);
            }
            if (z5Var.f307158d != null) {
                z3Var.f("request").j(iLogger, z5Var.f307158d);
            }
            if (z5Var.f307159e != null && !z5Var.f307159e.isEmpty()) {
                z3Var.f("tags").j(iLogger, z5Var.f307159e);
            }
            if (z5Var.f307160f != null) {
                z3Var.f("release").b(z5Var.f307160f);
            }
            if (z5Var.f307161g != null) {
                z3Var.f("environment").b(z5Var.f307161g);
            }
            if (z5Var.f307162h != null) {
                z3Var.f("platform").b(z5Var.f307162h);
            }
            if (z5Var.f307163i != null) {
                z3Var.f("user").j(iLogger, z5Var.f307163i);
            }
            if (z5Var.f307165k != null) {
                z3Var.f(b.f307179j).b(z5Var.f307165k);
            }
            if (z5Var.f307166l != null) {
                z3Var.f(b.f307180k).b(z5Var.f307166l);
            }
            if (z5Var.f307167m != null && !z5Var.f307167m.isEmpty()) {
                z3Var.f(b.f307181l).j(iLogger, z5Var.f307167m);
            }
            if (z5Var.f307168n != null) {
                z3Var.f("debug_meta").j(iLogger, z5Var.f307168n);
            }
            if (z5Var.f307169o != null && !z5Var.f307169o.isEmpty()) {
                z3Var.f(b.f307183n).j(iLogger, z5Var.f307169o);
            }
        }
    }

    protected z5(@NotNull io.sentry.protocol.v vVar) {
        this.f307156b = new io.sentry.protocol.c();
        this.f307155a = vVar;
    }

    public void B(@NotNull f fVar) {
        if (this.f307167m == null) {
            this.f307167m = new ArrayList();
        }
        this.f307167m.add(fVar);
    }

    public void C(@Nullable String str) {
        B(new f(str));
    }

    @Nullable
    public List<f> D() {
        return this.f307167m;
    }

    @NotNull
    public io.sentry.protocol.c E() {
        return this.f307156b;
    }

    @Nullable
    public io.sentry.protocol.d F() {
        return this.f307168n;
    }

    @Nullable
    public String G() {
        return this.f307166l;
    }

    @Nullable
    public String H() {
        return this.f307161g;
    }

    @Nullable
    public io.sentry.protocol.v I() {
        return this.f307155a;
    }

    @Nullable
    public Object J(@Nullable String str) {
        Map<String, Object> map = this.f307169o;
        if (map == null || str == null) {
            return null;
        }
        return map.get(str);
    }

    @Nullable
    public Map<String, Object> K() {
        return this.f307169o;
    }

    @Nullable
    public String L() {
        return this.f307162h;
    }

    @Nullable
    public String M() {
        return this.f307160f;
    }

    @Nullable
    public io.sentry.protocol.m N() {
        return this.f307158d;
    }

    @Nullable
    public io.sentry.protocol.p O() {
        return this.f307157c;
    }

    @Nullable
    public String P() {
        return this.f307165k;
    }

    @Nullable
    public String Q(@Nullable String str) {
        Map<String, String> map = this.f307159e;
        if (map == null || str == null) {
            return null;
        }
        return map.get(str);
    }

    @lm.a.c
    @Nullable
    public Map<String, String> R() {
        return this.f307159e;
    }

    @Nullable
    public Throwable S() {
        Throwable thC = this.f307164j;
        if (thC instanceof io.sentry.exception.a) {
            thC = ((io.sentry.exception.a) thC).c();
        }
        return thC;
    }

    @lm.a.c
    @Nullable
    public Throwable T() {
        return this.f307164j;
    }

    @Nullable
    public io.sentry.protocol.g0 U() {
        return this.f307163i;
    }

    public void V(@Nullable String str) {
        Map<String, Object> map = this.f307169o;
        if (map == null || str == null) {
            return;
        }
        map.remove(str);
    }

    public void W(@Nullable String str) {
        Map<String, String> map = this.f307159e;
        if (map != null && str != null) {
            map.remove(str);
        }
    }

    public void X(@Nullable List<f> list) {
        this.f307167m = io.sentry.util.d.e(list);
    }

    public void Y(@Nullable io.sentry.protocol.d dVar) {
        this.f307168n = dVar;
    }

    public void Z(@Nullable String str) {
        this.f307166l = str;
    }

    public void a0(@Nullable String str) {
        this.f307161g = str;
    }

    public void b0(@Nullable io.sentry.protocol.v vVar) {
        this.f307155a = vVar;
    }

    public void c0(@Nullable String str, @Nullable Object obj) {
        if (this.f307169o == null) {
            this.f307169o = new HashMap();
        }
        if (str == null) {
            return;
        }
        if (obj == null) {
            V(str);
        } else {
            this.f307169o.put(str, obj);
        }
    }

    public void d0(@Nullable Map<String, Object> map) {
        this.f307169o = io.sentry.util.d.g(map);
    }

    public void e0(@Nullable String str) {
        this.f307162h = str;
    }

    public void f0(@Nullable String str) {
        this.f307160f = str;
    }

    public void g0(@Nullable io.sentry.protocol.m mVar) {
        this.f307158d = mVar;
    }

    public void h0(@Nullable io.sentry.protocol.p pVar) {
        this.f307157c = pVar;
    }

    public void i0(@Nullable String str) {
        this.f307165k = str;
    }

    public void j0(@Nullable String str, @Nullable String str2) {
        if (this.f307159e == null) {
            this.f307159e = new HashMap();
        }
        if (str == null) {
            return;
        }
        if (str2 == null) {
            W(str);
        } else {
            this.f307159e.put(str, str2);
        }
    }

    public void k0(@Nullable Map<String, String> map) {
        this.f307159e = io.sentry.util.d.g(map);
    }

    public void l0(@Nullable Throwable th2) {
        this.f307164j = th2;
    }

    public void m0(@Nullable io.sentry.protocol.g0 g0Var) {
        this.f307163i = g0Var;
    }

    protected z5() {
        this(new io.sentry.protocol.v());
    }
}
