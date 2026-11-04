package com.appsflyer.internal;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.os.OutcomeReceiver;
import androidx.annotation.w0;
import com.appsflyer.AFLogger;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@w0(33)
@SourceDebugExtension({"SMAP\nRegisterTriggerTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RegisterTriggerTask.kt\ncom/appsflyer/internal/components/queue/tasks/RegisterTriggerTask\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,169:1\n215#2,2:170\n*S KotlinDebug\n*F\n+ 1 RegisterTriggerTask.kt\ncom/appsflyer/internal/components/queue/tasks/RegisterTriggerTask\n*L\n163#1:170,2\n*E\n"})
public final class AFf1zSDK extends AFe1sSDK<Unit> {

    @NotNull
    public AFe1tSDK areAllFieldsValid;

    @NotNull
    public Executor component1;

    @NotNull
    public AFc1iSDK component2;

    @NotNull
    public AFc1pSDK component3;

    @NotNull
    public AFg1qSDK component4;

    @NotNull
    public Function1<AFe1rSDK, Unit> copydefault;

    @NotNull
    public AFf1gSDK equals;

    public static final class AFa1vSDK implements OutcomeReceiver {
        private /* synthetic */ CountDownLatch AFAdRevenueData;
        private /* synthetic */ i1.h<AFe1rSDK> getCurrencyIso4217Code;
        private /* synthetic */ AFf1zSDK getMonetizationNetwork;

        AFa1vSDK(i1.h<AFe1rSDK> hVar, CountDownLatch countDownLatch, AFf1zSDK aFf1zSDK) {
            this.getCurrencyIso4217Code = hVar;
            this.AFAdRevenueData = countDownLatch;
            this.getMonetizationNetwork = aFf1zSDK;
        }

