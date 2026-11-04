package com.devtodev.analytics.internal.backend.repository.json;

import com.devtodev.analytics.internal.backend.BackendConfig;
import com.devtodev.analytics.internal.backend.BackendUserProperties;
import com.devtodev.analytics.internal.backend.ConfigEntry;
import com.devtodev.analytics.internal.backend.ConfigJsonError;
import com.devtodev.analytics.internal.backend.ExcludeEvents;
import com.devtodev.analytics.internal.backend.repository.AbTestOffer;
import com.devtodev.analytics.internal.backend.repository.BackendUserData;
import com.devtodev.analytics.internal.backend.repository.BackendUserDataJsonError;
import com.devtodev.analytics.internal.backend.repository.BackendUserDataRetry;
import com.devtodev.analytics.internal.backend.repository.IJsonParser;
import com.devtodev.analytics.internal.backend.repository.InvolvedExperiment;
import com.devtodev.analytics.internal.backend.repository.InvolvedExperiments;
import com.devtodev.analytics.internal.backend.repository.Parameter;
import com.devtodev.analytics.internal.backend.repository.RemoteConfig;
import com.devtodev.analytics.internal.backend.repository.RemoteConfigJsonError;
import com.devtodev.analytics.internal.backend.repository.RemoteConfigSealedClass;
import com.devtodev.analytics.internal.backend.repository.RemoteOfferJsonError;
import com.devtodev.analytics.internal.backend.repository.SummaryBackendData;
import com.devtodev.analytics.internal.backend.repository.UserData;
import com.devtodev.analytics.internal.backend.repository.UserIdentifications;
import com.devtodev.analytics.internal.backend.repository.UserProperties;
import com.devtodev.analytics.internal.domain.events.abTests.AbTestsConditions;
import com.devtodev.analytics.internal.domain.events.abTests.AbTestsExperiment;
import com.devtodev.analytics.internal.domain.events.abTests.AudienceKeys;
import com.devtodev.analytics.internal.domain.events.abTests.Comparison;
import com.devtodev.analytics.internal.domain.events.abTests.Condition;
import com.devtodev.analytics.internal.domain.events.abTests.ConditionsType;
import com.devtodev.analytics.internal.logger.Logger;
import com.devtodev.analytics.internal.storage.sqlite.AbTestProjectEntry;
import com.rabbitmq.client.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nJsonParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonParser.kt\ncom/devtodev/analytics/internal/backend/repository/json/JsonParser\n+ 2 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,658:1\n32#2,2:659\n32#2,2:662\n32#2,2:664\n32#2,2:666\n32#2,2:668\n32#2:670\n32#2,2:671\n33#2:673\n1#3:661\n1855#4,2:674\n*S KotlinDebug\n*F\n+ 1 JsonParser.kt\ncom/devtodev/analytics/internal/backend/repository/json/JsonParser\n*L\n117#1:659,2\n135#1:662,2\n158#1:664,2\n185#1:666,2\n224#1:668,2\n258#1:670\n263#1:671,2\n258#1:673\n394#1:674,2\n*E\n"})
public final class JsonParser implements IJsonParser {

    @NotNull
    private static final String ALIVE_TIMEOUT = "aliveTimeout";

    @NotNull
    public static final String ALL = "all";

    @NotNull
    private static final String CAMPAIGN = "campaign";

    @NotNull
    private static final String CHANNEL = "channel";

    @NotNull
    private static final String COMPLETION_DATE = "completionDate";

    @NotNull
    private static final String CONDITIONS = "conditions";

    @NotNull
    private static final String COUNTRY = "country";

    @NotNull
    private static final String COUNTRY_FROM_AB_TESTS = "country";

    @NotNull
    private static final String COUNT_FOR_REQUEST = "countForRequest";

    @NotNull
    private static final String CREATED = "created";

    @NotNull
    private static final String CREATION_DATE = "creationDate";

    @NotNull
    private static final String CURRENCY_AGGREGATION_TIMEOUT = "currencyAggregationTimeout";

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final String DEVTODEV_ID_TIMEOUT = "devtodevIdTimeout";

    @NotNull
    private static final String EVENT_PARAMS_COUNT = "eventParamsCount";

    @NotNull
    private static final String EXCLUDE = "exclude";

