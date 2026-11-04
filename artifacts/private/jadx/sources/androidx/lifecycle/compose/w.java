package androidx.lifecycle.compose;

import androidx.compose.runtime.b2;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.u1;
import androidx.compose.runtime.v1;
import androidx.compose.runtime.w6;
import androidx.lifecycle.j0;
import androidx.lifecycle.o0;
import androidx.media3.exoplayer.a5;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i1;
import kotlin.jvm.internal.p1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nLifecycleEffect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LifecycleEffect.kt\nandroidx/lifecycle/compose/LifecycleEffectKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 6 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,719:1\n75#2:720\n75#2:727\n75#2:734\n75#2:741\n75#2:748\n75#2:759\n75#2:766\n75#2:773\n75#2:780\n75#2:787\n75#2:798\n1282#3,6:721\n1282#3,6:728\n1282#3,6:735\n1282#3,6:742\n1282#3,6:753\n1282#3,6:760\n1282#3,6:767\n1282#3,6:774\n1282#3,6:781\n1282#3,6:792\n1282#3,6:799\n85#4,4:749\n85#4,4:788\n85#5:805\n66#6,5:806\n66#6,5:812\n66#6,5:817\n1#7:811\n*S KotlinDebug\n*F\n+ 1 LifecycleEffect.kt\nandroidx/lifecycle/compose/LifecycleEffectKt\n*L\n54#1:720\n128#1:727\n186#1:734\n249#1:741\n307#1:748\n332#1:759\n446#1:766\n505#1:773\n569#1:780\n628#1:787\n655#1:798\n67#1:721,6\n132#1:728,6\n190#1:735,6\n253#1:742,6\n311#1:753,6\n342#1:760,6\n450#1:767,6\n509#1:774,6\n573#1:781,6\n632#1:792,6\n665#1:799,6\n311#1:749,4\n632#1:788,4\n66#1:805\n76#1:806,5\n357#1:812,5\n680#1:817,5\n*E\n"})
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final String f52290a = "LifecycleStartEffect must provide one or more 'key' parameters that define the identity of the LifecycleStartEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f52291b = "LifecycleResumeEffect must provide one or more 'key' parameters that define the identity of the LifecycleResumeEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.";

    @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 LifecycleEffect.kt\nandroidx/lifecycle/compose/LifecycleEffectKt\n*L\n1#1,69:1\n76#2:70\n*E\n"})
    public static final class a implements u1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ o0 f52292a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j0 f52293b;

        public a(o0 o0Var, j0 j0Var) {
            this.f52292a = o0Var;
            this.f52293b = j0Var;
        }

        @Override // androidx.compose.runtime.u1
        public void dispose() {
            this.f52292a.getLifecycle().g(this.f52293b);
        }
    }

    @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 LifecycleEffect.kt\nandroidx/lifecycle/compose/LifecycleEffectKt\n*L\n1#1,69:1\n681#2,3:70\n*E\n"})
    public static final class b implements u1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ o0 f52294a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j0 f52295b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ i1.h f52296c;

        public b(o0 o0Var, j0 j0Var, i1.h hVar) {
            this.f52294a = o0Var;
            this.f52295b = j0Var;
            this.f52296c = hVar;
        }

        @Override // androidx.compose.runtime.u1
        public void dispose() {
            this.f52294a.getLifecycle().g(this.f52295b);
            y yVar = (y) this.f52296c.f312751a;
            if (yVar != null) {
                yVar.a();
            }
        }
    }

    @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 LifecycleEffect.kt\nandroidx/lifecycle/compose/LifecycleEffectKt\n*L\n1#1,69:1\n358#2,3:70\n*E\n"})
    public static final class c implements u1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ o0 f52297a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j0 f52298b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ i1.h f52299c;

        public c(o0 o0Var, j0 j0Var, i1.h hVar) {
            this.f52297a = o0Var;
            this.f52298b = j0Var;
            this.f52299c = hVar;
        }

        @Override // androidx.compose.runtime.u1
        public void dispose() {
            this.f52297a.getLifecycle().g(this.f52298b);
            b0 b0Var = (b0) this.f52299c.f312751a;
            if (b0Var != null) {
                b0Var.a();
            }
        }
    }

    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f52300a;

        static {
            int[] iArr = new int[androidx.lifecycle.c0.a.values().length];
            try {
                iArr[androidx.lifecycle.c0.a.ON_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.lifecycle.c0.a.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.lifecycle.c0.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[androidx.lifecycle.c0.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f52300a = iArr;
        }
    }

    @androidx.compose.runtime.o
    public static final void A(@Nullable final Object obj, @Nullable final Object obj2, @Nullable o0 o0Var, @NotNull final Function1<? super z, ? extends y> function1, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(752680142);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.k0(obj) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0VarR.k0(obj2) ? 32 : 16;
        }
        if ((i10 & a5.S0) == 0) {
            i12 |= ((i11 & 4) == 0 && c0VarR.k0(o0Var)) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= c0VarR.k0(function1) ? 2048 : 1024;
        }
        if (c0VarR.h((i12 & 1171) != 1170, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0 && !c0VarR.y()) {
                c0VarR.u();
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                }
            } else if ((i11 & 4) != 0) {
                o0Var = (o0) c0VarR.W(d0.c());
                i12 &= -897;
            }
            c0VarR.Z();
            if (m0.l0()) {
                m0.A0(752680142, i12, -1, "androidx.lifecycle.compose.LifecycleResumeEffect (LifecycleEffect.kt:506)");
            }
            boolean zD = c0VarR.D(obj) | c0VarR.D(obj2) | c0VarR.D(o0Var);
            Object objI0 = c0VarR.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new z(o0Var.getLifecycle());
                c0VarR.Y(objI0);
            }
            I(o0Var, (z) objI0, function1, c0VarR, ((i12 >> 6) & 14) | ((i12 >> 3) & 896));
            if (m0.l0()) {
                m0.z0();
            }
        } else {
            c0VarR.u();
        }
        final o0 o0Var2 = o0Var;
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.lifecycle.compose.q
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return w.E(obj, obj2, o0Var2, function1, i10, i11, (androidx.compose.runtime.c0) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    @androidx.compose.runtime.o
    public static final void B(@Nullable final Object obj, @Nullable final Object obj2, @Nullable final Object obj3, @Nullable o0 o0Var, @NotNull final Function1<? super z, ? extends y> function1, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-485941842);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.k0(obj) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0VarR.k0(obj2) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= a5.S0;
        } else if ((i10 & a5.S0) == 0) {
            i12 |= c0VarR.k0(obj3) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= ((i11 & 8) == 0 && c0VarR.k0(o0Var)) ? 2048 : 1024;
        }
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            i12 |= c0VarR.k0(function1) ? 16384 : 8192;
        }
        if (c0VarR.h((i12 & 9363) != 9362, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0 && !c0VarR.y()) {
                c0VarR.u();
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                }
            } else if ((i11 & 8) != 0) {
                o0Var = (o0) c0VarR.W(d0.c());
                i12 &= -7169;
            }
            c0VarR.Z();
            if (m0.l0()) {
                m0.A0(-485941842, i12, -1, "androidx.lifecycle.compose.LifecycleResumeEffect (LifecycleEffect.kt:570)");
            }
            boolean zD = c0VarR.D(obj) | c0VarR.D(obj2) | c0VarR.D(obj3) | c0VarR.D(o0Var);
            Object objI0 = c0VarR.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new z(o0Var.getLifecycle());
                c0VarR.Y(objI0);
            }
            I(o0Var, (z) objI0, function1, c0VarR, ((i12 >> 9) & 14) | ((i12 >> 6) & 896));
            if (m0.l0()) {
                m0.z0();
            }
        } else {
            c0VarR.u();
        }
        final o0 o0Var2 = o0Var;
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.lifecycle.compose.o
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    return w.F(obj, obj2, obj3, o0Var2, function1, i10, i11, (androidx.compose.runtime.c0) obj4, ((Integer) obj5).intValue());
                }
            });
        }
    }

    @androidx.compose.runtime.o
    public static final void C(@NotNull final Object[] objArr, @Nullable o0 o0Var, @NotNull final Function1<? super z, ? extends y> function1, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-781756895);
        int i12 = (i10 & 48) == 0 ? (((i11 & 2) == 0 && c0VarR.k0(o0Var)) ? 32 : 16) | i10 : i10;
        if ((i11 & 4) != 0) {
            i12 |= a5.S0;
        } else if ((i10 & a5.S0) == 0) {
            i12 |= c0VarR.k0(function1) ? 256 : 128;
        }
        c0VarR.m0(350902322, Integer.valueOf(objArr.length));
        int i13 = i12 | (c0VarR.K(objArr.length) ? 4 : 0);
        for (Object obj : objArr) {
            i13 |= c0VarR.k0(obj) ? 4 : 0;
        }
        c0VarR.v0();
        if ((i13 & 14) == 0) {
            i13 |= 2;
        }
        if (c0VarR.h((i13 & com.planner5d.library.engine.input.f.b.F1) != 146, i13 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0 && !c0VarR.y()) {
                c0VarR.u();
                if ((i11 & 2) != 0) {
                    i13 &= -113;
                }
            } else if ((i11 & 2) != 0) {
                o0Var = (o0) c0VarR.W(d0.c());
                i13 &= -113;
            }
            c0VarR.Z();
            if (m0.l0()) {
                m0.A0(-781756895, i13, -1, "androidx.lifecycle.compose.LifecycleResumeEffect (LifecycleEffect.kt:629)");
            }
            p1 p1Var = new p1(2);
            p1Var.b(objArr);
            p1Var.a(o0Var);
            boolean zD = false;
            for (Object obj2 : p1Var.d(new Object[p1Var.c()])) {
                zD |= c0VarR.D(obj2);
            }
            Object objI0 = c0VarR.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new z(o0Var.getLifecycle());
                c0VarR.Y(objI0);
            }
            I(o0Var, (z) objI0, function1, c0VarR, (i13 & 896) | ((i13 >> 3) & 14));
            if (m0.l0()) {
                m0.z0();
            }
        } else {
            c0VarR.u();
        }
        final o0 o0Var2 = o0Var;
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.lifecycle.compose.j
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return w.G(objArr, o0Var2, function1, i10, i11, (androidx.compose.runtime.c0) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(Object obj, o0 o0Var, Function1 function1, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        z(obj, o0Var, function1, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(Object obj, Object obj2, o0 o0Var, Function1 function1, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        A(obj, obj2, o0Var, function1, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(Object obj, Object obj2, Object obj3, o0 o0Var, Function1 function1, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        B(obj, obj2, obj3, o0Var, function1, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G(Object[] objArr, o0 o0Var, Function1 function1, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        C(objArr, o0Var, function1, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(o0 o0Var, Function1 function1, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        y(o0Var, function1, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    private static final void I(final o0 o0Var, final z zVar, final Function1<? super z, ? extends y> function1, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(912823238);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.k0(o0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.k0(zVar) ? 32 : 16;
        }
        if ((i10 & a5.S0) == 0) {
            i11 |= c0VarR.k0(function1) ? 256 : 128;
        }
        if (c0VarR.h((i11 & com.planner5d.library.engine.input.f.b.F1) != 146, i11 & 1)) {
            if (m0.l0()) {
                m0.A0(912823238, i11, -1, "androidx.lifecycle.compose.LifecycleResumeEffectImpl (LifecycleEffect.kt:663)");
            }
            boolean zK0 = c0VarR.k0(zVar) | ((i11 & 896) == 256) | c0VarR.k0(o0Var);
            Object objI0 = c0VarR.i0();
            if (zK0 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.lifecycle.compose.u
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return w.J(o0Var, zVar, function1, (v1) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            b2.c(o0Var, zVar, (Function1) objI0, c0VarR, i11 & okhttp3.internal.ws.g.f334652s);
            if (m0.l0()) {
                m0.z0();
            }
        } else {
            c0VarR.u();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.lifecycle.compose.v
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return w.L(o0Var, zVar, function1, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u1 J(o0 o0Var, final z zVar, final Function1 function1, v1 v1Var) {
        final i1.h hVar = new i1.h();
        j0 j0Var = new j0() { // from class: androidx.lifecycle.compose.p
            @Override // androidx.lifecycle.j0
            public final void e(o0 o0Var2, androidx.lifecycle.c0.a aVar) {
                w.K(zVar, hVar, function1, o0Var2, aVar);
            }
        };
        o0Var.getLifecycle().c(j0Var);
        return new b(o0Var, j0Var, hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    public static final void K(z zVar, i1.h hVar, Function1 function1, o0 o0Var, androidx.lifecycle.c0.a aVar) {
        int i10 = d.f52300a[aVar.ordinal()];
        if (i10 == 3) {
            hVar.f312751a = function1.invoke(zVar);
        } else {
            if (i10 != 4) {
                return;
            }
            y yVar = (y) hVar.f312751a;
            if (yVar != null) {
                yVar.a();
            }
            hVar.f312751a = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L(o0 o0Var, z zVar, Function1 function1, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        I(o0Var, zVar, function1, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.ERROR, message = f52290a)
    public static final void M(@Nullable final o0 o0Var, @NotNull final Function1<? super a0, ? extends b0> function1, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-50807951);
        int i12 = i10 & 1;
        if (!c0VarR.h(i12 != 0, i12)) {
            c0VarR.u();
            s5 s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.lifecycle.compose.e
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return w.T(o0Var, function1, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
            return;
        }
        c0VarR.l0();
        if (i12 != 0 && !c0VarR.y()) {
            c0VarR.u();
            if ((i11 & 1) != 0) {
                i10 &= -15;
            }
        } else if ((i11 & 1) != 0) {
            i10 &= -15;
        }
        c0VarR.Z();
        if (m0.l0()) {
            m0.A0(-50807951, i10, -1, "androidx.lifecycle.compose.LifecycleStartEffect (LifecycleEffect.kt:333)");
        }
        throw new IllegalStateException(f52290a);
    }

    @androidx.compose.runtime.o
    public static final void N(@Nullable final Object obj, @Nullable o0 o0Var, @NotNull final Function1<? super a0, ? extends b0> function1, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1408314671);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.k0(obj) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= ((i11 & 2) == 0 && c0VarR.k0(o0Var)) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= a5.S0;
        } else if ((i10 & a5.S0) == 0) {
            i12 |= c0VarR.k0(function1) ? 256 : 128;
        }
        if (c0VarR.h((i12 & com.planner5d.library.engine.input.f.b.F1) != 146, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0 && !c0VarR.y()) {
                c0VarR.u();
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                }
            } else if ((i11 & 2) != 0) {
                o0Var = (o0) c0VarR.W(d0.c());
                i12 &= -113;
            }
            c0VarR.Z();
            if (m0.l0()) {
                m0.A0(-1408314671, i12, -1, "androidx.lifecycle.compose.LifecycleStartEffect (LifecycleEffect.kt:129)");
            }
            boolean zD = c0VarR.D(obj) | c0VarR.D(o0Var);
            Object objI0 = c0VarR.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new a0(o0Var.getLifecycle());
                c0VarR.Y(objI0);
            }
            W(o0Var, (a0) objI0, function1, c0VarR, ((i12 >> 3) & 14) | (i12 & 896));
            if (m0.l0()) {
                m0.z0();
            }
        } else {
            c0VarR.u();
        }
        final o0 o0Var2 = o0Var;
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.lifecycle.compose.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return w.U(obj, o0Var2, function1, i10, i11, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    @androidx.compose.runtime.o
    public static final void O(@Nullable final Object obj, @Nullable final Object obj2, @Nullable o0 o0Var, @NotNull final Function1<? super a0, ? extends b0> function1, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(696924721);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.k0(obj) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0VarR.k0(obj2) ? 32 : 16;
        }
        if ((i10 & a5.S0) == 0) {
            i12 |= ((i11 & 4) == 0 && c0VarR.k0(o0Var)) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= c0VarR.k0(function1) ? 2048 : 1024;
        }
        if (c0VarR.h((i12 & 1171) != 1170, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0 && !c0VarR.y()) {
                c0VarR.u();
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                }
            } else if ((i11 & 4) != 0) {
                o0Var = (o0) c0VarR.W(d0.c());
                i12 &= -897;
            }
            c0VarR.Z();
            if (m0.l0()) {
                m0.A0(696924721, i12, -1, "androidx.lifecycle.compose.LifecycleStartEffect (LifecycleEffect.kt:187)");
            }
            boolean zD = c0VarR.D(obj) | c0VarR.D(obj2) | c0VarR.D(o0Var);
            Object objI0 = c0VarR.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new a0(o0Var.getLifecycle());
                c0VarR.Y(objI0);
            }
            W(o0Var, (a0) objI0, function1, c0VarR, ((i12 >> 6) & 14) | ((i12 >> 3) & 896));
            if (m0.l0()) {
                m0.z0();
            }
        } else {
            c0VarR.u();
        }
        final o0 o0Var2 = o0Var;
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.lifecycle.compose.n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return w.V(obj, obj2, o0Var2, function1, i10, i11, (androidx.compose.runtime.c0) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    @androidx.compose.runtime.o
    public static final void P(@Nullable final Object obj, @Nullable final Object obj2, @Nullable final Object obj3, @Nullable o0 o0Var, @NotNull final Function1<? super a0, ? extends b0> function1, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(574812561);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.k0(obj) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0VarR.k0(obj2) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= a5.S0;
        } else if ((i10 & a5.S0) == 0) {
            i12 |= c0VarR.k0(obj3) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= ((i11 & 8) == 0 && c0VarR.k0(o0Var)) ? 2048 : 1024;
        }
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            i12 |= c0VarR.k0(function1) ? 16384 : 8192;
        }
        if (c0VarR.h((i12 & 9363) != 9362, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0 && !c0VarR.y()) {
                c0VarR.u();
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                }
            } else if ((i11 & 8) != 0) {
                o0Var = (o0) c0VarR.W(d0.c());
                i12 &= -7169;
            }
            c0VarR.Z();
            if (m0.l0()) {
                m0.A0(574812561, i12, -1, "androidx.lifecycle.compose.LifecycleStartEffect (LifecycleEffect.kt:250)");
            }
            boolean zD = c0VarR.D(obj) | c0VarR.D(obj2) | c0VarR.D(obj3) | c0VarR.D(o0Var);
            Object objI0 = c0VarR.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new a0(o0Var.getLifecycle());
                c0VarR.Y(objI0);
            }
            W(o0Var, (a0) objI0, function1, c0VarR, ((i12 >> 9) & 14) | ((i12 >> 6) & 896));
            if (m0.l0()) {
                m0.z0();
            }
        } else {
            c0VarR.u();
        }
        final o0 o0Var2 = o0Var;
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.lifecycle.compose.s
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    return w.R(obj, obj2, obj3, o0Var2, function1, i10, i11, (androidx.compose.runtime.c0) obj4, ((Integer) obj5).intValue());
                }
            });
        }
    }

    @androidx.compose.runtime.o
    public static final void Q(@NotNull final Object[] objArr, @Nullable o0 o0Var, @NotNull final Function1<? super a0, ? extends b0> function1, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        boolean z10;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1510305724);
        int i12 = (i10 & 48) == 0 ? (((i11 & 2) == 0 && c0VarR.k0(o0Var)) ? 32 : 16) | i10 : i10;
        if ((i11 & 4) != 0) {
            i12 |= a5.S0;
        } else if ((i10 & a5.S0) == 0) {
            i12 |= c0VarR.k0(function1) ? 256 : 128;
        }
        c0VarR.m0(295146869, Integer.valueOf(objArr.length));
        int i13 = i12 | (c0VarR.K(objArr.length) ? 4 : 0);
        for (Object obj : objArr) {
            i13 |= c0VarR.k0(obj) ? 4 : 0;
        }
        c0VarR.v0();
        if ((i13 & 14) == 0) {
            i13 |= 2;
        }
        if ((i13 & com.planner5d.library.engine.input.f.b.F1) != 146) {
            z10 = true;
            int i14 = 7 | 1;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i13 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0 && !c0VarR.y()) {
                c0VarR.u();
                if ((i11 & 2) != 0) {
                    i13 &= -113;
                }
            } else if ((i11 & 2) != 0) {
                o0Var = (o0) c0VarR.W(d0.c());
                i13 &= -113;
            }
            c0VarR.Z();
            if (m0.l0()) {
                m0.A0(-1510305724, i13, -1, "androidx.lifecycle.compose.LifecycleStartEffect (LifecycleEffect.kt:308)");
            }
            p1 p1Var = new p1(2);
            p1Var.b(objArr);
            p1Var.a(o0Var);
            boolean zD = false;
            for (Object obj2 : p1Var.d(new Object[p1Var.c()])) {
                zD |= c0VarR.D(obj2);
            }
            Object objI0 = c0VarR.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new a0(o0Var.getLifecycle());
                c0VarR.Y(objI0);
            }
            W(o0Var, (a0) objI0, function1, c0VarR, (i13 & 896) | ((i13 >> 3) & 14));
            if (m0.l0()) {
                m0.z0();
            }
        } else {
            c0VarR.u();
        }
        final o0 o0Var2 = o0Var;
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.lifecycle.compose.t
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return w.S(objArr, o0Var2, function1, i10, i11, (androidx.compose.runtime.c0) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit R(Object obj, Object obj2, Object obj3, o0 o0Var, Function1 function1, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        P(obj, obj2, obj3, o0Var, function1, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S(Object[] objArr, o0 o0Var, Function1 function1, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Q(objArr, o0Var, function1, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit T(o0 o0Var, Function1 function1, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        M(o0Var, function1, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U(Object obj, o0 o0Var, Function1 function1, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        N(obj, o0Var, function1, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V(Object obj, Object obj2, o0 o0Var, Function1 function1, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        O(obj, obj2, o0Var, function1, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    private static final void W(final o0 o0Var, final a0 a0Var, final Function1<? super a0, ? extends b0> function1, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(228371534);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.k0(o0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.k0(a0Var) ? 32 : 16;
        }
        if ((i10 & a5.S0) == 0) {
            i11 |= c0VarR.k0(function1) ? 256 : 128;
        }
        if (c0VarR.h((i11 & com.planner5d.library.engine.input.f.b.F1) != 146, i11 & 1)) {
            if (m0.l0()) {
                m0.A0(228371534, i11, -1, "androidx.lifecycle.compose.LifecycleStartEffectImpl (LifecycleEffect.kt:340)");
            }
            boolean zK0 = c0VarR.k0(a0Var) | ((i11 & 896) == 256) | c0VarR.k0(o0Var);
            Object objI0 = c0VarR.i0();
            if (zK0 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.lifecycle.compose.l
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return w.X(o0Var, a0Var, function1, (v1) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            b2.c(o0Var, a0Var, (Function1) objI0, c0VarR, i11 & okhttp3.internal.ws.g.f334652s);
            if (m0.l0()) {
                m0.z0();
            }
        } else {
            c0VarR.u();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.lifecycle.compose.m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return w.Z(o0Var, a0Var, function1, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u1 X(o0 o0Var, final a0 a0Var, final Function1 function1, v1 v1Var) {
        final i1.h hVar = new i1.h();
        j0 j0Var = new j0() { // from class: androidx.lifecycle.compose.i
            @Override // androidx.lifecycle.j0
            public final void e(o0 o0Var2, androidx.lifecycle.c0.a aVar) {
                w.Y(a0Var, hVar, function1, o0Var2, aVar);
            }
        };
        o0Var.getLifecycle().c(j0Var);
        return new c(o0Var, j0Var, hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    public static final void Y(a0 a0Var, i1.h hVar, Function1 function1, o0 o0Var, androidx.lifecycle.c0.a aVar) {
        int i10 = d.f52300a[aVar.ordinal()];
        if (i10 == 1) {
            hVar.f312751a = function1.invoke(a0Var);
        } else {
            if (i10 != 2) {
                return;
            }
            b0 b0Var = (b0) hVar.f312751a;
            if (b0Var != null) {
                b0Var.a();
            }
            hVar.f312751a = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z(o0 o0Var, a0 a0Var, Function1 function1, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        W(o0Var, a0Var, function1, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    public static final void t(@NotNull final androidx.lifecycle.c0.a aVar, @Nullable final o0 o0Var, @NotNull final Function0<Unit> function0, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-709389590);
        int i13 = 7 | 4;
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.K(aVar.ordinal()) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= ((i11 & 2) == 0 && c0VarR.k0(o0Var)) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= a5.S0;
        } else if ((i10 & a5.S0) == 0) {
            i12 |= c0VarR.k0(function0) ? 256 : 128;
        }
        if (c0VarR.h((i12 & com.planner5d.library.engine.input.f.b.F1) != 146, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0 && !c0VarR.y()) {
                c0VarR.u();
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                }
            } else if ((i11 & 2) != 0) {
                o0Var = (o0) c0VarR.W(d0.c());
                i12 &= -113;
            }
            c0VarR.Z();
            if (m0.l0()) {
                m0.A0(-709389590, i12, -1, "androidx.lifecycle.compose.LifecycleEventEffect (LifecycleEffect.kt:55)");
            }
            if (aVar == androidx.lifecycle.c0.a.ON_DESTROY) {
                throw new IllegalArgumentException("LifecycleEventEffect cannot be used to listen for Lifecycle.Event.ON_DESTROY, since Compose disposes of the composition before ON_DESTROY observers are invoked.");
            }
            final n7 n7VarW = w6.w(function0, c0VarR, (i12 >> 6) & 14);
            boolean zD = c0VarR.D(n7VarW) | ((i12 & 14) == 4) | c0VarR.k0(o0Var);
            Object objI0 = c0VarR.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.lifecycle.compose.g
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return w.v(o0Var, aVar, n7VarW, (v1) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            b2.d(o0Var, (Function1) objI0, c0VarR, (i12 >> 3) & 14);
            if (m0.l0()) {
                m0.z0();
            }
        } else {
            c0VarR.u();
        }
        final o0 o0Var2 = o0Var;
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.lifecycle.compose.h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return w.x(aVar, o0Var2, function0, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final Function0<Unit> u(n7<? extends Function0<Unit>> n7Var) {
        return n7Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u1 v(o0 o0Var, final androidx.lifecycle.c0.a aVar, final n7 n7Var, v1 v1Var) {
        j0 j0Var = new j0() { // from class: androidx.lifecycle.compose.k
            @Override // androidx.lifecycle.j0
            public final void e(o0 o0Var2, androidx.lifecycle.c0.a aVar2) {
                w.w(aVar, n7Var, o0Var2, aVar2);
            }
        };
        o0Var.getLifecycle().c(j0Var);
        return new a(o0Var, j0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(androidx.lifecycle.c0.a aVar, n7 n7Var, o0 o0Var, androidx.lifecycle.c0.a aVar2) {
        if (aVar2 == aVar) {
            u(n7Var).invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(androidx.lifecycle.c0.a aVar, o0 o0Var, Function0 function0, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        t(aVar, o0Var, function0, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.ERROR, message = f52291b)
    public static final void y(@Nullable final o0 o0Var, @NotNull final Function1<? super z, ? extends y> function1, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-747476210);
        int i12 = i10 & 1;
        if (!c0VarR.h(i12 != 0, i12)) {
            c0VarR.u();
            s5 s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.lifecycle.compose.r
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return w.H(o0Var, function1, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
            return;
        }
        c0VarR.l0();
        if (i12 != 0 && !c0VarR.y()) {
            c0VarR.u();
            if ((i11 & 1) != 0) {
                i10 &= -15;
            }
        } else if ((i11 & 1) != 0) {
            i10 &= -15;
        }
        c0VarR.Z();
        if (m0.l0()) {
            m0.A0(-747476210, i10, -1, "androidx.lifecycle.compose.LifecycleResumeEffect (LifecycleEffect.kt:656)");
        }
        throw new IllegalStateException(f52291b);
    }

    @androidx.compose.runtime.o
    public static final void z(@Nullable final Object obj, @Nullable o0 o0Var, @NotNull final Function1<? super z, ? extends y> function1, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1220373486);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.k0(obj) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= ((i11 & 2) == 0 && c0VarR.k0(o0Var)) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= a5.S0;
        } else if ((i10 & a5.S0) == 0) {
            i12 |= c0VarR.k0(function1) ? 256 : 128;
        }
        if (c0VarR.h((i12 & com.planner5d.library.engine.input.f.b.F1) != 146, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0 && !c0VarR.y()) {
                c0VarR.u();
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                }
            } else if ((i11 & 2) != 0) {
                o0Var = (o0) c0VarR.W(d0.c());
                i12 &= -113;
            }
            c0VarR.Z();
            if (m0.l0()) {
                m0.A0(1220373486, i12, -1, "androidx.lifecycle.compose.LifecycleResumeEffect (LifecycleEffect.kt:447)");
            }
            boolean zD = c0VarR.D(obj) | c0VarR.D(o0Var);
            Object objI0 = c0VarR.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new z(o0Var.getLifecycle());
                c0VarR.Y(objI0);
            }
            I(o0Var, (z) objI0, function1, c0VarR, ((i12 >> 3) & 14) | (i12 & 896));
            if (m0.l0()) {
                m0.z0();
            }
        } else {
            c0VarR.u();
        }
        final o0 o0Var2 = o0Var;
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.lifecycle.compose.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return w.D(obj, o0Var2, function1, i10, i11, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }
}
