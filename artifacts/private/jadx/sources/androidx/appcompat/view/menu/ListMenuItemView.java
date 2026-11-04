package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.b1;
import androidx.appcompat.widget.j1;

/* JADX INFO: loaded from: classes.dex */
@b1({b1.a.LIBRARY_GROUP_PREFIX})
public class ListMenuItemView extends LinearLayout implements o.a, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f10593v = "ListMenuItemView";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private j f10594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f10595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RadioButton f10596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TextView f10597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CheckBox f10598e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TextView f10599f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ImageView f10600g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ImageView f10601h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private LinearLayout f10602i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Drawable f10603j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f10604k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Context f10605l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f10606m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Drawable f10607n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f10608o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private LayoutInflater f10609s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f10610t;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.b.Y1);
    }

    private void a(View view) {
        b(view, -1);
    }

    private void b(View view, int i10) {
        LinearLayout linearLayout = this.f10602i;
        if (linearLayout != null) {
            linearLayout.addView(view, i10);
        } else {
            addView(view, i10);
        }
    }

    private void c() {
        int i10 = 0 >> 0;
        CheckBox checkBox = (CheckBox) getInflater().inflate(i.a.j.f286257o, (ViewGroup) this, false);
        this.f10598e = checkBox;
        a(checkBox);
    }

    private void f() {
        ImageView imageView = (ImageView) getInflater().inflate(i.a.j.f286258p, (ViewGroup) this, false);
        this.f10595b = imageView;
        b(imageView, 0);
    }

    private LayoutInflater getInflater() {
        if (this.f10609s == null) {
            this.f10609s = LayoutInflater.from(getContext());
        }
        return this.f10609s;
    }

    private void i() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(i.a.j.f286260r, (ViewGroup) this, false);
        this.f10596c = radioButton;
        a(radioButton);
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.f10600g;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f10601h;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f10601h.getLayoutParams();
            rect.top += this.f10601h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    @Override // androidx.appcompat.view.menu.o.a
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void e(boolean z10, char c10) {
        int i10 = (z10 && this.f10594a.D()) ? 0 : 8;
        if (i10 == 0) {
            this.f10599f.setText(this.f10594a.k());
        }
        if (this.f10599f.getVisibility() != i10) {
            this.f10599f.setVisibility(i10);
        }
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void g(j jVar, int i10) {
        this.f10594a = jVar;
        setVisibility(jVar.isVisible() ? 0 : 8);
        setTitle(jVar.l(this));
        setCheckable(jVar.isCheckable());
        e(jVar.D(), jVar.j());
        setIcon(jVar.getIcon());
        setEnabled(jVar.isEnabled());
        setSubMenuArrowVisible(jVar.hasSubMenu());
        setContentDescription(jVar.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.o.a
    public j getItemData() {
        return this.f10594a;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public boolean h() {
        return this.f10610t;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f10603j);
        TextView textView = (TextView) findViewById(i.a.g.f286217s0);
        this.f10597d = textView;
        int i10 = this.f10604k;
        if (i10 != -1) {
            textView.setTextAppearance(this.f10605l, i10);
        }
        this.f10599f = (TextView) findViewById(i.a.g.f286195h0);
        ImageView imageView = (ImageView) findViewById(i.a.g.f286207n0);
        this.f10600g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f10607n);
        }
        this.f10601h = (ImageView) findViewById(i.a.g.C);
        this.f10602i = (LinearLayout) findViewById(i.a.g.f286218t);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f10595b != null && this.f10606m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f10595b.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setCheckable(boolean z10) {
        CompoundButton compoundButton;
        View view;
        if (!z10 && this.f10596c == null && this.f10598e == null) {
            return;
        }
        if (this.f10594a.p()) {
            if (this.f10596c == null) {
                i();
            }
            compoundButton = this.f10596c;
            view = this.f10598e;
        } else {
            if (this.f10598e == null) {
                c();
            }
            compoundButton = this.f10598e;
            view = this.f10596c;
        }
        if (z10) {
            compoundButton.setChecked(this.f10594a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f10598e;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f10596c;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if (this.f10594a.p()) {
            if (this.f10596c == null) {
                i();
            }
            compoundButton = this.f10596c;
        } else {
            if (this.f10598e == null) {
                c();
            }
            compoundButton = this.f10598e;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.f10610t = z10;
        this.f10606m = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.f10601h;
        if (imageView != null) {
            imageView.setVisibility((this.f10608o || !z10) ? 8 : 0);
        }
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setIcon(Drawable drawable) {
        boolean z10 = this.f10594a.C() || this.f10610t;
        if (z10 || this.f10606m) {
            ImageView imageView = this.f10595b;
            if (imageView == null && drawable == null && !this.f10606m) {
                return;
            }
            if (imageView == null) {
                f();
            }
            if (drawable == null && !this.f10606m) {
                this.f10595b.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f10595b;
            if (!z10) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f10595b.getVisibility() != 0) {
                this.f10595b.setVisibility(0);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f10597d.getVisibility() != 8) {
                this.f10597d.setVisibility(8);
            }
        } else {
            this.f10597d.setText(charSequence);
            if (this.f10597d.getVisibility() != 0) {
                this.f10597d.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        j1 j1VarG = j1.G(getContext(), attributeSet, i.a.m.I4, i10, 0);
        this.f10603j = j1VarG.h(i.a.m.O4);
        this.f10604k = j1VarG.u(i.a.m.K4, -1);
        this.f10606m = j1VarG.a(i.a.m.Q4, false);
        this.f10605l = context;
        this.f10607n = j1VarG.h(i.a.m.R4);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, i.a.b.f285969p1, 0);
        this.f10608o = typedArrayObtainStyledAttributes.hasValue(0);
        j1VarG.I();
        typedArrayObtainStyledAttributes.recycle();
    }
}
