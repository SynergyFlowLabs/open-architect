package com.devtodev.analytics.internal.managers;

import com.devtodev.analytics.internal.domain.EventObject;
import com.devtodev.analytics.internal.domain.events.abTests.ExperimentMarker;
import com.devtodev.analytics.internal.logger.Logger;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nEventController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventController.kt\ncom/devtodev/analytics/internal/managers/EventController\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,81:1\n766#2:82\n857#2,2:83\n1855#2,2:85\n*S KotlinDebug\n*F\n+ 1 EventController.kt\ncom/devtodev/analytics/internal/managers/EventController\n*L\n50#1:82\n50#1:83,2\n54#1:85,2\n*E\n"})
public final class EventController implements IEventController {

    @Nullable
    private Function1<? super EventObject, Unit> eventProvider;

    @Nullable
    private Long freezedEventsId;
    private boolean isReportSendingEnable = true;

    @Nullable
    private ExperimentMarker marker;

    @Override // com.devtodev.analytics.internal.managers.IEventController
    public void clearFreezedEvent() {
        this.freezedEventsId = null;
    }

    @Override // com.devtodev.analytics.internal.managers.IEventController
    public void freezeEvent(@NotNull EventObject event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.freezedEventsId = Long.valueOf(event.getIdKey());
    }

    @Override // com.devtodev.analytics.internal.managers.IEventController
    @Nullable
    public Function1<EventObject, Unit> getEventProvider() {
        return this.eventProvider;
    }

    @Override // com.devtodev.analytics.internal.managers.IEventController
    public boolean isReportSendingEnable() {
        return this.isReportSendingEnable;
    }

    @Override // com.devtodev.analytics.internal.managers.IEventController
    public void processEvent(@NotNull EventObject eventObject) {
        Function1<EventObject, Unit> eventProvider;
        Intrinsics.checkNotNullParameter(eventObject, "eventObject");
        if (!this.isReportSendingEnable || (eventProvider = getEventProvider()) == null) {
            return;
        }
        eventProvider.invoke(eventObject);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, java.util.ArrayList, java.util.Collection] */
    @Override // com.devtodev.analytics.internal.managers.IEventController
    @NotNull
    public List<EventObject> richEventObjects(@NotNull List<EventObject> events) {
        Intrinsics.checkNotNullParameter(events, "events");
        if (!this.isReportSendingEnable) {
            return CollectionsKt.emptyList();
        }
        i1.h hVar = new i1.h();
        hVar.f312751a = events;
        Long l10 = this.freezedEventsId;
        if (l10 != null) {
            long jLongValue = l10.longValue();
            Iterable iterable = (Iterable) hVar.f312751a;
            ?? arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (((EventObject) obj).getIdKey() < jLongValue) {
                    arrayList.add(obj);
                }
            }
            hVar.f312751a = arrayList;
        }
        ExperimentMarker experimentMarker = this.marker;
        if (experimentMarker != null) {
            for (EventObject eventObject : (Iterable) hVar.f312751a) {
                String string = new JSONObject(eventObject.getEventJson()).accumulate("inExperiments", new JSONArray().put(experimentMarker.toJson())).toString();
                Intrinsics.checkNotNullExpressionValue(string, "eventJson.accumulate(\"in…ments\", array).toString()");
                eventObject.setEventJson(string);
            }
        }
        return (List) hVar.f312751a;
    }

    @Override // com.devtodev.analytics.internal.managers.IEventController
    public void setEventProvider(@Nullable Function1<? super EventObject, Unit> function1) {
        this.eventProvider = function1;
    }

    @Override // com.devtodev.analytics.internal.managers.IEventController
    public void setExperimentMarker(@Nullable ExperimentMarker experimentMarker) {
        this.marker = experimentMarker;
    }

    @Override // com.devtodev.analytics.internal.managers.IEventController
    public void startReportSending() {
        this.isReportSendingEnable = true;
        Logger.info$default(Logger.INSTANCE, "[A/B-Test Module] Report sending is started", null, 2, null);
    }

    @Override // com.devtodev.analytics.internal.managers.IEventController
    public void stopReportSending() {
        this.isReportSendingEnable = false;
        int i10 = 3 << 2;
        Logger.info$default(Logger.INSTANCE, "[A/B-Test Module] Report sending is stopped", null, 2, null);
    }
}
