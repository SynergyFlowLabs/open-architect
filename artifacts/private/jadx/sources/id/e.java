package id;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.modules.user.auth.SocialAuthType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@w0(parameters = 1)
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f287103c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final SocialAuthType f287104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f287105b;

    public e(@NotNull SocialAuthType service, @Nullable String str) {
        Intrinsics.checkNotNullParameter(service, "service");
        this.f287104a = service;
        this.f287105b = str;
    }

    public static /* synthetic */ e d(e eVar, SocialAuthType socialAuthType, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            socialAuthType = eVar.f287104a;
        }
        if ((i10 & 2) != 0) {
            str = eVar.f287105b;
        }
        return eVar.c(socialAuthType, str);
    }

    @NotNull
    public final SocialAuthType a() {
        return this.f287104a;
    }

    @Nullable
    public final String b() {
        return this.f287105b;
    }

    @NotNull
    public final e c(@NotNull SocialAuthType service, @Nullable String str) {
        Intrinsics.checkNotNullParameter(service, "service");
        return new e(service, str);
    }

    @Nullable
    public final String e() {
        return this.f287105b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f287104a == eVar.f287104a && Intrinsics.areEqual(this.f287105b, eVar.f287105b);
    }

    @NotNull
    public final SocialAuthType f() {
        return this.f287104a;
    }

    public int hashCode() {
        int iHashCode = this.f287104a.hashCode() * 31;
        String str = this.f287105b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "UserSocialConnection(service=" + this.f287104a + ", id=" + this.f287105b + ")";
    }
}
