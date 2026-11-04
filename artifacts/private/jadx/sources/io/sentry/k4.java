package io.sentry;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class k4 implements m2, k2 {

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private static final String f305716j3 = "production";

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    @lm.a.c
    public static final String f305717k3 = "normal";

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    @lm.a.c
    public static final String f305718l3 = "timeout";

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    @lm.a.c
    public static final String f305719m3 = "backgrounded";

    @NotNull
    private String H1;

    @NotNull
    private String X;

    @NotNull
    private String Y;

    @NotNull
    private String Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final File f305720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Callable<List<Integer>> f305721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f305722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private String f305723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private String f305724e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private String f305725f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private String f305726g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @NotNull
    private final Map<String, io.sentry.profilemeasurements.a> f305727g3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private String f305728h;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    @Nullable
    private String f305729h3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private String f305730i;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f305731i3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f305732j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private String f305733k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private List<Integer> f305734l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private String f305735m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private String f305736n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private String f305737o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    private String f305738p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @NotNull
    private String f305739p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @NotNull
    private Date f305740p2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private List<l4> f305741s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private String f305742t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private String f305743v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private String f305744w;

    public static final class b implements a2<k4> {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public k4 a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            y3Var.m1();
            ConcurrentHashMap concurrentHashMap = null;
            k4 k4Var = new k4();
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                byte b10 = -1;
                switch (strNa.hashCode()) {
                    case -2133529830:
                        if (strNa.equals(c.f305747c)) {
                            b10 = 0;
                        }
                        break;
                    case -1981468849:
                        if (strNa.equals(c.f305745a)) {
                            b10 = 1;
                        }
                        break;
                    case -1430655860:
                        if (strNa.equals(c.f305757m)) {
                            b10 = 2;
                        }
                        break;
                    case -1172160413:
                        if (strNa.equals(c.f305746b)) {
                            b10 = 3;
                        }
                        break;
                    case -1102636175:
                        if (strNa.equals(c.f305765u)) {
                            b10 = 4;
                        }
                        break;
                    case -716656436:
                        if (strNa.equals(c.f305749e)) {
                            b10 = 5;
                        }
                        break;
                    case -591076352:
                        if (strNa.equals(c.f305748d)) {
                            b10 = 6;
                        }
                        break;
                    case -512511455:
                        if (strNa.equals(c.f305752h)) {
                            b10 = 7;
                        }
                        break;
                    case -478065584:
                        if (strNa.equals(c.f305759o)) {
                            b10 = 8;
                        }
                        break;
                    case -362243017:
                        if (strNa.equals("measurements")) {
                            b10 = 9;
                        }
                        break;
                    case -332426004:
                        if (strNa.equals(c.f305755k)) {
                            b10 = 10;
                        }
                        break;
                    case -212264198:
                        if (strNa.equals(c.f305754j)) {
                            b10 = 11;
                        }
                        break;
                    case -102985484:
                        if (strNa.equals(c.f305761q)) {
                            b10 = com.google.common.base.c.f116461n;
                        }
                        break;
                    case -102670958:
                        if (strNa.equals(c.f305760p)) {
                            b10 = com.google.common.base.c.f116462o;
                        }
                        break;
                    case -85904877:
                        if (strNa.equals("environment")) {
                            b10 = com.google.common.base.c.f116463p;
                        }
                        break;
                    case 55126294:
                        if (strNa.equals("timestamp")) {
                            b10 = com.google.common.base.c.f116464q;
                        }
                        break;
                    case 508853068:
                        if (strNa.equals(c.f305758n)) {
                            b10 = com.google.common.base.c.f116465r;
                        }
                        break;
                    case 796476189:
                        if (strNa.equals(c.f305750f)) {
                            b10 = 17;
                        }
                        break;
                    case 839674195:
                        if (strNa.equals(c.f305753i)) {
                            b10 = com.google.common.base.c.f116468u;
                        }
                        break;
                    case 1010584092:
                        if (strNa.equals("transaction_id")) {
                            b10 = 19;
                        }
                        break;
                    case 1052553990:
                        if (strNa.equals(c.f305751g)) {
                            b10 = com.google.common.base.c.f116471x;
                        }
                        break;
                    case 1163928186:
                        if (strNa.equals(c.f305768x)) {
                            b10 = com.google.common.base.c.f116472y;
                        }
                        break;
                    case 1270300245:
                        if (strNa.equals("trace_id")) {
                            b10 = com.google.common.base.c.f116473z;
                        }
                        break;
                    case 1874684019:
                        if (strNa.equals("platform")) {
                            b10 = com.google.common.base.c.A;
                        }
                        break;
                    case 1953158756:
                        if (strNa.equals("sampled_profile")) {
                            b10 = com.google.common.base.c.B;
                        }
                        break;
                    case 1954122069:
                        if (strNa.equals(c.f305762r)) {
                            b10 = com.google.common.base.c.C;
                        }
                        break;
                }
                switch (b10) {
                    case 0:
                        String strN6 = y3Var.n6();
                        if (strN6 != null) {
                            k4Var.f305724e = strN6;
                        }
                        break;
                    case 1:
                        Integer numRc = y3Var.rc();
                        if (numRc != null) {
                            k4Var.f305722c = numRc.intValue();
                        }
                        break;
                    case 2:
                        String strN7 = y3Var.n6();
                        if (strN7 != null) {
                            k4Var.f305737o = strN7;
                        }
                        break;
                    case 3:
                        String strN8 = y3Var.n6();
                        if (strN8 != null) {
                            k4Var.f305723d = strN8;
                        }
                        break;
                    case 4:
                        String strN9 = y3Var.n6();
                        if (strN9 != null) {
                            k4Var.f305738p0 = strN9;
                        }
                        break;
                    case 5:
                        String strN10 = y3Var.n6();
                        if (strN10 != null) {
                            k4Var.f305726g = strN10;
                        }
                        break;
                    case 6:
                        String strN11 = y3Var.n6();
                        if (strN11 != null) {
                            k4Var.f305725f = strN11;
                        }
                        break;
                    case 7:
                        Boolean boolJ3 = y3Var.J3();
                        if (boolJ3 != null) {
                            k4Var.f305732j = boolJ3.booleanValue();
                        }
                        break;
                    case 8:
                        String strN12 = y3Var.n6();
                        if (strN12 != null) {
                            k4Var.f305743v = strN12;
                        }
                        break;
                    case 9:
                        Map mapFd = y3Var.fd(iLogger, new io.sentry.profilemeasurements.a.C2225a());
                        if (mapFd != null) {
                            k4Var.f305727g3.putAll(mapFd);
                        }
                        break;
                    case 10:
                        String strN13 = y3Var.n6();
                        if (strN13 != null) {
                            k4Var.f305735m = strN13;
                        }
                        break;
                    case 11:
                        List list = (List) y3Var.re();
                        if (list != null) {
                            k4Var.f305734l = list;
                        }
                        break;
                    case 12:
                        String strN14 = y3Var.n6();
                        if (strN14 != null) {
                            k4Var.f305744w = strN14;
                        }
                        break;
                    case 13:
                        String strN15 = y3Var.n6();
                        if (strN15 != null) {
                            k4Var.X = strN15;
                        }
                        break;
                    case 14:
                        String strN16 = y3Var.n6();
                        if (strN16 != null) {
                            k4Var.f305739p1 = strN16;
                        }
                        break;
                    case 15:
                        Date dateZ3 = y3Var.z3(iLogger);
                        if (dateZ3 != null) {
                            k4Var.f305740p2 = dateZ3;
                        }
                        break;
                    case 16:
                        String strN17 = y3Var.n6();
                        if (strN17 != null) {
                            k4Var.f305742t = strN17;
                        }
                        break;
                    case 17:
                        String strN18 = y3Var.n6();
                        if (strN18 != null) {
                            k4Var.f305728h = strN18;
                        }
                        break;
                    case 18:
                        String strN19 = y3Var.n6();
                        if (strN19 != null) {
                            k4Var.f305733k = strN19;
                        }
                        break;
                    case 19:
                        String strN20 = y3Var.n6();
                        if (strN20 != null) {
                            k4Var.Y = strN20;
                        }
                        break;
                    case 20:
                        String strN21 = y3Var.n6();
                        if (strN21 != null) {
                            k4Var.f305730i = strN21;
                        }
                        break;
                    case 21:
                        String strN22 = y3Var.n6();
                        if (strN22 != null) {
                            k4Var.H1 = strN22;
                        }
                        break;
                    case 22:
                        String strN23 = y3Var.n6();
                        if (strN23 != null) {
                            k4Var.Z = strN23;
                        }
                        break;
                    case 23:
                        String strN24 = y3Var.n6();
                        if (strN24 != null) {
                            k4Var.f305736n = strN24;
                        }
                        break;
                    case 24:
                        String strN25 = y3Var.n6();
                        if (strN25 != null) {
                            k4Var.f305729h3 = strN25;
                        }
                        break;
                    case 25:
                        List listP8 = y3Var.p8(iLogger, new l4.a());
                        if (listP8 != null) {
                            k4Var.f305741s.addAll(listP8);
                        }
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        y3Var.gd(iLogger, concurrentHashMap, strNa);
                        break;
                }
            }
            k4Var.setUnknown(concurrentHashMap);
            y3Var.F1();
            return k4Var;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f305745a = "android_api_level";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f305746b = "device_locale";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f305747c = "device_manufacturer";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f305748d = "device_model";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f305749e = "device_os_build_number";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f305750f = "device_os_name";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f305751g = "device_os_version";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f305752h = "device_is_emulator";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f305753i = "architecture";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final String f305754j = "device_cpu_frequencies";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final String f305755k = "device_physical_memory_bytes";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f305756l = "platform";

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final String f305757m = "build_id";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String f305758n = "transaction_name";

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final String f305759o = "duration_ns";

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final String f305760p = "version_name";

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final String f305761q = "version_code";

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final String f305762r = "transactions";

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final String f305763s = "transaction_id";

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final String f305764t = "trace_id";

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final String f305765u = "profile_id";

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final String f305766v = "environment";

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final String f305767w = "sampled_profile";

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final String f305768x = "truncation_reason";

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final String f305769y = "measurements";

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final String f305770z = "timestamp";
    }

    public static /* synthetic */ List a() {
        return new ArrayList();
    }

    private boolean b0() {
        return this.H1.equals("normal") || this.H1.equals(f305718l3) || this.H1.equals(f305719m3);
    }

    public int B() {
        return this.f305722c;
    }

    @NotNull
    public String C() {
        return this.f305737o;
    }

    @NotNull
    public String D() {
        return this.f305733k;
    }

    @NotNull
    public List<Integer> E() {
        return this.f305734l;
    }

    @NotNull
    public String F() {
        return this.f305723d;
    }

    @NotNull
    public String G() {
        return this.f305724e;
    }

    @NotNull
    public String H() {
        return this.f305725f;
    }

    @NotNull
    public String I() {
        return this.f305726g;
    }

    @NotNull
    public String J() {
        return this.f305728h;
    }

    @NotNull
    public String K() {
        return this.f305730i;
    }

    @NotNull
    public String L() {
        return this.f305735m;
    }

    @NotNull
    public String M() {
        return this.f305743v;
    }

    @NotNull
    public String N() {
        return this.f305739p1;
    }

    @NotNull
    public Map<String, io.sentry.profilemeasurements.a> O() {
        return this.f305727g3;
    }

    @NotNull
    public String P() {
        return this.f305736n;
    }

    @NotNull
    public String Q() {
        return this.f305738p0;
    }

    @NotNull
    public String R() {
        return this.X;
    }

    @Nullable
    public String S() {
        return this.f305729h3;
    }

    @NotNull
    public Date T() {
        return this.f305740p2;
    }

    @NotNull
    public File U() {
        return this.f305720a;
    }

    @NotNull
    public String V() {
        return this.Z;
    }

    @NotNull
    public String W() {
        return this.Y;
    }

    @NotNull
    public String X() {
        return this.f305742t;
    }

    @NotNull
    public List<l4> Y() {
        return this.f305741s;
    }

    @NotNull
    public String Z() {
        return this.H1;
    }

    public boolean a0() {
        return this.f305732j;
    }

    public void c0() {
        try {
            this.f305734l = this.f305721b.call();
        } catch (Throwable unused) {
        }
    }

    public void d0(int i10) {
        this.f305722c = i10;
    }

    public void e0(@NotNull String str) {
        this.f305737o = str;
    }

    public void f0(@NotNull String str) {
        this.f305733k = str;
    }

    public void g0(@NotNull List<Integer> list) {
        this.f305734l = list;
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.f305731i3;
    }

    public void h0(boolean z10) {
        this.f305732j = z10;
    }

    public void i0(@NotNull String str) {
        this.f305723d = str;
    }

    public void j0(@NotNull String str) {
        this.f305724e = str;
    }

    public void k0(@NotNull String str) {
        this.f305725f = str;
    }

    public void l0(@NotNull String str) {
        this.f305726g = str;
    }

    public void m0(@NotNull String str) {
        this.f305730i = str;
    }

    public void n0(@NotNull String str) {
        this.f305735m = str;
    }

    public void o0(@NotNull String str) {
        this.f305743v = str;
    }

    public void p0(@NotNull String str) {
        this.f305739p1 = str;
    }

    public void q0(@NotNull String str) {
        this.f305738p0 = str;
    }

    public void r0(@NotNull String str) {
        this.X = str;
    }

    public void s0(@Nullable String str) {
        this.f305729h3 = str;
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        z3Var.f(c.f305745a).j(iLogger, Integer.valueOf(this.f305722c));
        z3Var.f(c.f305746b).j(iLogger, this.f305723d);
        z3Var.f(c.f305747c).b(this.f305724e);
        z3Var.f(c.f305748d).b(this.f305725f);
        z3Var.f(c.f305749e).b(this.f305726g);
        z3Var.f(c.f305750f).b(this.f305728h);
        z3Var.f(c.f305751g).b(this.f305730i);
        z3Var.f(c.f305752h).e(this.f305732j);
        z3Var.f(c.f305753i).j(iLogger, this.f305733k);
        z3Var.f(c.f305754j).j(iLogger, this.f305734l);
        z3Var.f(c.f305755k).b(this.f305735m);
        z3Var.f("platform").b(this.f305736n);
        z3Var.f(c.f305757m).b(this.f305737o);
        z3Var.f(c.f305758n).b(this.f305742t);
        z3Var.f(c.f305759o).b(this.f305743v);
        z3Var.f(c.f305760p).b(this.X);
        z3Var.f(c.f305761q).b(this.f305744w);
        if (!this.f305741s.isEmpty()) {
            z3Var.f(c.f305762r).j(iLogger, this.f305741s);
        }
        z3Var.f("transaction_id").b(this.Y);
        z3Var.f("trace_id").b(this.Z);
        z3Var.f(c.f305765u).b(this.f305738p0);
        z3Var.f("environment").b(this.f305739p1);
        z3Var.f(c.f305768x).b(this.H1);
        if (this.f305729h3 != null) {
            z3Var.f("sampled_profile").b(this.f305729h3);
        }
        String strA = z3Var.a();
        z3Var.h("");
        z3Var.f("measurements").j(iLogger, this.f305727g3);
        z3Var.h(strA);
        z3Var.f("timestamp").j(iLogger, this.f305740p2);
        Map<String, Object> map = this.f305731i3;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f305731i3.get(str);
                z3Var.f(str);
                z3Var.j(iLogger, obj);
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.f305731i3 = map;
    }

    public void t0(@NotNull Date date) {
        this.f305740p2 = date;
    }

    public void u0(@NotNull String str) {
        this.Z = str;
    }

    public void v0(@NotNull String str) {
        this.Y = str;
    }

    public void w0(@NotNull String str) {
        this.f305742t = str;
    }

    public void x0(@NotNull List<l4> list) {
        this.f305741s = list;
    }

    public void y0(@NotNull String str) {
        this.H1 = str;
    }

    private k4() {
        this(new File("dummy"), u3.R());
    }

    public k4(@NotNull File file, @NotNull r1 r1Var) {
        this(file, p.d(), new ArrayList(), r1Var.getName(), r1Var.x().toString(), r1Var.m().p().toString(), com.facebook.appevents.p.f99189d0, 0, "", new Callable() { // from class: io.sentry.j4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return k4.a();
            }
        }, null, null, null, null, null, null, null, null, "normal", new HashMap());
    }

    public k4(@NotNull File file, @NotNull Date date, @NotNull List<l4> list, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i10, @NotNull String str5, @NotNull Callable<List<Integer>> callable, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable Boolean bool, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @NotNull String str13, @NotNull Map<String, io.sentry.profilemeasurements.a> map) {
        this.f305734l = new ArrayList();
        this.f305729h3 = null;
        this.f305720a = file;
        this.f305740p2 = date;
        this.f305733k = str5;
        this.f305721b = callable;
        this.f305722c = i10;
        this.f305723d = Locale.getDefault().toString();
        this.f305724e = str6 == null ? "" : str6;
        this.f305725f = str7 == null ? "" : str7;
        this.f305730i = str8 == null ? "" : str8;
        this.f305732j = bool != null ? bool.booleanValue() : false;
        this.f305735m = str9 != null ? str9 : com.facebook.appevents.p.f99189d0;
        this.f305726g = "";
        this.f305728h = "android";
        this.f305736n = "android";
        this.f305737o = str10 != null ? str10 : "";
        this.f305741s = list;
        this.f305742t = str.isEmpty() ? "unknown" : str;
        this.f305743v = str4;
        this.f305744w = "";
        this.X = str11 != null ? str11 : "";
        this.Y = str2;
        this.Z = str3;
        this.f305738p0 = e9.a();
        this.f305739p1 = str12 != null ? str12 : "production";
        this.H1 = str13;
        if (!b0()) {
            this.H1 = "normal";
        }
        this.f305727g3 = map;
    }
}
