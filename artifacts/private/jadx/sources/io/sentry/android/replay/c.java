package io.sentry.android.replay;

import androidx.compose.runtime.internal.w0;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 0)
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f304706d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final File f304707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f304708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f304709c;

    public c(@NotNull File video, int i10, long j10) {
        Intrinsics.checkNotNullParameter(video, "video");
        this.f304707a = video;
        this.f304708b = i10;
        this.f304709c = j10;
    }

    public static /* synthetic */ c e(c cVar, File file, int i10, long j10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            file = cVar.f304707a;
        }
        if ((i11 & 2) != 0) {
            i10 = cVar.f304708b;
        }
        if ((i11 & 4) != 0) {
            j10 = cVar.f304709c;
        }
        return cVar.d(file, i10, j10);
    }

    @NotNull
    public final File a() {
        return this.f304707a;
    }

    public final int b() {
        return this.f304708b;
    }

    public final long c() {
        return this.f304709c;
    }

    @NotNull
    public final c d(@NotNull File video, int i10, long j10) {
        Intrinsics.checkNotNullParameter(video, "video");
        return new c(video, i10, j10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f304707a, cVar.f304707a) && this.f304708b == cVar.f304708b && this.f304709c == cVar.f304709c;
    }

    public final long f() {
        return this.f304709c;
    }

    public final int g() {
        return this.f304708b;
    }

    @NotNull
    public final File h() {
        return this.f304707a;
    }

    public int hashCode() {
        return (((this.f304707a.hashCode() * 31) + Integer.hashCode(this.f304708b)) * 31) + Long.hashCode(this.f304709c);
    }

    @NotNull
    public String toString() {
        return "GeneratedVideo(video=" + this.f304707a + ", frameCount=" + this.f304708b + ", duration=" + this.f304709c + ')';
    }
}
