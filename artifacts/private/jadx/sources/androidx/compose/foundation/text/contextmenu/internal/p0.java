package androidx.compose.foundation.text.contextmenu.internal;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(34)
final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final p0 f18918a = new p0();

    private p0() {
    }

    public final void a(@NotNull PendingIntent pendingIntent) {
        try {
            pendingIntent.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
        } catch (PendingIntent.CanceledException e10) {
            Objects.toString(pendingIntent);
            e10.toString();
        }
    }
}
