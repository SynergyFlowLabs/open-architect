package com.appsflyer.internal;

import android.media.AudioTrack;
import android.view.View;
import com.appsflyer.AFLogger;
import com.facebook.internal.w0;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class AFf1wSDK extends AFf1uSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFKeystoreWrapper = 1;
    private static int registerClient;

    @NotNull
    private final AFc1pSDK equals;

    @NotNull
    private final AFi1fSDK hashCode;
    private static char[] AFInAppEventParameterName = {10791, 10809, 10763, 10805, 10784, 10788, 10801, 10813, 10802};
    private static char AFLogger = 8141;

    public /* synthetic */ AFf1wSDK(AFi1fSDK aFi1fSDK, AFc1pSDK aFc1pSDK, AFc1dSDK aFc1dSDK, AFh1eSDK aFh1eSDK, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFi1fSDK, aFc1pSDK, aFc1dSDK, (i10 & 8) != 0 ? new AFh1eSDK() : aFh1eSDK);
    }

    private static void a(byte b10, String str, int i10, Object[] objArr) {
        int i11;
        char[] charArray = str != null ? str.toCharArray() : str;
        AFk1mSDK aFk1mSDK = new AFk1mSDK();
        char[] cArr = AFInAppEventParameterName;
        if (cArr != null) {
            $11 = ($10 + 121) % 128;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i12 = 0; i12 < length; i12++) {
                cArr2[i12] = (char) (((long) cArr[i12]) ^ (-374623853307093042L));
            }
            cArr = cArr2;
        }
        char c10 = (char) ((-374623853307093042L) ^ ((long) AFLogger));
        char[] cArr3 = new char[i10];
        if (i10 % 2 != 0) {
            $10 = ($11 + 109) % 128;
            i11 = i10 - 1;
            cArr3[i11] = (char) (charArray[i11] - b10);
        } else {
            i11 = i10;
        }
        if (i11 > 1) {
            int i13 = $11 + 67;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            aFk1mSDK.AFAdRevenueData = 0;
            while (true) {
                int i15 = aFk1mSDK.AFAdRevenueData;
                if (i15 >= i11) {
                    break;
                }
                int i16 = $11;
                int i17 = (i16 + 57) % 128;
                $10 = i17;
                char c11 = charArray[i15];
                aFk1mSDK.getMonetizationNetwork = c11;
                char c12 = charArray[i15 + 1];
                aFk1mSDK.getCurrencyIso4217Code = c12;
                if (c11 == c12) {
                    int i18 = i16 + 81;
                    $10 = i18 % 128;
                    if (i18 % 2 != 0) {
                        cArr3[i15] = (char) (c11 >>> b10);
                        cArr3[i15 >> 1] = (char) (c12 << b10);
                    } else {
                        cArr3[i15] = (char) (c11 - b10);
                        cArr3[i15 + 1] = (char) (c12 - b10);
                    }
                } else {
                    int i19 = c11 / c10;
                    aFk1mSDK.getMediationNetwork = i19;
                    int i20 = c11 % c10;
                    aFk1mSDK.component1 = i20;
                    int i21 = c12 / c10;
                    aFk1mSDK.getRevenue = i21;
                    int i22 = c12 % c10;
                    aFk1mSDK.component2 = i22;
                    if (i20 == i22) {
                        int i23 = (i17 + 3) % 128;
                        $11 = i23;
                        int i24 = ((i19 + c10) - 1) % c10;
                        aFk1mSDK.getMediationNetwork = i24;
                        int i25 = ((i21 + c10) - 1) % c10;
                        aFk1mSDK.getRevenue = i25;
                        cArr3[i15] = cArr[(i24 * c10) + i20];
                        cArr3[i15 + 1] = cArr[(i25 * c10) + i22];
                        $10 = (i23 + 19) % 128;
                    } else if (i19 == i21) {
                        int i26 = ((i20 + c10) - 1) % c10;
                        aFk1mSDK.component1 = i26;
                        int i27 = ((i22 + c10) - 1) % c10;
                        aFk1mSDK.component2 = i27;
                        cArr3[i15] = cArr[(i19 * c10) + i26];
                        cArr3[i15 + 1] = cArr[(i21 * c10) + i27];
                    } else {
                        cArr3[i15] = cArr[(i19 * c10) + i22];
                        cArr3[i15 + 1] = cArr[(i21 * c10) + i20];
                    }
                }
                aFk1mSDK.AFAdRevenueData = i15 + 2;
            }
        }
        for (int i28 = 0; i28 < i10; i28++) {
            cArr3[i28] = (char) (cArr3[i28] ^ 13722);
        }
        objArr[0] = new String(cArr3);
    }

    private final void areAllFieldsValid(AFh1rSDK aFh1rSDK) {
        try {
            Map<String, ?> map = (Map) getRevenue(new Object[]{this}, -846475554, 846475554, System.identityHashCode(this));
            if (map != null) {
                int i10 = AFKeystoreWrapper + 97;
                registerClient = i10 % 128;
                if (i10 % 2 != 0) {
                    aFh1rSDK.getMediationNetwork(map);
                    throw null;
                }
                aFh1rSDK.getMediationNetwork(map);
            }
            if (this.hashCode.AFAdRevenueData()) {
                return;
            }
            registerClient = (AFKeystoreWrapper + 3) % 128;
            Map<String, Object> mapComponent1 = AFf1rSDK.component1(aFh1rSDK);
            Intrinsics.checkNotNullExpressionValue(mapComponent1, "");
            mapComponent1.put("pia_disabled", Boolean.TRUE);
        } catch (Throwable th2) {
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PLAY_INTEGRITY_API, "Error while adding PIA data to payload", th2, true, false, false, false, 96, null);
        }
    }

    private final Map<String, Object> copy() {
        return (Map) getRevenue(new Object[]{this}, -846475554, 846475554, System.identityHashCode(this));
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        AFf1wSDK aFf1wSDK = (AFf1wSDK) objArr[0];
        registerClient = (AFKeystoreWrapper + 75) % 128;
        AFi1hSDK currencyIso4217Code = aFf1wSDK.hashCode.getCurrencyIso4217Code();
        if (currencyIso4217Code == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("pia_timestamp", Long.valueOf(currencyIso4217Code.AFAdRevenueData));
        linkedHashMap2.put("ttr_millis", Long.valueOf(currencyIso4217Code.getRevenue));
        String str = currencyIso4217Code.getCurrencyIso4217Code;
        if (str != null) {
            int i10 = AFKeystoreWrapper + me.relex.circleindicator.a.f332619e;
            registerClient = i10 % 128;
            if (i10 % 2 != 0) {
                linkedHashMap2.put("pia_token", str);
                throw null;
            }
            linkedHashMap2.put("pia_token", str);
        }
        String str2 = currencyIso4217Code.getMonetizationNetwork;
        if (str2 != null) {
            registerClient = (AFKeystoreWrapper + 55) % 128;
            linkedHashMap2.put(w0.R0, str2);
            registerClient = (AFKeystoreWrapper + 19) % 128;
        }
        linkedHashMap.put("pia", linkedHashMap2);
        return linkedHashMap;
    }

    public static /* synthetic */ Object getRevenue(Object[] objArr, int i10, int i11, int i12) {
        return getCurrencyIso4217Code(objArr);
    }

    @Override // com.appsflyer.internal.AFf1uSDK
    protected final void AFAdRevenueData(int i10) {
        int i11 = registerClient + 69;
        AFKeystoreWrapper = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFf1rSDK, com.appsflyer.internal.AFe1dSDK
    protected final boolean copydefault() {
        int i10 = (registerClient + 31) % 128;
        AFKeystoreWrapper = i10;
        registerClient = (i10 + 67) % 128;
        return false;
    }

    @Override // com.appsflyer.internal.AFf1uSDK, com.appsflyer.internal.AFe1dSDK, com.appsflyer.internal.AFe1sSDK
    public final boolean getMediationNetwork() {
        registerClient = (AFKeystoreWrapper + 97) % 128;
        return false;
    }

    @Override // com.appsflyer.internal.AFe1dSDK, com.appsflyer.internal.AFe1sSDK
    public final long getMonetizationNetwork() {
        AFKeystoreWrapper = (registerClient + 63) % 128;
        long millis = TimeUnit.MINUTES.toMillis(1L);
        AFKeystoreWrapper = (registerClient + 85) % 128;
        return millis;
    }

    @Override // com.appsflyer.internal.AFf1uSDK, com.appsflyer.internal.AFf1rSDK
    protected final void AFAdRevenueData(@NotNull AFh1rSDK aFh1rSDK) {
        Intrinsics.checkNotNullParameter(aFh1rSDK, "");
        Map<String, Object> map = aFh1rSDK.AFAdRevenueData;
        Intrinsics.checkNotNullExpressionValue(map, "");
        int i10 = 5 << 0;
        Object[] objArr = new Object[1];
        a((byte) (View.resolveSize(0, 0) + com.planner5d.library.engine.input.f.b.f160745y1), "\u0005\u0006\u0001\u0005\u0001\u0004\u0000\u0003\u0005\u0004\u0002\u0004", 13 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr);
        map.put(((String) objArr[0]).intern(), String.valueOf(new Date().getTime()));
        super.AFAdRevenueData(aFh1rSDK);
        areAllFieldsValid(aFh1rSDK);
        AFg1qSDK aFg1qSDK = this.toString;
        Map<String, Object> map2 = aFh1rSDK.AFAdRevenueData;
        Intrinsics.checkNotNullExpressionValue(map2, "");
        aFg1qSDK.getRevenue(map2, this.equals.getMonetizationNetwork.AFAdRevenueData("appsFlyerCount", 0), this.equals.getMonetizationNetwork.AFAdRevenueData("appsFlyerInAppEventCount", 0));
        int i11 = registerClient + com.rabbitmq.client.impl.k.b.p.f265340a;
        AFKeystoreWrapper = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @oj.j
    private AFf1wSDK(@NotNull AFi1fSDK aFi1fSDK, @NotNull AFc1pSDK aFc1pSDK, @NotNull AFc1dSDK aFc1dSDK, @NotNull AFh1eSDK aFh1eSDK) {
        super(aFh1eSDK, aFc1dSDK);
        Intrinsics.checkNotNullParameter(aFi1fSDK, "");
        Intrinsics.checkNotNullParameter(aFc1pSDK, "");
        Intrinsics.checkNotNullParameter(aFc1dSDK, "");
        Intrinsics.checkNotNullParameter(aFh1eSDK, "");
        this.hashCode = aFi1fSDK;
        this.equals = aFc1pSDK;
        this.getCurrencyIso4217Code.add(AFe1mSDK.CONVERSION);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public AFf1wSDK(@NotNull AFi1fSDK aFi1fSDK, @NotNull AFc1pSDK aFc1pSDK, @NotNull AFc1dSDK aFc1dSDK) {
        this(aFi1fSDK, aFc1pSDK, aFc1dSDK, null, 8, null);
        Intrinsics.checkNotNullParameter(aFi1fSDK, "");
        Intrinsics.checkNotNullParameter(aFc1pSDK, "");
        Intrinsics.checkNotNullParameter(aFc1dSDK, "");
    }
}
