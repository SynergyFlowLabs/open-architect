package com.planner5d.library.activity.fragment.list;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@ij.f
public final class d0 implements o1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f134033b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.synchronization.i f134034a;

    static final class a implements androidx.lifecycle.d1, kotlin.jvm.internal.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f134035a;

        a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f134035a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final kotlin.x<?> b() {
            return this.f134035a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f134035a.invoke(obj);
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof androidx.lifecycle.d1) && (obj instanceof kotlin.jvm.internal.c0)) {
                return Intrinsics.areEqual(b(), ((kotlin.jvm.internal.c0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    @ij.a
    public d0(@NotNull com.planner5d.library.model.manager.synchronization.i synchronizationManager) {
        Intrinsics.checkNotNullParameter(synchronizationManager, "synchronizationManager");
        this.f134034a = synchronizationManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(AtomicBoolean atomicBoolean, b0 b0Var, Boolean bool) {
        boolean z10 = !bool.booleanValue();
        Intrinsics.checkNotNull(bool);
        if (atomicBoolean.compareAndSet(z10, bool.booleanValue())) {
            if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                b0Var.f(b0.a.Synchronizing);
            } else {
                b0Var.g(b0.a.Synchronizing);
            }
        }
        return Unit.f312394a;
    }

    @Override // com.planner5d.library.activity.fragment.list.o1
    public void a(@NotNull final b0 actions, @NotNull androidx.lifecycle.o0 lifecycleOwner) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        this.f134034a.j().k(lifecycleOwner, new a(new Function1() { // from class: com.planner5d.library.activity.fragment.list.c0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d0.c(atomicBoolean, actions, (Boolean) obj);
            }
        }));
    }
}
