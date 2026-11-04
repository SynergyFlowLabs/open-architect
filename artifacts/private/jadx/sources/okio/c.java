package okio;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@kotlin.l(message = "changed in Okio 2.x")
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f334864a = new c();

    private c() {
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to extension function", replaceWith = @kotlin.b1(expression = "file.appendingSink()", imports = {"okio.appendingSink"}))
    @NotNull
    public final z0 a(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return l0.a(file);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to extension function", replaceWith = @kotlin.b1(expression = "blackholeSink()", imports = {"okio.blackholeSink"}))
    @NotNull
    public final z0 b() {
        return l0.c();
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to extension function", replaceWith = @kotlin.b1(expression = "sink.buffer()", imports = {"okio.buffer"}))
    @NotNull
    public final m c(@NotNull z0 sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        return l0.d(sink);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to extension function", replaceWith = @kotlin.b1(expression = "source.buffer()", imports = {"okio.buffer"}))
    @NotNull
    public final n d(@NotNull b1 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return l0.e(source);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to extension function", replaceWith = @kotlin.b1(expression = "file.sink()", imports = {"okio.sink"}))
    @NotNull
    public final z0 e(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return m0.p(file, false, 1, null);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to extension function", replaceWith = @kotlin.b1(expression = "outputStream.sink()", imports = {"okio.sink"}))
    @NotNull
    public final z0 f(@NotNull OutputStream outputStream) {
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        return l0.p(outputStream);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to extension function", replaceWith = @kotlin.b1(expression = "socket.sink()", imports = {"okio.sink"}))
    @NotNull
    public final z0 g(@NotNull Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        return l0.q(socket);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to extension function", replaceWith = @kotlin.b1(expression = "path.sink(*options)", imports = {"okio.sink"}))
    @NotNull
    public final z0 h(@NotNull Path path, @NotNull OpenOption... options) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(options, "options");
        return l0.r(path, (OpenOption[]) Arrays.copyOf(options, options.length));
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to extension function", replaceWith = @kotlin.b1(expression = "file.source()", imports = {"okio.source"}))
    @NotNull
    public final b1 i(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return l0.t(file);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to extension function", replaceWith = @kotlin.b1(expression = "inputStream.source()", imports = {"okio.source"}))
    @NotNull
    public final b1 j(@NotNull InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        return l0.u(inputStream);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to extension function", replaceWith = @kotlin.b1(expression = "socket.source()", imports = {"okio.source"}))
    @NotNull
    public final b1 k(@NotNull Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        return l0.v(socket);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to extension function", replaceWith = @kotlin.b1(expression = "path.source(*options)", imports = {"okio.source"}))
    @NotNull
    public final b1 l(@NotNull Path path, @NotNull OpenOption... options) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(options, "options");
        return l0.w(path, (OpenOption[]) Arrays.copyOf(options, options.length));
    }
}
