package com.google.android.material.timepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.f1;
import androidx.annotation.g0;
import androidx.annotation.g1;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.annotation.v;
import androidx.core.view.u1;
import com.google.android.material.button.MaterialButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends androidx.fragment.app.m implements TimePickerView.d {
    public static final int A3 = 1;
    static final String B3 = "TIME_PICKER_TIME_MODEL";
    static final String C3 = "TIME_PICKER_INPUT_MODE";
    static final String D3 = "TIME_PICKER_TITLE_RES";
    static final String E3 = "TIME_PICKER_TITLE_TEXT";
    static final String F3 = "TIME_PICKER_POSITIVE_BUTTON_TEXT_RES";
    static final String G3 = "TIME_PICKER_POSITIVE_BUTTON_TEXT";
    static final String H3 = "TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES";
    static final String I3 = "TIME_PICKER_NEGATIVE_BUTTON_TEXT";
    static final String J3 = "TIME_PICKER_OVERRIDE_THEME_RES_ID";

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    public static final int f114344z3 = 0;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private TimePickerView f114346h3;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private ViewStub f114347i3;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    @p0
    private i f114348j3;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    @p0
    private n f114349k3;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    @p0
    private k f114350l3;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    @v
    private int f114351m3;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    @v
    private int f114352n3;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private CharSequence f114356p3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private CharSequence f114358r3;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private CharSequence f114360t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    private MaterialButton f114361u3;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    private Button f114362v3;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    private TimeModel f114364x3;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private final Set<View.OnClickListener> f114354p1 = new LinkedHashSet();
    private final Set<View.OnClickListener> H1 = new LinkedHashSet();

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private final Set<DialogInterface.OnCancelListener> f114355p2 = new LinkedHashSet();

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private final Set<DialogInterface.OnDismissListener> f114345g3 = new LinkedHashSet();

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @f1
    private int f114353o3 = 0;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    @f1
    private int f114357q3 = 0;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    @f1
    private int f114359s3 = 0;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    private int f114363w3 = 0;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    private int f114365y3 = 0;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = d.this.f114354p1.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            d.this.dismiss();
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = d.this.H1.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            d.this.dismiss();
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d dVar = d.this;
            dVar.f114363w3 = dVar.f114363w3 == 0 ? 1 : 0;
            d dVar2 = d.this;
            dVar2.h0(dVar2.f114361u3);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.timepicker.d$d, reason: collision with other inner class name */
    public static final class C0996d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        private Integer f114370b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private CharSequence f114372d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private CharSequence f114374f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private CharSequence f114376h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private TimeModel f114369a = new TimeModel();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @f1
        private int f114371c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @f1
        private int f114373e = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @f1
        private int f114375g = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f114377i = 0;

        @NonNull
        public d j() {
            return d.X(this);
        }

        @NonNull
        @z7.a
        public C0996d k(@g0(from = 0, to = 23) int i10) {
            this.f114369a.j(i10);
            return this;
        }

        @NonNull
        @z7.a
        public C0996d l(int i10) {
            this.f114370b = Integer.valueOf(i10);
            return this;
        }

        @NonNull
        @z7.a
        public C0996d m(@g0(from = 0, to = 59) int i10) {
            this.f114369a.k(i10);
            return this;
        }

        @NonNull
        @z7.a
        public C0996d n(@f1 int i10) {
            this.f114375g = i10;
            return this;
        }

        @NonNull
        @z7.a
        public C0996d o(@p0 CharSequence charSequence) {
            this.f114376h = charSequence;
            return this;
        }

        @NonNull
        @z7.a
        public C0996d p(@f1 int i10) {
            this.f114373e = i10;
            return this;
        }

        @NonNull
        @z7.a
        public C0996d q(@p0 CharSequence charSequence) {
            this.f114374f = charSequence;
            return this;
        }

        @NonNull
        @z7.a
        public C0996d r(@g1 int i10) {
            this.f114377i = i10;
            return this;
        }

        @NonNull
        @z7.a
        public C0996d s(int i10) {
            TimeModel timeModel = this.f114369a;
            int i11 = timeModel.f114323d;
            int i12 = timeModel.f114324e;
            TimeModel timeModel2 = new TimeModel(i10);
            this.f114369a = timeModel2;
            timeModel2.k(i12);
            this.f114369a.j(i11);
            return this;
        }

        @NonNull
        @z7.a
        public C0996d t(@f1 int i10) {
            this.f114371c = i10;
            return this;
        }

        @NonNull
        @z7.a
        public C0996d u(@p0 CharSequence charSequence) {
            this.f114372d = charSequence;
            return this;
        }
    }

    public static /* synthetic */ void A(d dVar) {
        k kVar = dVar.f114350l3;
        if (kVar instanceof n) {
            ((n) kVar).i();
        }
    }

    private Pair<Integer, Integer> Q(int i10) {
        if (i10 == 0) {
            return new Pair<>(Integer.valueOf(this.f114351m3), Integer.valueOf(r6.a.m.M0));
        }
        if (i10 == 1) {
            return new Pair<>(Integer.valueOf(this.f114352n3), Integer.valueOf(r6.a.m.H0));
        }
        throw new IllegalArgumentException("no icon for mode: " + i10);
    }

    private int U() {
        int i10 = this.f114365y3;
        if (i10 != 0) {
            return i10;
        }
        TypedValue typedValueA = com.google.android.material.resources.b.a(requireContext(), r6.a.c.Yc);
        if (typedValueA == null) {
            return 0;
        }
        return typedValueA.data;
    }

    private k W(int i10, @NonNull TimePickerView timePickerView, @NonNull ViewStub viewStub) {
        if (i10 != 0) {
            if (this.f114349k3 == null) {
                this.f114349k3 = new n((LinearLayout) viewStub.inflate(), this.f114364x3);
            }
            this.f114349k3.g();
            return this.f114349k3;
        }
        i iVar = this.f114348j3;
        if (iVar == null) {
            iVar = new i(timePickerView, this.f114364x3);
        }
        this.f114348j3 = iVar;
        return iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public static d X(@NonNull C0996d c0996d) {
        d dVar = new d();
        Bundle bundle = new Bundle();
        bundle.putParcelable(B3, c0996d.f114369a);
        if (c0996d.f114370b != null) {
            bundle.putInt(C3, c0996d.f114370b.intValue());
        }
        bundle.putInt(D3, c0996d.f114371c);
        if (c0996d.f114372d != null) {
            bundle.putCharSequence(E3, c0996d.f114372d);
        }
        bundle.putInt(F3, c0996d.f114373e);
        if (c0996d.f114374f != null) {
            bundle.putCharSequence(G3, c0996d.f114374f);
        }
        bundle.putInt(H3, c0996d.f114375g);
        if (c0996d.f114376h != null) {
            bundle.putCharSequence(I3, c0996d.f114376h);
        }
        bundle.putInt(J3, c0996d.f114377i);
        dVar.setArguments(bundle);
        return dVar;
    }

    private void c0(@p0 Bundle bundle) {
        if (bundle == null) {
            return;
        }
        TimeModel timeModel = (TimeModel) bundle.getParcelable(B3);
        this.f114364x3 = timeModel;
        if (timeModel == null) {
            this.f114364x3 = new TimeModel();
        }
        int i10 = 1;
        if (this.f114364x3.f114322c != 1) {
            i10 = 0;
        }
        this.f114363w3 = bundle.getInt(C3, i10);
        this.f114353o3 = bundle.getInt(D3, 0);
        this.f114356p3 = bundle.getCharSequence(E3);
        this.f114357q3 = bundle.getInt(F3, 0);
        this.f114358r3 = bundle.getCharSequence(G3);
        this.f114359s3 = bundle.getInt(H3, 0);
        this.f114360t3 = bundle.getCharSequence(I3);
        this.f114365y3 = bundle.getInt(J3, 0);
    }

    private void g0() {
        Button button = this.f114362v3;
        if (button != null) {
            button.setVisibility(isCancelable() ? 0 : 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(MaterialButton materialButton) {
        if (materialButton == null || this.f114346h3 == null || this.f114347i3 == null) {
            return;
        }
        k kVar = this.f114350l3;
        if (kVar != null) {
            kVar.b();
        }
        k kVarW = W(this.f114363w3, this.f114346h3, this.f114347i3);
        this.f114350l3 = kVarW;
        kVarW.a();
        this.f114350l3.invalidate();
        Pair<Integer, Integer> pairQ = Q(this.f114363w3);
        materialButton.setIconResource(((Integer) pairQ.first).intValue());
        materialButton.setContentDescription(getResources().getString(((Integer) pairQ.second).intValue()));
        materialButton.sendAccessibilityEvent(4);
    }

    public boolean I(@NonNull DialogInterface.OnCancelListener onCancelListener) {
        return this.f114355p2.add(onCancelListener);
    }

    public boolean J(@NonNull DialogInterface.OnDismissListener onDismissListener) {
        return this.f114345g3.add(onDismissListener);
    }

    public boolean K(@NonNull View.OnClickListener onClickListener) {
        return this.H1.add(onClickListener);
    }

    public boolean L(@NonNull View.OnClickListener onClickListener) {
        return this.f114354p1.add(onClickListener);
    }

    public void M() {
        this.f114355p2.clear();
    }

    public void N() {
        this.f114345g3.clear();
    }

    public void O() {
        this.H1.clear();
    }

    public void P() {
        this.f114354p1.clear();
    }

    @g0(from = 0, to = 23)
    public int R() {
        return this.f114364x3.f114323d % 24;
    }

    public int S() {
        return this.f114363w3;
    }

    @g0(from = 0, to = 59)
    public int T() {
        return this.f114364x3.f114324e;
    }

    @p0
    i V() {
        return this.f114348j3;
    }

    public boolean Y(@NonNull DialogInterface.OnCancelListener onCancelListener) {
        return this.f114355p2.remove(onCancelListener);
    }

    public boolean Z(@NonNull DialogInterface.OnDismissListener onDismissListener) {
        return this.f114345g3.remove(onDismissListener);
    }

    public boolean a0(@NonNull View.OnClickListener onClickListener) {
        return this.H1.remove(onClickListener);
    }

    public boolean b0(@NonNull View.OnClickListener onClickListener) {
        return this.f114354p1.remove(onClickListener);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.d
    @b1({b1.a.LIBRARY_GROUP})
    public void c() {
        this.f114363w3 = 1;
        h0(this.f114361u3);
        this.f114349k3.i();
    }

    @l1
    void d0(@p0 k kVar) {
        this.f114350l3 = kVar;
    }

    public void e0(@g0(from = 0, to = 23) int i10) {
        this.f114364x3.i(i10);
        k kVar = this.f114350l3;
        if (kVar != null) {
            kVar.invalidate();
        }
    }

    public void f0(@g0(from = 0, to = 59) int i10) {
        this.f114364x3.k(i10);
        k kVar = this.f114350l3;
        if (kVar != null) {
            kVar.invalidate();
        }
    }

    @Override // androidx.fragment.app.m, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@NonNull DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f114355p2.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onCreate(@p0 Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        c0(bundle);
    }

    @Override // androidx.fragment.app.m
    @NonNull
    public final Dialog onCreateDialog(@p0 Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), U());
        Context context = dialog.getContext();
        com.google.android.material.shape.k kVar = new com.google.android.material.shape.k(context, null, r6.a.c.Xc, r6.a.n.f361464tk);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, r6.a.o.lo, r6.a.c.Xc, r6.a.n.f361464tk);
        this.f114352n3 = typedArrayObtainStyledAttributes.getResourceId(r6.a.o.no, 0);
        this.f114351m3 = typedArrayObtainStyledAttributes.getResourceId(r6.a.o.oo, 0);
        int color = typedArrayObtainStyledAttributes.getColor(r6.a.o.mo, 0);
        typedArrayObtainStyledAttributes.recycle();
        kVar.a0(context);
        kVar.p0(ColorStateList.valueOf(color));
        Window window = dialog.getWindow();
        window.setBackgroundDrawable(kVar);
        window.requestFeature(1);
        window.setLayout(-2, -2);
        kVar.o0(u1.T(window.getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, @p0 Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(r6.a.k.f360909l0, viewGroup);
        TimePickerView timePickerView = (TimePickerView) viewGroup2.findViewById(r6.a.h.T2);
        this.f114346h3 = timePickerView;
        timePickerView.H(this);
        this.f114347i3 = (ViewStub) viewGroup2.findViewById(r6.a.h.O2);
        this.f114361u3 = (MaterialButton) viewGroup2.findViewById(r6.a.h.R2);
        TextView textView = (TextView) viewGroup2.findViewById(r6.a.h.W1);
        int i10 = this.f114353o3;
        if (i10 != 0) {
            textView.setText(i10);
        } else if (!TextUtils.isEmpty(this.f114356p3)) {
            textView.setText(this.f114356p3);
        }
        h0(this.f114361u3);
        Button button = (Button) viewGroup2.findViewById(r6.a.h.S2);
        button.setOnClickListener(new a());
        int i11 = this.f114357q3;
        if (i11 != 0) {
            button.setText(i11);
        } else if (!TextUtils.isEmpty(this.f114358r3)) {
            button.setText(this.f114358r3);
        }
        Button button2 = (Button) viewGroup2.findViewById(r6.a.h.P2);
        this.f114362v3 = button2;
        button2.setOnClickListener(new b());
        int i12 = this.f114359s3;
        if (i12 != 0) {
            this.f114362v3.setText(i12);
        } else if (!TextUtils.isEmpty(this.f114360t3)) {
            this.f114362v3.setText(this.f114360t3);
        }
        g0();
        this.f114361u3.setOnClickListener(new c());
        return viewGroup2;
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f114350l3 = null;
        this.f114348j3 = null;
        this.f114349k3 = null;
        TimePickerView timePickerView = this.f114346h3;
        if (timePickerView != null) {
            timePickerView.H(null);
            this.f114346h3 = null;
        }
    }

    @Override // androidx.fragment.app.m, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NonNull DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f114345g3.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable(B3, this.f114364x3);
        bundle.putInt(C3, this.f114363w3);
        bundle.putInt(D3, this.f114353o3);
        bundle.putCharSequence(E3, this.f114356p3);
        bundle.putInt(F3, this.f114357q3);
        bundle.putCharSequence(G3, this.f114358r3);
        bundle.putInt(H3, this.f114359s3);
        bundle.putCharSequence(I3, this.f114360t3);
        bundle.putInt(J3, this.f114365y3);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @p0 Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.f114350l3 instanceof n) {
            view.postDelayed(new Runnable() { // from class: com.google.android.material.timepicker.c
                @Override // java.lang.Runnable
                public final void run() {
                    d.A(this.f114343a);
                }
            }, 100L);
        }
    }

    @Override // androidx.fragment.app.m
    public void setCancelable(boolean z10) {
        super.setCancelable(z10);
        g0();
    }
}
