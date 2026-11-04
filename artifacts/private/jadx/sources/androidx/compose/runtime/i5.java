package androidx.compose.runtime;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nPausableComposition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PausableComposition.kt\nandroidx/compose/runtime/RecordingApplier\n+ 2 IntList.kt\nandroidx/collection/IntListKt\n+ 3 ObjectList.kt\nandroidx/collection/ObjectListKt\n+ 4 IntList.kt\nandroidx/collection/IntList\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,567:1\n905#2:568\n1516#3:569\n1516#3:571\n65#4:570\n4788#5,4:572\n*S KotlinDebug\n*F\n+ 1 PausableComposition.kt\nandroidx/compose/runtime/RecordingApplier\n*L\n345#1:568\n346#1:569\n404#1:571\n402#1:570\n459#1:572,4\n*E\n"})
public final class i5<N> implements i<N> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f35870d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f35871e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f35872f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f35873g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f35874h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f35875i = 3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f35876j = 4;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f35877k = 5;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f35878l = 6;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f35879m = 7;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f35880n = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.collection.r1 f35881a = new androidx.collection.r1(0, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.collection.g2<Object> f35882b = new androidx.collection.g2<>(0, 1, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private N f35883c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public i5(N n10) {
        this.f35883c = n10;
    }

    @Override // androidx.compose.runtime.i
    public N a() {
        return this.f35883c;
    }

    @Override // androidx.compose.runtime.i
    public void b(int i10, int i11) {
        this.f35881a.b0(2);
        this.f35881a.b0(i10);
        this.f35881a.b0(i11);
    }

    @Override // androidx.compose.runtime.i
    public void clear() {
        this.f35881a.b0(4);
    }

    @Override // androidx.compose.runtime.i
    public void e() {
        this.f35881a.b0(8);
    }

    @Override // androidx.compose.runtime.i
    public void i(int i10, int i11, int i12) {
        this.f35881a.b0(3);
        this.f35881a.b0(i10);
        this.f35881a.b0(i11);
        this.f35881a.b0(i12);
    }

    @Override // androidx.compose.runtime.i
    public void k(@NotNull Function2<? super N, Object, Unit> function2, @Nullable Object obj) {
        this.f35881a.b0(7);
        this.f35882b.a0(function2);
        this.f35882b.a0(obj);
    }

    @Override // androidx.compose.runtime.i
    public void l(int i10, N n10) {
        this.f35881a.b0(6);
        this.f35881a.b0(i10);
        this.f35882b.a0(n10);
    }

    @Override // androidx.compose.runtime.i
    public void m(int i10, N n10) {
        this.f35881a.b0(5);
        this.f35881a.b0(i10);
        this.f35882b.a0(n10);
    }

    @Override // androidx.compose.runtime.i
    public void n(N n10) {
        this.f35881a.b0(1);
        this.f35882b.a0(n10);
    }

    @Override // androidx.compose.runtime.i
    public void o() {
        this.f35881a.b0(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p(@NotNull i<N> iVar, @NotNull androidx.compose.runtime.internal.t0 t0Var) {
        Exception exc;
        int i10;
        int i11;
        androidx.collection.r1 r1Var = this.f35881a;
        int i12 = r1Var.f12216b;
        androidx.collection.g2<Object> g2Var = this.f35882b;
        androidx.collection.g2 g2Var2 = new androidx.collection.g2(0, 1, null);
        iVar.f();
        int i13 = 0;
        int i14 = 0;
        while (i13 < i12) {
            int i15 = i13 + 1;
            try {
                try {
                    switch (r1Var.w(i13)) {
                        case 0:
                            iVar.o();
                            i13 = i15;
                            break;
                        case 1:
                            int i16 = i14 + 1;
                            iVar.n(g2Var.y(i14));
                            i14 = i16;
                            i13 = i15;
                            break;
                        case 2:
                            int i17 = i13 + 2;
                            i13 += 3;
                            iVar.b(r1Var.w(i15), r1Var.w(i17));
                            break;
                        case 3:
                            int i18 = i13 + 2;
                            try {
                                int i19 = i13 + 3;
                                try {
                                    i13 += 4;
                                    iVar.i(r1Var.w(i15), r1Var.w(i18), r1Var.w(i19));
                                } catch (Exception e10) {
                                    exc = e10;
                                    i10 = i19;
                                    throw new y(g2Var, g2Var2, r1Var, i10, exc);
                                }
                            } catch (Exception e11) {
                                exc = e11;
                                i10 = i18;
                            }
                            break;
                        case 4:
                            iVar.clear();
                            i13 = i15;
                            break;
                        case 5:
                            i13 += 2;
                            i11 = i14 + 1;
                            iVar.m(r1Var.w(i15), g2Var.y(i14));
                            i14 = i11;
                            break;
                        case 6:
                            i13 += 2;
                            try {
                                i11 = i14 + 1;
                                iVar.l(r1Var.w(i15), g2Var.y(i14));
                                i14 = i11;
                            } catch (Exception e12) {
                                i10 = i13;
                                exc = e12;
                                throw new y(g2Var, g2Var2, r1Var, i10, exc);
                            }
                            break;
                        case 7:
                            int i20 = i14 + 1;
                            Object objY = g2Var.y(i14);
                            Intrinsics.checkNotNull(objY, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
                            i14 += 2;
                            iVar.k((Function2) kotlin.jvm.internal.r1.q(objY, 2), g2Var.y(i20));
                            i13 = i15;
                            break;
                        case 8:
                            Object objA = iVar.a();
                            if (objA instanceof x) {
                                t0Var.k((x) objA);
                            }
                            g2Var2.a0(objA);
                            iVar.e();
                            i13 = i15;
                            break;
                        default:
                            i13 = i15;
                            break;
                    }
                } catch (Throwable th2) {
                    iVar.c();
                    throw th2;
                }
            } catch (Exception e13) {
                exc = e13;
                i10 = i15;
            }
        }
        if (!(i14 == g2Var.C())) {
            m0.y("Applier operation size mismatch");
        }
        g2Var.l0();
        r1Var.g0();
        iVar.c();
    }

    public void q(N n10) {
        this.f35883c = n10;
    }
}
