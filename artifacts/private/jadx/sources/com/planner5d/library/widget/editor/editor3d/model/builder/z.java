package com.planner5d.library.widget.editor.editor3d.model.builder;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemFloor;
import com.planner5d.library.model.item.ItemLayout;
import com.planner5d.library.model.item.ItemPartition;
import com.planner5d.library.model.item.ItemRoom;
import com.planner5d.library.model.item.ItemWall;
import com.planner5d.library.model.item.ItemWalls;
import com.planner5d.library.model.item.ItemWindow;
import com.planner5d.library.walls.Wall;
import com.planner5d.library.walls.WallHole;
import com.planner5d.library.walls.WallsInfoWall;
import com.planner5d.library.widget.editor.helper.r3;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@w0(parameters = 1)
@SourceDebugExtension({"SMAP\nWallHoles.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WallHoles.kt\ncom/planner5d/library/widget/editor/editor3d/model/builder/WallHoles\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,37:1\n1557#2:38\n1628#2,3:39\n*S KotlinDebug\n*F\n+ 1 WallHoles.kt\ncom/planner5d/library/widget/editor/editor3d/model/builder/WallHoles\n*L\n13#1:38\n13#1:39,3\n*E\n"})
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final z f255720a = new z();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f255721b = 0;

    private z() {
    }

    private final ItemWindow[] b(WallsInfoWall wallsInfoWall) {
        Wall wall;
        if (wallsInfoWall != null && (wall = wallsInfoWall.getWall()) != null && (wall instanceof ItemWall)) {
            Item parentItem = ((ItemWall) wall).getParentItem();
            if ((parentItem instanceof ItemRoom) || (parentItem instanceof ItemPartition)) {
                Item parentItem2 = ((ItemWalls) parentItem).getParentItem();
                if (parentItem2 instanceof ItemFloor) {
                    ItemWindow[] windows = ((ItemFloor) parentItem2).getWindows();
                    Intrinsics.checkNotNullExpressionValue(windows, "getWindows(...)");
                    return windows;
                }
            }
        }
        return new ItemWindow[0];
    }

    @NotNull
    public final List<WallHole> a(@NotNull WallsInfoWall wall) {
        Intrinsics.checkNotNullParameter(wall, "wall");
        ItemLayout itemLayout = new ItemLayout();
        List<ItemWindow> listA = new r3().a(wall, b(wall));
        Intrinsics.checkNotNullExpressionValue(listA, "getAttachedWindows(...)");
        List<ItemWindow> list = listA;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (ItemWindow itemWindow : list) {
            float[] fArrJ = itemWindow.getPolygon(new com.planner5d.library.engine.util.math.h()).j();
            Intrinsics.checkNotNullExpressionValue(fArrJ, "getTransformedVertices(...)");
            arrayList.add(new WallHole(fArrJ, itemWindow.getLayout(itemLayout).getPositionZ(), itemWindow.getHeight3DModel() * itemLayout.getScaleZ(), 0.0f));
        }
        return arrayList;
    }
}
