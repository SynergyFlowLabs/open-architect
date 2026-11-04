package androidx.compose.material3;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nAppBarDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBarDsl.kt\nandroidx/compose/material3/AppBarOverflowStateImpl\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n*L\n1#1,403:1\n78#2:404\n111#2,2:405\n78#2:407\n111#2,2:408\n*S KotlinDebug\n*F\n+ 1 AppBarDsl.kt\nandroidx/compose/material3/AppBarOverflowStateImpl\n*L\n270#1:404\n270#1:405,2\n271#1:407\n271#1:408,2\n*E\n"})
final class t1 implements q1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f33053c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.saveable.c0<t1, ?> f33054d = androidx.compose.runtime.saveable.f0.e(new Function2() { // from class: androidx.compose.material3.r1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return t1.g((androidx.compose.runtime.saveable.g0) obj, (t1) obj2);
        }
    }, new Function1() { // from class: androidx.compose.material3.s1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return t1.h((List) obj);
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.l3 f33055a = androidx.compose.runtime.e6.b(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.l3 f33056b = androidx.compose.runtime.e6.b(0);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final androidx.compose.runtime.saveable.c0<t1, ?> a() {
            return t1.f33054d;
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List g(androidx.compose.runtime.saveable.g0 g0Var, t1 t1Var) {
        return CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(t1Var.a()), Integer.valueOf(t1Var.d())});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t1 h(List list) {
        t1 t1Var = new t1();
        t1Var.c(((Number) list.get(0)).intValue());
        t1Var.b(((Number) list.get(1)).intValue());
        return t1Var;
    }

    @Override // androidx.compose.material3.q1
    public int a() {
        return this.f33055a.m1();
    }

    @Override // androidx.compose.material3.q1
    public void b(int i10) {
        this.f33056b.j(i10);
    }

    @Override // androidx.compose.material3.q1
    public void c(int i10) {
        this.f33055a.j(i10);
    }

    @Override // androidx.compose.material3.q1
    public int d() {
        return this.f33056b.m1();
    }
}
