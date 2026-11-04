package androidx.core.view;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt\n+ 2 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n*L\n1#1,415:1\n37#1,2:416\n55#1:418\n327#1,4:422\n42#2,3:419\n*S KotlinDebug\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt\n*L\n70#1:416,2\n70#1:418\n311#1:422,4\n233#1:419,3\n*E\n"})
public final class c2 {

    @kotlin.coroutines.jvm.internal.f(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", i = {0}, l = {410, 412}, m = "invokeSuspend", n = {"$this$sequence"}, s = {"L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.k implements Function2<kotlin.sequences.n<? super View>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f48622a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f48623b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f48624c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f48624c = view;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f48624c, dVar);
            aVar.f48623b = obj;
            return aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
        
            if (r1.f(r6, r5) == r0) goto L18;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r4 = 7
                int r1 = r5.f48622a
                r4 = 6
                r2 = 2
                r4 = 0
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L29
                if (r1 == r3) goto L21
                r4 = 2
                if (r1 != r2) goto L19
                r4 = 0
                kotlin.ResultKt.m(r6)
                r4 = 1
                goto L5c
            L19:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L21:
                java.lang.Object r1 = r5.f48623b
                kotlin.sequences.n r1 = (kotlin.sequences.n) r1
                kotlin.ResultKt.m(r6)
                goto L40
            L29:
                kotlin.ResultKt.m(r6)
                java.lang.Object r6 = r5.f48623b
                r1 = r6
                r4 = 5
                kotlin.sequences.n r1 = (kotlin.sequences.n) r1
                android.view.View r6 = r5.f48624c
                r5.f48623b = r1
                r4 = 4
                r5.f48622a = r3
                java.lang.Object r6 = r1.b(r6, r5)
                if (r6 != r0) goto L40
                goto L5a
            L40:
                r4 = 1
                android.view.View r6 = r5.f48624c
                boolean r3 = r6 instanceof android.view.ViewGroup
                if (r3 == 0) goto L5c
                r4 = 0
                android.view.ViewGroup r6 = (android.view.ViewGroup) r6
                r4 = 5
                kotlin.sequences.Sequence r6 = androidx.core.view.a2.f(r6)
                r3 = 0
                r5.f48623b = r3
                r5.f48622a = r2
                java.lang.Object r5 = r1.f(r6, r5)
                if (r5 != r0) goto L5c
            L5a:
                r4 = 2
                return r0
            L5c:
                kotlin.Unit r5 = kotlin.Unit.f312394a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.c2.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlin.sequences.n<? super View> nVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(nVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* synthetic */ class b extends kotlin.jvm.internal.g0 implements Function1<ViewParent, ViewParent> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f48625a = new b();

        b() {
            super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final ViewParent invoke(ViewParent viewParent) {
            return viewParent.getParent();
        }
    }

    public static final class c implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f48626a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<View, Unit> f48627b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(View view, Function1<? super View, Unit> function1) {
            this.f48626a = view;
            this.f48627b = function1;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f48626a.removeOnAttachStateChangeListener(this);
            this.f48627b.invoke(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public static final class d implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f48628a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<View, Unit> f48629b;

        /* JADX WARN: Multi-variable type inference failed */
        public d(View view, Function1<? super View, Unit> function1) {
            this.f48628a = view;
            this.f48629b = function1;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            this.f48628a.removeOnAttachStateChangeListener(this);
            this.f48629b.invoke(view);
        }
    }

    @SourceDebugExtension({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnNextLayout$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,52:1\n70#2:53\n*E\n"})
    public static final class e implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f48630a;

        public e(Function1 function1) {
            this.f48630a = function1;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            view.removeOnLayoutChangeListener(this);
            this.f48630a.invoke(view);
        }
    }

    public static final class f implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<View, Unit> f48631a;

        /* JADX WARN: Multi-variable type inference failed */
        public f(Function1<? super View, Unit> function1) {
            this.f48631a = function1;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            view.removeOnLayoutChangeListener(this);
            this.f48631a.invoke(view);
        }
    }

    public static final class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<View, Unit> f48632a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f48633b;

        /* JADX WARN: Multi-variable type inference failed */
        public g(Function1<? super View, Unit> function1, View view) {
            this.f48632a = function1;
            this.f48633b = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f48632a.invoke(this.f48633b);
        }
    }

    public static final class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f48634a;

        public h(Function0<Unit> function0) {
            this.f48634a = function0;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f48634a.invoke();
        }
    }

