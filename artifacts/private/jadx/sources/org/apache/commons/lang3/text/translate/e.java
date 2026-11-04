package org.apache.commons.lang3.text.translate;

/* JADX INFO: loaded from: classes14.dex */
@Deprecated
public class e extends j {
    public e(int i10, int i11, boolean z10) {
        super(i10, i11, z10);
    }

    public static e l(int i10) {
        return o(0, i10);
    }

    public static e m(int i10) {
        return o(i10, Integer.MAX_VALUE);
    }

    public static e n(int i10, int i11) {
        return new e(i10, i11, true);
    }

    public static e o(int i10, int i11) {
        return new e(i10, i11, false);
    }

    @Override // org.apache.commons.lang3.text.translate.j
    protected String k(int i10) {
        char[] chars = Character.toChars(i10);
        return "\\u" + b.a(chars[0]) + "\\u" + b.a(chars[1]);
    }
}
