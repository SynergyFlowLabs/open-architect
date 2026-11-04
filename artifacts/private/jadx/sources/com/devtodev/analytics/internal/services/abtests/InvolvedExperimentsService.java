package com.devtodev.analytics.internal.services.abtests;

import com.devtodev.analytics.internal.domain.DbModel;
import com.devtodev.analytics.internal.domain.Project;
import com.devtodev.analytics.internal.domain.User;
import com.devtodev.analytics.internal.domain.events.abTests.AbTestsExperiment;
import com.devtodev.analytics.internal.domain.events.abTests.AbTestsExperimentState;
import com.devtodev.analytics.internal.domain.events.abTests.ExperimentMarker;
import com.devtodev.analytics.internal.helpfultools.ABTestInitialData;
import com.devtodev.analytics.internal.managers.IStateManager;
import com.devtodev.analytics.internal.storage.EventParam;
import com.devtodev.analytics.internal.storage.IRepository;
import com.devtodev.analytics.internal.storage.sqlite.SqlValue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nInvolvedExperimentsService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvolvedExperimentsService.kt\ncom/devtodev/analytics/internal/services/abtests/InvolvedExperimentsService\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,127:1\n288#2,2:128\n288#2,2:130\n288#2,2:132\n766#2:134\n857#2,2:135\n288#2,2:137\n766#2:139\n857#2,2:140\n*S KotlinDebug\n*F\n+ 1 InvolvedExperimentsService.kt\ncom/devtodev/analytics/internal/services/abtests/InvolvedExperimentsService\n*L\n55#1:128,2\n85#1:130,2\n94#1:132,2\n105#1:134\n105#1:135,2\n119#1:137,2\n125#1:139\n125#1:140,2\n*E\n"})
public final class InvolvedExperimentsService implements IInvolvedExperimentsService {

    @NotNull
    private final IRepository abTestExperimentsStateStorage;

    @NotNull
    private final IRepository abTestExperimentsStorage;

    @NotNull
    private final ABTestInitialData abTestInitialData;

    @Nullable
    private ExperimentMarker experimentMarker;
    private boolean isExperimentActivated;

    @NotNull
    private final IStateManager stateManager;

