package com.planner5d.library.model.converter.json.from;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.services.utility.k1;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@w0(parameters = 1)
public final class g0 implements ib.a<JSONObject, String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f180597a = 0;

    @Override // ib.a
    @Nullable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String convert(@Nullable JSONObject jSONObject) throws JSONException {
        return k1.z(k1.f225294a.u(jSONObject, "info"), "country", null, 4, null);
    }
}
