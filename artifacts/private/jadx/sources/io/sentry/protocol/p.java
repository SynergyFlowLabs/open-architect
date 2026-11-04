package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.k2;
import io.sentry.m2;
import io.sentry.w7;
import io.sentry.y3;
import io.sentry.y7;
import io.sentry.z3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class p implements m2, k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private String f306426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private String f306427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Set<w> f306428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private Set<String> f306429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f306430e;

    public static final class a implements a2<p> {
        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public p a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            y3Var.m1();
            String strJc = null;
            String strJc2 = null;
            HashMap map = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                switch (strNa) {
                    case "name":
                        strJc = y3Var.jc();
                        break;
                    case "version":
                        strJc2 = y3Var.jc();
                        break;
                    case "packages":
                        List listP8 = y3Var.p8(iLogger, new w.a());
                        if (listP8 == null) {
                            break;
                        } else {
                            arrayList.addAll(listP8);
                            break;
                        }
                        break;
                    case "integrations":
                        List list = (List) y3Var.re();
                        if (list == null) {
                            break;
                        } else {
                            arrayList2.addAll(list);
                            break;
                        }
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        y3Var.gd(iLogger, map, strNa);
                        break;
                }
            }
            y3Var.F1();
            if (strJc == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"name\"");
                iLogger.a(y7.ERROR, "Missing required field \"name\"", illegalStateException);
                throw illegalStateException;
            }
            if (strJc2 == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"version\"");
                iLogger.a(y7.ERROR, "Missing required field \"version\"", illegalStateException2);
                throw illegalStateException2;
            }
            p pVar = new p(strJc, strJc2);
            pVar.f306428c = new CopyOnWriteArraySet(arrayList);
            pVar.f306429d = new CopyOnWriteArraySet(arrayList2);
            pVar.setUnknown(map);
            return pVar;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f306431a = "name";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f306432b = "version";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f306433c = "packages";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f306434d = "integrations";
    }

    public p(@NotNull String str, @NotNull String str2) {
        this.f306426a = (String) io.sentry.util.y.c(str, "name is required.");
        this.f306427b = (String) io.sentry.util.y.c(str2, "version is required.");
    }

    @NotNull
    public static p k(@Nullable p pVar, @NotNull String str, @NotNull String str2) {
        io.sentry.util.y.c(str, "name is required.");
        io.sentry.util.y.c(str2, "version is required.");
        if (pVar == null) {
            return new p(str, str2);
        }
        pVar.i(str);
        pVar.j(str2);
        return pVar;
    }

    public void c(@NotNull String str) {
        w7.e().a(str);
    }

    public void d(@NotNull String str, @NotNull String str2) {
        w7.e().b(str, str2);
    }

    @NotNull
    public Set<String> e() {
        Set<String> set = this.f306429d;
        return set != null ? set : w7.e().f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p.class == obj.getClass()) {
            p pVar = (p) obj;
            if (this.f306426a.equals(pVar.f306426a) && this.f306427b.equals(pVar.f306427b)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public String f() {
        return this.f306426a;
    }

    @NotNull
    public Set<w> g() {
        Set<w> set = this.f306428c;
        return set != null ? set : w7.e().g();
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.f306430e;
    }

    @NotNull
    public String h() {
        return this.f306427b;
    }

    public int hashCode() {
        return io.sentry.util.y.b(this.f306426a, this.f306427b);
    }

    public void i(@NotNull String str) {
        this.f306426a = (String) io.sentry.util.y.c(str, "name is required.");
    }

    public void j(@NotNull String str) {
        this.f306427b = (String) io.sentry.util.y.c(str, "version is required.");
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        z3Var.f("name").b(this.f306426a);
        z3Var.f("version").b(this.f306427b);
        Set<w> setG = g();
        Set<String> setE = e();
        if (!setG.isEmpty()) {
            z3Var.f(b.f306433c).j(iLogger, setG);
        }
        if (!setE.isEmpty()) {
            z3Var.f(b.f306434d).j(iLogger, setE);
        }
        Map<String, Object> map = this.f306430e;
        if (map != null) {
            for (String str : map.keySet()) {
                z3Var.f(str).j(iLogger, this.f306430e.get(str));
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.f306430e = map;
    }
}
