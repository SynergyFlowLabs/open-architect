package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.k2;
import io.sentry.m2;
import io.sentry.y3;
import io.sentry.z3;
import io.sentry.z7;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class z implements m2, k2 {

    @Nullable
    private String X;

    @Nullable
    private Map<String, Object> Y;

    @Nullable
    private String Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private List<String> f306514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private List<String> f306515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f306516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private List<Integer> f306517d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private String f306518e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private String f306519f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private String f306520g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private Integer f306521h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private Integer f306522i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private String f306523j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private String f306524k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private Boolean f306525l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private String f306526m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private Boolean f306527n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    private String f306528o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    private z7 f306529p0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    private String f306530s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    private String f306531t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    private String f306532v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    private String f306533w;

    public static final class a implements a2<z> {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public z a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            z zVar = new z();
            y3Var.m1();
            ConcurrentHashMap concurrentHashMap = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                byte b10 = -1;
                switch (strNa.hashCode()) {
                    case -1641491184:
                        if (strNa.equals(b.f306553t)) {
                            b10 = 0;
                        }
                        break;
                    case -1443345323:
                        if (strNa.equals("image_addr")) {
                            b10 = 1;
                        }
                        break;
                    case -1184392185:
                        if (strNa.equals("in_app")) {
                            b10 = 2;
                        }
                        break;
                    case -1113875953:
                        if (strNa.equals(b.f306549p)) {
                            b10 = 3;
                        }
                        break;
                    case -1102671691:
                        if (strNa.equals(b.f306537d)) {
                            b10 = 4;
                        }
                        break;
                    case -1068784020:
                        if (strNa.equals("module")) {
                            b10 = 5;
                        }
                        break;
                    case -1052618729:
                        if (strNa.equals("native")) {
                            b10 = 6;
                        }
                        break;
                    case -887523944:
                        if (strNa.equals(b.f306550q)) {
                            b10 = 7;
                        }
                        break;
                    case -807062458:
                        if (strNa.equals(b.f306542i)) {
                            b10 = 8;
                        }
                        break;
                    case -734768633:
                        if (strNa.equals("filename")) {
                            b10 = 9;
                        }
                        break;
                    case -330260936:
                        if (strNa.equals(b.f306546m)) {
                            b10 = 10;
                        }
                        break;
                    case 3327275:
                        if (strNa.equals(b.f306551r)) {
                            b10 = 11;
                        }
                        break;
                    case 3612204:
                        if (strNa.equals(b.f306554u)) {
                            b10 = com.google.common.base.c.f116461n;
                        }
                        break;
                    case 94842689:
                        if (strNa.equals(b.f306538e)) {
                            b10 = com.google.common.base.c.f116462o;
                        }
                        break;
                    case 410194178:
                        if (strNa.equals(b.f306547n)) {
                            b10 = com.google.common.base.c.f116463p;
                        }
                        break;
                    case 822688787:
                        if (strNa.equals(b.f306552s)) {
                            b10 = com.google.common.base.c.f116464q;
                        }
                        break;
                    case 868820273:
                        if (strNa.equals(b.f306548o)) {
                            b10 = com.google.common.base.c.f116465r;
                        }
                        break;
                    case 1116694660:
                        if (strNa.equals(b.f306540g)) {
                            b10 = 17;
                        }
                        break;
                    case 1380938712:
                        if (strNa.equals(b.f306535b)) {
                            b10 = com.google.common.base.c.f116468u;
                        }
                        break;
                    case 1713445842:
                        if (strNa.equals(b.f306539f)) {
                            b10 = 19;
                        }
                        break;
                    case 1874684019:
                        if (strNa.equals("platform")) {
                            b10 = com.google.common.base.c.f116471x;
                        }
                        break;
                }
                switch (b10) {
                    case 0:
                        zVar.f306515b = (List) y3Var.re();
                        break;
                    case 1:
                        zVar.f306530s = y3Var.n6();
                        break;
                    case 2:
                        zVar.f306525l = y3Var.J3();
                        break;
                    case 3:
                        zVar.Z = y3Var.n6();
                        break;
                    case 4:
                        zVar.f306521h = y3Var.rc();
                        break;
                    case 5:
                        zVar.f306520g = y3Var.n6();
                        break;
                    case 6:
                        zVar.f306527n = y3Var.J3();
                        break;
                    case 7:
                        zVar.X = y3Var.n6();
                        break;
                    case 8:
                        zVar.f306526m = y3Var.n6();
                        break;
                    case 9:
                        zVar.f306518e = y3Var.n6();
                        break;
                    case 10:
                        zVar.f306531t = y3Var.n6();
                        break;
                    case 11:
                        zVar.f306529p0 = (z7) y3Var.i4(iLogger, new z7.a());
                        break;
                    case 12:
                        zVar.f306516c = (Map) y3Var.re();
                        break;
                    case 13:
                        zVar.f306522i = y3Var.rc();
                        break;
                    case 14:
                        zVar.f306532v = y3Var.n6();
                        break;
                    case 15:
                        zVar.f306514a = (List) y3Var.re();
                        break;
                    case 16:
                        zVar.f306533w = y3Var.n6();
                        break;
                    case 17:
                        zVar.f306524k = y3Var.n6();
                        break;
                    case 18:
                        zVar.f306519f = y3Var.n6();
                        break;
                    case 19:
                        zVar.f306523j = y3Var.n6();
                        break;
                    case 20:
                        zVar.f306528o = y3Var.n6();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        y3Var.gd(iLogger, concurrentHashMap, strNa);
                        break;
                }
            }
            zVar.setUnknown(concurrentHashMap);
            y3Var.F1();
            return zVar;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f306534a = "filename";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f306535b = "function";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f306536c = "module";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f306537d = "lineno";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f306538e = "colno";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f306539f = "abs_path";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f306540g = "context_line";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f306541h = "in_app";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f306542i = "package";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final String f306543j = "native";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final String f306544k = "platform";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f306545l = "image_addr";

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final String f306546m = "symbol_addr";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String f306547n = "instruction_addr";

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final String f306548o = "addr_mode";

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final String f306549p = "raw_function";

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final String f306550q = "symbol";

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final String f306551r = "lock";

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final String f306552s = "pre_context";

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final String f306553t = "post_context";

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final String f306554u = "vars";
    }

    @Nullable
    public List<Integer> A() {
        return this.f306517d;
    }

    @Nullable
    public String B() {
        return this.f306519f;
    }

    @Nullable
    public String C() {
        return this.f306530s;
    }

    @Nullable
    public String D() {
        return this.f306532v;
    }

    @Nullable
    public Integer E() {
        return this.f306521h;
    }

    @Nullable
    public z7 F() {
        return this.f306529p0;
    }

    @Nullable
    public String G() {
        return this.f306520g;
    }

    @Nullable
    public String H() {
        return this.f306526m;
    }

    @Nullable
    public String I() {
        return this.f306528o;
    }

    @Nullable
    public List<String> J() {
        return this.f306515b;
    }

    @Nullable
    public List<String> K() {
        return this.f306514a;
    }

    @Nullable
    public String L() {
        return this.Z;
    }

    @Nullable
    public String M() {
        return this.X;
    }

    @Nullable
    public String N() {
        return this.f306531t;
    }

    @Nullable
    public Map<String, Object> O() {
        return this.f306516c;
    }

    @Nullable
    public Boolean P() {
        return this.f306525l;
    }

    @Nullable
    public Boolean Q() {
        return this.f306527n;
    }

    public void R(@Nullable String str) {
        this.f306523j = str;
    }

    public void S(@Nullable String str) {
        this.f306533w = str;
    }

    public void T(@Nullable Integer num) {
        this.f306522i = num;
    }

    public void U(@Nullable String str) {
        this.f306524k = str;
    }

    public void V(@Nullable String str) {
        this.f306518e = str;
    }

    public void W(@Nullable List<Integer> list) {
        this.f306517d = list;
    }

    public void X(@Nullable String str) {
        this.f306519f = str;
    }

    public void Y(@Nullable String str) {
        this.f306530s = str;
    }

    public void Z(@Nullable Boolean bool) {
        this.f306525l = bool;
    }

    public void a0(@Nullable String str) {
        this.f306532v = str;
    }

    public void b0(@Nullable Integer num) {
        this.f306521h = num;
    }

    public void c0(@Nullable z7 z7Var) {
        this.f306529p0 = z7Var;
    }

    public void d0(@Nullable String str) {
        this.f306520g = str;
    }

    public void e0(@Nullable Boolean bool) {
        this.f306527n = bool;
    }

    public boolean equals(Object obj) {
        if (obj != null && z.class == obj.getClass()) {
            z zVar = (z) obj;
            if (Objects.equals(this.f306514a, zVar.f306514a) && Objects.equals(this.f306515b, zVar.f306515b) && Objects.equals(this.f306516c, zVar.f306516c) && Objects.equals(this.f306517d, zVar.f306517d) && Objects.equals(this.f306518e, zVar.f306518e) && Objects.equals(this.f306519f, zVar.f306519f) && Objects.equals(this.f306520g, zVar.f306520g) && Objects.equals(this.f306521h, zVar.f306521h) && Objects.equals(this.f306522i, zVar.f306522i) && Objects.equals(this.f306523j, zVar.f306523j) && Objects.equals(this.f306524k, zVar.f306524k) && Objects.equals(this.f306525l, zVar.f306525l) && Objects.equals(this.f306526m, zVar.f306526m) && Objects.equals(this.f306527n, zVar.f306527n) && Objects.equals(this.f306528o, zVar.f306528o) && Objects.equals(this.f306530s, zVar.f306530s) && Objects.equals(this.f306531t, zVar.f306531t) && Objects.equals(this.f306532v, zVar.f306532v) && Objects.equals(this.f306533w, zVar.f306533w) && Objects.equals(this.X, zVar.X) && Objects.equals(this.Y, zVar.Y) && Objects.equals(this.Z, zVar.Z) && Objects.equals(this.f306529p0, zVar.f306529p0)) {
                return true;
            }
        }
        return false;
    }

    public void f0(@Nullable String str) {
        this.f306526m = str;
    }

    public void g0(@Nullable String str) {
        this.f306528o = str;
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.Y;
    }

    public void h0(@Nullable List<String> list) {
        this.f306515b = list;
    }

    public int hashCode() {
        return Objects.hash(this.f306514a, this.f306515b, this.f306516c, this.f306517d, this.f306518e, this.f306519f, this.f306520g, this.f306521h, this.f306522i, this.f306523j, this.f306524k, this.f306525l, this.f306526m, this.f306527n, this.f306528o, this.f306530s, this.f306531t, this.f306532v, this.f306533w, this.X, this.Y, this.Z, this.f306529p0);
    }

    public void i0(@Nullable List<String> list) {
        this.f306514a = list;
    }

    public void j0(@Nullable String str) {
        this.Z = str;
    }

    public void k0(@Nullable String str) {
        this.X = str;
    }

    public void l0(@Nullable String str) {
        this.f306531t = str;
    }

    public void m0(@Nullable Map<String, Object> map) {
        this.f306516c = map;
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        if (this.f306518e != null) {
            z3Var.f("filename").b(this.f306518e);
        }
        if (this.f306519f != null) {
            z3Var.f(b.f306535b).b(this.f306519f);
        }
        if (this.f306520g != null) {
            z3Var.f("module").b(this.f306520g);
        }
        if (this.f306521h != null) {
            z3Var.f(b.f306537d).i(this.f306521h);
        }
        if (this.f306522i != null) {
            z3Var.f(b.f306538e).i(this.f306522i);
        }
        if (this.f306523j != null) {
            z3Var.f(b.f306539f).b(this.f306523j);
        }
        if (this.f306524k != null) {
            z3Var.f(b.f306540g).b(this.f306524k);
        }
        if (this.f306525l != null) {
            z3Var.f("in_app").k(this.f306525l);
        }
        if (this.f306526m != null) {
            z3Var.f(b.f306542i).b(this.f306526m);
        }
        if (this.f306527n != null) {
            z3Var.f("native").k(this.f306527n);
        }
        if (this.f306528o != null) {
            z3Var.f("platform").b(this.f306528o);
        }
        if (this.f306530s != null) {
            z3Var.f("image_addr").b(this.f306530s);
        }
        if (this.f306531t != null) {
            z3Var.f(b.f306546m).b(this.f306531t);
        }
        if (this.f306532v != null) {
            z3Var.f(b.f306547n).b(this.f306532v);
        }
        if (this.f306533w != null) {
            z3Var.f(b.f306548o).b(this.f306533w);
        }
        if (this.Z != null) {
            z3Var.f(b.f306549p).b(this.Z);
        }
        if (this.X != null) {
            z3Var.f(b.f306550q).b(this.X);
        }
        if (this.f306529p0 != null) {
            z3Var.f(b.f306551r).j(iLogger, this.f306529p0);
        }
        List<String> list = this.f306514a;
        if (list != null && !list.isEmpty()) {
            z3Var.f(b.f306552s).j(iLogger, this.f306514a);
        }
        List<String> list2 = this.f306515b;
        if (list2 != null && !list2.isEmpty()) {
            z3Var.f(b.f306553t).j(iLogger, this.f306515b);
        }
        Map<String, Object> map = this.f306516c;
        if (map != null && !map.isEmpty()) {
            z3Var.f(b.f306554u).j(iLogger, this.f306516c);
        }
        Map<String, Object> map2 = this.Y;
        if (map2 != null) {
            for (String str : map2.keySet()) {
                Object obj = this.Y.get(str);
                z3Var.f(str);
                z3Var.j(iLogger, obj);
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.Y = map;
    }

    @Nullable
    public String v() {
        return this.f306523j;
    }

    @Nullable
    public String w() {
        return this.f306533w;
    }

    @Nullable
    public Integer x() {
        return this.f306522i;
    }

    @Nullable
    public String y() {
        return this.f306524k;
    }

    @Nullable
    public String z() {
        return this.f306518e;
    }
}
