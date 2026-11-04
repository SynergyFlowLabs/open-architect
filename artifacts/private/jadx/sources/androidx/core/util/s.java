package androidx.core.util;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class s {

    public interface a<T> {
        boolean a(@NotNull T t10);

        @Nullable
        T acquire();
    }

    @SourceDebugExtension({"SMAP\nPools.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pools.kt\nandroidx/core/util/Pools$SimplePool\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n1#2:134\n*E\n"})
    public static class b<T> implements a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Object[] f48439a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f48440b;

        public b(@androidx.annotation.g0(from = 1) int i10) {
            if (i10 <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.f48439a = new Object[i10];
        }

        private final boolean b(T t10) {
            int i10 = this.f48440b;
            for (int i11 = 0; i11 < i10; i11++) {
                if (this.f48439a[i11] == t10) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.core.util.s.a
        public boolean a(@NotNull T instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            if (b(instance)) {
                throw new IllegalStateException("Already in the pool!");
            }
            int i10 = this.f48440b;
            Object[] objArr = this.f48439a;
            if (i10 >= objArr.length) {
                return false;
            }
            objArr[i10] = instance;
            this.f48440b = i10 + 1;
            return true;
        }

        @Override // androidx.core.util.s.a
        @Nullable
        public T acquire() {
            int i10 = this.f48440b;
            if (i10 <= 0) {
                return null;
            }
            int i11 = i10 - 1;
            T t10 = (T) this.f48439a[i11];
            Intrinsics.checkNotNull(t10, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
            this.f48439a[i11] = null;
            this.f48440b--;
            return t10;
        }
    }

    public static class c<T> extends b<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final Object f48441c;

        public c(int i10) {
            super(i10);
            this.f48441c = new Object();
        }

        @Override // androidx.core.util.s.b, androidx.core.util.s.a
        public boolean a(@NotNull T instance) {
            boolean zA;
            Intrinsics.checkNotNullParameter(instance, "instance");
            synchronized (this.f48441c) {
                try {
                    zA = super.a(instance);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return zA;
        }

        @Override // androidx.core.util.s.b, androidx.core.util.s.a
        @Nullable
        public T acquire() {
            T t10;
            synchronized (this.f48441c) {
                try {
                    t10 = (T) super.acquire();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return t10;
        }
    }

    private s() {
    }
}
