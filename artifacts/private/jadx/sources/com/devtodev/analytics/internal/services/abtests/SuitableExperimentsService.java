package com.devtodev.analytics.internal.services.abtests;

import com.devtodev.analytics.internal.backend.repository.UserData;
import com.devtodev.analytics.internal.domain.DbModel;
import com.devtodev.analytics.internal.domain.EventObject;
import com.devtodev.analytics.internal.domain.Project;
import com.devtodev.analytics.internal.domain.User;
import com.devtodev.analytics.internal.domain.events.abTests.AbTestsConditions;
import com.devtodev.analytics.internal.domain.events.abTests.AbTestsExperiment;
import com.devtodev.analytics.internal.domain.events.abTests.AbTestsExperimentState;
import com.devtodev.analytics.internal.domain.events.abTests.AudienceLocalData;
import com.devtodev.analytics.internal.domain.events.abTests.AudienceState;
import com.devtodev.analytics.internal.domain.events.abTests.Comparison;
import com.devtodev.analytics.internal.domain.events.abTests.Condition;
import com.devtodev.analytics.internal.domain.events.abTests.ConditionsType;
import com.devtodev.analytics.internal.domain.events.abTests.ExperimentsMask;
import com.devtodev.analytics.internal.domain.events.people.People;
import com.devtodev.analytics.internal.helpfultools.Version;
import com.devtodev.analytics.internal.helpfultools.VersionCompare;
import com.devtodev.analytics.internal.logger.Logger;
import com.devtodev.analytics.internal.managers.IAbTestManager;
import com.devtodev.analytics.internal.managers.IStateManager;
import com.devtodev.analytics.internal.storage.IRepository;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSuitableExperimentsService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuitableExperimentsService.kt\ncom/devtodev/analytics/internal/services/abtests/SuitableExperimentsService\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,340:1\n1855#2,2:341\n766#2:343\n857#2,2:344\n766#2:346\n857#2,2:347\n1549#2:349\n1620#2,3:350\n1855#2,2:353\n288#2,2:355\n1855#2,2:357\n1855#2,2:359\n*S KotlinDebug\n*F\n+ 1 SuitableExperimentsService.kt\ncom/devtodev/analytics/internal/services/abtests/SuitableExperimentsService\n*L\n64#1:341,2\n114#1:343\n114#1:344,2\n123#1:346\n123#1:347,2\n128#1:349\n128#1:350,3\n136#1:353,2\n182#1:355,2\n217#1:357,2\n312#1:359,2\n*E\n"})
public final class SuitableExperimentsService implements ISuitableExperimentsService {

    @NotNull
    private final IRepository abTestExperimentsStateStorage;

    @NotNull
    private final IRepository abTestExperimentsStorage;

    @NotNull
    private final IAbTestManager abTestManager;

    @Nullable
    private AudienceState audienceState;

    @NotNull
    private List<ExperimentsMask> experimentsMask;

    @NotNull
    private final IStateManager stateManager;

