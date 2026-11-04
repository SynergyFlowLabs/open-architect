package com.devtodev.analytics.internal.services;

import com.devtodev.analytics.internal.backend.ExcludeEvents;
import com.devtodev.analytics.internal.domain.DbModel;
import com.devtodev.analytics.internal.domain.EventObject;
import com.devtodev.analytics.internal.domain.Project;
import com.devtodev.analytics.internal.domain.User;
import com.devtodev.analytics.internal.domain.events.IEncodable;
import com.devtodev.analytics.internal.logger.Logger;
import com.devtodev.analytics.internal.managers.IEventController;
import com.devtodev.analytics.internal.managers.IStateManager;
import com.devtodev.analytics.internal.storage.EventParam;
import com.devtodev.analytics.internal.storage.IRepository;
import com.devtodev.analytics.internal.storage.sqlite.RemoverPattern;
import com.devtodev.analytics.internal.storage.sqlite.SqlValue;
import com.devtodev.analytics.internal.validator.Validator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nEventsService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventsService.kt\ncom/devtodev/analytics/internal/services/EventsService\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,88:1\n766#2:89\n857#2,2:90\n1549#2:92\n1620#2,3:93\n766#2:96\n857#2,2:97\n*S KotlinDebug\n*F\n+ 1 EventsService.kt\ncom/devtodev/analytics/internal/services/EventsService\n*L\n63#1:89\n63#1:90,2\n75#1:92\n75#1:93,3\n78#1:96\n78#1:97,2\n*E\n"})
public final class EventsService implements IEventsService {

    @NotNull
    private final IEventController eventController;

    @NotNull
    private final IRepository eventRepository;

    @Nullable
    private Function0<Unit> onFullStackAction;

    @NotNull
    private final IStateManager stateManager;

    public EventsService(@NotNull IStateManager stateManager, @NotNull IEventController eventController, @NotNull IRepository eventRepository) {
        Intrinsics.checkNotNullParameter(stateManager, "stateManager");
        Intrinsics.checkNotNullParameter(eventController, "eventController");
        Intrinsics.checkNotNullParameter(eventRepository, "eventRepository");
        this.stateManager = stateManager;
        this.eventController = eventController;
        this.eventRepository = eventRepository;
    }

    private final void createEventForUser(IEncodable iEncodable, User user) {
        Project activeProject = this.stateManager.getActiveProject();
        if (!activeProject.getTrackingAvailable()) {
            Logger.debug$default(Logger.INSTANCE, "Event [" + iEncodable.getCode() + "] not created. Tracking is Disabled", null, 2, null);
            return;
        }
        Validator validator = Validator.INSTANCE;
        ExcludeEvents exclude = activeProject.getConfiguration().getExclude();
        if (validator.isAllExcluded(exclude != null ? exclude.getAll() : null)) {
            return;
        }
        EventObject eventObject = new EventObject(0L, user.getIdKey(), iEncodable.getCode(), iEncodable.getJson(), 1, null);
        eventObject.setUserId(user.getIdKey());
        this.eventRepository.insert(eventObject);
        Logger.info$default(Logger.INSTANCE, "Create a new event: " + iEncodable, null, 2, null);
        this.eventController.processEvent(eventObject);
        isFullStack(activeProject, user);
    }

    private final void isFullStack(Project project, User user) {
        Function0<Unit> onFullStackAction;
        List<DbModel> all = this.eventRepository.getAll(EventObject.Companion.getColumnsTypes());
        Intrinsics.checkNotNull(all, "null cannot be cast to non-null type kotlin.collections.List<com.devtodev.analytics.internal.domain.EventObject>");
        ArrayList arrayList = new ArrayList(all);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (((EventObject) obj).getUserId() == user.getIdKey()) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.size() >= project.getConfiguration().getCountForRequest() && (onFullStackAction = getOnFullStackAction()) != null) {
            onFullStackAction.invoke();
        }
    }

    @Override // com.devtodev.analytics.internal.services.IEventsService
    public void addEvent(@NotNull IEncodable event) {
        Intrinsics.checkNotNullParameter(event, "event");
        createEventForUser(event, this.stateManager.getActiveUser());
    }

    @Override // com.devtodev.analytics.internal.services.IEventsService
    @Nullable
    public Function0<Unit> getOnFullStackAction() {
        return this.onFullStackAction;
    }

    @NotNull
    public final IStateManager getStateManager() {
        return this.stateManager;
    }

    @Override // com.devtodev.analytics.internal.services.IEventsService
    public void removeAllEvents() {
        this.eventRepository.deleteAll();
    }

    @Override // com.devtodev.analytics.internal.services.IEventsService
    public void removeInactiveUsers(@NotNull List<User> users) {
        Intrinsics.checkNotNullParameter(users, "users");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(users, 10));
        Iterator<T> it = users.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((User) it.next()).getIdKey()));
        }
        List<DbModel> all = this.eventRepository.getAll(EventObject.Companion.getColumnsTypes());
        Intrinsics.checkNotNull(all, "null cannot be cast to non-null type kotlin.collections.List<com.devtodev.analytics.internal.domain.EventObject>");
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : all) {
            if (arrayList.contains(Long.valueOf(((EventObject) obj).getUserId()))) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            arrayList3.add(new EventParam("_id", new SqlValue.Long(((EventObject) obj2).getIdKey())));
        }
        if (arrayList3.size() != 0) {
            this.eventRepository.delete(arrayList2, arrayList3, RemoverPattern.JEST_ONE);
        }
    }

    @Override // com.devtodev.analytics.internal.services.IEventsService
    public void setOnFullStackAction(@Nullable Function0<Unit> function0) {
        this.onFullStackAction = function0;
    }

    @Override // com.devtodev.analytics.internal.services.IEventsService
    public void addEvent(@NotNull IEncodable event, @NotNull User forUser) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(forUser, "forUser");
        createEventForUser(event, forUser);
    }
}
