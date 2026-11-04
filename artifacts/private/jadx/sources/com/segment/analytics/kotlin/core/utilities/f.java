package com.segment.analytics.kotlin.core.utilities;

import java.io.InputStream;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface f {

    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void a(f fVar, Function1 function1, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: finishAndClose");
            }
            if ((i10 & 1) != 0) {
                function1 = null;
            }
            fVar.a(function1);
        }
    }

    void a(@Nullable Function1<? super String, String> function1);

    @Nullable
    InputStream b(@NotNull String str);

    boolean c();

    void close();

    boolean d(@NotNull String str);

    long getLength();

    @NotNull
    List<String> read();

    void remove(@NotNull String str);

    void write(@NotNull String str);
}
