package com.planner5d.library.widget.editor.helper.selector;

import android.graphics.PointF;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemNs;
import com.planner5d.library.model.item.ItemPr;
import com.planner5d.library.model.item.ItemWalls;
import com.planner5d.library.model.item.ItemWindow;
import com.planner5d.library.widget.editor.facade.e0;
import com.planner5d.library.widget.editor.facade.j0;
import com.planner5d.library.widget.editor.facade.w;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;
import rx.Subscriber;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nEditorItemSelectorSmartWizard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditorItemSelectorSmartWizard.kt\ncom/planner5d/library/widget/editor/helper/selector/EditorItemSelectorSmartWizard\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,103:1\n37#2,2:104\n*S KotlinDebug\n*F\n+ 1 EditorItemSelectorSmartWizard.kt\ncom/planner5d/library/widget/editor/helper/selector/EditorItemSelectorSmartWizard\n*L\n91#1:104,2\n*E\n"})
public final class g implements com.planner5d.library.widget.editor.helper.selector.a, e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f256761f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.planner5d.library.widget.editor.facade.f f256762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private j0 f256763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.planner5d.library.widget.editor.facade.e f256764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private e0 f256765d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private w f256766e;

    public static final class a extends com.planner5d.library.services.rx.e<Void> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Item f256768e;

        a(Item item) {
            this.f256768e = item;
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(Throwable th2) {
            e0 e0Var = g.this.f256765d;
            if (e0Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewController");
                e0Var = null;
            }
            e0.a.a(e0Var, false, false, 2, null);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x004c  */
        /* JADX WARN: Code duplicated, block: B:21:0x0055  */
        @Override // com.planner5d.library.services.rx.e, rx.Observer
        public void onCompleted() {
            w wVar;
            j0 j0Var = g.this.f256763b;
            if (j0Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("stateAccessor");
                j0Var = null;
            }
            if (j0Var.getModel() == null) {
                wVar = g.this.f256766e;
                if (wVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("supportingViewsController");
                    wVar = null;
                }
                wVar.o();
            } else {
                j0 j0Var2 = g.this.f256763b;
                if (j0Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("stateAccessor");
                    j0Var2 = null;
                }
                if (j0Var2.getItem() == null || this.f256768e == null) {
                    wVar = g.this.f256766e;
                    if (wVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("supportingViewsController");
                        wVar = null;
                    }
                    wVar.o();
                } else {
                    w wVar2 = g.this.f256766e;
                    if (wVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("supportingViewsController");
                        wVar2 = null;
                    }
                    wVar2.L(this.f256768e);
                }
            }
            onError(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(g gVar, Item[] itemArr) {
        try {
            gVar.t(itemArr.length != 1 ? null : itemArr[0], true);
        } catch (Throwable th2) {
            timber.log.b.f381052a.e(th2);
        }
    }

    @Override // com.planner5d.library.widget.editor.helper.selector.a
    public boolean B(@Nullable Item item) {
        return item instanceof ItemWindow;
    }

    @Override // com.planner5d.library.widget.editor.helper.selector.a
    @NotNull
    public Observable<Void> M(@NotNull PointF point, @Nullable Item[] itemArr) {
        Intrinsics.checkNotNullParameter(point, "point");
        com.planner5d.library.widget.editor.facade.f fVar = this.f256762a;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dataProvider");
            fVar = null;
        }
        if (fVar.z1()) {
            Observable<Void> observableEmpty = Observable.empty();
            Intrinsics.checkNotNullExpressionValue(observableEmpty, "empty(...)");
            return observableEmpty;
        }
        LinkedList linkedList = new LinkedList();
        if (itemArr != null) {
            Iterator itA = i.a(itemArr);
            while (itA.hasNext()) {
                Item item = (Item) itA.next();
                if (B(item)) {
                    linkedList.add(item);
                }
            }
        }
        final Item[] itemArr2 = (Item[]) linkedList.toArray(new Item[0]);
        Observable<Void> observableSubscribeOn = com.planner5d.library.services.rx.i.i(new Runnable() { // from class: com.planner5d.library.widget.editor.helper.selector.f
            @Override // java.lang.Runnable
            public final void run() {
                g.g(this.f256759a, itemArr2);
            }
        }).subscribeOn(com.planner5d.library.services.rx.c.f224934d);
        Intrinsics.checkNotNullExpressionValue(observableSubscribeOn, "subscribeOn(...)");
        return observableSubscribeOn;
    }

    @Override // com.planner5d.library.widget.editor.helper.selector.e
    public void a(@NotNull com.planner5d.library.widget.editor.facade.e contextProvider, @NotNull com.planner5d.library.widget.editor.facade.f dataProvider, @NotNull j0 stateAccessor, @NotNull e0 viewController, @NotNull w supportingViewsController) {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(dataProvider, "dataProvider");
        Intrinsics.checkNotNullParameter(stateAccessor, "stateAccessor");
        Intrinsics.checkNotNullParameter(viewController, "viewController");
        Intrinsics.checkNotNullParameter(supportingViewsController, "supportingViewsController");
        this.f256762a = dataProvider;
        this.f256763b = stateAccessor;
        this.f256764c = contextProvider;
        this.f256765d = viewController;
        this.f256766e = supportingViewsController;
    }

    @Override // com.planner5d.library.widget.editor.helper.selector.a
    public void d(@Nullable Item item) {
        Observable<Void> observableI;
        Observable<Void> observableObserveOn;
        com.planner5d.library.widget.editor.facade.f fVar = this.f256762a;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dataProvider");
            fVar = null;
        }
        if (fVar.z1()) {
            return;
        }
        j0 j0Var = this.f256763b;
        if (j0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateAccessor");
            j0Var = null;
        }
        com.planner5d.library.widget.editor.a aVarB = j0Var.b();
        e0 e0Var = this.f256765d;
        if (e0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewController");
            e0Var = null;
        }
        e0.a.a(e0Var, true, false, 2, null);
        if (aVarB == null || (observableI = aVarB.i(item)) == null || (observableObserveOn = observableI.observeOn(com.planner5d.library.services.rx.c.f224934d)) == null) {
            return;
        }
        observableObserveOn.subscribe((Subscriber<? super Void>) new a(item));
    }

    @Override // com.planner5d.library.widget.editor.helper.selector.a
    public void p(@Nullable String str) {
    }

    @Override // com.planner5d.library.widget.editor.helper.selector.a
    public void t(@Nullable Item item, boolean z10) {
        j0 j0Var = this.f256763b;
        if (j0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateAccessor");
            j0Var = null;
        }
        com.planner5d.library.widget.editor.a aVarB = j0Var.b();
        Item selectedItem = aVarB != null ? aVarB.getSelectedItem() : null;
        if (!B(item) || (z10 && (item instanceof ItemWalls) && ((selectedItem instanceof ItemNs) || (selectedItem instanceof ItemPr)))) {
            d(null);
        } else {
            d(item);
        }
    }
}
