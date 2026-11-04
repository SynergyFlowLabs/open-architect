package com.planner5d.library.model.item;

import androidx.annotation.m1;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.item.catalog.CatalogItem;
import com.planner5d.library.model.manager.builtin.i;
import com.planner5d.library.widget.editor.projectresources.viewoptions.b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@w0(parameters = 0)
public final class ItemEditability {
    public static final int $stable = 8;

    @NotNull
    private final i builtInDataManager;
    private final boolean contestMode;

    @NotNull
    private final b viewOptions;

    public ItemEditability(@NotNull i builtInDataManager, @NotNull b viewOptions) {
        Intrinsics.checkNotNullParameter(builtInDataManager, "builtInDataManager");
        Intrinsics.checkNotNullParameter(viewOptions, "viewOptions");
        this.builtInDataManager = builtInDataManager;
        this.viewOptions = viewOptions;
        this.contestMode = viewOptions.g();
    }

    @m1
    private final CatalogItem getCatalogItem(Item item) {
        if (item instanceof ItemNs) {
            return this.builtInDataManager.a(((ItemNs) item).getModelId());
        }
        return null;
    }

    @m1
    private final boolean isInCatalog(Item item) {
        return (item instanceof ItemNs) && this.builtInDataManager.r0(((ItemNs) item).getModelId());
    }

    @m1
    public final boolean canMove(@NotNull Item item) {
        CatalogItem catalogItem;
        Intrinsics.checkNotNullParameter(item, "item");
        if ((item.getParentItem() instanceof ItemRuler) && ((item instanceof ItemWall) || (item instanceof ItemPoint))) {
            return true;
        }
        if (this.contestMode) {
            return (!(item instanceof ItemWindow) && isInCatalog(item)) || (item instanceof ItemRuler);
        }
        if (!(item instanceof ItemWall) && !(item instanceof ItemPoint) && !(item instanceof ItemWalls)) {
            if (!(item instanceof ItemNs) || (catalogItem = getCatalogItem(item)) == null) {
                return true;
            }
            return catalogItem.isEditablePosition();
        }
        return !this.viewOptions.f258073d;
    }

    @m1
    public final boolean canResize(@NotNull Item item) {
        boolean zIsEditableSize;
        Intrinsics.checkNotNullParameter(item, "item");
        if (!this.contestMode) {
            CatalogItem catalogItem = getCatalogItem(item);
            if (catalogItem != null) {
                zIsEditableSize = catalogItem.isEditableSize();
            } else {
                zIsEditableSize = (this.contestMode || (item instanceof ItemUnknown)) ? false : true;
            }
            if (zIsEditableSize) {
                return true;
            }
        }
        return false;
    }

    @m1
    public final boolean canResizeX(@NotNull Item item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return canResize(item) && !(item instanceof ItemWindow);
    }

    public final boolean canRotateX(@NotNull Item item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return item instanceof ItemPr;
    }

    @m1
    public final boolean canRotateZ(@NotNull Item item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (!this.contestMode) {
            return ((item instanceof ItemDoor) || (item instanceof ItemWall) || (item instanceof ItemPoint)) ? false : true;
        }
        if (!(item instanceof ItemWindow)) {
            CatalogItem catalogItem = getCatalogItem(item);
            if (catalogItem != null ? catalogItem.isEditableRotation() : true) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final b getViewOptions() {
        return this.viewOptions;
    }
}
