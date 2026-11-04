package io.sentry;

import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f307137a = "{{auto}}";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<String> f307138b = Arrays.asList(f307137a, "{{ auto }}");

    private y1() {
    }

    public static boolean a(@Nullable String str) {
        return str != null && f307138b.contains(str);
    }
}
