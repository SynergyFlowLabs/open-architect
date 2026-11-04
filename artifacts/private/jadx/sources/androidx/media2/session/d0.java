package androidx.media2.session;

import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.media2.common.SessionPlayer;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d0 extends SessionPlayer {
    public static final int Y = 0;
    public static final int Z = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final int f58831p0 = 2;

    public static class a extends SessionPlayer.b {
        public void r(@NonNull d0 d0Var, int i10) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY})
    public @interface b {
    }

    @NonNull
    public abstract Future<SessionPlayer.c> m(int i10);

    public abstract int o();

    public abstract int q();

    public abstract int r();

    @NonNull
    public abstract Future<SessionPlayer.c> t(int i10);
}
