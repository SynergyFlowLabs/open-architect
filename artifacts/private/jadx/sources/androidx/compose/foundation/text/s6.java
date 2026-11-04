package androidx.compose.foundation.text;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.k7
@SourceDebugExtension({"SMAP\nTextFieldScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollerPosition\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 3 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,393:1\n81#2:394\n114#2,2:395\n81#2:397\n114#2,2:398\n78#3:400\n111#3,2:401\n85#4:403\n117#4,2:404\n*S KotlinDebug\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollerPosition\n*L\n274#1:394\n274#1:395,2\n280#1:397\n280#1:398,2\n284#1:400\n284#1:401,2\n299#1:403\n299#1:404,2\n*E\n"})
public final class s6 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f20980h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.k3 f20982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.k3 f20983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.l3 f20984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private n0.j f20985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f20986e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f20987f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f20979g = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.saveable.c0<s6, Object> f20981i = androidx.compose.runtime.saveable.b.b(new Function2() { // from class: androidx.compose.foundation.text.q6
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return s6.c((androidx.compose.runtime.saveable.g0) obj, (s6) obj2);
        }
    }, new Function1() { // from class: androidx.compose.foundation.text.r6
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return s6.d((List) obj);
        }
    });

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final androidx.compose.runtime.saveable.c0<s6, Object> a() {
            return s6.f20981i;
        }

        private a() {
        }
    }

    public s6(@NotNull androidx.compose.foundation.gestures.q3 q3Var, float f10) {
        this.f20982a = androidx.compose.runtime.g4.b(f10);
        this.f20983b = androidx.compose.runtime.g4.b(0.0f);
        this.f20984c = androidx.compose.runtime.e6.b(0);
        this.f20985d = n0.j.f332705e.a();
        this.f20986e = androidx.compose.ui.text.w3.f42333b.a();
        this.f20987f = androidx.compose.runtime.w6.k(q3Var, androidx.compose.runtime.w6.z());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List c(androidx.compose.runtime.saveable.g0 g0Var, s6 s6Var) {
        return CollectionsKt.listOf(Float.valueOf(s6Var.h()), Boolean.valueOf(s6Var.j() == androidx.compose.foundation.gestures.q3.Vertical));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s6 d(List list) {
        Object obj = list.get(1);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
        androidx.compose.foundation.gestures.q3 q3Var = ((Boolean) obj).booleanValue() ? androidx.compose.foundation.gestures.q3.Vertical : androidx.compose.foundation.gestures.q3.Horizontal;
        Object obj2 = list.get(0);
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Float");
        return new s6(q3Var, ((Float) obj2).floatValue());
    }

    private final void m(float f10) {
        this.f20983b.q(f10);
    }

    private final void q(int i10) {
        this.f20984c.j(i10);
    }

    public final void f(float f10, float f11, int i10) {
        float f12;
        float fH = h();
        float f13 = i10;
        float f14 = fH + f13;
        if (f11 <= f14 && (f10 >= fH || f11 - f10 <= f13)) {
            f12 = (f10 >= fH || f11 - f10 > f13) ? 0.0f : f10 - fH;
        } else {
            f12 = f11 - f14;
        }
        n(h() + f12);
    }

    public final float g() {
        return this.f20983b.V0();
    }

    public final float h() {
        return this.f20982a.V0();
    }

    public final int i(long j10) {
        if (androidx.compose.ui.text.w3.n(j10) != androidx.compose.ui.text.w3.n(this.f20986e)) {
            return androidx.compose.ui.text.w3.n(j10);
        }
        return androidx.compose.ui.text.w3.i(j10) != androidx.compose.ui.text.w3.i(this.f20986e) ? androidx.compose.ui.text.w3.i(j10) : androidx.compose.ui.text.w3.l(j10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final androidx.compose.foundation.gestures.q3 j() {
        return (androidx.compose.foundation.gestures.q3) this.f20987f.getValue();
    }

    public final long k() {
        return this.f20986e;
    }

    public final int l() {
        return this.f20984c.m1();
    }

    public final void n(float f10) {
        this.f20982a.q(f10);
    }

    public final void o(@NotNull androidx.compose.foundation.gestures.q3 q3Var) {
        this.f20987f.setValue(q3Var);
    }

    public final void p(long j10) {
        this.f20986e = j10;
    }

    public final void r(@NotNull androidx.compose.foundation.gestures.q3 q3Var, @NotNull n0.j jVar, int i10, int i11) {
        float f10 = i11 - i10;
        m(f10);
        if (jVar.t() != this.f20985d.t() || jVar.B() != this.f20985d.B()) {
            boolean z10 = q3Var == androidx.compose.foundation.gestures.q3.Vertical;
            f(z10 ? jVar.B() : jVar.t(), z10 ? jVar.j() : jVar.x(), i10);
            this.f20985d = jVar;
        }
        n(kotlin.ranges.r.H(h(), 0.0f, f10));
        q(i10);
    }

    public /* synthetic */ s6(androidx.compose.foundation.gestures.q3 q3Var, float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(q3Var, (i10 & 2) != 0 ? 0.0f : f10);
    }

    public s6() {
        this(androidx.compose.foundation.gestures.q3.Vertical, 0.0f, 2, null);
    }
}
