package com.devtodev.analytics.internal.storage;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nEventParam.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventParam.kt\ncom/devtodev/analytics/internal/storage/EventParamKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,15:1\n1#2:16\n*E\n"})
public final class EventParamKt {
    @Nullable
    public static final EventParam containsName(@NotNull List<EventParam> list, @NotNull String name) {
        Object next;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.areEqual(((EventParam) next).getName(), name)) {
                return (EventParam) next;
            }
        }
        next = null;
        return (EventParam) next;
    }
}
