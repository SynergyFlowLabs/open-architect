package com.google.android.material.timepicker;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.annotation.NonNull;
import androidx.annotation.f1;
import androidx.annotation.p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.u1;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
class TimePickerView extends ConstraintLayout implements j {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final String f114327j = "android.view.View";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Chip f114328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Chip f114329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ClockHandView f114330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ClockFaceView f114331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final MaterialButtonToggleGroup f114332e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final View.OnClickListener f114333f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private e f114334g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private f f114335h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private d f114336i;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TimePickerView.this.f114335h != null) {
                TimePickerView.this.f114335h.e(((Integer) view.getTag(r6.a.h.f360645d5)).intValue());
            }
        }
    }

    class b extends GestureDetector.SimpleOnGestureListener {
        b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            d dVar = TimePickerView.this.f114336i;
            if (dVar == null) {
                return false;
            }
            dVar.c();
            return true;
        }
    }

    class c implements View.OnTouchListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ GestureDetector f114339a;

        c(GestureDetector gestureDetector) {
            this.f114339a = gestureDetector;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f114339a.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    interface d {
        void c();
    }

    interface e {
        void d(int i10);
    }

    interface f {
        void e(int i10);
    }

    public TimePickerView(Context context) {
        this(context, null);
    }

    private void K() {
        this.f114328a.setTag(r6.a.h.f360645d5, 12);
        this.f114329b.setTag(r6.a.h.f360645d5, 10);
        this.f114328a.setOnClickListener(this.f114333f);
        this.f114329b.setOnClickListener(this.f114333f);
        this.f114328a.setAccessibilityClassName("android.view.View");
        this.f114329b.setAccessibilityClassName("android.view.View");
    }

    @e.a({"ClickableViewAccessibility"})
    private void L() {
        c cVar = new c(new GestureDetector(getContext(), new b()));
        this.f114328a.setOnTouchListener(cVar);
        this.f114329b.setOnTouchListener(cVar);
    }

    private void N(Chip chip, boolean z10) {
        chip.setChecked(z10);
        u1.I1(chip, z10 ? 2 : 0);
    }

    public static /* synthetic */ void w(TimePickerView timePickerView, MaterialButtonToggleGroup materialButtonToggleGroup, int i10, boolean z10) {
        if (!z10) {
            timePickerView.getClass();
            return;
        }
        e eVar = timePickerView.f114334g;
        if (eVar != null) {
            eVar.d(i10 == r6.a.h.H2 ? 1 : 0);
        }
    }

    int A() {
        return this.f114331d.J();
    }

    public void B(boolean z10) {
        this.f114330c.m(z10);
    }

    void C(int i10) {
        this.f114331d.N(i10);
    }

    public void D(float f10, boolean z10) {
        this.f114330c.q(f10, z10);
    }

    public void E(androidx.core.view.a aVar) {
        u1.G1(this.f114328a, aVar);
    }

    public void F(androidx.core.view.a aVar) {
        u1.G1(this.f114329b, aVar);
    }

    public void G(ClockHandView.b bVar) {
        this.f114330c.t(bVar);
    }

    void H(@p0 d dVar) {
        this.f114336i = dVar;
    }

    void I(e eVar) {
        this.f114334g = eVar;
    }

    void J(f fVar) {
        this.f114335h = fVar;
    }

    public void M() {
        this.f114332e.setVisibility(0);
    }

    @Override // com.google.android.material.timepicker.j
    public void c(int i10) {
        N(this.f114328a, i10 == 12);
        N(this.f114329b, i10 == 10);
    }

    @Override // com.google.android.material.timepicker.j
    @e.a({"DefaultLocale"})
    public void d(int i10, int i11, int i12) {
        this.f114332e.e(i10 == 1 ? r6.a.h.H2 : r6.a.h.G2);
        Locale locale = getResources().getConfiguration().locale;
        String str = String.format(locale, TimeModel.f114318h, Integer.valueOf(i12));
        String str2 = String.format(locale, TimeModel.f114318h, Integer.valueOf(i11));
        if (!TextUtils.equals(this.f114328a.getText(), str)) {
            this.f114328a.setText(str);
        }
        if (TextUtils.equals(this.f114329b.getText(), str2)) {
            return;
        }
        this.f114329b.setText(str2);
    }

    @Override // com.google.android.material.timepicker.j
    public void e(String[] strArr, @f1 int i10) {
        this.f114331d.e(strArr, i10);
    }

    @Override // com.google.android.material.timepicker.j
    public void h(float f10) {
        this.f114330c.p(f10);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(@NonNull View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (view == this && i10 == 0) {
            this.f114329b.sendAccessibilityEvent(8);
        }
    }

    public void z(ClockHandView.c cVar) {
        this.f114330c.b(cVar);
    }

    public TimePickerView(Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimePickerView(Context context, @p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f114333f = new a();
        LayoutInflater.from(context).inflate(r6.a.k.f360907k0, this);
        this.f114331d = (ClockFaceView) findViewById(r6.a.h.D2);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(r6.a.h.I2);
        this.f114332e = materialButtonToggleGroup;
        materialButtonToggleGroup.b(new MaterialButtonToggleGroup.d() { // from class: com.google.android.material.timepicker.o
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.d
            public final void a(MaterialButtonToggleGroup materialButtonToggleGroup2, int i11, boolean z10) {
                TimePickerView.w(this.f114421a, materialButtonToggleGroup2, i11, z10);
            }
        });
        this.f114328a = (Chip) findViewById(r6.a.h.N2);
        this.f114329b = (Chip) findViewById(r6.a.h.K2);
        this.f114330c = (ClockHandView) findViewById(r6.a.h.E2);
        L();
        K();
    }
}