    @NotNull
    private List<Long> temporaryProcessedExperiments;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConditionsType.values().length];
            try {
                iArr[ConditionsType.BACKEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ConditionsType.LOCAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SuitableExperimentsService(@NotNull IRepository abTestExperimentsStorage, @NotNull IRepository abTestExperimentsStateStorage, @NotNull IStateManager stateManager, @NotNull IAbTestManager abTestManager) {
        Intrinsics.checkNotNullParameter(abTestExperimentsStorage, "abTestExperimentsStorage");
        Intrinsics.checkNotNullParameter(abTestExperimentsStateStorage, "abTestExperimentsStateStorage");
        Intrinsics.checkNotNullParameter(stateManager, "stateManager");
        Intrinsics.checkNotNullParameter(abTestManager, "abTestManager");
        this.abTestExperimentsStorage = abTestExperimentsStorage;
        this.abTestExperimentsStateStorage = abTestExperimentsStateStorage;
        this.stateManager = stateManager;
        this.abTestManager = abTestManager;
        this.experimentsMask = CollectionsKt.emptyList();
        this.temporaryProcessedExperiments = new ArrayList();
    }

    private final Long checkCurrentExperiment(EventObject eventObject, AbTestsExperiment abTestsExperiment) {
        JSONObject jSONObject = eventObject != null ? new JSONObject(eventObject.getEventJson()) : null;
        for (Condition condition : abTestsExperiment.getConditions()) {
            if (!condition.isChecked()) {
                Object objSearchCompareValue = searchCompareValue(condition, abTestsExperiment, jSONObject, eventObject != null ? eventObject.getCode() : null);
                if (objSearchCompareValue == null) {
                    return null;
                }
                Comparison comparison = condition.getComparison();
                String key = comparison.getKey();
                String string = comparison.getValue().toString();
                if (condition.getSearchPath().contains("firstVersion")) {
                    objSearchCompareValue = new Version(objSearchCompareValue.toString());
                }
                boolean zCompare = compare(key, string, objSearchCompareValue);
                if (!zCompare) {
                    return null;
                }
                if (condition.getConditionsType() == ConditionsType.BACKEND) {
                    condition.setChecked(zCompare);
                }
            }
        }
        return Long.valueOf(abTestsExperiment.getExperimentId());
    }

    private final boolean compare(String str, String str2, Object obj) {
        boolean zAreEqual = false;
        try {
            if (Intrinsics.areEqual(str, AbTestsConditions.IN.getValue())) {
                if (obj instanceof Integer) {
                    return SuitableExperimentsServiceKt.contains(new JSONArray(str2), obj);
                }
                if (obj instanceof Long) {
                    return SuitableExperimentsServiceKt.contains(new JSONArray(str2), obj);
                }
                if (obj instanceof Double) {
                    return SuitableExperimentsServiceKt.contains(new JSONArray(str2), obj);
                }
                if (obj instanceof String) {
                    return SuitableExperimentsServiceKt.contains(new JSONArray(str2), obj);
                }
                if (obj instanceof JSONArray) {
                    return SuitableExperimentsServiceKt.contains(new JSONArray(str2), obj);
                }
                if (obj instanceof Version) {
                    return SuitableExperimentsServiceKt.contains(new JSONArray(str2), obj);
                }
            } else if (Intrinsics.areEqual(str, AbTestsConditions.NOT_IN.getValue())) {
                if (obj instanceof Integer) {
                    return !SuitableExperimentsServiceKt.contains(new JSONArray(str2), obj);
                }
                if (obj instanceof Long) {
                    return !SuitableExperimentsServiceKt.contains(new JSONArray(str2), obj);
                }
                if (obj instanceof Double) {
                    return !SuitableExperimentsServiceKt.contains(new JSONArray(str2), obj);
                }
                if (obj instanceof String) {
                    return !SuitableExperimentsServiceKt.contains(new JSONArray(str2), obj);
                }
                if (obj instanceof JSONArray) {
                    return !SuitableExperimentsServiceKt.contains(new JSONArray(str2), obj);
                }
                if (obj instanceof Version) {
                    return !SuitableExperimentsServiceKt.contains(new JSONArray(str2), obj);
                }
            } else if (Intrinsics.areEqual(str, AbTestsConditions.LESS.getValue())) {
                if (obj instanceof Integer) {
                    return ((Number) obj).intValue() < Integer.parseInt(str2);
                }
                if (obj instanceof Long) {
                    return ((Number) obj).longValue() < Long.parseLong(str2);
                }
                if (obj instanceof Double) {
                    return ((Number) obj).doubleValue() < Double.parseDouble(str2);
                }
                if (obj instanceof Version) {
                    Integer numCompare = VersionCompare.Companion.compare(((Version) obj).getVersion(), str2);
                    return numCompare != null && numCompare.intValue() == -1;
                }
            } else if (Intrinsics.areEqual(str, AbTestsConditions.MORE.getValue())) {
                if (obj instanceof Integer) {
                    return ((Number) obj).intValue() > Integer.parseInt(str2);
                }
                if (obj instanceof Long) {
                    return ((Number) obj).longValue() > Long.parseLong(str2);
                }
                if (obj instanceof Double) {
                    return ((Number) obj).doubleValue() > Double.parseDouble(str2);
                }
                if (obj instanceof Version) {
                    Integer numCompare2 = VersionCompare.Companion.compare(((Version) obj).getVersion(), str2);
                    return numCompare2 != null && numCompare2.intValue() == 1;
                }
            } else if (Intrinsics.areEqual(str, AbTestsConditions.EQUALS.getValue())) {
                if (obj instanceof Integer) {
                    return Intrinsics.areEqual(obj, Integer.valueOf(Integer.parseInt(str2)));
                }
                if (obj instanceof Long) {
                    return Intrinsics.areEqual(obj, Long.valueOf(Long.parseLong(str2)));
                }
                if (obj instanceof Double) {
                    return ((Number) obj).doubleValue() == Double.parseDouble(str2);
                }
                if (obj instanceof String) {
                    return Intrinsics.areEqual(obj, str2);
                }
                if (obj instanceof Version) {
                    Integer numCompare3 = VersionCompare.Companion.compare(((Version) obj).getVersion(), str2);
                    if (numCompare3 != null && numCompare3.intValue() == 0) {
                        return true;
                    }
                    return false;
                }
            } else if (Intrinsics.areEqual(str, AbTestsConditions.NOT_EQUALS.getValue())) {
                if (obj instanceof Integer) {
                    return !Intrinsics.areEqual(obj, Integer.valueOf(Integer.parseInt(str2)));
                }
                if (obj instanceof Long) {
                    return !Intrinsics.areEqual(obj, Long.valueOf(Long.parseLong(str2)));
                }
                if (obj instanceof Double) {
                    return !(((Number) obj).doubleValue() == Double.parseDouble(str2));
                }
                if (obj instanceof String) {
                    return !Intrinsics.areEqual(obj, str2);
                }
                if (obj instanceof Version) {
                    Integer numCompare4 = VersionCompare.Companion.compare(((Version) obj).getVersion(), str2);
                    if (numCompare4 != null && numCompare4.intValue() == 0) {
                        return false;
                    }
                    return true;
                }
            } else if (Intrinsics.areEqual(str, AbTestsConditions.MORE_OR_EQUAL.getValue())) {
                if (obj instanceof Integer) {
                    return ((Number) obj).intValue() >= Integer.parseInt(str2);
                }
                if (obj instanceof Long) {
                    return ((Number) obj).longValue() >= Long.parseLong(str2);
                }
                if (obj instanceof Double) {
                    return ((Number) obj).doubleValue() >= Double.parseDouble(str2);
                }
                if (obj instanceof Version) {
                    VersionCompare.Companion companion = VersionCompare.Companion;
                    Integer numCompare5 = companion.compare(((Version) obj).getVersion(), str2);
                    if (numCompare5 == null || numCompare5.intValue() != 1) {
                        Integer numCompare6 = companion.compare(((Version) obj).getVersion(), str2);
                        if (numCompare6 != null && numCompare6.intValue() == 0) {
                        }
                        return false;
                    }
                    return true;
                }
            } else if (Intrinsics.areEqual(str, AbTestsConditions.LESS_OR_EQUAL.getValue())) {
                if (obj instanceof Integer) {
                    return ((Number) obj).intValue() <= Integer.parseInt(str2);
                }
                if (obj instanceof Long) {
                    return ((Number) obj).longValue() <= Long.parseLong(str2);
                }
                if (obj instanceof Double) {
                    return ((Number) obj).doubleValue() <= Double.parseDouble(str2);
                }
                if (obj instanceof Version) {
                    VersionCompare.Companion companion2 = VersionCompare.Companion;
                    Integer numCompare7 = companion2.compare(((Version) obj).getVersion(), str2);
                    if (numCompare7 == null || numCompare7.intValue() != -1) {
                        Integer numCompare8 = companion2.compare(((Version) obj).getVersion(), str2);
                        if (numCompare8 != null && numCompare8.intValue() == 0) {
                        }
                        return false;
                    }
                    return true;
                }
            } else if (Intrinsics.areEqual(str, AbTestsConditions.BOOLEAN.getValue()) && (obj instanceof Boolean)) {
                zAreEqual = Intrinsics.areEqual(obj, Boolean.valueOf(Boolean.parseBoolean(str2)));
            }
            return zAreEqual;
        } catch (Exception e10) {
            Logger.INSTANCE.error("compare", e10);
            return false;
        }
    }

    private final List<AbTestsExperiment> getAllExperiments() {
        Project activeProject = this.stateManager.getActiveProject();
        List<Long> experimentStateIdForActiveUser = getExperimentStateIdForActiveUser();
        List<DbModel> all = this.abTestExperimentsStorage.getAll(AbTestsExperiment.Companion.getColumnsTypes());
        Intrinsics.checkNotNull(all, "null cannot be cast to non-null type kotlin.collections.List<com.devtodev.analytics.internal.domain.events.abTests.AbTestsExperiment>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : all) {
            AbTestsExperiment abTestsExperiment = (AbTestsExperiment) obj;
            if (abTestsExperiment.getProjectId() == activeProject.getIdKey() && experimentStateIdForActiveUser.contains(Long.valueOf(abTestsExperiment.getExperimentId()))) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final List<Long> getExperimentStateIdForActiveUser() {
        User activeUser = this.stateManager.getActiveUser();
        List<DbModel> all = this.abTestExperimentsStateStorage.getAll(AbTestsExperimentState.Companion.getColumnsTypes());
        Intrinsics.checkNotNull(all, "null cannot be cast to non-null type kotlin.collections.List<com.devtodev.analytics.internal.domain.events.abTests.AbTestsExperimentState>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : all) {
            AbTestsExperimentState abTestsExperimentState = (AbTestsExperimentState) obj;
            if (abTestsExperimentState.getUserId() == activeUser.getIdKey() && abTestsExperimentState.getRunAbility() && !this.temporaryProcessedExperiments.contains(Long.valueOf(abTestsExperimentState.getExperimentId()))) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            arrayList2.add(Long.valueOf(((AbTestsExperimentState) obj2).getExperimentId()));
        }
        return arrayList2;
    }

    private final void resetCheckCondition(AbTestsExperiment abTestsExperiment, ConditionsType conditionsType) {
        for (Condition condition : abTestsExperiment.getConditions()) {
            if (condition.getConditionsType() == conditionsType) {
                boolean z10 = true | false;
                condition.setChecked(false);
            }
        }
    }

    private final Object searchAudienceValue(Condition condition) throws JSONException {
        AudienceState audienceState;
        if (condition.isChecked() || (audienceState = this.audienceState) == null) {
            return null;
        }
        JSONObject json = audienceState.getJson();
        if (!json.isNull(condition.getEventCode())) {
            Object obj = json.get(condition.getEventCode());
            if (obj instanceof JSONObject) {
                return searchFieldValue((JSONObject) obj, condition.getSearchPath());
            }
            return null;
        }
        String str = (String) CollectionsKt.firstOrNull((List) condition.getSearchPath());
        if (str == null || json.isNull(str)) {
            return null;
        }
        return json.get(str);
    }

    private final Object searchCompareValue(Condition condition, AbTestsExperiment abTestsExperiment, JSONObject jSONObject, String str) {
        Object next;
        int i10 = WhenMappings.$EnumSwitchMapping$0[condition.getConditionsType().ordinal()];
        if (i10 == 1) {
            return searchAudienceValue(condition);
        }
        if (i10 == 2 && jSONObject != null && str != null) {
            Iterator<T> it = this.experimentsMask.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((ExperimentsMask) next).getExperimentId() != abTestsExperiment.getExperimentId());
            ExperimentsMask experimentsMask = (ExperimentsMask) next;
            if (experimentsMask != null && experimentsMask.getMaskEventKeys().contains(str)) {
                return searchFieldValue(jSONObject, condition.getSearchPath());
            }
        }
        return null;
    }

    private final Object searchFieldValue(JSONObject jSONObject, List<String> list) throws JSONException {
        Object obj = jSONObject;
        for (String str : list) {
            if (!(obj instanceof JSONObject)) {
                break;
            }
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONObject");
            JSONObject jSONObject2 = (JSONObject) obj;
            if (jSONObject2.isNull(str)) {
                return null;
            }
            Object obj2 = jSONObject2.get(str);
            Intrinsics.checkNotNullExpressionValue(obj2, "jsonObj.get(key)");
            obj = obj2;
        }
        return obj;
    }

    private final void updateExperimentsMask() {
        List<AbTestsExperiment> allExperiments = getAllExperiments();
        this.experimentsMask = CollectionsKt.emptyList();
        for (AbTestsExperiment abTestsExperiment : allExperiments) {
            ExperimentsMask experimentsMask = new ExperimentsMask(abTestsExperiment.getExperimentId(), null, 2, null);
            for (Condition condition : abTestsExperiment.getConditions()) {
                if (!experimentsMask.getMaskEventKeys().contains(condition.getEventCode())) {
                    experimentsMask.getMaskEventKeys().add(condition.getEventCode());
                }
            }
            if (!experimentsMask.getMaskEventKeys().isEmpty()) {
                this.experimentsMask = SuitableExperimentsServiceKt.add(this.experimentsMask, experimentsMask);
            }
        }
    }

    @Override // com.devtodev.analytics.internal.services.abtests.ISuitableExperimentsService
    public void addSuitableExperiments(@NotNull List<Long> suitableExperiments) {
        Intrinsics.checkNotNullParameter(suitableExperiments, "suitableExperiments");
        this.abTestManager.setSuitableExperiments(suitableExperiments);
    }

    @Override // com.devtodev.analytics.internal.services.abtests.ISuitableExperimentsService
    public void clearTemporaryProcessedExperiments() {
        this.temporaryProcessedExperiments.clear();
    }

    @Override // com.devtodev.analytics.internal.services.abtests.ISuitableExperimentsService
    @NotNull
    public List<Long> getSuitableExperiments() {
        return this.abTestManager.getSuitableExperiments();
    }

    @Override // com.devtodev.analytics.internal.services.abtests.ISuitableExperimentsService
    public boolean hasActiveExperiments() {
        return !getAllExperiments().isEmpty();
    }

    @Override // com.devtodev.analytics.internal.services.abtests.ISuitableExperimentsService
    public void markAsProcessed(@NotNull List<Long> experimentIds) {
        Intrinsics.checkNotNullParameter(experimentIds, "experimentIds");
        this.temporaryProcessedExperiments.addAll(experimentIds);
        List<Long> mutableList = CollectionsKt.toMutableList((Collection) this.abTestManager.getSuitableExperiments());
        mutableList.removeAll(experimentIds);
        this.abTestManager.setSuitableExperiments(mutableList);
    }

    @Override // com.devtodev.analytics.internal.services.abtests.ISuitableExperimentsService
    public void removeAudienceCheckMarks() {
        Iterator<T> it = getAllExperiments().iterator();
        while (it.hasNext()) {
            resetCheckCondition((AbTestsExperiment) it.next(), ConditionsType.BACKEND);
        }
    }

    @Override // com.devtodev.analytics.internal.services.abtests.ISuitableExperimentsService
    public void resetAudienceState() {
        this.audienceState = null;
    }

    @Override // com.devtodev.analytics.internal.services.abtests.ISuitableExperimentsService
    @NotNull
    public List<Long> searchSuitableExperiments(@Nullable EventObject eventObject) {
        ArrayList arrayList = new ArrayList();
        for (AbTestsExperiment abTestsExperiment : getAllExperiments()) {
            if (abTestsExperiment.isTesting()) {
                arrayList.add(Long.valueOf(abTestsExperiment.getExperimentId()));
            } else if (eventObject == null) {
                Long lCheckCurrentExperiment = checkCurrentExperiment(null, abTestsExperiment);
                if (lCheckCurrentExperiment != null) {
                    arrayList.add(Long.valueOf(lCheckCurrentExperiment.longValue()));
                }
            } else {
                Long lCheckCurrentExperiment2 = checkCurrentExperiment(eventObject, abTestsExperiment);
                if (lCheckCurrentExperiment2 != null) {
                    arrayList.add(Long.valueOf(lCheckCurrentExperiment2.longValue()));
                }
            }
        }
        return arrayList;
    }

    @Override // com.devtodev.analytics.internal.services.abtests.ISuitableExperimentsService
    public void updateActiveAudienceState(@NotNull AudienceLocalData localData, @NotNull People peopleData, @Nullable UserData userData) {
        Intrinsics.checkNotNullParameter(localData, "localData");
        Intrinsics.checkNotNullParameter(peopleData, "peopleData");
        if (this.audienceState == null) {
            this.audienceState = new AudienceState();
        }
        AudienceState audienceState = this.audienceState;
        if (audienceState != null) {
            audienceState.setAudienceLocalData(localData);
        }
        AudienceState audienceState2 = this.audienceState;
        if (audienceState2 != null) {
            audienceState2.setPeopleEventData(peopleData);
        }
        AudienceState audienceState3 = this.audienceState;
        if (audienceState3 != null) {
            audienceState3.setBackendUserData(userData);
        }
        AudienceState audienceState4 = this.audienceState;
        if (audienceState4 != null) {
            audienceState4.updateLifeTime();
        }
        updateExperimentsMask();
    }
}
