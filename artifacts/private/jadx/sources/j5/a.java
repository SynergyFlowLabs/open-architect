package j5;

import androidx.annotation.b1;
import com.facebook.g0;
import com.facebook.internal.b0;
import com.facebook.internal.e1;
import com.facebook.internal.instrument.crashshield.b;
import com.facebook.internal.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f307367b = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final String f307371f = "_removed_";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final String f307372g = "process_event_name";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final String f307373h = "restrictive_param";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final String f307374i = "_restrictedParams";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f307366a = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f307368c = a.class.getCanonicalName();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final List<C2238a> f307369d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final Set<String> f307370e = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: j5.a$a, reason: collision with other inner class name */
    public static final class C2238a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private String f307375a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private Map<String, String> f307376b;

        public C2238a(@NotNull String eventName, @NotNull Map<String, String> restrictiveParams) {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            Intrinsics.checkNotNullParameter(restrictiveParams, "restrictiveParams");
            this.f307375a = eventName;
            this.f307376b = restrictiveParams;
        }

        @NotNull
        public final String a() {
            return this.f307375a;
        }

        @NotNull
        public final Map<String, String> b() {
            return this.f307376b;
        }

        public final void c(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f307375a = str;
        }

        public final void d(@NotNull Map<String, String> map) {
            Intrinsics.checkNotNullParameter(map, "<set-?>");
            this.f307376b = map;
        }
    }

    private a() {
    }

    @n
    public static final void a() {
        if (b.e(a.class)) {
            return;
        }
        try {
            f307367b = true;
            f307366a.c();
        } catch (Throwable th2) {
            b.c(th2, a.class);
        }
    }

    private final String b(String str, String str2) {
        if (b.e(this)) {
            return null;
        }
        try {
            for (C2238a c2238a : new ArrayList(f307369d)) {
                if (c2238a != null && Intrinsics.areEqual(str, c2238a.a())) {
                    for (String str3 : c2238a.b().keySet()) {
                        if (Intrinsics.areEqual(str2, str3)) {
                            return c2238a.b().get(str3);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            b.c(th2, this);
        }
        return null;
    }

    private final void c() {
        String strL;
        if (b.e(this)) {
            return;
        }
        try {
            b0 b0Var = b0.f99725a;
            g0 g0Var = g0.f99617a;
            x xVarN = b0.n(g0.o(), false);
            if (xVarN == null || (strL = xVarN.l()) == null || strL.length() == 0) {
                return;
            }
            JSONObject jSONObject = new JSONObject(strL);
            f307369d.clear();
            f307370e.clear();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String key = itKeys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(key);
                if (jSONObject2 != null) {
                    JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject(f307373h);
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    C2238a c2238a = new C2238a(key, new HashMap());
                    if (jSONObjectOptJSONObject != null) {
                        e1 e1Var = e1.f99794a;
                        c2238a.d(e1.o(jSONObjectOptJSONObject));
                        f307369d.add(c2238a);
                    }
                    if (jSONObject2.has(f307372g)) {
                        f307370e.add(c2238a.a());
                    }
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            b.c(th2, this);
        }
    }

    private final boolean d(String str) {
        if (b.e(this)) {
            return false;
        }
        try {
            return f307370e.contains(str);
        } catch (Throwable th2) {
            b.c(th2, this);
            return false;
        }
    }

    @n
    @NotNull
    public static final String e(@NotNull String eventName) {
        if (b.e(a.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            return (f307367b && f307366a.d(eventName)) ? f307371f : eventName;
        } catch (Throwable th2) {
            b.c(th2, a.class);
            return null;
        }
    }

    @n
    public static final void f(@NotNull Map<String, String> parameters, @NotNull String eventName) {
        if (!b.e(a.class)) {
            try {
                Intrinsics.checkNotNullParameter(parameters, "parameters");
                Intrinsics.checkNotNullParameter(eventName, "eventName");
                if (f307367b) {
                    HashMap map = new HashMap();
                    for (String str : new ArrayList(parameters.keySet())) {
                        String strB = f307366a.b(eventName, str);
                        if (strB != null) {
                            map.put(str, strB);
                            parameters.remove(str);
                        }
                    }
                    if (!map.isEmpty()) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            for (Map.Entry entry : map.entrySet()) {
                                jSONObject.put((String) entry.getKey(), (String) entry.getValue());
                            }
                            parameters.put(f307374i, jSONObject.toString());
                        } catch (JSONException unused) {
                        }
                    }
                }
            } catch (Throwable th2) {
                b.c(th2, a.class);
            }
        }
    }
}
