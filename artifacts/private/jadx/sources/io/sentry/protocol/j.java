package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.k2;
import io.sentry.m2;
import io.sentry.y3;
import io.sentry.z3;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class j implements m2, k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final transient Thread f306339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private String f306340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private String f306341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private String f306342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private Boolean f306343e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f306344f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f306345g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private Boolean f306346h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private Integer f306347i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private Integer f306348j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private Boolean f306349k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f306350l;

    public static final class a implements a2<j> {
        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public j a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            j jVar = new j();
            y3Var.m1();
            HashMap map = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                switch (strNa) {
                    case "description":
                        jVar.f306341c = y3Var.n6();
                        break;
                    case "exception_id":
                        jVar.f306347i = y3Var.rc();
                        break;
                    case "data":
                        jVar.f306345g = io.sentry.util.d.f((Map) y3Var.re());
                        break;
                    case "meta":
                        jVar.f306344f = io.sentry.util.d.f((Map) y3Var.re());
                        break;
                    case "type":
                        jVar.f306340b = y3Var.n6();
                        break;
                    case "handled":
                        jVar.f306343e = y3Var.J3();
                        break;
                    case "synthetic":
                        jVar.f306346h = y3Var.J3();
                        break;
                    case "is_exception_group":
                        jVar.f306349k = y3Var.J3();
                        break;
                    case "help_link":
                        jVar.f306342d = y3Var.n6();
                        break;
                    case "parent_id":
                        jVar.f306348j = y3Var.rc();
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
            jVar.setUnknown(map);
            return jVar;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f306351a = "type";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f306352b = "description";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f306353c = "help_link";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f306354d = "handled";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f306355e = "meta";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f306356f = "data";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f306357g = "synthetic";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f306358h = "exception_id";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f306359i = "parent_id";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final String f306360j = "is_exception_group";
    }

    public j() {
        this(null);
    }

    public void A(@Nullable String str) {
        this.f306342d = str;
    }

    public void B(@Nullable Map<String, Object> map) {
        this.f306344f = io.sentry.util.d.g(map);
    }

    public void C(@Nullable Integer num) {
        this.f306348j = num;
    }

    public void D(@Nullable Boolean bool) {
        this.f306346h = bool;
    }

    public void E(@Nullable String str) {
        this.f306340b = str;
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.f306350l;
    }

    @Nullable
    public Map<String, Object> k() {
        return this.f306345g;
    }

    @Nullable
    public String l() {
        return this.f306341c;
    }

    @Nullable
    public Integer m() {
        return this.f306347i;
    }

    @Nullable
    public String n() {
        return this.f306342d;
    }

    @Nullable
    public Map<String, Object> o() {
        return this.f306344f;
    }

    @Nullable
    public Integer p() {
        return this.f306348j;
    }

    @Nullable
    public Boolean q() {
        return this.f306346h;
    }

    @Nullable
    Thread r() {
        return this.f306339a;
    }

    @Nullable
    public String s() {
        return this.f306340b;
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        if (this.f306340b != null) {
            z3Var.f("type").b(this.f306340b);
        }
        if (this.f306341c != null) {
            z3Var.f("description").b(this.f306341c);
        }
        if (this.f306342d != null) {
            z3Var.f(b.f306353c).b(this.f306342d);
        }
        if (this.f306343e != null) {
            z3Var.f(b.f306354d).k(this.f306343e);
        }
        if (this.f306344f != null) {
            z3Var.f(b.f306355e).j(iLogger, this.f306344f);
        }
        if (this.f306345g != null) {
            z3Var.f("data").j(iLogger, this.f306345g);
        }
        if (this.f306346h != null) {
            z3Var.f(b.f306357g).k(this.f306346h);
        }
        if (this.f306347i != null) {
            z3Var.f(b.f306358h).j(iLogger, this.f306347i);
        }
        if (this.f306348j != null) {
            z3Var.f(b.f306359i).j(iLogger, this.f306348j);
        }
        if (this.f306349k != null) {
            z3Var.f(b.f306360j).k(this.f306349k);
        }
        Map<String, Object> map = this.f306350l;
        if (map != null) {
            for (String str : map.keySet()) {
                z3Var.f(str).j(iLogger, this.f306350l.get(str));
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.f306350l = map;
    }

    @Nullable
    public Boolean t() {
        return this.f306349k;
    }

    @Nullable
    public Boolean u() {
        return this.f306343e;
    }

    public void v(@Nullable Map<String, Object> map) {
        this.f306345g = io.sentry.util.d.g(map);
    }

    public void w(@Nullable String str) {
        this.f306341c = str;
    }

    public void x(@Nullable Boolean bool) {
        this.f306349k = bool;
    }

    public void y(@Nullable Integer num) {
        this.f306347i = num;
    }

    public void z(@Nullable Boolean bool) {
        this.f306343e = bool;
    }

    public j(@Nullable Thread thread) {
        this.f306339a = thread;
    }
}
