package com.planner5d.library.widget.editor.menu;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.manager.statistics.events.t3;
import com.planner5d.library.widget.editor.helper.g1;
import com.planner5d.library.widget.editor.helper.l1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
public final class p implements com.planner5d.library.widget.menu.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f257160c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final g1 f257161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Item f257162b;

    public p(@NotNull g1 helper, @NotNull Item selected) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(selected, "selected");
        this.f257161a = helper;
        this.f257162b = selected;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(p pVar) {
        if (pVar.f257161a.s(pVar.f257162b, false, t3.d.item_clone)) {
            l1 l1Var = l1.f256518a;
            g1 g1Var = pVar.f257161a;
            l1Var.f(g1Var, g1Var.w1(), pVar.f257162b);
        }
        return Unit.f312394a;
    }

    @Override // com.planner5d.library.widget.menu.h
    @NotNull
    public Function0<Unit> a() {
        return new Function0() { // from class: com.planner5d.library.widget.editor.menu.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return p.c(this.f257158a);
            }
        };
    }
}
