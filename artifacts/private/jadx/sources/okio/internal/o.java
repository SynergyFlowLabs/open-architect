package okio.internal;

import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes8.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f335014a = -1;

    public static final long a(int i10, int i11, int i12, int i13, int i14, int i15) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(14, 0);
        gregorianCalendar.set(i10, i11 - 1, i12, i13, i14, i15);
        return gregorianCalendar.getTime().getTime();
    }

    public static final int b() {
        return f335014a;
    }
}
