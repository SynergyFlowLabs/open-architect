package androidx.compose.ui.node;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nNodeKind.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeKind.kt\nandroidx/compose/ui/node/CanFocusChecker\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,405:1\n78#2,5:406\n*S KotlinDebug\n*F\n+ 1 NodeKind.kt\nandroidx/compose/ui/node/CanFocusChecker\n*L\n382#1:406,5\n*E\n"})
final class e implements androidx.compose.ui.focus.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e f39723a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private static Boolean f39724b;

    private e() {
    }

    @Override // androidx.compose.ui.focus.z
    public void D(boolean z10) {
        f39724b = Boolean.valueOf(z10);
    }

    @Override // androidx.compose.ui.focus.z
    public boolean P() {
        Boolean bool = f39724b;
        if (bool != null) {
            return bool.booleanValue();
        }
        s0.a.j("canFocus is read before it is written");
        throw new kotlin.a0();
    }

    public final boolean a() {
        return f39724b != null;
    }

    public final void b() {
        f39724b = null;
    }
}
