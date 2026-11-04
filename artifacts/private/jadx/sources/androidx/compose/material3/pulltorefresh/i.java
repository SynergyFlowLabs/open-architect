package androidx.compose.material3.pulltorefresh;

import androidx.compose.animation.y;
import androidx.compose.foundation.layout.c0;
import androidx.compose.foundation.layout.d0;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.x;
import androidx.compose.foundation.v;
import androidx.compose.material3.af;
import androidx.compose.material3.hm;
import androidx.compose.material3.internal.o2;
import androidx.compose.material3.os;
import androidx.compose.material3.pj;
import androidx.compose.runtime.internal.w;
import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.a0;
import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.graphics.q3;
import androidx.compose.ui.graphics.r1;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.layout.b1;
import androidx.compose.ui.layout.c1;
import androidx.compose.ui.layout.i2;
import androidx.compose.ui.layout.z0;
import androidx.media3.exoplayer.a5;
import com.rabbitmq.client.k0;
import d0.e0;
import d0.h1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 1)
@SourceDebugExtension({"SMAP\nPullToRefresh.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullToRefresh.kt\nandroidx/compose/material3/pulltorefresh/PullToRefreshDefaults\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 8 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 9 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 10 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 11 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,755:1\n1282#2,6:756\n1282#2,6:762\n70#3:768\n68#3,8:769\n77#3:807\n79#4,6:777\n86#4,3:792\n89#4,2:801\n93#4:806\n347#5,9:783\n356#5,3:803\n4206#6,6:795\n202#7,8:808\n249#7,14:816\n61#8:830\n70#9:831\n22#10:832\n113#11:833\n*S KotlinDebug\n*F\n+ 1 PullToRefresh.kt\nandroidx/compose/material3/pulltorefresh/PullToRefreshDefaults\n*L\n462#1:756,6\n472#1:762,6\n458#1:768\n458#1:769,8\n458#1:807\n458#1:777,6\n458#1:792,3\n458#1:801,2\n458#1:806\n458#1:783,9\n458#1:803,3\n458#1:795,6\n463#1:808,8\n463#1:816,14\n482#1:830\n482#1:831\n482#1:832\n417#1:833\n*E\n"})
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final i f31931a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final q3 f31932b = androidx.compose.foundation.shape.o.k();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final q3 f31933c = androidx.compose.foundation.shape.o.k();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f31934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f31935e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f31936f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f31937g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f31938h = 0;

    static final class a implements pj.n<c0, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f31939a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f31940b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ r f31941c;

        /* JADX INFO: renamed from: androidx.compose.material3.pulltorefresh.i$a$a, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nPullToRefresh.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullToRefresh.kt\nandroidx/compose/material3/pulltorefresh/PullToRefreshDefaults$Indicator$1$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,755:1\n1282#2,6:756\n*S KotlinDebug\n*F\n+ 1 PullToRefresh.kt\nandroidx/compose/material3/pulltorefresh/PullToRefreshDefaults$Indicator$1$1\n*L\n537#1:756,6\n*E\n"})
        static final class C0250a implements pj.n<Boolean, androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ long f31942a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ r f31943b;

            C0250a(long j10, r rVar) {
                this.f31942a = j10;
                this.f31943b = rVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final float f(r rVar) {
                return rVar.a();
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void d(boolean z10, androidx.compose.runtime.c0 c0Var, int i10) {
                if ((i10 & 6) == 0) {
                    i10 |= c0Var.G(z10) ? 4 : 2;
                }
                if (!c0Var.h((i10 & 19) != 18, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (m0.l0()) {
                    m0.A0(-2064098104, i10, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.Indicator.<anonymous>.<anonymous> (PullToRefresh.kt:528)");
                }
                if (z10) {
                    c0Var.E(-499784343);
                    int i11 = 6 >> 0;
                    os.F(i6.w(a0.E, p.v()), this.f31942a, p.f31963b, 0L, 0, 0.0f, c0Var, 390, 56);
                    c0Var.A();
                } else {
                    c0Var.E(-499540745);
                    boolean zD = c0Var.D(this.f31943b);
                    final r rVar = this.f31943b;
                    Object objI0 = c0Var.i0();
                    if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new o2() { // from class: androidx.compose.material3.pulltorefresh.h
                            @Override // androidx.compose.material3.internal.o2
                            public final float invoke() {
                                return i.a.C0250a.f(rVar);
                            }
                        };
                        c0Var.Y(objI0);
                    }
                    p.h((o2) objI0, this.f31942a, c0Var, 0);
                    c0Var.A();
                }
                if (m0.l0()) {
                    m0.z0();
                }
            }

            @Override // pj.n
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, androidx.compose.runtime.c0 c0Var, Integer num) {
                d(bool.booleanValue(), c0Var, num.intValue());
                return Unit.f312394a;
            }
        }

        a(boolean z10, long j10, r rVar) {
            this.f31939a = z10;
            this.f31940b = j10;
            this.f31941c = rVar;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(c0 c0Var, androidx.compose.runtime.c0 c0Var2, int i10) {
            if (!c0Var2.h((i10 & 17) != 16, i10 & 1)) {
                c0Var2.u();
                return;
            }
            if (m0.l0()) {
                m0.A0(298232649, i10, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.Indicator.<anonymous> (PullToRefresh.kt:524)");
            }
            int i11 = 6 >> 6;
            y.b(Boolean.valueOf(this.f31939a), null, hm.b(h1.DefaultEffects, c0Var2, 6), null, w.e(-2064098104, true, new C0250a(this.f31940b, this.f31941c), c0Var2, 54), c0Var2, 24576, 10);
            if (m0.l0()) {
                m0.z0();
            }
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, androidx.compose.runtime.c0 c0Var2, Integer num) {
            c(c0Var, c0Var2, num.intValue());
            return Unit.f312394a;
        }
    }

    static {
        float fR = androidx.compose.ui.unit.h.r(80);
        f31934d = fR;
        f31935e = fR;
        e0 e0Var = e0.f267938a;
        f31936f = e0Var.c();
        f31937g = e0Var.a();
    }

    private i() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(androidx.compose.ui.graphics.drawscope.c cVar) {
        int iB = p0.f38096b.b();
        androidx.compose.ui.graphics.drawscope.d dVarZ3 = cVar.Z3();
        long jD = dVarZ3.d();
        dVarZ3.f().save();
        try {
            dVarZ3.i().b(-3.4028235E38f, 0.0f, Float.MAX_VALUE, Float.MAX_VALUE, iB);
            cVar.E4();
            dVarZ3.f().B();
            dVarZ3.g(jD);
            return Unit.f312394a;
        } catch (Throwable th2) {
            dVarZ3.f().B();
            dVarZ3.g(jD);
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b1 j(final r rVar, final boolean z10, final float f10, final float f11, final q3 q3Var, c1 c1Var, z0 z0Var, androidx.compose.ui.unit.b bVar) {
        final i2 i2VarP0 = z0Var.P0(bVar.x());
        return c1.h6(c1Var, i2VarP0.h1(), i2VarP0.c1(), null, new Function1() { // from class: androidx.compose.material3.pulltorefresh.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i.k(i2VarP0, rVar, z10, f10, f11, q3Var, (i2.a) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(i2 i2Var, final r rVar, final boolean z10, final float f10, final float f11, final q3 q3Var, i2.a aVar) {
        i2.a.A0(aVar, i2Var, 0, 0, 0.0f, new Function1() { // from class: androidx.compose.material3.pulltorefresh.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i.l(rVar, z10, f10, f11, q3Var, (r1) obj);
            }
        }, 4, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(r rVar, boolean z10, float f10, float f11, q3 q3Var, r1 r1Var) {
        int i10 = 0 << 1;
        boolean z11 = rVar.a() > 0.0f || z10;
        r1Var.h((rVar.a() * r1Var.g6(f10)) - Float.intBitsToFloat((int) (r1Var.d() & k0.f265952a)));
        r1Var.Q(z11 ? r1Var.S7(f11) : 0.0f);
        r1Var.Q3(q3Var);
        r1Var.O(true);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(i iVar, r rVar, boolean z10, a0 a0Var, float f10, q3 q3Var, long j10, float f11, pj.n nVar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        iVar.h(rVar, z10, a0Var, f10, q3Var, j10, f11, nVar, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(i iVar, r rVar, boolean z10, a0 a0Var, long j10, long j11, float f10, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        iVar.g(rVar, z10, a0Var, j10, j11, f10, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @kotlin.l(message = "Use indicatorContainerColor instead", replaceWith = @kotlin.b1(expression = "indicatorContainerColor", imports = {}))
    @af
    public static /* synthetic */ void p() {
    }

    @kotlin.l(message = "Use indicatorShape instead", replaceWith = @kotlin.b1(expression = "indicatorShape", imports = {}))
    @af
    public static /* synthetic */ void y() {
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0117  */
    /* JADX WARN: Code duplicated, block: B:103:0x0122  */
    /* JADX WARN: Code duplicated, block: B:106:0x0127  */
    /* JADX WARN: Code duplicated, block: B:109:0x0135  */
    /* JADX WARN: Code duplicated, block: B:111:0x013f  */
    /* JADX WARN: Code duplicated, block: B:114:0x014c  */
    /* JADX WARN: Code duplicated, block: B:117:0x018f  */
    /* JADX WARN: Code duplicated, block: B:119:0x0198  */
    /* JADX WARN: Code duplicated, block: B:122:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0092  */
    /* JADX WARN: Code duplicated, block: B:57:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:82:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:97:0x010d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x010f  */
    /* JADX WARN: Code duplicated, block: B:99:0x0112  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public final void g(@NotNull final r rVar, final boolean z10, @Nullable a0 a0Var, long j10, long j11, float f10, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        a0 a0Var2;
        long j12;
        long jR;
        final float f11;
        int i13;
        boolean z11;
        final a0 a0Var3;
        final long j13;
        final long j14;
        s5 s5VarT;
        a0 a0Var4;
        long jS;
        int i14;
        float f12;
        long j15;
        int i15;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1076870256);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.D(rVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0VarR.G(z10) ? 32 : 16;
        }
        int i16 = i11 & 4;
        if (i16 == 0) {
            if ((i10 & a5.S0) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 256 : 128;
            }
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    j12 = j10;
                    int i17 = c0VarR.L(j12) ? 2048 : 1024;
                    i12 |= i17;
                } else {
                    j12 = j10;
                }
                i12 |= i17;
            } else {
                j12 = j10;
            }
            if ((i10 & 24576) == 0) {
                jR = j11;
                if ((i11 & 16) == 0 || !c0VarR.L(jR)) {
                    i15 = 8192;
                } else {
                    i15 = 16384;
                }
                i12 |= i15;
            } else {
                jR = j11;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    f11 = f10;
                    int i18 = c0VarR.I(f11) ? 131072 : 65536;
                    i12 |= i18;
                } else {
                    f11 = f10;
                }
                i12 |= i18;
            } else {
                f11 = f10;
            }
            if ((i11 & 64) != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0VarR.D(this)) {
                    i13 = 1048576;
                } else {
                    i13 = 524288;
                }
                i12 |= i13;
            }
            if ((599187 & i12) != 599186) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c0VarR.h(z11, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0 || c0VarR.y()) {
                    if (i16 != 0) {
                        a0Var4 = a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 8) != 0) {
                        jS = s(c0VarR, (i12 >> 18) & 14);
                        i12 &= -7169;
                    } else {
                        jS = j12;
                    }
                    if ((i11 & 16) != 0) {
                        jR = r(c0VarR, (i12 >> 18) & 14);
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        i14 = i12 & (-458753);
                        f12 = f31935e;
                    } else {
                        i14 = i12;
                        f12 = f11;
                    }
                    j15 = jR;
                } else {
                    c0VarR.u();
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                    }
                    a0Var4 = a0Var2;
                    jS = j12;
                    j15 = jR;
                    i14 = i12;
                    f12 = f11;
                }
                c0VarR.Z();
                if (m0.l0()) {
                    m0.A0(-1076870256, i14, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.Indicator (PullToRefresh.kt:515)");
                }
                androidx.compose.runtime.internal.c cVarE = w.e(298232649, true, new a(z10, j15, rVar), c0VarR, 54);
                int i19 = (i14 & 14) | 12582912 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | ((i14 >> 6) & 7168);
                int i20 = i14 << 6;
                int i21 = i19 | (458752 & i20) | (i20 & 234881024);
                a0 a0Var5 = a0Var4;
                h(rVar, z10, a0Var5, f12, null, jS, 0.0f, cVarE, c0VarR, i21, 80);
                if (m0.l0()) {
                    m0.z0();
                }
                f11 = f12;
                j13 = jS;
                j14 = j15;
                a0Var3 = a0Var5;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                j13 = j12;
                j14 = jR;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.pulltorefresh.b
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return i.n(this.f31894a, rVar, z10, a0Var3, j13, j14, f11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= a5.S0;
        a0Var2 = a0Var;
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                j12 = j10;
                if (c0VarR.L(j12)) {
                }
                i12 |= i17;
            } else {
                j12 = j10;
            }
            i12 |= i17;
        } else {
            j12 = j10;
        }
        if ((i10 & 24576) == 0) {
            jR = j11;
            if ((i11 & 16) == 0) {
                i15 = 8192;
            } else {
                i15 = 8192;
            }
            i12 |= i15;
        } else {
            jR = j11;
        }
        if ((196608 & i10) == 0) {
            if ((i11 & 32) == 0) {
                f11 = f10;
                if (c0VarR.I(f11)) {
                }
                i12 |= i18;
            } else {
                f11 = f10;
            }
            i12 |= i18;
        } else {
            f11 = f10;
        }
        if ((i11 & 64) != 0) {
            i12 |= 1572864;
        } else if ((i10 & 1572864) == 0) {
            if (c0VarR.D(this)) {
                i13 = 1048576;
            } else {
                i13 = 524288;
            }
            i12 |= i13;
        }
        if ((599187 & i12) != 599186) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (c0VarR.h(z11, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i16 != 0) {
                    a0Var4 = a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i11 & 8) != 0) {
                    jS = s(c0VarR, (i12 >> 18) & 14);
                    i12 &= -7169;
                } else {
                    jS = j12;
                }
                if ((i11 & 16) != 0) {
                    jR = r(c0VarR, (i12 >> 18) & 14);
                    i12 &= -57345;
                }
                if ((i11 & 32) != 0) {
                    i14 = i12 & (-458753);
                    f12 = f31935e;
                } else {
                    i14 = i12;
                    f12 = f11;
                }
                j15 = jR;
            } else {
                if (i16 != 0) {
                    a0Var4 = a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i11 & 8) != 0) {
                    jS = s(c0VarR, (i12 >> 18) & 14);
                    i12 &= -7169;
                } else {
                    jS = j12;
                }
                if ((i11 & 16) != 0) {
                    jR = r(c0VarR, (i12 >> 18) & 14);
                    i12 &= -57345;
                }
                if ((i11 & 32) != 0) {
                    i14 = i12 & (-458753);
                    f12 = f31935e;
                } else {
                    i14 = i12;
                    f12 = f11;
                }
                j15 = jR;
            }
            c0VarR.Z();
            if (m0.l0()) {
                m0.A0(-1076870256, i14, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.Indicator (PullToRefresh.kt:515)");
            }
            androidx.compose.runtime.internal.c cVarE2 = w.e(298232649, true, new a(z10, j15, rVar), c0VarR, 54);
            int i110 = (i14 & 14) | 12582912 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | ((i14 >> 6) & 7168);
            int i22 = i14 << 6;
            int i23 = i110 | (458752 & i22) | (i22 & 234881024);
            a0 a0Var6 = a0Var4;
            h(rVar, z10, a0Var6, f12, null, jS, 0.0f, cVarE2, c0VarR, i23, 80);
            if (m0.l0()) {
                m0.z0();
            }
            f11 = f12;
            j13 = jS;
            j14 = j15;
            a0Var3 = a0Var6;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            j13 = j12;
            j14 = jR;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.pulltorefresh.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return i.n(this.f31894a, rVar, z10, a0Var3, j13, j14, f11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0125  */
    /* JADX WARN: Code duplicated, block: B:101:0x0128  */
    /* JADX WARN: Code duplicated, block: B:104:0x0131  */
    /* JADX WARN: Code duplicated, block: B:106:0x0138  */
    /* JADX WARN: Code duplicated, block: B:119:0x015b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x015d  */
    /* JADX WARN: Code duplicated, block: B:123:0x0164  */
    /* JADX WARN: Code duplicated, block: B:126:0x016e  */
    /* JADX WARN: Code duplicated, block: B:127:0x0176  */
    /* JADX WARN: Code duplicated, block: B:129:0x017a  */
    /* JADX WARN: Code duplicated, block: B:132:0x0184  */
    /* JADX WARN: Code duplicated, block: B:135:0x0195  */
    /* JADX WARN: Code duplicated, block: B:138:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:141:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:142:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:145:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:146:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:149:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:151:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:157:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:159:0x0204  */
    /* JADX WARN: Code duplicated, block: B:165:0x021c  */
    /* JADX WARN: Code duplicated, block: B:167:0x0222  */
    /* JADX WARN: Code duplicated, block: B:173:0x0231  */
    /* JADX WARN: Code duplicated, block: B:175:0x0237  */
    /* JADX WARN: Code duplicated, block: B:178:0x0288  */
    /* JADX WARN: Code duplicated, block: B:181:0x0294  */
    /* JADX WARN: Code duplicated, block: B:182:0x0298  */
    /* JADX WARN: Code duplicated, block: B:185:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:187:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:190:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:193:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:196:0x030a  */
    /* JADX WARN: Code duplicated, block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:32:0x0063  */
    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    /* JADX WARN: Code duplicated, block: B:42:0x007c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0084  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:56:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:60:0x00af  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:65:0x00be  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00de  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:91:0x0103  */
    /* JADX WARN: Code duplicated, block: B:93:0x0108  */
    /* JADX WARN: Code duplicated, block: B:95:0x0112  */
    /* JADX WARN: Code duplicated, block: B:96:0x0115  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public final void h(@NotNull final r rVar, final boolean z10, @Nullable a0 a0Var, float f10, @Nullable q3 q3Var, long j10, float f11, @NotNull final pj.n<? super c0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        int i13;
        a0 a0Var2;
        int i14;
        float f12;
        int i15;
        long jU;
        int i16;
        float f13;
        int i17;
        int i18;
        boolean z11;
        boolean z12;
        final q3 q3Var2;
        final a0 a0Var3;
        final float f14;
        final long j11;
        final float f15;
        s5 s5VarT;
        q3 q3Var3;
        Object objI0;
        androidx.compose.runtime.c0.a aVar;
        boolean z13;
        boolean z14;
        boolean z15;
        Object objI1;
        int iJ;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        int i19;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1341144489);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.D(rVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) == 0) {
            if ((i10 & 48) == 0) {
                i12 |= c0VarR.G(z10) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & a5.S0) == 0) {
                    a0Var2 = a0Var;
                    if (c0VarR.D(a0Var2)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i10 & 3072) == 0) {
                    if ((i11 & 8) == 0) {
                        f12 = f10;
                        int i20 = c0VarR.I(f12) ? 2048 : 1024;
                        i12 |= i20;
                    } else {
                        f12 = f10;
                    }
                    i12 |= i20;
                } else {
                    f12 = f10;
                }
                if ((i10 & 24576) != 0) {
                    i12 |= ((i11 & 16) == 0 || !c0VarR.D(q3Var)) ? 8192 : 16384;
                }
                i15 = i11 & 32;
                if (i15 != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    jU = j10;
                } else {
                    jU = j10;
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.L(jU)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i12 |= i16;
                    }
                }
                if ((i10 & 1572864) == 0) {
                    f13 = f11;
                    if ((i11 & 64) == 0 || !c0VarR.I(f13)) {
                        i19 = 524288;
                    } else {
                        i19 = 1048576;
                    }
                    i12 |= i19;
                } else {
                    f13 = f11;
                }
                if ((i11 & 128) != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i12 |= i17;
                }
                if ((i11 & 256) != 0) {
                    if ((100663296 & i10) == 0) {
                        if (c0VarR.D(this)) {
                            i18 = 67108864;
                        } else {
                            i18 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i12 |= i18;
                    }
                    z11 = true;
                    if ((i12 & 38347923) != 38347922) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0 || c0VarR.y()) {
                            if (i13 != 0) {
                                a0Var2 = a0.E;
                            }
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                                f12 = f31935e;
                            }
                            if ((i11 & 16) != 0) {
                                q3Var3 = f31933c;
                                i12 = (-57345) & i12;
                            } else {
                                q3Var3 = q3Var;
                            }
                            if (i15 != 0) {
                                jU = q0.f38131b.u();
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                                f13 = f31936f;
                            }
                        } else {
                            c0VarR.u();
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                            }
                            q3Var3 = q3Var;
                        }
                        c0VarR.Z();
                        if (m0.l0()) {
                            m0.A0(-1341144489, i12, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.IndicatorBox (PullToRefresh.kt:456)");
                        }
                        a0 a0VarW = i6.w(a0Var2, p.u());
                        objI0 = c0VarR.i0();
                        aVar = androidx.compose.runtime.c0.f35327a;
                        if (objI0 == aVar.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material3.pulltorefresh.d
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return i.i((androidx.compose.ui.graphics.drawscope.c) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        a0 a0VarD = androidx.compose.ui.draw.n.d(a0VarW, (Function1) objI0);
                        if ((i12 & 14) == 4) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        boolean z16 = z13;
                        if ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        boolean z17 = z16 | z14 | ((((i12 & 7168) ^ 3072) <= 2048 && c0VarR.I(f12)) || (i12 & 3072) == 2048) | ((((3670016 & i12) ^ 1572864) <= 1048576 && c0VarR.I(f13)) || (i12 & 1572864) == 1048576);
                        if ((((57344 & i12) ^ 24576) > 16384 || !c0VarR.D(q3Var3)) && (i12 & 24576) != 16384) {
                        }
                        z15 = z17 | z11;
                        objI1 = c0VarR.i0();
                        if (z15 || objI1 == aVar.a()) {
                            final q3 q3Var4 = q3Var3;
                            final float f16 = f12;
                            final float f17 = f13;
                            objI1 = new pj.n() { // from class: androidx.compose.material3.pulltorefresh.e
                                @Override // pj.n
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    return i.j(rVar, z10, f16, f17, q3Var4, (c1) obj, (z0) obj2, (androidx.compose.ui.unit.b) obj3);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        a0 a0VarC = v.c(androidx.compose.ui.layout.q0.a(a0VarD, (pj.n) objI1), jU, q3Var3);
                        int i21 = ((i12 >> 12) & 7168) | 48;
                        a1 a1VarK = x.k(androidx.compose.ui.e.f37317a.i(), false);
                        iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                        androidx.compose.runtime.b1 b1VarK = c0VarR.k();
                        a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarC);
                        androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
                        q3 q3Var5 = q3Var3;
                        function0A = aVar2.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD = y7.d(c0VarR);
                        y7.n(c0VarD, a1VarK, aVar2.e());
                        y7.n(c0VarD, b1VarK, aVar2.g());
                        function2B = aVar2.b();
                        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        }
                        y7.n(c0VarD, a0VarN, aVar2.f());
                        nVar.invoke(d0.f15956a, c0VarR, Integer.valueOf(((i21 >> 6) & com.planner5d.library.engine.input.f.b.B) | 6));
                        c0VarR.o();
                        if (m0.l0()) {
                            m0.z0();
                        }
                        q3Var2 = q3Var5;
                    } else {
                        c0VarR.u();
                        q3Var2 = q3Var;
                    }
                    a0Var3 = a0Var2;
                    f14 = f12;
                    j11 = jU;
                    f15 = f13;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.pulltorefresh.f
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return i.m(this.f31913a, rVar, z10, a0Var3, f14, q3Var2, j11, f15, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 100663296;
                z11 = true;
                if ((i12 & 38347923) != 38347922) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var2 = a0.E;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            f12 = f31935e;
                        }
                        if ((i11 & 16) != 0) {
                            q3Var3 = f31933c;
                            i12 = (-57345) & i12;
                        } else {
                            q3Var3 = q3Var;
                        }
                        if (i15 != 0) {
                            jU = q0.f38131b.u();
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            f13 = f31936f;
                        }
                    } else {
                        if (i13 != 0) {
                            a0Var2 = a0.E;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            f12 = f31935e;
                        }
                        if ((i11 & 16) != 0) {
                            q3Var3 = f31933c;
                            i12 = (-57345) & i12;
                        } else {
                            q3Var3 = q3Var;
                        }
                        if (i15 != 0) {
                            jU = q0.f38131b.u();
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            f13 = f31936f;
                        }
                    }
                    c0VarR.Z();
                    if (m0.l0()) {
                        m0.A0(-1341144489, i12, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.IndicatorBox (PullToRefresh.kt:456)");
                    }
                    a0 a0VarW2 = i6.w(a0Var2, p.u());
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material3.pulltorefresh.d
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return i.i((androidx.compose.ui.graphics.drawscope.c) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    a0 a0VarD2 = androidx.compose.ui.draw.n.d(a0VarW2, (Function1) objI0);
                    if ((i12 & 14) == 4) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z18 = z13;
                    if ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean z19 = z18 | z14 | ((((i12 & 7168) ^ 3072) <= 2048 && c0VarR.I(f12)) || (i12 & 3072) == 2048) | ((((3670016 & i12) ^ 1572864) <= 1048576 && c0VarR.I(f13)) || (i12 & 1572864) == 1048576);
                    z11 = ((57344 & i12) ^ 24576) > 16384 ? false : false;
                    z15 = z19 | z11;
                    objI1 = c0VarR.i0();
                    if (z15) {
                        final q3 q3Var6 = q3Var3;
                        final float f18 = f12;
                        final float f19 = f13;
                        objI1 = new pj.n() { // from class: androidx.compose.material3.pulltorefresh.e
                            @Override // pj.n
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                return i.j(rVar, z10, f18, f19, q3Var6, (c1) obj, (z0) obj2, (androidx.compose.ui.unit.b) obj3);
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        final q3 q3Var7 = q3Var3;
                        final float f110 = f12;
                        final float f111 = f13;
                        objI1 = new pj.n() { // from class: androidx.compose.material3.pulltorefresh.e
                            @Override // pj.n
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                return i.j(rVar, z10, f110, f111, q3Var7, (c1) obj, (z0) obj2, (androidx.compose.ui.unit.b) obj3);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    a0 a0VarC2 = v.c(androidx.compose.ui.layout.q0.a(a0VarD2, (pj.n) objI1), jU, q3Var3);
                    int i22 = ((i12 >> 12) & 7168) | 48;
                    a1 a1VarK2 = x.k(androidx.compose.ui.e.f37317a.i(), false);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
                    a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarC2);
                    androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
                    q3 q3Var8 = q3Var3;
                    function0A = aVar3.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = y7.d(c0VarR);
                    y7.n(c0VarD, a1VarK2, aVar3.e());
                    y7.n(c0VarD, b1VarK2, aVar3.g());
                    function2B = aVar3.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    y7.n(c0VarD, a0VarN2, aVar3.f());
                    nVar.invoke(d0.f15956a, c0VarR, Integer.valueOf(((i22 >> 6) & com.planner5d.library.engine.input.f.b.B) | 6));
                    c0VarR.o();
                    if (m0.l0()) {
                        m0.z0();
                    }
                    q3Var2 = q3Var8;
                } else {
                    c0VarR.u();
                    q3Var2 = q3Var;
                }
                a0Var3 = a0Var2;
                f14 = f12;
                j11 = jU;
                f15 = f13;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.pulltorefresh.f
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return i.m(this.f31913a, rVar, z10, a0Var3, f14, q3Var2, j11, f15, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= a5.S0;
            a0Var2 = a0Var;
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    f12 = f10;
                    if (c0VarR.I(f12)) {
                    }
                    i12 |= i20;
                } else {
                    f12 = f10;
                }
                i12 |= i20;
            } else {
                f12 = f10;
            }
            if ((i10 & 24576) != 0) {
                i12 |= ((i11 & 16) == 0 || !c0VarR.D(q3Var)) ? 8192 : 16384;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
                jU = j10;
            } else {
                jU = j10;
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.L(jU)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
            }
            if ((i10 & 1572864) == 0) {
                f13 = f11;
                if ((i11 & 64) == 0) {
                    i19 = 524288;
                } else {
                    i19 = 524288;
                }
                i12 |= i19;
            } else {
                f13 = f11;
            }
            if ((i11 & 128) != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c0VarR.k0(nVar)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i12 |= i17;
            }
            if ((i11 & 256) != 0) {
                if ((100663296 & i10) == 0) {
                    if (c0VarR.D(this)) {
                        i18 = 67108864;
                    } else {
                        i18 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i12 |= i18;
                }
                z11 = true;
                if ((i12 & 38347923) != 38347922) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var2 = a0.E;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            f12 = f31935e;
                        }
                        if ((i11 & 16) != 0) {
                            q3Var3 = f31933c;
                            i12 = (-57345) & i12;
                        } else {
                            q3Var3 = q3Var;
                        }
                        if (i15 != 0) {
                            jU = q0.f38131b.u();
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            f13 = f31936f;
                        }
                    } else {
                        if (i13 != 0) {
                            a0Var2 = a0.E;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            f12 = f31935e;
                        }
                        if ((i11 & 16) != 0) {
                            q3Var3 = f31933c;
                            i12 = (-57345) & i12;
                        } else {
                            q3Var3 = q3Var;
                        }
                        if (i15 != 0) {
                            jU = q0.f38131b.u();
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            f13 = f31936f;
                        }
                    }
                    c0VarR.Z();
                    if (m0.l0()) {
                        m0.A0(-1341144489, i12, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.IndicatorBox (PullToRefresh.kt:456)");
                    }
                    a0 a0VarW3 = i6.w(a0Var2, p.u());
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material3.pulltorefresh.d
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return i.i((androidx.compose.ui.graphics.drawscope.c) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    a0 a0VarD3 = androidx.compose.ui.draw.n.d(a0VarW3, (Function1) objI0);
                    if ((i12 & 14) == 4) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z110 = z13;
                    if ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean z111 = z110 | z14 | ((((i12 & 7168) ^ 3072) <= 2048 && c0VarR.I(f12)) || (i12 & 3072) == 2048) | ((((3670016 & i12) ^ 1572864) <= 1048576 && c0VarR.I(f13)) || (i12 & 1572864) == 1048576);
                    if (((57344 & i12) ^ 24576) > 16384) {
                    }
                    z15 = z111 | z11;
                    objI1 = c0VarR.i0();
                    if (z15) {
                        final q3 q3Var9 = q3Var3;
                        final float f112 = f12;
                        final float f113 = f13;
                        objI1 = new pj.n() { // from class: androidx.compose.material3.pulltorefresh.e
                            @Override // pj.n
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                return i.j(rVar, z10, f112, f113, q3Var9, (c1) obj, (z0) obj2, (androidx.compose.ui.unit.b) obj3);
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        final q3 q3Var10 = q3Var3;
                        final float f114 = f12;
                        final float f115 = f13;
                        objI1 = new pj.n() { // from class: androidx.compose.material3.pulltorefresh.e
                            @Override // pj.n
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                return i.j(rVar, z10, f114, f115, q3Var10, (c1) obj, (z0) obj2, (androidx.compose.ui.unit.b) obj3);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    a0 a0VarC3 = v.c(androidx.compose.ui.layout.q0.a(a0VarD3, (pj.n) objI1), jU, q3Var3);
                    int i23 = ((i12 >> 12) & 7168) | 48;
                    a1 a1VarK3 = x.k(androidx.compose.ui.e.f37317a.i(), false);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK3 = c0VarR.k();
                    a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarC3);
                    androidx.compose.ui.node.g.a aVar4 = androidx.compose.ui.node.g.I;
                    q3 q3Var11 = q3Var3;
                    function0A = aVar4.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = y7.d(c0VarR);
                    y7.n(c0VarD, a1VarK3, aVar4.e());
                    y7.n(c0VarD, b1VarK3, aVar4.g());
                    function2B = aVar4.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    y7.n(c0VarD, a0VarN3, aVar4.f());
                    nVar.invoke(d0.f15956a, c0VarR, Integer.valueOf(((i23 >> 6) & com.planner5d.library.engine.input.f.b.B) | 6));
                    c0VarR.o();
                    if (m0.l0()) {
                        m0.z0();
                    }
                    q3Var2 = q3Var11;
                } else {
                    c0VarR.u();
                    q3Var2 = q3Var;
                }
                a0Var3 = a0Var2;
                f14 = f12;
                j11 = jU;
                f15 = f13;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.pulltorefresh.f
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return i.m(this.f31913a, rVar, z10, a0Var3, f14, q3Var2, j11, f15, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 100663296;
            z11 = true;
            if ((i12 & 38347923) != 38347922) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        a0Var2 = a0.E;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        f12 = f31935e;
                    }
                    if ((i11 & 16) != 0) {
                        q3Var3 = f31933c;
                        i12 = (-57345) & i12;
                    } else {
                        q3Var3 = q3Var;
                    }
                    if (i15 != 0) {
                        jU = q0.f38131b.u();
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        f13 = f31936f;
                    }
                } else {
                    if (i13 != 0) {
                        a0Var2 = a0.E;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        f12 = f31935e;
                    }
                    if ((i11 & 16) != 0) {
                        q3Var3 = f31933c;
                        i12 = (-57345) & i12;
                    } else {
                        q3Var3 = q3Var;
                    }
                    if (i15 != 0) {
                        jU = q0.f38131b.u();
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        f13 = f31936f;
                    }
                }
                c0VarR.Z();
                if (m0.l0()) {
                    m0.A0(-1341144489, i12, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.IndicatorBox (PullToRefresh.kt:456)");
                }
                a0 a0VarW4 = i6.w(a0Var2, p.u());
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material3.pulltorefresh.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return i.i((androidx.compose.ui.graphics.drawscope.c) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                a0 a0VarD4 = androidx.compose.ui.draw.n.d(a0VarW4, (Function1) objI0);
                if ((i12 & 14) == 4) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z112 = z13;
                if ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z113 = z112 | z14 | ((((i12 & 7168) ^ 3072) <= 2048 && c0VarR.I(f12)) || (i12 & 3072) == 2048) | ((((3670016 & i12) ^ 1572864) <= 1048576 && c0VarR.I(f13)) || (i12 & 1572864) == 1048576);
                if (((57344 & i12) ^ 24576) > 16384) {
                }
                z15 = z113 | z11;
                objI1 = c0VarR.i0();
                if (z15) {
                    final q3 q3Var12 = q3Var3;
                    final float f116 = f12;
                    final float f117 = f13;
                    objI1 = new pj.n() { // from class: androidx.compose.material3.pulltorefresh.e
                        @Override // pj.n
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            return i.j(rVar, z10, f116, f117, q3Var12, (c1) obj, (z0) obj2, (androidx.compose.ui.unit.b) obj3);
                        }
                    };
                    c0VarR.Y(objI1);
                } else {
                    final q3 q3Var13 = q3Var3;
                    final float f118 = f12;
                    final float f119 = f13;
                    objI1 = new pj.n() { // from class: androidx.compose.material3.pulltorefresh.e
                        @Override // pj.n
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            return i.j(rVar, z10, f118, f119, q3Var13, (c1) obj, (z0) obj2, (androidx.compose.ui.unit.b) obj3);
                        }
                    };
                    c0VarR.Y(objI1);
                }
                a0 a0VarC4 = v.c(androidx.compose.ui.layout.q0.a(a0VarD4, (pj.n) objI1), jU, q3Var3);
                int i24 = ((i12 >> 12) & 7168) | 48;
                a1 a1VarK4 = x.k(androidx.compose.ui.e.f37317a.i(), false);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK4 = c0VarR.k();
                a0 a0VarN4 = androidx.compose.ui.m.n(c0VarR, a0VarC4);
                androidx.compose.ui.node.g.a aVar5 = androidx.compose.ui.node.g.I;
                q3 q3Var14 = q3Var3;
                function0A = aVar5.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = y7.d(c0VarR);
                y7.n(c0VarD, a1VarK4, aVar5.e());
                y7.n(c0VarD, b1VarK4, aVar5.g());
                function2B = aVar5.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                y7.n(c0VarD, a0VarN4, aVar5.f());
                nVar.invoke(d0.f15956a, c0VarR, Integer.valueOf(((i24 >> 6) & com.planner5d.library.engine.input.f.b.B) | 6));
                c0VarR.o();
                if (m0.l0()) {
                    m0.z0();
                }
                q3Var2 = q3Var14;
            } else {
                c0VarR.u();
                q3Var2 = q3Var;
            }
            a0Var3 = a0Var2;
            f14 = f12;
            j11 = jU;
            f15 = f13;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.pulltorefresh.f
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return i.m(this.f31913a, rVar, z10, a0Var3, f14, q3Var2, j11, f15, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & a5.S0) == 0) {
                a0Var2 = a0Var;
                if (c0VarR.D(a0Var2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    f12 = f10;
                    if (c0VarR.I(f12)) {
                    }
                    i12 |= i20;
                } else {
                    f12 = f10;
                }
                i12 |= i20;
            } else {
                f12 = f10;
            }
            if ((i10 & 24576) != 0) {
                i12 |= ((i11 & 16) == 0 || !c0VarR.D(q3Var)) ? 8192 : 16384;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
                jU = j10;
            } else {
                jU = j10;
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.L(jU)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
            }
            if ((i10 & 1572864) == 0) {
                f13 = f11;
                if ((i11 & 64) == 0) {
                    i19 = 524288;
                } else {
                    i19 = 524288;
                }
                i12 |= i19;
            } else {
                f13 = f11;
            }
            if ((i11 & 128) != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c0VarR.k0(nVar)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i12 |= i17;
            }
            if ((i11 & 256) != 0) {
                if ((100663296 & i10) == 0) {
                    if (c0VarR.D(this)) {
                        i18 = 67108864;
                    } else {
                        i18 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i12 |= i18;
                }
                z11 = true;
                if ((i12 & 38347923) != 38347922) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var2 = a0.E;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            f12 = f31935e;
                        }
                        if ((i11 & 16) != 0) {
                            q3Var3 = f31933c;
                            i12 = (-57345) & i12;
                        } else {
                            q3Var3 = q3Var;
                        }
                        if (i15 != 0) {
                            jU = q0.f38131b.u();
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            f13 = f31936f;
                        }
                    } else {
                        if (i13 != 0) {
                            a0Var2 = a0.E;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            f12 = f31935e;
                        }
                        if ((i11 & 16) != 0) {
                            q3Var3 = f31933c;
                            i12 = (-57345) & i12;
                        } else {
                            q3Var3 = q3Var;
                        }
                        if (i15 != 0) {
                            jU = q0.f38131b.u();
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            f13 = f31936f;
                        }
                    }
                    c0VarR.Z();
                    if (m0.l0()) {
                        m0.A0(-1341144489, i12, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.IndicatorBox (PullToRefresh.kt:456)");
                    }
                    a0 a0VarW5 = i6.w(a0Var2, p.u());
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material3.pulltorefresh.d
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return i.i((androidx.compose.ui.graphics.drawscope.c) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    a0 a0VarD5 = androidx.compose.ui.draw.n.d(a0VarW5, (Function1) objI0);
                    if ((i12 & 14) == 4) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z114 = z13;
                    if ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean z115 = z114 | z14 | ((((i12 & 7168) ^ 3072) <= 2048 && c0VarR.I(f12)) || (i12 & 3072) == 2048) | ((((3670016 & i12) ^ 1572864) <= 1048576 && c0VarR.I(f13)) || (i12 & 1572864) == 1048576);
                    if (((57344 & i12) ^ 24576) > 16384) {
                    }
                    z15 = z115 | z11;
                    objI1 = c0VarR.i0();
                    if (z15) {
                        final q3 q3Var15 = q3Var3;
                        final float f1110 = f12;
                        final float f1111 = f13;
                        objI1 = new pj.n() { // from class: androidx.compose.material3.pulltorefresh.e
                            @Override // pj.n
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                return i.j(rVar, z10, f1110, f1111, q3Var15, (c1) obj, (z0) obj2, (androidx.compose.ui.unit.b) obj3);
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        final q3 q3Var16 = q3Var3;
                        final float f1112 = f12;
                        final float f1113 = f13;
                        objI1 = new pj.n() { // from class: androidx.compose.material3.pulltorefresh.e
                            @Override // pj.n
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                return i.j(rVar, z10, f1112, f1113, q3Var16, (c1) obj, (z0) obj2, (androidx.compose.ui.unit.b) obj3);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    a0 a0VarC5 = v.c(androidx.compose.ui.layout.q0.a(a0VarD5, (pj.n) objI1), jU, q3Var3);
                    int i25 = ((i12 >> 12) & 7168) | 48;
                    a1 a1VarK5 = x.k(androidx.compose.ui.e.f37317a.i(), false);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK5 = c0VarR.k();
                    a0 a0VarN5 = androidx.compose.ui.m.n(c0VarR, a0VarC5);
                    androidx.compose.ui.node.g.a aVar6 = androidx.compose.ui.node.g.I;
                    q3 q3Var17 = q3Var3;
                    function0A = aVar6.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = y7.d(c0VarR);
                    y7.n(c0VarD, a1VarK5, aVar6.e());
                    y7.n(c0VarD, b1VarK5, aVar6.g());
                    function2B = aVar6.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    y7.n(c0VarD, a0VarN5, aVar6.f());
                    nVar.invoke(d0.f15956a, c0VarR, Integer.valueOf(((i25 >> 6) & com.planner5d.library.engine.input.f.b.B) | 6));
                    c0VarR.o();
                    if (m0.l0()) {
                        m0.z0();
                    }
                    q3Var2 = q3Var17;
                } else {
                    c0VarR.u();
                    q3Var2 = q3Var;
                }
                a0Var3 = a0Var2;
                f14 = f12;
                j11 = jU;
                f15 = f13;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.pulltorefresh.f
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return i.m(this.f31913a, rVar, z10, a0Var3, f14, q3Var2, j11, f15, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 100663296;
            z11 = true;
            if ((i12 & 38347923) != 38347922) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        a0Var2 = a0.E;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        f12 = f31935e;
                    }
                    if ((i11 & 16) != 0) {
                        q3Var3 = f31933c;
                        i12 = (-57345) & i12;
                    } else {
                        q3Var3 = q3Var;
                    }
                    if (i15 != 0) {
                        jU = q0.f38131b.u();
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        f13 = f31936f;
                    }
                } else {
                    if (i13 != 0) {
                        a0Var2 = a0.E;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        f12 = f31935e;
                    }
                    if ((i11 & 16) != 0) {
                        q3Var3 = f31933c;
                        i12 = (-57345) & i12;
                    } else {
                        q3Var3 = q3Var;
                    }
                    if (i15 != 0) {
                        jU = q0.f38131b.u();
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        f13 = f31936f;
                    }
                }
                c0VarR.Z();
                if (m0.l0()) {
                    m0.A0(-1341144489, i12, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.IndicatorBox (PullToRefresh.kt:456)");
                }
                a0 a0VarW6 = i6.w(a0Var2, p.u());
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material3.pulltorefresh.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return i.i((androidx.compose.ui.graphics.drawscope.c) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                a0 a0VarD6 = androidx.compose.ui.draw.n.d(a0VarW6, (Function1) objI0);
                if ((i12 & 14) == 4) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z116 = z13;
                if ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z117 = z116 | z14 | ((((i12 & 7168) ^ 3072) <= 2048 && c0VarR.I(f12)) || (i12 & 3072) == 2048) | ((((3670016 & i12) ^ 1572864) <= 1048576 && c0VarR.I(f13)) || (i12 & 1572864) == 1048576);
                if (((57344 & i12) ^ 24576) > 16384) {
                }
                z15 = z117 | z11;
                objI1 = c0VarR.i0();
                if (z15) {
                    final q3 q3Var18 = q3Var3;
                    final float f1114 = f12;
                    final float f1115 = f13;
                    objI1 = new pj.n() { // from class: androidx.compose.material3.pulltorefresh.e
                        @Override // pj.n
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            return i.j(rVar, z10, f1114, f1115, q3Var18, (c1) obj, (z0) obj2, (androidx.compose.ui.unit.b) obj3);
                        }
                    };
                    c0VarR.Y(objI1);
                } else {
                    final q3 q3Var19 = q3Var3;
                    final float f1116 = f12;
                    final float f1117 = f13;
                    objI1 = new pj.n() { // from class: androidx.compose.material3.pulltorefresh.e
                        @Override // pj.n
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            return i.j(rVar, z10, f1116, f1117, q3Var19, (c1) obj, (z0) obj2, (androidx.compose.ui.unit.b) obj3);
                        }
                    };
                    c0VarR.Y(objI1);
                }
                a0 a0VarC6 = v.c(androidx.compose.ui.layout.q0.a(a0VarD6, (pj.n) objI1), jU, q3Var3);
                int i26 = ((i12 >> 12) & 7168) | 48;
                a1 a1VarK6 = x.k(androidx.compose.ui.e.f37317a.i(), false);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK6 = c0VarR.k();
                a0 a0VarN6 = androidx.compose.ui.m.n(c0VarR, a0VarC6);
                androidx.compose.ui.node.g.a aVar7 = androidx.compose.ui.node.g.I;
                q3 q3Var110 = q3Var3;
                function0A = aVar7.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = y7.d(c0VarR);
                y7.n(c0VarD, a1VarK6, aVar7.e());
                y7.n(c0VarD, b1VarK6, aVar7.g());
                function2B = aVar7.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                y7.n(c0VarD, a0VarN6, aVar7.f());
                nVar.invoke(d0.f15956a, c0VarR, Integer.valueOf(((i26 >> 6) & com.planner5d.library.engine.input.f.b.B) | 6));
                c0VarR.o();
                if (m0.l0()) {
                    m0.z0();
                }
                q3Var2 = q3Var110;
            } else {
                c0VarR.u();
                q3Var2 = q3Var;
            }
            a0Var3 = a0Var2;
            f14 = f12;
            j11 = jU;
            f15 = f13;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.pulltorefresh.f
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return i.m(this.f31913a, rVar, z10, a0Var3, f14, q3Var2, j11, f15, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= a5.S0;
        a0Var2 = a0Var;
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                f12 = f10;
                if (c0VarR.I(f12)) {
                }
                i12 |= i20;
            } else {
                f12 = f10;
            }
            i12 |= i20;
        } else {
            f12 = f10;
        }
        if ((i10 & 24576) != 0) {
            i12 |= ((i11 & 16) == 0 || !c0VarR.D(q3Var)) ? 8192 : 16384;
        }
        i15 = i11 & 32;
        if (i15 != 0) {
            i12 |= androidx.profileinstaller.n.c.f73814m;
            jU = j10;
        } else {
            jU = j10;
            if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.L(jU)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
        }
        if ((i10 & 1572864) == 0) {
            f13 = f11;
            if ((i11 & 64) == 0) {
                i19 = 524288;
            } else {
                i19 = 524288;
            }
            i12 |= i19;
        } else {
            f13 = f11;
        }
        if ((i11 & 128) != 0) {
            i12 |= 12582912;
        } else if ((i10 & 12582912) == 0) {
            if (c0VarR.k0(nVar)) {
                i17 = 8388608;
            } else {
                i17 = 4194304;
            }
            i12 |= i17;
        }
        if ((i11 & 256) != 0) {
            if ((100663296 & i10) == 0) {
                if (c0VarR.D(this)) {
                    i18 = 67108864;
                } else {
                    i18 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i12 |= i18;
            }
            z11 = true;
            if ((i12 & 38347923) != 38347922) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        a0Var2 = a0.E;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        f12 = f31935e;
                    }
                    if ((i11 & 16) != 0) {
                        q3Var3 = f31933c;
                        i12 = (-57345) & i12;
                    } else {
                        q3Var3 = q3Var;
                    }
                    if (i15 != 0) {
                        jU = q0.f38131b.u();
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        f13 = f31936f;
                    }
                } else {
                    if (i13 != 0) {
                        a0Var2 = a0.E;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        f12 = f31935e;
                    }
                    if ((i11 & 16) != 0) {
                        q3Var3 = f31933c;
                        i12 = (-57345) & i12;
                    } else {
                        q3Var3 = q3Var;
                    }
                    if (i15 != 0) {
                        jU = q0.f38131b.u();
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        f13 = f31936f;
                    }
                }
                c0VarR.Z();
                if (m0.l0()) {
                    m0.A0(-1341144489, i12, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.IndicatorBox (PullToRefresh.kt:456)");
                }
                a0 a0VarW7 = i6.w(a0Var2, p.u());
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material3.pulltorefresh.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return i.i((androidx.compose.ui.graphics.drawscope.c) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                a0 a0VarD7 = androidx.compose.ui.draw.n.d(a0VarW7, (Function1) objI0);
                if ((i12 & 14) == 4) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z118 = z13;
                if ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z119 = z118 | z14 | ((((i12 & 7168) ^ 3072) <= 2048 && c0VarR.I(f12)) || (i12 & 3072) == 2048) | ((((3670016 & i12) ^ 1572864) <= 1048576 && c0VarR.I(f13)) || (i12 & 1572864) == 1048576);
                if (((57344 & i12) ^ 24576) > 16384) {
                }
                z15 = z119 | z11;
                objI1 = c0VarR.i0();
                if (z15) {
                    final q3 q3Var111 = q3Var3;
                    final float f1118 = f12;
                    final float f1119 = f13;
                    objI1 = new pj.n() { // from class: androidx.compose.material3.pulltorefresh.e
                        @Override // pj.n
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            return i.j(rVar, z10, f1118, f1119, q3Var111, (c1) obj, (z0) obj2, (androidx.compose.ui.unit.b) obj3);
                        }
                    };
                    c0VarR.Y(objI1);
                } else {
                    final q3 q3Var112 = q3Var3;
                    final float f11110 = f12;
                    final float f11111 = f13;
                    objI1 = new pj.n() { // from class: androidx.compose.material3.pulltorefresh.e
                        @Override // pj.n
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            return i.j(rVar, z10, f11110, f11111, q3Var112, (c1) obj, (z0) obj2, (androidx.compose.ui.unit.b) obj3);
                        }
                    };
                    c0VarR.Y(objI1);
                }
                a0 a0VarC7 = v.c(androidx.compose.ui.layout.q0.a(a0VarD7, (pj.n) objI1), jU, q3Var3);
                int i27 = ((i12 >> 12) & 7168) | 48;
                a1 a1VarK7 = x.k(androidx.compose.ui.e.f37317a.i(), false);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK7 = c0VarR.k();
                a0 a0VarN7 = androidx.compose.ui.m.n(c0VarR, a0VarC7);
                androidx.compose.ui.node.g.a aVar8 = androidx.compose.ui.node.g.I;
                q3 q3Var113 = q3Var3;
                function0A = aVar8.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = y7.d(c0VarR);
                y7.n(c0VarD, a1VarK7, aVar8.e());
                y7.n(c0VarD, b1VarK7, aVar8.g());
                function2B = aVar8.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                y7.n(c0VarD, a0VarN7, aVar8.f());
                nVar.invoke(d0.f15956a, c0VarR, Integer.valueOf(((i27 >> 6) & com.planner5d.library.engine.input.f.b.B) | 6));
                c0VarR.o();
                if (m0.l0()) {
                    m0.z0();
                }
                q3Var2 = q3Var113;
            } else {
                c0VarR.u();
                q3Var2 = q3Var;
            }
            a0Var3 = a0Var2;
            f14 = f12;
            j11 = jU;
            f15 = f13;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.pulltorefresh.f
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return i.m(this.f31913a, rVar, z10, a0Var3, f14, q3Var2, j11, f15, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 100663296;
        z11 = true;
        if ((i12 & 38347923) != 38347922) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c0VarR.h(z12, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i13 != 0) {
                    a0Var2 = a0.E;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    f12 = f31935e;
                }
                if ((i11 & 16) != 0) {
                    q3Var3 = f31933c;
                    i12 = (-57345) & i12;
                } else {
                    q3Var3 = q3Var;
                }
                if (i15 != 0) {
                    jU = q0.f38131b.u();
                }
                if ((i11 & 64) != 0) {
                    i12 &= -3670017;
                    f13 = f31936f;
                }
            } else {
                if (i13 != 0) {
                    a0Var2 = a0.E;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    f12 = f31935e;
                }
                if ((i11 & 16) != 0) {
                    q3Var3 = f31933c;
                    i12 = (-57345) & i12;
                } else {
                    q3Var3 = q3Var;
                }
                if (i15 != 0) {
                    jU = q0.f38131b.u();
                }
                if ((i11 & 64) != 0) {
                    i12 &= -3670017;
                    f13 = f31936f;
                }
            }
            c0VarR.Z();
            if (m0.l0()) {
                m0.A0(-1341144489, i12, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.IndicatorBox (PullToRefresh.kt:456)");
            }
            a0 a0VarW8 = i6.w(a0Var2, p.u());
            objI0 = c0VarR.i0();
            aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material3.pulltorefresh.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return i.i((androidx.compose.ui.graphics.drawscope.c) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            a0 a0VarD8 = androidx.compose.ui.draw.n.d(a0VarW8, (Function1) objI0);
            if ((i12 & 14) == 4) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z1110 = z13;
            if ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean z1111 = z1110 | z14 | ((((i12 & 7168) ^ 3072) <= 2048 && c0VarR.I(f12)) || (i12 & 3072) == 2048) | ((((3670016 & i12) ^ 1572864) <= 1048576 && c0VarR.I(f13)) || (i12 & 1572864) == 1048576);
            if (((57344 & i12) ^ 24576) > 16384) {
            }
            z15 = z1111 | z11;
            objI1 = c0VarR.i0();
            if (z15) {
                final q3 q3Var114 = q3Var3;
                final float f11112 = f12;
                final float f11113 = f13;
                objI1 = new pj.n() { // from class: androidx.compose.material3.pulltorefresh.e
                    @Override // pj.n
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return i.j(rVar, z10, f11112, f11113, q3Var114, (c1) obj, (z0) obj2, (androidx.compose.ui.unit.b) obj3);
                    }
                };
                c0VarR.Y(objI1);
            } else {
                final q3 q3Var115 = q3Var3;
                final float f11114 = f12;
                final float f11115 = f13;
                objI1 = new pj.n() { // from class: androidx.compose.material3.pulltorefresh.e
                    @Override // pj.n
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return i.j(rVar, z10, f11114, f11115, q3Var115, (c1) obj, (z0) obj2, (androidx.compose.ui.unit.b) obj3);
                    }
                };
                c0VarR.Y(objI1);
            }
            a0 a0VarC8 = v.c(androidx.compose.ui.layout.q0.a(a0VarD8, (pj.n) objI1), jU, q3Var3);
            int i28 = ((i12 >> 12) & 7168) | 48;
            a1 a1VarK8 = x.k(androidx.compose.ui.e.f37317a.i(), false);
            iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK8 = c0VarR.k();
            a0 a0VarN8 = androidx.compose.ui.m.n(c0VarR, a0VarC8);
            androidx.compose.ui.node.g.a aVar9 = androidx.compose.ui.node.g.I;
            q3 q3Var116 = q3Var3;
            function0A = aVar9.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            c0VarD = y7.d(c0VarR);
            y7.n(c0VarD, a1VarK8, aVar9.e());
            y7.n(c0VarD, b1VarK8, aVar9.g());
            function2B = aVar9.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            y7.n(c0VarD, a0VarN8, aVar9.f());
            nVar.invoke(d0.f15956a, c0VarR, Integer.valueOf(((i28 >> 6) & com.planner5d.library.engine.input.f.b.B) | 6));
            c0VarR.o();
            if (m0.l0()) {
                m0.z0();
            }
            q3Var2 = q3Var116;
        } else {
            c0VarR.u();
            q3Var2 = q3Var;
        }
        a0Var3 = a0Var2;
        f14 = f12;
        j11 = jU;
        f15 = f13;
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.pulltorefresh.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return i.m(this.f31913a, rVar, z10, a0Var3, f14, q3Var2, j11, f15, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getContainerColor")
    public final long o(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (m0.l0()) {
            m0.A0(1066257972, i10, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.<get-containerColor> (PullToRefresh.kt:405)");
        }
        long jP0 = pj.f31758a.a(c0Var, 6).P0();
        if (m0.l0()) {
            m0.z0();
        }
        return jP0;
    }

    public final float q() {
        return f31936f;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getIndicatorColor")
    public final long r(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (m0.l0()) {
            m0.A0(-1441334156, i10, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.<get-indicatorColor> (PullToRefresh.kt:413)");
        }
        long jW0 = pj.f31758a.a(c0Var, 6).w0();
        if (m0.l0()) {
            m0.z0();
        }
        return jW0;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getIndicatorContainerColor")
    public final long s(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (m0.l0()) {
            m0.A0(-80510850, i10, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.<get-indicatorContainerColor> (PullToRefresh.kt:409)");
        }
        long jP0 = pj.f31758a.a(c0Var, 6).P0();
        if (m0.l0()) {
            m0.z0();
        }
        return jP0;
    }

    public final float t() {
        return f31935e;
    }

    @NotNull
    public final q3 u() {
        return f31933c;
    }

    public final float v() {
        return f31937g;
    }

    public final float w() {
        return f31934d;
    }

    @NotNull
    public final q3 x() {
        return f31932b;
    }
}
