package io.sentry.instrumentation.file;

import io.sentry.i1;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.OutputStreamWriter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class n extends OutputStreamWriter {
    public n(@NotNull String str) throws FileNotFoundException {
        super(new l(str));
    }

    public n(@NotNull String str, boolean z10) throws FileNotFoundException {
        super(new l(str, z10));
    }

    public n(@NotNull File file) throws FileNotFoundException {
        super(new l(file));
    }

    public n(@NotNull File file, boolean z10) throws FileNotFoundException {
        super(new l(file, z10));
    }

    public n(@NotNull FileDescriptor fileDescriptor) {
        super(new l(fileDescriptor));
    }

    n(@NotNull File file, boolean z10, @NotNull i1 i1Var) throws FileNotFoundException {
        super(new l(file, z10, i1Var));
    }
}
