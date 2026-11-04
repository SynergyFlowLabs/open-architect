package com.planner5d.library.application;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@fg.h
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class a5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f142453a = 0;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f() {
        return Unit.f312394a;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.model.manager.push.b b() {
        return new com.planner5d.library.model.manager.push.b(new com.planner5d.library.model.manager.push.g[0]);
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.services.i c() {
        return new com.planner5d.library.services.j();
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.model.manager.statistics.f d() {
        return new com.planner5d.library.model.manager.statistics.f(CollectionsKt.emptyList());
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.database.migration.p e() {
        return new com.planner5d.library.database.migration.p(new Function0() { // from class: com.planner5d.library.application.z4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a5.f();
            }
        });
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.model.manager.statistics.i g() {
        return new com.planner5d.library.model.manager.statistics.i(CollectionsKt.emptyList());
    }
}
