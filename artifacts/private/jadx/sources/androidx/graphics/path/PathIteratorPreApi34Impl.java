package androidx.graphics.path;

import android.graphics.Path;
import dalvik.annotation.optimization.FastNative;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class PathIteratorPreApi34Impl extends c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f52080f;

    public /* synthetic */ PathIteratorPreApi34Impl(Path path, a.EnumC0469a enumC0469a, float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(path, (i10 & 2) != 0 ? a.EnumC0469a.AsQuadratics : enumC0469a, (i10 & 4) != 0 ? 0.25f : f10);
    }

    private final native long createInternalPathIterator(Path path, int i10, float f10);

    private final native void destroyInternalPathIterator(long j10);

    @FastNative
    private final native boolean internalPathIteratorHasNext(long j10);

    @FastNative
    private final native int internalPathIteratorNext(long j10, float[] fArr, int i10);

    @FastNative
    private final native int internalPathIteratorPeek(long j10);

    @FastNative
    private final native int internalPathIteratorRawSize(long j10);

    @FastNative
    private final native int internalPathIteratorSize(long j10);

    @Override // androidx.graphics.path.c
    public int a(boolean z10) {
        if (z10 && c() != a.EnumC0469a.AsConic) {
            return internalPathIteratorSize(this.f52080f);
        }
        return internalPathIteratorRawSize(this.f52080f);
    }

    @Override // androidx.graphics.path.c
    public boolean f() {
        return internalPathIteratorHasNext(this.f52080f);
    }

    protected final void finalize() {
        destroyInternalPathIterator(this.f52080f);
    }

    @Override // androidx.graphics.path.c
    @NotNull
    public e.a g(@NotNull float[] points, int i10) {
        Intrinsics.checkNotNullParameter(points, "points");
        return d.f52096a[internalPathIteratorNext(this.f52080f, points, i10)];
    }

    @Override // androidx.graphics.path.c
    @NotNull
    public e.a j() {
        return d.f52096a[internalPathIteratorPeek(this.f52080f)];
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PathIteratorPreApi34Impl(@NotNull Path path, @NotNull a.EnumC0469a conicEvaluation, float f10) {
        super(path, conicEvaluation, f10);
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(conicEvaluation, "conicEvaluation");
        this.f52080f = createInternalPathIterator(path, conicEvaluation.ordinal(), f10);
    }
}
