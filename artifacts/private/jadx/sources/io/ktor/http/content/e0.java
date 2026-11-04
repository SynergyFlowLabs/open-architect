package io.ktor.http.content;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import io.ktor.http.q0;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class e0 extends w.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final URI f295706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final io.ktor.http.m f295707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final Long f295708d;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ e0(URI uri, io.ktor.http.m mVar, Long l10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 2) != 0) {
            io.ktor.http.m.c cVar = io.ktor.http.m.f295981f;
            String path = uri.getPath();
            Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
            mVar = q0.f(cVar, path);
        }
        this(uri, mVar, (i10 & 4) != 0 ? null : l10);
    }

    @Override // io.ktor.http.content.w
    @Nullable
    public Long a() {
        return this.f295708d;
    }

    @Override // io.ktor.http.content.w
    @NotNull
    public io.ktor.http.m b() {
        return this.f295707c;
    }

    @Override // io.ktor.http.content.w.e
    @NotNull
    public io.ktor.utils.io.h h() throws IOException {
        InputStream inputStreamOpenStream = FirebasePerfUrlConnection.openStream(this.f295706b.toURL());
        Intrinsics.checkNotNullExpressionValue(inputStreamOpenStream, "openStream(...)");
        return io.ktor.utils.io.jvm.javaio.c.b(inputStreamOpenStream, null, io.ktor.util.cio.a.a(), 1, null);
    }

    @NotNull
    public final URI j() {
        return this.f295706b;
    }

    public e0(@NotNull URI uri, @NotNull io.ktor.http.m contentType, @Nullable Long l10) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        this.f295706b = uri;
        this.f295707c = contentType;
        this.f295708d = l10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ e0(URL url, io.ktor.http.m mVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 2) != 0) {
            io.ktor.http.m.c cVar = io.ktor.http.m.f295981f;
            String path = url.getPath();
            Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
            mVar = q0.f(cVar, path);
        }
        this(url, mVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public e0(@NotNull URL url, @NotNull io.ktor.http.m contentType) throws URISyntaxException {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        URI uri = url.toURI();
        Intrinsics.checkNotNullExpressionValue(uri, "toURI(...)");
        this(uri, contentType, null, 4, null);
    }
}
