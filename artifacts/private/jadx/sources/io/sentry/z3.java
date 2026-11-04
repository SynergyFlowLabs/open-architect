package io.sentry;

import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public interface z3 {
    void C1(boolean z10);

    z3 F0() throws IOException;

    z3 F1() throws IOException;

    z3 J0() throws IOException;

    @Nullable
    String a();

    z3 b(@Nullable String str) throws IOException;

    z3 c(long j10) throws IOException;

    z3 d(double d10) throws IOException;

    z3 e(boolean z10) throws IOException;

    z3 f(@NotNull String str) throws IOException;

    z3 g(@Nullable String str) throws IOException;

    void h(@Nullable String str);

    z3 i(@Nullable Number number) throws IOException;

    z3 j(@NotNull ILogger iLogger, @Nullable Object obj) throws IOException;

    z3 k(@Nullable Boolean bool) throws IOException;

    z3 l() throws IOException;

    z3 m1() throws IOException;
}
