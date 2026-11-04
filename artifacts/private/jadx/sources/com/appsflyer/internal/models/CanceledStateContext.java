package com.appsflyer.internal.models;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import org.locationtech.jts.geom.l;

/* JADX INFO: loaded from: classes3.dex */
public final class CanceledStateContext {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Nullable
    private final DeveloperInitiatedCancellation developerInitiatedCancellation;

    @Nullable
    private final ReplacementCancellation replacementCancellation;

    @Nullable
    private final SystemInitiatedCancellation systemInitiatedCancellation;

    @Nullable
    private final UserInitiatedCancellation userInitiatedCancellation;

    public static final class Companion implements Deserialize<CanceledStateContext> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char InAppPurchaseEvent = 18800;
        private static int getOneTimePurchaseOfferDetails = 0;
        private static int getPackageName = -1483454096;
        private static int getQuantity = 1;
        private static long toJsonMap = -6786539459813153697L;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static void a(String str, int i10, String str2, char c10, String str3, Object[] objArr) {
            char[] charArray;
            char[] charArray2;
            $10 = ($11 + 25) % 128;
            if (str3 != null) {
                charArray = str3.toCharArray();
                $10 = ($11 + 41) % 128;
            } else {
                charArray = str3;
            }
            char[] cArr = charArray;
            if (str2 != null) {
                $10 = ($11 + 115) % 128;
                charArray2 = str2.toCharArray();
            } else {
                charArray2 = str2;
            }
            char[] cArr2 = charArray2;
            Object charArray3 = str;
            if (str != null) {
                charArray3 = str.toCharArray();
            }
            char[] cArr3 = (char[]) charArray3;
            AFPurchaseConnectorA1g aFPurchaseConnectorA1g = new AFPurchaseConnectorA1g();
            int length = cArr2.length;
            char[] cArr4 = new char[length];
            int length2 = cArr3.length;
            char[] cArr5 = new char[length2];
            System.arraycopy(cArr2, 0, cArr4, 0, length);
            System.arraycopy(cArr3, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c10);
            cArr5[2] = (char) (cArr5[2] + ((char) i10));
            int length3 = cArr.length;
            char[] cArr6 = new char[length3];
            aFPurchaseConnectorA1g.toJsonMap = 0;
            $10 = ($11 + 23) % 128;
            while (true) {
                int i11 = aFPurchaseConnectorA1g.toJsonMap;
                if (i11 >= length3) {
                    objArr[0] = new String(cArr6);
                    return;
                }
                $11 = ($10 + 57) % 128;
                int i12 = (i11 + 3) % 4;
                int i13 = cArr4[i11 % 4] * 32718;
                char c11 = cArr5[(i11 + 2) % 4];
                char c12 = (char) ((i13 + c11) % 65535);
                aFPurchaseConnectorA1g.InAppPurchaseEvent = c12;
                cArr5[i12] = (char) (((cArr4[i12] * 32718) + c11) / 65535);
                cArr4[i12] = c12;
                cArr6[i11] = (char) (((((long) (cArr[i11] ^ c12)) ^ (toJsonMap ^ (-5937322942767281808L))) ^ ((long) ((int) (((long) getPackageName) ^ (-5937322942767281808L))))) ^ ((long) ((char) (((long) InAppPurchaseEvent) ^ (-5937322942767281808L)))));
                aFPurchaseConnectorA1g.toJsonMap = i11 + 1;
            }
        }

