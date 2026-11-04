package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f11203a = "ReceiveContent";

    @androidx.annotation.w0(24)
    private static final class a {
        private a() {
        }

        @androidx.annotation.u
        static boolean a(@NonNull DragEvent dragEvent, @NonNull TextView textView, @NonNull Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                androidx.core.view.u1.r1(textView, new androidx.core.view.e.b(dragEvent.getClipData(), 3).a());
                textView.endBatchEdit();
                return true;
            } catch (Throwable th2) {
                textView.endBatchEdit();
                throw th2;
            }
        }

        @androidx.annotation.u
        static boolean b(@NonNull DragEvent dragEvent, @NonNull View view, @NonNull Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            androidx.core.view.u1.r1(view, new androidx.core.view.e.b(dragEvent.getClipData(), 3).a());
            return true;
        }
    }

    private c0() {
    }

    static boolean a(@NonNull View view, @NonNull DragEvent dragEvent) {
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && androidx.core.view.u1.k0(view) != null) {
            Activity activityC = c(view);
            if (activityC == null) {
                Objects.toString(view);
                return false;
            }
            if (dragEvent.getAction() == 1) {
                return !(view instanceof TextView);
            }
            if (dragEvent.getAction() == 3) {
                return view instanceof TextView ? a.a(dragEvent, (TextView) view, activityC) : a.b(dragEvent, view, activityC);
            }
        }
        return false;
    }

    static boolean b(@NonNull TextView textView, int i10) {
        if (Build.VERSION.SDK_INT >= 31 || androidx.core.view.u1.k0(textView) == null || !(i10 == 16908322 || i10 == 16908337)) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            androidx.core.view.u1.r1(textView, new androidx.core.view.e.b(primaryClip, 1).d(i10 != 16908322 ? 1 : 0).a());
        }
        return true;
    }

    @androidx.annotation.p0
    static Activity c(@NonNull View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
