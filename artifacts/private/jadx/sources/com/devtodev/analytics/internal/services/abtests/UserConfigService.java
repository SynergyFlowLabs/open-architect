package com.devtodev.analytics.internal.services.abtests;

import com.devtodev.analytics.internal.backend.repository.Parameter;
import com.devtodev.analytics.internal.domain.DbModel;
import com.devtodev.analytics.internal.domain.Project;
import com.devtodev.analytics.internal.domain.events.abTests.AbTestsExperiment;
import com.devtodev.analytics.internal.domain.events.abTests.ExperimentMarker;
import com.devtodev.analytics.internal.helpfultools.ABTestDefaultParamsCache;
import com.devtodev.analytics.internal.logger.Logger;
import com.devtodev.analytics.internal.managers.IAbTestManager;
import com.devtodev.analytics.internal.managers.IStateManager;
import com.devtodev.analytics.internal.storage.IRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nUserConfigService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserConfigService.kt\ncom/devtodev/analytics/internal/services/abtests/UserConfigService\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,81:1\n288#2,2:82\n1855#2,2:84\n766#2:86\n857#2,2:87\n*S KotlinDebug\n*F\n+ 1 UserConfigService.kt\ncom/devtodev/analytics/internal/services/abtests/UserConfigService\n*L\n35#1:82,2\n37#1:84,2\n79#1:86\n79#1:87,2\n*E\n"})
public final class UserConfigService implements IUserConfigService {

    @NotNull
    private final ABTestDefaultParamsCache abTestDefaultParamsCache;

    @NotNull
    private final IRepository abTestExperimentsStorage;

    @NotNull
    private final IAbTestManager abTestManager;

    @NotNull
    private final IStateManager stateManager;

    public UserConfigService(@NotNull IStateManager stateManager, @NotNull IAbTestManager abTestManager, @NotNull IRepository abTestExperimentsStorage, @NotNull ABTestDefaultParamsCache abTestDefaultParamsCache) {
        Intrinsics.checkNotNullParameter(stateManager, "stateManager");
        Intrinsics.checkNotNullParameter(abTestManager, "abTestManager");
        Intrinsics.checkNotNullParameter(abTestExperimentsStorage, "abTestExperimentsStorage");
        Intrinsics.checkNotNullParameter(abTestDefaultParamsCache, "abTestDefaultParamsCache");
        this.stateManager = stateManager;
        this.abTestManager = abTestManager;
        this.abTestExperimentsStorage = abTestExperimentsStorage;
        this.abTestDefaultParamsCache = abTestDefaultParamsCache;
    }

    private final Object castValue(Object obj, String str) {
        if (obj instanceof Boolean) {
            return StringsKt.D5(str);
        }
        if (obj instanceof Integer) {
            return StringsKt.toIntOrNull(str);
        }
        if (obj instanceof Long) {
            return StringsKt.c1(str);
        }
        if (obj instanceof Double) {
            return StringsKt.L0(str);
        }
        if (obj instanceof Float) {
            return StringsKt.N0(str);
        }
        if (obj instanceof String) {
            return str;
        }
        return null;
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

    @Override // com.devtodev.analytics.internal.services.abtests.IUserConfigService
    public void clearRemoteConfigParameters() {
        this.abTestManager.setConfig(MapsKt.emptyMap());
    }

    @Override // com.devtodev.analytics.internal.services.abtests.IUserConfigService
    @NotNull
    public Map<String, Object> getUserConfig() {
        return this.abTestManager.getConfig();
    }

    @Override // com.devtodev.analytics.internal.services.abtests.IUserConfigService
    public boolean toRemoteConfigParameters(@NotNull ExperimentMarker marker) {
        Object next;
        Intrinsics.checkNotNullParameter(marker, "marker");
        Map<String, Object> defaults = this.abTestDefaultParamsCache.getDefaults();
        if (defaults.isEmpty()) {
            Logger.error$default(Logger.INSTANCE, "[A/B-Test Module] Default parameters is empty, the start of the experiment is impossible", null, 2, null);
            return false;
        }
        Iterator<T> it = getAllExperiments().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((AbTestsExperiment) next).getExperimentId() != marker.getIdKey());
        AbTestsExperiment abTestsExperiment = (AbTestsExperiment) next;
        boolean z10 = true;
        if (abTestsExperiment != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Parameter parameter : abTestsExperiment.getParameters()) {
                Object obj = parameter.getValues().get(marker.getGroup());
                if (obj == null) {
                    obj = "";
                }
                Object obj2 = defaults.get(parameter.getKey());
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                Object objCastValue = castValue(obj2, (String) obj);
                if (objCastValue != null) {
                    linkedHashMap.put(parameter.getKey(), objCastValue);
                } else {
                    Logger.error$default(Logger.INSTANCE, "[A/B-Test Module] Remote value for the key [" + parameter.getKey() + "] can't be cast to default value type!", null, 2, null);
                    z10 = false;
                }
            }
            this.abTestManager.setConfig(linkedHashMap);
        }
        return z10;
    }
}
