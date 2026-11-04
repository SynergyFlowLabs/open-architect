package com.devtodev.analytics.internal.domain.events;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class TrackingStatus implements IEncodable {

    @NotNull
    private final String code = TrackingStatusKt.TRACKING_CODE;
    private final long timestamp = System.currentTimeMillis();
    private final boolean trackingAllowed;

    public TrackingStatus(boolean z10) {
        this.trackingAllowed = z10;
    }

    public static /* synthetic */ TrackingStatus copy$default(TrackingStatus trackingStatus, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = trackingStatus.trackingAllowed;
        }
        return trackingStatus.copy(z10);
    }

    public final boolean component1() {
        return this.trackingAllowed;
    }

    @NotNull
    public final TrackingStatus copy(boolean z10) {
        return new TrackingStatus(z10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TrackingStatus) && this.trackingAllowed == ((TrackingStatus) obj).trackingAllowed;
    }

    @Override // com.devtodev.analytics.internal.domain.events.IEncodable
    @NotNull
    public String getCode() {
        return this.code;
    }

    @Override // com.devtodev.analytics.internal.domain.events.IEncodable
    @NotNull
    public String getJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.accumulate("code", TrackingStatusKt.TRACKING_CODE);
        jSONObject.accumulate("timestamp", Long.valueOf(this.timestamp));
        jSONObject.accumulate("trackingAllowed", Boolean.valueOf(this.trackingAllowed));
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString()");
        return string;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final boolean getTrackingAllowed() {
        return this.trackingAllowed;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public int hashCode() {
        boolean z10 = this.trackingAllowed;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return r10;
    }

    @NotNull
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n\t code: " + getCode() + "\n");
        stringBuffer.append("\t timestamp: " + this.timestamp + "\n");
        stringBuffer.append("\t trackingAllowed: " + this.trackingAllowed + "\n");
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "result.toString()");
        return string;
    }
}
