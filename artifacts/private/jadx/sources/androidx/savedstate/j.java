package androidx.savedstate;

import android.os.Bundle;
import androidx.annotation.l0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.savedstate.internal.d f75156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private androidx.savedstate.b.C0748b f75157b;

    public interface a {
        void a(@NotNull m mVar);
    }

    public interface b {
        @NotNull
        Bundle a();
    }

    public j(@NotNull androidx.savedstate.internal.d impl) {
        Intrinsics.checkNotNullParameter(impl, "impl");
        this.f75156a = impl;
    }

    @l0
    @Nullable
    public final Bundle a(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f75156a.e(key);
    }

    @Nullable
    public final b b(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f75156a.g(key);
    }

    @l0
    public final boolean c() {
        return this.f75156a.i();
    }

    @l0
    public final void d(@NotNull String key, @NotNull b provider) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f75156a.n(key, provider);
    }

    @l0
    public final void e(@NotNull Class<? extends a> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        if (!this.f75156a.h()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        androidx.savedstate.b.C0748b c0748b = this.f75157b;
        if (c0748b == null) {
            c0748b = new androidx.savedstate.b.C0748b(this);
        }
        this.f75157b = c0748b;
        try {
            clazz.getDeclaredConstructor(null);
            androidx.savedstate.b.C0748b c0748b2 = this.f75157b;
            if (c0748b2 != null) {
                String name = clazz.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                c0748b2.b(name);
            }
        } catch (NoSuchMethodException e10) {
            throw new IllegalArgumentException("Class " + clazz.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
        }
    }

    @l0
    public final void f(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f75156a.p(key);
    }
}
