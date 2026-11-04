package androidx.compose.material3;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nInteractiveComponentSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InteractiveComponentSize.kt\nandroidx/compose/material3/InteractiveComponentSizeKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,200:1\n113#2:201\n*S KotlinDebug\n*F\n+ 1 InteractiveComponentSize.kt\nandroidx/compose/material3/InteractiveComponentSizeKt\n*L\n198#1:201\n*E\n"})
public final class wi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.ui.layout.s f34247a = new androidx.compose.ui.layout.s(b.f34252a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.ui.layout.h3 f34248b = new androidx.compose.ui.layout.h3(a.f34251a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.m4<Boolean> f34249c = androidx.compose.runtime.a1.m(new Function0() { // from class: androidx.compose.material3.ui
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(wi.c());
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.m4<androidx.compose.ui.unit.h> f34250d = androidx.compose.runtime.a1.m(new Function0() { // from class: androidx.compose.material3.vi
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return wi.d();
        }
    });

    /* synthetic */ class a extends kotlin.jvm.internal.g0 implements Function2<Integer, Integer, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f34251a = new a();

        a() {
            super(2, kotlin.math.b.class, "min", "min(II)I", 1);
        }

        public final Integer X(int i10, int i11) {
            return Integer.valueOf(Math.min(i10, i11));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, Integer num2) {
            return X(num.intValue(), num2.intValue());
        }
    }

    /* synthetic */ class b extends kotlin.jvm.internal.g0 implements Function2<Integer, Integer, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f34252a = new b();

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b() {
            super(2, kotlin.math.b.class, "min", "min(II)I", 1);
            int i10 = 2 >> 1;
        }

        public final Integer X(int i10, int i11) {
            return Integer.valueOf(Math.min(i10, i11));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, Integer num2) {
            return X(num.intValue(), num2.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.unit.h d() {
        return androidx.compose.ui.unit.h.o(androidx.compose.ui.unit.h.r(48));
    }

    @NotNull
    public static final androidx.compose.runtime.m4<Boolean> e() {
        return f34249c;
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "Use LocalMinimumInteractiveComponentSize with 0.dp to turn off enforcement instead.", replaceWith = @kotlin.b1(expression = "LocalMinimumInteractiveComponentSize", imports = {}))
    @af
    public static /* synthetic */ void f() {
    }

    @NotNull
    public static final androidx.compose.runtime.m4<androidx.compose.ui.unit.h> g() {
        return f34250d;
    }

    @NotNull
    public static final androidx.compose.ui.layout.h3 h() {
        return f34248b;
    }

    @NotNull
    public static final androidx.compose.ui.layout.s i() {
        return f34247a;
    }

    @androidx.compose.runtime.k7
    @NotNull
    public static final androidx.compose.ui.a0 j(@NotNull androidx.compose.ui.a0 a0Var) {
        return a0Var.B2(MinimumInteractiveModifier.f25913c);
    }
}