    @NotNull
    public static final String EXCLUDE_EVENTS = "excludeEvents";

    @NotNull
    public static final String EXCLUDE_VERSION = "version";

    @NotNull
    private static final String EXPERIMENTS = "experiments";

    @NotNull
    private static final String FIRST_VERSION = "firstVersion";

    @NotNull
    private static final String GROUP = "group";

    @NotNull
    private static final String ID = "id";

    @NotNull
    private static final String IDENTIFICATION_CROSS_PLATFORM_ID = "crossPlatformDevtodevId";

    @NotNull
    private static final String IDENTIFICATION_DEVICE_ID = "devtodevId";

    @NotNull
    private static final String IDENTIFICATION_DEVTODEV_ID_TIMESTAMP = "devtodevIdTimestamp";

    @NotNull
    private static final String IDENTIFICATION_RETRY = "retryAfter";

    @NotNull
    private static final String ID_EXP = "id";

    @NotNull
    private static final String INVOLVED_EXPERIMENTS = "involvedExperiments";

    @NotNull
    private static final String IS_NEW_USER = "newUser";

    @NotNull
    private static final String IS_TESTING = "isTesting";

    @NotNull
    private static final String KEY = "key";

    @NotNull
    private static final String NUMBER_OF_CURRENCIES = "numberOfCurrencies";

    @NotNull
    private static final String PARAMETERS = "parameters";

    @NotNull
    private static final String PAYING_CAPACITY = "pCapacity";

    @NotNull
    private static final String PAYMENTS_COUNT = "pCount";

    @NotNull
    private static final String PAYMENT_SUM = "pSum";

    @NotNull
    private static final String SBS_CONFIG_VERSION = "sbsConfigVersion";

    @NotNull
    private static final String SERVER_TIME = "serverTime";

    @NotNull
    private static final String SESSION_TIMEOUT = "sessionTimeout";

    @NotNull
    private static final String SUBSCRIPTIONS_PAYMENTS_COUNT = "sbsCount";

    @NotNull
    private static final String SUBSCRIPTIONS_PAYMENTS_SUM = "sbsSum";

    @NotNull
    private static final String SUBSCRIPTION_STATUS = "sbsStatus";

    @NotNull
    private static final String TIMER_FOR_REQUEST = "timeForRequest";

    @NotNull
    private static final String UPDATE_DATE = "updateDate";

    @NotNull
    private static final String USER_CARD_KEYS_COUNT = "userCardKeysCount";

    @NotNull
    private static final String USER_COUNTING = "userCounting";

    @NotNull
    private static final String USER_PROPERTIES = "userProperties";

    @NotNull
    private static final String USER_PROPERTIES_FROM_AB_TESTS = "userProperties";

    @NotNull
    private static final String VALUES = "values";

    @NotNull
    private static final String VERSION = "version";

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final Condition createCondition(String str, String str2, Object obj) {
        Condition condition = new Condition(null, null, AudienceKeys.Companion.getConditionType(str) != null ? ConditionsType.BACKEND : ConditionsType.LOCAL, new Comparison(str2, obj), false, 19, null);
        condition.setEventCode(str);
        return condition;
    }

