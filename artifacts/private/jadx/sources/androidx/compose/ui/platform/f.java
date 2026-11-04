package androidx.compose.ui.platform;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nAndroidClipboardManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidClipboardManager.android.kt\nandroidx/compose/ui/platform/AndroidClipboardManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,601:1\n1#2:602\n*E\n"})
public final class f implements o1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f40437b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ClipboardManager f40438a;

    public f(@NotNull ClipboardManager clipboardManager) {
        this.f40438a = clipboardManager;
    }

    @Override // androidx.compose.ui.platform.o1
    public boolean T3() {
        ClipDescription primaryClipDescription = this.f40438a.getPrimaryClipDescription();
        if (primaryClipDescription != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    @Override // androidx.compose.ui.platform.o1
    public void U3(@Nullable k1 k1Var) {
        if (k1Var == null) {
            v0.a(this.f40438a);
        } else {
            this.f40438a.setPrimaryClip(k1Var.a());
        }
    }

    @Override // androidx.compose.ui.platform.o1
    public void V3(@NotNull androidx.compose.ui.text.f fVar) {
        this.f40438a.setPrimaryClip(ClipData.newPlainText("plain text", g.b(fVar)));
    }

    @Override // androidx.compose.ui.platform.o1
    @NotNull
    public ClipboardManager a() {
        return this.f40438a;
    }

    @Override // androidx.compose.ui.platform.o1
    @Nullable
    public k1 b() {
        ClipData primaryClip = this.f40438a.getPrimaryClip();
        if (primaryClip != null) {
            return new k1(primaryClip);
        }
        return null;
    }

    @Override // androidx.compose.ui.platform.o1
    @Nullable
    public androidx.compose.ui.text.f getText() {
        ClipData primaryClip = this.f40438a.getPrimaryClip();
        if (primaryClip == null || primaryClip.getItemCount() <= 0) {
            return null;
        }
        ClipData.Item itemAt = primaryClip.getItemAt(0);
        return g.a(itemAt != null ? itemAt.getText() : null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f(@NotNull Context context) {
        Object systemService = context.getSystemService("clipboard");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this((ClipboardManager) systemService);
    }
}
