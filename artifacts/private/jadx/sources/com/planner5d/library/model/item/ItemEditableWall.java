package com.planner5d.library.model.item;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.walls.WallsInfoWall;
import com.planner5d.library.widget.editor.editor2d.drawable.r;
import com.planner5d.library.widget.editor.editor2d.drawable.t;
import com.planner5d.library.widget.editor.editor2d.drawable.u;
import com.planner5d.library.widget.editor.editor2d.drawable.w;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@w0(parameters = 0)
public final class ItemEditableWall extends ItemWall {
    public static final int MISSING_VALUE = -1;

    @NotNull
    public static final String WALL_COLOR = "wallColor";

    @NotNull
    public static final String WALL_INDEX = "wallIndex";
    private int wallColor;
    private int wallIndex;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ItemEditableWall(@Nullable String str, @Nullable ItemPoint itemPoint, @Nullable ItemPoint itemPoint2) {
        super(str, itemPoint, itemPoint2);
        this.wallColor = -1;
    }

    @Override // com.planner5d.library.model.item.ItemWall, com.planner5d.library.model.item.Item
    @Nullable
    protected w createDrawables() {
        ItemWalls parentWalls = getParentWalls();
        if (parentWalls == null) {
            return null;
        }
        WallsInfoWall wallInfo = parentWalls.getWallInfo(this);
        return ((parentWalls instanceof ItemRoom) || (parentWalls instanceof ItemPartition)) ? w.g(new t(wallInfo), new u(wallInfo)) : w.g(new r(wallInfo));
    }

    public final int getWallColor() {
        return this.wallColor;
    }

    public final int getWallIndex() {
        return this.wallIndex;
    }

    public final void setData(int i10, int i11) {
        this.wallIndex = i10;
        this.wallColor = i11;
    }

    public final void setWallColor(int i10) {
        this.wallColor = i10;
    }

    public final void setWallIndex(int i10) {
        this.wallIndex = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemEditableWall(@NotNull ItemEditableWall item, @NotNull ProviderUid provider) {
        super(item, provider);
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.wallColor = -1;
    }
}
