package com.planner5d.library.activity.fragment.smartwizard.dimensions;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.compose.runtime.internal.w0;
import com.google.android.material.slider.Slider;
import com.planner5d.library.databinding.k3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class f extends LinearLayout {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f135511h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private Function2<? super Integer, ? super Boolean, Unit> f135512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f135513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f135514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f135515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f135516e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f135517f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final k3 f135518g;

    public static final class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            Intrinsics.checkNotNullParameter(editable, "editable");
            try {
                int iL = f.this.l(Integer.parseInt(editable.toString()));
                if (f.this.f135515d) {
                    f.this.f135512a.invoke(Integer.valueOf(iL), Boolean.valueOf(f.this.f135514c));
                }
                f.this.getBinding().f159232b.setValue(iL);
            } catch (NumberFormatException unused) {
                if (f.this.f135515d) {
                    f.this.f135512a.invoke(Integer.valueOf(f.this.f135513b), Boolean.valueOf(f.this.f135514c));
                }
                f.this.getBinding().f159232b.setValue(f.this.f135513b);
                f fVar = f.this;
                AppCompatEditText sliderValue = fVar.getBinding().f159233c;
                Intrinsics.checkNotNullExpressionValue(sliderValue, "sliderValue");
                fVar.q(sliderValue, String.valueOf(f.this.f135513b));
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public f(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(f fVar, Slider slider, float f10, boolean z10) {
        Intrinsics.checkNotNullParameter(slider, "<unused var>");
        if (z10) {
            n(fVar, (int) f10, false, true, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(f fVar, View view, boolean z10) {
        if (z10) {
            return;
        }
        try {
            int i10 = Integer.parseInt(String.valueOf(fVar.f135518g.f159233c.getText()));
            int iL = fVar.l(i10);
            if (i10 != iL) {
                fVar.o(iL, false);
            }
        } catch (NumberFormatException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(int i10, boolean z10) {
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int l(int i10) {
        int i11 = this.f135516e;
        if (i10 <= i11) {
            return i11;
        }
        int i12 = this.f135517f;
        return i10 >= i12 ? i12 : i10;
    }

    public static /* synthetic */ void n(f fVar, int i10, boolean z10, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = true;
        }
        fVar.m(i10, z10, z11);
    }

    public static /* synthetic */ void p(f fVar, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = true;
        }
        fVar.o(i10, z10);
    }

    @NotNull
    public final k3 getBinding() {
        return this.f135518g;
    }

    public final void m(int i10, boolean z10, boolean z11) {
        this.f135515d = z10;
        this.f135514c = z11;
        this.f135518g.f159233c.setText(String.valueOf(i10));
        this.f135515d = true;
        this.f135514c = false;
    }

    public final void o(int i10, boolean z10) {
        m(i10, z10, false);
        this.f135515d = z10;
        this.f135518g.f159232b.setValue(i10);
        this.f135515d = true;
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z10, int i10, @Nullable Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (z10) {
            return;
        }
        m((int) this.f135518g.f159232b.getValue(), false, false);
    }

    public final void q(@NotNull EditText editText, @Nullable String str) {
        Intrinsics.checkNotNullParameter(editText, "editText");
        if (editText.hasFocus()) {
            editText.clearFocus();
        }
        editText.setText(str);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f135518g.f159232b.setEnabled(z10);
        this.f135518g.f159233c.setEnabled(z10);
    }

    public final void setInitialValue(int i10) {
        int iL = l(i10);
        this.f135513b = iL;
        o(iL, false);
    }

    public final void setMax(int i10) {
        this.f135517f = i10;
        this.f135518g.f159232b.setValueTo(i10);
    }

    public final void setMin(int i10) {
        this.f135516e = i10;
        this.f135518g.f159232b.setValueFrom(i10);
    }

    public final void setOnSliderTouchListener(@NotNull Slider.b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f135518g.f159232b.q();
        this.f135518g.f159232b.i(listener);
    }

    public final void setOnValueChangeListener(@NotNull Function2<? super Integer, ? super Boolean, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f135512a = listener;
    }

    public final void setProgressColor(@androidx.annotation.l int i10) {
        this.f135518g.f159232b.setTrackActiveTintList(ColorStateList.valueOf(i10));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public f(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ f(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @oj.j
    public f(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f135512a = new Function2() { // from class: com.planner5d.library.activity.fragment.smartwizard.dimensions.c
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return f.k(((Integer) obj).intValue(), ((Boolean) obj2).booleanValue());
            }
        };
        this.f135515d = true;
        this.f135517f = 100;
        k3 k3VarB = k3.b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(k3VarB, "inflate(...)");
        this.f135518g = k3VarB;
        k3VarB.f159232b.h(new Slider.a() { // from class: com.planner5d.library.activity.fragment.smartwizard.dimensions.d
            @Override // com.google.android.material.slider.Slider.a, com.google.android.material.slider.a
            /* JADX INFO: renamed from: c */
            public final void a(Slider slider, float f10, boolean z10) {
                f.d(this.f135509a, slider, f10, z10);
            }
        });
        k3VarB.f159232b.setValueFrom(this.f135516e);
        k3VarB.f159232b.setValueTo(this.f135517f);
        k3VarB.f159233c.addTextChangedListener(new a());
        k3VarB.f159233c.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.planner5d.library.activity.fragment.smartwizard.dimensions.e
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                f.e(this.f135510a, view, z10);
            }
        });
    }
}
