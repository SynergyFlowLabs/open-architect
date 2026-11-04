package com.planner5d.library.widget.editor.helper;

import android.content.ClipData;
import android.graphics.PointF;
import android.graphics.RectF;
import android.net.Uri;
import android.view.View;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemFloor;
import com.planner5d.library.model.item.ItemLayout;
import com.planner5d.library.model.item.ItemMaterialSet;
import com.planner5d.library.model.item.ItemNs;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.item.ProviderUid;
import com.planner5d.library.model.item.builder.ItemBuilder;
import com.planner5d.library.model.item.catalog.CatalogItem;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nHelperEditorAddItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelperEditorAddItem.kt\ncom/planner5d/library/widget/editor/helper/HelperEditorAddItem\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,125:1\n1#2:126\n*E\n"})
public final class m1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f256532i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final g1 f256533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.widget.editor.facade.h f256534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final ItemBuilder f256535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final ProviderUid f256536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final ItemLayout f256537e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final com.planner5d.library.widget.rate.g f256538f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.t1 f256539g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f256540h;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.helper.HelperEditorAddItem", f = "HelperEditorAddItem.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160707m}, m = "addItem", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f256541a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f256543c;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f256541a = obj;
            this.f256543c |= Integer.MIN_VALUE;
            int i10 = 6 ^ 0;
            return m1.this.f(null, 0.0f, 0.0f, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.helper.HelperEditorAddItem$addItemBlocking$1", f = "HelperEditorAddItem.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f256544a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f256546c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ CatalogItem f256547d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ItemMaterialSet f256548e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.manager.statistics.events.o3.g f256549f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(View view, CatalogItem catalogItem, ItemMaterialSet itemMaterialSet, com.planner5d.library.model.manager.statistics.events.o3.g gVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f256546c = view;
            this.f256547d = catalogItem;
            this.f256548e = itemMaterialSet;
            this.f256549f = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return m1.this.new b(this.f256546c, this.f256547d, this.f256548e, this.f256549f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f256544a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            m1 m1Var = m1.this;
            View view = this.f256546c;
            CatalogItem catalogItem = this.f256547d;
            ItemMaterialSet itemMaterialSet = this.f256548e;
            com.planner5d.library.model.manager.statistics.events.o3.g gVar = this.f256549f;
            this.f256544a = 1;
            Object objG = m1Var.g(view, catalogItem, itemMaterialSet, gVar, this);
            return objG == objL ? objL : objG;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.helper.HelperEditorAddItem$addItemBlocking$2", f = "HelperEditorAddItem.kt", i = {}, l = {64}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f256550a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ClipData f256552c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f256553d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f256554e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.manager.statistics.events.o3.g f256555f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ClipData clipData, float f10, float f11, com.planner5d.library.model.manager.statistics.events.o3.g gVar, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f256552c = clipData;
            this.f256553d = f10;
            this.f256554e = f11;
            this.f256555f = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return m1.this.new c(this.f256552c, this.f256553d, this.f256554e, this.f256555f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f256550a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            m1 m1Var = m1.this;
            ClipData clipData = this.f256552c;
            float f10 = this.f256553d;
            float f11 = this.f256554e;
            com.planner5d.library.model.manager.statistics.events.o3.g gVar = this.f256555f;
            this.f256550a = 1;
            Object objF = m1Var.f(clipData, f10, f11, gVar, this);
            return objF == objL ? objL : objF;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.helper.HelperEditorAddItem", f = "HelperEditorAddItem.kt", i = {0}, l = {com.planner5d.library.engine.input.f.b.f160708m0}, m = "addItemFromUri", n = {"source"}, s = {"L$0"})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f256556a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f256557b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f256558c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f256559d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f256560e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f256562g;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f256560e = obj;
            this.f256562g |= Integer.MIN_VALUE;
            int i10 = 6 & 0;
            return m1.this.j(null, null, null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.helper.HelperEditorAddItem", f = "HelperEditorAddItem.kt", i = {0}, l = {75}, m = "addItemFromUri", n = {"source"}, s = {"L$0"})
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f256563a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f256564b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f256565c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f256566d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f256567e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f256569g;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f256567e = obj;
            this.f256569g |= Integer.MIN_VALUE;
            int i10 = 5 >> 0;
            return m1.this.k(null, null, 0.0f, null, null, this);
        }
    }

    public m1(@NotNull g1 helperEditor, @NotNull com.planner5d.library.widget.editor.facade.h facade, @Nullable ItemBuilder itemBuilder, @NotNull ProviderUid providerUid, @NotNull ItemLayout itemLayout, @Nullable com.planner5d.library.widget.rate.g gVar, @NotNull com.planner5d.library.model.manager.t1 logRecordManager) {
        Intrinsics.checkNotNullParameter(helperEditor, "helperEditor");
        Intrinsics.checkNotNullParameter(facade, "facade");
        Intrinsics.checkNotNullParameter(providerUid, "providerUid");
        Intrinsics.checkNotNullParameter(itemLayout, "itemLayout");
        Intrinsics.checkNotNullParameter(logRecordManager, "logRecordManager");
        this.f256533a = helperEditor;
        this.f256534b = facade;
        this.f256535c = itemBuilder;
        this.f256536d = providerUid;
        this.f256537e = itemLayout;
        this.f256538f = gVar;
        this.f256539g = logRecordManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    public final Object f(ClipData clipData, float f10, float f11, com.planner5d.library.model.manager.statistics.events.o3.g gVar, kotlin.coroutines.d<? super Boolean> dVar) {
        a aVar;
        boolean zBooleanValue;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f256543c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f256543c = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        a aVar2 = aVar;
        Object objJ = aVar2.f256541a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar2.f256543c;
        if (i11 == 0) {
            ResultKt.m(objJ);
            zBooleanValue = false;
            if (clipData == null || clipData.getItemCount() <= 0) {
                return kotlin.coroutines.jvm.internal.b.a(false);
            }
            Uri uri = clipData.getItemAt(0).getUri();
            if (uri != null) {
                PointF pointF = new PointF(f10, f11);
                aVar2.f256543c = 1;
                objJ = j(uri, pointF, null, gVar, aVar2);
                if (objJ == objL) {
                    return objL;
                }
            } else {
                this.f256539g.b("add_item", clipData.toString(), null);
            }
            return kotlin.coroutines.jvm.internal.b.a(zBooleanValue);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m(objJ);
        zBooleanValue = ((Boolean) objJ).booleanValue();
        return kotlin.coroutines.jvm.internal.b.a(zBooleanValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object g(View view, CatalogItem catalogItem, ItemMaterialSet itemMaterialSet, com.planner5d.library.model.manager.statistics.events.o3.g gVar, kotlin.coroutines.d<? super Boolean> dVar) {
        com.planner5d.library.widget.rate.g gVar2;
        int i10 = this.f256540h + 1;
        this.f256540h = i10;
        if (i10 == 3 && (gVar2 = this.f256538f) != null) {
            gVar2.j(com.planner5d.library.widget.rate.c.OnThreeItemsAddedInEditor, com.planner5d.library.model.manager.statistics.events.t3.c.editor);
        }
        if (view == null) {
            return kotlin.coroutines.jvm.internal.b.a(false);
        }
        Uri uriCreateItemUri = ItemBuilder.createItemUri(catalogItem);
        Intrinsics.checkNotNullExpressionValue(uriCreateItemUri, "createItemUri(...)");
        return j(uriCreateItemUri, new PointF(view.getWidth() / 2.0f, view.getHeight() / 2.0f), itemMaterialSet, gVar, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object j(Uri uri, PointF pointF, ItemMaterialSet itemMaterialSet, com.planner5d.library.model.manager.statistics.events.o3.g gVar, kotlin.coroutines.d<? super Boolean> dVar) {
        d dVar2;
        com.planner5d.library.model.manager.statistics.events.o3.g gVar2;
        l1 l1Var;
        g1 g1Var;
        ItemProject itemProject;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i10 = dVar2.f256562g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar2.f256562g = i10 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        d dVar3 = dVar2;
        Object objL = dVar3.f256560e;
        Object objL2 = kotlin.coroutines.intrinsics.b.l();
        int i11 = dVar3.f256562g;
        if (i11 == 0) {
            ResultKt.m(objL);
            l1 l1Var2 = l1.f256518a;
            g1 g1Var2 = this.f256533a;
            ItemProject item = this.f256534b.getItem();
            dVar3.f256556a = gVar;
            dVar3.f256557b = l1Var2;
            dVar3.f256558c = g1Var2;
            dVar3.f256559d = item;
            dVar3.f256562g = 1;
            objL = l(uri, pointF, itemMaterialSet, gVar, dVar3);
            if (objL == objL2) {
                return objL2;
            }
            gVar2 = gVar;
            l1Var = l1Var2;
            g1Var = g1Var2;
            itemProject = item;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ItemProject itemProject2 = (ItemProject) dVar3.f256559d;
            g1 g1Var3 = (g1) dVar3.f256558c;
            l1 l1Var3 = (l1) dVar3.f256557b;
            com.planner5d.library.model.manager.statistics.events.o3.g gVar3 = (com.planner5d.library.model.manager.statistics.events.o3.g) dVar3.f256556a;
            ResultKt.m(objL);
            itemProject = itemProject2;
            g1Var = g1Var3;
            l1Var = l1Var3;
            gVar2 = gVar3;
        }
        return kotlin.coroutines.jvm.internal.b.a(l1.c(l1Var, g1Var, itemProject, (Item) objL, gVar2, false, 16, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object l(Uri uri, PointF pointF, ItemMaterialSet itemMaterialSet, com.planner5d.library.model.manager.statistics.events.o3.g gVar, kotlin.coroutines.d<? super Item> dVar) {
        return m(uri, new com.planner5d.library.math.m(pointF.x, pointF.y, 0.0f), 0.0f, itemMaterialSet, gVar, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object m(Uri uri, com.planner5d.library.math.m mVar, float f10, ItemMaterialSet itemMaterialSet, com.planner5d.library.model.manager.statistics.events.o3.g gVar, kotlin.coroutines.d<? super Item> dVar) {
        Item itemCreateItemFromUri;
        ItemLayout position;
        com.planner5d.library.widget.editor.a aVarB = this.f256534b.b();
        ItemProject item = this.f256534b.getItem();
        if (aVarB != null && item != null && uri != null && Intrinsics.areEqual("p5d", uri.getScheme())) {
            ItemFloor activeFloor = item.getActiveFloor();
            ItemBuilder itemBuilder = this.f256535c;
            if (itemBuilder != null && (itemCreateItemFromUri = itemBuilder.createItemFromUri(uri, activeFloor, this.f256536d)) != null) {
                itemCreateItemFromUri.setLayout(itemCreateItemFromUri.getLayout(this.f256537e).setPosition(0.0f, 0.0f));
                com.planner5d.library.widget.editor.editor2d.drawable.w drawableInstances = itemCreateItemFromUri.getDrawableInstances();
                if (drawableInstances != null) {
                    RectF rectFD = drawableInstances.f255098a[0].d(new RectF());
                    if (gVar == com.planner5d.library.model.manager.statistics.events.o3.g.ai_chat) {
                        position = this.f256537e.setPosition(mVar.f180482a - rectFD.centerX(), mVar.f180483b - rectFD.centerY(), mVar.f180484c).setRotationY(f10);
                    } else {
                        PointF pointFJ = aVarB.j(n(mVar));
                        position = this.f256537e.setPosition(pointFJ.x - rectFD.centerX(), pointFJ.y - rectFD.centerY());
                    }
                    itemCreateItemFromUri.setLayout(position);
                }
                if (itemCreateItemFromUri instanceof ItemNs) {
                    ((ItemNs) itemCreateItemFromUri).setMaterialSet(itemMaterialSet);
                    ItemLayout itemLayout = new ItemLayout();
                    itemCreateItemFromUri.getLayout(itemLayout);
                    itemLayout.setRotationY(f10);
                    itemCreateItemFromUri.setLayout(itemLayout);
                }
                return itemCreateItemFromUri;
            }
        }
        return null;
    }

    private final PointF n(com.planner5d.library.math.m mVar) {
        return new PointF(mVar.f180482a, mVar.f180483b);
    }

    @kotlin.l(message = "use coroutines", replaceWith = @kotlin.b1(expression = "addItem(data: ClipData?, x: Float, y: Float, source: ItemAddSource)", imports = {}))
    public final boolean h(@Nullable ClipData clipData, float f10, float f11, @NotNull com.planner5d.library.model.manager.statistics.events.o3.g source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return ((Boolean) com.planner5d.library.services.utility.c0.t(com.planner5d.library.services.utility.c0.f225068a, null, false, new c(clipData, f10, f11, source, null), 3, null)).booleanValue();
    }

    @kotlin.l(message = "use coroutines", replaceWith = @kotlin.b1(expression = "addItem(view: View?, item: CatalogItem, set: ItemMaterialSet?, source: ItemAddSource)", imports = {}))
    public final boolean i(@Nullable View view, @NotNull CatalogItem item, @Nullable ItemMaterialSet itemMaterialSet, @NotNull com.planner5d.library.model.manager.statistics.events.o3.g source) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(source, "source");
        return ((Boolean) com.planner5d.library.services.utility.c0.t(com.planner5d.library.services.utility.c0.f225068a, null, false, new b(view, item, itemMaterialSet, source, null), 3, null)).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    @Nullable
    public final Object k(@NotNull Uri uri, @NotNull com.planner5d.library.math.m mVar, float f10, @Nullable ItemMaterialSet itemMaterialSet, @NotNull com.planner5d.library.model.manager.statistics.events.o3.g gVar, @NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        e eVar;
        l1 l1Var;
        g1 g1Var;
        ItemProject itemProject;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i10 = eVar.f256569g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f256569g = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar);
            }
        } else {
            eVar = new e(dVar);
        }
        e eVar2 = eVar;
        Object obj = eVar2.f256567e;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = eVar2.f256569g;
        if (i11 == 0) {
            ResultKt.m(obj);
            l1 l1Var2 = l1.f256518a;
            g1 g1Var2 = this.f256533a;
            ItemProject item = this.f256534b.getItem();
            eVar2.f256563a = gVar;
            eVar2.f256564b = l1Var2;
            eVar2.f256565c = g1Var2;
            eVar2.f256566d = item;
            eVar2.f256569g = 1;
            Object objM = m(uri, mVar, f10, itemMaterialSet, gVar, eVar2);
            if (objM == objL) {
                return objL;
            }
            l1Var = l1Var2;
            g1Var = g1Var2;
            itemProject = item;
            obj = objM;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ItemProject itemProject2 = (ItemProject) eVar2.f256566d;
            g1 g1Var3 = (g1) eVar2.f256565c;
            l1 l1Var3 = (l1) eVar2.f256564b;
            gVar = (com.planner5d.library.model.manager.statistics.events.o3.g) eVar2.f256563a;
            ResultKt.m(obj);
            g1Var = g1Var3;
            l1Var = l1Var3;
            itemProject = itemProject2;
        }
        return kotlin.coroutines.jvm.internal.b.a(l1Var.b(g1Var, itemProject, (Item) obj, gVar, false));
    }
}
