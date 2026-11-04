package androidx.compose.foundation.text;

import android.content.res.Resources;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nContextMenu.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextMenu.android.kt\nandroidx/compose/foundation/text/ContextMenu_androidKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,292:1\n1282#2,6:293\n1282#2,3:306\n1285#2,3:310\n1282#2,6:313\n1282#2,6:319\n1282#2,6:325\n1282#2,6:331\n1282#2,6:337\n1282#2,3:350\n1285#2,3:354\n1282#2,6:357\n1282#2,6:363\n1282#2,6:369\n1282#2,6:375\n1282#2,6:381\n1282#2,6:387\n607#3:299\n604#3,6:300\n607#3:343\n604#3,6:344\n605#4:309\n605#4:353\n*S KotlinDebug\n*F\n+ 1 ContextMenu.android.kt\nandroidx/compose/foundation/text/ContextMenu_androidKt\n*L\n57#1:293,6\n58#1:306,3\n58#1:310,3\n59#1:313,6\n63#1:319,6\n66#1:325,6\n87#1:331,6\n100#1:337,6\n101#1:350,3\n101#1:354,3\n102#1:357,6\n107#1:363,6\n122#1:369,6\n125#1:375,6\n141#1:381,6\n144#1:387,6\n58#1:299\n58#1:300,6\n101#1:343\n101#1:344,6\n58#1:309\n101#1:353\n*E\n"})
public final class l2 {

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$2$1$1", f = "ContextMenu.android.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.V}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f20434a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f20435b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n3<u4> f20436c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.selection.u3 f20437d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.runtime.n3<u4> n3Var, androidx.compose.foundation.text.selection.u3 u3Var, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f20436c = n3Var;
            this.f20437d = u3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f20436c, this.f20437d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            androidx.compose.runtime.n3 n3Var;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f20435b;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.runtime.n3<u4> n3Var2 = this.f20436c;
                androidx.compose.foundation.text.selection.u3 u3Var = this.f20437d;
                this.f20434a = n3Var2;
                this.f20435b = 1;
                Object objX = l2.x(u3Var, this);
                if (objX == objL) {
                    return objL;
                }
                obj = objX;
                n3Var = n3Var2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n3Var = (androidx.compose.runtime.n3) this.f20434a;
                ResultKt.m(obj);
            }
            n3Var.setValue(obj);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$5$1$1", f = "ContextMenu.android.kt", i = {}, l = {127}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f20438a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f20439b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n3<u4> f20440c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.input.internal.selection.d0 f20441d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.runtime.n3<u4> n3Var, androidx.compose.foundation.text.input.internal.selection.d0 d0Var, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f20440c = n3Var;
            this.f20441d = d0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f20440c, this.f20441d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            androidx.compose.runtime.n3 n3Var;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f20439b;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.runtime.n3<u4> n3Var2 = this.f20440c;
                androidx.compose.foundation.text.input.internal.selection.d0 d0Var = this.f20441d;
                this.f20438a = n3Var2;
                this.f20439b = 1;
                Object objW = l2.w(d0Var, this);
                if (objW == objL) {
                    return objL;
                }
                obj = objW;
                n3Var = n3Var2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n3Var = (androidx.compose.runtime.n3) this.f20438a;
                ResultKt.m(obj);
            }
            n3Var.setValue(obj);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$menuBuilder$1$1$1", f = "ContextMenu.android.kt", i = {}, l = {110, com.rabbitmq.client.impl.k.b.p.f265340a, com.planner5d.library.engine.input.f.b.B}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f20442a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h5 f20443b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.input.internal.selection.d0 f20444c;

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f20445a;

            static {
                int[] iArr = new int[h5.values().length];
                try {
                    iArr[h5.f19338d.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[h5.f19339e.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[h5.f19340f.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[h5.f19341g.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[h5.f19342h.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f20445a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(h5 h5Var, androidx.compose.foundation.text.input.internal.selection.d0 d0Var, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f20443b = h5Var;
            this.f20444c = d0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new c(this.f20443b, this.f20444c, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
        
            if (r7.V0(r6) == r0) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x006f, code lost:
        
            if (r7.Q(false, r6) == r0) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x007d, code lost:
        
            if (r7.T(r6) == r0) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x007f, code lost:
        
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
                r5 = 3
                int r1 = r6.f20442a
                r5 = 5
                r2 = 3
                r5 = 2
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L25
                r5 = 1
                if (r1 == r4) goto L17
                r5 = 4
                if (r1 == r3) goto L17
                r5 = 1
                if (r1 != r2) goto L1c
            L17:
                r5 = 7
                kotlin.ResultKt.m(r7)
                goto L80
            L1c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r5 = 7
                r6.<init>(r7)
                throw r6
            L25:
                kotlin.ResultKt.m(r7)
                r5 = 4
                androidx.compose.foundation.text.h5 r7 = r6.f20443b
                r5 = 2
                int[] r1 = androidx.compose.foundation.text.l2.c.a.f20445a
                int r7 = r7.ordinal()
                r7 = r1[r7]
                r5 = 2
                if (r7 == r4) goto L72
                if (r7 == r3) goto L65
                if (r7 == r2) goto L57
                r0 = 4
                if (r7 == r0) goto L51
                r0 = 5
                if (r7 != r0) goto L49
                r5 = 0
                androidx.compose.foundation.text.input.internal.selection.d0 r6 = r6.f20444c
                r6.J()
                r5 = 1
                goto L80
            L49:
                r5 = 1
                kotlin.k0 r6 = new kotlin.k0
                r6.<init>()
                r5 = 5
                throw r6
            L51:
                androidx.compose.foundation.text.input.internal.selection.d0 r6 = r6.f20444c
                r6.Y0()
                goto L80
            L57:
                r5 = 0
                androidx.compose.foundation.text.input.internal.selection.d0 r7 = r6.f20444c
                r5 = 5
                r6.f20442a = r2
                r5 = 4
                java.lang.Object r6 = r7.V0(r6)
                if (r6 != r0) goto L80
                goto L7f
            L65:
                androidx.compose.foundation.text.input.internal.selection.d0 r7 = r6.f20444c
                r6.f20442a = r3
                r1 = 0
                java.lang.Object r6 = r7.Q(r1, r6)
                r5 = 5
                if (r6 != r0) goto L80
                goto L7f
            L72:
                r5 = 4
                androidx.compose.foundation.text.input.internal.selection.d0 r7 = r6.f20444c
                r6.f20442a = r4
                r5 = 7
                java.lang.Object r6 = r7.T(r6)
                r5 = 1
                if (r6 != r0) goto L80
            L7f:
                return r0
            L80:
                kotlin.Unit r6 = kotlin.Unit.f312394a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.l2.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$modifier$1$1", f = "ContextMenu.android.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160696i0, 89}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f20446a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.input.internal.selection.d0 f20447b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(androidx.compose.foundation.text.input.internal.selection.d0 d0Var, kotlin.coroutines.d<? super d> dVar) {
            super(1, dVar);
            this.f20447b = d0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return new d(this.f20447b, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0066, code lost:
        
            if (r7.a(r1, r3, r6) == r0) goto L17;
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
                r5 = 6
                int r1 = r6.f20446a
                r2 = 2
                r3 = 2
                r3 = 1
                r5 = 7
                if (r1 == 0) goto L24
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L15
                kotlin.ResultKt.m(r7)
                goto L69
            L15:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "sesrv/iei bue /lctme/atowruinr// /co/f/lk oon ho ee"
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L1f:
                kotlin.ResultKt.m(r7)
                r5 = 2
                goto L34
            L24:
                kotlin.ResultKt.m(r7)
                androidx.compose.foundation.text.input.internal.selection.d0 r7 = r6.f20447b
                r6.f20446a = r3
                r5 = 0
                java.lang.Object r7 = r7.p1(r6)
                if (r7 != r0) goto L34
                r5 = 7
                goto L68
            L34:
                r5 = 3
                androidx.compose.foundation.text.input.internal.selection.d0 r7 = r6.f20447b
                androidx.compose.foundation.text.selection.x r7 = r7.y0()
                r5 = 6
                if (r7 == 0) goto L69
                r5 = 4
                androidx.compose.foundation.text.input.internal.selection.d0 r1 = r6.f20447b
                androidx.compose.foundation.text.input.internal.w6 r1 = r1.G0()
                r5 = 4
                androidx.compose.foundation.text.input.l r1 = r1.u()
                java.lang.CharSequence r1 = r1.i()
                r5 = 6
                androidx.compose.foundation.text.input.internal.selection.d0 r3 = r6.f20447b
                androidx.compose.foundation.text.input.internal.w6 r3 = r3.G0()
                r5 = 3
                androidx.compose.foundation.text.input.l r3 = r3.u()
                long r3 = r3.h()
                r6.f20446a = r2
                r5 = 1
                java.lang.Object r6 = r7.a(r1, r3, r6)
                r5 = 7
                if (r6 != r0) goto L69
            L68:
                return r0
            L69:
                kotlin.Unit r6 = kotlin.Unit.f312394a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.l2.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public static final class e implements Function2<androidx.compose.runtime.c0, Integer, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h5 f20448a;

        public e(h5 h5Var) {
            this.f20448a = h5Var;
        }

        @androidx.compose.runtime.o
        public final String c(androidx.compose.runtime.c0 c0Var, int i10) {
            c0Var.E(-1744780674);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1744780674, i10, -1, "androidx.compose.foundation.text.TextItem.<anonymous> (ContextMenu.android.kt:202)");
            }
            String strR = this.f20448a.r(c0Var, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return strR;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ String invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            return c(c0Var, num.intValue());
        }
    }

    public static final class f implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f20449a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.contextmenu.r f20450b;

        public f(Function0<Unit> function0, androidx.compose.foundation.contextmenu.r rVar) {
            this.f20449a = function0;
            this.f20450b = rVar;
        }

        public final void c() {
            this.f20449a.invoke();
            androidx.compose.foundation.contextmenu.s.a(this.f20450b);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            c();
            return Unit.f312394a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.ContextMenu_androidKt", f = "ContextMenu.android.kt", i = {0}, l = {228}, m = "getContextMenuItemsAvailability", n = {"$this$getContextMenuItemsAvailability"}, s = {"L$0"})
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f20451a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f20452b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f20453c;

        g(kotlin.coroutines.d<? super g> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f20452b = obj;
            this.f20453c |= Integer.MIN_VALUE;
            return l2.w(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.ContextMenu_androidKt", f = "ContextMenu.android.kt", i = {0}, l = {240}, m = "getContextMenuItemsAvailability", n = {"$this$getContextMenuItemsAvailability"}, s = {"L$0"})
    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f20454a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f20455b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f20456c;

        h(kotlin.coroutines.d<? super h> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f20455b = obj;
            this.f20456c |= Integer.MIN_VALUE;
            return l2.x(null, this);
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void j(@NotNull final androidx.compose.foundation.text.input.internal.selection.d0 d0Var, boolean z10, @NotNull Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        final boolean z11;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3;
        androidx.compose.ui.a0 a0VarA;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-579239002);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.k0(d0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.G(z10) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i11 |= c0VarR.k0(function2) ? 256 : 128;
        }
        if (c0VarR.h((i11 & com.planner5d.library.engine.input.f.b.F1) != 146, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-579239002, i11, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:81)");
            }
            if (androidx.compose.foundation.s1.f18599d) {
                c0VarR.E(1069759610);
                if (z10) {
                    c0VarR.E(1069803754);
                    androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
                    boolean zK0 = c0VarR.k0(d0Var);
                    Object objI0 = c0VarR.i0();
                    if (zK0 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new d(d0Var, null);
                        c0VarR.Y(objI0);
                    }
                    a0VarA = androidx.compose.foundation.text.contextmenu.modifier.g.a(aVar, (Function1) objI0);
                    c0VarR.A();
                } else {
                    c0VarR.E(1070289524);
                    c0VarR.A();
                    a0VarA = androidx.compose.ui.a0.E;
                }
                androidx.compose.foundation.text.contextmenu.internal.k0.i(a0VarA, function2, c0VarR, (i11 >> 3) & com.planner5d.library.engine.input.f.b.B, 0);
                c0VarR.A();
                z11 = z10;
                function3 = function2;
            } else {
                c0VarR.E(1070458381);
                Object objI1 = c0VarR.i0();
                androidx.compose.runtime.c0.a aVar2 = androidx.compose.runtime.c0.f35327a;
                if (objI1 == aVar2.a()) {
                    objI1 = new androidx.compose.foundation.contextmenu.r(null, 1, null);
                    c0VarR.Y(objI1);
                }
                final androidx.compose.foundation.contextmenu.r rVar = (androidx.compose.foundation.contextmenu.r) objI1;
                Object objI2 = c0VarR.i0();
                if (objI2 == aVar2.a()) {
                    objI2 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI2);
                }
                final kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) objI2;
                Object objI3 = c0VarR.i0();
                if (objI3 == aVar2.a()) {
                    objI3 = androidx.compose.runtime.d7.g(u4.b(u4.f21628b.a()), null, 2, null);
                    c0VarR.Y(objI3);
                }
                final androidx.compose.runtime.n3 n3Var = (androidx.compose.runtime.n3) objI3;
                boolean zK1 = c0VarR.k0(s0Var);
                Object objI4 = c0VarR.i0();
                if (zK1 || objI4 == aVar2.a()) {
                    objI4 = new Function2() { // from class: androidx.compose.foundation.text.c2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return l2.m(s0Var, (androidx.compose.foundation.text.input.internal.selection.d0) obj, (h5) obj2);
                        }
                    };
                    c0VarR.Y(objI4);
                }
                Function1<androidx.compose.foundation.contextmenu.p, Unit> function1T = androidx.compose.foundation.text.input.internal.selection.x0.t(d0Var, rVar, n3Var, (Function2) objI4);
                Object objI5 = c0VarR.i0();
                if (objI5 == aVar2.a()) {
                    objI5 = new Function0() { // from class: androidx.compose.foundation.text.d2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return l2.n(rVar);
                        }
                    };
                    c0VarR.Y(objI5);
                }
                Function0 function0 = (Function0) objI5;
                boolean zK2 = c0VarR.k0(s0Var) | c0VarR.k0(d0Var);
                Object objI6 = c0VarR.i0();
                if (zK2 || objI6 == aVar2.a()) {
                    objI6 = new Function0() { // from class: androidx.compose.foundation.text.e2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return l2.o(s0Var, n3Var, d0Var);
                        }
                    };
                    c0VarR.Y(objI6);
                }
                z11 = z10;
                function3 = function2;
                androidx.compose.foundation.contextmenu.g.i(rVar, function0, function1T, null, z11, (Function0) objI6, function3, c0VarR, ((i11 << 9) & 57344) | 54 | ((i11 << 12) & 3670016), 8);
                c0VarR.A();
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            z11 = z10;
            function3 = function2;
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.text.f2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return l2.p(d0Var, z11, function3, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void k(@NotNull final androidx.compose.foundation.text.selection.m2 m2Var, @NotNull Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-954926513);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.k0(m2Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.k0(function2) ? 32 : 16;
        }
        if (c0VarR.h((i11 & 19) != 18, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-954926513, i11, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:136)");
            }
            if (androidx.compose.foundation.s1.f18599d) {
                c0VarR.E(1647828491);
                androidx.compose.foundation.text.contextmenu.internal.k0.i(m2Var.S(), function2, c0VarR, i11 & com.planner5d.library.engine.input.f.b.B, 0);
                c0VarR.A();
                function3 = function2;
            } else {
                c0VarR.E(1647943935);
                Object objI0 = c0VarR.i0();
                androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = new androidx.compose.foundation.contextmenu.r(null, 1, null);
                    c0VarR.Y(objI0);
                }
                final androidx.compose.foundation.contextmenu.r rVar = (androidx.compose.foundation.contextmenu.r) objI0;
                Object objI1 = c0VarR.i0();
                if (objI1 == aVar.a()) {
                    objI1 = new Function0() { // from class: androidx.compose.foundation.text.g2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return l2.q(rVar);
                        }
                    };
                    c0VarR.Y(objI1);
                }
                function3 = function2;
                androidx.compose.foundation.contextmenu.g.i(rVar, (Function0) objI1, androidx.compose.foundation.text.selection.b3.s(m2Var, rVar), null, false, null, function3, c0VarR, ((i11 << 15) & 3670016) | 54, 56);
                c0VarR.A();
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            function3 = function2;
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.text.h2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return l2.r(m2Var, function3, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void l(@NotNull final androidx.compose.foundation.text.selection.u3 u3Var, @NotNull Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(2080741862);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.k0(u3Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.k0(function2) ? 32 : 16;
        }
        if (c0VarR.h((i11 & 19) != 18, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(2080741862, i11, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:52)");
            }
            if (androidx.compose.foundation.s1.f18599d) {
                c0VarR.E(-1881943916);
                androidx.compose.foundation.text.contextmenu.internal.k0.i(u3Var.N(), function2, c0VarR, i11 & com.planner5d.library.engine.input.f.b.B, 0);
                c0VarR.A();
                function3 = function2;
            } else {
                c0VarR.E(-1881814801);
                Object objI0 = c0VarR.i0();
                androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = new androidx.compose.foundation.contextmenu.r(null, 1, null);
                    c0VarR.Y(objI0);
                }
                final androidx.compose.foundation.contextmenu.r rVar = (androidx.compose.foundation.contextmenu.r) objI0;
                Object objI1 = c0VarR.i0();
                if (objI1 == aVar.a()) {
                    objI1 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI1);
                }
                final kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) objI1;
                Object objI2 = c0VarR.i0();
                if (objI2 == aVar.a()) {
                    objI2 = androidx.compose.runtime.d7.g(u4.b(u4.f21628b.a()), null, 2, null);
                    c0VarR.Y(objI2);
                }
                final androidx.compose.runtime.n3 n3Var = (androidx.compose.runtime.n3) objI2;
                Object objI3 = c0VarR.i0();
                if (objI3 == aVar.a()) {
                    objI3 = new Function0() { // from class: androidx.compose.foundation.text.i2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return l2.s(rVar);
                        }
                    };
                    c0VarR.Y(objI3);
                }
                Function0 function0 = (Function0) objI3;
                Function1<androidx.compose.foundation.contextmenu.p, Unit> function1Y = androidx.compose.foundation.text.selection.p4.y(u3Var, rVar, n3Var);
                boolean zT = u3Var.T();
                boolean zK0 = c0VarR.k0(s0Var) | c0VarR.k0(u3Var);
                Object objI4 = c0VarR.i0();
                if (zK0 || objI4 == aVar.a()) {
                    objI4 = new Function0() { // from class: androidx.compose.foundation.text.j2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return l2.t(s0Var, n3Var, u3Var);
                        }
                    };
                    c0VarR.Y(objI4);
                }
                function3 = function2;
                androidx.compose.foundation.contextmenu.g.i(rVar, function0, function1Y, null, zT, (Function0) objI4, function3, c0VarR, ((i11 << 15) & 3670016) | 54, 8);
                c0VarR.A();
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            function3 = function2;
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.text.k2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return l2.u(u3Var, function3, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(kotlinx.coroutines.s0 s0Var, androidx.compose.foundation.text.input.internal.selection.d0 d0Var, h5 h5Var) {
        kotlinx.coroutines.k.f(s0Var, null, kotlinx.coroutines.u0.UNDISPATCHED, new c(h5Var, d0Var, null), 1, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(androidx.compose.foundation.contextmenu.r rVar) {
        androidx.compose.foundation.contextmenu.s.a(rVar);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(kotlinx.coroutines.s0 s0Var, androidx.compose.runtime.n3 n3Var, androidx.compose.foundation.text.input.internal.selection.d0 d0Var) {
        kotlinx.coroutines.k.f(s0Var, null, kotlinx.coroutines.u0.UNDISPATCHED, new b(n3Var, d0Var, null), 1, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(androidx.compose.foundation.text.input.internal.selection.d0 d0Var, boolean z10, Function2 function2, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        j(d0Var, z10, function2, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(androidx.compose.foundation.contextmenu.r rVar) {
        androidx.compose.foundation.contextmenu.s.a(rVar);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(androidx.compose.foundation.text.selection.m2 m2Var, Function2 function2, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        k(m2Var, function2, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(androidx.compose.foundation.contextmenu.r rVar) {
        androidx.compose.foundation.contextmenu.s.a(rVar);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(kotlinx.coroutines.s0 s0Var, androidx.compose.runtime.n3 n3Var, androidx.compose.foundation.text.selection.u3 u3Var) {
        kotlinx.coroutines.k.f(s0Var, null, kotlinx.coroutines.u0.UNDISPATCHED, new a(n3Var, u3Var, null), 1, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(androidx.compose.foundation.text.selection.u3 u3Var, Function2 function2, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        l(u3Var, function2, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    public static final void v(@NotNull androidx.compose.foundation.contextmenu.p pVar, @NotNull androidx.compose.foundation.contextmenu.r rVar, @NotNull h5 h5Var, boolean z10, @NotNull Function0<Unit> function0) {
        if (z10) {
            androidx.compose.foundation.contextmenu.p.f(pVar, new e(h5Var), null, false, null, new f(function0, rVar), 14, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public static final Object w(@NotNull androidx.compose.foundation.text.input.internal.selection.d0 d0Var, @NotNull kotlin.coroutines.d<? super u4> dVar) {
        g gVar;
        if (dVar instanceof g) {
            gVar = (g) dVar;
            int i10 = gVar.f20453c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f20453c = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(dVar);
            }
        } else {
            gVar = new g(dVar);
        }
        Object obj = gVar.f20452b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = gVar.f20453c;
        if (i11 == 0) {
            ResultKt.m(obj);
            gVar.f20451a = d0Var;
            gVar.f20453c = 1;
            if (d0Var.p1(gVar) == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d0Var = (androidx.compose.foundation.text.input.internal.selection.d0) gVar.f20451a;
            ResultKt.m(obj);
        }
        return u4.b(u4.d(d0Var.L(), d0Var.N(), d0Var.M(), d0Var.O(), d0Var.K()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public static final Object x(@NotNull androidx.compose.foundation.text.selection.u3 u3Var, @NotNull kotlin.coroutines.d<? super u4> dVar) {
        h hVar;
        if (dVar instanceof h) {
            hVar = (h) dVar;
            int i10 = hVar.f20456c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.f20456c = i10 - Integer.MIN_VALUE;
            } else {
                hVar = new h(dVar);
            }
        } else {
            hVar = new h(dVar);
        }
        Object obj = hVar.f20455b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = hVar.f20456c;
        if (i11 == 0) {
            ResultKt.m(obj);
            hVar.f20454a = u3Var;
            hVar.f20456c = 1;
            if (u3Var.a1(hVar) == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u3Var = (androidx.compose.foundation.text.selection.u3) hVar.f20454a;
            ResultKt.m(obj);
        }
        return u4.b(u4.d(u3Var.v(), u3Var.x(), u3Var.w(), u3Var.y(), u3Var.u()));
    }

    public static final void y(@NotNull a0.a aVar, @NotNull Resources resources, @NotNull h5 h5Var, boolean z10, @NotNull Function1<? super b0.g, Unit> function1) {
        if (z10) {
            a0.c.a(aVar, h5Var.o(), h5Var.q(resources), h5Var.l(), function1);
        }
    }
}
