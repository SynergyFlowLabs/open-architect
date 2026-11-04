package androidx.compose.ui.layout;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nMultiContentMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiContentMeasurePolicy.kt\nandroidx/compose/ui/layout/MultiContentMeasurePolicyImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,240:1\n1#2:241\n*E\n"})
public final class i1 implements a1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f39365b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final h1 f39366a;

    public i1(@NotNull h1 h1Var) {
        this.f39366a = h1Var;
    }

    public static /* synthetic */ i1 h(i1 i1Var, h1 h1Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            h1Var = i1Var.f39366a;
        }
        return i1Var.g(h1Var);
    }

    @Override // androidx.compose.ui.layout.a1
    @NotNull
    public b1 a(@NotNull c1 c1Var, @NotNull List<? extends z0> list, long j10) {
        return this.f39366a.a(c1Var, androidx.compose.ui.node.c1.a(c1Var), j10);
    }

    @Override // androidx.compose.ui.layout.a1
    public int b(@NotNull z zVar, @NotNull List<? extends y> list, int i10) {
        return this.f39366a.b(zVar, androidx.compose.ui.node.c1.a(zVar), i10);
    }

    @Override // androidx.compose.ui.layout.a1
    public int c(@NotNull z zVar, @NotNull List<? extends y> list, int i10) {
        return this.f39366a.c(zVar, androidx.compose.ui.node.c1.a(zVar), i10);
    }

    @Override // androidx.compose.ui.layout.a1
    public int d(@NotNull z zVar, @NotNull List<? extends y> list, int i10) {
        return this.f39366a.d(zVar, androidx.compose.ui.node.c1.a(zVar), i10);
    }

    @Override // androidx.compose.ui.layout.a1
    public int e(@NotNull z zVar, @NotNull List<? extends y> list, int i10) {
        return this.f39366a.e(zVar, androidx.compose.ui.node.c1.a(zVar), i10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof i1) && Intrinsics.areEqual(this.f39366a, ((i1) obj).f39366a)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final h1 f() {
        return this.f39366a;
    }

    @NotNull
    public final i1 g(@NotNull h1 h1Var) {
        return new i1(h1Var);
    }

    public int hashCode() {
        return this.f39366a.hashCode();
    }

    @NotNull
    public final h1 i() {
        return this.f39366a;
    }

    @NotNull
    public String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.f39366a + ')';
    }
}
