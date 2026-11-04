package com.planner5d.library.activity.fragment.startup;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.modules.user.user.m1;
import com.planner5d.library.services.utility.v2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f136536e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.j f136537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final m1 f136538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<kotlin.coroutines.d<? super Unit>, Object> f136539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final v2 f136540d;

    /* JADX WARN: Multi-variable type inference failed */
    public u(@NotNull com.planner5d.library.model.manager.config.j featureConfigManager, @NotNull m1 userStorage, @NotNull Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> showSignInDialog) {
        Intrinsics.checkNotNullParameter(featureConfigManager, "featureConfigManager");
        Intrinsics.checkNotNullParameter(userStorage, "userStorage");
        Intrinsics.checkNotNullParameter(showSignInDialog, "showSignInDialog");
        this.f136537a = featureConfigManager;
        this.f136538b = userStorage;
        this.f136539c = showSignInDialog;
        this.f136540d = new v2();
    }

    private final boolean a() {
        return this.f136538b.h() != null;
    }

    private final boolean d() {
        return this.f136537a.a(com.planner5d.library.model.manager.config.f.AuthenticationSocialGoogle) && this.f136538b.h() == null;
    }

    public final void b() {
        this.f136540d.b();
    }

    @Nullable
    public final Object c(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        if (!d() || a()) {
            return Unit.f312394a;
        }
        Object objInvoke = this.f136539c.invoke(dVar);
        return objInvoke == kotlin.coroutines.intrinsics.b.l() ? objInvoke : Unit.f312394a;
    }

    @Nullable
    public final Object e(@NotNull Function0<Boolean> function0, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        if (!d() || function0.invoke().booleanValue() || a()) {
            return Unit.f312394a;
        }
        Object objA = this.f136540d.a(dVar);
        return objA == kotlin.coroutines.intrinsics.b.l() ? objA : Unit.f312394a;
    }
}
