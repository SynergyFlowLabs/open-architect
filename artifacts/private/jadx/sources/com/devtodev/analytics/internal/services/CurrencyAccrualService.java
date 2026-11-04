package com.devtodev.analytics.internal.services;

import androidx.collection.g3;
import com.devtodev.analytics.external.analytics.DTDAccrualType;
import com.devtodev.analytics.internal.domain.DbModel;
import com.devtodev.analytics.internal.domain.User;
import com.devtodev.analytics.internal.domain.events.currencyAccrual.CurrencyAccrualResource;
import com.devtodev.analytics.internal.logger.Logger;
import com.devtodev.analytics.internal.managers.IStateManager;
import com.devtodev.analytics.internal.storage.EventParam;
import com.devtodev.analytics.internal.storage.IResourceRepository;
import com.devtodev.analytics.internal.storage.sqlite.CurrencyAccrualResourcesEntry;
import com.devtodev.analytics.internal.storage.sqlite.SqlValue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nCurrencyAccrualService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CurrencyAccrualService.kt\ncom/devtodev/analytics/internal/services/CurrencyAccrualService\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,166:1\n288#2,2:167\n1747#2,3:169\n766#2:172\n857#2,2:173\n1549#2:175\n1620#2,3:176\n766#2:179\n857#2,2:180\n766#2:182\n857#2,2:183\n1549#2:185\n1620#2,3:186\n*S KotlinDebug\n*F\n+ 1 CurrencyAccrualService.kt\ncom/devtodev/analytics/internal/services/CurrencyAccrualService\n*L\n42#1:167,2\n85#1:169,3\n101#1:172\n101#1:173,2\n102#1:175\n102#1:176,3\n118#1:179\n118#1:180,2\n121#1:182\n121#1:183,2\n159#1:185\n159#1:186,3\n*E\n"})
public final class CurrencyAccrualService implements ICurrencyAccrualService {

    @NotNull
    private final IResourceRepository currencyAccrualRepository;

    @NotNull
    private final IStateManager stateManager;

    public CurrencyAccrualService(@NotNull IStateManager stateManager, @NotNull IResourceRepository currencyAccrualRepository) {
        Intrinsics.checkNotNullParameter(stateManager, "stateManager");
        Intrinsics.checkNotNullParameter(currencyAccrualRepository, "currencyAccrualRepository");
        this.stateManager = stateManager;
        this.currencyAccrualRepository = currencyAccrualRepository;
    }

    private final Map<String, Map<String, Long>> getResources(DTDAccrualType dTDAccrualType, long j10, User user) {
        if (user == null) {
            user = this.stateManager.getActiveUser();
        }
        List<DbModel> all = this.currencyAccrualRepository.getAll(CurrencyAccrualResource.Companion.getColumnsTypes());
        Intrinsics.checkNotNull(all, "null cannot be cast to non-null type kotlin.collections.List<com.devtodev.analytics.internal.domain.events.currencyAccrual.CurrencyAccrualResource>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : all) {
            if (((CurrencyAccrualResource) obj).getUserId() == user.getIdKey()) {
                arrayList.add(obj);
            }
        }
        List listTake = CollectionsKt.take(arrayList, (int) j10);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : listTake) {
            if (((CurrencyAccrualResource) obj2).getType() == dTDAccrualType) {
                arrayList2.add(obj2);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj3 = arrayList2.get(i10);
            i10++;
            CurrencyAccrualResource currencyAccrualResource = (CurrencyAccrualResource) obj3;
            if (linkedHashMap.containsKey(currencyAccrualResource.getSource())) {
                Map map = (Map) linkedHashMap.get(currencyAccrualResource.getSource());
                if (map != null) {
                    Map mutableMap = MapsKt.toMutableMap(map);
                    mutableMap.put(currencyAccrualResource.getName(), Long.valueOf(currencyAccrualResource.getAmount()));
                    linkedHashMap.put(currencyAccrualResource.getSource(), mutableMap);
                }
            } else {
                linkedHashMap.put(currencyAccrualResource.getSource(), MapsKt.mapOf(TuplesKt.to(currencyAccrualResource.getName(), Long.valueOf(currencyAccrualResource.getAmount()))));
            }
        }
        return MapsKt.toMap(linkedHashMap);
    }

