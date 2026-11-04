package coil.fetch;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import coil.decode.a0;
import coil.request.n;
import kotlin.collections.CollectionsKt;
import okio.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Uri f87343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final n f87344b;

    /* JADX INFO: renamed from: coil.fetch.a$a, reason: collision with other inner class name */
    public static final class C0818a implements h.a<Uri> {
        @Override // coil.fetch.h.a
        @Nullable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public h a(@NotNull Uri uri, @NotNull n nVar, @NotNull coil.j jVar) {
            if (coil.util.l.z(uri)) {
                return new a(uri, nVar);
            }
            return null;
        }
    }

    public a(@NotNull Uri uri, @NotNull n nVar) {
        this.f87343a = uri;
        this.f87344b = nVar;
    }

    @Override // coil.fetch.h
    @Nullable
    public Object a(@NotNull kotlin.coroutines.d<? super g> dVar) {
        String strJoinToString$default = CollectionsKt.joinToString$default(CollectionsKt.drop(this.f87343a.getPathSegments(), 1), "/", null, null, 0, null, null, 62, null);
        return new m(a0.j(l0.e(l0.u(this.f87344b.g().getAssets().open(strJoinToString$default))), this.f87344b.g(), new coil.decode.a(strJoinToString$default)), coil.util.l.q(MimeTypeMap.getSingleton(), strJoinToString$default), coil.decode.e.DISK);
    }
}
