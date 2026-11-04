package io.ktor.client.content;

import io.ktor.http.content.w;
import io.ktor.http.m;
import io.ktor.http.m0;
import io.ktor.utils.io.h;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends w.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final File f294273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final m f294274c;

    public /* synthetic */ a(File file, m mVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i10 & 2) != 0 ? m0.a(m.f295981f, file) : mVar);
    }

    @Override // io.ktor.http.content.w
    @NotNull
    public Long a() {
        return Long.valueOf(this.f294273b.length());
    }

    @Override // io.ktor.http.content.w
    @NotNull
    public m b() {
        return this.f294274c;
    }

    @Override // io.ktor.http.content.w.e
    @NotNull
    public h h() {
        return io.ktor.util.cio.h.e(this.f294273b, 0L, 0L, null, 7, null);
    }

    @Override // io.ktor.http.content.w.e
    @NotNull
    public h i(@NotNull n range) {
        Intrinsics.checkNotNullParameter(range, "range");
        return io.ktor.util.cio.h.e(this.f294273b, range.l(), range.m(), null, 4, null);
    }

    @NotNull
    public final File j() {
        return this.f294273b;
    }

    public a(@NotNull File file, @NotNull m contentType) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        this.f294273b = file;
        this.f294274c = contentType;
    }
}
