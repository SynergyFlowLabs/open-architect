package kotlinx.io.files;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
final class h implements g {
    @Override // kotlinx.io.files.g
    @a
    public void a(@NotNull i source, @NotNull i destination) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (!source.a().exists()) {
            throw new FileNotFoundException("Source file does not exist: " + source.a());
        }
        try {
            Files.move(source.a().toPath(), destination.a().toPath(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (Throwable th2) {
            if (!(th2 instanceof IOException)) {
                throw new IOException("Move failed", th2);
            }
            throw th2;
        }
    }
}
