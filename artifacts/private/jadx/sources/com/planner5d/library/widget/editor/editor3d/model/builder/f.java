package com.planner5d.library.widget.editor.editor3d.model.builder;

import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemGrid;
import com.planner5d.library.model.item.ItemGround;
import com.planner5d.library.model.item.ItemLayout;
import com.planner5d.library.model.item.ItemMaterial;
import com.planner5d.library.model.item.ItemNs;
import com.planner5d.library.model.item.ItemPartition;
import com.planner5d.library.model.item.ItemPr;
import com.planner5d.library.model.item.ItemRoom;
import com.planner5d.library.model.item.ItemUnknown;
import com.planner5d.library.model.item.ItemWall;
import com.planner5d.library.model.item.ItemWalls;
import com.planner5d.library.walls.WallsBuilder3D;
import com.planner5d.library.walls.WallsInfo;
import com.planner5d.library.walls.WallsInfoWall;

/* JADX INFO: loaded from: classes12.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.planner5d.library.math.m f255653a = new com.planner5d.library.math.m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ItemLayout f255654b = new ItemLayout();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dc.d<cc.a> f255655c;

    public f(dc.d<cc.a> dVar) {
        this.f255655c = dVar;
    }

    public e a(Item item, float f10, boolean z10, boolean z11, WallsBuilder3D.WallPart wallPart, WallsInfoWall wallsInfoWall) {
        if (item instanceof ItemGrid) {
            return new g((ItemGrid) item, this.f255655c);
        }
        if (item instanceof ItemPr) {
            ItemPr itemPr = (ItemPr) item;
            ItemMaterial[] materials = itemPr.getMaterials();
            if (materials != null && materials.length >= 7) {
                return new q(itemPr, materials, item.getLayout(this.f255654b).getScale(this.f255653a), this.f255655c);
            }
        } else {
            if (item instanceof ItemNs) {
                return new n((ItemNs) item);
            }
            if (item instanceof ItemWall) {
                ItemWall itemWall = (ItemWall) item;
                Item parentItem = itemWall.getParentItem();
                boolean z12 = parentItem instanceof ItemRoom;
                if ((z12 || (parentItem instanceof ItemPartition)) && !itemWall.hidden && !itemWall.isZero()) {
                    boolean z13 = z12 && ((ItemRoom) parentItem).getCeilingHidden();
                    WallsInfo wallsInfo = ((ItemWalls) parentItem).getWallsInfo();
                    WallsInfoWall wallsInfoWall2 = wallsInfo.get(itemWall);
                    if (wallsInfoWall2 != null) {
                        return new y(this.f255655c, wallsInfo, wallsInfoWall2, wallPart, (z10 || z13) ? WallsBuilder3D.WallPart.CloseTop : null, z12 ? ((ItemRoom) parentItem).getFlooringHeight() : 0.0f);
                    }
                }
            } else if (item instanceof ItemGround) {
                ItemWall[] itemWallArr = (ItemWall[]) item.getChildren();
                if (itemWallArr != null && itemWallArr.length >= 2) {
                    return new l(this.f255655c, (ItemGround) item, f10, z10, z11, wallsInfoWall);
                }
            } else if (item instanceof ItemUnknown) {
                return new t(this.f255655c);
            }
        }
        return null;
    }
}
