package com.google.android.material.datepicker;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.f1;
import androidx.annotation.g1;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.core.view.b1;
import androidx.core.view.g3;
import androidx.core.view.u1;
import androidx.fragment.app.t0;
import com.google.android.material.internal.CheckableImageButton;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class l<S> extends androidx.fragment.app.m {
    private static final String H3 = "OVERRIDE_THEME_RES_ID";
    private static final String I3 = "DATE_SELECTOR_KEY";
    private static final String J3 = "CALENDAR_CONSTRAINTS_KEY";
    private static final String K3 = "DAY_VIEW_DECORATOR_KEY";
    private static final String L3 = "TITLE_TEXT_RES_ID_KEY";
    private static final String M3 = "TITLE_TEXT_KEY";
    private static final String N3 = "POSITIVE_BUTTON_TEXT_RES_ID_KEY";
    private static final String O3 = "POSITIVE_BUTTON_TEXT_KEY";
    private static final String P3 = "POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY";
    private static final String Q3 = "POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY";
    private static final String R3 = "NEGATIVE_BUTTON_TEXT_RES_ID_KEY";
    private static final String S3 = "NEGATIVE_BUTTON_TEXT_KEY";
    private static final String T3 = "NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY";
    private static final String U3 = "NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY";
    private static final String V3 = "INPUT_MODE_KEY";
    static final Object W3 = "CONFIRM_BUTTON_TAG";
    static final Object X3 = "CANCEL_BUTTON_TAG";
    static final Object Y3 = "TOGGLE_BUTTON_TAG";
    public static final int Z3 = 0;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    public static final int f112433a4 = 1;
    private TextView A3;
    private CheckableImageButton B3;

    @p0
    private com.google.android.material.shape.k C3;
    private Button D3;
    private boolean E3;

    @p0
    private CharSequence F3;

    @p0
    private CharSequence G3;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    @g1
    private int f112435h3;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    @p0
    private DateSelector<S> f112436i3;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private s<S> f112437j3;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    @p0
    private CalendarConstraints f112438k3;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    @p0
    private DayViewDecorator f112439l3;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private j<S> f112440m3;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    @f1
    private int f112441n3;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private CharSequence f112442o3;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private boolean f112445p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private int f112446q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    @f1
    private int f112447r3;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private CharSequence f112448s3;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    @f1
    private int f112449t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    private CharSequence f112450u3;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    @f1
    private int f112451v3;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    private CharSequence f112452w3;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    @f1
    private int f112453x3;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    private CharSequence f112454y3;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    private TextView f112455z3;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private final LinkedHashSet<m<? super S>> f112443p1 = new LinkedHashSet<>();
    private final LinkedHashSet<View.OnClickListener> H1 = new LinkedHashSet<>();

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private final LinkedHashSet<DialogInterface.OnCancelListener> f112444p2 = new LinkedHashSet<>();

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private final LinkedHashSet<DialogInterface.OnDismissListener> f112434g3 = new LinkedHashSet<>();

    class a implements View.OnClickListener {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = l.this.f112443p1.iterator();
            while (it.hasNext()) {
                ((m) it.next()).a(l.this.V());
            }
            l.this.dismiss();
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = l.this.H1.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            l.this.dismiss();
        }
    }

    class c implements b1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f112458a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f112459b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f112460c;

        c(int i10, View view, int i11) {
            this.f112458a = i10;
            this.f112459b = view;
            this.f112460c = i11;
        }

        @Override // androidx.core.view.b1
        public g3 b(View view, g3 g3Var) {
            int i10 = g3Var.f(g3.m.i()).f47824b;
            if (this.f112458a >= 0) {
                this.f112459b.getLayoutParams().height = this.f112458a + i10;
                View view2 = this.f112459b;
                view2.setLayoutParams(view2.getLayoutParams());
            }
            View view3 = this.f112459b;
            view3.setPadding(view3.getPaddingLeft(), this.f112460c + i10, this.f112459b.getPaddingRight(), this.f112459b.getPaddingBottom());
            return g3Var;
        }
    }

    class d extends r<S> {
        d() {
        }

        @Override // com.google.android.material.datepicker.r
        public void a() {
            l.this.D3.setEnabled(false);
        }

        @Override // com.google.android.material.datepicker.r
        public void b(S s10) {
            l lVar = l.this;
            lVar.k0(lVar.S());
            l.this.D3.setEnabled(l.this.P().L2());
        }
    }

    public static final class e<S> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final DateSelector<S> f112463a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        CalendarConstraints f112465c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        DayViewDecorator f112466d;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f112464b = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f112467e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        CharSequence f112468f = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f112469g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        CharSequence f112470h = null;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f112471i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        CharSequence f112472j = null;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f112473k = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        CharSequence f112474l = null;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f112475m = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        CharSequence f112476n = null;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @p0
        S f112477o = null;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f112478p = 0;

        private e(DateSelector<S> dateSelector) {
            this.f112463a = dateSelector;
        }

        private Month b() {
            if (!this.f112463a.N2().isEmpty()) {
                Month monthE = Month.e(this.f112463a.N2().iterator().next().longValue());
                if (f(monthE, this.f112465c)) {
                    return monthE;
                }
            }
            Month monthK = Month.k();
            return f(monthK, this.f112465c) ? monthK : this.f112465c.o();
        }

        @NonNull
        @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
        public static <S> e<S> c(@NonNull DateSelector<S> dateSelector) {
            return new e<>(dateSelector);
        }

        @NonNull
        public static e<Long> d() {
            return new e<>(new SingleDateSelector());
        }

        @NonNull
        public static e<androidx.core.util.p<Long, Long>> e() {
            return new e<>(new RangeDateSelector());
        }

        private static boolean f(Month month, CalendarConstraints calendarConstraints) {
            if (month.compareTo(calendarConstraints.o()) < 0 || month.compareTo(calendarConstraints.i()) > 0) {
                return false;
            }
            int i10 = 6 << 1;
            return true;
        }

        @NonNull
        public l<S> a() {
            if (this.f112465c == null) {
                this.f112465c = new CalendarConstraints.b().a();
            }
            if (this.f112467e == 0) {
                this.f112467e = this.f112463a.d1();
            }
            S s10 = this.f112477o;
            if (s10 != null) {
                this.f112463a.y2(s10);
            }
            if (this.f112465c.m() == null) {
                this.f112465c.s(b());
            }
            return l.b0(this);
        }

        @NonNull
        @z7.a
        public e<S> g(CalendarConstraints calendarConstraints) {
            this.f112465c = calendarConstraints;
            return this;
        }

        @NonNull
        @z7.a
        public e<S> h(@p0 DayViewDecorator dayViewDecorator) {
            this.f112466d = dayViewDecorator;
            return this;
        }

        @NonNull
        @z7.a
        public e<S> i(int i10) {
            this.f112478p = i10;
            return this;
        }

        @NonNull
        @z7.a
        public e<S> j(@f1 int i10) {
            this.f112475m = i10;
            this.f112476n = null;
            return this;
        }

        @NonNull
        @z7.a
        public e<S> k(@p0 CharSequence charSequence) {
            this.f112476n = charSequence;
            this.f112475m = 0;
            return this;
        }

        @NonNull
        @z7.a
        public e<S> l(@f1 int i10) {
            this.f112473k = i10;
            this.f112474l = null;
            return this;
        }

        @NonNull
        @z7.a
        public e<S> m(@p0 CharSequence charSequence) {
            this.f112474l = charSequence;
            this.f112473k = 0;
            return this;
        }

        @NonNull
        @z7.a
        public e<S> n(@f1 int i10) {
            this.f112471i = i10;
            boolean z10 = true | false;
            this.f112472j = null;
            return this;
        }

        @NonNull
        @z7.a
        public e<S> o(@p0 CharSequence charSequence) {
            this.f112472j = charSequence;
            this.f112471i = 0;
            return this;
        }

        @NonNull
        @z7.a
        public e<S> p(@f1 int i10) {
            this.f112469g = i10;
            this.f112470h = null;
            return this;
        }

        @NonNull
        @z7.a
        public e<S> q(@p0 CharSequence charSequence) {
            this.f112470h = charSequence;
            this.f112469g = 0;
            return this;
        }

        @NonNull
        @z7.a
        public e<S> r(S s10) {
            this.f112477o = s10;
            return this;
        }

        @NonNull
        @z7.a
        public e<S> s(@p0 SimpleDateFormat simpleDateFormat) {
            this.f112463a.G2(simpleDateFormat);
            return this;
        }

        @NonNull
        @z7.a
        public e<S> t(@g1 int i10) {
            this.f112464b = i10;
            return this;
        }

        @NonNull
        @z7.a
        public e<S> u(@f1 int i10) {
            this.f112467e = i10;
            this.f112468f = null;
            return this;
        }

        @NonNull
        @z7.a
        public e<S> v(@p0 CharSequence charSequence) {
            this.f112468f = charSequence;
            this.f112467e = 0;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public @interface f {
    }

    public static /* synthetic */ void A(l lVar, View view) {
        lVar.D3.setEnabled(lVar.P().L2());
        lVar.B3.toggle();
        lVar.f112446q3 = lVar.f112446q3 == 1 ? 0 : 1;
        lVar.m0(lVar.B3);
        lVar.h0();
    }

    @NonNull
    private static Drawable N(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, j.a.b(context, r6.a.g.f360597v1));
        stateListDrawable.addState(new int[0], j.a.b(context, r6.a.g.f360605x1));
        return stateListDrawable;
    }

    private void O(Window window) {
        if (this.E3) {
            return;
        }
        View viewFindViewById = requireView().findViewById(r6.a.h.R1);
        com.google.android.material.internal.e.b(window, true, com.google.android.material.internal.p0.j(viewFindViewById), null);
        u1.j2(viewFindViewById, new c(viewFindViewById.getLayoutParams().height, viewFindViewById, viewFindViewById.getPaddingTop()));
        this.E3 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DateSelector<S> P() {
        if (this.f112436i3 == null) {
            this.f112436i3 = (DateSelector) getArguments().getParcelable(I3);
        }
        return this.f112436i3;
    }

    @p0
    private static CharSequence Q(@p0 CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        String[] strArrSplit = TextUtils.split(String.valueOf(charSequence), "\n");
        return strArrSplit.length > 1 ? strArrSplit[0] : charSequence;
    }

    private String R() {
        return P().s3(requireContext());
    }

    private static int U(@NonNull Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(r6.a.f.f360190fb);
        int i10 = Month.k().f112333d;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(r6.a.f.f360286lb) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(r6.a.f.f360508zb));
    }

    private int W(Context context) {
        int i10 = this.f112435h3;
        return i10 != 0 ? i10 : P().u1(context);
    }

    private void X(Context context) {
        this.B3.setTag(Y3);
        this.B3.setImageDrawable(N(context));
        this.B3.setChecked(this.f112446q3 != 0);
        u1.G1(this.B3, null);
        m0(this.B3);
        this.B3.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l.A(this.f112432a, view);
            }
        });
    }

    static boolean Y(@NonNull Context context) {
        return c0(context, R.attr.windowFullscreen);
    }

    private boolean Z() {
        return getResources().getConfiguration().orientation == 2;
    }

    static boolean a0(@NonNull Context context) {
        return c0(context, r6.a.c.f359588ue);
    }

    @NonNull
    static <S> l<S> b0(@NonNull e<S> eVar) {
        l<S> lVar = new l<>();
        Bundle bundle = new Bundle();
        bundle.putInt(H3, eVar.f112464b);
        bundle.putParcelable(I3, eVar.f112463a);
        bundle.putParcelable(J3, eVar.f112465c);
        bundle.putParcelable(K3, eVar.f112466d);
        bundle.putInt(L3, eVar.f112467e);
        bundle.putCharSequence(M3, eVar.f112468f);
        bundle.putInt(V3, eVar.f112478p);
        bundle.putInt(N3, eVar.f112469g);
        bundle.putCharSequence(O3, eVar.f112470h);
        bundle.putInt(P3, eVar.f112471i);
        bundle.putCharSequence(Q3, eVar.f112472j);
        bundle.putInt(R3, eVar.f112473k);
        bundle.putCharSequence(S3, eVar.f112474l);
        bundle.putInt(T3, eVar.f112475m);
        bundle.putCharSequence(U3, eVar.f112476n);
        lVar.setArguments(bundle);
        return lVar;
    }

    static boolean c0(@NonNull Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(com.google.android.material.resources.b.g(context, r6.a.c.Ac, j.class.getCanonicalName()), new int[]{i10});
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z10;
    }

    private void h0() {
        int iW = W(requireContext());
        o oVarN = j.N(P(), iW, this.f112438k3, this.f112439l3);
        this.f112440m3 = oVarN;
        if (this.f112446q3 == 1) {
            oVarN = o.x(P(), iW, this.f112438k3);
        }
        this.f112437j3 = oVarN;
        l0();
        k0(S());
        t0 t0VarW = getChildFragmentManager().w();
        t0VarW.y(r6.a.h.f360691j3, this.f112437j3);
        t0VarW.o();
        this.f112437j3.t(new d());
    }

    public static long i0() {
        return Month.k().f112335f;
    }

    public static long j0() {
        return v.v().getTimeInMillis();
    }

    private void l0() {
        this.f112455z3.setText((this.f112446q3 == 1 && Z()) ? this.G3 : this.F3);
    }

    private void m0(@NonNull CheckableImageButton checkableImageButton) {
        this.B3.setContentDescription(this.f112446q3 == 1 ? checkableImageButton.getContext().getString(r6.a.m.J1) : checkableImageButton.getContext().getString(r6.a.m.L1));
    }

    public boolean F(DialogInterface.OnCancelListener onCancelListener) {
        return this.f112444p2.add(onCancelListener);
    }

    public boolean G(DialogInterface.OnDismissListener onDismissListener) {
        return this.f112434g3.add(onDismissListener);
    }

    public boolean H(View.OnClickListener onClickListener) {
        return this.H1.add(onClickListener);
    }

    public boolean I(m<? super S> mVar) {
        return this.f112443p1.add(mVar);
    }

    public void J() {
        this.f112444p2.clear();
    }

    public void K() {
        this.f112434g3.clear();
    }

    public void L() {
        this.H1.clear();
    }

    public void M() {
        this.f112443p1.clear();
    }

    public String S() {
        return P().y3(getContext());
    }

    public int T() {
        return this.f112446q3;
    }

    @p0
    public final S V() {
        return P().Y2();
    }

    public boolean d0(DialogInterface.OnCancelListener onCancelListener) {
        return this.f112444p2.remove(onCancelListener);
    }

    public boolean e0(DialogInterface.OnDismissListener onDismissListener) {
        return this.f112434g3.remove(onDismissListener);
    }

    public boolean f0(View.OnClickListener onClickListener) {
        return this.H1.remove(onClickListener);
    }

    public boolean g0(m<? super S> mVar) {
        return this.f112443p1.remove(mVar);
    }

    @l1
    void k0(String str) {
        this.A3.setContentDescription(R());
        this.A3.setText(str);
    }

    @Override // androidx.fragment.app.m, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@NonNull DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f112444p2.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public final void onCreate(@p0 Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f112435h3 = bundle.getInt(H3);
        this.f112436i3 = (DateSelector) bundle.getParcelable(I3);
        this.f112438k3 = (CalendarConstraints) bundle.getParcelable(J3);
        this.f112439l3 = (DayViewDecorator) bundle.getParcelable(K3);
        this.f112441n3 = bundle.getInt(L3);
        this.f112442o3 = bundle.getCharSequence(M3);
        this.f112446q3 = bundle.getInt(V3);
        this.f112447r3 = bundle.getInt(N3);
        this.f112448s3 = bundle.getCharSequence(O3);
        this.f112449t3 = bundle.getInt(P3);
        this.f112450u3 = bundle.getCharSequence(Q3);
        this.f112451v3 = bundle.getInt(R3);
        this.f112452w3 = bundle.getCharSequence(S3);
        this.f112453x3 = bundle.getInt(T3);
        this.f112454y3 = bundle.getCharSequence(U3);
        CharSequence text = this.f112442o3;
        if (text == null) {
            text = requireContext().getResources().getText(this.f112441n3);
        }
        this.F3 = text;
        this.G3 = Q(text);
    }

    @Override // androidx.fragment.app.m
    @NonNull
    public final Dialog onCreateDialog(@p0 Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), W(requireContext()));
        Context context = dialog.getContext();
        this.f112445p3 = Y(context);
        this.C3 = new com.google.android.material.shape.k(context, null, r6.a.c.Ac, r6.a.n.f361353oj);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, r6.a.o.Im, r6.a.c.Ac, r6.a.n.f361353oj);
        int color = typedArrayObtainStyledAttributes.getColor(r6.a.o.Km, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.C3.a0(context);
        this.C3.p0(ColorStateList.valueOf(color));
        this.C3.o0(u1.T(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, @p0 Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.f112445p3 ? r6.a.k.J0 : r6.a.k.I0, viewGroup);
        Context context = viewInflate.getContext();
        DayViewDecorator dayViewDecorator = this.f112439l3;
        if (dayViewDecorator != null) {
            dayViewDecorator.i(context);
        }
        if (this.f112445p3) {
            viewInflate.findViewById(r6.a.h.f360691j3).setLayoutParams(new LinearLayout.LayoutParams(U(context), -2));
        } else {
            viewInflate.findViewById(r6.a.h.f360699k3).setLayoutParams(new LinearLayout.LayoutParams(U(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(r6.a.h.f360787v3);
        this.A3 = textView;
        u1.I1(textView, 1);
        this.B3 = (CheckableImageButton) viewInflate.findViewById(r6.a.h.f360803x3);
        this.f112455z3 = (TextView) viewInflate.findViewById(r6.a.h.B3);
        X(context);
        this.D3 = (Button) viewInflate.findViewById(r6.a.h.M0);
        if (P().L2()) {
            this.D3.setEnabled(true);
        } else {
            this.D3.setEnabled(false);
        }
        this.D3.setTag(W3);
        CharSequence charSequence = this.f112448s3;
        if (charSequence != null) {
            this.D3.setText(charSequence);
        } else {
            int i10 = this.f112447r3;
            if (i10 != 0) {
                this.D3.setText(i10);
            }
        }
        CharSequence charSequence2 = this.f112450u3;
        if (charSequence2 != null) {
            this.D3.setContentDescription(charSequence2);
        } else if (this.f112449t3 != 0) {
            this.D3.setContentDescription(getContext().getResources().getText(this.f112449t3));
        }
        this.D3.setOnClickListener(new a());
        Button button = (Button) viewInflate.findViewById(r6.a.h.A0);
        button.setTag(X3);
        CharSequence charSequence3 = this.f112452w3;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i11 = this.f112451v3;
            if (i11 != 0) {
                button.setText(i11);
            }
        }
        CharSequence charSequence4 = this.f112454y3;
        if (charSequence4 != null) {
            button.setContentDescription(charSequence4);
        } else if (this.f112453x3 != 0) {
            button.setContentDescription(getContext().getResources().getText(this.f112453x3));
        }
        button.setOnClickListener(new b());
        return viewInflate;
    }

    @Override // androidx.fragment.app.m, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NonNull DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f112434g3.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(H3, this.f112435h3);
        bundle.putParcelable(I3, this.f112436i3);
        CalendarConstraints.b bVar = new CalendarConstraints.b(this.f112438k3);
        j<S> jVar = this.f112440m3;
        Month monthI = jVar == null ? null : jVar.I();
        if (monthI != null) {
            bVar.d(monthI.f112335f);
        }
        bundle.putParcelable(J3, bVar.a());
        bundle.putParcelable(K3, this.f112439l3);
        bundle.putInt(L3, this.f112441n3);
        bundle.putCharSequence(M3, this.f112442o3);
        bundle.putInt(V3, this.f112446q3);
        bundle.putInt(N3, this.f112447r3);
        bundle.putCharSequence(O3, this.f112448s3);
        bundle.putInt(P3, this.f112449t3);
        bundle.putCharSequence(Q3, this.f112450u3);
        bundle.putInt(R3, this.f112451v3);
        bundle.putCharSequence(S3, this.f112452w3);
        bundle.putInt(T3, this.f112453x3);
        bundle.putCharSequence(U3, this.f112454y3);
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.f112445p3) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.C3);
            O(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(r6.a.f.f360318nb);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.C3, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new v6.a(requireDialog(), rect));
        }
        h0();
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onStop() {
        this.f112437j3.u();
        super.onStop();
    }
}
