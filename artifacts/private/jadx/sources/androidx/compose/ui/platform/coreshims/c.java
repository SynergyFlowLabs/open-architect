package androidx.compose.ui.platform.coreshims;

import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.annotation.b1;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY})
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f40377a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f40378b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f40379c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f40380d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f40381e = 8;

    @w0(26)
    static class a {
        private a() {
        }

        public static AutofillId a(View view) {
            return view.getAutofillId();
        }
    }

    @w0(29)
    private static class b {
        private b() {
        }

        static ContentCaptureSession a(View view) {
            return view.getContentCaptureSession();
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.coreshims.c$c, reason: collision with other inner class name */
    @w0(30)
    private static class C0319c {
        private C0319c() {
        }

        static void a(View view, int i10) {
            view.setImportantForContentCapture(i10);
        }
    }

    private c() {
    }

    public static androidx.compose.ui.platform.coreshims.a a(View view) {
        return androidx.compose.ui.platform.coreshims.a.b(a.a(view));
    }

    public static androidx.compose.ui.platform.coreshims.b b(View view) {
        ContentCaptureSession contentCaptureSessionA = b.a(view);
        if (contentCaptureSessionA == null) {
            return null;
        }
        return androidx.compose.ui.platform.coreshims.b.j(contentCaptureSessionA, view);
    }

    public static void c(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 30) {
            C0319c.a(view, i10);
        }
    }
}
