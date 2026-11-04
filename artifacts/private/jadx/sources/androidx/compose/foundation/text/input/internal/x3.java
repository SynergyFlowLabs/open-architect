package androidx.compose.foundation.text.input.internal;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nLegacyPlatformTextInputServiceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyPlatformTextInputServiceAdapter.kt\nandroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,84:1\n51#2,4:85\n51#2,4:89\n*S KotlinDebug\n*F\n+ 1 LegacyPlatformTextInputServiceAdapter.kt\nandroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter\n*L\n51#1:85,4\n58#1:89,4\n*E\n"})
public abstract class x3 implements androidx.compose.ui.text.input.q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f20198b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private a f20199a;

    public interface a {
        @Nullable
        androidx.compose.ui.layout.g0 M();

        @Nullable
        kotlinx.coroutines.p2 V6(@NotNull Function2<? super androidx.compose.ui.platform.m3, ? super kotlin.coroutines.d<?>, ? extends Object> function2);

        @Nullable
        androidx.compose.ui.platform.z3 getSoftwareKeyboardController();

        @NotNull
        androidx.compose.ui.platform.o4 getViewConfiguration();

        @Nullable
        androidx.compose.foundation.text.selection.u3 o3();

        @Nullable
        androidx.compose.foundation.text.g4 u4();
    }

    @Override // androidx.compose.ui.text.input.q0
    public final void e() {
        androidx.compose.ui.platform.z3 softwareKeyboardController;
        a aVar = this.f20199a;
        if (aVar == null || (softwareKeyboardController = aVar.getSoftwareKeyboardController()) == null) {
            return;
        }
        softwareKeyboardController.b();
    }

    @Override // androidx.compose.ui.text.input.q0
    public final void f() {
        androidx.compose.ui.platform.z3 softwareKeyboardController;
        a aVar = this.f20199a;
        if (aVar != null && (softwareKeyboardController = aVar.getSoftwareKeyboardController()) != null) {
            softwareKeyboardController.a();
        }
    }

    @Nullable
    protected final a i() {
        return this.f20199a;
    }

    public final void j(@NotNull a aVar) {
        if (!(this.f20199a == null)) {
            androidx.compose.foundation.internal.e.i("Expected textInputModifierNode to be null");
        }
        this.f20199a = aVar;
    }

    public abstract void k();

    public final void l(@NotNull a aVar) {
        if (!(this.f20199a == aVar)) {
            androidx.compose.foundation.internal.e.i("Expected textInputModifierNode to be " + aVar + " but was " + this.f20199a);
        }
        this.f20199a = null;
    }
}
