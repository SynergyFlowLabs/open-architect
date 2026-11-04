package com.devtodev.core.logic.b;

import com.devtodev.core.data.consts.ReferralProperty;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Pattern f98283a = Pattern.compile("(^|&)utm_source=([^&#=]*)([#&]|$)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Pattern f98284b = Pattern.compile("(^|&)utm_medium=([^&#=]*)([#&]|$)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Pattern f98285c = Pattern.compile("(^|&)utm_campaign=([^&#=]*)([#&]|$)");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Pattern f98286d = Pattern.compile("(^|&)utm_content=([^&#=]*)([#&]|$)");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Pattern f98287e = Pattern.compile("(^|&)utm_term=([^&#=]*)([#&]|$)");

    @Override // com.devtodev.core.logic.b.b
    public HashMap<ReferralProperty, String> a(String str) {
        HashMap<ReferralProperty, String> map = new HashMap<>();
        map.put(ReferralProperty.RFReferral, str);
        String strA = a(this.f98283a.matcher(str));
        if (strA != null) {
            map.put(ReferralProperty.RFSource, strA);
        }
        String strA2 = a(this.f98284b.matcher(str));
        if (strA2 != null) {
            map.put(ReferralProperty.RFMedium, strA2);
        }
        String strA3 = a(this.f98285c.matcher(str));
        if (strA3 != null) {
            map.put(ReferralProperty.RFCampaign, strA3);
        }
        String strA4 = a(this.f98286d.matcher(str));
        if (strA4 != null) {
            map.put(ReferralProperty.RFContent, strA4);
        }
        String strA5 = a(this.f98287e.matcher(str));
        if (strA5 != null) {
            map.put(ReferralProperty.RFTerm, strA5);
        }
        return map;
    }

    private String a(Matcher matcher) {
        if (matcher.find()) {
            return matcher.group(2);
        }
        return null;
    }
}
