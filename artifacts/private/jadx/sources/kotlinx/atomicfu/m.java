package kotlinx.atomicfu;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public class m {

    public static final class a extends m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f313514a = new a();

        private a() {
        }
    }

    @kotlin.internal.f
    private final void e(Function0<? extends Object> event) {
        Intrinsics.checkNotNullParameter(event, "event");
        a(event.invoke());
    }

    public void a(@NotNull Object event) {
        Intrinsics.checkNotNullParameter(event, "event");
    }

    public void b(@NotNull Object event1, @NotNull Object event2) {
        Intrinsics.checkNotNullParameter(event1, "event1");
        Intrinsics.checkNotNullParameter(event2, "event2");
    }

    public void c(@NotNull Object event1, @NotNull Object event2, @NotNull Object event3) {
        Intrinsics.checkNotNullParameter(event1, "event1");
        Intrinsics.checkNotNullParameter(event2, "event2");
        Intrinsics.checkNotNullParameter(event3, "event3");
    }

    public void d(@NotNull Object event1, @NotNull Object event2, @NotNull Object event3, @NotNull Object event4) {
        Intrinsics.checkNotNullParameter(event1, "event1");
        Intrinsics.checkNotNullParameter(event2, "event2");
        Intrinsics.checkNotNullParameter(event3, "event3");
        Intrinsics.checkNotNullParameter(event4, "event4");
    }
}
