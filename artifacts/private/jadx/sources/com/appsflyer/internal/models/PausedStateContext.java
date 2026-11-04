package com.appsflyer.internal.models;

import android.media.AudioTrack;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1j;
import com.rabbitmq.client.impl.k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oj.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class PausedStateContext {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final String autoResumeTime;

    @SourceDebugExtension({"SMAP\nSubscriptionPurchase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubscriptionPurchase.kt\ncom/appsflyer/internal/models/PausedStateContext$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,381:1\n1#2:382\n*E\n"})
    public static final class Companion implements Deserialize<PausedStateContext> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char InAppPurchaseEvent = 30539;
        private static char getOneTimePurchaseOfferDetails = 27082;
        private static char getPackageName = 24806;
        private static char getQuantity = 9006;
        private static int stopObservingTransactions = 1;
        private static int toJsonMap;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001e  */
        /* JADX WARN: Code duplicated, block: B:11:0x0025  */
        /* JADX WARN: Code duplicated, block: B:12:0x002a  */
        /* JADX WARN: Code duplicated, block: B:8:0x0015  */
        private static void a(String str, int i10, Object[] objArr) {
            int i11;
            Object charArray;
            int i12;
            int i13 = $10 + 31;
            int i14 = i13 % 128;
            $11 = i14;
            if (i13 % 2 == 0) {
                int i15 = 16 / 0;
                if (str != null) {
                    i11 = i14 + 43;
                    $10 = i11 % 128;
                    if (i11 % 2 != 0) {
                        charArray = str.toCharArray();
                        int i16 = 1 / 0;
                    } else {
                        charArray = str.toCharArray();
                    }
                } else {
                    charArray = str;
                }
            } else if (str != null) {
                i11 = i14 + 43;
                $10 = i11 % 128;
                if (i11 % 2 != 0) {
                    charArray = str.toCharArray();
                    int i17 = 1 / 0;
                } else {
                    charArray = str.toCharArray();
                }
            } else {
                charArray = str;
            }
            char[] cArr = (char[]) charArray;
            AFPurchaseConnectorA1j aFPurchaseConnectorA1j = new AFPurchaseConnectorA1j();
            char[] cArr2 = new char[cArr.length];
            aFPurchaseConnectorA1j.getQuantity = 0;
            char[] cArr3 = new char[2];
            $10 = ($11 + 25) % 128;
            while (true) {
                int i18 = aFPurchaseConnectorA1j.getQuantity;
                if (i18 >= cArr.length) {
                    objArr[0] = new String(cArr2, 0, i10);
                    return;
                }
                int i19 = $11 + k.b.p.f265340a;
                $10 = i19 % 128;
                int i20 = 58224;
                if (i19 % 2 != 0) {
                    cArr3[1] = cArr[i18];
                    cArr3[1] = cArr[i18 >> 1];
                    i12 = 1;
                } else {
                    cArr3[0] = cArr[i18];
                    cArr3[1] = cArr[i18 + 1];
                    i12 = 0;
                }
                while (i12 < 16) {
                    char c10 = cArr3[1];
                    char c11 = cArr3[0];
                    char c12 = (char) (c10 - (((c11 + i20) ^ ((c11 << 4) + ((char) (((long) getPackageName) ^ 4722258354688939700L)))) ^ ((c11 >>> 5) + ((char) (((long) getQuantity) ^ 4722258354688939700L)))));
                    cArr3[1] = c12;
                    cArr3[0] = (char) (c11 - (((c12 >>> 5) + ((char) (((long) getOneTimePurchaseOfferDetails) ^ 4722258354688939700L))) ^ ((c12 + i20) ^ ((c12 << 4) + ((char) (((long) InAppPurchaseEvent) ^ 4722258354688939700L))))));
                    i20 -= 40503;
                    i12++;
                }
                int i21 = aFPurchaseConnectorA1j.getQuantity;
                cArr2[i21] = cArr3[0];
                cArr2[i21 + 1] = cArr3[1];
                aFPurchaseConnectorA1j.getQuantity = i21 + 2;
            }
        }

        @Override // com.appsflyer.internal.models.Deserialize
        public final /* synthetic */ PausedStateContext fromJson(JSONObject jSONObject) {
            int i10 = stopObservingTransactions + 41;
            toJsonMap = i10 % 128;
            if (i10 % 2 != 0) {
                fromJson(jSONObject);
                throw null;
            }
            PausedStateContext pausedStateContextFromJson = fromJson(jSONObject);
            stopObservingTransactions = (toJsonMap + 51) % 128;
            return pausedStateContextFromJson;
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        @NotNull
        public final PausedStateContext fromJson(@NotNull JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "");
            Object[] objArr = new Object[1];
            a("\udf92ᮜ趣㏲г튧뮏薷聵\uecf0짆첏聵\uecf0", 15 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr);
            String strOptString = jSONObject.optString(((String) objArr[0]).intern());
            Intrinsics.checkNotNullExpressionValue(strOptString, "");
            PausedStateContext pausedStateContext = new PausedStateContext(strOptString);
            stopObservingTransactions = (toJsonMap + 63) % 128;
            return pausedStateContext;
        }
    }

    public PausedStateContext(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.autoResumeTime = str;
    }

    public static /* synthetic */ PausedStateContext copy$default(PausedStateContext pausedStateContext, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = pausedStateContext.autoResumeTime;
        }
        return pausedStateContext.copy(str);
    }

    @NotNull
    public final String component1() {
        return this.autoResumeTime;
    }

    @NotNull
    public final PausedStateContext copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new PausedStateContext(str);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PausedStateContext) && Intrinsics.areEqual(this.autoResumeTime, ((PausedStateContext) obj).autoResumeTime);
    }

    @i(name = "getAutoResumeTime")
    @NotNull
    public final String getAutoResumeTime() {
        return this.autoResumeTime;
    }

    public final int hashCode() {
        return this.autoResumeTime.hashCode();
    }

    @NotNull
    public final String toString() {
        return "PausedStateContext(autoResumeTime=" + this.autoResumeTime + ")";
    }
}
