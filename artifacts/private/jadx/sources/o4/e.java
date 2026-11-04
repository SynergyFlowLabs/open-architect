package o4;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import androidx.annotation.v;
import coil.request.n;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nResourceIntMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResourceIntMapper.kt\ncoil/map/ResourceIntMapper\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,26:1\n29#2:27\n*S KotlinDebug\n*F\n+ 1 ResourceIntMapper.kt\ncoil/map/ResourceIntMapper\n*L\n15#1:27\n*E\n"})
public final class e implements d<Integer, Uri> {
    private final boolean b(@v int i10, Context context) {
        try {
            return context.getResources().getResourceEntryName(i10) != null;
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }

    @Override // o4.d
    public /* bridge */ /* synthetic */ Uri a(Integer num, n nVar) {
        return c(num.intValue(), nVar);
    }

    @Nullable
    public Uri c(@v int i10, @NotNull n nVar) {
        if (!b(i10, nVar.g())) {
            return null;
        }
        return Uri.parse("android.resource://" + nVar.g().getPackageName() + '/' + i10);
    }
}
