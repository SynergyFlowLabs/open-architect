package com.planner5d.library.activity.fragment.smartwizard.roomstyle;

import androidx.compose.runtime.internal.w0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 1)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f135656a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f135657b = 0;

    /* JADX INFO: renamed from: com.planner5d.library.activity.fragment.smartwizard.roomstyle.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C1490a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f135658a;

        static {
            int[] iArr = new int[pa.a.values().length];
            try {
                iArr[pa.a.SmartWizard.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int i10 = 7 ^ 2;
                iArr[pa.a.Furnisher.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[pa.a.Styler.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[pa.a.Decorate.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f135658a = iArr;
        }
    }

    private a() {
    }

    private final JSONObject b(int i10, int i11, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("room_type_id", i10);
        jSONObject.put("room_style_id", i11);
        jSONObject.put("room", f135656a.f(str, true));
        timber.log.b.f381052a.a("Request JSON " + jSONObject, new Object[0]);
        return jSONObject;
    }

    private final JSONObject d(int i10, int i11, String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", String.valueOf(i10));
        jSONObject2.put("style", String.valueOf(i11));
        jSONObject2.put("roomShape", str);
        Unit unit = Unit.f312394a;
        jSONObject.put("tasks", jSONArray.put(jSONObject2));
        jSONObject.put("scheme", String.valueOf(f135656a.f(str2, false)));
        timber.log.b.f381052a.a("Request JSON " + jSONObject, new Object[0]);
        return jSONObject;
    }

    private final JSONObject e(int i10, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("room_style_id", i10);
        jSONObject.put("room", f135656a.f(str, false));
        timber.log.b.f381052a.a("Request JSON " + jSONObject, new Object[0]);
        return jSONObject;
    }

    private final JSONArray f(String str, boolean z10) {
        try {
            Object obj = new JSONObject(str).getJSONArray("items").get(0);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONObject");
            JSONArray jSONArray = ((JSONObject) obj).getJSONArray("items");
            if (!z10) {
                return jSONArray;
            }
            Intrinsics.checkNotNull(jSONArray);
            return g(jSONArray);
        } catch (JSONException e10) {
            timber.log.b.f381052a.e(e10);
            return null;
        }
    }

    private final JSONArray g(JSONArray jSONArray) throws JSONException {
        JSONArray jSONArray2 = new JSONArray();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = jSONArray.get(i10);
            JSONObject jSONObject = obj instanceof JSONObject ? (JSONObject) obj : null;
            if (jSONObject != null && !Intrinsics.areEqual(jSONObject.get("className"), "Ns")) {
                jSONArray2.put(jSONObject);
            }
        }
        return jSONArray2;
    }

    @NotNull
    public final JSONObject a(@NotNull String projectData, @NotNull com.planner5d.library.smartwizard.data.b selectedCategories) throws JSONException {
        Intrinsics.checkNotNullParameter(projectData, "projectData");
        Intrinsics.checkNotNullParameter(selectedCategories, "selectedCategories");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("requested_categories", selectedCategories.b());
        jSONObject.put("project", new JSONObject().put("items", new JSONObject(projectData).getJSONArray("items")));
        timber.log.b.f381052a.a("Request JSON " + jSONObject, new Object[0]);
        return jSONObject;
    }

    @NotNull
    public final JSONObject c(@NotNull pa.a requestType, int i10, int i11, @NotNull String roomShape, @NotNull String room) throws JSONException {
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(roomShape, "roomShape");
        Intrinsics.checkNotNullParameter(room, "room");
        int i12 = C1490a.f135658a[requestType.ordinal()];
        if (i12 == 1) {
            return d(i10, i11, roomShape, room);
        }
        if (i12 == 2) {
            return b(i10, i11, room);
        }
        if (i12 == 3) {
            return e(i11, room);
        }
        if (i12 != 4) {
            throw new k0();
        }
        throw new IllegalArgumentException("Call prepareDecoratorRequest directly");
    }
}
