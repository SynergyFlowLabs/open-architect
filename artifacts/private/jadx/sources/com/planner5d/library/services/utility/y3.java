package com.planner5d.library.services.utility;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nViewUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewUtils.kt\ncom/planner5d/library/services/utility/ViewUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,284:1\n1#2:285\n13409#3,2:286\n*S KotlinDebug\n*F\n+ 1 ViewUtils.kt\ncom/planner5d/library/services/utility/ViewUtils\n*L\n243#1:286,2\n*E\n"})
public final class y3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final y3 f229862a = new y3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f229863b = 1073741823;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oj.f
        public final int f229864a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oj.f
        public final int f229865b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oj.f
        public final int f229866c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @oj.f
        public final int f229867d;

        public a(int i10, int i11, int i12, int i13) {
            this.f229864a = i10;
            this.f229865b = i11;
            this.f229866c = i12;
            this.f229867d = i13;
        }

        public static /* synthetic */ a f(a aVar, int i10, int i11, int i12, int i13, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                i10 = aVar.f229864a;
            }
            if ((i14 & 2) != 0) {
                i11 = aVar.f229865b;
            }
            if ((i14 & 4) != 0) {
                i12 = aVar.f229866c;
            }
            if ((i14 & 8) != 0) {
                i13 = aVar.f229867d;
            }
            return aVar.e(i10, i11, i12, i13);
        }

        public final int a() {
            return this.f229864a;
        }

        public final int b() {
            return this.f229865b;
        }

        public final int c() {
            return this.f229866c;
        }

        public final int d() {
            return this.f229867d;
        }

        @NotNull
        public final a e(int i10, int i11, int i12, int i13) {
            return new a(i10, i11, i12, i13);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f229864a == aVar.f229864a && this.f229865b == aVar.f229865b && this.f229866c == aVar.f229866c && this.f229867d == aVar.f229867d;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.f229864a) * 31) + Integer.hashCode(this.f229865b)) * 31) + Integer.hashCode(this.f229866c)) * 31) + Integer.hashCode(this.f229867d);
        }

        @NotNull
        public String toString() {
            return "RelativePadding(start=" + this.f229864a + ", top=" + this.f229865b + ", end=" + this.f229866c + ", bottom=" + this.f229867d + ")";
        }
    }

    public static final class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.removeOnAttachStateChangeListener(this);
            androidx.core.view.u1.A1(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.services.utility.ViewUtils$textChanges$1", f = "ViewUtils.kt", i = {}, l = {278}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nViewUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewUtils.kt\ncom/planner5d/library/services/utility/ViewUtils$textChanges$1\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,284:1\n48#2,19:285\n84#2,3:304\n*S KotlinDebug\n*F\n+ 1 ViewUtils.kt\ncom/planner5d/library/services/utility/ViewUtils$textChanges$1\n*L\n277#1:285,19\n277#1:304,3\n*E\n"})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.channels.l0<? super Editable>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f229868a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f229869b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TextView f229870c;

        @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 ViewUtils.kt\ncom/planner5d/library/services/utility/ViewUtils$textChanges$1\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 5 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,82:1\n277#2:83\n1#3:84\n59#4:85\n62#5:86\n*E\n"})
        public static final class a implements TextWatcher {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.channels.l0 f229871a;

            public a(kotlinx.coroutines.channels.l0 l0Var) {
                this.f229871a = l0Var;
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                if (editable != null) {
                    this.f229871a.p(editable);
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(TextView textView, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f229870c = textView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit m(TextView textView, TextWatcher textWatcher) {
            textView.removeTextChangedListener(textWatcher);
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = new c(this.f229870c, dVar);
            cVar.f229869b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f229868a;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.channels.l0 l0Var = (kotlinx.coroutines.channels.l0) this.f229869b;
                TextView textView = this.f229870c;
                final a aVar = new a(l0Var);
                textView.addTextChangedListener(aVar);
                final TextView textView2 = this.f229870c;
                Function0 function0 = new Function0() { // from class: com.planner5d.library.services.utility.z3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return y3.c.m(textView2, aVar);
                    }
                };
                this.f229868a = 1;
                if (kotlinx.coroutines.channels.j0.b(l0Var, function0, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.channels.l0<? super Editable> l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(l0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.services.utility.ViewUtils$textChanges$2", f = "ViewUtils.kt", i = {}, l = {280}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.flow.j<? super Editable>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f229872a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f229873b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TextView f229874c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(TextView textView, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f229874c = textView;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            d dVar2 = new d(this.f229874c, dVar);
            dVar2.f229873b = obj;
            return dVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f229872a;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f229873b;
                Editable editableText = this.f229874c.getEditableText();
                Intrinsics.checkNotNullExpressionValue(editableText, "getEditableText(...)");
                this.f229872a = 1;
                if (jVar.emit(editableText, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.flow.j<? super Editable> jVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(jVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    private y3() {
    }

    @oj.j
    @oj.n
    @NotNull
    public static final PopupWindow A(@NotNull View content, @NotNull View anchor, int i10, int i11) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        return H(content, anchor, i10, i11, 0, false, false, false, null, null, 1008, null);
    }

    @oj.j
    @oj.n
    @NotNull
    public static final PopupWindow B(@NotNull View content, @NotNull View anchor, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        return H(content, anchor, i10, i11, i12, false, false, false, null, null, 992, null);
    }

    @oj.j
    @oj.n
    @NotNull
    public static final PopupWindow C(@NotNull View content, @NotNull View anchor, int i10, int i11, int i12, boolean z10) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        return H(content, anchor, i10, i11, i12, z10, false, false, null, null, 960, null);
    }

    @oj.j
    @oj.n
    @NotNull
    public static final PopupWindow D(@NotNull View content, @NotNull View anchor, int i10, int i11, int i12, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        return H(content, anchor, i10, i11, i12, z10, z11, false, null, null, 896, null);
    }

    @oj.j
    @oj.n
    @NotNull
    public static final PopupWindow E(@NotNull View content, @NotNull View anchor, int i10, int i11, int i12, boolean z10, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        return H(content, anchor, i10, i11, i12, z10, z11, z12, null, null, com.google.android.material.internal.p0.f112892a, null);
    }

    @oj.j
    @oj.n
    @NotNull
    public static final PopupWindow F(@NotNull View content, @NotNull View anchor, int i10, int i11, int i12, boolean z10, boolean z11, boolean z12, @Nullable Window window) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        return H(content, anchor, i10, i11, i12, z10, z11, z12, window, null, 512, null);
    }

    @oj.j
    @oj.n
    @NotNull
    public static final PopupWindow G(@NotNull View content, @NotNull View anchor, int i10, int i11, int i12, boolean z10, boolean z11, boolean z12, @Nullable Window window, @Nullable PopupWindow.OnDismissListener onDismissListener) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        y3 y3Var = f229862a;
        PopupWindow popupWindowH = y3Var.h(content, z10, z11, z12, onDismissListener);
        y3Var.u(content, anchor);
        int iIntValue2 = 0;
        if ((i10 & 1) == 1) {
            int i13 = (-content.getMeasuredWidth()) / 2;
            Integer numValueOf = Integer.valueOf(anchor.getWidth());
            if (numValueOf.intValue() == 0) {
                numValueOf = null;
            }
            iIntValue = i13 + ((numValueOf != null ? numValueOf.intValue() : anchor.getMeasuredWidth()) / 2);
        } else {
            iIntValue = 0;
        }
        if ((i10 & 48) == 48) {
            int i14 = -content.getMeasuredHeight();
            Integer numValueOf2 = Integer.valueOf(anchor.getHeight());
            if (numValueOf2.intValue() == 0) {
                numValueOf2 = null;
            }
            iIntValue2 = i14 - (numValueOf2 != null ? numValueOf2.intValue() : anchor.getMeasuredHeight());
        }
        View decorView = window != null ? window.getDecorView() : null;
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            y3Var.f(popupWindowH, viewGroup);
        }
        popupWindowH.showAsDropDown(anchor, iIntValue + i11, iIntValue2 + i12);
        return popupWindowH;
    }

    public static /* synthetic */ PopupWindow H(View view, View view2, int i10, int i11, int i12, boolean z10, boolean z11, boolean z12, Window window, PopupWindow.OnDismissListener onDismissListener, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            i11 = 0;
        }
        if ((i13 & 16) != 0) {
            i12 = 0;
        }
        if ((i13 & 32) != 0) {
            z10 = true;
        }
        if ((i13 & 64) != 0) {
            z11 = true;
        }
        if ((i13 & 128) != 0) {
            z12 = true;
        }
        if ((i13 & 256) != 0) {
            window = null;
        }
        if ((i13 & 512) != 0) {
            onDismissListener = null;
        }
        return G(view, view2, i10, i11, i12, z10, z11, z12, window, onDismissListener);
    }

    public static /* synthetic */ kotlinx.coroutines.flow.i J(y3 y3Var, TextView textView, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = 1000;
        }
        return y3Var.I(textView, j10);
    }

    private final void f(final PopupWindow popupWindow, final ViewGroup viewGroup) {
        popupWindow.setTouchable(false);
        final View view = new View(viewGroup.getContext());
        view.setOnTouchListener(new View.OnTouchListener() { // from class: com.planner5d.library.services.utility.x3
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return y3.g(popupWindow, viewGroup, view, view2, motionEvent);
            }
        });
        viewGroup.addView(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(PopupWindow popupWindow, ViewGroup viewGroup, View view, View view2, MotionEvent motionEvent) {
        popupWindow.dismiss();
        viewGroup.removeView(view);
        return false;
    }

    private final PopupWindow h(View view, boolean z10, boolean z11, boolean z12, PopupWindow.OnDismissListener onDismissListener) {
        final PopupWindow popupWindow = new PopupWindow(view, -2, -2, z11);
        if (onDismissListener != null) {
            popupWindow.setOnDismissListener(onDismissListener);
        }
        if (z10) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.services.utility.v3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    y3.i(popupWindow, view2);
                }
            });
        }
        popupWindow.setClippingEnabled(z12);
        return popupWindow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(PopupWindow popupWindow, View view) {
        popupWindow.dismiss();
    }

    @oj.n
    public static final void j(@NotNull View view, @NotNull final pj.n<? super View, ? super androidx.core.view.g3, ? super a, ? extends androidx.core.view.g3> listener) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(listener, "listener");
        final a aVar = new a(androidx.core.view.u1.n0(view), view.getPaddingTop(), androidx.core.view.u1.m0(view), view.getPaddingBottom());
        androidx.core.view.u1.j2(view, new androidx.core.view.b1() { // from class: com.planner5d.library.services.utility.w3
            @Override // androidx.core.view.b1
            public final androidx.core.view.g3 b(View view2, androidx.core.view.g3 g3Var) {
                return y3.k(listener, aVar, view2, g3Var);
            }
        });
        f229862a.v(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.core.view.g3 k(pj.n nVar, a aVar, View v10, androidx.core.view.g3 insets) {
        Intrinsics.checkNotNullParameter(v10, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        return (androidx.core.view.g3) nVar.invoke(v10, insets, a.f(aVar, 0, 0, 0, 0, 15, null));
    }

    public static /* synthetic */ Object n(y3 y3Var, ViewParent viewParent, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        do {
            Intrinsics.reifiedOperationMarker(3, androidx.exifinterface.media.a.f51379e5);
            if (viewParent != null) {
                return viewParent;
            }
            viewParent = viewParent != null ? viewParent.getParent() : null;
        } while (viewParent != null);
        if (z10) {
            timber.log.b.f381052a.e(new RuntimeException("Expected parent not found"));
        }
        return null;
    }

    private final Drawable o(View view, @androidx.annotation.n int i10, @androidx.annotation.q int i11, @androidx.annotation.n int i12, @androidx.annotation.q int i13, @androidx.annotation.q int i14) {
        float[] fArr = new float[8];
        for (int i15 = 0; i15 < 8; i15++) {
            fArr[i15] = view.getContext().getResources().getDimension(i11);
        }
        int dimension = (int) view.getContext().getResources().getDimension(i13);
        int dimension2 = (int) view.getContext().getResources().getDimension(i14);
        Rect rect = new Rect();
        rect.left = dimension2;
        rect.right = dimension2;
        rect.top = dimension;
        rect.bottom = dimension;
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setPadding(rect);
        Paint paint = shapeDrawable.getPaint();
        paint.setColor(androidx.core.content.d.g(view.getContext(), i10));
        paint.setShadowLayer(Math.max(dimension, dimension2), 0.0f, 0.0f, androidx.core.content.d.g(view.getContext(), i12));
        int i16 = 5 >> 0;
        shapeDrawable.setShape(new RoundRectShape(fArr, null, null));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable});
        layerDrawable.setLayerInset(0, dimension2, dimension, dimension2, dimension);
        return layerDrawable;
    }

    @oj.n
    @Nullable
    public static final ColorStateList p(@NotNull Context context, @NotNull TypedArray attributes, @androidx.annotation.h1 int i10) {
        int resourceId;
        ColorStateList colorStateListA;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        return (!attributes.hasValue(i10) || (resourceId = attributes.getResourceId(i10, 0)) == 0 || (colorStateListA = j.a.a(context, resourceId)) == null) ? attributes.getColorStateList(i10) : colorStateListA;
    }

    @oj.n
    public static final boolean t(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return androidx.core.view.u1.c0(view) == 1;
    }

    private final void u(View... viewArr) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(1073741823, Integer.MIN_VALUE);
        for (View view : viewArr) {
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        }
    }

    private final void v(View view) {
        if (androidx.core.view.u1.R0(view)) {
            androidx.core.view.u1.A1(view);
        } else {
            view.addOnAttachStateChangeListener(new b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(Function0 function0) {
        function0.invoke();
    }

    @oj.j
    @oj.n
    @NotNull
    public static final PopupWindow z(@NotNull View content, @NotNull View anchor, int i10) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        return H(content, anchor, i10, 0, 0, false, false, false, null, null, 1016, null);
    }

    @NotNull
    public final kotlinx.coroutines.flow.i<Editable> I(@NotNull TextView textView, long j10) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        int i10 = 3 >> 0;
        return kotlinx.coroutines.flow.k.c0(kotlinx.coroutines.flow.k.o1(kotlinx.coroutines.flow.k.t(new c(textView, null)), new d(textView, null)), j10);
    }

    public final void e(@NotNull View view, @androidx.annotation.n int i10, @androidx.annotation.q int i11, @androidx.annotation.n int i12, @androidx.annotation.q int i13, @androidx.annotation.q int i14) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        int i15 = (7 ^ 2) ^ 0;
        view.setLayerType(2, null);
        view.setBackground(o(view, i10, i11, i12, i13, i14));
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    @NotNull
    public final androidx.core.view.l0 l(@NotNull Fragment fragment) throws IllegalStateException {
        androidx.core.view.l0 menuHost;
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Fragment parentFragment = fragment.getParentFragment();
        if (parentFragment != 0) {
            if (parentFragment instanceof androidx.core.view.l0) {
                menuHost = (androidx.core.view.l0) parentFragment;
            } else {
                menuHost = parentFragment instanceof z1 ? ((z1) parentFragment).getMenuHost() : f229862a.l(parentFragment);
            }
            if (menuHost != null) {
                return menuHost;
            }
        }
        androidx.fragment.app.s activity = fragment.getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("No MenuHost or MenuHostProvider is found");
    }

    public final /* synthetic */ <T> T m(ViewParent viewParent, boolean z10) {
        do {
            Intrinsics.reifiedOperationMarker(3, androidx.exifinterface.media.a.f51379e5);
            if (viewParent != null) {
                return (T) viewParent;
            }
            viewParent = viewParent != null ? (T) viewParent.getParent() : null;
        } while (viewParent != null);
        if (z10) {
            timber.log.b.f381052a.e(new RuntimeException("Expected parent not found"));
        }
        return null;
    }

    @NotNull
    public final Rect q(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect;
    }

    @Nullable
    public final u2 r(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        RecyclerView.p layoutManager = recyclerView.getLayoutManager();
        Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int iB2 = linearLayoutManager.B2();
        View viewO = linearLayoutManager.O(iB2);
        if (viewO != null) {
            return new u2(iB2, viewO.getTop(), linearLayoutManager.E2());
        }
        return null;
    }

    public final boolean s(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        if (!activity.isFinishing() && !activity.isDestroyed()) {
            return false;
        }
        return true;
    }

    public final void w(@NotNull RecyclerView recyclerView, @NotNull final Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        if (recyclerView.R0()) {
            recyclerView.post(new Runnable() { // from class: com.planner5d.library.services.utility.u3
                @Override // java.lang.Runnable
                public final void run() {
                    y3.x(block);
                }
            });
        } else {
            block.invoke();
        }
    }

    public final void y(@NotNull RecyclerView recyclerView, @NotNull u2 position) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        Intrinsics.checkNotNullParameter(position, "position");
        RecyclerView.h adapter = recyclerView.getAdapter();
        if (adapter != null && adapter.getItemCount() > position.a()) {
            RecyclerView.p layoutManager = recyclerView.getLayoutManager();
            Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            ((LinearLayoutManager) layoutManager).h3(position.c(), position.b());
        }
    }
}
