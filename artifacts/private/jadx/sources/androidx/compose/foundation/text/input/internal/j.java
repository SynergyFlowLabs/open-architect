package androidx.compose.foundation.text.input.internal;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(25)
final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final j f19632a = new j();

    private j() {
    }

    public final boolean a(@NotNull InputConnection inputConnection, @NotNull InputContentInfo inputContentInfo, int i10, @Nullable Bundle bundle) {
        return inputConnection.commitContent(inputContentInfo, i10, bundle);
    }
}
