package androidx.compose.ui.text;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nSavers.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.android.kt\nandroidx/compose/ui/text/Savers_androidKt\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,55:1\n93#2:56\n93#2:58\n93#2:60\n1#3:57\n1#3:59\n1#3:61\n*S KotlinDebug\n*F\n+ 1 Savers.android.kt\nandroidx/compose/ui/text/Savers_androidKt\n*L\n32#1:56\n33#1:58\n52#1:60\n32#1:57\n33#1:59\n52#1:61\n*E\n"})
public final class b3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.saveable.c0<x0, Object> f41467a = androidx.compose.runtime.saveable.f0.e(new Function2() { // from class: androidx.compose.ui.text.v2
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return b3.i((androidx.compose.runtime.saveable.g0) obj, (x0) obj2);
        }
    }, new Function1() { // from class: androidx.compose.ui.text.w2
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return b3.j(obj);
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.saveable.c0<androidx.compose.ui.text.style.f, Object> f41468b = androidx.compose.runtime.saveable.f0.e(new Function2() { // from class: androidx.compose.ui.text.x2
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return b3.g((androidx.compose.runtime.saveable.g0) obj, (androidx.compose.ui.text.style.f) obj2);
        }
    }, new Function1() { // from class: androidx.compose.ui.text.y2
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return b3.h(obj);
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.saveable.c0<androidx.compose.ui.text.style.u, Object> f41469c = androidx.compose.runtime.saveable.f0.e(new Function2() { // from class: androidx.compose.ui.text.z2
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return b3.k((androidx.compose.runtime.saveable.g0) obj, (androidx.compose.ui.text.style.u) obj2);
        }
    }, new Function1() { // from class: androidx.compose.ui.text.a3
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return b3.l(obj);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object g(androidx.compose.runtime.saveable.g0 g0Var, androidx.compose.ui.text.style.f fVar) {
        return Integer.valueOf(fVar.q());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.text.style.f h(Object obj) {
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
        return androidx.compose.ui.text.style.f.e(androidx.compose.ui.text.style.f.f(((Integer) obj).intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object i(androidx.compose.runtime.saveable.g0 g0Var, x0 x0Var) {
        return CollectionsKt.arrayListOf(u2.g1(Boolean.valueOf(x0Var.c())), u2.g1(u.d(x0Var.b())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0 j(Object obj) {
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        Boolean bool = obj2 != null ? (Boolean) obj2 : null;
        Intrinsics.checkNotNull(bool);
        boolean zBooleanValue = bool.booleanValue();
        Object obj3 = list.get(1);
        u uVar = obj3 != null ? (u) obj3 : null;
        Intrinsics.checkNotNull(uVar);
        return new x0(uVar.j(), zBooleanValue, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object k(androidx.compose.runtime.saveable.g0 g0Var, androidx.compose.ui.text.style.u uVar) {
        return CollectionsKt.arrayListOf(u2.g1(androidx.compose.ui.text.style.u.b.d(uVar.e())), u2.g1(Boolean.valueOf(uVar.f())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.text.style.u l(Object obj) {
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        androidx.compose.ui.text.style.u.b bVar = obj2 != null ? (androidx.compose.ui.text.style.u.b) obj2 : null;
        Intrinsics.checkNotNull(bVar);
        int iJ = bVar.j();
        Object obj3 = list.get(1);
        Boolean bool = obj3 != null ? (Boolean) obj3 : null;
        Intrinsics.checkNotNull(bool);
        return new androidx.compose.ui.text.style.u(iJ, bool.booleanValue(), null);
    }

    @NotNull
    public static final androidx.compose.runtime.saveable.c0<x0, Object> m(@NotNull x0.a aVar) {
        return f41467a;
    }

    @NotNull
    public static final androidx.compose.runtime.saveable.c0<androidx.compose.ui.text.style.f, Object> n(@NotNull androidx.compose.ui.text.style.f.a aVar) {
        return f41468b;
    }

    @NotNull
    public static final androidx.compose.runtime.saveable.c0<androidx.compose.ui.text.style.u, Object> o(@NotNull androidx.compose.ui.text.style.u.a aVar) {
        return f41469c;
    }
}
