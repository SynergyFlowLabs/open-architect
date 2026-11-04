package io.sentry;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class na implements m2, k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.sentry.protocol.v f305938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private String f305939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private String f305940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private String f305941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f305942e;

    public static final class a implements a2<na> {
        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public na a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            y3Var.m1();
            io.sentry.protocol.v vVarA = null;
            String strN6 = null;
            String strN7 = null;
            String strN8 = null;
            HashMap map = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                switch (strNa) {
                    case "comments":
                        strN8 = y3Var.n6();
                        break;
                    case "name":
                        strN6 = y3Var.n6();
                        break;
                    case "email":
                        strN7 = y3Var.n6();
                        break;
                    case "event_id":
                        vVarA = new io.sentry.protocol.v.a().a(y3Var, iLogger);
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
            if (vVarA != null) {
                na naVar = new na(vVarA, strN6, strN7, strN8);
                naVar.setUnknown(map);
                return naVar;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"event_id\"");
            iLogger.a(y7.ERROR, "Missing required field \"event_id\"", illegalStateException);
            throw illegalStateException;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f305943a = "event_id";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f305944b = "name";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f305945c = "email";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f305946d = "comments";
    }

    public na(io.sentry.protocol.v vVar) {
        this(vVar, null, null, null);
    }

    @Nullable
    public String a() {
        return this.f305941d;
    }

    @Nullable
    public String b() {
        return this.f305940c;
    }

    public io.sentry.protocol.v c() {
        return this.f305938a;
    }

    @Nullable
    public String d() {
        return this.f305939b;
    }

    public void e(@Nullable String str) {
        this.f305941d = str;
    }

    public void f(@Nullable String str) {
        this.f305940c = str;
    }

    public void g(String str) {
        this.f305939b = str;
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.f305942e;
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        z3Var.f("event_id");
        this.f305938a.serialize(z3Var, iLogger);
        if (this.f305939b != null) {
            z3Var.f("name").b(this.f305939b);
        }
        if (this.f305940c != null) {
            z3Var.f("email").b(this.f305940c);
        }
        if (this.f305941d != null) {
            z3Var.f(b.f305946d).b(this.f305941d);
        }
        Map<String, Object> map = this.f305942e;
        if (map != null) {
            for (String str : map.keySet()) {
                z3Var.f(str).j(iLogger, this.f305942e.get(str));
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.f305942e = map;
    }

    public String toString() {
        return "UserFeedback{eventId=" + this.f305938a + ", name='" + this.f305939b + "', email='" + this.f305940c + "', comments='" + this.f305941d + '\'' + AbstractJsonLexerKt.END_OBJ;
    }

    public na(io.sentry.protocol.v vVar, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.f305938a = vVar;
        this.f305939b = str;
        this.f305940c = str2;
        this.f305941d = str3;
    }
}
