package t6;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.l;
import androidx.annotation.p0;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.circularreveal.d;
import com.google.android.material.circularreveal.g;

/* JADX INFO: loaded from: classes4.dex */
public class a extends MaterialCardView implements g {

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    @NonNull
    private final d f376191h3;

    public a(Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.circularreveal.g
    public void a() {
        this.f376191h3.b();
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
        this.f376191h3.a();
    }

    @Override // android.view.View, com.google.android.material.circularreveal.g
    public void draw(Canvas canvas) {
        d dVar = this.f376191h3;
        if (dVar != null) {
            dVar.c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    @Override // com.google.android.material.circularreveal.g
    @p0
    public Drawable getCircularRevealOverlayDrawable() {
        return this.f376191h3.g();
    }

    @Override // com.google.android.material.circularreveal.g
    public int getCircularRevealScrimColor() {
        return this.f376191h3.h();
    }

    @Override // com.google.android.material.circularreveal.g
    @p0
    public g.e getRevealInfo() {
        return this.f376191h3.j();
    }

    @Override // android.view.View, com.google.android.material.circularreveal.g
    public boolean isOpaque() {
        d dVar = this.f376191h3;
        return dVar != null ? dVar.l() : super.isOpaque();
    }

    @Override // com.google.android.material.circularreveal.g
    public void setCircularRevealOverlayDrawable(@p0 Drawable drawable) {
        this.f376191h3.m(drawable);
    }

    @Override // com.google.android.material.circularreveal.g
    public void setCircularRevealScrimColor(@l int i10) {
        this.f376191h3.n(i10);
    }

    @Override // com.google.android.material.circularreveal.g
    public void setRevealInfo(@p0 g.e eVar) {
        this.f376191h3.o(eVar);
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f376191h3 = new d(this);
    }
}
