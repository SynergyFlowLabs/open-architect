package androidx.compose.animation.core;

import androidx.compose.animation.core.w;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class z4<V extends w> implements y4<V> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f13407e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final y f13408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private V f13409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private V f13410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private V f13411d;

    public static final class a implements y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ z0 f13412a;

        a(z0 z0Var) {
            this.f13412a = z0Var;
        }

        @Override // androidx.compose.animation.core.y
        public z0 get(int i10) {
            return this.f13412a;
        }
    }

    public z4(@NotNull y yVar) {
        this.f13408a = yVar;
    }

    @Override // androidx.compose.animation.core.u4
    public long c(@NotNull V v10, @NotNull V v11, @NotNull V v12) {
        int iB = v10.b();
        long jMax = 0;
        for (int i10 = 0; i10 < iB; i10++) {
            jMax = Math.max(jMax, this.f13408a.get(i10).c(v10.a(i10), v11.a(i10), v12.a(i10)));
        }
        return jMax;
    }

    @Override // androidx.compose.animation.core.u4
    @NotNull
    public V e(@NotNull V v10, @NotNull V v11, @NotNull V v12) {
        if (this.f13411d == null) {
            this.f13411d = (V) x.g(v12);
        }
        V v13 = this.f13411d;
        if (v13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("endVelocityVector");
            v13 = null;
        }
        int iB = v13.b();
        for (int i10 = 0; i10 < iB; i10++) {
            V v14 = this.f13411d;
            if (v14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("endVelocityVector");
                v14 = null;
            }
            v14.e(i10, this.f13408a.get(i10).f(v10.a(i10), v11.a(i10), v12.a(i10)));
        }
        V v15 = this.f13411d;
        if (v15 != null) {
            return v15;
        }
        Intrinsics.throwUninitializedPropertyAccessException("endVelocityVector");
        return null;
    }

    @Override // androidx.compose.animation.core.u4
    @NotNull
    public V g(long j10, @NotNull V v10, @NotNull V v11, @NotNull V v12) {
        if (this.f13410c == null) {
            this.f13410c = (V) x.g(v12);
        }
        V v13 = this.f13410c;
        if (v13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
            v13 = null;
        }
        int iB = v13.b();
        for (int i10 = 0; i10 < iB; i10++) {
            V v14 = this.f13410c;
            if (v14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
                v14 = null;
            }
            v14.e(i10, this.f13408a.get(i10).b(j10, v10.a(i10), v11.a(i10), v12.a(i10)));
        }
        V v15 = this.f13410c;
        if (v15 != null) {
            return v15;
        }
        Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
        return null;
    }

    @Override // androidx.compose.animation.core.u4
    @NotNull
    public V i(long j10, @NotNull V v10, @NotNull V v11, @NotNull V v12) {
        if (this.f13409b == null) {
            this.f13409b = (V) x.g(v10);
        }
        V v13 = this.f13409b;
        if (v13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("valueVector");
            v13 = null;
        }
        int iB = v13.b();
        for (int i10 = 0; i10 < iB; i10++) {
            V v14 = this.f13409b;
            if (v14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("valueVector");
                v14 = null;
            }
            v14.e(i10, this.f13408a.get(i10).g(j10, v10.a(i10), v11.a(i10), v12.a(i10)));
        }
        V v15 = this.f13409b;
        if (v15 != null) {
            return v15;
        }
        Intrinsics.throwUninitializedPropertyAccessException("valueVector");
        return null;
    }

    public z4(@NotNull z0 z0Var) {
        this(new a(z0Var));
    }
}
