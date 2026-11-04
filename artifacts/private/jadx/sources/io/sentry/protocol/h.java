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
public final class h implements m2, k2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f306278k = "gpu";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private String f306279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private Integer f306280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private String f306281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private String f306282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private Integer f306283e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private String f306284f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private Boolean f306285g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private String f306286h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private String f306287i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f306288j;

    public static final class a implements a2<h> {
        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public h a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            y3Var.m1();
            h hVar = new h();
            ConcurrentHashMap concurrentHashMap = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                switch (strNa) {
                    case "npot_support":
                        hVar.f306287i = y3Var.n6();
                        break;
                    case "vendor_id":
                        hVar.f306281c = y3Var.n6();
                        break;
                    case "multi_threaded_rendering":
                        hVar.f306285g = y3Var.J3();
                        break;
                    case "id":
                        hVar.f306280b = y3Var.rc();
                        break;
                    case "name":
                        hVar.f306279a = y3Var.n6();
                        break;
                    case "vendor_name":
                        hVar.f306282d = y3Var.n6();
                        break;
                    case "version":
                        hVar.f306286h = y3Var.n6();
                        break;
                    case "api_type":
                        hVar.f306284f = y3Var.n6();
                        break;
                    case "memory_size":
                        hVar.f306283e = y3Var.rc();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        y3Var.gd(iLogger, concurrentHashMap, strNa);
                        break;
                }
            }
            hVar.setUnknown(concurrentHashMap);
            y3Var.F1();
            return hVar;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f306289a = "name";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f306290b = "id";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f306291c = "vendor_id";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f306292d = "vendor_name";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f306293e = "memory_size";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f306294f = "api_type";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f306295g = "multi_threaded_rendering";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f306296h = "version";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f306297i = "npot_support";
    }

    public h() {
    }

    public void A(@Nullable String str) {
        this.f306286h = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h.class == obj.getClass()) {
            h hVar = (h) obj;
            if (io.sentry.util.y.a(this.f306279a, hVar.f306279a) && io.sentry.util.y.a(this.f306280b, hVar.f306280b) && io.sentry.util.y.a(this.f306281c, hVar.f306281c) && io.sentry.util.y.a(this.f306282d, hVar.f306282d) && io.sentry.util.y.a(this.f306283e, hVar.f306283e) && io.sentry.util.y.a(this.f306284f, hVar.f306284f) && io.sentry.util.y.a(this.f306285g, hVar.f306285g) && io.sentry.util.y.a(this.f306286h, hVar.f306286h) && io.sentry.util.y.a(this.f306287i, hVar.f306287i)) {
                return true;
            }
        }
        return false;
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.f306288j;
    }

    public int hashCode() {
        return io.sentry.util.y.b(this.f306279a, this.f306280b, this.f306281c, this.f306282d, this.f306283e, this.f306284f, this.f306285g, this.f306286h, this.f306287i);
    }

    @Nullable
    public String j() {
        return this.f306284f;
    }

    @Nullable
    public Integer k() {
        return this.f306280b;
    }

    @Nullable
    public Integer l() {
        return this.f306283e;
    }

    @Nullable
    public String m() {
        return this.f306279a;
    }

    @Nullable
    public String n() {
        return this.f306287i;
    }

    @Nullable
    public String o() {
        return this.f306281c;
    }

    @Nullable
    public String p() {
        return this.f306282d;
    }

    @Nullable
    public String q() {
        return this.f306286h;
    }

    @Nullable
    public Boolean r() {
        return this.f306285g;
    }

    public void s(@Nullable String str) {
        this.f306284f = str;
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        if (this.f306279a != null) {
            z3Var.f("name").b(this.f306279a);
        }
        if (this.f306280b != null) {
            z3Var.f("id").i(this.f306280b);
        }
        if (this.f306281c != null) {
            z3Var.f(b.f306291c).b(this.f306281c);
        }
        if (this.f306282d != null) {
            z3Var.f(b.f306292d).b(this.f306282d);
        }
        if (this.f306283e != null) {
            z3Var.f("memory_size").i(this.f306283e);
        }
        if (this.f306284f != null) {
            z3Var.f(b.f306294f).b(this.f306284f);
        }
        if (this.f306285g != null) {
            z3Var.f(b.f306295g).k(this.f306285g);
        }
        if (this.f306286h != null) {
            z3Var.f("version").b(this.f306286h);
        }
        if (this.f306287i != null) {
            z3Var.f(b.f306297i).b(this.f306287i);
        }
        Map<String, Object> map = this.f306288j;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f306288j.get(str);
                z3Var.f(str);
                z3Var.j(iLogger, obj);
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.f306288j = map;
    }

    public void t(Integer num) {
        this.f306280b = num;
    }

    public void u(@Nullable Integer num) {
        this.f306283e = num;
    }

    public void v(@Nullable Boolean bool) {
        this.f306285g = bool;
    }

    public void w(String str) {
        this.f306279a = str;
    }

    public void x(@Nullable String str) {
        this.f306287i = str;
    }

    public void y(@Nullable String str) {
        this.f306281c = str;
    }

    public void z(@Nullable String str) {
        this.f306282d = str;
    }

    h(@NotNull h hVar) {
        this.f306279a = hVar.f306279a;
        this.f306280b = hVar.f306280b;
        this.f306281c = hVar.f306281c;
        this.f306282d = hVar.f306282d;
        this.f306283e = hVar.f306283e;
        this.f306284f = hVar.f306284f;
        this.f306285g = hVar.f306285g;
        this.f306286h = hVar.f306286h;
        this.f306287i = hVar.f306287i;
        this.f306288j = io.sentry.util.d.f(hVar.f306288j);
    }
}
