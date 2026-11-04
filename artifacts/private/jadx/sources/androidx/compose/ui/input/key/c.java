package androidx.compose.ui.input.key;

import android.view.KeyEvent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.g
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final KeyEvent f38912a;

    private /* synthetic */ c(KeyEvent keyEvent) {
        this.f38912a = keyEvent;
    }

    public static final /* synthetic */ c a(KeyEvent keyEvent) {
        return new c(keyEvent);
    }

    @NotNull
    public static KeyEvent b(@NotNull KeyEvent keyEvent) {
        return keyEvent;
    }

    public static boolean c(KeyEvent keyEvent, Object obj) {
        return (obj instanceof c) && Intrinsics.areEqual(keyEvent, ((c) obj).h());
    }

    public static final boolean d(KeyEvent keyEvent, KeyEvent keyEvent2) {
        return Intrinsics.areEqual(keyEvent, keyEvent2);
    }

    public static int f(KeyEvent keyEvent) {
        return keyEvent.hashCode();
    }

    public static String g(KeyEvent keyEvent) {
        return "KeyEvent(nativeKeyEvent=" + keyEvent + ')';
    }

    @NotNull
    public final KeyEvent e() {
        return this.f38912a;
    }

    public boolean equals(Object obj) {
        return c(this.f38912a, obj);
    }

    public final /* synthetic */ KeyEvent h() {
        return this.f38912a;
    }

    public int hashCode() {
        return f(this.f38912a);
    }

    public String toString() {
        return g(this.f38912a);
    }
}
