package com.planner5d.library.activity.fragment.smartwizard.dimensions.interactor;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.activity.fragment.smartwizard.dimensions.w;
import com.planner5d.library.activity.fragment.smartwizard.v;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemEditableWall;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.manager.f2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nPrepareForRenderingInteractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrepareForRenderingInteractor.kt\ncom/planner5d/library/activity/fragment/smartwizard/dimensions/interactor/PrepareForRenderingInteractor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,49:1\n808#2,11:50\n1863#2:61\n295#2,2:62\n1864#2:64\n1863#2:65\n295#2,2:66\n295#2,2:68\n1864#2:70\n*S KotlinDebug\n*F\n+ 1 PrepareForRenderingInteractor.kt\ncom/planner5d/library/activity/fragment/smartwizard/dimensions/interactor/PrepareForRenderingInteractor\n*L\n23#1:50,11\n25#1:61\n26#1:62,2\n25#1:64\n30#1:65\n33#1:66,2\n34#1:68,2\n30#1:70\n*E\n"})
public final class a implements na.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f135524c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final f2 f135525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final v f135526b;

    @ij.a
    public a(@NotNull f2 metricUnitManager, @NotNull v smartWizardRoomTypeChangeUseCase) {
        Intrinsics.checkNotNullParameter(metricUnitManager, "metricUnitManager");
        Intrinsics.checkNotNullParameter(smartWizardRoomTypeChangeUseCase, "smartWizardRoomTypeChangeUseCase");
        this.f135525a = metricUnitManager;
        this.f135526b = smartWizardRoomTypeChangeUseCase;
    }

    private final w b(kf.d dVar, ItemEditableWall itemEditableWall, com.planner5d.library.model.metricunit.a aVar) {
        return new w((int) this.f135525a.c(itemEditableWall.getLength(), aVar), (int) this.f135525a.c(dVar.c(), aVar), (int) this.f135525a.c(dVar.b(), aVar), itemEditableWall, dVar);
    }

    @Override // na.a
    @NotNull
    public List<w> a(@NotNull ItemProject item, @NotNull kf.b room, @NotNull List<w> renderData, @NotNull com.planner5d.library.model.metricunit.a unit, int i10) {
        Object next;
        Object next2;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(room, "room");
        Intrinsics.checkNotNullParameter(renderData, "renderData");
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.f135526b.a(item, i10);
        List<Item> treeList = item.getActiveFloor().getTreeList();
        Intrinsics.checkNotNullExpressionValue(treeList, "getTreeList(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : treeList) {
            if (obj instanceof ItemEditableWall) {
                arrayList.add(obj);
            }
        }
        renderData.clear();
        Iterator<T> it = room.d().iterator();
        while (true) {
            Object obj2 = null;
            if (!it.hasNext()) {
                break;
            }
            kf.d dVar = (kf.d) it.next();
            for (Object obj3 : arrayList) {
                if (((ItemEditableWall) obj3).getWallIndex() == dVar.e().d()) {
                    obj2 = obj3;
                    break;
                }
            }
            ItemEditableWall itemEditableWall = (ItemEditableWall) obj2;
            if (itemEditableWall != null) {
                renderData.add(b(dVar, itemEditableWall, unit));
            }
        }
        List<w> list = renderData;
        for (w wVar : list) {
            int iD = wVar.a().f().d();
            Iterator it2 = arrayList.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (iD != ((ItemEditableWall) next).getWallIndex());
            wVar.k((ItemEditableWall) next);
            Iterator<T> it3 = list.iterator();
            do {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it3.next();
            } while (((w) next2).g().getWallIndex() != iD);
            wVar.l((w) next2);
        }
        return renderData;
    }
}
