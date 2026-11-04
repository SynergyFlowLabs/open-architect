package gf;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.ScaleGestureDetector;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.math.j;
import com.planner5d.library.math.k;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
public final class b implements ScaleGestureDetector.OnScaleGestureListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f280048d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.widget.zoom.a f280049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final k f280050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final f0 f280051c;

    public b(@NotNull com.planner5d.library.widget.zoom.a image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f280049a = image;
        this.f280050b = new k();
        this.f280051c = g0.c(new Function0() { // from class: gf.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Double.valueOf(b.c(this.f280047a));
            }
        });
    }

    private final double b() {
        return ((Number) this.f280051c.getValue()).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double c(b bVar) {
        return ((double) bVar.f280049a.c().width()) / ((double) bVar.f280049a.c().height());
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(@NotNull ScaleGestureDetector detector) {
        int iB;
        int iA;
        Intrinsics.checkNotNullParameter(detector, "detector");
        float scaleFactor = detector.getScaleFactor();
        if (scaleFactor == 1.0f || (scaleFactor < 1.0f && Intrinsics.areEqual(this.f280049a.a(), this.f280049a.d()))) {
            return true;
        }
        Rect rectA = this.f280049a.a();
        if (((double) rectA.width()) / ((double) rectA.height()) == b()) {
            iB = (int) j.b(rectA.width() / scaleFactor, 1.0f, this.f280049a.d().width());
            iA = (int) j.b(rectA.height() / scaleFactor, 1.0f, this.f280049a.d().height());
        } else if (rectA.width() > rectA.height()) {
            iA = (int) j.b(rectA.height() / scaleFactor, 1.0f, this.f280049a.d().height());
            iB = (int) j.a(((double) iA) * b(), 1.0d, this.f280049a.d().width());
        } else {
            iB = (int) j.b(rectA.width() / scaleFactor, 1.0f, this.f280049a.d().width());
            iA = (int) j.a(((double) iB) / b(), 1.0d, this.f280049a.d().height());
        }
        if (scaleFactor < 1.0f && iB == rectA.width() && iB < this.f280049a.d().width()) {
            iB++;
            iA++;
        }
        rectA.left = (int) j.a(((double) this.f280050b.f180480a) - (((double) iB) / 2.0d), 0.0d, this.f280049a.d().width() - iB);
        int iA2 = (int) j.a(((double) this.f280050b.f180481b) - (((double) iA) / 2.0d), 0.0d, this.f280049a.d().height() - iA);
        rectA.top = iA2;
        rectA.right = rectA.left + iB;
        rectA.bottom = iA2 + iA;
        com.planner5d.library.widget.zoom.a aVar = this.f280049a;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(aVar.getOriginalSource(), rectA.left, rectA.top, iB, iA);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        aVar.setNewSource(bitmapCreateBitmap);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(@NotNull ScaleGestureDetector detector) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        this.f280049a.setScalingInProgress(true);
        if (this.f280049a.e()) {
            this.f280050b.U(((detector.getFocusX() * this.f280049a.a().width()) / this.f280049a.c().width()) + this.f280049a.a().left, ((detector.getFocusY() * this.f280049a.a().height()) / this.f280049a.c().height()) + this.f280049a.a().top);
        } else {
            this.f280050b.U((detector.getFocusX() * this.f280049a.d().width()) / this.f280049a.c().width(), (detector.getFocusY() * this.f280049a.d().height()) / this.f280049a.c().height());
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(@NotNull ScaleGestureDetector detector) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        this.f280049a.setScalingInProgress(false);
    }
}
