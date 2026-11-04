package com.devtodev.analytics.internal.domain.events;

import com.devtodev.analytics.internal.storage.sqlite.UserEntry;
import com.devtodev.core.data.metrics.Metric;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nReferral.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Referral.kt\ncom/devtodev/analytics/internal/domain/events/Referral\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,104:1\n1855#2,2:105\n*S KotlinDebug\n*F\n+ 1 Referral.kt\ncom/devtodev/analytics/internal/domain/events/Referral\n*L\n75#1:105,2\n*E\n"})
public final class Referral implements IEncodable {

    @Nullable
    private final String campaign;

    @NotNull
    private final String code;

    @Nullable
    private final String content;

    @Nullable
    private final String encryptedSource;

    @Nullable
    private final List<String> inProgress;

    @Nullable
    private final String medium;
    private final long sessionId;

    @Nullable
    private final String source;

    @Nullable
    private final String term;
    private final long timestamp;

    public Referral(long j10, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable List<String> list) {
        this.sessionId = j10;
        this.source = str;
        this.encryptedSource = str2;
        this.campaign = str3;
        this.content = str4;
        this.medium = str5;
        this.term = str6;
        this.inProgress = list;
        this.code = "rf";
        this.timestamp = System.currentTimeMillis();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Referral copy$default(Referral referral, long j10, String str, String str2, String str3, String str4, String str5, String str6, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = referral.sessionId;
        }
        long j11 = j10;
        if ((i10 & 2) != 0) {
            str = referral.source;
        }
        String str7 = str;
        if ((i10 & 4) != 0) {
            str2 = referral.encryptedSource;
        }
        String str8 = str2;
        if ((i10 & 8) != 0) {
            str3 = referral.campaign;
        }
        return referral.copy(j11, str7, str8, str3, (i10 & 16) != 0 ? referral.content : str4, (i10 & 32) != 0 ? referral.medium : str5, (i10 & 64) != 0 ? referral.term : str6, (i10 & 128) != 0 ? referral.inProgress : list);
    }

    public final long component1() {
        return this.sessionId;
    }

    @Nullable
    public final String component2() {
        return this.source;
    }

    @Nullable
    public final String component3() {
        return this.encryptedSource;
    }

    @Nullable
    public final String component4() {
        return this.campaign;
    }

    @Nullable
    public final String component5() {
        return this.content;
    }

    @Nullable
    public final String component6() {
        return this.medium;
    }

    @Nullable
    public final String component7() {
        return this.term;
    }

    @Nullable
    public final List<String> component8() {
        return this.inProgress;
    }

    @NotNull
    public final Referral copy(long j10, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable List<String> list) {
        return new Referral(j10, str, str2, str3, str4, str5, str6, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Referral)) {
            return false;
        }
        Referral referral = (Referral) obj;
        return this.sessionId == referral.sessionId && Intrinsics.areEqual(this.source, referral.source) && Intrinsics.areEqual(this.encryptedSource, referral.encryptedSource) && Intrinsics.areEqual(this.campaign, referral.campaign) && Intrinsics.areEqual(this.content, referral.content) && Intrinsics.areEqual(this.medium, referral.medium) && Intrinsics.areEqual(this.term, referral.term) && Intrinsics.areEqual(this.inProgress, referral.inProgress);
    }

    @Nullable
    public final String getCampaign() {
        return this.campaign;
    }

    @Override // com.devtodev.analytics.internal.domain.events.IEncodable
    @NotNull
    public String getCode() {
        return this.code;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getEncryptedSource() {
        return this.encryptedSource;
    }

    @Nullable
    public final List<String> getInProgress() {
        return this.inProgress;
    }

    @Override // com.devtodev.analytics.internal.domain.events.IEncodable
    @NotNull
    public String getJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.accumulate("code", "rf");
        jSONObject.accumulate("timestamp", Long.valueOf(this.timestamp));
        jSONObject.accumulate(UserEntry.sessionId, Long.valueOf(this.sessionId));
        jSONObject.accumulate("source", this.source);
        jSONObject.accumulate("encrypted_source", this.encryptedSource);
        jSONObject.accumulate("campaign", this.campaign);
        jSONObject.accumulate(FirebaseAnalytics.d.P, this.content);
        jSONObject.accumulate("medium", this.medium);
        jSONObject.accumulate(FirebaseAnalytics.d.O, this.term);
        List<String> list = this.inProgress;
        if (list != null && !list.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            Iterator<T> it = this.inProgress.iterator();
            while (it.hasNext()) {
                jSONArray.put((String) it.next());
            }
            jSONObject.accumulate(Metric.IN_PROGRESS_KEY, jSONArray);
        }
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString()");
        return string;
    }

    @Nullable
    public final String getMedium() {
        return this.medium;
    }

    public final long getSessionId() {
        return this.sessionId;
    }

    @Nullable
    public final String getSource() {
        return this.source;
    }

    @Nullable
    public final String getTerm() {
        return this.term;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.sessionId) * 31;
        String str = this.source;
        int iHashCode2 = 0;
        int iHashCode3 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.encryptedSource;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.campaign;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.content;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.medium;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.term;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<String> list = this.inProgress;
        if (list != null) {
            iHashCode2 = list.hashCode();
        }
        return iHashCode8 + iHashCode2;
    }

    @NotNull
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("\n\t code: rf\n");
        stringBuffer.append("\t timestamp: " + this.timestamp + "\n");
        stringBuffer.append("\t sessionId: " + this.sessionId + "\n");
        String str = this.source;
        if (str != null) {
            stringBuffer.append("\t source: " + str + "\n");
        }
        String str2 = this.encryptedSource;
        if (str2 != null) {
            stringBuffer.append("\t encrypted_source: " + str2 + "\n");
        }
        String str3 = this.campaign;
        if (str3 != null) {
            stringBuffer.append("\t campaign: " + str3 + "\n");
        }
        String str4 = this.content;
        if (str4 != null) {
            stringBuffer.append("\t content: " + str4 + "\n");
        }
        String str5 = this.medium;
        if (str5 != null) {
            stringBuffer.append("\t medium: " + str5 + "\n");
        }
        String str6 = this.term;
        if (str6 != null) {
            stringBuffer.append("\t term: " + str6 + "\n");
        }
        List<String> list = this.inProgress;
        if (list != null && !list.isEmpty()) {
            stringBuffer.append("\t inProgress: " + this.inProgress + "\n");
        }
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "result.toString()");
        return string;
    }

    public /* synthetic */ Referral(long j10, String str, String str2, String str3, String str4, String str5, String str6, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? null : str5, (i10 & 64) != 0 ? null : str6, (i10 & 128) != 0 ? null : list);
    }
}
