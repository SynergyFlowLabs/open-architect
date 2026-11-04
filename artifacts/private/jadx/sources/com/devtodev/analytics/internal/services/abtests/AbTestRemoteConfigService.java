package com.devtodev.analytics.internal.services.abtests;

import com.devtodev.analytics.internal.backend.repository.RemoteConfig;
import com.devtodev.analytics.internal.backend.repository.UserProperties;
import com.devtodev.analytics.internal.domain.DbModel;
import com.devtodev.analytics.internal.domain.Project;
import com.devtodev.analytics.internal.domain.User;
import com.devtodev.analytics.internal.domain.events.abTests.AbTestsExperiment;
import com.devtodev.analytics.internal.domain.events.abTests.AbTestsExperimentState;
import com.devtodev.analytics.internal.domain.events.abTests.AbTestsProject;
import com.devtodev.analytics.internal.domain.events.abTests.Condition;
import com.devtodev.analytics.internal.logger.Logger;
import com.devtodev.analytics.internal.managers.IAbTestManager;
import com.devtodev.analytics.internal.managers.IStateManager;
import com.devtodev.analytics.internal.storage.EventParam;
import com.devtodev.analytics.internal.storage.IRepository;
import com.devtodev.analytics.internal.storage.sqlite.RemoverPattern;
import com.devtodev.analytics.internal.storage.sqlite.SqlValue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nRemoteConfigService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfigService.kt\ncom/devtodev/analytics/internal/services/abtests/AbTestRemoteConfigService\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,278:1\n1855#2:279\n1855#2,2:280\n1856#2:282\n1549#2:283\n1620#2,3:284\n1855#2:287\n288#2,2:288\n1856#2:290\n766#2:291\n857#2,2:292\n766#2:294\n857#2,2:295\n1549#2:297\n1620#2,3:298\n1549#2:301\n1620#2,3:302\n1855#2,2:305\n1855#2,2:307\n1549#2:309\n1620#2,3:310\n766#2:313\n857#2,2:314\n766#2:317\n857#2,2:318\n1855#2,2:320\n766#2:322\n857#2,2:323\n288#2,2:325\n288#2,2:327\n1855#2,2:329\n1855#2,2:331\n766#2:333\n857#2,2:334\n766#2:336\n857#2,2:337\n1#3:316\n*S KotlinDebug\n*F\n+ 1 RemoteConfigService.kt\ncom/devtodev/analytics/internal/services/abtests/AbTestRemoteConfigService\n*L\n68#1:279\n76#1:280,2\n68#1:282\n100#1:283\n100#1:284,3\n102#1:287\n104#1:288,2\n102#1:290\n116#1:291\n116#1:292,2\n122#1:294\n122#1:295,2\n130#1:297\n130#1:298,3\n133#1:301\n133#1:302,3\n134#1:305,2\n144#1:307,2\n150#1:309\n150#1:310,3\n154#1:313\n154#1:314,2\n160#1:317\n160#1:318,2\n161#1:320,2\n180#1:322\n180#1:323,2\n188#1:325,2\n235#1:327,2\n247#1:329,2\n257#1:331,2\n268#1:333\n268#1:334,2\n276#1:336\n276#1:337,2\n*E\n"})
public final class AbTestRemoteConfigService implements IAbTestRemoteConfigService {

    @NotNull
    private final IRepository abTestExperimentsStateStorage;

    @NotNull
    private final IRepository abTestExperimentsStorage;

    @NotNull
    private final IAbTestManager abTestManager;

    @NotNull
    private final IRepository abTestRepository;

    @NotNull
    private final IStateManager stateManager;

    public AbTestRemoteConfigService(@NotNull IStateManager stateManager, @NotNull IAbTestManager abTestManager, @NotNull IRepository abTestRepository, @NotNull IRepository abTestExperimentsStorage, @NotNull IRepository abTestExperimentsStateStorage) {
        Intrinsics.checkNotNullParameter(stateManager, "stateManager");
        Intrinsics.checkNotNullParameter(abTestManager, "abTestManager");
        Intrinsics.checkNotNullParameter(abTestRepository, "abTestRepository");
        Intrinsics.checkNotNullParameter(abTestExperimentsStorage, "abTestExperimentsStorage");
        Intrinsics.checkNotNullParameter(abTestExperimentsStateStorage, "abTestExperimentsStateStorage");
        this.stateManager = stateManager;
        this.abTestManager = abTestManager;
        this.abTestRepository = abTestRepository;
        this.abTestExperimentsStorage = abTestExperimentsStorage;
        this.abTestExperimentsStateStorage = abTestExperimentsStateStorage;
        AbTestsProject abTestsProject = getAbTestsProject();
        abTestManager.setConfigVersion(abTestsProject != null ? Long.valueOf(abTestsProject.getVersion()) : null);
    }

