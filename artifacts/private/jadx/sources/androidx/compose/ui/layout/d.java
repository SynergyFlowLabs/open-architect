package androidx.compose.ui.layout;

import androidx.compose.runtime.k7;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/ApproachIntrinsicsMeasureScope\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 3 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegateKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,416:1\n105#2:417\n105#2:418\n394#3:419\n395#3,2:422\n398#3:425\n57#4,2:420\n60#4:424\n*S KotlinDebug\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/ApproachIntrinsicsMeasureScope\n*L\n394#1:417\n395#1:418\n396#1:419\n396#1:422,2\n396#1:425\n396#1:420,2\n396#1:424\n*E\n"})
public final class d implements g, c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f39291c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ c f39292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.unit.w f39293b;

    public static final class a implements b1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f39294a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f39295b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map<androidx.compose.ui.layout.a, Integer> f39296c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<v2, Unit> f39297d;

        /* JADX WARN: Multi-variable type inference failed */
        a(int i10, int i11, Map<androidx.compose.ui.layout.a, Integer> map, Function1<? super v2, Unit> function1) {
            this.f39294a = i10;
            this.f39295b = i11;
            this.f39296c = map;
            this.f39297d = function1;
        }

        @Override // androidx.compose.ui.layout.b1
        public int getHeight() {
            return this.f39295b;
        }

        @Override // androidx.compose.ui.layout.b1
        public int getWidth() {
            return this.f39294a;
        }

        @Override // androidx.compose.ui.layout.b1
        public Function1<v2, Unit> j() {
            return this.f39297d;
        }

        @Override // androidx.compose.ui.layout.b1
        public Map<androidx.compose.ui.layout.a, Integer> x() {
            return this.f39296c;
        }

        @Override // androidx.compose.ui.layout.b1
        public void y() {
        }
    }

    public d(@NotNull c cVar, @NotNull androidx.compose.ui.unit.w wVar) {
        this.f39292a = cVar;
        this.f39293b = wVar;
    }

    @Override // androidx.compose.ui.unit.d
    @k7
    public long C0(long j10) {
        return this.f39292a.C0(j10);
    }

    @Override // androidx.compose.ui.layout.c
    public long C4() {
        return this.f39292a.C4();
    }

    @Override // androidx.compose.ui.unit.d
    @k7
    public float D3(int i10) {
        return this.f39292a.D3(i10);
    }

    @Override // androidx.compose.ui.unit.d
    @k7
    public float F3(float f10) {
        return this.f39292a.F3(f10);
    }

    @Override // androidx.compose.ui.unit.d
    @k7
    @NotNull
    public n0.j N3(@NotNull androidx.compose.ui.unit.k kVar) {
        return this.f39292a.N3(kVar);
    }

    @Override // androidx.compose.ui.layout.z
    public boolean P5() {
        return this.f39292a.P5();
    }

    @Override // androidx.compose.ui.unit.d
    @k7
    public float S7(float f10) {
        return this.f39292a.S7(f10);
    }

    @Override // androidx.compose.ui.unit.d
    @k7
    public int c8(long j10) {
        return this.f39292a.c8(j10);
    }

    @Override // androidx.compose.ui.unit.n
    @k7
    public long d0(float f10) {
        return this.f39292a.d0(f10);
    }

    @Override // androidx.compose.ui.layout.c1
    @NotNull
    public b1 f8(int i10, int i11, @NotNull Map<androidx.compose.ui.layout.a, Integer> map, @Nullable Function1<? super v2, Unit> function1, @NotNull Function1<? super i2.a, Unit> function2) {
        boolean z10 = false;
        if (i10 < 0) {
            i10 = 0;
        }
        if (i11 < 0) {
            i11 = 0;
        }
        if ((i10 & (-16777216)) == 0 && ((-16777216) & i11) == 0) {
            z10 = true;
        }
        if (!z10) {
            s0.a.i("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new a(i10, i11, map, function1);
    }

    @Override // androidx.compose.ui.unit.d
    @k7
    public int g6(float f10) {
        return this.f39292a.g6(f10);
    }

    @Override // androidx.compose.ui.unit.d
    public float getDensity() {
        return this.f39292a.getDensity();
    }

    @Override // androidx.compose.ui.layout.z
    @NotNull
    public androidx.compose.ui.unit.w getLayoutDirection() {
        return this.f39293b;
    }

    @Override // androidx.compose.ui.unit.d
    @k7
    public long j1(int i10) {
        return this.f39292a.j1(i10);
    }

    @Override // androidx.compose.ui.unit.d
    @k7
    public long k4(long j10) {
        return this.f39292a.k4(j10);
    }

    @Override // androidx.compose.ui.unit.n
    public float m0() {
        return this.f39292a.m0();
    }

    @Override // androidx.compose.ui.unit.d
    @k7
    public long m1(float f10) {
        return this.f39292a.m1(f10);
    }

    @Override // androidx.compose.ui.unit.d
    @k7
    public float p6(long j10) {
        return this.f39292a.p6(j10);
    }

    @Override // androidx.compose.ui.layout.c
    public long s2() {
        return this.f39292a.s2();
    }

    @Override // androidx.compose.ui.unit.n
    @k7
    public float y(long j10) {
        return this.f39292a.y(j10);
    }
}
