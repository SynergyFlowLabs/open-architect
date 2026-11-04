package androidx.graphics.path;

import android.graphics.Path;
import android.graphics.PathIterator;
import androidx.annotation.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@w0(34)
public final class b extends c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final PathIterator f52088f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final ConicConverter f52089g;

    public /* synthetic */ b(Path path, a.EnumC0469a enumC0469a, float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(path, (i10 & 2) != 0 ? a.EnumC0469a.AsQuadratics : enumC0469a, (i10 & 4) != 0 ? 0.25f : f10);
    }

    @Override // androidx.graphics.path.c
    public int a(boolean z10) {
        boolean z11 = z10 && c() == a.EnumC0469a.AsQuadratics;
        PathIterator pathIterator = d().getPathIterator();
        Intrinsics.checkNotNullExpressionValue(pathIterator, "path.pathIterator");
        float[] fArr = new float[8];
        int iD = 0;
        while (pathIterator.hasNext()) {
            if (pathIterator.next(fArr, 0) == 3 && z11) {
                ConicConverter conicConverter = this.f52089g;
                ConicConverter.b(conicConverter, fArr, fArr[6], e(), 0, 8, null);
                iD += conicConverter.d();
            } else {
                iD++;
            }
        }
        return iD;
    }

    @Override // androidx.graphics.path.c
    public boolean f() {
        return this.f52088f.hasNext();
    }

    @Override // androidx.graphics.path.c
    @NotNull
    public e.a g(@NotNull float[] points, int i10) {
        Intrinsics.checkNotNullParameter(points, "points");
        if (this.f52089g.c() < this.f52089g.d()) {
            this.f52089g.e(points, i10);
            return e.a.Quadratic;
        }
        e.a aVarC = d.c(this.f52088f.next(points, i10));
        if (aVarC != e.a.Conic || c() != a.EnumC0469a.AsQuadratics) {
            return aVarC;
        }
        ConicConverter conicConverter = this.f52089g;
        conicConverter.a(points, points[i10 + 6], e(), i10);
        if (conicConverter.d() > 0) {
            conicConverter.e(points, i10);
        }
        return e.a.Quadratic;
    }

    @Override // androidx.graphics.path.c
    @NotNull
    public e.a j() {
        return d.c(this.f52088f.peek());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull Path path, @NotNull a.EnumC0469a conicEvaluation, float f10) {
        super(path, conicEvaluation, f10);
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(conicEvaluation, "conicEvaluation");
        PathIterator pathIterator = path.getPathIterator();
        Intrinsics.checkNotNullExpressionValue(pathIterator, "path.pathIterator");
        this.f52088f = pathIterator;
        this.f52089g = new ConicConverter();
    }
}
