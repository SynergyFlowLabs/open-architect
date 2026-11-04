package androidx.core.view;

import android.app.Activity;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DragAndDropPermissions f49034a;

    @androidx.annotation.w0(24)
    static class a {
        private a() {
        }

        static void a(DragAndDropPermissions dragAndDropPermissions) {
            dragAndDropPermissions.release();
        }

        static DragAndDropPermissions b(Activity activity, DragEvent dragEvent) {
            return activity.requestDragAndDropPermissions(dragEvent);
        }
    }

    private z(DragAndDropPermissions dragAndDropPermissions) {
        this.f49034a = dragAndDropPermissions;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public static z b(@NonNull Activity activity, @NonNull DragEvent dragEvent) {
        DragAndDropPermissions dragAndDropPermissionsB = a.b(activity, dragEvent);
        if (dragAndDropPermissionsB != null) {
            return new z(dragAndDropPermissionsB);
        }
        return null;
    }

    public void a() {
        a.a(this.f49034a);
    }
}
