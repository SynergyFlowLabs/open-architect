package com.planner5d.library.activity.fragment.smartwizard;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.item.ItemRoom;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSmartWizardRoomTypeChangeInteractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartWizardRoomTypeChangeInteractor.kt\ncom/planner5d/library/activity/fragment/smartwizard/SmartWizardRoomTypeChangeInteractor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,17:1\n295#2,2:18\n*S KotlinDebug\n*F\n+ 1 SmartWizardRoomTypeChangeInteractor.kt\ncom/planner5d/library/activity/fragment/smartwizard/SmartWizardRoomTypeChangeInteractor\n*L\n13#1:18,2\n*E\n"})
public final class t implements v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f135871b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.builtin.i f135872a;

    @ij.a
    public t(@NotNull com.planner5d.library.model.manager.builtin.i builtInDataManager) {
        Intrinsics.checkNotNullParameter(builtInDataManager, "builtInDataManager");
        this.f135872a = builtInDataManager;
    }

    @Override // com.planner5d.library.activity.fragment.smartwizard.v
    public void a(@NotNull ItemProject item, int i10) {
        Object next;
        Intrinsics.checkNotNullParameter(item, "item");
        List<Item> treeList = item.getActiveFloor().getTreeList();
        Intrinsics.checkNotNullExpressionValue(treeList, "getTreeList(...)");
        Iterator<T> it = treeList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((Item) next) instanceof ItemRoom));
        ItemRoom itemRoom = (ItemRoom) next;
        if (itemRoom != null) {
            itemRoom.setTitlePosition(new com.planner5d.library.math.k(100.0f, 100.0f));
        }
        if (itemRoom != null) {
            itemRoom.setType(i10, this.f135872a.b0(i10));
        }
    }
}
