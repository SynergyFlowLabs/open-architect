package com.readystatesoftware.systembartint;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.media3.common.j;
import com.facebook.appevents.p;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes13.dex */
public class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f266146h = -1728053248;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static String f266147i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1844b f266148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f266149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f266150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f266151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f266152e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private View f266153f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private View f266154g;

    /* JADX INFO: renamed from: com.readystatesoftware.systembartint.b$b, reason: collision with other inner class name */
    public static class C1844b {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f266155j = "status_bar_height";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f266156k = "navigation_bar_height";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f266157l = "navigation_bar_height_landscape";

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f266158m = "navigation_bar_width";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String f266159n = "config_showNavigationBar";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f266160a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f266161b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f266162c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f266163d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f266164e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f266165f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f266166g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f266167h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final float f266168i;

        @e.b(14)
        private int b(Context context) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
            return context.getResources().getDimensionPixelSize(typedValue.resourceId);
        }

        private int c(Resources resources, String str) {
            int identifier = resources.getIdentifier(str, "dimen", "android");
            if (identifier > 0) {
                return resources.getDimensionPixelSize(identifier);
            }
            return 0;
        }

        @e.b(14)
        private int e(Context context) {
            Resources resources = context.getResources();
            if (m(context)) {
                return c(resources, this.f266167h ? f266156k : f266157l);
            }
            return 0;
        }

        @e.b(14)
        private int g(Context context) {
            Resources resources = context.getResources();
            if (m(context)) {
                return c(resources, f266158m);
            }
            return 0;
        }

        @e.a({"NewApi"})
        private float k(Activity activity) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            activity.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
            float f10 = displayMetrics.widthPixels;
            float f11 = displayMetrics.density;
            return Math.min(f10 / f11, displayMetrics.heightPixels / f11);
        }

        @e.b(14)
        private boolean m(Context context) {
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier(f266159n, "bool", "android");
            if (identifier == 0) {
                return !ViewConfiguration.get(context).hasPermanentMenuKey();
            }
            boolean z10 = resources.getBoolean(identifier);
            if ("1".equals(b.f266147i)) {
                return false;
            }
            if (p.f99189d0.equals(b.f266147i)) {
                return true;
            }
            return z10;
        }

        public int a() {
            return this.f266163d;
        }

        public int d() {
            return this.f266165f;
        }

        public int f() {
            return this.f266166g;
        }

        public int h() {
            if (this.f266161b && o()) {
                return this.f266165f;
            }
            return 0;
        }

        public int i() {
            if (!this.f266161b || o()) {
                return 0;
            }
            return this.f266166g;
        }

        public int j(boolean z10) {
            return (this.f266160a ? this.f266162c : 0) + (z10 ? this.f266163d : 0);
        }

        public int l() {
            return this.f266162c;
        }

        public boolean n() {
            return this.f266164e;
        }

        public boolean o() {
            if (this.f266168i < 600.0f && !this.f266167h) {
                return false;
            }
            return true;
        }

        private C1844b(Activity activity, boolean z10, boolean z11) {
            Resources resources = activity.getResources();
            this.f266167h = resources.getConfiguration().orientation == 1;
            this.f266168i = k(activity);
            this.f266162c = c(resources, f266155j);
            this.f266163d = b(activity);
            int iE = e(activity);
            this.f266165f = iE;
            this.f266166g = g(activity);
            this.f266164e = iE > 0;
            this.f266160a = z10;
            this.f266161b = z11;
        }
    }

    static {
        try {
            Method declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class);
            declaredMethod.setAccessible(true);
            f266147i = (String) declaredMethod.invoke(null, "qemu.hw.mainkeys");
        } catch (Throwable unused) {
            f266147i = null;
        }
    }

    @e.b(19)
    public b(Activity activity) {
        Window window = activity.getWindow();
        ViewGroup viewGroup = (ViewGroup) window.getDecorView();
        TypedArray typedArrayObtainStyledAttributes = activity.obtainStyledAttributes(new int[]{R.attr.windowTranslucentStatus, R.attr.windowTranslucentNavigation});
        try {
            this.f266149b = typedArrayObtainStyledAttributes.getBoolean(0, false);
            this.f266150c = typedArrayObtainStyledAttributes.getBoolean(1, false);
            typedArrayObtainStyledAttributes.recycle();
            int i10 = window.getAttributes().flags;
            if ((67108864 & i10) != 0) {
                this.f266149b = true;
            }
            if ((i10 & j.W0) != 0) {
                this.f266150c = true;
            }
            C1844b c1844b = new C1844b(activity, this.f266149b, this.f266150c);
            this.f266148a = c1844b;
            if (!c1844b.n()) {
                this.f266150c = false;
            }
            if (this.f266149b) {
                t(activity, viewGroup);
            }
            if (this.f266150c) {
                s(activity, viewGroup);
            }
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    private void s(Context context, ViewGroup viewGroup) {
        FrameLayout.LayoutParams layoutParams;
        this.f266154g = new View(context);
        if (this.f266148a.o()) {
            layoutParams = new FrameLayout.LayoutParams(-1, this.f266148a.d());
            layoutParams.gravity = 80;
        } else {
            layoutParams = new FrameLayout.LayoutParams(this.f266148a.f(), -1);
            layoutParams.gravity = 5;
        }
        this.f266154g.setLayoutParams(layoutParams);
        this.f266154g.setBackgroundColor(f266146h);
        this.f266154g.setVisibility(8);
        viewGroup.addView(this.f266154g);
    }

    private void t(Context context, ViewGroup viewGroup) {
        this.f266153f = new View(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.f266148a.l());
        layoutParams.gravity = 48;
        if (this.f266150c && !this.f266148a.o()) {
            layoutParams.rightMargin = this.f266148a.f();
        }
        this.f266153f.setLayoutParams(layoutParams);
        this.f266153f.setBackgroundColor(f266146h);
        this.f266153f.setVisibility(8);
        viewGroup.addView(this.f266153f);
    }

    public C1844b b() {
        return this.f266148a;
    }

    public boolean c() {
        return this.f266152e;
    }

    public boolean d() {
        return this.f266151d;
    }

    @e.b(11)
    public void e(float f10) {
        if (this.f266150c) {
            this.f266154g.setAlpha(f10);
        }
    }

    public void f(int i10) {
        if (this.f266150c) {
            this.f266154g.setBackgroundColor(i10);
        }
    }

    public void g(Drawable drawable) {
        if (this.f266150c) {
            this.f266154g.setBackgroundDrawable(drawable);
        }
    }

    public void h(boolean z10) {
        this.f266152e = z10;
        if (this.f266150c) {
            this.f266154g.setVisibility(z10 ? 0 : 8);
        }
    }

    public void i(int i10) {
        if (this.f266150c) {
            this.f266154g.setBackgroundResource(i10);
        }
    }

    @e.b(11)
    public void j(float f10) {
        if (this.f266149b) {
            this.f266153f.setAlpha(f10);
        }
    }

    public void k(int i10) {
        if (this.f266149b) {
            this.f266153f.setBackgroundColor(i10);
        }
    }

    public void l(Drawable drawable) {
        if (this.f266149b) {
            this.f266153f.setBackgroundDrawable(drawable);
        }
    }

    public void m(boolean z10) {
        this.f266151d = z10;
        if (this.f266149b) {
            this.f266153f.setVisibility(z10 ? 0 : 8);
        }
    }

    public void n(int i10) {
        if (this.f266149b) {
            this.f266153f.setBackgroundResource(i10);
        }
    }

    public void o(float f10) {
        j(f10);
        e(f10);
    }

    public void p(int i10) {
        k(i10);
        f(i10);
    }

    public void q(Drawable drawable) {
        l(drawable);
        g(drawable);
    }

    public void r(int i10) {
        n(i10);
        i(i10);
    }
}
