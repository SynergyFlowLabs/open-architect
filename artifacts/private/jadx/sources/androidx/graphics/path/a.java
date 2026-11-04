package androidx.graphics.path;

import android.graphics.Path;
import android.os.Build;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Iterator<e>, qj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Path f52081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final EnumC0469a f52082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f52083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final c f52084d;

    /* JADX INFO: renamed from: androidx.graphics.path.a$a, reason: collision with other inner class name */
    public enum EnumC0469a {
        AsConic,
        AsQuadratics
    }

    public a(@NotNull Path path, @NotNull EnumC0469a conicEvaluation, float f10) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(conicEvaluation, "conicEvaluation");
        this.f52081a = path;
        this.f52082b = conicEvaluation;
        this.f52083c = f10;
        this.f52084d = Build.VERSION.SDK_INT >= 34 ? new b(path, conicEvaluation, f10) : new PathIteratorPreApi34Impl(path, conicEvaluation, f10);
    }

    public static /* synthetic */ int b(a aVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return aVar.q0(z10);
    }

    public static /* synthetic */ e.a h(a aVar, float[] fArr, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return aVar.f(fArr, i10);
    }

    public final float U() {
        return this.f52083c;
    }

    @NotNull
    public final EnumC0469a c() {
        return this.f52082b;
    }

    @NotNull
    public final Path d() {
        return this.f52081a;
    }

    @j
    @NotNull
    public final e.a e(@NotNull float[] points) {
        Intrinsics.checkNotNullParameter(points, "points");
        int i10 = 3 & 2;
        return h(this, points, 0, 2, null);
    }

    @j
    @NotNull
    public final e.a f(@NotNull float[] points, int i10) {
        Intrinsics.checkNotNullParameter(points, "points");
        return this.f52084d.g(points, i10);
    }

    @Override // java.util.Iterator
    @NotNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public e next() {
        return this.f52084d.h();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f52084d.f();
    }

    @NotNull
    public final e.a i() {
        return this.f52084d.j();
    }

    public final int q0(boolean z10) {
        return this.f52084d.a(z10);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ a(Path path, EnumC0469a enumC0469a, float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(path, (i10 & 2) != 0 ? EnumC0469a.AsQuadratics : enumC0469a, (i10 & 4) != 0 ? 0.25f : f10);
    }
}
