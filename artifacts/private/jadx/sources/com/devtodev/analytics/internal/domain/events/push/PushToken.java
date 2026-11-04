package com.devtodev.analytics.internal.domain.events.push;

import com.devtodev.analytics.internal.domain.events.IEncodable;
import com.devtodev.analytics.internal.storage.sqlite.UserEntry;
import h4.a;
import h4.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.openid.appauth.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class PushToken implements IEncodable {

    @NotNull
    private final String code;
    private final boolean isAllowed;

    @Nullable
    private final Long sessionId;
    private final long timestamp;

    @NotNull
    private final String token;

    public PushToken(@NotNull String code, long j10, @Nullable Long l10, @NotNull String token, boolean z10) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(token, "token");
        this.code = code;
        this.timestamp = j10;
        this.sessionId = l10;
        this.token = token;
        this.isAllowed = z10;
    }

    public static /* synthetic */ PushToken copy$default(PushToken pushToken, String str, long j10, Long l10, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = pushToken.getCode();
        }
        if ((i10 & 2) != 0) {
            j10 = pushToken.timestamp;
        }
        if ((i10 & 4) != 0) {
            l10 = pushToken.sessionId;
        }
        if ((i10 & 8) != 0) {
            str2 = pushToken.token;
        }
        if ((i10 & 16) != 0) {
            z10 = pushToken.isAllowed;
        }
        boolean z11 = z10;
        Long l11 = l10;
        return pushToken.copy(str, j10, l11, str2, z11);
    }

    @NotNull
    public final String component1() {
        return getCode();
    }

    public final long component2() {
        return this.timestamp;
    }

    @Nullable
    public final Long component3() {
        return this.sessionId;
    }

    @NotNull
    public final String component4() {
        return this.token;
    }

    public final boolean component5() {
        return this.isAllowed;
    }

    @NotNull
    public final PushToken copy(@NotNull String code, long j10, @Nullable Long l10, @NotNull String token, boolean z10) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(token, "token");
        return new PushToken(code, j10, l10, token, z10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PushToken)) {
            return false;
        }
        PushToken pushToken = (PushToken) obj;
        return Intrinsics.areEqual(getCode(), pushToken.getCode()) && this.timestamp == pushToken.timestamp && Intrinsics.areEqual(this.sessionId, pushToken.sessionId) && Intrinsics.areEqual(this.token, pushToken.token) && this.isAllowed == pushToken.isAllowed;
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
        jSONObject.accumulate("code", "pt");
        jSONObject.accumulate("timestamp", Long.valueOf(this.timestamp));
        jSONObject.accumulate(UserEntry.sessionId, this.sessionId);
        jSONObject.accumulate(x.f333313b, this.token);
        jSONObject.accumulate("isAllowed", Boolean.valueOf(this.isAllowed));
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString()");
        return string;
    }

    @Nullable
    public final Long getSessionId() {
        return this.sessionId;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    public int hashCode() {
        int iA = a.a(this.timestamp, getCode().hashCode() * 31, 31);
        Long l10 = this.sessionId;
        int iA2 = b.a(this.token, (iA + (l10 == null ? 0 : l10.hashCode())) * 31, 31);
        boolean z10 = this.isAllowed;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iA2 + r10;
    }

    public final boolean isAllowed() {
        return this.isAllowed;
    }

    @NotNull
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n\t code: " + getCode() + "\n");
        stringBuffer.append("\t timestamp: " + this.timestamp + "\n");
        stringBuffer.append("\t sessionId: " + this.sessionId + "\n");
        stringBuffer.append("\t token: " + this.token + "\n");
        stringBuffer.append("\t isAllowed: " + this.isAllowed + "\n");
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "result.toString()");
        return string;
    }

    public /* synthetic */ PushToken(String str, long j10, Long l10, String str2, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "pt" : str, (i10 & 2) != 0 ? System.currentTimeMillis() : j10, l10, str2, z10);
    }
}
