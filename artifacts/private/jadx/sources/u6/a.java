package u6;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.l;
import androidx.annotation.p0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.circularreveal.d;
import com.google.android.material.circularreveal.g;

/* JADX INFO: loaded from: classes4.dex */
public class a extends CoordinatorLayout implements g {

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @NonNull
    private final d f381192o3;

    public a(@NonNull Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.circularreveal.g
    public void a() {
        this.f381192o3.b();
    }

    @Override // com.google.android.material.circularreveal.d.a
    public void b(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // com.google.android.material.circularreveal.d.a
    public boolean c() {
        return super.isOpaque();
    }

    @Override // com.google.android.material.circularreveal.g
    public void d() {
        this.f381192o3.a();
    }

    @Override // android.view.View, com.google.android.material.circularreveal.g
    public void draw(Canvas canvas) {
        d dVar = this.f381192o3;
        if (dVar != null) {
            dVar.c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    @Override // com.google.android.material.circularreveal.g
    @p0
    public Drawable getCircularRevealOverlayDrawable() {
        return this.f381192o3.g();
    }

    @Override // com.google.android.material.circularreveal.g
    public int getCircularRevealScrimColor() {
        return this.f381192o3.h();
    }

    @Override // com.google.android.material.circularreveal.g
    @p0
    public g.e getRevealInfo() {
        return this.f381192o3.j();
    }

    @Override // android.view.View, com.google.android.material.circularreveal.g
    public boolean isOpaque() {
        d dVar = this.f381192o3;
        return dVar != null ? dVar.l() : super.isOpaque();
    }

    @Override // com.google.android.material.circularreveal.g
    public void setCircularRevealOverlayDrawable(@p0 Drawable drawable) {
        this.f381192o3.m(drawable);
    }

    @Override // com.google.android.material.circularreveal.g
    public void setCircularRevealScrimColor(@l int i10) {
        this.f381192o3.n(i10);
    }

    @Override // com.google.android.material.circularreveal.g
    public void setRevealInfo(@p0 g.e eVar) {
        this.f381192o3.o(eVar);
    }

    public a(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f381192o3 = new d(this);
    }
}
