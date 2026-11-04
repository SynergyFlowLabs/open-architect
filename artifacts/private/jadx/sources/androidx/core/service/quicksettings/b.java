package androidx.core.service.quicksettings;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.service.quicksettings.TileService;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static c f48203a;

    @w0(24)
    private static class a {
        private a() {
        }

        static void a(TileService tileService, Intent intent) {
            tileService.startActivityAndCollapse(intent);
        }
    }

    /* JADX INFO: renamed from: androidx.core.service.quicksettings.b$b, reason: collision with other inner class name */
    @w0(34)
    private static class C0401b {
        private C0401b() {
        }

        static void a(TileService tileService, PendingIntent pendingIntent) {
            tileService.startActivityAndCollapse(pendingIntent);
        }
    }

    interface c {
        void a(Intent intent);

        void b(PendingIntent pendingIntent);
    }

    private b() {
    }

    @b1({b1.a.LIBRARY})
    public static void a() {
        f48203a = null;
    }

    @b1({b1.a.LIBRARY})
    public static void b(@NonNull c cVar) {
        f48203a = cVar;
    }

    public static void c(@NonNull TileService tileService, @NonNull androidx.core.service.quicksettings.a aVar) {
        if (Build.VERSION.SDK_INT >= 34) {
            c cVar = f48203a;
            if (cVar != null) {
                cVar.b(aVar.f());
                return;
            } else {
                C0401b.a(tileService, aVar.f());
                return;
            }
        }
        c cVar2 = f48203a;
        if (cVar2 != null) {
            cVar2.a(aVar.d());
        } else {
            a.a(tileService, aVar.d());
        }
    }
}
