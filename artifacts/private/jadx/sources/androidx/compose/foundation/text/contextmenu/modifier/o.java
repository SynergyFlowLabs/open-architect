package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.runtime.internal.w0;
import kotlin.a0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nTextContextMenuToolbarHandlerModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextContextMenuToolbarHandlerModifier.kt\nandroidx/compose/foundation/text/contextmenu/modifier/ToolbarRequester\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,233:1\n72#2,5:234\n*S KotlinDebug\n*F\n+ 1 TextContextMenuToolbarHandlerModifier.kt\nandroidx/compose/foundation/text/contextmenu/modifier/ToolbarRequester\n*L\n51#1:234,5\n*E\n"})
public abstract class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f19009b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private n f19010a;

    @Nullable
    public final n a() {
        return this.f19010a;
    }

    public abstract void b();

    @NotNull
    public final n c() {
        n nVar = this.f19010a;
        if (nVar != null) {
            return nVar;
        }
        androidx.compose.foundation.internal.e.j("ToolbarRequester is not initialized.");
        throw new a0();
    }

    public final void d(@Nullable n nVar) {
        this.f19010a = nVar;
    }

    public abstract void e();
}
