package androidx.media3.datasource;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w0 {
    public static /* synthetic */ String a(String str) {
        int length = str.length();
        while (length > 0) {
            int iCodePointBefore = Character.codePointBefore(str, length);
            if (!Character.isWhitespace(iCodePointBefore)) {
                break;
            }
            length -= Character.charCount(iCodePointBefore);
        }
        return str.substring(0, length);
    }
}
