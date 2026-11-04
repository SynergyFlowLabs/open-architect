package com.planner5d.library.widget.editor.menu;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.manager.statistics.events.t3;
import com.planner5d.library.widget.editor.helper.g1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
public final class n0 implements com.planner5d.library.widget.menu.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f257155c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final g1 f257156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Item f257157b;

    public n0(@NotNull g1 helper, @NotNull Item selected) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(selected, "selected");
        this.f257156a = helper;
        this.f257157b = selected;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(n0 n0Var) {
        n0Var.f257156a.B3.p(n0Var.f257157b);
        if (n0Var.f257156a.s(n0Var.f257157b, true, t3.d.on_item_edit)) {
            n0Var.f257156a.f3(n0Var.f257157b);
        }
        return Unit.f312394a;
    }

    @Override // com.planner5d.library.widget.menu.h
    @NotNull
    public Function0<Unit> a() {
        return new Function0() { // from class: com.planner5d.library.widget.editor.menu.m0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n0.c(this.f257151a);
            }
        };
    }
}
