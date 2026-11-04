package kotlin.io.path;

import java.nio.file.Path;
import java.nio.file.Paths;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final l f312634a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Path f312635b = Paths.get("", new String[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Path f312636c = Paths.get("..", new String[0]);

    private l() {
    }

    @NotNull
    public final Path a(@NotNull Path path, @NotNull Path base) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(base, "base");
        Path pathNormalize = base.normalize();
        Path pathNormalize2 = path.normalize();
        Path pathRelativize = pathNormalize.relativize(pathNormalize2);
        int iMin = Math.min(pathNormalize.getNameCount(), pathNormalize2.getNameCount());
        for (int i10 = 0; i10 < iMin; i10++) {
            Path name = pathNormalize.getName(i10);
            Path path2 = f312636c;
            if (!Intrinsics.areEqual(name, path2)) {
                break;
            }
            if (!Intrinsics.areEqual(pathNormalize2.getName(i10), path2)) {
                throw new IllegalArgumentException("Unable to compute relative path");
            }
        }
        if (Intrinsics.areEqual(pathNormalize2, pathNormalize) || !Intrinsics.areEqual(pathNormalize, f312635b)) {
            String string = pathRelativize.toString();
            String separator = pathRelativize.getFileSystem().getSeparator();
            Intrinsics.checkNotNullExpressionValue(separator, "getSeparator(...)");
            int i11 = 0 << 0;
            pathNormalize2 = StringsKt.M1(string, separator, false, 2, null) ? pathRelativize.getFileSystem().getPath(StringsKt.C6(string, pathRelativize.getFileSystem().getSeparator().length()), new String[0]) : pathRelativize;
        }
        Intrinsics.checkNotNull(pathNormalize2);
        return pathNormalize2;
    }
}
