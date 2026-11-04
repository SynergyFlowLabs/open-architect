package com.devtodev.core.data.consts;

/* JADX INFO: loaded from: classes3.dex */
public class ReferralProperty {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f98079a;
    public static final ReferralProperty RFReferral = new ReferralProperty("referral");
    public static final ReferralProperty RFSource = new ReferralProperty("publisher");
    public static final ReferralProperty RFMedium = new ReferralProperty("subplacement");
    public static final ReferralProperty RFContent = new ReferralProperty("subad");
    public static final ReferralProperty RFCampaign = new ReferralProperty("subcampaign");
    public static final ReferralProperty RFTerm = new ReferralProperty("subkeyword");

    private ReferralProperty(String str) {
        if (str != null) {
            this.f98079a = str;
        } else {
            this.f98079a = "";
        }
    }

    public static ReferralProperty Custom(String str) {
        return new ReferralProperty(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ReferralProperty.class == obj.getClass()) {
            ReferralProperty referralProperty = (ReferralProperty) obj;
            String str = this.f98079a;
            if (str != null) {
                return str.equals(referralProperty.f98079a);
            }
            if (referralProperty.f98079a == null) {
                return true;
            }
        }
        return false;
    }

    public String getPropertyName() {
        return this.f98079a;
    }

    public int hashCode() {
        String str = this.f98079a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
