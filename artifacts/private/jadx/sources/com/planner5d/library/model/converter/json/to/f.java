package com.planner5d.library.model.converter.json.to;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.item.ItemLayout;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@w0(parameters = 1)
@ij.f
public final class f implements ib.a<ItemLayout, JSONObject> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f180651a = 0;

    @ij.a
    public f() {
    }

    @Override // ib.a
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public JSONObject convert(@NotNull ItemLayout from) throws JSONException {
        Intrinsics.checkNotNullParameter(from, "from");
        JSONObject jSONObject = new JSONObject();
        String str = com.planner5d.library.services.r.scale.f224891a;
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(Float.valueOf(from.getScaleX()));
        jSONArray.put(Float.valueOf(from.getScaleY()));
        jSONArray.put(Float.valueOf(from.getScaleZ()));
        Unit unit = Unit.f312394a;
        jSONObject.put(str, jSONArray);
        String str2 = com.planner5d.library.services.r.position.f224891a;
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(Float.valueOf(from.getPositionX()));
        jSONArray2.put(Float.valueOf(from.getPositionY()));
        jSONArray2.put(Float.valueOf(from.getPositionZ()));
        jSONObject.put(str2, jSONArray2);
        String str3 = com.planner5d.library.services.r.rotation.f224891a;
        JSONArray jSONArray3 = new JSONArray();
        jSONArray3.put(Float.valueOf(from.getRotationX()));
        jSONArray3.put(Float.valueOf(from.getRotationY()));
        jSONArray3.put(Float.valueOf(from.getRotationZ()));
        jSONObject.put(str3, jSONArray3);
        return jSONObject;
    }
}
