package o4;

import android.net.Uri;
import coil.request.n;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nStringMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringMapper.kt\ncoil/map/StringMapper\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,11:1\n29#2:12\n*S KotlinDebug\n*F\n+ 1 StringMapper.kt\ncoil/map/StringMapper\n*L\n9#1:12\n*E\n"})
public final class g implements d<String, Uri> {
    @Override // o4.d
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Uri a(@NotNull String str, @NotNull n nVar) {
        return Uri.parse(str);
    }
}
