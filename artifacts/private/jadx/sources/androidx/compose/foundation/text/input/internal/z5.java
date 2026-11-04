package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import androidx.compose.runtime.d7;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.List;
import java.util.Set;
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
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nTextFieldDecoratorModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDecoratorModifier.kt\nandroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 TransformedTextFieldState.kt\nandroidx/compose/foundation/text/input/internal/TransformedTextFieldState\n+ 5 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldState\n*L\n1#1,852:1\n85#2:853\n117#2,2:854\n1#3:856\n319#4,6:857\n327#4,3:871\n330#4:880\n270#5,8:863\n279#5,6:874\n*S KotlinDebug\n*F\n+ 1 TextFieldDecoratorModifier.kt\nandroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode\n*L\n401#1:853\n401#1:854,2\n218#1:857,6\n218#1:871,3\n218#1:880\n218#1:863,8\n218#1:874,6\n*E\n"})
public final class z5 extends androidx.compose.ui.node.m implements androidx.compose.ui.node.t, androidx.compose.ui.platform.k3, androidx.compose.ui.node.i2, androidx.compose.ui.node.v, androidx.compose.ui.node.d2, androidx.compose.ui.input.key.g, androidx.compose.ui.node.h, androidx.compose.ui.modifier.j, androidx.compose.ui.node.q1, androidx.compose.ui.node.f0 {

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    public static final int f20216w3 = 8;

    @NotNull
    private androidx.compose.foundation.text.b4 H1;

    @NotNull
    private q6 X;

    @NotNull
    private androidx.compose.foundation.text.input.internal.selection.d0 Y;

