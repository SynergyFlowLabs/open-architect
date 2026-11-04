package com.planner5d.library.model.item;

import com.planner5d.library.math.k;
import com.planner5d.library.widget.editor.editor2d.drawable.c;
import com.planner5d.library.widget.editor.editor2d.drawable.w;
import fj.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public abstract class Item {
    private w drawables;
    private final ItemLayout layout;
    private Item parentItem;
    private String uid;

    public Item(String str) {
        this.layout = new ItemLayout();
        this.drawables = null;
        this.parentItem = null;
        this.uid = str;
    }

    public static boolean isIdForItemNs(String str) {
        return (str.startsWith("pr/") || str.startsWith("ground/") || str.startsWith("room/")) ? false : true;
    }

    public static boolean isNotIdForItemNs(String str) {
        if (!str.startsWith("pr/") && !str.startsWith("ground/") && !str.startsWith("room/")) {
            return false;
        }
        return true;
    }

    protected w createDrawables() {
        return null;
    }

    void fixDuplicateUids(Map<String, Item> map, ItemProject itemProject) {
        String str = this.uid;
        if (str == null || map.containsKey(str)) {
            this.uid = itemProject.getNextFreeUid();
        }
        map.put(this.uid, this);
        Item[] children = getChildren();
        if (children != null) {
            for (Item item : children) {
                if (item != null) {
                    item.fixDuplicateUids(map, itemProject);
                }
            }
        }
    }

    public Item getChild(String str) {
        if (str == null) {
            return null;
        }
        Item[] children = getChildren();
        if (children != null) {
            for (Item item : children) {
                if (item != null) {
                    if (str.equals(item.getUid())) {
                        return item;
                    }
                    Item child = item.getChild(str);
                    if (child != null) {
                        return child;
                    }
                }
            }
        }
        return null;
    }

    public Item[] getChildren() {
        return null;
    }

    public List<c> getDrawableInstanceTreeList() {
        List<Item> treeList = getTreeList();
        ArrayList arrayList = new ArrayList();
        Iterator<Item> it = treeList.iterator();
        while (it.hasNext()) {
            w drawableInstances = it.next().getDrawableInstances();
            if (drawableInstances != null) {
                Collections.addAll(arrayList, drawableInstances.f255098a);
            }
        }
        return arrayList;
    }

    public w getDrawableInstances() {
        if (this.drawables == null) {
            w wVarCreateDrawables = createDrawables();
            this.drawables = wVarCreateDrawables;
            if (wVarCreateDrawables != null) {
                initializeDrawable(wVarCreateDrawables);
            }
        }
        return this.drawables;
    }

    protected w getDrawables() {
        return this.drawables;
    }

    public ItemLayout getLayout(ItemLayout itemLayout) {
        return itemLayout.set(this.layout);
    }

    k getLayoutPosition(k kVar) {
        this.layout.getPosition(kVar);
        return kVar;
    }

    @h
    public abstract ItemMaterial[] getMaterials();

    long getMaxUidNumber() {
        long jMax;
        String str = this.uid;
        if (str != null) {
            try {
                jMax = Long.valueOf(str.substring(1)).longValue();
            } catch (NumberFormatException unused) {
                jMax = 0;
            }
        } else {
            jMax = 0;
        }
        Item[] children = getChildren();
        if (children != null) {
            for (Item item : children) {
                if (item != null) {
                    jMax = Math.max(item.getMaxUidNumber(), jMax);
                }
            }
        }
        return jMax;
    }

    public Item getParentItem() {
        return this.parentItem;
    }

    public k getSize(k kVar, boolean z10) {
        return kVar.U(z10 ? this.layout.getScaleX() : 1.0f, z10 ? this.layout.getScaleY() : 1.0f);
    }

    public List<Item> getTreeList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        Item[] children = getChildren();
        if (children != null) {
            for (Item item : children) {
                if (item != null) {
                    arrayList.addAll(item.getTreeList());
                }
            }
        }
        return arrayList;
    }

    public String getUid() {
        return this.uid;
    }

    protected void initializeDrawable(w wVar) {
        if (wVar != null) {
            for (c cVar : wVar.f255098a) {
                cVar.c(this.layout);
            }
        }
    }

    protected void onLayoutChanged(ItemLayout itemLayout) {
        w wVar = this.drawables;
        if (wVar != null) {
            for (c cVar : wVar.f255098a) {
                cVar.c(itemLayout);
            }
        }
    }

    public void resetDrawable() {
        if (this.drawables != null) {
            this.drawables = null;
        }
        getDrawableInstances();
    }

    public void setLayout(ItemLayout itemLayout) {
        this.layout.set(itemLayout);
        onLayoutChanged(itemLayout);
    }

    public void setParentItem(Item item) {
        this.parentItem = item;
    }

    public Item(Item item, ProviderUid providerUid) {
        this(providerUid == null ? item.uid : providerUid.createUid());
        item.getLayout(this.layout);
    }
}
