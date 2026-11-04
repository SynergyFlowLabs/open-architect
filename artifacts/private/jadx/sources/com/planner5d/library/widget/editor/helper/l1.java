package com.planner5d.library.widget.editor.helper;

import android.app.Activity;
import android.os.Bundle;
import android.util.Pair;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemDoor;
import com.planner5d.library.model.item.ItemFloor;
import com.planner5d.library.model.item.ItemLayout;
import com.planner5d.library.model.item.ItemMaterial;
import com.planner5d.library.model.item.ItemNs;
import com.planner5d.library.model.item.ItemOpenClose;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.item.ItemRoom;
import com.planner5d.library.model.item.ItemRuler;
import com.planner5d.library.model.item.ItemWall;
import com.planner5d.library.model.item.ItemWalls;
import com.planner5d.library.model.item.ProviderUid;
import com.planner5d.library.model.item.builder.ItemCloner;
import com.planner5d.library.model.item.helper.RoomLayoutHelper;
import com.planner5d.library.model.manager.statistics.events.x3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Subscriber;

/* JADX INFO: loaded from: classes8.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nHelperEditorActions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelperEditorActions.kt\ncom/planner5d/library/widget/editor/helper/HelperEditorActions\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,245:1\n1#2:246\n1557#3:247\n1628#3,3:248\n1557#3:253\n1628#3,3:254\n37#4,2:251\n37#4,2:257\n*S KotlinDebug\n*F\n+ 1 HelperEditorActions.kt\ncom/planner5d/library/widget/editor/helper/HelperEditorActions\n*L\n215#1:247\n215#1:248,3\n216#1:253\n216#1:254,3\n215#1:251,2\n216#1:257,2\n*E\n"})
public final class l1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private static Item f256521d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final l1 f256518a = new l1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final ItemLayout f256519b = new ItemLayout();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final com.planner5d.library.math.k f256520c = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f256522e = 8;

    public static final class a extends com.planner5d.library.services.rx.e<Project> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.manager.b2 f256523d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ h2 f256524e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.activity.fragment.x f256525f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.manager.y1 f256526g;

        a(com.planner5d.library.model.manager.b2 b2Var, h2 h2Var, com.planner5d.library.activity.fragment.x xVar, com.planner5d.library.model.manager.y1 y1Var) {
            this.f256523d = b2Var;
            this.f256524e = h2Var;
            this.f256525f = xVar;
            this.f256526g = y1Var;
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(Throwable th2) {
            if (th2 != null) {
                this.f256523d.c(th2);
            }
            this.f256524e.i(false);
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onNext(Project project) {
            if (project == null) {
                onError(new Exception("Could not create duplicate project"));
            } else {
                com.planner5d.library.model.manager.statistics.events.b2.f216725b.B(x3.c.duplicate_unowned, project.projectId);
                com.planner5d.library.activity.fragment.x.g(this.f256525f, new com.planner5d.library.activity.helper.event.content.d(project, false, (Bundle) null, true, this.f256526g.f()).s(x3.d.gallery, true), false, 2, null);
            }
        }
    }

    private l1() {
    }

    public static /* synthetic */ boolean c(l1 l1Var, g1 g1Var, ItemProject itemProject, Item item, com.planner5d.library.model.manager.statistics.events.o3.g gVar, boolean z10, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            z10 = true;
        }
        return l1Var.b(g1Var, itemProject, item, gVar, z10);
    }

    @oj.n
    public static final boolean d(@NotNull g1 helper, @NotNull com.planner5d.library.widget.editor.facade.h facade, @NotNull ItemProject itemProject, @NotNull List<Item> items, @Nullable String str, @NotNull com.planner5d.library.model.manager.statistics.events.o3.g source) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(facade, "facade");
        Intrinsics.checkNotNullParameter(itemProject, "itemProject");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(source, "source");
        new RoomLayoutHelper().prepareItemsForAdding(items, itemProject, str);
        ItemFloor activeFloor = itemProject.getActiveFloor();
        ItemRoom itemRoomC = str != null ? c3.f256213a.c(itemProject, str) : null;
        ArrayList arrayList = new ArrayList();
        if (itemRoomC != null) {
            arrayList.add(itemRoomC);
            ItemNs[] itemsMovedTogether = itemRoomC.getItemsMovedTogether();
            Intrinsics.checkNotNullExpressionValue(itemsMovedTogether, "getItemsMovedTogether(...)");
            CollectionsKt.addAll(arrayList, itemsMovedTogether);
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Item) it.next()).getUid());
        }
        com.planner5d.library.widget.editor.editaction.d dVar = new com.planner5d.library.widget.editor.editaction.d(new com.planner5d.library.widget.editor.editaction.y((String[]) arrayList2.toArray(new String[0])), new com.planner5d.library.widget.editor.editaction.a((Item[]) items.toArray(new Item[0]), activeFloor));
        List<Item> list = items;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((Item) it2.next()).getUid());
        }
        helper.A(dVar, new com.planner5d.library.widget.editor.editaction.d(new com.planner5d.library.widget.editor.editaction.y((String[]) arrayList3.toArray(new String[0])), new com.planner5d.library.widget.editor.editaction.a((Item[]) arrayList.toArray(new Item[0]), activeFloor)), true);
        Item item = (Item) CollectionsKt.firstOrNull((List) items);
        helper.B3.j(item, source, helper.m1());
        if ((item != null ? item.getUid() : null) != null) {
            facade.k(item.getUid());
        }
        return true;
    }

    private final Item g(final ItemProject itemProject, Item item, int i10) {
        Item itemClone = ItemCloner.clone(item, null, item instanceof ItemRuler ? null : new ProviderUid() { // from class: com.planner5d.library.widget.editor.helper.k1
            @Override // com.planner5d.library.model.item.ProviderUid
            public final String createUid() {
                return l1.h(itemProject);
            }
        });
        ItemLayout itemLayout = f256519b;
        float f10 = i10;
        itemClone.setLayout(itemClone.getLayout(itemLayout).setPosition(itemLayout.getPosition(f256520c).a(f10, f10)));
        Intrinsics.checkNotNullExpressionValue(itemClone, "apply(...)");
        return itemClone;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String h(ItemProject itemProject) {
        return itemProject.getNextFreeUid();
    }

    public final boolean b(@NotNull g1 helper, @Nullable ItemProject itemProject, @Nullable Item item, @NotNull com.planner5d.library.model.manager.statistics.events.o3.g source, boolean z10) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(source, "source");
        ItemFloor activeFloor = itemProject != null ? itemProject.getActiveFloor() : null;
        if (item == null || activeFloor == null) {
            return false;
        }
        if (item instanceof ItemRuler) {
            com.planner5d.library.widget.editor.projectresources.j jVarJ = helper.j();
            if (jVarJ != null) {
                jVarJ.a((ItemRuler) item);
            }
            helper.d(item);
            helper.r();
        } else {
            helper.A(new com.planner5d.library.widget.editor.editaction.a(item, activeFloor, z10), new com.planner5d.library.widget.editor.editaction.y(item.getUid()), true);
        }
        helper.B3.j(item, source, helper.m1());
        return true;
    }

    public final void e() {
        f256521d = null;
    }

    public final void f(@NotNull g1 helper, @Nullable ItemProject itemProject, @Nullable Item item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        if (itemProject == null || item == null) {
            return;
        }
        int i10 = 2 | 0;
        if (c(this, helper, itemProject, g(itemProject, item, 12), com.planner5d.library.model.manager.statistics.events.o3.g.duplicate, false, 16, null)) {
            helper.n();
        }
    }

    public final void i(@Nullable ItemProject itemProject, @Nullable Item item) {
        if (itemProject == null || item == null) {
            return;
        }
        f256521d = g(itemProject, item, 12);
    }

    public final void j(@NotNull g1 helper, @Nullable ItemProject itemProject, @Nullable Item item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        if (itemProject == null || item == null) {
            return;
        }
        f256521d = g(itemProject, item, 0);
        k(helper, itemProject, item);
    }

    public final void k(@NotNull g1 helper, @Nullable ItemProject itemProject, @Nullable Item item) {
        ItemFloor itemFloor;
        Integer itemPosition;
        Intrinsics.checkNotNullParameter(helper, "helper");
        if (item == null) {
            return;
        }
        if (item instanceof ItemRuler) {
            com.planner5d.library.widget.editor.projectresources.j jVarJ = helper.j();
            if (jVarJ != null) {
                jVarJ.d((ItemRuler) item);
            }
            helper.d(null);
            helper.r();
            return;
        }
        if (itemProject == null || (itemFloor = itemProject.getItemFloor(item)) == null || (itemPosition = itemFloor.getItemPosition(item.getUid())) == null) {
            return;
        }
        int iIntValue = itemPosition.intValue();
        com.planner5d.library.widget.editor.a aVarS1 = helper.s1();
        if (aVarS1 != null && Intrinsics.areEqual(aVarS1.getSelectedItem(), item)) {
            helper.d(null);
        }
        helper.A(new com.planner5d.library.widget.editor.editaction.y(item.getUid()), new com.planner5d.library.widget.editor.editaction.a(item, itemFloor, iIntValue), true);
        helper.n();
        helper.B3.s(item);
    }

    public final void l(@NotNull Activity activity, @NotNull com.planner5d.library.model.manager.project.d0 projectManager, @NotNull com.planner5d.library.model.manager.b2 messageManager, @NotNull com.planner5d.library.model.manager.y1 menuManager, @NotNull h2 helperPreloader, @Nullable id.a aVar, @Nullable Project project, @NotNull com.planner5d.library.activity.fragment.x navigator) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(projectManager, "projectManager");
        Intrinsics.checkNotNullParameter(messageManager, "messageManager");
        Intrinsics.checkNotNullParameter(menuManager, "menuManager");
        Intrinsics.checkNotNullParameter(helperPreloader, "helperPreloader");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        helperPreloader.i(true);
        projectManager.s0(aVar, activity, project).subscribe((Subscriber<? super Project>) new a(messageManager, helperPreloader, navigator, menuManager));
    }

    public final boolean m(@NotNull g1 helper, @Nullable ItemProject itemProject, @Nullable Item item, @NotNull ItemMaterial material, @Nullable ItemMaterial itemMaterial, @NotNull com.planner5d.library.model.manager.builtin.i builtInDataManager) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(material, "material");
        Intrinsics.checkNotNullParameter(builtInDataManager, "builtInDataManager");
        ItemFloor activeFloor = itemProject != null ? itemProject.getActiveFloor() : null;
        if (item == null || activeFloor == null) {
            return false;
        }
        helper.A(new com.planner5d.library.widget.editor.editaction.q(item, material, true, builtInDataManager), itemMaterial != null ? new com.planner5d.library.widget.editor.editaction.q(item, itemMaterial, true, builtInDataManager) : null, true);
        helper.B3.p(item);
        return true;
    }

    public final void n(@NotNull g1 helper, @Nullable Item item, boolean z10) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        if (item instanceof ItemNs) {
            ItemNs itemNs = (ItemNs) item;
            ItemLayout itemLayout = f256519b;
            ItemLayout.Flip flip = itemNs.getLayout(itemLayout).getFlip();
            if (z10) {
                itemLayout.setFlip(itemLayout.isFlippedHorizontally(), !itemLayout.isFlippedVertically());
            } else {
                itemLayout.setFlip(!itemLayout.isFlippedHorizontally(), itemLayout.isFlippedVertically());
            }
            String uid = itemNs.getUid();
            ItemLayout.Flip flip2 = itemLayout.getFlip();
            Intrinsics.checkNotNullExpressionValue(flip2, "getFlip(...)");
            com.planner5d.library.widget.editor.editaction.i iVar = new com.planner5d.library.widget.editor.editaction.i(uid, flip2);
            String uid2 = itemNs.getUid();
            Intrinsics.checkNotNull(flip);
            helper.A(iVar, new com.planner5d.library.widget.editor.editaction.i(uid2, flip), true);
        }
    }

    public final void o(@NotNull g1 helper, @Nullable ItemProject itemProject) {
        Item item;
        Intrinsics.checkNotNullParameter(helper, "helper");
        if (itemProject == null || (item = f256521d) == null || !c(this, helper, itemProject, item, com.planner5d.library.model.manager.statistics.events.o3.g.duplicate, false, 16, null)) {
            return;
        }
        helper.n();
    }

    public final void p(@NotNull g1 helper) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        helper.b(false);
    }

    public final void q(@NotNull g1 helper, @Nullable Item item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        if (item instanceof ItemWall) {
            ItemWall itemWall = (ItemWall) item;
            if (itemWall.getParentItem() instanceof ItemWalls) {
                Item parentItem = itemWall.getParentItem();
                Intrinsics.checkNotNull(parentItem, "null cannot be cast to non-null type com.planner5d.library.model.item.ItemWalls");
                ItemWalls itemWalls = (ItemWalls) parentItem;
                ItemWall[] children = itemWalls.getChildren();
                Pair<ItemWall[], ItemWall[]> pairSplitWall = itemWalls.splitWall(itemWall, helper.K1());
                Object obj = pairSplitWall.second;
                if (obj != null && ((Object[]) obj).length == 2) {
                    item = ((ItemWall[]) obj)[1].getPoints()[0];
                }
                helper.A(new com.planner5d.library.widget.editor.editaction.c(itemWalls.getUid(), (ItemWall[]) pairSplitWall.first, item.getUid()), new com.planner5d.library.widget.editor.editaction.c(itemWalls.getUid(), children, itemWall.getUid()), true);
            }
        }
    }

    public final void r(@NotNull g1 helper, @Nullable Item item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        if (item instanceof ItemNs) {
            if ((item instanceof ItemOpenClose) || (item instanceof ItemDoor)) {
                ItemNs itemNs = (ItemNs) item;
                helper.A(new com.planner5d.library.widget.editor.editaction.v(itemNs.getUid(), !itemNs.getClosed()), new com.planner5d.library.widget.editor.editaction.v(itemNs.getUid(), itemNs.getClosed()), true);
            }
        }
    }

    public final void s(@NotNull g1 helper, @Nullable Item item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        if (item instanceof ItemWall) {
            ItemWall itemWall = (ItemWall) item;
            helper.A(new com.planner5d.library.widget.editor.editaction.i0(itemWall.getUid(), itemWall.hidden), new com.planner5d.library.widget.editor.editaction.i0(itemWall.getUid(), !itemWall.hidden), true);
            helper.n();
            helper.J2(item);
        }
    }

    public final void t(@NotNull g1 helper) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        helper.b(true);
    }
}
