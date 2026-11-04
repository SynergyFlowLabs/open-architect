package com.devtodev.analytics.internal.services;

import com.devtodev.analytics.internal.domain.DbModel;
import com.devtodev.analytics.internal.domain.User;
import com.devtodev.analytics.internal.domain.events.people.PeopleCard;
import com.devtodev.analytics.internal.domain.events.people.PeopleCardKt;
import com.devtodev.analytics.internal.domain.events.people.PeopleParameter;
import com.devtodev.analytics.internal.domain.events.people.PeopleParameterDouble;
import com.devtodev.analytics.internal.domain.events.people.PeopleParameterEmpty;
import com.devtodev.analytics.internal.domain.events.people.PeopleParameterKt;
import com.devtodev.analytics.internal.domain.events.people.PeopleParameterLong;
import com.devtodev.analytics.internal.logger.Logger;
import com.devtodev.analytics.internal.managers.IStateManager;
import com.devtodev.analytics.internal.modues.people.PeopleReservedKeys;
import com.devtodev.analytics.internal.storage.EventParam;
import com.devtodev.analytics.internal.storage.IRepository;
import com.devtodev.analytics.internal.storage.sqlite.RemoverPattern;
import com.devtodev.analytics.internal.storage.sqlite.SqlValue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nPeopleService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PeopleService.kt\ncom/devtodev/analytics/internal/services/PeopleService\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,311:1\n515#2:312\n500#2,6:313\n515#2:319\n500#2,6:320\n515#2:326\n500#2,6:327\n1549#3:333\n1620#3,3:334\n766#3:337\n857#3,2:338\n288#3,2:340\n*S KotlinDebug\n*F\n+ 1 PeopleService.kt\ncom/devtodev/analytics/internal/services/PeopleService\n*L\n57#1:312\n57#1:313,6\n233#1:319\n233#1:320,6\n243#1:326\n243#1:327,6\n269#1:333\n269#1:334,3\n272#1:337\n272#1:338,2\n287#1:340,2\n*E\n"})
public final class PeopleService implements IPeopleService {

    @Nullable
    private Function0<Unit> onClearedCard;

    @Nullable
    private Function0<Unit> onFilledCustomParams;

    @Nullable
    private Function1<? super Boolean, Unit> onGeneratePeopleEvent;

    @Nullable
    private Function0<Unit> peopleCardIsChanged;

    @NotNull
    private final IRepository peopleRepository;

    @NotNull
    private final IStateManager stateManager;

    public PeopleService(@NotNull IStateManager stateManager, @NotNull IRepository peopleRepository) {
        Intrinsics.checkNotNullParameter(stateManager, "stateManager");
        Intrinsics.checkNotNullParameter(peopleRepository, "peopleRepository");
        this.stateManager = stateManager;
        this.peopleRepository = peopleRepository;
    }

    private final void addChangedKeys(PeopleCard peopleCard, String str) {
        if (peopleCard.getChangedKeys().contains(str)) {
            return;
        }
        peopleCard.getChangedKeys().add(str);
    }

