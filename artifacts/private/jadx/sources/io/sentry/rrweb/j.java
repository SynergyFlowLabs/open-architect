package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.k2;
import io.sentry.m2;
import io.sentry.util.y;
import io.sentry.y3;
import io.sentry.z3;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends io.sentry.rrweb.b implements m2, k2 {
    public static final String X = "h264";
    public static final String Y = "mp4";
    public static final String Z = "constant";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final String f306718p0 = "variable";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f306719w = "video";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private String f306720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f306721d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f306722e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f306723f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private String f306724g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private String f306725h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f306726i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f306727j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f306728k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private String f306729l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f306730m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f306731n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f306732o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f306733s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f306734t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f306735v;

    public static final class a implements a2<j> {
        private void c(@NotNull j jVar, @NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            y3Var.m1();
            ConcurrentHashMap concurrentHashMap = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                if (strNa.equals("payload")) {
                    d(jVar, y3Var, iLogger);
                } else if (strNa.equals("tag")) {
                    String strN6 = y3Var.n6();
                    if (strN6 == null) {
                        strN6 = "";
                    }
                    jVar.f306720c = strN6;
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    y3Var.gd(iLogger, concurrentHashMap, strNa);
                }
            }
            jVar.N(concurrentHashMap);
            y3Var.F1();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        private void d(@NotNull j jVar, @NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            y3Var.m1();
            ConcurrentHashMap concurrentHashMap = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                int iIntValue = 0;
                byte b10 = -1;
                switch (strNa.hashCode()) {
                    case -1992012396:
                        if (strNa.equals("duration")) {
                            b10 = 0;
                        }
                        break;
                    case -1627805778:
                        if (strNa.equals(b.f306738c)) {
                            b10 = 1;
                        }
                        break;
                    case -1221029593:
                        if (strNa.equals("height")) {
                            b10 = 2;
                        }
                        break;
                    case -410956671:
                        if (strNa.equals("container")) {
                            b10 = 3;
                        }
                        break;
                    case -296512606:
                        if (strNa.equals(b.f306745j)) {
                            b10 = 4;
                        }
                        break;
                    case 115029:
                        if (strNa.equals("top")) {
                            b10 = 5;
                        }
                        break;
                    case 3317767:
                        if (strNa.equals("left")) {
                            b10 = 6;
                        }
                        break;
                    case 3530753:
                        if (strNa.equals("size")) {
                            b10 = 7;
                        }
                        break;
                    case 113126854:
                        if (strNa.equals("width")) {
                            b10 = 8;
                        }
                        break;
                    case 545057773:
                        if (strNa.equals(b.f306747l)) {
                            b10 = 9;
                        }
                        break;
                    case 1711222099:
                        if (strNa.equals(b.f306741f)) {
                            b10 = 10;
                        }
                        break;
                    case 2135109831:
                        if (strNa.equals(b.f306746k)) {
                            b10 = 11;
                        }
                        break;
                }
                String str = "";
                switch (b10) {
                    case 0:
                        jVar.f306723f = y3Var.nextLong();
                        break;
                    case 1:
                        jVar.f306721d = y3Var.nextInt();
                        break;
                    case 2:
                        Integer numRc = y3Var.rc();
                        jVar.f306726i = numRc != null ? numRc.intValue() : 0;
                        break;
                    case 3:
                        String strN6 = y3Var.n6();
                        if (strN6 != null) {
                            str = strN6;
                        }
                        jVar.f306725h = str;
                        break;
                    case 4:
                        Integer numRc2 = y3Var.rc();
                        jVar.f306728k = numRc2 != null ? numRc2.intValue() : 0;
                        break;
                    case 5:
                        Integer numRc3 = y3Var.rc();
                        jVar.f306732o = numRc3 != null ? numRc3.intValue() : 0;
                        break;
                    case 6:
                        Integer numRc4 = y3Var.rc();
                        jVar.f306731n = numRc4 != null ? numRc4.intValue() : 0;
                        break;
                    case 7:
                        Long lGc = y3Var.Gc();
                        jVar.f306722e = lGc == null ? 0L : lGc.longValue();
                        break;
                    case 8:
                        Integer numRc5 = y3Var.rc();
                        jVar.f306727j = numRc5 != null ? numRc5.intValue() : 0;
                        break;
                    case 9:
                        Integer numRc6 = y3Var.rc();
                        if (numRc6 != null) {
                            iIntValue = numRc6.intValue();
                        }
                        jVar.f306730m = iIntValue;
                        break;
                    case 10:
                        String strN7 = y3Var.n6();
                        jVar.f306724g = strN7 != null ? strN7 : "";
                        break;
                    case 11:
                        String strN8 = y3Var.n6();
                        if (strN8 != null) {
                            str = strN8;
                        }
                        jVar.f306729l = str;
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        y3Var.gd(iLogger, concurrentHashMap, strNa);
                        break;
                }
            }
            jVar.V(concurrentHashMap);
            y3Var.F1();
        }

        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public j a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            y3Var.m1();
            j jVar = new j();
            io.sentry.rrweb.b.a aVar = new io.sentry.rrweb.b.a();
            HashMap map = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                if (strNa.equals("data")) {
                    c(jVar, y3Var, iLogger);
                } else if (!aVar.a(jVar, strNa, y3Var, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    y3Var.gd(iLogger, map, strNa);
                }
            }
            jVar.setUnknown(map);
            y3Var.F1();
            return jVar;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f306736a = "data";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f306737b = "payload";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f306738c = "segmentId";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f306739d = "size";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f306740e = "duration";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f306741f = "encoding";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f306742g = "container";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f306743h = "height";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f306744i = "width";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final String f306745j = "frameCount";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final String f306746k = "frameRateType";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f306747l = "frameRate";

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final String f306748m = "left";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String f306749n = "top";
    }

    public j() {
        super(c.Custom);
        this.f306724g = X;
        this.f306725h = Y;
        this.f306729l = Z;
        this.f306720c = "video";
    }

    private void K(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        z3Var.f("tag").b(this.f306720c);
        z3Var.f("payload");
        L(z3Var, iLogger);
        Map<String, Object> map = this.f306735v;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f306735v.get(str);
                z3Var.f(str);
                z3Var.j(iLogger, obj);
            }
        }
        z3Var.F1();
    }

    private void L(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        z3Var.f(b.f306738c).c(this.f306721d);
        z3Var.f("size").c(this.f306722e);
        z3Var.f("duration").c(this.f306723f);
        z3Var.f(b.f306741f).b(this.f306724g);
        z3Var.f("container").b(this.f306725h);
        z3Var.f("height").c(this.f306726i);
        z3Var.f("width").c(this.f306727j);
        z3Var.f(b.f306745j).c(this.f306728k);
        z3Var.f(b.f306747l).c(this.f306730m);
        z3Var.f(b.f306746k).b(this.f306729l);
        z3Var.f("left").c(this.f306731n);
        z3Var.f("top").c(this.f306732o);
        Map<String, Object> map = this.f306734t;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f306734t.get(str);
                z3Var.f(str);
                z3Var.j(iLogger, obj);
            }
        }
        z3Var.F1();
    }

    public int A() {
        return this.f306730m;
    }

    @NotNull
    public String B() {
        return this.f306729l;
    }

    public int C() {
        return this.f306726i;
    }

    public int D() {
        return this.f306731n;
    }

    @Nullable
    public Map<String, Object> E() {
        return this.f306734t;
    }

    public int F() {
        return this.f306721d;
    }

    public long G() {
        return this.f306722e;
    }

    @NotNull
    public String H() {
        return this.f306720c;
    }

    public int I() {
        return this.f306732o;
    }

    public int J() {
        return this.f306727j;
    }

    public void M(@NotNull String str) {
        this.f306725h = str;
    }

    public void N(@Nullable Map<String, Object> map) {
        this.f306735v = map;
    }

    public void O(long j10) {
        this.f306723f = j10;
    }

    public void P(@NotNull String str) {
        this.f306724g = str;
    }

    public void Q(int i10) {
        this.f306728k = i10;
    }

    public void R(int i10) {
        this.f306730m = i10;
    }

    public void S(@NotNull String str) {
        this.f306729l = str;
    }

    public void T(int i10) {
        this.f306726i = i10;
    }

    public void U(int i10) {
        this.f306731n = i10;
    }

    public void V(@Nullable Map<String, Object> map) {
        this.f306734t = map;
    }

    public void W(int i10) {
        this.f306721d = i10;
    }

    public void X(long j10) {
        this.f306722e = j10;
    }

    public void Y(@NotNull String str) {
        this.f306720c = str;
    }

    public void Z(int i10) {
        this.f306732o = i10;
    }

    public void a0(int i10) {
        this.f306727j = i10;
    }

    @Override // io.sentry.rrweb.b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            if (!super.equals(obj)) {
                return false;
            }
            j jVar = (j) obj;
            if (this.f306721d == jVar.f306721d && this.f306722e == jVar.f306722e && this.f306723f == jVar.f306723f && this.f306726i == jVar.f306726i && this.f306727j == jVar.f306727j && this.f306728k == jVar.f306728k && this.f306730m == jVar.f306730m && this.f306731n == jVar.f306731n && this.f306732o == jVar.f306732o && y.a(this.f306720c, jVar.f306720c) && y.a(this.f306724g, jVar.f306724g) && y.a(this.f306725h, jVar.f306725h) && y.a(this.f306729l, jVar.f306729l)) {
                return true;
            }
        }
        return false;
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.f306733s;
    }

    @Override // io.sentry.rrweb.b
    public int hashCode() {
        return y.b(Integer.valueOf(super.hashCode()), this.f306720c, Integer.valueOf(this.f306721d), Long.valueOf(this.f306722e), Long.valueOf(this.f306723f), this.f306724g, this.f306725h, Integer.valueOf(this.f306726i), Integer.valueOf(this.f306727j), Integer.valueOf(this.f306728k), this.f306729l, Integer.valueOf(this.f306730m), Integer.valueOf(this.f306731n), Integer.valueOf(this.f306732o));
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        new io.sentry.rrweb.b.c().a(this, z3Var, iLogger);
        z3Var.f("data");
        K(z3Var, iLogger);
        Map<String, Object> map = this.f306733s;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f306733s.get(str);
                z3Var.f(str);
                z3Var.j(iLogger, obj);
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.f306733s = map;
    }

    @NotNull
    public String v() {
        return this.f306725h;
    }

    @Nullable
    public Map<String, Object> w() {
        return this.f306735v;
    }

    public long x() {
        return this.f306723f;
    }

    @NotNull
    public String y() {
        return this.f306724g;
    }

    public int z() {
        return this.f306728k;
    }
}
