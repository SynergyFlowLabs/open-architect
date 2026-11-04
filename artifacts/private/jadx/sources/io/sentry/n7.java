package io.sentry;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class n7 implements k2, m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f305904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Integer f305905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f305906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final String f305907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final x7 f305908e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f305909f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private final Callable<Integer> f305910g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private final String f305911h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f305912i;

    public static final class a implements a2<n7> {
        private Exception c(String str, ILogger iLogger) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            iLogger.a(y7.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public n7 a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            y3Var.m1();
            HashMap map = null;
            x7 x7Var = null;
            String strN6 = null;
            String strN7 = null;
            String strN8 = null;
            String strN9 = null;
            Integer numRc = null;
            int iNextInt = 0;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                switch (strNa) {
                    case "item_count":
                        numRc = y3Var.rc();
                        break;
                    case "length":
                        iNextInt = y3Var.nextInt();
                        break;
                    case "filename":
                        strN7 = y3Var.n6();
                        break;
                    case "attachment_type":
                        strN8 = y3Var.n6();
                        break;
                    case "type":
                        x7Var = (x7) y3Var.i4(iLogger, new x7.a());
                        break;
                    case "content_type":
                        strN6 = y3Var.n6();
                        break;
                    case "platform":
                        strN9 = y3Var.n6();
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        y3Var.gd(iLogger, map, strNa);
                        break;
                }
            }
            if (x7Var == null) {
                throw c("type", iLogger);
            }
            n7 n7Var = new n7(x7Var, iNextInt, strN6, strN7, strN8, strN9, numRc);
            n7Var.setUnknown(map);
            y3Var.F1();
            return n7Var;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f305913a = "content_type";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f305914b = "filename";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f305915c = "type";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f305916d = "attachment_type";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f305917e = "length";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f305918f = "platform";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f305919g = "item_count";
    }

    @lm.a.c
    public n7(@NotNull x7 x7Var, int i10, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Integer num) {
        this.f305908e = (x7) io.sentry.util.y.c(x7Var, "type is required");
        this.f305904a = str;
        this.f305909f = i10;
        this.f305906c = str2;
        this.f305910g = null;
        this.f305911h = str3;
        this.f305907d = str4;
        this.f305905b = num;
    }

    @Nullable
    public String a() {
        return this.f305911h;
    }

    @Nullable
    public String b() {
        return this.f305904a;
    }

    @Nullable
    public String c() {
        return this.f305906c;
    }

    public int d() {
        Callable<Integer> callable = this.f305910g;
        if (callable == null) {
            return this.f305909f;
        }
        try {
            return callable.call().intValue();
        } catch (Throwable unused) {
            return -1;
        }
    }

    @Nullable
    public String e() {
        return this.f305907d;
    }

    @NotNull
    public x7 f() {
        return this.f305908e;
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.f305912i;
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        if (this.f305904a != null) {
            z3Var.f("content_type").b(this.f305904a);
        }
        if (this.f305906c != null) {
            z3Var.f("filename").b(this.f305906c);
        }
        z3Var.f("type").j(iLogger, this.f305908e);
        if (this.f305911h != null) {
            z3Var.f(b.f305916d).b(this.f305911h);
        }
        if (this.f305907d != null) {
            z3Var.f("platform").b(this.f305907d);
        }
        if (this.f305905b != null) {
            z3Var.f(b.f305919g).i(this.f305905b);
        }
        z3Var.f(b.f305917e).c(d());
        Map<String, Object> map = this.f305912i;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f305912i.get(str);
                z3Var.f(str);
                z3Var.j(iLogger, obj);
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.f305912i = map;
    }

    n7(@NotNull x7 x7Var, @Nullable Callable<Integer> callable, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        this(x7Var, callable, str, str2, str3, (String) null, (Integer) null);
    }

    n7(@NotNull x7 x7Var, @Nullable Callable<Integer> callable, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Integer num) {
        this.f305908e = (x7) io.sentry.util.y.c(x7Var, "type is required");
        this.f305904a = str;
        this.f305909f = -1;
        this.f305906c = str2;
        this.f305910g = callable;
        this.f305911h = str3;
        this.f305907d = str4;
        this.f305905b = num;
    }

    n7(@NotNull x7 x7Var, @Nullable Callable<Integer> callable, @Nullable String str, @Nullable String str2) {
        this(x7Var, callable, str, str2, null);
    }
}
