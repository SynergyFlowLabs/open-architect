package com.appsflyer.internal.models;

import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import org.locationtech.jts.geom.l;

/* JADX INFO: loaded from: classes3.dex */
public final class UserInitiatedCancellation {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Nullable
    private final CancelSurveyResult cancelSurveyResult;

    @NotNull
    private final String cancelTime;

    public static final class Companion implements Deserialize<UserInitiatedCancellation> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char[] InAppPurchaseEvent = {2371, 13044, 32292, 47708, 59281, 9157, 28493, 43174, 54522, 4107, 23639, 39326, 50446, 372, 19125, 30414, 45596, 65105, 34006, 48993, 62385, 14281, 27140, 44624, 58079, 9519, 22896, 40333};
        private static long getOneTimePurchaseOfferDetails = 6358742317500609173L;
        private static int getQuantity = 1;
        private static int toJsonMap;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static void a(int i10, char c10, int i11, Object[] objArr) {
            AFPurchaseConnectorA1o aFPurchaseConnectorA1o = new AFPurchaseConnectorA1o();
            long[] jArr = new long[i10];
            aFPurchaseConnectorA1o.getOneTimePurchaseOfferDetails = 0;
            while (true) {
                int i12 = aFPurchaseConnectorA1o.getOneTimePurchaseOfferDetails;
                if (i12 >= i10) {
                    break;
                }
                jArr[i12] = (((long) ((char) (((long) InAppPurchaseEvent[i11 + i12]) ^ 1631790634049145120L))) ^ (((long) i12) * (1631790634049145120L ^ getOneTimePurchaseOfferDetails))) ^ ((long) c10);
                aFPurchaseConnectorA1o.getOneTimePurchaseOfferDetails = i12 + 1;
            }
            char[] cArr = new char[i10];
            aFPurchaseConnectorA1o.getOneTimePurchaseOfferDetails = 0;
            while (true) {
                int i13 = aFPurchaseConnectorA1o.getOneTimePurchaseOfferDetails;
                if (i13 >= i10) {
                    objArr[0] = new String(cArr);
                    return;
                }
                int i14 = $11;
                $10 = (i14 + 3) % 128;
                cArr[i13] = (char) jArr[i13];
                aFPurchaseConnectorA1o.getOneTimePurchaseOfferDetails = i13 + 1;
                $10 = (i14 + 11) % 128;
            }
        }

        @Override // com.appsflyer.internal.models.Deserialize
        public final /* bridge */ /* synthetic */ UserInitiatedCancellation fromJson(JSONObject jSONObject) {
            getQuantity = (toJsonMap + 115) % 128;
            UserInitiatedCancellation userInitiatedCancellationFromJson = fromJson(jSONObject);
            getQuantity = (toJsonMap + 57) % 128;
            return userInitiatedCancellationFromJson;
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        @NotNull
        public final UserInitiatedCancellation fromJson(@NotNull JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "");
            Object[] objArr = new Object[1];
            a(TextUtils.indexOf("", l.f338160j, 0) + 19, (char) Drawable.resolveOpacity(0, 0), AndroidCharacter.getMirror(l.f338160j) - '0', objArr);
            CancelSurveyResult cancelSurveyResult = (CancelSurveyResult) SubscriptionPurchaseKt.toObject(jSONObject, ((String) objArr[0]).intern(), CancelSurveyResult.Companion);
            Object[] objArr2 = new Object[1];
            a(TextUtils.indexOf("", "") + 10, (char) (36245 - (ViewConfiguration.getPressedStateDuration() >> 16)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 18, objArr2);
            String strOptString = jSONObject.optString(((String) objArr2[0]).intern());
            Intrinsics.checkNotNullExpressionValue(strOptString, "");
            UserInitiatedCancellation userInitiatedCancellation = new UserInitiatedCancellation(cancelSurveyResult, strOptString);
            toJsonMap = (getQuantity + 95) % 128;
            return userInitiatedCancellation;
        }
    }

    public UserInitiatedCancellation(@Nullable CancelSurveyResult cancelSurveyResult, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cancelSurveyResult = cancelSurveyResult;
        this.cancelTime = str;
    }

    public static /* synthetic */ UserInitiatedCancellation copy$default(UserInitiatedCancellation userInitiatedCancellation, CancelSurveyResult cancelSurveyResult, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancelSurveyResult = userInitiatedCancellation.cancelSurveyResult;
        }
        if ((i10 & 2) != 0) {
            str = userInitiatedCancellation.cancelTime;
        }
        return userInitiatedCancellation.copy(cancelSurveyResult, str);
    }

    @Nullable
    public final CancelSurveyResult component1() {
        return this.cancelSurveyResult;
    }

    @NotNull
    public final String component2() {
        return this.cancelTime;
    }

    @NotNull
    public final UserInitiatedCancellation copy(@Nullable CancelSurveyResult cancelSurveyResult, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new UserInitiatedCancellation(cancelSurveyResult, str);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserInitiatedCancellation)) {
            return false;
        }
        UserInitiatedCancellation userInitiatedCancellation = (UserInitiatedCancellation) obj;
        return Intrinsics.areEqual(this.cancelSurveyResult, userInitiatedCancellation.cancelSurveyResult) && Intrinsics.areEqual(this.cancelTime, userInitiatedCancellation.cancelTime);
    }

    @i(name = "getCancelSurveyResult")
    @Nullable
    public final CancelSurveyResult getCancelSurveyResult() {
        return this.cancelSurveyResult;
    }

    @i(name = "getCancelTime")
    @NotNull
    public final String getCancelTime() {
        return this.cancelTime;
    }

    public final int hashCode() {
        CancelSurveyResult cancelSurveyResult = this.cancelSurveyResult;
        return ((cancelSurveyResult == null ? 0 : cancelSurveyResult.hashCode()) * 31) + this.cancelTime.hashCode();
    }

    @NotNull
    public final String toString() {
        return "UserInitiatedCancellation(cancelSurveyResult=" + this.cancelSurveyResult + ", cancelTime=" + this.cancelTime + ")";
    }
}
