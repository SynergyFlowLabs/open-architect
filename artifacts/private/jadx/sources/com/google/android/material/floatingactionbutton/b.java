package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Property;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.core.util.t;
import com.google.android.material.animation.i;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
abstract class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f112614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final ExtendedFloatingActionButton f112615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList<Animator.AnimatorListener> f112616c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.material.floatingactionbutton.a f112617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private i f112618e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private i f112619f;

    class a extends Property<ExtendedFloatingActionButton, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(ExtendedFloatingActionButton extendedFloatingActionButton) {
            return Float.valueOf(com.google.android.material.animation.b.a(0.0f, 1.0f, (Color.alpha(extendedFloatingActionButton.getCurrentTextColor()) / 255.0f) / Color.alpha(extendedFloatingActionButton.f112554x3.getColorForState(extendedFloatingActionButton.getDrawableState(), b.this.f112615b.f112554x3.getDefaultColor()))));
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(ExtendedFloatingActionButton extendedFloatingActionButton, Float f10) {
            int colorForState = extendedFloatingActionButton.f112554x3.getColorForState(extendedFloatingActionButton.getDrawableState(), b.this.f112615b.f112554x3.getDefaultColor());
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(Color.argb((int) (com.google.android.material.animation.b.a(0.0f, Color.alpha(colorForState) / 255.0f, f10.floatValue()) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
            if (f10.floatValue() == 1.0f) {
                extendedFloatingActionButton.X(extendedFloatingActionButton.f112554x3);
            } else {
                extendedFloatingActionButton.X(colorStateListValueOf);
            }
        }
    }

    b(@NonNull ExtendedFloatingActionButton extendedFloatingActionButton, com.google.android.material.floatingactionbutton.a aVar) {
        this.f112615b = extendedFloatingActionButton;
        this.f112614a = extendedFloatingActionButton.getContext();
        this.f112617d = aVar;
    }

    @Override // com.google.android.material.floatingactionbutton.f
    @androidx.annotation.i
    public void a() {
        this.f112617d.b();
    }

    @Override // com.google.android.material.floatingactionbutton.f
    @androidx.annotation.i
    public void b() {
        this.f112617d.b();
    }

    @Override // com.google.android.material.floatingactionbutton.f
    public final i c() {
        i iVar = this.f112619f;
        if (iVar != null) {
            return iVar;
        }
        if (this.f112618e == null) {
            this.f112618e = i.d(this.f112614a, h());
        }
        return (i) t.l(this.f112618e);
    }

    @Override // com.google.android.material.floatingactionbutton.f
    @NonNull
    public final List<Animator.AnimatorListener> d() {
        return this.f112616c;
    }

    @Override // com.google.android.material.floatingactionbutton.f
    @p0
    public i e() {
        return this.f112619f;
    }

    @Override // com.google.android.material.floatingactionbutton.f
    public final void g(@NonNull Animator.AnimatorListener animatorListener) {
        this.f112616c.remove(animatorListener);
    }

    @Override // com.google.android.material.floatingactionbutton.f
    public AnimatorSet i() {
        return o(c());
    }

    @Override // com.google.android.material.floatingactionbutton.f
    public final void l(@NonNull Animator.AnimatorListener animatorListener) {
        this.f112616c.add(animatorListener);
    }

    @Override // com.google.android.material.floatingactionbutton.f
    public final void m(@p0 i iVar) {
        this.f112619f = iVar;
    }

    @NonNull
    AnimatorSet o(@NonNull i iVar) {
        ArrayList arrayList = new ArrayList();
        if (iVar.j("opacity")) {
            arrayList.add(iVar.f("opacity", this.f112615b, View.ALPHA));
        }
        if (iVar.j("scale")) {
            arrayList.add(iVar.f("scale", this.f112615b, View.SCALE_Y));
            arrayList.add(iVar.f("scale", this.f112615b, View.SCALE_X));
        }
        if (iVar.j("width")) {
            arrayList.add(iVar.f("width", this.f112615b, ExtendedFloatingActionButton.M3));
        }
        if (iVar.j("height")) {
            arrayList.add(iVar.f("height", this.f112615b, ExtendedFloatingActionButton.N3));
        }
        if (iVar.j("paddingStart")) {
            arrayList.add(iVar.f("paddingStart", this.f112615b, ExtendedFloatingActionButton.O3));
        }
        if (iVar.j("paddingEnd")) {
            arrayList.add(iVar.f("paddingEnd", this.f112615b, ExtendedFloatingActionButton.P3));
        }
        if (iVar.j("labelOpacity")) {
            arrayList.add(iVar.f("labelOpacity", this.f112615b, new a(Float.class, "LABEL_OPACITY_PROPERTY")));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        com.google.android.material.animation.c.a(animatorSet, arrayList);
        return animatorSet;
    }

    @Override // com.google.android.material.floatingactionbutton.f
    @androidx.annotation.i
    public void onAnimationStart(Animator animator) {
        this.f112617d.c(animator);
    }
}
