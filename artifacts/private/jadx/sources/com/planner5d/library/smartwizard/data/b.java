package com.planner5d.library.smartwizard.data;

import com.planner5d.library.services.utility.k1;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f229895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<String> f229896b;

    public b(@NotNull String roomUid, @NotNull List<String> categories) {
        Intrinsics.checkNotNullParameter(roomUid, "roomUid");
        Intrinsics.checkNotNullParameter(categories, "categories");
        this.f229895a = roomUid;
        this.f229896b = categories;
    }

    @NotNull
    public final List<String> a() {
        return this.f229896b;
    }

    public final JSONArray b() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("room_puid", this.f229895a);
        jSONObject.put("categories", k1.D(this.f229896b));
        return jSONArray.put(jSONObject);
    }
}
