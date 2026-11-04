package com.planner5d.library.util.navigation;

import android.os.Bundle;
import androidx.fragment.app.FragmentContainerView;
import androidx.navigation.fragment.q;
import androidx.navigation.w0;
import androidx.navigation.y1;
import com.planner5d.library.model.manager.statistics.d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class j {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(d0 d0Var, w0 w0Var, y1 destination, Bundle bundle) {
        Intrinsics.checkNotNullParameter(w0Var, "<unused var>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (!(destination instanceof q.c)) {
            timber.log.b.f381052a.d("Can not track screen for statistics - wrong destination class", new Object[0]);
            return;
        }
        try {
            String strV0 = ((q.c) destination).v0();
            try {
                Class<?> cls = Class.forName(strV0);
                Intrinsics.checkNotNull(cls);
                d0Var.a(cls);
            } catch (Exception unused) {
                timber.log.b.f381052a.d("Can not track screen for statistics - no proper destination class found: " + strV0, new Object[0]);
            }
        } catch (IllegalStateException unused2) {
            timber.log.b.f381052a.d("Can not track screen for statistics - no class name provided for a target destination", new Object[0]);
        }
    }

    public final void b(@NotNull FragmentContainerView navigationHost) {
        Intrinsics.checkNotNullParameter(navigationHost, "navigationHost");
        final d0 d0VarA = com.planner5d.library.model.manager.statistics.a.f198140a.a(navigationHost).a();
        k.f240224a.a(navigationHost).j(new w0.c() { // from class: com.planner5d.library.util.navigation.i
            @Override // androidx.navigation.w0.c
            public final void a(w0 w0Var, y1 y1Var, Bundle bundle) {
                j.c(d0VarA, w0Var, y1Var, bundle);
            }
        });
    }
}
