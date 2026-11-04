package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.k2;
import io.sentry.m2;
import io.sentry.y3;
import io.sentry.y7;
import io.sentry.z3;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class w implements m2, k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private String f306476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private String f306477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f306478c;

    public static final class a implements a2<w> {
        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public w a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            y3Var.m1();
            String strJc = null;
            String strJc2 = null;
            HashMap map = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                if (strNa.equals("name")) {
                    strJc = y3Var.jc();
                } else if (strNa.equals("version")) {
                    strJc2 = y3Var.jc();
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    y3Var.gd(iLogger, map, strNa);
                }
            }
            y3Var.F1();
            if (strJc == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"name\"");
                iLogger.a(y7.ERROR, "Missing required field \"name\"", illegalStateException);
                throw illegalStateException;
            }
            if (strJc2 != null) {
                w wVar = new w(strJc, strJc2);
                wVar.setUnknown(map);
                return wVar;
            }
            IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"version\"");
            iLogger.a(y7.ERROR, "Missing required field \"version\"", illegalStateException2);
            throw illegalStateException2;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f306479a = "name";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f306480b = "version";
    }

    public w(@NotNull String str, @NotNull String str2) {
        this.f306476a = (String) io.sentry.util.y.c(str, "name is required.");
        this.f306477b = (String) io.sentry.util.y.c(str2, "version is required.");
    }

    @NotNull
    public String a() {
        return this.f306476a;
    }

    @NotNull
    public String b() {
        return this.f306477b;
    }

    public void c(@NotNull String str) {
        this.f306476a = (String) io.sentry.util.y.c(str, "name is required.");
    }

    public void d(@NotNull String str) {
        this.f306477b = (String) io.sentry.util.y.c(str, "version is required.");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w.class == obj.getClass()) {
            w wVar = (w) obj;
            if (Objects.equals(this.f306476a, wVar.f306476a) && Objects.equals(this.f306477b, wVar.f306477b)) {
                return true;
            }
        }
        return false;
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.f306478c;
    }

    public int hashCode() {
        return Objects.hash(this.f306476a, this.f306477b);
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        z3Var.f("name").b(this.f306476a);
        z3Var.f("version").b(this.f306477b);
        Map<String, Object> map = this.f306478c;
        if (map != null) {
            for (String str : map.keySet()) {
                z3Var.f(str).j(iLogger, this.f306478c.get(str));
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.f306478c = map;
    }
}
