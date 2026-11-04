package com.devtodev.analytics.internal.platform.repository;

import android.content.Context;
import com.devtodev.analytics.internal.platform.GoogleAdvertisingIdResult;
import com.devtodev.google.AdvertisingData;
import com.devtodev.google.GoogleAdvertising;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class GoogleApiRepository implements IGoogleApiRepository {

    @NotNull
    private final Context context;

    public GoogleApiRepository(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @Override // com.devtodev.analytics.internal.platform.repository.IGoogleApiRepository
    @NotNull
    public GoogleAdvertisingIdResult getAdvertisingId() {
        AdvertisingData advertisingId = new GoogleAdvertising(this.context).getAdvertisingId();
        if (advertisingId instanceof AdvertisingData.GoogleAdvertisingId) {
            AdvertisingData.GoogleAdvertisingId googleAdvertisingId = (AdvertisingData.GoogleAdvertisingId) advertisingId;
            return new GoogleAdvertisingIdResult.AdvertisingId(googleAdvertisingId.getToken(), googleAdvertisingId.isLimitAdTrackingEnabled());
        }
        if (advertisingId instanceof AdvertisingData.ExceptionData) {
            return new GoogleAdvertisingIdResult.ExceptionData(((AdvertisingData.ExceptionData) advertisingId).getMessage());
        }
        throw new k0();
    }
}
