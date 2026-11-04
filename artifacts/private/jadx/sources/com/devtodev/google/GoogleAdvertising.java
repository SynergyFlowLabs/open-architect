package com.devtodev.google;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class GoogleAdvertising {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f98360a;

    public GoogleAdvertising(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f98360a = context;
    }

    @NotNull
    public final AdvertisingData getAdvertisingId() {
        AdvertisingData.ExceptionData exceptionData;
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.f98360a);
            Intrinsics.checkNotNullExpressionValue(advertisingIdInfo, "getAdvertisingIdInfo(context)");
            return new AdvertisingData.GoogleAdvertisingId(advertisingIdInfo.getId(), advertisingIdInfo.isLimitAdTrackingEnabled());
        } catch (Exception e10) {
            String message = e10.getMessage();
            if (message == null) {
                message = e10.toString();
            }
            exceptionData = new AdvertisingData.ExceptionData("advertisingId is not available\n\t" + message);
            return exceptionData;
        } catch (NoClassDefFoundError e11) {
            String message2 = e11.getMessage();
            if (message2 == null) {
                message2 = e11.toString();
            }
            exceptionData = new AdvertisingData.ExceptionData("advertisingId is not available\n\t" + (message2 + "\n\tSee documentation \"Working with ad id with android api less 26\""));
            return exceptionData;
        }
    }
}