    @Nullable
    private androidx.compose.foundation.text.input.c Z;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private boolean f20217g3;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    @NotNull
    private androidx.compose.foundation.interaction.j f20218h3;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private boolean f20219i3;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    @Nullable
    private kotlinx.coroutines.flow.j0<Unit> f20220j3;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.h2 f20221k3;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.input.pointer.y0 f20222l3;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    @Nullable
    private androidx.compose.foundation.interaction.e.a f20223m3;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.draganddrop.j f20224n3;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.platform.w4 f20225o3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private boolean f20226p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private boolean f20227p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @Nullable
    private androidx.compose.foundation.text.input.f f20228p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    @Nullable
    private kotlinx.coroutines.p2 f20229p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    @NotNull
    private final h6 f20230q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    @NotNull
    private final f f20231r3;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    @NotNull
    private final Function1<? super androidx.compose.foundation.text.s3, ? extends Unit> f20232s3;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    @Nullable
    private kotlinx.coroutines.p2 f20233t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    @NotNull
    private final Function0<androidx.compose.foundation.content.internal.c> f20234u3;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f20235v3;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private w6 f20236w;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$1$1", f = "TextFieldDecoratorModifier.kt", i = {}, l = {545}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f20237a;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return z5.this.new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f20237a;
            if (i10 == 0) {
                ResultKt.m(obj);
                z5 z5Var = z5.this;
                this.f20237a = 1;
                if (z5Var.bb(this) == objL) {
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
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$10$1", f = "TextFieldDecoratorModifier.kt", i = {}, l = {636}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f20239a;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return z5.this.new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f20239a;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.foundation.text.input.internal.selection.d0 d0VarWa = z5.this.Wa();
                this.f20239a = 1;
                if (d0VarWa.T(this) == objL) {
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
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$11$1", f = "TextFieldDecoratorModifier.kt", i = {}, l = {643}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f20241a;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return z5.this.new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f20241a;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.foundation.text.input.internal.selection.d0 d0VarWa = z5.this.Wa();
                this.f20241a = 1;
                if (d0VarWa.V0(this) == objL) {
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

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$9$1", f = "TextFieldDecoratorModifier.kt", i = {}, l = {631}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f20243a;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return z5.this.new d(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f20243a;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.foundation.text.input.internal.selection.d0 d0VarWa = z5.this.Wa();
                this.f20243a = 1;
                if (androidx.compose.foundation.text.input.internal.selection.d0.R(d0VarWa, false, this, 1, null) == objL) {
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
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$clipboardKeyCommandsHandler$1$1", f = "TextFieldDecoratorModifier.kt", i = {}, l = {382, 383, androidx.media3.exoplayer.a5.S0}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f20245a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.s3 f20246b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ z5 f20247c;

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f20248a;

            static {
                int[] iArr = new int[androidx.compose.foundation.text.s3.values().length];
                try {
                    iArr[androidx.compose.foundation.text.s3.COPY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[androidx.compose.foundation.text.s3.CUT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[androidx.compose.foundation.text.s3.PASTE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f20248a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(androidx.compose.foundation.text.s3 s3Var, z5 z5Var, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f20246b = s3Var;
            this.f20247c = z5Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new e(this.f20246b, this.f20247c, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
        
            if (r7.V0(r6) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
        
            if (r7.T(r6) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
        
            if (r7.Q(false, r6) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r6.f20245a
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L22
                if (r1 == r4) goto L13
                r5 = 4
                if (r1 == r3) goto L13
                r5 = 7
                if (r1 != r2) goto L18
            L13:
                r5 = 1
                kotlin.ResultKt.m(r7)
                goto L6a
            L18:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                r5 = 4
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                r5 = 2
                throw r6
            L22:
                kotlin.ResultKt.m(r7)
                androidx.compose.foundation.text.s3 r7 = r6.f20246b
                int[] r1 = androidx.compose.foundation.text.input.internal.z5.e.a.f20248a
                r5 = 4
                int r7 = r7.ordinal()
                r5 = 4
                r7 = r1[r7]
                if (r7 == r4) goto L58
                if (r7 == r3) goto L47
                if (r7 == r2) goto L38
                goto L6a
            L38:
                androidx.compose.foundation.text.input.internal.z5 r7 = r6.f20247c
                androidx.compose.foundation.text.input.internal.selection.d0 r7 = r7.Wa()
                r6.f20245a = r2
                java.lang.Object r6 = r7.V0(r6)
                if (r6 != r0) goto L6a
                goto L69
            L47:
                androidx.compose.foundation.text.input.internal.z5 r7 = r6.f20247c
                r5 = 2
                androidx.compose.foundation.text.input.internal.selection.d0 r7 = r7.Wa()
                r5 = 1
                r6.f20245a = r3
                java.lang.Object r6 = r7.T(r6)
                if (r6 != r0) goto L6a
                goto L69
            L58:
                androidx.compose.foundation.text.input.internal.z5 r7 = r6.f20247c
                androidx.compose.foundation.text.input.internal.selection.d0 r7 = r7.Wa()
                r5 = 5
                r6.f20245a = r4
                r1 = 0
                java.lang.Object r6 = r7.Q(r1, r6)
                r5 = 3
                if (r6 != r0) goto L6a
            L69:
                return r0
            L6a:
                kotlin.Unit r6 = kotlin.Unit.f312394a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.z5.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public static final class f implements androidx.compose.foundation.text.y3 {
        f() {
        }

        @Override // androidx.compose.foundation.text.y3
        public void a(int i10) {
            z5.this.Ca(i10);
        }
    }

    static final class g<T> implements kotlinx.coroutines.flow.j {
        g() {
        }

        @Override // kotlinx.coroutines.flow.j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(String str, kotlin.coroutines.d<? super Unit> dVar) {
            z5.this.kb(false);
            return Unit.f312394a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$onIsFocusedUpdated$1", f = "TextFieldDecoratorModifier.kt", i = {}, l = {672}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f20251a;

        h(kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return z5.this.new h(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f20251a;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.foundation.text.input.internal.selection.d0 d0VarWa = z5.this.Wa();
                this.f20251a = 1;
                if (d0VarWa.m1(this) == objL) {
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
            return ((h) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    static final class i implements PointerInputEventHandler {

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1", f = "TextFieldDecoratorModifier.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f20254a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f20255b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ z5 f20256c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.input.pointer.l0 f20257d;

            /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.z5$i$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$1", f = "TextFieldDecoratorModifier.kt", i = {}, l = {236}, m = "invokeSuspend", n = {}, s = {})
            static final class C0145a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f20258a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ androidx.compose.foundation.text.input.internal.selection.d0 f20259b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ androidx.compose.ui.input.pointer.l0 f20260c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0145a(androidx.compose.foundation.text.input.internal.selection.d0 d0Var, androidx.compose.ui.input.pointer.l0 l0Var, kotlin.coroutines.d<? super C0145a> dVar) {
                    super(2, dVar);
                    this.f20259b = d0Var;
                    this.f20260c = l0Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new C0145a(this.f20259b, this.f20260c, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i10 = this.f20258a;
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        androidx.compose.foundation.text.input.internal.selection.d0 d0Var = this.f20259b;
                        androidx.compose.ui.input.pointer.l0 l0Var = this.f20260c;
                        this.f20258a = 1;
                        if (d0Var.m0(l0Var, this) == objL) {
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
                    return ((C0145a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2", f = "TextFieldDecoratorModifier.kt", i = {}, l = {238}, m = "invokeSuspend", n = {}, s = {})
            static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f20261a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ z5 f20262b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ androidx.compose.foundation.text.input.internal.selection.d0 f20263c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ androidx.compose.ui.input.pointer.l0 f20264d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ Function0<Unit> f20265e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(z5 z5Var, androidx.compose.foundation.text.input.internal.selection.d0 d0Var, androidx.compose.ui.input.pointer.l0 l0Var, Function0<Unit> function0, kotlin.coroutines.d<? super b> dVar) {
                    super(2, dVar);
                    this.f20262b = z5Var;
                    this.f20263c = d0Var;
                    this.f20264d = l0Var;
                    this.f20265e = function0;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit m(z5 z5Var) {
                    if (z5Var.f20233t3 != null) {
                        z5Var.jb().a();
                    } else {
                        z5Var.xb(true);
                    }
                    return Unit.f312394a;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new b(this.f20262b, this.f20263c, this.f20264d, this.f20265e, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i10 = this.f20261a;
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        androidx.compose.foundation.interaction.j jVarQa = this.f20262b.Qa();
                        androidx.compose.foundation.text.input.internal.selection.d0 d0Var = this.f20263c;
                        androidx.compose.ui.input.pointer.l0 l0Var = this.f20264d;
                        Function0<Unit> function0 = this.f20265e;
                        final z5 z5Var = this.f20262b;
                        Function0<Unit> function1 = new Function0() { // from class: androidx.compose.foundation.text.input.internal.b6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return z5.i.a.b.m(z5Var);
                            }
                        };
                        this.f20261a = 1;
                        if (d0Var.j0(l0Var, jVarQa, function0, function1, this) == objL) {
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
                    return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$3", f = "TextFieldDecoratorModifier.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.V1}, m = "invokeSuspend", n = {}, s = {})
            static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f20266a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ androidx.compose.foundation.text.input.internal.selection.d0 f20267b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ androidx.compose.ui.input.pointer.l0 f20268c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ Function0<Unit> f20269d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(androidx.compose.foundation.text.input.internal.selection.d0 d0Var, androidx.compose.ui.input.pointer.l0 l0Var, Function0<Unit> function0, kotlin.coroutines.d<? super c> dVar) {
                    super(2, dVar);
                    this.f20267b = d0Var;
                    this.f20268c = l0Var;
                    this.f20269d = function0;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new c(this.f20267b, this.f20268c, this.f20269d, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i10 = this.f20266a;
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        androidx.compose.foundation.text.input.internal.selection.d0 d0Var = this.f20267b;
                        androidx.compose.ui.input.pointer.l0 l0Var = this.f20268c;
                        Function0<Unit> function0 = this.f20269d;
                        this.f20266a = 1;
                        if (d0Var.n1(l0Var, function0, this) == objL) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(z5 z5Var, androidx.compose.ui.input.pointer.l0 l0Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f20256c = z5Var;
                this.f20257d = l0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit m(androidx.compose.foundation.text.input.internal.selection.d0 d0Var, z5 z5Var) {
                if (!d0Var.M0()) {
                    z5Var.ib();
                }
                return Unit.f312394a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f20256c, this.f20257d, dVar);
                aVar.f20255b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f20254a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) this.f20255b;
                final androidx.compose.foundation.text.input.internal.selection.d0 d0VarWa = this.f20256c.Wa();
                final z5 z5Var = this.f20256c;
                androidx.compose.ui.input.pointer.l0 l0Var = this.f20257d;
                Function0 function0 = new Function0() { // from class: androidx.compose.foundation.text.input.internal.a6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return z5.i.a.m(d0VarWa, z5Var);
                    }
                };
                kotlinx.coroutines.u0 u0Var = kotlinx.coroutines.u0.UNDISPATCHED;
                kotlinx.coroutines.k.f(s0Var, null, u0Var, new C0145a(d0VarWa, l0Var, null), 1, null);
                kotlinx.coroutines.k.f(s0Var, null, u0Var, new b(z5Var, d0VarWa, l0Var, function0, null), 1, null);
                kotlinx.coroutines.k.f(s0Var, null, u0Var, new c(d0VarWa, l0Var, function0, null), 1, null);
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        i() {
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(androidx.compose.ui.input.pointer.l0 l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            Object objG = kotlinx.coroutines.t0.g(new a(z5.this, l0Var, null), dVar);
            return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1", f = "TextFieldDecoratorModifier.kt", i = {}, l = {771}, m = "invokeSuspend", n = {}, s = {})
    static final class j extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f20270a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.content.internal.c f20272c;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1", f = "TextFieldDecoratorModifier.kt", i = {}, l = {772}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<androidx.compose.ui.platform.n3, kotlin.coroutines.d<?>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f20273a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f20274b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ z5 f20275c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.content.internal.c f20276d;

            /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.z5$j$a$a, reason: collision with other inner class name */
            /* synthetic */ class C0146a extends kotlin.jvm.internal.a implements Function1<androidx.compose.ui.text.input.t, Unit> {
                C0146a(Object obj) {
                    super(1, obj, z5.class, "onImeActionPerformed", "onImeActionPerformed-KlQnJC8(I)Z", 8);
                }

                public final void c(int i10) {
                    ((z5) this.receiver).db(i10);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.text.input.t tVar) {
                    c(tVar.p());
                    return Unit.f312394a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(z5 z5Var, androidx.compose.foundation.content.internal.c cVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f20275c = z5Var;
                this.f20276d = cVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit n(z5 z5Var) {
                z5Var.Wa().t1(androidx.compose.foundation.text.input.internal.selection.a1.Selection);
                return Unit.f312394a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f20275c, this.f20276d, dVar);
                aVar.f20274b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f20273a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    androidx.compose.ui.platform.n3 n3Var = (androidx.compose.ui.platform.n3) this.f20274b;
                    w6 w6VarXa = this.f20275c.Xa();
                    q6 q6VarYa = this.f20275c.Ya();
                    androidx.compose.ui.text.input.u uVarE = this.f20275c.Sa().E(this.f20275c.Ua());
                    androidx.compose.foundation.content.internal.c cVar = this.f20276d;
                    C0146a c0146a = new C0146a(this.f20275c);
                    final z5 z5Var = this.f20275c;
                    Function0 function0 = new Function0() { // from class: androidx.compose.foundation.text.input.internal.c6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return z5.j.a.n(z5Var);
                        }
                    };
                    kotlinx.coroutines.flow.j0<Unit> j0VarVa = this.f20275c.Va();
                    androidx.compose.ui.platform.o4 o4Var = (androidx.compose.ui.platform.o4) androidx.compose.ui.node.i.a(this.f20275c, androidx.compose.ui.platform.q1.D());
                    this.f20273a = 1;
                    if (androidx.compose.foundation.text.input.internal.e.f(n3Var, w6VarXa, q6VarYa, uVarE, cVar, c0146a, function0, j0VarVa, o4Var, this) == objL) {
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
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(androidx.compose.ui.platform.n3 n3Var, kotlin.coroutines.d<?> dVar) {
                return ((a) create(n3Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(androidx.compose.foundation.content.internal.c cVar, kotlin.coroutines.d<? super j> dVar) {
            super(2, dVar);
            this.f20272c = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return z5.this.new j(this.f20272c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f20270a;
            if (i10 == 0) {
                ResultKt.m(obj);
                z5 z5Var = z5.this;
                a aVar = new a(z5Var, this.f20272c, null);
                this.f20270a = 1;
                if (androidx.compose.ui.platform.l3.c(z5Var, aVar, this) == objL) {
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
            return ((j) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$updateNode$1", f = "TextFieldDecoratorModifier.kt", i = {}, l = {496}, m = "invokeSuspend", n = {}, s = {})
    static final class k extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f20277a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.input.internal.selection.d0 f20278b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(androidx.compose.foundation.text.input.internal.selection.d0 d0Var, kotlin.coroutines.d<? super k> dVar) {
            super(2, dVar);
            this.f20278b = d0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new k(this.f20278b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f20277a;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.foundation.text.input.internal.selection.d0 d0Var = this.f20278b;
                this.f20277a = 1;
                if (d0Var.m1(this) == objL) {
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
            return ((k) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public z5(@NotNull w6 w6Var, @NotNull q6 q6Var, @NotNull androidx.compose.foundation.text.input.internal.selection.d0 d0Var, @Nullable androidx.compose.foundation.text.input.c cVar, boolean z10, boolean z11, @NotNull androidx.compose.foundation.text.b4 b4Var, @Nullable androidx.compose.foundation.text.input.f fVar, boolean z12, @NotNull androidx.compose.foundation.interaction.j jVar, boolean z13, @Nullable kotlinx.coroutines.flow.j0<Unit> j0Var) {
        this.f20236w = w6Var;
        this.X = q6Var;
        this.Y = d0Var;
        this.Z = cVar;
        this.f20226p0 = z10;
        this.f20227p1 = z11;
        this.H1 = b4Var;
        this.f20228p2 = fVar;
        this.f20217g3 = z12;
        this.f20218h3 = jVar;
        this.f20219i3 = z13;
        this.f20220j3 = j0Var;
        d0Var.g1(new Function0() { // from class: androidx.compose.foundation.text.input.internal.d5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return z5.ha(this.f19536a);
            }
        });
        this.f20221k3 = new androidx.compose.foundation.h2(this.f20218h3, 0, new Function1() { // from class: androidx.compose.foundation.text.input.internal.f5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return z5.Ma(this.f19602a, ((Boolean) obj).booleanValue());
            }
        }, 2, null);
        this.f20222l3 = (androidx.compose.ui.input.pointer.y0) v9(androidx.compose.ui.input.pointer.w0.a(new i()));
        this.f20224n3 = (androidx.compose.ui.draganddrop.j) v9(e6.c(new Function0() { // from class: androidx.compose.foundation.text.input.internal.g5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return z5.Fa(this.f19611a);
            }
        }, new Function2() { // from class: androidx.compose.foundation.text.input.internal.h5
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(z5.Ga(this.f19619a, (androidx.compose.ui.platform.k1) obj, (androidx.compose.ui.platform.l1) obj2));
            }
        }, new Function1() { // from class: androidx.compose.foundation.text.input.internal.i5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return z5.Ha(this.f19631a, (androidx.compose.ui.draganddrop.b) obj);
            }
        }, null, new Function1() { // from class: androidx.compose.foundation.text.input.internal.k5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return z5.Ia(this.f19685a, (androidx.compose.ui.draganddrop.b) obj);
            }
        }, new Function1() { // from class: androidx.compose.foundation.text.input.internal.l5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return z5.Ja(this.f19700a, (n0.g) obj);
            }
        }, null, new Function1() { // from class: androidx.compose.foundation.text.input.internal.m5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return z5.Ka(this.f19709a, (androidx.compose.ui.draganddrop.b) obj);
            }
        }, new Function1() { // from class: androidx.compose.foundation.text.input.internal.n5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return z5.Ea(this.f19717a, (androidx.compose.ui.draganddrop.b) obj);
            }
        }, 72, null));
        this.f20230q3 = i6.b();
        this.f20231r3 = new f();
        this.f20232s3 = r.b(new Function1() { // from class: androidx.compose.foundation.text.input.internal.o5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return z5.Ba(this.f19733a, (androidx.compose.foundation.text.s3) obj);
            }
        });
        this.f20234u3 = new Function0() { // from class: androidx.compose.foundation.text.input.internal.e5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return z5.hb(this.f19582a);
            }
        };
        this.f20235v3 = d7.g(Boolean.FALSE, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Aa(z5 z5Var) {
        kotlinx.coroutines.k.f(z5Var.Q8(), null, null, z5Var.new c(null), 3, null);
        return true;
    }

    private final void Ab() {
        androidx.compose.ui.node.r1.a(this, new Function0() { // from class: androidx.compose.foundation.text.input.internal.b5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return z5.Bb(this.f19462a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Ba(z5 z5Var, androidx.compose.foundation.text.s3 s3Var) {
        kotlinx.coroutines.k.f(z5Var.Q8(), null, kotlinx.coroutines.u0.UNDISPATCHED, new e(s3Var, z5Var, null), 1, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Bb(z5 z5Var) {
        z5Var.f20225o3 = (androidx.compose.ui.platform.w4) androidx.compose.ui.node.i.a(z5Var, androidx.compose.ui.platform.q1.E());
        z5Var.fb();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean Ca(int i10) {
        androidx.compose.ui.text.input.t.a aVar = androidx.compose.ui.text.input.t.f41944b;
        if (androidx.compose.ui.text.input.t.m(i10, aVar.g())) {
            ((androidx.compose.ui.focus.q) androidx.compose.ui.node.i.a(this, androidx.compose.ui.platform.q1.n())).t(androidx.compose.ui.focus.f.f37408b.e());
            return true;
        }
        if (androidx.compose.ui.text.input.t.m(i10, aVar.k())) {
            ((androidx.compose.ui.focus.q) androidx.compose.ui.node.i.a(this, androidx.compose.ui.platform.q1.n())).t(androidx.compose.ui.focus.f.f37408b.f());
            return true;
        }
        if (!androidx.compose.ui.text.input.t.m(i10, aVar.c())) {
            return false;
        }
        jb().b();
        return true;
    }

    private final void Da() {
        kotlinx.coroutines.p2 p2Var = this.f20233t3;
        int i10 = 7 >> 0;
        if (p2Var != null) {
            kotlinx.coroutines.p2.a.b(p2Var, null, 1, null);
        }
        this.f20233t3 = null;
        kotlinx.coroutines.flow.j0<Unit> j0Var = this.f20220j3;
        if (j0Var != null) {
            j0Var.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Ea(z5 z5Var, androidx.compose.ui.draganddrop.b bVar) {
        z5Var.La();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set Fa(z5 z5Var) {
        return androidx.compose.foundation.content.internal.f.d(z5Var) != null ? x4.f20201b : x4.f20200a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Ga(z5 z5Var, androidx.compose.ui.platform.k1 k1Var, androidx.compose.ui.platform.l1 l1Var) {
        androidx.compose.ui.platform.k1 k1VarA;
        z5Var.La();
        z5Var.Y.P();
        String strC = w.h.c(k1Var);
        androidx.compose.foundation.content.internal.c cVarD = androidx.compose.foundation.content.internal.f.d(z5Var);
        if (cVarD != null) {
            w.g gVarA = cVarD.a().a(new w.g(k1Var, l1Var, w.g.a.f385811b.b(), null, 8, null));
            strC = (gVarA == null || (k1VarA = gVarA.a()) == null) ? null : w.h.c(k1VarA);
        }
        String str = strC;
        if (str != null) {
            w6.H(z5Var.f20236w, str, false, null, false, 14, null);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Ha(z5 z5Var, androidx.compose.ui.draganddrop.b bVar) {
        if (androidx.compose.foundation.content.internal.f.d(z5Var) != null) {
            androidx.compose.foundation.content.internal.a.b(z5Var, bVar);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Ia(z5 z5Var, androidx.compose.ui.draganddrop.b bVar) {
        w.d dVarA;
        androidx.compose.foundation.interaction.e.a aVar = new androidx.compose.foundation.interaction.e.a();
        z5Var.f20218h3.a(aVar);
        z5Var.f20223m3 = aVar;
        androidx.compose.foundation.content.internal.c cVarD = androidx.compose.foundation.content.internal.f.d(z5Var);
        if (cVarD != null && (dVarA = cVarD.a()) != null) {
            dVarA.b();
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Ja(z5 z5Var, n0.g gVar) {
        long jD = r6.d(z5Var.X, gVar.B());
        int i10 = q6.i(z5Var.X, jD, false, 2, null);
        if (i10 >= 0) {
            z5Var.f20236w.L(androidx.compose.ui.text.x3.a(i10));
        }
        z5Var.Y.q1(androidx.compose.foundation.text.k3.Cursor, jD);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Ka(z5 z5Var, androidx.compose.ui.draganddrop.b bVar) {
        w.d dVarA;
        z5Var.La();
        z5Var.Y.P();
        androidx.compose.foundation.content.internal.c cVarD = androidx.compose.foundation.content.internal.f.d(z5Var);
        if (cVarD != null && (dVarA = cVarD.a()) != null) {
            dVarA.e();
        }
        return Unit.f312394a;
    }

    private final void La() {
        androidx.compose.foundation.interaction.e.a aVar = this.f20223m3;
        if (aVar != null) {
            this.f20218h3.a(new androidx.compose.foundation.interaction.e.b(aVar));
            this.f20223m3 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Ma(z5 z5Var, boolean z10) {
        boolean z11 = z5Var.f20226p0 && !z5Var.f20227p1;
        if (!z10) {
            z5Var.Da();
            w6 w6Var = z5Var.f20236w;
            androidx.compose.foundation.text.input.p pVar = w6Var.f20179a;
            androidx.compose.foundation.text.input.c cVar = w6Var.f20180b;
            androidx.compose.foundation.text.input.internal.undo.c cVar2 = androidx.compose.foundation.text.input.internal.undo.c.MergeIfPossible;
            pVar.m().l().e();
            androidx.compose.foundation.text.input.j jVarM = pVar.m();
            jVarM.i();
            w6Var.Q(jVarM);
            pVar.e(cVar, true, cVar2);
            z5Var.f20236w.l();
        } else if (z11) {
            z5Var.xb(false);
        }
        z5Var.Ab();
        return Unit.f312394a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean Na() {
        return ((Boolean) this.f20235v3.getValue()).booleanValue();
    }

    private final boolean Za() {
        androidx.compose.ui.platform.w4 w4Var;
        return this.f20221k3.c5().k() && (w4Var = this.f20225o3) != null && w4Var.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object bb(kotlin.coroutines.d<? super Unit> dVar) {
        Object objCollect = kotlinx.coroutines.flow.k.W1(kotlinx.coroutines.flow.k.l0(androidx.compose.runtime.w6.y(new Function0() { // from class: androidx.compose.foundation.text.input.internal.y4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return z5.cb(this.f20206a);
            }
        }), 1), 1).collect(new g(), dVar);
        return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String cb(z5 z5Var) {
        return z5Var.f20236w.t().toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean db(final int i10) {
        androidx.compose.foundation.text.input.f fVar;
        androidx.compose.ui.text.input.t.a aVar = androidx.compose.ui.text.input.t.f41944b;
        if (androidx.compose.ui.text.input.t.m(i10, aVar.i()) || androidx.compose.ui.text.input.t.m(i10, aVar.a()) || (fVar = this.f20228p2) == null) {
            return Ca(i10);
        }
        if (fVar == null) {
            return true;
        }
        fVar.a(new Function0() { // from class: androidx.compose.foundation.text.input.internal.q5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return z5.eb(this.f19758a, i10);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit eb(z5 z5Var, int i10) {
        z5Var.f20231r3.a(i10);
        return Unit.f312394a;
    }

    private final void fb() {
        this.Y.c1(Za());
        if (Za() && this.f20229p3 == null) {
            this.f20229p3 = kotlinx.coroutines.k.f(Q8(), null, null, new h(null), 3, null);
            return;
        }
        if (!Za()) {
            kotlinx.coroutines.p2 p2Var = this.f20229p3;
            if (p2Var != null) {
                int i10 = 4 ^ 1;
                kotlinx.coroutines.p2.a.b(p2Var, null, 1, null);
            }
            this.f20229p3 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean gb(z5 z5Var) {
        return z5Var.db(z5Var.H1.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ha(z5 z5Var) {
        androidx.compose.ui.node.k.o(z5Var);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.foundation.content.internal.c hb(z5 z5Var) {
        return androidx.compose.foundation.content.internal.f.d(z5Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ib() {
        if (this.f20221k3.a9()) {
            this.f20221k3.k3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.ui.platform.z3 jb() {
        androidx.compose.ui.platform.z3 z3Var = (androidx.compose.ui.platform.z3) androidx.compose.ui.node.i.a(this, androidx.compose.ui.platform.q1.y());
        if (z3Var != null) {
            return z3Var;
        }
        throw new IllegalStateException("No software keyboard controller");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void kb(boolean z10) {
        this.f20235v3.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean qa(boolean z10, z5 z5Var, androidx.compose.ui.text.f fVar) {
        if (!z10) {
            return false;
        }
        z5Var.f20236w.F(fVar);
        z5Var.kb(true);
        int i10 = 4 << 0;
        kotlinx.coroutines.k.f(z5Var.Q8(), null, null, z5Var.new a(null), 3, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ra(z5 z5Var, List list) {
        androidx.compose.ui.text.p3 p3VarF = z5Var.X.f();
        if (p3VarF != null) {
            return list.add(p3VarF);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean sa(boolean z10, z5 z5Var, androidx.compose.ui.text.f fVar) {
        if (!z10) {
            return false;
        }
        z5Var.f20236w.F(fVar);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ta(boolean z10, z5 z5Var, androidx.compose.ui.text.f fVar) {
        if (!z10) {
            return false;
        }
        w6.H(z5Var.f20236w, fVar, true, null, false, 12, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ua(z5 z5Var, int i10, int i11, boolean z10) {
        androidx.compose.foundation.text.input.l lVarT = z10 ? z5Var.f20236w.t() : z5Var.f20236w.u();
        long jH = lVarT.h();
        if (z5Var.f20226p0 && Math.min(i10, i11) >= 0 && Math.max(i10, i11) <= lVarT.length()) {
            if (i10 == androidx.compose.ui.text.w3.n(jH) && i11 == androidx.compose.ui.text.w3.i(jH)) {
                return true;
            }
            long jB = androidx.compose.ui.text.x3.b(i10, i11);
            if (z10 || i10 == i11) {
                z5Var.Y.t1(androidx.compose.foundation.text.input.internal.selection.a1.None);
            } else {
                z5Var.Y.t1(androidx.compose.foundation.text.input.internal.selection.a1.Selection);
            }
            if (z10) {
                z5Var.f20236w.M(jB);
            } else {
                z5Var.f20236w.L(jB);
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean va(z5 z5Var, int i10) {
        z5Var.db(i10);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean wa(z5 z5Var) {
        if (!z5Var.Za()) {
            z5Var.ib();
        } else if (!z5Var.f20227p1) {
            z5Var.jb().a();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean xa(z5 z5Var) {
        if (!z5Var.Za()) {
            z5Var.ib();
        }
        z5Var.Y.t1(androidx.compose.foundation.text.input.internal.selection.a1.Selection);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void xb(boolean z10) {
        if (z10 || this.H1.B()) {
            this.f20233t3 = kotlinx.coroutines.k.f(Q8(), null, null, new j(androidx.compose.foundation.content.internal.f.d(this), null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ya(z5 z5Var) {
        kotlinx.coroutines.k.f(z5Var.Q8(), null, null, z5Var.new d(null), 3, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean za(z5 z5Var) {
        kotlinx.coroutines.k.f(z5Var.Q8(), null, null, z5Var.new b(null), 3, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit zb(z5 z5Var) {
        androidx.compose.ui.node.k.o(z5Var);
        return Unit.f312394a;
    }

    @Override // androidx.compose.ui.node.i2
    public boolean A4() {
        return true;
    }

    public final boolean Oa() {
        return this.f20226p0;
    }

    @Override // androidx.compose.ui.node.t
    public void P(@NotNull androidx.compose.ui.graphics.drawscope.c cVar) {
        cVar.E4();
        if (Na()) {
            androidx.compose.ui.graphics.drawscope.f.V3(cVar, ((androidx.compose.ui.graphics.q0) androidx.compose.ui.node.i.a(this, androidx.compose.foundation.text.k.a())).M(), 0L, 0L, 0.0f, null, null, 0, okhttp3.internal.ws.g.f334652s, null);
        }
    }

    @Nullable
    public final androidx.compose.foundation.text.input.c Pa() {
        return this.Z;
    }

    @NotNull
    public final androidx.compose.foundation.interaction.j Qa() {
        return this.f20218h3;
    }

    @Nullable
    public final androidx.compose.foundation.text.input.f Ra() {
        return this.f20228p2;
    }

    @NotNull
    public final androidx.compose.foundation.text.b4 Sa() {
        return this.H1;
    }

    public final boolean Ta() {
        return this.f20227p1;
    }

    public final boolean Ua() {
        return this.f20217g3;
    }

    @Nullable
    public final kotlinx.coroutines.flow.j0<Unit> Va() {
        return this.f20220j3;
    }

    @NotNull
    public final androidx.compose.foundation.text.input.internal.selection.d0 Wa() {
        return this.Y;
    }

    @NotNull
    public final w6 Xa() {
        return this.f20236w;
    }

    @Override // androidx.compose.ui.node.q1
    public void Y5() {
        Ab();
    }

    @NotNull
    public final q6 Ya() {
        return this.X;
    }

    public final boolean ab() {
        return this.f20219i3;
    }

    @Override // androidx.compose.ui.node.f0
    public void c0(long j10) {
        this.f20224n3.c0(j10);
    }

    @Override // androidx.compose.ui.a0.d
    public void e9() {
        Y5();
        this.Y.f1(this.f20234u3);
        if (this.f20226p0) {
            v9(this.f20221k3);
        }
    }

    @Override // androidx.compose.ui.a0.d
    public void f9() {
        Da();
        this.Y.f1(null);
    }

    @Override // androidx.compose.ui.input.key.g
    public boolean h7(@NotNull KeyEvent keyEvent) {
        return this.f20230q3.d(keyEvent, this.f20236w, this.X, this.Y, this.f20232s3, jb(), this.f20226p0 && !this.f20227p1, this.f20217g3, new Function0() { // from class: androidx.compose.foundation.text.input.internal.p5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(z5.gb(this.f19744a));
            }
        });
    }

    public final void lb(boolean z10) {
        this.f20226p0 = z10;
    }

    public final void mb(@Nullable androidx.compose.foundation.text.input.c cVar) {
        this.Z = cVar;
    }

    @Override // androidx.compose.ui.node.v
    public void n0(@NotNull androidx.compose.ui.layout.g0 g0Var) {
        this.X.p(g0Var);
        if (this.f20226p0) {
            this.f20221k3.n0(g0Var);
        }
    }

    public final void nb(@NotNull androidx.compose.foundation.interaction.j jVar) {
        this.f20218h3 = jVar;
    }

    public final void ob(@Nullable androidx.compose.foundation.text.input.f fVar) {
        this.f20228p2 = fVar;
    }

    @Override // androidx.compose.ui.node.i2
    public void p0(@NotNull androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.foundation.text.input.l lVarR = this.f20236w.r();
        long jH = lVarR.h();
        androidx.compose.ui.semantics.b0.D1(e0Var, new androidx.compose.ui.text.f(this.f20236w.t().toString(), null, 2, null));
        androidx.compose.ui.semantics.b0.z1(e0Var, new androidx.compose.ui.text.f(lVarR.toString(), null, 2, null));
        androidx.compose.ui.semantics.b0.W1(e0Var, jH);
        if (!this.f20226p0) {
            androidx.compose.ui.semantics.b0.n(e0Var);
        }
        if (this.f20219i3) {
            androidx.compose.ui.semantics.b0.d1(e0Var);
        }
        final boolean z10 = this.f20226p0 && !this.f20227p1;
        androidx.compose.ui.semantics.b0.y1(e0Var, z10);
        androidx.compose.ui.semantics.b0.u1(e0Var, androidx.compose.ui.autofill.s.f37034a.d());
        androidx.compose.ui.semantics.b0.O0(e0Var, null, new Function1() { // from class: androidx.compose.foundation.text.input.internal.j5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(z5.qa(z10, this, (androidx.compose.ui.text.f) obj));
            }
        }, 1, null);
        androidx.compose.ui.semantics.b0.l0(e0Var, null, new Function1() { // from class: androidx.compose.foundation.text.input.internal.s5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(z5.ra(this.f19789a, (List) obj));
            }
        }, 1, null);
        if (z10) {
            androidx.compose.ui.semantics.b0.V1(e0Var, null, new Function1() { // from class: androidx.compose.foundation.text.input.internal.t5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(z5.sa(z10, this, (androidx.compose.ui.text.f) obj));
                }
            }, 1, null);
            androidx.compose.ui.semantics.b0.A0(e0Var, null, new Function1() { // from class: androidx.compose.foundation.text.input.internal.u5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(z5.ta(z10, this, (androidx.compose.ui.text.f) obj));
                }
            }, 1, null);
        }
        androidx.compose.ui.semantics.b0.N1(e0Var, null, new pj.n() { // from class: androidx.compose.foundation.text.input.internal.v5
            @Override // pj.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return Boolean.valueOf(z5.ua(this.f20149a, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), ((Boolean) obj3).booleanValue()));
            }
        }, 1, null);
        final int iU = this.H1.u();
        int i10 = 0 & 2;
        androidx.compose.ui.semantics.b0.S0(e0Var, iU, null, new Function0() { // from class: androidx.compose.foundation.text.input.internal.w5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(z5.va(this.f20175a, iU));
            }
        }, 2, null);
        androidx.compose.ui.semantics.b0.Q0(e0Var, null, new Function0() { // from class: androidx.compose.foundation.text.input.internal.x5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(z5.wa(this.f20202a));
            }
        }, 1, null);
        androidx.compose.ui.semantics.b0.U0(e0Var, null, new Function0() { // from class: androidx.compose.foundation.text.input.internal.y5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(z5.xa(this.f20207a));
            }
        }, 1, null);
        if (!androidx.compose.ui.text.w3.h(jH) && !this.f20219i3) {
            androidx.compose.ui.semantics.b0.j(e0Var, null, new Function0() { // from class: androidx.compose.foundation.text.input.internal.z4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(z5.ya(this.f20215a));
                }
            }, 1, null);
            if (this.f20226p0 && !this.f20227p1) {
                androidx.compose.ui.semantics.b0.l(e0Var, null, new Function0() { // from class: androidx.compose.foundation.text.input.internal.a5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(z5.za(this.f19455a));
                    }
                }, 1, null);
            }
        }
        if (z10) {
            androidx.compose.ui.semantics.b0.f1(e0Var, null, new Function0() { // from class: androidx.compose.foundation.text.input.internal.r5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(z5.Aa(this.f19780a));
                }
            }, 1, null);
        }
        androidx.compose.foundation.text.input.c cVar = this.Z;
        if (cVar != null) {
            cVar.p0(e0Var);
        }
        if (this.f20226p0) {
            this.f20221k3.p0(e0Var);
        }
    }

    @Override // androidx.compose.ui.node.d2
    public void p3() {
        this.f20222l3.p3();
    }

    @Override // androidx.compose.ui.node.d2
    public void p5(@NotNull androidx.compose.ui.input.pointer.q qVar, @NotNull androidx.compose.ui.input.pointer.s sVar, long j10) {
        this.f20222l3.p5(qVar, sVar, j10);
    }

    public final void pb(@NotNull androidx.compose.foundation.text.b4 b4Var) {
        this.H1 = b4Var;
    }

    public final void qb(boolean z10) {
        this.f20219i3 = z10;
    }

    public final void rb(boolean z10) {
        this.f20227p1 = z10;
    }

    public final void sb(boolean z10) {
        this.f20217g3 = z10;
    }

    public final void tb(@Nullable kotlinx.coroutines.flow.j0<Unit> j0Var) {
        this.f20220j3 = j0Var;
    }

    public final void ub(@NotNull androidx.compose.foundation.text.input.internal.selection.d0 d0Var) {
        this.Y = d0Var;
    }

    public final void vb(@NotNull w6 w6Var) {
        this.f20236w = w6Var;
    }

    @Override // androidx.compose.ui.input.key.g
    public boolean w2(@NotNull KeyEvent keyEvent) {
        return this.f20230q3.e(keyEvent, this.f20236w, this.Y, (androidx.compose.ui.focus.q) androidx.compose.ui.node.i.a(this, androidx.compose.ui.platform.q1.n()), jb());
    }

    public final void wb(@NotNull q6 q6Var) {
        this.X = q6Var;
    }

    @Override // androidx.compose.ui.node.f0
    public void x(@NotNull androidx.compose.ui.layout.g0 g0Var) {
        this.f20224n3.x(g0Var);
    }

    public final void yb(@NotNull w6 w6Var, @NotNull q6 q6Var, @NotNull androidx.compose.foundation.text.input.internal.selection.d0 d0Var, @Nullable androidx.compose.foundation.text.input.c cVar, boolean z10, boolean z11, @NotNull androidx.compose.foundation.text.b4 b4Var, @Nullable androidx.compose.foundation.text.input.f fVar, boolean z12, @NotNull androidx.compose.foundation.interaction.j jVar, boolean z13, @Nullable kotlinx.coroutines.flow.j0<Unit> j0Var) {
        kotlinx.coroutines.p2 p2Var;
        boolean z14 = this.f20226p0;
        boolean z15 = z14 && !this.f20227p1;
        w6 w6Var2 = this.f20236w;
        androidx.compose.foundation.text.b4 b4Var2 = this.H1;
        androidx.compose.foundation.text.input.internal.selection.d0 d0Var2 = this.Y;
        androidx.compose.foundation.interaction.j jVar2 = this.f20218h3;
        boolean z16 = this.f20219i3;
        kotlinx.coroutines.flow.j0<Unit> j0Var2 = this.f20220j3;
        boolean z17 = z10 && !z11;
        this.f20236w = w6Var;
        this.X = q6Var;
        this.Y = d0Var;
        this.Z = cVar;
        this.f20226p0 = z10;
        this.f20227p1 = z11;
        this.H1 = b4Var;
        this.f20228p2 = fVar;
        this.f20217g3 = z12;
        this.f20218h3 = jVar;
        this.f20219i3 = z13;
        this.f20220j3 = j0Var;
        if (z17 != z15 || !Intrinsics.areEqual(w6Var, w6Var2) || !Intrinsics.areEqual(b4Var, b4Var2) || !Intrinsics.areEqual(j0Var, j0Var2)) {
            if (z17 && Za()) {
                xb(false);
            } else if (!z17) {
                Da();
            }
        }
        if (z10 != z14 || z17 != z15 || !androidx.compose.ui.text.input.t.m(b4Var.u(), b4Var2.u()) || z13 != z16) {
            androidx.compose.ui.node.j2.b(this);
        }
        if (!Intrinsics.areEqual(d0Var, d0Var2)) {
            this.f20222l3.A6();
            if (a9()) {
                d0Var.f1(this.f20234u3);
                if (Za() && (p2Var = this.f20229p3) != null) {
                    if (p2Var != null) {
                        kotlinx.coroutines.p2.a.b(p2Var, null, 1, null);
                    }
                    this.f20229p3 = kotlinx.coroutines.k.f(Q8(), null, null, new k(d0Var, null), 3, null);
                }
            }
            d0Var.g1(new Function0() { // from class: androidx.compose.foundation.text.input.internal.c5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return z5.zb(this.f19518a);
                }
            });
        }
        if (!Intrinsics.areEqual(jVar, jVar2)) {
            this.f20222l3.A6();
            if (this.f20221k3.a9()) {
                this.f20221k3.S9(jVar);
            }
        }
        if (z10 != z14) {
            if (!z10) {
                C9(this.f20221k3);
            } else {
                v9(this.f20221k3);
                this.f20221k3.S9(jVar);
            }
        }
    }
}
