package com.planner5d.library.activity.helper;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class s1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f137112b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.appcompat.app.d f137113a;

    static final class a implements androidx.lifecycle.d1, kotlin.jvm.internal.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f137114a;

        a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f137114a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final kotlin.x<?> b() {
            return this.f137114a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f137114a.invoke(obj);
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

    public s1(@NotNull androidx.appcompat.app.d activity, @NotNull androidx.lifecycle.o0 lifecycleOwner) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.f137113a = activity;
        com.planner5d.library.activity.helper.ui.d.f137133w.k(lifecycleOwner, new a(new Function1() { // from class: com.planner5d.library.activity.helper.r1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s1.b(this.f137110a, (com.planner5d.library.activity.helper.ui.d) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(s1 s1Var, com.planner5d.library.activity.helper.ui.d dVar) {
        m1.y(s1Var.f137113a.getWindow(), dVar);
        return Unit.f312394a;
    }

    @NotNull
    public final androidx.appcompat.app.d c() {
        return this.f137113a;
    }
}
