package k1;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f307527b = "android.hardware.display.category.PRESENTATION";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f307528a;

    private a(Context context) {
        this.f307528a = context;
    }

    @NonNull
    public static a d(@NonNull Context context) {
        return new a(context);
    }

    @p0
    public Display a(int i10) {
        return ((DisplayManager) this.f307528a.getSystemService("display")).getDisplay(i10);
    }

    @NonNull
    public Display[] b() {
        return ((DisplayManager) this.f307528a.getSystemService("display")).getDisplays();
    }

    @NonNull
    public Display[] c(@p0 String str) {
        return ((DisplayManager) this.f307528a.getSystemService("display")).getDisplays();
    }
}
