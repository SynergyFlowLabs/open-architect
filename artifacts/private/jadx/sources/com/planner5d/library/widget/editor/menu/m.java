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
public final class m implements com.planner5d.library.widget.menu.h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f257147d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final g1 f257148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Item f257149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f257150c;

    public m(@NotNull g1 helper, @NotNull Item selected, boolean z10) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(selected, "selected");
        this.f257148a = helper;
        this.f257149b = selected;
        this.f257150c = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(m mVar) {
        mVar.f257148a.B3.q(mVar.f257149b, o3.h.toggle_flip);
        if (mVar.f257148a.s(mVar.f257149b, false, t3.d.toggle_flip)) {
            l1.f256518a.n(mVar.f257148a, mVar.f257149b, mVar.f257150c);
        }
        return Unit.f312394a;
    }

    @Override // com.planner5d.library.widget.menu.h
    @NotNull
    public Function0<Unit> a() {
        return new Function0() { // from class: com.planner5d.library.widget.editor.menu.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return m.c(this.f257139a);
            }
        };
    }
}
