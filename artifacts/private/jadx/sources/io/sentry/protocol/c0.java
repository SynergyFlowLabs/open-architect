package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.d9;
import io.sentry.fa;
import io.sentry.k2;
import io.sentry.m2;
import io.sentry.o9;
import io.sentry.p9;
import io.sentry.x9;
import io.sentry.y3;
import io.sentry.z3;
import io.sentry.z5;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class c0 extends z5 implements m2, k2 {

    @NotNull
    private final List<y> X;

    @NotNull
    private final String Y;

    @NotNull
    private final Map<String, i> Z;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    private e0 f306160p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f306161p1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    private String f306162t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private Double f306163v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    private Double f306164w;

    public static final class a implements a2<c0> {
        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c0 a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            y3Var.m1();
            c0 c0Var = new c0("", Double.valueOf(0.0d), null, new ArrayList(), new HashMap(), new e0(f0.CUSTOM.apiName()));
            z5.a aVar = new z5.a();
            ConcurrentHashMap concurrentHashMap = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                switch (strNa) {
                    case "start_timestamp":
                        try {
                            Double dIa = y3Var.ia();
                            if (dIa != null) {
                                c0Var.f306163v = dIa;
                            }
                            break;
                        } catch (NumberFormatException unused) {
                            Date dateZ3 = y3Var.z3(iLogger);
                            if (dateZ3 != null) {
                                c0Var.f306163v = Double.valueOf(io.sentry.p.b(dateZ3));
                            }
                            break;
                        }
                        break;
                    case "measurements":
                        Map mapFd = y3Var.fd(iLogger, new i.a());
                        if (mapFd != null) {
                            c0Var.Z.putAll(mapFd);
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "type":
                        y3Var.jc();
                        break;
                    case "timestamp":
                        try {
                            Double dIa2 = y3Var.ia();
                            if (dIa2 != null) {
                                c0Var.f306164w = dIa2;
                            }
                            break;
                        } catch (NumberFormatException unused2) {
                            Date dateZ4 = y3Var.z3(iLogger);
                            if (dateZ4 != null) {
                                c0Var.f306164w = Double.valueOf(io.sentry.p.b(dateZ4));
                            }
                            break;
                        }
                        break;
                    case "spans":
                        List listP8 = y3Var.p8(iLogger, new y.a());
                        if (listP8 != null) {
                            c0Var.X.addAll(listP8);
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "transaction_info":
                        c0Var.f306160p0 = new e0.a().a(y3Var, iLogger);
                        break;
                    case "transaction":
                        c0Var.f306162t = y3Var.n6();
                        break;
                    default:
                        if (aVar.a(c0Var, strNa, y3Var, iLogger)) {
                            break;
                        } else {
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            y3Var.gd(iLogger, concurrentHashMap, strNa);
                            break;
                        }
                        break;
                }
            }
            c0Var.setUnknown(concurrentHashMap);
            y3Var.F1();
            return c0Var;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f306165a = "transaction";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f306166b = "start_timestamp";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f306167c = "timestamp";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f306168d = "spans";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f306169e = "type";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f306170f = "measurements";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f306171g = "transaction_info";
    }

    public c0(@NotNull d9 d9Var) {
        super(d9Var.x());
        this.X = new ArrayList();
        this.Y = "transaction";
        this.Z = new HashMap();
        io.sentry.util.y.c(d9Var, "sentryTracer is required");
        this.f306163v = Double.valueOf(io.sentry.p.m(d9Var.Q().k()));
        this.f306164w = Double.valueOf(io.sentry.p.m(d9Var.Q().f(d9Var.N())));
        this.f306162t = d9Var.getName();
        for (o9 o9Var : d9Var.e0()) {
            if (Boolean.TRUE.equals(o9Var.f())) {
                this.X.add(new y(o9Var));
            }
        }
        c cVarE = E();
        cVarE.s(d9Var.q());
        p9 p9VarM = d9Var.m();
        Map<String, Object> mapF0 = d9Var.f0();
        p9 p9Var = new p9(p9VarM.p(), p9VarM.m(), p9VarM.h(), p9VarM.f(), p9VarM.d(), p9VarM.l(), p9VarM.n(), p9VarM.g());
        for (Map.Entry<String, String> entry : p9VarM.o().entrySet()) {
            j0(entry.getKey(), entry.getValue());
        }
        if (mapF0 != null) {
            for (Map.Entry<String, Object> entry2 : mapF0.entrySet()) {
                p9Var.q(entry2.getKey(), entry2.getValue());
            }
        }
        cVarE.G(p9Var);
        this.f306160p0 = new e0(d9Var.z().apiName());
    }

    @NotNull
    public String A0() {
        return "transaction";
    }

    public boolean B0() {
        return this.f306164w != null;
    }

    public boolean C0() {
        fa faVarU0 = u0();
        if (faVarU0 == null) {
            return false;
        }
        return faVarU0.e().booleanValue();
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.f306161p1;
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        if (this.f306162t != null) {
            z3Var.f("transaction").b(this.f306162t);
        }
        z3Var.f("start_timestamp").j(iLogger, io.sentry.p.c(this.f306163v));
        if (this.f306164w != null) {
            z3Var.f("timestamp").j(iLogger, io.sentry.p.c(this.f306164w));
        }
        if (!this.X.isEmpty()) {
            z3Var.f(b.f306168d).j(iLogger, this.X);
        }
        z3Var.f("type").b("transaction");
        if (!this.Z.isEmpty()) {
            z3Var.f("measurements").j(iLogger, this.Z);
        }
        z3Var.f(b.f306171g).j(iLogger, this.f306160p0);
        new z5.c().a(this, z3Var, iLogger);
        Map<String, Object> map = this.f306161p1;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f306161p1.get(str);
                z3Var.f(str);
                z3Var.j(iLogger, obj);
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.f306161p1 = map;
    }

    @NotNull
    public Map<String, i> t0() {
        return this.Z;
    }

    @Nullable
    public fa u0() {
        p9 p9VarO = E().o();
        if (p9VarO == null) {
            return null;
        }
        return p9VarO.l();
    }

    @NotNull
    public List<y> v0() {
        return this.X;
    }

    @NotNull
    public Double w0() {
        return this.f306163v;
    }

    @Nullable
    public x9 x0() {
        p9 p9VarO = E().o();
        if (p9VarO != null) {
            return p9VarO.n();
        }
        return null;
    }

    @Nullable
    public Double y0() {
        return this.f306164w;
    }

    @Nullable
    public String z0() {
        return this.f306162t;
    }

    @lm.a.c
    public c0(@Nullable String str, @NotNull Double d10, @Nullable Double d11, @NotNull List<y> list, @NotNull Map<String, i> map, @NotNull e0 e0Var) {
        ArrayList arrayList = new ArrayList();
        this.X = arrayList;
        this.Y = "transaction";
        HashMap map2 = new HashMap();
        this.Z = map2;
        this.f306162t = str;
        this.f306163v = d10;
        this.f306164w = d11;
        arrayList.addAll(list);
        map2.putAll(map);
        Iterator<y> it = list.iterator();
        while (it.hasNext()) {
            this.Z.putAll(it.next().d());
        }
        this.f306160p0 = e0Var;
    }
}
