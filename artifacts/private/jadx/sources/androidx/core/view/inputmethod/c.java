package androidx.core.view.inputmethod;

import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.core.util.o;
import androidx.core.util.t;
import androidx.core.view.e;
import androidx.core.view.u1;

/* JADX INFO: loaded from: classes2.dex */
@e.a({"PrivateConstructorForUtilityClass"})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f48820a = "InputConnectionCompat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f48821b = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f48822c = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f48823d = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f48824e = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f48825f = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f48826g = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f48827h = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f48828i = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f48829j = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f48830k = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f48831l = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f48832m = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f48833n = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f48834o = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f48835p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f48836q = "androidx.core.view.extra.INPUT_CONTENT_INFO";

    class a extends InputConnectionWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f48837a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InputConnection inputConnection, boolean z10, d dVar) {
            super(inputConnection, z10);
            this.f48837a = dVar;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
            if (this.f48837a.a(androidx.core.view.inputmethod.d.g(inputContentInfo), i10, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i10, bundle);
        }
    }

    class b extends InputConnectionWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f48838a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InputConnection inputConnection, boolean z10, d dVar) {
            super(inputConnection, z10);
            this.f48838a = dVar;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean performPrivateCommand(String str, Bundle bundle) {
            if (c.f(str, bundle, this.f48838a)) {
                return true;
            }
            return super.performPrivateCommand(str, bundle);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.inputmethod.c$c, reason: collision with other inner class name */
    @w0(25)
    static class C0416c {
        private C0416c() {
        }

        static boolean a(InputConnection inputConnection, InputContentInfo inputContentInfo, int i10, Bundle bundle) {
            return inputConnection.commitContent(inputContentInfo, i10, bundle);
        }
    }

    public interface d {
        boolean a(@NonNull androidx.core.view.inputmethod.d dVar, int i10, @p0 Bundle bundle);
    }

    @Deprecated
    public c() {
    }

    public static /* synthetic */ boolean a(View view, androidx.core.view.inputmethod.d dVar, int i10, Bundle bundle) {
        if ((i10 & 1) != 0) {
            try {
                dVar.e();
                Parcelable parcelable = (Parcelable) dVar.f();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable(f48836q, parcelable);
            } catch (Exception unused) {
                return false;
            }
        }
        return u1.r1(view, new e.b(new ClipData(dVar.b(), new ClipData.Item(dVar.a())), 2).e(dVar.c()).c(bundle).a()) == null;
    }

    public static boolean b(@NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo, @NonNull androidx.core.view.inputmethod.d dVar, int i10, @p0 Bundle bundle) {
        return C0416c.a(inputConnection, (InputContentInfo) dVar.f(), i10, bundle);
    }

    @NonNull
    private static d c(@NonNull final View view) {
        t.l(view);
        return new d() { // from class: androidx.core.view.inputmethod.b
            @Override // androidx.core.view.inputmethod.c.d
            public final boolean a(d dVar, int i10, Bundle bundle) {
                return c.a(view, dVar, i10, bundle);
            }
        };
    }

    @NonNull
    public static InputConnection d(@NonNull View view, @NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        return e(inputConnection, editorInfo, c(view));
    }

    @NonNull
    @Deprecated
    public static InputConnection e(@NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo, @NonNull d dVar) {
        o.e(inputConnection, "inputConnection must be non-null");
        o.e(editorInfo, "editorInfo must be non-null");
        o.e(dVar, "onCommitContentListener must be non-null");
        return new a(inputConnection, false, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    static boolean f(@p0 String str, @p0 Bundle bundle, @NonNull d dVar) throws Throwable {
        boolean z10;
        ResultReceiver resultReceiver;
        ?? A = 0;
        A = 0;
        if (bundle == null) {
            return false;
        }
        if (TextUtils.equals(f48821b, str)) {
            z10 = false;
        } else {
            if (!TextUtils.equals(f48822c, str)) {
                return false;
            }
            z10 = true;
        }
        try {
            ResultReceiver resultReceiver2 = (ResultReceiver) bundle.getParcelable(z10 ? f48834o : f48833n);
            try {
                Uri uri = (Uri) bundle.getParcelable(z10 ? f48824e : f48823d);
                ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(z10 ? f48826g : f48825f);
                Uri uri2 = (Uri) bundle.getParcelable(z10 ? f48828i : f48827h);
                int i10 = bundle.getInt(z10 ? f48832m : f48831l);
                Bundle bundle2 = (Bundle) bundle.getParcelable(z10 ? f48830k : f48829j);
                if (uri != null && clipDescription != null) {
                    A = dVar.a(new androidx.core.view.inputmethod.d(uri, clipDescription, uri2), i10, bundle2);
                }
                if (resultReceiver2 != 0) {
                    resultReceiver2.send(A, null);
                }
                return A;
            } catch (Throwable th2) {
                th = th2;
                resultReceiver = resultReceiver2;
                if (resultReceiver != null) {
                    resultReceiver.send(0, null);
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            resultReceiver = null;
        }
    }
}
