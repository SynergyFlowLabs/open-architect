package io.noties.markwon;

import android.text.Spanned;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes8.dex */
public class p implements e.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private final Executor f297671a;

    p(@p0 Executor executor) {
        this.f297671a = executor;
    }

    @NonNull
    public static p b() {
        return new p(null);
    }

    @NonNull
    public static p c(@p0 Executor executor) {
        return new p(executor);
    }

    @Override // io.noties.markwon.e.b
    public void a(@NonNull TextView textView, @NonNull Spanned spanned, @NonNull TextView.BufferType bufferType, @NonNull Runnable runnable) {
        if (textView instanceof AppCompatTextView) {
            AppCompatTextView appCompatTextView = (AppCompatTextView) textView;
            appCompatTextView.setTextFuture(androidx.core.text.g.g(spanned, appCompatTextView.getTextMetricsParamsCompat(), this.f297671a));
            runnable.run();
        } else {
            throw new IllegalStateException("TextView provided is not an instance of AppCompatTextView, cannot call setTextFuture(), textView: " + textView);
        }
    }
}
