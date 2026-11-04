package com.planner5d.library.model.item.helper;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.math.k;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemLayout;
import com.planner5d.library.model.item.ItemPoint;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.item.ItemRoom;
import com.planner5d.library.model.item.ItemWall;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomLayoutHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomLayoutHelper.kt\ncom/planner5d/library/model/item/helper/RoomLayoutHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,85:1\n295#2,2:86\n1863#2,2:88\n1863#2:104\n808#2,11:105\n1864#2:116\n2341#2,14:117\n2341#2,14:131\n13996#3,14:90\n*S KotlinDebug\n*F\n+ 1 RoomLayoutHelper.kt\ncom/planner5d/library/model/item/helper/RoomLayoutHelper\n*L\n23#1:86,2\n34#1:88,2\n51#1:104\n52#1:105,11\n51#1:116\n55#1:117,14\n59#1:131,14\n45#1:90,14\n*E\n"})
public final class RoomLayoutHelper {
    public static final int $stable = 8;

    @NotNull
    private final ItemLayout layout = new ItemLayout();

    @NotNull
    private final k temp = new k();

    private final k findCenter(ItemRoom itemRoom) {
        k kVar = new k();
        Iterator itA = i.a(itemRoom.getChildren());
        while (itA.hasNext()) {
            k point = ((ItemWall) itA.next()).getPoint(this.temp, true, true);
            Intrinsics.checkNotNullExpressionValue(point, "getPoint(...)");
            kVar.b(point);
        }
        return kVar.R(1.0f / itemRoom.getChildren().length);
    }

    private final k findClosestPotentialPoint(List<? extends Item> list) {
        ItemLayout layout;
        ArrayList arrayList = new ArrayList();
        k kVar = new k();
        List<? extends Item> list2 = list;
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            List<Item> treeList = ((Item) it.next()).getTreeList();
            Intrinsics.checkNotNullExpressionValue(treeList, "getTreeList(...)");
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : treeList) {
                if (obj instanceof ItemPoint) {
                    arrayList2.add(obj);
                }
            }
            arrayList.addAll(arrayList2);
        }
        Object next = null;
        if (arrayList.isEmpty()) {
            Iterator<T> it2 = list2.iterator();
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    float positionX = ((Item) next).getLayout(this.layout).getPositionX() + this.layout.getPositionY();
                    do {
                        Object next2 = it2.next();
                        float positionX2 = ((Item) next2).getLayout(this.layout).getPositionX() + this.layout.getPositionY();
                        if (Float.compare(positionX, positionX2) > 0) {
                            next = next2;
                            positionX = positionX2;
                        }
                    } while (it2.hasNext());
                }
            }
            Item item = (Item) next;
            if (item != null && (layout = item.getLayout(this.layout)) != null) {
                layout.getPosition(kVar);
            }
        } else {
            Iterator it3 = arrayList.iterator();
            if (it3.hasNext()) {
                next = it3.next();
                if (it3.hasNext()) {
                    float f10 = ((ItemPoint) next).getPoint(this.temp, true).f180480a + this.temp.f180481b;
                    do {
                        Object next3 = it3.next();
                        float f11 = ((ItemPoint) next3).getPoint(this.temp, true).f180480a + this.temp.f180481b;
                        if (Float.compare(f10, f11) > 0) {
                            next = next3;
                            f10 = f11;
                        }
                    } while (it3.hasNext());
                }
            }
            ItemPoint itemPoint = (ItemPoint) next;
            if (itemPoint != null) {
                k point = itemPoint.getPoint(this.temp, true);
                Intrinsics.checkNotNullExpressionValue(point, "getPoint(...)");
                kVar.V(point);
                return kVar;
            }
        }
        return kVar;
    }

    private final ItemPoint findFurthestExistingPointToTheRight(ItemProject itemProject) {
        ItemPoint[] points = itemProject.getActiveFloor().getPoints(true);
        Intrinsics.checkNotNull(points);
        if (points.length == 0) {
            return null;
        }
        ItemPoint itemPoint = points[0];
        int lastIndex = ArraysKt.getLastIndex(points);
        if (lastIndex == 0) {
            return itemPoint;
        }
        float f10 = itemPoint.getPoint(this.temp, true).f180480a + this.temp.f180481b;
        if (1 <= lastIndex) {
            int i10 = 1;
            while (true) {
                ItemPoint itemPoint2 = points[i10];
                float f11 = itemPoint2.getPoint(this.temp, true).f180480a + this.temp.f180481b;
                if (Float.compare(f10, f11) < 0) {
                    itemPoint = itemPoint2;
                    f10 = f11;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return itemPoint;
    }

    private final void normalizeCoordinates(ItemRoom itemRoom) {
        k kVarFindCenter = findCenter(itemRoom);
        itemRoom.getLayout(this.layout);
        k kVar = new k(kVarFindCenter);
        k position = this.layout.getPosition(this.temp);
        Intrinsics.checkNotNullExpressionValue(position, "getPosition(...)");
        k kVarC0 = kVar.c0(position);
        itemRoom.setLayout(this.layout.offsetPosition(kVarC0));
        Iterator itA = i.a(itemRoom.getChildren());
        while (itA.hasNext()) {
            Iterator itA2 = i.a(((ItemWall) itA.next()).getPoints());
            while (itA2.hasNext()) {
                ItemPoint itemPoint = (ItemPoint) itA2.next();
                itemPoint.setPoint(itemPoint.getPoint().c0(kVarC0));
            }
        }
    }

    private final void placeNewItems(List<? extends Item> list, ItemProject itemProject) {
        k kVar = new k();
        ItemPoint itemPointFindFurthestExistingPointToTheRight = findFurthestExistingPointToTheRight(itemProject);
        if (itemPointFindFurthestExistingPointToTheRight == null || itemPointFindFurthestExistingPointToTheRight.getPoint(kVar, true) == null) {
            return;
        }
        k kVarC0 = kVar.c0(findClosestPotentialPoint(list));
        for (Item item : list) {
            item.setLayout(item.getLayout(this.layout).offsetPosition(kVarC0));
            if (item instanceof ItemRoom) {
                normalizeCoordinates((ItemRoom) item);
            }
        }
    }

    private final void sortItemsForAdding(List<Item> list) {
        Object next;
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((Item) next) instanceof ItemRoom));
        Item item = (Item) next;
        if (item != null) {
            list.remove(item);
            list.add(0, item);
        }
    }

    public final void prepareItemsForAdding(@NotNull List<Item> items, @NotNull ItemProject itemProject, @Nullable String str) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemProject, "itemProject");
        sortItemsForAdding(items);
        if (str == null) {
            placeNewItems(items, itemProject);
        }
    }
}
