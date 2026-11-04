package com.planner5d.library.widget.editor.helper;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemDoor;
import com.planner5d.library.model.item.ItemGround;
import com.planner5d.library.model.item.ItemLayout;
import com.planner5d.library.model.item.ItemMaterial;
import com.planner5d.library.model.item.ItemNs;
import com.planner5d.library.model.item.ItemPartition;
import com.planner5d.library.model.item.ItemPoint;
import com.planner5d.library.model.item.ItemPr;
import com.planner5d.library.model.item.ItemRoom;
import com.planner5d.library.model.item.ItemRuler;
import com.planner5d.library.model.item.ItemWall;
import com.planner5d.library.model.item.ItemWindow;
import com.planner5d.library.model.item.catalog.CatalogCategory;
import com.planner5d.library.model.manager.statistics.events.x3;
import com.planner5d.library.model.manager.statistics.events.y3;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nHelperEditorStatistics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelperEditorStatistics.kt\ncom/planner5d/library/widget/editor/helper/HelperEditorStatistics\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,319:1\n1#2:320\n13474#3,3:321\n1310#3,2:324\n*S KotlinDebug\n*F\n+ 1 HelperEditorStatistics.kt\ncom/planner5d/library/widget/editor/helper/HelperEditorStatistics\n*L\n131#1:321,3\n165#1:324,2\n*E\n"})
public final class s2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f256732d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f256733e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.widget.editor.facade.f f256734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.widget.editor.facade.k0 f256735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final com.planner5d.library.model.manager.builtin.i f256736c;

    @SourceDebugExtension({"SMAP\nHelperEditorStatistics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelperEditorStatistics.kt\ncom/planner5d/library/widget/editor/helper/HelperEditorStatistics$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,319:1\n1#2:320\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final com.planner5d.library.model.manager.statistics.events.o3.j d(Bundle bundle) {
            String strT = new com.planner5d.library.services.utility.j(bundle).t(com.planner5d.library.services.r.mode, null);
            if (strT != null) {
                return com.planner5d.library.model.manager.statistics.events.o3.j.valueOf(strT);
            }
            return null;
        }

        private final com.planner5d.library.model.manager.statistics.events.o3.j e(Fragment fragment) {
            return d(fragment.getArguments());
        }

        public final void a(@NotNull Activity activity, @Nullable Long l10) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            com.planner5d.library.model.manager.statistics.events.t0 t0Var = com.planner5d.library.model.manager.statistics.events.t0.f217461b;
            com.planner5d.library.model.manager.statistics.events.o3.j jVar = com.planner5d.library.model.manager.statistics.events.o3.j.VR;
            Intent intent = activity.getIntent();
            t0Var.m0(jVar, d(intent != null ? intent.getExtras() : null), l10);
        }

        public final void b(@NotNull Fragment fragment, @NotNull com.planner5d.library.model.manager.statistics.events.o3.k setting, @Nullable Long l10) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(setting, "setting");
            com.planner5d.library.model.manager.statistics.events.t0.f217461b.U0(e(fragment), setting, l10);
        }

        public final void c(@NotNull Fragment fragment, @Nullable Long l10) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            com.planner5d.library.model.manager.statistics.events.t0.f217461b.V0(e(fragment), l10);
        }

        private a() {
        }
    }

    static {
        int i10 = 2 & 0;
    }

    public s2(@NotNull com.planner5d.library.widget.editor.facade.f dataProvider, @NotNull com.planner5d.library.widget.editor.facade.k0 stateReader, @Nullable com.planner5d.library.model.manager.builtin.i iVar) {
        Intrinsics.checkNotNullParameter(dataProvider, "dataProvider");
        Intrinsics.checkNotNullParameter(stateReader, "stateReader");
        this.f256734a = dataProvider;
        this.f256735b = stateReader;
        this.f256736c = iVar;
    }

    public static /* synthetic */ void b(s2 s2Var, com.planner5d.library.model.manager.statistics.events.o3.a aVar, com.planner5d.library.model.manager.statistics.events.o3.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            dVar = null;
        }
        s2Var.a(aVar, dVar);
    }

    private final boolean k(Item item, Item item2, int i10) {
        ItemLayout layout = item.getLayout(new ItemLayout());
        ItemLayout layout2 = item2.getLayout(new ItemLayout());
        com.planner5d.library.math.m mVar = new com.planner5d.library.math.m(0.0f, 0.0f, 0.0f, 7, null);
        com.planner5d.library.math.m mVar2 = new com.planner5d.library.math.m(0.0f, 0.0f, 0.0f, 7, null);
        boolean z10 = !((item instanceof ItemPoint) && (item2 instanceof ItemPoint)) ? Intrinsics.areEqual(layout.getPosition(mVar), layout2.getPosition(mVar2)) : Intrinsics.areEqual(((ItemPoint) item).getPoint(), ((ItemPoint) item2).getPoint());
        boolean zAreEqual = Intrinsics.areEqual(layout.getScale(mVar), layout2.getScale(mVar2));
        boolean z11 = !zAreEqual;
        if (!z10 && zAreEqual && i10 <= 0) {
            return false;
        }
        com.planner5d.library.model.manager.statistics.events.t0.f217461b.Q(x(), w(item), v(item), i10, z11, z10, y());
        return true;
    }

    private final boolean l(Item item, ItemMaterial itemMaterial, ItemMaterial itemMaterial2) {
        if (Intrinsics.areEqual(itemMaterial, itemMaterial2) || itemMaterial == null || itemMaterial2 == null) {
            return false;
        }
        com.planner5d.library.model.y yVar = itemMaterial.texture;
        String str = yVar != null ? yVar.f222851c : null;
        com.planner5d.library.model.y yVar2 = itemMaterial2.texture;
        String str2 = yVar2 != null ? yVar2.f222851c : null;
        boolean zAreEqual = Intrinsics.areEqual(str, str2);
        com.planner5d.library.model.manager.statistics.events.t0 t0Var = com.planner5d.library.model.manager.statistics.events.t0.f217461b;
        com.planner5d.library.model.manager.statistics.events.o3.j jVarX = x();
        com.planner5d.library.model.manager.statistics.events.o3.i iVarW = w(item);
        String strV = v(item);
        boolean z10 = !Intrinsics.areEqual(itemMaterial.color, itemMaterial2.color);
        String str3 = !zAreEqual ? str2 : null;
        String str4 = !zAreEqual ? str : null;
        com.planner5d.library.model.y yVar3 = itemMaterial.texture;
        Float f10 = yVar3 != null ? yVar3.f222853e : null;
        com.planner5d.library.model.y yVar4 = itemMaterial2.texture;
        boolean z11 = !Intrinsics.areEqual(f10, yVar4 != null ? yVar4.f222853e : null);
        com.planner5d.library.model.y yVar5 = itemMaterial.texture;
        Float f11 = yVar5 != null ? yVar5.f222852d : null;
        com.planner5d.library.model.y yVar6 = itemMaterial2.texture;
        t0Var.G(jVarX, iVarW, strV, z10, str3, str4, z11, !Intrinsics.areEqual(f11, yVar6 != null ? yVar6.f222852d : null), y());
        return true;
    }

    private final int m(Item item, ItemMaterial[] itemMaterialArr, ItemMaterial[] itemMaterialArr2) {
        int i10 = 0;
        if (itemMaterialArr == null) {
            return 0;
        }
        int length = itemMaterialArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int i13 = i12 + 1;
            if (l(item, itemMaterialArr[i10], itemMaterialArr2 != null ? (ItemMaterial) ArraysKt.getOrNull(itemMaterialArr2, i12) : null)) {
                i11++;
            }
            i10++;
            i12 = i13;
        }
        return i11;
    }

    private final boolean n(ItemRoom itemRoom, ItemRoom itemRoom2, int i10) {
        Boolean bool;
        Boolean[] boolArr = {Boolean.valueOf(!(itemRoom.height == itemRoom2.height)), Boolean.valueOf(!(itemRoom.getWallsThicknessRaw() == itemRoom2.getWallsThicknessRaw())), Boolean.valueOf(itemRoom.getType() != itemRoom2.getType()), Boolean.valueOf(!Intrinsics.areEqual(itemRoom.getTitle(), itemRoom2.getTitle())), Boolean.valueOf(itemRoom.getCeilingHidden() != itemRoom2.getCeilingHidden()), Boolean.valueOf(itemRoom.getFloorHidden() != itemRoom2.getFloorHidden())};
        if (i10 <= 0) {
            int i11 = 0;
            while (true) {
                if (i11 >= 6) {
                    bool = null;
                    break;
                }
                bool = boolArr[i11];
                if (bool.booleanValue()) {
                    break;
                }
                i11++;
            }
            if (!Intrinsics.areEqual(bool, Boolean.TRUE)) {
                return false;
            }
        }
        com.planner5d.library.model.manager.statistics.events.t0.f217461b.j0(x(), i10, boolArr[0].booleanValue(), boolArr[1].booleanValue(), boolArr[2].booleanValue() ? Integer.valueOf(itemRoom.getType()) : null, boolArr[2].booleanValue() ? Integer.valueOf(itemRoom2.getType()) : null, boolArr[3].booleanValue(), boolArr[4].booleanValue(), boolArr[5].booleanValue(), y());
        return true;
    }

    private final boolean o(ItemWall itemWall, ItemWall itemWall2, int i10) {
        boolean z10 = itemWall.getLength() == itemWall2.getLength();
        boolean z11 = !z10;
        boolean z12 = itemWall.thickness == itemWall2.thickness;
        boolean z13 = !z12;
        if (i10 <= 0 && z12 && z10) {
            return false;
        }
        com.planner5d.library.model.manager.statistics.events.t0.f217461b.U(x(), i10, z13, z11, y());
        return true;
    }

    private final String v(Item item) {
        if (item instanceof ItemNs) {
            return ((ItemNs) item).getModelId();
        }
        return null;
    }

    private final com.planner5d.library.model.manager.statistics.events.o3.i w(Item item) {
        if (item instanceof ItemRoom) {
            return com.planner5d.library.model.manager.statistics.events.o3.i.room;
        }
        if (item instanceof ItemPartition) {
            return com.planner5d.library.model.manager.statistics.events.o3.i.partition;
        }
        if (item instanceof ItemGround) {
            return com.planner5d.library.model.manager.statistics.events.o3.i.ground;
        }
        if (item instanceof ItemRuler) {
            return com.planner5d.library.model.manager.statistics.events.o3.i.ruler;
        }
        if (item instanceof ItemWall) {
            return com.planner5d.library.model.manager.statistics.events.o3.i.wall;
        }
        if (item instanceof ItemPr) {
            return com.planner5d.library.model.manager.statistics.events.o3.i.pr;
        }
        if (item instanceof ItemDoor) {
            return com.planner5d.library.model.manager.statistics.events.o3.i.door;
        }
        if (item instanceof ItemWindow) {
            return com.planner5d.library.model.manager.statistics.events.o3.i.window;
        }
        return item instanceof ItemPoint ? com.planner5d.library.model.manager.statistics.events.o3.i.point : com.planner5d.library.model.manager.statistics.events.o3.i.other;
    }

    private final com.planner5d.library.model.manager.statistics.events.o3.j x() {
        if (this.f256734a.H1()) {
            return com.planner5d.library.model.manager.statistics.events.o3.j.f217278a;
        }
        if (this.f256734a.D1()) {
            return com.planner5d.library.model.manager.statistics.events.o3.j.f217279b;
        }
        if (this.f256734a.A1()) {
            return com.planner5d.library.model.manager.statistics.events.o3.j.VR;
        }
        return null;
    }

    private final Long y() {
        Project model = this.f256735b.getModel();
        if (model != null) {
            return model.projectId;
        }
        return null;
    }

    public final void A(@Nullable Boolean bool) {
        com.planner5d.library.model.manager.statistics.events.p3.b bVar;
        com.planner5d.library.model.manager.statistics.events.b2 b2Var = com.planner5d.library.model.manager.statistics.events.b2.f216725b;
        x3.a aVar = x3.a.download;
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            bVar = com.planner5d.library.model.manager.statistics.events.p3.b.success;
        } else {
            bVar = Intrinsics.areEqual(bool, Boolean.FALSE) ? com.planner5d.library.model.manager.statistics.events.p3.b.error : null;
        }
        b2Var.u0(aVar, bVar, y());
    }

    public final void B(@NotNull t3 value) {
        com.planner5d.library.model.manager.statistics.events.o3.c cVar;
        Long l10;
        Intrinsics.checkNotNullParameter(value, "value");
        Project projectB = value.b();
        Long l11 = projectB != null ? projectB.contestId : null;
        if (l11 == null || (cVar = com.planner5d.library.model.manager.statistics.events.o3.c.contest) == null) {
            cVar = com.planner5d.library.model.manager.statistics.events.o3.c.f217230a;
        }
        com.planner5d.library.model.manager.statistics.events.o3.c cVar2 = cVar;
        com.planner5d.library.model.manager.statistics.events.t0 t0Var = com.planner5d.library.model.manager.statistics.events.t0.f217461b;
        com.planner5d.library.model.manager.statistics.events.o3.j jVarX = x();
        boolean zZ1 = this.f256734a.z1();
        Project projectB2 = value.b();
        t0Var.g0(jVarX, zZ1, cVar2, l11, Long.valueOf((projectB2 == null || (l10 = projectB2.projectId) == null) ? 0L : l10.longValue()));
    }

    public final void C(@Nullable String str) {
        com.planner5d.library.model.manager.statistics.events.l2.f217094b.u(y3.c.locked_edit, str);
    }

    public final void D(@NotNull com.planner5d.library.services.utility.i builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        com.planner5d.library.services.r rVar = com.planner5d.library.services.r.mode;
        com.planner5d.library.model.manager.statistics.events.o3.j jVarX = x();
        builder.j(rVar, jVarX != null ? jVarX.name() : null);
    }

    public final void a(@NotNull com.planner5d.library.model.manager.statistics.events.o3.a action, @Nullable com.planner5d.library.model.manager.statistics.events.o3.d dVar) {
        Intrinsics.checkNotNullParameter(action, "action");
        com.planner5d.library.model.manager.statistics.events.t0.f217461b.p(x(), action, y(), dVar);
    }

    @kotlin.l(message = "was used in old editor")
    public final void c() {
        com.planner5d.library.model.manager.statistics.events.t0.f217461b.T(x(), y());
    }

    public final void d(@NotNull CatalogCategory category, boolean z10) {
        Intrinsics.checkNotNullParameter(category, "category");
        com.planner5d.library.model.manager.statistics.events.t0.f217461b.D(x(), category.getId(), category.getParentId() == 0 ? com.planner5d.library.model.manager.statistics.events.o3.b.category : com.planner5d.library.model.manager.statistics.events.o3.b.subcategory, z10 ? com.planner5d.library.model.manager.statistics.events.o3.f.renders : null);
    }

    public final void e(@NotNull String query, int i10) {
        Intrinsics.checkNotNullParameter(query, "query");
        if (StringsKt.E5(query).toString().length() > 2) {
            com.planner5d.library.model.manager.statistics.events.t0.f217461b.I0(x(), query, i10);
        }
    }

    @kotlin.l(message = "was used in old editor")
    public final void f(@Nullable Long l10) {
        com.planner5d.library.model.manager.statistics.events.t0.f217461b.k(x(), l10);
    }

    public final void g(@Nullable Long l10) {
        com.planner5d.library.model.manager.statistics.events.o3.c cVar;
        if (l10 == null || (cVar = com.planner5d.library.model.manager.statistics.events.o3.c.contest) == null) {
            cVar = com.planner5d.library.model.manager.statistics.events.o3.c.f217230a;
        }
        com.planner5d.library.model.manager.statistics.events.t0.f217461b.d0(x(), this.f256734a.z1(), cVar, l10, y());
    }

    public final void h() {
        com.planner5d.library.model.manager.statistics.events.t0.f217461b.a0(x(), y());
    }

    public final void i(@NotNull com.planner5d.library.model.manager.statistics.events.o3.e action) {
        Intrinsics.checkNotNullParameter(action, "action");
        com.planner5d.library.model.manager.statistics.events.t0.f217461b.B0(x(), action, y());
    }

    public final void j(@Nullable Item item, @NotNull com.planner5d.library.model.manager.statistics.events.o3.g source, boolean z10) {
        com.planner5d.library.model.manager.statistics.events.o3.f fVar;
        Long lW;
        Intrinsics.checkNotNullParameter(source, "source");
        if (item != null) {
            String strV = v(item);
            com.planner5d.library.model.manager.builtin.i iVar = this.f256736c;
            if (iVar != null) {
                lW = iVar.W(strV);
                fVar = null;
            } else {
                fVar = null;
                lW = null;
            }
            com.planner5d.library.model.manager.statistics.events.t0.f217461b.w(x(), w(item), strV, lW, source, z10 ? com.planner5d.library.model.manager.statistics.events.o3.f.renders : fVar, y());
        }
    }

    public final void p(@Nullable Item item) {
        if (item != null) {
            com.planner5d.library.model.manager.statistics.events.t0.f217461b.h0(x(), w(item), v(item), y());
        }
    }

    public final void q(@Nullable Item item, @NotNull com.planner5d.library.model.manager.statistics.events.o3.h action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (item != null) {
            com.planner5d.library.model.manager.statistics.events.t0.f217461b.X(x(), w(item), v(item), action, y());
        }
    }

    public final void r(@NotNull Item item, @NotNull Item itemOld) {
        boolean zO;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(itemOld, "itemOld");
        int iM = m(item, item.getMaterials(), itemOld.getMaterials());
        if ((item instanceof ItemRoom) && (itemOld instanceof ItemRoom)) {
            zO = n((ItemRoom) item, (ItemRoom) itemOld, iM);
        } else {
            zO = ((item instanceof ItemWall) && (itemOld instanceof ItemWall)) ? o((ItemWall) item, (ItemWall) itemOld, iM) : k(item, itemOld, iM);
        }
        com.planner5d.library.model.manager.statistics.events.t0.f217461b.x(x(), w(item), v(item), zO, y());
    }

    public final void s(@Nullable Item item) {
        if (item != null) {
            com.planner5d.library.model.manager.statistics.events.t0.f217461b.O(x(), w(item), v(item), y());
        }
    }

    public final void t(boolean z10) {
        com.planner5d.library.model.manager.statistics.events.t0.f217461b.m0(x(), z10 ? com.planner5d.library.model.manager.statistics.events.o3.j.f217279b : com.planner5d.library.model.manager.statistics.events.o3.j.f217278a, y());
    }

    public final void u() {
        com.planner5d.library.model.manager.statistics.events.t0.f217461b.m0(x(), com.planner5d.library.model.manager.statistics.events.o3.j.VR, y());
    }

    public final void z(int i10) {
        com.planner5d.library.model.manager.statistics.events.r3.e eVar;
        if (i10 == 1) {
            eVar = com.planner5d.library.model.manager.statistics.events.r3.e.portrait;
        } else if (i10 != 2) {
            timber.log.b.f381052a.d("Unknown screen orientation", new Object[0]);
            eVar = null;
        } else {
            eVar = com.planner5d.library.model.manager.statistics.events.r3.e.landscape;
        }
        if (eVar != null) {
            com.planner5d.library.model.manager.statistics.events.j1.f216988b.I(eVar, com.planner5d.library.model.manager.statistics.events.r3.h.editor);
        }
    }
}
