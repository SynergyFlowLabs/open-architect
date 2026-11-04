package gf;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.math.j;
import com.planner5d.library.math.k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
public final class d implements View.OnTouchListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f280055d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.widget.zoom.a f280056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final k f280057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f280058c;

    public d(@NotNull com.planner5d.library.widget.zoom.a image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f280056a = image;
        this.f280057b = new k();
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0110  */
    /* JADX WARN: Code duplicated, block: B:39:0x0114  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(@NotNull View v10, @NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(v10, "v");
        Intrinsics.checkNotNullParameter(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            this.f280057b.U(event.getRawX(), event.getRawY());
            this.f280058c = true;
        } else if (actionMasked == 1) {
            this.f280058c = false;
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                this.f280058c = false;
            } else if (actionMasked == 5) {
                this.f280057b.U(event.getRawX(), event.getRawY());
                this.f280058c = true;
            }
        } else if (this.f280058c && this.f280056a.e()) {
            Rect rectA = this.f280056a.a();
            double rawX = event.getRawX() - this.f280057b.f180480a;
            double rawY = event.getRawY() - this.f280057b.f180481b;
            double dWidth = (rawX * ((double) rectA.width())) / ((double) this.f280056a.c().width());
            double dHeight = (rawY * ((double) rectA.height())) / ((double) this.f280056a.c().height());
            this.f280057b.U(event.getRawX(), event.getRawY());
            if (dWidth < 0.0d && dWidth > -1.0d) {
                dWidth = -1.0d;
            }
            if (dWidth > 0.0d && dWidth < 1.0d) {
                dWidth = 1.0d;
            }
            if (dHeight < 0.0d && dHeight > -1.0d) {
                dHeight = -1.0d;
            }
            rectA.offsetTo((int) j.a(((double) rectA.left) - dWidth, 0.0d, this.f280056a.d().width() - rectA.width()), (int) j.a(((double) rectA.top) - ((dHeight <= 0.0d || dHeight >= 1.0d) ? dHeight : 1.0d), 0.0d, this.f280056a.d().height() - rectA.height()));
            com.planner5d.library.widget.zoom.a aVar = this.f280056a;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(aVar.getOriginalSource(), rectA.left, rectA.top, rectA.width(), rectA.height());
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
            aVar.setNewSource(bitmapCreateBitmap);
        }
        return true;
    }
}
