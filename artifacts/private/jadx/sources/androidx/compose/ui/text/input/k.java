package androidx.compose.ui.text.input;

/* JADX INFO: loaded from: classes2.dex */
public final class k {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(char c10, char c11) {
        return Character.isHighSurrogate(c10) && Character.isLowSurrogate(c11);
    }
}
