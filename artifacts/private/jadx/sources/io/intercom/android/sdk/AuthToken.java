package io.intercom.android.sdk;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class AuthToken {
    public static final int $stable = 8;

    @NotNull
    private String name;

    @NotNull
    private String token;

    public AuthToken(@NotNull String name, @NotNull String token) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(token, "token");
        this.name = name;
        this.token = token;
    }

    public static /* synthetic */ AuthToken copy$default(AuthToken authToken, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = authToken.name;
        }
        if ((i10 & 2) != 0) {
            str2 = authToken.token;
        }
        return authToken.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.name;
    }

    @NotNull
    public final String component2() {
        return this.token;
    }

    @NotNull
    public final AuthToken copy(@NotNull String name, @NotNull String token) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(token, "token");
        return new AuthToken(name, token);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthToken)) {
            return false;
        }
        AuthToken authToken = (AuthToken) obj;
        return Intrinsics.areEqual(this.name, authToken.name) && Intrinsics.areEqual(this.token, authToken.token);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.token.hashCode();
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.token = str;
    }

    @NotNull
    public String toString() {
        return "AuthToken(name=" + this.name + ", token=" + this.token + ')';
    }
}
