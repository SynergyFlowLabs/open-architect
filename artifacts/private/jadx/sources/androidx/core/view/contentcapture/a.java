package androidx.core.view.contentcapture;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.core.view.j2;
import androidx.core.view.u1;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f48637c = "TREAT_AS_VIEW_TREE_APPEARING";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f48638d = "TREAT_AS_VIEW_TREE_APPEARED";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f48639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f48640b;

    /* JADX INFO: renamed from: androidx.core.view.contentcapture.a$a, reason: collision with other inner class name */
    @w0(23)
    private static class C0413a {
        private C0413a() {
        }

        static Bundle a(ViewStructure viewStructure) {
            return viewStructure.getExtras();
        }
    }

    @w0(29)
    private static class b {
        private b() {
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

        public static void e(ContentCaptureSession contentCaptureSession, AutofillId autofillId, CharSequence charSequence) {
            contentCaptureSession.notifyViewTextChanged(autofillId, charSequence);
        }

        static void f(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
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
    private a(@NonNull ContentCaptureSession contentCaptureSession, @NonNull View view) {
        this.f48639a = contentCaptureSession;
        this.f48640b = view;
    }

    @NonNull
    @w0(29)
    public static a g(@NonNull ContentCaptureSession contentCaptureSession, @NonNull View view) {
        return new a(contentCaptureSession, view);
    }

    @p0
    public AutofillId a(long j10) {
        ContentCaptureSession contentCaptureSession = (ContentCaptureSession) this.f48639a;
        p1.a aVarM = u1.M(this.f48640b);
        Objects.requireNonNull(aVarM);
        return b.a(contentCaptureSession, aVarM.a(), j10);
    }

    @p0
    public j2 b(@NonNull AutofillId autofillId, long j10) {
        return j2.f(b.c((ContentCaptureSession) this.f48639a, autofillId, j10));
    }

    public void c(@NonNull AutofillId autofillId, @p0 CharSequence charSequence) {
        b.e((ContentCaptureSession) this.f48639a, autofillId, charSequence);
    }

    public void d(@NonNull List<ViewStructure> list) {
        if (Build.VERSION.SDK_INT >= 34) {
            c.a((ContentCaptureSession) this.f48639a, list);
            return;
        }
        ViewStructure viewStructureB = b.b((ContentCaptureSession) this.f48639a, this.f48640b);
        int i10 = 1 << 1;
        C0413a.a(viewStructureB).putBoolean(f48637c, true);
        b.d((ContentCaptureSession) this.f48639a, viewStructureB);
        for (int i11 = 0; i11 < list.size(); i11++) {
            b.d((ContentCaptureSession) this.f48639a, list.get(i11));
        }
        ViewStructure viewStructureB2 = b.b((ContentCaptureSession) this.f48639a, this.f48640b);
        C0413a.a(viewStructureB2).putBoolean(f48638d, true);
        b.d((ContentCaptureSession) this.f48639a, viewStructureB2);
    }

    public void e(@NonNull long[] jArr) {
        if (Build.VERSION.SDK_INT >= 34) {
            ContentCaptureSession contentCaptureSession = (ContentCaptureSession) this.f48639a;
            p1.a aVarM = u1.M(this.f48640b);
            Objects.requireNonNull(aVarM);
            b.f(contentCaptureSession, aVarM.a(), jArr);
            return;
        }
        ViewStructure viewStructureB = b.b((ContentCaptureSession) this.f48639a, this.f48640b);
        C0413a.a(viewStructureB).putBoolean(f48637c, true);
        b.d((ContentCaptureSession) this.f48639a, viewStructureB);
        ContentCaptureSession contentCaptureSession2 = (ContentCaptureSession) this.f48639a;
        p1.a aVarM2 = u1.M(this.f48640b);
        Objects.requireNonNull(aVarM2);
        b.f(contentCaptureSession2, aVarM2.a(), jArr);
        ViewStructure viewStructureB2 = b.b((ContentCaptureSession) this.f48639a, this.f48640b);
        C0413a.a(viewStructureB2).putBoolean(f48638d, true);
        b.d((ContentCaptureSession) this.f48639a, viewStructureB2);
    }

    @NonNull
    @w0(29)
    public ContentCaptureSession f() {
        return (ContentCaptureSession) this.f48639a;
    }
}
