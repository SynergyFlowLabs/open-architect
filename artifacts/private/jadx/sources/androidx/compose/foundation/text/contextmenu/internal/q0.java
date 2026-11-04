package androidx.compose.foundation.text.contextmenu.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.view.textclassifier.TextClassification;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@androidx.annotation.w0(28)
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final q0 f18920a = new q0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f18921b = 0;

    private q0() {
    }

    public final void a(@NotNull Context context, @NotNull TextClassification textClassification) throws PendingIntent.CanceledException {
        String text = textClassification.getText();
        b(PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592));
    }

    public final void b(@NotNull PendingIntent pendingIntent) throws PendingIntent.CanceledException {
        if (Build.VERSION.SDK_INT >= 34) {
            p0.f18918a.a(pendingIntent);
        } else {
            pendingIntent.send();
        }
    }
}
