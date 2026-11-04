package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
class t1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f11593h = "TooltipPopup";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f11594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f11595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TextView f11596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WindowManager.LayoutParams f11597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Rect f11598e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int[] f11599f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int[] f11600g;

    t1(@NonNull Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f11597d = layoutParams;
        this.f11598e = new Rect();
        this.f11599f = new int[2];
        this.f11600g = new int[2];
        this.f11594a = context;
        View viewInflate = LayoutInflater.from(context).inflate(i.a.j.B, (ViewGroup) null);
        this.f11595b = viewInflate;
        this.f11596c = (TextView) viewInflate.findViewById(i.a.g.I);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = i.a.l.f286323e;
        layoutParams.flags = 24;
    }

    private void a(View view, int i10, int i11, boolean z10, WindowManager.LayoutParams layoutParams) {
        int height;
        int i12;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f11594a.getResources().getDimensionPixelOffset(i.a.e.Q0);
        if (view.getWidth() < dimensionPixelOffset) {
            i10 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f11594a.getResources().getDimensionPixelOffset(i.a.e.P0);
            height = i11 + dimensionPixelOffset2;
            i12 = i11 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i12 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f11594a.getResources().getDimensionPixelOffset(z10 ? i.a.e.T0 : i.a.e.S0);
        View viewB = b(view);
        if (viewB == null) {
            return;
        }
        viewB.getWindowVisibleDisplayFrame(this.f11598e);
        Rect rect = this.f11598e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f11594a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f11598e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        viewB.getLocationOnScreen(this.f11600g);
        view.getLocationOnScreen(this.f11599f);
        int[] iArr = this.f11599f;
        int i13 = iArr[0];
        int[] iArr2 = this.f11600g;
        int i14 = i13 - iArr2[0];
        iArr[0] = i14;
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (i14 + i10) - (viewB.getWidth() / 2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f11595b.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int measuredHeight = this.f11595b.getMeasuredHeight();
        int i15 = this.f11599f[1];
        int i16 = ((i12 + i15) - dimensionPixelOffset3) - measuredHeight;
        int i17 = i15 + height + dimensionPixelOffset3;
        if (z10) {
            if (i16 >= 0) {
                layoutParams.y = i16;
                return;
            } else {
                layoutParams.y = i17;
                return;
            }
        }
        if (measuredHeight + i17 <= this.f11598e.height()) {
            layoutParams.y = i17;
        } else {
            layoutParams.y = i16;
        }
    }

    private static View b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if (!(layoutParams instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams).type != 2) {
            for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                if (context instanceof Activity) {
                    return ((Activity) context).getWindow().getDecorView();
                }
            }
        }
        return rootView;
    }

    void c() {
        if (d()) {
            ((WindowManager) this.f11594a.getSystemService("window")).removeView(this.f11595b);
        }
    }

    boolean d() {
        return this.f11595b.getParent() != null;
    }

    void e(View view, int i10, int i11, boolean z10, CharSequence charSequence) {
        if (d()) {
            c();
        }
        this.f11596c.setText(charSequence);
        a(view, i10, i11, z10, this.f11597d);
        ((WindowManager) this.f11594a.getSystemService("window")).addView(this.f11595b, this.f11597d);
    }
}
