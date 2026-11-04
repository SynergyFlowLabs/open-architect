package androidx.datastore.core;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class z<T> {

    public static final class a<T> extends z<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final p0<T> f49817a;

        public a(@Nullable p0<T> p0Var) {
            super(null);
            this.f49817a = p0Var;
        }

        @Override // androidx.datastore.core.z
        @Nullable
        public p0<T> a() {
            return this.f49817a;
        }
    }

    public static final class b<T> extends z<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Function2<T, kotlin.coroutines.d<? super T>, Object> f49818a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final kotlinx.coroutines.x<T> f49819b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private final p0<T> f49820c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final CoroutineContext f49821d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(@NotNull Function2<? super T, ? super kotlin.coroutines.d<? super T>, ? extends Object> transform, @NotNull kotlinx.coroutines.x<T> ack, @Nullable p0<T> p0Var, @NotNull CoroutineContext callerContext) {
            super(null);
            Intrinsics.checkNotNullParameter(transform, "transform");
            Intrinsics.checkNotNullParameter(ack, "ack");
            Intrinsics.checkNotNullParameter(callerContext, "callerContext");
            this.f49818a = transform;
            this.f49819b = ack;
            this.f49820c = p0Var;
            this.f49821d = callerContext;
        }

        @Override // androidx.datastore.core.z
        @Nullable
        public p0<T> a() {
            return this.f49820c;
        }

        @NotNull
        public final kotlinx.coroutines.x<T> b() {
            return this.f49819b;
        }

        @NotNull
        public final CoroutineContext c() {
            return this.f49821d;
        }

        @NotNull
        public final Function2<T, kotlin.coroutines.d<? super T>, Object> d() {
            return this.f49818a;
        }
    }

    public /* synthetic */ z(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Nullable
    public abstract p0<T> a();

    private z() {
    }
}
