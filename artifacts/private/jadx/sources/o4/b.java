package o4;

import android.net.Uri;
import coil.request.n;
import coil.util.l;
import com.facebook.share.internal.k;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nFileUriMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileUriMapper.kt\ncoil/map/FileUriMapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,29:1\n1#2:30\n*E\n"})
public final class b implements d<Uri, File> {
    private final boolean b(Uri uri) {
        String scheme;
        if (!l.z(uri) && ((scheme = uri.getScheme()) == null || Intrinsics.areEqual(scheme, k.f101891c))) {
            String path = uri.getPath();
            if (path == null) {
                path = "";
            }
            if (StringsKt.d5(path, '/', false, 2, null) && l.n(uri) != null) {
                return true;
            }
        }
        return false;
    }

    @Override // o4.d
    @Nullable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public File a(@NotNull Uri uri, @NotNull n nVar) {
        if (!b(uri)) {
            return null;
        }
        if (!Intrinsics.areEqual(uri.getScheme(), k.f101891c)) {
            return new File(uri.toString());
        }
        String path = uri.getPath();
        if (path != null) {
            return new File(path);
        }
        return null;
    }
}
