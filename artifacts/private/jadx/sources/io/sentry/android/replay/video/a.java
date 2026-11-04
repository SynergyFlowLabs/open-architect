package io.sentry.android.replay.video;

import androidx.compose.runtime.internal.w0;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 0)
@e.b(24)
public final class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f305041g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final File f305042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f305043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f305044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f305045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f305046e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final String f305047f;

    public a(@NotNull File file, int i10, int i11, int i12, int i13, @NotNull String mimeType) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        this.f305042a = file;
        this.f305043b = i10;
        this.f305044c = i11;
        this.f305045d = i12;
        this.f305046e = i13;
        this.f305047f = mimeType;
    }

    public static /* synthetic */ a h(a aVar, File file, int i10, int i11, int i12, int i13, String str, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            file = aVar.f305042a;
        }
        if ((i14 & 2) != 0) {
            i10 = aVar.f305043b;
        }
        if ((i14 & 4) != 0) {
            i11 = aVar.f305044c;
        }
        if ((i14 & 8) != 0) {
            i12 = aVar.f305045d;
        }
        if ((i14 & 16) != 0) {
            i13 = aVar.f305046e;
        }
        if ((i14 & 32) != 0) {
            str = aVar.f305047f;
        }
        int i15 = i13;
        String str2 = str;
        return aVar.g(file, i10, i11, i12, i15, str2);
    }

    @NotNull
    public final File a() {
        return this.f305042a;
    }

    public final int b() {
        return this.f305043b;
    }

    public final int c() {
        return this.f305044c;
    }

    public final int d() {
        return this.f305045d;
    }

    public final int e() {
        return this.f305046e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f305042a, aVar.f305042a) && this.f305043b == aVar.f305043b && this.f305044c == aVar.f305044c && this.f305045d == aVar.f305045d && this.f305046e == aVar.f305046e && Intrinsics.areEqual(this.f305047f, aVar.f305047f);
    }

    @NotNull
    public final String f() {
        return this.f305047f;
    }

    @NotNull
    public final a g(@NotNull File file, int i10, int i11, int i12, int i13, @NotNull String mimeType) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        return new a(file, i10, i11, i12, i13, mimeType);
    }

    public int hashCode() {
        return (((((((((this.f305042a.hashCode() * 31) + Integer.hashCode(this.f305043b)) * 31) + Integer.hashCode(this.f305044c)) * 31) + Integer.hashCode(this.f305045d)) * 31) + Integer.hashCode(this.f305046e)) * 31) + this.f305047f.hashCode();
    }

    public final int i() {
        return this.f305046e;
    }

    @NotNull
    public final File j() {
        return this.f305042a;
    }

    public final int k() {
        return this.f305045d;
    }

    @NotNull
    public final String l() {
        return this.f305047f;
    }

    public final int m() {
        return this.f305044c;
    }

    public final int n() {
        return this.f305043b;
    }

    public final void o(int i10) {
        this.f305044c = i10;
    }

    public final void p(int i10) {
        this.f305043b = i10;
    }

    @NotNull
    public String toString() {
        return "MuxerConfig(file=" + this.f305042a + ", recordingWidth=" + this.f305043b + ", recordingHeight=" + this.f305044c + ", frameRate=" + this.f305045d + ", bitRate=" + this.f305046e + ", mimeType=" + this.f305047f + ')';
    }

    public /* synthetic */ a(File file, int i10, int i11, int i12, int i13, String str, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, i10, i11, i12, i13, (i14 & 32) != 0 ? "video/avc" : str);
    }
}
