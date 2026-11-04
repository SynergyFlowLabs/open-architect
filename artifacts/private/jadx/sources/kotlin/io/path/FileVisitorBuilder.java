package kotlin.io.path;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import kotlin.e1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@e
@e1(version = "1.7")
public interface FileVisitorBuilder {
    void a(@NotNull Function2<? super Path, ? super IOException, ? extends FileVisitResult> function2);

    void b(@NotNull Function2<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> function2);

    void c(@NotNull Function2<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> function2);

    void d(@NotNull Function2<? super Path, ? super IOException, ? extends FileVisitResult> function2);
}
