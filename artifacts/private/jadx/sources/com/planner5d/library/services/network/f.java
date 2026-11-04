package com.planner5d.library.services.network;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.o0;
import com.planner5d.library.services.utility.n3;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f224463a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final com.planner5d.library.services.network.b d(Fragment fragment) {
            return f.f224463a.e(fragment);
        }

        private final com.planner5d.library.services.network.b e(Fragment fragment) {
            Context contextRequireContext = fragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            com.planner5d.library.services.network.b bVar = new com.planner5d.library.services.network.b(contextRequireContext);
            fragment.getViewLifecycleOwner().getLifecycle().c(new b(bVar));
            return bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final com.planner5d.library.services.network.b g(Fragment fragment) {
            return f.f224463a.e(fragment);
        }

        @n
        @NotNull
        public final n3<com.planner5d.library.services.network.b> c(@NotNull final Fragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return new n3<>(new Function0() { // from class: com.planner5d.library.services.network.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return f.a.d(fragment);
                }
            });
        }

        @NotNull
        public final f0<com.planner5d.library.services.network.b> f(@NotNull final Fragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "<this>");
            return g0.c(new Function0() { // from class: com.planner5d.library.services.network.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return f.a.g(fragment);
                }
            });
        }

        private a() {
        }
    }

    private static final class b implements DefaultLifecycleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final com.planner5d.library.services.network.b f224464a;

        public b(@NotNull com.planner5d.library.services.network.b networkWatcher) {
            Intrinsics.checkNotNullParameter(networkWatcher, "networkWatcher");
            this.f224464a = networkWatcher;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onDestroy(@NotNull o0 owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            this.f224464a.m();
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onPause(@NotNull o0 owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            this.f224464a.l(false);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onResume(@NotNull o0 owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            com.planner5d.library.services.network.b bVar = this.f224464a;
            bVar.l(true);
            bVar.j();
        }
    }

    @n
    @NotNull
    public static final n3<com.planner5d.library.services.network.b> a(@NotNull Fragment fragment) {
        return f224463a.c(fragment);
    }
}
