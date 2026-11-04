package n4;

import coil.request.n;
import java.io.File;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements b<File> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f332728a;

    public a(boolean z10) {
        this.f332728a = z10;
    }

    @Override // n4.b
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String a(@NotNull File file, @NotNull n nVar) {
        if (!this.f332728a) {
            return file.getPath();
        }
        return file.getPath() + AbstractJsonLexerKt.COLON + file.lastModified();
    }
}
