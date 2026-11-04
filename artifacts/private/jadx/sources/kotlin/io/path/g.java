package kotlin.io.path;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class g extends SimpleFileVisitor<Path> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Function2<Path, BasicFileAttributes, FileVisitResult> f312617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Function2<Path, BasicFileAttributes, FileVisitResult> f312618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final Function2<Path, IOException, FileVisitResult> f312619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final Function2<Path, IOException, FileVisitResult> f312620d;

    /* JADX WARN: Multi-variable type inference failed */
    public g(@Nullable Function2<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> function2, @Nullable Function2<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> function3, @Nullable Function2<? super Path, ? super IOException, ? extends FileVisitResult> function4, @Nullable Function2<? super Path, ? super IOException, ? extends FileVisitResult> function5) {
        this.f312617a = function2;
        this.f312618b = function3;
        this.f312619c = function4;
        this.f312620d = function5;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public FileVisitResult postVisitDirectory(@NotNull Path dir, @Nullable IOException iOException) throws IOException {
        FileVisitResult fileVisitResultInvoke;
        Intrinsics.checkNotNullParameter(dir, "dir");
        Function2<Path, IOException, FileVisitResult> function2 = this.f312620d;
        if (function2 != null && (fileVisitResultInvoke = function2.invoke(dir, iOException)) != null) {
            return fileVisitResultInvoke;
        }
        FileVisitResult fileVisitResultPostVisitDirectory = super.postVisitDirectory(dir, iOException);
        Intrinsics.checkNotNullExpressionValue(fileVisitResultPostVisitDirectory, "postVisitDirectory(...)");
        return fileVisitResultPostVisitDirectory;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FileVisitResult preVisitDirectory(@NotNull Path dir, @NotNull BasicFileAttributes attrs) throws IOException {
        FileVisitResult fileVisitResultInvoke;
        Intrinsics.checkNotNullParameter(dir, "dir");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Function2<Path, BasicFileAttributes, FileVisitResult> function2 = this.f312617a;
        if (function2 != null && (fileVisitResultInvoke = function2.invoke(dir, attrs)) != null) {
            return fileVisitResultInvoke;
        }
        FileVisitResult fileVisitResultPreVisitDirectory = super.preVisitDirectory(dir, attrs);
        Intrinsics.checkNotNullExpressionValue(fileVisitResultPreVisitDirectory, "preVisitDirectory(...)");
        return fileVisitResultPreVisitDirectory;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    @NotNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public FileVisitResult visitFile(@NotNull Path file, @NotNull BasicFileAttributes attrs) throws IOException {
        FileVisitResult fileVisitResultInvoke;
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Function2<Path, BasicFileAttributes, FileVisitResult> function2 = this.f312618b;
        if (function2 != null && (fileVisitResultInvoke = function2.invoke(file, attrs)) != null) {
            return fileVisitResultInvoke;
        }
        FileVisitResult fileVisitResultVisitFile = super.visitFile(file, attrs);
        Intrinsics.checkNotNullExpressionValue(fileVisitResultVisitFile, "visitFile(...)");
        return fileVisitResultVisitFile;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public FileVisitResult visitFileFailed(@NotNull Path file, @NotNull IOException exc) throws IOException {
        FileVisitResult fileVisitResultInvoke;
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(exc, "exc");
        Function2<Path, IOException, FileVisitResult> function2 = this.f312619c;
        if (function2 != null && (fileVisitResultInvoke = function2.invoke(file, exc)) != null) {
            return fileVisitResultInvoke;
        }
        FileVisitResult fileVisitResultVisitFileFailed = super.visitFileFailed(file, exc);
        Intrinsics.checkNotNullExpressionValue(fileVisitResultVisitFileFailed, "visitFileFailed(...)");
        return fileVisitResultVisitFileFailed;
    }
}
