package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.k2;
import io.sentry.m2;
import io.sentry.y3;
import io.sentry.z3;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements m2, k2 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f306094o = "app";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private String f306095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private Date f306096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private String f306097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private String f306098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private String f306099e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private String f306100f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private String f306101g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private Map<String, String> f306102h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private List<String> f306103i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private String f306104j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private Boolean f306105k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private Boolean f306106l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private List<String> f306107m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f306108n;

    /* JADX INFO: renamed from: io.sentry.protocol.a$a, reason: collision with other inner class name */
    public static final class C2227a implements a2<a> {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            y3Var.m1();
            a aVar = new a();
            ConcurrentHashMap concurrentHashMap = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                byte b10 = -1;
                switch (strNa.hashCode()) {
                    case -1950148125:
                        if (strNa.equals(b.f306121m)) {
                            b10 = 0;
                        }
                        break;
                    case -1898053579:
                        if (strNa.equals(b.f306111c)) {
                            b10 = 1;
                        }
                        break;
                    case -1573129993:
                        if (strNa.equals(b.f306119k)) {
                            b10 = 2;
                        }
                        break;
                    case -1524619986:
                        if (strNa.equals(b.f306118j)) {
                            b10 = 3;
                        }
                        break;
                    case -901870406:
                        if (strNa.equals(b.f306114f)) {
                            b10 = 4;
                        }
                        break;
                    case -650544995:
                        if (strNa.equals(b.f306117i)) {
                            b10 = 5;
                        }
                        break;
                    case -470395285:
                        if (strNa.equals(b.f306112d)) {
                            b10 = 6;
                        }
                        break;
                    case 746297735:
                        if (strNa.equals(b.f306109a)) {
                            b10 = 7;
                        }
                        break;
                    case 791585128:
                        if (strNa.equals(b.f306110b)) {
                            b10 = 8;
                        }
                        break;
                    case 1133704324:
                        if (strNa.equals("permissions")) {
                            b10 = 9;
                        }
                        break;
                    case 1167648233:
                        if (strNa.equals("app_name")) {
                            b10 = 10;
                        }
                        break;
                    case 1826866896:
                        if (strNa.equals(b.f306115g)) {
                            b10 = 11;
                        }
                        break;
                    case 1965003281:
                        if (strNa.equals(b.f306120l)) {
                            b10 = com.google.common.base.c.f116461n;
                        }
                        break;
                }
                switch (b10) {
                    case 0:
                        List<String> list = (List) y3Var.re();
                        if (list != null) {
                            aVar.I(list);
                        }
                        break;
                    case 1:
                        aVar.f306097c = y3Var.n6();
                        break;
                    case 2:
                        aVar.f306104j = y3Var.n6();
                        break;
                    case 3:
                        List<String> list2 = (List) y3Var.re();
                        if (list2 != null) {
                            aVar.K(list2);
                        }
                        break;
                    case 4:
                        aVar.f306100f = y3Var.n6();
                        break;
                    case 5:
                        aVar.f306105k = y3Var.J3();
                        break;
                    case 6:
                        aVar.f306098d = y3Var.n6();
                        break;
                    case 7:
                        aVar.f306095a = y3Var.n6();
                        break;
                    case 8:
                        aVar.f306096b = y3Var.z3(iLogger);
                        break;
                    case 9:
                        aVar.f306102h = io.sentry.util.d.f((Map) y3Var.re());
                        break;
                    case 10:
                        aVar.f306099e = y3Var.n6();
                        break;
                    case 11:
                        aVar.f306101g = y3Var.n6();
                        break;
                    case 12:
                        aVar.f306106l = y3Var.J3();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        y3Var.gd(iLogger, concurrentHashMap, strNa);
                        break;
                }
            }
            aVar.setUnknown(concurrentHashMap);
            y3Var.F1();
            return aVar;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f306109a = "app_identifier";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f306110b = "app_start_time";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f306111c = "device_app_hash";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f306112d = "build_type";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f306113e = "app_name";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f306114f = "app_version";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f306115g = "app_build";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f306116h = "permissions";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f306117i = "in_foreground";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final String f306118j = "view_names";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final String f306119k = "start_type";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f306120l = "is_split_apks";

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final String f306121m = "split_names";
    }

    public a() {
    }

    public void A(@Nullable String str) {
        this.f306099e = str;
    }

    public void B(@Nullable Date date) {
        this.f306096b = date;
    }

    public void C(@Nullable String str) {
        this.f306100f = str;
    }

    public void D(@Nullable String str) {
        this.f306098d = str;
    }

    public void E(@Nullable String str) {
        this.f306097c = str;
    }

    public void F(@Nullable Boolean bool) {
        this.f306105k = bool;
    }

    public void G(@Nullable Map<String, String> map) {
        this.f306102h = map;
    }

    public void H(@Nullable Boolean bool) {
        this.f306106l = bool;
    }

    public void I(@Nullable List<String> list) {
        this.f306107m = list;
    }

    public void J(@Nullable String str) {
        this.f306104j = str;
    }

    public void K(@Nullable List<String> list) {
        this.f306103i = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (io.sentry.util.y.a(this.f306095a, aVar.f306095a) && io.sentry.util.y.a(this.f306096b, aVar.f306096b) && io.sentry.util.y.a(this.f306097c, aVar.f306097c) && io.sentry.util.y.a(this.f306098d, aVar.f306098d) && io.sentry.util.y.a(this.f306099e, aVar.f306099e) && io.sentry.util.y.a(this.f306100f, aVar.f306100f) && io.sentry.util.y.a(this.f306101g, aVar.f306101g) && io.sentry.util.y.a(this.f306102h, aVar.f306102h) && io.sentry.util.y.a(this.f306105k, aVar.f306105k) && io.sentry.util.y.a(this.f306103i, aVar.f306103i) && io.sentry.util.y.a(this.f306104j, aVar.f306104j) && io.sentry.util.y.a(this.f306106l, aVar.f306106l) && io.sentry.util.y.a(this.f306107m, aVar.f306107m)) {
                return true;
            }
        }
        return false;
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.f306108n;
    }

    public int hashCode() {
        return io.sentry.util.y.b(this.f306095a, this.f306096b, this.f306097c, this.f306098d, this.f306099e, this.f306100f, this.f306101g, this.f306102h, this.f306105k, this.f306103i, this.f306104j, this.f306106l, this.f306107m);
    }

    @Nullable
    public String l() {
        return this.f306101g;
    }

    @Nullable
    public String m() {
        return this.f306095a;
    }

    @Nullable
    public String n() {
        return this.f306099e;
    }

    @Nullable
    public Date o() {
        Date date = this.f306096b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    @Nullable
    public String p() {
        return this.f306100f;
    }

    @Nullable
    public String q() {
        return this.f306098d;
    }

    @Nullable
    public String r() {
        return this.f306097c;
    }

    @Nullable
    public Boolean s() {
        return this.f306105k;
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        if (this.f306095a != null) {
            z3Var.f(b.f306109a).b(this.f306095a);
        }
        if (this.f306096b != null) {
            z3Var.f(b.f306110b).j(iLogger, this.f306096b);
        }
        if (this.f306097c != null) {
            z3Var.f(b.f306111c).b(this.f306097c);
        }
        if (this.f306098d != null) {
            z3Var.f(b.f306112d).b(this.f306098d);
        }
        if (this.f306099e != null) {
            z3Var.f("app_name").b(this.f306099e);
        }
        if (this.f306100f != null) {
            z3Var.f(b.f306114f).b(this.f306100f);
        }
        if (this.f306101g != null) {
            z3Var.f(b.f306115g).b(this.f306101g);
        }
        Map<String, String> map = this.f306102h;
        if (map != null && !map.isEmpty()) {
            z3Var.f("permissions").j(iLogger, this.f306102h);
        }
        if (this.f306105k != null) {
            z3Var.f(b.f306117i).k(this.f306105k);
        }
        if (this.f306103i != null) {
            z3Var.f(b.f306118j).j(iLogger, this.f306103i);
        }
        if (this.f306104j != null) {
            z3Var.f(b.f306119k).b(this.f306104j);
        }
        if (this.f306106l != null) {
            z3Var.f(b.f306120l).k(this.f306106l);
        }
        List<String> list = this.f306107m;
        if (list != null && !list.isEmpty()) {
            z3Var.f(b.f306121m).j(iLogger, this.f306107m);
        }
        Map<String, Object> map2 = this.f306108n;
        if (map2 != null) {
            for (String str : map2.keySet()) {
                z3Var.f(str).j(iLogger, this.f306108n.get(str));
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.f306108n = map;
    }

    @Nullable
    public Map<String, String> t() {
        return this.f306102h;
    }

    @Nullable
    public Boolean u() {
        return this.f306106l;
    }

    @Nullable
    public List<String> v() {
        return this.f306107m;
    }

    @Nullable
    public String w() {
        return this.f306104j;
    }

    @Nullable
    public List<String> x() {
        return this.f306103i;
    }

    public void y(@Nullable String str) {
        this.f306101g = str;
    }

    public void z(@Nullable String str) {
        this.f306095a = str;
    }

    a(@NotNull a aVar) {
        this.f306101g = aVar.f306101g;
        this.f306095a = aVar.f306095a;
        this.f306099e = aVar.f306099e;
        this.f306096b = aVar.f306096b;
        this.f306100f = aVar.f306100f;
        this.f306098d = aVar.f306098d;
        this.f306097c = aVar.f306097c;
        this.f306102h = io.sentry.util.d.f(aVar.f306102h);
        this.f306105k = aVar.f306105k;
        this.f306103i = io.sentry.util.d.e(aVar.f306103i);
        this.f306104j = aVar.f306104j;
        this.f306106l = aVar.f306106l;
        this.f306107m = aVar.f306107m;
        this.f306108n = io.sentry.util.d.f(aVar.f306108n);
    }
}
