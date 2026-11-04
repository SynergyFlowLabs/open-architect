package okio;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class l0 {
    @NotNull
    public static final z0 a(@NotNull File file) throws FileNotFoundException {
        return m0.b(file);
    }

    @NotNull
    public static final v b(@NotNull ClassLoader classLoader) {
        return m0.c(classLoader);
    }

    @oj.i(name = "blackhole")
    @NotNull
    public static final z0 c() {
        return n0.a();
    }

    @NotNull
    public static final m d(@NotNull z0 z0Var) {
        return n0.b(z0Var);
    }

    @NotNull
    public static final n e(@NotNull b1 b1Var) {
        return n0.c(b1Var);
    }

    @NotNull
    public static final p f(@NotNull z0 z0Var, @NotNull Cipher cipher) {
        return m0.d(z0Var, cipher);
    }

    @NotNull
    public static final q g(@NotNull b1 b1Var, @NotNull Cipher cipher) {
        return m0.e(b1Var, cipher);
    }

    @NotNull
    public static final c0 h(@NotNull z0 z0Var, @NotNull MessageDigest messageDigest) {
        return m0.f(z0Var, messageDigest);
    }

    @NotNull
    public static final c0 i(@NotNull z0 z0Var, @NotNull Mac mac) {
        return m0.g(z0Var, mac);
    }

    @NotNull
    public static final d0 j(@NotNull b1 b1Var, @NotNull MessageDigest messageDigest) {
        return m0.h(b1Var, messageDigest);
    }

    @NotNull
    public static final d0 k(@NotNull b1 b1Var, @NotNull Mac mac) {
        return m0.i(b1Var, mac);
    }

    public static final boolean l(@NotNull AssertionError assertionError) {
        return m0.j(assertionError);
    }

    @NotNull
    public static final v m(@NotNull v vVar, @NotNull r0 r0Var) throws IOException {
        return o0.a(vVar, r0Var);
    }

    @oj.j
    @NotNull
    public static final z0 n(@NotNull File file) throws FileNotFoundException {
        return m0.k(file);
    }

    @oj.j
    @NotNull
    public static final z0 o(@NotNull File file, boolean z10) throws FileNotFoundException {
        return m0.l(file, z10);
    }

    @NotNull
    public static final z0 p(@NotNull OutputStream outputStream) {
        return m0.m(outputStream);
    }

    @NotNull
    public static final z0 q(@NotNull Socket socket) throws IOException {
        return m0.n(socket);
    }

    @NotNull
    public static final z0 r(@NotNull Path path, @NotNull OpenOption... openOptionArr) throws IOException {
        return m0.o(path, openOptionArr);
    }

    @NotNull
    public static final b1 t(@NotNull File file) throws FileNotFoundException {
        return m0.q(file);
    }

    @NotNull
    public static final b1 u(@NotNull InputStream inputStream) {
        return m0.r(inputStream);
    }

    @NotNull
    public static final b1 v(@NotNull Socket socket) throws IOException {
        return m0.s(socket);
    }

    @NotNull
    public static final b1 w(@NotNull Path path, @NotNull OpenOption... openOptionArr) throws IOException {
        return m0.t(path, openOptionArr);
    }

    public static final <T extends Closeable, R> R x(T t10, @NotNull Function1<? super T, ? extends R> function1) {
        return (R) n0.d(t10, function1);
    }
}
