package gc;

import com.planner5d.library.math.k;
import com.planner5d.library.math.m;
import kotlin.jvm.internal.Intrinsics;
import oj.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f275435b = 100.0f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d f275434a = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final m f275436c = new m(0.0f, 0.0f, 0.0f, 7, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final m f275437d = new m(0.0f, 0.0f, 0.0f, 7, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final m f275438e = new m(0.0f, 0.0f, 0.0f, 7, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final m f275439f = new m(0.0f, 0.0f, 0.0f, 7, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final Object f275440g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final com.planner5d.library.engine.util.math.g f275441h = new com.planner5d.library.engine.util.math.g(new m(0.0f, 1.0f, 0.0f), 0.0f);

    static {
        boolean z10 = true;
    }

    private d() {
    }

    @n
    @NotNull
    public static final com.planner5d.library.engine.util.math.b a(@NotNull int[] bounds3D, @NotNull com.planner5d.library.engine.util.math.b boundingBox) {
        Intrinsics.checkNotNullParameter(bounds3D, "bounds3D");
        Intrinsics.checkNotNullParameter(boundingBox, "boundingBox");
        synchronized (f275440g) {
            try {
                m mVar = f275436c;
                f(mVar.y0(bounds3D[0], bounds3D[1], bounds3D[2])).v0(0.5f);
                m mVar2 = f275439f;
                f(mVar2.y0(bounds3D[3], bounds3D[4], bounds3D[5]));
                boundingBox.H(f275437d.y0(mVar2.f180482a - mVar.f180482a, mVar2.f180484c - mVar.f180484c, (-mVar2.f180483b) - mVar.f180483b), f275438e.y0(mVar2.f180482a + mVar.f180482a, mVar2.f180484c + mVar.f180484c, (-mVar2.f180483b) + mVar.f180483b));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return boundingBox;
    }

    @n
    public static final float b(float f10) {
        return f10 * f275435b;
    }

    @n
    @NotNull
    public static final m c(@NotNull m vector) {
        Intrinsics.checkNotNullParameter(vector, "vector");
        return vector.v0(f275435b);
    }

    @n
    public static final float d(float f10) {
        return f10 / f275435b;
    }

    @n
    @NotNull
    public static final k e(@NotNull k vector) {
        Intrinsics.checkNotNullParameter(vector, "vector");
        return vector.R(0.01f);
    }

    @n
    @NotNull
    public static final m f(@NotNull m vector) {
        Intrinsics.checkNotNullParameter(vector, "vector");
        return vector.v0(0.01f);
    }
}
