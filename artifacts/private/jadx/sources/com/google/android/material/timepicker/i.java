package com.google.android.material.timepicker;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.canhub.cropper.core.CropImageOptions;

/* JADX INFO: loaded from: classes4.dex */
class i implements ClockHandView.c, TimePickerView.f, TimePickerView.e, ClockHandView.b, k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String[] f114387f = {"12", "1", "2", androidx.exifinterface.media.a.f51345a5, "4", "5", "6", "7", "8", "9", "10", "11"};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String[] f114388g = {"00", "1", "2", androidx.exifinterface.media.a.f51345a5, "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String[] f114389h = {"00", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55"};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f114390i = 30;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f114391j = 6;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TimePickerView f114392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TimeModel f114393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f114394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f114395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f114396e = false;

    class a extends com.google.android.material.timepicker.a {
        a(Context context, int i10) {
            super(context, i10);
        }

        @Override // com.google.android.material.timepicker.a, androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, androidx.core.view.accessibility.j jVar) {
            super.onInitializeAccessibilityNodeInfo(view, jVar);
            jVar.o1(view.getResources().getString(i.this.f114393b.c(), String.valueOf(i.this.f114393b.e())));
        }
    }

    class b extends com.google.android.material.timepicker.a {
        b(Context context, int i10) {
            super(context, i10);
        }

        @Override // com.google.android.material.timepicker.a, androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, androidx.core.view.accessibility.j jVar) {
            super.onInitializeAccessibilityNodeInfo(view, jVar);
            jVar.o1(view.getResources().getString(r6.a.m.f361018x0, String.valueOf(i.this.f114393b.f114324e)));
        }
    }

    public i(TimePickerView timePickerView, TimeModel timeModel) {
        this.f114392a = timePickerView;
        this.f114393b = timeModel;
        initialize();
    }

    private String[] h() {
        return this.f114393b.f114322c == 1 ? f114388g : f114387f;
    }

    private int i() {
        return (this.f114393b.e() * 30) % CropImageOptions.S3;
    }

    private void j(int i10, int i11) {
        TimeModel timeModel = this.f114393b;
        if (timeModel.f114324e == i11 && timeModel.f114323d == i10) {
            return;
        }
        this.f114392a.performHapticFeedback(4);
    }

    private void l() {
        TimeModel timeModel = this.f114393b;
        int i10 = 1;
        if (timeModel.f114325f == 10 && timeModel.f114322c == 1 && timeModel.f114323d >= 12) {
            i10 = 2;
        }
        this.f114392a.C(i10);
    }

    private void m() {
        TimePickerView timePickerView = this.f114392a;
        TimeModel timeModel = this.f114393b;
        timePickerView.d(timeModel.f114326g, timeModel.e(), this.f114393b.f114324e);
    }

    private void n() {
        o(f114387f, TimeModel.f114319i);
        o(f114389h, TimeModel.f114318h);
    }

    private void o(String[] strArr, String str) {
        for (int i10 = 0; i10 < strArr.length; i10++) {
            strArr[i10] = TimeModel.b(this.f114392a.getResources(), strArr[i10], str);
        }
    }

    @Override // com.google.android.material.timepicker.k
    public void a() {
        this.f114392a.setVisibility(0);
    }

    @Override // com.google.android.material.timepicker.k
    public void b() {
        this.f114392a.setVisibility(8);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.b
    public void c(float f10, boolean z10) {
        this.f114396e = true;
        TimeModel timeModel = this.f114393b;
        int i10 = timeModel.f114324e;
        int i11 = timeModel.f114323d;
        if (timeModel.f114325f == 10) {
            this.f114392a.D(this.f114395d, false);
            AccessibilityManager accessibilityManager = (AccessibilityManager) androidx.core.content.d.s(this.f114392a.getContext(), AccessibilityManager.class);
            if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
                k(12, true);
            }
        } else {
            int iRound = Math.round(f10);
            if (!z10) {
                this.f114393b.k(((iRound + 15) / 30) * 5);
                this.f114394c = this.f114393b.f114324e * 6;
            }
            this.f114392a.D(this.f114394c, z10);
        }
        this.f114396e = false;
        m();
        j(i11, i10);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.e
    public void d(int i10) {
        this.f114393b.l(i10);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.f
    public void e(int i10) {
        k(i10, true);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.c
    public void g(float f10, boolean z10) {
        if (this.f114396e) {
            return;
        }
        TimeModel timeModel = this.f114393b;
        int i10 = timeModel.f114323d;
        int i11 = timeModel.f114324e;
        int iRound = Math.round(f10);
        TimeModel timeModel2 = this.f114393b;
        if (timeModel2.f114325f == 12) {
            timeModel2.k((iRound + 3) / 6);
            this.f114394c = (float) Math.floor(this.f114393b.f114324e * 6);
        } else {
            int i12 = (iRound + 15) / 30;
            if (timeModel2.f114322c == 1) {
                i12 %= 12;
                int i13 = 0 | 2;
                if (this.f114392a.A() == 2) {
                    i12 += 12;
                }
            }
            this.f114393b.i(i12);
            this.f114395d = i();
        }
        if (z10) {
            return;
        }
        m();
        j(i10, i11);
    }

    @Override // com.google.android.material.timepicker.k
    public void initialize() {
        if (this.f114393b.f114322c == 0) {
            this.f114392a.M();
        }
        this.f114392a.z(this);
        this.f114392a.J(this);
        this.f114392a.I(this);
        this.f114392a.G(this);
        n();
        invalidate();
    }

    @Override // com.google.android.material.timepicker.k
    public void invalidate() {
        this.f114395d = i();
        TimeModel timeModel = this.f114393b;
        this.f114394c = timeModel.f114324e * 6;
        k(timeModel.f114325f, false);
        m();
    }

    void k(int i10, boolean z10) {
        boolean z11 = i10 == 12;
        this.f114392a.B(z11);
        this.f114393b.f114325f = i10;
        this.f114392a.e(z11 ? f114389h : h(), z11 ? r6.a.m.f361018x0 : this.f114393b.c());
        l();
        this.f114392a.D(z11 ? this.f114394c : this.f114395d, z10);
        this.f114392a.c(i10);
        this.f114392a.F(new a(this.f114392a.getContext(), r6.a.m.f361009u0));
        this.f114392a.E(new b(this.f114392a.getContext(), r6.a.m.f361015w0));
    }
}
