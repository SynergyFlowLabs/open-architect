package com.planner5d.library.model.item;

import com.planner5d.library.model.item.builder.ItemCloner;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ItemFloor extends Item {
    private Float height;
    private Item[] list;
    private ItemWindow[] listWindows;
    public String title;

    public ItemFloor(String str) {
        super(str);
        this.title = null;
        this.list = new Item[0];
        this.listWindows = null;
        this.height = null;
    }

    public void addItem(Item item, Integer num) {
        LinkedList linkedList = new LinkedList();
        for (int i10 = 0; i10 < this.list.length; i10++) {
            if (num != null && i10 == num.intValue()) {
                linkedList.add(item);
            }
            linkedList.add(this.list[i10]);
        }
        if (!linkedList.contains(item)) {
            linkedList.add(item);
        }
        this.list = (Item[]) linkedList.toArray(new Item[0]);
        this.listWindows = null;
        this.height = null;
    }

    @Override // com.planner5d.library.model.item.Item
    public Item[] getChildren() {
        return this.list;
    }

    public float getHeight() {
        if (this.height == null) {
            float fMax = 0.0f;
            for (Item item : this.list) {
                if (item instanceof ItemRoom) {
                    fMax = Math.max(fMax, ((ItemRoom) item).height);
                }
            }
            this.height = Float.valueOf(fMax);
        }
        return this.height.floatValue();
    }

    public Integer getItemPosition(String str) {
        if (str == null) {
            return null;
        }
        int i10 = 0;
        while (true) {
            Item[] itemArr = this.list;
            if (i10 >= itemArr.length) {
                return null;
            }
            if (str.equals(itemArr[i10].getUid())) {
                return Integer.valueOf(i10);
            }
            i10++;
        }
    }

    @Override // com.planner5d.library.model.item.Item
    public ItemMaterial[] getMaterials() {
        return null;
    }

    public ItemPoint[] getPoints(boolean z10) {
        Item[] children;
        Item[] children2;
        LinkedList linkedList = new LinkedList();
        for (Item item : this.list) {
            if ((!z10 || (item instanceof ItemRoom)) && ((z10 || !(item instanceof ItemRoom)) && (children = item.getChildren()) != null)) {
                for (Item item2 : children) {
                    if (item2 != null && (children2 = item2.getChildren()) != null && children2.length == 2) {
                        linkedList.add((ItemPoint) children2[0]);
                        linkedList.add((ItemPoint) children2[1]);
                    }
                }
            }
        }
        return (ItemPoint[]) linkedList.toArray(new ItemPoint[0]);
    }

    public ItemWindow[] getWindows() {
        if (this.listWindows == null) {
            LinkedList linkedList = new LinkedList();
            for (Item item : this.list) {
                if (item instanceof ItemWindow) {
                    linkedList.add((ItemWindow) item);
                }
            }
            this.listWindows = (ItemWindow[]) linkedList.toArray(new ItemWindow[0]);
        }
        return this.listWindows;
    }

    public boolean isChild(Item item) {
        for (Item item2 : this.list) {
            if (item2 == item) {
                return true;
            }
        }
        return false;
    }

    public void removeItem(Item item) {
        if ((item instanceof ItemPoint) || (item instanceof ItemWall)) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        for (Item item2 : this.list) {
            if (!item2.equals(item)) {
                linkedList.add(item2);
            }
        }
        this.list = (Item[]) linkedList.toArray(new Item[0]);
        this.listWindows = null;
        this.height = null;
    }

    public void resetHeight() {
        this.height = null;
    }

    public void setItems(List<Item> list) {
        this.list = (Item[]) list.toArray(new Item[0]);
        this.listWindows = null;
        this.height = null;
    }

    public ItemFloor(ItemFloor itemFloor, ProviderUid providerUid) {
        ItemWindow itemWindow;
        String attachedTo;
        super(itemFloor, providerUid);
        this.title = null;
        this.list = new Item[0];
        this.listWindows = null;
        this.height = null;
        this.title = itemFloor.title;
        this.list = new Item[itemFloor.list.length];
        HashMap map = new HashMap();
        int i10 = 0;
        while (true) {
            Item[] itemArr = this.list;
            if (i10 >= itemArr.length) {
                break;
            }
            Item item = itemFloor.list[i10];
            if (item != null) {
                Item itemClone = ItemCloner.clone(item, this, providerUid);
                itemArr[i10] = itemClone;
                if (itemClone instanceof ItemRoom) {
                    Item[] children = itemClone.getChildren();
                    Item[] children2 = item.getChildren();
                    if (children != null && children2 != null && children.length == children2.length) {
                        for (int i11 = 0; i11 < children.length; i11++) {
                            map.put(children2[i11].getUid(), children[i11].getUid());
                        }
                    }
                }
            }
            i10++;
        }
        if (!map.isEmpty()) {
            for (Item item2 : this.list) {
                if ((item2 instanceof ItemWindow) && (attachedTo = (itemWindow = (ItemWindow) item2).getAttachedTo()) != null && map.containsKey(attachedTo)) {
                    itemWindow.setAttachedTo((String) map.get(attachedTo));
                }
            }
        }
        this.listWindows = null;
    }
}
