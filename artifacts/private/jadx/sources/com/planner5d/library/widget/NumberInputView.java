package com.planner5d.library.widget;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Range;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.databinding.d7;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nNumberInputView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NumberInputView.kt\ncom/planner5d/library/widget/NumberInputView\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,170:1\n55#2,12:171\n84#2,3:183\n1#3:186\n*S KotlinDebug\n*F\n+ 1 NumberInputView.kt\ncom/planner5d/library/widget/NumberInputView\n*L\n62#1:171,12\n62#1:183,3\n*E\n"})
public final class NumberInputView extends ConstraintLayout {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f249477g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f249478h = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f249479i = 10;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private b f249480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final d7 f249481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private String f249482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private BigDecimal f249483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f249484e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private Range<BigDecimal> f249485f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public interface b {
        void a(@NotNull BigDecimal bigDecimal, boolean z10);
    }

    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 NumberInputView.kt\ncom/planner5d/library/widget/NumberInputView\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,82:1\n63#2,5:83\n59#3:88\n62#4:89\n*E\n"})
    public static final class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            NumberInputView numberInputView = NumberInputView.this;
            numberInputView.f249483d = numberInputView.T(editable);
            if (NumberInputView.this.f249484e) {
                b bVar = NumberInputView.this.f249480a;
                BigDecimal bigDecimal = NumberInputView.this.f249483d;
                Intrinsics.checkNotNullExpressionValue(bigDecimal, "access$getNumber$p(...)");
                int i10 = 2 ^ 0;
                bVar.a(bigDecimal, false);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    public static final class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Handler f249487a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f249488b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f249489c;

        d(Handler handler, View view, Function0<Unit> function0) {
            this.f249487a = handler;
            this.f249488b = view;
            this.f249489c = function0;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f249487a.removeCallbacks(this);
            if (this.f249488b.isPressed()) {
                this.f249489c.invoke();
                this.f249487a.postDelayed(this, 10L);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public NumberInputView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void A(NumberInputView numberInputView, View view, boolean z10) {
        if (z10) {
            return;
        }
        numberInputView.O();
    }

    public static void B(NumberInputView numberInputView, View view) {
        numberInputView.J();
    }

    public static void C(NumberInputView numberInputView, View view) {
        numberInputView.K();
    }

    public static boolean D(final NumberInputView numberInputView, d7 d7Var, View view) {
        ImageView numberInputPlus = d7Var.f158865f;
        Intrinsics.checkNotNullExpressionValue(numberInputPlus, "numberInputPlus");
        numberInputView.M(numberInputPlus, new Function0() { // from class: com.planner5d.library.widget.s0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NumberInputView.y(this.f258710a);
            }
        });
        return true;
    }

    private final void J() {
        BigDecimal number = this.f249483d;
        Intrinsics.checkNotNullExpressionValue(number, "number");
        BigDecimal ONE = BigDecimal.ONE;
        Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
        BigDecimal bigDecimalSubtract = number.subtract(ONE);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        this.f249483d = bigDecimalSubtract;
        U();
    }

    private final void K() {
        BigDecimal number = this.f249483d;
        Intrinsics.checkNotNullExpressionValue(number, "number");
        BigDecimal ONE = BigDecimal.ONE;
        Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
        BigDecimal bigDecimalAdd = number.add(ONE);
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        this.f249483d = bigDecimalAdd;
        U();
    }

    private final void M(View view, Function0<Unit> function0) {
        Handler handler = new Handler(Looper.getMainLooper());
        handler.postDelayed(new d(handler, view, function0), 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(BigDecimal value, boolean z10) {
        Intrinsics.checkNotNullParameter(value, "value");
        timber.log.b.f381052a.a("Value changed to " + value + ", immediate=" + z10, new Object[0]);
    }

    private final void O() {
        BigDecimal number = this.f249483d;
        Intrinsics.checkNotNullExpressionValue(number, "number");
        setNumberInternal(number);
        AppCompatEditText appCompatEditText = this.f249481b.f158862c;
        int selectionEnd = appCompatEditText.getSelectionEnd();
        String strValueOf = String.valueOf(appCompatEditText.getText());
        String string = this.f249483d.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        if (strValueOf.compareTo(string) != 0) {
            appCompatEditText.setText(this.f249483d.toString());
            Editable text = appCompatEditText.getText();
            appCompatEditText.setSelection(Math.min(selectionEnd, text != null ? text.length() : 0));
        }
    }

    public static /* synthetic */ void S(NumberInputView numberInputView, BigDecimal bigDecimal, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        numberInputView.R(bigDecimal, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BigDecimal T(Editable editable) {
        BigDecimal bigDecimal;
        try {
            String strValueOf = String.valueOf(editable);
            if (strValueOf.length() == 0) {
                strValueOf = com.facebook.appevents.p.f99189d0;
            }
            bigDecimal = new BigDecimal(strValueOf);
        } catch (NumberFormatException unused) {
            bigDecimal = BigDecimal.ZERO;
        }
        return bigDecimal.setScale(2, 4);
    }

    private final void U() {
        this.f249481b.f158862c.setText(this.f249483d.toString());
        b bVar = this.f249480a;
        BigDecimal number = this.f249483d;
        Intrinsics.checkNotNullExpressionValue(number, "number");
        bVar.a(number, true);
        this.f249481b.f158862c.selectAll();
    }

    private final void setNumberInternal(BigDecimal bigDecimal) {
        BigDecimal bigDecimal2;
        Range<BigDecimal> range = this.f249485f;
        if (range != null && (bigDecimal2 = (BigDecimal) range.clamp(bigDecimal)) != null) {
            bigDecimal = bigDecimal2;
        }
        this.f249483d = bigDecimal;
    }

    public static Unit w(NumberInputView numberInputView) {
        numberInputView.J();
        return Unit.f312394a;
    }

    public static Unit y(NumberInputView numberInputView) {
        numberInputView.K();
        return Unit.f312394a;
    }

    public static boolean z(final NumberInputView numberInputView, d7 d7Var, View view) {
        ImageView numberInputMinus = d7Var.f158864e;
        Intrinsics.checkNotNullExpressionValue(numberInputMinus, "numberInputMinus");
        numberInputView.M(numberInputMinus, new Function0() { // from class: com.planner5d.library.widget.r0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NumberInputView.w(this.f258640a);
            }
        });
        return true;
    }

    public final void L(boolean z10) {
        this.f249481b.f158862c.setEnabled(z10);
    }

    public final void P(@androidx.annotation.f1 int i10, @NotNull com.planner5d.library.model.metricunit.a metricUnit) {
        Intrinsics.checkNotNullParameter(metricUnit, "metricUnit");
        String string = getContext().getText(i10).toString();
        this.f249482c = string;
        this.f249481b.f158863d.setText(String.format("%s, %s", string, metricUnit.g()));
    }

    public final void Q(@androidx.annotation.f1 int i10, @Nullable String str) {
        String str2;
        if (str == null || str.length() == 0) {
            str2 = "";
        } else {
            str2 = ", " + str;
        }
        this.f249481b.f158863d.setText(((Object) getContext().getText(i10)) + str2);
    }

    public final void R(@NotNull BigDecimal number, boolean z10) {
        Intrinsics.checkNotNullParameter(number, "number");
        this.f249483d = number;
        this.f249484e = z10;
        O();
        this.f249484e = true;
    }

    public final void setLabelSize(@androidx.annotation.q int i10) {
        this.f249481b.f158863d.setTextSize(0, getResources().getDimension(i10));
    }

    public final void setMetricUnit(@NotNull com.planner5d.library.model.metricunit.a metricUnit) {
        Intrinsics.checkNotNullParameter(metricUnit, "metricUnit");
        this.f249481b.f158863d.setText(String.format("%s, %s", this.f249482c, metricUnit.g()));
    }

    public final void setOnValueChangeListener(@NotNull b onValueChangeListener) {
        Intrinsics.checkNotNullParameter(onValueChangeListener, "onValueChangeListener");
        this.f249480a = onValueChangeListener;
    }

    public final void setRange(@NotNull Range<BigDecimal> range) {
        Intrinsics.checkNotNullParameter(range, "range");
        this.f249485f = range;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public NumberInputView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ NumberInputView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @oj.j
    public NumberInputView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f249480a = new b() { // from class: com.planner5d.library.widget.t0
            @Override // com.planner5d.library.widget.NumberInputView.b
            public final void a(BigDecimal bigDecimal, boolean z10) {
                NumberInputView.N(bigDecimal, z10);
            }
        };
        final d7 d7VarB = d7.b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(d7VarB, "inflate(...)");
        this.f249481b = d7VarB;
        this.f249482c = "";
        this.f249483d = BigDecimal.ZERO;
        this.f249484e = true;
        d7VarB.f158865f.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.widget.u0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NumberInputView.C(this.f258859a, view);
            }
        });
        d7VarB.f158865f.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.planner5d.library.widget.v0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return NumberInputView.D(this.f258862a, d7VarB, view);
            }
        });
        d7VarB.f158864e.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.widget.w0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NumberInputView.B(this.f258866a, view);
            }
        });
        d7VarB.f158864e.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.planner5d.library.widget.x0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return NumberInputView.z(this.f258876a, d7VarB, view);
            }
        });
        AppCompatEditText numberInputEditText = d7VarB.f158862c;
        Intrinsics.checkNotNullExpressionValue(numberInputEditText, "numberInputEditText");
        numberInputEditText.addTextChangedListener(new c());
        d7VarB.f158862c.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.planner5d.library.widget.y0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                NumberInputView.A(this.f258882a, view, z10);
            }
        });
    }
}
