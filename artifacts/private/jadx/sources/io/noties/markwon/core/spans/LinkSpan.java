package io.noties.markwon.core.spans;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes8.dex */
public class LinkSpan extends URLSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.noties.markwon.core.c f297553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f297554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.noties.markwon.c f297555c;

    public LinkSpan(@NonNull io.noties.markwon.core.c cVar, @NonNull String str, @NonNull io.noties.markwon.c cVar2) {
        super(str);
        this.f297553a = cVar;
        this.f297554b = str;
        this.f297555c = cVar2;
    }

    @NonNull
    public String a() {
        return this.f297554b;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public void onClick(View view) {
        this.f297555c.a(view, this.f297554b);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(@NonNull TextPaint textPaint) {
        this.f297553a.g(textPaint);
    }
}
