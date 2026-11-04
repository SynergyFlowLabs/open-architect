package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.k2;
import io.sentry.m2;
import io.sentry.y3;
import io.sentry.z3;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends d implements k2, m2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f306670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private List<c> f306671e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f306672f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f306673g;

    public static final class a implements a2<f> {
        private void c(@NotNull f fVar, @NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            d.a aVar = new d.a();
            y3Var.m1();
            HashMap map = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                if (strNa.equals("pointerId")) {
                    fVar.f306670d = y3Var.nextInt();
                } else if (strNa.equals(b.f306675b)) {
                    fVar.f306671e = y3Var.p8(iLogger, new c.a());
                } else if (!aVar.a(fVar, strNa, y3Var, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    y3Var.gd(iLogger, map, strNa);
                }
            }
            fVar.s(map);
            y3Var.F1();
        }

        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public f a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            y3Var.m1();
            f fVar = new f();
            io.sentry.rrweb.b.a aVar = new io.sentry.rrweb.b.a();
            HashMap map = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                if (strNa.equals("data")) {
                    c(fVar, y3Var, iLogger);
                } else if (!aVar.a(fVar, strNa, y3Var, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    y3Var.gd(iLogger, map, strNa);
                }
            }
            fVar.setUnknown(map);
            y3Var.F1();
            return fVar;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f306674a = "data";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f306675b = "positions";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f306676c = "pointerId";
    }

    public static final class c implements k2, m2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f306677a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f306678b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f306679c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f306680d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        private Map<String, Object> f306681e;

        public static final class a implements a2<c> {
            @Override // io.sentry.a2
            @NotNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public c a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
                y3Var.m1();
                c cVar = new c();
                HashMap map = null;
                while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                    String strNa = y3Var.na();
                    strNa.getClass();
                    switch (strNa) {
                        case "x":
                            cVar.f306678b = y3Var.nextFloat();
                            break;
                        case "y":
                            cVar.f306679c = y3Var.nextFloat();
                            break;
                        case "id":
                            cVar.f306677a = y3Var.nextInt();
                            break;
                        case "timeOffset":
                            cVar.f306680d = y3Var.nextLong();
                            break;
                        default:
                            if (map == null) {
                                map = new HashMap();
                            }
                            y3Var.gd(iLogger, map, strNa);
                            break;
                    }
                }
                cVar.setUnknown(map);
                y3Var.F1();
                return cVar;
            }
        }

        public static final class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final String f306682a = "id";

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final String f306683b = "x";

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final String f306684c = "y";

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final String f306685d = "timeOffset";
        }

        public int e() {
            return this.f306677a;
        }

        public long f() {
            return this.f306680d;
        }

        public float g() {
            return this.f306678b;
        }

        @Override // io.sentry.m2
        @Nullable
        public Map<String, Object> getUnknown() {
            return this.f306681e;
        }

        public float h() {
            return this.f306679c;
        }

        public void i(int i10) {
            this.f306677a = i10;
        }

        public void j(long j10) {
            this.f306680d = j10;
        }

        public void k(float f10) {
            this.f306678b = f10;
        }

        public void l(float f10) {
            this.f306679c = f10;
        }

        @Override // io.sentry.k2
        public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
            z3Var.m1();
            z3Var.f("id").c(this.f306677a);
            z3Var.f("x").d(this.f306678b);
            z3Var.f("y").d(this.f306679c);
            z3Var.f(b.f306685d).c(this.f306680d);
            Map<String, Object> map = this.f306681e;
            if (map != null) {
                for (String str : map.keySet()) {
                    Object obj = this.f306681e.get(str);
                    z3Var.f(str);
                    z3Var.j(iLogger, obj);
                }
            }
            z3Var.F1();
        }

        @Override // io.sentry.m2
        public void setUnknown(@Nullable Map<String, Object> map) {
            this.f306681e = map;
        }
    }

    public f() {
        super(d.b.TouchMove);
    }

    private void r(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        new d.C2233d().a(this, z3Var, iLogger);
        List<c> list = this.f306671e;
        if (list != null && !list.isEmpty()) {
            z3Var.f(b.f306675b).j(iLogger, this.f306671e);
        }
        z3Var.f("pointerId").c(this.f306670d);
        Map<String, Object> map = this.f306673g;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f306673g.get(str);
                z3Var.f(str);
                z3Var.j(iLogger, obj);
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.f306672f;
    }

    @Nullable
    public Map<String, Object> o() {
        return this.f306673g;
    }

    public int p() {
        return this.f306670d;
    }

    @Nullable
    public List<c> q() {
        return this.f306671e;
    }

    public void s(@Nullable Map<String, Object> map) {
        this.f306673g = map;
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        new io.sentry.rrweb.b.c().a(this, z3Var, iLogger);
        z3Var.f("data");
        r(z3Var, iLogger);
        Map<String, Object> map = this.f306672f;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f306672f.get(str);
                z3Var.f(str);
                z3Var.j(iLogger, obj);
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.f306672f = map;
    }

    public void t(int i10) {
        this.f306670d = i10;
    }

    public void u(@Nullable List<c> list) {
        this.f306671e = list;
    }
}
