package androidx.core.app;

import android.app.PendingIntent;
import android.app.RemoteAction;
import android.graphics.drawable.Icon;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.w0;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes2.dex */
public final class RemoteActionCompat implements androidx.versionedparcelable.h {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NonNull
    @b1({b1.a.LIBRARY_GROUP})
    public IconCompat f46919q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NonNull
    @b1({b1.a.LIBRARY_GROUP})
    public CharSequence f46920r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NonNull
    @b1({b1.a.LIBRARY_GROUP})
    public CharSequence f46921s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NonNull
    @b1({b1.a.LIBRARY_GROUP})
    public PendingIntent f46922t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @b1({b1.a.LIBRARY_GROUP})
    public boolean f46923u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @b1({b1.a.LIBRARY_GROUP})
    public boolean f46924v;

    @w0(26)
    static class a {
        private a() {
        }

        static RemoteAction a(Icon icon, CharSequence charSequence, CharSequence charSequence2, PendingIntent pendingIntent) {
            return new RemoteAction(icon, charSequence, charSequence2, pendingIntent);
        }

        static PendingIntent b(RemoteAction remoteAction) {
            return remoteAction.getActionIntent();
        }

        static CharSequence c(RemoteAction remoteAction) {
            return remoteAction.getContentDescription();
        }

        static Icon d(RemoteAction remoteAction) {
            return remoteAction.getIcon();
        }

        static CharSequence e(RemoteAction remoteAction) {
            return remoteAction.getTitle();
        }

        static boolean f(RemoteAction remoteAction) {
            return remoteAction.isEnabled();
        }

        static void g(RemoteAction remoteAction, boolean z10) {
            remoteAction.setEnabled(z10);
        }
    }

    @w0(28)
    static class b {
        private b() {
        }

        static void a(RemoteAction remoteAction, boolean z10) {
            remoteAction.setShouldShowIcon(z10);
        }

        static boolean b(RemoteAction remoteAction) {
            return remoteAction.shouldShowIcon();
        }
    }

    public RemoteActionCompat(@NonNull IconCompat iconCompat, @NonNull CharSequence charSequence, @NonNull CharSequence charSequence2, @NonNull PendingIntent pendingIntent) {
        this.f46919q = (IconCompat) androidx.core.util.t.l(iconCompat);
        this.f46920r = (CharSequence) androidx.core.util.t.l(charSequence);
        this.f46921s = (CharSequence) androidx.core.util.t.l(charSequence2);
        this.f46922t = (PendingIntent) androidx.core.util.t.l(pendingIntent);
        int i10 = 5 | 1;
        this.f46923u = true;
        this.f46924v = true;
    }

    @NonNull
    @w0(26)
    public static RemoteActionCompat d(@NonNull RemoteAction remoteAction) {
        androidx.core.util.t.l(remoteAction);
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat(IconCompat.n(a.d(remoteAction)), a.e(remoteAction), a.c(remoteAction), a.b(remoteAction));
        remoteActionCompat.k(a.f(remoteAction));
        remoteActionCompat.l(b.b(remoteAction));
        return remoteActionCompat;
    }

    @NonNull
    public PendingIntent f() {
        return this.f46922t;
    }

    @NonNull
    public CharSequence g() {
        return this.f46921s;
    }

    @NonNull
    public IconCompat h() {
        return this.f46919q;
    }

    @NonNull
    public CharSequence i() {
        return this.f46920r;
    }

    public boolean j() {
        return this.f46923u;
    }

    public void k(boolean z10) {
        this.f46923u = z10;
    }

    public void l(boolean z10) {
        this.f46924v = z10;
    }

    @e.a({"KotlinPropertyAccess"})
    public boolean m() {
        return this.f46924v;
    }

    @NonNull
    @w0(26)
    public RemoteAction n() {
        RemoteAction remoteActionA = a.a(this.f46919q.M(), this.f46920r, this.f46921s, this.f46922t);
        a.g(remoteActionA, j());
        b.a(remoteActionA, m());
        return remoteActionA;
    }

    @b1({b1.a.LIBRARY_GROUP})
    public RemoteActionCompat() {
    }

    public RemoteActionCompat(@NonNull RemoteActionCompat remoteActionCompat) {
        androidx.core.util.t.l(remoteActionCompat);
        this.f46919q = remoteActionCompat.f46919q;
        this.f46920r = remoteActionCompat.f46920r;
        this.f46921s = remoteActionCompat.f46921s;
        this.f46922t = remoteActionCompat.f46922t;
        this.f46923u = remoteActionCompat.f46923u;
        this.f46924v = remoteActionCompat.f46924v;
    }
}
