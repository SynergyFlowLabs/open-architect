package io.intercom.android.sdk.m5.conversation.ui.components.row;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nClickableMessageRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClickableMessageRow.kt\nio/intercom/android/sdk/m5/conversation/ui/components/row/BottomMetadata\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,92:1\n113#2:93\n*S KotlinDebug\n*F\n+ 1 ClickableMessageRow.kt\nio/intercom/android/sdk/m5/conversation/ui/components/row/BottomMetadata\n*L\n89#1:93\n*E\n"})
public final class BottomMetadata {
    public static final int $stable = 0;
    private final boolean alwaysShow;
    private final float padding;

    @NotNull
    private final String text;

    public /* synthetic */ BottomMetadata(String str, float f10, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, f10, z10);
    }

    /* JADX INFO: renamed from: copy-lG28NQ4$default, reason: not valid java name */
    public static /* synthetic */ BottomMetadata m271copylG28NQ4$default(BottomMetadata bottomMetadata, String str, float f10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = bottomMetadata.text;
        }
        if ((i10 & 2) != 0) {
            f10 = bottomMetadata.padding;
        }
        if ((i10 & 4) != 0) {
            z10 = bottomMetadata.alwaysShow;
        }
        return bottomMetadata.m273copylG28NQ4(str, f10, z10);
    }

    @NotNull
    public final String component1() {
        return this.text;
    }

    /* JADX INFO: renamed from: component2-D9Ej5fM, reason: not valid java name */
    public final float m272component2D9Ej5fM() {
        return this.padding;
    }

    public final boolean component3() {
        return this.alwaysShow;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-lG28NQ4, reason: not valid java name */
    public final BottomMetadata m273copylG28NQ4(@NotNull String text, float f10, boolean z10) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new BottomMetadata(text, f10, z10, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomMetadata)) {
            return false;
        }
        BottomMetadata bottomMetadata = (BottomMetadata) obj;
        return Intrinsics.areEqual(this.text, bottomMetadata.text) && androidx.compose.ui.unit.h.x(this.padding, bottomMetadata.padding) && this.alwaysShow == bottomMetadata.alwaysShow;
    }

    public final boolean getAlwaysShow() {
        return this.alwaysShow;
    }

    /* JADX INFO: renamed from: getPadding-D9Ej5fM, reason: not valid java name */
    public final float m274getPaddingD9Ej5fM() {
        return this.padding;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return (((this.text.hashCode() * 31) + androidx.compose.ui.unit.h.D(this.padding)) * 31) + Boolean.hashCode(this.alwaysShow);
    }

    @NotNull
    public String toString() {
        return "BottomMetadata(text=" + this.text + ", padding=" + ((Object) androidx.compose.ui.unit.h.M(this.padding)) + ", alwaysShow=" + this.alwaysShow + ')';
    }

    private BottomMetadata(String text, float f10, boolean z10) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.padding = f10;
        this.alwaysShow = z10;
    }

    public /* synthetic */ BottomMetadata(String str, float f10, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? androidx.compose.ui.unit.h.r(4) : f10, (i10 & 4) != 0 ? false : z10, null);
    }
}
