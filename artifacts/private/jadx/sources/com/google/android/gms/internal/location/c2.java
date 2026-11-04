package com.google.android.gms.internal.location;

import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;

/* JADX INFO: loaded from: classes4.dex */
public final class c2 implements com.google.android.gms.location.v {
    @Override // com.google.android.gms.location.v
    public final com.google.android.gms.common.api.p<LocationSettingsResult> a(com.google.android.gms.common.api.l lVar, LocationSettingsRequest locationSettingsRequest) {
        return lVar.l(new a2(this, lVar, locationSettingsRequest, null));
    }
}
