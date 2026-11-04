package com.facebook.login;

import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final AccessToken f100445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final AuthenticationToken f100446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Set<String> f100447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Set<String> f100448d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public b0(@NotNull AccessToken accessToken, @NotNull Set<String> recentlyGrantedPermissions, @NotNull Set<String> recentlyDeniedPermissions) {
        this(accessToken, null, recentlyGrantedPermissions, recentlyDeniedPermissions, 2, null);
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(recentlyGrantedPermissions, "recentlyGrantedPermissions");
        Intrinsics.checkNotNullParameter(recentlyDeniedPermissions, "recentlyDeniedPermissions");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ b0 f(b0 b0Var, AccessToken accessToken, AuthenticationToken authenticationToken, Set set, Set set2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            accessToken = b0Var.f100445a;
        }
        if ((i10 & 2) != 0) {
            authenticationToken = b0Var.f100446b;
        }
        if ((i10 & 4) != 0) {
            set = b0Var.f100447c;
        }
        if ((i10 & 8) != 0) {
            set2 = b0Var.f100448d;
        }
        return b0Var.e(accessToken, authenticationToken, set, set2);
    }

    @NotNull
    public final AccessToken a() {
        return this.f100445a;
    }

    @Nullable
    public final AuthenticationToken b() {
        return this.f100446b;
    }

    @NotNull
    public final Set<String> c() {
        return this.f100447c;
    }

    @NotNull
    public final Set<String> d() {
        return this.f100448d;
    }

    @NotNull
    public final b0 e(@NotNull AccessToken accessToken, @Nullable AuthenticationToken authenticationToken, @NotNull Set<String> recentlyGrantedPermissions, @NotNull Set<String> recentlyDeniedPermissions) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(recentlyGrantedPermissions, "recentlyGrantedPermissions");
        Intrinsics.checkNotNullParameter(recentlyDeniedPermissions, "recentlyDeniedPermissions");
        return new b0(accessToken, authenticationToken, recentlyGrantedPermissions, recentlyDeniedPermissions);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return Intrinsics.areEqual(this.f100445a, b0Var.f100445a) && Intrinsics.areEqual(this.f100446b, b0Var.f100446b) && Intrinsics.areEqual(this.f100447c, b0Var.f100447c) && Intrinsics.areEqual(this.f100448d, b0Var.f100448d);
    }

    @NotNull
    public final AccessToken g() {
        return this.f100445a;
    }

    @Nullable
    public final AuthenticationToken h() {
        return this.f100446b;
    }

    public int hashCode() {
        int iHashCode = this.f100445a.hashCode() * 31;
        AuthenticationToken authenticationToken = this.f100446b;
        return ((((iHashCode + (authenticationToken == null ? 0 : authenticationToken.hashCode())) * 31) + this.f100447c.hashCode()) * 31) + this.f100448d.hashCode();
    }

    @NotNull
    public final Set<String> i() {
        return this.f100448d;
    }

    @NotNull
    public final Set<String> j() {
        return this.f100447c;
    }

    @NotNull
    public String toString() {
        return "LoginResult(accessToken=" + this.f100445a + ", authenticationToken=" + this.f100446b + ", recentlyGrantedPermissions=" + this.f100447c + ", recentlyDeniedPermissions=" + this.f100448d + ')';
    }

    @oj.j
    public b0(@NotNull AccessToken accessToken, @Nullable AuthenticationToken authenticationToken, @NotNull Set<String> recentlyGrantedPermissions, @NotNull Set<String> recentlyDeniedPermissions) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(recentlyGrantedPermissions, "recentlyGrantedPermissions");
        Intrinsics.checkNotNullParameter(recentlyDeniedPermissions, "recentlyDeniedPermissions");
        this.f100445a = accessToken;
        this.f100446b = authenticationToken;
        this.f100447c = recentlyGrantedPermissions;
        this.f100448d = recentlyDeniedPermissions;
    }

    public /* synthetic */ b0(AccessToken accessToken, AuthenticationToken authenticationToken, Set set, Set set2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(accessToken, (i10 & 2) != 0 ? null : authenticationToken, set, set2);
    }
}
