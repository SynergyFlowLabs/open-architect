package com.planner5d.library.model.item.helper;

import com.planner5d.library.math.k;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemFloor;
import com.planner5d.library.model.item.ItemPoint;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.item.ItemRuler;
import com.planner5d.library.model.item.ItemWall;
import com.planner5d.library.model.item.ItemWalls;
import com.planner5d.library.model.item.ItemWindow;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class PointsHelper {
    private final k vectorTemp = new k();
    private final k vectorTemp2 = new k();

    public List<Item> getGroundsRelatedToPoints(List<ItemPoint> list, List<Item> list2) {
        Iterator<ItemPoint> it = list.iterator();
        while (it.hasNext()) {
            Item parentItem = it.next().getParentItem().getParentItem();
            if (!list2.contains(parentItem)) {
                list2.add(parentItem);
            }
        }
        return list2;
    }

    public ItemFloor getItemFloor(Item item) {
        ItemWalls itemWalls = getItemWalls(item);
        if (itemWalls == null) {
            return null;
        }
        return (ItemFloor) itemWalls.getParentItem();
    }

    public ItemWalls getItemWalls(Item item) {
        if (item instanceof ItemWalls) {
            return (ItemWalls) item;
        }
        if (item instanceof ItemPoint) {
            item = item.getParentItem();
        }
        if (item instanceof ItemWall) {
            item = item.getParentItem();
        }
        if (item instanceof ItemWalls) {
            return (ItemWalls) item;
        }
        return null;
    }

    public ItemPoint[] getPointsOnFloorBelow(ItemProject itemProject, Item item, boolean z10) {
        ItemFloor itemFloor;
        Integer floorNumber;
        ItemFloor floor;
        return (itemProject == null || (itemFloor = itemProject.getItemFloor(item)) == null || (floorNumber = itemProject.getFloorNumber(itemFloor)) == null || (floor = itemProject.getFloor(floorNumber.intValue() + (-1))) == null) ? new ItemPoint[0] : floor.getPoints(z10);
    }

    public ItemPoint[] getPointsOnSameFloor(Item item, boolean z10) {
        ItemFloor itemFloor = getItemFloor(item);
        return itemFloor == null ? new ItemPoint[0] : itemFloor.getPoints(z10);
    }

    public ItemPoint[] getPointsRulers(ItemRuler[] itemRulerArr) {
        ArrayList arrayList = new ArrayList();
        for (ItemRuler itemRuler : itemRulerArr) {
            Collections.addAll(arrayList, itemRuler.getPoints());
        }
        return (ItemPoint[]) arrayList.toArray(new ItemPoint[0]);
    }

    public List<ItemPoint> getRelated(Item item, ItemPoint[] itemPointArr, List<ItemPoint> list) {
        if (item instanceof ItemWall) {
            getRelated((ItemWall) item, itemPointArr, list);
            return list;
        }
        if (item instanceof ItemPoint) {
            getRelated((ItemPoint) item, itemPointArr, list);
        }
        return list;
    }

    public Map<String, ItemWall> getWallsRelatedToPoints(List<ItemPoint> list) {
        HashMap map = new HashMap();
        Iterator<ItemPoint> it = list.iterator();
        while (it.hasNext()) {
            ItemWall itemWall = (ItemWall) it.next().getParentItem();
            if (!map.containsKey(itemWall.getUid())) {
                map.put(itemWall.getUid(), itemWall);
            }
        }
        return map;
    }

    public List<ItemWindow> getWindowsRelatedToPoints(List<ItemPoint> list, List<ItemWindow> list2) {
        return getWindowsRelatedToPoints(list, getWallsRelatedToPoints(list), list2);
    }

    public List<ItemWindow> getWindowsRelatedToPoints(List<ItemPoint> list, Map<String, ItemWall> map, List<ItemWindow> list2) {
        String attachedTo;
        if (list != null && !list.isEmpty()) {
            ItemWindow[] windows = getItemFloor(list.get(0)).getWindows();
            if (windows != null && windows.length != 0) {
                for (ItemWindow itemWindow : windows) {
                    if (itemWindow != null && (attachedTo = itemWindow.getAttachedTo()) != null && map.containsKey(attachedTo)) {
                        list2.add(itemWindow);
                    }
                }
            }
        }
        return list2;
    }

    private List<ItemPoint> getRelated(ItemWall itemWall, ItemPoint[] itemPointArr, List<ItemPoint> list) {
        getRelated(itemWall.getPoints()[0], itemPointArr, list);
        return getRelated(itemWall.getPoints()[1], itemPointArr, list);
    }

    private List<ItemPoint> getRelated(ItemPoint itemPoint, ItemPoint[] itemPointArr, List<ItemPoint> list) {
        itemPoint.getPoint(this.vectorTemp, true);
        for (ItemPoint itemPoint2 : itemPointArr) {
            if (itemPoint2.getPoint(this.vectorTemp2, true).equals(this.vectorTemp)) {
                list.add(itemPoint2);
            }
        }
        return list;
    }
}
