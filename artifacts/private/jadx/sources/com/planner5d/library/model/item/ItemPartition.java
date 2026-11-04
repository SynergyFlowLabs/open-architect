package com.planner5d.library.model.item;

/* JADX INFO: loaded from: classes7.dex */
public class ItemPartition extends ItemWalls {
    public ItemPartition(String str, ItemWall[] itemWallArr, ItemFloor itemFloor, ProviderUid providerUid) {
        super(str, itemWallArr, itemFloor, providerUid);
        resetWalls();
    }

    @Override // com.planner5d.library.model.item.ItemWalls
    protected ItemWall[] createWallsAddHidden(ItemWall[] itemWallArr, ProviderUid providerUid) {
        return super.createWallsAddHidden(itemWallArr, false, providerUid);
    }

    @Override // com.planner5d.library.model.item.Item
    public ItemMaterial[] getMaterials() {
        return new ItemMaterial[]{this.materialWallInside, this.materialWallOutside};
    }

    public ItemPartition(ItemPartition itemPartition, ProviderUid providerUid) {
        super(itemPartition, providerUid);
    }
}
