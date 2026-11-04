package com.devtodev.core.data.metrics;

import com.devtodev.core.data.consts.ReferralProperty;
import com.devtodev.core.utils.k.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ReferralMetric extends Metric {
    public static final String METRIC_NAME = "Referral";
    private static final long serialVersionUID = 0;

    public ReferralMetric(HashMap<ReferralProperty, String> map) {
        super(METRIC_NAME, "rf");
        for (Map.Entry<ReferralProperty, String> entry : map.entrySet()) {
            addParameter(entry.getKey().getPropertyName(), a.a(entry.getValue(), "UTF-8"));
        }
    }

    @Override // com.devtodev.core.data.metrics.Metric, com.devtodev.core.data.metrics.JSONable
    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            addValueIfConsist(ReferralProperty.RFReferral.getPropertyName(), jSONObject);
            addValueIfConsist(ReferralProperty.RFSource.getPropertyName(), jSONObject);
            addValueIfConsist(ReferralProperty.RFCampaign.getPropertyName(), jSONObject);
            addValueIfConsist(ReferralProperty.RFContent.getPropertyName(), jSONObject);
            addValueIfConsist(ReferralProperty.RFMedium.getPropertyName(), jSONObject);
            addValueIfConsist(ReferralProperty.RFTerm.getPropertyName(), jSONObject);
            jSONObject.put("timestamp", getParameter("timestamp"));
            return jSONObject;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return jSONObject;
        }
    }
}
