package com.planner5d.library.widget.preloader;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.j1;
import androidx.lifecycle.n2;
import androidx.lifecycle.o0;
import androidx.lifecycle.p0;
import com.planner5d.library.widget.c1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i1;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nPreloaderAnimationView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreloaderAnimationView.kt\ncom/planner5d/library/widget/preloader/PreloaderAnimationView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,76:1\n93#2,15:77\n*S KotlinDebug\n*F\n+ 1 PreloaderAnimationView.kt\ncom/planner5d/library/widget/preloader/PreloaderAnimationView\n*L\n32#1:77,15\n*E\n"})
public final class PreloaderAnimationView extends ConstraintLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f258447c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final te.f0 f258448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f258449b;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.preloader.PreloaderAnimationView", f = "PreloaderAnimationView.kt", i = {0, 0, 0}, l = {67, com.planner5d.library.engine.input.f.b.C0}, m = "scrollIndefinitely", n = {"this", "row", "interval"}, s = {"L$0", "L$1", "J$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f258450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f258451b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f258452c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f258453d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f258455f;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f258453d = obj;
            this.f258455f |= Integer.MIN_VALUE;
            return PreloaderAnimationView.this.z(null, 0L, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.preloader.PreloaderAnimationView$setupTextSwitcher$2$1", f = "PreloaderAnimationView.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160707m}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f258456a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o0 f258457b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PreloaderAnimationView f258458c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String[] f258459d;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.preloader.PreloaderAnimationView$setupTextSwitcher$2$1$1", f = "PreloaderAnimationView.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160710n}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f258460a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ PreloaderAnimationView f258461b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String[] f258462c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(PreloaderAnimationView preloaderAnimationView, String[] strArr, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f258461b = preloaderAnimationView;
                this.f258462c = strArr;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f258461b, this.f258462c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f258460a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    PreloaderAnimationView preloaderAnimationView = this.f258461b;
                    String[] strArr = this.f258462c;
                    long integer = preloaderAnimationView.getResources().getInteger(c1.j.f252069d);
                    this.f258460a = 1;
                    if (preloaderAnimationView.z(strArr, integer, this) == objL) {
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
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(o0 o0Var, PreloaderAnimationView preloaderAnimationView, String[] strArr, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f258457b = o0Var;
            this.f258458c = preloaderAnimationView;
            this.f258459d = strArr;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f258457b, this.f258458c, this.f258459d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f258456a;
            if (i10 == 0) {
                ResultKt.m(obj);
                o0 o0Var = this.f258457b;
                androidx.lifecycle.c0.b bVar = androidx.lifecycle.c0.b.STARTED;
                a aVar = new a(this.f258458c, this.f258459d, null);
                this.f258456a = 1;
                if (j1.b(o0Var, bVar, aVar, this) == objL) {
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
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @SourceDebugExtension({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnAttach$1\n+ 2 PreloaderAnimationView.kt\ncom/planner5d/library/widget/preloader/PreloaderAnimationView\n*L\n1#1,103:1\n33#2,2:104\n*E\n"})
    public static final class c implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f258463a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ PreloaderAnimationView f258464b;

        public c(View view, PreloaderAnimationView preloaderAnimationView) {
            this.f258463a = view;
            this.f258464b = preloaderAnimationView;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f258463a.removeOnAttachStateChangeListener(this);
            this.f258464b.A();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public PreloaderAnimationView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A() {
        final i1.h hVar = new i1.h();
        String[] strArr = {getContext().getString(c1.q.U6), getContext().getString(c1.q.V6), getContext().getString(c1.q.W6), getContext().getString(c1.q.X6), getContext().getString(c1.q.Y6)};
        this.f258448a.f380909c.setFactory(new ViewSwitcher.ViewFactory() { // from class: com.planner5d.library.widget.preloader.k
            @Override // android.widget.ViewSwitcher.ViewFactory
            public final View makeView() {
                return PreloaderAnimationView.B(hVar, this);
            }
        });
        this.f258448a.f380909c.setText(strArr[this.f258449b]);
        View root = this.f258448a.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        o0 o0VarA = n2.a(root);
        if (o0VarA == null || kotlinx.coroutines.k.f(p0.a(o0VarA), null, null, new b(o0VarA, this, strArr, null), 3, null) == null) {
            timber.log.b.f381052a.x("Unable to launch animation because lifecycle owner was not found", new Object[0]);
            Unit unit = Unit.f312394a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, android.widget.TextView] */
    public static final View B(i1.h hVar, PreloaderAnimationView preloaderAnimationView) {
        ?? textView = new TextView(preloaderAnimationView.getContext());
        hVar.f312751a = textView;
        textView.setTextColor(androidx.core.content.d.g(preloaderAnimationView.getContext(), c1.e.Ye));
        ((TextView) hVar.f312751a).setTextAppearance(c1.r.L7);
        ((TextView) hVar.f312751a).setGravity(1);
        ((TextView) hVar.f312751a).setLineHeight(preloaderAnimationView.getResources().getDimensionPixelSize(c1.f.Ad));
        return (View) hVar.f312751a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009a, code lost:
    
        if (r6.z(r7, r8, r0) == r1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(java.lang.String[] r7, long r8, kotlin.coroutines.d<? super kotlin.Unit> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.planner5d.library.widget.preloader.PreloaderAnimationView.a
            if (r0 == 0) goto L15
            r0 = r10
            r5 = 1
            com.planner5d.library.widget.preloader.PreloaderAnimationView$a r0 = (com.planner5d.library.widget.preloader.PreloaderAnimationView.a) r0
            int r1 = r0.f258455f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L15
            int r1 = r1 - r2
            r5 = 7
            r0.f258455f = r1
            goto L1a
        L15:
            com.planner5d.library.widget.preloader.PreloaderAnimationView$a r0 = new com.planner5d.library.widget.preloader.PreloaderAnimationView$a
            r0.<init>(r10)
        L1a:
            java.lang.Object r10 = r0.f258453d
            r5 = 5
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            r5 = 0
            int r2 = r0.f258455f
            r5 = 5
            r3 = 2
            r5 = 3
            r4 = 1
            r5 = 1
            if (r2 == 0) goto L56
            if (r2 == r4) goto L42
            r5 = 4
            if (r2 != r3) goto L36
            r5 = 6
            kotlin.ResultKt.m(r10)
            r5 = 6
            goto L9e
        L36:
            r5 = 3
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "torm iebuve///eou  r/ohs/crit o /cntaeeik/of/enlw m"
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r5 = 1
            r6.<init>(r7)
            throw r6
        L42:
            long r8 = r0.f258452c
            java.lang.Object r6 = r0.f258451b
            r7 = r6
            r7 = r6
            java.lang.String[] r7 = (java.lang.String[]) r7
            r5 = 0
            java.lang.Object r6 = r0.f258450a
            r5 = 1
            com.planner5d.library.widget.preloader.PreloaderAnimationView r6 = (com.planner5d.library.widget.preloader.PreloaderAnimationView) r6
            r5 = 7
            kotlin.ResultKt.m(r10)
            r5 = 6
            goto L69
        L56:
            r5 = 2
            kotlin.ResultKt.m(r10)
            r0.f258450a = r6
            r0.f258451b = r7
            r0.f258452c = r8
            r0.f258455f = r4
            java.lang.Object r10 = kotlinx.coroutines.d1.b(r8, r0)
            if (r10 != r1) goto L69
            goto L9c
        L69:
            int r10 = r6.f258449b
            int r2 = r7.length
            r5 = 3
            int r2 = r2 - r4
            if (r10 != r2) goto L80
            r10 = 0
            r6.f258449b = r10
            r5 = 2
            te.f0 r2 = r6.f258448a
            r5 = 1
            android.widget.TextSwitcher r2 = r2.f380909c
            r5 = 4
            r10 = r7[r10]
            r2.setText(r10)
            goto L8d
        L80:
            te.f0 r2 = r6.f258448a
            android.widget.TextSwitcher r2 = r2.f380909c
            int r10 = r10 + r4
            r6.f258449b = r10
            r5 = 0
            r10 = r7[r10]
            r2.setText(r10)
        L8d:
            r5 = 7
            r10 = 0
            r0.f258450a = r10
            r0.f258451b = r10
            r5 = 3
            r0.f258455f = r3
            java.lang.Object r6 = r6.z(r7, r8, r0)
            if (r6 != r1) goto L9e
        L9c:
            r5 = 4
            return r1
        L9e:
            kotlin.Unit r6 = kotlin.Unit.f312394a
            r5 = 5
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.widget.preloader.PreloaderAnimationView.z(java.lang.String[], long, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public PreloaderAnimationView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PreloaderAnimationView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        attributeSet = (i11 & 2) != 0 ? null : attributeSet;
        if ((i11 & 4) != 0) {
            i10 = 0;
            int i12 = 4 << 0;
        }
        this(context, attributeSet, i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @oj.j
    public PreloaderAnimationView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        te.f0 f0VarB = te.f0.b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(f0VarB, "inflate(...)");
        this.f258448a = f0VarB;
        f0VarB.getRoot().setBackgroundColor(androidx.core.content.d.g(context, c1.e.f250389cm));
        setClickable(true);
        setFocusable(true);
        if (isAttachedToWindow()) {
            A();
        } else {
            addOnAttachStateChangeListener(new c(this, this));
        }
    }
}
