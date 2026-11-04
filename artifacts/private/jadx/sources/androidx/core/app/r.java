package androidx.core.app;

import android.content.res.Configuration;
import androidx.annotation.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f47160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @w0(26)
    @Nullable
    private Configuration f47161b;

    public r(boolean z10) {
        this.f47160a = z10;
    }

    @w0(26)
    @NotNull
    public final Configuration a() {
        Configuration configuration = this.f47161b;
        if (configuration != null) {
            return configuration;
        }
        throw new IllegalStateException("MultiWindowModeChangedInfo must be constructed with the constructor that takes a Configuration to access the newConfig. Are you running on an API 26 or higher device that makes this information available?");
    }

    public final boolean b() {
        return this.f47160a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w0(26)
    public r(boolean z10, @NotNull Configuration newConfig) {
        this(z10);
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        this.f47161b = newConfig;
    }
}
