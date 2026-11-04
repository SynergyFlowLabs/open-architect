package com.planner5d.library.widget.editor.controls;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.o0;
import com.planner5d.library.engine.input.f;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.widget.editor.helper.e;
import com.planner5d.library.widget.editor.helper.g1;
import com.planner5d.library.widget.editor.helper.l1;
import com.planner5d.library.widget.event.directional.g;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@w0(parameters = 0)
public final class b implements com.planner5d.library.widget.editor.controls.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f254716e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<Integer> f254717a = CollectionsKt.listOf((Object[]) new Integer[]{4, 31, 50, 67, 54, 53, 52, Integer.valueOf(f.b.B)});

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private g1 f254718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private g f254719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private e f254720d;

    public static final class a implements DefaultLifecycleObserver {
        a() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onDestroy(o0 owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            b.this.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        this.f254718b = null;
        this.f254719c = null;
        this.f254720d = null;
    }

    private final boolean g(KeyEvent keyEvent, int i10) {
        ItemProject itemProjectW1;
        Item selectedItem;
        g1 g1Var = this.f254718b;
        if (g1Var == null || (itemProjectW1 = g1Var.w1()) == null) {
            return false;
        }
        if (keyEvent != null && keyEvent.isCtrlPressed()) {
            if (i10 == 50) {
                l1.f256518a.o(g1Var, itemProjectW1);
                return true;
            }
            if (i10 == 53) {
                l1.f256518a.p(g1Var);
                return true;
            }
            if (i10 == 54) {
                if (keyEvent.isShiftPressed()) {
                    l1.f256518a.p(g1Var);
                } else {
                    l1.f256518a.t(g1Var);
                }
                return true;
            }
        }
        com.planner5d.library.widget.editor.a aVarS1 = g1Var.s1();
        if (aVarS1 == null || (selectedItem = aVarS1.getSelectedItem()) == null || i10 == 4) {
            return false;
        }
        if (i10 != 31) {
            if (i10 != 52) {
                if (i10 != 67 && i10 != 112) {
                    g gVar = this.f254719c;
                    if (gVar != null) {
                        return gVar.onKey(null, i10, keyEvent);
                    }
                    return false;
                }
                e eVar = this.f254720d;
                if (eVar == null || !eVar.y()) {
                    l1.f256518a.k(g1Var, itemProjectW1, selectedItem);
                }
            } else if (keyEvent != null && keyEvent.isCtrlPressed()) {
                l1.f256518a.j(g1Var, itemProjectW1, selectedItem);
            }
        } else if (keyEvent != null && keyEvent.isCtrlPressed()) {
            l1.f256518a.i(itemProjectW1, selectedItem);
        }
        return true;
    }

    @Override // com.planner5d.library.widget.editor.controls.a
    public boolean a(@Nullable MotionEvent motionEvent) {
        boolean z10 = false;
        if (motionEvent != null && motionEvent.getAction() == 8 && motionEvent.getToolType(0) == 3) {
            z10 = true;
        }
        return z10;
    }

    @Override // com.planner5d.library.widget.editor.controls.a
    public boolean b(@Nullable KeyEvent keyEvent, int i10) {
        g gVar;
        if (i10 != 4 && (gVar = this.f254719c) != null) {
            return gVar.onKey(null, i10, keyEvent);
        }
        return false;
    }

    @Override // com.planner5d.library.widget.editor.controls.a
    public boolean c(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        g gVar = this.f254719c;
        if (gVar != null) {
            gVar.i(1 + (event.getAxisValue(9) * 0.1f));
            gVar.i(0.0d);
        }
        return true;
    }

    @Override // com.planner5d.library.widget.editor.controls.a
    public boolean d(@Nullable KeyEvent keyEvent, int i10) {
        if (this.f254717a.contains(Integer.valueOf(i10))) {
            return g(keyEvent, i10);
        }
        g gVar = this.f254719c;
        if (gVar != null) {
            return gVar.onKey(null, i10, keyEvent);
        }
        return false;
    }

    public final void h(@NotNull g1 helperEditor, @NotNull g handlers, @NotNull e bottomMenuHelper) {
        Intrinsics.checkNotNullParameter(helperEditor, "helperEditor");
        Intrinsics.checkNotNullParameter(handlers, "handlers");
        Intrinsics.checkNotNullParameter(bottomMenuHelper, "bottomMenuHelper");
        this.f254718b = helperEditor;
        this.f254719c = handlers;
        this.f254720d = bottomMenuHelper;
        helperEditor.getLifecycle().c(new a());
    }
}
