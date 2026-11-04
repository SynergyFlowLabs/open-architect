package f5;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f274969e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final String f274970f = "name";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final String f274971g = "path";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final String f274972h = "value";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f274973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f274974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<d> f274975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f274976d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public c(@NotNull JSONObject component) throws JSONException {
        int length;
        Intrinsics.checkNotNullParameter(component, "component");
        String string = component.getString("name");
        Intrinsics.checkNotNullExpressionValue(string, "component.getString(PARAMETER_NAME_KEY)");
        this.f274973a = string;
        String strOptString = component.optString("value");
        Intrinsics.checkNotNullExpressionValue(strOptString, "component.optString(PARAMETER_VALUE_KEY)");
        this.f274974b = strOptString;
        String strOptString2 = component.optString(f5.a.f274942d, f5.a.f274944f);
        Intrinsics.checkNotNullExpressionValue(strOptString2, "component.optString(Constants.EVENT_MAPPING_PATH_TYPE_KEY, Constants.PATH_TYPE_ABSOLUTE)");
        this.f274976d = strOptString2;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = component.optJSONArray(f274971g);
        if (jSONArrayOptJSONArray != null && (length = jSONArrayOptJSONArray.length()) > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i10);
                Intrinsics.checkNotNullExpressionValue(jSONObject, "jsonPathArray.getJSONObject(i)");
                arrayList.add(new d(jSONObject));
                if (i11 >= length) {
                    break;
                } else {
                    i10 = i11;
                }
            }
        }
        this.f274975c = arrayList;
    }

    @NotNull
    public final String a() {
        return this.f274973a;
    }

    @NotNull
    public final List<d> b() {
        return this.f274975c;
    }

    @NotNull
    public final String c() {
        return this.f274976d;
    }

    @NotNull
    public final String d() {
        return this.f274974b;
    }
}
