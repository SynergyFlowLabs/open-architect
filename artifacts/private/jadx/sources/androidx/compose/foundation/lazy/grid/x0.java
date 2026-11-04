package androidx.compose.foundation.lazy.grid;

import androidx.compose.ui.layout.i2;
import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nLazyGridMeasuredItemProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasuredItemProvider.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,105:1\n97#2,4:106\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasuredItemProvider.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider\n*L\n67#1:106,4\n*E\n"})
public abstract class x0 extends androidx.compose.foundation.lazy.layout.b1<v0> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f17057f = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final z f17058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.lazy.layout.w0 f17059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f17060e;

    public x0(@NotNull z zVar, @NotNull androidx.compose.foundation.lazy.layout.w0 w0Var, int i10) {
        this.f17058c = zVar;
        this.f17059d = w0Var;
        this.f17060e = i10;
    }

    @NotNull
    public abstract v0 c(int i10, @NotNull Object obj, @Nullable Object obj2, int i11, int i12, @NotNull List<? extends i2> list, long j10, int i13, int i14);

    @Override // androidx.compose.foundation.lazy.layout.b1
    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public v0 a(int i10, int i11, int i12, long j10) {
        return e(i10, j10, i11, i12, this.f17060e);
    }

    @NotNull
    public final v0 e(int i10, long j10, int i11, int i12, int i13) {
        int iQ;
        Object objD = this.f17058c.d(i10);
        Object objF = this.f17058c.f(i10);
        List<i2> listB = b(this.f17059d, i10, j10);
        if (androidx.compose.ui.unit.b.n(j10)) {
            iQ = androidx.compose.ui.unit.b.r(j10);
        } else {
            if (!androidx.compose.ui.unit.b.l(j10)) {
                androidx.compose.foundation.internal.e.g("does not have fixed height");
            }
            iQ = androidx.compose.ui.unit.b.q(j10);
        }
        return c(i10, objD, objF, iQ, i13, listB, j10, i11, i12);
    }

    @NotNull
    public final androidx.collection.f0 f() {
        return this.f17058c.e();
    }

    @NotNull
    public final androidx.compose.foundation.lazy.layout.o0 g() {
        return this.f17058c.b();
    }
}
