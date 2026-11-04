package com.devtodev.analytics.internal.validator;

import com.devtodev.analytics.external.analytics.DTDAnalyticsConfiguration;
import com.devtodev.analytics.external.analytics.DTDFinishProgressionEventParameters;
import com.devtodev.analytics.external.analytics.DTDReferralProperty;
import com.devtodev.analytics.external.analytics.DTDStartProgressionEventParameters;
import com.devtodev.analytics.internal.logger.Logger;
import com.facebook.appevents.p;
import h4.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nValidatorRules.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValidatorRules.kt\ncom/devtodev/analytics/internal/validator/ValidatorRules\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,685:1\n215#2,2:686\n215#2,2:697\n1855#3:688\n1856#3:690\n1855#3:691\n1855#3,2:692\n1856#3:694\n1855#3,2:695\n1#4:689\n*S KotlinDebug\n*F\n+ 1 ValidatorRules.kt\ncom/devtodev/analytics/internal/validator/ValidatorRules\n*L\n118#1:686,2\n574#1:697,2\n450#1:688\n450#1:690\n466#1:691\n467#1:692,2\n466#1:694\n478#1:695,2\n*E\n"})
public final class ValidatorRules {

    @NotNull
    public static final ValidatorRules INSTANCE = new ValidatorRules();

    @NotNull
    private static final CurrencyValidator virtualCurrencyValidator = new CurrencyValidator();

    @NotNull
    private static final CurrencyValidator levelUpValidator = new CurrencyValidator();

    @NotNull
    private static final CurrencyValidator currentBalanceValidator = new CurrencyValidator();

    @NotNull
    private static final CurrencyValidator finishProgressionValidator = new CurrencyValidator();

    public static final class UsersId {

        @NotNull
        private final String prevUserName;

        @NotNull
        private final String userName;

        public UsersId(@NotNull String prevUserName, @NotNull String userName) {
            Intrinsics.checkNotNullParameter(prevUserName, "prevUserName");
            Intrinsics.checkNotNullParameter(userName, "userName");
            this.prevUserName = prevUserName;
            this.userName = userName;
        }

        public static /* synthetic */ UsersId copy$default(UsersId usersId, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = usersId.prevUserName;
            }
            if ((i10 & 2) != 0) {
                str2 = usersId.userName;
            }
            return usersId.copy(str, str2);
        }

        @NotNull
        public final String component1() {
            return this.prevUserName;
        }

        @NotNull
        public final String component2() {
            return this.userName;
        }

