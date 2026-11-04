package com.planner5d.library.widget.editor.itemactionsbar;

import androidx.annotation.m1;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.activity.fragment.dialog.iteminfo.ItemInfo;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemDoor;
import com.planner5d.library.model.item.ItemNs;
import com.planner5d.library.model.item.ItemOpenClose;
import com.planner5d.library.model.item.ItemPartition;
import com.planner5d.library.model.item.ItemPoint;
import com.planner5d.library.model.item.ItemPr;
import com.planner5d.library.model.item.ItemRoom;
import com.planner5d.library.model.item.ItemRuler;
import com.planner5d.library.model.item.ItemUnknown;
import com.planner5d.library.model.item.ItemWall;
import com.planner5d.library.model.item.ItemWalls;
import com.planner5d.library.model.item.ItemWindow;
import com.planner5d.library.model.item.catalog.CatalogItem;
import com.planner5d.library.services.utility.f1;
import com.planner5d.library.services.utility.s;
import com.planner5d.library.widget.editor.helper.g1;
import com.planner5d.library.widget.editor.menu.c0;
import com.planner5d.library.widget.editor.menu.n0;
import com.planner5d.library.widget.editor.menu.p;
import com.planner5d.library.widget.editor.menu.p0;
import com.planner5d.library.widget.editor.menu.z;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.s2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@ij.f
@SourceDebugExtension({"SMAP\nItemActionsBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ItemActionsBuilder.kt\ncom/planner5d/library/widget/editor/itemactionsbar/ItemActionsBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,150:1\n1#2:151\n*E\n"})
public final class h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f256957g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.builtin.i f256958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.dialog.k f256959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.j f256960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final f1 f256961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Object f256962e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private p2 f256963f;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.itemactionsbar.ItemActionsBuilder$showItemInfo$1$1$1", f = "ItemActionsBuilder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nItemActionsBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ItemActionsBuilder.kt\ncom/planner5d/library/widget/editor/itemactionsbar/ItemActionsBuilder$showItemInfo$1$1$1\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,150:1\n326#2:151\n*S KotlinDebug\n*F\n+ 1 ItemActionsBuilder.kt\ncom/planner5d/library/widget/editor/itemactionsbar/ItemActionsBuilder$showItemInfo$1$1$1\n*L\n109#1:151\n*E\n"})
    static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f256964a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Item f256966c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Item item, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f256966c = item;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return h.this.new a(this.f256966c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f256964a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            if (h.this.f256958a.m0(this.f256966c) && (this.f256966c instanceof ItemNs)) {
                CatalogItem catalogItemW = h.this.f256958a.w(((ItemNs) this.f256966c).getModelId());
                if (s2.D(getContext())) {
                    ItemInfo.show(h.this.f256959b, catalogItemW, ((ItemNs) this.f256966c).getMaterialSet());
                }
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public h(@NotNull com.planner5d.library.model.manager.builtin.i builtInDataManager, @NotNull com.planner5d.library.activity.fragment.dialog.k dialogLauncher, @NotNull com.planner5d.library.model.manager.config.j featureConfigManager, @NotNull f1 coroutineScope) {
        Intrinsics.checkNotNullParameter(builtInDataManager, "builtInDataManager");
        Intrinsics.checkNotNullParameter(dialogLauncher, "dialogLauncher");
        Intrinsics.checkNotNullParameter(featureConfigManager, "featureConfigManager");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f256958a = builtInDataManager;
        this.f256959b = dialogLauncher;
        this.f256960c = featureConfigManager;
        this.f256961d = coroutineScope;
        this.f256962e = new Object();
    }

    private final boolean e(Item item, boolean z10) {
        if (z10 && ((item instanceof ItemRoom) || (item instanceof ItemPr) || (item instanceof ItemWindow))) {
            return false;
        }
        if (item instanceof ItemPoint) {
            return false;
        }
        return !(item instanceof ItemWall) || (item instanceof ItemRuler);
    }

    private final boolean f(Item item) {
        return (item instanceof ItemDoor) || (item instanceof ItemOpenClose);
    }

    private final boolean g(Item item, boolean z10) {
        if (z10 && k(item)) {
            return false;
        }
        return (!(item instanceof ItemWall) || (item instanceof ItemRuler)) && !(item instanceof ItemPoint);
    }

    private final boolean h(Item item, boolean z10) {
        if (!(z10 && ((item instanceof ItemDoor) || (item instanceof ItemWindow))) && (item instanceof ItemNs)) {
            return !(item instanceof ItemWindow) || (item instanceof ItemDoor);
        }
        return false;
    }

    private final boolean i(Item item, boolean z10) {
        return !z10 && (item instanceof ItemWall) && !(item instanceof ItemRuler) && (((ItemWall) item).getParentItem() instanceof ItemRoom);
    }

    private final boolean j(Item item, boolean z10) {
        if (z10 || !(item instanceof ItemWall) || (item instanceof ItemRuler)) {
            return false;
        }
        Item parentItem = ((ItemWall) item).getParentItem();
        return !(parentItem instanceof ItemPartition) && (parentItem instanceof ItemWalls);
    }

    private final boolean k(Item item) {
        return ((item instanceof ItemWall) && !(item instanceof ItemRuler)) || (item instanceof ItemRoom) || (item instanceof ItemDoor) || (item instanceof ItemWindow) || (item instanceof ItemPr);
    }

    private final Function0<Unit> l(final Item item) {
        return new Function0() { // from class: com.planner5d.library.widget.editor.itemactionsbar.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return h.m(this.f256955a, item);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(h hVar, Item item) {
        Unit unit;
        synchronized (hVar.f256962e) {
            try {
                p2 p2Var = hVar.f256963f;
                if (p2Var != null) {
                    p2.a.b(p2Var, null, 1, null);
                }
                hVar.f256963f = kotlinx.coroutines.k.f(hVar.f256961d, s.f229729a.h(), null, hVar.new a(item, null), 2, null);
                unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return unit;
    }

    @m1
    @NotNull
    public final List<b> d(@NotNull g1 helper, @NotNull Item item) {
        com.planner5d.library.widget.editor.projectresources.viewoptions.b bVarG1;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        com.planner5d.library.widget.editor.projectresources.viewoptions.b.EnumC1743b enumC1743b = null;
        if (!helper.z1() && (bVarG1 = helper.G1()) != null) {
            enumC1743b = bVarG1.f258084o;
        }
        boolean z10 = enumC1743b != null;
        ArrayList arrayList = new ArrayList();
        boolean z11 = item instanceof ItemUnknown;
        boolean zI = i(item, z10);
        boolean z12 = (z10 || !(item instanceof ItemRoom) || helper.z1()) ? false : true;
        if (z12 && this.f256960c.a(com.planner5d.library.model.manager.config.f.AiDesigner)) {
            int i10 = com.planner5d.library.f.h.f167834v6;
            int i11 = com.planner5d.library.f.C1549f.E3;
            com.planner5d.library.widget.editor.facade.h hVarV1 = helper.v1();
            Intrinsics.checkNotNullExpressionValue(hVarV1, "getFacade(...)");
            arrayList.add(new b(i10, i11, new com.planner5d.library.widget.editor.menu.b(hVarV1, helper, helper, (ItemRoom) item).a()));
        }
        if (z12 && this.f256960c.a(com.planner5d.library.model.manager.config.f.RoomRotation) && !helper.D1()) {
            arrayList.add(new b(com.planner5d.library.f.h.Na, new p0(helper, (ItemRoom) item).a()));
        }
        if (this.f256958a.m0(item)) {
            arrayList.add(new b(com.planner5d.library.f.h.f167553g9, l(item)));
        }
        if (!z11) {
            arrayList.add(new b(com.planner5d.library.f.h.f167858wb, new n0(helper, item).a()));
        }
        if (!z11 && helper.D1() && f(item)) {
            arrayList.add(new b(com.planner5d.library.f.h.S9, new c0(helper, item).a()));
        }
        if (!z11 && e(item, z10)) {
            arrayList.add(new b(com.planner5d.library.f.h.f167607j7, new p(helper, item).a()));
        }
        if (h(item, z10)) {
            arrayList.add(new b(com.planner5d.library.f.h.f167893y8, new com.planner5d.library.widget.editor.menu.m(helper, item, true).a()));
            arrayList.add(new b(com.planner5d.library.f.h.f167874x8, new com.planner5d.library.widget.editor.menu.m(helper, item, false).a()));
        }
        if (j(item, z10)) {
            arrayList.add(new b(com.planner5d.library.f.h.f167647l9, new com.planner5d.library.widget.editor.menu.s0(helper, item).a()));
        }
        if (zI) {
            ItemWall itemWall = (ItemWall) item;
            if (itemWall.hidden) {
                arrayList.add(new b(com.planner5d.library.f.h.f167574hb, new z(helper, itemWall).a()));
            }
        }
        if (zI) {
            ItemWall itemWall2 = (ItemWall) item;
            if (!itemWall2.hidden) {
                arrayList.add(new b(com.planner5d.library.f.h.X8, new z(helper, itemWall2).a()));
            }
        }
        if (g(item, z10)) {
            arrayList.add(new b(com.planner5d.library.f.h.f167877xb, com.planner5d.library.f.C1549f.Zh, new com.planner5d.library.widget.editor.menu.g(helper, item).a()));
        }
        return arrayList;
    }
}
