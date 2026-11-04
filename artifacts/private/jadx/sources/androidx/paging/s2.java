package androidx.paging;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@a0
public abstract class s2<Key, Value> {

    public enum a {
        LAUNCH_INITIAL_REFRESH,
        SKIP_INITIAL_REFRESH
    }

    public static abstract class b {

        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            private final Throwable f72573a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@NotNull Throwable throwable) {
                super(null);
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                this.f72573a = throwable;
            }

            @NotNull
            public final Throwable a() {
                return this.f72573a;
            }
        }

        /* JADX INFO: renamed from: androidx.paging.s2$b$b, reason: collision with other inner class name */
        public static final class C0680b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final boolean f72574a;

            public C0680b(boolean z10) {
                super(null);
                this.f72574a = z10;
            }

            @oj.i(name = "endOfPaginationReached")
            public final boolean a() {
                return this.f72574a;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    static /* synthetic */ <Key, Value> Object b(s2<Key, Value> s2Var, kotlin.coroutines.d<? super a> dVar) {
        return a.LAUNCH_INITIAL_REFRESH;
    }

    @Nullable
    public Object a(@NotNull kotlin.coroutines.d<? super a> dVar) {
        return b(this, dVar);
    }

    @Nullable
    public abstract Object c(@NotNull a1 a1Var, @NotNull j2<Key, Value> j2Var, @NotNull kotlin.coroutines.d<? super b> dVar);
}
