package androidx.compose.ui.platform.coreshims;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.annotation.b1;
import androidx.annotation.w0;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY})
public class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f40373c = "TREAT_AS_VIEW_TREE_APPEARING";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f40374d = "TREAT_AS_VIEW_TREE_APPEARED";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f40375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f40376b;

    @w0(23)
    private static class a {
        private a() {
        }

        static Bundle a(ViewStructure viewStructure) {
            return viewStructure.getExtras();
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.coreshims.b$b, reason: collision with other inner class name */
    @w0(29)
    private static class C0318b {
        private C0318b() {
        }

        static AutofillId a(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j10) {
            return contentCaptureSession.newAutofillId(autofillId, j10);
        }

        static ViewStructure b(ContentCaptureSession contentCaptureSession, View view) {
            return contentCaptureSession.newViewStructure(view);
        }

        static ViewStructure c(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j10) {
            return contentCaptureSession.newVirtualViewStructure(autofillId, j10);
        }

        static void d(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
            contentCaptureSession.notifyViewAppeared(viewStructure);
        }

        static void e(ContentCaptureSession contentCaptureSession, AutofillId autofillId) {
            contentCaptureSession.notifyViewDisappeared(autofillId);
        }

        public static void f(ContentCaptureSession contentCaptureSession, AutofillId autofillId, CharSequence charSequence) {
            contentCaptureSession.notifyViewTextChanged(autofillId, charSequence);
        }

        static void g(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
            contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
        }
    }

    @w0(34)
    private static class c {
        private c() {
        }

        static void a(ContentCaptureSession contentCaptureSession, List<ViewStructure> list) {
            contentCaptureSession.notifyViewsAppeared(list);
        }
    }

    @w0(29)
    private b(ContentCaptureSession contentCaptureSession, View view) {
        this.f40375a = contentCaptureSession;
        this.f40376b = view;
    }

    @w0(29)
    public static b j(ContentCaptureSession contentCaptureSession, View view) {
        return new b(contentCaptureSession, view);
    }

    public void a() {
        ContentCaptureSession contentCaptureSession = (ContentCaptureSession) this.f40375a;
        androidx.compose.ui.platform.coreshims.a aVarA = androidx.compose.ui.platform.coreshims.c.a(this.f40376b);
        Objects.requireNonNull(aVarA);
        C0318b.g(contentCaptureSession, aVarA.a(), new long[]{Long.MIN_VALUE});
    }

    public AutofillId b(long j10) {
        ContentCaptureSession contentCaptureSession = (ContentCaptureSession) this.f40375a;
        androidx.compose.ui.platform.coreshims.a aVarA = androidx.compose.ui.platform.coreshims.c.a(this.f40376b);
        Objects.requireNonNull(aVarA);
        return C0318b.a(contentCaptureSession, aVarA.a(), j10);
    }

    public d c(AutofillId autofillId, long j10) {
        return d.i(C0318b.c((ContentCaptureSession) this.f40375a, autofillId, j10));
    }

    public void d(ViewStructure viewStructure) {
        C0318b.d((ContentCaptureSession) this.f40375a, viewStructure);
    }

    public void e(AutofillId autofillId) {
        C0318b.e((ContentCaptureSession) this.f40375a, autofillId);
    }

    public void f(AutofillId autofillId, CharSequence charSequence) {
        C0318b.f((ContentCaptureSession) this.f40375a, autofillId, charSequence);
    }

    public void g(List<ViewStructure> list) {
        if (Build.VERSION.SDK_INT >= 34) {
            c.a((ContentCaptureSession) this.f40375a, list);
            return;
        }
        ViewStructure viewStructureB = C0318b.b((ContentCaptureSession) this.f40375a, this.f40376b);
        a.a(viewStructureB).putBoolean(f40373c, true);
        C0318b.d((ContentCaptureSession) this.f40375a, viewStructureB);
        for (int i10 = 0; i10 < list.size(); i10++) {
            C0318b.d((ContentCaptureSession) this.f40375a, list.get(i10));
        }
        ViewStructure viewStructureB2 = C0318b.b((ContentCaptureSession) this.f40375a, this.f40376b);
        a.a(viewStructureB2).putBoolean(f40374d, true);
        C0318b.d((ContentCaptureSession) this.f40375a, viewStructureB2);
    }

    public void h(long[] jArr) {
        if (Build.VERSION.SDK_INT >= 34) {
            ContentCaptureSession contentCaptureSession = (ContentCaptureSession) this.f40375a;
            androidx.compose.ui.platform.coreshims.a aVarA = androidx.compose.ui.platform.coreshims.c.a(this.f40376b);
            Objects.requireNonNull(aVarA);
            C0318b.g(contentCaptureSession, aVarA.a(), jArr);
            return;
        }
        ViewStructure viewStructureB = C0318b.b((ContentCaptureSession) this.f40375a, this.f40376b);
        a.a(viewStructureB).putBoolean(f40373c, true);
        C0318b.d((ContentCaptureSession) this.f40375a, viewStructureB);
        ContentCaptureSession contentCaptureSession2 = (ContentCaptureSession) this.f40375a;
        androidx.compose.ui.platform.coreshims.a aVarA2 = androidx.compose.ui.platform.coreshims.c.a(this.f40376b);
        Objects.requireNonNull(aVarA2);
        C0318b.g(contentCaptureSession2, aVarA2.a(), jArr);
        ViewStructure viewStructureB2 = C0318b.b((ContentCaptureSession) this.f40375a, this.f40376b);
        a.a(viewStructureB2).putBoolean(f40374d, true);
        C0318b.d((ContentCaptureSession) this.f40375a, viewStructureB2);
    }

    @w0(29)
    public ContentCaptureSession i() {
        return (ContentCaptureSession) this.f40375a;
    }
}
