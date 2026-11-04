package com.planner5d.library.widget.editor.helper;

import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemDoor;
import com.planner5d.library.model.item.ItemFloor;
import com.planner5d.library.model.item.ItemLayout;
import com.planner5d.library.model.item.ItemNs;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.item.ItemRoom;
import com.planner5d.library.model.item.ItemWindow;
import com.planner5d.library.model.item.ProviderUid;
import com.planner5d.library.model.item.builder.ItemCloner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nHelperProject.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelperProject.kt\ncom/planner5d/library/widget/editor/helper/HelperProject\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,63:1\n1863#2,2:64\n1863#2,2:66\n1863#2:90\n1864#2:103\n4135#3,11:68\n4135#3,11:79\n4135#3,11:91\n1#4:102\n*S KotlinDebug\n*F\n+ 1 HelperProject.kt\ncom/planner5d/library/widget/editor/helper/HelperProject\n*L\n31#1:64,2\n37#1:66,2\n57#1:90\n57#1:103\n47#1:68,11\n50#1:79,11\n58#1:91,11\n*E\n"})
public final class c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c3 f256213a = new c3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f256214b = 0;

    private c3() {
    }

    private final List<ItemNs> d(ItemRoom itemRoom) {
        ItemNs[] itemsMovedTogether = itemRoom.getItemsMovedTogether();
        Intrinsics.checkNotNullExpressionValue(itemsMovedTogether, "getItemsMovedTogether(...)");
        ArrayList arrayList = new ArrayList();
        for (ItemNs itemNs : itemsMovedTogether) {
            if (itemNs != null) {
                arrayList.add(itemNs);
            }
        }
        return arrayList;
    }

    private final List<ItemWindow> e(ItemRoom itemRoom) {
        ItemNs[] itemsMovedTogether = itemRoom.getItemsMovedTogether();
        Intrinsics.checkNotNullExpressionValue(itemsMovedTogether, "getItemsMovedTogether(...)");
        return ArraysKt.filterIsInstance(itemsMovedTogether, ItemWindow.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String g(ItemProject itemProject) {
        return itemProject.getNextFreeUid();
    }

    @NotNull
    public final List<ItemRoom> b(@NotNull ItemProject itemProject) {
        Intrinsics.checkNotNullParameter(itemProject, "itemProject");
        Item[] children = itemProject.getActiveFloor().getChildren();
        if (children == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Item item : children) {
            if (item instanceof ItemRoom) {
                arrayList.add(item);
            }
        }
        return arrayList;
    }

    @Nullable
    public final ItemRoom c(@NotNull ItemProject itemProject, @NotNull String roomId) {
        ItemRoom itemRoom;
        Intrinsics.checkNotNullParameter(itemProject, "itemProject");
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        ItemFloor[] floorArray = itemProject.getFloorArray();
        Intrinsics.checkNotNullExpressionValue(floorArray, "getFloorArray(...)");
        Iterator it = ArraysKt.filterNotNull(floorArray).iterator();
        do {
            itemRoom = null;
            Object obj = null;
            if (!it.hasNext()) {
                break;
            }
            Item[] children = ((ItemFloor) it.next()).getChildren();
            Intrinsics.checkNotNullExpressionValue(children, "getChildren(...)");
            ArrayList arrayList = new ArrayList();
            for (Item item : children) {
                if (item instanceof ItemRoom) {
                    arrayList.add(item);
                }
            }
            for (Object obj2 : arrayList) {
                if (Intrinsics.areEqual(((ItemRoom) obj2).getUid(), roomId)) {
                    obj = obj2;
                    break;
                }
            }
            itemRoom = (ItemRoom) obj;
        } while (itemRoom == null);
        return itemRoom;
    }

    @NotNull
    public final ItemProject f(@NotNull ItemRoom sourceRoom) {
        Intrinsics.checkNotNullParameter(sourceRoom, "sourceRoom");
        List<ItemWindow> listE = e(sourceRoom);
        List<ItemNs> listD = d(sourceRoom);
        final ItemProject itemProject = new ItemProject(new JSONObject());
        ProviderUid providerUid = new ProviderUid() { // from class: com.planner5d.library.widget.editor.helper.b3
            @Override // com.planner5d.library.model.item.ProviderUid
            public final String createUid() {
                return c3.g(itemProject);
            }
        };
        ItemFloor itemFloor = new ItemFloor(providerUid.createUid());
        ItemRoom itemRoom = new ItemRoom(sourceRoom, itemFloor, null);
        itemFloor.title = "1";
        itemFloor.addItem(itemRoom, null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = sourceRoom.getChildren().length;
        for (int i10 = 0; i10 < length; i10++) {
            linkedHashMap.put(sourceRoom.getChildren()[i10].getUid(), itemRoom.getChildren()[i10].getUid());
        }
        linkedHashMap.put(sourceRoom.getUid(), itemRoom.getUid());
        for (ItemWindow itemWindow : listE) {
            ItemNs itemDoor = itemWindow instanceof ItemDoor ? new ItemDoor((ItemDoor) itemWindow, providerUid) : new ItemWindow(itemWindow, providerUid);
            itemDoor.setAttachedTo((String) linkedHashMap.get(itemWindow.getAttachedTo()));
            itemFloor.addItem(itemDoor, null);
        }
        for (ItemNs itemNs : listD) {
            ItemNs itemNs2 = (ItemNs) ItemCloner.clone(itemNs, itemFloor, providerUid);
            itemNs2.setAttachedTo((String) linkedHashMap.get(itemNs.getAttachedTo()));
            itemFloor.addItem(itemNs2, null);
        }
        itemProject.setFloor(itemFloor, 0);
        itemRoom.setLayout(sourceRoom.getLayout(new ItemLayout()));
        return itemProject;
    }
}
