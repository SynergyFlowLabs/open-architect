package com.devtodev.analytics.internal.services;

import androidx.collection.g3;
import com.devtodev.analytics.internal.domain.DbModel;
import com.devtodev.analytics.internal.domain.User;
import com.devtodev.analytics.internal.domain.events.currencyAccrual.LevelResource;
import com.devtodev.analytics.internal.domain.events.currencyAccrual.LevelResourceType;
import com.devtodev.analytics.internal.logger.Logger;
import com.devtodev.analytics.internal.managers.IStateManager;
import com.devtodev.analytics.internal.storage.EventParam;
import com.devtodev.analytics.internal.storage.IResourceRepository;
import com.devtodev.analytics.internal.storage.sqlite.LevelResourceEntry;
import com.devtodev.analytics.internal.storage.sqlite.SqlValue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nLevelResourceService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LevelResourceService.kt\ncom/devtodev/analytics/internal/services/LevelResourceService\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,127:1\n288#2,2:128\n1549#2:130\n1620#2,3:131\n766#2:134\n857#2,2:135\n*S KotlinDebug\n*F\n+ 1 LevelResourceService.kt\ncom/devtodev/analytics/internal/services/LevelResourceService\n*L\n37#1:128,2\n100#1:130\n100#1:131,3\n116#1:134\n116#1:135,2\n*E\n"})
public final class LevelResourceService implements ILevelResourceService {

    @NotNull
    private final IResourceRepository levelResourcesRepository;

    @NotNull
    private final IStateManager stateManager;

    public LevelResourceService(@NotNull IStateManager stateManager, @NotNull IResourceRepository levelResourcesRepository) {
        Intrinsics.checkNotNullParameter(stateManager, "stateManager");
        Intrinsics.checkNotNullParameter(levelResourcesRepository, "levelResourcesRepository");
        this.stateManager = stateManager;
        this.levelResourcesRepository = levelResourcesRepository;
    }

    private final Map<String, Long> getResources(LevelResourceType levelResourceType, long j10) {
        User activeUser = this.stateManager.getActiveUser();
        List listTake = CollectionsKt.take(this.levelResourcesRepository.getAll(LevelResource.Companion.getColumnsTypes()), (int) j10);
        Intrinsics.checkNotNull(listTake, "null cannot be cast to non-null type kotlin.collections.List<com.devtodev.analytics.internal.domain.events.currencyAccrual.LevelResource>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : listTake) {
            LevelResource levelResource = (LevelResource) obj;
            if (levelResource.getUserId() == activeUser.getIdKey() && levelResource.getType() == levelResourceType) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            LevelResource levelResource2 = (LevelResource) obj2;
            linkedHashMap.put(levelResource2.getName(), Long.valueOf(levelResource2.getAmount()));
        }
        return linkedHashMap;
    }

    @Override // com.devtodev.analytics.internal.services.ILevelResourceService
    public void addLevelResource(@NotNull LevelResource resource) {
        Object next;
        Intrinsics.checkNotNullParameter(resource, "resource");
        User activeUser = this.stateManager.getActiveUser();
        if (activeUser.isResourceAggregationEnable() && this.stateManager.getActiveProject().getTrackingAvailable()) {
            resource.setUserId(activeUser.getIdKey());
            List<DbModel> all = this.levelResourcesRepository.getAll(LevelResource.Companion.getColumnsTypes());
            Intrinsics.checkNotNull(all, "null cannot be cast to non-null type kotlin.collections.List<com.devtodev.analytics.internal.domain.events.currencyAccrual.LevelResource>");
            Iterator<T> it = all.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                LevelResource levelResource = (LevelResource) next;
                if (levelResource.getUserId() == activeUser.getIdKey() && levelResource.getType() == resource.getType() && Intrinsics.areEqual(levelResource.getName(), resource.getName())) {
                    break;
                }
            }
            LevelResource levelResource2 = (LevelResource) next;
            if (levelResource2 == null) {
                this.levelResourcesRepository.insert(resource);
                Logger.debug$default(Logger.INSTANCE, "Insert LU resources: " + resource, null, 2, null);
                return;
            }
            if (levelResource2.getAmount() > 0) {
                if (resource.getAmount() <= ((long) Integer.MAX_VALUE) - levelResource2.getAmount()) {
                    levelResource2.setAmount(resource.getAmount() + levelResource2.getAmount());
                } else {
                    levelResource2.setAmount(g3.f12256c);
                    Logger.error$default(Logger.INSTANCE, "LU resource: " + resource.getName() + " is overflow", null, 2, null);
                }
            } else {
                if (resource.getAmount() >= ((long) Integer.MIN_VALUE) - levelResource2.getAmount()) {
                    levelResource2.setAmount(resource.getAmount() + levelResource2.getAmount());
                } else {
                    levelResource2.setAmount(g3.f12261h);
                    Logger.error$default(Logger.INSTANCE, "LU resource: " + resource.getName() + " is overflow", null, 2, null);
                }
            }
            this.levelResourcesRepository.update(CollectionsKt.listOf(new EventParam("_id", new SqlValue.Long(levelResource2.getIdKey()))), levelResource2);
            Logger.debug$default(Logger.INSTANCE, "Update LU resources: " + levelResource2, null, 2, null);
        }
    }

    @Override // com.devtodev.analytics.internal.services.ILevelResourceService
    @NotNull
    public Map<String, Long> getBoughtResources(long j10) {
        return getResources(LevelResourceType.Bought, j10);
    }

    @Override // com.devtodev.analytics.internal.services.ILevelResourceService
    @NotNull
    public Map<String, Long> getEarnedResources(long j10) {
        return getResources(LevelResourceType.Earned, j10);
    }

    @Override // com.devtodev.analytics.internal.services.ILevelResourceService
    @NotNull
    public Map<String, Long> getSpendResources(long j10) {
        return getResources(LevelResourceType.Spent, j10);
    }

    @Override // com.devtodev.analytics.internal.services.ILevelResourceService
    public void removeAllResources() {
        this.levelResourcesRepository.deleteAll();
    }

    @Override // com.devtodev.analytics.internal.services.ILevelResourceService
    public void removeInactiveUsers(@NotNull List<User> users) {
        Intrinsics.checkNotNullParameter(users, "users");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(users, 10));
        Iterator<T> it = users.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((User) it.next()).getIdKey()));
        }
        this.levelResourcesRepository.deleteByUser(LevelResourceEntry.tableName, "userId", arrayList);
    }

    @Override // com.devtodev.analytics.internal.services.ILevelResourceService
    public void removeResourcesForActiveUser() {
        this.levelResourcesRepository.deleteByUser(LevelResourceEntry.tableName, "userId", CollectionsKt.listOf(Long.valueOf(this.stateManager.getActiveUser().getIdKey())));
    }
}