        public final /* synthetic */ void onError(Throwable th2) {
            Exception exc = (Exception) th2;
            Intrinsics.checkNotNullParameter(exc, "");
            AFf1zSDK.getMediationNetwork(exc);
            this.AFAdRevenueData.countDown();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, com.appsflyer.internal.AFe1rSDK] */
        public final void onResult(@NotNull Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            this.getCurrencyIso4217Code.f312751a = AFe1rSDK.SUCCESS;
            AFLogger.INSTANCE.d(AFg1cSDK.PRIVACY_SANDBOX, "Privacy Sandbox trigger has been registered successfully. ", true);
            this.AFAdRevenueData.countDown();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AFf1zSDK(@NotNull AFe1tSDK aFe1tSDK, @NotNull Executor executor, @NotNull AFc1pSDK aFc1pSDK, @NotNull AFc1iSDK aFc1iSDK, @NotNull AFg1qSDK aFg1qSDK, @NotNull AFf1gSDK aFf1gSDK, @NotNull Function1<? super AFe1rSDK, Unit> function1) {
        super(AFe1mSDK.REGISTER_TRIGGER, new AFe1mSDK[]{AFe1mSDK.RC_CDN, AFe1mSDK.FETCH_ADVERTISING_ID}, null);
        Intrinsics.checkNotNullParameter(aFe1tSDK, "");
        Intrinsics.checkNotNullParameter(executor, "");
        Intrinsics.checkNotNullParameter(aFc1pSDK, "");
        Intrinsics.checkNotNullParameter(aFc1iSDK, "");
        Intrinsics.checkNotNullParameter(aFg1qSDK, "");
        Intrinsics.checkNotNullParameter(aFf1gSDK, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.areAllFieldsValid = aFe1tSDK;
        this.component1 = executor;
        this.component3 = aFc1pSDK;
        this.component2 = aFc1iSDK;
        this.component4 = aFg1qSDK;
        this.equals = aFf1gSDK;
        this.copydefault = function1;
        if (aFe1tSDK instanceof AFe1tSDK.AFa1tSDK) {
            this.getCurrencyIso4217Code.add(AFe1mSDK.CONVERSION);
        }
        if (this.areAllFieldsValid instanceof AFe1tSDK.AFa1uSDK) {
            this.AFAdRevenueData.add(AFe1mSDK.CONVERSION);
        }
        if (this.areAllFieldsValid instanceof AFe1tSDK.AFa1vSDK) {
            this.AFAdRevenueData.add(AFe1mSDK.INAPP);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, com.appsflyer.internal.AFe1rSDK] */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, com.appsflyer.internal.AFe1rSDK] */
    @Override // com.appsflyer.internal.AFe1sSDK
    @e.a({"NewApi"})
    @NotNull
    public final AFe1rSDK getCurrencyIso4217Code() {
        MeasurementManager measurementManagerA;
        i1.h hVar = new i1.h();
        hVar.f312751a = AFe1rSDK.FAILURE;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            Context context = this.component2.getMonetizationNetwork;
            if (context != null && (measurementManagerA = androidx.privacysandbox.ads.adservices.measurement.n.a(context.getSystemService(androidx.privacysandbox.ads.adservices.measurement.m.a()))) != null) {
                new AFj1fSDK(this.component3, null, 2, null);
                Uri.Builder builderBuildUpon = Uri.parse(AFj1fSDK.getCurrencyIso4217Code()).buildUpon();
                String strAFAdRevenueData = this.component3.AFAdRevenueData();
                if (strAFAdRevenueData == null) {
                    strAFAdRevenueData = "";
                }
                Pair pair = TuplesKt.to("event_name", this.areAllFieldsValid.getMediationNetwork);
                Pair pair2 = TuplesKt.to("app_id", this.component3.getRevenue.getMonetizationNetwork.getPackageName());
                Context context2 = this.component3.getRevenue.getMonetizationNetwork;
                Map mapMutableMapOf = MapsKt.mutableMapOf(pair, pair2, TuplesKt.to(io.sentry.protocol.a.b.f306114f, AFj1iSDK.getMediationNetwork(context2, context2.getPackageName())), TuplesKt.to("sdk_version", AFc1pSDK.getMonetizationNetwork()), TuplesKt.to("api_version", AFc1pSDK.getMediationNetwork()), TuplesKt.to("timestamp", String.valueOf(this.component4.AFAdRevenueData())), TuplesKt.to("request_id", AFc1pSDK.getRevenue()), TuplesKt.to("gaid", strAFAdRevenueData));
                String revenue = AFb1iSDK.getRevenue(this.component3.getMonetizationNetwork);
                if (revenue != null) {
                    mapMutableMapOf.put("appsflyer_id", revenue);
                }
                Long currencyIso4217Code = this.component4.getCurrencyIso4217Code();
                if (currencyIso4217Code != null) {
                    mapMutableMapOf.put("install_time", String.valueOf(currencyIso4217Code.longValue()));
                }
                AFe1tSDK aFe1tSDK = this.areAllFieldsValid;
                if (aFe1tSDK instanceof AFe1tSDK.AFa1vSDK) {
                    Float f10 = ((AFe1tSDK.AFa1vSDK) aFe1tSDK).getRevenue;
                    if (f10 != null) {
                        mapMutableMapOf.put("event_revenue", String.valueOf(f10.floatValue()));
                    }
                    Integer num = ((AFe1tSDK.AFa1vSDK) this.areAllFieldsValid).getCurrencyIso4217Code;
                    if (num != null) {
                        mapMutableMapOf.put("event_count", String.valueOf(num.intValue()));
                    }
                }
                for (Map.Entry entry : mapMutableMapOf.entrySet()) {
                    builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                }
                Uri uriBuild = builderBuildUpon.build();
                Intrinsics.checkNotNullExpressionValue(uriBuild, "");
                measurementManagerA.registerTrigger(uriBuild, this.component1, androidx.core.os.v.a(new AFa1vSDK(hVar, countDownLatch, this)));
            }
            countDownLatch.await(4L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            hVar.f312751a = AFe1rSDK.TIMEOUT;
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFg1cSDK.PRIVACY_SANDBOX, "Error occurred: " + th2.getMessage(), th2, false, false, false, true);
        }
        return (AFe1rSDK) hVar.f312751a;
    }

    @Override // com.appsflyer.internal.AFe1sSDK
    public final boolean getMediationNetwork() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1sSDK
    public final long getMonetizationNetwork() {
        return 20000L;
    }

    @Override // com.appsflyer.internal.AFe1sSDK
    public final void getRevenue() {
        super.getRevenue();
        AFe1rSDK aFe1rSDK = this.getMediationNetwork;
        if (aFe1rSDK != null) {
            this.copydefault.invoke(aFe1rSDK);
        }
    }

    public static final /* synthetic */ void getMediationNetwork(Throwable th2) {
        AFLogger.INSTANCE.e(AFg1cSDK.PRIVACY_SANDBOX, "Error occurred: " + th2.getMessage(), th2, false, false, false, true);
    }
}
