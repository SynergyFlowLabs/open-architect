package io.noties.markwon;

import android.text.Spanned;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes8.dex */
public class q implements e.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f297672a;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WeakReference f297673a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Spanned f297674b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TextView.BufferType f297675c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Runnable f297676d;

        a(WeakReference weakReference, Spanned spanned, TextView.BufferType bufferType, Runnable runnable) {
            this.f297673a = weakReference;
            this.f297674b = spanned;
            this.f297675c = bufferType;
            this.f297676d = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                androidx.core.text.g gVarF = q.f((TextView) this.f297673a.get(), this.f297674b);
                if (gVarF != null) {
                    q.d((TextView) this.f297673a.get(), gVarF, this.f297675c, this.f297676d);
                }
            } catch (Throwable unused) {
                q.d((TextView) this.f297673a.get(), this.f297674b, this.f297675c, this.f297676d);
            }
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f297678a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Spanned f297679b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TextView.BufferType f297680c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Runnable f297681d;

        b(TextView textView, Spanned spanned, TextView.BufferType bufferType, Runnable runnable) {
            this.f297678a = textView;
            this.f297679b = spanned;
            this.f297680c = bufferType;
            this.f297681d = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f297678a.setText(this.f297679b, this.f297680c);
            this.f297681d.run();
        }
    }

    q(@NonNull Executor executor) {
        this.f297672a = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(@p0 TextView textView, @NonNull Spanned spanned, @NonNull TextView.BufferType bufferType, @NonNull Runnable runnable) {
        if (textView != null) {
            textView.post(new b(textView, spanned, bufferType, runnable));
        }
    }

    @NonNull
    public static q e(@NonNull Executor executor) {
        return new q(executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @p0
    public static androidx.core.text.g f(@p0 TextView textView, @NonNull Spanned spanned) {
        if (textView == null) {
            return null;
        }
        return androidx.core.text.g.a(spanned, new androidx.core.text.g.b(textView.getTextMetricsParams()));
    }

    @Override // io.noties.markwon.e.b
    public void a(@NonNull TextView textView, @NonNull Spanned spanned, @NonNull TextView.BufferType bufferType, @NonNull Runnable runnable) {
        this.f297672a.execute(new a(new WeakReference(textView), spanned, bufferType, runnable));
    }
}
