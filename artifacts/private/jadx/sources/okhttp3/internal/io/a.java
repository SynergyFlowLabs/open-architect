package okhttp3.internal.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import oj.f;
import okio.b1;
import okio.l0;
import okio.m0;
import okio.z0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C2365a f334497a = C2365a.f334499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @f
    @NotNull
    public static final a f334498b = new C2365a.C2366a();

    /* JADX INFO: renamed from: okhttp3.internal.io.a$a, reason: collision with other inner class name */
    public static final class C2365a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ C2365a f334499a = new C2365a();

        /* JADX INFO: renamed from: okhttp3.internal.io.a$a$a, reason: collision with other inner class name */
        private static final class C2366a implements a {
            @Override // okhttp3.internal.io.a
            public void a(@NotNull File directory) throws IOException {
                Intrinsics.checkNotNullParameter(directory, "directory");
                File[] fileArrListFiles = directory.listFiles();
                if (fileArrListFiles == null) {
                    throw new IOException("not a readable directory: " + directory);
                }
                for (File file : fileArrListFiles) {
                    if (file.isDirectory()) {
                        Intrinsics.checkNotNullExpressionValue(file, "file");
                        a(file);
                    }
                    if (!file.delete()) {
                        throw new IOException("failed to delete " + file);
                    }
                }
            }

            @Override // okhttp3.internal.io.a
            public void b(@NotNull File from, @NotNull File to) throws IOException {
                Intrinsics.checkNotNullParameter(from, "from");
                Intrinsics.checkNotNullParameter(to, "to");
                c(to);
                if (from.renameTo(to)) {
                    return;
                }
                throw new IOException("failed to rename " + from + " to " + to);
            }

            @Override // okhttp3.internal.io.a
            public void c(@NotNull File file) throws IOException {
                Intrinsics.checkNotNullParameter(file, "file");
                if (file.delete() || !file.exists()) {
                    return;
                }
                throw new IOException("failed to delete " + file);
            }

            @Override // okhttp3.internal.io.a
            public boolean d(@NotNull File file) {
                Intrinsics.checkNotNullParameter(file, "file");
                return file.exists();
            }

            @Override // okhttp3.internal.io.a
            @NotNull
            public z0 e(@NotNull File file) throws FileNotFoundException {
                Intrinsics.checkNotNullParameter(file, "file");
                try {
                    return l0.a(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return l0.a(file);
                }
            }

            @Override // okhttp3.internal.io.a
            public long f(@NotNull File file) {
                Intrinsics.checkNotNullParameter(file, "file");
                return file.length();
            }

            @Override // okhttp3.internal.io.a
            @NotNull
            public b1 g(@NotNull File file) throws FileNotFoundException {
                Intrinsics.checkNotNullParameter(file, "file");
                return l0.t(file);
            }

            @Override // okhttp3.internal.io.a
            @NotNull
            public z0 h(@NotNull File file) throws FileNotFoundException {
                Intrinsics.checkNotNullParameter(file, "file");
                try {
                    return m0.p(file, false, 1, null);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return m0.p(file, false, 1, null);
                }
            }

            @NotNull
            public String toString() {
                return "FileSystem.SYSTEM";
            }
        }

        private C2365a() {
        }
    }

    void a(@NotNull File file) throws IOException;

    void b(@NotNull File file, @NotNull File file2) throws IOException;

    void c(@NotNull File file) throws IOException;

    boolean d(@NotNull File file);

    @NotNull
    z0 e(@NotNull File file) throws FileNotFoundException;

    long f(@NotNull File file);

    @NotNull
    b1 g(@NotNull File file) throws FileNotFoundException;

    @NotNull
    z0 h(@NotNull File file) throws FileNotFoundException;
}