        @Override // com.appsflyer.internal.models.Deserialize
        public final /* bridge */ /* synthetic */ CanceledStateContext fromJson(JSONObject jSONObject) {
            getQuantity = (getOneTimePurchaseOfferDetails + 121) % 128;
            CanceledStateContext canceledStateContextFromJson = fromJson(jSONObject);
            int i10 = getQuantity + 19;
            getOneTimePurchaseOfferDetails = i10 % 128;
            if (i10 % 2 == 0) {
                return canceledStateContextFromJson;
            }
            throw null;
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        @NotNull
        public final CanceledStateContext fromJson(@NotNull JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "");
            Object[] objArr = new Object[1];
            a("\u2d2f쐾㩬ో", View.MeasureSpec.getSize(0), "煙\ue22b缐폔", (char) (54398 - TextUtils.indexOf("", l.f338160j, 0, 0)), "昸̏\ued9b睕\ue04d쵂ݖ钔\uf132\ue8ff刄\ud81c諔罛\udcc1琘㒘㌙䬔圶拮ᇐ䶝极ꦭ썬蓫兿㓑念", objArr);
            DeveloperInitiatedCancellation developerInitiatedCancellation = (DeveloperInitiatedCancellation) SubscriptionPurchaseKt.toObject(jSONObject, ((String) objArr[0]).intern(), DeveloperInitiatedCancellation.Companion);
            Object[] objArr2 = new Object[1];
            a("\u2d2f쐾㩬ో", KeyEvent.keyCodeFromString("") - 198307482, "暷⸑间ꀈ", (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), "숆쫘ᤣ揻꺻簷ឳ㭹좹矱焚த겱ㅫ胞Ꙭ豴鱊୕蜾Ꝟ彼죸", objArr2);
            ReplacementCancellation replacementCancellation = (ReplacementCancellation) SubscriptionPurchaseKt.toObject(jSONObject, ((String) objArr2[0]).intern(), ReplacementCancellation.Companion);
            Object[] objArr3 = new Object[1];
            a("\u2d2f쐾㩬ో", (-322855257) - View.resolveSizeAndState(0, 0, 0), "Ꜣ솞䋬\ude81", (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 33090), "䀠펵༦ᡁ甙ꅈ៉偙⬾繭㣨\uf058\u0a29ｚ䓕䝓ﵑ諎烐寙掇捨쭭\ude9d낔ਢ⥏", objArr3);
            SystemInitiatedCancellation systemInitiatedCancellation = (SystemInitiatedCancellation) SubscriptionPurchaseKt.toObject(jSONObject, ((String) objArr3[0]).intern(), SystemInitiatedCancellation.Companion);
            Object[] objArr4 = new Object[1];
            a("\u2d2f쐾㩬ో", (-2117352908) - Color.green(0), "㑵쯂ꒁ櫾", (char) TextUtils.getOffsetAfter("", 0), "窭\ue21c\ue654츸ቿ젴숂齝빼\uf6e5⬘틪牭뻦ⵄ끵픞Ø캸횺叹쮟\uf0af尖\uf3f8", objArr4);
            CanceledStateContext canceledStateContext = new CanceledStateContext(developerInitiatedCancellation, replacementCancellation, systemInitiatedCancellation, (UserInitiatedCancellation) SubscriptionPurchaseKt.toObject(jSONObject, ((String) objArr4[0]).intern(), UserInitiatedCancellation.Companion));
            getQuantity = (getOneTimePurchaseOfferDetails + 13) % 128;
            return canceledStateContext;
        }
    }

    static {
        int i10 = 2 ^ 0;
    }

    public CanceledStateContext(@Nullable DeveloperInitiatedCancellation developerInitiatedCancellation, @Nullable ReplacementCancellation replacementCancellation, @Nullable SystemInitiatedCancellation systemInitiatedCancellation, @Nullable UserInitiatedCancellation userInitiatedCancellation) {
        this.developerInitiatedCancellation = developerInitiatedCancellation;
        this.replacementCancellation = replacementCancellation;
        this.systemInitiatedCancellation = systemInitiatedCancellation;
        this.userInitiatedCancellation = userInitiatedCancellation;
    }

    public static /* synthetic */ CanceledStateContext copy$default(CanceledStateContext canceledStateContext, DeveloperInitiatedCancellation developerInitiatedCancellation, ReplacementCancellation replacementCancellation, SystemInitiatedCancellation systemInitiatedCancellation, UserInitiatedCancellation userInitiatedCancellation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            developerInitiatedCancellation = canceledStateContext.developerInitiatedCancellation;
        }
        if ((i10 & 2) != 0) {
            replacementCancellation = canceledStateContext.replacementCancellation;
        }
        if ((i10 & 4) != 0) {
            systemInitiatedCancellation = canceledStateContext.systemInitiatedCancellation;
        }
        if ((i10 & 8) != 0) {
            userInitiatedCancellation = canceledStateContext.userInitiatedCancellation;
        }
        return canceledStateContext.copy(developerInitiatedCancellation, replacementCancellation, systemInitiatedCancellation, userInitiatedCancellation);
    }

    @Nullable
    public final DeveloperInitiatedCancellation component1() {
        return this.developerInitiatedCancellation;
    }

    @Nullable
    public final ReplacementCancellation component2() {
        return this.replacementCancellation;
    }

    @Nullable
    public final SystemInitiatedCancellation component3() {
        return this.systemInitiatedCancellation;
    }

    @Nullable
    public final UserInitiatedCancellation component4() {
        return this.userInitiatedCancellation;
    }

    @NotNull
    public final CanceledStateContext copy(@Nullable DeveloperInitiatedCancellation developerInitiatedCancellation, @Nullable ReplacementCancellation replacementCancellation, @Nullable SystemInitiatedCancellation systemInitiatedCancellation, @Nullable UserInitiatedCancellation userInitiatedCancellation) {
        return new CanceledStateContext(developerInitiatedCancellation, replacementCancellation, systemInitiatedCancellation, userInitiatedCancellation);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CanceledStateContext)) {
            return false;
        }
        CanceledStateContext canceledStateContext = (CanceledStateContext) obj;
        return Intrinsics.areEqual(this.developerInitiatedCancellation, canceledStateContext.developerInitiatedCancellation) && Intrinsics.areEqual(this.replacementCancellation, canceledStateContext.replacementCancellation) && Intrinsics.areEqual(this.systemInitiatedCancellation, canceledStateContext.systemInitiatedCancellation) && Intrinsics.areEqual(this.userInitiatedCancellation, canceledStateContext.userInitiatedCancellation);
    }

    @i(name = "getDeveloperInitiatedCancellation")
    @Nullable
    public final DeveloperInitiatedCancellation getDeveloperInitiatedCancellation() {
        return this.developerInitiatedCancellation;
    }

    @i(name = "getReplacementCancellation")
    @Nullable
    public final ReplacementCancellation getReplacementCancellation() {
        return this.replacementCancellation;
    }

    @i(name = "getSystemInitiatedCancellation")
    @Nullable
    public final SystemInitiatedCancellation getSystemInitiatedCancellation() {
        return this.systemInitiatedCancellation;
    }

    @i(name = "getUserInitiatedCancellation")
    @Nullable
    public final UserInitiatedCancellation getUserInitiatedCancellation() {
        return this.userInitiatedCancellation;
    }

    public final int hashCode() {
        DeveloperInitiatedCancellation developerInitiatedCancellation = this.developerInitiatedCancellation;
        int iHashCode = (developerInitiatedCancellation == null ? 0 : developerInitiatedCancellation.hashCode()) * 31;
        ReplacementCancellation replacementCancellation = this.replacementCancellation;
        int iHashCode2 = (iHashCode + (replacementCancellation == null ? 0 : replacementCancellation.hashCode())) * 31;
        SystemInitiatedCancellation systemInitiatedCancellation = this.systemInitiatedCancellation;
        int iHashCode3 = (iHashCode2 + (systemInitiatedCancellation == null ? 0 : systemInitiatedCancellation.hashCode())) * 31;
        UserInitiatedCancellation userInitiatedCancellation = this.userInitiatedCancellation;
        return iHashCode3 + (userInitiatedCancellation != null ? userInitiatedCancellation.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "CanceledStateContext(developerInitiatedCancellation=" + this.developerInitiatedCancellation + ", replacementCancellation=" + this.replacementCancellation + ", systemInitiatedCancellation=" + this.systemInitiatedCancellation + ", userInitiatedCancellation=" + this.userInitiatedCancellation + ")";
    }
}
