package androidx.compose.ui.focus;

/* JADX INFO: loaded from: classes.dex */
public interface g {
    void a();

    @androidx.compose.ui.o
    @kotlin.l(message = "Use cancelFocusChange instead", replaceWith = @kotlin.b1(expression = "cancelFocusChange", imports = {}))
    default void b() {
        a();
    }

    int c();
}
