package com.planner5d.library.widget.editor.menu;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.manager.statistics.events.o3;
import com.planner5d.library.model.manager.statistics.events.t3;
import com.planner5d.library.widget.editor.helper.g1;
import com.planner5d.library.widget.editor.helper.l1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
public final class c0 implements com.planner5d.library.widget.menu.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f257047c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final g1 f257048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Item f257049b;

    public c0(@NotNull g1 helper, @NotNull Item selected) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(selected, "selected");
        this.f257048a = helper;
        this.f257049b = selected;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(c0 c0Var) {
        c0Var.f257048a.B3.q(c0Var.f257049b, o3.h.toggle_closed);
        if (c0Var.f257048a.s(c0Var.f257049b, false, t3.d.toggle_closed)) {
            l1.f256518a.r(c0Var.f257048a, c0Var.f257049b);
        }
        return Unit.f312394a;
    }

    @Override // com.planner5d.library.widget.menu.h
    @NotNull
    public Function0<Unit> a() {
        return new Function0() { // from class: com.planner5d.library.widget.editor.menu.b0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return c0.c(this.f257041a);
            }
        };
    }
}
