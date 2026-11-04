package androidx.compose.ui.platform;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class o0 implements h4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f40672b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f40673a;

    public o0(@NotNull Context context) {
        this.f40673a = context;
    }

    @Override // androidx.compose.ui.platform.h4
    public void a(@NotNull String str) {
        try {
            this.f40673a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException e10) {
            throw new IllegalArgumentException("Can't open " + str + '.', e10);
        }
    }
}
