package com.planner5d.library.model.item;

import androidx.annotation.NonNull;
import com.planner5d.library.widget.editor.editor2d.drawable.i;
import com.planner5d.library.widget.editor.editor2d.drawable.w;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class ItemGround extends ItemWalls {
    protected ItemMaterial materialFloor;

    public ItemGround(String str, ItemWall[] itemWallArr, ItemFloor itemFloor, ProviderUid providerUid) {
        super(str, itemWallArr, itemFloor, providerUid);
        this.materialFloor = new ItemMaterial("floor");
    }

    @Override // com.planner5d.library.model.item.Item
    protected w createDrawables() {
        i iVar = new i(this);
        iVar.t(this.materialFloor);
        return w.g(iVar);
    }

    public ItemMaterial getMaterialFloor() {
        return new ItemMaterial(this.materialFloor);
    }

    public Map<String, ItemMaterial> getMaterialMap() {
        HashMap map = new HashMap();
        map.put("floor", new ItemMaterial(this.materialFloor));
        return map;
    }

    @Override // com.planner5d.library.model.item.Item
    @NonNull
    public ItemMaterial[] getMaterials() {
        return new ItemMaterial[]{this.materialFloor};
    }

    public void setMaterialFloor(ItemMaterial itemMaterial) {
        this.materialFloor = new ItemMaterial(itemMaterial, this.materialFloor.name);
        w drawables = getDrawables();
        if (drawables == null || itemMaterial == null) {
            return;
        }
        int i10 = 7 ^ 0;
        ((i) drawables.f255098a[0]).t(itemMaterial);
    }

    @Override // com.planner5d.library.model.item.ItemWalls
    public void setWalls(ItemWall[] itemWallArr) {
        super.setWalls(itemWallArr);
        w drawables = getDrawables();
        if (drawables != null) {
            ((i) drawables.f255098a[0]).r();
        }
    }

    public ItemGround(ItemGround itemGround, ProviderUid providerUid) {
        super(itemGround, providerUid);
        ItemMaterial itemMaterial = new ItemMaterial("floor");
        this.materialFloor = itemMaterial;
        this.materialFloor = new ItemMaterial(itemGround.materialFloor, itemMaterial.name);
    }
}