    @Override // com.devtodev.analytics.internal.services.ICurrencyAccrualService
    public void addCurrencyAccrual(@NotNull CurrencyAccrualResource resource) {
        Object next;
        Intrinsics.checkNotNullParameter(resource, "resource");
        User activeUser = this.stateManager.getActiveUser();
        if (this.stateManager.getActiveProject().getTrackingAvailable()) {
            resource.setUserId(activeUser.getIdKey());
            List<DbModel> all = this.currencyAccrualRepository.getAll(CurrencyAccrualResource.Companion.getColumnsTypes());
            Intrinsics.checkNotNull(all, "null cannot be cast to non-null type kotlin.collections.List<com.devtodev.analytics.internal.domain.events.currencyAccrual.CurrencyAccrualResource>");
            Iterator<T> it = all.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                CurrencyAccrualResource currencyAccrualResource = (CurrencyAccrualResource) next;
                if (currencyAccrualResource.getUserId() == activeUser.getIdKey() && currencyAccrualResource.getType() == resource.getType() && Intrinsics.areEqual(currencyAccrualResource.getSource(), resource.getSource()) && Intrinsics.areEqual(currencyAccrualResource.getName(), resource.getName())) {
                    break;
                }
            }
            CurrencyAccrualResource currencyAccrualResource2 = (CurrencyAccrualResource) next;
            if (currencyAccrualResource2 == null) {
                this.currencyAccrualRepository.insert(resource);
                Logger.debug$default(Logger.INSTANCE, "Insert CA resources: " + resource, null, 2, null);
                return;
            }
            if (currencyAccrualResource2.getAmount() > 0) {
                if (resource.getAmount() <= ((long) Integer.MAX_VALUE) - currencyAccrualResource2.getAmount()) {
                    currencyAccrualResource2.setAmount(resource.getAmount() + currencyAccrualResource2.getAmount());
                } else {
                    currencyAccrualResource2.setAmount(g3.f12256c);
                    Logger.error$default(Logger.INSTANCE, "CA resource: " + resource.getName() + " is overflow", null, 2, null);
                }
            } else {
                if (resource.getAmount() >= ((long) Integer.MIN_VALUE) - currencyAccrualResource2.getAmount()) {
                    currencyAccrualResource2.setAmount(resource.getAmount() + currencyAccrualResource2.getAmount());
                } else {
                    currencyAccrualResource2.setAmount(g3.f12261h);
                    Logger.error$default(Logger.INSTANCE, "CA resource: " + resource.getName() + " is overflow", null, 2, null);
                }
            }
            this.currencyAccrualRepository.update(CollectionsKt.listOf(new EventParam("_id", new SqlValue.Long(currencyAccrualResource2.getIdKey()))), currencyAccrualResource2);
            Logger.debug$default(Logger.INSTANCE, "Update CA resources: " + currencyAccrualResource2, null, 2, null);
        }
    }

    @Override // com.devtodev.analytics.internal.services.ICurrencyAccrualService
    @NotNull
    public Map<String, Map<String, Long>> getBoughtResources(long j10, @Nullable User user) {
        return getResources(DTDAccrualType.Bought, j10, user);
    }

    @Override // com.devtodev.analytics.internal.services.ICurrencyAccrualService
    @NotNull
    public Map<String, Map<String, Long>> getEarnedResources(long j10, @Nullable User user) {
        return getResources(DTDAccrualType.Earned, j10, user);
    }

    @Override // com.devtodev.analytics.internal.services.ICurrencyAccrualService
    @Nullable
    public Long getLastCreatedTime(@NotNull User user) {
        Intrinsics.checkNotNullParameter(user, "user");
        List<DbModel> all = this.currencyAccrualRepository.getAll(CurrencyAccrualResource.Companion.getColumnsTypes());
        Intrinsics.checkNotNull(all, "null cannot be cast to non-null type kotlin.collections.List<com.devtodev.analytics.internal.domain.events.currencyAccrual.CurrencyAccrualResource>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : all) {
            if (((CurrencyAccrualResource) obj).getUserId() == user.getIdKey()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            arrayList2.add(Long.valueOf(((CurrencyAccrualResource) obj2).getTimestamp()));
        }
        return (Long) CollectionsKt.maxOrNull((Iterable) arrayList2);
    }

    @Override // com.devtodev.analytics.internal.services.ICurrencyAccrualService
    public boolean isContainsCurrencyAccrual() {
        User activeUser = this.stateManager.getActiveUser();
        List<DbModel> all = this.currencyAccrualRepository.getAll(CurrencyAccrualResource.Companion.getColumnsTypes());
        Intrinsics.checkNotNull(all, "null cannot be cast to non-null type kotlin.collections.List<com.devtodev.analytics.internal.domain.events.currencyAccrual.CurrencyAccrualResource>");
        if ((all instanceof Collection) && all.isEmpty()) {
            return false;
        }
        Iterator<T> it = all.iterator();
        while (it.hasNext()) {
            if (((CurrencyAccrualResource) it.next()).getUserId() == activeUser.getIdKey()) {
                int i10 = 7 >> 1;
                return true;
            }
        }
        return false;
    }

    @Override // com.devtodev.analytics.internal.services.ICurrencyAccrualService
    public void removeAllResources() {
        this.currencyAccrualRepository.deleteAll();
    }

    @Override // com.devtodev.analytics.internal.services.ICurrencyAccrualService
    public void removeInactiveUsers(@NotNull List<User> users) {
        Intrinsics.checkNotNullParameter(users, "users");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(users, 10));
        Iterator<T> it = users.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((User) it.next()).getIdKey()));
        }
        this.currencyAccrualRepository.deleteByUser(CurrencyAccrualResourcesEntry.tableName, "userId", arrayList);
    }

    @Override // com.devtodev.analytics.internal.services.ICurrencyAccrualService
    public void removeResources(@NotNull User user) {
        Intrinsics.checkNotNullParameter(user, "user");
        this.currencyAccrualRepository.deleteByUser(CurrencyAccrualResourcesEntry.tableName, "userId", CollectionsKt.listOf(Long.valueOf(user.getIdKey())));
    }

    @Override // com.devtodev.analytics.internal.services.ICurrencyAccrualService
    public void removeResourcesForActiveUser() {
        this.currencyAccrualRepository.deleteByUser(CurrencyAccrualResourcesEntry.tableName, "userId", CollectionsKt.listOf(Long.valueOf(this.stateManager.getActiveUser().getIdKey())));
    }
}
