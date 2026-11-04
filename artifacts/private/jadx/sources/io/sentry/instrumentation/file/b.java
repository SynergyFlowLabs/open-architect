package io.sentry.instrumentation.file;

import io.sentry.n8;
import io.sentry.p1;
import java.io.File;
import java.io.FileInputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    final File f305577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    final p1 f305578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    final FileInputStream f305579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    final n8 f305580d;

    b(@Nullable File file, @Nullable p1 p1Var, @NotNull FileInputStream fileInputStream, @NotNull n8 n8Var) {
        this.f305577a = file;
        this.f305578b = p1Var;
        this.f305579c = fileInputStream;
        this.f305580d = n8Var;
    }
}
