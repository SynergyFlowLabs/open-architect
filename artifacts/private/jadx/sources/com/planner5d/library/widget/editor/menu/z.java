package com.planner5d.library.widget.editor.menu;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.item.ItemWall;
import com.planner5d.library.model.manager.statistics.events.o3;
import com.planner5d.library.widget.editor.helper.g1;
import com.planner5d.library.widget.editor.helper.l1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
public final class z implements com.planner5d.library.widget.menu.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f257193c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final g1 f257194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final ItemWall f257195b;

    public z(@NotNull g1 helper, @NotNull ItemWall selected) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(selected, "selected");
        this.f257194a = helper;
        this.f257195b = selected;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(z zVar) {
        zVar.f257194a.B3.q(zVar.f257195b, o3.h.toggle_show);
        l1.f256518a.s(zVar.f257194a, zVar.f257195b);
        return Unit.f312394a;
    }

    @Override // com.planner5d.library.widget.menu.h
    @NotNull
    public Function0<Unit> a() {
        return new Function0() { // from class: com.planner5d.library.widget.editor.menu.y
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return z.c(this.f257192a);
            }
        };
    }
}
