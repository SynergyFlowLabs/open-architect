package androidx.compose.runtime;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
final class m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f36255a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void d(Object obj) {
            c5.D.i(obj);
        }

        private final Object e(Object obj) {
            return c5.D.k();
        }

        @lm.n
        @oj.i(name = "clearErrors")
        public final void a() {
            c5.D.d();
        }

        @lm.n
        @oj.i(name = "getCurrentErrors")
        @NotNull
        public final List<f5> b() {
            return c5.D.f();
        }

        @lm.n
        @oj.i(name = "invalidateGroupsWithKey")
        public final void c(int i10) {
            c5.D.h(i10);
        }

        @lm.n
        public final void f(@NotNull Object obj) {
            d(e(obj));
        }

        private a() {
        }
    }
}
