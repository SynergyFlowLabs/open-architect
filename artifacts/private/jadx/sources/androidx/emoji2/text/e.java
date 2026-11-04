package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.annotation.NonNull;
import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.d
@b1({b1.a.LIBRARY})
class e implements f.InterfaceC0462f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f51060b = 10;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ThreadLocal<StringBuilder> f51061c = new ThreadLocal<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextPaint f51062a;

    e() {
        TextPaint textPaint = new TextPaint();
        this.f51062a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    private static StringBuilder b() {
        ThreadLocal<StringBuilder> threadLocal = f51061c;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return threadLocal.get();
    }

    @Override // androidx.emoji2.text.f.InterfaceC0462f
    public boolean a(@NonNull CharSequence charSequence, int i10, int i11, int i12) {
        StringBuilder sbB = b();
        sbB.setLength(0);
        while (i10 < i11) {
            sbB.append(charSequence.charAt(i10));
            i10++;
        }
        return androidx.core.graphics.l.a(this.f51062a, sbB.toString());
    }
}
