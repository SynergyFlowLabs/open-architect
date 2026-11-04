package com.planner5d.library.model.item;

import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.m1;
import com.planner5d.library.model.manager.builtin.i;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.k1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import vd.a;

/* JADX INFO: loaded from: classes7.dex */
public class ItemProject extends Item {
    public static final int FLOOR_LIMIT = 3;
    private int activeFloor;
    private a contestCamera;
    public final JSONObject externalData;
    private ItemEarth itemEarth;
    private final ItemFloor[] list;
    private int nextFreeId;
    private List<ItemProjectScreenshot> screenshots;

    public ItemProject(@NonNull JSONObject jSONObject) {
        super(null);
        this.list = new ItemFloor[3];
        this.itemEarth = null;
        this.activeFloor = 0;
        this.nextFreeId = 1;
        this.contestCamera = null;
        this.screenshots = new ArrayList();
        this.externalData = jSONObject;
    }

    public void fixDuplicateUids() {
        super.fixDuplicateUids(new HashMap(), this);
    }

    public ItemFloor getActiveFloor() {
        return getFloor(this.activeFloor);
    }

    public int getActiveFloorNumber() {
        return this.activeFloor;
    }

    public float getActiveFloorZ() {
        float height = 0.0f;
        int i10 = 0;
        while (true) {
            ItemFloor[] itemFloorArr = this.list;
            if (i10 >= itemFloorArr.length || i10 >= this.activeFloor) {
                break;
            }
            ItemFloor itemFloor = itemFloorArr[i10];
            if (itemFloor != null) {
                height += itemFloor.getHeight();
            }
            i10++;
        }
        return height;
    }

    @Override // com.planner5d.library.model.item.Item
    public Item[] getChildren() {
        ItemFloor[] itemFloorArr = this.list;
        int length = itemFloorArr.length;
        ItemEarth itemEarth = this.itemEarth;
        int i10 = length + (itemEarth == null ? 0 : 1);
        Item[] itemArr = new Item[i10];
        if (itemEarth != null) {
            itemArr[i10 - 1] = itemEarth;
        }
        System.arraycopy(itemFloorArr, 0, itemArr, 0, itemFloorArr.length);
        return itemArr;
    }

    public a getContestCamera() {
        return this.contestCamera;
    }

    public String getCoverId() throws JSONException {
        JSONObject jSONObject = this.externalData;
        if (jSONObject != null) {
            r rVar = r.cover;
            if (jSONObject.has(rVar.f224891a)) {
                int i10 = this.externalData.getInt(rVar.f224891a);
                JSONObject jSONObject2 = this.externalData;
                r rVar2 = r.ss;
                if (jSONObject2.has(rVar2.f224891a)) {
                    JSONArray jSONArray = this.externalData.getJSONArray(rVar2.f224891a);
                    if (jSONArray.length() > i10) {
                        return k1.w(jSONArray.getJSONObject(i10), r.id, "");
                    }
                }
            }
        }
        return "";
    }

    public ItemEarth getEarth() {
        return this.itemEarth;
    }

    public ItemFloor getFloor(int i10) {
        if (i10 < 0) {
            return null;
        }
        ItemFloor[] itemFloorArr = this.list;
        if (i10 < itemFloorArr.length) {
            return itemFloorArr[i10];
        }
        return null;
    }

    public ItemFloor[] getFloorArray() {
        return this.list;
    }

    public Integer getFloorNumber(ItemFloor itemFloor) {
        int i10 = 0;
        while (true) {
            ItemFloor[] itemFloorArr = this.list;
            if (i10 >= itemFloorArr.length) {
                return null;
            }
            if (itemFloorArr[i10] == itemFloor) {
                return Integer.valueOf(i10);
            }
            i10++;
        }
    }

