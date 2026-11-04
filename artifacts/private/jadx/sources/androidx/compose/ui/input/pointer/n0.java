package androidx.compose.ui.input.pointer;

import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class n0 implements j0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f39075e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Function1<? super MotionEvent, Boolean> f39076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private u0 f39077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f39078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final i0 f39079d = new b();

    private enum a {
        Unknown,
        Dispatching,
        NotDispatching;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f39084e = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f39084e;
        }
    }

    @SourceDebugExtension({"SMAP\nPointerInteropFilter.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter$pointerInputFilter$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,409:1\n88#2:410\n35#2,5:411\n89#2:416\n88#2:417\n35#2,5:418\n89#2:423\n103#2:424\n35#2,5:425\n104#2:430\n35#2,5:431\n88#2:436\n35#2,5:437\n89#2:442\n103#2:443\n35#2,5:444\n104#2:449\n35#2,5:450\n103#2:455\n35#2,5:456\n104#2:461\n35#2,5:462\n35#2,5:467\n*S KotlinDebug\n*F\n+ 1 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter$pointerInputFilter$1\n*L\n224#1:410\n224#1:411,5\n224#1:416\n228#1:417\n228#1:418,5\n228#1:423\n236#1:424\n236#1:425,5\n236#1:430\n257#1:431,5\n277#1:436\n277#1:437,5\n277#1:442\n289#1:443\n289#1:444,5\n289#1:449\n292#1:450,5\n330#1:455\n330#1:456,5\n330#1:461\n357#1:462,5\n359#1:467,5\n*E\n"})
    public static final class b extends i0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private a f39085d = a.Unknown;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private q f39086e;

        static final class a extends kotlin.jvm.internal.l0 implements Function1<MotionEvent, Unit> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n0 f39089b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(n0 n0Var) {
                super(1);
                this.f39089b = n0Var;
            }

            public final void c(MotionEvent motionEvent) {
                if (motionEvent.getActionMasked() != 0) {
                    this.f39089b.b().invoke(motionEvent);
                } else {
                    b.this.f39085d = this.f39089b.b().invoke(motionEvent).booleanValue() ? a.Dispatching : a.NotDispatching;
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(MotionEvent motionEvent) {
                c(motionEvent);
                return Unit.f312394a;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.ui.input.pointer.n0$b$b, reason: collision with other inner class name */
        static final class C0297b extends kotlin.jvm.internal.l0 implements Function1<MotionEvent, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ n0 f39090a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0297b(n0 n0Var) {
                super(1);
                this.f39090a = n0Var;
            }

            public final void c(MotionEvent motionEvent) {
                this.f39090a.b().invoke(motionEvent);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(MotionEvent motionEvent) {
                c(motionEvent);
                return Unit.f312394a;
            }
        }

        static final class c extends kotlin.jvm.internal.l0 implements Function1<MotionEvent, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ n0 f39091a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(n0 n0Var) {
                super(1);
                this.f39091a = n0Var;
            }

            public final void c(MotionEvent motionEvent) {
                this.f39091a.b().invoke(motionEvent);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(MotionEvent motionEvent) {
                c(motionEvent);
                return Unit.f312394a;
            }
        }

        b() {
        }

        private final void k(q qVar, boolean z10) {
            List<c0> listE = qVar.e();
            List<c0> list = listE;
            int size = list.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                if (listE.get(i11).F()) {
                    m(qVar);
                    return;
                }
            }
            androidx.compose.ui.layout.g0 g0VarB = b();
            if (g0VarB == null) {
                throw new IllegalStateException("layoutCoordinates not set");
            }
            p0.d(qVar, g0VarB.k0(n0.g.f332700b.e()), new a(n0.this));
            if (this.f39085d == a.Dispatching) {
                if (!androidx.compose.ui.k.f39209l) {
                    int size2 = list.size();
                    while (i10 < size2) {
                        listE.get(i10).a();
                        i10++;
                    }
                } else if (z10) {
                    int size3 = list.size();
                    while (i10 < size3) {
                        listE.get(i10).a();
                        i10++;
                    }
                }
                i iVarG = qVar.g();
                if (iVarG != null) {
                    iVarG.f(!n0.this.a());
                }
            }
        }

        private final void l() {
            this.f39085d = a.Unknown;
            n0.this.f(false);
            this.f39086e = null;
        }

        private final void m(q qVar) {
            if (this.f39085d == a.Dispatching) {
                androidx.compose.ui.layout.g0 g0VarB = b();
                if (g0VarB == null) {
                    throw new IllegalStateException("layoutCoordinates not set");
                }
                p0.c(qVar, g0VarB.k0(n0.g.f332700b.e()), new c(n0.this));
            }
            this.f39085d = a.NotDispatching;
        }

        @Override // androidx.compose.ui.input.pointer.i0
        public boolean c() {
            return true;
        }

        @Override // androidx.compose.ui.input.pointer.i0
        public void f() {
            if (this.f39085d == a.Dispatching) {
                p0.a(SystemClock.uptimeMillis(), new C0297b(n0.this));
                l();
            }
        }

        @Override // androidx.compose.ui.input.pointer.i0
        public void g(q qVar, s sVar, long j10) {
            boolean z10;
            boolean z11;
            boolean z12;
            int i10;
            List<c0> listE = qVar.e();
            List<c0> list = listE;
            int size = list.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    z10 = true;
                    break;
                }
                c0 c0Var = listE.get(i11);
                if (r.c(c0Var) || r.e(c0Var)) {
                    z10 = false;
                    break;
                }
                i11++;
            }
            if (!z10) {
                z11 = false;
                break;
            }
            int size2 = list.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size2) {
                    z11 = true;
                    break;
                } else {
                    if (listE.get(i12).F()) {
                        z11 = false;
                        break;
                    }
                    i12++;
                }
            }
            if (n0.this.a()) {
                z12 = true;
                break;
            }
            int size3 = list.size();
            while (true) {
                if (i10 < size3) {
                    c0 c0Var2 = listE.get(i10);
                    i10 = (r.c(c0Var2) || r.e(c0Var2)) ? 0 : i10 + 1;
                } else if (!z11 || !androidx.compose.ui.k.f39209l) {
                    z12 = false;
                    break;
                }
                z12 = true;
                break;
            }
            if (this.f39085d != a.NotDispatching) {
                if (sVar == s.Initial && z12) {
                    this.f39086e = qVar;
                    k(qVar, !z10 || n0.this.a());
                }
                if (sVar == s.Main && z10 && Intrinsics.areEqual(qVar, this.f39086e) && n0.this.a() && androidx.compose.ui.k.f39209l) {
                    int size4 = list.size();
                    for (int i13 = 0; i13 < size4; i13++) {
                        listE.get(i13).a();
                    }
                }
                if (!androidx.compose.ui.k.f39209l ? !(sVar != s.Final || z12) : !(sVar != s.Final || z12 || Intrinsics.areEqual(qVar, this.f39086e))) {
                    k(qVar, true);
                }
            }
            if (sVar == s.Final) {
                int size5 = list.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size5) {
                        l();
                        break;
                    } else if (!r.e(listE.get(i14))) {
                        break;
                    } else {
                        i14++;
                    }
                }
                if (Intrinsics.areEqual(qVar, this.f39086e) && z10 && androidx.compose.ui.k.f39209l) {
                    int size6 = list.size();
                    for (int i15 = 0; i15 < size6; i15++) {
                        if (listE.get(i15).F()) {
                            if (n0.this.a()) {
                                break;
                            }
                            m(qVar);
                            return;
                        }
                    }
                    int size7 = list.size();
                    for (int i16 = 0; i16 < size7; i16++) {
                        listE.get(i16).a();
                    }
                }
            }
        }
    }

    public static /* synthetic */ void d() {
    }

    public final boolean a() {
        return this.f39078c;
    }

    @NotNull
    public final Function1<MotionEvent, Boolean> b() {
        Function1 function1 = this.f39076a;
        if (function1 != null) {
            return function1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("onTouchEvent");
        return null;
    }

    @Nullable
    public final u0 e() {
        return this.f39077b;
    }

    public final void f(boolean z10) {
        this.f39078c = z10;
    }

    public final void g(@NotNull Function1<? super MotionEvent, Boolean> function1) {
        this.f39076a = function1;
    }

    public final void h(@Nullable u0 u0Var) {
        u0 u0Var2 = this.f39077b;
        if (u0Var2 != null) {
            u0Var2.f(null);
        }
        this.f39077b = u0Var;
        if (u0Var != null) {
            u0Var.f(this);
        }
    }

    @Override // androidx.compose.ui.input.pointer.j0
    @NotNull
    public i0 z7() {
        return this.f39079d;
    }
}
