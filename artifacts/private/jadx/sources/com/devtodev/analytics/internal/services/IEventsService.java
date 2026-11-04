package com.devtodev.analytics.internal.services;

import com.devtodev.analytics.internal.domain.User;
import com.devtodev.analytics.internal.domain.events.IEncodable;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface IEventsService {
    void addEvent(@NotNull IEncodable iEncodable);

    void addEvent(@NotNull IEncodable iEncodable, @NotNull User user);

    @Nullable
    Function0<Unit> getOnFullStackAction();

    void removeAllEvents();

    void removeInactiveUsers(@NotNull List<User> list);

    void setOnFullStackAction(@Nullable Function0<Unit> function0);
}
