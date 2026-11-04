package com.planner5d.library.services.utility;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nNullReporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NullReporter.kt\ncom/planner5d/library/services/utility/NullReporter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,12:1\n1#2:13\n*E\n"})
public final class f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.u1 f225227a;

    @ij.a
    public f2(@NotNull com.planner5d.library.model.manager.u1 logRecordManager) {
        Intrinsics.checkNotNullParameter(logRecordManager, "logRecordManager");
        this.f225227a = logRecordManager;
    }

    @NotNull
    public final <T> Object a(@Nullable T t10, @NotNull e2<T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (t10 != null) {
            action.apply(t10);
            return t10;
        }
        this.f225227a.b("null_value", null, new IllegalStateException());
        return Unit.f312394a;
    }
}
