package g5;

import androidx.annotation.b1;
import com.facebook.appevents.e;
import com.facebook.g0;
import com.facebook.internal.b0;
import com.facebook.internal.e1;
import com.facebook.internal.instrument.crashshield.b;
import com.facebook.internal.x;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f275404b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f275403a = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final List<C1908a> f275405c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final Set<String> f275406d = new HashSet();

    /* JADX INFO: renamed from: g5.a$a, reason: collision with other inner class name */
    public static final class C1908a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private String f275407a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private List<String> f275408b;

        public C1908a(@NotNull String eventName, @NotNull List<String> deprecateParams) {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            Intrinsics.checkNotNullParameter(deprecateParams, "deprecateParams");
            this.f275407a = eventName;
            this.f275408b = deprecateParams;
        }

        @NotNull
        public final List<String> a() {
            return this.f275408b;
        }

        @NotNull
        public final String b() {
            return this.f275407a;
        }

        public final void c(@NotNull List<String> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.f275408b = list;
        }

        public final void d(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f275407a = str;
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
            f275404b = true;
            f275403a.b();
        } catch (Throwable th2) {
            b.c(th2, a.class);
        }
    }

    private final synchronized void b() {
        if (b.e(this)) {
            return;
        }
        try {
            b0 b0Var = b0.f99725a;
            g0 g0Var = g0.f99617a;
            x xVarN = b0.n(g0.o(), false);
            if (xVarN == null) {
                return;
            }
            String strL = xVarN.l();
            if (strL != null && strL.length() > 0) {
                JSONObject jSONObject = new JSONObject(strL);
                f275405c.clear();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String key = itKeys.next();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(key);
                    if (jSONObject2 != null) {
                        if (jSONObject2.optBoolean("is_deprecated_event")) {
                            Set<String> set = f275406d;
                            Intrinsics.checkNotNullExpressionValue(key, "key");
                            set.add(key);
                        } else {
                            JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("deprecated_param");
                            Intrinsics.checkNotNullExpressionValue(key, "key");
                            C1908a c1908a = new C1908a(key, new ArrayList());
                            if (jSONArrayOptJSONArray != null) {
                                e1 e1Var = e1.f99794a;
                                c1908a.c(e1.m(jSONArrayOptJSONArray));
                            }
                            f275405c.add(c1908a);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            b.c(th2, this);
        }
    }

    @n
    public static final void c(@NotNull Map<String, String> parameters, @NotNull String eventName) {
        if (!b.e(a.class)) {
            try {
                Intrinsics.checkNotNullParameter(parameters, "parameters");
                Intrinsics.checkNotNullParameter(eventName, "eventName");
                if (f275404b) {
                    ArrayList<String> arrayList = new ArrayList(parameters.keySet());
                    for (C1908a c1908a : new ArrayList(f275405c)) {
                        if (Intrinsics.areEqual(c1908a.b(), eventName)) {
                            for (String str : arrayList) {
                                if (c1908a.a().contains(str)) {
                                    parameters.remove(str);
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                b.c(th2, a.class);
            }
        }
    }

    @n
    public static final void d(@NotNull List<e> events) {
        if (b.e(a.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(events, "events");
            if (f275404b) {
                Iterator<e> it = events.iterator();
                while (it.hasNext()) {
                    if (f275406d.contains(it.next().getName())) {
                        it.remove();
                    }
                }
            }
        } catch (Throwable th2) {
            b.c(th2, a.class);
        }
    }
}
