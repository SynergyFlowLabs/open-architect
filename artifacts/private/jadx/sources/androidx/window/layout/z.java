package androidx.window.layout;

import android.app.Activity;
import androidx.annotation.b1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f76457a = a.f76458a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f76458a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private static Function1<? super z, ? extends z> f76459b = C0772a.f76460a;

        /* JADX INFO: renamed from: androidx.window.layout.z$a$a, reason: collision with other inner class name */
        static final class C0772a extends l0 implements Function1<z, z> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0772a f76460a = new C0772a();

            C0772a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final z invoke(@NotNull z it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it;
            }
        }

        /* synthetic */ class b extends g0 implements Function1<z, z> {
            b(Object obj) {
                super(1, obj, b0.class, "decorate", "decorate(Landroidx/window/layout/WindowMetricsCalculator;)Landroidx/window/layout/WindowMetricsCalculator;", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final z invoke(@NotNull z p10) {
                Intrinsics.checkNotNullParameter(p10, "p0");
                return ((b0) this.receiver).a(p10);
            }
        }

        static final class c extends l0 implements Function1<z, z> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f76461a = new c();

            c() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final z invoke(@NotNull z it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it;
            }
        }

        private a() {
        }

        @oj.n
        @NotNull
        public final z a() {
            return f76459b.invoke(a0.f76376b);
        }

        @androidx.window.core.d
        @oj.n
        @b1({b1.a.TESTS})
        public final void b(@NotNull b0 overridingDecorator) {
            Intrinsics.checkNotNullParameter(overridingDecorator, "overridingDecorator");
            f76459b = new b(overridingDecorator);
        }

        @androidx.window.core.d
        @oj.n
        @b1({b1.a.TESTS})
        public final void c() {
            f76459b = c.f76461a;
        }
    }

    @oj.n
    @NotNull
    static z a() {
        return f76457a.a();
    }

    @androidx.window.core.d
    @oj.n
    @b1({b1.a.TESTS})
    static void b(@NotNull b0 b0Var) {
        f76457a.b(b0Var);
    }

    @androidx.window.core.d
    @oj.n
    @b1({b1.a.TESTS})
    static void reset() {
        f76457a.c();
    }

    @NotNull
    y c(@NotNull Activity activity);

    @NotNull
    y d(@NotNull Activity activity);
}
