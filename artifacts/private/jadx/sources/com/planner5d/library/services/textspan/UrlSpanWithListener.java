package com.planner5d.library.services.textspan;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.l;

/* JADX INFO: loaded from: classes10.dex */
public class UrlSpanWithListener extends URLSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f224988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @l
    private final Integer f224989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f224990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f224991d;

    public interface a {
        void a(String str);
    }

    public UrlSpanWithListener(String str, a aVar, @l Integer num, boolean z10, boolean z11) {
        super(str);
        this.f224990c = z10;
        this.f224988a = aVar;
        this.f224989b = num;
        this.f224991d = z11;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public void onClick(View view) {
        a aVar = this.f224988a;
        if (aVar != null) {
            aVar.a(getURL());
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(@NonNull TextPaint textPaint) {
        textPaint.setUnderlineText(this.f224991d);
        Integer num = this.f224989b;
        if (num != null) {
            textPaint.setColor(num.intValue());
        } else {
            if (this.f224990c) {
                return;
            }
            textPaint.setColor(textPaint.linkColor);
        }
    }
}
