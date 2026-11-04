package androidx.activity.compose;

import android.content.Context;
import android.content.ContextWrapper;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final /* synthetic */ <T> T a(Context context) {
        for (Object obj = context; obj instanceof ContextWrapper; obj = (T) ((ContextWrapper) obj).getBaseContext()) {
            Intrinsics.reifiedOperationMarker(3, androidx.exifinterface.media.a.f51379e5);
            if (obj != null) {
                return (T) obj;
            }
        }
        return null;
    }
}
