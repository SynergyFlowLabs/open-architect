package o1;

import android.text.method.LinkMovementMethod;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class a extends LinkMovementMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static a f333539a;

    private a() {
    }

    @NonNull
    public static a a() {
        if (f333539a == null) {
            f333539a = new a();
        }
        return f333539a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r0 <= r2.getLineRight(r1)) goto L18;
     */
    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    @androidx.annotation.r0(markerClass = {androidx.core.os.b.InterfaceC0396b.class})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(@androidx.annotation.p0 android.widget.TextView r6, @androidx.annotation.p0 android.text.Spannable r7, @androidx.annotation.p0 android.view.MotionEvent r8) {
        /*
            r5 = this;
            r4 = 1
            boolean r0 = androidx.core.os.b.m()
            r4 = 6
            if (r0 != 0) goto L5e
            int r0 = r8.getAction()
            r1 = 1
            if (r0 == r1) goto L11
            if (r0 != 0) goto L5e
        L11:
            float r0 = r8.getX()
            r4 = 3
            int r0 = (int) r0
            float r1 = r8.getY()
            int r1 = (int) r1
            int r2 = r6.getTotalPaddingLeft()
            int r0 = r0 - r2
            int r2 = r6.getTotalPaddingTop()
            int r1 = r1 - r2
            int r2 = r6.getScrollX()
            r4 = 1
            int r0 = r0 + r2
            int r2 = r6.getScrollY()
            int r1 = r1 + r2
            android.text.Layout r2 = r6.getLayout()
            if (r1 < 0) goto L55
            int r3 = r2.getHeight()
            if (r1 <= r3) goto L3e
            goto L55
        L3e:
            int r1 = r2.getLineForVertical(r1)
            float r0 = (float) r0
            float r3 = r2.getLineLeft(r1)
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            r4 = 1
            if (r3 < 0) goto L55
            r4 = 0
            float r1 = r2.getLineRight(r1)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L5e
        L55:
            android.text.Selection.removeSelection(r7)
            boolean r5 = android.text.method.Touch.onTouchEvent(r6, r7, r8)
            r4 = 0
            return r5
        L5e:
            boolean r5 = super.onTouchEvent(r6, r7, r8)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.a.onTouchEvent(android.widget.TextView, android.text.Spannable, android.view.MotionEvent):boolean");
    }
}
