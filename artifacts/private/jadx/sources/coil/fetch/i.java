package coil.fetch;

import android.webkit.MimeTypeMap;
import coil.decode.a0;
import coil.request.n;
import java.io.File;
import okio.r0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final File f87356a;

    public static final class a implements h.a<File> {
        @Override // coil.fetch.h.a
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public h a(@NotNull File file, @NotNull n nVar, @NotNull coil.j jVar) {
            return new i(file);
        }
    }

    public i(@NotNull File file) {
        this.f87356a = file;
    }

    @Override // coil.fetch.h
    @Nullable
    public Object a(@NotNull kotlin.coroutines.d<? super g> dVar) {
        return new m(a0.q(r0.a.g(r0.f335070b, this.f87356a, false, 1, null), null, null, null, 14, null), MimeTypeMap.getSingleton().getMimeTypeFromExtension(kotlin.io.l.b0(this.f87356a)), coil.decode.e.DISK);
    }
}
