package eb;

import androidx.compose.runtime.internal.w0;
import java.net.URI;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@w0(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f274743b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final URI f274744a;

    public b(@NotNull URI image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f274744a = image;
    }

    @NotNull
    public final URI a() {
        return this.f274744a;
    }
}
