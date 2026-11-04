package com.planner5d.library.util.navigation.uiview;

import androidx.fragment.app.Fragment;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.activity.fragment.z;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import oj.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f f244818a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final f0 f244819b = g0.c(new Function0() { // from class: com.planner5d.library.util.navigation.uiview.d
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return f.f();
        }
    });

    private f() {
    }

    @n
    @NotNull
    public static final f0<c> c(@NotNull final Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        return g0.c(new Function0() { // from class: com.planner5d.library.util.navigation.uiview.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f.d(fragment);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g d(Fragment fragment) {
        return fragment instanceof FragmentController ? new i(fragment, f244818a.e()) : new h(fragment, f244818a.e());
    }

    private final z e() {
        return (z) f244819b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z f() {
        return new z();
    }
}
