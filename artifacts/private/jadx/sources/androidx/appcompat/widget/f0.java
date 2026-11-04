package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private TextView f11275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.p0
    private TextClassifier f11276b;

    @androidx.annotation.w0(26)
    private static final class a {
        private a() {
        }

        @NonNull
        @androidx.annotation.u
        static TextClassifier a(@NonNull TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
    }

    f0(@NonNull TextView textView) {
        this.f11275a = (TextView) androidx.core.util.t.l(textView);
    }

    @NonNull
    @androidx.annotation.w0(api = 26)
    public TextClassifier a() {
        TextClassifier textClassifier = this.f11276b;
        return textClassifier == null ? a.a(this.f11275a) : textClassifier;
    }

    @androidx.annotation.w0(api = 26)
    public void b(@androidx.annotation.p0 TextClassifier textClassifier) {
        this.f11276b = textClassifier;
    }
}
