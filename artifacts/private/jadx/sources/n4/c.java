package n4;

import android.net.Uri;
import coil.request.n;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.codec.language.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements b<Uri> {
    @Override // n4.b
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String a(@NotNull Uri uri, @NotNull n nVar) {
        if (!Intrinsics.areEqual(uri.getScheme(), "android.resource")) {
            return uri.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(uri);
        sb2.append(l.f335457d);
        sb2.append(coil.util.l.s(nVar.g().getResources().getConfiguration()));
        return sb2.toString();
    }
}
