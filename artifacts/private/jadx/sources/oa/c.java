package oa;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.math.k;
import com.planner5d.library.model.item.ItemEarth;
import com.planner5d.library.model.item.ItemEditableWall;
import com.planner5d.library.model.item.ItemFloor;
import com.planner5d.library.model.item.ItemLayout;
import com.planner5d.library.model.item.ItemMaterial;
import com.planner5d.library.model.item.ItemNs;
import com.planner5d.library.model.item.ItemPoint;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.item.ItemRoom;
import com.planner5d.library.model.item.ItemWall;
import com.planner5d.library.model.item.ProviderUid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nFromWizardRoom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FromWizardRoom.kt\ncom/planner5d/library/activity/fragment/smartwizard/roombuilder/FromWizardRoom\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,65:1\n1863#2,2:66\n1557#2:68\n1628#2,3:69\n37#3,2:72\n*S KotlinDebug\n*F\n+ 1 FromWizardRoom.kt\ncom/planner5d/library/activity/fragment/smartwizard/roombuilder/FromWizardRoom\n*L\n30#1:66,2\n48#1:68\n48#1:69,3\n48#1:72,2\n*E\n"})
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f333601b = 4000.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String f333602c = "prkt_1035";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f333600a = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final ItemLayout f333603d = new ItemLayout();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f333604e = 8;

    private c() {
    }

    private final ItemPoint a(k kVar, ProviderUid providerUid) {
        return new ItemPoint(providerUid.createUid(), kVar);
    }

    private final ItemRoom c(kf.b bVar, ProviderUid providerUid, ItemFloor itemFloor) {
        String strCreateUid = providerUid.createUid();
        List<kf.c> listH = bVar.h();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listH, 10));
        Iterator<T> it = listH.iterator();
        while (it.hasNext()) {
            arrayList.add(f333600a.d((kf.c) it.next(), providerUid));
        }
        ItemRoom itemRoom = new ItemRoom(strCreateUid, (ItemWall[]) arrayList.toArray(new ItemEditableWall[0]), itemFloor, providerUid);
        itemRoom.setMaterialFloor(new ItemMaterial("floor", -1, f333602c));
        itemRoom.setLayout(itemRoom.getLayout(f333603d).offsetPosition(new k(f333601b, f333601b)));
        return itemRoom;
    }

    private final ItemEditableWall d(kf.c cVar, ProviderUid providerUid) {
        ItemEditableWall itemEditableWall = new ItemEditableWall(providerUid.createUid(), a(cVar.e(), providerUid), a(cVar.c(), providerUid));
        int iD = cVar.d();
        kf.e eVarA = cVar.a();
        itemEditableWall.setData(iD, eVarA != null ? eVarA.n() : -1);
        return itemEditableWall;
    }

    @NotNull
    public final ItemProject b(@NotNull kf.b room, @NotNull f windowLoader) {
        Intrinsics.checkNotNullParameter(room, "room");
        Intrinsics.checkNotNullParameter(windowLoader, "windowLoader");
        ItemProject itemProject = new ItemProject(new JSONObject());
        ItemFloor itemFloor = new ItemFloor(itemProject.getNextFreeUid());
        itemProject.setFloor(itemFloor, 0);
        itemProject.setActiveFloor(itemFloor);
        for (kf.a aVar : room.i()) {
            ItemNs itemNsA = windowLoader.a(aVar, new b(itemProject));
            ItemLayout itemLayout = f333603d;
            itemNsA.getLayout(itemLayout).setPosition(aVar.j().f180480a + f333601b, aVar.j().f180481b + f333601b, aVar.h());
            itemNsA.setLayout(itemLayout);
            itemFloor.addItem(itemNsA, null);
        }
        itemFloor.addItem(c(room, new b(itemProject), itemFloor), null);
        k kVar = ItemEarth.DEFAULT_SIZE;
        ItemEarth itemEarth = new ItemEarth(kVar.f180480a, kVar.f180481b);
        itemEarth.setMaterial(new ItemMaterial((String) null, -1));
        itemProject.setEarth(itemEarth);
        return itemProject;
    }
}
