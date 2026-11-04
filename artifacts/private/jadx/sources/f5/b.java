package f5;

import com.devtodev.analytics.internal.storage.sqlite.ExperimentsEntry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final C1898b f274952j = new C1898b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f274953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final c f274954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final a f274955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f274956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final List<d> f274957e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final List<f5.c> f274958f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final String f274959g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final String f274960h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final String f274961i;

    public enum a {
        CLICK,
        SELECTED,
        TEXT_CHANGED;

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] aVarArrValuesCustom = values();
            return (a[]) Arrays.copyOf(aVarArrValuesCustom, aVarArrValuesCustom.length);
        }
    }

    /* JADX INFO: renamed from: f5.b$b, reason: collision with other inner class name */
    public static final class C1898b {
        public /* synthetic */ C1898b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @n
        @NotNull
        public final b a(@NotNull JSONObject mapping) throws JSONException, IllegalArgumentException {
            int length;
            Intrinsics.checkNotNullParameter(mapping, "mapping");
            String eventName = mapping.getString("event_name");
            String string = mapping.getString("method");
            Intrinsics.checkNotNullExpressionValue(string, "mapping.getString(\"method\")");
            Locale ENGLISH = Locale.ENGLISH;
            Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
            String upperCase = string.toUpperCase(ENGLISH);
            Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase(locale)");
            c cVarValueOf = c.valueOf(upperCase);
            String string2 = mapping.getString("event_type");
            Intrinsics.checkNotNullExpressionValue(string2, "mapping.getString(\"event_type\")");
            Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
            String upperCase2 = string2.toUpperCase(ENGLISH);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "(this as java.lang.String).toUpperCase(locale)");
            a aVarValueOf = a.valueOf(upperCase2);
            String appVersion = mapping.getString(io.sentry.protocol.a.b.f306114f);
            JSONArray jSONArray = mapping.getJSONArray("path");
            ArrayList arrayList = new ArrayList();
            int length2 = jSONArray.length();
            if (length2 > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    JSONObject jsonPath = jSONArray.getJSONObject(i10);
                    Intrinsics.checkNotNullExpressionValue(jsonPath, "jsonPath");
                    arrayList.add(new d(jsonPath));
                    if (i11 >= length2) {
                        break;
                    }
                    i10 = i11;
                }
            }
            String pathType = mapping.optString(f5.a.f274942d, f5.a.f274944f);
            JSONArray jSONArrayOptJSONArray = mapping.optJSONArray(ExperimentsEntry.parameters);
            int i12 = 0;
            ArrayList arrayList2 = new ArrayList();
            if (jSONArrayOptJSONArray != null && (length = jSONArrayOptJSONArray.length()) > 0) {
                while (true) {
                    int i13 = i12 + 1;
                    JSONObject jsonParameter = jSONArrayOptJSONArray.getJSONObject(i12);
                    Intrinsics.checkNotNullExpressionValue(jsonParameter, "jsonParameter");
                    arrayList2.add(new f5.c(jsonParameter));
                    if (i13 >= length) {
                        break;
                    }
                    i12 = i13;
                }
            }
            String componentId = mapping.optString("component_id");
            String activityName = mapping.optString("activity_name");
            Intrinsics.checkNotNullExpressionValue(eventName, "eventName");
            Intrinsics.checkNotNullExpressionValue(appVersion, "appVersion");
            Intrinsics.checkNotNullExpressionValue(componentId, "componentId");
            Intrinsics.checkNotNullExpressionValue(pathType, "pathType");
            Intrinsics.checkNotNullExpressionValue(activityName, "activityName");
            return new b(eventName, cVarValueOf, aVarValueOf, appVersion, arrayList, arrayList2, componentId, pathType, activityName);
        }

        @n
        @NotNull
        public final List<b> b(@Nullable JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                try {
                    int length = jSONArray.length();
                    if (length > 0) {
                        int i10 = 0;
                        while (true) {
                            int i11 = i10 + 1;
                            JSONObject jSONObject = jSONArray.getJSONObject(i10);
                            Intrinsics.checkNotNullExpressionValue(jSONObject, "array.getJSONObject(i)");
                            arrayList.add(a(jSONObject));
                            if (i11 >= length) {
                                break;
                            }
                            i10 = i11;
                        }
                    }
                } catch (IllegalArgumentException | JSONException unused) {
                }
            }
            return arrayList;
        }

        private C1898b() {
        }
    }

    public enum c {
        MANUAL,
        INFERENCE;

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            c[] cVarArrValuesCustom = values();
            return (c[]) Arrays.copyOf(cVarArrValuesCustom, cVarArrValuesCustom.length);
        }
    }

    public b(@NotNull String eventName, @NotNull c method, @NotNull a type, @NotNull String appVersion, @NotNull List<d> path, @NotNull List<f5.c> parameters, @NotNull String componentId, @NotNull String pathType, @NotNull String activityName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(componentId, "componentId");
        Intrinsics.checkNotNullParameter(pathType, "pathType");
        Intrinsics.checkNotNullParameter(activityName, "activityName");
        this.f274953a = eventName;
        this.f274954b = method;
        this.f274955c = type;
        this.f274956d = appVersion;
        this.f274957e = path;
        this.f274958f = parameters;
        this.f274959g = componentId;
        this.f274960h = pathType;
        this.f274961i = activityName;
    }

    @n
    @NotNull
    public static final b e(@NotNull JSONObject jSONObject) throws JSONException, IllegalArgumentException {
        return f274952j.a(jSONObject);
    }

    @n
    @NotNull
    public static final List<b> k(@Nullable JSONArray jSONArray) {
        return f274952j.b(jSONArray);
    }

    @NotNull
    public final String a() {
        return this.f274961i;
    }

    @NotNull
    public final String b() {
        return this.f274956d;
    }

    @NotNull
    public final String c() {
        return this.f274959g;
    }

    @NotNull
    public final String d() {
        return this.f274953a;
    }

    @NotNull
    public final c f() {
        return this.f274954b;
    }

    @NotNull
    public final String g() {
        return this.f274960h;
    }

    @NotNull
    public final a h() {
        return this.f274955c;
    }

    @NotNull
    public final List<f5.c> i() {
        List<f5.c> listUnmodifiableList = Collections.unmodifiableList(this.f274958f);
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(parameters)");
        return listUnmodifiableList;
    }

    @NotNull
    public final List<d> j() {
        List<d> listUnmodifiableList = Collections.unmodifiableList(this.f274957e);
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(path)");
        return listUnmodifiableList;
    }
}
