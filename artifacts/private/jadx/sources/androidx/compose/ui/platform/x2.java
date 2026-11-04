package androidx.compose.ui.platform;

import android.graphics.Matrix;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nLayerMatrixCache.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayerMatrixCache.android.kt\nandroidx/compose/ui/platform/LayerMatrixCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
public final class x2<T> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f40955i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function2<T, Matrix, Unit> f40956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private Matrix f40957b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f40960e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f40961f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private float[] f40958c = androidx.compose.ui.graphics.c2.c(null, 1, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private float[] f40959d = androidx.compose.ui.graphics.c2.c(null, 1, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f40962g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f40963h = true;

    /* JADX WARN: Multi-variable type inference failed */
    public x2(@NotNull Function2<? super T, ? super Matrix, Unit> function2) {
        this.f40956a = function2;
    }

    @Nullable
    public final float[] a(T t10) {
        float[] fArr = this.f40959d;
        if (this.f40961f) {
            this.f40962g = v2.a(b(t10), fArr);
            this.f40961f = false;
        }
        if (this.f40962g) {
            return fArr;
        }
        return null;
    }

    @NotNull
    public final float[] b(T t10) {
        float[] fArr = this.f40958c;
        if (!this.f40960e) {
            return fArr;
        }
        Matrix matrix = this.f40957b;
        if (matrix == null) {
            matrix = new Matrix();
            this.f40957b = matrix;
        }
        this.f40956a.invoke(t10, matrix);
        androidx.compose.ui.graphics.k.b(fArr, matrix);
        this.f40960e = false;
        this.f40963h = androidx.compose.ui.graphics.d2.b(fArr);
        return fArr;
    }

    public final void c() {
        this.f40960e = true;
        this.f40961f = true;
    }

    public final void d(T t10, @NotNull n0.e eVar) {
        float[] fArrB = b(t10);
        if (this.f40963h) {
            return;
        }
        androidx.compose.ui.graphics.c2.l(fArrB, eVar);
    }

    public final long e(T t10, long j10) {
        return !this.f40963h ? androidx.compose.ui.graphics.c2.j(b(t10), j10) : j10;
    }

    public final void f(T t10, @NotNull n0.e eVar) {
        float[] fArrA = a(t10);
        if (fArrA == null) {
            eVar.B(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            if (this.f40963h) {
                return;
            }
            androidx.compose.ui.graphics.c2.l(fArrA, eVar);
        }
    }

    public final long g(T t10, long j10) {
        float[] fArrA = a(t10);
        if (fArrA == null) {
            return n0.g.f332700b.a();
        }
        return !this.f40963h ? androidx.compose.ui.graphics.c2.j(fArrA, j10) : j10;
    }

    public final void h() {
        this.f40960e = false;
        this.f40961f = false;
        this.f40963h = true;
        this.f40962g = true;
        androidx.compose.ui.graphics.c2.m(this.f40958c);
        androidx.compose.ui.graphics.c2.m(this.f40959d);
    }
}
