package okio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
final /* synthetic */ class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f335045a = Logger.getLogger("okio.Okio");

    @NotNull
    public static final z0 b(@NotNull File file) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return l0.p(new FileOutputStream(file, true));
    }

    @NotNull
    public static final v c(@NotNull ClassLoader classLoader) {
        Intrinsics.checkNotNullParameter(classLoader, "<this>");
        return new okio.internal.k(classLoader, true, null, 4, null);
    }

    @NotNull
    public static final p d(@NotNull z0 z0Var, @NotNull Cipher cipher) {
        Intrinsics.checkNotNullParameter(z0Var, "<this>");
        Intrinsics.checkNotNullParameter(cipher, "cipher");
        return new p(l0.d(z0Var), cipher);
    }

    @NotNull
    public static final q e(@NotNull b1 b1Var, @NotNull Cipher cipher) {
        Intrinsics.checkNotNullParameter(b1Var, "<this>");
        Intrinsics.checkNotNullParameter(cipher, "cipher");
        return new q(l0.e(b1Var), cipher);
    }

    @NotNull
    public static final c0 f(@NotNull z0 z0Var, @NotNull MessageDigest digest) {
        Intrinsics.checkNotNullParameter(z0Var, "<this>");
        Intrinsics.checkNotNullParameter(digest, "digest");
        return new c0(z0Var, digest);
    }

    @NotNull
    public static final c0 g(@NotNull z0 z0Var, @NotNull Mac mac) {
        Intrinsics.checkNotNullParameter(z0Var, "<this>");
        Intrinsics.checkNotNullParameter(mac, "mac");
        return new c0(z0Var, mac);
    }

    @NotNull
    public static final d0 h(@NotNull b1 b1Var, @NotNull MessageDigest digest) {
        Intrinsics.checkNotNullParameter(b1Var, "<this>");
        Intrinsics.checkNotNullParameter(digest, "digest");
        return new d0(b1Var, digest);
    }

    @NotNull
    public static final d0 i(@NotNull b1 b1Var, @NotNull Mac mac) {
        Intrinsics.checkNotNullParameter(b1Var, "<this>");
        Intrinsics.checkNotNullParameter(mac, "mac");
        return new d0(b1Var, mac);
    }

    public static final boolean j(@NotNull AssertionError assertionError) {
        Intrinsics.checkNotNullParameter(assertionError, "<this>");
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? StringsKt.V2(message, "getsockname failed", false, 2, null) : false) {
                return true;
            }
        }
        return false;
    }

    @oj.j
    @NotNull
    public static final z0 k(@NotNull File file) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return p(file, false, 1, null);
    }

    @oj.j
    @NotNull
    public static final z0 l(@NotNull File file, boolean z10) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return l0.p(new FileOutputStream(file, z10));
    }

    @NotNull
    public static final z0 m(@NotNull OutputStream outputStream) {
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        return new q0(outputStream, new e1());
    }

    @NotNull
    public static final z0 n(@NotNull Socket socket) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        a1 a1Var = new a1(socket);
        OutputStream outputStream = socket.getOutputStream();
        Intrinsics.checkNotNullExpressionValue(outputStream, "getOutputStream(...)");
        return a1Var.E(new q0(outputStream, a1Var));
    }

    @NotNull
    public static final z0 o(@NotNull Path path, @NotNull OpenOption... options) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        OutputStream outputStreamNewOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        Intrinsics.checkNotNullExpressionValue(outputStreamNewOutputStream, "newOutputStream(...)");
        return l0.p(outputStreamNewOutputStream);
    }

    public static /* synthetic */ z0 p(File file, boolean z10, int i10, Object obj) throws FileNotFoundException {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return l0.o(file, z10);
    }

    @NotNull
    public static final b1 q(@NotNull File file) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return new f0(new FileInputStream(file), e1.f334887f);
    }

    @NotNull
    public static final b1 r(@NotNull InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        return new f0(inputStream, new e1());
    }

    @NotNull
    public static final b1 s(@NotNull Socket socket) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        a1 a1Var = new a1(socket);
        InputStream inputStream = socket.getInputStream();
        Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
        return a1Var.F(new f0(inputStream, a1Var));
    }

    @NotNull
    public static final b1 t(@NotNull Path path, @NotNull OpenOption... options) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        InputStream inputStreamNewInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        Intrinsics.checkNotNullExpressionValue(inputStreamNewInputStream, "newInputStream(...)");
        return l0.u(inputStreamNewInputStream);
    }
}
