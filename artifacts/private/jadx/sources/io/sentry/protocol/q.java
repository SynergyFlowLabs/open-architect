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
public final class q implements m2, k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private String f306456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private String f306457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private String f306458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private Long f306459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private a0 f306460e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private j f306461f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f306462g;

    public static final class a implements a2<q> {
        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public q a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            q qVar = new q();
            y3Var.m1();
            HashMap map = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                int i10 = 4 & (-1);
                switch (strNa) {
                    case "thread_id":
                        qVar.f306459d = y3Var.Gc();
                        break;
                    case "module":
                        qVar.f306458c = y3Var.n6();
                        break;
                    case "type":
                        qVar.f306456a = y3Var.n6();
                        break;
                    case "value":
                        qVar.f306457b = y3Var.n6();
                        break;
                    case "mechanism":
                        qVar.f306461f = (j) y3Var.i4(iLogger, new j.a());
                        break;
                    case "stacktrace":
                        qVar.f306460e = (a0) y3Var.i4(iLogger, new a0.a());
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
            qVar.setUnknown(map);
            return qVar;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f306463a = "type";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f306464b = "value";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f306465c = "module";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f306466d = "thread_id";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f306467e = "stacktrace";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f306468f = "mechanism";
    }

    @Nullable
    public j g() {
        return this.f306461f;
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.f306462g;
    }

    @Nullable
    public String h() {
        return this.f306458c;
    }

    @Nullable
    public a0 i() {
        return this.f306460e;
    }

    @Nullable
    public Long j() {
        return this.f306459d;
    }

    @Nullable
    public String k() {
        return this.f306456a;
    }

    @Nullable
    public String l() {
        return this.f306457b;
    }

    public void m(@Nullable j jVar) {
        this.f306461f = jVar;
    }

    public void n(@Nullable String str) {
        this.f306458c = str;
    }

    public void o(@Nullable a0 a0Var) {
        this.f306460e = a0Var;
    }

    public void p(@Nullable Long l10) {
        this.f306459d = l10;
    }

    public void q(@Nullable String str) {
        this.f306456a = str;
    }

    public void r(@Nullable String str) {
        this.f306457b = str;
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        if (this.f306456a != null) {
            z3Var.f("type").b(this.f306456a);
        }
        if (this.f306457b != null) {
            z3Var.f("value").b(this.f306457b);
        }
        if (this.f306458c != null) {
            z3Var.f("module").b(this.f306458c);
        }
        if (this.f306459d != null) {
            z3Var.f("thread_id").i(this.f306459d);
        }
        if (this.f306460e != null) {
            z3Var.f("stacktrace").j(iLogger, this.f306460e);
        }
        if (this.f306461f != null) {
            z3Var.f(b.f306468f).j(iLogger, this.f306461f);
        }
        Map<String, Object> map = this.f306462g;
        if (map != null) {
            for (String str : map.keySet()) {
                z3Var.f(str).j(iLogger, this.f306462g.get(str));
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.f306462g = map;
    }
}