    public InvolvedExperimentsService(@NotNull IStateManager stateManager, @NotNull IRepository abTestExperimentsStorage, @NotNull IRepository abTestExperimentsStateStorage, @NotNull ABTestInitialData abTestInitialData) {
        Intrinsics.checkNotNullParameter(stateManager, "stateManager");
        Intrinsics.checkNotNullParameter(abTestExperimentsStorage, "abTestExperimentsStorage");
        Intrinsics.checkNotNullParameter(abTestExperimentsStateStorage, "abTestExperimentsStateStorage");
        Intrinsics.checkNotNullParameter(abTestInitialData, "abTestInitialData");
        this.stateManager = stateManager;
        this.abTestExperimentsStorage = abTestExperimentsStorage;
        this.abTestExperimentsStateStorage = abTestExperimentsStateStorage;
        this.abTestInitialData = abTestInitialData;
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

    private final List<AbTestsExperimentState> getExperimentStates(User user) {
        List<DbModel> all = this.abTestExperimentsStateStorage.getAll(AbTestsExperimentState.Companion.getColumnsTypes());
        Intrinsics.checkNotNull(all, "null cannot be cast to non-null type kotlin.collections.List<com.devtodev.analytics.internal.domain.events.abTests.AbTestsExperimentState>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : all) {
            if (((AbTestsExperimentState) obj).getUserId() == user.getIdKey()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final void resetSearchInvolvedExperiment() {
        AbTestsExperimentState abTestsExperimentStateSearchInvolvedExperimentState = searchInvolvedExperimentState();
        if (abTestsExperimentStateSearchInvolvedExperimentState != null) {
            abTestsExperimentStateSearchInvolvedExperimentState.setInvolvement(null);
            this.abTestExperimentsStateStorage.update(CollectionsKt.listOf(new EventParam("_id", new SqlValue.Long(abTestsExperimentStateSearchInvolvedExperimentState.getIdKey()))), abTestsExperimentStateSearchInvolvedExperimentState);
        }
    }

    private final AbTestsExperimentState searchInvolvedExperimentState() {
        Object next;
        Iterator<T> it = getExperimentStates(this.stateManager.getActiveUser()).iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((AbTestsExperimentState) next).getInvolvement() != null) {
                return (AbTestsExperimentState) next;
            }
        }
        next = null;
        return (AbTestsExperimentState) next;
    }

    @Override // com.devtodev.analytics.internal.services.abtests.IInvolvedExperimentsService
    public void activateExperimentMarker() {
        Object next;
        ExperimentMarker experimentMarker = this.experimentMarker;
        if (experimentMarker != null) {
            Iterator<T> it = getExperimentStates(this.stateManager.getActiveUser()).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((AbTestsExperimentState) next).getExperimentId() != experimentMarker.getIdKey());
            AbTestsExperimentState abTestsExperimentState = (AbTestsExperimentState) next;
            if (abTestsExperimentState != null) {
                abTestsExperimentState.setInvolvement(experimentMarker);
                this.abTestExperimentsStateStorage.update(CollectionsKt.listOf(new EventParam("_id", new SqlValue.Long(abTestsExperimentState.getIdKey()))), abTestsExperimentState);
            }
        }
    }

    @Override // com.devtodev.analytics.internal.services.abtests.IInvolvedExperimentsService
    public void cacheExperimentMarker(@Nullable ExperimentMarker experimentMarker) {
        this.experimentMarker = experimentMarker;
    }

    @Override // com.devtodev.analytics.internal.services.abtests.IInvolvedExperimentsService
    public void clearExperimentMarker() {
        this.experimentMarker = null;
        resetSearchInvolvedExperiment();
    }

    @Override // com.devtodev.analytics.internal.services.abtests.IInvolvedExperimentsService
    @Nullable
    public ExperimentMarker getCacheExperimentMarker() {
        return this.experimentMarker;
    }

    @Override // com.devtodev.analytics.internal.services.abtests.IInvolvedExperimentsService
    public boolean isActiveExperimentStarted() {
        return this.isExperimentActivated;
    }

    @Override // com.devtodev.analytics.internal.services.abtests.IInvolvedExperimentsService
    public boolean isExperimentTesting(long j10) {
        Object next;
        Iterator<T> it = getAllExperiments().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((AbTestsExperiment) next).getExperimentId() != j10);
        AbTestsExperiment abTestsExperiment = (AbTestsExperiment) next;
        if (abTestsExperiment != null) {
            return abTestsExperiment.isTesting();
        }
        return false;
    }

    @Override // com.devtodev.analytics.internal.services.abtests.IInvolvedExperimentsService
    public boolean isMarkedExperimentFound() {
        return searchInvolvedExperimentState() != null;
    }

    @Override // com.devtodev.analytics.internal.services.abtests.IInvolvedExperimentsService
    public boolean isNeedCacheTestingExperiment() {
        return this.abTestInitialData.getCacheTestExperiment();
    }

    @Override // com.devtodev.analytics.internal.services.abtests.IInvolvedExperimentsService
    public boolean isUserHasInvolvedGroup(@NotNull User user) {
        Object next;
        Intrinsics.checkNotNullParameter(user, "user");
        Iterator<T> it = getExperimentStates(user).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((AbTestsExperimentState) next).getInvolvement() == null);
        return ((AbTestsExperimentState) next) != null;
    }

    @Override // com.devtodev.analytics.internal.services.abtests.IInvolvedExperimentsService
    public void startActiveExperiment() {
        this.isExperimentActivated = true;
    }

    @Override // com.devtodev.analytics.internal.services.abtests.IInvolvedExperimentsService
    public void stopActiveExperiment() {
        this.isExperimentActivated = false;
    }

    @Override // com.devtodev.analytics.internal.services.abtests.IInvolvedExperimentsService
    @Nullable
    public ExperimentMarker tryLoadExperimentMarker() {
        if (this.experimentMarker == null) {
            AbTestsExperimentState abTestsExperimentStateSearchInvolvedExperimentState = searchInvolvedExperimentState();
            this.experimentMarker = abTestsExperimentStateSearchInvolvedExperimentState != null ? abTestsExperimentStateSearchInvolvedExperimentState.getInvolvement() : null;
        }
        return this.experimentMarker;
    }
}
