package com.devtodev.analytics.internal.domain.events;

import com.devtodev.analytics.internal.utils.StringExtentionsKt;
import com.segment.analytics.kotlin.android.plugins.a;
import h4.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nDeviceInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceInfo.kt\ncom/devtodev/analytics/internal/domain/events/DeviceInfo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,153:1\n1#2:154\n*E\n"})
public final class DeviceInfo implements IEncodable {

    @Nullable
    private final String advertisingId;

    @Nullable
    private String androidId;

    @NotNull
    private final String code;
    private int deviceType;
    private final double displayDiagonal;
    private final int displayPpi;

    @NotNull
    private final String displayResolution;

    @Nullable
    private String instanceId;
    private final boolean isLimitAdTrackingEnabled;

    @NotNull
    private final String manufacturer;

    @NotNull
    private final String model;

    @NotNull
    private final String os;

    @NotNull
    private final String osVersion;
    private final int rooted;
    private final int timeZoneOffset;
    private final long timestamp;

    @NotNull
    private final String userAgent;

    @NotNull
    private final String uuid;

    public DeviceInfo(@NotNull String osVersion, @NotNull String os, int i10, @NotNull String displayResolution, double d10, @NotNull String manufacturer, @NotNull String model, int i11, int i12, boolean z10, @NotNull String userAgent, @Nullable String str, @Nullable String str2, @NotNull String uuid, @Nullable String str3, int i13) {
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(os, "os");
        Intrinsics.checkNotNullParameter(displayResolution, "displayResolution");
        Intrinsics.checkNotNullParameter(manufacturer, "manufacturer");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(userAgent, "userAgent");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        this.osVersion = osVersion;
        this.os = os;
        this.displayPpi = i10;
        this.displayResolution = displayResolution;
        this.displayDiagonal = d10;
        this.manufacturer = manufacturer;
        this.model = model;
        this.timeZoneOffset = i11;
        this.rooted = i12;
        this.isLimitAdTrackingEnabled = z10;
        this.userAgent = userAgent;
        this.androidId = str;
        this.advertisingId = str2;
        this.uuid = uuid;
        this.instanceId = str3;
        this.deviceType = i13;
        this.code = "di";
        this.timestamp = System.currentTimeMillis();
    }

    @NotNull
    public final String component1() {
        return this.osVersion;
    }

    public final boolean component10() {
        return this.isLimitAdTrackingEnabled;
    }

    @NotNull
    public final String component11() {
        return this.userAgent;
    }

    @Nullable
    public final String component12() {
        return this.androidId;
    }

    @Nullable
    public final String component13() {
        return this.advertisingId;
    }

    @NotNull
    public final String component14() {
        return this.uuid;
    }

    @Nullable
    public final String component15() {
        return this.instanceId;
    }

    public final int component16() {
        return this.deviceType;
    }

    @NotNull
    public final String component2() {
        return this.os;
    }

    public final int component3() {
        return this.displayPpi;
    }

    @NotNull
    public final String component4() {
        return this.displayResolution;
    }

    public final double component5() {
        return this.displayDiagonal;
    }

    @NotNull
    public final String component6() {
        return this.manufacturer;
    }

    @NotNull
    public final String component7() {
        return this.model;
    }

    public final int component8() {
        return this.timeZoneOffset;
    }

    public final int component9() {
        return this.rooted;
    }

