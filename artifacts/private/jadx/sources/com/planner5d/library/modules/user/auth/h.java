package com.planner5d.library.modules.user.auth;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.w0;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.v;
import com.google.android.gms.common.api.y;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.j1;
import kotlinx.coroutines.channels.n0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSocialAuthGooglePlus.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SocialAuthGooglePlus.kt\ncom/planner5d/library/modules/user/auth/SocialAuthGooglePlus\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n1#2:87\n*E\n"})
public final class h extends com.planner5d.library.modules.user.auth.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f222879g = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Context f222880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final SocialAuthType f222881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.channels.p<Result<k>> f222882e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final com.google.android.gms.common.api.l f222883f;

    public static final class a extends y<Status, v> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f222885b;

        a(Activity activity) {
            this.f222885b = activity;
        }

        @Override // com.google.android.gms.common.api.y
        public Status b(Status status) {
            Intrinsics.checkNotNullParameter(status, "status");
            kotlinx.coroutines.channels.p pVar = h.this.f222882e;
            Result.a aVar = Result.Companion;
            pVar.p(Result.a(Result.m785constructorimpl(ResultKt.createFailure(new b()))));
            return status;
        }

        @Override // com.google.android.gms.common.api.y
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public com.google.android.gms.common.api.p<v> c(Status status) {
            Intrinsics.checkNotNullParameter(status, "status");
            this.f222885b.startActivityForResult(com.google.android.gms.auth.api.a.f105079d.b(h.this.f222883f), 2);
            return null;
        }
    }

    public h(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f222880c = context;
        this.f222881d = SocialAuthType.Google;
        this.f222882e = kotlinx.coroutines.channels.s.d(Integer.MAX_VALUE, null, null, 6, null);
        com.google.android.gms.common.api.l lVarH = new com.google.android.gms.common.api.l.a(context).b(com.google.android.gms.auth.api.a.f105077b, new GoogleSignInOptions.a(GoogleSignInOptions.f105616l).g(new Scope("email"), new Scope("profile")).e(context.getString(com.planner5d.library.f.s.f169156hd)).d().c().f().b()).h();
        lVarH.g();
        Intrinsics.checkNotNullExpressionValue(lVarH, "apply(...)");
        this.f222883f = lVarH;
    }

    private static Object k(h hVar) {
        return j1.t(new c1(hVar, h.class, "loginResultInternal", "getLoginResultInternal()Lkotlinx/coroutines/channels/Channel;", 0));
    }

    @Override // com.planner5d.library.modules.user.auth.l
    public void a() {
        try {
            com.google.android.gms.auth.api.a.f105079d.e(this.f222883f);
        } catch (IllegalStateException e10) {
            timber.log.b.f381052a.e(e10);
        }
    }

    @Override // com.planner5d.library.modules.user.auth.l
    public boolean b() {
        return com.google.android.gms.auth.api.signin.a.e(this.f222880c) != null;
    }

    @Override // com.planner5d.library.modules.user.auth.l
    @NotNull
    public SocialAuthType c() {
        return this.f222881d;
    }

    @Override // com.planner5d.library.modules.user.auth.l
    @NotNull
    public n0<Result<k>> d() {
        return this.f222882e;
    }

    @Override // com.planner5d.library.modules.user.auth.l
    public void e(int i10, int i11, @Nullable Intent intent) {
        Object objM785constructorimpl;
        GoogleSignInAccount googleSignInAccountA;
        GoogleSignInAccount googleSignInAccount = null;
        com.google.android.gms.auth.api.signin.e eVarC = (i10 != 2 || intent == null) ? null : com.google.android.gms.auth.api.a.f105079d.c(intent);
        if (eVarC == null) {
            return;
        }
        if (!eVarC.b()) {
            eVarC = null;
        }
        if (eVarC != null && (googleSignInAccountA = eVarC.a()) != null && googleSignInAccountA.s2() != null) {
            googleSignInAccount = googleSignInAccountA;
        }
        kotlinx.coroutines.channels.p<Result<k>> pVar = this.f222882e;
        if (googleSignInAccount != null) {
            Result.a aVar = Result.Companion;
            objM785constructorimpl = Result.m785constructorimpl(new k(g(), googleSignInAccount.getId(), googleSignInAccount.s2(), googleSignInAccount.e2()));
        } else {
            Result.a aVar2 = Result.Companion;
            objM785constructorimpl = Result.m785constructorimpl(ResultKt.createFailure(new b()));
        }
        pVar.p(Result.a(objM785constructorimpl));
    }

    @Override // com.planner5d.library.modules.user.auth.a, com.planner5d.library.modules.user.auth.l
    public void f(@NotNull Activity activity, boolean z10) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        super.f(activity, z10);
        if (this.f222883f.u()) {
            this.f222883f.f().j(new a(activity));
            return;
        }
        kotlinx.coroutines.channels.p<Result<k>> pVar = this.f222882e;
        Result.a aVar = Result.Companion;
        pVar.p(Result.a(Result.m785constructorimpl(ResultKt.createFailure(new b()))));
    }
}
