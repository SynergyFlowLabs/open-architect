package io.ktor.util;

import java.io.File;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nNioPath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NioPath.kt\nio/ktor/util/NioPathKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,60:1\n1#2:61\n346#3,8:62\n*S KotlinDebug\n*F\n+ 1 NioPath.kt\nio/ktor/util/NioPathKt\n*L\n40#1:62,8\n*E\n"})
public final class b1 {
    @NotNull
    public static final File a(@NotNull File file, @NotNull Path relativePath) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(relativePath, "relativePath");
        Path pathD = d(relativePath);
        if (pathD.startsWith("..")) {
            throw new InvalidPathException(relativePath.toString(), "Relative path " + relativePath + " beginning with .. is invalid");
        }
        if (!pathD.isAbsolute()) {
            return new File(file, pathD.toString());
        }
        throw new IllegalStateException(("Bad relative path " + relativePath).toString());
    }

    @NotNull
    public static final Path b(@NotNull Path path, @NotNull Path relativePath) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(relativePath, "relativePath");
        Path pathD = d(relativePath);
        if (pathD.startsWith("..")) {
            throw new InvalidPathException(relativePath.toString(), "Relative path " + relativePath + " beginning with .. is invalid");
        }
        if (pathD.isAbsolute()) {
            throw new IllegalStateException(("Bad relative path " + relativePath).toString());
        }
        if (path.getNameCount() == 0) {
            return pathD;
        }
        Path pathResolve = path.resolve(pathD);
        Intrinsics.checkNotNullExpressionValue(pathResolve, "resolve(...)");
        return pathResolve;
    }

    private static final Path c(Path path) {
        Iterator it = path.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            Object next = it.next();
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (!Intrinsics.areEqual(((Path) next).toString(), "..")) {
                break;
            }
            i10++;
        }
        if (i10 <= 0) {
            return path;
        }
        Path pathSubpath = path.subpath(i10, path.getNameCount());
        Intrinsics.checkNotNullExpressionValue(pathSubpath, "subpath(...)");
        return pathSubpath;
    }

    @NotNull
    public static final Path d(@NotNull Path path) {
        Path pathRelativize;
        Path pathNormalize;
        Path pathC;
        Intrinsics.checkNotNullParameter(path, "<this>");
        Path root = path.getRoot();
        if (root != null && (pathRelativize = root.relativize(path)) != null && (pathNormalize = pathRelativize.normalize()) != null && (pathC = c(pathNormalize)) != null) {
            return pathC;
        }
        Path pathNormalize2 = path.normalize();
        Intrinsics.checkNotNullExpressionValue(pathNormalize2, "normalize(...)");
        return c(pathNormalize2);
    }
}
