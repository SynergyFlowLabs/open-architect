package com.devtodev.analytics.internal.services;

import com.devtodev.analytics.internal.domain.User;
import com.devtodev.analytics.internal.domain.events.IEncodable;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface IReportService {
    @Nullable
    Function0<Unit> getOnReportSendAction();

    void removeAllReports();

    void removeInactiveUsers(@NotNull List<User> list);

    void sendBufferedEvents();

    void sendFlashEvent(@NotNull IEncodable iEncodable);

    void setOnReportSendAction(@Nullable Function0<Unit> function0);
}
