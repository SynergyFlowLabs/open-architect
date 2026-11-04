package com.devtodev.analytics.internal.domain.events.push;

import com.devtodev.analytics.internal.domain.events.IEncodable;
import com.devtodev.analytics.internal.storage.sqlite.UserEntry;
import h4.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nPushOpened.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PushOpened.kt\ncom/devtodev/analytics/internal/domain/events/push/PushOpened\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,60:1\n1#2:61\n*E\n"})
public final class PushOpened implements IEncodable {

    @Nullable
    private final String button;

    @NotNull
    private final String code;
    private final int pushId;

    @Nullable
    private final Long sessionId;
    private final long timestamp;

    public PushOpened(@NotNull String code, long j10, @Nullable Long l10, int i10, @Nullable String str) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.code = code;
        this.timestamp = j10;
        this.sessionId = l10;
        this.pushId = i10;
        this.button = str;
    }

    public static /* synthetic */ PushOpened copy$default(PushOpened pushOpened, String str, long j10, Long l10, int i10, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = pushOpened.getCode();
        }
        if ((i11 & 2) != 0) {
            j10 = pushOpened.timestamp;
        }
        if ((i11 & 4) != 0) {
            l10 = pushOpened.sessionId;
        }
        if ((i11 & 8) != 0) {
            i10 = pushOpened.pushId;
        }
        if ((i11 & 16) != 0) {
            str2 = pushOpened.button;
        }
        String str3 = str2;
        Long l11 = l10;
        return pushOpened.copy(str, j10, l11, i10, str3);
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

    public final int component4() {
        return this.pushId;
    }

    @Nullable
    public final String component5() {
        return this.button;
    }

    @NotNull
    public final PushOpened copy(@NotNull String code, long j10, @Nullable Long l10, int i10, @Nullable String str) {
        Intrinsics.checkNotNullParameter(code, "code");
        return new PushOpened(code, j10, l10, i10, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PushOpened)) {
            return false;
        }
        PushOpened pushOpened = (PushOpened) obj;
        return Intrinsics.areEqual(getCode(), pushOpened.getCode()) && this.timestamp == pushOpened.timestamp && Intrinsics.areEqual(this.sessionId, pushOpened.sessionId) && this.pushId == pushOpened.pushId && Intrinsics.areEqual(this.button, pushOpened.button);
    }

    @Nullable
    public final String getButton() {
        return this.button;
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
        jSONObject.accumulate("code", getCode());
        jSONObject.accumulate("timestamp", Long.valueOf(this.timestamp));
        Long l10 = this.sessionId;
        if (l10 != null) {
            jSONObject.accumulate(UserEntry.sessionId, Long.valueOf(l10.longValue()));
        }
        jSONObject.accumulate("pushId", Integer.valueOf(this.pushId));
        String str = this.button;
        if (str != null) {
            jSONObject.accumulate("button", str);
        }
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString()");
        return string;
    }

    public final int getPushId() {
        return this.pushId;
    }

    @Nullable
    public final Long getSessionId() {
        return this.sessionId;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iA = a.a(this.timestamp, getCode().hashCode() * 31, 31);
        Long l10 = this.sessionId;
        int iHashCode = (Integer.hashCode(this.pushId) + ((iA + (l10 == null ? 0 : l10.hashCode())) * 31)) * 31;
        String str = this.button;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n\t code: " + getCode() + "\n");
        stringBuffer.append("\t timestamp: " + this.timestamp + "\n");
        Long l10 = this.sessionId;
        if (l10 != null) {
            stringBuffer.append("\t sessionId: " + l10.longValue() + "\n");
        }
        stringBuffer.append("\t pushId: " + this.pushId + "\n");
        String str = this.button;
        if (str != null) {
            stringBuffer.append("\t button: " + str + "\n");
        }
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "result.toString()");
        return string;
    }

    public /* synthetic */ PushOpened(String str, long j10, Long l10, int i10, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "po" : str, (i11 & 2) != 0 ? System.currentTimeMillis() : j10, l10, i10, (i11 & 16) != 0 ? null : str2);
    }
}
