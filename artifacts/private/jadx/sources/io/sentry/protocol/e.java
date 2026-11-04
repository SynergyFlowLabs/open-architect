package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.k2;
import io.sentry.m2;
import io.sentry.y3;
import io.sentry.z3;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements m2, k2 {

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    public static final String f306181p3 = "device";

    @Nullable
    private Date H1;

    @Nullable
    private Long X;

    @Nullable
    private Integer Y;

    @Nullable
    private Integer Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private String f306182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private String f306183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private String f306184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private String f306185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private String f306186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private String f306187f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private String[] f306188g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @Nullable
    private String f306189g3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private Float f306190h;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    @Nullable
    private String f306191h3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private Boolean f306192i;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    @Nullable
    private String f306193i3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private Boolean f306194j;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    @Nullable
    private Float f306195j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private b f306196k;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    @Nullable
    private Integer f306197k3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private Boolean f306198l;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    @Nullable
    private Double f306199l3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private Long f306200m;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    @Nullable
    private String f306201m3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private Long f306202n;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    @Nullable
    private String f306203n3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    private Long f306204o;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f306205o3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    private Float f306206p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @Nullable
    private Integer f306207p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @Nullable
    private TimeZone f306208p2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    private Boolean f306209s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    private Long f306210t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    private Long f306211v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    private Long f306212w;

    public static final class a implements a2<e> {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            y3Var.m1();
            e eVar = new e();
            ConcurrentHashMap concurrentHashMap = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                byte b10 = -1;
                switch (strNa.hashCode()) {
                    case -2076227591:
                        if (strNa.equals("timezone")) {
                            b10 = 0;
                        }
                        break;
                    case -2012489734:
                        if (strNa.equals(c.f306237y)) {
                            b10 = 1;
                        }
                        break;
                    case -1981332476:
                        if (strNa.equals(c.f306224l)) {
                            b10 = 2;
                        }
                        break;
                    case -1969347631:
                        if (strNa.equals("manufacturer")) {
                            b10 = 3;
                        }
                        break;
                    case -1608004830:
                        if (strNa.equals(c.E)) {
                            b10 = 4;
                        }
                        break;
                    case -1439500848:
                        if (strNa.equals(c.f306223k)) {
                            b10 = 5;
                        }
                        break;
                    case -1410521534:
                        if (strNa.equals(c.C)) {
                            b10 = 6;
                        }
                        break;
                    case -1281860764:
                        if (strNa.equals(c.f306216d)) {
                            b10 = 7;
                        }
                        break;
                    case -1097462182:
                        if (strNa.equals("locale")) {
                            b10 = 8;
                        }
                        break;
                    case -1012222381:
                        if (strNa.equals("online")) {
                            b10 = 9;
                        }
                        break;
                    case -877252910:
                        if (strNa.equals(c.f306220h)) {
                            b10 = 10;
                        }
                        break;
                    case -619038223:
                        if (strNa.equals(c.f306218f)) {
                            b10 = 11;
                        }
                        break;
                    case -568274923:
                        if (strNa.equals(c.f306235w)) {
                            b10 = com.google.common.base.c.f116461n;
                        }
                        break;
                    case -417046774:
                        if (strNa.equals(c.f306236x)) {
                            b10 = com.google.common.base.c.f116462o;
                        }
                        break;
                    case -136523212:
                        if (strNa.equals(c.f306226n)) {
                            b10 = com.google.common.base.c.f116463p;
                        }
                        break;
                    case 3355:
                        if (strNa.equals("id")) {
                            b10 = com.google.common.base.c.f116464q;
                        }
                        break;
                    case 3373707:
                        if (strNa.equals("name")) {
                            b10 = com.google.common.base.c.f116465r;
                        }
                        break;
                    case 59142220:
                        if (strNa.equals(c.f306228p)) {
                            b10 = 17;
                        }
                        break;
                    case 93076189:
                        if (strNa.equals(c.f306219g)) {
                            b10 = com.google.common.base.c.f116468u;
                        }
                        break;
                    case 93997959:
                        if (strNa.equals(c.f306215c)) {
                            b10 = 19;
                        }
                        break;
                    case 104069929:
                        if (strNa.equals("model")) {
                            b10 = com.google.common.base.c.f116471x;
                        }
                        break;
                    case 115746789:
                        if (strNa.equals(c.F)) {
                            b10 = com.google.common.base.c.f116472y;
                        }
                        break;
                    case 244497903:
                        if (strNa.equals(c.G)) {
                            b10 = com.google.common.base.c.f116473z;
                        }
                        break;
                    case 731866107:
                        if (strNa.equals(c.B)) {
                            b10 = com.google.common.base.c.A;
                        }
                        break;
                    case 746402966:
                        if (strNa.equals(c.H)) {
                            b10 = com.google.common.base.c.B;
                        }
                        break;
                    case 817830969:
                        if (strNa.equals(c.f306233u)) {
                            b10 = com.google.common.base.c.C;
                        }
                        break;
                    case 823882553:
                        if (strNa.equals(c.f306231s)) {
                            b10 = com.google.common.base.c.D;
                        }
                        break;
                    case 897428293:
                        if (strNa.equals(c.f306229q)) {
                            b10 = com.google.common.base.c.E;
                        }
                        break;
                    case 1331465768:
                        if (strNa.equals(c.f306227o)) {
                            b10 = com.google.common.base.c.F;
                        }
                        break;
                    case 1418777727:
                        if (strNa.equals("memory_size")) {
                            b10 = com.google.common.base.c.G;
                        }
                        break;
                    case 1436115569:
                        if (strNa.equals(c.f306221i)) {
                            b10 = com.google.common.base.c.H;
                        }
                        break;
                    case 1450613660:
                        if (strNa.equals(c.f306232t)) {
                            b10 = com.google.common.base.c.I;
                        }
                        break;
                    case 1524159400:
                        if (strNa.equals(c.f306230r)) {
                            b10 = 32;
                        }
                        break;
                    case 1556284978:
                        if (strNa.equals(c.f306234v)) {
                            b10 = 33;
                        }
                        break;
                }
                switch (b10) {
                    case 0:
                        eVar.f306208p2 = y3Var.B9(iLogger);
                        break;
                    case 1:
                        if (y3Var.peek() == io.sentry.vendor.gson.stream.c.STRING) {
                            eVar.H1 = y3Var.z3(iLogger);
                        }
                        break;
                    case 2:
                        eVar.f306198l = y3Var.J3();
                        break;
                    case 3:
                        eVar.f306183b = y3Var.n6();
                        break;
                    case 4:
                        eVar.f306197k3 = y3Var.rc();
                        break;
                    case 5:
                        eVar.f306196k = (b) y3Var.i4(iLogger, new b.a());
                        break;
                    case 6:
                        eVar.f306195j3 = y3Var.F7();
                        break;
                    case 7:
                        eVar.f306185d = y3Var.n6();
                        break;
                    case 8:
                        eVar.f306191h3 = y3Var.n6();
                        break;
                    case 9:
                        eVar.f306194j = y3Var.J3();
                        break;
                    case 10:
                        eVar.f306190h = y3Var.F7();
                        break;
                    case 11:
                        eVar.f306187f = y3Var.n6();
                        break;
                    case 12:
                        eVar.f306206p0 = y3Var.F7();
                        break;
                    case 13:
                        eVar.f306207p1 = y3Var.rc();
                        break;
                    case 14:
                        eVar.f306202n = y3Var.Gc();
                        break;
                    case 15:
                        eVar.f306189g3 = y3Var.n6();
                        break;
                    case 16:
                        eVar.f306182a = y3Var.n6();
                        break;
                    case 17:
                        eVar.f306209s = y3Var.J3();
                        break;
                    case 18:
                        List list = (List) y3Var.re();
                        if (list != null) {
                            String[] strArr = new String[list.size()];
                            list.toArray(strArr);
                            eVar.f306188g = strArr;
                        }
                        break;
                    case 19:
                        eVar.f306184c = y3Var.n6();
                        break;
                    case 20:
                        eVar.f306186e = y3Var.n6();
                        break;
                    case 21:
                        eVar.f306201m3 = y3Var.n6();
                        break;
                    case 22:
                        eVar.f306199l3 = y3Var.ia();
                        break;
                    case 23:
                        eVar.f306193i3 = y3Var.n6();
                        break;
                    case 24:
                        eVar.f306203n3 = y3Var.n6();
                        break;
                    case 25:
                        eVar.Y = y3Var.rc();
                        break;
                    case 26:
                        eVar.f306212w = y3Var.Gc();
                        break;
                    case 27:
                        eVar.f306210t = y3Var.Gc();
                        break;
                    case 28:
                        eVar.f306204o = y3Var.Gc();
                        break;
                    case 29:
                        eVar.f306200m = y3Var.Gc();
                        break;
                    case 30:
                        eVar.f306192i = y3Var.J3();
                        break;
                    case 31:
                        eVar.X = y3Var.Gc();
                        break;
                    case 32:
                        eVar.f306211v = y3Var.Gc();
                        break;
                    case 33:
                        eVar.Z = y3Var.rc();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        y3Var.gd(iLogger, concurrentHashMap, strNa);
                        break;
                }
            }
            eVar.setUnknown(concurrentHashMap);
            y3Var.F1();
            return eVar;
        }
    }

    public enum b implements k2 {
        PORTRAIT,
        LANDSCAPE;

        public static final class a implements a2<b> {
            @Override // io.sentry.a2
            @NotNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
                return b.valueOf(y3Var.jc().toUpperCase(Locale.ROOT));
            }
        }

        @Override // io.sentry.k2
        public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
            z3Var.b(toString().toLowerCase(Locale.ROOT));
        }
    }

    public static final class c {
        public static final String A = "id";
        public static final String B = "connection_type";
        public static final String C = "battery_temperature";
        public static final String D = "locale";
        public static final String E = "processor_count";
        public static final String F = "cpu_description";
        public static final String G = "processor_frequency";
        public static final String H = "chipset";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f306213a = "name";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f306214b = "manufacturer";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f306215c = "brand";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f306216d = "family";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f306217e = "model";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f306218f = "model_id";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f306219g = "archs";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f306220h = "battery_level";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f306221i = "charging";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final String f306222j = "online";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final String f306223k = "orientation";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f306224l = "simulator";

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final String f306225m = "memory_size";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String f306226n = "free_memory";

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final String f306227o = "usable_memory";

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final String f306228p = "low_memory";

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final String f306229q = "storage_size";

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final String f306230r = "free_storage";

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final String f306231s = "external_storage_size";

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final String f306232t = "external_free_storage";

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final String f306233u = "screen_width_pixels";

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final String f306234v = "screen_height_pixels";

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final String f306235w = "screen_density";

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final String f306236x = "screen_dpi";

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final String f306237y = "boot_time";

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final String f306238z = "timezone";
    }

    public e() {
    }

    public void A0(@Nullable Long l10) {
        this.f306212w = l10;
    }

    public void B0(@Nullable String str) {
        this.f306185d = str;
    }

    public void C0(@Nullable Long l10) {
        this.f306202n = l10;
    }

    public void D0(@Nullable Long l10) {
        this.f306211v = l10;
    }

    public void E0(@Nullable String str) {
        this.f306189g3 = str;
    }

    public void F0(@Nullable String str) {
        this.f306191h3 = str;
    }

    public void G0(@Nullable Boolean bool) {
        this.f306209s = bool;
    }

    public void H0(@Nullable String str) {
        this.f306183b = str;
    }

    @Nullable
    public String[] I() {
        return this.f306188g;
    }

    public void I0(@Nullable Long l10) {
        this.f306200m = l10;
    }

    @Nullable
    public Float J() {
        return this.f306190h;
    }

    public void J0(@Nullable String str) {
        this.f306186e = str;
    }

    @Nullable
    public Float K() {
        return this.f306195j3;
    }

    public void K0(@Nullable String str) {
        this.f306187f = str;
    }

    @Nullable
    public Date L() {
        Date date = this.H1;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void L0(@Nullable String str) {
        this.f306182a = str;
    }

    @Nullable
    public String M() {
        return this.f306184c;
    }

    public void M0(@Nullable Boolean bool) {
        this.f306194j = bool;
    }

    @Nullable
    public String N() {
        return this.f306203n3;
    }

    public void N0(@Nullable b bVar) {
        this.f306196k = bVar;
    }

    @Nullable
    public String O() {
        return this.f306193i3;
    }

    public void O0(@Nullable Integer num) {
        this.f306197k3 = num;
    }

    @Nullable
    public String P() {
        return this.f306201m3;
    }

    public void P0(@Nullable Double d10) {
        this.f306199l3 = d10;
    }

    @Nullable
    public Long Q() {
        return this.X;
    }

    public void Q0(@Nullable Float f10) {
        this.f306206p0 = f10;
    }

    @Nullable
    public Long R() {
        return this.f306212w;
    }

    public void R0(@Nullable Integer num) {
        this.f306207p1 = num;
    }

    @Nullable
    public String S() {
        return this.f306185d;
    }

    public void S0(@Nullable Integer num) {
        this.Z = num;
    }

    @Nullable
    public Long T() {
        return this.f306202n;
    }

    public void T0(@Nullable Integer num) {
        this.Y = num;
    }

    @Nullable
    public Long U() {
        return this.f306211v;
    }

    public void U0(@Nullable Boolean bool) {
        this.f306198l = bool;
    }

    @Nullable
    public String V() {
        return this.f306189g3;
    }

    public void V0(@Nullable Long l10) {
        this.f306210t = l10;
    }

    @Nullable
    public String W() {
        return this.f306191h3;
    }

    public void W0(@Nullable TimeZone timeZone) {
        this.f306208p2 = timeZone;
    }

    @Nullable
    public String X() {
        return this.f306183b;
    }

    public void X0(@Nullable Long l10) {
        this.f306204o = l10;
    }

    @Nullable
    public Long Y() {
        return this.f306200m;
    }

    @Nullable
    public String Z() {
        return this.f306186e;
    }

    @Nullable
    public String a0() {
        return this.f306187f;
    }

    @Nullable
    public String b0() {
        return this.f306182a;
    }

    @Nullable
    public b c0() {
        return this.f306196k;
    }

    @Nullable
    public Integer d0() {
        return this.f306197k3;
    }

    @Nullable
    public Double e0() {
        return this.f306199l3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (io.sentry.util.y.a(this.f306182a, eVar.f306182a) && io.sentry.util.y.a(this.f306183b, eVar.f306183b) && io.sentry.util.y.a(this.f306184c, eVar.f306184c) && io.sentry.util.y.a(this.f306185d, eVar.f306185d) && io.sentry.util.y.a(this.f306186e, eVar.f306186e) && io.sentry.util.y.a(this.f306187f, eVar.f306187f) && Arrays.equals(this.f306188g, eVar.f306188g) && io.sentry.util.y.a(this.f306190h, eVar.f306190h) && io.sentry.util.y.a(this.f306192i, eVar.f306192i) && io.sentry.util.y.a(this.f306194j, eVar.f306194j) && this.f306196k == eVar.f306196k && io.sentry.util.y.a(this.f306198l, eVar.f306198l) && io.sentry.util.y.a(this.f306200m, eVar.f306200m) && io.sentry.util.y.a(this.f306202n, eVar.f306202n) && io.sentry.util.y.a(this.f306204o, eVar.f306204o) && io.sentry.util.y.a(this.f306209s, eVar.f306209s) && io.sentry.util.y.a(this.f306210t, eVar.f306210t) && io.sentry.util.y.a(this.f306211v, eVar.f306211v) && io.sentry.util.y.a(this.f306212w, eVar.f306212w) && io.sentry.util.y.a(this.X, eVar.X) && io.sentry.util.y.a(this.Y, eVar.Y) && io.sentry.util.y.a(this.Z, eVar.Z) && io.sentry.util.y.a(this.f306206p0, eVar.f306206p0) && io.sentry.util.y.a(this.f306207p1, eVar.f306207p1) && io.sentry.util.y.a(this.H1, eVar.H1) && io.sentry.util.y.a(this.f306189g3, eVar.f306189g3) && io.sentry.util.y.a(this.f306191h3, eVar.f306191h3) && io.sentry.util.y.a(this.f306193i3, eVar.f306193i3) && io.sentry.util.y.a(this.f306195j3, eVar.f306195j3) && io.sentry.util.y.a(this.f306197k3, eVar.f306197k3) && io.sentry.util.y.a(this.f306199l3, eVar.f306199l3) && io.sentry.util.y.a(this.f306201m3, eVar.f306201m3) && io.sentry.util.y.a(this.f306203n3, eVar.f306203n3)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public Float f0() {
        return this.f306206p0;
    }

    @Nullable
    public Integer g0() {
        return this.f306207p1;
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.f306205o3;
    }

    @Nullable
    public Integer h0() {
        return this.Z;
    }

    public int hashCode() {
        return (io.sentry.util.y.b(this.f306182a, this.f306183b, this.f306184c, this.f306185d, this.f306186e, this.f306187f, this.f306190h, this.f306192i, this.f306194j, this.f306196k, this.f306198l, this.f306200m, this.f306202n, this.f306204o, this.f306209s, this.f306210t, this.f306211v, this.f306212w, this.X, this.Y, this.Z, this.f306206p0, this.f306207p1, this.H1, this.f306208p2, this.f306189g3, this.f306191h3, this.f306193i3, this.f306195j3, this.f306197k3, this.f306199l3, this.f306201m3, this.f306203n3) * 31) + Arrays.hashCode(this.f306188g);
    }

    @Nullable
    public Integer i0() {
        return this.Y;
    }

    @Nullable
    public Long j0() {
        return this.f306210t;
    }

    @Nullable
    public TimeZone k0() {
        return this.f306208p2;
    }

    @Nullable
    public Long l0() {
        return this.f306204o;
    }

    @Nullable
    public Boolean m0() {
        return this.f306192i;
    }

    @Nullable
    public Boolean n0() {
        return this.f306209s;
    }

    @Nullable
    public Boolean o0() {
        return this.f306194j;
    }

    @Nullable
    public Boolean p0() {
        return this.f306198l;
    }

    public void q0(@Nullable String[] strArr) {
        this.f306188g = strArr;
    }

    public void r0(@Nullable Float f10) {
        this.f306190h = f10;
    }

    public void s0(@Nullable Float f10) {
        this.f306195j3 = f10;
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        if (this.f306182a != null) {
            z3Var.f("name").b(this.f306182a);
        }
        if (this.f306183b != null) {
            z3Var.f("manufacturer").b(this.f306183b);
        }
        if (this.f306184c != null) {
            z3Var.f(c.f306215c).b(this.f306184c);
        }
        if (this.f306185d != null) {
            z3Var.f(c.f306216d).b(this.f306185d);
        }
        if (this.f306186e != null) {
            z3Var.f("model").b(this.f306186e);
        }
        if (this.f306187f != null) {
            z3Var.f(c.f306218f).b(this.f306187f);
        }
        if (this.f306188g != null) {
            z3Var.f(c.f306219g).j(iLogger, this.f306188g);
        }
        if (this.f306190h != null) {
            z3Var.f(c.f306220h).i(this.f306190h);
        }
        if (this.f306192i != null) {
            z3Var.f(c.f306221i).k(this.f306192i);
        }
        if (this.f306194j != null) {
            z3Var.f("online").k(this.f306194j);
        }
        if (this.f306196k != null) {
            z3Var.f(c.f306223k).j(iLogger, this.f306196k);
        }
        if (this.f306198l != null) {
            z3Var.f(c.f306224l).k(this.f306198l);
        }
        if (this.f306200m != null) {
            z3Var.f("memory_size").i(this.f306200m);
        }
        if (this.f306202n != null) {
            z3Var.f(c.f306226n).i(this.f306202n);
        }
        if (this.f306204o != null) {
            z3Var.f(c.f306227o).i(this.f306204o);
        }
        if (this.f306209s != null) {
            z3Var.f(c.f306228p).k(this.f306209s);
        }
        if (this.f306210t != null) {
            z3Var.f(c.f306229q).i(this.f306210t);
        }
        if (this.f306211v != null) {
            z3Var.f(c.f306230r).i(this.f306211v);
        }
        if (this.f306212w != null) {
            z3Var.f(c.f306231s).i(this.f306212w);
        }
        if (this.X != null) {
            z3Var.f(c.f306232t).i(this.X);
        }
        if (this.Y != null) {
            z3Var.f(c.f306233u).i(this.Y);
        }
        if (this.Z != null) {
            z3Var.f(c.f306234v).i(this.Z);
        }
        if (this.f306206p0 != null) {
            z3Var.f(c.f306235w).i(this.f306206p0);
        }
        if (this.f306207p1 != null) {
            z3Var.f(c.f306236x).i(this.f306207p1);
        }
        if (this.H1 != null) {
            z3Var.f(c.f306237y).j(iLogger, this.H1);
        }
        if (this.f306208p2 != null) {
            z3Var.f("timezone").j(iLogger, this.f306208p2);
        }
        if (this.f306189g3 != null) {
            z3Var.f("id").b(this.f306189g3);
        }
        if (this.f306193i3 != null) {
            z3Var.f(c.B).b(this.f306193i3);
        }
        if (this.f306195j3 != null) {
            z3Var.f(c.C).i(this.f306195j3);
        }
        if (this.f306191h3 != null) {
            z3Var.f("locale").b(this.f306191h3);
        }
        if (this.f306197k3 != null) {
            z3Var.f(c.E).i(this.f306197k3);
        }
        if (this.f306199l3 != null) {
            z3Var.f(c.G).i(this.f306199l3);
        }
        if (this.f306201m3 != null) {
            z3Var.f(c.F).b(this.f306201m3);
        }
        if (this.f306203n3 != null) {
            z3Var.f(c.H).b(this.f306203n3);
        }
        Map<String, Object> map = this.f306205o3;
        if (map != null) {
            for (String str : map.keySet()) {
                z3Var.f(str).j(iLogger, this.f306205o3.get(str));
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.f306205o3 = map;
    }

    public void t0(@Nullable Date date) {
        this.H1 = date;
    }

    public void u0(@Nullable String str) {
        this.f306184c = str;
    }

    public void v0(@Nullable Boolean bool) {
        this.f306192i = bool;
    }

    public void w0(@Nullable String str) {
        this.f306203n3 = str;
    }

    public void x0(@Nullable String str) {
        this.f306193i3 = str;
    }

    public void y0(@Nullable String str) {
        this.f306201m3 = str;
    }

    public void z0(@Nullable Long l10) {
        this.X = l10;
    }

    e(@NotNull e eVar) {
        this.f306182a = eVar.f306182a;
        this.f306183b = eVar.f306183b;
        this.f306184c = eVar.f306184c;
        this.f306185d = eVar.f306185d;
        this.f306186e = eVar.f306186e;
        this.f306187f = eVar.f306187f;
        this.f306192i = eVar.f306192i;
        this.f306194j = eVar.f306194j;
        this.f306196k = eVar.f306196k;
        this.f306198l = eVar.f306198l;
        this.f306200m = eVar.f306200m;
        this.f306202n = eVar.f306202n;
        this.f306204o = eVar.f306204o;
        this.f306209s = eVar.f306209s;
        this.f306210t = eVar.f306210t;
        this.f306211v = eVar.f306211v;
        this.f306212w = eVar.f306212w;
        this.X = eVar.X;
        this.Y = eVar.Y;
        this.Z = eVar.Z;
        this.f306206p0 = eVar.f306206p0;
        this.f306207p1 = eVar.f306207p1;
        this.H1 = eVar.H1;
        this.f306189g3 = eVar.f306189g3;
        this.f306193i3 = eVar.f306193i3;
        this.f306195j3 = eVar.f306195j3;
        this.f306190h = eVar.f306190h;
        String[] strArr = eVar.f306188g;
        this.f306188g = strArr != null ? (String[]) strArr.clone() : null;
        this.f306191h3 = eVar.f306191h3;
        TimeZone timeZone = eVar.f306208p2;
        this.f306208p2 = timeZone != null ? (TimeZone) timeZone.clone() : null;
        this.f306197k3 = eVar.f306197k3;
        this.f306199l3 = eVar.f306199l3;
        this.f306201m3 = eVar.f306201m3;
        this.f306203n3 = eVar.f306203n3;
        this.f306205o3 = io.sentry.util.d.f(eVar.f306205o3);
    }
}
