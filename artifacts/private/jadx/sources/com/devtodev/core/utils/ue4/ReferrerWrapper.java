package com.devtodev.core.utils.ue4;

import com.devtodev.core.data.consts.ReferralProperty;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class ReferrerWrapper {
    private static final String CAMPAIGN = "campaign";
    private static final String CONTENT = "content";
    private static final String MEDIUM = "medium";
    private static final String SOURCE = "source";
    private static final String TERM = "term";
    private HashMap<ReferralProperty, String> map = new HashMap<>();

    public void addProperty(String str, String str2) {
        if (str.equalsIgnoreCase("source")) {
            this.map.put(ReferralProperty.RFSource, str2);
            return;
        }
        if (str.equalsIgnoreCase("medium")) {
            this.map.put(ReferralProperty.RFMedium, str2);
            return;
        }
        if (str.equalsIgnoreCase("content")) {
            this.map.put(ReferralProperty.RFContent, str2);
        } else if (str.equalsIgnoreCase("campaign")) {
            this.map.put(ReferralProperty.RFCampaign, str2);
        } else if (str.equalsIgnoreCase("term")) {
            this.map.put(ReferralProperty.RFTerm, str2);
        }
    }

    public HashMap<ReferralProperty, String> getMap() {
        return this.map;
    }
}
