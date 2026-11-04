package io.sentry.android.replay.util;

import android.text.Layout;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 0)
public final class a implements q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f304998b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Layout f304999a;

    public a(@NotNull Layout layout) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.f304999a = layout;
    }

    @Override // io.sentry.android.replay.util.q
    public int a(int i10) {
        return this.f304999a.getLineTop(i10);
    }

    @Override // io.sentry.android.replay.util.q
    public int b(int i10) {
        return this.f304999a.getLineStart(i10);
    }

    @Override // io.sentry.android.replay.util.q
    public float c(int i10, int i11) {
        return this.f304999a.getPrimaryHorizontal(i11);
    }

    @Override // io.sentry.android.replay.util.q
    @Nullable
    public Integer d() {
        int i10;
        if (!(this.f304999a.getText() instanceof Spanned)) {
            return null;
        }
        CharSequence text = this.f304999a.getText();
        Intrinsics.checkNotNull(text, "null cannot be cast to non-null type android.text.Spanned");
        ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) ((Spanned) text).getSpans(0, this.f304999a.getText().length(), ForegroundColorSpan.class);
        Intrinsics.checkNotNull(foregroundColorSpanArr);
        int i11 = Integer.MIN_VALUE;
        Integer numValueOf = null;
        for (ForegroundColorSpan foregroundColorSpan : foregroundColorSpanArr) {
            CharSequence text2 = this.f304999a.getText();
            Intrinsics.checkNotNull(text2, "null cannot be cast to non-null type android.text.Spanned");
            int spanStart = ((Spanned) text2).getSpanStart(foregroundColorSpan);
            CharSequence text3 = this.f304999a.getText();
            Intrinsics.checkNotNull(text3, "null cannot be cast to non-null type android.text.Spanned");
            int spanEnd = ((Spanned) text3).getSpanEnd(foregroundColorSpan);
            if (spanStart != -1 && spanEnd != -1 && (i10 = spanEnd - spanStart) > i11) {
                numValueOf = Integer.valueOf(foregroundColorSpan.getForegroundColor());
                i11 = i10;
            }
        }
        if (numValueOf != null) {
            return Integer.valueOf(r.j(numValueOf.intValue()));
        }
        return null;
    }

    @Override // io.sentry.android.replay.util.q
    public int e(int i10) {
        return this.f304999a.getLineBottom(i10);
    }

    @Override // io.sentry.android.replay.util.q
    public int f(int i10) {
        return this.f304999a.getLineVisibleEnd(i10);
    }

    @Override // io.sentry.android.replay.util.q
    public int g() {
        return this.f304999a.getLineCount();
    }

    @Override // io.sentry.android.replay.util.q
    public int h(int i10) {
        return this.f304999a.getEllipsisCount(i10);
    }
}
