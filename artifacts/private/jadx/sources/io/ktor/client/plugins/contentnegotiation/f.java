package io.ktor.client.plugins.contentnegotiation;

import java.io.InputStream;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.j1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Set<kotlin.reflect.d<?>> f294696a = SetsKt.mutableSetOf(j1.d(InputStream.class));

    static {
        int i10 = 2 << 1;
    }

    @NotNull
    public static final Set<kotlin.reflect.d<?>> a() {
        return f294696a;
    }
}