    private final List<Condition> defineCondition(String str, JSONObject jSONObject, String str2) throws JSONException {
        ArrayList arrayList = new ArrayList();
        if (jSONObject.length() == 1 && !jSONObject.isNull("code")) {
            String value = jSONObject.getString("code");
            String value2 = AbTestsConditions.EQUALS.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "value");
            Condition conditionCreateCondition = createCondition(str, value2, value);
            conditionCreateCondition.getSearchPath().add("code");
            arrayList.add(conditionCreateCondition);
            return arrayList;
        }
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "eventCondition.keys()");
        while (itKeys.hasNext()) {
            String key = itKeys.next();
            if (!key.equals("code") && !key.equals("type")) {
                AbTestsConditions.Companion companion = AbTestsConditions.Companion;
                Intrinsics.checkNotNullExpressionValue(key, "key");
                if (companion.contains(key) != null) {
                    Object value3 = jSONObject.get(key);
                    Intrinsics.checkNotNullExpressionValue(value3, "value");
                    arrayList.add(createCondition(str, key, value3));
                } else {
                    Object obj = jSONObject.get(key);
                    if (obj instanceof JSONObject) {
                        arrayList.addAll(defineCondition(str, (JSONObject) obj, key));
                    } else if (obj instanceof Boolean) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.accumulate(AbTestsConditions.BOOLEAN.getValue(), obj);
                        arrayList.addAll(defineCondition(str, jSONObject2, key));
                    }
                }
            }
        }
        if (str2 != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj2 = arrayList.get(i10);
                i10++;
                ((Condition) obj2).getSearchPath().add(str2);
            }
        }
        return arrayList;
    }

    private final List<Condition> parseConditionsParamFromBackend(JSONArray jSONArray) {
        String code;
        ArrayList arrayList = new ArrayList();
        try {
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                Object obj = jSONArray.get(i10);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.isNull("code")) {
                    if (jSONObject.isNull("type")) {
                        Logger.error$default(Logger.INSTANCE, "not supported condition object!", null, 2, null);
                    } else {
                        code = jSONObject.getString("type");
                    }
                } else {
                    code = jSONObject.getString("code");
                }
                Intrinsics.checkNotNullExpressionValue(code, "code");
                for (Condition condition : defineCondition(code, jSONObject, null)) {
                    if (!condition.getSearchPath().isEmpty()) {
                        CollectionsKt.reverse(condition.getSearchPath());
                        arrayList.add(condition);
                    }
                }
            }
            return arrayList;
        } catch (Exception e10) {
            Logger.INSTANCE.error("parseConditionsParam ", e10);
            return arrayList;
        }
    }

    private final ExcludeEvents parseExcludedEvents(JSONObject jSONObject) throws JSONException {
        if (jSONObject.isNull(EXCLUDE)) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(EXCLUDE);
        long j10 = jSONObject2.getLong("version");
        HashMap map = new HashMap();
        if (jSONObject2.isNull(EXCLUDE_EVENTS)) {
            return new ExcludeEvents(Long.valueOf(j10), null, null, 2, null);
        }
        JSONObject jSONObject3 = jSONObject2.getJSONObject(EXCLUDE_EVENTS);
        Iterator<String> itKeys = jSONObject3.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "it.keys()");
        while (itKeys.hasNext()) {
            String key = itKeys.next();
            JSONArray jSONArray = jSONObject3.getJSONArray(key);
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                Object obj = jSONArray.get(i10);
                Intrinsics.checkNotNullExpressionValue(obj, "eventsArray.get(i)");
                arrayList.add(obj);
            }
            Intrinsics.checkNotNullExpressionValue(key, "key");
            map.put(key, arrayList);
        }
        return new ExcludeEvents(Long.valueOf(j10), null, map, 2, null);
    }

    private final List<AbTestsExperiment> parseExperiments(JSONArray jSONArray) {
        int i10;
        int i11;
        ArrayList arrayList = new ArrayList();
        try {
            int length = jSONArray.length();
            int i12 = 0;
            while (i12 < length) {
                AbTestsExperiment abTestsExperiment = new AbTestsExperiment(0L, 0L, 0L, 0L, 0L, 0L, false, null, null, 511, null);
                Object obj = jSONArray.get(i12);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) obj;
                Iterator<String> itKeys = jSONObject.keys();
                Intrinsics.checkNotNullExpressionValue(itKeys, "experimentJSON).keys()");
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (next != null) {
                        switch (next.hashCode()) {
                            case -2002224762:
                                i10 = length;
                                i11 = i12;
                                if (next.equals("isTesting")) {
                                    abTestsExperiment.setTesting(jSONObject.getBoolean("isTesting"));
                                }
                                length = i10;
                                i12 = i11;
                                break;
                            case -930859336:
                                i10 = length;
                                i11 = i12;
                                if (next.equals("conditions")) {
                                    JSONArray jSONArray2 = jSONObject.getJSONArray("conditions");
                                    Intrinsics.checkNotNullExpressionValue(jSONArray2, "experimentJSON.getJSONArray(CONDITIONS)");
                                    abTestsExperiment.setConditions(parseConditionsParamFromBackend(jSONArray2));
                                }
                                length = i10;
                                i12 = i11;
                                break;
                            case -296415209:
                                i10 = length;
                                i11 = i12;
                                if (next.equals("updateDate")) {
                                    abTestsExperiment.setUpdateDate(jSONObject.getLong("updateDate"));
                                }
                                length = i10;
                                i12 = i11;
                                break;
                            case 3355:
                                i10 = length;
                                i11 = i12;
                                if (next.equals("id")) {
                                    abTestsExperiment.setExperimentId(jSONObject.getLong("id"));
                                }
                                length = i10;
                                i12 = i11;
                                break;
                            case 458736106:
                                i10 = length;
                                i11 = i12;
                                if (next.equals("parameters")) {
                                    JSONArray jSONArray3 = jSONObject.getJSONArray("parameters");
                                    Intrinsics.checkNotNullExpressionValue(jSONArray3, "experimentJSON.getJSONArray(PARAMETERS)");
                                    abTestsExperiment.setParameters(parseExperimentsParam$DTDAnalytics_androidRelease(jSONArray3));
                                }
                                length = i10;
                                i12 = i11;
                                break;
                            case 1146157482:
                                i10 = length;
                                i11 = i12;
                                if (next.equals("completionDate")) {
                                    abTestsExperiment.setCompletionDate(jSONObject.getLong("completionDate"));
                                }
                                length = i10;
                                i12 = i11;
                                break;
                            case 1585531693:
                                if (next.equals("creationDate")) {
                                    i10 = length;
                                    i11 = i12;
                                    abTestsExperiment.setCreationDate(jSONObject.getLong("creationDate"));
                                    length = i10;
                                    i12 = i11;
                                }
                                break;
                        }
                    }
                }
                int i13 = length;
                int i14 = i12;
                arrayList.add(abTestsExperiment);
                i12 = i14 + 1;
                length = i13;
            }
            return arrayList;
        } catch (Exception e10) {
            Logger.INSTANCE.error("parseExperiments ", e10);
            return arrayList;
        }
    }

    private final UserIdentifications parseIdentification(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "jsonObject.keys()");
        while (itKeys.hasNext()) {
            String key = itKeys.next();
            if (key != null) {
                int iHashCode = key.hashCode();
                if (iHashCode != -1998041920) {
                    if (iHashCode != 1621139955) {
                        if (iHashCode == 2071811126 && key.equals("devtodevIdTimestamp")) {
                            Intrinsics.checkNotNullExpressionValue(key, "key");
                            map.put(key, Long.valueOf(jSONObject.getLong(key)));
                        }
                    } else if (key.equals("crossPlatformDevtodevId")) {
                        Intrinsics.checkNotNullExpressionValue(key, "key");
                        map.put(key, Long.valueOf(jSONObject.getLong(key)));
                    }
                } else if (key.equals("devtodevId")) {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    map.put(key, Long.valueOf(jSONObject.getLong(key)));
                }
            }
        }
        Object obj = map.get("devtodevId");
        Object obj2 = null;
        if (obj == null) {
            obj = null;
        }
        Long l10 = (Long) obj;
        Object obj3 = map.get("crossPlatformDevtodevId");
        if (obj3 == null) {
            obj3 = null;
        }
        Long l11 = (Long) obj3;
        Object obj4 = map.get("devtodevIdTimestamp");
        if (obj4 != null) {
            obj2 = obj4;
        }
        return new UserIdentifications(l10, l11, (Long) obj2);
    }

    private final List<InvolvedExperiment> parseInvolvedExperiments(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = jSONArray.get(i10);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONObject");
            JSONObject jSONObject = (JSONObject) obj;
            if (!jSONObject.isNull("id") && !jSONObject.isNull("group")) {
                long j10 = jSONObject.getLong("id");
                String group = jSONObject.getString("group");
                Intrinsics.checkNotNullExpressionValue(group, "group");
                arrayList.add(new InvolvedExperiment(j10, group));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final UserData parseUserData(String str) {
        JSONObject jSONObject = new JSONObject(str);
        UserData userData = new UserData(null, null, null, null, null, null, null, null, null, null, null, r.f265987x3, null);
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "jsonObject.keys()");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (next != null) {
                switch (next.hashCode()) {
                    case -1301575829:
                        if (next.equals(SUBSCRIPTIONS_PAYMENTS_COUNT)) {
                            userData.setSbsPaymentsCount(Long.valueOf(jSONObject.getLong(next)));
                        }
                        break;
                    case -1232050922:
                        if (next.equals(SUBSCRIPTION_STATUS)) {
                            userData.setSbsStatus(Long.valueOf(jSONObject.getLong(next)));
                        }
                        break;
                    case -1023203713:
                        if (next.equals(PAYMENTS_COUNT)) {
                            userData.setPaymentsCount(Long.valueOf(jSONObject.getLong(next)));
                        }
                        break;
                    case -908600409:
                        if (next.equals(SUBSCRIPTIONS_PAYMENTS_SUM)) {
                            userData.setSbsPaymentsSum(Double.valueOf(jSONObject.getDouble(next)));
                        }
                        break;
                    case -574617270:
                        if (next.equals(PAYING_CAPACITY)) {
                            userData.setPayingCapacity(Long.valueOf(jSONObject.getLong(next)));
                        }
                        break;
                    case -139919088:
                        if (next.equals("campaign")) {
                            userData.setCampaign(Long.valueOf(jSONObject.getLong(next)));
                        }
                        break;
                    case 3420091:
                        if (next.equals(PAYMENT_SUM)) {
                            userData.setPaymentsSum(Double.valueOf(jSONObject.getDouble(next)));
                        }
                        break;
                    case 272464904:
                        if (next.equals(FIRST_VERSION)) {
                            userData.setFirstVersion(jSONObject.getString(next));
                        }
                        break;
                    case 738950403:
                        if (next.equals("channel")) {
                            userData.setChannel(Long.valueOf(jSONObject.getLong(next)));
                        }
                        break;
                    case 1028554472:
                        if (next.equals(CREATED)) {
                            userData.setCreated(Long.valueOf(jSONObject.getLong(next)));
                        }
                        break;
                    case 1845246347:
                        if (next.equals(IS_NEW_USER)) {
                            userData.setNewUser(Boolean.valueOf(jSONObject.getBoolean(next)));
                        }
                        break;
                }
            }
        }
        return userData;
    }

    private final BackendUserDataRetry searchRetryData(String str) {
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.isNull(IDENTIFICATION_RETRY)) {
            return null;
        }
        return new BackendUserDataRetry(jSONObject.getLong(IDENTIFICATION_RETRY));
    }

    @Override // com.devtodev.analytics.internal.backend.repository.IJsonParser
    @NotNull
    public AbTestOffer parseAbTestOffer(@NotNull String json) {
        Intrinsics.checkNotNullParameter(json, "json");
        try {
            InvolvedExperiments involvedExperiments = new InvolvedExperiments();
            JSONObject jSONObject = new JSONObject(json);
            Iterator<String> itKeys = jSONObject.keys();
            Intrinsics.checkNotNullExpressionValue(itKeys, "jsonObject.keys()");
            while (itKeys.hasNext()) {
                if (Intrinsics.areEqual(itKeys.next(), INVOLVED_EXPERIMENTS)) {
                    List<InvolvedExperiment> mutableList = CollectionsKt.toMutableList((Collection) involvedExperiments.getInvolvedExperiments());
                    JSONArray jSONArray = jSONObject.getJSONArray(INVOLVED_EXPERIMENTS);
                    Intrinsics.checkNotNullExpressionValue(jSONArray, "jsonObject.getJSONArray(INVOLVED_EXPERIMENTS)");
                    mutableList.addAll(parseInvolvedExperiments(jSONArray));
                    involvedExperiments.setInvolvedExperiments(mutableList);
                }
            }
            return involvedExperiments;
        } catch (Exception e10) {
            Logger.INSTANCE.error(json, e10);
            return RemoteOfferJsonError.INSTANCE;
        }
    }

    @Override // com.devtodev.analytics.internal.backend.repository.IJsonParser
    @NotNull
    public BackendUserData parseBackendUserData(@NotNull String json) {
        Intrinsics.checkNotNullParameter(json, "json");
        try {
            if (Intrinsics.areEqual(json, "")) {
                return BackendUserDataJsonError.INSTANCE;
            }
            BackendUserDataRetry backendUserDataRetrySearchRetryData = searchRetryData(json);
            return backendUserDataRetrySearchRetryData != null ? backendUserDataRetrySearchRetryData : new SummaryBackendData(parseIdentification(json), parseUserData(json));
        } catch (Exception e10) {
            Logger.INSTANCE.error("Can't parse response data. Error: " + json, e10);
            return BackendUserDataJsonError.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0096  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c6  */
    @NotNull
    public final List<Condition> parseConditionsParamFromBase$DTDAnalytics_androidRelease(@NotNull JSONArray jSONArray) {
        ConditionsType conditionsType;
        Comparison comparison;
        JSONArray params = jSONArray;
        String str = "searchPath";
        Intrinsics.checkNotNullParameter(params, "params");
        ArrayList arrayList = new ArrayList();
        try {
            int length = params.length();
            int i10 = 0;
            while (i10 < length) {
                ArrayList arrayList2 = new ArrayList();
                Object obj = params.get(i10);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) obj;
                String string = !jSONObject.isNull("code") ? jSONObject.getString("code") : null;
                if (!jSONObject.isNull(str)) {
                    JSONArray jSONArray2 = jSONObject.getJSONArray(str);
                    int length2 = jSONArray2.length();
                    int i11 = 0;
                    while (i11 < length2) {
                        if (jSONArray2.get(i11) instanceof String) {
                            Object obj2 = jSONArray2.get(i11);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                            arrayList2.add((String) obj2);
                        }
                        i11++;
                        str = str;
                    }
                }
                String str2 = str;
                if (jSONObject.isNull("conditionsType")) {
                    conditionsType = null;
                } else {
                    String conditionsTypeStr = jSONObject.getString("conditionsType");
                    ConditionsType.Companion companion = ConditionsType.Companion;
                    Intrinsics.checkNotNullExpressionValue(conditionsTypeStr, "conditionsTypeStr");
                    ConditionsType conditionType = companion.getConditionType(conditionsTypeStr);
                    if (conditionType != null) {
                        conditionsType = conditionType;
                    } else {
                        conditionsType = null;
                    }
                }
                if (jSONObject.isNull("comparison")) {
                    comparison = null;
                } else {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("comparison");
                    if (jSONObject2.isNull(KEY) || jSONObject2.isNull("value")) {
                        comparison = null;
                    } else {
                        String string2 = jSONObject2.getString(KEY);
                        Intrinsics.checkNotNullExpressionValue(string2, "conditionJson.getString(\"key\")");
                        String string3 = jSONObject2.getString("value");
                        Intrinsics.checkNotNullExpressionValue(string3, "conditionJson.getString(\"value\")");
                        comparison = new Comparison(string2, string3);
                    }
                }
                if (string != null && comparison != null && conditionsType != null && !arrayList2.isEmpty()) {
                    arrayList.add(new Condition(string, arrayList2, conditionsType, comparison, false, 16, null));
                }
                i10++;
                params = jSONArray;
                str = str2;
            }
            return arrayList;
        } catch (Exception e10) {
            Logger.INSTANCE.error("parseConditionsParam ", e10);
            return arrayList;
        }
    }

    @Override // com.devtodev.analytics.internal.backend.repository.IJsonParser
    @NotNull
    public BackendConfig parseConfig(@NotNull String json) {
        BackendUserProperties backendUserProperties;
        Intrinsics.checkNotNullParameter(json, "json");
        try {
            JSONObject jSONObject = new JSONObject(json);
            ExcludeEvents excludedEvents = parseExcludedEvents(jSONObject);
            long j10 = jSONObject.getLong(TIMER_FOR_REQUEST);
            int i10 = jSONObject.getInt(COUNT_FOR_REQUEST);
            int i11 = jSONObject.getInt(EVENT_PARAMS_COUNT);
            long j11 = jSONObject.getLong(SESSION_TIMEOUT);
            long j12 = jSONObject.isNull(DEVTODEV_ID_TIMEOUT) ? 86400000L : jSONObject.getLong(DEVTODEV_ID_TIMEOUT);
            long j13 = jSONObject.getLong(SERVER_TIME);
            long j14 = jSONObject.getLong(ALIVE_TIMEOUT);
            boolean z10 = jSONObject.getBoolean(USER_COUNTING);
            if (jSONObject.isNull(AbTestProjectEntry.userProperties)) {
                backendUserProperties = null;
            } else {
                String string = jSONObject.getJSONObject(AbTestProjectEntry.userProperties).getString("country");
                Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getJSONObject…RTIES).getString(COUNTRY)");
                backendUserProperties = new BackendUserProperties(string);
            }
            ConfigEntry configEntry = new ConfigEntry(j10, i10, i11, j11, j12, j13, j14, z10, jSONObject.isNull(CURRENCY_AGGREGATION_TIMEOUT) ? 3600000L : jSONObject.getLong(CURRENCY_AGGREGATION_TIMEOUT), jSONObject.isNull(NUMBER_OF_CURRENCIES) ? 1000L : jSONObject.getLong(NUMBER_OF_CURRENCIES), jSONObject.isNull(USER_CARD_KEYS_COUNT) ? 60L : jSONObject.getLong(USER_CARD_KEYS_COUNT), null, backendUserProperties, jSONObject.isNull(SBS_CONFIG_VERSION) ? 0L : jSONObject.getLong(SBS_CONFIG_VERSION), 2048, null);
            if (excludedEvents == null) {
                return configEntry;
            }
            configEntry.setExclude(excludedEvents);
            return configEntry;
        } catch (Exception e10) {
            Logger.INSTANCE.error("Can't parse response data. Error: " + json, e10);
            return ConfigJsonError.INSTANCE;
        }
    }

    @NotNull
    public final List<Parameter> parseExperimentsParam$DTDAnalytics_androidRelease(@NotNull JSONArray params) {
        Intrinsics.checkNotNullParameter(params, "params");
        ArrayList arrayList = new ArrayList();
        try {
            int length = params.length();
            for (int i10 = 0; i10 < length; i10++) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Object obj = params.get(i10);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) obj;
                Iterator<String> itKeys = jSONObject.keys();
                Intrinsics.checkNotNullExpressionValue(itKeys, "paramsJSON).keys()");
                String string = null;
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (Intrinsics.areEqual(next, KEY)) {
                        string = jSONObject.getString(KEY);
                    } else if (Intrinsics.areEqual(next, "values")) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("values");
                        Iterator<String> itKeys2 = jSONObject2.keys();
                        Intrinsics.checkNotNullExpressionValue(itKeys2, "valuesJson.keys()");
                        while (itKeys2.hasNext()) {
                            String value = itKeys2.next();
                            Intrinsics.checkNotNullExpressionValue(value, "value");
                            Object obj2 = jSONObject2.get(value);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                            linkedHashMap.put(value, (String) obj2);
                        }
                    }
                }
                if (string != null && !linkedHashMap.isEmpty()) {
                    arrayList.add(new Parameter(string, linkedHashMap));
                }
            }
            return arrayList;
        } catch (Exception e10) {
            Logger.INSTANCE.error("parseExperimentsParam ", e10);
            return arrayList;
        }
    }

    @Override // com.devtodev.analytics.internal.backend.repository.IJsonParser
    @NotNull
    public RemoteConfigSealedClass parseRemoteConfig(@NotNull String json) {
        Intrinsics.checkNotNullParameter(json, "json");
        try {
            RemoteConfig remoteConfig = new RemoteConfig();
            JSONObject jSONObject = new JSONObject(json);
            Iterator<String> itKeys = jSONObject.keys();
            Intrinsics.checkNotNullExpressionValue(itKeys, "jsonObject.keys()");
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next != null) {
                    int iHashCode = next.hashCode();
                    if (iHashCode != -171551906) {
                        if (iHashCode != 351608024) {
                            if (iHashCode == 1649517590 && next.equals(EXPERIMENTS)) {
                                JSONArray jSONArray = jSONObject.getJSONArray(EXPERIMENTS);
                                Intrinsics.checkNotNullExpressionValue(jSONArray, "jsonObject.getJSONArray(EXPERIMENTS)");
                                remoteConfig.setAbExperiments(parseExperiments(jSONArray));
                            }
                        } else if (next.equals("version")) {
                            remoteConfig.setVersion(jSONObject.getLong("version"));
                        }
                    } else if (next.equals(AbTestProjectEntry.userProperties)) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject(AbTestProjectEntry.userProperties);
                        if (!jSONObject2.isNull("country")) {
                            remoteConfig.setUserProperties(new UserProperties(jSONObject2.getString("country")));
                        }
                    }
                }
            }
            return remoteConfig;
        } catch (Exception e10) {
            Logger.INSTANCE.error(json, e10);
            return RemoteConfigJsonError.INSTANCE;
        }
    }
}
