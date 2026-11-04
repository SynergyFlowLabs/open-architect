package io.noties.markwon.movement;

import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import io.noties.markwon.i;

/* JADX INFO: loaded from: classes8.dex */
public class a extends io.noties.markwon.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private final MovementMethod f297661a;

    a(@p0 MovementMethod movementMethod) {
        this.f297661a = movementMethod;
    }

    @NonNull
    @Deprecated
    public static a l() {
        return m(LinkMovementMethod.getInstance());
    }

    @NonNull
    public static a m(@NonNull MovementMethod movementMethod) {
        return new a(movementMethod);
    }

    @NonNull
    public static a n() {
        return m(LinkMovementMethod.getInstance());
    }

    @NonNull
    public static a o() {
        return new a(null);
    }

    @Override // io.noties.markwon.a, io.noties.markwon.i
    public void a(@NonNull i.b bVar) {
        ((io.noties.markwon.core.a) bVar.b(io.noties.markwon.core.a.class)).x(true);
    }

    @Override // io.noties.markwon.a, io.noties.markwon.i
    public void k(@NonNull TextView textView, @NonNull Spanned spanned) {
        MovementMethod movementMethod = textView.getMovementMethod();
        MovementMethod movementMethod2 = this.f297661a;
        if (movementMethod != movementMethod2) {
            textView.setMovementMethod(movementMethod2);
        }
    }
}
