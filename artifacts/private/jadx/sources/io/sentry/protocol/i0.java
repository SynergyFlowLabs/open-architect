package io.sentry.protocol;

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
public final class i0 implements m2, k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private String f306316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private String f306317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private String f306318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private String f306319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private Double f306320e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private Double f306321f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private Double f306322g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private Double f306323h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private String f306324i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private Double f306325j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private List<i0> f306326k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f306327l;

    public static final class a implements a2<i0> {
        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i0 a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            i0 i0Var = new i0();
            y3Var.m1();
            HashMap map = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                switch (strNa) {
                    case "rendering_system":
                        i0Var.f306316a = y3Var.n6();
                        break;
                    case "identifier":
                        i0Var.f306318c = y3Var.n6();
                        break;
                    case "height":
                        i0Var.f306321f = y3Var.ia();
                        break;
                    case "x":
                        i0Var.f306322g = y3Var.ia();
                        break;
                    case "y":
                        i0Var.f306323h = y3Var.ia();
                        break;
                    case "tag":
                        i0Var.f306319d = y3Var.n6();
                        break;
                    case "type":
                        i0Var.f306317b = y3Var.n6();
                        break;
                    case "alpha":
                        i0Var.f306325j = y3Var.ia();
                        break;
                    case "width":
                        i0Var.f306320e = y3Var.ia();
                        break;
                    case "children":
                        i0Var.f306326k = y3Var.p8(iLogger, this);
                        break;
                    case "visibility":
                        i0Var.f306324i = y3Var.n6();
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
            i0Var.setUnknown(map);
            return i0Var;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f306328a = "rendering_system";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f306329b = "type";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f306330c = "identifier";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f306331d = "tag";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f306332e = "width";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f306333f = "height";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f306334g = "x";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f306335h = "y";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f306336i = "visibility";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final String f306337j = "alpha";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final String f306338k = "children";
    }

    public void A(String str) {
        this.f306316a = str;
    }

    public void B(@Nullable String str) {
        this.f306319d = str;
    }

    public void C(String str) {
        this.f306317b = str;
    }

    public void D(@Nullable String str) {
        this.f306324i = str;
    }

    public void E(@Nullable Double d10) {
        this.f306320e = d10;
    }

    public void F(@Nullable Double d10) {
        this.f306322g = d10;
    }

    public void G(@Nullable Double d10) {
        this.f306323h = d10;
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.f306327l;
    }

    @Nullable
    public Double l() {
        return this.f306325j;
    }

    @Nullable
    public List<i0> m() {
        return this.f306326k;
    }

    @Nullable
    public Double n() {
        return this.f306321f;
    }

    @Nullable
    public String o() {
        return this.f306318c;
    }

    @Nullable
    public String p() {
        return this.f306316a;
    }

    @Nullable
    public String q() {
        return this.f306319d;
    }

    @Nullable
    public String r() {
        return this.f306317b;
    }

    @Nullable
    public String s() {
        return this.f306324i;
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        if (this.f306316a != null) {
            z3Var.f("rendering_system").b(this.f306316a);
        }
        if (this.f306317b != null) {
            z3Var.f("type").b(this.f306317b);
        }
        if (this.f306318c != null) {
            z3Var.f("identifier").b(this.f306318c);
        }
        if (this.f306319d != null) {
            z3Var.f("tag").b(this.f306319d);
        }
        if (this.f306320e != null) {
            z3Var.f("width").i(this.f306320e);
        }
        if (this.f306321f != null) {
            z3Var.f("height").i(this.f306321f);
        }
        if (this.f306322g != null) {
            z3Var.f("x").i(this.f306322g);
        }
        if (this.f306323h != null) {
            z3Var.f("y").i(this.f306323h);
        }
        if (this.f306324i != null) {
            z3Var.f("visibility").b(this.f306324i);
        }
        if (this.f306325j != null) {
            z3Var.f("alpha").i(this.f306325j);
        }
        List<i0> list = this.f306326k;
        if (list != null && !list.isEmpty()) {
            z3Var.f(b.f306338k).j(iLogger, this.f306326k);
        }
        Map<String, Object> map = this.f306327l;
        if (map != null) {
            for (String str : map.keySet()) {
                z3Var.f(str).j(iLogger, this.f306327l.get(str));
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.f306327l = map;
    }

    @Nullable
    public Double t() {
        return this.f306320e;
    }

    @Nullable
    public Double u() {
        return this.f306322g;
    }

    @Nullable
    public Double v() {
        return this.f306323h;
    }

    public void w(@Nullable Double d10) {
        this.f306325j = d10;
    }

    public void x(@Nullable List<i0> list) {
        this.f306326k = list;
    }

    public void y(@Nullable Double d10) {
        this.f306321f = d10;
    }

    public void z(@Nullable String str) {
        this.f306318c = str;
    }
}