    public List<Pair<Integer, ItemFloor>> getFloors(boolean z10) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            ItemFloor[] itemFloorArr = this.list;
            if (i10 >= itemFloorArr.length) {
                return arrayList;
            }
            if (itemFloorArr[i10] != null && (!z10 || i10 <= getActiveFloorNumber())) {
                arrayList.add(new Pair(Integer.valueOf(i10), this.list[i10]));
            }
            i10++;
        }
    }

    public ItemFloor getItemFloor(Item item) {
        if (item instanceof ItemPoint) {
            item = item.getParentItem();
        }
        if (item instanceof ItemWall) {
            item = item.getParentItem();
        }
        if (item instanceof ItemWalls) {
            return (ItemFloor) item.getParentItem();
        }
        for (ItemFloor itemFloor : this.list) {
            if (itemFloor != null && itemFloor.isChild(item)) {
                return itemFloor;
            }
        }
        return null;
    }

    @Override // com.planner5d.library.model.item.Item
    public ItemMaterial[] getMaterials() {
        return getMaterialsEditable(null);
    }

    public ItemMaterial[] getMaterialsEditable(i iVar) {
        return new MaterialsListBuilder(iVar).add(this.list).build();
    }

    public Integer getNextFreeFloorNumber() {
        int i10 = 0;
        while (true) {
            ItemFloor[] itemFloorArr = this.list;
            if (i10 >= itemFloorArr.length) {
                return null;
            }
            if (itemFloorArr[i10] == null) {
                return Integer.valueOf(i10);
            }
            i10++;
        }
    }

    public String getNextFreeUid() {
        return "p" + getNextFreeUidNumber();
    }

    public long getNextFreeUidNumber() {
        long maxUidNumber = getMaxUidNumber();
        int i10 = this.nextFreeId;
        this.nextFreeId = i10 + 1;
        return maxUidNumber + ((long) i10);
    }

    public Integer getNumberOfFloors() {
        int i10 = 0;
        for (ItemFloor itemFloor : this.list) {
            if (itemFloor != null) {
                i10++;
            }
        }
        return Integer.valueOf(i10);
    }

    public List<ItemProjectScreenshot> getScreenshots() {
        return this.screenshots;
    }

    public void moveFloorToNewPosition(ItemFloor itemFloor, int i10) {
        ItemFloor activeFloor = getActiveFloor();
        Integer floorNumber = getFloorNumber(itemFloor);
        if (floorNumber == null) {
            return;
        }
        while (floorNumber.intValue() != i10) {
            int i11 = floorNumber.intValue() < i10 ? 1 : -1;
            ItemFloor itemFloor2 = this.list[floorNumber.intValue()];
            this.list[floorNumber.intValue()] = this.list[floorNumber.intValue() + i11];
            this.list[floorNumber.intValue() + i11] = itemFloor2;
            floorNumber = Integer.valueOf(floorNumber.intValue() + i11);
        }
        setActiveFloor(activeFloor);
    }

    public void removeFloor(ItemFloor itemFloor) {
        ItemFloor activeFloor = getActiveFloor();
        int i10 = 0;
        while (true) {
            ItemFloor[] itemFloorArr = this.list;
            if (i10 >= itemFloorArr.length) {
                break;
            }
            if (itemFloorArr[i10] == itemFloor) {
                itemFloorArr[i10] = null;
                break;
            }
            i10++;
        }
        ArrayList arrayList = new ArrayList();
        for (ItemFloor itemFloor2 : this.list) {
            if (itemFloor2 != null) {
                arrayList.add(itemFloor2);
            }
        }
        this.activeFloor = 0;
        for (int i11 = 0; i11 < this.list.length; i11++) {
            if (i11 < arrayList.size()) {
                this.list[i11] = (ItemFloor) arrayList.get(i11);
                if (this.list[i11] == activeFloor) {
                    this.activeFloor = i11;
                }
            } else {
                this.list[i11] = null;
            }
        }
    }

    public void setActiveFloor(ItemFloor itemFloor) {
        int i10 = 0;
        while (true) {
            ItemFloor[] itemFloorArr = this.list;
            if (i10 >= itemFloorArr.length) {
                return;
            }
            if (itemFloorArr[i10] == itemFloor) {
                setActiveFloor(i10);
                return;
            }
            i10++;
        }
    }

    public void setContestCamera(a aVar) {
        this.contestCamera = aVar;
    }

    public void setEarth(ItemEarth itemEarth) {
        this.itemEarth = itemEarth;
    }

    public void setFloor(ItemFloor itemFloor, int i10) {
        ItemFloor[] itemFloorArr = this.list;
        if (i10 < itemFloorArr.length) {
            itemFloorArr[i10] = itemFloor;
        }
    }

    public void setScreenshots(List<ItemProjectScreenshot> list) {
        this.screenshots = list;
    }

    public static class MaterialsListBuilder {
        private final i builtInDataManager;
        private final List<ItemMaterial> list = new LinkedList();

        public MaterialsListBuilder(i iVar) {
            this.builtInDataManager = iVar;
        }

        public MaterialsListBuilder add(Item[] itemArr) {
            for (Item item : itemArr) {
                add(item);
            }
            return this;
        }

        public ItemMaterial[] build() {
            return (ItemMaterial[]) this.list.toArray(new ItemMaterial[0]);
        }

        @m1
        public MaterialsListBuilder add(Item item) {
            if (item != null) {
                i iVar = this.builtInDataManager;
                ItemMaterial[] materials = (iVar == null || !(item instanceof ItemNs)) ? item.getMaterials() : ((ItemNs) item).getMaterialsEditable(iVar);
                if (materials != null) {
                    for (ItemMaterial itemMaterial : materials) {
                        if (itemMaterial != null) {
                            this.list.add(itemMaterial);
                        }
                    }
                }
                Item[] children = item.getChildren();
                if (children != null) {
                    add(children);
                }
            }
            return this;
        }
    }

    public void setActiveFloor(int i10) {
        if (i10 < this.list.length) {
            this.activeFloor = i10;
        }
    }

    public ItemProject(ItemProject itemProject, ProviderUid providerUid) {
        super(itemProject, providerUid);
        this.list = new ItemFloor[3];
        this.itemEarth = null;
        this.activeFloor = 0;
        this.nextFreeId = 1;
        this.contestCamera = null;
        this.screenshots = new ArrayList();
        this.externalData = itemProject.externalData;
    }
}
