package io.sentry.clientreport;

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
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class g implements m2, k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f305281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f305282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Long f305283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f305284d;

    public static final class a implements a2<g> {
        private Exception c(String str, ILogger iLogger) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            iLogger.a(y7.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            y3Var.m1();
            String strN6 = null;
            String strN7 = null;
            Long lGc = null;
            HashMap map = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                switch (strNa) {
                    case "quantity":
                        lGc = y3Var.Gc();
                        break;
                    case "reason":
                        strN6 = y3Var.n6();
                        break;
                    case "category":
                        strN7 = y3Var.n6();
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
            if (strN6 == null) {
                throw c(b.f305285a, iLogger);
            }
            if (strN7 == null) {
                throw c("category", iLogger);
            }
            if (lGc == null) {
                throw c("quantity", iLogger);
            }
            g gVar = new g(strN6, strN7, lGc);
            gVar.setUnknown(map);
            return gVar;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f305285a = "reason";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f305286b = "category";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f305287c = "quantity";
    }

    public g(@NotNull String str, @NotNull String str2, @NotNull Long l10) {
        this.f305281a = str;
        this.f305282b = str2;
        this.f305283c = l10;
    }

    @NotNull
    public String a() {
        return this.f305282b;
    }

    @NotNull
    public Long b() {
        return this.f305283c;
    }

    @NotNull
    public String c() {
        return this.f305281a;
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.f305284d;
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        z3Var.f(b.f305285a).b(this.f305281a);
        z3Var.f("category").b(this.f305282b);
        z3Var.f("quantity").i(this.f305283c);
        Map<String, Object> map = this.f305284d;
        if (map != null) {
            for (String str : map.keySet()) {
                z3Var.f(str).j(iLogger, this.f305284d.get(str));
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.f305284d = map;
    }

    public String toString() {
        return "DiscardedEvent{reason='" + this.f305281a + "', category='" + this.f305282b + "', quantity=" + this.f305283c + AbstractJsonLexerKt.END_OBJ;
    }
}
