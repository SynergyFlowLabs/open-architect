package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nVectorCompose.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorCompose.kt\nandroidx/compose/ui/graphics/vector/VectorApplier\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,165:1\n1#2:166\n*E\n"})
public final class m extends androidx.compose.runtime.a<l> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f38516e = androidx.compose.runtime.a.f35288d;

    public m(@NotNull l lVar) {
        super(lVar);
    }

    private final c u(l lVar) {
        if (lVar instanceof c) {
            return (c) lVar;
        }
        throw new IllegalStateException("Cannot only insert VNode into Group");
    }

    @Override // androidx.compose.runtime.i
    public void b(int i10, int i11) {
        u(a()).y(i10, i11);
    }

    @Override // androidx.compose.runtime.i
    public void i(int i10, int i11, int i12) {
        u(a()).x(i10, i11, i12);
    }

    @Override // androidx.compose.runtime.a
    protected void r() {
        c cVarU = u(p());
        cVarU.y(0, cVarU.h());
    }

    @Override // androidx.compose.runtime.i
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void m(int i10, @NotNull l lVar) {
        u(a()).r(i10, lVar);
    }

    @Override // androidx.compose.runtime.i
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void l(int i10, @NotNull l lVar) {
    }
}
