package com.planner5d.library.widget.editor.helper.selector;

import android.content.Context;
import android.graphics.PointF;
import androidx.compose.runtime.internal.w0;
import androidx.fragment.app.Fragment;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemEarth;
import com.planner5d.library.model.item.ItemNs;
import com.planner5d.library.model.item.ItemPoint;
import com.planner5d.library.model.item.ItemPr;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.item.ItemRuler;
import com.planner5d.library.model.item.ItemUnknown;
import com.planner5d.library.model.item.ItemWall;
import com.planner5d.library.model.item.ItemWalls;
import com.planner5d.library.model.item.ItemWindow;
import com.planner5d.library.model.manager.k1;
import com.planner5d.library.widget.editor.facade.e0;
import com.planner5d.library.widget.editor.facade.j0;
import com.planner5d.library.widget.editor.facade.w;
import com.planner5d.library.widget.editor.helper.n1;
import com.planner5d.library.widget.editor.popup.itemselect.ItemSelectChooserDialog;
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
@SourceDebugExtension({"SMAP\nEditorItemSelectorDefault.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditorItemSelectorDefault.kt\ncom/planner5d/library/widget/editor/helper/selector/EditorItemSelectorDefault\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,152:1\n37#2,2:153\n*S KotlinDebug\n*F\n+ 1 EditorItemSelectorDefault.kt\ncom/planner5d/library/widget/editor/helper/selector/EditorItemSelectorDefault\n*L\n116#1:153,2\n*E\n"})
public final class c implements com.planner5d.library.widget.editor.helper.selector.a, e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f256746h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final k1 f256747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final n1 f256748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.planner5d.library.widget.editor.facade.f f256749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private j0 f256750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.planner5d.library.widget.editor.facade.e f256751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private e0 f256752f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private w f256753g;

    public static final class a extends com.planner5d.library.services.rx.e<Void> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Item f256755e;

        a(Item item) {
            this.f256755e = item;
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(Throwable th2) {
            e0 e0Var = c.this.f256752f;
            if (e0Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewController");
                e0Var = null;
            }
            e0Var.h(false, false);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x004d  */
        /* JADX WARN: Code duplicated, block: B:21:0x0056  */
        @Override // com.planner5d.library.services.rx.e, rx.Observer
        public void onCompleted() {
            w wVar;
            j0 j0Var = c.this.f256750d;
            if (j0Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("stateAccessor");
                j0Var = null;
            }
            if (j0Var.getModel() == null) {
                wVar = c.this.f256753g;
                if (wVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("supportingViewsController");
                    wVar = null;
                }
                wVar.o();
            } else {
                j0 j0Var2 = c.this.f256750d;
                if (j0Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("stateAccessor");
                    j0Var2 = null;
                }
                if (j0Var2.getItem() == null || this.f256755e == null) {
                    wVar = c.this.f256753g;
                    if (wVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("supportingViewsController");
                        wVar = null;
                    }
                    wVar.o();
                } else {
                    w wVar2 = c.this.f256753g;
                    if (wVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("supportingViewsController");
                        wVar2 = null;
                    }
                    wVar2.L(this.f256755e);
                }
            }
            c.this.f256748b.h(this.f256755e);
            onError(null);
        }
    }

    public static final class b implements ItemSelectChooserDialog.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ItemSelectChooserDialog f256757b;

        b(ItemSelectChooserDialog itemSelectChooserDialog) {
            this.f256757b = itemSelectChooserDialog;
        }

        @Override // com.planner5d.library.widget.editor.popup.itemselect.ItemSelectChooserDialog.c
        public void a(Item item) {
            c.this.t(item, false);
            this.f256757b.dismiss();
        }
    }

    public c(@NotNull k1 itemManager, @NotNull n1 helperEditorAiChat) {
        Intrinsics.checkNotNullParameter(itemManager, "itemManager");
        Intrinsics.checkNotNullParameter(helperEditorAiChat, "helperEditorAiChat");
        this.f256747a = itemManager;
        this.f256748b = helperEditorAiChat;
    }

    private final boolean h(Item item) {
        return (item instanceof ItemPoint) && (((ItemPoint) item).getParentItem() instanceof ItemRuler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(Item[] itemArr, c cVar) {
        try {
            com.planner5d.library.widget.editor.facade.e eVar = null;
            Item item = null;
            if (itemArr.length < 2) {
                if (itemArr.length == 1) {
                    item = itemArr[0];
                }
                cVar.t(item, true);
                return;
            }
            com.planner5d.library.widget.editor.facade.e eVar2 = cVar.f256751e;
            if (eVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contextProvider");
            } else {
                eVar = eVar2;
            }
            Fragment fragmentI = eVar.i();
            if (fragmentI != null) {
                ItemSelectChooserDialog itemSelectChooserDialog = new ItemSelectChooserDialog();
                itemSelectChooserDialog.setOnItemChosenListener(cVar.new b(itemSelectChooserDialog));
                Context contextRequireContext = fragmentI.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                itemSelectChooserDialog.createList(contextRequireContext, cVar.f256747a, itemArr);
                itemSelectChooserDialog.show(fragmentI.getChildFragmentManager(), "aa");
            }
        } catch (Throwable th2) {
            timber.log.b.f381052a.e(th2);
        }
    }

    @Override // com.planner5d.library.widget.editor.helper.selector.a
    public boolean B(@Nullable Item item) {
        if (item == null || (item instanceof ItemEarth)) {
            return false;
        }
        if (!(item instanceof ItemWalls) && !(item instanceof ItemWall)) {
            com.planner5d.library.widget.editor.facade.f fVar = this.f256749c;
            com.planner5d.library.widget.editor.facade.f fVar2 = null;
            if (fVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dataProvider");
                fVar = null;
            }
            com.planner5d.library.widget.editor.projectresources.viewoptions.b bVarG1 = fVar.G1();
            if (bVarG1 != null && bVarG1.g()) {
                if (!h(item)) {
                    if (bVarG1.f258070a && (item instanceof ItemNs)) {
                        if (!(item instanceof ItemWindow)) {
                            com.planner5d.library.widget.editor.facade.f fVar3 = this.f256749c;
                            if (fVar3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("dataProvider");
                            } else {
                                fVar2 = fVar3;
                            }
                            if (fVar2.C1(((ItemNs) item).getModelId())) {
                            }
                        }
                    }
                    return false;
                }
                return true;
            }
            if (!(item instanceof ItemPoint) && (bVarG1 == null || !bVarG1.f258070a || (!(item instanceof ItemNs) && !(item instanceof ItemPr) && !(item instanceof ItemUnknown)))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.planner5d.library.widget.editor.helper.selector.a
    @NotNull
    public Observable<Void> M(@NotNull PointF point, @Nullable Item[] itemArr) {
        Intrinsics.checkNotNullParameter(point, "point");
        com.planner5d.library.widget.editor.facade.f fVar = this.f256749c;
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
        Observable<Void> observableSubscribeOn = com.planner5d.library.services.rx.i.i(new Runnable() { // from class: com.planner5d.library.widget.editor.helper.selector.b
            @Override // java.lang.Runnable
            public final void run() {
                c.i(itemArr2, this);
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
        this.f256749c = dataProvider;
        this.f256750d = stateAccessor;
        this.f256751e = contextProvider;
        this.f256752f = viewController;
        this.f256753g = supportingViewsController;
    }

    @Override // com.planner5d.library.widget.editor.helper.selector.a
    public void d(@Nullable Item item) {
        Observable<Void> observableI;
        Observable<Void> observableObserveOn;
        com.planner5d.library.widget.editor.facade.f fVar = this.f256749c;
        e0 e0Var = null;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dataProvider");
            fVar = null;
        }
        if (fVar.z1()) {
            return;
        }
        j0 j0Var = this.f256750d;
        if (j0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateAccessor");
            j0Var = null;
        }
        com.planner5d.library.widget.editor.a aVarB = j0Var.b();
        e0 e0Var2 = this.f256752f;
        if (e0Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewController");
        } else {
            e0Var = e0Var2;
        }
        e0Var.h(true, true);
        if (aVarB == null || (observableI = aVarB.i(item)) == null || (observableObserveOn = observableI.observeOn(com.planner5d.library.services.rx.c.f224934d)) == null) {
            return;
        }
        observableObserveOn.subscribe((Subscriber<? super Void>) new a(item));
    }

    @Override // com.planner5d.library.widget.editor.helper.selector.a
    public void p(@Nullable String str) {
        j0 j0Var = this.f256750d;
        if (j0Var == null) {
            return;
        }
        j0 j0Var2 = null;
        if (j0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateAccessor");
            j0Var = null;
        }
        if (j0Var.getItem() == null) {
            j0 j0Var3 = this.f256750d;
            if (j0Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("stateAccessor");
            } else {
                j0Var2 = j0Var3;
            }
            j0Var2.k(str);
            return;
        }
        j0 j0Var4 = this.f256750d;
        if (j0Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateAccessor");
            j0Var4 = null;
        }
        ItemProject item = j0Var4.getItem();
        d(item != null ? item.getChild(str) : null);
    }

    @Override // com.planner5d.library.widget.editor.helper.selector.a
    public void t(@Nullable Item item, boolean z10) {
        j0 j0Var = this.f256750d;
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
