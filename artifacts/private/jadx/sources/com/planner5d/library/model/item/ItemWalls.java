package com.planner5d.library.model.item;

import android.util.Pair;
import androidx.annotation.NonNull;
import com.planner5d.library.math.k;
import com.planner5d.library.model.item.builder.ItemCloner;
import com.planner5d.library.walls.WallsBuilder;
import com.planner5d.library.walls.WallsInfo;
import com.planner5d.library.walls.WallsInfoWall;
import com.planner5d.library.widget.editor.editor2d.drawable.i;
import com.planner5d.library.widget.editor.editor2d.drawable.w;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Map;
import org.apache.commons.lang3.c;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ItemWalls extends Item {
    public static final float DEFAULT_HEIGHT = 270.0f;
    public float height;
    protected ItemMaterial materialWallInside;
    protected ItemMaterial materialWallOutside;
    protected ItemWall[] walls;
    private WallsInfo wallsInfo;
    private float wallsThickness;

    public ItemWalls(String str, ItemWall[] itemWallArr, ItemFloor itemFloor, ProviderUid providerUid) {
        super(str);
        this.wallsInfo = null;
        this.height = 270.0f;
        this.wallsThickness = 10.0f;
        this.walls = null;
        this.materialWallInside = new ItemMaterial(ItemWall.FIELD_MATERIAL_INDOOR);
        this.materialWallOutside = new ItemMaterial(ItemWall.FIELD_MATERIAL_OUTDOOR);
        this.walls = createWallsAddHidden(itemWallArr, providerUid);
        setParentItem(itemFloor);
    }

    private ItemWall[] createWalls(ItemWall[] itemWallArr) {
        k kVar = new k();
        int length = itemWallArr.length;
        ItemWall[] itemWallArr2 = new ItemWall[length];
        System.arraycopy(itemWallArr, 0, itemWallArr2, 0, itemWallArr.length);
        for (int i10 = 0; i10 < length; i10++) {
            ItemWall itemWall = itemWallArr2[i10];
            itemWall.setParentItem(this);
            if (i10 > 0) {
                itemWallArr2[i10 - 1].getPoint(kVar, false, false);
                itemWall.getPoints()[0].setPoint(kVar.f180480a, kVar.f180481b);
                if (i10 == length - 1) {
                    itemWallArr2[0].getPoint(kVar, false, true);
                    itemWall.getPoints()[1].setPoint(kVar.f180480a, kVar.f180481b);
                }
            }
        }
        return itemWallArr2;
    }

    private ItemWall[] splitWallOnMiddle(@NonNull ItemWall itemWall, ProviderUid providerUid) {
        ItemPoint[] points = itemWall.getPoints();
        k point = points[0].getPoint(new k(), false);
        k kVarC0 = new k(points[1].getPoint(new k(), false)).c0(point);
        kVarC0.M().R(kVarC0.F() * 0.5f);
        kVarC0.b(point);
        ItemWall[] itemWallArr = {new ItemWall(providerUid.createUid(), points[0], new ItemPoint(providerUid.createUid(), kVarC0)), new ItemWall(providerUid.createUid(), new ItemPoint(providerUid.createUid(), kVarC0), points[1])};
        ItemLayout layout = getLayout(new ItemLayout());
        ItemMaterial[] materials = itemWall.getMaterials();
        for (int i10 = 0; i10 < 2; i10++) {
            ItemWall itemWall2 = itemWallArr[i10];
            itemWall2.hidden = itemWall.hidden;
            itemWall2.thickness = itemWall.thickness;
            itemWall2.setMaterials(materials);
            itemWall2.setParentItem(this);
            itemWall2.setLayout(layout);
        }
        return itemWallArr;
    }

    public ItemWall[] createInvertedWalls() {
        ItemWall[] itemWallArr = (ItemWall[]) ItemCloner.clone(ItemWall.class, getChildren(), null, null);
        c.k3(itemWallArr);
        k kVar = new k();
        k kVar2 = new k();
        for (ItemWall itemWall : itemWallArr) {
            ItemPoint[] points = itemWall.getPoints();
            points[0].getPoint(kVar, false);
            points[1].getPoint(kVar2, false);
            points[1].setPoint(kVar.f180480a, kVar.f180481b, false);
            points[0].setPoint(kVar2.f180480a, kVar2.f180481b, false);
        }
        return itemWallArr;
    }

    protected ItemWall[] createWallsAddHidden(ItemWall[] itemWallArr, ProviderUid providerUid) {
        return createWallsAddHidden(itemWallArr, true, providerUid);
    }

    public ItemMaterial getMaterialWall(boolean z10) {
        return new ItemMaterial(z10 ? this.materialWallInside : this.materialWallOutside);
    }

    public WallsInfoWall getWallInfo(ItemWall itemWall) {
        return getWallsInfo().get(itemWall);
    }

    public WallsInfo getWallsInfo() {
        WallsInfo wallsInfo = this.wallsInfo;
        if (wallsInfo != null) {
            return wallsInfo;
        }
        WallsInfo wallsInfoBuild = WallsBuilder.INSTANCE.build(this.walls);
        this.wallsInfo = wallsInfoBuild;
        return wallsInfoBuild;
    }

    public float getWallsThickness() {
        ItemWall[] itemWallArr = this.walls;
        if (itemWallArr != null && itemWallArr.length > 0) {
            for (ItemWall itemWall : itemWallArr) {
                if (itemWall.thickness == itemWallArr[0].thickness) {
                }
            }
            return BigDecimal.valueOf(itemWallArr[0].thickness).setScale(2, RoundingMode.HALF_UP).floatValue();
        }
        return BigDecimal.valueOf(getWallsThicknessRaw()).setScale(2, RoundingMode.HALF_UP).floatValue();
    }

    public float getWallsThicknessRaw() {
        return this.wallsThickness;
    }

    @Override // com.planner5d.library.model.item.Item
    protected void onLayoutChanged(ItemLayout itemLayout) {
        super.onLayoutChanged(itemLayout);
        ItemWall[] itemWallArr = this.walls;
        if (itemWallArr != null) {
            for (ItemWall itemWall : itemWallArr) {
                itemWall.setLayout(itemLayout);
            }
        }
    }

    public void resetDrawables() {
        resetDrawable();
        for (ItemWall itemWall : this.walls) {
            itemWall.resetDrawable();
        }
    }

    public void resetWalls() {
        this.wallsInfo = null;
        WallsInfo wallsInfo = getWallsInfo();
        if (wallsInfo != null) {
            for (WallsInfoWall wallsInfoWall : wallsInfo.get()) {
                ((ItemWall) wallsInfoWall.getWall()).updateInfo(wallsInfoWall);
            }
        }
        w drawables = getDrawables();
        if (drawables != null) {
            ((i) drawables.f255098a[0]).r();
        }
    }

    public void setMaterials(ItemMaterial itemMaterial, ItemMaterial itemMaterial2) {
        if (itemMaterial == null) {
            itemMaterial = new ItemMaterial("", ItemWall.DEFAULT_TEXTURE_WALL_EMPTY);
        }
        this.materialWallInside = new ItemMaterial(itemMaterial, this.materialWallInside.name);
        if (itemMaterial2 == null) {
            itemMaterial2 = new ItemMaterial("", ItemWall.DEFAULT_TEXTURE_WALL_EMPTY);
        }
        this.materialWallOutside = new ItemMaterial(itemMaterial2, this.materialWallOutside.name);
    }

    public void setWalls(ItemWall[] itemWallArr) {
        if (this.walls != itemWallArr) {
            this.walls = createWalls(itemWallArr);
        }
        resetWalls();
    }

    public void setWallsThickness(float f10) {
        this.wallsThickness = f10;
    }

    public Pair<ItemWall[], ItemWall[]> splitWall(@NonNull ItemWall itemWall, ProviderUid providerUid) {
        ArrayList arrayList = new ArrayList();
        ItemWall[] itemWallArrSplitWallOnMiddle = null;
        for (ItemWall itemWall2 : this.walls) {
            if (itemWall.equals(itemWall2)) {
                if (this.walls.length == 1) {
                    k kVar = new k();
                    ItemWall itemWall3 = new ItemWall(itemWall2, providerUid);
                    ItemPoint[] points = itemWall3.getPoints();
                    points[0].setPoint(itemWall2.getPoint(kVar, false, false).f180480a, kVar.f180481b);
                    points[1].setPoint(itemWall2.getPoint(kVar, false, true).f180480a, kVar.f180481b);
                    arrayList.add(itemWall3);
                }
                itemWallArrSplitWallOnMiddle = splitWallOnMiddle(itemWall2, providerUid);
                Collections.addAll(arrayList, itemWallArrSplitWallOnMiddle);
            } else {
                arrayList.add(itemWall2);
            }
        }
        return new Pair<>((ItemWall[]) arrayList.toArray(new ItemWall[0]), itemWallArrSplitWallOnMiddle);
    }

    protected ItemWall[] createWallsAddHidden(ItemWall[] itemWallArr, boolean z10, ProviderUid providerUid) {
        k kVar = new k();
        k kVar2 = new k();
        LinkedList linkedList = new LinkedList();
        int i10 = 0;
        while (i10 < itemWallArr.length) {
            int length = i10 == 0 ? itemWallArr.length - 1 : i10 - 1;
            ItemWall itemWall = itemWallArr[i10];
            itemWall.getPoint(kVar, false, true);
            itemWall.setParentItem(this);
            itemWallArr[length].getPoint(kVar2, false, false);
            if (!kVar.equals(kVar2) && (i10 > 0 || z10)) {
                ItemWall itemWall2 = new ItemWall(itemWall, providerUid);
                ItemPoint[] points = itemWall2.getPoints();
                points[0].setPoint(kVar2.f180480a, kVar2.f180481b, false);
                points[1].setPoint(kVar.f180480a, kVar.f180481b, false);
                itemWall2.setParentItem(this);
                linkedList.add(itemWall2);
            }
            linkedList.add(itemWall);
            i10++;
        }
        return (ItemWall[]) linkedList.toArray(new ItemWall[0]);
    }

    @Override // com.planner5d.library.model.item.Item
    public ItemWall[] getChildren() {
        return this.walls;
    }

    public void setMaterials(Map<String, ItemMaterial> map) {
        setMaterials(map.get(ItemWall.FIELD_MATERIAL_INDOOR), map.get(ItemWall.FIELD_MATERIAL_OUTDOOR));
    }

    public ItemWalls(ItemWalls itemWalls, ProviderUid providerUid) {
        super(itemWalls, providerUid);
        this.wallsInfo = null;
        this.height = 270.0f;
        this.wallsThickness = 10.0f;
        this.walls = null;
        this.materialWallInside = new ItemMaterial(ItemWall.FIELD_MATERIAL_INDOOR);
        this.materialWallOutside = new ItemMaterial(ItemWall.FIELD_MATERIAL_OUTDOOR);
        ItemWall[] itemWallArr = itemWalls.walls;
        if (itemWallArr != null) {
            this.walls = new ItemWall[itemWallArr.length];
            int i10 = 0;
            while (true) {
                ItemWall[] itemWallArr2 = this.walls;
                if (i10 >= itemWallArr2.length) {
                    break;
                }
                itemWallArr2[i10] = new ItemWall(itemWalls.walls[i10], providerUid);
                this.walls[i10].setParentItem(this);
                i10++;
            }
        }
        setParentItem(itemWalls.getParentItem());
        setMaterials(itemWalls.materialWallInside, itemWalls.materialWallOutside);
    }
}
