package com.planner5d.library.activity.fragment.startup;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.services.utility.v2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f136455c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f136456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final v2 f136457b;

    public c(@NotNull Function0<Unit> permissionRequester) {
        Intrinsics.checkNotNullParameter(permissionRequester, "permissionRequester");
        this.f136456a = permissionRequester;
        this.f136457b = new v2();
    }

    @Nullable
    public final Object a(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        this.f136456a.invoke();
        Object objA = this.f136457b.a(dVar);
        return objA == kotlin.coroutines.intrinsics.b.l() ? objA : Unit.f312394a;
    }

    public final void b() {
        this.f136457b.b();
    }
}