    public static final void A(@NotNull View view, @NotNull Function1<? super ViewGroup.LayoutParams, Unit> function1) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        function1.invoke(layoutParams);
        view.setLayoutParams(layoutParams);
    }

    @oj.i(name = "updateLayoutParamsTyped")
    public static final /* synthetic */ <T extends ViewGroup.LayoutParams> void B(View view, Function1<? super T, Unit> function1) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.reifiedOperationMarker(1, androidx.exifinterface.media.a.f51379e5);
        function1.invoke(layoutParams);
        view.setLayoutParams(layoutParams);
    }

    public static final void C(@NotNull View view, @androidx.annotation.t0 int i10, @androidx.annotation.t0 int i11, @androidx.annotation.t0 int i12, @androidx.annotation.t0 int i13) {
        view.setPadding(i10, i11, i12, i13);
    }

    public static /* synthetic */ void D(View view, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = view.getPaddingLeft();
        }
        if ((i14 & 2) != 0) {
            i11 = view.getPaddingTop();
        }
        if ((i14 & 4) != 0) {
            i12 = view.getPaddingRight();
        }
        if ((i14 & 8) != 0) {
            i13 = view.getPaddingBottom();
        }
        view.setPadding(i10, i11, i12, i13);
    }

    public static final void E(@NotNull View view, @androidx.annotation.t0 int i10, @androidx.annotation.t0 int i11, @androidx.annotation.t0 int i12, @androidx.annotation.t0 int i13) {
        view.setPaddingRelative(i10, i11, i12, i13);
    }

    public static /* synthetic */ void F(View view, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = view.getPaddingStart();
        }
        if ((i14 & 2) != 0) {
            i11 = view.getPaddingTop();
        }
        if ((i14 & 4) != 0) {
            i12 = view.getPaddingEnd();
        }
        if ((i14 & 8) != 0) {
            i13 = view.getPaddingBottom();
        }
        view.setPaddingRelative(i10, i11, i12, i13);
    }

    public static final void b(@NotNull View view, @NotNull Function1<? super View, Unit> function1) {
        if (view.isAttachedToWindow()) {
            function1.invoke(view);
        } else {
            view.addOnAttachStateChangeListener(new c(view, function1));
        }
    }

    public static final void c(@NotNull View view, @NotNull Function1<? super View, Unit> function1) {
        if (view.isAttachedToWindow()) {
            view.addOnAttachStateChangeListener(new d(view, function1));
        } else {
            function1.invoke(view);
        }
    }

    public static final void d(@NotNull View view, @NotNull Function1<? super View, Unit> function1) {
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new e(function1));
        } else {
            function1.invoke(view);
        }
    }

    public static final void e(@NotNull View view, @NotNull Function1<? super View, Unit> function1) {
        view.addOnLayoutChangeListener(new f(function1));
    }

    @NotNull
    public static final e1 f(@NotNull View view, @NotNull Function1<? super View, Unit> function1) {
        return e1.a(view, new g(function1, view));
    }

    @NotNull
    public static final Bitmap g(@NotNull View view, @NotNull Bitmap.Config config) {
        if (!view.isLaidOut()) {
            throw new IllegalStateException("View needs to be laid out before calling drawToBitmap()");
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.translate(-view.getScrollX(), -view.getScrollY());
        view.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static /* synthetic */ Bitmap h(View view, Bitmap.Config config, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        return g(view, config);
    }

    @NotNull
    public static final Sequence<View> i(@NotNull View view) {
        return kotlin.sequences.o.b(new a(view, null));
    }

    @NotNull
    public static final Sequence<ViewParent> j(@NotNull View view) {
        return kotlin.sequences.o.l(view.getParent(), b.f48625a);
    }

    public static final int k(@NotNull View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.bottomMargin;
        }
        return 0;
    }

    public static final int l(@NotNull View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd();
        }
        return 0;
    }

    public static final int m(@NotNull View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.leftMargin;
        }
        return 0;
    }

    public static final int n(@NotNull View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.rightMargin;
        }
        return 0;
    }

    public static final int o(@NotNull View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
        }
        return 0;
    }

    public static final int p(@NotNull View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.topMargin;
        }
        return 0;
    }

    public static final boolean q(@NotNull View view) {
        return view.getVisibility() == 8;
    }

    public static final boolean r(@NotNull View view) {
        return view.getVisibility() == 4;
    }

    public static final boolean s(@NotNull View view) {
        return view.getVisibility() == 0;
    }

    @NotNull
    public static final Runnable t(@NotNull View view, long j10, @NotNull Function0<Unit> function0) {
        h hVar = new h(function0);
        view.postDelayed(hVar, j10);
        return hVar;
    }

    @NotNull
    public static final Runnable u(@NotNull View view, long j10, @NotNull final Function0<Unit> function0) {
        Runnable runnable = new Runnable() { // from class: androidx.core.view.b2
            @Override // java.lang.Runnable
            public final void run() {
                c2.v(function0);
            }
        };
        view.postOnAnimationDelayed(runnable, j10);
        return runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(Function0 function0) {
        function0.invoke();
    }

    public static final void w(@NotNull View view, boolean z10) {
        view.setVisibility(z10 ? 8 : 0);
    }

    public static final void x(@NotNull View view, boolean z10) {
        view.setVisibility(z10 ? 4 : 0);
    }

    public static final void y(@NotNull View view, @androidx.annotation.t0 int i10) {
        view.setPadding(i10, i10, i10, i10);
    }

    public static final void z(@NotNull View view, boolean z10) {
        view.setVisibility(z10 ? 0 : 8);
    }
}
