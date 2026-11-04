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
public final class o implements m2, k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private String f306417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private Integer f306418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Integer f306419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private Integer f306420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f306421e;

    public static final class a implements a2<o> {
        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public o a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            o oVar = new o();
            y3Var.m1();
            HashMap map = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                switch (strNa) {
                    case "sdk_name":
                        oVar.f306417a = y3Var.n6();
                        break;
                    case "version_patchlevel":
                        oVar.f306420d = y3Var.rc();
                        break;
                    case "version_major":
                        oVar.f306418b = y3Var.rc();
                        break;
                    case "version_minor":
                        oVar.f306419c = y3Var.rc();
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
            oVar.setUnknown(map);
            return oVar;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f306422a = "sdk_name";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f306423b = "version_major";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f306424c = "version_minor";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f306425d = "version_patchlevel";
    }

    @Nullable
    public String e() {
        return this.f306417a;
    }

    @Nullable
    public Integer f() {
        return this.f306418b;
    }

    @Nullable
    public Integer g() {
        return this.f306419c;
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.f306421e;
    }

    @Nullable
    public Integer h() {
        return this.f306420d;
    }

    public void i(@Nullable String str) {
        this.f306417a = str;
    }

    public void j(@Nullable Integer num) {
        this.f306418b = num;
    }

    public void k(@Nullable Integer num) {
        this.f306419c = num;
    }

    public void l(@Nullable Integer num) {
        this.f306420d = num;
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        if (this.f306417a != null) {
            z3Var.f(b.f306422a).b(this.f306417a);
        }
        if (this.f306418b != null) {
            z3Var.f(b.f306423b).i(this.f306418b);
        }
        if (this.f306419c != null) {
            z3Var.f(b.f306424c).i(this.f306419c);
        }
        if (this.f306420d != null) {
            z3Var.f(b.f306425d).i(this.f306420d);
        }
        Map<String, Object> map = this.f306421e;
        if (map != null) {
            for (String str : map.keySet()) {
                z3Var.f(str).j(iLogger, this.f306421e.get(str));
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.f306421e = map;
    }
}
