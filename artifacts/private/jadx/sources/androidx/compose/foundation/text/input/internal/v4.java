package androidx.compose.foundation.text.input.internal;

import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nTextFieldCoreModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldCoreModifier.kt\nandroidx/compose/foundation/text/input/internal/TextFieldCoreModifierNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 4 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 5 Rect.kt\nandroidx/compose/ui/geometry/Rect\n+ 6 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,683:1\n1#2:684\n646#3:685\n635#3:686\n233#4:687\n57#5:688\n85#6,5:689\n*S KotlinDebug\n*F\n+ 1 TextFieldCoreModifier.kt\nandroidx/compose/foundation/text/input/internal/TextFieldCoreModifierNode\n*L\n543#1:685\n543#1:686\n557#1:687\n578#1:688\n221#1:689,5\n*E\n"})
public final class v4 extends androidx.compose.ui.node.m implements androidx.compose.ui.node.g0, androidx.compose.ui.node.t, androidx.compose.ui.node.h, androidx.compose.ui.node.v, androidx.compose.ui.node.i2 {

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    public static final int f20120q3 = 8;
    private boolean H1;
    private boolean X;

    @NotNull
    private q6 Y;

    @NotNull
    private w6 Z;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @NotNull
    private androidx.compose.foundation.gestures.q3 f20121g3;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    @NotNull
    private androidx.compose.foundation.text.contextmenu.modifier.o f20122h3;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    @Nullable
    private androidx.compose.foundation.text.selection.x f20123i3;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    @Nullable
    private d1 f20124j3;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    @Nullable
    private kotlinx.coroutines.p2 f20125k3;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.text.w3 f20126l3;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    @NotNull
    private n0.j f20127m3 = new n0.j(-1.0f, -1.0f, -1.0f, -1.0f);

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private int f20128n3;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private int f20129o3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    private androidx.compose.foundation.text.input.internal.selection.d0 f20130p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.graphics.i0 f20131p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @NotNull
    private androidx.compose.foundation.b5 f20132p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.text.input.internal.selection.i f20133p3;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f20134w;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$1", f = "TextFieldCoreModifier.kt", i = {}, l = {209, 210}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f20135a;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(1, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return v4.this.new a(dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x006c, code lost:
        
