package com.devtodev.analytics.internal.backend;

import com.devtodev.analytics.internal.backend.repository.json.JsonParser;
import com.devtodev.analytics.internal.storage.sqlite.AbTestProjectEntry;
import com.facebook.AuthenticationTokenClaims;
import h4.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nConfigEntry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigEntry.kt\ncom/devtodev/analytics/internal/backend/ConfigEntry\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,117:1\n1#2:118\n*E\n"})
public final class ConfigEntry extends BackendConfig {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private long aliveTimeout;
    private int countForRequest;
    private long currencyAggregationTimeout;
    private long devtodevIdTimeout;
    private int eventParamsCount;

    @Nullable
    private ExcludeEvents exclude;
    private long numberOfCurrencies;
    private final long sbsConfigVersion;
    private long serverTime;
    private long sessionTimeout;
    private long timeForRequest;
    private long userCardKeysCount;
    private boolean userCounting;

    @Nullable
    private BackendUserProperties userProperties;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ConfigEntry fromJson(@NotNull String json) {
            Intrinsics.checkNotNullParameter(json, "json");
            BackendConfig config = new JsonParser().parseConfig(json);
            return config instanceof ConfigEntry ? (ConfigEntry) config : setDefaultConfiguration();
        }

        @NotNull
        public final ConfigEntry setDefaultConfiguration() {
            return new ConfigEntry(120000L, 10, 20, AuthenticationTokenClaims.Z, 86400000L, System.currentTimeMillis(), 300000L, true, 360000L, 1000L, 60L, null, null, 0L);
        }

