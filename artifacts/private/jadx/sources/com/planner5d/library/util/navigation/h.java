package com.planner5d.library.util.navigation;

import android.os.Bundle;
import androidx.annotation.n0;
import androidx.fragment.app.FragmentContainerView;
import androidx.navigation.e2;
import androidx.navigation.w0;
import com.planner5d.library.services.r;
import com.planner5d.library.util.navigation.external.NestedNavigationState;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nNavigationGraphStateHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationGraphStateHandler.kt\ncom/planner5d/library/util/navigation/NavigationGraphStateHandler\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,47:1\n1#2:48\n*E\n"})
public final class h {
    private final void b(w0 w0Var, @n0 int i10, Bundle bundle, Integer num) {
        e2 e2VarB = w0Var.O().b(i10);
        if (num != null) {
            e2VarB.m1(num.intValue());
        }
        w0Var.Y0(e2VarB, bundle != null ? bundle.getBundle(r.startArguments.f224891a) : null);
    }

    public final void a(@NotNull FragmentContainerView navigationHost, @NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(navigationHost, "navigationHost");
        Intrinsics.checkNotNullParameter(outState, "outState");
        outState.putBundle(r.nestedNavigationState.f224891a, k.f240224a.a(navigationHost).T0());
    }

    public final void c(@NotNull FragmentContainerView navigationHost, @n0 int i10, @Nullable Bundle bundle, @Nullable Bundle bundle2, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(navigationHost, "navigationHost");
        w0 w0VarA = k.f240224a.a(navigationHost);
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(r.nestedNavigationState.f224891a) : null;
        if (bundle3 != null) {
            w0VarA.S0(bundle3);
            b(w0VarA, i10, bundle, num);
            return;
        }
        b(w0VarA, i10, bundle, num);
        NestedNavigationState nestedNavigationState = bundle != null ? (NestedNavigationState) bundle.getParcelable(r.nestedNavigationState.f224891a) : null;
        NestedNavigationState nestedNavigationState2 = nestedNavigationState != null ? nestedNavigationState : null;
        if (nestedNavigationState2 != null) {
            w0VarA.c0(nestedNavigationState2.b(), nestedNavigationState2.a());
        }
    }
}
