package com.planner5d.library.widget.editor.helper;

import android.util.Pair;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemLayout;
import com.planner5d.library.model.item.ItemNs;
import com.planner5d.library.model.item.ItemPoint;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.item.ItemRoom;
import com.planner5d.library.model.item.ItemRuler;
import com.planner5d.library.model.item.catalog.CatalogItem;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class h implements g {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f256379t = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.widget.editor.facade.h f256380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final we.c f256381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final com.planner5d.library.widget.editor.facade.i0 f256382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.builtin.i f256383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.userimporteddata.n f256384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final e f256385f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private final e2 f256386g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private final com.planner5d.library.widget.editor.facade.c f256387h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private Item f256388i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private Item f256389j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private Item f256390k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final ItemLayout f256391l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final ItemLayout f256392m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.math.m f256393n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.math.m f256394o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    private com.planner5d.library.widget.editor.projectresources.viewoptions.b f256395p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private final r3 f256396q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    private final y2 f256397r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.widget.editor.editaction.c0.a f256398s;

    public h(@NotNull com.planner5d.library.widget.editor.facade.h facade, @NotNull we.c historyManager, @Nullable com.planner5d.library.widget.editor.facade.i0 i0Var, @NotNull com.planner5d.library.model.manager.builtin.i builtInDataManager, @NotNull com.planner5d.library.userimporteddata.n userImportedModelNameProcessor, @Nullable e eVar, @Nullable e2 e2Var, @Nullable com.planner5d.library.widget.editor.facade.c cVar) {
        Intrinsics.checkNotNullParameter(facade, "facade");
        Intrinsics.checkNotNullParameter(historyManager, "historyManager");
        Intrinsics.checkNotNullParameter(builtInDataManager, "builtInDataManager");
        Intrinsics.checkNotNullParameter(userImportedModelNameProcessor, "userImportedModelNameProcessor");
        this.f256380a = facade;
        this.f256381b = historyManager;
        this.f256382c = i0Var;
        this.f256383d = builtInDataManager;
        this.f256384e = userImportedModelNameProcessor;
        this.f256385f = eVar;
        this.f256386g = e2Var;
        this.f256387h = cVar;
        this.f256391l = new ItemLayout();
        this.f256392m = new ItemLayout();
        this.f256393n = new com.planner5d.library.math.m(0.0f, 0.0f, 0.0f, 7, null);
        this.f256394o = new com.planner5d.library.math.m(0.0f, 0.0f, 0.0f, 7, null);
        this.f256396q = new r3();
        this.f256397r = new y2();
        this.f256398s = new com.planner5d.library.widget.editor.editaction.c0.a();
    }

    private final ze.b k(Item item) {
        Project model = this.f256380a.getModel();
        if (model == null || model.getId() == null) {
            timber.log.b.f381052a.d("Can't create selected item because project missing", new Object[0]);
            return null;
        }
        if (item == null) {
            timber.log.b.f381052a.d("Can't create selected item because item is null", new Object[0]);
            return null;
        }
        ItemProject item2 = this.f256380a.getItem();
        if (item2 != null) {
            return new ze.b(model, item2, item, this.f256380a.G().D1());
        }
        timber.log.b.f381052a.d("Can't create selected item because itemProject is null", new Object[0]);
        return null;
    }

    private final Unit l() {
        Item selectedItem;
        com.planner5d.library.widget.editor.a aVarB = this.f256380a.b();
        if (aVarB == null || (selectedItem = aVarB.getSelectedItem()) == null) {
            return null;
        }
        this.f256380a.v().L(selectedItem);
        return Unit.f312394a;
    }

    private final boolean m(Pair<? extends com.planner5d.library.widget.editor.editaction.e, ? extends com.planner5d.library.widget.editor.editaction.e> pair, Item item) {
        if (pair != null || (item instanceof ItemRuler)) {
            return true;
        }
        return (item instanceof ItemPoint) && (item.getParentItem() instanceof ItemRuler);
    }

    @Override // com.planner5d.library.widget.editor.helper.g
    public void a(float f10) {
        e2 e2Var = this.f256386g;
        if (e2Var != null) {
            e2Var.n();
        }
        com.planner5d.library.widget.editor.a aVarB = this.f256380a.b();
        if (aVarB != null) {
            aVarB.a(Math.max(0.0f, this.f256396q.f(this.f256395p, this.f256394o.f180484c + f10)));
        }
    }

    @Override // com.planner5d.library.widget.editor.helper.g
    public void b() {
        d(true);
    }

    @Override // com.planner5d.library.widget.editor.helper.g
    @androidx.annotation.m1
    public boolean c(@Nullable Item item) {
        CatalogItem catalogItemA;
        if (item instanceof ItemNs) {
            ItemNs itemNs = (ItemNs) item;
            if (!this.f256384e.b(itemNs.getModelId()) && ((catalogItemA = this.f256383d.a(itemNs.getModelId())) == null || !catalogItemA.isEditablePosition())) {
                return false;
            }
        }
        return true;
    }

    @Override // com.planner5d.library.widget.editor.helper.g
    public void d(boolean z10) {
        ItemLayout layout;
        Item selectedItem;
        Item item = null;
        com.planner5d.library.widget.editor.facade.e0.a.a(this.f256380a.F(), true, false, 2, null);
        this.f256380a.v().c();
        if (z10) {
            this.f256380a.v().o();
        }
        com.planner5d.library.widget.editor.a aVarB = this.f256380a.b();
        if (aVarB != null && (selectedItem = aVarB.getSelectedItem()) != null) {
            this.f256390k = selectedItem;
            item = selectedItem;
        }
        if (item != null && (layout = item.getLayout(new ItemLayout())) != null) {
            layout.getPosition(this.f256394o);
        }
        this.f256397r.e(item);
        this.f256395p = this.f256380a.G().G1();
        com.planner5d.library.widget.editor.a aVarB2 = this.f256380a.b();
        if (aVarB2 != null) {
            aVarB2.b();
        }
    }

    @Override // com.planner5d.library.widget.editor.helper.g
    public void e(float f10, boolean z10) {
        com.planner5d.library.math.m mVar = this.f256393n;
        float fA = f10 + (z10 ? mVar.f180483b : mVar.f180482a);
        com.planner5d.library.widget.editor.a aVarB = this.f256380a.b();
        if (aVarB != null) {
            com.planner5d.library.widget.editor.facade.i0 i0Var = this.f256382c;
            if (i0Var != null) {
                fA = i0Var.a(fA);
            }
            aVarB.e(fA, z10);
        }
    }

    @Override // com.planner5d.library.widget.editor.helper.g
    public void f(boolean z10) {
        e2 e2Var = this.f256386g;
        if (e2Var != null) {
            e2Var.n();
        }
        this.f256380a.v().c();
        com.planner5d.library.widget.editor.a aVarB = this.f256380a.b();
        Item selectedItem = aVarB != null ? aVarB.getSelectedItem() : null;
        if (selectedItem != null) {
            selectedItem.getLayout(this.f256391l);
            this.f256391l.getRotation(this.f256393n);
            this.f256389j = selectedItem;
            com.planner5d.library.widget.editor.facade.e0.a.a(this.f256380a.F(), true, false, 2, null);
            com.planner5d.library.widget.editor.a aVarB2 = this.f256380a.b();
            if (aVarB2 != null) {
                com.planner5d.library.math.m mVar = this.f256393n;
                aVarB2.h(z10 ? mVar.f180483b : mVar.f180482a, z10);
            }
        }
    }

    @Override // com.planner5d.library.widget.editor.helper.g
    public void g() {
        com.planner5d.library.widget.editor.a aVarB = this.f256380a.b();
        Item selectedItem = aVarB != null ? aVarB.getSelectedItem() : null;
        if (selectedItem != null) {
            this.f256388i = selectedItem;
            com.planner5d.library.widget.editor.facade.e0.a.a(this.f256380a.F(), true, false, 2, null);
            selectedItem.getLayout(this.f256392m);
        }
    }

    @Override // com.planner5d.library.widget.editor.helper.g
    public void h() {
        if (this.f256389j == null) {
            return;
        }
        this.f256389j = null;
        com.planner5d.library.widget.editor.facade.e0.a.a(this.f256380a.F(), false, false, 2, null);
        com.planner5d.library.widget.editor.a aVarB = this.f256380a.b();
        Item selectedItem = aVarB != null ? aVarB.getSelectedItem() : null;
        if (selectedItem != null) {
            ItemProject item = this.f256380a.getItem();
            if ((item != null ? item.getItemFloor(selectedItem) : null) == null) {
                return;
            }
            boolean z10 = selectedItem instanceof ItemRoom;
            if (z10) {
                ItemRoom itemRoom = (ItemRoom) selectedItem;
                this.f256381b.A(this.f256398s.b(itemRoom, false), this.f256398s.a(itemRoom, this.f256393n.f180483b, false), true);
            } else {
                this.f256381b.A(new com.planner5d.library.widget.editor.editaction.f0(selectedItem.getUid(), selectedItem.getLayout(this.f256391l).getRotation(new com.planner5d.library.math.m(0.0f, 0.0f, 0.0f, 7, null))), new com.planner5d.library.widget.editor.editaction.f0(selectedItem.getUid(), this.f256393n), false);
            }
            this.f256381b.q(false);
            e eVar = this.f256385f;
            if (eVar != null) {
                eVar.L(k(selectedItem));
            }
            if (z10) {
                return;
            }
            this.f256380a.v().L(selectedItem);
            com.planner5d.library.widget.editor.a aVarB2 = this.f256380a.b();
            if (aVarB2 != null) {
                aVarB2.m(selectedItem);
            }
        }
    }

    @Override // com.planner5d.library.widget.editor.helper.g
    public void i() {
        e eVar;
        Item item = this.f256390k;
        if (item == null) {
            return;
        }
        Pair<? extends com.planner5d.library.widget.editor.editaction.e, ? extends com.planner5d.library.widget.editor.editaction.e> pairA = this.f256397r.a();
        com.planner5d.library.widget.editor.a aVarB = this.f256380a.b();
        if (aVarB != null) {
            aVarB.u(pairA != null);
        }
        if (pairA != null) {
            com.planner5d.library.widget.editor.facade.c cVar = this.f256387h;
            if (cVar == null || !cVar.s(item, false, com.planner5d.library.model.manager.statistics.events.t3.d.on_premium_item_move)) {
                this.f256381b.z((com.planner5d.library.widget.editor.editaction.e) pairA.second, true);
            } else {
                this.f256381b.A((com.planner5d.library.widget.editor.editaction.e) pairA.first, (com.planner5d.library.widget.editor.editaction.e) pairA.second, false);
            }
        }
        if (m(pairA, item) && (eVar = this.f256385f) != null) {
            eVar.L(k(item));
        }
        l();
        this.f256390k = null;
        com.planner5d.library.widget.editor.facade.e0.a.a(this.f256380a.F(), false, false, 2, null);
    }

    @Override // com.planner5d.library.widget.editor.helper.g
    public void j() {
        Item selectedItem;
        if (this.f256388i != null) {
            com.planner5d.library.widget.editor.facade.e0.a.a(this.f256380a.F(), false, false, 2, null);
            this.f256388i = null;
            com.planner5d.library.widget.editor.a aVarB = this.f256380a.b();
            if (aVarB != null && (selectedItem = aVarB.getSelectedItem()) != null) {
                com.planner5d.library.widget.editor.facade.c cVar = this.f256387h;
                if (cVar == null || !cVar.s(selectedItem, true, com.planner5d.library.model.manager.statistics.events.t3.d.on_item_resize)) {
                    selectedItem.setLayout(this.f256392m);
                    this.f256380a.F().r();
                } else {
                    int i10 = 4 >> 0;
                    this.f256381b.A(new com.planner5d.library.widget.editor.editaction.a0(selectedItem.getUid(), selectedItem.getLayout(this.f256391l).getScale(new com.planner5d.library.math.m(0.0f, 0.0f, 0.0f, 7, null)), this.f256391l.getPosition(new com.planner5d.library.math.m(0.0f, 0.0f, 0.0f, 7, null))), new com.planner5d.library.widget.editor.editaction.a0(selectedItem.getUid(), this.f256392m.getScale(new com.planner5d.library.math.m(0.0f, 0.0f, 0.0f, 7, null)), this.f256392m.getPosition(new com.planner5d.library.math.m(0.0f, 0.0f, 0.0f, 7, null))), false);
                    this.f256381b.q(false);
                    e2 e2Var = this.f256386g;
                    if (e2Var != null) {
                        e2Var.q(selectedItem);
                    }
                    e eVar = this.f256385f;
                    if (eVar != null) {
                        eVar.L(k(selectedItem));
                    }
                }
            }
        }
    }
}
