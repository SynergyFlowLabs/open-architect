package androidx.activity;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.w0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class n0 {

    static final class a<T> implements kotlinx.coroutines.flow.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f9966a;

        a(Activity activity) {
            this.f9966a = activity;
        }

        @Override // kotlinx.coroutines.flow.j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(Rect rect, kotlin.coroutines.d<? super Unit> dVar) {
            androidx.activity.b.f9792a.a(this.f9966a, rect);
            return Unit.f312394a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1", f = "PipHintTracker.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160702k0}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.channels.l0<? super Rect>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f9967a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f9968b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f9969c;

        static final class a extends kotlin.jvm.internal.l0 implements Function0<Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ View f9970a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnScrollChangedListener f9971b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ View.OnLayoutChangeListener f9972c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ ViewOnAttachStateChangeListenerC0025b f9973d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener, View.OnLayoutChangeListener onLayoutChangeListener, ViewOnAttachStateChangeListenerC0025b viewOnAttachStateChangeListenerC0025b) {
                super(0);
                this.f9970a = view;
                this.f9971b = onScrollChangedListener;
                this.f9972c = onLayoutChangeListener;
                this.f9973d = viewOnAttachStateChangeListenerC0025b;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f312394a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f9970a.getViewTreeObserver().removeOnScrollChangedListener(this.f9971b);
                this.f9970a.removeOnLayoutChangeListener(this.f9972c);
                this.f9970a.removeOnAttachStateChangeListener(this.f9973d);
            }
        }

        /* JADX INFO: renamed from: androidx.activity.n0$b$b, reason: collision with other inner class name */
        public static final class ViewOnAttachStateChangeListenerC0025b implements View.OnAttachStateChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.channels.l0<Rect> f9974a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f9975b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnScrollChangedListener f9976c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ View.OnLayoutChangeListener f9977d;

            /* JADX WARN: Multi-variable type inference failed */
            ViewOnAttachStateChangeListenerC0025b(kotlinx.coroutines.channels.l0<? super Rect> l0Var, View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener, View.OnLayoutChangeListener onLayoutChangeListener) {
                this.f9974a = l0Var;
                this.f9975b = view;
                this.f9976c = onScrollChangedListener;
                this.f9977d = onLayoutChangeListener;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v10) {
                Intrinsics.checkNotNullParameter(v10, "v");
                this.f9974a.p(n0.c(this.f9975b));
                this.f9975b.getViewTreeObserver().addOnScrollChangedListener(this.f9976c);
                this.f9975b.addOnLayoutChangeListener(this.f9977d);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v10) {
                Intrinsics.checkNotNullParameter(v10, "v");
                v10.getViewTreeObserver().removeOnScrollChangedListener(this.f9976c);
                v10.removeOnLayoutChangeListener(this.f9977d);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(View view, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f9969c = view;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void n(kotlinx.coroutines.channels.l0 l0Var, View v10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            if (i10 == i14 && i12 == i16 && i11 == i15 && i13 == i17) {
                return;
            }
            Intrinsics.checkNotNullExpressionValue(v10, "v");
            l0Var.p(n0.c(v10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void s(kotlinx.coroutines.channels.l0 l0Var, View view) {
            l0Var.p(n0.c(view));
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f9969c, dVar);
            bVar.f9968b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f9967a;
            if (i10 == 0) {
                ResultKt.m(obj);
                final kotlinx.coroutines.channels.l0 l0Var = (kotlinx.coroutines.channels.l0) this.f9968b;
                View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: androidx.activity.o0
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                        n0.b.n(l0Var, view, i11, i12, i13, i14, i15, i16, i17, i18);
                    }
                };
                final View view = this.f9969c;
                ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: androidx.activity.p0
                    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                    public final void onScrollChanged() {
                        n0.b.s(l0Var, view);
                    }
                };
                ViewOnAttachStateChangeListenerC0025b viewOnAttachStateChangeListenerC0025b = new ViewOnAttachStateChangeListenerC0025b(l0Var, this.f9969c, onScrollChangedListener, onLayoutChangeListener);
                if (this.f9969c.isAttachedToWindow()) {
                    l0Var.p(n0.c(this.f9969c));
                    this.f9969c.getViewTreeObserver().addOnScrollChangedListener(onScrollChangedListener);
                    this.f9969c.addOnLayoutChangeListener(onLayoutChangeListener);
                }
                this.f9969c.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0025b);
                a aVar = new a(this.f9969c, onScrollChangedListener, onLayoutChangeListener, viewOnAttachStateChangeListenerC0025b);
                this.f9967a = 1;
                if (kotlinx.coroutines.channels.j0.b(l0Var, aVar, this) == objL) {
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
        public final Object invoke(kotlinx.coroutines.channels.l0<? super Rect> l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(l0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @w0(26)
    @Nullable
    public static final Object b(@NotNull Activity activity, @NotNull View view, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objCollect = kotlinx.coroutines.flow.k.t(new b(view, null)).collect(new a(activity), dVar);
        return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect c(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect;
    }
}
