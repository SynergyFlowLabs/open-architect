package com.planner5d.library.model.manager.performancetracing;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nCompositeTransaction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompositeTransaction.kt\ncom/planner5d/library/model/manager/performancetracing/CompositeTransaction\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,14:1\n1863#2,2:15\n1863#2,2:17\n*S KotlinDebug\n*F\n+ 1 CompositeTransaction.kt\ncom/planner5d/library/model/manager/performancetracing/CompositeTransaction\n*L\n6#1:15,2\n10#1:17,2\n*E\n"})
public final class b implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Collection<g> f193072b;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@NotNull Collection<? extends g> transactions) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        this.f193072b = transactions;
    }

    @Override // com.planner5d.library.model.manager.performancetracing.g
    public void b(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Iterator<T> it = this.f193072b.iterator();
        while (it.hasNext()) {
            ((g) it.next()).b(throwable);
        }
    }

    @NotNull
    public final Collection<g> c() {
        return this.f193072b;
    }

    @Override // com.planner5d.library.model.manager.performancetracing.g
    public void complete() {
        Iterator<T> it = this.f193072b.iterator();
        while (it.hasNext()) {
            ((g) it.next()).complete();
        }
    }
}
