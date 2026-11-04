package io.intercom.android.sdk.survey.block;

import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.text.font.v0;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class BlockRenderData {
    public static final int $stable = 8;

    @NotNull
    private final Block block;

    @NotNull
    private final BlockRenderTextStyle headingTextStyle;

    @NotNull
    private final BlockRenderTextStyle paragraphTextStyle;

    @NotNull
    private final BlockRenderTextStyle subHeadingTextStyle;

    @Nullable
    private final androidx.compose.ui.graphics.q0 textColor;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BlockType.values().length];
            try {
                iArr[BlockType.HEADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BlockType.SUBHEADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BlockType.PARAGRAPH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ BlockRenderData(Block block, androidx.compose.ui.graphics.q0 q0Var, BlockRenderTextStyle blockRenderTextStyle, BlockRenderTextStyle blockRenderTextStyle2, BlockRenderTextStyle blockRenderTextStyle3, DefaultConstructorMarker defaultConstructorMarker) {
        this(block, q0Var, blockRenderTextStyle, blockRenderTextStyle2, blockRenderTextStyle3);
    }

    /* JADX INFO: renamed from: copy-ZLcQsz0$default, reason: not valid java name */
    public static /* synthetic */ BlockRenderData m429copyZLcQsz0$default(BlockRenderData blockRenderData, Block block, androidx.compose.ui.graphics.q0 q0Var, BlockRenderTextStyle blockRenderTextStyle, BlockRenderTextStyle blockRenderTextStyle2, BlockRenderTextStyle blockRenderTextStyle3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            block = blockRenderData.block;
        }
        if ((i10 & 2) != 0) {
            q0Var = blockRenderData.textColor;
        }
        if ((i10 & 4) != 0) {
            blockRenderTextStyle = blockRenderData.headingTextStyle;
        }
        if ((i10 & 8) != 0) {
            blockRenderTextStyle2 = blockRenderData.subHeadingTextStyle;
        }
        if ((i10 & 16) != 0) {
            blockRenderTextStyle3 = blockRenderData.paragraphTextStyle;
        }
        BlockRenderTextStyle blockRenderTextStyle4 = blockRenderTextStyle3;
        BlockRenderTextStyle blockRenderTextStyle5 = blockRenderTextStyle;
        return blockRenderData.m431copyZLcQsz0(block, q0Var, blockRenderTextStyle5, blockRenderTextStyle2, blockRenderTextStyle4);
    }

    @NotNull
    public final Block component1() {
        return this.block;
    }

    @Nullable
    /* JADX INFO: renamed from: component2-QN2ZGVo, reason: not valid java name */
    public final androidx.compose.ui.graphics.q0 m430component2QN2ZGVo() {
        return this.textColor;
    }

    @NotNull
    public final BlockRenderTextStyle component3() {
        return this.headingTextStyle;
    }

    @NotNull
    public final BlockRenderTextStyle component4() {
        return this.subHeadingTextStyle;
    }

    @NotNull
    public final BlockRenderTextStyle component5() {
        return this.paragraphTextStyle;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-ZLcQsz0, reason: not valid java name */
    public final BlockRenderData m431copyZLcQsz0(@NotNull Block block, @Nullable androidx.compose.ui.graphics.q0 q0Var, @NotNull BlockRenderTextStyle headingTextStyle, @NotNull BlockRenderTextStyle subHeadingTextStyle, @NotNull BlockRenderTextStyle paragraphTextStyle) {
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(headingTextStyle, "headingTextStyle");
        Intrinsics.checkNotNullParameter(subHeadingTextStyle, "subHeadingTextStyle");
        Intrinsics.checkNotNullParameter(paragraphTextStyle, "paragraphTextStyle");
        return new BlockRenderData(block, q0Var, headingTextStyle, subHeadingTextStyle, paragraphTextStyle, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlockRenderData)) {
            return false;
        }
        BlockRenderData blockRenderData = (BlockRenderData) obj;
        return Intrinsics.areEqual(this.block, blockRenderData.block) && Intrinsics.areEqual(this.textColor, blockRenderData.textColor) && Intrinsics.areEqual(this.headingTextStyle, blockRenderData.headingTextStyle) && Intrinsics.areEqual(this.subHeadingTextStyle, blockRenderData.subHeadingTextStyle) && Intrinsics.areEqual(this.paragraphTextStyle, blockRenderData.paragraphTextStyle);
    }

    @NotNull
    public final Block getBlock() {
        return this.block;
    }

    @NotNull
    public final BlockRenderTextStyle getHeadingTextStyle() {
        return this.headingTextStyle;
    }

    @NotNull
    public final BlockRenderTextStyle getParagraphTextStyle() {
        return this.paragraphTextStyle;
    }

    @NotNull
    public final BlockRenderTextStyle getSubHeadingTextStyle() {
        return this.subHeadingTextStyle;
    }

    @Nullable
    /* JADX INFO: renamed from: getTextColor-QN2ZGVo, reason: not valid java name */
    public final androidx.compose.ui.graphics.q0 m432getTextColorQN2ZGVo() {
        return this.textColor;
    }

    @NotNull
    public final BlockRenderTextStyle getTextStyle() {
        BlockType type = this.block.getType();
        int i10 = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i10 == 1) {
            return this.headingTextStyle;
        }
        if (i10 == 2) {
            return this.subHeadingTextStyle;
        }
        int i11 = 2 ^ 3;
        return i10 != 3 ? BlockRenderTextStyle.Companion.getParagraphDefault() : this.paragraphTextStyle;
    }

    public int hashCode() {
        int iHashCode = this.block.hashCode() * 31;
        androidx.compose.ui.graphics.q0 q0Var = this.textColor;
        return ((((((iHashCode + (q0Var == null ? 0 : androidx.compose.ui.graphics.q0.K(q0Var.M()))) * 31) + this.headingTextStyle.hashCode()) * 31) + this.subHeadingTextStyle.hashCode()) * 31) + this.paragraphTextStyle.hashCode();
    }

    @NotNull
    public String toString() {
        return "BlockRenderData(block=" + this.block + ", textColor=" + this.textColor + ", headingTextStyle=" + this.headingTextStyle + ", subHeadingTextStyle=" + this.subHeadingTextStyle + ", paragraphTextStyle=" + this.paragraphTextStyle + ')';
    }

    private BlockRenderData(Block block, androidx.compose.ui.graphics.q0 q0Var, BlockRenderTextStyle headingTextStyle, BlockRenderTextStyle subHeadingTextStyle, BlockRenderTextStyle paragraphTextStyle) {
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(headingTextStyle, "headingTextStyle");
        Intrinsics.checkNotNullParameter(subHeadingTextStyle, "subHeadingTextStyle");
        Intrinsics.checkNotNullParameter(paragraphTextStyle, "paragraphTextStyle");
        this.block = block;
        this.textColor = q0Var;
        this.headingTextStyle = headingTextStyle;
        this.subHeadingTextStyle = subHeadingTextStyle;
        this.paragraphTextStyle = paragraphTextStyle;
    }

    public /* synthetic */ BlockRenderData(Block block, androidx.compose.ui.graphics.q0 q0Var, BlockRenderTextStyle blockRenderTextStyle, BlockRenderTextStyle blockRenderTextStyle2, BlockRenderTextStyle blockRenderTextStyle3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(block, (i10 & 2) != 0 ? null : q0Var, (i10 & 4) != 0 ? new BlockRenderTextStyle(androidx.compose.ui.unit.a0.m(48), v0.f41742b.c(), androidx.compose.ui.unit.a0.m(56), null, null, null, 56, null) : blockRenderTextStyle, (i10 & 8) != 0 ? new BlockRenderTextStyle(androidx.compose.ui.unit.a0.m(36), v0.f41742b.o(), androidx.compose.ui.unit.a0.m(44), null, null, null, 56, null) : blockRenderTextStyle2, (i10 & 16) != 0 ? BlockRenderTextStyle.Companion.getParagraphDefault() : blockRenderTextStyle3, null);
    }
}
