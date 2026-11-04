package androidx.compose.ui.layout;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.e6;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.w6;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nWindowInsetsRulers.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsRulers.android.kt\nandroidx/compose/ui/layout/InsetsListener\n+ 2 ValueInsets.android.kt\nandroidx/compose/ui/layout/ValueInsets_androidKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 IntObjectMap.kt\nandroidx/collection/IntObjectMap\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 6 ObjectList.kt\nandroidx/collection/MutableObjectList\n*L\n1#1,576:1\n47#2,4:577\n46#2,6:581\n47#2,4:609\n46#2,6:613\n47#2,4:643\n46#2,6:647\n47#2,4:660\n46#2,6:664\n56#2,4:670\n55#2,6:674\n35#3,5:587\n71#3,5:682\n382#4,4:592\n354#4,6:596\n364#4,3:603\n367#4,2:607\n370#4,6:619\n386#4:625\n382#4,4:626\n354#4,6:630\n364#4,3:637\n367#4,2:641\n370#4,6:653\n386#4:659\n1399#5:602\n1270#5:606\n1399#5:636\n1270#5:640\n919#6,2:680\n*S KotlinDebug\n*F\n+ 1 WindowInsetsRulers.android.kt\nandroidx/compose/ui/layout/InsetsListener\n*L\n308#1:577,4\n308#1:581,6\n405#1:609,4\n405#1:613,6\n418#1:643,4\n418#1:647,6\n434#1:660,4\n434#1:664,6\n450#1:670,4\n450#1:674,6\n338#1:587,5\n482#1:682,5\n404#1:592,4\n404#1:596,6\n404#1:603,3\n404#1:607,2\n404#1:619,6\n404#1:625\n415#1:626,4\n415#1:630,6\n415#1:637,3\n415#1:641,2\n415#1:653,6\n415#1:659\n404#1:602\n404#1:606\n415#1:636\n415#1:640\n476#1:680,2\n*E\n"})
public final class x extends androidx.core.view.l2.b implements Runnable, androidx.core.view.b1, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f39575m = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final AndroidComposeView f39576e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f39577f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f39578g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private androidx.core.view.g3 f39579h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final androidx.collection.a3<Object, o3> f39580i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.l3 f39581j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final androidx.collection.g2<androidx.compose.runtime.n3<Rect>> f39582k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final SnapshotStateList<m2> f39583l;

    public x(@NotNull AndroidComposeView androidComposeView) {
        super(1);
        this.f39576e = androidComposeView;
        androidx.collection.k2 k2Var = new androidx.collection.k2(9);
        k3.a aVar = k3.f39390a;
        k2Var.q0(aVar.a(), new o3("caption bar"));
        k2Var.q0(aVar.b(), new o3("display cutout"));
        k2Var.q0(aVar.c(), new o3("ime"));
        k2Var.q0(aVar.d(), new o3("mandatory system gestures"));
        k2Var.q0(aVar.e(), new o3("navigation bars"));
        k2Var.q0(aVar.i(), new o3("status bars"));
        k2Var.q0(aVar.k(), new o3("system gestures"));
        k2Var.q0(aVar.l(), new o3("tappable element"));
        k2Var.q0(aVar.m(), new o3("waterfall"));
        this.f39580i = k2Var;
        this.f39581j = e6.b(0);
        this.f39582k = new androidx.collection.g2<>(4);
        this.f39583l = w6.g();
    }

    private final void l(o3 o3Var) {
        o3Var.h(false);
        o3Var.m(g3.c());
        o3Var.n(g3.c());
    }

    private final void m(o3 o3Var, androidx.core.view.l2 l2Var) {
        o3Var.k(l2Var.d());
        o3Var.g(l2Var.a());
        o3Var.j(l2Var.b());
    }

    private final void n(androidx.core.view.g3 g3Var) {
        long j10;
        boolean z10;
        long j11;
        char c10;
        char c11;
        char c12;
        char c13;
        int i10;
        boolean z11;
        boolean z12;
        long jB;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int[] iArr2;
        long[] jArr3;
        int[] iArr3;
        long[] jArr4;
        int[] iArr4;
        int i11;
        long j12;
        int i12;
        androidx.collection.j0 j0Var = n3.f39453b;
        int[] iArr5 = j0Var.f12302b;
        Object[] objArr = j0Var.f12303c;
        long[] jArr5 = j0Var.f12301a;
        int i13 = 2;
        int length = jArr5.length - 2;
        long j13 = -9187201950435737472L;
        int i14 = 8;
        if (length >= 0) {
            int i15 = 0;
            z11 = false;
            z12 = false;
            z10 = true;
            j11 = 255;
            while (true) {
                long j14 = jArr5[i15];
                c10 = 7;
                c11 = 16;
                if ((((~j14) << 7) & j14 & j13) != j13) {
                    int i16 = 8 - ((~(i15 - length)) >>> 31);
                    int i17 = 0;
                    while (i17 < i16) {
                        if ((j14 & 255) < 128) {
                            int i18 = (i15 << 3) + i17;
                            int i19 = iArr5[i18];
                            k3 k3Var = (k3) objArr[i18];
                            androidx.core.graphics.j jVarF = g3Var.f(i19);
                            j12 = j13;
                            i12 = i13;
                            i11 = i14;
                            jArr4 = jArr5;
                            iArr4 = iArr5;
                            long jB2 = f3.b((((long) jVarF.f47824b) << 32) | (((long) jVarF.f47823a) << 48) | (((long) jVarF.f47825c) << 16) | ((long) jVarF.f47826d));
                            o3 o3VarP = this.f39580i.p(k3Var);
                            Intrinsics.checkNotNull(o3VarP);
                            o3 o3Var = o3VarP;
                            if (!f3.d(jB2, o3Var.c())) {
                                o3Var.i(jB2);
                                z11 = true;
                                if (!f3.d(jB2, g3.d())) {
                                    z12 = true;
                                }
                            }
                        } else {
                            jArr4 = jArr5;
                            iArr4 = iArr5;
                            i11 = i14;
                            j12 = j13;
                            i12 = i13;
                        }
                        j14 >>= i11;
                        i17++;
                        i13 = i12;
                        i14 = i11;
                        j13 = j12;
                        iArr5 = iArr4;
                        jArr5 = jArr4;
                    }
                    jArr3 = jArr5;
                    iArr3 = iArr5;
                    int i20 = i14;
                    j10 = j13;
                    c12 = ' ';
                    c13 = org.locationtech.jts.geom.l.f338160j;
                    i10 = i13;
                    if (i16 != i20) {
                        break;
                    }
                } else {
                    jArr3 = jArr5;
                    iArr3 = iArr5;
                    j10 = j13;
                    c12 = ' ';
                    c13 = org.locationtech.jts.geom.l.f338160j;
                    i10 = i13;
                }
                if (i15 == length) {
                    break;
                }
                i15++;
                i13 = i10;
                j13 = j10;
                iArr5 = iArr3;
                jArr5 = jArr3;
                i14 = 8;
            }
        } else {
            j10 = -9187201950435737472L;
            z10 = true;
            j11 = 255;
            c10 = 7;
            c11 = 16;
            c12 = ' ';
            c13 = org.locationtech.jts.geom.l.f338160j;
            i10 = 2;
            z11 = false;
            z12 = false;
        }
        androidx.collection.t1 t1Var = n3.f39455d;
        int[] iArr6 = t1Var.f12302b;
        Object[] objArr2 = t1Var.f12303c;
        long[] jArr6 = t1Var.f12301a;
        int length2 = jArr6.length - 2;
        if (length2 >= 0) {
            int i21 = 0;
            while (true) {
                long j15 = jArr6[i21];
                if ((((~j15) << c10) & j15 & j10) != j10) {
                    int i22 = 8 - ((~(i21 - length2)) >>> 31);
                    int i23 = 0;
                    while (i23 < i22) {
                        if ((j15 & j11) < 128) {
                            int i24 = (i21 << 3) + i23;
                            int i25 = iArr6[i24];
                            o3 o3VarP2 = this.f39580i.p((k3) objArr2[i24]);
                            Intrinsics.checkNotNull(o3VarP2);
                            o3 o3Var2 = o3VarP2;
                            if (i25 != androidx.core.view.g3.m.d()) {
                                androidx.core.graphics.j jVarG = g3Var.g(i25);
                                jArr2 = jArr6;
                                iArr2 = iArr6;
                                long jB3 = f3.b((((long) jVarG.f47824b) << c12) | (((long) jVarG.f47823a) << c13) | (((long) jVarG.f47825c) << c11) | ((long) jVarG.f47826d));
                                if (!f3.d(o3Var2.d(), jB3)) {
                                    o3Var2.l(jB3);
                                    z11 = z10;
                                    if (!f3.d(jB3, g3.d())) {
                                        z12 = z11;
                                    }
                                }
                            } else {
                                jArr2 = jArr6;
                                iArr2 = iArr6;
                            }
                            o3Var2.o(g3Var.C(i25));
                        } else {
                            jArr2 = jArr6;
                            iArr2 = iArr6;
                        }
                        j15 >>= 8;
                        i23++;
                        jArr6 = jArr2;
                        iArr6 = iArr2;
                    }
                    jArr = jArr6;
                    iArr = iArr6;
                    if (i22 != 8) {
                        break;
                    }
                } else {
                    jArr = jArr6;
                    iArr = iArr6;
                }
                if (i21 == length2) {
                    break;
                }
                i21++;
                jArr6 = jArr;
                iArr6 = iArr;
            }
        }
        androidx.core.view.y yVarE = g3Var.e();
        if (yVarE == null) {
            jB = g3.d();
        } else {
            androidx.core.graphics.j jVarH = yVarE.h();
            jB = f3.b((((long) jVarH.f47823a) << c13) | (((long) jVarH.f47824b) << c12) | (((long) jVarH.f47825c) << c11) | ((long) jVarH.f47826d));
        }
        androidx.collection.a3<Object, o3> a3Var = this.f39580i;
        k3.a aVar = k3.f39390a;
        o3 o3VarP3 = a3Var.p(aVar.m());
        Intrinsics.checkNotNull(o3VarP3);
        o3 o3Var3 = o3VarP3;
        if (!f3.d(o3Var3.c(), jB)) {
            o3Var3.i(jB);
            o3Var3.l(jB);
            z11 = z10;
            if (!f3.d(jB, g3.d())) {
                z12 = z11;
            }
        }
        long jD = yVarE == null ? g3.d() : f3.b((((long) yVarE.g()) << c12) | (((long) yVarE.e()) << c13) | (((long) yVarE.f()) << c11) | ((long) yVarE.d()));
        o3 o3VarP4 = this.f39580i.p(aVar.b());
        Intrinsics.checkNotNull(o3VarP4);
        o3 o3Var4 = o3VarP4;
        if (!f3.d(jD, o3Var4.c())) {
            o3Var4.i(jD);
            o3Var4.l(jD);
            z11 = z10;
            if (!f3.d(jD, g3.d())) {
                z12 = z11;
            }
        }
        if (yVarE != null) {
            List<Rect> listB = yVarE.b();
            if (listB.size() < this.f39582k.C()) {
                this.f39582k.L0(listB.size(), this.f39582k.C());
                this.f39583l.v(listB.size(), this.f39583l.size());
                z11 = z10;
            } else {
                int size = listB.size() - this.f39582k.C();
                int i26 = 0;
                while (i26 < size) {
                    androidx.collection.g2<androidx.compose.runtime.n3<Rect>> g2Var = this.f39582k;
                    g2Var.a0(d7.g(listB.get(g2Var.C()), null, i10, null));
                    this.f39583l.add(o2.b("display cutout rect " + this.f39582k.C()));
                    i26++;
                    z11 = z10;
                }
            }
            List<Rect> list = listB;
            int size2 = list.size();
            for (int i27 = 0; i27 < size2; i27++) {
                Rect rect = listB.get(i27);
                androidx.compose.runtime.n3<Rect> n3VarY = this.f39582k.y(i27);
                if (!Intrinsics.areEqual(n3VarY.getValue(), rect)) {
                    n3VarY.setValue(rect);
                    z11 = z10;
                }
            }
            if (!list.isEmpty()) {
                z12 = z10;
            }
        } else if (this.f39582k.C() > 0) {
            this.f39582k.l0();
            this.f39583l.clear();
            z11 = z10;
        }
        if ((z12 || this.f39581j.m1() != 0) && z11) {
            androidx.compose.runtime.l3 l3Var = this.f39581j;
            l3Var.j(l3Var.m1() + 1);
            androidx.compose.runtime.snapshots.m.f36535e.y();
        }
    }

    @Override // androidx.core.view.b1
    @NotNull
    public androidx.core.view.g3 b(@NotNull View view, @NotNull androidx.core.view.g3 g3Var) {
        if (this.f39577f) {
            this.f39579h = g3Var;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return g3Var;
            }
        } else if (this.f39578g == 0) {
            n(g3Var);
        }
        return g3Var;
    }

    @Override // androidx.core.view.l2.b
    public void c(@NotNull androidx.core.view.l2 l2Var) {
        this.f39577f = false;
        int iF = l2Var.f();
        this.f39578g &= ~iF;
        this.f39579h = null;
        k3 k3Var = (k3) n3.f39455d.n(iF);
        if (k3Var != null) {
            o3 o3VarP = this.f39580i.p(k3Var);
            Intrinsics.checkNotNull(o3VarP);
            o3 o3Var = o3VarP;
            int i10 = 2 ^ 0;
            o3Var.k(0.0f);
            o3Var.g(1.0f);
            o3Var.j(0L);
            o3Var.k(0.0f);
            l(o3Var);
            androidx.compose.runtime.l3 l3Var = this.f39581j;
            l3Var.j(l3Var.m1() + 1);
            androidx.compose.runtime.snapshots.m.f36535e.y();
        }
        super.c(l2Var);
    }

    @Override // androidx.core.view.l2.b
    public void d(@NotNull androidx.core.view.l2 l2Var) {
        this.f39577f = true;
        super.d(l2Var);
    }

    @Override // androidx.core.view.l2.b
    @NotNull
    public androidx.core.view.g3 e(@NotNull androidx.core.view.g3 g3Var, @NotNull List<androidx.core.view.l2> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.core.view.l2 l2Var = list.get(i10);
            k3 k3Var = (k3) n3.f39455d.n(l2Var.f());
            if (k3Var != null) {
                o3 o3VarP = this.f39580i.p(k3Var);
                Intrinsics.checkNotNull(o3VarP);
                o3 o3Var = o3VarP;
                if (o3Var.b()) {
                    m(o3Var, l2Var);
                }
            }
        }
        n(g3Var);
        return g3Var;
    }

    @Override // androidx.core.view.l2.b
    @NotNull
    public androidx.core.view.l2.a f(@NotNull androidx.core.view.l2 l2Var, @NotNull androidx.core.view.l2.a aVar) {
        androidx.core.view.g3 g3Var = this.f39579h;
        this.f39577f = false;
        this.f39579h = null;
        if (l2Var.b() > 0 && g3Var != null) {
            int iF = l2Var.f();
            this.f39578g |= iF;
            k3 k3Var = (k3) n3.f39455d.n(iF);
            if (k3Var != null) {
                o3 o3VarP = this.f39580i.p(k3Var);
                Intrinsics.checkNotNull(o3VarP);
                o3 o3Var = o3VarP;
                androidx.core.graphics.j jVarF = g3Var.f(iF);
                long jB = f3.b(((long) jVarF.f47826d) | (((long) jVarF.f47823a) << 48) | (((long) jVarF.f47824b) << 32) | (((long) jVarF.f47825c) << 16));
                long jC = o3Var.c();
                if (!f3.d(jB, jC)) {
                    o3Var.m(jC);
                    o3Var.n(jB);
                    int i10 = 5 & 1;
                    o3Var.h(true);
                    m(o3Var, l2Var);
                    androidx.compose.runtime.l3 l3Var = this.f39581j;
                    l3Var.j(l3Var.m1() + 1);
                    androidx.compose.runtime.snapshots.m.f36535e.y();
                }
            }
        }
        return super.f(l2Var, aVar);
    }

    @NotNull
    public final AndroidComposeView g() {
        return this.f39576e;
    }

    @NotNull
    public final SnapshotStateList<m2> h() {
        return this.f39583l;
    }

    @NotNull
    public final androidx.collection.g2<androidx.compose.runtime.n3<Rect>> i() {
        return this.f39582k;
    }

    @NotNull
    public final androidx.compose.runtime.l3 j() {
        return this.f39581j;
    }

    @NotNull
    public final androidx.collection.a3<Object, o3> k() {
        return this.f39580i;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(@NotNull View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        androidx.core.view.u1.j2(view, this);
        androidx.core.view.u1.G2(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@NotNull View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        androidx.core.view.u1.j2(view, null);
        androidx.core.view.u1.G2(view, null);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f39577f) {
            this.f39578g = 0;
            this.f39577f = false;
            androidx.core.view.g3 g3Var = this.f39579h;
            if (g3Var != null) {
                n(g3Var);
                this.f39579h = null;
            }
        }
    }
}
