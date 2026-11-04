package com.google.firebase.inappmessaging.display.internal;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
@ij.f
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int f122321b = 1003;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.google.firebase.inappmessaging.display.internal.bindingwrappers.c f122322a;

    class a implements p.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.firebase.inappmessaging.display.internal.bindingwrappers.c f122323a;

        a(com.google.firebase.inappmessaging.display.internal.bindingwrappers.c cVar) {
            this.f122323a = cVar;
        }

        @Override // com.google.firebase.inappmessaging.display.internal.p.e
        public void a(View view, Object obj) {
            if (this.f122323a.d() != null) {
                this.f122323a.d().onClick(view);
            }
        }

        @Override // com.google.firebase.inappmessaging.display.internal.p.e
        public boolean b(Object obj) {
            return true;
        }
    }

    class b extends p {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ WindowManager.LayoutParams f122325o;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ WindowManager f122326s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ com.google.firebase.inappmessaging.display.internal.bindingwrappers.c f122327t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(View view, Object obj, p.e eVar, WindowManager.LayoutParams layoutParams, WindowManager windowManager, com.google.firebase.inappmessaging.display.internal.bindingwrappers.c cVar) {
            super(view, obj, eVar);
            this.f122325o = layoutParams;
            this.f122326s = windowManager;
            this.f122327t = cVar;
        }

        @Override // com.google.firebase.inappmessaging.display.internal.p
        protected float f() {
            return this.f122325o.x;
        }

        @Override // com.google.firebase.inappmessaging.display.internal.p
        protected void i(float f10) {
            this.f122325o.x = (int) f10;
            this.f122326s.updateViewLayout(this.f122327t.f(), this.f122325o);
        }
    }

    @ij.a
    g() {
    }

    private Point b(@NonNull Activity activity) {
        Point point = new Point();
        g(activity).getDefaultDisplay().getRealSize(point);
        return point;
    }

    private Rect c(@NonNull Activity activity) {
        Rect rect = new Rect();
        Rect rectF = f(activity);
        Point pointB = b(activity);
        rect.top = rectF.top;
        rect.left = rectF.left;
        rect.right = pointB.x - rectF.right;
        rect.bottom = pointB.y - rectF.bottom;
        return rect;
    }

    private WindowManager.LayoutParams d(@NonNull k kVar, @NonNull Activity activity) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(kVar.E().intValue(), kVar.D().intValue(), 1003, kVar.C().intValue(), -3);
        Rect rectC = c(activity);
        if ((kVar.B().intValue() & 48) == 48) {
            layoutParams.y = rectC.top;
        }
        layoutParams.dimAmount = 0.3f;
        layoutParams.gravity = kVar.B().intValue();
        layoutParams.windowAnimations = 0;
        return layoutParams;
    }

    private p e(k kVar, com.google.firebase.inappmessaging.display.internal.bindingwrappers.c cVar, WindowManager windowManager, WindowManager.LayoutParams layoutParams) {
        a aVar = new a(cVar);
        return kVar.E().intValue() == -1 ? new p(cVar.c(), null, aVar) : new b(cVar.c(), null, aVar, layoutParams, windowManager, cVar);
    }

    private Rect f(@NonNull Activity activity) {
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect;
    }

    private WindowManager g(@NonNull Activity activity) {
        return (WindowManager) activity.getSystemService("window");
    }

    public void a(@NonNull Activity activity) {
        if (h()) {
            g(activity).removeViewImmediate(this.f122322a.f());
            this.f122322a = null;
        }
    }

    public boolean h() {
        com.google.firebase.inappmessaging.display.internal.bindingwrappers.c cVar = this.f122322a;
        if (cVar == null) {
            return false;
        }
        return cVar.f().isShown();
    }

    public void i(@NonNull com.google.firebase.inappmessaging.display.internal.bindingwrappers.c cVar, @NonNull Activity activity) {
        if (h()) {
            l.e("Fiam already active. Cannot show new Fiam.");
            return;
        }
        if (activity.isFinishing() || activity.isDestroyed()) {
            l.e("Activity is finishing or does not have valid window token. Cannot show FIAM.");
            return;
        }
        k kVarB = cVar.b();
        WindowManager.LayoutParams layoutParamsD = d(kVarB, activity);
        WindowManager windowManagerG = g(activity);
        windowManagerG.addView(cVar.f(), layoutParamsD);
        Rect rectC = c(activity);
        l.d("Inset (top, bottom)", rectC.top, rectC.bottom);
        l.d("Inset (left, right)", rectC.left, rectC.right);
        if (cVar.a()) {
            cVar.c().setOnTouchListener(e(kVarB, cVar, windowManagerG, layoutParamsD));
        }
        this.f122322a = cVar;
    }
}
