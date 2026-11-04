package okio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.nio.file.CopyOption;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nNioFileSystemWrappingFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NioFileSystemWrappingFileSystem.kt\nokio/NioFileSystemWrappingFileSystem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,192:1\n1620#2,3:193\n1#3:196\n37#4,2:197\n37#4,2:199\n37#4,2:201\n*S KotlinDebug\n*F\n+ 1 NioFileSystemWrappingFileSystem.kt\nokio/NioFileSystemWrappingFileSystem\n*L\n77#1:193,3\n104#1:197,2\n125#1:199,2\n138#1:201,2\n*E\n"})
public final class j0 extends k0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final FileSystem f335033e;

    public j0(@NotNull FileSystem nioFileSystem) {
        Intrinsics.checkNotNullParameter(nioFileSystem, "nioFileSystem");
        this.f335033e = nioFileSystem;
    }

    private final List<r0> N(r0 r0Var, boolean z10) throws IOException {
        Path pathS = S(r0Var);
        try {
            List listK1 = kotlin.io.path.p.k1(pathS, null, 1, null);
            ArrayList arrayList = new ArrayList();
            Iterator it = listK1.iterator();
            while (it.hasNext()) {
                arrayList.add(r0.a.i(r0.f335070b, (Path) it.next(), false, 1, null));
            }
            CollectionsKt.sort(arrayList);
            return arrayList;
        } catch (Exception unused) {
            if (!z10) {
                return null;
            }
            if (Files.exists(pathS, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
                throw new IOException("failed to list " + r0Var);
            }
            throw new FileNotFoundException("no such file: " + r0Var);
        }
    }

    private final Path S(r0 r0Var) {
        Path path = this.f335033e.getPath(r0Var.toString(), new String[0]);
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        return path;
    }

    @Override // okio.k0, okio.h0, okio.v
    @Nullable
    public u E(@NotNull r0 path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return Q(S(path));
    }

    @Override // okio.h0, okio.v
    @NotNull
    public t F(@NotNull r0 file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        try {
            FileChannel fileChannelOpen = FileChannel.open(S(file), StandardOpenOption.READ);
            Intrinsics.checkNotNull(fileChannelOpen);
            return new i0(false, fileChannelOpen);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException("no such file: " + file);
        }
    }

    @Override // okio.h0, okio.v
    @NotNull
    public t H(@NotNull r0 file, boolean z10, boolean z11) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        if (z10 && z11) {
            throw new IllegalArgumentException("Cannot require mustCreate and mustExist at the same time.");
        }
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        listCreateListBuilder.add(StandardOpenOption.READ);
        listCreateListBuilder.add(StandardOpenOption.WRITE);
        if (z10) {
            listCreateListBuilder.add(StandardOpenOption.CREATE_NEW);
        } else if (!z11) {
            listCreateListBuilder.add(StandardOpenOption.CREATE);
        }
        List listBuild = CollectionsKt.build(listCreateListBuilder);
        try {
            Path pathS = S(file);
            StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) listBuild.toArray(new StandardOpenOption[0]);
            FileChannel fileChannelOpen = FileChannel.open(pathS, (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length));
            Intrinsics.checkNotNull(fileChannelOpen);
            return new i0(true, fileChannelOpen);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException("no such file: " + file);
        }
    }

    @Override // okio.h0, okio.v
    @NotNull
    public z0 K(@NotNull r0 file, boolean z10) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        if (z10) {
            listCreateListBuilder.add(StandardOpenOption.CREATE_NEW);
        }
        List listBuild = CollectionsKt.build(listCreateListBuilder);
        try {
            Path pathS = S(file);
            StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) listBuild.toArray(new StandardOpenOption[0]);
            OpenOption[] openOptionArr = (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length);
            OutputStream outputStreamNewOutputStream = Files.newOutputStream(pathS, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
            Intrinsics.checkNotNullExpressionValue(outputStreamNewOutputStream, "newOutputStream(...)");
            return l0.p(outputStreamNewOutputStream);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException("no such file: " + file);
        }
    }

    @Override // okio.h0, okio.v
    @NotNull
    public b1 M(@NotNull r0 file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        try {
            InputStream inputStreamNewInputStream = Files.newInputStream(S(file), (OpenOption[]) Arrays.copyOf(new OpenOption[0], 0));
            Intrinsics.checkNotNullExpressionValue(inputStreamNewInputStream, "newInputStream(...)");
            return l0.u(inputStreamNewInputStream);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException("no such file: " + file);
        }
    }

    @Override // okio.h0, okio.v
    @NotNull
    public z0 e(@NotNull r0 file, boolean z10) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        listCreateListBuilder.add(StandardOpenOption.APPEND);
        if (!z10) {
            listCreateListBuilder.add(StandardOpenOption.CREATE);
        }
        List listBuild = CollectionsKt.build(listCreateListBuilder);
        Path pathS = S(file);
        StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) listBuild.toArray(new StandardOpenOption[0]);
        OpenOption[] openOptionArr = (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length);
        OutputStream outputStreamNewOutputStream = Files.newOutputStream(pathS, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        Intrinsics.checkNotNullExpressionValue(outputStreamNewOutputStream, "newOutputStream(...)");
        return l0.p(outputStreamNewOutputStream);
    }

    @Override // okio.k0, okio.h0, okio.v
    public void g(@NotNull r0 source, @NotNull r0 target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        try {
            Intrinsics.checkNotNullExpressionValue(Files.move(S(source), S(target), (CopyOption[]) Arrays.copyOf(new CopyOption[]{StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING}, 2)), "move(...)");
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e10) {
            throw new FileNotFoundException(e10.getMessage());
        }
    }

    @Override // okio.h0, okio.v
    @NotNull
    public r0 h(@NotNull r0 path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        try {
            r0.a aVar = r0.f335070b;
            Path realPath = S(path).toRealPath(new LinkOption[0]);
            Intrinsics.checkNotNullExpressionValue(realPath, "toRealPath(...)");
            return r0.a.i(aVar, realPath, false, 1, null);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException("no such file: " + path);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // okio.h0, okio.v
    public void n(@NotNull r0 dir, boolean z10) throws IOException {
        boolean z11;
        Intrinsics.checkNotNullParameter(dir, "dir");
        u uVarE = E(dir);
        if (uVarE != null) {
            z11 = uVarE.j();
        }
        if (z11 && z10) {
            throw new IOException(dir + " already exists.");
        }
        try {
            Intrinsics.checkNotNullExpressionValue(Files.createDirectory(S(dir), (FileAttribute[]) Arrays.copyOf(new FileAttribute[0], 0)), "createDirectory(...)");
        } catch (IOException e10) {
            if (z11) {
                return;
            }
            throw new IOException("failed to create directory: " + dir, e10);
        }
    }

    @Override // okio.k0, okio.h0, okio.v
    public void p(@NotNull r0 source, @NotNull r0 target) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullExpressionValue(Files.createSymbolicLink(S(source), S(target), (FileAttribute[]) Arrays.copyOf(new FileAttribute[0], 0)), "createSymbolicLink(...)");
    }

    @Override // okio.h0, okio.v
    public void r(@NotNull r0 path, boolean z10) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        Path pathS = S(path);
        try {
            Files.delete(pathS);
        } catch (NoSuchFileException unused) {
            if (z10) {
                throw new FileNotFoundException("no such file: " + path);
            }
        } catch (IOException unused2) {
            if (Files.exists(pathS, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
                throw new IOException("failed to delete " + path);
            }
        }
    }

    @Override // okio.k0, okio.h0
    @NotNull
    public String toString() {
        String strQ = j1.d(this.f335033e.getClass()).Q();
        Intrinsics.checkNotNull(strQ);
        return strQ;
    }

    @Override // okio.h0, okio.v
    @NotNull
    public List<r0> y(@NotNull r0 dir) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        List<r0> listN = N(dir, true);
        Intrinsics.checkNotNull(listN);
        return listN;
    }

    @Override // okio.h0, okio.v
    @Nullable
    public List<r0> z(@NotNull r0 dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        return N(dir, false);
    }
}
