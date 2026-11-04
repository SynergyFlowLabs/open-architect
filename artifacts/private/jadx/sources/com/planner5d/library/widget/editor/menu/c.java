package com.planner5d.library.widget.editor.menu;

import android.app.Activity;
import android.view.MenuItem;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemRoom;
import com.planner5d.library.model.manager.statistics.events.StatisticsEventAiDesigner;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
public final class c implements com.planner5d.library.widget.menu.p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f257042e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.widget.editor.facade.k0 f257043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.widget.editor.facade.e f257044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.widget.editor.facade.b f257045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final Item f257046d;

    public c(@NotNull com.planner5d.library.widget.editor.facade.k0 stateReader, @NotNull com.planner5d.library.widget.editor.facade.e contextProvider, @NotNull com.planner5d.library.widget.editor.facade.b editorActionAiDesigner, @Nullable Item item) {
        Intrinsics.checkNotNullParameter(stateReader, "stateReader");
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(editorActionAiDesigner, "editorActionAiDesigner");
        this.f257043a = stateReader;
        this.f257044b = contextProvider;
        this.f257045c = editorActionAiDesigner;
        this.f257046d = item;
    }

    @Override // com.planner5d.library.widget.menu.p
    public void a(@NotNull Activity activity, @NotNull MenuItem item) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(item, "item");
        com.planner5d.library.widget.editor.facade.b bVar = this.f257045c;
        com.planner5d.library.widget.editor.facade.k0 k0Var = this.f257043a;
        com.planner5d.library.widget.editor.facade.e eVar = this.f257044b;
        Item item2 = this.f257046d;
        bVar.k(k0Var, eVar, item2 instanceof ItemRoom ? (ItemRoom) item2 : null, StatisticsEventAiDesigner.d.toolbar);
    }
}
