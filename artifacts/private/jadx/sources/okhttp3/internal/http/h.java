package okhttp3.internal.http;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.g0;
import okhttp3.x;
import okio.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f334195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f334196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final n f334197c;

    public h(@Nullable String str, long j10, @NotNull n source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f334195a = str;
        this.f334196b = j10;
        this.f334197c = source;
    }

    @Override // okhttp3.g0
    public long contentLength() {
        return this.f334196b;
    }

    @Override // okhttp3.g0
    @Nullable
    public x contentType() {
        String str = this.f334195a;
        if (str != null) {
            return x.f334808e.d(str);
        }
        return null;
    }

    @Override // okhttp3.g0
    @NotNull
    public n source() {
        return this.f334197c;
    }
}
