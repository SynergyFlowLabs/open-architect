package androidx.compose.ui.modifier;

import androidx.compose.runtime.d7;
import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.n3;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 1)
@SourceDebugExtension({"SMAP\nModifierLocalModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalModifierNode.kt\nandroidx/compose/ui/modifier/SingleLocalMap\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,237:1\n85#2:238\n117#2,2:239\n66#3,4:241\n66#3,4:245\n*S KotlinDebug\n*F\n+ 1 ModifierLocalModifierNode.kt\nandroidx/compose/ui/modifier/SingleLocalMap\n*L\n44#1:238\n44#1:239,2\n51#1:241,4\n57#1:245,4\n*E\n"})
public final class q extends i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f39638d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final c<?> f39639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final n3 f39640c;

    public q(@NotNull c<?> cVar) {
        super(null);
        this.f39639b = cVar;
        this.f39640c = d7.g(null, null, 2, null);
    }

    private final Object e() {
        return this.f39640c.getValue();
    }

    private final void f(Object obj) {
        this.f39640c.setValue(obj);
    }

    @Override // androidx.compose.ui.modifier.i
    public boolean a(@NotNull c<?> cVar) {
        return cVar == this.f39639b;
    }

    @Override // androidx.compose.ui.modifier.i
    @Nullable
    public <T> T b(@NotNull c<T> cVar) {
        if (!(cVar == this.f39639b)) {
            s0.a.i("Check failed.");
        }
        T t10 = (T) e();
        if (t10 == null) {
            return null;
        }
        return t10;
    }

    @Override // androidx.compose.ui.modifier.i
    public <T> void c(@NotNull c<T> cVar, T t10) {
        if (!(cVar == this.f39639b)) {
            s0.a.i("Check failed.");
        }
        f(t10);
    }

    public final void d(@Nullable Object obj) {
        f(obj);
    }
}
