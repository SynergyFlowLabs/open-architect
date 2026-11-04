package androidx.compose.foundation.layout;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.k7
@SourceDebugExtension({"SMAP\nWindowInsetsPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/InsetsConsumingModifier\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,623:1\n85#2:624\n117#2,2:625\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/InsetsConsumingModifier\n*L\n426#1:624\n426#1:625,2\n*E\n"})
abstract class v3 implements androidx.compose.ui.modifier.d, androidx.compose.ui.modifier.l<v6> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f16487a;

    public /* synthetic */ v3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final v6 b() {
        return (v6) this.f16487a.getValue();
    }

    private final void e(v6 v6Var) {
        this.f16487a.setValue(v6Var);
    }

    @NotNull
    public abstract v6 a(@NotNull v6 v6Var);

    @Override // androidx.compose.ui.modifier.d
    public void c7(@NotNull androidx.compose.ui.modifier.n nVar) {
        e(a((v6) nVar.I(t7.e())));
    }

    @Override // androidx.compose.ui.modifier.l
    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public v6 getValue() {
        return b();
    }

    @Override // androidx.compose.ui.modifier.l
    @NotNull
    public androidx.compose.ui.modifier.p<v6> getKey() {
        return t7.e();
    }

    private v3() {
        this.f16487a = androidx.compose.runtime.d7.g(b7.b(0, 0, 0, 0), null, 2, null);
    }
}
