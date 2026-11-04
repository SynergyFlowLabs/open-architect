package k5;

import android.content.SharedPreferences;
import android.view.View;
import com.facebook.appevents.internal.p;
import com.facebook.g0;
import com.facebook.internal.e1;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String f307551c = "SUGGESTED_EVENTS_HISTORY";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final String f307552d = "com.facebook.internal.SUGGESTED_EVENTS_HISTORY";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static SharedPreferences f307553e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f307549a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Map<String, String> f307550b = new LinkedHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final AtomicBoolean f307554f = new AtomicBoolean(false);

    private b() {
    }

    @n
    public static final void a(@NotNull String pathID, @NotNull String predictedEvent) {
        if (com.facebook.internal.instrument.crashshield.b.e(b.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(pathID, "pathID");
            Intrinsics.checkNotNullParameter(predictedEvent, "predictedEvent");
            if (!f307554f.get()) {
                f307549a.c();
            }
            Map<String, String> map = f307550b;
            map.put(pathID, predictedEvent);
            SharedPreferences sharedPreferences = f307553e;
            if (sharedPreferences == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shardPreferences");
                throw null;
            }
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            e1 e1Var = e1.f99794a;
            editorEdit.putString(f307551c, e1.i0(MapsKt.toMap(map))).apply();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, b.class);
        }
    }

    @n
    @Nullable
    public static final String b(@NotNull View view, @NotNull String text) {
        if (com.facebook.internal.instrument.crashshield.b.e(b.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(text, "text");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("text", text);
                JSONArray jSONArray = new JSONArray();
                while (view != null) {
                    jSONArray.put(view.getClass().getSimpleName());
                    f5.g gVar = f5.g.f275010a;
                    view = f5.g.j(view);
                }
                jSONObject.put(p.f99089c, jSONArray);
            } catch (JSONException unused) {
            }
            e1 e1Var = e1.f99794a;
            return e1.G0(jSONObject.toString());
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, b.class);
            return null;
        }
    }

    private final void c() {
        String str = "";
        if (!com.facebook.internal.instrument.crashshield.b.e(this)) {
            try {
                AtomicBoolean atomicBoolean = f307554f;
                if (!atomicBoolean.get()) {
                    g0 g0Var = g0.f99617a;
                    SharedPreferences sharedPreferences = g0.n().getSharedPreferences(f307552d, 0);
                    Intrinsics.checkNotNullExpressionValue(sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(CLICKED_PATH_STORE, Context.MODE_PRIVATE)");
                    f307553e = sharedPreferences;
                    Map<String, String> map = f307550b;
                    e1 e1Var = e1.f99794a;
                    SharedPreferences sharedPreferences2 = f307553e;
                    if (sharedPreferences2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("shardPreferences");
                        throw null;
                    }
                    String string = sharedPreferences2.getString(f307551c, "");
                    if (string != null) {
                        str = string;
                    }
                    map.putAll(e1.e0(str));
                    atomicBoolean.set(true);
                }
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, this);
            }
        }
    }

    @n
    @Nullable
    public static final String d(@NotNull String pathID) {
        if (com.facebook.internal.instrument.crashshield.b.e(b.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(pathID, "pathID");
            Map<String, String> map = f307550b;
            if (map.containsKey(pathID)) {
                return map.get(pathID);
            }
            return null;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, b.class);
            return null;
        }
    }
}
