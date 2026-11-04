package androidx.compose.material3;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.k7
@SourceDebugExtension({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/TopAppBarState\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,3517:1\n81#2:3518\n114#2,2:3519\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/TopAppBarState\n*L\n1912#1:3518\n1912#1:3519,2\n*E\n"})
public final class fa0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f27618e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f27620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.k3 f27621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private androidx.compose.runtime.k3 f27622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f27617d = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.saveable.c0<fa0, ?> f27619f = androidx.compose.runtime.saveable.b.b(new Function2() { // from class: androidx.compose.material3.da0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return fa0.c((androidx.compose.runtime.saveable.g0) obj, (fa0) obj2);
        }
    }, new Function1() { // from class: androidx.compose.material3.ea0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return fa0.d((List) obj);
        }
    });

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final androidx.compose.runtime.saveable.c0<fa0, ?> a() {
            return fa0.f27619f;
        }

        private a() {
        }
    }

    public fa0(float f10, float f11, float f12) {
        this.f27620a = f10;
        this.f27621b = androidx.compose.runtime.g4.b(f12);
        this.f27622c = androidx.compose.runtime.g4.b(f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List c(androidx.compose.runtime.saveable.g0 g0Var, fa0 fa0Var) {
        return CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(fa0Var.f27620a), Float.valueOf(fa0Var.h()), Float.valueOf(fa0Var.g())});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fa0 d(List list) {
        return new fa0(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue(), ((Number) list.get(2)).floatValue());
    }

    public final float f() {
        if (this.f27620a == 0.0f) {
            return 0.0f;
        }
        return h() / this.f27620a;
    }

    public final float g() {
        return this.f27621b.V0();
    }

    public final float h() {
        return this.f27622c.V0();
    }

    public final float i() {
        return this.f27620a;
    }

    public final float j() {
        float f10 = this.f27620a;
        if (f10 == 0.0f) {
            return 0.0f;
        }
        return 1 - (kotlin.ranges.r.H(f10 - g(), this.f27620a, 0.0f) / this.f27620a);
    }

    public final void k(float f10) {
        this.f27621b.q(f10);
    }

    public final void l(float f10) {
        this.f27622c.q(kotlin.ranges.r.H(f10, this.f27620a, 0.0f));
    }

    public final void m(float f10) {
        this.f27620a = f10;
    }
}
