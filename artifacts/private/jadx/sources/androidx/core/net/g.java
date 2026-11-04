package androidx.core.net;

import android.net.Uri;
import com.facebook.share.internal.k;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nUri.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Uri.kt\nandroidx/core/net/UriKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,46:1\n1#2:47\n*E\n"})
public final class g {
    @NotNull
    public static final File a(@NotNull Uri uri) {
        if (!Intrinsics.areEqual(uri.getScheme(), k.f101891c)) {
            throw new IllegalArgumentException(("Uri lacks 'file' scheme: " + uri).toString());
        }
        String path = uri.getPath();
        if (path != null) {
            return new File(path);
        }
        throw new IllegalArgumentException(("Uri path is null: " + uri).toString());
    }

    @NotNull
    public static final Uri b(@NotNull File file) {
        return Uri.fromFile(file);
    }

    @NotNull
    public static final Uri c(@NotNull String str) {
        return Uri.parse(str);
    }
}
