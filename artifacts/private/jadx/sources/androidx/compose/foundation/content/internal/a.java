package androidx.compose.foundation.content.internal;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import android.view.View;
import androidx.compose.ui.draganddrop.l;
import androidx.compose.ui.node.j;
import androidx.core.view.z;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    private static final boolean a(ClipData clipData) {
        int itemCount = clipData.getItemCount();
        for (int i10 = 0; i10 < itemCount; i10++) {
            Uri uri = clipData.getItemAt(i10).getUri();
            if (uri != null && Intrinsics.areEqual(uri.getScheme(), FirebaseAnalytics.d.P)) {
                return true;
            }
        }
        return false;
    }

    public static final void b(@NotNull j jVar, @NotNull androidx.compose.ui.draganddrop.b bVar) {
        Activity activityC;
        if (a(l.c(bVar).getClipData()) && jVar.w().a9() && (activityC = c(androidx.compose.ui.node.l.a(jVar))) != null) {
            z.b(activityC, l.c(bVar));
        }
    }

    private static final Activity c(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
