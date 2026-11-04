package androidx.core.os;

import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.annotation.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(api = 35)
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f48062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Bundle f48063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f48064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final CancellationSignal f48065d;

    public m0(int i10, @NotNull Bundle params, @Nullable String str, @Nullable CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f48062a = i10;
        this.f48063b = params;
        this.f48064c = str;
        this.f48065d = cancellationSignal;
    }

    @Nullable
    public final CancellationSignal a() {
        return this.f48065d;
    }

    @NotNull
    public final Bundle b() {
        return this.f48063b;
    }

    public final int c() {
        return this.f48062a;
    }

    @Nullable
    public final String d() {
        return this.f48064c;
    }
}
