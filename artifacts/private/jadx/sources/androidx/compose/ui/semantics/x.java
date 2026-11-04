package androidx.compose.ui.semantics;

import androidx.collection.g2;
import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.node.l0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSemanticsOwner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsOwner.kt\nandroidx/compose/ui/semantics/SemanticsOwner\n+ 2 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,246:1\n287#2,6:247\n*S KotlinDebug\n*F\n+ 1 SemanticsOwner.kt\nandroidx/compose/ui/semantics/SemanticsOwner\n*L\n75#1:247,6\n*E\n"})
public final class x {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f41184e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final l0 f41185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final f f41186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.collection.j0<l0> f41187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final g2<r> f41188d = new g2<>(2);

    public x(@NotNull l0 l0Var, @NotNull f fVar, @NotNull androidx.collection.j0<l0> j0Var) {
        this.f41185a = l0Var;
        this.f41186b = fVar;
        this.f41187c = j0Var;
    }

    @Nullable
    public final p a(int i10) {
        return this.f41187c.n(i10);
    }

    @NotNull
    public final g2<r> b() {
        return this.f41188d;
    }

    @NotNull
    public final p c() {
        return this.f41185a;
    }

    @NotNull
    public final u d() {
        return v.a(this.f41185a, true);
    }

    @NotNull
    public final u e() {
        return new u(this.f41186b, false, this.f41185a, new SemanticsConfiguration());
    }

    public final void f(@NotNull p pVar, @Nullable SemanticsConfiguration semanticsConfiguration) {
        g2<r> g2Var = this.f41188d;
        Object[] objArr = g2Var.f12449a;
        int i10 = g2Var.f12450b;
        int i11 = 1 >> 0;
        for (int i12 = 0; i12 < i10; i12++) {
            ((r) objArr[i12]).b(pVar, semanticsConfiguration);
        }
    }
}
