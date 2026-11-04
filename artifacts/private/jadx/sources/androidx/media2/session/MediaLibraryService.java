package androidx.media2.session;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.g0;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.media2.common.SessionPlayer;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MediaLibraryService extends w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f58610c = "androidx.media2.session.MediaLibraryService";

    public static final class LibraryParams implements androidx.versionedparcelable.h {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Bundle f58611q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f58612r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f58613s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f58614t;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f58615a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private boolean f58616b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private boolean f58617c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private Bundle f58618d;

            @NonNull
            public LibraryParams a() {
                return new LibraryParams(this.f58618d, this.f58615a, this.f58616b, this.f58617c);
            }

            @NonNull
            public a b(@p0 Bundle bundle) {
                this.f58618d = bundle;
                return this;
            }

            @NonNull
            public a c(boolean z10) {
                this.f58616b = z10;
                return this;
            }

            @NonNull
            public a d(boolean z10) {
                this.f58615a = z10;
                return this;
            }

            @NonNull
            public a e(boolean z10) {
                this.f58617c = z10;
                return this;
            }
        }

        LibraryParams() {
        }

        private static boolean d(int i10) {
            return i10 != 0;
        }

        private static int f(boolean z10) {
            return z10 ? 1 : 0;
        }

        public boolean g() {
            return d(this.f58613s);
        }

        @p0
        public Bundle getExtras() {
            return this.f58611q;
        }

        public boolean h() {
            return d(this.f58612r);
        }

        public boolean i() {
            return d(this.f58614t);
        }

        LibraryParams(Bundle bundle, boolean z10, boolean z11, boolean z12) {
            this(bundle, f(z10), f(z11), f(z12));
        }

        private LibraryParams(Bundle bundle, int i10, int i11, int i12) {
            this.f58611q = bundle;
            this.f58612r = i10;
            this.f58613s = i11;
            this.f58614t = i12;
        }
    }

    public static final class a extends MediaSession {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f58619e;

        /* JADX INFO: renamed from: androidx.media2.session.MediaLibraryService$a$a, reason: collision with other inner class name */
        public static final class C0542a extends MediaSession.b<a, C0542a, b> {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private boolean f58620h;

            /* JADX INFO: renamed from: androidx.media2.session.MediaLibraryService$a$a$a, reason: collision with other inner class name */
            class C0543a extends b {
                C0543a() {
                }
            }

            public C0542a(@NonNull MediaLibraryService mediaLibraryService, @NonNull SessionPlayer sessionPlayer, @NonNull Executor executor, @NonNull b bVar) {
                super(mediaLibraryService, sessionPlayer);
                this.f58620h = true;
                e(executor, bVar);
            }

            @Override // androidx.media2.session.MediaSession.b
            @NonNull
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public a a() {
                if (this.f58640d == null) {
                    this.f58640d = androidx.core.content.d.o(this.f58637a);
                }
                if (this.f58641e == 0) {
                    this.f58641e = new C0543a();
                }
                return new a(this.f58637a, this.f58639c, this.f58638b, this.f58642f, this.f58640d, this.f58641e, this.f58643g, this.f58620h);
            }

            @Override // androidx.media2.session.MediaSession.b
            @NonNull
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public C0542a b(@NonNull Bundle bundle) {
                return (C0542a) super.b(bundle);
            }

            @Override // androidx.media2.session.MediaSession.b
            @NonNull
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public C0542a c(@NonNull String str) {
                return (C0542a) super.c(str);
            }

            @Override // androidx.media2.session.MediaSession.b
            @NonNull
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public C0542a d(@p0 PendingIntent pendingIntent) {
                return (C0542a) super.d(pendingIntent);
            }

            @NonNull
            @l1
            @b1({b1.a.LIBRARY})
            public C0542a j(boolean z10) {
                this.f58620h = z10;
                return this;
            }
        }

        public static class b extends MediaSession.f {
            @NonNull
            public LibraryResult q(@NonNull a aVar, @NonNull MediaSession.d dVar, @NonNull String str, @g0(from = 0) int i10, @g0(from = 1) int i11, @p0 LibraryParams libraryParams) {
                return new LibraryResult(-6);
            }

            @NonNull
            public LibraryResult r(@NonNull a aVar, @NonNull MediaSession.d dVar, @NonNull String str) {
                return new LibraryResult(-6);
            }

            @NonNull
            public LibraryResult s(@NonNull a aVar, @NonNull MediaSession.d dVar, @p0 LibraryParams libraryParams) {
                return new LibraryResult(-6);
            }

            @NonNull
            public LibraryResult t(@NonNull a aVar, @NonNull MediaSession.d dVar, @NonNull String str, @g0(from = 0) int i10, @g0(from = 1) int i11, @p0 LibraryParams libraryParams) {
                return new LibraryResult(-6);
            }

            public int u(@NonNull a aVar, @NonNull MediaSession.d dVar, @NonNull String str, @p0 LibraryParams libraryParams) {
                return -6;
            }

            public int v(@NonNull a aVar, @NonNull MediaSession.d dVar, @NonNull String str, @p0 LibraryParams libraryParams) {
                return -6;
            }

            public int w(@NonNull a aVar, @NonNull MediaSession.d dVar, @NonNull String str) {
                return -6;
            }
        }

        interface c extends MediaSession.e {
            void Ce(@NonNull MediaSession.d dVar, @NonNull String str, int i10, @p0 LibraryParams libraryParams);

            int G9(@NonNull MediaSession.d dVar, @NonNull String str);

            void Hb(@NonNull String str, int i10, @p0 LibraryParams libraryParams);

            int Qb(@NonNull MediaSession.d dVar, @NonNull String str, @p0 LibraryParams libraryParams);

            int W8(@NonNull MediaSession.d dVar, @NonNull String str, @p0 LibraryParams libraryParams);

            LibraryResult b5(@NonNull MediaSession.d dVar, @NonNull String str, int i10, int i11, @p0 LibraryParams libraryParams);

            LibraryResult ff(@NonNull MediaSession.d dVar, @p0 LibraryParams libraryParams);

            LibraryResult g7(@NonNull MediaSession.d dVar, @NonNull String str, int i10, int i11, @p0 LibraryParams libraryParams);

            @Override // androidx.media2.session.MediaSession.e
            a k();

            LibraryResult m4(@NonNull MediaSession.d dVar, @NonNull String str);

            @Override // androidx.media2.session.MediaSession.e
            b u();

            void za(@NonNull MediaSession.d dVar, @NonNull String str, int i10, @p0 LibraryParams libraryParams);
        }

        a(Context context, String str, SessionPlayer sessionPlayer, PendingIntent pendingIntent, Executor executor, MediaSession.f fVar, Bundle bundle, boolean z10) {
            super(context, str, sessionPlayer, pendingIntent, executor, fVar, bundle);
            this.f58619e = z10;
        }

        public void Ce(@NonNull MediaSession.d dVar, @NonNull String str, @g0(from = 0) int i10, @p0 LibraryParams libraryParams) {
            if (dVar == null) {
                throw new NullPointerException("controller shouldn't be null");
            }
            if (str == null) {
                throw new NullPointerException("query shouldn't be null");
            }
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("query shouldn't be empty");
            }
            if (i10 < 0) {
                throw new IllegalArgumentException("itemCount shouldn't be negative");
            }
            b().Ce(dVar, str, i10, libraryParams);
        }

        public void Hb(@NonNull String str, int i10, @p0 LibraryParams libraryParams) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("parentId shouldn't be empty");
            }
            if (i10 < 0) {
                throw new IllegalArgumentException("itemCount shouldn't be negative");
            }
            b().Hb(str, i10, libraryParams);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.media2.session.MediaSession
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public c a(Context context, String str, SessionPlayer sessionPlayer, PendingIntent pendingIntent, Executor executor, MediaSession.f fVar, Bundle bundle) {
            return new r(this, context, str, sessionPlayer, pendingIntent, executor, fVar, bundle, this.f58619e);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.media2.session.MediaSession
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public c b() {
            return (c) super.b();
        }

        public void za(@NonNull MediaSession.d dVar, @NonNull String str, @g0(from = 0) int i10, @p0 LibraryParams libraryParams) {
            if (dVar == null) {
                throw new NullPointerException("controller shouldn't be null");
            }
            if (str == null) {
                throw new NullPointerException("parentId shouldn't be null");
            }
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("parentId shouldn't be empty");
            }
            if (i10 < 0) {
                throw new IllegalArgumentException("itemCount shouldn't be negative");
            }
            b().za(dVar, str, i10, libraryParams);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.media2.session.MediaSession
        @NonNull
        public b u() {
            return (b) super.u();
        }
    }

    @Override // androidx.media2.session.w
    w.b b() {
        return new p();
    }

    @Override // androidx.media2.session.w
    @p0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public abstract a d(@NonNull MediaSession.d dVar);

    @Override // androidx.media2.session.w, android.app.Service
    public IBinder onBind(@NonNull Intent intent) {
        return super.onBind(intent);
    }
}
