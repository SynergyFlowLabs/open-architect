package androidx.core.text;

import android.text.Spanned;
import android.text.SpannedString;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class j {
    public static final /* synthetic */ <T> T[] a(Spanned spanned, int i10, int i11) {
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        return (T[]) spanned.getSpans(i10, i11, Object.class);
    }

    public static /* synthetic */ Object[] b(Spanned spanned, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = spanned.length();
        }
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        return spanned.getSpans(i10, i11, Object.class);
    }

    @NotNull
    public static final Spanned c(@NotNull CharSequence charSequence) {
        return SpannedString.valueOf(charSequence);
    }
}
