package com.devtodev.analytics.internal.managers;

import com.devtodev.analytics.internal.domain.EventObject;
import com.devtodev.analytics.internal.domain.events.abTests.ExperimentMarker;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface IEventController {
    void clearFreezedEvent();

    void freezeEvent(@NotNull EventObject eventObject);

    @Nullable
    Function1<EventObject, Unit> getEventProvider();

    boolean isReportSendingEnable();

    void processEvent(@NotNull EventObject eventObject);

    @NotNull
    List<EventObject> richEventObjects(@NotNull List<EventObject> list);

    void setEventProvider(@Nullable Function1<? super EventObject, Unit> function1);

    void setExperimentMarker(@Nullable ExperimentMarker experimentMarker);

    void startReportSending();

    void stopReportSending();
}
