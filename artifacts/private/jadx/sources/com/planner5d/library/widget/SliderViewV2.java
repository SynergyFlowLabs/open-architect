package com.planner5d.library.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.SeekBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSliderViewV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SliderViewV2.kt\ncom/planner5d/library/widget/SliderViewV2\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,151:1\n228#2:152\n1#3:153\n257#4,2:154\n*S KotlinDebug\n*F\n+ 1 SliderViewV2.kt\ncom/planner5d/library/widget/SliderViewV2\n*L\n38#1:152\n38#1:153\n110#1:154,2\n*E\n"})
public final class SliderViewV2 extends ConstraintLayout {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f249517g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f249518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private Function1<? super Integer, Unit> f249519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f249520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f249521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final te.h0 f249522e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private c f249523f;

    public static final class a implements SeekBar.OnSeekBarChangeListener {
        a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            Intrinsics.checkNotNullParameter(seekBar, "seekBar");
            if (z10) {
                SliderViewV2 sliderViewV2 = SliderViewV2.this;
                SliderViewV2.F(sliderViewV2, i10 - sliderViewV2.f249518a, false, 2, null);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            Intrinsics.checkNotNullParameter(seekBar, "seekBar");
            c touchListener = SliderViewV2.this.getTouchListener();
            if (touchListener != null) {
                touchListener.a();
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            Intrinsics.checkNotNullParameter(seekBar, "seekBar");
            c touchListener = SliderViewV2.this.getTouchListener();
            if (touchListener != null) {
                touchListener.b(seekBar.getProgress() - SliderViewV2.this.f249518a);
            }
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
                if (SliderViewV2.this.f249521d) {
                    SliderViewV2.this.f249519b.invoke(Integer.valueOf(i10));
                }
                SliderViewV2.this.getBinding().f380928b.setProgress(i10 + SliderViewV2.this.f249518a);
            } catch (NumberFormatException unused) {
                if (SliderViewV2.this.f249521d) {
                    SliderViewV2.this.f249519b.invoke(Integer.valueOf(SliderViewV2.this.getInitialValue()));
                }
                SliderViewV2.this.getBinding().f380928b.setProgress(SliderViewV2.this.getInitialValue() + SliderViewV2.this.f249518a);
                SliderViewV2 sliderViewV2 = SliderViewV2.this;
                EditText sliderValue = sliderViewV2.getBinding().f380932f;
                Intrinsics.checkNotNullExpressionValue(sliderValue, "sliderValue");
                sliderViewV2.I(sliderValue, String.valueOf(SliderViewV2.this.getInitialValue()));
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

    public interface c {
        void a();

        void b(int i10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public SliderViewV2(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(int i10) {
        return Unit.f312394a;
    }

    public static /* synthetic */ void B(SliderViewV2 sliderViewV2, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        sliderViewV2.setIcon(num);
    }

    public static /* synthetic */ void D(SliderViewV2 sliderViewV2, int i10, Integer num, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            num = null;
        }
        sliderViewV2.C(i10, num);
    }

    public static /* synthetic */ void F(SliderViewV2 sliderViewV2, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = true;
        }
        sliderViewV2.E(i10, z10);
    }

    public static /* synthetic */ void H(SliderViewV2 sliderViewV2, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = true;
        }
        sliderViewV2.G(i10, z10);
    }

    public final void C(@androidx.annotation.f1 int i10, @androidx.annotation.v @Nullable Integer num) {
        this.f249522e.f380930d.setText(getResources().getString(i10));
        if (num != null) {
            this.f249522e.f380929c.setImageDrawable(androidx.core.content.d.l(getContext(), num.intValue()));
        }
    }

    public final void E(int i10, boolean z10) {
        this.f249521d = z10;
        this.f249522e.f380932f.setText(String.valueOf(i10));
        this.f249521d = true;
    }

    public final void G(int i10, boolean z10) {
        E(i10, z10);
        this.f249521d = z10;
        this.f249522e.f380928b.setProgress(i10 + this.f249518a);
        this.f249521d = true;
    }

    public final void I(@NotNull EditText editText, @Nullable String str) {
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

    @NotNull
    public final te.h0 getBinding() {
        return this.f249522e;
    }

    public final int getInitialValue() {
        return this.f249520c;
    }

    @Nullable
    public final c getTouchListener() {
        return this.f249523f;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f249522e.f380928b.setEnabled(z10);
        this.f249522e.f380932f.setEnabled(z10);
    }

    public final void setIcon(@androidx.annotation.v @Nullable Integer num) {
        if (num == null) {
            this.f249522e.f380929c.setVisibility(8);
            return;
        }
        this.f249522e.f380929c.setImageDrawable(androidx.core.content.d.l(getContext(), num.intValue()));
        ImageView sliderIcon = this.f249522e.f380929c;
        Intrinsics.checkNotNullExpressionValue(sliderIcon, "sliderIcon");
        sliderIcon.setVisibility(0);
    }

    public final void setInitialValue(int i10) {
        this.f249520c = i10;
    }

    public final void setMax(int i10) {
        this.f249522e.f380928b.setMax(i10);
    }

    public final void setOnSliderChangeListener(@NotNull Function1<? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f249519b = listener;
    }

    public final void setTouchListener(@Nullable c cVar) {
        this.f249523f = cVar;
    }

    public final void setUnits(@NotNull String units) {
        Intrinsics.checkNotNullParameter(units, "units");
        this.f249522e.f380931e.setText(units);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public SliderViewV2(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SliderViewV2(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @oj.j
    public SliderViewV2(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f249519b = new Function1() { // from class: com.planner5d.library.widget.i1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SliderViewV2.A(((Integer) obj).intValue());
            }
        };
        this.f249521d = true;
        te.h0 h0VarB = te.h0.b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(h0VarB, "inflate(...)");
        this.f249522e = h0VarB;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, c1.s.Tk, 0, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(c1.s.Xk, 0);
        if (resourceId != 0) {
            h0VarB.f380930d.setText(getResources().getString(resourceId));
        }
        h0VarB.f380931e.setText(typedArrayObtainStyledAttributes.getString(c1.s.Yk));
        int i11 = typedArrayObtainStyledAttributes.getInt(c1.s.Wk, 0);
        int i12 = typedArrayObtainStyledAttributes.getInt(c1.s.Vk, 0);
        int i13 = typedArrayObtainStyledAttributes.getInt(c1.s.Uk, 0);
        this.f249520c = i13;
        this.f249519b.invoke(Integer.valueOf(i13));
        this.f249518a = i11;
        int i14 = 1 >> 2;
        F(this, this.f249520c, false, 2, null);
        h0VarB.f380928b.setMax(i12 - i11);
        h0VarB.f380928b.setProgress(this.f249520c + this.f249518a);
        Unit unit = Unit.f312394a;
        typedArrayObtainStyledAttributes.recycle();
        h0VarB.f380928b.setOnSeekBarChangeListener(new a());
        h0VarB.f380932f.addTextChangedListener(new b());
        h0VarB.f380932f.setSelectAllOnFocus(true);
        h0VarB.f380932f.setImeOptions(301989894);
    }
}
