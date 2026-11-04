package io.intercom.android.sdk.survey.block;

import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.graphics.o3;
import androidx.compose.ui.text.a1;
import androidx.compose.ui.text.font.v0;
import androidx.compose.ui.text.y3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public final class BlockRenderTextStyle {
    public static final int $stable = 0;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final BlockRenderTextStyle paragraphDefault = new BlockRenderTextStyle(androidx.compose.ui.unit.a0.m(16), v0.f41742b.m(), 0, null, null, null, 60, null);
    private final long fontSize;

    @NotNull
    private final v0 fontWeight;
    private final long lineHeight;

    @Nullable
    private final androidx.compose.ui.graphics.q0 linkTextColor;

    @Nullable
    private final androidx.compose.ui.text.style.j textAlign;

    @Nullable
    private final androidx.compose.ui.graphics.q0 textColor;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BlockRenderTextStyle getParagraphDefault() {
            return BlockRenderTextStyle.paragraphDefault;
        }

        private Companion() {
        }
    }

    static {
        int i10 = 2 | 0;
    }

    public /* synthetic */ BlockRenderTextStyle(long j10, v0 v0Var, long j11, androidx.compose.ui.graphics.q0 q0Var, androidx.compose.ui.graphics.q0 q0Var2, androidx.compose.ui.text.style.j jVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, v0Var, j11, q0Var, q0Var2, jVar);
    }

    /* JADX INFO: renamed from: copy--ZsBm6Y$default, reason: not valid java name */
    public static /* synthetic */ BlockRenderTextStyle m433copyZsBm6Y$default(BlockRenderTextStyle blockRenderTextStyle, long j10, v0 v0Var, long j11, androidx.compose.ui.graphics.q0 q0Var, androidx.compose.ui.graphics.q0 q0Var2, androidx.compose.ui.text.style.j jVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = blockRenderTextStyle.fontSize;
        }
        long j12 = j10;
        if ((i10 & 2) != 0) {
            v0Var = blockRenderTextStyle.fontWeight;
        }
        v0 v0Var2 = v0Var;
        if ((i10 & 4) != 0) {
            j11 = blockRenderTextStyle.lineHeight;
        }
        long j13 = j11;
        if ((i10 & 8) != 0) {
            q0Var = blockRenderTextStyle.textColor;
        }
        return blockRenderTextStyle.m439copyZsBm6Y(j12, v0Var2, j13, q0Var, (i10 & 16) != 0 ? blockRenderTextStyle.linkTextColor : q0Var2, (i10 & 32) != 0 ? blockRenderTextStyle.textAlign : jVar);
    }

    /* JADX INFO: renamed from: component1-XSAIIZE, reason: not valid java name */
    public final long m434component1XSAIIZE() {
        return this.fontSize;
    }

    @NotNull
    public final v0 component2() {
        return this.fontWeight;
    }

    /* JADX INFO: renamed from: component3-XSAIIZE, reason: not valid java name */
    public final long m435component3XSAIIZE() {
        return this.lineHeight;
    }

    @Nullable
    /* JADX INFO: renamed from: component4-QN2ZGVo, reason: not valid java name */
    public final androidx.compose.ui.graphics.q0 m436component4QN2ZGVo() {
        return this.textColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component5-QN2ZGVo, reason: not valid java name */
    public final androidx.compose.ui.graphics.q0 m437component5QN2ZGVo() {
        return this.linkTextColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component6-buA522U, reason: not valid java name */
    public final androidx.compose.ui.text.style.j m438component6buA522U() {
        return this.textAlign;
    }

    @NotNull
    /* JADX INFO: renamed from: copy--ZsBm6Y, reason: not valid java name */
    public final BlockRenderTextStyle m439copyZsBm6Y(long j10, @NotNull v0 fontWeight, long j11, @Nullable androidx.compose.ui.graphics.q0 q0Var, @Nullable androidx.compose.ui.graphics.q0 q0Var2, @Nullable androidx.compose.ui.text.style.j jVar) {
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        return new BlockRenderTextStyle(j10, fontWeight, j11, q0Var, q0Var2, jVar, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlockRenderTextStyle)) {
            return false;
        }
        BlockRenderTextStyle blockRenderTextStyle = (BlockRenderTextStyle) obj;
        if (androidx.compose.ui.unit.z.j(this.fontSize, blockRenderTextStyle.fontSize) && Intrinsics.areEqual(this.fontWeight, blockRenderTextStyle.fontWeight) && androidx.compose.ui.unit.z.j(this.lineHeight, blockRenderTextStyle.lineHeight) && Intrinsics.areEqual(this.textColor, blockRenderTextStyle.textColor) && Intrinsics.areEqual(this.linkTextColor, blockRenderTextStyle.linkTextColor) && Intrinsics.areEqual(this.textAlign, blockRenderTextStyle.textAlign)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: getFontSize-XSAIIZE, reason: not valid java name */
    public final long m440getFontSizeXSAIIZE() {
        return this.fontSize;
    }

    @NotNull
    public final v0 getFontWeight() {
        return this.fontWeight;
    }

    /* JADX INFO: renamed from: getLineHeight-XSAIIZE, reason: not valid java name */
    public final long m441getLineHeightXSAIIZE() {
        return this.lineHeight;
    }

    @Nullable
    /* JADX INFO: renamed from: getLinkTextColor-QN2ZGVo, reason: not valid java name */
    public final androidx.compose.ui.graphics.q0 m442getLinkTextColorQN2ZGVo() {
        return this.linkTextColor;
    }

    @Nullable
    /* JADX INFO: renamed from: getTextAlign-buA522U, reason: not valid java name */
    public final androidx.compose.ui.text.style.j m443getTextAlignbuA522U() {
        return this.textAlign;
    }

    @Nullable
    /* JADX INFO: renamed from: getTextColor-QN2ZGVo, reason: not valid java name */
    public final androidx.compose.ui.graphics.q0 m444getTextColorQN2ZGVo() {
        return this.textColor;
    }

    public int hashCode() {
        int iO = ((((androidx.compose.ui.unit.z.o(this.fontSize) * 31) + this.fontWeight.hashCode()) * 31) + androidx.compose.ui.unit.z.o(this.lineHeight)) * 31;
        androidx.compose.ui.graphics.q0 q0Var = this.textColor;
        int iK = (iO + (q0Var == null ? 0 : androidx.compose.ui.graphics.q0.K(q0Var.M()))) * 31;
        androidx.compose.ui.graphics.q0 q0Var2 = this.linkTextColor;
        int iK2 = (iK + (q0Var2 == null ? 0 : androidx.compose.ui.graphics.q0.K(q0Var2.M()))) * 31;
        androidx.compose.ui.text.style.j jVar = this.textAlign;
        return iK2 + (jVar != null ? androidx.compose.ui.text.style.j.l(jVar.n()) : 0);
    }

    @NotNull
    public String toString() {
        return "BlockRenderTextStyle(fontSize=" + ((Object) androidx.compose.ui.unit.z.u(this.fontSize)) + ", fontWeight=" + this.fontWeight + ", lineHeight=" + ((Object) androidx.compose.ui.unit.z.u(this.lineHeight)) + ", textColor=" + this.textColor + ", linkTextColor=" + this.linkTextColor + ", textAlign=" + this.textAlign + ')';
    }

    @NotNull
    public final y3 toTextStyle$intercom_sdk_base_release() {
        androidx.compose.ui.graphics.q0 q0Var = this.textColor;
        long jM = q0Var != null ? q0Var.M() : androidx.compose.ui.graphics.q0.f38131b.u();
        long j10 = this.fontSize;
        v0 v0Var = this.fontWeight;
        long j11 = this.lineHeight;
        androidx.compose.ui.text.style.j jVar = this.textAlign;
        return new y3(jM, j10, v0Var, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, jVar != null ? jVar.n() : androidx.compose.ui.text.style.j.f42206b.f(), 0, j11, (androidx.compose.ui.text.style.s) null, (a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (androidx.compose.ui.text.style.u) null, 16613368, (DefaultConstructorMarker) null);
    }

    private BlockRenderTextStyle(long j10, v0 fontWeight, long j11, androidx.compose.ui.graphics.q0 q0Var, androidx.compose.ui.graphics.q0 q0Var2, androidx.compose.ui.text.style.j jVar) {
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        this.fontSize = j10;
        this.fontWeight = fontWeight;
        this.lineHeight = j11;
        this.textColor = q0Var;
        this.linkTextColor = q0Var2;
        this.textAlign = jVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BlockRenderTextStyle(long j10, v0 v0Var, long j11, androidx.compose.ui.graphics.q0 q0Var, androidx.compose.ui.graphics.q0 q0Var2, androidx.compose.ui.text.style.j jVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        long jB = (i10 & 4) != 0 ? androidx.compose.ui.unit.z.f42728b.b() : j11;
        androidx.compose.ui.graphics.q0 q0Var3 = (i10 & 8) != 0 ? null : q0Var;
        this(j10, v0Var, jB, q0Var3, (i10 & 16) != 0 ? q0Var3 : q0Var2, (i10 & 32) != 0 ? null : jVar, null);
    }
}