    private final void deleteExperiments(List<AbTestsExperiment> list) {
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new EventParam("_id", new SqlValue.Long(((AbTestsExperiment) it.next()).getIdKey())));
        }
        this.abTestExperimentsStorage.delete(list, arrayList, RemoverPattern.JEST_ONE);
    }

    private final void deleteExperimentsState(List<AbTestsExperimentState> list) {
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new EventParam("_id", new SqlValue.Long(((AbTestsExperimentState) it.next()).getIdKey())));
        }
        this.abTestExperimentsStateStorage.delete(list, arrayList, RemoverPattern.JEST_ONE);
    }

    private final AbTestsProject getAbTestsProject() {
        Object next;
        Project activeProject = this.stateManager.getActiveProject();
        List<DbModel> all = this.abTestRepository.getAll(AbTestsProject.Companion.getColumnsTypes());
        Intrinsics.checkNotNull(all, "null cannot be cast to non-null type kotlin.collections.List<com.devtodev.analytics.internal.domain.events.abTests.AbTestsProject>");
        Iterator<T> it = all.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((AbTestsProject) next).getProjectId() == activeProject.getIdKey()) {
                return (AbTestsProject) next;
            }
        }
        next = null;
        return (AbTestsProject) next;
    }

    private final List<AbTestsExperiment> getAllExperiments() {
        Project activeProject = this.stateManager.getActiveProject();
        List<DbModel> all = this.abTestExperimentsStorage.getAll(AbTestsExperiment.Companion.getColumnsTypes());
        Intrinsics.checkNotNull(all, "null cannot be cast to non-null type kotlin.collections.List<com.devtodev.analytics.internal.domain.events.abTests.AbTestsExperiment>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : all) {
            if (((AbTestsExperiment) obj).getProjectId() == activeProject.getIdKey()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final List<AbTestsExperimentState> getExperimentStatesForActiveUser() {
        User activeUser = this.stateManager.getActiveUser();
        List<DbModel> all = this.abTestExperimentsStateStorage.getAll(AbTestsExperimentState.Companion.getColumnsTypes());
        Intrinsics.checkNotNull(all, "null cannot be cast to non-null type kotlin.collections.List<com.devtodev.analytics.internal.domain.events.abTests.AbTestsExperimentState>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : all) {
            if (((AbTestsExperimentState) obj).getUserId() == activeUser.getIdKey()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final void saveExperiment(long j10, AbTestsExperiment abTestsExperiment) {
        abTestsExperiment.setProjectId(j10);
        this.abTestExperimentsStorage.insert(abTestsExperiment);
    }

    private final void saveExperimentState(long j10, long j11) {
        this.abTestExperimentsStateStorage.insert(new AbTestsExperimentState(0L, j10, j11, false, null, 25, null));
    }

    private final Long updateExperiment(AbTestsExperiment abTestsExperiment, AbTestsExperiment abTestsExperiment2) {
        boolean z10 = abTestsExperiment.isTesting() != abTestsExperiment2.isTesting() || abTestsExperiment.isTesting();
        if (abTestsExperiment.getCompletionDate() == abTestsExperiment2.getCompletionDate() && abTestsExperiment.getUpdateDate() == abTestsExperiment2.getUpdateDate() && !z10) {
            return null;
        }
        Long lValueOf = (abTestsExperiment.getUpdateDate() != abTestsExperiment2.getUpdateDate() || z10) ? Long.valueOf(abTestsExperiment.getExperimentId()) : null;
        abTestsExperiment.setCompletionDate(abTestsExperiment2.getCompletionDate());
        abTestsExperiment.setUpdateDate(abTestsExperiment2.getUpdateDate());
        abTestsExperiment.setConditions(abTestsExperiment2.getConditions());
        abTestsExperiment.setParameters(abTestsExperiment2.getParameters());
        abTestsExperiment.setTesting(abTestsExperiment2.isTesting());
        this.abTestExperimentsStorage.update(CollectionsKt.listOf(new EventParam("_id", new SqlValue.Long(abTestsExperiment.getIdKey()))), abTestsExperiment);
        return lValueOf;
    }

    private final void updateExperimentState(long j10) {
        Object next;
        Iterator<T> it = getExperimentStatesForActiveUser().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((AbTestsExperimentState) next).getExperimentId() != j10);
        AbTestsExperimentState abTestsExperimentState = (AbTestsExperimentState) next;
        if (abTestsExperimentState != null) {
            abTestsExperimentState.setRunAbility(true);
            this.abTestExperimentsStateStorage.update(CollectionsKt.listOf(new EventParam("_id", new SqlValue.Long(abTestsExperimentState.getIdKey()))), abTestsExperimentState);
        }
    }

    @Override // com.devtodev.analytics.internal.services.abtests.IAbTestRemoteConfigService
    public void applyExperiments(@NotNull List<AbTestsExperiment> remoteExperiments) {
        Object next;
        Intrinsics.checkNotNullParameter(remoteExperiments, "remoteExperiments");
        Project activeProject = this.stateManager.getActiveProject();
        User activeUser = this.stateManager.getActiveUser();
        List<AbTestsExperiment> allExperiments = getAllExperiments();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(allExperiments, 10));
        Iterator<T> it = allExperiments.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((AbTestsExperiment) it.next()).getExperimentId()));
        }
        List mutableList = CollectionsKt.toMutableList((Collection) arrayList);
        for (AbTestsExperiment abTestsExperiment : remoteExperiments) {
            mutableList.remove(Long.valueOf(abTestsExperiment.getExperimentId()));
            Iterator<T> it2 = allExperiments.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (((AbTestsExperiment) next).getExperimentId() != abTestsExperiment.getExperimentId());
            AbTestsExperiment abTestsExperiment2 = (AbTestsExperiment) next;
            if (abTestsExperiment2 != null) {
                Long lUpdateExperiment = updateExperiment(abTestsExperiment2, abTestsExperiment);
                if (lUpdateExperiment != null) {
                    updateExperimentState(lUpdateExperiment.longValue());
                }
            } else {
                saveExperiment(activeProject.getIdKey(), abTestsExperiment);
                saveExperimentState(activeUser.getIdKey(), abTestsExperiment.getExperimentId());
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : allExperiments) {
            if (mutableList.contains(Long.valueOf(((AbTestsExperiment) obj).getExperimentId()))) {
                arrayList2.add(obj);
            }
        }
        deleteExperiments(arrayList2);
        List<DbModel> all = this.abTestExperimentsStateStorage.getAll(AbTestsExperimentState.Companion.getColumnsTypes());
        Intrinsics.checkNotNull(all, "null cannot be cast to non-null type kotlin.collections.List<com.devtodev.analytics.internal.domain.events.abTests.AbTestsExperimentState>");
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : all) {
            if (mutableList.contains(Long.valueOf(((AbTestsExperimentState) obj2).getExperimentId()))) {
                arrayList3.add(obj2);
            }
        }
        deleteExperimentsState(arrayList3);
    }

    @Override // com.devtodev.analytics.internal.services.abtests.IAbTestRemoteConfigService
    public void applyRemoteConfig(@NotNull RemoteConfig remoteConfig) {
        Intrinsics.checkNotNullParameter(remoteConfig, "remoteConfig");
        Project activeProject = this.stateManager.getActiveProject();
        AbTestsProject abTestsProject = getAbTestsProject();
        if (abTestsProject != null) {
            abTestsProject.setUserProperties(remoteConfig.getUserProperties());
            abTestsProject.setVersion(remoteConfig.getVersion());
            this.abTestRepository.update(CollectionsKt.listOf(new EventParam("_id", new SqlValue.Long(activeProject.getIdKey()))), abTestsProject);
        } else {
            this.abTestRepository.insert(new AbTestsProject(0L, activeProject.getIdKey(), remoteConfig.getVersion(), remoteConfig.getUserProperties(), 1, null));
        }
        this.abTestManager.setConfigVersion(Long.valueOf(remoteConfig.getVersion()));
        StringBuffer stringBuffer = new StringBuffer();
        for (AbTestsExperiment abTestsExperiment : remoteConfig.getAbExperiments()) {
            stringBuffer.append("\t\t [experimentId: " + abTestsExperiment.getExperimentId() + "\n\t\t updateDate: " + abTestsExperiment.getUpdateDate() + "\n\t\t creationDate: " + abTestsExperiment.getCreationDate() + "\n\t\t completionDate: " + abTestsExperiment.getCompletionDate() + "\n\t\t conditions:");
            for (Condition condition : abTestsExperiment.getConditions()) {
                String eventCode = condition.getEventCode();
                String str = (String) CollectionsKt.lastOrNull((List) condition.getSearchPath());
                if (str == null) {
                    str = "";
                }
                stringBuffer.append("\n\t\t\t[eventCode: " + eventCode + "\n\t\t\tcondition: " + str + " " + condition.getComparison().getKey() + " " + condition.getComparison().getValue() + "]");
            }
            stringBuffer.append("]\n");
        }
        Logger.debug$default(Logger.INSTANCE, "[A/B-Test Module] For user [" + this.stateManager.getActiveUser().getUserId() + "] the remote configuration has been received:\n\tcurrent config version: " + remoteConfig.getVersion() + "\n\texpriments:\n" + ((Object) stringBuffer), null, 2, null);
    }

    @Override // com.devtodev.analytics.internal.services.abtests.IAbTestRemoteConfigService
    public void createExperimentState() {
        User activeUser = this.stateManager.getActiveUser();
        List<AbTestsExperimentState> experimentStatesForActiveUser = getExperimentStatesForActiveUser();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(experimentStatesForActiveUser, 10));
        Iterator<T> it = experimentStatesForActiveUser.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((AbTestsExperimentState) it.next()).getExperimentId()));
        }
        List<AbTestsExperiment> allExperiments = getAllExperiments();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(allExperiments, 10));
        Iterator<T> it2 = allExperiments.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Long.valueOf(((AbTestsExperiment) it2.next()).getExperimentId()));
        }
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            long jLongValue = ((Number) obj).longValue();
            if (!arrayList.contains(Long.valueOf(jLongValue))) {
                saveExperimentState(activeUser.getIdKey(), jLongValue);
            }
        }
    }

    @Override // com.devtodev.analytics.internal.services.abtests.IAbTestRemoteConfigService
    public void deleteExpiredExperiments() {
        ArrayList arrayList = new ArrayList();
        for (AbTestsExperiment abTestsExperiment : getAllExperiments()) {
            if (System.currentTimeMillis() >= abTestsExperiment.getCompletionDate() && abTestsExperiment.getCompletionDate() != 0) {
                arrayList.add(abTestsExperiment);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            arrayList2.add(Long.valueOf(((AbTestsExperiment) obj).getExperimentId()));
        }
        deleteExperiments(arrayList);
        List<DbModel> all = this.abTestExperimentsStateStorage.getAll(AbTestsExperimentState.Companion.getColumnsTypes());
        Intrinsics.checkNotNull(all, "null cannot be cast to non-null type kotlin.collections.List<com.devtodev.analytics.internal.domain.events.abTests.AbTestsExperimentState>");
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : all) {
            if (arrayList2.contains(Long.valueOf(((AbTestsExperimentState) obj2).getExperimentId()))) {
                arrayList3.add(obj2);
            }
        }
        deleteExperimentsState(arrayList3);
    }

    @Override // com.devtodev.analytics.internal.services.abtests.IAbTestRemoteConfigService
    public void deleteInactiveExperimentsState(@NotNull List<Long> userIds) {
        Intrinsics.checkNotNullParameter(userIds, "userIds");
        if (userIds.isEmpty()) {
            return;
        }
        List<DbModel> all = this.abTestExperimentsStateStorage.getAll(AbTestsExperimentState.Companion.getColumnsTypes());
        Intrinsics.checkNotNull(all, "null cannot be cast to non-null type kotlin.collections.List<com.devtodev.analytics.internal.domain.events.abTests.AbTestsExperimentState>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : all) {
            if (userIds.contains(Long.valueOf(((AbTestsExperimentState) obj).getUserId()))) {
                arrayList.add(obj);
            }
        }
        deleteExperimentsState(arrayList);
    }

    @Override // com.devtodev.analytics.internal.services.abtests.IAbTestRemoteConfigService
    @Nullable
    public Long getAbTestsProjectVersion() {
        AbTestsProject abTestsProject = getAbTestsProject();
        if (abTestsProject != null) {
            return Long.valueOf(abTestsProject.getVersion());
        }
        return null;
    }

    @Override // com.devtodev.analytics.internal.services.abtests.IAbTestRemoteConfigService
    @Nullable
    public UserProperties getUserProperties() {
        AbTestsProject abTestsProject = getAbTestsProject();
        if (abTestsProject != null) {
            return abTestsProject.getUserProperties();
        }
        return null;
    }

    @Override // com.devtodev.analytics.internal.services.abtests.IAbTestRemoteConfigService
    public void markAsRefused(@NotNull List<Long> experimentIds) {
        Intrinsics.checkNotNullParameter(experimentIds, "experimentIds");
        List<AbTestsExperimentState> experimentStatesForActiveUser = getExperimentStatesForActiveUser();
        ArrayList arrayList = new ArrayList();
        for (Object obj : experimentStatesForActiveUser) {
            if (experimentIds.contains(Long.valueOf(((AbTestsExperimentState) obj).getExperimentId()))) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            AbTestsExperimentState abTestsExperimentState = (AbTestsExperimentState) obj2;
            abTestsExperimentState.setRunAbility(false);
            this.abTestExperimentsStateStorage.update(CollectionsKt.listOf(new EventParam("_id", new SqlValue.Long(abTestsExperimentState.getIdKey()))), abTestsExperimentState);
        }
        List<Long> mutableList = CollectionsKt.toMutableList((Collection) this.abTestManager.getSuitableExperiments());
        mutableList.removeAll(experimentIds);
        this.abTestManager.setSuitableExperiments(mutableList);
    }
}
