package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.f0;
import com.google.android.material.internal.p0;
import java.lang.reflect.Field;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
class n implements TimePickerView.f, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinearLayout f114404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TimeModel f114405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TextWatcher f114406c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TextWatcher f114407d = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ChipTextInputComboView f114408e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ChipTextInputComboView f114409f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final l f114410g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final EditText f114411h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final EditText f114412i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MaterialButtonToggleGroup f114413j;

    class a extends f0 {
        a() {
        }

        @Override // com.google.android.material.internal.f0, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            try {
                if (TextUtils.isEmpty(editable)) {
                    n.this.f114405b.k(0);
                } else {
                    n.this.f114405b.k(Integer.parseInt(editable.toString()));
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    class b extends f0 {
        b() {
        }

        @Override // com.google.android.material.internal.f0, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            try {
                if (TextUtils.isEmpty(editable)) {
                    n.this.f114405b.i(0);
                } else {
                    n.this.f114405b.i(Integer.parseInt(editable.toString()));
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            n.this.e(((Integer) view.getTag(r6.a.h.f360645d5)).intValue());
        }
    }

    class d extends com.google.android.material.timepicker.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TimeModel f114417b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, int i10, TimeModel timeModel) {
            super(context, i10);
            this.f114417b = timeModel;
        }

        @Override // com.google.android.material.timepicker.a, androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, androidx.core.view.accessibility.j jVar) {
            super.onInitializeAccessibilityNodeInfo(view, jVar);
            jVar.o1(view.getResources().getString(this.f114417b.c(), String.valueOf(this.f114417b.e())));
        }
    }

    class e extends com.google.android.material.timepicker.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TimeModel f114419b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Context context, int i10, TimeModel timeModel) {
            super(context, i10);
            this.f114419b = timeModel;
        }

        @Override // com.google.android.material.timepicker.a, androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, androidx.core.view.accessibility.j jVar) {
            super.onInitializeAccessibilityNodeInfo(view, jVar);
            jVar.o1(view.getResources().getString(r6.a.m.f361018x0, String.valueOf(this.f114419b.f114324e)));
        }
    }

    public n(LinearLayout linearLayout, TimeModel timeModel) {
        this.f114404a = linearLayout;
        this.f114405b = timeModel;
        Resources resources = linearLayout.getResources();
        ChipTextInputComboView chipTextInputComboView = (ChipTextInputComboView) linearLayout.findViewById(r6.a.h.M2);
        this.f114408e = chipTextInputComboView;
        ChipTextInputComboView chipTextInputComboView2 = (ChipTextInputComboView) linearLayout.findViewById(r6.a.h.J2);
        this.f114409f = chipTextInputComboView2;
        TextView textView = (TextView) chipTextInputComboView.findViewById(r6.a.h.L2);
        TextView textView2 = (TextView) chipTextInputComboView2.findViewById(r6.a.h.L2);
        textView.setText(resources.getString(r6.a.m.J0));
        textView2.setText(resources.getString(r6.a.m.I0));
        chipTextInputComboView.setTag(r6.a.h.f360645d5, 12);
        chipTextInputComboView2.setTag(r6.a.h.f360645d5, 10);
        if (timeModel.f114322c == 0) {
            l();
        }
        c cVar = new c();
        chipTextInputComboView2.setOnClickListener(cVar);
        chipTextInputComboView.setOnClickListener(cVar);
        chipTextInputComboView2.c(timeModel.f());
        chipTextInputComboView.c(timeModel.g());
        this.f114411h = chipTextInputComboView2.f().getEditText();
        this.f114412i = chipTextInputComboView.f().getEditText();
        this.f114410g = new l(chipTextInputComboView2, chipTextInputComboView, timeModel);
        chipTextInputComboView2.g(new d(linearLayout.getContext(), r6.a.m.f361009u0, timeModel));
        chipTextInputComboView.g(new e(linearLayout.getContext(), r6.a.m.f361015w0, timeModel));
        initialize();
    }

    public static /* synthetic */ void c(n nVar, MaterialButtonToggleGroup materialButtonToggleGroup, int i10, boolean z10) {
        nVar.getClass();
        if (z10) {
            nVar.f114405b.l(i10 == r6.a.h.H2 ? 1 : 0);
        }
    }

    private void f() {
        this.f114411h.addTextChangedListener(this.f114407d);
        this.f114412i.addTextChangedListener(this.f114406c);
    }

    private void h() {
        this.f114411h.removeTextChangedListener(this.f114407d);
        this.f114412i.removeTextChangedListener(this.f114406c);
    }

    private static void j(EditText editText, @androidx.annotation.l int i10) {
        try {
            Context context = editText.getContext();
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            int i11 = declaredField.getInt(editText);
            Field declaredField2 = TextView.class.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(editText);
            Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
            declaredField3.setAccessible(true);
            Drawable drawableB = j.a.b(context, i11);
            drawableB.setColorFilter(i10, PorterDuff.Mode.SRC_IN);
            declaredField3.set(obj, new Drawable[]{drawableB, drawableB});
        } catch (Throwable unused) {
        }
    }

    private void k(TimeModel timeModel) {
        h();
        Locale locale = this.f114404a.getResources().getConfiguration().locale;
        String str = String.format(locale, TimeModel.f114318h, Integer.valueOf(timeModel.f114324e));
        String str2 = String.format(locale, TimeModel.f114318h, Integer.valueOf(timeModel.e()));
        this.f114408e.j(str);
        this.f114409f.j(str2);
        f();
        m();
    }

    private void l() {
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.f114404a.findViewById(r6.a.h.I2);
        this.f114413j = materialButtonToggleGroup;
        materialButtonToggleGroup.b(new MaterialButtonToggleGroup.d() { // from class: com.google.android.material.timepicker.m
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.d
            public final void a(MaterialButtonToggleGroup materialButtonToggleGroup2, int i10, boolean z10) {
                n.c(this.f114403a, materialButtonToggleGroup2, i10, z10);
            }
        });
        this.f114413j.setVisibility(0);
        m();
    }

    private void m() {
        MaterialButtonToggleGroup materialButtonToggleGroup = this.f114413j;
        if (materialButtonToggleGroup == null) {
            return;
        }
        materialButtonToggleGroup.e(this.f114405b.f114326g == 0 ? r6.a.h.G2 : r6.a.h.H2);
    }

    @Override // com.google.android.material.timepicker.k
    public void a() {
        this.f114404a.setVisibility(0);
        e(this.f114405b.f114325f);
    }

    @Override // com.google.android.material.timepicker.k
    public void b() {
        View focusedChild = this.f114404a.getFocusedChild();
        if (focusedChild != null) {
            p0.r(focusedChild, false);
        }
        this.f114404a.setVisibility(8);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.f
    public void e(int i10) {
        this.f114405b.f114325f = i10;
        this.f114408e.setChecked(i10 == 12);
        this.f114409f.setChecked(i10 == 10);
        m();
    }

    public void g() {
        this.f114408e.setChecked(false);
        this.f114409f.setChecked(false);
    }

    public void i() {
        this.f114408e.setChecked(this.f114405b.f114325f == 12);
        this.f114409f.setChecked(this.f114405b.f114325f == 10);
    }

    @Override // com.google.android.material.timepicker.k
    public void initialize() {
        f();
        k(this.f114405b);
        this.f114410g.a();
    }

    @Override // com.google.android.material.timepicker.k
    public void invalidate() {
        k(this.f114405b);
    }
}
