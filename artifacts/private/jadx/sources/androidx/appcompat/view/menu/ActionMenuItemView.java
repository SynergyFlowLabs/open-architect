package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.annotation.b1;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.p1;
import androidx.appcompat.widget.q0;

/* JADX INFO: loaded from: classes.dex */
@b1({b1.a.LIBRARY_GROUP_PREFIX})
public class ActionMenuItemView extends AppCompatTextView implements o.a, View.OnClickListener, ActionMenuView.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f10576l = "ActionMenuItemView";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f10577m = 32;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    j f10578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CharSequence f10579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Drawable f10580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    g.b f10581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private q0 f10582e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    b f10583f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f10584g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f10585h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f10586i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f10587j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f10588k;

    private class a extends q0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.q0
        public q b() {
            b bVar = ActionMenuItemView.this.f10583f;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.q0
        protected boolean c() {
            q qVarB;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            g.b bVar = actionMenuItemView.f10581d;
            return bVar != null && bVar.b(actionMenuItemView.f10578a) && (qVarB = b()) != null && qVarB.d();
        }
    }

    public static abstract class b {
        public abstract q a();
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    private boolean j() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (i10 < 480) {
            return (i10 >= 640 && i11 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    private void k() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f10579b);
        if (this.f10580c != null && (!this.f10578a.E() || (!this.f10584g && !this.f10585h))) {
            z10 = false;
        }
        boolean z12 = z11 & z10;
        setText(z12 ? this.f10579b : null);
        CharSequence contentDescription = this.f10578a.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z12 ? null : this.f10578a.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f10578a.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            p1.a(this, z12 ? null : this.f10578a.getTitle());
        } else {
            p1.a(this, tooltipText);
        }
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return i();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean c() {
        return i() && this.f10578a.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public boolean d() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void e(boolean z10, char c10) {
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void g(j jVar, int i10) {
        this.f10578a = jVar;
        setIcon(jVar.getIcon());
        setTitle(jVar.l(this));
        setId(jVar.getItemId());
        setVisibility(jVar.isVisible() ? 0 : 8);
        setEnabled(jVar.isEnabled());
        if (jVar.hasSubMenu() && this.f10582e == null) {
            this.f10582e = new a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.o.a
    public j getItemData() {
        return this.f10578a;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public boolean h() {
        return true;
    }

    public boolean i() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        g.b bVar = this.f10581d;
        if (bVar != null) {
            bVar.b(this.f10578a);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f10584g = j();
        k();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        boolean zI = i();
        if (zI && (i12 = this.f10587j) >= 0) {
            super.setPadding(i12, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, this.f10586i) : this.f10586i;
        if (mode != 1073741824 && this.f10586i > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i11);
        }
        if (zI || this.f10580c == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f10580c.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        q0 q0Var;
        if (this.f10578a.hasSubMenu() && (q0Var = this.f10582e) != null && q0Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setCheckable(boolean z10) {
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setChecked(boolean z10) {
    }

    public void setExpandedFormat(boolean z10) {
        if (this.f10585h != z10) {
            this.f10585h = z10;
            j jVar = this.f10578a;
            if (jVar != null) {
                jVar.e();
            }
        }
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setIcon(Drawable drawable) {
        this.f10580c = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.f10588k;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (intrinsicHeight * (i10 / intrinsicWidth));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (intrinsicWidth * (i10 / intrinsicHeight));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, null, null, null);
        k();
    }

    public void setItemInvoker(g.b bVar) {
        this.f10581d = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        this.f10587j = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(b bVar) {
        this.f10583f = bVar;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setTitle(CharSequence charSequence) {
        this.f10579b = charSequence;
        k();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Resources resources = context.getResources();
        this.f10584g = j();
        int i11 = 0 << 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.a.m.G, i10, 0);
        this.f10586i = typedArrayObtainStyledAttributes.getDimensionPixelSize(i.a.m.H, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f10588k = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f10587j = -1;
        setSaveEnabled(false);
    }
}
