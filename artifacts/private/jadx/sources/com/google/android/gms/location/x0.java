package com.google.android.gms.location;

import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
final class x0 implements Comparator {
    x0() {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        DetectedActivity detectedActivity = (DetectedActivity) obj;
        DetectedActivity detectedActivity2 = (DetectedActivity) obj2;
        com.google.android.gms.common.internal.w.r(detectedActivity);
        com.google.android.gms.common.internal.w.r(detectedActivity2);
        int iCompareTo = Integer.valueOf(detectedActivity2.O1()).compareTo(Integer.valueOf(detectedActivity.O1()));
        return iCompareTo == 0 ? Integer.valueOf(detectedActivity.T1()).compareTo(Integer.valueOf(detectedActivity2.T1())) : iCompareTo;
    }
}