        private Companion() {
        }
    }

    public /* synthetic */ ConfigEntry(long j10, int i10, int i11, long j11, long j12, long j13, long j14, boolean z10, long j15, long j16, long j17, ExcludeEvents excludeEvents, BackendUserProperties backendUserProperties, long j18, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, i10, i11, j11, j12, j13, j14, z10, j15, j16, j17, (i12 & 2048) != 0 ? null : excludeEvents, backendUserProperties, j18);
    }

    public static /* synthetic */ ConfigEntry copy$default(ConfigEntry configEntry, long j10, int i10, int i11, long j11, long j12, long j13, long j14, boolean z10, long j15, long j16, long j17, ExcludeEvents excludeEvents, BackendUserProperties backendUserProperties, long j18, int i12, Object obj) {
        long j19;
        ExcludeEvents excludeEvents2;
        long j20 = (i12 & 1) != 0 ? configEntry.timeForRequest : j10;
        int i13 = (i12 & 2) != 0 ? configEntry.countForRequest : i10;
        int i14 = (i12 & 4) != 0 ? configEntry.eventParamsCount : i11;
        long j21 = (i12 & 8) != 0 ? configEntry.sessionTimeout : j11;
        long j22 = (i12 & 16) != 0 ? configEntry.devtodevIdTimeout : j12;
        long j23 = (i12 & 32) != 0 ? configEntry.serverTime : j13;
        long j24 = (i12 & 64) != 0 ? configEntry.aliveTimeout : j14;
        boolean z11 = (i12 & 128) != 0 ? configEntry.userCounting : z10;
        long j25 = (i12 & 256) != 0 ? configEntry.currencyAggregationTimeout : j15;
        long j26 = (i12 & 512) != 0 ? configEntry.numberOfCurrencies : j16;
        long j27 = (i12 & 1024) != 0 ? configEntry.userCardKeysCount : j17;
        ExcludeEvents excludeEvents3 = (i12 & 2048) != 0 ? configEntry.exclude : excludeEvents;
        BackendUserProperties backendUserProperties2 = (i12 & 4096) != 0 ? configEntry.userProperties : backendUserProperties;
        if ((i12 & 8192) != 0) {
            excludeEvents2 = excludeEvents3;
            j19 = configEntry.sbsConfigVersion;
        } else {
            j19 = j18;
            excludeEvents2 = excludeEvents3;
        }
        return configEntry.copy(j20, i13, i14, j21, j22, j23, j24, z11, j25, j26, j27, excludeEvents2, backendUserProperties2, j19);
    }

    public final long component1() {
        return this.timeForRequest;
    }

    public final long component10() {
        return this.numberOfCurrencies;
    }

    public final long component11() {
        return this.userCardKeysCount;
    }

    @Nullable
    public final ExcludeEvents component12() {
        return this.exclude;
    }

    @Nullable
    public final BackendUserProperties component13() {
        return this.userProperties;
    }

    public final long component14() {
        return this.sbsConfigVersion;
    }

    public final int component2() {
        return this.countForRequest;
    }

    public final int component3() {
        return this.eventParamsCount;
    }

    public final long component4() {
        return this.sessionTimeout;
    }

    public final long component5() {
        return this.devtodevIdTimeout;
    }

    public final long component6() {
        return this.serverTime;
    }

    public final long component7() {
        return this.aliveTimeout;
    }

    public final boolean component8() {
        return this.userCounting;
    }

    public final long component9() {
        return this.currencyAggregationTimeout;
    }

    @NotNull
    public final ConfigEntry copy(long j10, int i10, int i11, long j11, long j12, long j13, long j14, boolean z10, long j15, long j16, long j17, @Nullable ExcludeEvents excludeEvents, @Nullable BackendUserProperties backendUserProperties, long j18) {
        return new ConfigEntry(j10, i10, i11, j11, j12, j13, j14, z10, j15, j16, j17, excludeEvents, backendUserProperties, j18);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfigEntry)) {
            return false;
        }
        ConfigEntry configEntry = (ConfigEntry) obj;
        return this.timeForRequest == configEntry.timeForRequest && this.countForRequest == configEntry.countForRequest && this.eventParamsCount == configEntry.eventParamsCount && this.sessionTimeout == configEntry.sessionTimeout && this.devtodevIdTimeout == configEntry.devtodevIdTimeout && this.serverTime == configEntry.serverTime && this.aliveTimeout == configEntry.aliveTimeout && this.userCounting == configEntry.userCounting && this.currencyAggregationTimeout == configEntry.currencyAggregationTimeout && this.numberOfCurrencies == configEntry.numberOfCurrencies && this.userCardKeysCount == configEntry.userCardKeysCount && Intrinsics.areEqual(this.exclude, configEntry.exclude) && Intrinsics.areEqual(this.userProperties, configEntry.userProperties) && this.sbsConfigVersion == configEntry.sbsConfigVersion;
    }

    public final long getAliveTimeout() {
        return this.aliveTimeout;
    }

    public final int getCountForRequest() {
        return this.countForRequest;
    }

    public final long getCurrencyAggregationTimeout() {
        return this.currencyAggregationTimeout;
    }

    public final long getDevtodevIdTimeout() {
        return this.devtodevIdTimeout;
    }

    public final int getEventParamsCount() {
        return this.eventParamsCount;
    }

    @Nullable
    public final ExcludeEvents getExclude() {
        return this.exclude;
    }

    @NotNull
    public final String getJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.accumulate("timeForRequest", Long.valueOf(this.timeForRequest));
        jSONObject.accumulate("countForRequest", Integer.valueOf(this.countForRequest));
        jSONObject.accumulate("eventParamsCount", Integer.valueOf(this.eventParamsCount));
        jSONObject.accumulate("sessionTimeout", Long.valueOf(this.sessionTimeout));
        jSONObject.accumulate("devtodevIdTimeout", Long.valueOf(this.devtodevIdTimeout));
        jSONObject.accumulate("serverTime", Long.valueOf(this.serverTime));
        jSONObject.accumulate("aliveTimeout", Long.valueOf(this.aliveTimeout));
        jSONObject.accumulate("userCounting", Boolean.valueOf(this.userCounting));
        jSONObject.accumulate("currencyAggregationTimeout", Long.valueOf(this.currencyAggregationTimeout));
        jSONObject.accumulate("numberOfCurrencies", Long.valueOf(this.numberOfCurrencies));
        jSONObject.accumulate("userCardKeysCount", Long.valueOf(this.userCardKeysCount));
        ExcludeEvents excludeEvents = this.exclude;
        if (excludeEvents != null) {
            jSONObject.accumulate("exclude", excludeEvents.getJson());
        }
        BackendUserProperties backendUserProperties = this.userProperties;
        if (backendUserProperties != null) {
            jSONObject.accumulate(AbTestProjectEntry.userProperties, new JSONObject().accumulate("country", backendUserProperties.getCountry()));
        }
        jSONObject.accumulate("sbsConfigVersion", Long.valueOf(this.sbsConfigVersion));
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString()");
        return string;
    }

    public final long getNumberOfCurrencies() {
        return this.numberOfCurrencies;
    }

    public final long getSbsConfigVersion() {
        return this.sbsConfigVersion;
    }

    public final long getServerTime() {
        return this.serverTime;
    }

    public final long getSessionTimeout() {
        return this.sessionTimeout;
    }

    public final long getTimeForRequest() {
        return this.timeForRequest;
    }

    public final long getUserCardKeysCount() {
        return this.userCardKeysCount;
    }

    public final boolean getUserCounting() {
        return this.userCounting;
    }

    @Nullable
    public final BackendUserProperties getUserProperties() {
        return this.userProperties;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v9, types: [int] */
    public int hashCode() {
        int iA = a.a(this.aliveTimeout, a.a(this.serverTime, a.a(this.devtodevIdTimeout, a.a(this.sessionTimeout, (Integer.hashCode(this.eventParamsCount) + ((Integer.hashCode(this.countForRequest) + (Long.hashCode(this.timeForRequest) * 31)) * 31)) * 31, 31), 31), 31), 31);
        boolean z10 = this.userCounting;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int iA2 = a.a(this.userCardKeysCount, a.a(this.numberOfCurrencies, a.a(this.currencyAggregationTimeout, (iA + r10) * 31, 31), 31), 31);
        ExcludeEvents excludeEvents = this.exclude;
        int iHashCode = (iA2 + (excludeEvents == null ? 0 : excludeEvents.hashCode())) * 31;
        BackendUserProperties backendUserProperties = this.userProperties;
        return Long.hashCode(this.sbsConfigVersion) + ((iHashCode + (backendUserProperties != null ? backendUserProperties.hashCode() : 0)) * 31);
    }

    public final void setAliveTimeout(long j10) {
        this.aliveTimeout = j10;
    }

    public final void setCountForRequest(int i10) {
        this.countForRequest = i10;
    }

    public final void setCurrencyAggregationTimeout(long j10) {
        this.currencyAggregationTimeout = j10;
    }

    public final void setDevtodevIdTimeout(long j10) {
        this.devtodevIdTimeout = j10;
    }

    public final void setEventParamsCount(int i10) {
        this.eventParamsCount = i10;
    }

    public final void setExclude(@Nullable ExcludeEvents excludeEvents) {
        this.exclude = excludeEvents;
    }

    public final void setNumberOfCurrencies(long j10) {
        this.numberOfCurrencies = j10;
    }

    public final void setServerTime(long j10) {
        this.serverTime = j10;
    }

    public final void setSessionTimeout(long j10) {
        this.sessionTimeout = j10;
    }

    public final void setTimeForRequest(long j10) {
        this.timeForRequest = j10;
    }

    public final void setUserCardKeysCount(long j10) {
        this.userCardKeysCount = j10;
    }

    public final void setUserCounting(boolean z10) {
        this.userCounting = z10;
    }

    public final void setUserProperties(@Nullable BackendUserProperties backendUserProperties) {
        this.userProperties = backendUserProperties;
    }

    @NotNull
    public String toString() {
        return "ConfigEntry(timeForRequest=" + this.timeForRequest + ", countForRequest=" + this.countForRequest + ", eventParamsCount=" + this.eventParamsCount + ", sessionTimeout=" + this.sessionTimeout + ", devtodevIdTimeout=" + this.devtodevIdTimeout + ", serverTime=" + this.serverTime + ", aliveTimeout=" + this.aliveTimeout + ", userCounting=" + this.userCounting + ", currencyAggregationTimeout=" + this.currencyAggregationTimeout + ", numberOfCurrencies=" + this.numberOfCurrencies + ", userCardKeysCount=" + this.userCardKeysCount + ", exclude=" + this.exclude + ", userProperties=" + this.userProperties + ", sbsConfigVersion=" + this.sbsConfigVersion + ")";
    }

    public ConfigEntry(long j10, int i10, int i11, long j11, long j12, long j13, long j14, boolean z10, long j15, long j16, long j17, @Nullable ExcludeEvents excludeEvents, @Nullable BackendUserProperties backendUserProperties, long j18) {
        super(null);
        this.timeForRequest = j10;
        this.countForRequest = i10;
        this.eventParamsCount = i11;
        this.sessionTimeout = j11;
        this.devtodevIdTimeout = j12;
        this.serverTime = j13;
        this.aliveTimeout = j14;
        this.userCounting = z10;
        this.currencyAggregationTimeout = j15;
        this.numberOfCurrencies = j16;
        this.userCardKeysCount = j17;
        this.exclude = excludeEvents;
        this.userProperties = backendUserProperties;
        this.sbsConfigVersion = j18;
    }
}
