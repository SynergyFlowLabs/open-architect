package io.sentry;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class z7 implements m2, k2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f307185g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f307186h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f307187i = 4;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f307188j = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f307189k = 15;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f307190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private String f307191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private String f307192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private String f307193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private Long f307194e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f307195f;

    public static final class a implements a2<z7> {
        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public z7 a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            z7 z7Var = new z7();
            y3Var.m1();
            ConcurrentHashMap concurrentHashMap = null;
            boolean z10 = true & false;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                switch (strNa) {
                    case "package_name":
                        z7Var.f307192c = y3Var.n6();
                        break;
                    case "thread_id":
                        z7Var.f307194e = y3Var.Gc();
                        break;
                    case "address":
                        z7Var.f307191b = y3Var.n6();
                        break;
                    case "class_name":
                        z7Var.f307193d = y3Var.n6();
                        break;
                    case "type":
                        z7Var.f307190a = y3Var.nextInt();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        y3Var.gd(iLogger, concurrentHashMap, strNa);
                        break;
                }
            }
            z7Var.setUnknown(concurrentHashMap);
            y3Var.F1();
            return z7Var;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f307196a = "type";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f307197b = "address";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f307198c = "package_name";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f307199d = "class_name";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f307200e = "thread_id";
    }

    public z7() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z7.class != obj.getClass()) {
            return false;
        }
        return io.sentry.util.y.a(this.f307191b, ((z7) obj).f307191b);
    }

    @Nullable
    public String f() {
        return this.f307191b;
    }

    @Nullable
    public String g() {
        return this.f307193d;
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.f307195f;
    }

    @Nullable
    public String h() {
        return this.f307192c;
    }

    public int hashCode() {
        return io.sentry.util.y.b(this.f307191b);
    }

    @Nullable
    public Long i() {
        return this.f307194e;
    }

    public int j() {
        return this.f307190a;
    }

    public void k(@Nullable String str) {
        this.f307191b = str;
    }

    public void l(@Nullable String str) {
        this.f307193d = str;
    }

    public void m(@Nullable String str) {
        this.f307192c = str;
    }

    public void n(@Nullable Long l10) {
        this.f307194e = l10;
    }

    public void o(int i10) {
        this.f307190a = i10;
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        z3Var.f("type").c(this.f307190a);
        if (this.f307191b != null) {
            z3Var.f("address").b(this.f307191b);
        }
        if (this.f307192c != null) {
            z3Var.f(b.f307198c).b(this.f307192c);
        }
        if (this.f307193d != null) {
            z3Var.f(b.f307199d).b(this.f307193d);
        }
        if (this.f307194e != null) {
            z3Var.f("thread_id").i(this.f307194e);
        }
        Map<String, Object> map = this.f307195f;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f307195f.get(str);
                z3Var.f(str);
                z3Var.j(iLogger, obj);
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.f307195f = map;
    }

    public z7(@NotNull z7 z7Var) {
        this.f307190a = z7Var.f307190a;
        this.f307191b = z7Var.f307191b;
        this.f307192c = z7Var.f307192c;
        this.f307193d = z7Var.f307193d;
        this.f307194e = z7Var.f307194e;
        this.f307195f = io.sentry.util.d.f(z7Var.f307195f);
    }
}
