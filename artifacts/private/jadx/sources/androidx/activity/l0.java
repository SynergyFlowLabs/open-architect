package androidx.activity;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    public static final class a extends i0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<i0, Unit> f9961a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(boolean z10, Function1<? super i0, Unit> function1) {
            super(z10);
            this.f9961a = function1;
        }

        @Override // androidx.activity.i0
        public void handleOnBackPressed() {
            this.f9961a.invoke(this);
        }
    }

    @NotNull
    public static final i0 a(@NotNull j0 j0Var, @Nullable androidx.lifecycle.o0 o0Var, boolean z10, @NotNull Function1<? super i0, Unit> onBackPressed) {
        Intrinsics.checkNotNullParameter(j0Var, "<this>");
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        a aVar = new a(z10, onBackPressed);
        if (o0Var != null) {
            j0Var.i(o0Var, aVar);
            return aVar;
        }
        j0Var.h(aVar);
        return aVar;
    }

    public static /* synthetic */ i0 b(j0 j0Var, androidx.lifecycle.o0 o0Var, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            o0Var = null;
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return a(j0Var, o0Var, z10, function1);
    }
}
