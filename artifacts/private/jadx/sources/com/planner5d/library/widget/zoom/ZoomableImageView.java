package com.planner5d.library.widget.zoom;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.widget.zoom.ZoomableImageView;
import gf.b;
import gf.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@e.a({"AppCompatCustomView"})
public class ZoomableImageView extends ImageView implements a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f258893g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f258894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Rect f258895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Rect f258896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Rect f258897d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Bitmap f258898e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Bitmap f258899f;

    /* JADX WARN: Multi-variable type inference failed */
    @j
    public ZoomableImageView(@Nullable Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(ScaleGestureDetector scaleGestureDetector, ZoomableImageView zoomableImageView, d dVar, View view, MotionEvent motionEvent) {
        if (scaleGestureDetector.onTouchEvent(motionEvent) && zoomableImageView.b()) {
            return true;
        }
        Intrinsics.checkNotNull(view);
        Intrinsics.checkNotNull(motionEvent);
        return dVar.onTouch(view, motionEvent);
    }

    @Override // com.planner5d.library.widget.zoom.a
    @NotNull
    public Rect a() {
        return this.f258896c;
    }

    @Override // com.planner5d.library.widget.zoom.a
    public boolean b() {
        return this.f258894a;
    }

    @Override // com.planner5d.library.widget.zoom.a
    @NotNull
    public Rect c() {
        if (this.f258897d.isEmpty()) {
            getHitRect(this.f258897d);
        }
        return this.f258897d;
    }

    @Override // com.planner5d.library.widget.zoom.a
    @NotNull
    public Rect d() {
        return this.f258895b;
    }

    @Override // com.planner5d.library.widget.zoom.a
    public boolean e() {
        return a.C1750a.a(this);
    }

    @e.a({"ClickableViewAccessibility"})
    public final void g() {
        final ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(getContext(), new b(this));
        final d dVar = new d(this);
        setOnTouchListener(new View.OnTouchListener() { // from class: gf.c
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return ZoomableImageView.h(scaleGestureDetector, this, dVar, view, motionEvent);
            }
        });
    }

    @Override // com.planner5d.library.widget.zoom.a
    @NotNull
    public Bitmap getOriginalSource() {
        Bitmap bitmap = this.f258898e;
        if (bitmap != null) {
            return bitmap;
        }
        Intrinsics.throwUninitializedPropertyAccessException("bitmap");
        return null;
    }

    @Override // com.planner5d.library.widget.zoom.a
    public void setNewSource(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f258899f = bitmap;
        if (bitmap == null) {
            Intrinsics.throwUninitializedPropertyAccessException("latestUsedBitmap");
            bitmap = null;
        }
        setImageBitmap(bitmap);
        invalidate();
    }

    @Override // com.planner5d.library.widget.zoom.a
    public void setScalingInProgress(boolean z10) {
        this.f258894a = z10;
    }

    public final void setSourceBitmap(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f258898e = bitmap;
        this.f258895b.right = bitmap.getWidth();
        this.f258895b.bottom = bitmap.getHeight();
        this.f258899f = bitmap;
        this.f258896c.right = bitmap.getWidth();
        this.f258896c.bottom = bitmap.getHeight();
        Bitmap bitmap2 = this.f258899f;
        if (bitmap2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("latestUsedBitmap");
            bitmap2 = null;
        }
        setImageBitmap(bitmap2);
        getHitRect(this.f258897d);
    }

    public /* synthetic */ ZoomableImageView(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    @j
    public ZoomableImageView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f258895b = new Rect();
        this.f258896c = new Rect();
        this.f258897d = new Rect();
    }
}
