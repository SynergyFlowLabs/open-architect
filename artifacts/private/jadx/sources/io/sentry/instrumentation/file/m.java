package io.sentry.instrumentation.file;

import io.sentry.i1;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class m extends InputStreamReader {
    public m(@NotNull String str) throws FileNotFoundException {
        super(new h(str));
    }

    public m(@NotNull File file) throws FileNotFoundException {
        super(new h(file));
    }

    public m(@NotNull FileDescriptor fileDescriptor) {
        super(new h(fileDescriptor));
    }

    m(@NotNull File file, @NotNull i1 i1Var) throws FileNotFoundException {
        super(new h(file, i1Var));
    }
}
