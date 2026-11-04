package androidx.graphics.path;

import android.graphics.Path;
import android.graphics.PointF;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nPathIteratorImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathIteratorImpl.kt\nandroidx/graphics/path/PathIteratorImpl\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,304:1\n26#2:305\n*S KotlinDebug\n*F\n+ 1 PathIteratorImpl.kt\nandroidx/graphics/path/PathIteratorImpl\n*L\n104#1:305\n*E\n"})
public abstract class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final a f52090e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Path f52091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.graphics.path.a.EnumC0469a f52092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f52093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final float[] f52094d;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f52095a;

        static {
            int[] iArr = new int[e.a.values().length];
            try {
                boolean z10 = true & true;
                iArr[e.a.Move.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.a.Line.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.a.Quadratic.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e.a.Conic.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[e.a.Cubic.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f52095a = iArr;
        }
    }

    static {
        System.loadLibrary("androidx.graphics.path");
    }

    public c(@NotNull Path path, @NotNull androidx.graphics.path.a.EnumC0469a conicEvaluation, float f10) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(conicEvaluation, "conicEvaluation");
        this.f52091a = path;
        this.f52092b = conicEvaluation;
        this.f52093c = f10;
        this.f52094d = new float[8];
    }

    private final PointF[] b(float[] fArr, e.a aVar) {
        int i10 = b.f52095a[aVar.ordinal()];
        if (i10 == 1) {
            return new PointF[]{new PointF(fArr[0], fArr[1])};
        }
        if (i10 == 2) {
            return new PointF[]{new PointF(fArr[0], fArr[1]), new PointF(fArr[2], fArr[3])};
        }
        if (i10 == 3 || i10 == 4) {
            return new PointF[]{new PointF(fArr[0], fArr[1]), new PointF(fArr[2], fArr[3]), new PointF(fArr[4], fArr[5])};
        }
        return i10 != 5 ? new PointF[0] : new PointF[]{new PointF(fArr[0], fArr[1]), new PointF(fArr[2], fArr[3]), new PointF(fArr[4], fArr[5]), new PointF(fArr[6], fArr[7])};
    }

    public static /* synthetic */ e.a i(c cVar, float[] fArr, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: next");
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return cVar.g(fArr, i10);
    }

    public abstract int a(boolean z10);

    @NotNull
    public final androidx.graphics.path.a.EnumC0469a c() {
        return this.f52092b;
    }

    @NotNull
    public final Path d() {
        return this.f52091a;
    }

    public final float e() {
        return this.f52093c;
    }

    public abstract boolean f();

    @NotNull
    public abstract e.a g(@NotNull float[] fArr, int i10);

    @NotNull
    public final e h() {
        e.a aVarG = g(this.f52094d, 0);
        if (aVarG == e.a.Done) {
            return f.b();
        }
        if (aVarG == e.a.Close) {
            return f.a();
        }
        return new e(aVarG, b(this.f52094d, aVarG), aVarG == e.a.Conic ? this.f52094d[6] : 0.0f);
    }

    @NotNull
    public abstract e.a j();

    public /* synthetic */ c(Path path, androidx.graphics.path.a.EnumC0469a enumC0469a, float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(path, (i10 & 2) != 0 ? androidx.graphics.path.a.EnumC0469a.AsQuadratics : enumC0469a, (i10 & 4) != 0 ? 0.25f : f10);
    }
}
