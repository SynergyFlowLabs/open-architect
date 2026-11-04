package e5;

import androidx.annotation.b1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f274661d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final Set<d> f274662e = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final String f274663f = "k";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final String f274664g = "v";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final String f274665h = ",";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f274666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f274667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<String> f274668c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void a(JSONObject jSONObject) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String key = itKeys.next();
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(key);
                if (jSONObjectOptJSONObject != null) {
                    String k10 = jSONObjectOptJSONObject.optString(d.f274663f);
                    String v10 = jSONObjectOptJSONObject.optString("v");
                    Intrinsics.checkNotNullExpressionValue(k10, "k");
                    if (k10.length() != 0) {
                        Set setA = d.a();
                        Intrinsics.checkNotNullExpressionValue(key, "key");
                        int i10 = 4 | 0;
                        List listSplit$default = StringsKt.split$default(k10, new String[]{d.f274665h}, false, 0, 6, null);
                        Intrinsics.checkNotNullExpressionValue(v10, "v");
                        setA.add(new d(key, listSplit$default, v10, null));
                    }
                }
            }
        }

        @n
        @NotNull
        public final Set<String> b() {
            HashSet hashSet = new HashSet();
            Iterator it = d.a().iterator();
            while (it.hasNext()) {
                hashSet.add(((d) it.next()).d());
            }
            return hashSet;
        }

        @n
        @NotNull
        public final Set<d> c() {
            return new HashSet(d.a());
        }

        @n
        public final void d(@NotNull String rulesFromServer) {
            Intrinsics.checkNotNullParameter(rulesFromServer, "rulesFromServer");
            try {
                d.a().clear();
                a(new JSONObject(rulesFromServer));
            } catch (JSONException unused) {
            }
        }

        private a() {
        }
    }

    public /* synthetic */ d(String str, List list, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, str2);
    }

    public static final /* synthetic */ Set a() {
        if (com.facebook.internal.instrument.crashshield.b.e(d.class)) {
            return null;
        }
        try {
            return f274662e;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, d.class);
            return null;
        }
    }

    @n
    @NotNull
    public static final Set<String> b() {
        if (com.facebook.internal.instrument.crashshield.b.e(d.class)) {
            return null;
        }
        try {
            return f274661d.b();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, d.class);
            return null;
        }
    }

    @n
    @NotNull
    public static final Set<d> e() {
        if (com.facebook.internal.instrument.crashshield.b.e(d.class)) {
            return null;
        }
        try {
            return f274661d.c();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, d.class);
            return null;
        }
    }

    @n
    public static final void g(@NotNull String str) {
        if (com.facebook.internal.instrument.crashshield.b.e(d.class)) {
            return;
        }
        try {
            f274661d.d(str);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, d.class);
        }
    }

    @NotNull
    public final List<String> c() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            return new ArrayList(this.f274668c);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return null;
        }
    }

    @NotNull
    public final String d() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            return this.f274666a;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return null;
        }
    }

    @NotNull
    public final String f() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            return this.f274667b;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return null;
        }
    }

    private d(String str, List<String> list, String str2) {
        this.f274666a = str;
        this.f274667b = str2;
        this.f274668c = list;
    }
}
