package kotlinx.io.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.io.o;
import kotlinx.io.p;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final f0 f315761a = g0.c(new Function0() { // from class: kotlinx.io.files.d
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return e.e();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final c f315762b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final i f315763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f315764d;

    @SourceDebugExtension({"SMAP\nFileSystemJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileSystemJvm.kt\nkotlinx/io/files/FileSystemJvmKt$SystemFileSystem$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,118:1\n13346#2,2:119\n*S KotlinDebug\n*F\n+ 1 FileSystemJvm.kt\nkotlinx/io/files/FileSystemJvmKt$SystemFileSystem$1\n*L\n105#1:119,2\n*E\n"})
    public static final class a extends l {
        a() {
        }

        @Override // kotlinx.io.files.c
        public o b(i path, boolean z10) {
            Intrinsics.checkNotNullParameter(path, "path");
            return kotlinx.io.l.a(new FileOutputStream(path.a(), z10));
        }

        @Override // kotlinx.io.files.c
        public i c(i path) throws IOException {
            Intrinsics.checkNotNullParameter(path, "path");
            if (!path.a().exists()) {
                throw new FileNotFoundException(path.a().getAbsolutePath());
            }
            File canonicalFile = path.a().getCanonicalFile();
            Intrinsics.checkNotNullExpressionValue(canonicalFile, "getCanonicalFile(...)");
            return new i(canonicalFile);
        }

        @Override // kotlinx.io.files.c
        public void d(i source, i destination) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(destination, "destination");
            e.c().a(source, destination);
        }

        @Override // kotlinx.io.files.c
        public void e(i path, boolean z10) throws IOException {
            Intrinsics.checkNotNullParameter(path, "path");
            if (j(path)) {
                if (!path.a().delete()) {
                    throw new IOException("Deletion failed");
                }
            } else if (z10) {
                throw new FileNotFoundException("File does not exist: " + path.a());
            }
        }

        @Override // kotlinx.io.files.c
        public Collection<i> g(i directory) throws IOException {
            Intrinsics.checkNotNullParameter(directory, "directory");
            File fileA = directory.a();
            if (!fileA.exists()) {
                throw new FileNotFoundException(fileA.getAbsolutePath());
            }
            if (!fileA.isDirectory()) {
                throw new IOException("Not a directory: " + fileA.getAbsolutePath());
            }
            List listCreateListBuilder = CollectionsKt.createListBuilder();
            String[] list = fileA.list();
            if (list != null) {
                for (String str : list) {
                    listCreateListBuilder.add(k.b(directory, str));
                }
            }
            return CollectionsKt.build(listCreateListBuilder);
        }

        @Override // kotlinx.io.files.c
        public p h(i path) {
            Intrinsics.checkNotNullParameter(path, "path");
            return kotlinx.io.l.b(new FileInputStream(path.a()));
        }

        @Override // kotlinx.io.files.c
        public kotlinx.io.files.b i(i path) {
            Intrinsics.checkNotNullParameter(path, "path");
            if (path.a().exists()) {
                return new kotlinx.io.files.b(path.a().isFile(), path.a().isDirectory(), path.a().isFile() ? path.a().length() : -1L);
            }
            return null;
        }

        @Override // kotlinx.io.files.c
        public boolean j(i path) {
            Intrinsics.checkNotNullParameter(path, "path");
            return path.a().exists();
        }

        @Override // kotlinx.io.files.c
        public void k(i path, boolean z10) throws IOException {
            Intrinsics.checkNotNullParameter(path, "path");
            if (path.a().mkdirs()) {
                return;
            }
            if (z10) {
                throw new IOException("Path already exist: " + path);
            }
            if (path.a().isFile()) {
                throw new IOException("Path already exists and it's a file: " + path);
            }
        }
    }

    public static final class b implements g {
        b() {
        }

        @Override // kotlinx.io.files.g
        public void a(i source, i destination) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(destination, "destination");
            throw new UnsupportedOperationException("Atomic move not supported");
        }
    }

    static {
        String property = System.getProperty("java.io.tmpdir");
        Intrinsics.checkNotNullExpressionValue(property, "getProperty(...)");
        f315763c = j.a(property);
        String property2 = System.getProperty("os.name");
        f315764d = property2 != null ? StringsKt.u2(property2, "Windows", false, 2, null) : false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g c() {
        return (g) f315761a.getValue();
    }

    public static final boolean d() {
        return f315764d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g e() {
        try {
            Class.forName("java.nio.file.Files");
            return new h();
        } catch (ClassNotFoundException unused) {
            return new b();
        }
    }
}
