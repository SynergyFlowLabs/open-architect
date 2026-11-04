package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.h4;
import io.sentry.k2;
import io.sentry.m1;
import io.sentry.p9;
import io.sentry.y3;
import io.sentry.z3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public class c implements k2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f306156c = 252445813254943011L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f306157d = "replay_id";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ConcurrentHashMap<String, Object> f306158a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    protected final io.sentry.util.a f306159b = new io.sentry.util.a();

    public static final class a implements a2<c> {
        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            c cVar = new c();
            y3Var.m1();
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                switch (strNa) {
                    case "device":
                        cVar.y(new e.a().a(y3Var, iLogger));
                        break;
                    case "spring":
                        cVar.F(new d0.a().a(y3Var, iLogger));
                        break;
                    case "response":
                        cVar.D(new n.a().a(y3Var, iLogger));
                        break;
                    case "profile":
                        cVar.C(new h4.a().a(y3Var, iLogger));
                        break;
                    case "feedback":
                        cVar.z(new f.a().a(y3Var, iLogger));
                        break;
                    case "os":
                        cVar.B(new l.a().a(y3Var, iLogger));
                        break;
                    case "app":
                        cVar.w(new io.sentry.protocol.a.C2227a().a(y3Var, iLogger));
                        break;
                    case "gpu":
                        cVar.A(new h.a().a(y3Var, iLogger));
                        break;
                    case "trace":
                        cVar.G(new p9.a().a(y3Var, iLogger));
                        break;
                    case "browser":
                        cVar.x(new b.a().a(y3Var, iLogger));
                        break;
                    case "runtime":
                        cVar.E(new x.a().a(y3Var, iLogger));
                        break;
                    default:
                        Object objRe = y3Var.re();
                        if (objRe == null) {
                            break;
                        } else {
                            cVar.r(strNa, objRe);
                            break;
                        }
                        break;
                }
            }
            y3Var.F1();
            return cVar;
        }
    }

    public c() {
    }

    @Nullable
    private <T> T I(@NotNull String str, @NotNull Class<T> cls) {
        Object objC = c(str);
        if (cls.isInstance(objC)) {
            return cls.cast(objC);
        }
        return null;
    }

    public void A(@NotNull h hVar) {
        r(h.f306278k, hVar);
    }

    public void B(@NotNull l lVar) {
        r("os", lVar);
    }

    public void C(@Nullable h4 h4Var) {
        io.sentry.util.y.c(h4Var, "profileContext is required");
        r("profile", h4Var);
    }

    public void D(@NotNull n nVar) {
        m1 m1VarA = this.f306159b.a();
        try {
            r(n.f306405g, nVar);
            if (m1VarA != null) {
                m1VarA.close();
            }
        } catch (Throwable th2) {
            if (m1VarA != null) {
                try {
                    m1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public void E(@NotNull x xVar) {
        r(x.f306481e, xVar);
    }

    public void F(@NotNull d0 d0Var) {
        r(d0.f306177c, d0Var);
    }

    public void G(@NotNull p9 p9Var) {
        io.sentry.util.y.c(p9Var, "traceContext is required");
        r("trace", p9Var);
    }

    public int H() {
        return this.f306158a.size();
    }

    public void J(io.sentry.util.n.a<n> aVar) {
        m1 m1VarA = this.f306159b.a();
        try {
            n nVarK = k();
            if (nVarK != null) {
                aVar.accept(nVarK);
            } else {
                n nVar = new n();
                D(nVar);
                aVar.accept(nVar);
            }
            if (m1VarA != null) {
                m1VarA.close();
            }
        } catch (Throwable th2) {
            if (m1VarA != null) {
                try {
                    m1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public boolean a(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        return this.f306158a.containsKey(obj);
    }

    @NotNull
    public Set<Map.Entry<String, Object>> b() {
        return this.f306158a.entrySet();
    }

    @Nullable
    public Object c(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        return this.f306158a.get(obj);
    }

    @Nullable
    public io.sentry.protocol.a d() {
        return (io.sentry.protocol.a) I("app", io.sentry.protocol.a.class);
    }

    @Nullable
    public b e() {
        return (b) I(b.f306129d, b.class);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        return this.f306158a.equals(((c) obj).f306158a);
    }

    @Nullable
    public e f() {
        return (e) I("device", e.class);
    }

    @Nullable
    public f g() {
        return (f) I(f.f306242h, f.class);
    }

    @Nullable
    public h h() {
        return (h) I(h.f306278k, h.class);
    }

    public int hashCode() {
        return this.f306158a.hashCode();
    }

    @Nullable
    public l i() {
        return (l) I("os", l.class);
    }

    @Nullable
    public h4 j() {
        return (h4) I("profile", h4.class);
    }

    @Nullable
    public n k() {
        return (n) I(n.f306405g, n.class);
    }

    @Nullable
    public x l() {
        return (x) I(x.f306481e, x.class);
    }

    public int m() {
        return H();
    }

    @Nullable
    public d0 n() {
        return (d0) I(d0.f306177c, d0.class);
    }

    @Nullable
    public p9 o() {
        return (p9) I("trace", p9.class);
    }

    public boolean p() {
        return this.f306158a.isEmpty();
    }

    @NotNull
    public Enumeration<String> q() {
        return this.f306158a.keys();
    }

    @Nullable
    public Object r(@Nullable String str, @Nullable Object obj) {
        if (str == null) {
            return null;
        }
        return obj == null ? this.f306158a.remove(str) : this.f306158a.put(str, obj);
    }

    public void s(@Nullable c cVar) {
        if (cVar == null) {
            return;
        }
        this.f306158a.putAll(cVar.f306158a);
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        ArrayList<String> list = Collections.list(q());
        Collections.sort(list);
        for (String str : list) {
            Object objC = c(str);
            if (objC != null) {
                z3Var.f(str).j(iLogger, objC);
            }
        }
        z3Var.F1();
    }

    public void t(@Nullable Map<? extends String, ? extends Object> map) {
        if (map == null) {
            return;
        }
        HashMap map2 = new HashMap();
        for (Map.Entry<? extends String, ? extends Object> entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                map2.put(entry.getKey(), entry.getValue());
            }
        }
        this.f306158a.putAll(map2);
    }

    @Nullable
    public Object u(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        return this.f306158a.remove(obj);
    }

    @Nullable
    public Object v(@Nullable String str, @Nullable Object obj) {
        return r(str, obj);
    }

    public void w(@NotNull io.sentry.protocol.a aVar) {
        r("app", aVar);
    }

    public void x(@NotNull b bVar) {
        r(b.f306129d, bVar);
    }

    public void y(@NotNull e eVar) {
        r("device", eVar);
    }

    public void z(@NotNull f fVar) {
        r(f.f306242h, fVar);
    }

    public c(@NotNull c cVar) {
        for (Map.Entry<String, Object> entry : cVar.b()) {
            if (entry != null) {
                Object value = entry.getValue();
                if ("app".equals(entry.getKey()) && (value instanceof io.sentry.protocol.a)) {
                    w(new io.sentry.protocol.a((io.sentry.protocol.a) value));
                } else if (b.f306129d.equals(entry.getKey()) && (value instanceof b)) {
                    x(new b((b) value));
                } else if ("device".equals(entry.getKey()) && (value instanceof e)) {
                    y(new e((e) value));
                } else if ("os".equals(entry.getKey()) && (value instanceof l)) {
                    B(new l((l) value));
                } else if (x.f306481e.equals(entry.getKey()) && (value instanceof x)) {
                    E(new x((x) value));
                } else if (f.f306242h.equals(entry.getKey()) && (value instanceof f)) {
                    z(new f((f) value));
                } else if (h.f306278k.equals(entry.getKey()) && (value instanceof h)) {
                    A(new h((h) value));
                } else if ("trace".equals(entry.getKey()) && (value instanceof p9)) {
                    G(new p9((p9) value));
                } else if ("profile".equals(entry.getKey()) && (value instanceof h4)) {
                    C(new h4((h4) value));
                } else if (n.f306405g.equals(entry.getKey()) && (value instanceof n)) {
                    D(new n((n) value));
                } else if (d0.f306177c.equals(entry.getKey()) && (value instanceof d0)) {
                    F(new d0((d0) value));
                } else {
                    r(entry.getKey(), value);
                }
            }
        }
    }
}