    @NotNull
    public final DeviceInfo copy(@NotNull String osVersion, @NotNull String os, int i10, @NotNull String displayResolution, double d10, @NotNull String manufacturer, @NotNull String model, int i11, int i12, boolean z10, @NotNull String userAgent, @Nullable String str, @Nullable String str2, @NotNull String uuid, @Nullable String str3, int i13) {
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(os, "os");
        Intrinsics.checkNotNullParameter(displayResolution, "displayResolution");
        Intrinsics.checkNotNullParameter(manufacturer, "manufacturer");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(userAgent, "userAgent");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        return new DeviceInfo(osVersion, os, i10, displayResolution, d10, manufacturer, model, i11, i12, z10, userAgent, str, str2, uuid, str3, i13);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceInfo)) {
            return false;
        }
        DeviceInfo deviceInfo = (DeviceInfo) obj;
        return Intrinsics.areEqual(this.osVersion, deviceInfo.osVersion) && Intrinsics.areEqual(this.os, deviceInfo.os) && this.displayPpi == deviceInfo.displayPpi && Intrinsics.areEqual(this.displayResolution, deviceInfo.displayResolution) && Double.compare(this.displayDiagonal, deviceInfo.displayDiagonal) == 0 && Intrinsics.areEqual(this.manufacturer, deviceInfo.manufacturer) && Intrinsics.areEqual(this.model, deviceInfo.model) && this.timeZoneOffset == deviceInfo.timeZoneOffset && this.rooted == deviceInfo.rooted && this.isLimitAdTrackingEnabled == deviceInfo.isLimitAdTrackingEnabled && Intrinsics.areEqual(this.userAgent, deviceInfo.userAgent) && Intrinsics.areEqual(this.androidId, deviceInfo.androidId) && Intrinsics.areEqual(this.advertisingId, deviceInfo.advertisingId) && Intrinsics.areEqual(this.uuid, deviceInfo.uuid) && Intrinsics.areEqual(this.instanceId, deviceInfo.instanceId) && this.deviceType == deviceInfo.deviceType;
    }

    @Nullable
    public final String getAdvertisingId() {
        return this.advertisingId;
    }

    @Nullable
    public final String getAndroidId() {
        return this.androidId;
    }

    @Override // com.devtodev.analytics.internal.domain.events.IEncodable
    @NotNull
    public String getCode() {
        return this.code;
    }

    public final int getDeviceType() {
        return this.deviceType;
    }

    public final double getDisplayDiagonal() {
        return this.displayDiagonal;
    }

    public final int getDisplayPpi() {
        return this.displayPpi;
    }

    @NotNull
    public final String getDisplayResolution() {
        return this.displayResolution;
    }

    @Nullable
    public final String getInstanceId() {
        return this.instanceId;
    }

    @Override // com.devtodev.analytics.internal.domain.events.IEncodable
    @NotNull
    public String getJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.accumulate("code", getCode());
        jSONObject.accumulate("timestamp", Long.valueOf(this.timestamp));
        jSONObject.accumulate("osVersion", this.osVersion);
        jSONObject.accumulate("os", this.os);
        jSONObject.accumulate("displayPpi", Integer.valueOf(this.displayPpi));
        jSONObject.accumulate("displayResolution", this.displayResolution);
        jSONObject.accumulate("displayDiagonal", Double.valueOf(this.displayDiagonal));
        jSONObject.accumulate("manufacturer", this.manufacturer);
        jSONObject.accumulate("model", this.model);
        jSONObject.accumulate("timeZoneOffset", Integer.valueOf(this.timeZoneOffset));
        jSONObject.accumulate("isLimitAdTrackingEnabled", Boolean.valueOf(this.isLimitAdTrackingEnabled));
        jSONObject.accumulate(a.f266537j, this.userAgent);
        String str = this.androidId;
        if (str != null) {
            jSONObject.accumulate("androidId", str);
        }
        String str2 = this.advertisingId;
        if (str2 != null && !StringExtentionsKt.isInvalidAdvertisingId(str2)) {
            jSONObject.accumulate("advertisingId", this.advertisingId);
        }
        jSONObject.accumulate("uuid", this.uuid);
        String str3 = this.instanceId;
        if (str3 != null) {
            jSONObject.accumulate(com.segment.analytics.kotlin.core.platform.plugins.a.f266900h, str3);
        }
        jSONObject.accumulate("deviceType", Integer.valueOf(this.deviceType));
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString()");
        return string;
    }

    @NotNull
    public final String getManufacturer() {
        return this.manufacturer;
    }

    @NotNull
    public final String getModel() {
        return this.model;
    }

    @NotNull
    public final String getOs() {
        return this.os;
    }

    @NotNull
    public final String getOsVersion() {
        return this.osVersion;
    }

    public final int getRooted() {
        return this.rooted;
    }

    public final int getTimeZoneOffset() {
        return this.timeZoneOffset;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final String getUserAgent() {
        return this.userAgent;
    }

    @NotNull
    public final String getUuid() {
        return this.uuid;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r2v15, types: [int] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    public int hashCode() {
        int iHashCode = (Integer.hashCode(this.rooted) + ((Integer.hashCode(this.timeZoneOffset) + b.a(this.model, b.a(this.manufacturer, (Double.hashCode(this.displayDiagonal) + b.a(this.displayResolution, (Integer.hashCode(this.displayPpi) + b.a(this.os, this.osVersion.hashCode() * 31, 31)) * 31, 31)) * 31, 31), 31)) * 31)) * 31;
        boolean z10 = this.isLimitAdTrackingEnabled;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int iA = b.a(this.userAgent, (iHashCode + r10) * 31, 31);
        String str = this.androidId;
        int iHashCode2 = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.advertisingId;
        int iA2 = b.a(this.uuid, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.instanceId;
        return Integer.hashCode(this.deviceType) + ((iA2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final boolean isLimitAdTrackingEnabled() {
        return this.isLimitAdTrackingEnabled;
    }

    public final void setAndroidId(@Nullable String str) {
        this.androidId = str;
    }

    public final void setDeviceType(int i10) {
        this.deviceType = i10;
    }

    public final void setInstanceId(@Nullable String str) {
        this.instanceId = str;
    }

    @NotNull
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n\t code: " + getCode() + "\n");
        stringBuffer.append("\t timestamp: " + this.timestamp + "\n");
        stringBuffer.append("\t osVersion: " + this.osVersion + "\n");
        stringBuffer.append("\t os: " + this.os + "\n");
        stringBuffer.append("\t displayPpi: " + this.displayPpi + "\n");
        stringBuffer.append("\t displayResolution: " + this.displayResolution + "\n");
        stringBuffer.append("\t displayDiagonal: " + this.displayDiagonal + "\n");
        stringBuffer.append("\t manufacturer: " + this.manufacturer + "\n");
        stringBuffer.append("\t model: " + this.model + "\n");
        stringBuffer.append("\t timeZoneOffset: " + this.timeZoneOffset + "\n");
        stringBuffer.append("\t isLimitAdTrackingEnabled: " + this.isLimitAdTrackingEnabled + "\n");
        stringBuffer.append("\t userAgent: " + this.userAgent + "\n");
        String str = this.androidId;
        if (str != null) {
            stringBuffer.append("\t androidId: " + str + "\n");
        }
        String str2 = this.advertisingId;
        if (str2 != null && !StringExtentionsKt.isInvalidAdvertisingId(str2)) {
            stringBuffer.append("\t advertisingId: " + this.advertisingId + "\n");
        }
        stringBuffer.append("\t uuid: " + this.uuid + "\n");
        String str3 = this.instanceId;
        if (str3 != null) {
            stringBuffer.append("\t instanceId: " + str3 + "\n");
        }
        stringBuffer.append("\t deviceType: " + this.deviceType + "\n");
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "result.toString()");
        return string;
    }

    public /* synthetic */ DeviceInfo(String str, String str2, int i10, String str3, double d10, String str4, String str5, int i11, int i12, boolean z10, String str6, String str7, String str8, String str9, String str10, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i10, str3, d10, str4, str5, i11, i12, z10, str6, (i14 & 2048) != 0 ? null : str7, str8, str9, (i14 & 16384) != 0 ? null : str10, i13);
    }
}
