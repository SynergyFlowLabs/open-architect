package androidx.compose.foundation.text.input.internal;

import android.os.Build;
import android.os.CancellationSignal;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.PreviewableHandwritingGesture;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f19538a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f19539b = "AndroidTextInputSession";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String[] f19540c = {"*/*", "image/*", "video/*"};

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt", f = "AndroidTextInputSession.android.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.D0}, m = "platformSpecificTextInputSession", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f19541a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f19542b;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f19541a = obj;
            this.f19542b |= Integer.MIN_VALUE;
            int i10 = 6 ^ 0;
            return e.f(null, null, null, null, null, null, null, null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt", f = "AndroidTextInputSession.android.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.B0}, m = "platformSpecificTextInputSession", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f19543a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f19544b;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f19543a = obj;
            this.f19544b |= Integer.MIN_VALUE;
            return e.e(null, null, null, null, null, null, null, null, null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3", f = "AndroidTextInputSession.android.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nAndroidTextInputSession.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidTextInputSession.android.kt\nandroidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,204:1\n1#2:205\n*E\n"})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<?>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f19545a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f19546b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.j0<Unit> f19547c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ w6 f19548d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ q6 f19549e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ v f19550f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.platform.m3 f19551g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.u f19552h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.content.internal.c f19553i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function1<androidx.compose.ui.text.input.t, Unit> f19554j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f19555k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.platform.o4 f19556l;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$1", f = "AndroidTextInputSession.android.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160702k0}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f19557a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ w6 f19558b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ v f19559c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(w6 w6Var, v vVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f19558b = w6Var;
                this.f19559c = vVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void m(v vVar, androidx.compose.foundation.text.input.l lVar, androidx.compose.foundation.text.input.l lVar2, boolean z10) {
                long jH = lVar.h();
                androidx.compose.ui.text.w3 w3VarD = lVar.d();
                long jH2 = lVar2.h();
                androidx.compose.ui.text.w3 w3VarD2 = lVar2.d();
                if (z10) {
                    vVar.b();
                } else {
                    if (androidx.compose.ui.text.w3.g(jH, jH2) && Intrinsics.areEqual(w3VarD, w3VarD2)) {
                        return;
                    }
                    vVar.a(androidx.compose.ui.text.w3.l(jH2), androidx.compose.ui.text.w3.k(jH2), w3VarD2 != null ? androidx.compose.ui.text.w3.l(w3VarD2.r()) : -1, w3VarD2 != null ? androidx.compose.ui.text.w3.k(w3VarD2.r()) : -1);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f19558b, this.f19559c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f19557a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    w6 w6Var = this.f19558b;
                    final v vVar = this.f19559c;
                    androidx.compose.foundation.text.input.p.a aVar = new androidx.compose.foundation.text.input.p.a() { // from class: androidx.compose.foundation.text.input.internal.h
                        @Override // androidx.compose.foundation.text.input.p.a
                        public final void a(androidx.compose.foundation.text.input.l lVar, androidx.compose.foundation.text.input.l lVar2, boolean z10) {
                            e.c.a.m(vVar, lVar, lVar2, z10);
                        }
                    };
                    this.f19557a = 1;
                    if (w6Var.m(aVar, this) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                throw new kotlin.a0();
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1", f = "AndroidTextInputSession.android.kt", i = {}, l = {com.rabbitmq.client.impl.k.b.p.f265340a, com.planner5d.library.engine.input.f.b.B}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f19560a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j0<Unit> f19561b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ v f19562c;

            static final class a<T> implements kotlinx.coroutines.flow.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ v f19563a;

                a(v vVar) {
                    this.f19563a = vVar;
                }

                @Override // kotlinx.coroutines.flow.j
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(Unit unit, kotlin.coroutines.d<? super Unit> dVar) {
                    this.f19563a.g();
                    return Unit.f312394a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(kotlinx.coroutines.flow.j0<Unit> j0Var, v vVar, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f19561b = j0Var;
                this.f19562c = vVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit m(long j10) {
                return Unit.f312394a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new b(this.f19561b, this.f19562c, dVar);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
            
                if (r6.collect(r1, r5) == r0) goto L15;
             */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    r4 = 6
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    r4 = 4
                    int r1 = r5.f19560a
                    r4 = 1
                    r2 = 2
                    r3 = 1
                    r4 = 7
                    if (r1 == 0) goto L24
                    if (r1 == r3) goto L20
                    if (r1 == r2) goto L1b
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    r4 = 6
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L1b:
                    kotlin.ResultKt.m(r6)
                    r4 = 0
                    goto L4d
                L20:
                    kotlin.ResultKt.m(r6)
                    goto L39
                L24:
                    kotlin.ResultKt.m(r6)
                    r4 = 6
                    androidx.compose.foundation.text.input.internal.i r6 = new androidx.compose.foundation.text.input.internal.i
                    r6.<init>()
                    r4 = 7
                    r5.f19560a = r3
                    r4 = 6
                    java.lang.Object r6 = androidx.compose.runtime.d3.d(r6, r5)
                    r4 = 7
                    if (r6 != r0) goto L39
                    goto L4c
                L39:
                    kotlinx.coroutines.flow.j0<kotlin.Unit> r6 = r5.f19561b
                    androidx.compose.foundation.text.input.internal.e$c$b$a r1 = new androidx.compose.foundation.text.input.internal.e$c$b$a
                    androidx.compose.foundation.text.input.internal.v r3 = r5.f19562c
                    r4 = 7
                    r1.<init>(r3)
                    r5.f19560a = r2
                    r4 = 2
                    java.lang.Object r5 = r6.collect(r1, r5)
                    if (r5 != r0) goto L4d
                L4c:
                    return r0
                L4d:
                    kotlin.a0 r5 = new kotlin.a0
                    r4 = 0
                    r5.<init>()
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.e.c.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.e$c$c, reason: collision with other inner class name */
        public static final class C0137c implements o6, f3 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final /* synthetic */ e1 f19564a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ w6 f19565b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ v f19566c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function1<androidx.compose.ui.text.input.t, Unit> f19567d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.content.internal.c f19568e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ c1 f19569f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ q6 f19570g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f19571h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.o4 f19572i;

            /* JADX WARN: Multi-variable type inference failed */
            C0137c(e1 e1Var, w6 w6Var, v vVar, Function1<? super androidx.compose.ui.text.input.t, Unit> function1, androidx.compose.foundation.content.internal.c cVar, c1 c1Var, q6 q6Var, Function0<Unit> function0, androidx.compose.ui.platform.o4 o4Var) {
                this.f19565b = w6Var;
                this.f19566c = vVar;
                this.f19567d = function1;
                this.f19568e = cVar;
                this.f19569f = c1Var;
                this.f19570g = q6Var;
                this.f19571h = function0;
                this.f19572i = o4Var;
                this.f19564a = e1Var;
            }

            @Override // androidx.compose.foundation.text.input.internal.o6
            public void a(int i10) {
                Function1<androidx.compose.ui.text.input.t, Unit> function1 = this.f19567d;
                if (function1 != null) {
                    function1.invoke(androidx.compose.ui.text.input.t.j(i10));
                }
            }

            @Override // androidx.compose.foundation.text.input.internal.f3
            public void b(Function1<? super androidx.compose.foundation.text.input.j, Unit> function1) {
                this.f19564a.b(function1);
            }

            @Override // androidx.compose.foundation.text.input.internal.f3
            public boolean beginBatchEdit() {
                return this.f19564a.beginBatchEdit();
            }

            @Override // androidx.compose.foundation.text.input.internal.o6
            public boolean c(w.g gVar) {
                androidx.compose.foundation.content.internal.c cVar = this.f19568e;
                if (cVar != null) {
                    return cVar.b(gVar);
                }
                return false;
            }

            @Override // androidx.compose.foundation.text.input.internal.o6
            public int d(HandwritingGesture handwritingGesture) {
                if (Build.VERSION.SDK_INT >= 34) {
                    return d3.f19532a.o(this.f19565b, handwritingGesture, this.f19570g, this.f19571h, this.f19572i);
                }
                return 2;
            }

            @Override // androidx.compose.foundation.text.input.internal.f3
            public long e(long j10) {
                return this.f19564a.e(j10);
            }

            @Override // androidx.compose.foundation.text.input.internal.f3
            public boolean endBatchEdit() {
                return this.f19564a.endBatchEdit();
            }

            @Override // androidx.compose.foundation.text.input.internal.f3
            public long f(long j10) {
                return this.f19564a.f(j10);
            }

            @Override // androidx.compose.foundation.text.input.internal.o6
            public androidx.compose.foundation.text.input.l getText() {
                return this.f19565b.u();
            }

            @Override // androidx.compose.foundation.text.input.internal.o6
            public boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
                if (Build.VERSION.SDK_INT >= 34) {
                    return d3.f19532a.I(this.f19565b, previewableHandwritingGesture, this.f19570g, cancellationSignal);
                }
                return false;
            }

            @Override // androidx.compose.foundation.text.input.internal.o6
            public void requestCursorUpdates(int i10) {
                this.f19569f.d(i10);
            }

            @Override // androidx.compose.foundation.text.input.internal.o6
            public void sendKeyEvent(KeyEvent keyEvent) {
                this.f19566c.sendKeyEvent(keyEvent);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(kotlinx.coroutines.flow.j0<Unit> j0Var, w6 w6Var, q6 q6Var, v vVar, androidx.compose.ui.platform.m3 m3Var, androidx.compose.ui.text.input.u uVar, androidx.compose.foundation.content.internal.c cVar, Function1<? super androidx.compose.ui.text.input.t, Unit> function1, Function0<Unit> function0, androidx.compose.ui.platform.o4 o4Var, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f19547c = j0Var;
            this.f19548d = w6Var;
            this.f19549e = q6Var;
            this.f19550f = vVar;
            this.f19551g = m3Var;
            this.f19552h = uVar;
            this.f19553i = cVar;
            this.f19554j = function1;
            this.f19555k = function0;
            this.f19556l = o4Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InputConnection n(final w6 w6Var, androidx.compose.ui.text.input.u uVar, androidx.compose.foundation.content.internal.c cVar, v vVar, Function1 function1, c1 c1Var, q6 q6Var, Function0 function0, androidx.compose.ui.platform.o4 o4Var, EditorInfo editorInfo) {
            e.d(null, new Function0() { // from class: androidx.compose.foundation.text.input.internal.g
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return e.c.s(w6Var);
                }
            }, 1, null);
            C0137c c0137c = new C0137c(new e1(w6Var), w6Var, vVar, function1, cVar, c1Var, q6Var, function0, o4Var);
            s1.b(editorInfo, w6Var.u(), w6Var.u().h(), uVar, cVar != null ? e.f19540c : null);
            return new p4(c0137c, editorInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String s(w6 w6Var) {
            return "createInputConnection(value=\"" + ((Object) w6Var.u()) + "\")";
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = new c(this.f19547c, this.f19548d, this.f19549e, this.f19550f, this.f19551g, this.f19552h, this.f19553i, this.f19554j, this.f19555k, this.f19556l, dVar);
            cVar.f19546b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f19545a;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) this.f19546b;
                kotlinx.coroutines.k.f(s0Var, null, kotlinx.coroutines.u0.UNDISPATCHED, new a(this.f19548d, this.f19550f, null), 1, null);
                kotlinx.coroutines.flow.j0<Unit> j0Var = this.f19547c;
                if (j0Var != null) {
                    kotlinx.coroutines.k.f(s0Var, null, null, new b(j0Var, this.f19550f, null), 3, null);
                }
                final c1 c1Var = new c1(this.f19548d, this.f19549e, this.f19550f, s0Var);
                androidx.compose.ui.platform.m3 m3Var = this.f19551g;
                final w6 w6Var = this.f19548d;
                final androidx.compose.ui.text.input.u uVar = this.f19552h;
                final androidx.compose.foundation.content.internal.c cVar = this.f19553i;
                final v vVar = this.f19550f;
                final Function1<androidx.compose.ui.text.input.t, Unit> function1 = this.f19554j;
                final q6 q6Var = this.f19549e;
                final Function0<Unit> function0 = this.f19555k;
                final androidx.compose.ui.platform.o4 o4Var = this.f19556l;
                androidx.compose.ui.platform.j3 j3Var = new androidx.compose.ui.platform.j3() { // from class: androidx.compose.foundation.text.input.internal.f
                    @Override // androidx.compose.ui.platform.j3
                    public final InputConnection a(EditorInfo editorInfo) {
                        return e.c.n(w6Var, uVar, cVar, vVar, function1, c1Var, q6Var, function0, o4Var, editorInfo);
                    }
                };
                this.f19545a = 1;
                if (m3Var.c(j3Var, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            throw new kotlin.a0();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<?> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @androidx.annotation.l1
    public static /* synthetic */ void b() {
    }

    private static final void c(String str, Function0<String> function0) {
    }

    static /* synthetic */ void d(String str, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = f19539b;
        }
        c(str, function0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @androidx.annotation.l1
    @Nullable
    public static final Object e(@NotNull androidx.compose.ui.platform.m3 m3Var, @NotNull w6 w6Var, @NotNull q6 q6Var, @NotNull androidx.compose.ui.text.input.u uVar, @Nullable androidx.compose.foundation.content.internal.c cVar, @Nullable Function1<? super androidx.compose.ui.text.input.t, Unit> function1, @Nullable Function0<Unit> function0, @NotNull v vVar, @Nullable kotlinx.coroutines.flow.j0<Unit> j0Var, @Nullable androidx.compose.ui.platform.o4 o4Var, @NotNull kotlin.coroutines.d<?> dVar) {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f19544b;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f19544b = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f19543a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar.f19544b;
        if (i11 == 0) {
            ResultKt.m(obj);
            c cVar2 = new c(j0Var, w6Var, q6Var, vVar, m3Var, uVar, cVar, function1, function0, o4Var, null);
            bVar.f19544b = 1;
            if (kotlinx.coroutines.t0.g(cVar2, bVar) == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
        }
        throw new kotlin.a0();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Nullable
    public static final Object f(@NotNull androidx.compose.ui.platform.m3 m3Var, @NotNull w6 w6Var, @NotNull q6 q6Var, @NotNull androidx.compose.ui.text.input.u uVar, @Nullable androidx.compose.foundation.content.internal.c cVar, @Nullable Function1<? super androidx.compose.ui.text.input.t, Unit> function1, @Nullable Function0<Unit> function0, @Nullable kotlinx.coroutines.flow.j0<Unit> j0Var, @Nullable androidx.compose.ui.platform.o4 o4Var, @NotNull kotlin.coroutines.d<?> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f19542b;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f19542b = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        a aVar2 = aVar;
        Object obj = aVar2.f19541a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar2.f19542b;
        if (i11 == 0) {
            ResultKt.m(obj);
            v vVarB = d0.b(m3Var.getView());
            aVar2.f19542b = 1;
            if (e(m3Var, w6Var, q6Var, uVar, cVar, function1, function0, vVarB, j0Var, o4Var, aVar2) == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
        }
        throw new kotlin.a0();
    }

    public static /* synthetic */ Object g(androidx.compose.ui.platform.m3 m3Var, w6 w6Var, q6 q6Var, androidx.compose.ui.text.input.u uVar, androidx.compose.foundation.content.internal.c cVar, Function1 function1, Function0 function0, kotlinx.coroutines.flow.j0 j0Var, androidx.compose.ui.platform.o4 o4Var, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 32) != 0) {
            function0 = null;
        }
        if ((i10 & 64) != 0) {
            j0Var = null;
        }
        if ((i10 & 128) != 0) {
            o4Var = null;
        }
        return f(m3Var, w6Var, q6Var, uVar, cVar, function1, function0, j0Var, o4Var, dVar);
    }
}
