package com.devtodev.analytics.internal.domain.events.socialNetwork;

import com.devtodev.analytics.internal.domain.events.IEncodable;
import com.devtodev.analytics.internal.storage.sqlite.UserEntry;
import com.devtodev.core.data.metrics.Metric;
import h4.a;
import h4.b;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSocialPost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SocialPost.kt\ncom/devtodev/analytics/internal/domain/events/socialNetwork/SocialPost\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,78:1\n1855#2,2:79\n*S KotlinDebug\n*F\n+ 1 SocialPost.kt\ncom/devtodev/analytics/internal/domain/events/socialNetwork/SocialPost\n*L\n59#1:79,2\n*E\n"})
public final class SocialPost implements IEncodable {

    @NotNull
    private final String code;

    @Nullable
    private final List<String> inProgress;
    private final int level;

    @NotNull
    private final String postReason;
    private final long sessionId;

    @NotNull
    private final String socialNetwork;
    private final long timestamp;

    public SocialPost(int i10, long j10, @NotNull String socialNetwork, @NotNull String postReason, @Nullable List<String> list) {
        Intrinsics.checkNotNullParameter(socialNetwork, "socialNetwork");
        Intrinsics.checkNotNullParameter(postReason, "postReason");
        this.level = i10;
        this.sessionId = j10;
        this.socialNetwork = socialNetwork;
        this.postReason = postReason;
        this.inProgress = list;
        this.code = "sp";
        this.timestamp = System.currentTimeMillis();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SocialPost copy$default(SocialPost socialPost, int i10, long j10, String str, String str2, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = socialPost.level;
        }
        if ((i11 & 2) != 0) {
            j10 = socialPost.sessionId;
        }
        if ((i11 & 4) != 0) {
            str = socialPost.socialNetwork;
        }
        if ((i11 & 8) != 0) {
            str2 = socialPost.postReason;
        }
        if ((i11 & 16) != 0) {
            list = socialPost.inProgress;
        }
        List list2 = list;
        String str3 = str;
        return socialPost.copy(i10, j10, str3, str2, list2);
    }

    public final int component1() {
        return this.level;
    }

    public final long component2() {
        return this.sessionId;
    }

    @NotNull
    public final String component3() {
        return this.socialNetwork;
    }

    @NotNull
    public final String component4() {
        return this.postReason;
    }

    @Nullable
    public final List<String> component5() {
        return this.inProgress;
    }

    @NotNull
    public final SocialPost copy(int i10, long j10, @NotNull String socialNetwork, @NotNull String postReason, @Nullable List<String> list) {
        Intrinsics.checkNotNullParameter(socialNetwork, "socialNetwork");
        Intrinsics.checkNotNullParameter(postReason, "postReason");
        return new SocialPost(i10, j10, socialNetwork, postReason, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SocialPost)) {
            return false;
        }
        SocialPost socialPost = (SocialPost) obj;
        return this.level == socialPost.level && this.sessionId == socialPost.sessionId && Intrinsics.areEqual(this.socialNetwork, socialPost.socialNetwork) && Intrinsics.areEqual(this.postReason, socialPost.postReason) && Intrinsics.areEqual(this.inProgress, socialPost.inProgress);
    }

    @Override // com.devtodev.analytics.internal.domain.events.IEncodable
    @NotNull
    public String getCode() {
        return this.code;
    }

    @Nullable
    public final List<String> getInProgress() {
        return this.inProgress;
    }

    @Override // com.devtodev.analytics.internal.domain.events.IEncodable
    @NotNull
    public String getJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.accumulate("code", getCode());
        jSONObject.accumulate("timestamp", Long.valueOf(this.timestamp));
        jSONObject.accumulate("level", Integer.valueOf(this.level));
        jSONObject.accumulate(UserEntry.sessionId, Long.valueOf(this.sessionId));
        jSONObject.accumulate("socialNetwork", this.socialNetwork);
        jSONObject.accumulate("postReason", this.postReason);
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

    public final int getLevel() {
        return this.level;
    }

    @NotNull
    public final String getPostReason() {
        return this.postReason;
    }

    public final long getSessionId() {
        return this.sessionId;
    }

    @NotNull
    public final String getSocialNetwork() {
        return this.socialNetwork;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iA = b.a(this.postReason, b.a(this.socialNetwork, a.a(this.sessionId, Integer.hashCode(this.level) * 31, 31), 31), 31);
        List<String> list = this.inProgress;
        return iA + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n\t code: " + getCode() + "\n");
        stringBuffer.append("\t timestamp: " + this.timestamp + "\n");
        stringBuffer.append("\t level: " + this.level + "\n");
        stringBuffer.append("\t sessionId: " + this.sessionId + "\n");
        stringBuffer.append("\t socialNetwork: " + this.socialNetwork + "\n");
        stringBuffer.append("\t postReason: " + this.postReason + "\n");
        List<String> list = this.inProgress;
        if (list != null && !list.isEmpty()) {
            stringBuffer.append("\t inProgress: " + this.inProgress + "\n");
        }
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "result.toString()");
        return string;
    }
}
