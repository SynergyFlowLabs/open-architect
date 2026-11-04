package androidx.emoji2.viewsintegration;

import android.os.Handler;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.annotation.w0;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
@w0(19)
@b1({b1.a.LIBRARY})
final class d implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextView f51321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.emoji2.text.f.g f51322b;

    @w0(19)
    @b1({b1.a.LIBRARY})
    static class a extends androidx.emoji2.text.f.g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Reference<TextView> f51323a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Reference<d> f51324b;

        a(TextView textView, d dVar) {
            this.f51323a = new WeakReference(textView);
            this.f51324b = new WeakReference(dVar);
        }

        private boolean c(@p0 TextView textView, @p0 InputFilter inputFilter) {
            if (inputFilter != null && textView != null) {
                InputFilter[] filters = textView.getFilters();
                if (filters == null) {
                    return false;
                }
                for (InputFilter inputFilter2 : filters) {
                    if (inputFilter2 == inputFilter) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // androidx.emoji2.text.f.g
        public void b() {
            Handler handler;
            super.b();
            TextView textView = this.f51323a.get();
            if (textView == null || (handler = textView.getHandler()) == null) {
                return;
            }
            handler.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            CharSequence text;
            CharSequence charSequenceX;
            TextView textView = this.f51323a.get();
            if (c(textView, this.f51324b.get()) && textView.isAttachedToWindow() && text != (charSequenceX = androidx.emoji2.text.f.c().x((text = textView.getText())))) {
                int selectionStart = Selection.getSelectionStart(charSequenceX);
                int selectionEnd = Selection.getSelectionEnd(charSequenceX);
                textView.setText(charSequenceX);
                if (charSequenceX instanceof Spannable) {
                    d.b((Spannable) charSequenceX, selectionStart, selectionEnd);
                }
            }
        }
    }

    d(@NonNull TextView textView) {
        this.f51321a = textView;
    }

    static void b(Spannable spannable, int i10, int i11) {
        if (i10 >= 0 && i11 >= 0) {
            Selection.setSelection(spannable, i10, i11);
        } else if (i10 >= 0) {
            Selection.setSelection(spannable, i10);
        } else if (i11 >= 0) {
            Selection.setSelection(spannable, i11);
        }
    }

    @b1({b1.a.LIBRARY})
    androidx.emoji2.text.f.g a() {
        if (this.f51322b == null) {
            this.f51322b = new a(this.f51321a, this);
        }
        return this.f51322b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
    
        if (r0 != 3) goto L28;
     */
    @Override // android.text.InputFilter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.CharSequence filter(java.lang.CharSequence r4, int r5, int r6, android.text.Spanned r7, int r8, int r9) {
        /*
            r3 = this;
            android.widget.TextView r0 = r3.f51321a
            boolean r0 = r0.isInEditMode()
            if (r0 == 0) goto L9
            goto L4f
        L9:
            androidx.emoji2.text.f r0 = androidx.emoji2.text.f.c()
            int r0 = r0.i()
            if (r0 == 0) goto L50
            r1 = 1
            if (r0 == r1) goto L1a
            r5 = 3
            if (r0 == r5) goto L50
            goto L4f
        L1a:
            if (r9 != 0) goto L30
            r2 = 7
            if (r8 != 0) goto L30
            int r7 = r7.length()
            if (r7 != 0) goto L30
            android.widget.TextView r3 = r3.f51321a
            r2 = 6
            java.lang.CharSequence r3 = r3.getText()
            r2 = 4
            if (r4 != r3) goto L30
            return r4
        L30:
            if (r4 == 0) goto L4f
            if (r5 != 0) goto L3c
            r2 = 6
            int r3 = r4.length()
            if (r6 != r3) goto L3c
            goto L40
        L3c:
            java.lang.CharSequence r4 = r4.subSequence(r5, r6)
        L40:
            androidx.emoji2.text.f r3 = androidx.emoji2.text.f.c()
            r5 = 0
            int r6 = r4.length()
            r2 = 6
            java.lang.CharSequence r3 = r3.y(r4, r5, r6)
            return r3
        L4f:
            return r4
        L50:
            androidx.emoji2.text.f r5 = androidx.emoji2.text.f.c()
            androidx.emoji2.text.f$g r3 = r3.a()
            r5.B(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.viewsintegration.d.filter(java.lang.CharSequence, int, int, android.text.Spanned, int, int):java.lang.CharSequence");
    }
}
