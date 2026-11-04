package com.devtodev.core.data.metrics.aggregated.ingamepurchase;

import com.devtodev.analytics.internal.storage.sqlite.UserEntry;
import com.devtodev.core.data.metrics.MetricConsts;
import com.devtodev.core.data.metrics.aggregated.AggregatedMetric;
import com.devtodev.core.logic.SDKClient;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class InGamePurchaseMetric extends AggregatedMetric<InGamePurchaseMetric> {
    public static final String PURCHASE_AMOUNT_KEY = "purchaseAmount";
    public static final String PURCHASE_ID_KEY = "purchaseId";
    public static final String PURCHASE_PRICE_CURRENCY_KEY = "purchasePriceCurrency";
    public static final String PURCHASE_PRICE_KEY = "purchasePrice";
    public static final String PURCHASE_TYPE_KEY = "purchaseType";
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CopyOnWriteArrayList<InGamePurchaseData> f98129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f98130d;

    public InGamePurchaseMetric(String str, String str2, int i10, float f10, String str3) {
        super("In Game Purchase", MetricConsts.InGamePurchase);
        this.f98130d = str;
        InGamePurchaseData inGamePurchaseData = new InGamePurchaseData(str, str2, i10, f10, str3);
        inGamePurchaseData.addRecordParameter(UserEntry.sessionId, Long.valueOf(SDKClient.getInstance().getUsersStorages().getDataStorage().getSessionId()));
        CopyOnWriteArrayList<InGamePurchaseData> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        this.f98129c = copyOnWriteArrayList;
        copyOnWriteArrayList.add(inGamePurchaseData);
    }

    @Override // com.devtodev.core.data.metrics.aggregated.AggregatedMetric
    public void addRecordParameter(String str, Object obj) {
        Iterator<InGamePurchaseData> it = this.f98129c.iterator();
        while (it.hasNext()) {
            it.next().addRecordParameter(str, obj);
        }
    }

    public String getPurchaseId() {
        return this.f98130d;
    }

    @Override // com.devtodev.core.data.metrics.aggregated.AggregatedMetric
    public int size() {
        return this.f98129c.size();
    }

    @Override // com.devtodev.core.data.metrics.Metric, com.devtodev.core.data.metrics.JSONable
    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            for (InGamePurchaseData inGamePurchaseData : this.f98129c) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(PURCHASE_ID_KEY, inGamePurchaseData.getPurchaseId());
                jSONObject2.put(PURCHASE_AMOUNT_KEY, inGamePurchaseData.getPurchaseAmount());
                jSONObject2.put(PURCHASE_PRICE_CURRENCY_KEY, inGamePurchaseData.getPurchasePriceCurrency());
                jSONObject2.put(PURCHASE_PRICE_KEY, inGamePurchaseData.getPurchasePrice());
                jSONObject2.put(PURCHASE_TYPE_KEY, inGamePurchaseData.getPurchaseType());
                jSONObject2.put("timestamp", inGamePurchaseData.getTimestamp());
                putDataProperties(jSONObject2, inGamePurchaseData.getRecordParameters());
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("entries", jSONArray);
            return jSONObject;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return jSONObject;
        }
    }

    @Override // com.devtodev.core.data.metrics.aggregated.AggregatedMetric
    public boolean addEntry(InGamePurchaseMetric inGamePurchaseMetric) {
        if (inGamePurchaseMetric == null) {
            return false;
        }
        this.f98129c.addAll(inGamePurchaseMetric.f98129c);
        return true;
    }
}
