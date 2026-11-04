package com.devtodev.analytics.internal.domain.events.abTests;

import com.appsflyer.AppsFlyerProperties;
import com.devtodev.analytics.internal.backend.repository.UserData;
import com.devtodev.analytics.internal.domain.events.people.People;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nAudienceState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AudienceState.kt\ncom/devtodev/analytics/internal/domain/events/abTests/AudienceState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,97:1\n1#2:98\n*E\n"})
public final class AudienceState {

    @Nullable
    private Long campaign;

    @Nullable
    private Long channel;

    @Nullable
    private String country;

    @Nullable
    private Long created;

    @Nullable
    private Double displayDiagonal;

    @Nullable
    private String firstVersion;

    @Nullable
    private Boolean isNewUser;

    @Nullable
    private String language;

    @Nullable
    private Long lifetime;
    private boolean payer;

    @Nullable
    private Long payingCapacity;

    @Nullable
    private Long paymentsCount;

    @Nullable
    private Double paymentsSum;

    @Nullable
    private People people;

    @Nullable
    private Long sbsPaymentsCount;

    @Nullable
    private Double sbsPaymentsSum;

    @Nullable
    private Long sbsStatus;

    @Nullable
    private String source;

    @Nullable
    private Integer userLevel;

    @NotNull
    public final JSONObject getJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.accumulate("displayDiagonal", this.displayDiagonal);
        jSONObject.accumulate("country", this.country);
        jSONObject.accumulate("language", this.language);
        jSONObject.accumulate("source", this.source);
        jSONObject.accumulate("level", this.userLevel);
        People people = this.people;
        if (people != null) {
            jSONObject.accumulate("pl", new JSONObject(people.getJson()));
        }
        jSONObject.accumulate("payingUser", Boolean.valueOf(this.payer));
        jSONObject.accumulate("lifetime", this.lifetime);
        jSONObject.accumulate("created", this.created);
        jSONObject.accumulate("firstVersion", this.firstVersion);
        jSONObject.accumulate("newUser", this.isNewUser);
        jSONObject.accumulate("pCapacity", this.payingCapacity);
        jSONObject.accumulate("pCount", this.paymentsCount);
        jSONObject.accumulate("pSum", this.paymentsSum);
        jSONObject.accumulate("sbsCount", this.sbsPaymentsCount);
        jSONObject.accumulate("sbsSum", this.sbsPaymentsSum);
        jSONObject.accumulate("sbsStatus", this.sbsStatus);
        jSONObject.accumulate(AppsFlyerProperties.CHANNEL, this.channel);
        jSONObject.accumulate("campaign", this.campaign);
        return jSONObject;
    }

    public final void setAudienceLocalData(@NotNull AudienceLocalData audienceLocalData) {
        Intrinsics.checkNotNullParameter(audienceLocalData, "audienceLocalData");
        this.displayDiagonal = Double.valueOf(audienceLocalData.getDisplayDiagonal());
        this.country = audienceLocalData.getCountry();
        this.language = audienceLocalData.getLanguage();
        this.source = audienceLocalData.getSource();
        this.userLevel = Integer.valueOf(audienceLocalData.getUserLevel());
    }

    public final void setBackendUserData(@Nullable UserData userData) {
        if (userData != null) {
            Long created = userData.getCreated();
            if (created != null) {
                this.created = Long.valueOf(created.longValue());
            }
            this.isNewUser = userData.isNewUser();
            this.firstVersion = userData.getFirstVersion();
            this.payingCapacity = userData.getPayingCapacity();
            this.paymentsCount = userData.getPaymentsCount();
            this.paymentsSum = userData.getPaymentsSum();
            this.sbsPaymentsCount = userData.getSbsPaymentsCount();
            this.sbsPaymentsSum = userData.getSbsPaymentsSum();
            this.sbsStatus = userData.getSbsStatus();
            this.channel = userData.getChannel();
            this.campaign = userData.getCampaign();
            Long l10 = this.paymentsCount;
            if (l10 != null && l10.longValue() > 0) {
                this.payer = true;
            }
        }
    }

    public final void setPeopleEventData(@NotNull People peopleLocalData) {
        Intrinsics.checkNotNullParameter(peopleLocalData, "peopleLocalData");
        this.people = peopleLocalData;
    }

    public final void updateLifeTime() {
        Long l10 = this.created;
        if (l10 != null) {
            this.lifetime = Long.valueOf((long) Math.floor((System.currentTimeMillis() - l10.longValue()) / 8.64E7d));
        }
    }
}
