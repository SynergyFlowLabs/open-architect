package androidx.legacy.app;

import android.R;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.f1;
import androidx.annotation.p0;
import androidx.annotation.v;
import androidx.core.view.d0;
import androidx.core.view.u1;
import androidx.drawerlayout.widget.DrawerLayout;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class a implements DrawerLayout.e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f52115m = "ActionBarDrawerToggle";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int[] f52116n = {R.attr.homeAsUpIndicator};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final float f52117o = 0.33333334f;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f52118p = 16908332;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Activity f52119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0470a f52120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final DrawerLayout f52121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f52122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f52123e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Drawable f52124f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Drawable f52125g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private d f52126h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f52127i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f52128j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f52129k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private c f52130l;

    /* JADX INFO: renamed from: androidx.legacy.app.a$a, reason: collision with other inner class name */
    @Deprecated
    public interface InterfaceC0470a {
        @p0
        Drawable a();

        void b(Drawable drawable, @f1 int i10);

        void c(@f1 int i10);
    }

    @Deprecated
    public interface b {
        @p0
        InterfaceC0470a getDrawerToggleDelegate();
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Method f52131a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Method f52132b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ImageView f52133c;

        c(Activity activity) {
            try {
                this.f52131a = ActionBar.class.getDeclaredMethod("setHomeAsUpIndicator", Drawable.class);
                this.f52132b = ActionBar.class.getDeclaredMethod("setHomeActionContentDescription", Integer.TYPE);
            } catch (NoSuchMethodException unused) {
                View viewFindViewById = activity.findViewById(16908332);
                if (viewFindViewById == null) {
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) viewFindViewById.getParent();
                if (viewGroup.getChildCount() != 2) {
                    return;
                }
                View childAt = viewGroup.getChildAt(0);
                childAt = childAt.getId() == 16908332 ? viewGroup.getChildAt(1) : childAt;
                if (childAt instanceof ImageView) {
                    this.f52133c = (ImageView) childAt;
                }
            }
        }
    }

    private class d extends InsetDrawable implements Drawable.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f52134a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Rect f52135b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f52136c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f52137d;

        d(Drawable drawable) {
            super(drawable, 0);
            this.f52134a = true;
            this.f52135b = new Rect();
        }

        public float a() {
            return this.f52136c;
        }

        public void b(float f10) {
            this.f52137d = f10;
            invalidateSelf();
        }

        public void c(float f10) {
            this.f52136c = f10;
            invalidateSelf();
        }

        @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public void draw(@NonNull Canvas canvas) {
            copyBounds(this.f52135b);
            canvas.save();
            boolean z10 = u1.c0(a.this.f52119a.getWindow().getDecorView()) == 1;
            int i10 = z10 ? -1 : 1;
            float fWidth = this.f52135b.width();
            canvas.translate((-this.f52137d) * fWidth * this.f52136c * i10, 0.0f);
            if (z10 && !this.f52134a) {
                canvas.translate(fWidth, 0.0f);
                canvas.scale(-1.0f, 1.0f);
            }
            super.draw(canvas);
            canvas.restore();
        }
    }

    public a(Activity activity, DrawerLayout drawerLayout, @v int i10, @f1 int i11, @f1 int i12) {
        this(activity, drawerLayout, !e(activity), i10, i11, i12);
    }

    private static boolean e(Context context) {
        return context.getApplicationInfo().targetSdkVersion >= 21;
    }

    private Drawable f() {
        InterfaceC0470a interfaceC0470a = this.f52120b;
        if (interfaceC0470a != null) {
            return interfaceC0470a.a();
        }
        ActionBar actionBar = this.f52119a.getActionBar();
        TypedArray typedArrayObtainStyledAttributes = (actionBar != null ? actionBar.getThemedContext() : this.f52119a).obtainStyledAttributes(null, f52116n, R.attr.actionBarStyle, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        return drawable;
    }

    private void j(int i10) {
        InterfaceC0470a interfaceC0470a = this.f52120b;
        if (interfaceC0470a != null) {
            interfaceC0470a.c(i10);
            return;
        }
        ActionBar actionBar = this.f52119a.getActionBar();
        if (actionBar != null) {
            actionBar.setHomeActionContentDescription(i10);
        }
    }

    private void k(Drawable drawable, int i10) {
        InterfaceC0470a interfaceC0470a = this.f52120b;
        if (interfaceC0470a != null) {
            interfaceC0470a.b(drawable, i10);
            return;
        }
        ActionBar actionBar = this.f52119a.getActionBar();
        if (actionBar != null) {
            actionBar.setHomeAsUpIndicator(drawable);
            actionBar.setHomeActionContentDescription(i10);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.e
    public void a(View view) {
        this.f52126h.c(1.0f);
        if (this.f52122d) {
            j(this.f52129k);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.e
    public void b(View view) {
        this.f52126h.c(0.0f);
        if (this.f52122d) {
            j(this.f52128j);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.e
    public void c(int i10) {
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.e
    public void d(View view, float f10) {
        float fA = this.f52126h.a();
        this.f52126h.c(f10 > 0.5f ? Math.max(fA, Math.max(0.0f, f10 - 0.5f) * 2.0f) : Math.min(fA, f10 * 2.0f));
    }

    public boolean g() {
        return this.f52122d;
    }

    public void h(Configuration configuration) {
        if (!this.f52123e) {
            this.f52124f = f();
        }
        this.f52125g = androidx.core.content.d.l(this.f52119a, this.f52127i);
        o();
    }

    public boolean i(MenuItem menuItem) {
        if (menuItem == null || menuItem.getItemId() != 16908332 || !this.f52122d) {
            return false;
        }
        if (this.f52121c.F(d0.f48643b)) {
            this.f52121c.d(d0.f48643b);
        } else {
            this.f52121c.K(d0.f48643b);
        }
        return true;
    }

    public void l(boolean z10) {
        if (z10 != this.f52122d) {
            if (z10) {
                k(this.f52126h, this.f52121c.C(d0.f48643b) ? this.f52129k : this.f52128j);
            } else {
                k(this.f52124f, 0);
            }
            this.f52122d = z10;
        }
    }

    public void m(int i10) {
        n(i10 != 0 ? androidx.core.content.d.l(this.f52119a, i10) : null);
    }

    public void n(Drawable drawable) {
        if (drawable == null) {
            this.f52124f = f();
            this.f52123e = false;
        } else {
            this.f52124f = drawable;
            this.f52123e = true;
        }
        if (!this.f52122d) {
            k(this.f52124f, 0);
        }
    }

    public void o() {
        if (this.f52121c.C(d0.f48643b)) {
            this.f52126h.c(1.0f);
        } else {
            this.f52126h.c(0.0f);
        }
        if (this.f52122d) {
            k(this.f52126h, this.f52121c.C(d0.f48643b) ? this.f52129k : this.f52128j);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(Activity activity, DrawerLayout drawerLayout, boolean z10, @v int i10, @f1 int i11, @f1 int i12) {
        this.f52122d = true;
        this.f52119a = activity;
        if (activity instanceof b) {
            this.f52120b = ((b) activity).getDrawerToggleDelegate();
        } else {
            this.f52120b = null;
        }
        this.f52121c = drawerLayout;
        this.f52127i = i10;
        this.f52128j = i11;
        this.f52129k = i12;
        this.f52124f = f();
        this.f52125g = androidx.core.content.d.l(activity, i10);
        d dVar = new d(this.f52125g);
        this.f52126h = dVar;
        dVar.b(z10 ? f52117o : 0.0f);
    }
}
