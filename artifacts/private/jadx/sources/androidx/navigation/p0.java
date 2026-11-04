package androidx.navigation;

import android.content.Context;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nNavBackStackEntryState.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavBackStackEntryState.android.kt\nandroidx/navigation/NavBackStackEntryState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,65:1\n1#2:66\n*E\n"})
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.navigation.internal.g f71193a;

    public p0(@NotNull n0 entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.f71193a = new androidx.navigation.internal.g(entry, entry.f().D());
    }

    @Nullable
    public final Bundle a() {
        return this.f71193a.a();
    }

    public final int b() {
        return this.f71193a.b();
    }

    @NotNull
    public final String c() {
        return this.f71193a.c();
    }

    @NotNull
    public final Bundle d() {
        return this.f71193a.d();
    }

    @NotNull
    public final n0 e(@NotNull androidx.navigation.internal.h context, @NotNull y1 destination, @NotNull androidx.lifecycle.c0.b hostLifecycleState, @Nullable c1 c1Var) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(hostLifecycleState, "hostLifecycleState");
        Bundle bundleA = a();
        return this.f71193a.e(context, destination, bundleA != null ? f(bundleA, context) : null, hostLifecycleState, c1Var);
    }

    @Nullable
    public final Bundle f(@NotNull Bundle args, @NotNull androidx.navigation.internal.h context) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(context, "context");
        Context contextB = context.b();
        args.setClassLoader(contextB != null ? contextB.getClassLoader() : null);
        return args;
    }

    @NotNull
    public final Bundle g() {
        return this.f71193a.f();
    }

    public p0(@NotNull Bundle state) {
        Intrinsics.checkNotNullParameter(state, "state");
        state.setClassLoader(p0.class.getClassLoader());
        this.f71193a = new androidx.navigation.internal.g(state);
    }
}
