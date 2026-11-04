package androidx.compose.ui.modifier;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nModifierLocalModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalModifierNode.kt\nandroidx/compose/ui/modifier/BackwardsCompatLocalMap\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,237:1\n66#2,4:238\n*S KotlinDebug\n*F\n+ 1 ModifierLocalModifierNode.kt\nandroidx/compose/ui/modifier/BackwardsCompatLocalMap\n*L\n71#1:238,4\n*E\n"})
public final class a extends i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f39614c = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private l<?> f39615b;

    public a(@NotNull l<?> lVar) {
        super(null);
        this.f39615b = lVar;
    }

    @Override // androidx.compose.ui.modifier.i
    public boolean a(@NotNull c<?> cVar) {
        return cVar == this.f39615b.getKey();
    }

    @Override // androidx.compose.ui.modifier.i
    @Nullable
    public <T> T b(@NotNull c<T> cVar) {
        if (!(cVar == this.f39615b.getKey())) {
            s0.a.i("Check failed.");
        }
        return (T) this.f39615b.getValue();
    }

    @Override // androidx.compose.ui.modifier.i
    public <T> void c(@NotNull c<T> cVar, T t10) {
        throw new IllegalStateException("Set is not allowed on a backwards compat provider");
    }

    @NotNull
    public final l<?> d() {
        return this.f39615b;
    }

    public final void e(@NotNull l<?> lVar) {
        this.f39615b = lVar;
    }
}
