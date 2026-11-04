package com.planner5d.library.model.item;

import android.graphics.Color;
import com.planner5d.library.math.c;
import com.planner5d.library.math.k;
import com.planner5d.library.walls.Wall;
import com.planner5d.library.walls.WallsInfoWall;
import com.planner5d.library.widget.editor.editor2d.drawable.r;
import com.planner5d.library.widget.editor.editor2d.drawable.t;
import com.planner5d.library.widget.editor.editor2d.drawable.u;
import com.planner5d.library.widget.editor.editor2d.drawable.w;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public class ItemWall extends Item implements Wall {
    public static final String DEFAULT_TEXTURE_WALL = "wallp_1_1";
    public static final String DEFAULT_TEXTURE_WALL_EMPTY = "wallp_0";
    public static final String DEFAULT_TEXTURE_WALL_OUTSIDE = "bricks_1";
    public static final String FIELD_MATERIAL_INDOOR = "indoor";
    public static final String FIELD_MATERIAL_OUTDOOR = "outdoor";
    public static final ItemMaterial MATERIAL_CLOSE = new ItemMaterial((String) null, Color.rgb(200, 200, 200));
    public static final float WALL_THICKNESS_DEFAULT = 10.0f;
    public boolean hidden;
    private ItemMaterial materialInside;
    private ItemMaterial materialOutside;
    private final ItemPoint[] points;
    public float thickness;

    public ItemWall(String str, ItemPoint itemPoint, ItemPoint itemPoint2) {
        super(str);
        this.hidden = false;
        this.thickness = 10.0f;
        this.materialInside = new ItemMaterial(FIELD_MATERIAL_INDOOR);
        this.materialOutside = new ItemMaterial(FIELD_MATERIAL_OUTDOOR);
        this.points = new ItemPoint[]{itemPoint, itemPoint2};
    }

    private String getMaterialName(boolean z10) {
        return z10 ? FIELD_MATERIAL_INDOOR : FIELD_MATERIAL_OUTDOOR;
    }

    private void setMaterial(ItemMaterial itemMaterial, boolean z10) {
        setMaterial(itemMaterial == null ? createMaterialDefault(z10) : new ItemMaterial(itemMaterial, getMaterialName(z10)));
    }

    @Override // com.planner5d.library.model.item.Item
    protected w createDrawables() {
        ItemWalls parentWalls = getParentWalls();
        if (parentWalls == null) {
            return null;
        }
        WallsInfoWall wallInfo = parentWalls.getWallInfo(this);
        if (!(parentWalls instanceof ItemRoom) && !(parentWalls instanceof ItemPartition)) {
            return w.g(new r(wallInfo));
        }
        return w.g(new t(wallInfo), new u(wallInfo));
    }

    public ItemMaterial createMaterialDefault(boolean z10) {
        return new ItemMaterial(getMaterialName(z10), z10 ? DEFAULT_TEXTURE_WALL : DEFAULT_TEXTURE_WALL_OUTSIDE);
    }

    public k getCenterPosition(k kVar, k kVar2) {
        return getPoint(kVar, true, true).b(getPoint(kVar2, true, false)).R(0.5f);
    }

    @Override // com.planner5d.library.model.item.Item
    public Item[] getChildren() {
        return this.points;
    }

    @Override // com.planner5d.library.walls.Wall
    public float getHeight() {
        ItemWalls parentWalls = getParentWalls();
        if ((parentWalls instanceof ItemRoom) || (parentWalls instanceof ItemPartition)) {
            return parentWalls.height;
        }
        return 0.0f;
    }

    public float getLength() {
        return this.points[0].getPoint().m(this.points[1].getPoint());
    }

    public Map<String, ItemMaterial> getMaterialMap() {
        ItemMaterial[] materials = getMaterials();
        HashMap map = new HashMap();
        if (materials != null) {
            map.put(FIELD_MATERIAL_INDOOR, materials[0]);
            int i10 = 7 ^ 1;
            map.put(FIELD_MATERIAL_OUTDOOR, materials[1]);
        }
        return map;
    }

    public ItemMaterial getMaterialSide(boolean z10) {
        ItemMaterial materialWall = z10 ? this.materialInside : this.materialOutside;
        if (materialWall != null && !materialWall.getIsEmpty()) {
            return materialWall;
        }
        ItemWalls itemWalls = (ItemWalls) getParentItem();
        if (itemWalls instanceof ItemRoom) {
            materialWall = itemWalls.getMaterialWall(z10);
        }
        return (materialWall == null || materialWall.getIsEmpty()) ? createMaterialDefault(z10) : materialWall;
    }

    @Override // com.planner5d.library.model.item.Item
    public ItemMaterial[] getMaterials() {
        if (getParentItem() instanceof ItemRoom) {
            return new ItemMaterial[]{new ItemMaterial(this.materialInside), new ItemMaterial(this.materialOutside)};
        }
        return null;
    }

    public int getMinimumWidth() {
        return 5;
    }

    @Override // com.planner5d.library.walls.Wall
    @NotNull
    public k getOrigin(@NotNull k kVar) {
        return getParentItem().getLayoutPosition(kVar);
    }

    public ItemWalls getParentWalls() {
        Item parentItem = getParentItem();
        if (parentItem instanceof ItemWalls) {
            return (ItemWalls) parentItem;
        }
        return null;
    }

    @Override // com.planner5d.library.walls.Wall
    @NotNull
    public k getPoint(@NotNull k kVar, boolean z10, boolean z11) {
        return this.points[!z11 ? 1 : 0].getPoint(kVar, z10);
    }

    public ItemPoint[] getPoints() {
        return this.points;
    }

    public k getVector(k kVar) {
        return getPoint(kVar, true, false).b0(getPoint(kVar, true, true).f180480a, kVar.f180481b);
    }

    @Override // com.planner5d.library.walls.Wall
    public float getWidth() {
        return this.thickness;
    }

    public boolean intersects(ItemWall itemWall, k kVar, k kVar2) {
        getPoint(kVar, true, true);
        getPoint(kVar2, true, false);
        c cVar = new c(kVar, kVar2);
        itemWall.getPoint(kVar, true, true);
        itemWall.getPoint(kVar2, true, false);
        k kVarH = cVar.h(new c(kVar, kVar2));
        return (kVarH == c.f180466e.b() || kVarH.q(kVar2, 0.01f) || kVarH.q(kVar, 0.01f)) ? false : true;
    }

    @Override // com.planner5d.library.walls.Wall
    public boolean isHidden() {
        return this.hidden;
    }

    @Override // com.planner5d.library.walls.Wall
    public boolean isZero() {
        return this.points[0].getPoint().equals(this.points[1].getPoint());
    }

    @Override // com.planner5d.library.model.item.Item
    protected void onLayoutChanged(ItemLayout itemLayout) {
        super.onLayoutChanged(itemLayout);
        ItemPoint[] itemPointArr = this.points;
        if (itemPointArr != null) {
            for (ItemPoint itemPoint : itemPointArr) {
                itemPoint.setLayout(itemLayout);
            }
        }
    }

    public void setMaterials(ItemMaterial[] itemMaterialArr) {
        if (itemMaterialArr != null) {
            setMaterial(itemMaterialArr[0], true);
            setMaterial(itemMaterialArr[1], false);
        }
    }

    @Override // com.planner5d.library.model.item.Item
    public void setParentItem(Item item) {
        super.setParentItem(item);
        ItemPoint[] itemPointArr = this.points;
        ItemPoint itemPoint = itemPointArr[0];
        if (itemPoint == null || itemPointArr[1] == null) {
            return;
        }
        itemPoint.setParentItem(this);
        this.points[1].setParentItem(this);
    }

    void updateInfo(WallsInfoWall wallsInfoWall) {
        w drawables = getDrawables();
        if (drawables != null) {
            for (com.planner5d.library.widget.editor.editor2d.drawable.c cVar : drawables.f255098a) {
                ((r) cVar).m(wallsInfoWall);
            }
        }
    }

    public void setMaterials(Map<String, ItemMaterial> map) {
        boolean z10 = false;
        setMaterial(map.getOrDefault(FIELD_MATERIAL_INDOOR, null), true);
        setMaterial(map.getOrDefault(FIELD_MATERIAL_OUTDOOR, null), false);
    }

    public void setMaterial(@NotNull ItemMaterial itemMaterial) {
        if (FIELD_MATERIAL_INDOOR.equals(itemMaterial.name)) {
            this.materialInside = new ItemMaterial(itemMaterial, this.materialInside.name);
        } else {
            if (FIELD_MATERIAL_OUTDOOR.equals(itemMaterial.name)) {
                this.materialOutside = new ItemMaterial(itemMaterial, this.materialOutside.name);
            }
        }
    }

    public ItemWall(ItemWall itemWall, ProviderUid providerUid) {
        super(itemWall, providerUid);
        this.hidden = false;
        this.thickness = 10.0f;
        this.materialInside = new ItemMaterial(FIELD_MATERIAL_INDOOR);
        this.materialOutside = new ItemMaterial(FIELD_MATERIAL_OUTDOOR);
        this.materialInside = ItemMaterial.clone(itemWall.materialInside);
        this.materialOutside = ItemMaterial.clone(itemWall.materialOutside);
        this.hidden = itemWall.hidden;
        this.thickness = itemWall.thickness;
        this.points = new ItemPoint[]{new ItemPoint(itemWall.points[0], providerUid), new ItemPoint(itemWall.points[1], providerUid)};
    }
}
