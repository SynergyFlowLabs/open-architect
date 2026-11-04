package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.k2;
import io.sentry.m2;
import io.sentry.y3;
import io.sentry.z3;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class m implements m2, k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private String f306382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private String f306383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private String f306384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private Object f306385d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private String f306386e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private Map<String, String> f306387f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private Map<String, String> f306388g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private Long f306389h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private Map<String, String> f306390i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private String f306391j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private String f306392k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f306393l;

    public static final class a implements a2<m> {
        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public m a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            y3Var.m1();
            m mVar = new m();
            ConcurrentHashMap concurrentHashMap = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                switch (strNa) {
                    case "fragment":
                        mVar.f306391j = y3Var.n6();
                        break;
                    case "method":
                        mVar.f306383b = y3Var.n6();
                        break;
                    case "env":
                        Map map = (Map) y3Var.re();
                        if (map == null) {
                            break;
                        } else {
                            mVar.f306388g = io.sentry.util.d.f(map);
                            break;
                        }
                        break;
                    case "url":
                        mVar.f306382a = y3Var.n6();
                        break;
                    case "data":
                        mVar.f306385d = y3Var.re();
                        break;
                    case "other":
                        Map map2 = (Map) y3Var.re();
                        if (map2 == null) {
                            break;
                        } else {
                            mVar.f306390i = io.sentry.util.d.f(map2);
                            break;
                        }
                        break;
                    case "headers":
                        Map map3 = (Map) y3Var.re();
                        if (map3 == null) {
                            break;
                        } else {
                            mVar.f306387f = io.sentry.util.d.f(map3);
                            break;
                        }
                        break;
                    case "cookies":
                        mVar.f306386e = y3Var.n6();
                        break;
                    case "body_size":
                        mVar.f306389h = y3Var.Gc();
                        break;
                    case "query_string":
                        mVar.f306384c = y3Var.n6();
                        break;
                    case "api_target":
                        mVar.f306392k = y3Var.n6();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        y3Var.gd(iLogger, concurrentHashMap, strNa);
                        break;
                }
            }
            mVar.setUnknown(concurrentHashMap);
            y3Var.F1();
            return mVar;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f306394a = "url";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f306395b = "method";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f306396c = "query_string";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f306397d = "data";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f306398e = "cookies";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f306399f = "headers";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f306400g = "env";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f306401h = "other";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f306402i = "fragment";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final String f306403j = "body_size";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final String f306404k = "api_target";
    }

    public m() {
    }

    public void A(@Nullable Map<String, String> map) {
        this.f306388g = io.sentry.util.d.f(map);
    }

    public void B(@Nullable String str) {
        this.f306391j = str;
    }

    public void C(@Nullable Map<String, String> map) {
        this.f306387f = io.sentry.util.d.f(map);
    }

    public void D(@Nullable String str) {
        this.f306383b = str;
    }

    public void E(@Nullable Map<String, String> map) {
        this.f306390i = io.sentry.util.d.f(map);
    }

    public void F(@Nullable String str) {
        this.f306384c = str;
    }

    public void G(@Nullable String str) {
        this.f306382a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (io.sentry.util.y.a(this.f306382a, mVar.f306382a) && io.sentry.util.y.a(this.f306383b, mVar.f306383b) && io.sentry.util.y.a(this.f306384c, mVar.f306384c) && io.sentry.util.y.a(this.f306386e, mVar.f306386e) && io.sentry.util.y.a(this.f306387f, mVar.f306387f) && io.sentry.util.y.a(this.f306388g, mVar.f306388g) && io.sentry.util.y.a(this.f306389h, mVar.f306389h) && io.sentry.util.y.a(this.f306391j, mVar.f306391j) && io.sentry.util.y.a(this.f306392k, mVar.f306392k)) {
                return true;
            }
        }
        return false;
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.f306393l;
    }

    public int hashCode() {
        return io.sentry.util.y.b(this.f306382a, this.f306383b, this.f306384c, this.f306386e, this.f306387f, this.f306388g, this.f306389h, this.f306391j, this.f306392k);
    }

    @Nullable
    public String l() {
        return this.f306392k;
    }

    @Nullable
    public Long m() {
        return this.f306389h;
    }

    @Nullable
    public String n() {
        return this.f306386e;
    }

    @Nullable
    public Object o() {
        return this.f306385d;
    }

    @Nullable
    public Map<String, String> p() {
        return this.f306388g;
    }

    @Nullable
    public String q() {
        return this.f306391j;
    }

    @Nullable
    public Map<String, String> r() {
        return this.f306387f;
    }

    @Nullable
    public String s() {
        return this.f306383b;
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        if (this.f306382a != null) {
            z3Var.f("url").b(this.f306382a);
        }
        if (this.f306383b != null) {
            z3Var.f("method").b(this.f306383b);
        }
        if (this.f306384c != null) {
            z3Var.f(b.f306396c).b(this.f306384c);
        }
        if (this.f306385d != null) {
            z3Var.f("data").j(iLogger, this.f306385d);
        }
        if (this.f306386e != null) {
            z3Var.f("cookies").b(this.f306386e);
        }
        if (this.f306387f != null) {
            z3Var.f("headers").j(iLogger, this.f306387f);
        }
        if (this.f306388g != null) {
            z3Var.f(b.f306400g).j(iLogger, this.f306388g);
        }
        if (this.f306390i != null) {
            z3Var.f("other").j(iLogger, this.f306390i);
        }
        if (this.f306391j != null) {
            z3Var.f("fragment").j(iLogger, this.f306391j);
        }
        if (this.f306389h != null) {
            z3Var.f("body_size").j(iLogger, this.f306389h);
        }
        if (this.f306392k != null) {
            z3Var.f(b.f306404k).j(iLogger, this.f306392k);
        }
        Map<String, Object> map = this.f306393l;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f306393l.get(str);
                z3Var.f(str);
                z3Var.j(iLogger, obj);
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.f306393l = map;
    }

    @Nullable
    public Map<String, String> t() {
        return this.f306390i;
    }

    @Nullable
    public String u() {
        return this.f306384c;
    }

    @Nullable
    public String v() {
        return this.f306382a;
    }

    public void w(@Nullable String str) {
        this.f306392k = str;
    }

    public void x(@Nullable Long l10) {
        this.f306389h = l10;
    }

    public void y(@Nullable String str) {
        this.f306386e = str;
    }

    public void z(@Nullable Object obj) {
        this.f306385d = obj;
    }

    public m(@NotNull m mVar) {
        this.f306382a = mVar.f306382a;
        this.f306386e = mVar.f306386e;
        this.f306383b = mVar.f306383b;
        this.f306384c = mVar.f306384c;
        this.f306387f = io.sentry.util.d.f(mVar.f306387f);
        this.f306388g = io.sentry.util.d.f(mVar.f306388g);
        this.f306390i = io.sentry.util.d.f(mVar.f306390i);
        this.f306393l = io.sentry.util.d.f(mVar.f306393l);
        this.f306385d = mVar.f306385d;
        this.f306391j = mVar.f306391j;
        this.f306389h = mVar.f306389h;
        this.f306392k = mVar.f306392k;
    }
}
