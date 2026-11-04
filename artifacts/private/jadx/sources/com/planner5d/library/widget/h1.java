package com.planner5d.library.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.SeekBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@kotlin.l(message = "Use SliderViewV2. Delete this after old design is not used anymore.")
@SourceDebugExtension({"SMAP\nSliderView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SliderView.kt\ncom/planner5d/library/widget/SliderView\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,109:1\n228#2:110\n1#3:111\n*S KotlinDebug\n*F\n+ 1 SliderView.kt\ncom/planner5d/library/widget/SliderView\n*L\n33#1:110\n33#1:111\n*E\n"})
public final class h1 extends ConstraintLayout {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f258199f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f258200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private Function1<? super Integer, Unit> f258201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f258202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f258203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final te.g0 f258204e;

    public static final class a implements SeekBar.OnSeekBarChangeListener {
        a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            Intrinsics.checkNotNullParameter(seekBar, "seekBar");
            if (z10) {
                h1 h1Var = h1.this;
                h1.D(h1Var, i10 - h1Var.f258200a, false, 2, null);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            Intrinsics.checkNotNullParameter(seekBar, "seekBar");
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            Intrinsics.checkNotNullParameter(seekBar, "seekBar");
        }
    }

    public static final class b implements TextWatcher {
        b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            Intrinsics.checkNotNullParameter(editable, "editable");
            try {
                int i10 = Integer.parseInt(editable.toString());
                if (h1.this.f258203d) {
                    h1.this.f258201b.invoke(Integer.valueOf(i10));
                }
                h1.this.f258204e.f380919b.setProgress(i10 + h1.this.f258200a);
            } catch (NumberFormatException unused) {
                if (h1.this.f258203d) {
                    h1.this.f258201b.invoke(Integer.valueOf(h1.this.getInitialValue()));
                }
                h1.this.f258204e.f380919b.setProgress(h1.this.getInitialValue() + h1.this.f258200a);
                h1 h1Var = h1.this;
                EditText sliderValue = h1Var.f258204e.f380922e;
                Intrinsics.checkNotNullExpressionValue(sliderValue, "sliderValue");
                h1Var.E(sliderValue, String.valueOf(h1.this.getInitialValue()));
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
    public h1(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(int i10) {
        return Unit.f312394a;
    }

    public static /* synthetic */ void D(h1 h1Var, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = true;
        }
        h1Var.C(i10, z10);
    }

    public final void C(int i10, boolean z10) {
        this.f258203d = z10;
        this.f258204e.f380922e.setText(String.valueOf(i10));
        this.f258203d = true;
    }

    public final void E(@NotNull EditText editText, @Nullable String str) {
        Intrinsics.checkNotNullParameter(editText, "editText");
        boolean zHasFocus = editText.hasFocus();
        if (zHasFocus) {
            editText.clearFocus();
        }
        editText.setText(str);
        if (zHasFocus) {
            editText.requestFocus();
        }
    }

    public final int getInitialValue() {
        return this.f258202c;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f258204e.f380919b.setEnabled(z10);
        this.f258204e.f380922e.setEnabled(z10);
    }

    public final void setInitialValue(int i10) {
        this.f258202c = i10;
    }

    public final void setOnSliderChangeListener(@NotNull Function1<? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f258201b = listener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h1(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f258201b = new Function1() { // from class: com.planner5d.library.widget.g1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h1.B(((Integer) obj).intValue());
            }
        };
        this.f258203d = true;
        te.g0 g0VarA = te.g0.a(View.inflate(context, c1.l.A2, this));
        this.f258204e = g0VarA;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, c1.s.Tk, 0, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        g0VarA.f380920c.setText(getResources().getString(typedArrayObtainStyledAttributes.getResourceId(c1.s.Xk, 0)));
        g0VarA.f380921d.setText(typedArrayObtainStyledAttributes.getString(c1.s.Yk));
        int i11 = typedArrayObtainStyledAttributes.getInt(c1.s.Wk, 0);
        int i12 = typedArrayObtainStyledAttributes.getInt(c1.s.Vk, 0);
        int i13 = typedArrayObtainStyledAttributes.getInt(c1.s.Uk, 0);
        this.f258202c = i13;
        this.f258201b.invoke(Integer.valueOf(i13));
        this.f258200a = Math.abs(i11);
        D(this, this.f258202c, false, 2, null);
        g0VarA.f380919b.setMax(i12 - i11);
        g0VarA.f380919b.setProgress(this.f258202c + this.f258200a);
        Unit unit = Unit.f312394a;
        typedArrayObtainStyledAttributes.recycle();
        g0VarA.f380919b.setOnSeekBarChangeListener(new a());
        g0VarA.f380922e.addTextChangedListener(new b());
        g0VarA.f380922e.setSelectAllOnFocus(true);
        g0VarA.f380922e.setImeOptions(301989894);
    }
}