    private final PeopleCard getPeopleCard() {
        Object next;
        User activeUser = this.stateManager.getActiveUser();
        List<DbModel> all = this.peopleRepository.getAll(PeopleCard.Companion.getColumnsTypes());
        Intrinsics.checkNotNull(all, "null cannot be cast to non-null type kotlin.collections.List<com.devtodev.analytics.internal.domain.events.people.PeopleCard>");
        Iterator<T> it = all.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((PeopleCard) next).getUserId() != activeUser.getIdKey());
        PeopleCard peopleCard = (PeopleCard) next;
        if (peopleCard != null) {
            return peopleCard;
        }
        PeopleCard peopleCard2 = new PeopleCard(0L, activeUser.getIdKey(), null, null, null, false, false, 125, null);
        this.peopleRepository.insert(peopleCard2);
        return peopleCard2;
    }

    private final PeopleParameterDouble incrementDouble(String str, PeopleParameter peopleParameter, PeopleParameter peopleParameter2) {
        double value = PeopleParameterKt.toDouble(peopleParameter).getValue();
        double value2 = PeopleParameterKt.toDouble(peopleParameter2).getValue();
        if (value > 0.0d) {
            if (value2 <= Double.MAX_VALUE - value) {
                return new PeopleParameterDouble(value + value2);
            }
            Logger.error$default(Logger.INSTANCE, "[User Card] The incremented value [" + str + "] is overflowing", null, 2, null);
            return new PeopleParameterDouble(Double.MAX_VALUE);
        }
        if (value2 >= (-1.7976931348623157E308d) - value) {
            return new PeopleParameterDouble(value + value2);
        }
        Logger.error$default(Logger.INSTANCE, "[User Card] The incremented value [" + str + "] is overflowing", null, 2, null);
        return new PeopleParameterDouble(-1.7976931348623157E308d);
    }

    private final PeopleParameterLong incrementLong(String str, PeopleParameter peopleParameter, PeopleParameter peopleParameter2) {
        long value = PeopleParameterKt.toLong(peopleParameter).getValue();
        long value2 = PeopleParameterKt.toLong(peopleParameter2).getValue();
        if (value > 0) {
            if (value2 <= Long.MAX_VALUE - value) {
                return new PeopleParameterLong(value + value2);
            }
            Logger.error$default(Logger.INSTANCE, "[User Card] The incremented value [" + str + "] is overflowing", null, 2, null);
            return new PeopleParameterLong(Long.MAX_VALUE);
        }
        if (value2 >= Long.MIN_VALUE - value) {
            return new PeopleParameterLong(value + value2);
        }
        Logger.error$default(Logger.INSTANCE, "[User Card] The incremented value [" + str + "] is overflowing", null, 2, null);
        return new PeopleParameterLong(Long.MIN_VALUE);
    }

    private final void updateCardProperties(PeopleCard peopleCard) {
        peopleCard.setJson(PeopleCardKt.json(peopleCard.getProperties()));
        peopleCard.setUpdated(true);
        this.peopleRepository.update(CollectionsKt.listOf(new EventParam("_id", new SqlValue.Long(peopleCard.getIdKey()))), peopleCard);
        Function0<Unit> peopleCardIsChanged = getPeopleCardIsChanged();
        if (peopleCardIsChanged != null) {
            peopleCardIsChanged.invoke();
        }
    }

    @Override // com.devtodev.analytics.internal.services.IPeopleService
    public void clearChangedKeys() {
        PeopleCard peopleCard = getPeopleCard();
        peopleCard.getChangedKeys().clear();
        this.peopleRepository.update(CollectionsKt.listOf(new EventParam("_id", new SqlValue.Long(peopleCard.getIdKey()))), peopleCard);
    }

    @Override // com.devtodev.analytics.internal.services.IPeopleService
    public void clearCustomParams() {
        PeopleCard peopleCard = getPeopleCard();
        Map<String, PeopleParameter> properties = peopleCard.getProperties();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, PeopleParameter> entry : properties.entrySet()) {
            if (PeopleReservedKeys.Companion.contains(entry.getKey()) != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        peopleCard.setProperties(MapsKt.toMutableMap(linkedHashMap));
        peopleCard.setJson(PeopleCardKt.json(peopleCard.getProperties()));
        this.peopleRepository.update(CollectionsKt.listOf(new EventParam("_id", new SqlValue.Long(peopleCard.getIdKey()))), peopleCard);
        Function0<Unit> peopleCardIsChanged = getPeopleCardIsChanged();
        if (peopleCardIsChanged != null) {
            peopleCardIsChanged.invoke();
        }
    }

    @Override // com.devtodev.analytics.internal.services.IPeopleService
    public void clearUser() {
        PeopleCard peopleCard = getPeopleCard();
        peopleCard.getProperties().clear();
        peopleCard.setCleared(true);
        updateCardProperties(peopleCard);
        Function0<Unit> onClearedCard = getOnClearedCard();
        if (onClearedCard != null) {
            onClearedCard.invoke();
        }
        Logger.info$default(Logger.INSTANCE, "[User Card] All user data was successfully cleared", null, 2, null);
    }

    @Override // com.devtodev.analytics.internal.services.IPeopleService
    public void generatePeopleEvent(boolean z10) {
        Function1<Boolean, Unit> onGeneratePeopleEvent = getOnGeneratePeopleEvent();
        if (onGeneratePeopleEvent != null) {
            onGeneratePeopleEvent.invoke(Boolean.valueOf(z10));
        }
    }

    @Override // com.devtodev.analytics.internal.services.IPeopleService
    public int getCustomKeyParamsCount() {
        Map<String, PeopleParameter> properties = getPeopleCard().getProperties();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, PeopleParameter> entry : properties.entrySet()) {
            if (PeopleReservedKeys.Companion.contains(entry.getKey()) == null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap.size();
    }

    @Override // com.devtodev.analytics.internal.services.IPeopleService
    @Nullable
    public Function0<Unit> getOnClearedCard() {
        return this.onClearedCard;
    }

    @Override // com.devtodev.analytics.internal.services.IPeopleService
    @Nullable
    public Function0<Unit> getOnFilledCustomParams() {
        return this.onFilledCustomParams;
    }

    @Override // com.devtodev.analytics.internal.services.IPeopleService
    @Nullable
    public Function1<Boolean, Unit> getOnGeneratePeopleEvent() {
        return this.onGeneratePeopleEvent;
    }

    @Override // com.devtodev.analytics.internal.services.IPeopleService
    @NotNull
    public Map<String, PeopleParameter> getParameters(boolean z10) {
        PeopleCard peopleCard = getPeopleCard();
        if (z10) {
            return peopleCard.getProperties();
        }
        Map<String, PeopleParameter> properties = peopleCard.getProperties();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, PeopleParameter> entry : properties.entrySet()) {
            if (peopleCard.getChangedKeys().contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return MapsKt.toMutableMap(linkedHashMap);
    }

    @Override // com.devtodev.analytics.internal.services.IPeopleService
    @Nullable
    public Function0<Unit> getPeopleCardIsChanged() {
        return this.peopleCardIsChanged;
    }

    @Override // com.devtodev.analytics.internal.services.IPeopleService
    public void getValue(@NotNull String key, @NotNull Function1<? super PeopleParameter, Unit> handler) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(handler, "handler");
        handler.invoke(getPeopleCard().getProperties().get(key));
    }

    @Override // com.devtodev.analytics.internal.services.IPeopleService
    public void increment(@NotNull String key, @NotNull PeopleParameter value) {
        boolean z10;
        PeopleParameter peopleParameterIncrementLong;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        PeopleCard peopleCard = getPeopleCard();
        PeopleParameter peopleParameter = peopleCard.getProperties().get(key);
        if (peopleParameter != null) {
            boolean z11 = peopleParameter instanceof PeopleParameterDouble;
            boolean z12 = true;
            if ((z11 && (value instanceof PeopleParameterDouble)) || ((((z10 = peopleParameter instanceof PeopleParameterLong)) && (value instanceof PeopleParameterDouble)) || (z11 && (value instanceof PeopleParameterLong)))) {
                peopleParameterIncrementLong = incrementDouble(key, peopleParameter, value);
            } else if (z10 && (value instanceof PeopleParameterLong)) {
                peopleParameterIncrementLong = incrementLong(key, peopleParameter, value);
            } else {
                Logger.INSTANCE.error("[User Card] In the increment method an error has occurred: \n\tValue [" + peopleParameter + "] type does not match the increment value [" + value + "]", null);
                z12 = false;
                peopleParameterIncrementLong = null;
            }
            if (z12 && peopleParameterIncrementLong != null) {
                peopleCard.getProperties().put(key, peopleParameterIncrementLong);
                addChangedKeys(peopleCard, key);
                Logger.INSTANCE.info("[User Card] Value [" + peopleCard.getProperties().get(key) + "] for the key [" + key + "] was successfully incremented", null);
            }
        } else {
            peopleCard.getProperties().put(key, value);
            addChangedKeys(peopleCard, key);
            Logger.info$default(Logger.INSTANCE, "[User Card] Value [" + value + "] for the key [" + key + "] was set successfully", null, 2, null);
        }
        updateCardProperties(peopleCard);
    }

    @Override // com.devtodev.analytics.internal.services.IPeopleService
    public boolean isNeedToClear() {
        return getPeopleCard().getCleared();
    }

    @Override // com.devtodev.analytics.internal.services.IPeopleService
    public boolean isNeedToSend() {
        return getPeopleCard().getUpdated();
    }

    @Override // com.devtodev.analytics.internal.services.IPeopleService
    public void removeInactiveUsers(@NotNull List<User> users) {
        Intrinsics.checkNotNullParameter(users, "users");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(users, 10));
        Iterator<T> it = users.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((User) it.next()).getIdKey()));
        }
        List<DbModel> all = this.peopleRepository.getAll(PeopleCard.Companion.getColumnsTypes());
        Intrinsics.checkNotNull(all, "null cannot be cast to non-null type kotlin.collections.List<com.devtodev.analytics.internal.domain.events.people.PeopleCard>");
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : all) {
            if (arrayList.contains(Long.valueOf(((PeopleCard) obj).getUserId()))) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            arrayList3.add(new EventParam("_id", new SqlValue.Long(((PeopleCard) obj2).getIdKey())));
        }
        if (arrayList3.size() != 0) {
            this.peopleRepository.delete(arrayList2, arrayList3, RemoverPattern.JEST_ONE);
        }
    }

    @Override // com.devtodev.analytics.internal.services.IPeopleService
    public void removeNulls() {
        PeopleCard peopleCard = getPeopleCard();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, PeopleParameter> entry : peopleCard.getProperties().entrySet()) {
            if (entry.getValue() instanceof PeopleParameterEmpty) {
                arrayList.add(entry.getKey());
            }
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            peopleCard.getProperties().remove((String) obj);
        }
        updateCardProperties(peopleCard);
    }

    @Override // com.devtodev.analytics.internal.services.IPeopleService
    public void sendPeopleCard() {
        Function0<Unit> onFilledCustomParams = getOnFilledCustomParams();
        if (onFilledCustomParams != null) {
            onFilledCustomParams.invoke();
        }
    }

    @Override // com.devtodev.analytics.internal.services.IPeopleService
    public void setOnClearedCard(@Nullable Function0<Unit> function0) {
        this.onClearedCard = function0;
    }

    @Override // com.devtodev.analytics.internal.services.IPeopleService
    public void setOnFilledCustomParams(@Nullable Function0<Unit> function0) {
        this.onFilledCustomParams = function0;
    }

    @Override // com.devtodev.analytics.internal.services.IPeopleService
    public void setOnGeneratePeopleEvent(@Nullable Function1<? super Boolean, Unit> function1) {
        this.onGeneratePeopleEvent = function1;
    }

    @Override // com.devtodev.analytics.internal.services.IPeopleService
    public void setPeopleCardIsChanged(@Nullable Function0<Unit> function0) {
        this.peopleCardIsChanged = function0;
    }

    @Override // com.devtodev.analytics.internal.services.IPeopleService
    public void setValue(@NotNull String key, @NotNull PeopleParameter parameter) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(parameter, "parameter");
        PeopleCard peopleCard = getPeopleCard();
        if (Intrinsics.areEqual(peopleCard.getProperties().get(key), parameter)) {
            return;
        }
        peopleCard.getProperties().put(key, parameter);
        addChangedKeys(peopleCard, key);
        updateCardProperties(peopleCard);
        Logger.INSTANCE.info("Value [" + PeopleParameterKt.getValue(parameter) + "] for the key [" + key + "] was set successfully", null);
    }

    @Override // com.devtodev.analytics.internal.services.IPeopleService
    public void unmarkCleared() {
        PeopleCard peopleCard = getPeopleCard();
        peopleCard.setCleared(false);
        this.peopleRepository.update(CollectionsKt.listOf(new EventParam("_id", new SqlValue.Long(peopleCard.getIdKey()))), peopleCard);
    }

    @Override // com.devtodev.analytics.internal.services.IPeopleService
    public void unmarkUpdated() {
        PeopleCard peopleCard = getPeopleCard();
        peopleCard.setUpdated(false);
        this.peopleRepository.update(CollectionsKt.listOf(new EventParam("_id", new SqlValue.Long(peopleCard.getIdKey()))), peopleCard);
    }

    @Override // com.devtodev.analytics.internal.services.IPeopleService
    public void unset(@NotNull List<String> properties) {
        Intrinsics.checkNotNullParameter(properties, "properties");
        PeopleCard peopleCard = getPeopleCard();
        for (String str : properties) {
            peopleCard.getProperties().put(str, new PeopleParameterEmpty(null, 1, null));
            addChangedKeys(peopleCard, str);
        }
        Logger.INSTANCE.info("[User Card] Properties for the key " + properties + " was successfully unset", null);
        updateCardProperties(peopleCard);
    }
}
