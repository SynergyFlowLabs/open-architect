package com.devtodev.analytics.internal.modues.analytics;

import com.devtodev.analytics.external.analytics.DTDAccrualType;
import com.devtodev.analytics.external.analytics.DTDFinishProgressionEventParameters;
import com.devtodev.analytics.external.analytics.DTDReferralProperty;
import com.devtodev.analytics.external.analytics.DTDStartProgressionEventParameters;
import com.devtodev.analytics.internal.backend.ConfigEntry;
import com.devtodev.analytics.internal.backend.repository.api.API;
import com.devtodev.analytics.internal.domain.events.AdImpressionKt;
import com.devtodev.analytics.internal.domain.events.CurrentBalanceKt;
import com.devtodev.analytics.internal.domain.events.LevelUpKt;
import com.devtodev.analytics.internal.domain.events.correncyPayment.VirtualCurrencyPaymentKt;
import com.devtodev.analytics.internal.lifecycle.ILifecycle;
import com.devtodev.analytics.internal.lifecycle.ILifecycleRepository;
import com.devtodev.analytics.internal.logger.Logger;
import com.devtodev.analytics.internal.queue.QueueManager;
import com.devtodev.analytics.internal.validator.SocialNetworkPostData;
import com.devtodev.analytics.internal.validator.ValidateAdImpressionData;
import com.devtodev.analytics.internal.validator.Validator;
import com.devtodev.analytics.internal.validator.ValidatorRules;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class AnalyticsProxy implements IAnalyticsProxy {

    @Nullable
    private IAnalytics analyticsLogic;

    @NotNull
    private final ILifecycle lifecycleListener = new ILifecycle() { // from class: com.devtodev.analytics.internal.modues.analytics.AnalyticsProxy$lifecycleListener$1
        @Override // com.devtodev.analytics.internal.lifecycle.ILifecycle
        public void onEnterBackground() {
            QueueManager.Companion.runIncoming(new AnalyticsProxy$lifecycleListener$1$onEnterBackground$1(this.this$0));
        }

        @Override // com.devtodev.analytics.internal.lifecycle.ILifecycle
        public void onEnterForeground() {
            QueueManager.Companion.runIncoming(new AnalyticsProxy$lifecycleListener$1$onEnterForeground$1(this.this$0));
        }
    };

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.analytics.AnalyticsProxy$adImpression$1, reason: invalid class name */
    public static final class AnonymousClass1 extends l0 implements Function0<Unit> {
        final /* synthetic */ String $network;
        final /* synthetic */ String $placement;
        final /* synthetic */ double $revenue;
        final /* synthetic */ String $unit;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, double d10, String str2, String str3) {
            super(0);
            this.$network = str;
            this.$revenue = d10;
            this.$placement = str2;
            this.$unit = str3;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IAnalytics iAnalytics = AnalyticsProxy.this.analyticsLogic;
            AnalyticsProxy analyticsProxy = AnalyticsProxy.this;
            String str = this.$network;
            double d10 = this.$revenue;
            String str2 = this.$placement;
            String str3 = this.$unit;
            if (iAnalytics == null) {
                analyticsProxy.validateInitialization("adImpression");
                return;
            }
            ValidateAdImpressionData validateAdImpressionDataValidateAdImpression = ValidatorRules.INSTANCE.validateAdImpression(str, d10, str2, str3);
            if (validateAdImpressionDataValidateAdImpression == null || Validator.INSTANCE.isExcluded(AdImpressionKt.AD_IMPRESSION, null)) {
                return;
            }
            iAnalytics.adImpression(validateAdImpressionDataValidateAdImpression.getNetwork(), validateAdImpressionDataValidateAdImpression.getRevenue(), validateAdImpressionDataValidateAdImpression.getPlacement(), validateAdImpressionDataValidateAdImpression.getUnit());
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.analytics.AnalyticsProxy$currencyAccrual$1, reason: invalid class name and case insensitive filesystem */
    public static final class C25651 extends l0 implements Function0<Unit> {
        final /* synthetic */ DTDAccrualType $accrualType;
        final /* synthetic */ int $currencyAmount;
        final /* synthetic */ String $currencyName;
        final /* synthetic */ String $source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25651(String str, int i10, String str2, DTDAccrualType dTDAccrualType) {
            super(0);
            this.$currencyName = str;
            this.$currencyAmount = i10;
            this.$source = str2;
            this.$accrualType = dTDAccrualType;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IAnalytics iAnalytics = AnalyticsProxy.this.analyticsLogic;
            AnalyticsProxy analyticsProxy = AnalyticsProxy.this;
            String str = this.$currencyName;
            int i10 = this.$currencyAmount;
            String str2 = this.$source;
            DTDAccrualType dTDAccrualType = this.$accrualType;
            if (iAnalytics == null) {
                analyticsProxy.validateInitialization("currencyAccrual");
                return;
            }
            ValidatorRules.ValidCurrencyAccrual validCurrencyAccrualValidateCurrencyAccrual = ValidatorRules.INSTANCE.validateCurrencyAccrual(str, i10, str2);
            if (validCurrencyAccrualValidateCurrencyAccrual == null || Validator.INSTANCE.isExcluded("ca", str2)) {
                return;
            }
            iAnalytics.currencyAccrual(validCurrencyAccrualValidateCurrencyAccrual.getCurrencyName(), i10, validCurrencyAccrualValidateCurrencyAccrual.getSource(), dTDAccrualType);
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.analytics.AnalyticsProxy$currentBalance$1, reason: invalid class name and case insensitive filesystem */
    public static final class C25661 extends l0 implements Function0<Unit> {
        final /* synthetic */ Map<String, Long> $balances;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25661(Map<String, Long> map) {
            super(0);
            this.$balances = map;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IAnalytics iAnalytics = AnalyticsProxy.this.analyticsLogic;
            AnalyticsProxy analyticsProxy = AnalyticsProxy.this;
            Map<String, Long> map = this.$balances;
            if (iAnalytics == null) {
                analyticsProxy.validateInitialization("currentBalance");
                return;
            }
            Map<String, Long> mapValidateCurrentBalance = ValidatorRules.INSTANCE.validateCurrentBalance(map);
            if (Validator.INSTANCE.isExcluded(CurrentBalanceKt.CURRENT_BALANCE, null) || mapValidateCurrentBalance == null) {
                return;
            }
            iAnalytics.currentBalance(mapValidateCurrentBalance);
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.analytics.AnalyticsProxy$customEvent$1, reason: invalid class name and case insensitive filesystem */
    public static final class C25671 extends l0 implements Function0<Unit> {
        final /* synthetic */ String $eventName;
        final /* synthetic */ Map<String, Object> $parameters;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25671(String str, Map<String, ? extends Object> map) {
            super(0);
            this.$eventName = str;
            this.$parameters = map;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IAnalytics iAnalytics = AnalyticsProxy.this.analyticsLogic;
            AnalyticsProxy analyticsProxy = AnalyticsProxy.this;
            String str = this.$eventName;
            Map<String, ? extends Object> map = this.$parameters;
            if (iAnalytics == null) {
                analyticsProxy.validateInitialization("customEvent");
                return;
            }
            ValidatorRules.ValidCustomEvent validCustomEventValidateCustomEvent = ValidatorRules.INSTANCE.validateCustomEvent(str, map);
            if (validCustomEventValidateCustomEvent == null || Validator.INSTANCE.isExcluded("ce", str)) {
                return;
            }
            iAnalytics.customEvent(validCustomEventValidateCustomEvent.getName(), validCustomEventValidateCustomEvent.getParams());
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.analytics.AnalyticsProxy$finishProgressionEvent$1, reason: invalid class name and case insensitive filesystem */
    public static final class C25681 extends l0 implements Function0<Unit> {
        final /* synthetic */ String $eventName;
        final /* synthetic */ DTDFinishProgressionEventParameters $parameters;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25681(DTDFinishProgressionEventParameters dTDFinishProgressionEventParameters, String str) {
            super(0);
            this.$parameters = dTDFinishProgressionEventParameters;
            this.$eventName = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IAnalytics iAnalytics = AnalyticsProxy.this.analyticsLogic;
            AnalyticsProxy analyticsProxy = AnalyticsProxy.this;
            DTDFinishProgressionEventParameters dTDFinishProgressionEventParameters = this.$parameters;
            String str = this.$eventName;
            if (iAnalytics == null) {
                analyticsProxy.validateInitialization("finishProgressionEvent");
                return;
            }
            ValidatorRules.ValidFinishProgressionEvent validFinishProgressionEventValidateFinishProgressionEvent = ValidatorRules.INSTANCE.validateFinishProgressionEvent(str, dTDFinishProgressionEventParameters.clone$DTDAnalytics_androidRelease());
            if (validFinishProgressionEventValidateFinishProgressionEvent == null || Validator.INSTANCE.isExcluded("pe", str)) {
                return;
            }
            iAnalytics.finishProgressionEvent(validFinishProgressionEventValidateFinishProgressionEvent.getEventName(), validFinishProgressionEventValidateFinishProgressionEvent.getParameters());
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.analytics.AnalyticsProxy$getCurrentLevel$1, reason: invalid class name and case insensitive filesystem */
    public static final class C25691 extends l0 implements Function0<Unit> {
        final /* synthetic */ Function1<Integer, Unit> $completionHandler;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C25691(Function1<? super Integer, Unit> function1) {
            super(0);
            this.$completionHandler = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IAnalytics iAnalytics = AnalyticsProxy.this.analyticsLogic;
            Function1<Integer, Unit> function1 = this.$completionHandler;
            AnalyticsProxy analyticsProxy = AnalyticsProxy.this;
            if (iAnalytics != null) {
                iAnalytics.getCurrentLevel(function1);
            } else {
                function1.invoke(0);
                analyticsProxy.validateInitialization("getCurrentLevel");
            }
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.analytics.AnalyticsProxy$getDeviceId$1, reason: invalid class name and case insensitive filesystem */
    public static final class C25701 extends l0 implements Function0<Unit> {
        final /* synthetic */ Function1<String, Unit> $completionHandler;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C25701(Function1<? super String, Unit> function1) {
            super(0);
            this.$completionHandler = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IAnalytics iAnalytics = AnalyticsProxy.this.analyticsLogic;
            Function1<String, Unit> function1 = this.$completionHandler;
            AnalyticsProxy analyticsProxy = AnalyticsProxy.this;
            if (iAnalytics != null) {
                iAnalytics.getDeviceId(function1);
            } else {
                function1.invoke("");
                analyticsProxy.validateInitialization("getDeviceId");
            }
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.analytics.AnalyticsProxy$getObfuscatedAccountId$1, reason: invalid class name and case insensitive filesystem */
    public static final class C25711 extends l0 implements Function0<Unit> {
        final /* synthetic */ Function1<String, Unit> $completionHandler;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C25711(Function1<? super String, Unit> function1) {
            super(0);
            this.$completionHandler = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IAnalytics iAnalytics = AnalyticsProxy.this.analyticsLogic;
            Function1<String, Unit> function1 = this.$completionHandler;
            AnalyticsProxy analyticsProxy = AnalyticsProxy.this;
            if (iAnalytics != null) {
                iAnalytics.getObfuscatedAccountId(function1);
            } else {
                function1.invoke("");
                analyticsProxy.validateInitialization("getObfuscatedAccountId");
            }
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.analytics.AnalyticsProxy$getSDKVersion$1, reason: invalid class name and case insensitive filesystem */
    public static final class C25721 extends l0 implements Function0<Unit> {
        final /* synthetic */ Function1<String, Unit> $completionHandler;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C25721(Function1<? super String, Unit> function1) {
            super(0);
            this.$completionHandler = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IAnalytics iAnalytics = AnalyticsProxy.this.analyticsLogic;
            Function1<String, Unit> function1 = this.$completionHandler;
            AnalyticsProxy analyticsProxy = AnalyticsProxy.this;
            if (iAnalytics != null) {
                iAnalytics.getSDKVersion(function1);
            } else {
                function1.invoke("");
                analyticsProxy.validateInitialization("getSDKVersion");
            }
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.analytics.AnalyticsProxy$getTrackingAvailability$1, reason: invalid class name and case insensitive filesystem */
    public static final class C25731 extends l0 implements Function0<Unit> {
        final /* synthetic */ Function1<Boolean, Unit> $completionHandler;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C25731(Function1<? super Boolean, Unit> function1) {
            super(0);
            this.$completionHandler = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IAnalytics iAnalytics = AnalyticsProxy.this.analyticsLogic;
            Function1<Boolean, Unit> function1 = this.$completionHandler;
            AnalyticsProxy analyticsProxy = AnalyticsProxy.this;
            if (iAnalytics != null) {
                iAnalytics.getTrackingAvailability(function1);
            } else {
                function1.invoke(Boolean.TRUE);
                analyticsProxy.validateInitialization("getTrackingAvailability");
            }
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.analytics.AnalyticsProxy$getUserId$1, reason: invalid class name and case insensitive filesystem */
    public static final class C25741 extends l0 implements Function0<Unit> {
        final /* synthetic */ Function1<String, Unit> $completionHandler;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C25741(Function1<? super String, Unit> function1) {
            super(0);
            this.$completionHandler = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IAnalytics iAnalytics = AnalyticsProxy.this.analyticsLogic;
            Function1<String, Unit> function1 = this.$completionHandler;
            AnalyticsProxy analyticsProxy = AnalyticsProxy.this;
            if (iAnalytics != null) {
                iAnalytics.getUserId(function1);
            } else {
                function1.invoke("");
                analyticsProxy.validateInitialization("getUserId");
            }
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.analytics.AnalyticsProxy$levelUp$1, reason: invalid class name and case insensitive filesystem */
    public static final class C25751 extends l0 implements Function0<Unit> {
        final /* synthetic */ Map<String, Long> $balances;
        final /* synthetic */ int $level;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25751(int i10, Map<String, Long> map) {
            super(0);
            this.$level = i10;
            this.$balances = map;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IAnalytics iAnalytics = AnalyticsProxy.this.analyticsLogic;
            AnalyticsProxy analyticsProxy = AnalyticsProxy.this;
            int i10 = this.$level;
            Map<String, Long> map = this.$balances;
            if (iAnalytics == null) {
                analyticsProxy.validateInitialization("levelUp");
                return;
            }
            Map<String, Long> mapValidateLevelUp = ValidatorRules.INSTANCE.validateLevelUp(i10, MapsKt.toMap(map));
            if (Validator.INSTANCE.isExcluded(LevelUpKt.LEVEL_UP_CODE, null) || mapValidateLevelUp == null) {
                return;
            }
            iAnalytics.levelUp(i10, mapValidateLevelUp);
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.analytics.AnalyticsProxy$referrer$1, reason: invalid class name and case insensitive filesystem */
    public static final class C25761 extends l0 implements Function0<Unit> {
        final /* synthetic */ Map<DTDReferralProperty, String> $utmData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25761(Map<DTDReferralProperty, String> map) {
            super(0);
            this.$utmData = map;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IAnalytics iAnalytics = AnalyticsProxy.this.analyticsLogic;
            AnalyticsProxy analyticsProxy = AnalyticsProxy.this;
            Map<DTDReferralProperty, String> map = this.$utmData;
            if (iAnalytics == null) {
                analyticsProxy.validateInitialization("referrer");
                return;
            }
            Map<DTDReferralProperty, String> mapValidateReferrer = ValidatorRules.INSTANCE.validateReferrer(map);
            if (mapValidateReferrer == null || Validator.INSTANCE.isExcluded("rf", null)) {
                return;
            }
            iAnalytics.referrer(mapValidateReferrer);
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.analytics.AnalyticsProxy$replaceUserId$1, reason: invalid class name and case insensitive filesystem */
    public static final class C25771 extends l0 implements Function0<Unit> {
        final /* synthetic */ String $fromUserId;
        final /* synthetic */ String $toUserId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25771(String str, String str2) {
            super(0);
            this.$fromUserId = str;
            this.$toUserId = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IAnalytics iAnalytics = AnalyticsProxy.this.analyticsLogic;
            AnalyticsProxy analyticsProxy = AnalyticsProxy.this;
            String str = this.$fromUserId;
            String str2 = this.$toUserId;
            if (iAnalytics == null) {
                analyticsProxy.validateInitialization("replaceUserId");
                return;
            }
            ValidatorRules validatorRules = ValidatorRules.INSTANCE;
            ValidatorRules.UsersId usersIdValidateReplaceUserId = validatorRules.validateReplaceUserId("replaceUserId", str, str2);
            if (usersIdValidateReplaceUserId != null) {
                iAnalytics.replaceUserId(usersIdValidateReplaceUserId.getPrevUserName(), usersIdValidateReplaceUserId.getUserName());
            } else {
                validatorRules.notifyThatMethodExecutionWasCanceled("replaceUserId");
            }
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.analytics.AnalyticsProxy$sendBufferedEvents$1, reason: invalid class name and case insensitive filesystem */
    public static final class C25781 extends l0 implements Function0<Unit> {
        public C25781() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IAnalytics iAnalytics = AnalyticsProxy.this.analyticsLogic;
            AnalyticsProxy analyticsProxy = AnalyticsProxy.this;
            if (iAnalytics == null) {
                analyticsProxy.validateInitialization("sendBufferedEvents");
            } else {
                iAnalytics.sendBufferedEvents();
            }
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.analytics.AnalyticsProxy$setCurrentLevel$1, reason: invalid class name and case insensitive filesystem */
    public static final class C25791 extends l0 implements Function0<Unit> {
        final /* synthetic */ int $currentLevel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25791(int i10) {
            super(0);
            this.$currentLevel = i10;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IAnalytics iAnalytics = AnalyticsProxy.this.analyticsLogic;
            AnalyticsProxy analyticsProxy = AnalyticsProxy.this;
            int i10 = this.$currentLevel;
            if (iAnalytics == null) {
                analyticsProxy.validateInitialization("setCurrentLevel");
            } else if (Validator.INSTANCE.inInterval("SetCurrentLevel", "The level argument value", Integer.valueOf(i10), 1, 2147483646)) {
                iAnalytics.setCurrentLevel(i10);
            } else {
                ValidatorRules.INSTANCE.notifyThatMethodExecutionWasCanceled("SetCurrentLevel");
            }
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.analytics.AnalyticsProxy$setTrackingAvailability$1, reason: invalid class name and case insensitive filesystem */
    public static final class C25801 extends l0 implements Function0<Unit> {
        final /* synthetic */ boolean $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25801(boolean z10) {
            super(0);
            this.$value = z10;
            int i10 = 7 ^ 0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IAnalytics iAnalytics = AnalyticsProxy.this.analyticsLogic;
            AnalyticsProxy analyticsProxy = AnalyticsProxy.this;
            boolean z10 = this.$value;
            if (iAnalytics == null) {
                analyticsProxy.validateInitialization("setTrackingAvailability");
            } else {
                iAnalytics.setTrackingAvailability(z10);
            }
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.analytics.AnalyticsProxy$setUserId$1, reason: invalid class name and case insensitive filesystem */
    public static final class C25811 extends l0 implements Function0<Unit> {
        final /* synthetic */ String $newUserId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25811(String str) {
            super(0);
            this.$newUserId = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IAnalytics iAnalytics = AnalyticsProxy.this.analyticsLogic;
            AnalyticsProxy analyticsProxy = AnalyticsProxy.this;
            String str = this.$newUserId;
            if (iAnalytics == null) {
                analyticsProxy.validateInitialization("SetUserId");
                return;
            }
            ValidatorRules validatorRules = ValidatorRules.INSTANCE;
            String strValidateUserId = validatorRules.validateUserId("SetUserId", str);
            if (strValidateUserId != null) {
                iAnalytics.setUserId(strValidateUserId);
            } else {
                validatorRules.notifyThatMethodExecutionWasCanceled("SetUserId");
            }
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.analytics.AnalyticsProxy$socialNetworkConnect$1, reason: invalid class name and case insensitive filesystem */
    public static final class C25821 extends l0 implements Function0<Unit> {
        final /* synthetic */ String $socialNetwork;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25821(String str) {
            super(0);
            this.$socialNetwork = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IAnalytics iAnalytics = AnalyticsProxy.this.analyticsLogic;
            AnalyticsProxy analyticsProxy = AnalyticsProxy.this;
            String str = this.$socialNetwork;
            if (iAnalytics == null) {
                analyticsProxy.validateInitialization("socialNetworkConnect");
                return;
            }
            String strValidateSocialNetworkConnect = ValidatorRules.INSTANCE.validateSocialNetworkConnect(str);
            if (strValidateSocialNetworkConnect == null || Validator.INSTANCE.isExcluded("sc", strValidateSocialNetworkConnect)) {
                return;
            }
            iAnalytics.socialNetworkConnect(strValidateSocialNetworkConnect);
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.analytics.AnalyticsProxy$socialNetworkPost$1, reason: invalid class name and case insensitive filesystem */
    public static final class C25831 extends l0 implements Function0<Unit> {
        final /* synthetic */ String $reason;
        final /* synthetic */ String $socialNetwork;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25831(String str, String str2) {
            super(0);
            this.$socialNetwork = str;
            this.$reason = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IAnalytics iAnalytics = AnalyticsProxy.this.analyticsLogic;
            AnalyticsProxy analyticsProxy = AnalyticsProxy.this;
            String str = this.$socialNetwork;
            String str2 = this.$reason;
            if (iAnalytics == null) {
                analyticsProxy.validateInitialization("socialNetworkPost");
                return;
            }
            SocialNetworkPostData socialNetworkPostDataValidateSocialNetworkPost = ValidatorRules.INSTANCE.validateSocialNetworkPost(str, str2);
            if (socialNetworkPostDataValidateSocialNetworkPost == null || Validator.INSTANCE.isExcluded("sp", socialNetworkPostDataValidateSocialNetworkPost)) {
                return;
            }
            iAnalytics.socialNetworkPost(socialNetworkPostDataValidateSocialNetworkPost.getName(), socialNetworkPostDataValidateSocialNetworkPost.getReason());
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.analytics.AnalyticsProxy$startActivity$1, reason: invalid class name and case insensitive filesystem */
    public static final class C25841 extends l0 implements Function0<Unit> {
        public C25841() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IAnalytics iAnalytics = AnalyticsProxy.this.analyticsLogic;
            if (iAnalytics != null) {
                iAnalytics.startActivity();
            }
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.analytics.AnalyticsProxy$startProgressionEvent$1, reason: invalid class name and case insensitive filesystem */
    public static final class C25851 extends l0 implements Function0<Unit> {
        final /* synthetic */ String $eventName;
        final /* synthetic */ DTDStartProgressionEventParameters $parameters;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25851(DTDStartProgressionEventParameters dTDStartProgressionEventParameters, String str) {
            super(0);
            this.$parameters = dTDStartProgressionEventParameters;
            this.$eventName = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IAnalytics iAnalytics = AnalyticsProxy.this.analyticsLogic;
            AnalyticsProxy analyticsProxy = AnalyticsProxy.this;
            DTDStartProgressionEventParameters dTDStartProgressionEventParameters = this.$parameters;
            String str = this.$eventName;
            if (iAnalytics == null) {
                analyticsProxy.validateInitialization("startProgressionEvent");
                return;
            }
            DTDStartProgressionEventParameters dTDStartProgressionEventParametersValidateStartProgressionEvent = ValidatorRules.INSTANCE.validateStartProgressionEvent(str, dTDStartProgressionEventParameters.clone$DTDAnalytics_androidRelease());
            if (dTDStartProgressionEventParametersValidateStartProgressionEvent == null || Validator.INSTANCE.isExcluded("pe", str)) {
                return;
            }
            iAnalytics.startProgressionEvent(str, dTDStartProgressionEventParametersValidateStartProgressionEvent);
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.analytics.AnalyticsProxy$stopActivity$1, reason: invalid class name and case insensitive filesystem */
    public static final class C25861 extends l0 implements Function0<Unit> {
        public C25861() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IAnalytics iAnalytics = AnalyticsProxy.this.analyticsLogic;
            if (iAnalytics != null) {
                iAnalytics.stopActivity();
            }
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.analytics.AnalyticsProxy$tutorial$1, reason: invalid class name and case insensitive filesystem */
    public static final class C25871 extends l0 implements Function0<Unit> {
        final /* synthetic */ int $step;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25871(int i10) {
            super(0);
            this.$step = i10;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IAnalytics iAnalytics = AnalyticsProxy.this.analyticsLogic;
            AnalyticsProxy analyticsProxy = AnalyticsProxy.this;
            int i10 = this.$step;
            if (iAnalytics == null) {
                analyticsProxy.validateInitialization("tutorial");
                return;
            }
            Integer numValidateTutorial = ValidatorRules.INSTANCE.validateTutorial(i10);
            if (numValidateTutorial != null) {
                int iIntValue = numValidateTutorial.intValue();
                if (!Validator.INSTANCE.isExcluded("tr", numValidateTutorial)) {
                    iAnalytics.tutorial(iIntValue);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.analytics.AnalyticsProxy$virtualCurrencyPayment$1, reason: invalid class name and case insensitive filesystem */
    public static final class C25881 extends l0 implements Function0<Unit> {
        final /* synthetic */ int $purchaseAmount;
        final /* synthetic */ String $purchaseId;
        final /* synthetic */ String $purchaseType;
        final /* synthetic */ Map<String, Integer> $resources;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25881(String str, String str2, int i10, Map<String, Integer> map) {
            super(0);
            this.$purchaseId = str;
            this.$purchaseType = str2;
            this.$purchaseAmount = i10;
            this.$resources = map;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IAnalytics iAnalytics = AnalyticsProxy.this.analyticsLogic;
            AnalyticsProxy analyticsProxy = AnalyticsProxy.this;
            String str = this.$purchaseId;
            String str2 = this.$purchaseType;
            int i10 = this.$purchaseAmount;
            Map<String, Integer> map = this.$resources;
            if (iAnalytics == null) {
                analyticsProxy.validateInitialization("virtualCurrencyPayment");
                return;
            }
            ValidatorRules.ValidVirtualCurrencyPayment validVirtualCurrencyPaymentValidateVirtualCurrencyPayment = ValidatorRules.INSTANCE.validateVirtualCurrencyPayment(str, str2, i10, MapsKt.toMap(map));
            if (validVirtualCurrencyPaymentValidateVirtualCurrencyPayment == null || Validator.INSTANCE.isExcluded(VirtualCurrencyPaymentKt.VIRTUAL_CURRENCY_PAYMENT_CODE, str)) {
                return;
            }
            iAnalytics.virtualCurrencyPayment(validVirtualCurrencyPaymentValidateVirtualCurrencyPayment.getPurchaseId(), validVirtualCurrencyPaymentValidateVirtualCurrencyPayment.getPurchaseType(), i10, validVirtualCurrencyPaymentValidateVirtualCurrencyPayment.getBoundedResources());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validateInitialization(String str) {
        Logger.INSTANCE.error("In the " + str + " method an error has occurred: The SDK is not initialized yet!", null);
    }

    @Override // com.devtodev.analytics.internal.modues.analytics.IAnalytics
    public void adImpression(@NotNull String network, double d10, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(network, "network");
        QueueManager.Companion.runIncoming(new AnonymousClass1(network, d10, str, str2));
    }

    @Override // com.devtodev.analytics.internal.modues.analytics.IAnalytics
    public void currencyAccrual(@NotNull String currencyName, int i10, @NotNull String source, @NotNull DTDAccrualType accrualType) {
        Intrinsics.checkNotNullParameter(currencyName, "currencyName");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(accrualType, "accrualType");
        QueueManager.Companion.runIncoming(new C25651(currencyName, i10, source, accrualType));
    }

    @Override // com.devtodev.analytics.internal.modues.analytics.IAnalytics
    public void currentBalance(@NotNull Map<String, Long> balances) {
        Intrinsics.checkNotNullParameter(balances, "balances");
        QueueManager.Companion.runIncoming(new C25661(balances));
    }

    @Override // com.devtodev.analytics.internal.modues.analytics.IAnalytics
    public void customEvent(@NotNull String eventName, @NotNull Map<String, ? extends Object> parameters) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        QueueManager.Companion.runIncoming(new C25671(eventName, parameters));
    }

    @Override // com.devtodev.analytics.internal.modues.analytics.IAnalytics
    public void finishProgressionEvent(@NotNull String eventName, @NotNull DTDFinishProgressionEventParameters parameters) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        QueueManager.Companion.runIncoming(new C25681(parameters, eventName));
    }

    @Override // com.devtodev.analytics.internal.modues.analytics.IAnalytics
    public void getCurrentLevel(@NotNull Function1<? super Integer, Unit> completionHandler) {
        Intrinsics.checkNotNullParameter(completionHandler, "completionHandler");
        QueueManager.Companion.runIncoming(new C25691(completionHandler));
    }

    @Override // com.devtodev.analytics.internal.modues.analytics.IAnalytics
    public int getCustomEventParamsCount() {
        IAnalytics iAnalytics = this.analyticsLogic;
        return iAnalytics != null ? iAnalytics.getCustomEventParamsCount() : ConfigEntry.Companion.setDefaultConfiguration().getEventParamsCount();
    }

    @Override // com.devtodev.analytics.internal.modues.analytics.IAnalyticsProxy
    public void getCustomUrl(@NotNull Function1<? super String, Unit> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        value.invoke(API.INSTANCE.getTEST_CUSTOM_URL());
    }

    @Override // com.devtodev.analytics.internal.modues.analytics.IAnalytics
    public void getDeviceId(@NotNull Function1<? super String, Unit> completionHandler) {
        Intrinsics.checkNotNullParameter(completionHandler, "completionHandler");
        QueueManager.Companion.runIncoming(new C25701(completionHandler));
    }

    @Override // com.devtodev.analytics.internal.modues.analytics.IAnalytics
    public void getObfuscatedAccountId(@NotNull Function1<? super String, Unit> completionHandler) {
        Intrinsics.checkNotNullParameter(completionHandler, "completionHandler");
        QueueManager.Companion.runIncoming(new C25711(completionHandler));
    }

    @Override // com.devtodev.analytics.internal.modues.analytics.IAnalyticsProxy
    public void getProxyUrl(@NotNull Function1<? super String, Unit> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        value.invoke(API.INSTANCE.getTEST_PROXY_URL());
    }

    @Override // com.devtodev.analytics.internal.modues.analytics.IAnalytics
    public void getSDKVersion(@NotNull Function1<? super String, Unit> completionHandler) {
        Intrinsics.checkNotNullParameter(completionHandler, "completionHandler");
        QueueManager.Companion.runIncoming(new C25721(completionHandler));
    }

    @Override // com.devtodev.analytics.internal.modues.analytics.IAnalytics
    public void getTrackingAvailability(@NotNull Function1<? super Boolean, Unit> completionHandler) {
        Intrinsics.checkNotNullParameter(completionHandler, "completionHandler");
        QueueManager.Companion.runIncoming(new C25731(completionHandler));
    }

    @Override // com.devtodev.analytics.internal.modues.analytics.IAnalytics
    public void getUserId(@NotNull Function1<? super String, Unit> completionHandler) {
        Intrinsics.checkNotNullParameter(completionHandler, "completionHandler");
        QueueManager.Companion.runIncoming(new C25741(completionHandler));
    }

    @Override // com.devtodev.analytics.internal.modues.analytics.IAnalyticsProxy
    public void initialize(@NotNull IAnalytics analyticsLogic, @NotNull ILifecycleRepository lifecycleRepository) {
        Intrinsics.checkNotNullParameter(analyticsLogic, "analyticsLogic");
        Intrinsics.checkNotNullParameter(lifecycleRepository, "lifecycleRepository");
        this.analyticsLogic = analyticsLogic;
        lifecycleRepository.addLifeCycleListener(this.lifecycleListener);
    }

    @Override // com.devtodev.analytics.internal.modues.analytics.IAnalytics
    public void levelUp(int i10, @NotNull Map<String, Long> balances) {
        Intrinsics.checkNotNullParameter(balances, "balances");
        QueueManager.Companion.runIncoming(new C25751(i10, balances));
    }

    @Override // com.devtodev.analytics.internal.modues.analytics.IAnalytics
    public void referrer(@NotNull Map<DTDReferralProperty, String> utmData) {
        Intrinsics.checkNotNullParameter(utmData, "utmData");
        QueueManager.Companion.runIncoming(new C25761(utmData));
    }

    @Override // com.devtodev.analytics.internal.modues.analytics.IAnalytics
    public void replaceUserId(@NotNull String fromUserId, @NotNull String toUserId) {
        Intrinsics.checkNotNullParameter(fromUserId, "fromUserId");
        Intrinsics.checkNotNullParameter(toUserId, "toUserId");
        QueueManager.Companion.runIncoming(new C25771(fromUserId, toUserId));
    }

    @Override // com.devtodev.analytics.internal.modues.analytics.IAnalytics
    public void sendBufferedEvents() {
        QueueManager.Companion.runIncoming(new C25781());
    }

    @Override // com.devtodev.analytics.internal.modues.analytics.IAnalytics
    public void setCurrentLevel(int i10) {
        QueueManager.Companion.runIncoming(new C25791(i10));
    }

    @Override // com.devtodev.analytics.internal.modues.analytics.IAnalyticsProxy
    public void setCustomUrl(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        API.INSTANCE.setTEST_CUSTOM_URL(value);
    }

    @Override // com.devtodev.analytics.internal.modues.analytics.IAnalyticsProxy
    public void setProxyUrl(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        API.INSTANCE.setTEST_PROXY_URL(value);
    }

    @Override // com.devtodev.analytics.internal.modues.analytics.IAnalytics
    public void setTrackingAvailability(boolean z10) {
        QueueManager.Companion.runIncoming(new C25801(z10));
    }

    @Override // com.devtodev.analytics.internal.modues.analytics.IAnalytics
    public void setUserId(@NotNull String newUserId) {
        Intrinsics.checkNotNullParameter(newUserId, "newUserId");
        QueueManager.Companion.runIncoming(new C25811(newUserId));
    }

    @Override // com.devtodev.analytics.internal.modues.analytics.IAnalytics
    public void socialNetworkConnect(@NotNull String socialNetwork) {
        Intrinsics.checkNotNullParameter(socialNetwork, "socialNetwork");
        QueueManager.Companion.runIncoming(new C25821(socialNetwork));
    }

    @Override // com.devtodev.analytics.internal.modues.analytics.IAnalytics
    public void socialNetworkPost(@NotNull String socialNetwork, @NotNull String reason) {
        Intrinsics.checkNotNullParameter(socialNetwork, "socialNetwork");
        Intrinsics.checkNotNullParameter(reason, "reason");
        QueueManager.Companion.runIncoming(new C25831(socialNetwork, reason));
    }

    @Override // com.devtodev.analytics.internal.modues.analytics.IAnalytics
    public void startActivity() {
        QueueManager.Companion.runIncoming(new C25841());
    }

    @Override // com.devtodev.analytics.internal.modues.analytics.IAnalytics
    public void startProgressionEvent(@NotNull String eventName, @NotNull DTDStartProgressionEventParameters parameters) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        QueueManager.Companion.runIncoming(new C25851(parameters, eventName));
    }

    @Override // com.devtodev.analytics.internal.modues.analytics.IAnalytics
    public void stopActivity() {
        QueueManager.Companion.runIncoming(new C25861());
    }

    @Override // com.devtodev.analytics.internal.modues.analytics.IAnalytics
    public void tutorial(int i10) {
        QueueManager.Companion.runIncoming(new C25871(i10));
    }

    @Override // com.devtodev.analytics.internal.modues.analytics.IAnalytics
    public void virtualCurrencyPayment(@NotNull String purchaseId, @NotNull String purchaseType, int i10, @NotNull Map<String, Integer> resources) {
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
        Intrinsics.checkNotNullParameter(resources, "resources");
        QueueManager.Companion.runIncoming(new C25881(purchaseId, purchaseType, i10, resources));
    }
}
