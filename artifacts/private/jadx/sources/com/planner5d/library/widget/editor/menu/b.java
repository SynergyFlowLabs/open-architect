package com.planner5d.library.widget.editor.menu;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.item.ItemRoom;
import com.planner5d.library.model.manager.statistics.events.StatisticsEventAiDesigner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
public final class b implements com.planner5d.library.widget.menu.h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f257036e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.widget.editor.facade.k0 f257037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.widget.editor.facade.e f257038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.widget.editor.facade.b f257039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final ItemRoom f257040d;

    public b(@NotNull com.planner5d.library.widget.editor.facade.k0 stateReader, @NotNull com.planner5d.library.widget.editor.facade.e contextProvider, @NotNull com.planner5d.library.widget.editor.facade.b editorActionAiDesigner, @NotNull ItemRoom selected) {
        Intrinsics.checkNotNullParameter(stateReader, "stateReader");
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(editorActionAiDesigner, "editorActionAiDesigner");
        Intrinsics.checkNotNullParameter(selected, "selected");
        this.f257037a = stateReader;
        this.f257038b = contextProvider;
        this.f257039c = editorActionAiDesigner;
        this.f257040d = selected;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(b bVar) {
        bVar.f257039c.k(bVar.f257037a, bVar.f257038b, bVar.f257040d, StatisticsEventAiDesigner.d.action_bar);
        return Unit.f312394a;
    }

    @Override // com.planner5d.library.widget.menu.h
    @NotNull
    public Function0<Unit> a() {
        return new Function0() { // from class: com.planner5d.library.widget.editor.menu.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b.c(this.f257033a);
            }
        };
    }
}
