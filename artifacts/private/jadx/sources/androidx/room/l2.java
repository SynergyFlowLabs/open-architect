package androidx.room;

import java.io.File;
import java.io.InputStream;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class l2 implements w3.e.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f75002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final File f75003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final Callable<InputStream> f75004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final w3.e.c f75005d;

    public l2(@Nullable String str, @Nullable File file, @Nullable Callable<InputStream> callable, @NotNull w3.e.c mDelegate) {
        Intrinsics.checkNotNullParameter(mDelegate, "mDelegate");
        this.f75002a = str;
        this.f75003b = file;
        this.f75004c = callable;
        this.f75005d = mDelegate;
    }

    @Override // w3.e.c
    @NotNull
    public w3.e a(@NotNull w3.e.b configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new k2(configuration.f385896a, this.f75002a, this.f75003b, this.f75004c, configuration.f385898c.f385894a, this.f75005d.a(configuration));
    }
}
