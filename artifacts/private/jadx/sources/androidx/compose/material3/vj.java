package androidx.compose.material3;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nMaterialTheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MaterialTheme.kt\nandroidx/compose/material3/MaterialThemeKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,234:1\n75#2:235\n1282#3,6:236\n*S KotlinDebug\n*F\n+ 1 MaterialTheme.kt\nandroidx/compose/material3/MaterialThemeKt\n*L\n192#1:235\n220#1:236,6\n*E\n"})
public final class vj {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f33951b = 0.4f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.m4<Boolean> f33950a = androidx.compose.runtime.a1.m(new Function0() { // from class: androidx.compose.material3.sj
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(vj.f());
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.m4<gm> f33952c = androidx.compose.runtime.a1.m(new Function0() { // from class: androidx.compose.material3.tj
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return vj.m();
        }
    });

    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l6 f33953a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ gm f33954b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ax f33955c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ja0 f33956d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f33957e;

        /* JADX WARN: Multi-variable type inference failed */
        a(l6 l6Var, gm gmVar, ax axVar, ja0 ja0Var, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
            this.f33953a = l6Var;
            this.f33954b = gmVar;
            this.f33955c = axVar;
            this.f33956d = ja0Var;
            this.f33957e = function2;
        }

        @androidx.compose.runtime.o
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1535649272, i10, -1, "androidx.compose.material3.MaterialExpressiveTheme.<anonymous> (MaterialTheme.kt:201)");
            }
            l6 l6VarN = this.f33953a;
            if (l6VarN == null) {
                l6VarN = o6.n();
            }
            l6 l6Var = l6VarN;
            gm gmVarA = this.f33954b;
            if (gmVarA == null) {
                gmVarA = gm.f27986a.a();
            }
            gm gmVar = gmVarA;
            ax axVar = this.f33955c;
            ax axVar2 = axVar == null ? new ax(null, null, null, null, null, 31, null) : axVar;
            ja0 ja0Var = this.f33956d;
            vj.i(l6Var, gmVar, axVar2, ja0Var == null ? new ja0(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null) : ja0Var, this.f33957e, c0Var, 0, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    static final class b implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ja0 f33958a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f33959b;

        /* JADX WARN: Multi-variable type inference failed */
        b(ja0 ja0Var, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
            this.f33958a = ja0Var;
            this.f33959b = function2;
        }

        @androidx.compose.runtime.o
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1750539308, i10, -1, "androidx.compose.material3.MaterialTheme.<anonymous> (MaterialTheme.kt:106)");
            }
            q50.o(this.f33958a.e(), this.f33959b, c0Var, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01af  */
    /* JADX WARN: Code duplicated, block: B:103:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:55:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:84:0x0101  */
    /* JADX WARN: Code duplicated, block: B:86:0x010d  */
    /* JADX WARN: Code duplicated, block: B:87:0x011f  */
    /* JADX WARN: Code duplicated, block: B:89:0x012b  */
    /* JADX WARN: Code duplicated, block: B:90:0x013c  */
    /* JADX WARN: Code duplicated, block: B:92:0x014b  */
    /* JADX WARN: Code duplicated, block: B:93:0x015c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0176  */
    /* JADX WARN: Code duplicated, block: B:98:0x01a3  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[0[0]]")
    public static final void g(@Nullable l6 l6Var, @Nullable gm gmVar, @Nullable ax axVar, @Nullable ja0 ja0Var, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        l6 l6Var2;
        int i12;
        gm gmVar2;
        int i13;
        ax axVar2;
        int i14;
        int i15;
        ja0 ja0Var2;
        int i16;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3;
        int i17;
        boolean z10;
        final l6 l6Var3;
        final gm gmVar3;
        final ax axVar3;
        final ja0 ja0Var3;
        androidx.compose.runtime.s5 s5VarT;
        gm gmVar4;
        ax axVar4;
        ja0 ja0Var4;
        androidx.compose.runtime.m4<Boolean> m4Var;
        l6 l6Var4;
        l6 l6Var5;
        gm gmVar5;
        ja0 ja0Var5;
        ax axVar5;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1317329884);
        int i18 = i11 & 1;
        if (i18 != 0) {
            i12 = i10 | 6;
            l6Var2 = l6Var;
        } else if ((i10 & 6) == 0) {
            l6Var2 = l6Var;
            i12 = (c0VarR.D(l6Var2) ? 4 : 2) | i10;
        } else {
            l6Var2 = l6Var;
            i12 = i10;
        }
        int i19 = i11 & 2;
        if (i19 == 0) {
            if ((i10 & 48) == 0) {
                gmVar2 = gmVar;
                i12 |= c0VarR.D(gmVar2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                    axVar2 = axVar;
                    if (c0VarR.D(axVar2)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 3072) == 0) {
                        ja0Var2 = ja0Var;
                        if (c0VarR.D(ja0Var2)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    if ((i11 & 16) != 0) {
                        if ((i10 & 24576) == 0) {
                            function3 = function2;
                            if (c0VarR.k0(function3)) {
                                i17 = 16384;
                            } else {
                                i17 = 8192;
                            }
                            i12 |= i17;
                        }
                        if ((i12 & 9363) != 9362) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i12 & 1)) {
                            if (i18 != 0) {
                                l6Var2 = null;
                            }
                            if (i19 != 0) {
                                gmVar4 = null;
                            } else {
                                gmVar4 = gmVar2;
                            }
                            if (i13 != 0) {
                                axVar4 = null;
                            } else {
                                axVar4 = axVar2;
                            }
                            if (i15 != 0) {
                                ja0Var4 = null;
                            } else {
                                ja0Var4 = ja0Var2;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1317329884, i12, -1, "androidx.compose.material3.MaterialExpressiveTheme (MaterialTheme.kt:190)");
                            }
                            m4Var = f33950a;
                            if (((Boolean) c0VarR.W(m4Var)).booleanValue()) {
                                c0VarR.E(1458674654);
                                if (l6Var2 == null) {
                                    c0VarR.E(-1061322393);
                                    l6 l6VarA = pj.f31758a.a(c0VarR, 6);
                                    c0VarR.A();
                                    l6Var5 = l6VarA;
                                } else {
                                    c0VarR.E(-1061323292);
                                    c0VarR.A();
                                    l6Var5 = l6Var2;
                                }
                                if (gmVar4 == null) {
                                    c0VarR.E(-1061320152);
                                    gm gmVarC = pj.f31758a.c(c0VarR, 6);
                                    c0VarR.A();
                                    gmVar5 = gmVarC;
                                } else {
                                    c0VarR.E(-1061321082);
                                    c0VarR.A();
                                    gmVar5 = gmVar4;
                                }
                                if (ja0Var4 == null) {
                                    c0VarR.E(-1061318010);
                                    ja0 ja0VarE = pj.f31758a.e(c0VarR, 6);
                                    c0VarR.A();
                                    ja0Var5 = ja0VarE;
                                } else {
                                    c0VarR.E(-1061318878);
                                    c0VarR.A();
                                    ja0Var5 = ja0Var4;
                                }
                                if (axVar4 == null) {
                                    c0VarR.E(-1061316190);
                                    ax axVarD = pj.f31758a.d(c0VarR, 6);
                                    c0VarR.A();
                                    axVar5 = axVarD;
                                } else {
                                    c0VarR.E(-1061316934);
                                    c0VarR.A();
                                    axVar5 = axVar4;
                                }
                                i(l6Var5, gmVar5, axVar5, ja0Var5, function3, c0VarR, i12 & 57344, 0);
                                c0VarR.A();
                                l6Var4 = l6Var2;
                            } else {
                                c0VarR.E(1459011221);
                                l6Var4 = l6Var2;
                                androidx.compose.runtime.a1.e(m4Var.f(Boolean.TRUE), androidx.compose.runtime.internal.w.e(1535649272, true, new a(l6Var4, gmVar4, axVar4, ja0Var4, function2), c0VarR, 54), c0VarR, androidx.compose.runtime.n4.f36267i | 48);
                                c0VarR.A();
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            l6Var3 = l6Var4;
                            gmVar3 = gmVar4;
                            axVar3 = axVar4;
                            ja0Var3 = ja0Var4;
                        } else {
                            c0VarR.u();
                            l6Var3 = l6Var2;
                            gmVar3 = gmVar2;
                            axVar3 = axVar2;
                            ja0Var3 = ja0Var2;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.uj
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return vj.h(l6Var3, gmVar3, axVar3, ja0Var3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 24576;
                    function3 = function2;
                    if ((i12 & 9363) != 9362) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i18 != 0) {
                            l6Var2 = null;
                        }
                        if (i19 != 0) {
                            gmVar4 = null;
                        } else {
                            gmVar4 = gmVar2;
                        }
                        if (i13 != 0) {
                            axVar4 = null;
                        } else {
                            axVar4 = axVar2;
                        }
                        if (i15 != 0) {
                            ja0Var4 = null;
                        } else {
                            ja0Var4 = ja0Var2;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1317329884, i12, -1, "androidx.compose.material3.MaterialExpressiveTheme (MaterialTheme.kt:190)");
                        }
                        m4Var = f33950a;
                        if (((Boolean) c0VarR.W(m4Var)).booleanValue()) {
                            c0VarR.E(1458674654);
                            if (l6Var2 == null) {
                                c0VarR.E(-1061322393);
                                l6 l6VarA2 = pj.f31758a.a(c0VarR, 6);
                                c0VarR.A();
                                l6Var5 = l6VarA2;
                            } else {
                                c0VarR.E(-1061323292);
                                c0VarR.A();
                                l6Var5 = l6Var2;
                            }
                            if (gmVar4 == null) {
                                c0VarR.E(-1061320152);
                                gm gmVarC2 = pj.f31758a.c(c0VarR, 6);
                                c0VarR.A();
                                gmVar5 = gmVarC2;
                            } else {
                                c0VarR.E(-1061321082);
                                c0VarR.A();
                                gmVar5 = gmVar4;
                            }
                            if (ja0Var4 == null) {
                                c0VarR.E(-1061318010);
                                ja0 ja0VarE2 = pj.f31758a.e(c0VarR, 6);
                                c0VarR.A();
                                ja0Var5 = ja0VarE2;
                            } else {
                                c0VarR.E(-1061318878);
                                c0VarR.A();
                                ja0Var5 = ja0Var4;
                            }
                            if (axVar4 == null) {
                                c0VarR.E(-1061316190);
                                ax axVarD2 = pj.f31758a.d(c0VarR, 6);
                                c0VarR.A();
                                axVar5 = axVarD2;
                            } else {
                                c0VarR.E(-1061316934);
                                c0VarR.A();
                                axVar5 = axVar4;
                            }
                            i(l6Var5, gmVar5, axVar5, ja0Var5, function3, c0VarR, i12 & 57344, 0);
                            c0VarR.A();
                            l6Var4 = l6Var2;
                        } else {
                            c0VarR.E(1459011221);
                            l6Var4 = l6Var2;
                            androidx.compose.runtime.a1.e(m4Var.f(Boolean.TRUE), androidx.compose.runtime.internal.w.e(1535649272, true, new a(l6Var4, gmVar4, axVar4, ja0Var4, function2), c0VarR, 54), c0VarR, androidx.compose.runtime.n4.f36267i | 48);
                            c0VarR.A();
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        l6Var3 = l6Var4;
                        gmVar3 = gmVar4;
                        axVar3 = axVar4;
                        ja0Var3 = ja0Var4;
                    } else {
                        c0VarR.u();
                        l6Var3 = l6Var2;
                        gmVar3 = gmVar2;
                        axVar3 = axVar2;
                        ja0Var3 = ja0Var2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.uj
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return vj.h(l6Var3, gmVar3, axVar3, ja0Var3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 3072;
                ja0Var2 = ja0Var;
                if ((i11 & 16) != 0) {
                    if ((i10 & 24576) == 0) {
                        function3 = function2;
                        if (c0VarR.k0(function3)) {
                            i17 = 16384;
                        } else {
                            i17 = 8192;
                        }
                        i12 |= i17;
                    }
                    if ((i12 & 9363) != 9362) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i18 != 0) {
                            l6Var2 = null;
                        }
                        if (i19 != 0) {
                            gmVar4 = null;
                        } else {
                            gmVar4 = gmVar2;
                        }
                        if (i13 != 0) {
                            axVar4 = null;
                        } else {
                            axVar4 = axVar2;
                        }
                        if (i15 != 0) {
                            ja0Var4 = null;
                        } else {
                            ja0Var4 = ja0Var2;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1317329884, i12, -1, "androidx.compose.material3.MaterialExpressiveTheme (MaterialTheme.kt:190)");
                        }
                        m4Var = f33950a;
                        if (((Boolean) c0VarR.W(m4Var)).booleanValue()) {
                            c0VarR.E(1458674654);
                            if (l6Var2 == null) {
                                c0VarR.E(-1061322393);
                                l6 l6VarA3 = pj.f31758a.a(c0VarR, 6);
                                c0VarR.A();
                                l6Var5 = l6VarA3;
                            } else {
                                c0VarR.E(-1061323292);
                                c0VarR.A();
                                l6Var5 = l6Var2;
                            }
                            if (gmVar4 == null) {
                                c0VarR.E(-1061320152);
                                gm gmVarC3 = pj.f31758a.c(c0VarR, 6);
                                c0VarR.A();
                                gmVar5 = gmVarC3;
                            } else {
                                c0VarR.E(-1061321082);
                                c0VarR.A();
                                gmVar5 = gmVar4;
                            }
                            if (ja0Var4 == null) {
                                c0VarR.E(-1061318010);
                                ja0 ja0VarE3 = pj.f31758a.e(c0VarR, 6);
                                c0VarR.A();
                                ja0Var5 = ja0VarE3;
                            } else {
                                c0VarR.E(-1061318878);
                                c0VarR.A();
                                ja0Var5 = ja0Var4;
                            }
                            if (axVar4 == null) {
                                c0VarR.E(-1061316190);
                                ax axVarD3 = pj.f31758a.d(c0VarR, 6);
                                c0VarR.A();
                                axVar5 = axVarD3;
                            } else {
                                c0VarR.E(-1061316934);
                                c0VarR.A();
                                axVar5 = axVar4;
                            }
                            i(l6Var5, gmVar5, axVar5, ja0Var5, function3, c0VarR, i12 & 57344, 0);
                            c0VarR.A();
                            l6Var4 = l6Var2;
                        } else {
                            c0VarR.E(1459011221);
                            l6Var4 = l6Var2;
                            androidx.compose.runtime.a1.e(m4Var.f(Boolean.TRUE), androidx.compose.runtime.internal.w.e(1535649272, true, new a(l6Var4, gmVar4, axVar4, ja0Var4, function2), c0VarR, 54), c0VarR, androidx.compose.runtime.n4.f36267i | 48);
                            c0VarR.A();
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        l6Var3 = l6Var4;
                        gmVar3 = gmVar4;
                        axVar3 = axVar4;
                        ja0Var3 = ja0Var4;
                    } else {
                        c0VarR.u();
                        l6Var3 = l6Var2;
                        gmVar3 = gmVar2;
                        axVar3 = axVar2;
                        ja0Var3 = ja0Var2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.uj
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return vj.h(l6Var3, gmVar3, axVar3, ja0Var3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 24576;
                function3 = function2;
                if ((i12 & 9363) != 9362) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i18 != 0) {
                        l6Var2 = null;
                    }
                    if (i19 != 0) {
                        gmVar4 = null;
                    } else {
                        gmVar4 = gmVar2;
                    }
                    if (i13 != 0) {
                        axVar4 = null;
                    } else {
                        axVar4 = axVar2;
                    }
                    if (i15 != 0) {
                        ja0Var4 = null;
                    } else {
                        ja0Var4 = ja0Var2;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1317329884, i12, -1, "androidx.compose.material3.MaterialExpressiveTheme (MaterialTheme.kt:190)");
                    }
                    m4Var = f33950a;
                    if (((Boolean) c0VarR.W(m4Var)).booleanValue()) {
                        c0VarR.E(1458674654);
                        if (l6Var2 == null) {
                            c0VarR.E(-1061322393);
                            l6 l6VarA4 = pj.f31758a.a(c0VarR, 6);
                            c0VarR.A();
                            l6Var5 = l6VarA4;
                        } else {
                            c0VarR.E(-1061323292);
                            c0VarR.A();
                            l6Var5 = l6Var2;
                        }
                        if (gmVar4 == null) {
                            c0VarR.E(-1061320152);
                            gm gmVarC4 = pj.f31758a.c(c0VarR, 6);
                            c0VarR.A();
                            gmVar5 = gmVarC4;
                        } else {
                            c0VarR.E(-1061321082);
                            c0VarR.A();
                            gmVar5 = gmVar4;
                        }
                        if (ja0Var4 == null) {
                            c0VarR.E(-1061318010);
                            ja0 ja0VarE4 = pj.f31758a.e(c0VarR, 6);
                            c0VarR.A();
                            ja0Var5 = ja0VarE4;
                        } else {
                            c0VarR.E(-1061318878);
                            c0VarR.A();
                            ja0Var5 = ja0Var4;
                        }
                        if (axVar4 == null) {
                            c0VarR.E(-1061316190);
                            ax axVarD4 = pj.f31758a.d(c0VarR, 6);
                            c0VarR.A();
                            axVar5 = axVarD4;
                        } else {
                            c0VarR.E(-1061316934);
                            c0VarR.A();
                            axVar5 = axVar4;
                        }
                        i(l6Var5, gmVar5, axVar5, ja0Var5, function3, c0VarR, i12 & 57344, 0);
                        c0VarR.A();
                        l6Var4 = l6Var2;
                    } else {
                        c0VarR.E(1459011221);
                        l6Var4 = l6Var2;
                        androidx.compose.runtime.a1.e(m4Var.f(Boolean.TRUE), androidx.compose.runtime.internal.w.e(1535649272, true, new a(l6Var4, gmVar4, axVar4, ja0Var4, function2), c0VarR, 54), c0VarR, androidx.compose.runtime.n4.f36267i | 48);
                        c0VarR.A();
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    l6Var3 = l6Var4;
                    gmVar3 = gmVar4;
                    axVar3 = axVar4;
                    ja0Var3 = ja0Var4;
                } else {
                    c0VarR.u();
                    l6Var3 = l6Var2;
                    gmVar3 = gmVar2;
                    axVar3 = axVar2;
                    ja0Var3 = ja0Var2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.uj
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return vj.h(l6Var3, gmVar3, axVar3, ja0Var3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.media3.exoplayer.a5.S0;
            axVar2 = axVar;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    ja0Var2 = ja0Var;
                    if (c0VarR.D(ja0Var2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i11 & 16) != 0) {
                    if ((i10 & 24576) == 0) {
                        function3 = function2;
                        if (c0VarR.k0(function3)) {
                            i17 = 16384;
                        } else {
                            i17 = 8192;
                        }
                        i12 |= i17;
                    }
                    if ((i12 & 9363) != 9362) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i18 != 0) {
                            l6Var2 = null;
                        }
                        if (i19 != 0) {
                            gmVar4 = null;
                        } else {
                            gmVar4 = gmVar2;
                        }
                        if (i13 != 0) {
                            axVar4 = null;
                        } else {
                            axVar4 = axVar2;
                        }
                        if (i15 != 0) {
                            ja0Var4 = null;
                        } else {
                            ja0Var4 = ja0Var2;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1317329884, i12, -1, "androidx.compose.material3.MaterialExpressiveTheme (MaterialTheme.kt:190)");
                        }
                        m4Var = f33950a;
                        if (((Boolean) c0VarR.W(m4Var)).booleanValue()) {
                            c0VarR.E(1458674654);
                            if (l6Var2 == null) {
                                c0VarR.E(-1061322393);
                                l6 l6VarA5 = pj.f31758a.a(c0VarR, 6);
                                c0VarR.A();
                                l6Var5 = l6VarA5;
                            } else {
                                c0VarR.E(-1061323292);
                                c0VarR.A();
                                l6Var5 = l6Var2;
                            }
                            if (gmVar4 == null) {
                                c0VarR.E(-1061320152);
                                gm gmVarC5 = pj.f31758a.c(c0VarR, 6);
                                c0VarR.A();
                                gmVar5 = gmVarC5;
                            } else {
                                c0VarR.E(-1061321082);
                                c0VarR.A();
                                gmVar5 = gmVar4;
                            }
                            if (ja0Var4 == null) {
                                c0VarR.E(-1061318010);
                                ja0 ja0VarE5 = pj.f31758a.e(c0VarR, 6);
                                c0VarR.A();
                                ja0Var5 = ja0VarE5;
                            } else {
                                c0VarR.E(-1061318878);
                                c0VarR.A();
                                ja0Var5 = ja0Var4;
                            }
                            if (axVar4 == null) {
                                c0VarR.E(-1061316190);
                                ax axVarD5 = pj.f31758a.d(c0VarR, 6);
                                c0VarR.A();
                                axVar5 = axVarD5;
                            } else {
                                c0VarR.E(-1061316934);
                                c0VarR.A();
                                axVar5 = axVar4;
                            }
                            i(l6Var5, gmVar5, axVar5, ja0Var5, function3, c0VarR, i12 & 57344, 0);
                            c0VarR.A();
                            l6Var4 = l6Var2;
                        } else {
                            c0VarR.E(1459011221);
                            l6Var4 = l6Var2;
                            androidx.compose.runtime.a1.e(m4Var.f(Boolean.TRUE), androidx.compose.runtime.internal.w.e(1535649272, true, new a(l6Var4, gmVar4, axVar4, ja0Var4, function2), c0VarR, 54), c0VarR, androidx.compose.runtime.n4.f36267i | 48);
                            c0VarR.A();
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        l6Var3 = l6Var4;
                        gmVar3 = gmVar4;
                        axVar3 = axVar4;
                        ja0Var3 = ja0Var4;
                    } else {
                        c0VarR.u();
                        l6Var3 = l6Var2;
                        gmVar3 = gmVar2;
                        axVar3 = axVar2;
                        ja0Var3 = ja0Var2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.uj
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return vj.h(l6Var3, gmVar3, axVar3, ja0Var3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 24576;
                function3 = function2;
                if ((i12 & 9363) != 9362) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i18 != 0) {
                        l6Var2 = null;
                    }
                    if (i19 != 0) {
                        gmVar4 = null;
                    } else {
                        gmVar4 = gmVar2;
                    }
                    if (i13 != 0) {
                        axVar4 = null;
                    } else {
                        axVar4 = axVar2;
                    }
                    if (i15 != 0) {
                        ja0Var4 = null;
                    } else {
                        ja0Var4 = ja0Var2;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1317329884, i12, -1, "androidx.compose.material3.MaterialExpressiveTheme (MaterialTheme.kt:190)");
                    }
                    m4Var = f33950a;
                    if (((Boolean) c0VarR.W(m4Var)).booleanValue()) {
                        c0VarR.E(1458674654);
                        if (l6Var2 == null) {
                            c0VarR.E(-1061322393);
                            l6 l6VarA6 = pj.f31758a.a(c0VarR, 6);
                            c0VarR.A();
                            l6Var5 = l6VarA6;
                        } else {
                            c0VarR.E(-1061323292);
                            c0VarR.A();
                            l6Var5 = l6Var2;
                        }
                        if (gmVar4 == null) {
                            c0VarR.E(-1061320152);
                            gm gmVarC6 = pj.f31758a.c(c0VarR, 6);
                            c0VarR.A();
                            gmVar5 = gmVarC6;
                        } else {
                            c0VarR.E(-1061321082);
                            c0VarR.A();
                            gmVar5 = gmVar4;
                        }
                        if (ja0Var4 == null) {
                            c0VarR.E(-1061318010);
                            ja0 ja0VarE6 = pj.f31758a.e(c0VarR, 6);
                            c0VarR.A();
                            ja0Var5 = ja0VarE6;
                        } else {
                            c0VarR.E(-1061318878);
                            c0VarR.A();
                            ja0Var5 = ja0Var4;
                        }
                        if (axVar4 == null) {
                            c0VarR.E(-1061316190);
                            ax axVarD6 = pj.f31758a.d(c0VarR, 6);
                            c0VarR.A();
                            axVar5 = axVarD6;
                        } else {
                            c0VarR.E(-1061316934);
                            c0VarR.A();
                            axVar5 = axVar4;
                        }
                        i(l6Var5, gmVar5, axVar5, ja0Var5, function3, c0VarR, i12 & 57344, 0);
                        c0VarR.A();
                        l6Var4 = l6Var2;
                    } else {
                        c0VarR.E(1459011221);
                        l6Var4 = l6Var2;
                        androidx.compose.runtime.a1.e(m4Var.f(Boolean.TRUE), androidx.compose.runtime.internal.w.e(1535649272, true, new a(l6Var4, gmVar4, axVar4, ja0Var4, function2), c0VarR, 54), c0VarR, androidx.compose.runtime.n4.f36267i | 48);
                        c0VarR.A();
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    l6Var3 = l6Var4;
                    gmVar3 = gmVar4;
                    axVar3 = axVar4;
                    ja0Var3 = ja0Var4;
                } else {
                    c0VarR.u();
                    l6Var3 = l6Var2;
                    gmVar3 = gmVar2;
                    axVar3 = axVar2;
                    ja0Var3 = ja0Var2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.uj
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return vj.h(l6Var3, gmVar3, axVar3, ja0Var3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            ja0Var2 = ja0Var;
            if ((i11 & 16) != 0) {
                if ((i10 & 24576) == 0) {
                    function3 = function2;
                    if (c0VarR.k0(function3)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                if ((i12 & 9363) != 9362) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i18 != 0) {
                        l6Var2 = null;
                    }
                    if (i19 != 0) {
                        gmVar4 = null;
                    } else {
                        gmVar4 = gmVar2;
                    }
                    if (i13 != 0) {
                        axVar4 = null;
                    } else {
                        axVar4 = axVar2;
                    }
                    if (i15 != 0) {
                        ja0Var4 = null;
                    } else {
                        ja0Var4 = ja0Var2;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1317329884, i12, -1, "androidx.compose.material3.MaterialExpressiveTheme (MaterialTheme.kt:190)");
                    }
                    m4Var = f33950a;
                    if (((Boolean) c0VarR.W(m4Var)).booleanValue()) {
                        c0VarR.E(1458674654);
                        if (l6Var2 == null) {
                            c0VarR.E(-1061322393);
                            l6 l6VarA7 = pj.f31758a.a(c0VarR, 6);
                            c0VarR.A();
                            l6Var5 = l6VarA7;
                        } else {
                            c0VarR.E(-1061323292);
                            c0VarR.A();
                            l6Var5 = l6Var2;
                        }
                        if (gmVar4 == null) {
                            c0VarR.E(-1061320152);
                            gm gmVarC7 = pj.f31758a.c(c0VarR, 6);
                            c0VarR.A();
                            gmVar5 = gmVarC7;
                        } else {
                            c0VarR.E(-1061321082);
                            c0VarR.A();
                            gmVar5 = gmVar4;
                        }
                        if (ja0Var4 == null) {
                            c0VarR.E(-1061318010);
                            ja0 ja0VarE7 = pj.f31758a.e(c0VarR, 6);
                            c0VarR.A();
                            ja0Var5 = ja0VarE7;
                        } else {
                            c0VarR.E(-1061318878);
                            c0VarR.A();
                            ja0Var5 = ja0Var4;
                        }
                        if (axVar4 == null) {
                            c0VarR.E(-1061316190);
                            ax axVarD7 = pj.f31758a.d(c0VarR, 6);
                            c0VarR.A();
                            axVar5 = axVarD7;
                        } else {
                            c0VarR.E(-1061316934);
                            c0VarR.A();
                            axVar5 = axVar4;
                        }
                        i(l6Var5, gmVar5, axVar5, ja0Var5, function3, c0VarR, i12 & 57344, 0);
                        c0VarR.A();
                        l6Var4 = l6Var2;
                    } else {
                        c0VarR.E(1459011221);
                        l6Var4 = l6Var2;
                        androidx.compose.runtime.a1.e(m4Var.f(Boolean.TRUE), androidx.compose.runtime.internal.w.e(1535649272, true, new a(l6Var4, gmVar4, axVar4, ja0Var4, function2), c0VarR, 54), c0VarR, androidx.compose.runtime.n4.f36267i | 48);
                        c0VarR.A();
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    l6Var3 = l6Var4;
                    gmVar3 = gmVar4;
                    axVar3 = axVar4;
                    ja0Var3 = ja0Var4;
                } else {
                    c0VarR.u();
                    l6Var3 = l6Var2;
                    gmVar3 = gmVar2;
                    axVar3 = axVar2;
                    ja0Var3 = ja0Var2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.uj
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return vj.h(l6Var3, gmVar3, axVar3, ja0Var3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            function3 = function2;
            if ((i12 & 9363) != 9362) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i18 != 0) {
                    l6Var2 = null;
                }
                if (i19 != 0) {
                    gmVar4 = null;
                } else {
                    gmVar4 = gmVar2;
                }
                if (i13 != 0) {
                    axVar4 = null;
                } else {
                    axVar4 = axVar2;
                }
                if (i15 != 0) {
                    ja0Var4 = null;
                } else {
                    ja0Var4 = ja0Var2;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1317329884, i12, -1, "androidx.compose.material3.MaterialExpressiveTheme (MaterialTheme.kt:190)");
                }
                m4Var = f33950a;
                if (((Boolean) c0VarR.W(m4Var)).booleanValue()) {
                    c0VarR.E(1458674654);
                    if (l6Var2 == null) {
                        c0VarR.E(-1061322393);
                        l6 l6VarA8 = pj.f31758a.a(c0VarR, 6);
                        c0VarR.A();
                        l6Var5 = l6VarA8;
                    } else {
                        c0VarR.E(-1061323292);
                        c0VarR.A();
                        l6Var5 = l6Var2;
                    }
                    if (gmVar4 == null) {
                        c0VarR.E(-1061320152);
                        gm gmVarC8 = pj.f31758a.c(c0VarR, 6);
                        c0VarR.A();
                        gmVar5 = gmVarC8;
                    } else {
                        c0VarR.E(-1061321082);
                        c0VarR.A();
                        gmVar5 = gmVar4;
                    }
                    if (ja0Var4 == null) {
                        c0VarR.E(-1061318010);
                        ja0 ja0VarE8 = pj.f31758a.e(c0VarR, 6);
                        c0VarR.A();
                        ja0Var5 = ja0VarE8;
                    } else {
                        c0VarR.E(-1061318878);
                        c0VarR.A();
                        ja0Var5 = ja0Var4;
                    }
                    if (axVar4 == null) {
                        c0VarR.E(-1061316190);
                        ax axVarD8 = pj.f31758a.d(c0VarR, 6);
                        c0VarR.A();
                        axVar5 = axVarD8;
                    } else {
                        c0VarR.E(-1061316934);
                        c0VarR.A();
                        axVar5 = axVar4;
                    }
                    i(l6Var5, gmVar5, axVar5, ja0Var5, function3, c0VarR, i12 & 57344, 0);
                    c0VarR.A();
                    l6Var4 = l6Var2;
                } else {
                    c0VarR.E(1459011221);
                    l6Var4 = l6Var2;
                    androidx.compose.runtime.a1.e(m4Var.f(Boolean.TRUE), androidx.compose.runtime.internal.w.e(1535649272, true, new a(l6Var4, gmVar4, axVar4, ja0Var4, function2), c0VarR, 54), c0VarR, androidx.compose.runtime.n4.f36267i | 48);
                    c0VarR.A();
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                l6Var3 = l6Var4;
                gmVar3 = gmVar4;
                axVar3 = axVar4;
                ja0Var3 = ja0Var4;
            } else {
                c0VarR.u();
                l6Var3 = l6Var2;
                gmVar3 = gmVar2;
                axVar3 = axVar2;
                ja0Var3 = ja0Var2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.uj
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return vj.h(l6Var3, gmVar3, axVar3, ja0Var3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        gmVar2 = gmVar;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                axVar2 = axVar;
                if (c0VarR.D(axVar2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    ja0Var2 = ja0Var;
                    if (c0VarR.D(ja0Var2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i11 & 16) != 0) {
                    if ((i10 & 24576) == 0) {
                        function3 = function2;
                        if (c0VarR.k0(function3)) {
                            i17 = 16384;
                        } else {
                            i17 = 8192;
                        }
                        i12 |= i17;
                    }
                    if ((i12 & 9363) != 9362) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i18 != 0) {
                            l6Var2 = null;
                        }
                        if (i19 != 0) {
                            gmVar4 = null;
                        } else {
                            gmVar4 = gmVar2;
                        }
                        if (i13 != 0) {
                            axVar4 = null;
                        } else {
                            axVar4 = axVar2;
                        }
                        if (i15 != 0) {
                            ja0Var4 = null;
                        } else {
                            ja0Var4 = ja0Var2;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1317329884, i12, -1, "androidx.compose.material3.MaterialExpressiveTheme (MaterialTheme.kt:190)");
                        }
                        m4Var = f33950a;
                        if (((Boolean) c0VarR.W(m4Var)).booleanValue()) {
                            c0VarR.E(1458674654);
                            if (l6Var2 == null) {
                                c0VarR.E(-1061322393);
                                l6 l6VarA9 = pj.f31758a.a(c0VarR, 6);
                                c0VarR.A();
                                l6Var5 = l6VarA9;
                            } else {
                                c0VarR.E(-1061323292);
                                c0VarR.A();
                                l6Var5 = l6Var2;
                            }
                            if (gmVar4 == null) {
                                c0VarR.E(-1061320152);
                                gm gmVarC9 = pj.f31758a.c(c0VarR, 6);
                                c0VarR.A();
                                gmVar5 = gmVarC9;
                            } else {
                                c0VarR.E(-1061321082);
                                c0VarR.A();
                                gmVar5 = gmVar4;
                            }
                            if (ja0Var4 == null) {
                                c0VarR.E(-1061318010);
                                ja0 ja0VarE9 = pj.f31758a.e(c0VarR, 6);
                                c0VarR.A();
                                ja0Var5 = ja0VarE9;
                            } else {
                                c0VarR.E(-1061318878);
                                c0VarR.A();
                                ja0Var5 = ja0Var4;
                            }
                            if (axVar4 == null) {
                                c0VarR.E(-1061316190);
                                ax axVarD9 = pj.f31758a.d(c0VarR, 6);
                                c0VarR.A();
                                axVar5 = axVarD9;
                            } else {
                                c0VarR.E(-1061316934);
                                c0VarR.A();
                                axVar5 = axVar4;
                            }
                            i(l6Var5, gmVar5, axVar5, ja0Var5, function3, c0VarR, i12 & 57344, 0);
                            c0VarR.A();
                            l6Var4 = l6Var2;
                        } else {
                            c0VarR.E(1459011221);
                            l6Var4 = l6Var2;
                            androidx.compose.runtime.a1.e(m4Var.f(Boolean.TRUE), androidx.compose.runtime.internal.w.e(1535649272, true, new a(l6Var4, gmVar4, axVar4, ja0Var4, function2), c0VarR, 54), c0VarR, androidx.compose.runtime.n4.f36267i | 48);
                            c0VarR.A();
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        l6Var3 = l6Var4;
                        gmVar3 = gmVar4;
                        axVar3 = axVar4;
                        ja0Var3 = ja0Var4;
                    } else {
                        c0VarR.u();
                        l6Var3 = l6Var2;
                        gmVar3 = gmVar2;
                        axVar3 = axVar2;
                        ja0Var3 = ja0Var2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.uj
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return vj.h(l6Var3, gmVar3, axVar3, ja0Var3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 24576;
                function3 = function2;
                if ((i12 & 9363) != 9362) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i18 != 0) {
                        l6Var2 = null;
                    }
                    if (i19 != 0) {
                        gmVar4 = null;
                    } else {
                        gmVar4 = gmVar2;
                    }
                    if (i13 != 0) {
                        axVar4 = null;
                    } else {
                        axVar4 = axVar2;
                    }
                    if (i15 != 0) {
                        ja0Var4 = null;
                    } else {
                        ja0Var4 = ja0Var2;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1317329884, i12, -1, "androidx.compose.material3.MaterialExpressiveTheme (MaterialTheme.kt:190)");
                    }
                    m4Var = f33950a;
                    if (((Boolean) c0VarR.W(m4Var)).booleanValue()) {
                        c0VarR.E(1458674654);
                        if (l6Var2 == null) {
                            c0VarR.E(-1061322393);
                            l6 l6VarA10 = pj.f31758a.a(c0VarR, 6);
                            c0VarR.A();
                            l6Var5 = l6VarA10;
                        } else {
                            c0VarR.E(-1061323292);
                            c0VarR.A();
                            l6Var5 = l6Var2;
                        }
                        if (gmVar4 == null) {
                            c0VarR.E(-1061320152);
                            gm gmVarC10 = pj.f31758a.c(c0VarR, 6);
                            c0VarR.A();
                            gmVar5 = gmVarC10;
                        } else {
                            c0VarR.E(-1061321082);
                            c0VarR.A();
                            gmVar5 = gmVar4;
                        }
                        if (ja0Var4 == null) {
                            c0VarR.E(-1061318010);
                            ja0 ja0VarE10 = pj.f31758a.e(c0VarR, 6);
                            c0VarR.A();
                            ja0Var5 = ja0VarE10;
                        } else {
                            c0VarR.E(-1061318878);
                            c0VarR.A();
                            ja0Var5 = ja0Var4;
                        }
                        if (axVar4 == null) {
                            c0VarR.E(-1061316190);
                            ax axVarD10 = pj.f31758a.d(c0VarR, 6);
                            c0VarR.A();
                            axVar5 = axVarD10;
                        } else {
                            c0VarR.E(-1061316934);
                            c0VarR.A();
                            axVar5 = axVar4;
                        }
                        i(l6Var5, gmVar5, axVar5, ja0Var5, function3, c0VarR, i12 & 57344, 0);
                        c0VarR.A();
                        l6Var4 = l6Var2;
                    } else {
                        c0VarR.E(1459011221);
                        l6Var4 = l6Var2;
                        androidx.compose.runtime.a1.e(m4Var.f(Boolean.TRUE), androidx.compose.runtime.internal.w.e(1535649272, true, new a(l6Var4, gmVar4, axVar4, ja0Var4, function2), c0VarR, 54), c0VarR, androidx.compose.runtime.n4.f36267i | 48);
                        c0VarR.A();
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    l6Var3 = l6Var4;
                    gmVar3 = gmVar4;
                    axVar3 = axVar4;
                    ja0Var3 = ja0Var4;
                } else {
                    c0VarR.u();
                    l6Var3 = l6Var2;
                    gmVar3 = gmVar2;
                    axVar3 = axVar2;
                    ja0Var3 = ja0Var2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.uj
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return vj.h(l6Var3, gmVar3, axVar3, ja0Var3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            ja0Var2 = ja0Var;
            if ((i11 & 16) != 0) {
                if ((i10 & 24576) == 0) {
                    function3 = function2;
                    if (c0VarR.k0(function3)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                if ((i12 & 9363) != 9362) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i18 != 0) {
                        l6Var2 = null;
                    }
                    if (i19 != 0) {
                        gmVar4 = null;
                    } else {
                        gmVar4 = gmVar2;
                    }
                    if (i13 != 0) {
                        axVar4 = null;
                    } else {
                        axVar4 = axVar2;
                    }
                    if (i15 != 0) {
                        ja0Var4 = null;
                    } else {
                        ja0Var4 = ja0Var2;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1317329884, i12, -1, "androidx.compose.material3.MaterialExpressiveTheme (MaterialTheme.kt:190)");
                    }
                    m4Var = f33950a;
                    if (((Boolean) c0VarR.W(m4Var)).booleanValue()) {
                        c0VarR.E(1458674654);
                        if (l6Var2 == null) {
                            c0VarR.E(-1061322393);
                            l6 l6VarA11 = pj.f31758a.a(c0VarR, 6);
                            c0VarR.A();
                            l6Var5 = l6VarA11;
                        } else {
                            c0VarR.E(-1061323292);
                            c0VarR.A();
                            l6Var5 = l6Var2;
                        }
                        if (gmVar4 == null) {
                            c0VarR.E(-1061320152);
                            gm gmVarC11 = pj.f31758a.c(c0VarR, 6);
                            c0VarR.A();
                            gmVar5 = gmVarC11;
                        } else {
                            c0VarR.E(-1061321082);
                            c0VarR.A();
                            gmVar5 = gmVar4;
                        }
                        if (ja0Var4 == null) {
                            c0VarR.E(-1061318010);
                            ja0 ja0VarE11 = pj.f31758a.e(c0VarR, 6);
                            c0VarR.A();
                            ja0Var5 = ja0VarE11;
                        } else {
                            c0VarR.E(-1061318878);
                            c0VarR.A();
                            ja0Var5 = ja0Var4;
                        }
                        if (axVar4 == null) {
                            c0VarR.E(-1061316190);
                            ax axVarD11 = pj.f31758a.d(c0VarR, 6);
                            c0VarR.A();
                            axVar5 = axVarD11;
                        } else {
                            c0VarR.E(-1061316934);
                            c0VarR.A();
                            axVar5 = axVar4;
                        }
                        i(l6Var5, gmVar5, axVar5, ja0Var5, function3, c0VarR, i12 & 57344, 0);
                        c0VarR.A();
                        l6Var4 = l6Var2;
                    } else {
                        c0VarR.E(1459011221);
                        l6Var4 = l6Var2;
                        androidx.compose.runtime.a1.e(m4Var.f(Boolean.TRUE), androidx.compose.runtime.internal.w.e(1535649272, true, new a(l6Var4, gmVar4, axVar4, ja0Var4, function2), c0VarR, 54), c0VarR, androidx.compose.runtime.n4.f36267i | 48);
                        c0VarR.A();
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    l6Var3 = l6Var4;
                    gmVar3 = gmVar4;
                    axVar3 = axVar4;
                    ja0Var3 = ja0Var4;
                } else {
                    c0VarR.u();
                    l6Var3 = l6Var2;
                    gmVar3 = gmVar2;
                    axVar3 = axVar2;
                    ja0Var3 = ja0Var2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.uj
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return vj.h(l6Var3, gmVar3, axVar3, ja0Var3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            function3 = function2;
            if ((i12 & 9363) != 9362) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i18 != 0) {
                    l6Var2 = null;
                }
                if (i19 != 0) {
                    gmVar4 = null;
                } else {
                    gmVar4 = gmVar2;
                }
                if (i13 != 0) {
                    axVar4 = null;
                } else {
                    axVar4 = axVar2;
                }
                if (i15 != 0) {
                    ja0Var4 = null;
                } else {
                    ja0Var4 = ja0Var2;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1317329884, i12, -1, "androidx.compose.material3.MaterialExpressiveTheme (MaterialTheme.kt:190)");
                }
                m4Var = f33950a;
                if (((Boolean) c0VarR.W(m4Var)).booleanValue()) {
                    c0VarR.E(1458674654);
                    if (l6Var2 == null) {
                        c0VarR.E(-1061322393);
                        l6 l6VarA12 = pj.f31758a.a(c0VarR, 6);
                        c0VarR.A();
                        l6Var5 = l6VarA12;
                    } else {
                        c0VarR.E(-1061323292);
                        c0VarR.A();
                        l6Var5 = l6Var2;
                    }
                    if (gmVar4 == null) {
                        c0VarR.E(-1061320152);
                        gm gmVarC12 = pj.f31758a.c(c0VarR, 6);
                        c0VarR.A();
                        gmVar5 = gmVarC12;
                    } else {
                        c0VarR.E(-1061321082);
                        c0VarR.A();
                        gmVar5 = gmVar4;
                    }
                    if (ja0Var4 == null) {
                        c0VarR.E(-1061318010);
                        ja0 ja0VarE12 = pj.f31758a.e(c0VarR, 6);
                        c0VarR.A();
                        ja0Var5 = ja0VarE12;
                    } else {
                        c0VarR.E(-1061318878);
                        c0VarR.A();
                        ja0Var5 = ja0Var4;
                    }
                    if (axVar4 == null) {
                        c0VarR.E(-1061316190);
                        ax axVarD12 = pj.f31758a.d(c0VarR, 6);
                        c0VarR.A();
                        axVar5 = axVarD12;
                    } else {
                        c0VarR.E(-1061316934);
                        c0VarR.A();
                        axVar5 = axVar4;
                    }
                    i(l6Var5, gmVar5, axVar5, ja0Var5, function3, c0VarR, i12 & 57344, 0);
                    c0VarR.A();
                    l6Var4 = l6Var2;
                } else {
                    c0VarR.E(1459011221);
                    l6Var4 = l6Var2;
                    androidx.compose.runtime.a1.e(m4Var.f(Boolean.TRUE), androidx.compose.runtime.internal.w.e(1535649272, true, new a(l6Var4, gmVar4, axVar4, ja0Var4, function2), c0VarR, 54), c0VarR, androidx.compose.runtime.n4.f36267i | 48);
                    c0VarR.A();
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                l6Var3 = l6Var4;
                gmVar3 = gmVar4;
                axVar3 = axVar4;
                ja0Var3 = ja0Var4;
            } else {
                c0VarR.u();
                l6Var3 = l6Var2;
                gmVar3 = gmVar2;
                axVar3 = axVar2;
                ja0Var3 = ja0Var2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.uj
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return vj.h(l6Var3, gmVar3, axVar3, ja0Var3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        axVar2 = axVar;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 3072) == 0) {
                ja0Var2 = ja0Var;
                if (c0VarR.D(ja0Var2)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            if ((i11 & 16) != 0) {
                if ((i10 & 24576) == 0) {
                    function3 = function2;
                    if (c0VarR.k0(function3)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                if ((i12 & 9363) != 9362) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i18 != 0) {
                        l6Var2 = null;
                    }
                    if (i19 != 0) {
                        gmVar4 = null;
                    } else {
                        gmVar4 = gmVar2;
                    }
                    if (i13 != 0) {
                        axVar4 = null;
                    } else {
                        axVar4 = axVar2;
                    }
                    if (i15 != 0) {
                        ja0Var4 = null;
                    } else {
                        ja0Var4 = ja0Var2;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1317329884, i12, -1, "androidx.compose.material3.MaterialExpressiveTheme (MaterialTheme.kt:190)");
                    }
                    m4Var = f33950a;
                    if (((Boolean) c0VarR.W(m4Var)).booleanValue()) {
                        c0VarR.E(1458674654);
                        if (l6Var2 == null) {
                            c0VarR.E(-1061322393);
                            l6 l6VarA13 = pj.f31758a.a(c0VarR, 6);
                            c0VarR.A();
                            l6Var5 = l6VarA13;
                        } else {
                            c0VarR.E(-1061323292);
                            c0VarR.A();
                            l6Var5 = l6Var2;
                        }
                        if (gmVar4 == null) {
                            c0VarR.E(-1061320152);
                            gm gmVarC13 = pj.f31758a.c(c0VarR, 6);
                            c0VarR.A();
                            gmVar5 = gmVarC13;
                        } else {
                            c0VarR.E(-1061321082);
                            c0VarR.A();
                            gmVar5 = gmVar4;
                        }
                        if (ja0Var4 == null) {
                            c0VarR.E(-1061318010);
                            ja0 ja0VarE13 = pj.f31758a.e(c0VarR, 6);
                            c0VarR.A();
                            ja0Var5 = ja0VarE13;
                        } else {
                            c0VarR.E(-1061318878);
                            c0VarR.A();
                            ja0Var5 = ja0Var4;
                        }
                        if (axVar4 == null) {
                            c0VarR.E(-1061316190);
                            ax axVarD13 = pj.f31758a.d(c0VarR, 6);
                            c0VarR.A();
                            axVar5 = axVarD13;
                        } else {
                            c0VarR.E(-1061316934);
                            c0VarR.A();
                            axVar5 = axVar4;
                        }
                        i(l6Var5, gmVar5, axVar5, ja0Var5, function3, c0VarR, i12 & 57344, 0);
                        c0VarR.A();
                        l6Var4 = l6Var2;
                    } else {
                        c0VarR.E(1459011221);
                        l6Var4 = l6Var2;
                        androidx.compose.runtime.a1.e(m4Var.f(Boolean.TRUE), androidx.compose.runtime.internal.w.e(1535649272, true, new a(l6Var4, gmVar4, axVar4, ja0Var4, function2), c0VarR, 54), c0VarR, androidx.compose.runtime.n4.f36267i | 48);
                        c0VarR.A();
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    l6Var3 = l6Var4;
                    gmVar3 = gmVar4;
                    axVar3 = axVar4;
                    ja0Var3 = ja0Var4;
                } else {
                    c0VarR.u();
                    l6Var3 = l6Var2;
                    gmVar3 = gmVar2;
                    axVar3 = axVar2;
                    ja0Var3 = ja0Var2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.uj
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return vj.h(l6Var3, gmVar3, axVar3, ja0Var3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            function3 = function2;
            if ((i12 & 9363) != 9362) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i18 != 0) {
                    l6Var2 = null;
                }
                if (i19 != 0) {
                    gmVar4 = null;
                } else {
                    gmVar4 = gmVar2;
                }
                if (i13 != 0) {
                    axVar4 = null;
                } else {
                    axVar4 = axVar2;
                }
                if (i15 != 0) {
                    ja0Var4 = null;
                } else {
                    ja0Var4 = ja0Var2;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1317329884, i12, -1, "androidx.compose.material3.MaterialExpressiveTheme (MaterialTheme.kt:190)");
                }
                m4Var = f33950a;
                if (((Boolean) c0VarR.W(m4Var)).booleanValue()) {
                    c0VarR.E(1458674654);
                    if (l6Var2 == null) {
                        c0VarR.E(-1061322393);
                        l6 l6VarA14 = pj.f31758a.a(c0VarR, 6);
                        c0VarR.A();
                        l6Var5 = l6VarA14;
                    } else {
                        c0VarR.E(-1061323292);
                        c0VarR.A();
                        l6Var5 = l6Var2;
                    }
                    if (gmVar4 == null) {
                        c0VarR.E(-1061320152);
                        gm gmVarC14 = pj.f31758a.c(c0VarR, 6);
                        c0VarR.A();
                        gmVar5 = gmVarC14;
                    } else {
                        c0VarR.E(-1061321082);
                        c0VarR.A();
                        gmVar5 = gmVar4;
                    }
                    if (ja0Var4 == null) {
                        c0VarR.E(-1061318010);
                        ja0 ja0VarE14 = pj.f31758a.e(c0VarR, 6);
                        c0VarR.A();
                        ja0Var5 = ja0VarE14;
                    } else {
                        c0VarR.E(-1061318878);
                        c0VarR.A();
                        ja0Var5 = ja0Var4;
                    }
                    if (axVar4 == null) {
                        c0VarR.E(-1061316190);
                        ax axVarD14 = pj.f31758a.d(c0VarR, 6);
                        c0VarR.A();
                        axVar5 = axVarD14;
                    } else {
                        c0VarR.E(-1061316934);
                        c0VarR.A();
                        axVar5 = axVar4;
                    }
                    i(l6Var5, gmVar5, axVar5, ja0Var5, function3, c0VarR, i12 & 57344, 0);
                    c0VarR.A();
                    l6Var4 = l6Var2;
                } else {
                    c0VarR.E(1459011221);
                    l6Var4 = l6Var2;
                    androidx.compose.runtime.a1.e(m4Var.f(Boolean.TRUE), androidx.compose.runtime.internal.w.e(1535649272, true, new a(l6Var4, gmVar4, axVar4, ja0Var4, function2), c0VarR, 54), c0VarR, androidx.compose.runtime.n4.f36267i | 48);
                    c0VarR.A();
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                l6Var3 = l6Var4;
                gmVar3 = gmVar4;
                axVar3 = axVar4;
                ja0Var3 = ja0Var4;
            } else {
                c0VarR.u();
                l6Var3 = l6Var2;
                gmVar3 = gmVar2;
                axVar3 = axVar2;
                ja0Var3 = ja0Var2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.uj
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return vj.h(l6Var3, gmVar3, axVar3, ja0Var3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        ja0Var2 = ja0Var;
        if ((i11 & 16) != 0) {
            if ((i10 & 24576) == 0) {
                function3 = function2;
                if (c0VarR.k0(function3)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i12 |= i17;
            }
            if ((i12 & 9363) != 9362) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i18 != 0) {
                    l6Var2 = null;
                }
                if (i19 != 0) {
                    gmVar4 = null;
                } else {
                    gmVar4 = gmVar2;
                }
                if (i13 != 0) {
                    axVar4 = null;
                } else {
                    axVar4 = axVar2;
                }
                if (i15 != 0) {
                    ja0Var4 = null;
                } else {
                    ja0Var4 = ja0Var2;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1317329884, i12, -1, "androidx.compose.material3.MaterialExpressiveTheme (MaterialTheme.kt:190)");
                }
                m4Var = f33950a;
                if (((Boolean) c0VarR.W(m4Var)).booleanValue()) {
                    c0VarR.E(1458674654);
                    if (l6Var2 == null) {
                        c0VarR.E(-1061322393);
                        l6 l6VarA15 = pj.f31758a.a(c0VarR, 6);
                        c0VarR.A();
                        l6Var5 = l6VarA15;
                    } else {
                        c0VarR.E(-1061323292);
                        c0VarR.A();
                        l6Var5 = l6Var2;
                    }
                    if (gmVar4 == null) {
                        c0VarR.E(-1061320152);
                        gm gmVarC15 = pj.f31758a.c(c0VarR, 6);
                        c0VarR.A();
                        gmVar5 = gmVarC15;
                    } else {
                        c0VarR.E(-1061321082);
                        c0VarR.A();
                        gmVar5 = gmVar4;
                    }
                    if (ja0Var4 == null) {
                        c0VarR.E(-1061318010);
                        ja0 ja0VarE15 = pj.f31758a.e(c0VarR, 6);
                        c0VarR.A();
                        ja0Var5 = ja0VarE15;
                    } else {
                        c0VarR.E(-1061318878);
                        c0VarR.A();
                        ja0Var5 = ja0Var4;
                    }
                    if (axVar4 == null) {
                        c0VarR.E(-1061316190);
                        ax axVarD15 = pj.f31758a.d(c0VarR, 6);
                        c0VarR.A();
                        axVar5 = axVarD15;
                    } else {
                        c0VarR.E(-1061316934);
                        c0VarR.A();
                        axVar5 = axVar4;
                    }
                    i(l6Var5, gmVar5, axVar5, ja0Var5, function3, c0VarR, i12 & 57344, 0);
                    c0VarR.A();
                    l6Var4 = l6Var2;
                } else {
                    c0VarR.E(1459011221);
                    l6Var4 = l6Var2;
                    androidx.compose.runtime.a1.e(m4Var.f(Boolean.TRUE), androidx.compose.runtime.internal.w.e(1535649272, true, new a(l6Var4, gmVar4, axVar4, ja0Var4, function2), c0VarR, 54), c0VarR, androidx.compose.runtime.n4.f36267i | 48);
                    c0VarR.A();
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                l6Var3 = l6Var4;
                gmVar3 = gmVar4;
                axVar3 = axVar4;
                ja0Var3 = ja0Var4;
            } else {
                c0VarR.u();
                l6Var3 = l6Var2;
                gmVar3 = gmVar2;
                axVar3 = axVar2;
                ja0Var3 = ja0Var2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.uj
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return vj.h(l6Var3, gmVar3, axVar3, ja0Var3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        function3 = function2;
        if ((i12 & 9363) != 9362) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i12 & 1)) {
            if (i18 != 0) {
                l6Var2 = null;
            }
            if (i19 != 0) {
                gmVar4 = null;
            } else {
                gmVar4 = gmVar2;
            }
            if (i13 != 0) {
                axVar4 = null;
            } else {
                axVar4 = axVar2;
            }
            if (i15 != 0) {
                ja0Var4 = null;
            } else {
                ja0Var4 = ja0Var2;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1317329884, i12, -1, "androidx.compose.material3.MaterialExpressiveTheme (MaterialTheme.kt:190)");
            }
            m4Var = f33950a;
            if (((Boolean) c0VarR.W(m4Var)).booleanValue()) {
                c0VarR.E(1458674654);
                if (l6Var2 == null) {
                    c0VarR.E(-1061322393);
                    l6 l6VarA16 = pj.f31758a.a(c0VarR, 6);
                    c0VarR.A();
                    l6Var5 = l6VarA16;
                } else {
                    c0VarR.E(-1061323292);
                    c0VarR.A();
                    l6Var5 = l6Var2;
                }
                if (gmVar4 == null) {
                    c0VarR.E(-1061320152);
                    gm gmVarC16 = pj.f31758a.c(c0VarR, 6);
                    c0VarR.A();
                    gmVar5 = gmVarC16;
                } else {
                    c0VarR.E(-1061321082);
                    c0VarR.A();
                    gmVar5 = gmVar4;
                }
                if (ja0Var4 == null) {
                    c0VarR.E(-1061318010);
                    ja0 ja0VarE16 = pj.f31758a.e(c0VarR, 6);
                    c0VarR.A();
                    ja0Var5 = ja0VarE16;
                } else {
                    c0VarR.E(-1061318878);
                    c0VarR.A();
                    ja0Var5 = ja0Var4;
                }
                if (axVar4 == null) {
                    c0VarR.E(-1061316190);
                    ax axVarD16 = pj.f31758a.d(c0VarR, 6);
                    c0VarR.A();
                    axVar5 = axVarD16;
                } else {
                    c0VarR.E(-1061316934);
                    c0VarR.A();
                    axVar5 = axVar4;
                }
                i(l6Var5, gmVar5, axVar5, ja0Var5, function3, c0VarR, i12 & 57344, 0);
                c0VarR.A();
                l6Var4 = l6Var2;
            } else {
                c0VarR.E(1459011221);
                l6Var4 = l6Var2;
                androidx.compose.runtime.a1.e(m4Var.f(Boolean.TRUE), androidx.compose.runtime.internal.w.e(1535649272, true, new a(l6Var4, gmVar4, axVar4, ja0Var4, function2), c0VarR, 54), c0VarR, androidx.compose.runtime.n4.f36267i | 48);
                c0VarR.A();
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            l6Var3 = l6Var4;
            gmVar3 = gmVar4;
            axVar3 = axVar4;
            ja0Var3 = ja0Var4;
        } else {
            c0VarR.u();
            l6Var3 = l6Var2;
            gmVar3 = gmVar2;
            axVar3 = axVar2;
            ja0Var3 = ja0Var2;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.uj
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return vj.h(l6Var3, gmVar3, axVar3, ja0Var3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(l6 l6Var, gm gmVar, ax axVar, ja0 ja0Var, Function2 function2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        g(l6Var, gmVar, axVar, ja0Var, function2, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[0[0]]")
    public static final void i(@Nullable l6 l6Var, @Nullable gm gmVar, @Nullable ax axVar, @Nullable ja0 ja0Var, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        l6 l6VarA;
        int i12;
        gm gmVarC;
        ax axVarD;
        ja0 ja0VarE;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(904511636);
        if ((i10 & 6) == 0) {
            if ((i11 & 1) == 0) {
                l6VarA = l6Var;
                int i13 = c0VarR.D(l6VarA) ? 4 : 2;
                i12 = i13 | i10;
            } else {
                l6VarA = l6Var;
            }
            i12 = i13 | i10;
        } else {
            l6VarA = l6Var;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if ((i11 & 2) == 0) {
                gmVarC = gmVar;
                int i14 = c0VarR.D(gmVarC) ? 32 : 16;
                i12 |= i14;
            } else {
                gmVarC = gmVar;
            }
            i12 |= i14;
        } else {
            gmVarC = gmVar;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            if ((i11 & 4) == 0) {
                axVarD = axVar;
                int i15 = c0VarR.D(axVarD) ? 256 : 128;
                i12 |= i15;
            } else {
                axVarD = axVar;
            }
            i12 |= i15;
        } else {
            axVarD = axVar;
        }
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                ja0VarE = ja0Var;
                int i16 = c0VarR.D(ja0VarE) ? 2048 : 1024;
                i12 |= i16;
            } else {
                ja0VarE = ja0Var;
            }
            i12 |= i16;
        } else {
            ja0VarE = ja0Var;
        }
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            i12 |= c0VarR.k0(function2) ? 16384 : 8192;
        }
        if (c0VarR.h((i12 & 9363) != 9362, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) == 0 || c0VarR.y()) {
                if ((i11 & 1) != 0) {
                    l6VarA = pj.f31758a.a(c0VarR, 6);
                    i12 &= -15;
                }
                if ((i11 & 2) != 0) {
                    gmVarC = pj.f31758a.c(c0VarR, 6);
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    axVarD = pj.f31758a.d(c0VarR, 6);
                    i12 &= -897;
                }
                if ((i11 & 8) != 0) {
                    ja0VarE = pj.f31758a.e(c0VarR, 6);
                    i12 &= -7169;
                }
            } else {
                c0VarR.u();
                if ((i11 & 1) != 0) {
                    i12 &= -15;
                }
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(904511636, i12, -1, "androidx.compose.material3.MaterialTheme (MaterialTheme.kt:95)");
            }
            androidx.compose.runtime.a1.f(new androidx.compose.runtime.n4[]{o6.p().f(l6VarA), f33952c.f(gmVarC), androidx.compose.foundation.w2.c().f(gt.e(false, 0.0f, 0L, 7, null)), cx.h().f(axVarD), androidx.compose.foundation.text.selection.y4.d().f(q(l6VarA, c0VarR, i12 & 14)), la0.d().f(ja0VarE)}, androidx.compose.runtime.internal.w.e(-1750539308, true, new b(ja0VarE, function2), c0VarR, 54), c0VarR, androidx.compose.runtime.n4.f36267i | 48);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        final ax axVar2 = axVarD;
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final l6 l6Var2 = l6VarA;
            final gm gmVar2 = gmVarC;
            final ja0 ja0Var2 = ja0VarE;
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.qj
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return vj.l(l6Var2, gmVar2, axVar2, ja0Var2, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[0[0]]")
    public static final void j(@Nullable l6 l6Var, @Nullable ax axVar, @Nullable ja0 ja0Var, @NotNull Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3;
        final ja0 ja0Var2;
        final ax axVar2;
        final l6 l6Var2;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-449719819);
        if ((i10 & 6) == 0) {
            i12 = (((i11 & 1) == 0 && c0VarR.D(l6Var)) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= ((i11 & 2) == 0 && c0VarR.D(axVar)) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i12 |= ((i11 & 4) == 0 && c0VarR.D(ja0Var)) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= c0VarR.k0(function2) ? 2048 : 1024;
        }
        if (c0VarR.h((i12 & 1171) != 1170, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) == 0 || c0VarR.y()) {
                if ((i11 & 1) != 0) {
                    l6Var = pj.f31758a.a(c0VarR, 6);
                    i12 &= -15;
                }
                if ((i11 & 2) != 0) {
                    axVar = pj.f31758a.d(c0VarR, 6);
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    ja0Var = pj.f31758a.e(c0VarR, 6);
                    i12 &= -897;
                }
            } else {
                c0VarR.u();
                if ((i11 & 1) != 0) {
                    i12 &= -15;
                }
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                }
            }
            l6 l6Var3 = l6Var;
            ax axVar3 = axVar;
            ja0 ja0Var3 = ja0Var;
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-449719819, i12, -1, "androidx.compose.material3.MaterialTheme (MaterialTheme.kt:59)");
            }
            int i13 = i12 << 3;
            i(l6Var3, pj.f31758a.c(c0VarR, 6), axVar3, ja0Var3, function2, c0VarR, (i12 & 14) | (i13 & 896) | (i13 & 7168) | (i13 & 57344), 0);
            function3 = function2;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            l6Var2 = l6Var3;
            axVar2 = axVar3;
            ja0Var2 = ja0Var3;
        } else {
            function3 = function2;
            c0VarR.u();
            ja0Var2 = ja0Var;
            axVar2 = axVar;
            l6Var2 = l6Var;
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.rj
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return vj.k(l6Var2, axVar2, ja0Var2, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(l6 l6Var, ax axVar, ja0 ja0Var, Function2 function2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        j(l6Var, axVar, ja0Var, function2, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(l6 l6Var, gm gmVar, ax axVar, ja0 ja0Var, Function2 function2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        i(l6Var, gmVar, axVar, ja0Var, function2, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gm m() {
        return gm.f27986a.b();
    }

    @NotNull
    public static final androidx.compose.runtime.m4<Boolean> o() {
        return f33950a;
    }

    private static /* synthetic */ void p() {
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final androidx.compose.foundation.text.selection.w4 q(@NotNull l6 l6Var, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1866455512, i10, -1, "androidx.compose.material3.rememberTextSelectionColors (MaterialTheme.kt:217)");
        }
        long jD0 = l6Var.D0();
        boolean zL = c0Var.L(jD0);
        Object objI0 = c0Var.i0();
        if (zL || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            int i11 = 2 ^ 0;
            androidx.compose.foundation.text.selection.w4 w4Var = new androidx.compose.foundation.text.selection.w4(jD0, androidx.compose.ui.graphics.q0.w(jD0, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null);
            c0Var.Y(w4Var);
            objI0 = w4Var;
        }
        androidx.compose.foundation.text.selection.w4 w4Var2 = (androidx.compose.foundation.text.selection.w4) objI0;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return w4Var2;
    }
}
