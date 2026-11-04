package androidx.core.app;

import android.app.GrammaticalInflectionManager;
import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.r0;
import androidx.annotation.w0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f47116a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f47117b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f47118c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f47119d = 3;

    @w0(34)
    static class a {
        private a() {
        }

        static int a(Context context) {
            return b(context).getApplicationGrammaticalGender();
        }

        private static GrammaticalInflectionManager b(Context context) {
            return (GrammaticalInflectionManager) context.getSystemService(GrammaticalInflectionManager.class);
        }

        static void c(Context context, int i10) {
            b(context).setRequestedApplicationGrammaticalGender(i10);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY})
    public @interface b {
    }

    private o() {
    }

    @androidx.annotation.d
    @r0(markerClass = {androidx.core.os.b.InterfaceC0396b.class})
    public static int a(@NonNull Context context) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.a(context);
        }
        return 0;
    }

    @androidx.annotation.d
    @r0(markerClass = {androidx.core.os.b.InterfaceC0396b.class})
    public static void b(@NonNull Context context, int i10) {
        if (Build.VERSION.SDK_INT >= 34) {
            a.c(context, i10);
        }
    }
}
