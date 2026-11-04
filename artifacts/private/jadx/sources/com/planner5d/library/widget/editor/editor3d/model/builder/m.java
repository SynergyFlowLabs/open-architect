package com.planner5d.library.widget.editor.editor3d.model.builder;

import androidx.annotation.NonNull;
import androidx.annotation.m1;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemNs;
import com.planner5d.library.model.item.ItemRoom;
import com.planner5d.library.model.item.ItemWall;
import com.planner5d.library.walls.WallsBuilder3D;
import com.planner5d.library.walls.WallsInfoWall;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Item f255676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f255677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e f255678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f255679e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.planner5d.library.widget.editor.editor3d.model.n f255675a = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.planner5d.library.widget.editor.editor3d.model.n f255680f = null;

    class a extends f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ dc.d f255681d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(dc.d dVar, dc.d dVar2) {
            super(dVar);
            this.f255681d = dVar2;
        }

        @Override // com.planner5d.library.widget.editor.editor3d.model.builder.f
        public e a(Item item, float f10, boolean z10, boolean z11, WallsBuilder3D.WallPart wallPart, WallsInfoWall wallsInfoWall) {
            return new o(this.f255681d);
        }
    }

    private m(Item item, f fVar, boolean z10, float f10, boolean z11, WallsBuilder3D.WallPart wallPart) {
        this.f255677c = false;
        this.f255679e = f10;
        e eVarA = fVar.a(item, f10, z10, z11, wallPart, null);
        this.f255678d = eVarA;
        if (eVarA == null) {
            this.f255677c = true;
        }
        this.f255676b = item;
    }

    public static void c(List<m> list, @NonNull Item item, f fVar, boolean z10, float f10) {
        if (item instanceof ItemWall) {
            Collections.addAll(list, new m(item, fVar, z10, f10, false, WallsBuilder3D.WallPart.AllExceptSides), new m(item, fVar, z10, f10, false, WallsBuilder3D.WallPart.SideIndoor), new m(item, fVar, z10, f10, false, WallsBuilder3D.WallPart.SideOutdoor), new m(item, fVar, z10, f10, false, WallsBuilder3D.WallPart.CloseStart), new m(item, fVar, z10, f10, false, WallsBuilder3D.WallPart.CloseEnd));
            return;
        }
        WallsBuilder3D.WallPart wallPart = WallsBuilder3D.WallPart.All;
        list.add(new m(item, fVar, z10, f10, false, wallPart));
        if (item instanceof ItemRoom) {
            list.add(new m(item, fVar, z10, f10, true, wallPart));
            ItemRoom itemRoom = (ItemRoom) item;
            if (itemRoom.getFlooringHeight() <= 0.0f || itemRoom.getFloorHidden()) {
                return;
            }
            for (WallsInfoWall wallsInfoWall : itemRoom.getWallsInfo().getList()) {
                if (wallsInfoWall.getWall().isHidden()) {
                    list.add(new m(item, fVar, z10, f10, false, wallsInfoWall));
                }
            }
        }
    }

    public static m d(dc.d<cc.a> dVar) {
        return new m((Item) null, (f) new a(dVar, dVar), false, 0.0f, false, WallsBuilder3D.WallPart.All);
    }

    public void a(com.planner5d.library.engine.a aVar, ve.b bVar, cc.f fVar) {
        e eVar = this.f255678d;
        if (eVar == null || this.f255675a != null) {
            return;
        }
        cc.a aVarY = bVar.y(eVar.a(aVar, bVar));
        if (aVarY != null) {
            this.f255675a = new com.planner5d.library.widget.editor.editor3d.model.n(aVar, this.f255678d, this.f255676b, aVarY, this.f255679e, bVar, false, fVar);
        }
        this.f255677c = true;
    }

    @m1
    public void b(ve.b bVar) {
        e eVar = this.f255678d;
        if (eVar == null || this.f255675a != null) {
            return;
        }
        eVar.b(bVar);
    }

    public com.planner5d.library.widget.editor.editor3d.model.n e(com.planner5d.library.engine.a aVar, @NonNull m mVar, ve.b bVar, cc.f fVar) {
        com.planner5d.library.widget.editor.editor3d.model.n nVar = this.f255675a;
        if (nVar != null) {
            return nVar;
        }
        if (this.f255678d != null && this.f255680f == null && mVar.g() && (this.f255676b instanceof ItemNs)) {
            this.f255680f = new com.planner5d.library.widget.editor.editor3d.model.n(aVar, mVar.f255678d, this.f255676b, mVar.i().f255768d, this.f255679e, bVar, false, fVar);
        }
        return this.f255680f;
    }

    public e f() {
        return this.f255678d;
    }

    public boolean g() {
        return this.f255677c;
    }

    public Item h() {
        return this.f255676b;
    }

    public com.planner5d.library.widget.editor.editor3d.model.n i() {
        return this.f255675a;
    }

    private m(Item item, f fVar, boolean z10, float f10, boolean z11, WallsInfoWall wallsInfoWall) {
        this.f255677c = false;
        this.f255679e = f10;
        e eVarA = fVar.a(item, f10, z10, z11, WallsBuilder3D.WallPart.All, wallsInfoWall);
        this.f255678d = eVarA;
        if (eVarA == null) {
            this.f255677c = true;
        }
        this.f255676b = item;
    }
}
