package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
public class ActivityChooserView extends ViewGroup implements androidx.appcompat.widget.c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final f f10890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f10891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final View f10892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Drawable f10893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final FrameLayout f10894e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ImageView f10895f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final FrameLayout f10896g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ImageView f10897h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f10898i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    androidx.core.view.b f10899j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final DataSetObserver f10900k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ViewTreeObserver.OnGlobalLayoutListener f10901l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private s0 f10902m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    PopupWindow.OnDismissListener f10903n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    boolean f10904o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    int f10905s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f10906t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f10907v;

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public static class InnerLayout extends LinearLayout {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final int[] f10908a = {R.attr.background};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            j1 j1VarF = j1.F(context, attributeSet, f10908a);
            setBackgroundDrawable(j1VarF.h(0));
            j1VarF.I();
        }
    }

    class a extends DataSetObserver {
        a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.f10890a.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            super.onInvalidated();
            ActivityChooserView.this.f10890a.notifyDataSetInvalidated();
        }
    }

    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (ActivityChooserView.this.b()) {
                if (!ActivityChooserView.this.isShown()) {
                    ActivityChooserView.this.getListPopupWindow().dismiss();
                    return;
                }
                ActivityChooserView.this.getListPopupWindow().a();
                androidx.core.view.b bVar = ActivityChooserView.this.f10899j;
                if (bVar != null) {
                    bVar.m(true);
                }
            }
        }
    }

    class c extends View.AccessibilityDelegate {
        c() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            androidx.core.view.accessibility.j.r2(accessibilityNodeInfo).g1(true);
        }
    }

    class d extends q0 {
        d(View view) {
            super(view);
        }

        @Override // androidx.appcompat.widget.q0
        public androidx.appcompat.view.menu.q b() {
            return ActivityChooserView.this.getListPopupWindow();
        }

        @Override // androidx.appcompat.widget.q0
        protected boolean c() {
            ActivityChooserView.this.c();
            return true;
        }

        @Override // androidx.appcompat.widget.q0
        protected boolean d() {
            ActivityChooserView.this.a();
            return true;
        }
    }

    class e extends DataSetObserver {
        e() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.e();
        }
    }

    private class f extends BaseAdapter {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f10914g = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f10915h = 4;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final int f10916i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final int f10917j = 1;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final int f10918k = 3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private androidx.appcompat.widget.c f10919a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f10920b = 4;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f10921c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f10922d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f10923e;

        f() {
        }

        public int a() {
            return this.f10919a.f();
        }

        public androidx.appcompat.widget.c b() {
            return this.f10919a;
        }

        public ResolveInfo c() {
            return this.f10919a.h();
        }

        public int d() {
            return this.f10919a.j();
        }

        public boolean e() {
            return this.f10921c;
        }

        public int f() {
            int i10 = this.f10920b;
            this.f10920b = Integer.MAX_VALUE;
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int count = getCount();
            int iMax = 0;
            View view = null;
            for (int i11 = 0; i11 < count; i11++) {
                view = getView(i11, view, null);
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                iMax = Math.max(iMax, view.getMeasuredWidth());
            }
            this.f10920b = i10;
            return iMax;
        }

        public void g(androidx.appcompat.widget.c cVar) {
            androidx.appcompat.widget.c cVarB = ActivityChooserView.this.f10890a.b();
            if (cVarB != null && ActivityChooserView.this.isShown()) {
                cVarB.unregisterObserver(ActivityChooserView.this.f10900k);
            }
            this.f10919a = cVar;
            if (cVar != null && ActivityChooserView.this.isShown()) {
                cVar.registerObserver(ActivityChooserView.this.f10900k);
            }
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int iF = this.f10919a.f();
            if (!this.f10921c && this.f10919a.h() != null) {
                iF--;
            }
            int iMin = Math.min(iF, this.f10920b);
            if (this.f10923e) {
                iMin++;
            }
            return iMin;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            int itemViewType = getItemViewType(i10);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    return null;
                }
                throw new IllegalArgumentException();
            }
            if (!this.f10921c && this.f10919a.h() != null) {
                i10++;
            }
            return this.f10919a.e(i10);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i10) {
            return (this.f10923e && i10 == getCount() - 1) ? 1 : 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            int itemViewType = getItemViewType(i10);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    throw new IllegalArgumentException();
                }
                if (view != null && view.getId() == 1) {
                    return view;
                }
                View viewInflate = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(i.a.j.f286250h, viewGroup, false);
                viewInflate.setId(1);
                ((TextView) viewInflate.findViewById(i.a.g.f286217s0)).setText(ActivityChooserView.this.getContext().getString(i.a.k.f286273e));
                return viewInflate;
            }
            if (view == null || view.getId() != i.a.g.H) {
                view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(i.a.j.f286250h, viewGroup, false);
            }
            PackageManager packageManager = ActivityChooserView.this.getContext().getPackageManager();
            ImageView imageView = (ImageView) view.findViewById(i.a.g.E);
            ResolveInfo resolveInfo = (ResolveInfo) getItem(i10);
            imageView.setImageDrawable(resolveInfo.loadIcon(packageManager));
            ((TextView) view.findViewById(i.a.g.f286217s0)).setText(resolveInfo.loadLabel(packageManager));
            if (this.f10921c && i10 == 0 && this.f10922d) {
                view.setActivated(true);
                return view;
            }
            view.setActivated(false);
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 3;
        }

        public void h(int i10) {
            if (this.f10920b != i10) {
                this.f10920b = i10;
                notifyDataSetChanged();
            }
        }

        public void i(boolean z10, boolean z11) {
            if (this.f10921c == z10 && this.f10922d == z11) {
                return;
            }
            this.f10921c = z10;
            this.f10922d = z11;
            notifyDataSetChanged();
        }

        public void j(boolean z10) {
            if (this.f10923e != z10) {
                this.f10923e = z10;
                notifyDataSetChanged();
            }
        }
    }

    private class g implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
        g() {
        }

        private void a() {
            PopupWindow.OnDismissListener onDismissListener = ActivityChooserView.this.f10903n;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view != activityChooserView.f10896g) {
                if (view != activityChooserView.f10894e) {
                    throw new IllegalArgumentException();
                }
                activityChooserView.f10904o = false;
                activityChooserView.d(activityChooserView.f10905s);
                return;
            }
            activityChooserView.a();
            Intent intentB = ActivityChooserView.this.f10890a.b().b(ActivityChooserView.this.f10890a.b().g(ActivityChooserView.this.f10890a.c()));
            if (intentB != null) {
                intentB.addFlags(524288);
                ActivityChooserView.this.getContext().startActivity(intentB);
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            a();
            androidx.core.view.b bVar = ActivityChooserView.this.f10899j;
            if (bVar != null) {
                bVar.m(false);
            }
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            int itemViewType = ((f) adapterView.getAdapter()).getItemViewType(i10);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    throw new IllegalArgumentException();
                }
                ActivityChooserView.this.d(Integer.MAX_VALUE);
                return;
            }
            ActivityChooserView.this.a();
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (activityChooserView.f10904o) {
                if (i10 > 0) {
                    activityChooserView.f10890a.b().r(i10);
                    return;
                }
                return;
            }
            if (!activityChooserView.f10890a.e()) {
                i10++;
            }
            Intent intentB = ActivityChooserView.this.f10890a.b().b(i10);
            if (intentB != null) {
                intentB.addFlags(524288);
                ActivityChooserView.this.getContext().startActivity(intentB);
            }
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view != activityChooserView.f10896g) {
                throw new IllegalArgumentException();
            }
            if (activityChooserView.f10890a.getCount() > 0) {
                ActivityChooserView activityChooserView2 = ActivityChooserView.this;
                activityChooserView2.f10904o = true;
                activityChooserView2.d(activityChooserView2.f10905s);
            }
            return true;
        }
    }

    public ActivityChooserView(@NonNull Context context) {
        this(context, null);
    }

    public boolean a() {
        if (!b()) {
            return true;
        }
        getListPopupWindow().dismiss();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        viewTreeObserver.removeGlobalOnLayoutListener(this.f10901l);
        return true;
    }

    public boolean b() {
        return getListPopupWindow().d();
    }

    public boolean c() {
        if (b() || !this.f10906t) {
            return false;
        }
        this.f10904o = false;
        d(this.f10905s);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean, int] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    void d(int i10) {
        if (this.f10890a.b() == null) {
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }
        getViewTreeObserver().addOnGlobalLayoutListener(this.f10901l);
        ?? r10 = this.f10896g.getVisibility() == 0 ? 1 : 0;
        int iA = this.f10890a.a();
        if (i10 == Integer.MAX_VALUE || iA <= i10 + r10) {
            this.f10890a.j(false);
            this.f10890a.h(i10);
        } else {
            this.f10890a.j(true);
            this.f10890a.h(i10 - 1);
        }
        s0 listPopupWindow = getListPopupWindow();
        if (listPopupWindow.d()) {
            return;
        }
        if (this.f10904o || r10 == 0) {
            this.f10890a.i(true, r10);
        } else {
            this.f10890a.i(false, false);
        }
        listPopupWindow.U(Math.min(this.f10890a.f(), this.f10898i));
        listPopupWindow.a();
        androidx.core.view.b bVar = this.f10899j;
        if (bVar != null) {
            bVar.m(true);
        }
        listPopupWindow.k().setContentDescription(getContext().getString(i.a.k.f286274f));
        listPopupWindow.k().setSelector(new ColorDrawable(0));
    }

    void e() {
        if (this.f10890a.getCount() > 0) {
            this.f10894e.setEnabled(true);
        } else {
            this.f10894e.setEnabled(false);
        }
        int iA = this.f10890a.a();
        int iD = this.f10890a.d();
        if (iA == 1 || (iA > 1 && iD > 0)) {
            this.f10896g.setVisibility(0);
            ResolveInfo resolveInfoC = this.f10890a.c();
            PackageManager packageManager = getContext().getPackageManager();
            this.f10897h.setImageDrawable(resolveInfoC.loadIcon(packageManager));
            if (this.f10907v != 0) {
                this.f10896g.setContentDescription(getContext().getString(this.f10907v, resolveInfoC.loadLabel(packageManager)));
            }
        } else {
            this.f10896g.setVisibility(8);
        }
        if (this.f10896g.getVisibility() == 0) {
            this.f10892c.setBackgroundDrawable(this.f10893d);
        } else {
            this.f10892c.setBackgroundDrawable(null);
        }
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public androidx.appcompat.widget.c getDataModel() {
        return this.f10890a.b();
    }

    s0 getListPopupWindow() {
        if (this.f10902m == null) {
            s0 s0Var = new s0(getContext());
            this.f10902m = s0Var;
            s0Var.q(this.f10890a);
            this.f10902m.S(this);
            this.f10902m.d0(true);
            this.f10902m.f0(this.f10891b);
            this.f10902m.e0(this.f10891b);
        }
        return this.f10902m;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        androidx.appcompat.widget.c cVarB = this.f10890a.b();
        if (cVarB != null) {
            cVarB.registerObserver(this.f10900k);
        }
        this.f10906t = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.appcompat.widget.c cVarB = this.f10890a.b();
        if (cVarB != null) {
            cVarB.unregisterObserver(this.f10900k);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f10901l);
        }
        if (b()) {
            a();
        }
        this.f10906t = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f10892c.layout(0, 0, i12 - i10, i13 - i11);
        if (b()) {
            return;
        }
        a();
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        View view = this.f10892c;
        if (this.f10896g.getVisibility() != 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824);
        }
        measureChild(view, i10, i11);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @Override // androidx.appcompat.widget.c.a
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public void setActivityChooserModel(androidx.appcompat.widget.c cVar) {
        this.f10890a.g(cVar);
        if (b()) {
            a();
            c();
        }
    }

    public void setDefaultActionButtonContentDescription(int i10) {
        this.f10907v = i10;
    }

    public void setExpandActivityOverflowButtonContentDescription(int i10) {
        this.f10895f.setContentDescription(getContext().getString(i10));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f10895f.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i10) {
        this.f10905s = i10;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f10903n = onDismissListener;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public void setProvider(androidx.core.view.b bVar) {
        this.f10899j = bVar;
    }

    public ActivityChooserView(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f10900k = new a();
        this.f10901l = new b();
        this.f10905s = 4;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.a.m.Q, i10, 0);
        androidx.core.view.u1.E1(this, context, i.a.m.Q, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
        this.f10905s = typedArrayObtainStyledAttributes.getInt(i.a.m.S, 4);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(i.a.m.R);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(i.a.j.f286249g, (ViewGroup) this, true);
        g gVar = new g();
        this.f10891b = gVar;
        View viewFindViewById = findViewById(i.a.g.f286206n);
        this.f10892c = viewFindViewById;
        this.f10893d = viewFindViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(i.a.g.f286228y);
        this.f10896g = frameLayout;
        frameLayout.setOnClickListener(gVar);
        frameLayout.setOnLongClickListener(gVar);
        this.f10897h = (ImageView) frameLayout.findViewById(i.a.g.F);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(i.a.g.A);
        frameLayout2.setOnClickListener(gVar);
        frameLayout2.setAccessibilityDelegate(new c());
        frameLayout2.setOnTouchListener(new d(frameLayout2));
        this.f10894e = frameLayout2;
        ImageView imageView = (ImageView) frameLayout2.findViewById(i.a.g.F);
        this.f10895f = imageView;
        imageView.setImageDrawable(drawable);
        f fVar = new f();
        this.f10890a = fVar;
        fVar.registerDataSetObserver(new e());
        Resources resources = context.getResources();
        this.f10898i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(i.a.e.f286122x));
    }
}
