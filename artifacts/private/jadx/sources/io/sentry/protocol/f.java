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
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements m2, k2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f306242h = "feedback";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private String f306243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private String f306244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private String f306245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private v f306246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private v f306247e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private String f306248f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f306249g;

    public static final class a implements a2<f> {
        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public f a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            y3Var.m1();
            String strN6 = null;
            String strN7 = null;
            String strN8 = null;
            v vVarA = null;
            v vVarA2 = null;
            String strN9 = null;
            HashMap map = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                switch (strNa) {
                    case "associated_event_id":
                        vVarA = new v.a().a(y3Var, iLogger);
                        break;
                    case "replay_id":
                        vVarA2 = new v.a().a(y3Var, iLogger);
                        break;
                    case "url":
                        strN9 = y3Var.n6();
                        break;
                    case "name":
                        strN8 = y3Var.n6();
                        break;
                    case "contact_email":
                        strN7 = y3Var.n6();
                        break;
                    case "message":
                        strN6 = y3Var.n6();
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
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"message\"");
                iLogger.a(y7.ERROR, "Missing required field \"message\"", illegalStateException);
                throw illegalStateException;
            }
            f fVar = new f(strN6);
            fVar.f306244b = strN7;
            fVar.f306245c = strN8;
            fVar.f306246d = vVarA;
            fVar.f306247e = vVarA2;
            fVar.f306248f = strN9;
            fVar.f306249g = map;
            return fVar;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f306250a = "message";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f306251b = "contact_email";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f306252c = "name";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f306253d = "associated_event_id";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f306254e = "replay_id";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f306255f = "url";
    }

    public f(@NotNull String str) {
        o(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return io.sentry.util.y.a(this.f306243a, fVar.f306243a) && io.sentry.util.y.a(this.f306244b, fVar.f306244b) && io.sentry.util.y.a(this.f306245c, fVar.f306245c) && io.sentry.util.y.a(this.f306246d, fVar.f306246d) && io.sentry.util.y.a(this.f306247e, fVar.f306247e) && io.sentry.util.y.a(this.f306248f, fVar.f306248f) && io.sentry.util.y.a(this.f306249g, fVar.f306249g);
    }

    @Nullable
    public v g() {
        return this.f306246d;
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.f306249g;
    }

    @Nullable
    public String h() {
        return this.f306244b;
    }

    public int hashCode() {
        return io.sentry.util.y.b(this.f306243a, this.f306244b, this.f306245c, this.f306246d, this.f306247e, this.f306248f, this.f306249g);
    }

    @NotNull
    public String i() {
        return this.f306243a;
    }

    @Nullable
    public String j() {
        return this.f306245c;
    }

    @Nullable
    public v k() {
        return this.f306247e;
    }

    @Nullable
    public String l() {
        return this.f306248f;
    }

    public void m(@NotNull v vVar) {
        this.f306246d = vVar;
    }

    public void n(@Nullable String str) {
        this.f306244b = str;
    }

    public void o(@NotNull String str) {
        if (str.length() <= 4096) {
            this.f306243a = str;
        } else {
            int i10 = 6 ^ 0;
            this.f306243a = str.substring(0, 4096);
        }
    }

    public void p(@Nullable String str) {
        this.f306245c = str;
    }

    public void q(@NotNull v vVar) {
        this.f306247e = vVar;
    }

    public void r(@Nullable String str) {
        this.f306248f = str;
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        z3Var.f("message").b(this.f306243a);
        if (this.f306244b != null) {
            z3Var.f(b.f306251b).b(this.f306244b);
        }
        if (this.f306245c != null) {
            z3Var.f("name").b(this.f306245c);
        }
        if (this.f306246d != null) {
            z3Var.f(b.f306253d);
            this.f306246d.serialize(z3Var, iLogger);
        }
        if (this.f306247e != null) {
            z3Var.f("replay_id");
            this.f306247e.serialize(z3Var, iLogger);
        }
        if (this.f306248f != null) {
            z3Var.f("url").b(this.f306248f);
        }
        Map<String, Object> map = this.f306249g;
        if (map != null) {
            for (String str : map.keySet()) {
                z3Var.f(str).j(iLogger, this.f306249g.get(str));
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.f306249g = map;
    }

    public String toString() {
        return "Feedback{message='" + this.f306243a + "', contactEmail='" + this.f306244b + "', name='" + this.f306245c + "', associatedEventId=" + this.f306246d + ", replayId=" + this.f306247e + ", url='" + this.f306248f + "', unknown=" + this.f306249g + AbstractJsonLexerKt.END_OBJ;
    }

    public f(@NotNull f fVar) {
        this.f306243a = fVar.f306243a;
        this.f306244b = fVar.f306244b;
        this.f306245c = fVar.f306245c;
        this.f306246d = fVar.f306246d;
        this.f306247e = fVar.f306247e;
        this.f306248f = fVar.f306248f;
        this.f306249g = io.sentry.util.d.f(fVar.f306249g);
    }
}