            if (r8.a(r1, r4, r7) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r7.f20135a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L21
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L12
                kotlin.ResultKt.m(r8)
                goto L6f
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "//st voeraoe o/ /wi ln/uf/menobe euci /clierhrt/oks"
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L1c:
                r6 = 4
                kotlin.ResultKt.m(r8)
                goto L36
            L21:
                kotlin.ResultKt.m(r8)
                r6 = 2
                androidx.compose.foundation.text.input.internal.v4 r8 = androidx.compose.foundation.text.input.internal.v4.this
                androidx.compose.foundation.text.input.internal.selection.d0 r8 = androidx.compose.foundation.text.input.internal.v4.N9(r8)
                r6 = 4
                r7.f20135a = r3
                java.lang.Object r8 = r8.p1(r7)
                if (r8 != r0) goto L36
                r6 = 1
                goto L6e
            L36:
                androidx.compose.foundation.text.input.internal.v4 r8 = androidx.compose.foundation.text.input.internal.v4.this
                androidx.compose.foundation.text.selection.x r8 = androidx.compose.foundation.text.input.internal.v4.L9(r8)
                r6 = 4
                if (r8 == 0) goto L6f
                androidx.compose.foundation.text.input.internal.v4 r1 = androidx.compose.foundation.text.input.internal.v4.this
                androidx.compose.foundation.text.input.internal.selection.d0 r1 = androidx.compose.foundation.text.input.internal.v4.N9(r1)
                androidx.compose.foundation.text.input.internal.w6 r1 = r1.G0()
                r6 = 0
                androidx.compose.foundation.text.input.l r1 = r1.u()
                java.lang.CharSequence r1 = r1.i()
                r6 = 6
                androidx.compose.foundation.text.input.internal.v4 r4 = androidx.compose.foundation.text.input.internal.v4.this
                androidx.compose.foundation.text.input.internal.selection.d0 r4 = androidx.compose.foundation.text.input.internal.v4.N9(r4)
                r6 = 3
                androidx.compose.foundation.text.input.internal.w6 r4 = r4.G0()
                androidx.compose.foundation.text.input.l r4 = r4.u()
                long r4 = r4.h()
                r7.f20135a = r2
                java.lang.Object r8 = r8.a(r1, r4, r7)
                if (r8 != r0) goto L6f
            L6e:
                return r0
            L6f:
                androidx.compose.foundation.text.input.internal.v4 r7 = androidx.compose.foundation.text.input.internal.v4.this
                androidx.compose.foundation.text.input.internal.selection.d0 r7 = androidx.compose.foundation.text.input.internal.v4.N9(r7)
                r7.j1(r3)
                kotlin.Unit r7 = kotlin.Unit.f312394a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.v4.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$2", f = "TextFieldCoreModifier.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f20137a;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(1, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return v4.this.new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f20137a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            v4.this.f20130p0.j1(false);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$startCursorJob$1", f = "TextFieldCoreModifier.kt", i = {}, l = {618}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nTextFieldCoreModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldCoreModifier.kt\nandroidx/compose/foundation/text/input/internal/TextFieldCoreModifierNode$startCursorJob$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,683:1\n1#2:684\n*E\n"})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f20139a;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$startCursorJob$1$2", f = "TextFieldCoreModifier.kt", i = {}, l = {620}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<Integer, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f20141a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ int f20142b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ v4 f20143c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(v4 v4Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f20143c = v4Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f20143c, dVar);
                aVar.f20142b = ((Number) obj).intValue();
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Integer num, kotlin.coroutines.d<? super Unit> dVar) {
                return k(num.intValue(), dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                d1 d1Var;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f20141a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    if (Math.abs(this.f20142b) == 1 && (d1Var = this.f20143c.f20124j3) != null) {
                        this.f20141a = 1;
                        if (d1Var.g(this) == objL) {
                            return objL;
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                return Unit.f312394a;
            }

            public final Object k(int i10, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(Integer.valueOf(i10), dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int m(v4 v4Var, kotlin.jvm.internal.i1.f fVar) {
            v4Var.Z.u();
            int i10 = (v4Var.a9() && ((androidx.compose.ui.platform.w4) androidx.compose.ui.node.i.a(v4Var, androidx.compose.ui.platform.q1.E())).c()) ? 1 : 2;
            int i11 = fVar.f312749a;
            int i12 = i10 * i11;
            fVar.f312749a = i11 * (-1);
            return i12;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return v4.this.new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f20139a;
            if (i10 == 0) {
                ResultKt.m(obj);
                final kotlin.jvm.internal.i1.f fVar = new kotlin.jvm.internal.i1.f();
                fVar.f312749a = 1;
                final v4 v4Var = v4.this;
                kotlinx.coroutines.flow.i iVarY = androidx.compose.runtime.w6.y(new Function0() { // from class: androidx.compose.foundation.text.input.internal.w4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Integer.valueOf(v4.c.m(v4Var, fVar));
                    }
                });
                a aVar = new a(v4.this, null);
                this.f20139a = 1;
                if (kotlinx.coroutines.flow.k.C(iVarY, aVar, this) == objL) {
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
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$updateScrollState$1", f = "TextFieldCoreModifier.kt", i = {}, l = {503, 509}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f20144a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f20146c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f20147d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ n0.j f20148e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(float f10, boolean z10, n0.j jVar, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f20146c = f10;
            this.f20147d = z10;
            this.f20148e = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return v4.this.new d(this.f20146c, this.f20147d, this.f20148e, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
        
            if (r6.a(r1, r5) == r0) goto L18;
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
                int r1 = r5.f20144a
                r4 = 0
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L25
                if (r1 == r3) goto L20
                r4 = 1
                if (r1 != r2) goto L16
                r4 = 1
                kotlin.ResultKt.m(r6)
                r4 = 0
                goto L5c
            L16:
                r4 = 5
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                r4 = 5
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L20:
                kotlin.ResultKt.m(r6)
                r4 = 2
                goto L40
            L25:
                kotlin.ResultKt.m(r6)
                r4 = 6
                androidx.compose.foundation.text.input.internal.v4 r6 = androidx.compose.foundation.text.input.internal.v4.this
                androidx.compose.foundation.b5 r6 = androidx.compose.foundation.text.input.internal.v4.M9(r6)
                r4 = 0
                float r1 = r5.f20146c
                r4 = 2
                float r1 = androidx.compose.foundation.text.input.internal.r4.c(r1)
                r5.f20144a = r3
                java.lang.Object r6 = androidx.compose.foundation.gestures.v3.e(r6, r1, r5)
                if (r6 != r0) goto L40
                goto L5a
            L40:
                boolean r6 = r5.f20147d
                if (r6 == 0) goto L5c
                r4 = 5
                androidx.compose.foundation.text.input.internal.v4 r6 = androidx.compose.foundation.text.input.internal.v4.this
                androidx.compose.foundation.text.input.internal.q6 r6 = androidx.compose.foundation.text.input.internal.v4.P9(r6)
                androidx.compose.foundation.relocation.a r6 = r6.c()
                n0.j r1 = r5.f20148e
                r5.f20144a = r2
                java.lang.Object r5 = r6.a(r1, r5)
                r4 = 7
                if (r5 != r0) goto L5c
            L5a:
                r4 = 1
                return r0
            L5c:
                kotlin.Unit r5 = kotlin.Unit.f312394a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.v4.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public v4(boolean z10, boolean z11, @NotNull q6 q6Var, @NotNull w6 w6Var, @NotNull androidx.compose.foundation.text.input.internal.selection.d0 d0Var, @NotNull androidx.compose.ui.graphics.i0 i0Var, boolean z12, @NotNull androidx.compose.foundation.b5 b5Var, @NotNull androidx.compose.foundation.gestures.q3 q3Var, @NotNull androidx.compose.foundation.text.contextmenu.modifier.o oVar, @Nullable androidx.compose.foundation.text.selection.x xVar) {
        this.f20134w = z10;
        this.X = z11;
        this.Y = q6Var;
        this.Z = w6Var;
        this.f20130p0 = d0Var;
        this.f20131p1 = i0Var;
        this.H1 = z12;
        this.f20132p2 = b5Var;
        this.f20121g3 = q3Var;
        this.f20122h3 = oVar;
        this.f20123i3 = xVar;
        this.f20133p3 = (androidx.compose.foundation.text.input.internal.selection.i) v9(androidx.compose.foundation.text.input.internal.selection.a.a(this.Z, this.f20130p0, this.Y, this.f20134w || this.X));
        v9(new androidx.compose.foundation.text.contextmenu.modifier.n(this.f20122h3, new a(null), new b(null), new Function1() { // from class: androidx.compose.foundation.text.input.internal.t4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v4.J9(this.f20074a, (androidx.compose.ui.layout.g0) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n0.j J9(v4 v4Var, androidx.compose.ui.layout.g0 g0Var) {
        n0.j jVarS0 = v4Var.f20130p0.s0();
        if (jVarS0 == null) {
            jVarS0 = n0.j.f332705e.a();
        }
        androidx.compose.ui.layout.g0 g0VarK = v4Var.Y.k();
        if (g0VarK != null) {
            return androidx.compose.foundation.text.contextmenu.modifier.l.c(jVarS0, g0VarK, g0Var);
        }
        androidx.compose.foundation.internal.e.j("Required value was null.");
        throw new kotlin.a0();
    }

    private final int Q9(long j10, int i10, int i11) {
        androidx.compose.ui.text.w3 w3Var = this.f20126l3;
        if (w3Var == null || androidx.compose.ui.text.w3.i(j10) != androidx.compose.ui.text.w3.i(w3Var.r())) {
            return androidx.compose.ui.text.w3.i(j10);
        }
        androidx.compose.ui.text.w3 w3Var2 = this.f20126l3;
        if (w3Var2 == null || androidx.compose.ui.text.w3.n(j10) != androidx.compose.ui.text.w3.n(w3Var2.r())) {
            return androidx.compose.ui.text.w3.n(j10);
        }
        if (i11 == this.f20128n3 && i10 == this.f20129o3) {
            return -1;
        }
        return androidx.compose.ui.text.w3.n(j10);
    }

    private final void R9(androidx.compose.ui.graphics.drawscope.f fVar) {
        d1 d1Var = this.f20124j3;
        float fE = d1Var != null ? d1Var.e() : 0.0f;
        if (fE != 0.0f && V9()) {
            n0.j jVarR0 = this.f20130p0.r0();
            androidx.compose.ui.graphics.drawscope.f.D8(fVar, this.f20131p1, jVarR0.D(), jVarR0.l(), jVarR0.x() - jVarR0.t(), 0, null, fE, null, 0, 432, null);
        }
    }

    private final void S9(androidx.compose.ui.graphics.drawscope.f fVar, Pair<androidx.compose.foundation.text.input.s, androidx.compose.ui.text.w3> pair, androidx.compose.ui.text.p3 p3Var) {
        int i10 = pair.component1().i();
        long jR = pair.component2().r();
        if (androidx.compose.ui.text.w3.h(jR)) {
            return;
        }
        androidx.compose.ui.graphics.k2 k2VarA = p3Var.A(androidx.compose.ui.text.w3.l(jR), androidx.compose.ui.text.w3.k(jR));
        if (!androidx.compose.foundation.text.input.s.f(i10, androidx.compose.foundation.text.input.s.f20317b.a())) {
            androidx.compose.ui.graphics.drawscope.f.K1(fVar, k2VarA, ((androidx.compose.foundation.text.selection.w4) androidx.compose.ui.node.i.a(this, androidx.compose.foundation.text.selection.y4.d())).a(), 0.0f, null, null, 0, 60, null);
            return;
        }
        androidx.compose.ui.graphics.i0 i0VarS = p3Var.l().m().s();
        if (i0VarS != null) {
            androidx.compose.ui.graphics.drawscope.f.L3(fVar, k2VarA, i0VarS, 0.2f, null, null, 0, 56, null);
            return;
        }
        long jT = p3Var.l().m().t();
        if (jT == 16) {
            jT = androidx.compose.ui.graphics.q0.f38131b.a();
        }
        long j10 = jT;
        androidx.compose.ui.graphics.drawscope.f.K1(fVar, k2VarA, androidx.compose.ui.graphics.q0.w(j10, androidx.compose.ui.graphics.q0.A(j10) * 0.2f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, null, 0, 60, null);
    }

    private final void T9(androidx.compose.ui.graphics.drawscope.f fVar, long j10, androidx.compose.ui.text.p3 p3Var) {
        int iL = androidx.compose.ui.text.w3.l(j10);
        int iK = androidx.compose.ui.text.w3.k(j10);
        if (iL != iK) {
            androidx.compose.ui.graphics.drawscope.f.K1(fVar, p3Var.A(iL, iK), ((androidx.compose.foundation.text.selection.w4) androidx.compose.ui.node.i.a(this, androidx.compose.foundation.text.selection.y4.d())).a(), 0.0f, null, null, 0, 60, null);
        }
    }

    private final void U9(androidx.compose.ui.graphics.drawscope.f fVar, androidx.compose.ui.text.p3 p3Var) {
        androidx.compose.ui.text.u3.f42312a.a(fVar.Z3().f(), p3Var);
    }

    private final boolean V9() {
        return this.H1 && (this.f20134w || this.X) && r4.e(this.f20131p1);
    }

    private final androidx.compose.ui.layout.b1 W9(final androidx.compose.ui.layout.c1 c1Var, androidx.compose.ui.layout.z0 z0Var, long j10) {
        final androidx.compose.ui.layout.i2 i2VarP0 = z0Var.P0(androidx.compose.ui.unit.b.d(j10, 0, Integer.MAX_VALUE, 0, 0, 13, null));
        final int iMin = Math.min(i2VarP0.h1(), androidx.compose.ui.unit.b.p(j10));
        return androidx.compose.ui.layout.c1.h6(c1Var, iMin, i2VarP0.c1(), null, new Function1() { // from class: androidx.compose.foundation.text.input.internal.s4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v4.X9(this.f19785a, iMin, i2VarP0, c1Var, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X9(v4 v4Var, int i10, androidx.compose.ui.layout.i2 i2Var, androidx.compose.ui.layout.c1 c1Var, androidx.compose.ui.layout.i2.a aVar) {
        v4Var.ca(aVar, i10, i2Var.h1(), v4Var.Z.u().h(), c1Var.getLayoutDirection());
        androidx.compose.ui.layout.i2.a.e0(aVar, i2Var, -v4Var.f20132p2.B(), 0, 0.0f, 4, null);
        return Unit.f312394a;
    }

    private final androidx.compose.ui.layout.b1 Y9(final androidx.compose.ui.layout.c1 c1Var, androidx.compose.ui.layout.z0 z0Var, long j10) {
        boolean z10 = false & false;
        final androidx.compose.ui.layout.i2 i2VarP0 = z0Var.P0(androidx.compose.ui.unit.b.d(j10, 0, 0, 0, Integer.MAX_VALUE, 7, null));
        final int iMin = Math.min(i2VarP0.c1(), androidx.compose.ui.unit.b.o(j10));
        return androidx.compose.ui.layout.c1.h6(c1Var, i2VarP0.h1(), iMin, null, new Function1() { // from class: androidx.compose.foundation.text.input.internal.u4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v4.Z9(this.f20079a, iMin, i2VarP0, c1Var, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z9(v4 v4Var, int i10, androidx.compose.ui.layout.i2 i2Var, androidx.compose.ui.layout.c1 c1Var, androidx.compose.ui.layout.i2.a aVar) {
        v4Var.ca(aVar, i10, i2Var.c1(), v4Var.Z.u().h(), c1Var.getLayoutDirection());
        androidx.compose.ui.layout.i2.a.e0(aVar, i2Var, 0, -v4Var.f20132p2.B(), 0.0f, 4, null);
        return Unit.f312394a;
    }

    private final void aa() {
        if (this.f20124j3 == null) {
            this.f20124j3 = new d1(((Boolean) androidx.compose.ui.node.i.a(this, androidx.compose.ui.platform.q1.l())).booleanValue());
            androidx.compose.ui.node.u.a(this);
        }
        this.f20125k3 = kotlinx.coroutines.k.f(Q8(), null, null, new c(null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a2  */
    private final void ca(androidx.compose.ui.unit.d dVar, int i10, int i11, long j10, androidx.compose.ui.unit.w wVar) {
        androidx.compose.ui.text.p3 p3VarF;
        float f10;
        this.f20132p2.H(i10);
        this.f20132p2.F(i11 - i10);
        int iQ9 = Q9(j10, i10, i11);
        if (iQ9 < 0 || !V9() || (p3VarF = this.Y.f()) == null) {
            return;
        }
        n0.j jVarE = p3VarF.e(kotlin.ranges.r.J(iQ9, new IntRange(0, p3VarF.l().n().length())));
        n0.j jVarD = r4.d(dVar, jVarE, wVar == androidx.compose.ui.unit.w.Rtl, i11);
        boolean z10 = (jVarD.t() == this.f20127m3.t() && jVarD.B() == this.f20127m3.B() && i11 == this.f20128n3) ? false : true;
        if (z10 || i10 != this.f20129o3) {
            boolean z11 = this.f20121g3 == androidx.compose.foundation.gestures.q3.Vertical;
            float fB = z11 ? jVarD.B() : jVarD.t();
            float fJ = z11 ? jVarD.j() : jVarD.x();
            int iB = this.f20132p2.B();
            float f11 = iB + i10;
            if (fJ > f11) {
                f10 = fJ - f11;
            } else {
                float f12 = iB;
                if (fB >= f12 || fJ - fB <= i10) {
                    f10 = (fB >= f12 || fJ - fB > ((float) i10)) ? 0.0f : fB - f12;
                } else {
                    f10 = fJ - f11;
                }
            }
            this.f20126l3 = androidx.compose.ui.text.w3.b(j10);
            this.f20127m3 = jVarD;
            this.f20129o3 = i10;
            this.f20128n3 = i11;
            kotlinx.coroutines.k.f(Q8(), null, kotlinx.coroutines.u0.UNDISPATCHED, new d(f10, z10, jVarE, null), 1, null);
        }
    }

    @Override // androidx.compose.ui.node.t
    public void P(@NotNull androidx.compose.ui.graphics.drawscope.c cVar) {
        cVar.E4();
        androidx.compose.foundation.text.input.l lVarU = this.Z.u();
        androidx.compose.ui.text.p3 p3VarF = this.Y.f();
        if (p3VarF == null) {
            return;
        }
        Pair<androidx.compose.foundation.text.input.s, androidx.compose.ui.text.w3> pairE = lVarU.e();
        if (pairE != null) {
            S9(cVar, pairE, p3VarF);
        }
        if (androidx.compose.ui.text.w3.h(lVarU.h())) {
            U9(cVar, p3VarF);
            if (lVarU.j()) {
                R9(cVar);
            }
        } else {
            if (lVarU.j()) {
                T9(cVar, lVarU.h(), p3VarF);
            }
            U9(cVar, p3VarF);
        }
        this.f20133p3.P(cVar);
    }

    public final void ba(boolean z10, boolean z11, @NotNull q6 q6Var, @NotNull w6 w6Var, @NotNull androidx.compose.foundation.text.input.internal.selection.d0 d0Var, @NotNull androidx.compose.ui.graphics.i0 i0Var, boolean z12, @NotNull androidx.compose.foundation.b5 b5Var, @NotNull androidx.compose.foundation.gestures.q3 q3Var, @NotNull androidx.compose.foundation.text.contextmenu.modifier.o oVar, @Nullable androidx.compose.foundation.text.selection.x xVar) {
        boolean zV9 = V9();
        boolean z13 = this.f20134w;
        w6 w6Var2 = this.Z;
        q6 q6Var2 = this.Y;
        androidx.compose.foundation.text.input.internal.selection.d0 d0Var2 = this.f20130p0;
        androidx.compose.foundation.b5 b5Var2 = this.f20132p2;
        this.f20134w = z10;
        this.X = z11;
        this.Y = q6Var;
        this.Z = w6Var;
        this.f20130p0 = d0Var;
        this.f20131p1 = i0Var;
        this.H1 = z12;
        this.f20132p2 = b5Var;
        this.f20121g3 = q3Var;
        this.f20122h3 = oVar;
        this.f20123i3 = xVar;
        this.f20133p3.G9(w6Var, d0Var, q6Var, z10 || z11);
        if (!V9()) {
            kotlinx.coroutines.p2 p2Var = this.f20125k3;
            if (p2Var != null) {
                kotlinx.coroutines.p2.a.b(p2Var, null, 1, null);
            }
            this.f20125k3 = null;
            d1 d1Var = this.f20124j3;
            if (d1Var != null) {
                d1Var.c();
            }
        } else if (!z13 || !Intrinsics.areEqual(w6Var2, w6Var) || !zV9) {
            aa();
        }
        if (Intrinsics.areEqual(w6Var2, w6Var) && Intrinsics.areEqual(q6Var2, q6Var) && Intrinsics.areEqual(d0Var2, d0Var) && Intrinsics.areEqual(b5Var2, b5Var)) {
            return;
        }
        androidx.compose.ui.node.j0.b(this);
    }

    @Override // androidx.compose.ui.node.g0
    @NotNull
    public androidx.compose.ui.layout.b1 c(@NotNull androidx.compose.ui.layout.c1 c1Var, @NotNull androidx.compose.ui.layout.z0 z0Var, long j10) {
        return this.f20121g3 == androidx.compose.foundation.gestures.q3.Vertical ? Y9(c1Var, z0Var, j10) : W9(c1Var, z0Var, j10);
    }

    @Override // androidx.compose.ui.a0.d
    public void e9() {
        if (this.f20134w && V9()) {
            aa();
        }
    }

    @Override // androidx.compose.ui.node.v
    public void n0(@NotNull androidx.compose.ui.layout.g0 g0Var) {
        this.Y.o(g0Var);
        this.f20133p3.n0(g0Var);
    }

    @Override // androidx.compose.ui.node.i2
    public void p0(@NotNull androidx.compose.ui.semantics.e0 e0Var) {
        this.f20133p3.p0(e0Var);
    }
}
