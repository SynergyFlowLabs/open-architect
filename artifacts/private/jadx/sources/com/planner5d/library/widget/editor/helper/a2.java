package com.planner5d.library.widget.editor.helper;

import android.content.ClipData;
import android.view.DragEvent;
import android.view.View;
import com.planner5d.library.model.item.builder.ItemBuilder;
import com.planner5d.library.model.item.catalog.CatalogItem;
import com.planner5d.library.widget.EditTextWithValidator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@ij.f
@SourceDebugExtension({"SMAP\nHelperEditorDragItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelperEditorDragItem.kt\ncom/planner5d/library/widget/editor/helper/HelperEditorDragItem\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,73:1\n1#2:74\n*E\n"})
public final class a2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f256182d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private View f256183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<WeakReference<EditTextWithValidator>> f256184b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f256185c;

    @ij.a
    public a2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(a2 a2Var, WeakReference weakReference, View view, DragEvent dragEvent) {
        Integer numValueOf = dragEvent != null ? Integer.valueOf(dragEvent.getAction()) : null;
        if (numValueOf != null && numValueOf.intValue() == 1) {
            a2Var.h(weakReference);
            Unit unit = Unit.f312394a;
            return true;
        }
        if (numValueOf != null && numValueOf.intValue() == 3) {
            g1 g1Var = (g1) weakReference.get();
            if (g1Var != null) {
                return a2Var.f(g1Var, dragEvent);
            }
            return true;
        }
        if (numValueOf != null && numValueOf.intValue() == 4) {
            a2Var.g();
            Unit unit2 = Unit.f312394a;
        }
        return false;
    }

    private final boolean f(g1 g1Var, DragEvent dragEvent) {
        Boolean boolD1 = g1Var.d1(dragEvent.getClipData(), dragEvent.getX(), dragEvent.getY(), this.f256185c ? com.planner5d.library.model.manager.statistics.events.o3.g.catalog_search_drag : com.planner5d.library.model.manager.statistics.events.o3.g.catalog_drag);
        Intrinsics.checkNotNullExpressionValue(boolD1, "addItemBlocking(...)");
        return boolD1.booleanValue();
    }

    private final void g() {
        i(false);
        this.f256183a = null;
    }

    private final void h(WeakReference<g1> weakReference) {
        e eVar;
        g1 g1Var = weakReference.get();
        if (g1Var != null && (eVar = g1Var.f256340p1) != null) {
            eVar.g(null);
        }
        i(true);
    }

    private final void i(boolean z10) {
        Iterator<WeakReference<EditTextWithValidator>> it = this.f256184b.iterator();
        while (it.hasNext()) {
            EditTextWithValidator editTextWithValidator = it.next().get();
            if (editTextWithValidator != null) {
                editTextWithValidator.setDragEnabled(!z10);
            } else {
                it.remove();
            }
        }
    }

    public final void b(@NotNull EditTextWithValidator editText) {
        Intrinsics.checkNotNullParameter(editText, "editText");
        Iterator<WeakReference<EditTextWithValidator>> it = this.f256184b.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(it.next().get(), editText)) {
                return;
            }
        }
        this.f256184b.add(new WeakReference<>(editText));
    }

    @NotNull
    public final View.OnDragListener c(@NotNull g1 helper) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        final WeakReference weakReference = new WeakReference(helper);
        return new View.OnDragListener() { // from class: com.planner5d.library.widget.editor.helper.z1
            @Override // android.view.View.OnDragListener
            public final boolean onDrag(View view, DragEvent dragEvent) {
                return a2.d(this.f256877a, weakReference, view, dragEvent);
            }
        };
    }

    public final boolean e(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return Intrinsics.areEqual(view, this.f256183a);
    }

    public final void j(@NotNull View view, @NotNull CatalogItem item, @NotNull View.DragShadowBuilder dragShadowBuilder, boolean z10) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(dragShadowBuilder, "dragShadowBuilder");
        this.f256183a = view;
        this.f256185c = z10;
        view.startDrag(ClipData.newRawUri(item.f180761id, ItemBuilder.createItemUri(item)), dragShadowBuilder, null, 0);
    }
}
