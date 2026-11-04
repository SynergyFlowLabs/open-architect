package io.intercom.android.sdk.models;

import androidx.compose.runtime.internal.w0;
import com.google.gson.annotations.c;
import kotlin.jvm.internal.Intrinsics;
import net.openid.appauth.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public final class AblyAuthResponse {
    public static final int $stable = 0;

    @c(x.f333313b)
    @NotNull
    private final String token;

    public AblyAuthResponse(@NotNull String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.token = token;
    }

    public static /* synthetic */ AblyAuthResponse copy$default(AblyAuthResponse ablyAuthResponse, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = ablyAuthResponse.token;
        }
        return ablyAuthResponse.copy(str);
    }

    @NotNull
    public final String component1() {
        return this.token;
    }

    @NotNull
    public final AblyAuthResponse copy(@NotNull String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        return new AblyAuthResponse(token);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AblyAuthResponse) && Intrinsics.areEqual(this.token, ((AblyAuthResponse) obj).token);
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return this.token.hashCode();
    }

    @NotNull
    public String toString() {
        return "AblyAuthResponse(token=" + this.token + ')';
    }
}
