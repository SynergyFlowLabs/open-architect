package com.appsflyer.internal;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.devtodev.core.data.metrics.MetricConsts;
import com.facebook.AccessToken;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nMetaReferrer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MetaReferrer.kt\ncom/appsflyer/internal/referrer/MetaReferrer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,295:1\n1#2:296\n*E\n"})
public final class AFj1zSDK extends AFi1dSDK {

    @NotNull
    private final Runnable component3;

    @NotNull
    private final AFj1ySDK getCurrencyIso4217Code;

    @NotNull
    private final AFc1pSDK getMediationNetwork;

    @NotNull
    private final ExecutorService getMonetizationNetwork;

    @Nullable
    private String hashCode;

    public /* synthetic */ class AFa1vSDK {
        public static final /* synthetic */ int[] getMonetizationNetwork;

        static {
            int[] iArr = new int[AFj1ySDK.values().length];
            try {
                iArr[AFj1ySDK.FACEBOOK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFj1ySDK.INSTAGRAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFj1ySDK.FACEBOOK_LITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            getMonetizationNetwork = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AFj1zSDK(@NotNull AFc1pSDK aFc1pSDK, @NotNull ExecutorService executorService, @NotNull AFj1ySDK aFj1ySDK, @NotNull Runnable runnable, @NotNull Runnable runnable2) {
        String str;
        Intrinsics.checkNotNullParameter(aFc1pSDK, "");
        Intrinsics.checkNotNullParameter(executorService, "");
        Intrinsics.checkNotNullParameter(aFj1ySDK, "");
        Intrinsics.checkNotNullParameter(runnable, "");
        Intrinsics.checkNotNullParameter(runnable2, "");
        int i10 = AFj1xSDK.AFa1ySDK.getMonetizationNetwork[aFj1ySDK.ordinal()];
        if (i10 == 1) {
            str = AccessToken.f98376v;
        } else if (i10 == 2) {
            str = com.facebook.g0.O;
        } else {
            if (i10 != 3) {
                throw new kotlin.k0();
            }
            str = "facebook_lite";
        }
        super("app", str, aFc1pSDK, runnable);
        this.getMediationNetwork = aFc1pSDK;
        this.getMonetizationNetwork = executorService;
        this.getCurrencyIso4217Code = aFj1ySDK;
        this.component3 = runnable2;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a9 A[PHI: r0
      0x00a9: PHI (r0v8 java.lang.String) = (r0v7 java.lang.String), (r0v14 java.lang.String), (r0v20 java.lang.String) binds: [B:15:0x004e, B:25:0x007c, B:34:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
    private final boolean AFAdRevenueData(Context context) {
        String str;
        if (!getRevenue()) {
            AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Referrer collection disallowed by counter.", false, 4, null);
            return false;
        }
        String currencyIso4217Code = this.getMediationNetwork.getCurrencyIso4217Code(com.facebook.g0.f99641y);
        String strD4 = currencyIso4217Code != null ? StringsKt.d4(currencyIso4217Code, MetricConsts.FacebookInfo) : null;
        if (strD4 == null || strD4.length() == 0) {
            AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook app id Manifest metadata is not found.", false, 4, null);
            strD4 = null;
        }
        if (strD4 == null) {
            String revenue = this.getMediationNetwork.getRevenue("facebook_application_id");
            strD4 = revenue != null ? StringsKt.d4(revenue, MetricConsts.FacebookInfo) : null;
            if (strD4 == null || strD4.length() == 0) {
                AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook app id string resource is not found.", false, 4, null);
                strD4 = null;
            }
            if (strD4 == null) {
                String currencyIso4217Code2 = this.getMediationNetwork.getCurrencyIso4217Code("com.appsflyer.FacebookApplicationId");
                strD4 = currencyIso4217Code2 != null ? StringsKt.d4(currencyIso4217Code2, MetricConsts.FacebookInfo) : null;
                if (strD4 == null || strD4.length() == 0) {
                    AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "AF Facebook app id Manifest metadata is not found.", false, 4, null);
                    strD4 = null;
                }
                str = strD4 != null ? strD4 : null;
            }
        }
        this.hashCode = str;
        if (str == null) {
            AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Referrer collection disallowed by missing Facebook app id.", false, 4, null);
            return false;
        }
        if (getCurrencyIso4217Code(context)) {
            return true;
        }
        int i10 = 3 | 4;
        AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Referrer collection disallowed by missing content providers.", false, 4, null);
        return false;
    }

    private static boolean component2(Context context) {
        return context.getPackageManager().resolveContentProvider("com.facebook.lite.provider.InstallReferrerProvider", 0) != null;
    }

    private final boolean getCurrencyIso4217Code(Context context) {
        int i10 = AFa1vSDK.getMonetizationNetwork[this.getCurrencyIso4217Code.ordinal()];
        if (i10 == 1) {
            return getMediationNetwork(context);
        }
        if (i10 == 2) {
            return getMonetizationNetwork(context);
        }
        if (i10 == 3) {
            return component2(context);
        }
        throw new kotlin.k0();
    }

    private static boolean getMediationNetwork(Context context) {
        return context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.InstallReferrerProvider", 0) != null;
    }

    private static boolean getMonetizationNetwork(Context context) {
        return context.getPackageManager().resolveContentProvider("com.instagram.contentprovider.InstallReferrerProvider", 0) != null;
    }

    @Override // com.appsflyer.internal.AFj1qSDK
    @e.a({"NewApi"})
    public final void getRevenue(@NotNull final Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (AFAdRevenueData(context)) {
            this.getMonetizationNetwork.execute(new Runnable() { // from class: com.appsflyer.internal.q0
                @Override // java.lang.Runnable
                public final void run() {
                    AFj1zSDK.getMonetizationNetwork(this.f89731a, context);
                }
            });
        } else {
            this.component3.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:72:0x0246 A[PHI: r20
      0x0246: PHI (r20v3 android.content.ContentProviderClient) = 
      (r20v2 android.content.ContentProviderClient)
      (r20v4 android.content.ContentProviderClient)
      (r20v4 android.content.ContentProviderClient)
     binds: [B:81:0x028b, B:71:0x0244, B:76:0x025b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x0258  */
    /* JADX WARN: Code duplicated, block: B:80:0x0288  */
    public static final void getMonetizationNetwork(AFj1zSDK aFj1zSDK, Context context) {
        Throwable th2;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient;
        Cursor cursor;
        Uri uri;
        String string;
        String str;
        Intrinsics.checkNotNullParameter(aFj1zSDK, "");
        Intrinsics.checkNotNullParameter(context, "");
        aFj1zSDK.component1 = System.currentTimeMillis();
        aFj1zSDK.component4 = AFj1qSDK.AFa1ySDK.STARTED;
        aFj1zSDK.addObserver(new AFj1qSDK.AnonymousClass5());
        String str2 = aFj1zSDK.hashCode;
        Intrinsics.checkNotNull(str2);
        try {
            AFj1ySDK aFj1ySDK = aFj1zSDK.getCurrencyIso4217Code;
            int[] iArr = AFa1vSDK.getMonetizationNetwork;
            int i10 = iArr[aFj1ySDK.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        throw new kotlin.k0();
                    }
                    if (component2(context)) {
                        AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Found Facebook Lite content provider", false, 4, null);
                        uri = Uri.parse("content://com.facebook.lite.provider.InstallReferrerProvider/" + str2);
                    } else {
                        AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook Lite content provider not found", false, 4, null);
                        uri = null;
                    }
                } else if (getMonetizationNetwork(context)) {
                    AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Found Instagram content provider", false, 4, null);
                    uri = Uri.parse("content://com.instagram.contentprovider.InstallReferrerProvider/" + str2);
                } else {
                    AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Instagram content provider not found", false, 4, null);
                    uri = null;
                }
            } else if (getMediationNetwork(context)) {
                AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Found Facebook content provider", false, 4, null);
                uri = Uri.parse("content://com.facebook.katana.provider.InstallReferrerProvider/" + str2);
            } else {
                AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook content provider not found", false, 4, null);
                uri = null;
            }
            if (uri != null) {
                contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uri);
                try {
                    Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient != null ? contentProviderClientAcquireUnstableContentProviderClient.query(uri, new String[]{"install_referrer", "is_ct", "actual_timestamp"}, null, null, null) : null;
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                int columnIndex = cursorQuery.getColumnIndex("install_referrer");
                                if (columnIndex != -1) {
                                    string = cursorQuery.getString(columnIndex);
                                } else {
                                    AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "No such column, " + aFj1zSDK.getCurrencyIso4217Code + " provider", false, 4, null);
                                    string = null;
                                }
                                if (string != null) {
                                    AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Collected " + aFj1zSDK.getCurrencyIso4217Code + " attribution data.", false, 4, null);
                                    Map<String, Object> map = aFj1zSDK.AFAdRevenueData;
                                    Intrinsics.checkNotNullExpressionValue(map, "");
                                    map.put(io.sentry.protocol.n.f306405g, "OK");
                                    Map<String, Object> map2 = aFj1zSDK.AFAdRevenueData;
                                    Intrinsics.checkNotNullExpressionValue(map2, "");
                                    map2.put("referrer", string);
                                    int columnIndex2 = cursorQuery.getColumnIndex("actual_timestamp");
                                    Long lValueOf = columnIndex2 != -1 ? Long.valueOf(cursorQuery.getLong(columnIndex2)) : null;
                                    if (lValueOf != null) {
                                        aFj1zSDK.AFAdRevenueData.put("click_ts", Long.valueOf(lValueOf.longValue()));
                                    }
                                    int columnIndex3 = cursorQuery.getColumnIndex("is_ct");
                                    Integer numValueOf = columnIndex3 != -1 ? Integer.valueOf(cursorQuery.getInt(columnIndex3)) : null;
                                    if (numValueOf != null) {
                                        aFj1zSDK.AFAdRevenueData.put("meta_custom", MapsKt.mutableMapOf(TuplesKt.to("is_ct", Integer.valueOf(numValueOf.intValue()))));
                                    }
                                    int i11 = iArr[aFj1zSDK.getCurrencyIso4217Code.ordinal()];
                                    if (i11 == 1) {
                                        str = "com.facebook.katana";
                                    } else if (i11 == 2) {
                                        str = "com.instagram.android";
                                    } else {
                                        if (i11 != 3) {
                                            throw new kotlin.k0();
                                        }
                                        str = "com.facebook.lite";
                                    }
                                    Map<String, Object> map3 = aFj1zSDK.AFAdRevenueData;
                                    Intrinsics.checkNotNullExpressionValue(map3, "");
                                    map3.put("api_ver", Long.valueOf(AFj1iSDK.AFAdRevenueData(context, str)));
                                    Map<String, Object> map4 = aFj1zSDK.AFAdRevenueData;
                                    Intrinsics.checkNotNullExpressionValue(map4, "");
                                    map4.put("api_ver_name", AFj1iSDK.getMediationNetwork(context, str));
                                }
                                cursorQuery.close();
                                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                                    contentProviderClientAcquireUnstableContentProviderClient.close();
                                }
                            } else {
                                AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Content provider returned no data", false, 4, null);
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                                    contentProviderClientAcquireUnstableContentProviderClient.close();
                                }
                            }
                        } catch (Throwable th3) {
                            th2 = th3;
                            cursor = cursorQuery;
                            try {
                                AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Error while collecting Meta Install Referrer for " + aFj1zSDK.getCurrencyIso4217Code.name() + " provider", th2, false, false, false, false, 120, null);
                                if (cursor != null) {
                                    cursor.close();
                                }
                                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                                    contentProviderClientAcquireUnstableContentProviderClient.close();
                                }
                            } catch (Throwable th4) {
                                if (cursor != null) {
                                    cursor.close();
                                }
                                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                                    contentProviderClientAcquireUnstableContentProviderClient.close();
                                }
                                throw th4;
                            }
                        }
                    } else {
                        AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Content provider returned no data", false, 4, null);
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                            contentProviderClientAcquireUnstableContentProviderClient.close();
                        }
                    }
                } catch (Throwable th5) {
                    th2 = th5;
                    cursor = null;
                    AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Error while collecting Meta Install Referrer for " + aFj1zSDK.getCurrencyIso4217Code.name() + " provider", th2, false, false, false, false, 120, null);
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        contentProviderClientAcquireUnstableContentProviderClient.close();
                    }
                    aFj1zSDK.getMediationNetwork();
                    aFj1zSDK.component3.run();
                }
            }
        } catch (Throwable th6) {
            th2 = th6;
            contentProviderClientAcquireUnstableContentProviderClient = null;
        }
        aFj1zSDK.getMediationNetwork();
        aFj1zSDK.component3.run();
    }
}
