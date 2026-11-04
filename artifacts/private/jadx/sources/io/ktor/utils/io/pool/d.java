package io.ktor.utils.io.pool;

import com.google.common.util.concurrent.x2;
import com.rabbitmq.client.k0;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nDefaultPool.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultPool.kt\nio/ktor/utils/io/pool/DefaultPool\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,111:1\n1#2:112\n*E\n"})
public abstract class d<T> implements h<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f297128f = AtomicLongFieldUpdater.newUpdater(d.class, "top");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f297129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f297130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f297131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final AtomicReferenceArray<T> f297132d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final int[] f297133e;

    @NotNull
    private volatile /* synthetic */ long top;

    public d(int i10) {
        this.f297129a = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException(("capacity should be positive but it is " + i10).toString());
        }
        if (i10 > 536870911) {
            throw new IllegalArgumentException(("capacity should be less or equal to 536870911 but it is " + i10).toString());
        }
        this.top = 0L;
        int iHighestOneBit = Integer.highestOneBit((i10 * 4) - 1) * 2;
        this.f297130b = iHighestOneBit;
        this.f297131c = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
        this.f297132d = new AtomicReferenceArray<>(iHighestOneBit + 1);
        this.f297133e = new int[iHighestOneBit + 1];
    }

    private final int c() {
        while (true) {
            long j10 = this.top;
            if (j10 == 0) {
                return 0;
            }
            long j11 = ((j10 >> 32) & k0.f265952a) + 1;
            int i10 = (int) (k0.f265952a & j10);
            if (i10 == 0) {
                return 0;
            }
            d<T> dVar = this;
            if (f297128f.compareAndSet(dVar, j10, (j11 << 32) | ((long) this.f297133e[i10]))) {
                return i10;
            }
            this = dVar;
        }
    }

    private final void e(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("index should be positive");
        }
        while (true) {
            long j10 = this.top;
            long j11 = ((j10 >> 32) & k0.f265952a) + 1;
            this.f297133e[i10] = (int) (k0.f265952a & j10);
            d<T> dVar = this;
            if (f297128f.compareAndSet(dVar, j10, (j11 << 32) | ((long) i10))) {
                return;
            } else {
                this = dVar;
            }
        }
    }

    private final T f() {
        int iC = c();
        if (iC == 0) {
            return null;
        }
        return this.f297132d.getAndSet(iC, null);
    }

    private final boolean g(T t10) {
        int iIdentityHashCode = ((System.identityHashCode(t10) * (-1640531527)) >>> this.f297131c) + 1;
        for (int i10 = 0; i10 < 8; i10++) {
            if (x2.a(this.f297132d, iIdentityHashCode, null, t10)) {
                e(iIdentityHashCode);
                return true;
            }
            iIdentityHashCode--;
            if (iIdentityHashCode == 0) {
                iIdentityHashCode = this.f297130b;
            }
        }
        return false;
    }

    @Override // io.ktor.utils.io.pool.h
    public final int He() {
        return this.f297129a;
    }

    @Override // io.ktor.utils.io.pool.h
    @NotNull
    public final T Jc() {
        T tA;
        T tF = f();
        if (tF != null && (tA = a(tF)) != null) {
            return tA;
        }
        return d();
    }

    @NotNull
    protected T a(@NotNull T instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        return instance;
    }

    protected void b(@NotNull T instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
    }

    @Override // io.ktor.utils.io.pool.h, java.lang.AutoCloseable
    public void close() {
        h.a.a(this);
    }

    @NotNull
    protected abstract T d();

    @Override // io.ktor.utils.io.pool.h
    public final void dispose() {
        while (true) {
            T tF = f();
            if (tF == null) {
                return;
            } else {
                b(tF);
            }
        }
    }

    protected void h(@NotNull T instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
    }

    @Override // io.ktor.utils.io.pool.h
    public final void h8(@NotNull T instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        h(instance);
        if (g(instance)) {
            return;
        }
        b(instance);
    }
}
