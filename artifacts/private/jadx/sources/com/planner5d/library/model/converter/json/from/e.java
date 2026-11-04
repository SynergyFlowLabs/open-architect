package com.planner5d.library.model.converter.json.from;

import androidx.annotation.p0;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ProviderUid;
import com.planner5d.library.services.utility.k1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public abstract class e<To extends Item> extends xc.a<JSONObject, To> {
    @Override // ib.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public To convert(JSONObject jSONObject) throws JSONException {
        return (To) b(jSONObject, null);
    }

    public abstract To b(JSONObject jSONObject, ProviderUid providerUid) throws JSONException;

    protected String c(@p0 JSONObject jSONObject, ProviderUid providerUid) throws JSONException {
        return providerUid == null ? k1.w(jSONObject, com.planner5d.library.services.r.puid, "p0") : providerUid.createUid();
    }
}
