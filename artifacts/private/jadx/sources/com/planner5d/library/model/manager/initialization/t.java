package com.planner5d.library.model.manager.initialization;

import androidx.compose.runtime.internal.w0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
public final class t implements x.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f191710b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.engine.i f191711a;

    @ij.a
    public t(@NotNull com.planner5d.library.engine.i engineFactory) {
        Intrinsics.checkNotNullParameter(engineFactory, "engineFactory");
        this.f191711a = engineFactory;
    }

    @Override // com.planner5d.library.model.manager.initialization.x.b
    @Nullable
    public Object a(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objA = this.f191711a.b().a(dVar);
        return objA == kotlin.coroutines.intrinsics.b.l() ? objA : Unit.f312394a;
    }
}
