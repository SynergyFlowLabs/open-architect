package com.planner5d.library.widget.editor.menu;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.item.ItemRoom;
import com.planner5d.library.widget.editor.helper.g1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
public final class p0 implements com.planner5d.library.widget.menu.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f257163c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final g1 f257164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final ItemRoom f257165b;

    public p0(@NotNull g1 helper, @NotNull ItemRoom room) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(room, "room");
        this.f257164a = helper;
        this.f257165b = room;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(p0 p0Var) {
        p0Var.f257164a.o1(p0Var.f257165b);
        return Unit.f312394a;
    }

    @Override // com.planner5d.library.widget.menu.h
    @NotNull
    public Function0<Unit> a() {
        return new Function0() { // from class: com.planner5d.library.widget.editor.menu.o0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return p0.c(this.f257159a);
            }
        };
    }
}
