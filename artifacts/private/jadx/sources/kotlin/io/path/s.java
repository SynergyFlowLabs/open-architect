package kotlin.io.path;

import java.io.IOException;
import java.net.URI;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileStore;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.UserPrincipal;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.a0;
import kotlin.a1;
import kotlin.b1;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.e1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.h0;
import kotlin.m2;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nPathUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathUtils.kt\nkotlin/io/path/PathsKt__PathUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1181:1\n1#2:1182\n1863#3,2:1183\n*S KotlinDebug\n*F\n+ 1 PathUtils.kt\nkotlin/io/path/PathsKt__PathUtilsKt\n*L\n440#1:1183,2\n*E\n"})
public class s extends r {
    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final Path A0(Path path, String other) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Path pathResolve = path.resolve(other);
        Intrinsics.checkNotNullExpressionValue(pathResolve, "resolve(...)");
        return pathResolve;
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final <T> T A1(Path path, String glob, Function1<? super Sequence<? extends Path>, ? extends T> block) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(glob, "glob");
        Intrinsics.checkNotNullParameter(block, "block");
        DirectoryStream<Path> directoryStreamNewDirectoryStream = Files.newDirectoryStream(path, glob);
        try {
            Intrinsics.checkNotNull(directoryStreamNewDirectoryStream);
            T tInvoke = block.invoke(CollectionsKt.asSequence(directoryStreamNewDirectoryStream));
            h0.d(1);
            if (kotlin.internal.m.a(1, 1, 0)) {
                kotlin.io.c.a(directoryStreamNewDirectoryStream, null);
            } else if (directoryStreamNewDirectoryStream != null) {
                directoryStreamNewDirectoryStream.close();
            }
            h0.c(1);
            return tInvoke;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                h0.d(1);
                if (kotlin.internal.m.a(1, 1, 0)) {
                    kotlin.io.c.a(directoryStreamNewDirectoryStream, th2);
                } else if (directoryStreamNewDirectoryStream != null) {
                    try {
                        directoryStreamNewDirectoryStream.close();
                    } catch (Throwable unused) {
                    }
                }
                h0.c(1);
                throw th3;
            }
        }
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final Path B0(Path path, Path other) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Path pathResolve = path.resolve(other);
        Intrinsics.checkNotNullExpressionValue(pathResolve, "resolve(...)");
        return pathResolve;
    }

    static /* synthetic */ Object B1(Path path, String glob, Function1 block, int i10, Object obj) throws IOException {
        if ((i10 & 1) != 0) {
            glob = "*";
        }
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(glob, "glob");
        Intrinsics.checkNotNullParameter(block, "block");
        DirectoryStream<Path> directoryStreamNewDirectoryStream = Files.newDirectoryStream(path, glob);
        try {
            Intrinsics.checkNotNull(directoryStreamNewDirectoryStream);
            Object objInvoke = block.invoke(CollectionsKt.asSequence(directoryStreamNewDirectoryStream));
            h0.d(1);
            if (kotlin.internal.m.a(1, 1, 0)) {
                kotlin.io.c.a(directoryStreamNewDirectoryStream, null);
            } else if (directoryStreamNewDirectoryStream != null) {
                directoryStreamNewDirectoryStream.close();
            }
            h0.c(1);
            return objInvoke;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                h0.d(1);
                if (kotlin.internal.m.a(1, 1, 0)) {
                    kotlin.io.c.a(directoryStreamNewDirectoryStream, th2);
                } else if (directoryStreamNewDirectoryStream != null) {
                    try {
                        directoryStreamNewDirectoryStream.close();
                    } catch (Throwable unused) {
                    }
                }
                h0.c(1);
                throw th3;
            }
        }
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final boolean C0(Path path, LinkOption... options) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        return Files.exists(path, (LinkOption[]) Arrays.copyOf(options, options.length));
    }

    @e
    @e1(version = "1.7")
    public static final void C1(@NotNull Path path, int i10, boolean z10, @NotNull Function1<? super FileVisitorBuilder, Unit> builderAction) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        D1(path, I0(builderAction), i10, z10);
    }

    @a1
    @NotNull
    public static final Void D0(@NotNull Path path, @NotNull Class<?> attributeViewClass) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(attributeViewClass, "attributeViewClass");
        throw new UnsupportedOperationException("The desired attribute view type " + attributeViewClass + " is not available for the file " + path + '.');
    }

    @e
    @e1(version = "1.7")
    public static final void D1(@NotNull Path path, @NotNull FileVisitor<Path> visitor, int i10, boolean z10) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        Files.walkFileTree(path, z10 ? SetsKt.setOf(FileVisitOption.FOLLOW_LINKS) : SetsKt.emptySet(), i10, visitor);
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final /* synthetic */ <V extends FileAttributeView> V E0(Path path, LinkOption... options) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.Y4);
        V v10 = (V) Files.getFileAttributeView(path, FileAttributeView.class, (LinkOption[]) Arrays.copyOf(options, options.length));
        if (v10 != null) {
            return v10;
        }
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.Y4);
        D0(path, FileAttributeView.class);
        throw new a0();
    }

    public static /* synthetic */ void E1(Path path, int i10, boolean z10, Function1 function1, int i11, Object obj) throws IOException {
        if ((i11 & 1) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        C1(path, i10, z10, function1);
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final /* synthetic */ <V extends FileAttributeView> V F0(Path path, LinkOption... options) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.Y4);
        return (V) Files.getFileAttributeView(path, FileAttributeView.class, (LinkOption[]) Arrays.copyOf(options, options.length));
    }

    public static /* synthetic */ void F1(Path path, FileVisitor fileVisitor, int i10, boolean z10, int i11, Object obj) throws IOException {
        if ((i11 & 2) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        D1(path, fileVisitor, i10, z10);
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final long G0(Path path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return Files.size(path);
    }

    @e
    @e1(version = "1.7")
    @NotNull
    public static final Sequence<Path> G1(@NotNull Path path, @NotNull o... options) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        return new m(path, options);
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final FileStore H0(Path path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        FileStore fileStore = Files.getFileStore(path);
        Intrinsics.checkNotNullExpressionValue(fileStore, "getFileStore(...)");
        return fileStore;
    }

    @e
    @e1(version = "1.7")
    @NotNull
    public static final FileVisitor<Path> I0(@NotNull Function1<? super FileVisitorBuilder, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        f fVar = new f();
        builderAction.invoke(fVar);
        return fVar.e();
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final void J0(Path path, String glob, Function1<? super Path, Unit> action) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(glob, "glob");
        Intrinsics.checkNotNullParameter(action, "action");
        DirectoryStream<Path> directoryStreamNewDirectoryStream = Files.newDirectoryStream(path, glob);
        try {
            Intrinsics.checkNotNull(directoryStreamNewDirectoryStream);
            Iterator<Path> it = directoryStreamNewDirectoryStream.iterator();
            while (it.hasNext()) {
                action.invoke(it.next());
            }
            Unit unit = Unit.f312394a;
            h0.d(1);
            if (kotlin.internal.m.a(1, 1, 0)) {
                kotlin.io.c.a(directoryStreamNewDirectoryStream, null);
            } else if (directoryStreamNewDirectoryStream != null) {
                directoryStreamNewDirectoryStream.close();
            }
            h0.c(1);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                h0.d(1);
                if (kotlin.internal.m.a(1, 1, 0)) {
                    kotlin.io.c.a(directoryStreamNewDirectoryStream, th2);
                } else if (directoryStreamNewDirectoryStream != null) {
                    try {
                        directoryStreamNewDirectoryStream.close();
                    } catch (Throwable unused) {
                    }
                }
                h0.c(1);
                throw th3;
            }
        }
    }

    static /* synthetic */ void K0(Path path, String glob, Function1 action, int i10, Object obj) throws IOException {
        if ((i10 & 1) != 0) {
            glob = "*";
        }
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(glob, "glob");
        Intrinsics.checkNotNullParameter(action, "action");
        DirectoryStream<Path> directoryStreamNewDirectoryStream = Files.newDirectoryStream(path, glob);
        try {
            Intrinsics.checkNotNull(directoryStreamNewDirectoryStream);
            Iterator<Path> it = directoryStreamNewDirectoryStream.iterator();
            while (it.hasNext()) {
                action.invoke(it.next());
            }
            Unit unit = Unit.f312394a;
            h0.d(1);
            if (kotlin.internal.m.a(1, 1, 0)) {
                kotlin.io.c.a(directoryStreamNewDirectoryStream, null);
            } else if (directoryStreamNewDirectoryStream != null) {
                directoryStreamNewDirectoryStream.close();
            }
            h0.c(1);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                h0.d(1);
                if (kotlin.internal.m.a(1, 1, 0)) {
                    kotlin.io.c.a(directoryStreamNewDirectoryStream, th2);
                } else if (directoryStreamNewDirectoryStream != null) {
                    try {
                        directoryStreamNewDirectoryStream.close();
                    } catch (Throwable unused) {
                    }
                }
                h0.c(1);
                throw th3;
            }
        }
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final Object L0(Path path, String attribute, LinkOption... options) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(attribute, "attribute");
        Intrinsics.checkNotNullParameter(options, "options");
        return Files.getAttribute(path, attribute, (LinkOption[]) Arrays.copyOf(options, options.length));
    }

    @NotNull
    public static String M0(@NotNull Path path) {
        String string;
        String strQ5;
        Intrinsics.checkNotNullParameter(path, "<this>");
        Path fileName = path.getFileName();
        return (fileName == null || (string = fileName.toString()) == null || (strQ5 = StringsKt.q5(string, '.', "")) == null) ? "" : strQ5;
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    public static /* synthetic */ void N0(Path path) {
    }

    private static final String O0(Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return Q0(path);
    }

    @e
    @kotlin.l(level = kotlin.n.ERROR, message = "Use invariantSeparatorsPathString property instead.", replaceWith = @b1(expression = "invariantSeparatorsPathString", imports = {}))
    @e1(version = "1.4")
    @kotlin.internal.f
    public static /* synthetic */ void P0(Path path) {
    }

    @NotNull
    public static final String Q0(@NotNull Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        String separator = path.getFileSystem().getSeparator();
        if (Intrinsics.areEqual(separator, "/")) {
            return path.toString();
        }
        String string = path.toString();
        Intrinsics.checkNotNull(separator);
        return StringsKt.k2(string, separator, "/", false, 4, null);
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    public static /* synthetic */ void R0(Path path) {
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final FileTime S0(Path path, LinkOption... options) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        FileTime lastModifiedTime = Files.getLastModifiedTime(path, (LinkOption[]) Arrays.copyOf(options, options.length));
        Intrinsics.checkNotNullExpressionValue(lastModifiedTime, "getLastModifiedTime(...)");
        return lastModifiedTime;
    }

    @NotNull
    public static final String T0(@NotNull Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Path fileName = path.getFileName();
        String string = fileName != null ? fileName.toString() : null;
        if (string == null) {
            string = "";
        }
        return string;
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    public static /* synthetic */ void U0(Path path) {
    }

    @NotNull
    public static final String V0(@NotNull Path path) {
        String string;
        String strB5;
        Intrinsics.checkNotNullParameter(path, "<this>");
        Path fileName = path.getFileName();
        return (fileName == null || (string = fileName.toString()) == null || (strB5 = StringsKt.B5(string, ".", null, 2, null)) == null) ? "" : strB5;
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    public static /* synthetic */ void W0(Path path) {
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final UserPrincipal X0(Path path, LinkOption... options) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        return Files.getOwner(path, (LinkOption[]) Arrays.copyOf(options, options.length));
    }

    private static final String Y0(Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return path.toString();
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    public static /* synthetic */ void Z0(Path path) {
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final Set<PosixFilePermission> a1(Path path, LinkOption... options) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        Set<PosixFilePermission> posixFilePermissions = Files.getPosixFilePermissions(path, (LinkOption[]) Arrays.copyOf(options, options.length));
        Intrinsics.checkNotNullExpressionValue(posixFilePermissions, "getPosixFilePermissions(...)");
        return posixFilePermissions;
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final boolean b1(Path path, LinkOption... options) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        return Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(options, options.length));
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final boolean c1(Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return Files.isExecutable(path);
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final Path d0(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        Path path2 = Paths.get(path, new String[0]);
        Intrinsics.checkNotNullExpressionValue(path2, "get(...)");
        return path2;
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final boolean d1(Path path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return Files.isHidden(path);
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final Path e0(String base, String... subpaths) {
        Intrinsics.checkNotNullParameter(base, "base");
        Intrinsics.checkNotNullParameter(subpaths, "subpaths");
        Path path = Paths.get(base, (String[]) Arrays.copyOf(subpaths, subpaths.length));
        Intrinsics.checkNotNullExpressionValue(path, "get(...)");
        return path;
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final boolean e1(Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return Files.isReadable(path);
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final Path f0(Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Path absolutePath = path.toAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "toAbsolutePath(...)");
        return absolutePath;
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final boolean f1(Path path, LinkOption... options) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        return Files.isRegularFile(path, (LinkOption[]) Arrays.copyOf(options, options.length));
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final String g0(Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return path.toAbsolutePath().toString();
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final boolean g1(Path path, Path other) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return Files.isSameFile(path, other);
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final Path h0(Path path, Path target, boolean z10) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        CopyOption[] copyOptionArr = z10 ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path pathCopy = Files.copy(path, target, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        Intrinsics.checkNotNullExpressionValue(pathCopy, "copy(...)");
        return pathCopy;
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final boolean h1(Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return Files.isSymbolicLink(path);
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final Path i0(Path path, Path target, CopyOption... options) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(options, "options");
        Path pathCopy = Files.copy(path, target, (CopyOption[]) Arrays.copyOf(options, options.length));
        Intrinsics.checkNotNullExpressionValue(pathCopy, "copy(...)");
        return pathCopy;
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final boolean i1(Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return Files.isWritable(path);
    }

    static /* synthetic */ Path j0(Path path, Path target, boolean z10, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        CopyOption[] copyOptionArr = z10 ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path pathCopy = Files.copy(path, target, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        Intrinsics.checkNotNullExpressionValue(pathCopy, "copy(...)");
        return pathCopy;
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @NotNull
    public static final List<Path> j1(@NotNull Path path, @NotNull String glob) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(glob, "glob");
        DirectoryStream<Path> directoryStreamNewDirectoryStream = Files.newDirectoryStream(path, glob);
        try {
            Intrinsics.checkNotNull(directoryStreamNewDirectoryStream);
            List<Path> list = CollectionsKt.toList(directoryStreamNewDirectoryStream);
            kotlin.io.c.a(directoryStreamNewDirectoryStream, null);
            return list;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.io.c.a(directoryStreamNewDirectoryStream, th2);
                throw th3;
            }
        }
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final Path k0(Path path, FileAttribute<?>... attributes) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Path pathCreateDirectories = Files.createDirectories(path, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        Intrinsics.checkNotNullExpressionValue(pathCreateDirectories, "createDirectories(...)");
        return pathCreateDirectories;
    }

    public static /* synthetic */ List k1(Path path, String str, int i10, Object obj) throws IOException {
        if ((i10 & 1) != 0) {
            str = "*";
        }
        return j1(path, str);
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final Path l0(Path path, FileAttribute<?>... attributes) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Path pathCreateDirectory = Files.createDirectory(path, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        Intrinsics.checkNotNullExpressionValue(pathCreateDirectory, "createDirectory(...)");
        return pathCreateDirectory;
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final Path l1(Path path, Path target, boolean z10) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        CopyOption[] copyOptionArr = z10 ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path pathMove = Files.move(path, target, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        Intrinsics.checkNotNullExpressionValue(pathMove, "move(...)");
        return pathMove;
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final Path m0(Path path, FileAttribute<?>... attributes) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Path pathCreateFile = Files.createFile(path, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        Intrinsics.checkNotNullExpressionValue(pathCreateFile, "createFile(...)");
        return pathCreateFile;
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final Path m1(Path path, Path target, CopyOption... options) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(options, "options");
        Path pathMove = Files.move(path, target, (CopyOption[]) Arrays.copyOf(options, options.length));
        Intrinsics.checkNotNullExpressionValue(pathMove, "move(...)");
        return pathMove;
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final Path n0(Path path, Path target) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        Path pathCreateLink = Files.createLink(path, target);
        Intrinsics.checkNotNullExpressionValue(pathCreateLink, "createLink(...)");
        return pathCreateLink;
    }

    static /* synthetic */ Path n1(Path path, Path target, boolean z10, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        CopyOption[] copyOptionArr = z10 ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path pathMove = Files.move(path, target, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        Intrinsics.checkNotNullExpressionValue(pathMove, "move(...)");
        return pathMove;
    }

    @e1(version = "1.9")
    @NotNull
    public static final Path o0(@NotNull Path path, @NotNull FileAttribute<?>... attributes) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Path parent = path.getParent();
        if (parent != null && !Files.isDirectory(parent, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
            try {
                FileAttribute[] fileAttributeArr = (FileAttribute[]) Arrays.copyOf(attributes, attributes.length);
                Intrinsics.checkNotNullExpressionValue(Files.createDirectories(parent, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length)), "createDirectories(...)");
                return path;
            } catch (FileAlreadyExistsException e10) {
                if (!Files.isDirectory(parent, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
                    throw e10;
                }
            }
        }
        return path;
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final boolean o1(Path path, LinkOption... options) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        return Files.notExists(path, (LinkOption[]) Arrays.copyOf(options, options.length));
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final Path p0(Path path, Path target, FileAttribute<?>... attributes) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Path pathCreateSymbolicLink = Files.createSymbolicLink(path, target, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        Intrinsics.checkNotNullExpressionValue(pathCreateSymbolicLink, "createSymbolicLink(...)");
        return pathCreateSymbolicLink;
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final /* synthetic */ <A extends BasicFileAttributes> A p1(Path path, LinkOption... options) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.X4);
        A a10 = (A) Files.readAttributes(path, BasicFileAttributes.class, (LinkOption[]) Arrays.copyOf(options, options.length));
        Intrinsics.checkNotNullExpressionValue(a10, "readAttributes(...)");
        return a10;
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final Path q0(String str, FileAttribute<?>... attributes) throws IOException {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Path pathCreateTempDirectory = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        Intrinsics.checkNotNullExpressionValue(pathCreateTempDirectory, "createTempDirectory(...)");
        return pathCreateTempDirectory;
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final Map<String, Object> q1(Path path, String attributes, LinkOption... options) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(options, "options");
        Map<String, Object> attributes2 = Files.readAttributes(path, attributes, (LinkOption[]) Arrays.copyOf(options, options.length));
        Intrinsics.checkNotNullExpressionValue(attributes2, "readAttributes(...)");
        return attributes2;
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @NotNull
    public static final Path r0(@Nullable Path path, @Nullable String str, @NotNull FileAttribute<?>... attributes) throws IOException {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        if (path != null) {
            Path pathCreateTempDirectory = Files.createTempDirectory(path, str, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
            Intrinsics.checkNotNullExpressionValue(pathCreateTempDirectory, "createTempDirectory(...)");
            return pathCreateTempDirectory;
        }
        Path pathCreateTempDirectory2 = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        Intrinsics.checkNotNullExpressionValue(pathCreateTempDirectory2, "createTempDirectory(...)");
        return pathCreateTempDirectory2;
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final Path r1(Path path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Path symbolicLink = Files.readSymbolicLink(path);
        Intrinsics.checkNotNullExpressionValue(symbolicLink, "readSymbolicLink(...)");
        return symbolicLink;
    }

    static /* synthetic */ Path s0(String str, FileAttribute[] attributes, int i10, Object obj) throws IOException {
        if ((i10 & 1) != 0) {
            str = null;
        }
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Path pathCreateTempDirectory = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        Intrinsics.checkNotNullExpressionValue(pathCreateTempDirectory, "createTempDirectory(...)");
        return pathCreateTempDirectory;
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @NotNull
    public static final Path s1(@NotNull Path path, @NotNull Path base) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(base, "base");
        try {
            return l.f312634a.a(path, base);
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException(e10.getMessage() + "\nthis path: " + path + "\nbase path: " + base, e10);
        }
    }

    public static /* synthetic */ Path t0(Path path, String str, FileAttribute[] fileAttributeArr, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            str = null;
        }
        return r0(path, str, fileAttributeArr);
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @Nullable
    public static final Path t1(@NotNull Path path, @NotNull Path base) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(base, "base");
        try {
            return l.f312634a.a(path, base);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final Path u0(String str, String str2, FileAttribute<?>... attributes) throws IOException {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Path pathCreateTempFile = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        Intrinsics.checkNotNullExpressionValue(pathCreateTempFile, "createTempFile(...)");
        return pathCreateTempFile;
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @NotNull
    public static final Path u1(@NotNull Path path, @NotNull Path base) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(base, "base");
        Path pathT1 = t1(path, base);
        return pathT1 == null ? path : pathT1;
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @NotNull
    public static final Path v0(@Nullable Path path, @Nullable String str, @Nullable String str2, @NotNull FileAttribute<?>... attributes) throws IOException {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        if (path != null) {
            Path pathCreateTempFile = Files.createTempFile(path, str, str2, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
            Intrinsics.checkNotNullExpressionValue(pathCreateTempFile, "createTempFile(...)");
            return pathCreateTempFile;
        }
        Path pathCreateTempFile2 = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        Intrinsics.checkNotNullExpressionValue(pathCreateTempFile2, "createTempFile(...)");
        return pathCreateTempFile2;
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final Path v1(Path path, String attribute, Object obj, LinkOption... options) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(attribute, "attribute");
        Intrinsics.checkNotNullParameter(options, "options");
        Path attribute2 = Files.setAttribute(path, attribute, obj, (LinkOption[]) Arrays.copyOf(options, options.length));
        Intrinsics.checkNotNullExpressionValue(attribute2, "setAttribute(...)");
        return attribute2;
    }

    static /* synthetic */ Path w0(String str, String str2, FileAttribute[] attributes, int i10, Object obj) throws IOException {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Path pathCreateTempFile = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        Intrinsics.checkNotNullExpressionValue(pathCreateTempFile, "createTempFile(...)");
        return pathCreateTempFile;
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final Path w1(Path path, FileTime value) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        Path lastModifiedTime = Files.setLastModifiedTime(path, value);
        Intrinsics.checkNotNullExpressionValue(lastModifiedTime, "setLastModifiedTime(...)");
        return lastModifiedTime;
    }

    public static /* synthetic */ Path x0(Path path, String str, String str2, FileAttribute[] fileAttributeArr, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        return v0(path, str, str2, fileAttributeArr);
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final Path x1(Path path, UserPrincipal value) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        Path owner = Files.setOwner(path, value);
        Intrinsics.checkNotNullExpressionValue(owner, "setOwner(...)");
        return owner;
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final void y0(Path path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Files.delete(path);
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final Path y1(Path path, Set<? extends PosixFilePermission> value) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        Path posixFilePermissions = Files.setPosixFilePermissions(path, value);
        Intrinsics.checkNotNullExpressionValue(posixFilePermissions, "setPosixFilePermissions(...)");
        return posixFilePermissions;
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final boolean z0(Path path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return Files.deleteIfExists(path);
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final Path z1(URI uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Path path = Paths.get(uri);
        Intrinsics.checkNotNullExpressionValue(path, "get(...)");
        return path;
    }
}
