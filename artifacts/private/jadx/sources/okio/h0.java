package okio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nJvmSystemFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmSystemFileSystem.kt\nokio/JvmSystemFileSystem\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,158:1\n11400#2,3:159\n*S KotlinDebug\n*F\n+ 1 JvmSystemFileSystem.kt\nokio/JvmSystemFileSystem\n*L\n77#1:159,3\n*E\n"})
public class h0 extends v {
    private final List<r0> N(r0 r0Var, boolean z10) throws IOException {
        File file = r0Var.toFile();
        String[] list = file.list();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                Intrinsics.checkNotNull(str);
                arrayList.add(r0Var.D(str));
            }
            CollectionsKt.sort(arrayList);
            return arrayList;
        }
        if (!z10) {
            return null;
        }
        if (file.exists()) {
            throw new IOException("failed to list " + r0Var);
        }
        throw new FileNotFoundException("no such file: " + r0Var);
    }

    private final void O(r0 r0Var) throws IOException {
        if (w(r0Var)) {
            throw new IOException(r0Var + " already exists.");
        }
    }

    private final void P(r0 r0Var) throws IOException {
        if (w(r0Var)) {
            return;
        }
        throw new IOException(r0Var + " doesn't exist.");
    }

    @Override // okio.v
    @Nullable
    public u E(@NotNull r0 path) {
        Intrinsics.checkNotNullParameter(path, "path");
        File file = path.toFile();
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        long jLastModified = file.lastModified();
        long length = file.length();
        if (!zIsFile && !zIsDirectory && jLastModified == 0 && length == 0 && !file.exists()) {
            return null;
        }
        return new u(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null, null, 128, null);
    }

    @Override // okio.v
    @NotNull
    public t F(@NotNull r0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return new g0(false, new RandomAccessFile(file.toFile(), "r"));
    }

    @Override // okio.v
    @NotNull
    public t H(@NotNull r0 file, boolean z10, boolean z11) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        if (z10 && z11) {
            throw new IllegalArgumentException("Cannot require mustCreate and mustExist at the same time.");
        }
        if (z10) {
            O(file);
        }
        if (z11) {
            P(file);
        }
        return new g0(true, new RandomAccessFile(file.toFile(), "rw"));
    }

    @Override // okio.v
    @NotNull
    public z0 K(@NotNull r0 file, boolean z10) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        if (z10) {
            O(file);
        }
        return m0.p(file.toFile(), false, 1, null);
    }

    @Override // okio.v
    @NotNull
    public b1 M(@NotNull r0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return l0.t(file.toFile());
    }

    @Override // okio.v
    @NotNull
    public z0 e(@NotNull r0 file, boolean z10) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        if (z10) {
            P(file);
        }
        return l0.o(file.toFile(), true);
    }

    @Override // okio.v
    public void g(@NotNull r0 source, @NotNull r0 target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        if (source.toFile().renameTo(target.toFile())) {
            return;
        }
        throw new IOException("failed to move " + source + " to " + target);
    }

    @Override // okio.v
    @NotNull
    public r0 h(@NotNull r0 path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        File canonicalFile = path.toFile().getCanonicalFile();
        if (!canonicalFile.exists()) {
            throw new FileNotFoundException("no such file");
        }
        r0.a aVar = r0.f335070b;
        Intrinsics.checkNotNull(canonicalFile);
        return r0.a.g(aVar, canonicalFile, false, 1, null);
    }

    @Override // okio.v
    public void n(@NotNull r0 dir, boolean z10) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        if (dir.toFile().mkdir()) {
            return;
        }
        u uVarE = E(dir);
        if (uVarE == null || !uVarE.j()) {
            throw new IOException("failed to create directory: " + dir);
        }
        if (z10) {
            throw new IOException(dir + " already exists.");
        }
    }

    @Override // okio.v
    public void p(@NotNull r0 source, @NotNull r0 target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        throw new IOException("unsupported");
    }

    @Override // okio.v
    public void r(@NotNull r0 path, boolean z10) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = path.toFile();
        if (file.delete()) {
            return;
        }
        if (file.exists()) {
            throw new IOException("failed to delete " + path);
        }
        if (z10) {
            throw new FileNotFoundException("no such file: " + path);
        }
    }

    @NotNull
    public String toString() {
        return "JvmSystemFileSystem";
    }

    @Override // okio.v
    @NotNull
    public List<r0> y(@NotNull r0 dir) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        List<r0> listN = N(dir, true);
        Intrinsics.checkNotNull(listN);
        return listN;
    }

    @Override // okio.v
    @Nullable
    public List<r0> z(@NotNull r0 dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        return N(dir, false);
    }
}
