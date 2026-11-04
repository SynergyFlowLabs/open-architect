package androidx.slidingpanelayout.widget;

import android.app.Activity;
import androidx.window.layout.h;
import androidx.window.layout.m;
import androidx.window.layout.t;
import androidx.window.layout.x;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.b2;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final t f75298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Executor f75299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private p2 f75300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private InterfaceC0750a f75301d;

    /* JADX INFO: renamed from: androidx.slidingpanelayout.widget.a$a, reason: collision with other inner class name */
    public interface InterfaceC0750a {
        void a(@NotNull m mVar);
    }

    @f(c = "androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1", f = "FoldingFeatureObserver.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160715o1}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends o implements Function2<s0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f75302a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f75304c;

        /* JADX INFO: renamed from: androidx.slidingpanelayout.widget.a$b$a, reason: collision with other inner class name */
        public static final class C0751a implements j<m> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ a f75305a;

            public C0751a(a aVar) {
                this.f75305a = aVar;
            }

            @Override // kotlinx.coroutines.flow.j
            @Nullable
            public Object emit(m mVar, @NotNull d<? super Unit> dVar) {
                Unit unit;
                m mVar2 = mVar;
                InterfaceC0750a interfaceC0750a = this.f75305a.f75301d;
                if (interfaceC0750a == null) {
                    unit = null;
                } else {
                    interfaceC0750a.a(mVar2);
                    unit = Unit.f312394a;
                }
                return unit == kotlin.coroutines.intrinsics.b.l() ? unit : Unit.f312394a;
            }
        }

        /* JADX INFO: renamed from: androidx.slidingpanelayout.widget.a$b$b, reason: collision with other inner class name */
        public static final class C0752b implements i<m> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ i f75306a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f75307b;

            /* JADX INFO: renamed from: androidx.slidingpanelayout.widget.a$b$b$a, reason: collision with other inner class name */
            public static final class C0753a implements j<x> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ j f75308a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ a f75309b;

                /* JADX INFO: renamed from: androidx.slidingpanelayout.widget.a$b$b$a$a, reason: collision with other inner class name */
                @f(c = "androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2", f = "FoldingFeatureObserver.kt", i = {}, l = {138}, m = "emit", n = {}, s = {})
                public static final class C0754a extends kotlin.coroutines.jvm.internal.d {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f75310a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    int f75311b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    Object f75312c;

                    public C0754a(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.f75310a = obj;
                        this.f75311b |= Integer.MIN_VALUE;
                        return C0753a.this.emit(null, this);
                    }
                }

                public C0753a(j jVar, a aVar) {
                    this.f75308a = jVar;
                    this.f75309b = aVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                @Override // kotlinx.coroutines.flow.j
                @Nullable
                public Object emit(x xVar, @NotNull d dVar) {
                    C0754a c0754a;
                    if (dVar instanceof C0754a) {
                        c0754a = (C0754a) dVar;
                        int i10 = c0754a.f75311b;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            c0754a.f75311b = i10 - Integer.MIN_VALUE;
                        } else {
                            c0754a = new C0754a(dVar);
                        }
                    } else {
                        c0754a = new C0754a(dVar);
                    }
                    Object obj = c0754a.f75310a;
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i11 = c0754a.f75311b;
                    if (i11 == 0) {
                        ResultKt.m(obj);
                        j jVar = this.f75308a;
                        m mVarD = this.f75309b.d(xVar);
                        if (mVarD != null) {
                            c0754a.f75311b = 1;
                            if (jVar.emit(mVarD, c0754a) == objL) {
                                return objL;
                            }
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.m(obj);
                    }
                    return Unit.f312394a;
                }
            }

            public C0752b(i iVar, a aVar) {
                this.f75306a = iVar;
                this.f75307b = aVar;
            }

            @Override // kotlinx.coroutines.flow.i
            @Nullable
            public Object collect(@NotNull j<? super m> jVar, @NotNull d dVar) {
                Object objCollect = this.f75306a.collect(new C0753a(jVar, this.f75307b), dVar);
                return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Activity activity, d<? super b> dVar) {
            super(2, dVar);
            this.f75304c = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final d<Unit> create(@Nullable Object obj, @NotNull d<?> dVar) {
            return a.this.new b(this.f75304c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f75302a;
            if (i10 == 0) {
                ResultKt.m(obj);
                i iVarI0 = k.i0(new C0752b(a.this.f75298a.c(this.f75304c), a.this));
                C0751a c0751a = new C0751a(a.this);
                this.f75302a = 1;
                if (iVarI0.collect(c0751a, this) == objL) {
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
        @Nullable
        public final Object invoke(@NotNull s0 s0Var, @Nullable d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public a(@NotNull t windowInfoTracker, @NotNull Executor executor) {
        Intrinsics.checkNotNullParameter(windowInfoTracker, "windowInfoTracker");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f75298a = windowInfoTracker;
        this.f75299b = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m d(x xVar) {
        Object next;
        Iterator<T> it = xVar.a().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((h) next) instanceof m));
        if (next instanceof m) {
            return (m) next;
        }
        return null;
    }

    public final void e(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        p2 p2Var = this.f75300c;
        int i10 = 3 << 0;
        if (p2Var != null) {
            p2.a.b(p2Var, null, 1, null);
        }
        int i11 = 3 ^ 0;
        this.f75300c = kotlinx.coroutines.k.f(t0.a(b2.c(this.f75299b)), null, null, new b(activity, null), 3, null);
    }

    public final void f(@NotNull InterfaceC0750a onFoldingFeatureChangeListener) {
        Intrinsics.checkNotNullParameter(onFoldingFeatureChangeListener, "onFoldingFeatureChangeListener");
        this.f75301d = onFoldingFeatureChangeListener;
    }

    public final void g() {
        p2 p2Var = this.f75300c;
        if (p2Var == null) {
            return;
        }
        p2.a.b(p2Var, null, 1, null);
    }
}
