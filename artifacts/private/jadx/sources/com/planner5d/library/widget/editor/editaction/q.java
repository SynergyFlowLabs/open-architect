package com.planner5d.library.widget.editor.editaction;

import androidx.annotation.NonNull;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemGround;
import com.planner5d.library.model.item.ItemMaterial;
import com.planner5d.library.model.item.ItemNs;
import com.planner5d.library.model.item.ItemPr;
import com.planner5d.library.model.item.ItemRoom;
import com.planner5d.library.model.item.ItemWall;
import com.planner5d.library.model.item.ItemWalls;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class q extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.planner5d.library.model.manager.builtin.i f254784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ItemMaterial f254785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, ItemMaterial> f254786d;

    public q(Item item, ItemMaterial itemMaterial, boolean z10, com.planner5d.library.model.manager.builtin.i iVar) {
        char c10;
        super(item.getUid());
        this.f254786d = new HashMap();
        this.f254784b = iVar;
        this.f254785c = new ItemMaterial(itemMaterial);
        if (z10 && (item instanceof ItemRoom)) {
            if (ItemWall.FIELD_MATERIAL_INDOOR.equals(itemMaterial.name)) {
                c10 = 0;
            } else if (!ItemWall.FIELD_MATERIAL_OUTDOOR.equals(itemMaterial.name)) {
                return;
            } else {
                c10 = 1;
            }
            for (ItemWall itemWall : ((ItemRoom) item).getChildren()) {
                this.f254786d.put(itemWall.getUid(), new ItemMaterial(itemWall.getMaterials()[c10]));
            }
        }
    }

    @Override // com.planner5d.library.widget.editor.editaction.e
    public void a(@NonNull h hVar) {
        Integer num;
        ItemMaterial itemMaterial;
        int i10;
        Item itemA = hVar.a(this.f254756a);
        b(hVar, itemA);
        if (itemA instanceof ItemPr) {
            ((ItemPr) itemA).setMaterial(this.f254785c);
            return;
        }
        if (itemA instanceof ItemWall) {
            ((ItemWall) itemA).setMaterial(this.f254785c);
            return;
        }
        if (itemA instanceof ItemNs) {
            ItemNs itemNs = (ItemNs) itemA;
            ItemMaterial[] materials = itemNs.getMaterials();
            if (materials == null || (i10 = (itemMaterial = this.f254785c).position) >= materials.length) {
                return;
            }
            materials[i10] = itemMaterial;
            itemNs.setMaterials(materials, this.f254784b);
            return;
        }
        if (itemA instanceof ItemWalls) {
            if ("floor".equals(this.f254785c.name)) {
                ((ItemGround) itemA).setMaterialFloor(this.f254785c);
                return;
            }
            if (itemA instanceof ItemRoom) {
                ItemRoom itemRoom = (ItemRoom) itemA;
                String str = this.f254785c.name;
                str.getClass();
                int i11 = 7 << 1;
                switch (str) {
                    case "indoor":
                        num = 2;
                        break;
                    case "outdoor":
                        num = 3;
                        break;
                    case "ceil":
                        num = 1;
                        break;
                    default:
                        num = null;
                        break;
                }
                if (num != null) {
                    ItemMaterial[] materials2 = itemRoom.getMaterials();
                    materials2[num.intValue()] = this.f254785c;
                    itemRoom.setMaterials(materials2[0], materials2[1], materials2[2], materials2[3]);
                    if (num.intValue() >= 2) {
                        if (!this.f254786d.isEmpty()) {
                            for (String str2 : this.f254786d.keySet()) {
                                ((ItemWall) hVar.a(str2)).setMaterial(this.f254786d.get(str2));
                            }
                            return;
                        }
                        for (ItemWall itemWall : itemRoom.getChildren()) {
                            itemWall.setMaterial(materials2[num.intValue()]);
                        }
                    }
                }
            }
        }
    }

    @Override // com.planner5d.library.widget.editor.editaction.e
    public void c(@NonNull h hVar) {
        if (hVar.f254765c != null) {
            com.planner5d.library.widget.editor.editor3d.model.p.h(hVar.a(this.f254756a), hVar, "item_material_" + this.f254756a);
        }
    }
}