        @NotNull
        public final UsersId copy(@NotNull String prevUserName, @NotNull String userName) {
            Intrinsics.checkNotNullParameter(prevUserName, "prevUserName");
            Intrinsics.checkNotNullParameter(userName, "userName");
            return new UsersId(prevUserName, userName);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UsersId)) {
                return false;
            }
            UsersId usersId = (UsersId) obj;
            return Intrinsics.areEqual(this.prevUserName, usersId.prevUserName) && Intrinsics.areEqual(this.userName, usersId.userName);
        }

        @NotNull
        public final String getPrevUserName() {
            return this.prevUserName;
        }

        @NotNull
        public final String getUserName() {
            return this.userName;
        }

        public int hashCode() {
            return this.userName.hashCode() + (this.prevUserName.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "UsersId(prevUserName=" + this.prevUserName + ", userName=" + this.userName + ")";
        }
    }

    public static final class ValidCurrencyAccrual {

        @NotNull
        private final String currencyName;

        @NotNull
        private final String source;

        public ValidCurrencyAccrual(@NotNull String currencyName, @NotNull String source) {
            Intrinsics.checkNotNullParameter(currencyName, "currencyName");
            Intrinsics.checkNotNullParameter(source, "source");
            this.currencyName = currencyName;
            this.source = source;
        }

        public static /* synthetic */ ValidCurrencyAccrual copy$default(ValidCurrencyAccrual validCurrencyAccrual, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = validCurrencyAccrual.currencyName;
            }
            if ((i10 & 2) != 0) {
                str2 = validCurrencyAccrual.source;
            }
            return validCurrencyAccrual.copy(str, str2);
        }

        @NotNull
        public final String component1() {
            return this.currencyName;
        }

        @NotNull
        public final String component2() {
            return this.source;
        }

        @NotNull
        public final ValidCurrencyAccrual copy(@NotNull String currencyName, @NotNull String source) {
            Intrinsics.checkNotNullParameter(currencyName, "currencyName");
            Intrinsics.checkNotNullParameter(source, "source");
            return new ValidCurrencyAccrual(currencyName, source);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ValidCurrencyAccrual)) {
                return false;
            }
            ValidCurrencyAccrual validCurrencyAccrual = (ValidCurrencyAccrual) obj;
            return Intrinsics.areEqual(this.currencyName, validCurrencyAccrual.currencyName) && Intrinsics.areEqual(this.source, validCurrencyAccrual.source);
        }

        @NotNull
        public final String getCurrencyName() {
            return this.currencyName;
        }

        @NotNull
        public final String getSource() {
            return this.source;
        }

        public int hashCode() {
            return this.source.hashCode() + (this.currencyName.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "ValidCurrencyAccrual(currencyName=" + this.currencyName + ", source=" + this.source + ")";
        }
    }

    public static final class ValidCustomEvent {

        @NotNull
        private final String name;

        @NotNull
        private final Map<String, Object> params;

        public ValidCustomEvent(@NotNull String name, @NotNull Map<String, ? extends Object> params) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(params, "params");
            this.name = name;
            this.params = params;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ValidCustomEvent copy$default(ValidCustomEvent validCustomEvent, String str, Map map, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = validCustomEvent.name;
            }
            if ((i10 & 2) != 0) {
                map = validCustomEvent.params;
            }
            return validCustomEvent.copy(str, map);
        }

        @NotNull
        public final String component1() {
            return this.name;
        }

        @NotNull
        public final Map<String, Object> component2() {
            return this.params;
        }

        @NotNull
        public final ValidCustomEvent copy(@NotNull String name, @NotNull Map<String, ? extends Object> params) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(params, "params");
            return new ValidCustomEvent(name, params);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ValidCustomEvent)) {
                return false;
            }
            ValidCustomEvent validCustomEvent = (ValidCustomEvent) obj;
            return Intrinsics.areEqual(this.name, validCustomEvent.name) && Intrinsics.areEqual(this.params, validCustomEvent.params);
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final Map<String, Object> getParams() {
            return this.params;
        }

        public int hashCode() {
            return this.params.hashCode() + (this.name.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "ValidCustomEvent(name=" + this.name + ", params=" + this.params + ")";
        }
    }

    public static final class ValidFinishProgressionEvent {

        @NotNull
        private final String eventName;

        @NotNull
        private final DTDFinishProgressionEventParameters parameters;

        public ValidFinishProgressionEvent(@NotNull String eventName, @NotNull DTDFinishProgressionEventParameters parameters) {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.eventName = eventName;
            this.parameters = parameters;
        }

        public static /* synthetic */ ValidFinishProgressionEvent copy$default(ValidFinishProgressionEvent validFinishProgressionEvent, String str, DTDFinishProgressionEventParameters dTDFinishProgressionEventParameters, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = validFinishProgressionEvent.eventName;
            }
            if ((i10 & 2) != 0) {
                dTDFinishProgressionEventParameters = validFinishProgressionEvent.parameters;
            }
            return validFinishProgressionEvent.copy(str, dTDFinishProgressionEventParameters);
        }

        @NotNull
        public final String component1() {
            return this.eventName;
        }

        @NotNull
        public final DTDFinishProgressionEventParameters component2() {
            return this.parameters;
        }

        @NotNull
        public final ValidFinishProgressionEvent copy(@NotNull String eventName, @NotNull DTDFinishProgressionEventParameters parameters) {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            return new ValidFinishProgressionEvent(eventName, parameters);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ValidFinishProgressionEvent)) {
                return false;
            }
            ValidFinishProgressionEvent validFinishProgressionEvent = (ValidFinishProgressionEvent) obj;
            return Intrinsics.areEqual(this.eventName, validFinishProgressionEvent.eventName) && Intrinsics.areEqual(this.parameters, validFinishProgressionEvent.parameters);
        }

        @NotNull
        public final String getEventName() {
            return this.eventName;
        }

        @NotNull
        public final DTDFinishProgressionEventParameters getParameters() {
            return this.parameters;
        }

        public int hashCode() {
            return this.parameters.hashCode() + (this.eventName.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "ValidFinishProgressionEvent(eventName=" + this.eventName + ", parameters=" + this.parameters + ")";
        }
    }

    public static final class ValidVirtualCurrencyPayment {

        @NotNull
        private final Map<String, Integer> boundedResources;

        @NotNull
        private final String purchaseId;

        @NotNull
        private final String purchaseType;

        public ValidVirtualCurrencyPayment(@NotNull String purchaseId, @NotNull String purchaseType, @NotNull Map<String, Integer> boundedResources) {
            Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
            Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
            Intrinsics.checkNotNullParameter(boundedResources, "boundedResources");
            this.purchaseId = purchaseId;
            this.purchaseType = purchaseType;
            this.boundedResources = boundedResources;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ValidVirtualCurrencyPayment copy$default(ValidVirtualCurrencyPayment validVirtualCurrencyPayment, String str, String str2, Map map, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = validVirtualCurrencyPayment.purchaseId;
            }
            if ((i10 & 2) != 0) {
                str2 = validVirtualCurrencyPayment.purchaseType;
            }
            if ((i10 & 4) != 0) {
                map = validVirtualCurrencyPayment.boundedResources;
            }
            return validVirtualCurrencyPayment.copy(str, str2, map);
        }

        @NotNull
        public final String component1() {
            return this.purchaseId;
        }

        @NotNull
        public final String component2() {
            return this.purchaseType;
        }

        @NotNull
        public final Map<String, Integer> component3() {
            return this.boundedResources;
        }

        @NotNull
        public final ValidVirtualCurrencyPayment copy(@NotNull String purchaseId, @NotNull String purchaseType, @NotNull Map<String, Integer> boundedResources) {
            Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
            Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
            Intrinsics.checkNotNullParameter(boundedResources, "boundedResources");
            return new ValidVirtualCurrencyPayment(purchaseId, purchaseType, boundedResources);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ValidVirtualCurrencyPayment)) {
                return false;
            }
            ValidVirtualCurrencyPayment validVirtualCurrencyPayment = (ValidVirtualCurrencyPayment) obj;
            return Intrinsics.areEqual(this.purchaseId, validVirtualCurrencyPayment.purchaseId) && Intrinsics.areEqual(this.purchaseType, validVirtualCurrencyPayment.purchaseType) && Intrinsics.areEqual(this.boundedResources, validVirtualCurrencyPayment.boundedResources);
        }

        @NotNull
        public final Map<String, Integer> getBoundedResources() {
            return this.boundedResources;
        }

        @NotNull
        public final String getPurchaseId() {
            return this.purchaseId;
        }

        @NotNull
        public final String getPurchaseType() {
            return this.purchaseType;
        }

        public int hashCode() {
            return this.boundedResources.hashCode() + b.a(this.purchaseType, this.purchaseId.hashCode() * 31, 31);
        }

        @NotNull
        public String toString() {
            return "ValidVirtualCurrencyPayment(purchaseId=" + this.purchaseId + ", purchaseType=" + this.purchaseType + ", boundedResources=" + this.boundedResources + ")";
        }
    }

    private ValidatorRules() {
    }

    private final void notifyThatMethodExecutionHasEmptyMap(String str) {
        Logger.error$default(Logger.INSTANCE, "Execution of the [" + str + "] method was canceled!\n\tMap is empty!", null, 2, null);
    }

    private final boolean validateResourceKey(CurrencyValidator currencyValidator, String str) {
        Long numberOfCurrencies = Validator.INSTANCE.getNumberOfCurrencies();
        if (numberOfCurrencies == null) {
            return true;
        }
        long jLongValue = numberOfCurrencies.longValue();
        if (currencyValidator.getValidCurrencies().contains(str)) {
            return true;
        }
        if (currencyValidator.getValidCurrencies().size() >= jLongValue) {
            return false;
        }
        currencyValidator.getValidCurrencies().add(str);
        return true;
    }

    private final <T extends Number> Map<String, T> validateResources(String str, String str2, Map<String, ? extends T> map, CurrencyValidator currencyValidator, int i10, long j10, long j11) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends T> entry : map.entrySet()) {
            String key = entry.getKey();
            T value = entry.getValue();
            Bounder bounder = Bounder.INSTANCE;
            String strDeleteNonPrintCharacters = bounder.deleteNonPrintCharacters(key);
            String str3 = "The [" + strDeleteNonPrintCharacters + "] key of the " + str2;
            String strMaxStringLength = bounder.maxStringLength(str, str3, strDeleteNonPrintCharacters, i10);
            Validator validator = Validator.INSTANCE;
            boolean zNotNullOrEmpty = validator.notNullOrEmpty(str, str3, strMaxStringLength);
            boolean zInInterval = validator.inInterval(str, "The value of the " + str2, value, Long.valueOf(j10), Long.valueOf(j11));
            if (zNotNullOrEmpty && zInInterval && strMaxStringLength != null && validateResourceKey(currencyValidator, strMaxStringLength)) {
                linkedHashMap.put(strMaxStringLength, value);
            }
        }
        return linkedHashMap;
    }

    public final void notifyThatMethodExecutionWasCanceled(@NotNull String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        Logger.error$default(Logger.INSTANCE, "Execution of the [" + method + "] method was canceled!", null, 2, null);
    }

    @Nullable
    public final ValidateAdImpressionData validateAdImpression(@NotNull String network, double d10, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(network, "network");
        Bounder bounder = Bounder.INSTANCE;
        String strMaxStringLength = bounder.maxStringLength(p.B, "The network argument value", bounder.deleteNonPrintCharacters(network), 100);
        String strMaxStringLength2 = bounder.maxStringLength(p.B, "The placement argument value", bounder.deleteNonPrintCharacters(str), 100);
        String str3 = (strMaxStringLength2 == null || strMaxStringLength2.length() == 0) ? null : strMaxStringLength2;
        String strMaxStringLength3 = bounder.maxStringLength(p.B, "The unit argument value", bounder.deleteNonPrintCharacters(str2), 100);
        String str4 = (strMaxStringLength3 == null || strMaxStringLength3.length() == 0) ? null : strMaxStringLength3;
        Validator validator = Validator.INSTANCE;
        boolean z10 = validator.inInterval(p.B, "The revenue argument value", Double.valueOf(d10), Double.valueOf(0.0d), Double.valueOf(Double.MAX_VALUE)) && validator.notNullOrEmpty(p.B, "The network argument value", strMaxStringLength);
        if (strMaxStringLength != null && z10) {
            return new ValidateAdImpressionData(strMaxStringLength, d10, str3, str4);
        }
        notifyThatMethodExecutionWasCanceled(p.B);
        return null;
    }

    @Nullable
    public final ValidCurrencyAccrual validateCurrencyAccrual(@NotNull String currencyName, long j10, @NotNull String source) {
        Intrinsics.checkNotNullParameter(currencyName, "currencyName");
        Intrinsics.checkNotNullParameter(source, "source");
        Bounder bounder = Bounder.INSTANCE;
        String strMaxStringLength = bounder.maxStringLength("CurrencyAccrual", "The currency name", bounder.deleteNonPrintCharacters(currencyName), 24);
        Validator validator = Validator.INSTANCE;
        boolean zNotNullOrEmpty = validator.notNullOrEmpty("CurrencyAccrual", "The currency name", strMaxStringLength);
        String strMaxStringLength2 = bounder.maxStringLength("CurrencyAccrual", "The currency name", bounder.deleteNonPrintCharacters(source), 32);
        boolean z10 = validator.notNullOrEmpty("CurrencyAccrual", "The source", strMaxStringLength2) && zNotNullOrEmpty;
        if (validator.inInterval("CurrencyAccrual", "The currency amount", Long.valueOf(j10), 1L, Long.MAX_VALUE) && z10 && strMaxStringLength != null && strMaxStringLength2 != null) {
            return new ValidCurrencyAccrual(strMaxStringLength, strMaxStringLength2);
        }
        notifyThatMethodExecutionWasCanceled("CurrencyAccrual");
        return null;
    }

    @Nullable
    public final Map<String, Long> validateCurrentBalance(@NotNull Map<String, Long> balances) {
        Intrinsics.checkNotNullParameter(balances, "balances");
        Map<String, Long> mapValidateResources = validateResources("CurrentBalance", "balances dictionary", balances, currentBalanceValidator, 24, Long.MIN_VALUE, Long.MAX_VALUE);
        if (Validator.INSTANCE.notNullOrEmpty("CurrentBalance", "The balance parameter value", mapValidateResources)) {
            return mapValidateResources;
        }
        notifyThatMethodExecutionWasCanceled("CurrentBalance");
        return null;
    }

    @Nullable
    public final ValidCustomEvent validateCustomEvent(@NotNull String eventName, @NotNull Map<String, ? extends Object> parameters) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Bounder bounder = Bounder.INSTANCE;
        String strMaxStringLength = bounder.maxStringLength("CustomEvent", "The custom event name", bounder.deleteNonPrintCharacters(eventName), 72);
        boolean zNotNullOrEmpty = Validator.INSTANCE.notNullOrEmpty("CustomEvent", "The custom event name", strMaxStringLength);
        Map mapEmptyMap = MapsKt.emptyMap();
        for (Map.Entry<String, ? extends Object> entry : parameters.entrySet()) {
            Bounder bounder2 = Bounder.INSTANCE;
            String strDeleteNonPrintCharacters = bounder2.deleteNonPrintCharacters(entry.getKey());
            if (strDeleteNonPrintCharacters == null) {
                Logger.error$default(Logger.INSTANCE, "The key of the parameters dictionary is empty!", null, 2, null);
            }
            String str = "The value of the parameters dictionary by [" + strDeleteNonPrintCharacters + "] key";
            String strMaxStringLength2 = bounder2.maxStringLength("CustomEvent", "The key of the parameters dictionary", strDeleteNonPrintCharacters, 32);
            if (strMaxStringLength2 != null) {
                Validator validator = Validator.INSTANCE;
                boolean zNotNullOrEmpty2 = validator.notNullOrEmpty("CustomEvent", "The key of the parameters dictionary", strMaxStringLength2);
                boolean zValidType = validator.validType("CustomEvent", str, entry.getValue());
                if (zNotNullOrEmpty2 && zValidType) {
                    Object value = entry.getValue();
                    if (value instanceof Long) {
                        if (validator.inInterval("CustomEvent", str, (Number) value, Long.MIN_VALUE, Long.MAX_VALUE)) {
                            mapEmptyMap = MapsKt.toMutableMap(mapEmptyMap);
                            mapEmptyMap.put(strMaxStringLength2, value);
                        }
                    } else if (value instanceof String) {
                        String strMaxStringLength3 = bounder2.maxStringLength("CustomEvent", str, bounder2.deleteNonPrintCharacters((String) value), 255);
                        if (validator.notNullOrEmpty("CustomEvent", str, strMaxStringLength3)) {
                            mapEmptyMap = MapsKt.toMutableMap(mapEmptyMap);
                            Intrinsics.checkNotNull(strMaxStringLength3);
                            mapEmptyMap.put(strMaxStringLength2, strMaxStringLength3);
                        }
                    } else if (value instanceof Double) {
                        if (validator.inInterval("CustomEvent", str, (Number) value, Double.valueOf(-1.7976931348623157E308d), Double.valueOf(Double.MAX_VALUE))) {
                            mapEmptyMap = MapsKt.toMutableMap(mapEmptyMap);
                            mapEmptyMap.put(strMaxStringLength2, value);
                        }
                    } else if (value instanceof Boolean) {
                        mapEmptyMap = MapsKt.toMutableMap(mapEmptyMap);
                        mapEmptyMap.put(strMaxStringLength2, value);
                    }
                }
            }
        }
        if (zNotNullOrEmpty && strMaxStringLength != null) {
            return new ValidCustomEvent(strMaxStringLength, mapEmptyMap);
        }
        notifyThatMethodExecutionWasCanceled("CustomEvent");
        return null;
    }

    @Nullable
    public final ValidFinishProgressionEvent validateFinishProgressionEvent(@NotNull String eventName, @NotNull DTDFinishProgressionEventParameters parameters) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Bounder bounder = Bounder.INSTANCE;
        String strMaxStringLength = bounder.maxStringLength("FinishProgressionEvent", "The event name argument value", bounder.deleteNonPrintCharacters(eventName), 40);
        Validator validator = Validator.INSTANCE;
        boolean zNotNullOrEmpty = validator.notNullOrEmpty("FinishProgressionEvent", "The event name argument value", strMaxStringLength);
        boolean z10 = false;
        if (validator.inInterval("FinishProgressionEvent", "The duration parameter value", Integer.valueOf(parameters.getDuration()), 0, Integer.MAX_VALUE) && zNotNullOrEmpty) {
            z10 = true;
        }
        Map<String, Long> spent = parameters.getSpent();
        CurrencyValidator currencyValidator = finishProgressionValidator;
        Map<String, Long> mapValidateResources = validateResources("FinishProgressionEvent", "spent dictionary", spent, currencyValidator, 24, 1L, Long.MAX_VALUE);
        Map<String, Long> mapValidateResources2 = validateResources("FinishProgressionEvent", "earned dictionary", parameters.getEarned(), currencyValidator, 24, 1L, Long.MAX_VALUE);
        if (!z10) {
            notifyThatMethodExecutionWasCanceled("FinishProgressionEvent");
            return null;
        }
        DTDFinishProgressionEventParameters dTDFinishProgressionEventParameters = new DTDFinishProgressionEventParameters();
        dTDFinishProgressionEventParameters.setSuccessfulCompletion(parameters.getSuccessfulCompletion());
        dTDFinishProgressionEventParameters.setSpent(mapValidateResources);
        dTDFinishProgressionEventParameters.setEarned(mapValidateResources2);
        dTDFinishProgressionEventParameters.setDuration(parameters.getDuration());
        Intrinsics.checkNotNull(strMaxStringLength);
        return new ValidFinishProgressionEvent(strMaxStringLength, dTDFinishProgressionEventParameters);
    }

    @NotNull
    public final DTDAnalyticsConfiguration validateInitialize(@NotNull DTDAnalyticsConfiguration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        DTDAnalyticsConfiguration dTDAnalyticsConfigurationClone$DTDAnalytics_androidRelease = configuration.clone$DTDAnalytics_androidRelease();
        String userId = dTDAnalyticsConfigurationClone$DTDAnalytics_androidRelease.getUserId();
        if (userId != null) {
            dTDAnalyticsConfigurationClone$DTDAnalytics_androidRelease.setUserId(INSTANCE.validateUserId("Initialize", userId));
        }
        Integer currentLevel = dTDAnalyticsConfigurationClone$DTDAnalytics_androidRelease.getCurrentLevel();
        if (currentLevel != null) {
            if (!Validator.INSTANCE.inInterval("Initialize", "The current level argument value", Integer.valueOf(currentLevel.intValue()), 1, 2147483646)) {
                dTDAnalyticsConfigurationClone$DTDAnalytics_androidRelease.setCurrentLevel(null);
            }
        }
        return dTDAnalyticsConfigurationClone$DTDAnalytics_androidRelease;
    }

    @Nullable
    public final String validateInitializeKey(@NotNull String applicationKey) {
        Intrinsics.checkNotNullParameter(applicationKey, "applicationKey");
        Bounder bounder = Bounder.INSTANCE;
        String strMaxStringLength = bounder.maxStringLength("Initialize", "The application key argument value", bounder.deleteNonPrintCharacters(applicationKey), 255);
        if (Validator.INSTANCE.notNullOrEmpty("Initialize", "The application key argument value", strMaxStringLength)) {
            return strMaxStringLength;
        }
        notifyThatMethodExecutionWasCanceled("Initialize");
        return null;
    }

    @Nullable
    public final Map<String, Long> validateLevelUp(int i10, @NotNull Map<String, Long> balances) {
        Intrinsics.checkNotNullParameter(balances, "balances");
        boolean zInInterval = Validator.INSTANCE.inInterval("LevelUp", "The level argument value", Integer.valueOf(i10), 1, 2147483646);
        Map<String, Long> mapValidateResources = validateResources("LevelUp", "balances dictionary", balances, levelUpValidator, 24, Long.MIN_VALUE, Long.MAX_VALUE);
        if (zInInterval) {
            return mapValidateResources;
        }
        notifyThatMethodExecutionWasCanceled("LevelUp");
        return null;
    }

    @Nullable
    public final PaymentData validatePayment(@NotNull String methodName, @NotNull String orderId, double d10, @NotNull String productId, @NotNull String currencyCode) {
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        Bounder bounder = Bounder.INSTANCE;
        String strMaxStringLength = bounder.maxStringLength(methodName, "The order id argument value", bounder.deleteNonPrintCharacters(orderId), 65);
        String strMaxStringLength2 = bounder.maxStringLength(methodName, "The product id parameter value", bounder.deleteNonPrintCharacters(productId), 255);
        String strDeleteNonPrintCharacters = bounder.deleteNonPrintCharacters(currencyCode);
        Validator validator = Validator.INSTANCE;
        boolean z10 = false;
        boolean z11 = validator.notNullOrEmpty(methodName, "The order id argument value", strMaxStringLength) && (validator.inInterval(methodName, "The price argument value", Double.valueOf(d10), Double.valueOf(-1.7976931348623157E308d), Double.valueOf(Double.MAX_VALUE)) && validator.equalStringLength(methodName, "The currency code parameter value", strDeleteNonPrintCharacters, 3));
        if (validator.notNullOrEmpty(methodName, "The product id parameter value", strMaxStringLength2) && z11) {
            z10 = true;
        }
        if (strMaxStringLength == null || strMaxStringLength2 == null || !z10) {
            notifyThatMethodExecutionWasCanceled(methodName);
            return null;
        }
        Intrinsics.checkNotNull(strDeleteNonPrintCharacters);
        return new PaymentData(strMaxStringLength, d10, strMaxStringLength2, strDeleteNonPrintCharacters);
    }

    @Nullable
    public final Map<DTDReferralProperty, String> validateReferrer(@NotNull Map<DTDReferralProperty, String> utmData) {
        Intrinsics.checkNotNullParameter(utmData, "utmData");
        Map<DTDReferralProperty, String> mapEmptyMap = MapsKt.emptyMap();
        for (Map.Entry<DTDReferralProperty, String> entry : utmData.entrySet()) {
            Bounder bounder = Bounder.INSTANCE;
            String strDeleteNonPrintCharacters = bounder.deleteNonPrintCharacters(entry.getValue());
            String str = "The [" + strDeleteNonPrintCharacters + "] value of the utm data dictionary by [" + entry.getKey().name() + "] key";
            String strMaxStringLength = bounder.maxStringLength("Referrer", str, strDeleteNonPrintCharacters, 255);
            if (Validator.INSTANCE.notNullOrEmpty("Referrer", str, strMaxStringLength) && strMaxStringLength != null) {
                mapEmptyMap = MapsKt.toMutableMap(mapEmptyMap);
                mapEmptyMap.put(entry.getKey(), strMaxStringLength);
            }
        }
        if (!mapEmptyMap.isEmpty()) {
            return mapEmptyMap;
        }
        notifyThatMethodExecutionHasEmptyMap("Referrer");
        return null;
    }

    @Nullable
    public final UsersId validateReplaceUserId(@NotNull String method, @NotNull String prevUserName, @NotNull String userName) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(prevUserName, "prevUserName");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Bounder bounder = Bounder.INSTANCE;
        String strMaxStringLength = bounder.maxStringLength(method, "The user id argument value", bounder.deleteNonPrintCharacters(prevUserName), 64);
        Validator validator = Validator.INSTANCE;
        boolean zNotNullOrEmpty = validator.notNullOrEmpty(method, "The user id argument value", strMaxStringLength);
        String strMaxStringLength2 = bounder.maxStringLength(method, "The user id argument value", bounder.deleteNonPrintCharacters(userName), 64);
        boolean zNotNullOrEmpty2 = validator.notNullOrEmpty(method, "The user id argument value", strMaxStringLength2);
        if (!zNotNullOrEmpty || !zNotNullOrEmpty2) {
            return null;
        }
        Intrinsics.checkNotNull(strMaxStringLength);
        Intrinsics.checkNotNull(strMaxStringLength2);
        return new UsersId(strMaxStringLength, strMaxStringLength2);
    }

    @Nullable
    public final String validateSocialNetworkConnect(@NotNull String socialNetwork) {
        Intrinsics.checkNotNullParameter(socialNetwork, "socialNetwork");
        Bounder bounder = Bounder.INSTANCE;
        String strMaxStringLength = bounder.maxStringLength("SocialNetworkConnect", "The social network name argument value", bounder.deleteNonPrintCharacters(socialNetwork), 24);
        if (Validator.INSTANCE.notNullOrEmpty("SocialNetworkConnect", "The social network name argument value", strMaxStringLength)) {
            return strMaxStringLength;
        }
        notifyThatMethodExecutionWasCanceled("SocialNetworkConnect");
        return null;
    }

    @Nullable
    public final SocialNetworkPostData validateSocialNetworkPost(@NotNull String socialNetwork, @NotNull String reason) {
        Intrinsics.checkNotNullParameter(socialNetwork, "socialNetwork");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Bounder bounder = Bounder.INSTANCE;
        String strMaxStringLength = bounder.maxStringLength("SocialNetworkPost", "The social network name argument value", bounder.deleteNonPrintCharacters(socialNetwork), 24);
        String strMaxStringLength2 = bounder.maxStringLength("SocialNetworkPost", "The post reason argument value", bounder.deleteNonPrintCharacters(reason), 32);
        Validator validator = Validator.INSTANCE;
        boolean z10 = validator.notNullOrEmpty("SocialNetworkPost", "The post reason argument value", strMaxStringLength2) && validator.notNullOrEmpty("SocialNetworkPost", "The social network name argument value", strMaxStringLength);
        if (strMaxStringLength != null && strMaxStringLength2 != null && z10) {
            return new SocialNetworkPostData(strMaxStringLength, strMaxStringLength2);
        }
        notifyThatMethodExecutionWasCanceled("SocialNetworkPost");
        return null;
    }

    @Nullable
    public final DTDStartProgressionEventParameters validateStartProgressionEvent(@NotNull String eventName, @NotNull DTDStartProgressionEventParameters parameters) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Bounder bounder = Bounder.INSTANCE;
        String strMaxStringLength = bounder.maxStringLength("StartProgressionEvent", "The event name argument value", bounder.deleteNonPrintCharacters(eventName), 40);
        Validator validator = Validator.INSTANCE;
        boolean zNotNullOrEmpty = validator.notNullOrEmpty("StartProgressionEvent", "The event name argument value", strMaxStringLength);
        String strMaxStringLength2 = bounder.maxStringLength("StartProgressionEvent", "The source parameter value", bounder.deleteNonPrintCharacters(parameters.getSource()), 40);
        Integer difficulty$DTDAnalytics_androidRelease = parameters.getDifficulty$DTDAnalytics_androidRelease();
        if (difficulty$DTDAnalytics_androidRelease != null) {
            zNotNullOrEmpty = validator.inInterval("StartProgressionEvent", "The difficulty parameter value", Integer.valueOf(difficulty$DTDAnalytics_androidRelease.intValue()), Integer.MIN_VALUE, Integer.MAX_VALUE) && zNotNullOrEmpty;
        }
        if (!zNotNullOrEmpty) {
            notifyThatMethodExecutionWasCanceled("StartProgressionEvent");
            return null;
        }
        DTDStartProgressionEventParameters dTDStartProgressionEventParameters = new DTDStartProgressionEventParameters();
        dTDStartProgressionEventParameters.setSource(strMaxStringLength2);
        dTDStartProgressionEventParameters.setDifficulty$DTDAnalytics_androidRelease(parameters.getDifficulty$DTDAnalytics_androidRelease());
        return dTDStartProgressionEventParameters;
    }

    @Nullable
    public final List<JSONObject> validateSubscriptionHistory(@NotNull List<String> purchaseList) throws JSONException {
        Intrinsics.checkNotNullParameter(purchaseList, "purchaseList");
        ArrayList arrayList = new ArrayList();
        if (purchaseList.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        Iterator<T> it = purchaseList.iterator();
        while (it.hasNext()) {
            String strDeleteNonPrintCharacters = Bounder.INSTANCE.deleteNonPrintCharacters((String) it.next());
            if (strDeleteNonPrintCharacters != null) {
                arrayList.add(strDeleteNonPrintCharacters);
            }
        }
        List<JSONObject> listConvertToJsonList = ValidatorKt.convertToJsonList(arrayList, "SubscriptionHistory");
        if (listConvertToJsonList == null) {
            notifyThatMethodExecutionWasCanceled("SubscriptionHistory");
            return null;
        }
        if (ValidatorKt.hasEmptyObj(listConvertToJsonList)) {
            return null;
        }
        if (!ValidatorKt.containsOnlyStringValues(listConvertToJsonList, "SubscriptionHistory")) {
            notifyThatMethodExecutionWasCanceled("SubscriptionHistory");
            return null;
        }
        for (JSONObject jSONObject : listConvertToJsonList) {
            for (String str : CollectionsKt.listOf((Object[]) new String[]{"orderId", "productId"})) {
                if (!ValidatorKt.hasRequiredKeys(jSONObject, "SubscriptionHistory", str)) {
                    INSTANCE.notifyThatMethodExecutionWasCanceled("SubscriptionHistory");
                    return null;
                }
                if (!ValidatorKt.notNullOrEmpty(jSONObject, "SubscriptionHistory", str)) {
                    INSTANCE.notifyThatMethodExecutionWasCanceled("SubscriptionHistory");
                    return null;
                }
            }
        }
        for (JSONObject jSONObject2 : listConvertToJsonList) {
            String string = jSONObject2.get("productId").toString();
            Bounder bounder = Bounder.INSTANCE;
            String strDeleteNonPrintCharacters2 = bounder.deleteNonPrintCharacters(string);
            if (strDeleteNonPrintCharacters2 == null) {
                return null;
            }
            Validator validator = Validator.INSTANCE;
            if (!validator.notNullOrEmpty("SubscriptionHistory", "The product id parameter value", strDeleteNonPrintCharacters2)) {
                return null;
            }
            jSONObject2.put("productId", bounder.maxNotNullStringLength("SubscriptionHistory", "The product id parameter value", strDeleteNonPrintCharacters2, 255));
            Object obj = jSONObject2.get("orderId");
            if (obj instanceof JSONArray) {
                JSONArray jSONArray = new JSONArray();
                JSONArray jSONArray2 = (JSONArray) obj;
                int length = jSONArray2.length();
                for (int i10 = 0; i10 < length; i10++) {
                    Bounder bounder2 = Bounder.INSTANCE;
                    String strDeleteNonPrintCharacters3 = bounder2.deleteNonPrintCharacters(jSONArray2.get(i10).toString());
                    if (strDeleteNonPrintCharacters3 == null || !Validator.INSTANCE.notNullOrEmpty("SubscriptionHistory", "The order id argument value", strDeleteNonPrintCharacters3)) {
                        return null;
                    }
                    jSONArray.put(bounder2.maxNotNullStringLength("SubscriptionHistory", "The order id argument value", strDeleteNonPrintCharacters3, 65));
                }
                jSONObject2.put("orderId", jSONArray);
            } else if (obj instanceof String) {
                String strDeleteNonPrintCharacters4 = bounder.deleteNonPrintCharacters(jSONObject2.get("orderId").toString());
                if (strDeleteNonPrintCharacters4 == null || !validator.notNullOrEmpty("SubscriptionHistory", "The order id argument value", strDeleteNonPrintCharacters4)) {
                    return null;
                }
                jSONObject2.put("orderId", bounder.maxNotNullStringLength("SubscriptionHistory", "The order id argument value", strDeleteNonPrintCharacters4, 65));
            } else {
                continue;
            }
        }
        return listConvertToJsonList;
    }

    @Nullable
    public final Integer validateTutorial(int i10) {
        if (Validator.INSTANCE.inInterval("Tutorial", "The step argument value", Integer.valueOf(i10), -2, Integer.MAX_VALUE)) {
            return Integer.valueOf(i10);
        }
        notifyThatMethodExecutionWasCanceled("Tutorial");
        return null;
    }

    @Nullable
    public final String validateUserId(@NotNull String method, @NotNull String userName) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(userName, "userName");
        if (Intrinsics.areEqual(userName, "")) {
            return userName;
        }
        Bounder bounder = Bounder.INSTANCE;
        String strMaxStringLength = bounder.maxStringLength(method, "The user id argument value", bounder.deleteNonPrintCharacters(userName), 64);
        if (Validator.INSTANCE.notNullOrEmpty(method, "The user id argument value", strMaxStringLength)) {
            return strMaxStringLength;
        }
        return null;
    }

    @Nullable
    public final ValidVirtualCurrencyPayment validateVirtualCurrencyPayment(@NotNull String purchaseId, @NotNull String purchaseType, int i10, @NotNull Map<String, Integer> resources) {
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Validator validator = Validator.INSTANCE;
        boolean zInInterval = validator.inInterval("VirtualCurrencyPayment", "The purchase amount", Integer.valueOf(i10), 1L, Integer.MAX_VALUE);
        Map mapValidateResources = validateResources("VirtualCurrencyPayment", "resources dictionary", resources, virtualCurrencyValidator, 24, 1L, Long.MAX_VALUE);
        boolean z10 = false;
        if (mapValidateResources.isEmpty()) {
            Logger.error$default(Logger.INSTANCE, "VirtualCurrencyPayment has empty Resources dictionary!", null, 2, null);
            zInInterval = false;
        }
        Bounder bounder = Bounder.INSTANCE;
        String strMaxStringLength = bounder.maxStringLength("VirtualCurrencyPayment", "The purchase identifier", bounder.deleteNonPrintCharacters(purchaseId), 32);
        if (validator.notNullOrEmpty("VirtualCurrencyPayment", "The purchase identifier", strMaxStringLength) && zInInterval) {
            z10 = true;
        }
        String strMaxStringLength2 = bounder.maxStringLength("VirtualCurrencyPayment", "The purchase type", bounder.deleteNonPrintCharacters(purchaseType), 96);
        if (!validator.notNullOrEmpty("VirtualCurrencyPayment", "The purchase type", strMaxStringLength2) || !z10 || strMaxStringLength == null || strMaxStringLength2 == null) {
            return null;
        }
        return new ValidVirtualCurrencyPayment(strMaxStringLength, strMaxStringLength2, mapValidateResources);
    }

    @Nullable
    public final Double validateWaitingValue$DTDAnalytics_androidRelease(@NotNull String method, double d10, double d11) {
        Intrinsics.checkNotNullParameter(method, "method");
        Validator validator = Validator.INSTANCE;
        boolean zValidateDoubleNAN = validator.validateDoubleNAN(method, "newValue", d11);
        if (validator.inInterval(method, "newValue", Double.valueOf(d11), Double.valueOf(d10), Double.valueOf(Double.MAX_VALUE)) && zValidateDoubleNAN) {
            return Double.valueOf(d11);
        }
        notifyThatMethodExecutionWasCanceled(method);
        return null;
    }
}
