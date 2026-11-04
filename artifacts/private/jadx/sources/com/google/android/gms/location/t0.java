package com.google.android.gms.location;

import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
final class t0 implements Comparator {
    t0() {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        ActivityTransition activityTransition = (ActivityTransition) obj;
        ActivityTransition activityTransition2 = (ActivityTransition) obj2;
        com.google.android.gms.common.internal.w.r(activityTransition);
        com.google.android.gms.common.internal.w.r(activityTransition2);
        int iO1 = activityTransition.O1();
        int iO2 = activityTransition2.O1();
        int i10 = 7 | (-1);
        if (iO1 != iO2) {
            return iO1 >= iO2 ? 1 : -1;
        }
        int iT1 = activityTransition.T1();
        int iT2 = activityTransition2.T1();
        if (iT1 == iT2) {
            return 0;
        }
        return iT1 >= iT2 ? 1 : -1;
    }
}
