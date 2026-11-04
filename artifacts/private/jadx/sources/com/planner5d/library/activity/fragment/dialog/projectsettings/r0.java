package com.planner5d.library.activity.fragment.dialog.projectsettings;

import com.planner5d.library.model.manager.statistics.events.o3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final r0 f132299a = new r0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f132300b = 0;

    private r0() {
    }

    @NotNull
    public final o3.k a(@NotNull com.planner5d.library.widget.editor.a.c option) {
        Intrinsics.checkNotNullParameter(option, "option");
        com.planner5d.library.widget.editor.a.C1721a c1721a = com.planner5d.library.widget.editor.a.f254298t2;
        if (Intrinsics.areEqual(option, c1721a.e())) {
            return o3.k.toggle_objects;
        }
        if (Intrinsics.areEqual(option, c1721a.c())) {
            return o3.k.toggle_measurements;
        }
        if (Intrinsics.areEqual(option, c1721a.k())) {
            return o3.k.toggle_target_lines;
        }
        if (!Intrinsics.areEqual(option, c1721a.i()) && !Intrinsics.areEqual(option, c1721a.j())) {
            if (Intrinsics.areEqual(option, c1721a.d())) {
                return o3.k.move_walls_one_direction;
            }
            if (Intrinsics.areEqual(option, c1721a.f())) {
                return o3.k.camera_on_ground;
            }
            if (Intrinsics.areEqual(option, c1721a.m())) {
                return o3.k.joystick;
            }
            if (Intrinsics.areEqual(option, c1721a.b())) {
                return o3.k.lock_walls;
            }
            if (!Intrinsics.areEqual(option, c1721a.h()) && !Intrinsics.areEqual(option, c1721a.g())) {
                return o3.k.other;
            }
            return o3.k.grid;
        }
        return o3.k.snapping;
    }

    public final boolean b(@NotNull com.planner5d.library.widget.editor.projectresources.viewoptions.b viewOptions, @NotNull com.planner5d.library.widget.editor.a.c option) {
        Intrinsics.checkNotNullParameter(viewOptions, "viewOptions");
        Intrinsics.checkNotNullParameter(option, "option");
        com.planner5d.library.widget.editor.a.C1721a c1721a = com.planner5d.library.widget.editor.a.f254298t2;
        if (Intrinsics.areEqual(option, c1721a.e())) {
            return viewOptions.f258070a;
        }
        if (Intrinsics.areEqual(option, c1721a.c())) {
            return viewOptions.f258071b;
        }
        if (Intrinsics.areEqual(option, c1721a.k())) {
            return viewOptions.f258072c;
        }
        if (Intrinsics.areEqual(option, c1721a.i())) {
            return viewOptions.f258074e;
        }
        if (Intrinsics.areEqual(option, c1721a.j())) {
            return viewOptions.f258075f;
        }
        if (Intrinsics.areEqual(option, c1721a.d())) {
            return viewOptions.f258076g;
        }
        if (Intrinsics.areEqual(option, c1721a.f())) {
            return viewOptions.f258077h;
        }
        if (Intrinsics.areEqual(option, c1721a.l())) {
            return viewOptions.f258081l;
        }
        if (Intrinsics.areEqual(option, c1721a.m())) {
            return viewOptions.f258083n;
        }
        if (Intrinsics.areEqual(option, c1721a.b())) {
            return viewOptions.f258073d;
        }
        if (Intrinsics.areEqual(option, c1721a.h())) {
            return viewOptions.f258079j;
        }
        if (Intrinsics.areEqual(option, c1721a.g())) {
            return viewOptions.f258078i;
        }
        return false;
    }

    @NotNull
    public final com.planner5d.library.widget.editor.projectresources.viewoptions.b.a c(@NotNull com.planner5d.library.widget.editor.projectresources.viewoptions.b old, @NotNull com.planner5d.library.widget.editor.a.c option, boolean z10) {
        Intrinsics.checkNotNullParameter(old, "old");
        Intrinsics.checkNotNullParameter(option, "option");
        com.planner5d.library.widget.editor.projectresources.viewoptions.b.a aVar = new com.planner5d.library.widget.editor.projectresources.viewoptions.b.a(old);
        com.planner5d.library.widget.editor.a.C1721a c1721a = com.planner5d.library.widget.editor.a.f254298t2;
        if (Intrinsics.areEqual(option, c1721a.e())) {
            aVar.k(z10);
            return aVar;
        }
        if (Intrinsics.areEqual(option, c1721a.c())) {
            aVar.h(z10);
            return aVar;
        }
        if (Intrinsics.areEqual(option, c1721a.k())) {
            aVar.o(z10);
            return aVar;
        }
        if (Intrinsics.areEqual(option, c1721a.i())) {
            aVar.m(z10);
            return aVar;
        }
        if (Intrinsics.areEqual(option, c1721a.j())) {
            aVar.n(z10);
            return aVar;
        }
        if (Intrinsics.areEqual(option, c1721a.d())) {
            aVar.i(z10);
            return aVar;
        }
        if (Intrinsics.areEqual(option, c1721a.f())) {
            aVar.l(z10);
            return aVar;
        }
        if (Intrinsics.areEqual(option, c1721a.l())) {
            aVar.p(z10);
            return aVar;
        }
        if (Intrinsics.areEqual(option, c1721a.m())) {
            aVar.q(z10);
            return aVar;
        }
        if (Intrinsics.areEqual(option, c1721a.b())) {
            aVar.g(z10);
            return aVar;
        }
        if (Intrinsics.areEqual(option, c1721a.h())) {
            aVar.f(z10);
            return aVar;
        }
        if (Intrinsics.areEqual(option, c1721a.g())) {
            aVar.d(z10);
        }
        return aVar;
    }
}
