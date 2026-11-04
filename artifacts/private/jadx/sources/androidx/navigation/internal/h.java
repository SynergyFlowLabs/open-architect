package androidx.navigation.internal;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.b1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Context f71069a;

    public h(@Nullable Context context) {
        this.f71069a = context;
    }

    @Nullable
    public final Object a() {
        Context context = this.f71069a;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext instanceof Application) {
            return (Application) applicationContext;
        }
        return null;
    }

    @Nullable
    public final Context b() {
        return this.f71069a;
    }

    @NotNull
    public final String c(int i10) {
        try {
            Context context = this.f71069a;
            Intrinsics.checkNotNull(context);
            String resourceName = context.getResources().getResourceName(i10);
            Intrinsics.checkNotNull(resourceName);
            return resourceName;
        } catch (Resources.NotFoundException unused) {
            return String.valueOf(i10);
        }
    }
}
