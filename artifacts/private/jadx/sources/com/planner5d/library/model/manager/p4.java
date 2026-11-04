package com.planner5d.library.model.manager;

import android.content.Context;
import com.planner5d.library.model.SupportRequest;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@ij.f
public final class p4 implements q4 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f192248f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.r f192249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.d f192250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.t0 f192251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final n1 f192252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final v4 f192253e;

    @ij.a
    public p4(@NotNull com.planner5d.library.model.manager.config.r supportUrlProvider, @NotNull com.planner5d.library.application.d applicationConfiguration, @NotNull com.planner5d.library.modules.user.user.t0 userPurchases, @NotNull n1 languageManager, @NotNull v4 supportRepository) {
        Intrinsics.checkNotNullParameter(supportUrlProvider, "supportUrlProvider");
        Intrinsics.checkNotNullParameter(applicationConfiguration, "applicationConfiguration");
        Intrinsics.checkNotNullParameter(userPurchases, "userPurchases");
        Intrinsics.checkNotNullParameter(languageManager, "languageManager");
        Intrinsics.checkNotNullParameter(supportRepository, "supportRepository");
        this.f192249a = supportUrlProvider;
        this.f192250b = applicationConfiguration;
        this.f192251c = userPurchases;
        this.f192252d = languageManager;
        this.f192253e = supportRepository;
    }

    @Override // com.planner5d.library.model.manager.q4
    @NotNull
    public String a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String strA = this.f192252d.a(context);
        Intrinsics.checkNotNullExpressionValue(strA, "getLanguage(...)");
        return strA;
    }

    @Override // com.planner5d.library.model.manager.q4
    @NotNull
    public String b() {
        return com.planner5d.library.api.f.a().f142270h;
    }

    @Override // com.planner5d.library.model.manager.q4
    public boolean c() {
        return this.f192251c.c();
    }

    @Override // com.planner5d.library.model.manager.q4
    @Nullable
    public String d() {
        return this.f192249a.c();
    }

    @Override // com.planner5d.library.model.manager.q4
    public boolean e() {
        return this.f192250b.r();
    }

    @Override // com.planner5d.library.model.manager.q4
    @Nullable
    public String f(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f192249a.a();
    }

    @Override // com.planner5d.library.model.manager.q4
    @Nullable
    public Object g(@NotNull x4 x4Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        SupportRequest supportRequest = new SupportRequest();
        supportRequest.attachment = x4Var.f222394e;
        supportRequest.description = x4Var.f222391b;
        supportRequest.email = x4Var.f222392c;
        supportRequest.type = x4Var.f222393d;
        supportRequest.notes = x4Var.f222390a;
        this.f192253e.t(supportRequest);
        return Unit.f312394a;
    }

    @Override // com.planner5d.library.model.manager.q4
    public void h() {
        com.planner5d.library.model.manager.statistics.events.j1.f216988b.i0();
    }

    @Override // com.planner5d.library.model.manager.q4
    @NotNull
    public String i(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String error = ErrorMessageException.getError(context, new ErrorMessageException(qd.b.q.G9, new String[0]));
        Intrinsics.checkNotNullExpressionValue(error, "getError(...)");
        return error;
    }
}
