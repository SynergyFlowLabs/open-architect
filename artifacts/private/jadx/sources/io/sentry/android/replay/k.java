package io.sentry.android.replay;

import androidx.compose.runtime.internal.w0;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 0)
public final class k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f304948d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final File f304949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f304950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f304951c;

    public k(@NotNull File screenshot, long j10, @Nullable String str) {
        Intrinsics.checkNotNullParameter(screenshot, "screenshot");
        this.f304949a = screenshot;
        this.f304950b = j10;
        this.f304951c = str;
    }

    public static /* synthetic */ k e(k kVar, File file, long j10, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            file = kVar.f304949a;
        }
        if ((i10 & 2) != 0) {
            j10 = kVar.f304950b;
        }
        if ((i10 & 4) != 0) {
            str = kVar.f304951c;
        }
        return kVar.d(file, j10, str);
    }

    @NotNull
    public final File a() {
        return this.f304949a;
    }

    public final long b() {
        return this.f304950b;
    }

    @Nullable
    public final String c() {
        return this.f304951c;
    }

    @NotNull
    public final k d(@NotNull File screenshot, long j10, @Nullable String str) {
        Intrinsics.checkNotNullParameter(screenshot, "screenshot");
        return new k(screenshot, j10, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.areEqual(this.f304949a, kVar.f304949a) && this.f304950b == kVar.f304950b && Intrinsics.areEqual(this.f304951c, kVar.f304951c);
    }

    @Nullable
    public final String f() {
        return this.f304951c;
    }

    @NotNull
    public final File g() {
        return this.f304949a;
    }

    public final long h() {
        return this.f304950b;
    }

    public int hashCode() {
        int iHashCode = ((this.f304949a.hashCode() * 31) + Long.hashCode(this.f304950b)) * 31;
        String str = this.f304951c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "ReplayFrame(screenshot=" + this.f304949a + ", timestamp=" + this.f304950b + ", screen=" + this.f304951c + ')';
    }

    public /* synthetic */ k(File file, long j10, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, j10, (i10 & 4) != 0 ? null : str);
    }
}
