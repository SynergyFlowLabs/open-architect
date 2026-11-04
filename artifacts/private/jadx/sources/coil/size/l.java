package coil.size;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.n;
import kotlinx.coroutines.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nViewSizeResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewSizeResolver.kt\ncoil/size/ViewSizeResolver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,118:1\n1#2:119\n318#3,11:120\n*S KotlinDebug\n*F\n+ 1 ViewSizeResolver.kt\ncoil/size/ViewSizeResolver\n*L\n42#1:120,11\n*E\n"})
public interface l<T extends View> extends j {

    public static final class a {
        @Deprecated
        public static <T extends View> boolean a(@NotNull l<T> lVar) {
            return l.super.f();
        }

        @Deprecated
        @Nullable
        public static <T extends View> Object b(@NotNull l<T> lVar, @NotNull kotlin.coroutines.d<? super i> dVar) {
            return l.super.a(dVar);
        }
    }

    static final class b implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l<T> f87786a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewTreeObserver f87787b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f87788c;

        b(l<T> lVar, ViewTreeObserver viewTreeObserver, c cVar) {
            this.f87786a = lVar;
            this.f87787b = viewTreeObserver;
            this.f87788c = cVar;
        }

        public final void c(Throwable th2) {
            this.f87786a.e(this.f87787b, this.f87788c);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            c(th2);
            return Unit.f312394a;
        }
    }

    public static final class c implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f87789a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l<T> f87790b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ViewTreeObserver f87791c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ n<i> f87792d;

        /* JADX WARN: Multi-variable type inference failed */
        c(l<T> lVar, ViewTreeObserver viewTreeObserver, n<? super i> nVar) {
            this.f87790b = lVar;
            this.f87791c = viewTreeObserver;
            this.f87792d = nVar;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            i size = this.f87790b.getSize();
            if (size != null) {
                this.f87790b.e(this.f87791c, this);
                if (!this.f87789a) {
                    this.f87789a = true;
                    n<i> nVar = this.f87792d;
                    Result.a aVar = Result.Companion;
                    nVar.resumeWith(Result.m785constructorimpl(size));
                }
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    default void e(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
        } else {
            getView().getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
        }
    }

    static /* synthetic */ <T extends View> Object g(l<T> lVar, kotlin.coroutines.d<? super i> dVar) {
        i size = lVar.getSize();
        if (size != null) {
            return size;
        }
        p pVar = new p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        pVar.p0();
        ViewTreeObserver viewTreeObserver = lVar.getView().getViewTreeObserver();
        c cVar = new c(lVar, viewTreeObserver, pVar);
        viewTreeObserver.addOnPreDrawListener(cVar);
        pVar.e0(new b(lVar, viewTreeObserver, cVar));
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objU;
    }

    private default coil.size.c getHeight() {
        ViewGroup.LayoutParams layoutParams = getView().getLayoutParams();
        return h(layoutParams != null ? layoutParams.height : -1, getView().getHeight(), f() ? getView().getPaddingTop() + getView().getPaddingBottom() : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    default i getSize() {
        coil.size.c height;
        coil.size.c width = getWidth();
        if (width == null || (height = getHeight()) == null) {
            return null;
        }
        return new i(width, height);
    }

    private default coil.size.c getWidth() {
        ViewGroup.LayoutParams layoutParams = getView().getLayoutParams();
        return h(layoutParams != null ? layoutParams.width : -1, getView().getWidth(), f() ? getView().getPaddingLeft() + getView().getPaddingRight() : 0);
    }

    private default coil.size.c h(int i10, int i11, int i12) {
        if (i10 == -2) {
            return coil.size.c.b.f87768a;
        }
        int i13 = i10 - i12;
        if (i13 > 0) {
            return coil.size.a.a(i13);
        }
        int i14 = i11 - i12;
        if (i14 > 0) {
            return coil.size.a.a(i14);
        }
        return null;
    }

    @Override // coil.size.j
    @Nullable
    default Object a(@NotNull kotlin.coroutines.d<? super i> dVar) {
        return g(this, dVar);
    }

    default boolean f() {
        return true;
    }

    @NotNull
    T getView();
}
