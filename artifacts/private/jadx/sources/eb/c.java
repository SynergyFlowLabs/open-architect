package eb;

import androidx.compose.runtime.internal.w0;
import java.net.URI;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@w0(parameters = 0)
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f274745d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f274746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final URI f274747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f274748c;

    public c(@NotNull String author, @Nullable URI uri, float f10) {
        Intrinsics.checkNotNullParameter(author, "author");
        this.f274746a = author;
        this.f274747b = uri;
        this.f274748c = f10;
    }

    @NotNull
    public final String a() {
        return this.f274746a;
    }

    @Nullable
    public final URI b() {
        return this.f274747b;
    }

    public final float c() {
        return this.f274748c;
    }
}
