package androidx.media2.session;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.g0;
import androidx.annotation.p0;
import com.google.common.util.concurrent.t1;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class e extends MediaController {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final String f58832i = "MediaBrowser";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final boolean f58833j = Log.isLoggable(f58832i, 3);

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f58834a;

        a(c cVar) {
            this.f58834a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f58834a.a((b) e.this.f58508d);
        }
    }

    public static class b extends MediaController.e {
        public void w(@NonNull e eVar, @NonNull String str, @g0(from = 0) int i10, @p0 MediaLibraryService.LibraryParams libraryParams) {
        }

        public void x(@NonNull e eVar, @NonNull String str, @g0(from = 0) int i10, @p0 MediaLibraryService.LibraryParams libraryParams) {
        }
    }

    interface c {
        void a(@NonNull b bVar);
    }

    public static final class d extends MediaController.d<e, d, b> {
        public d(@NonNull Context context) {
            super(context);
        }

        @Override // androidx.media2.session.MediaController.d
        @NonNull
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public e a() {
            SessionToken sessionToken = this.f58525b;
            if (sessionToken == null && this.f58526c == null) {
                throw new IllegalArgumentException("token and compat token shouldn't be both null");
            }
            return sessionToken != null ? new e(this.f58524a, this.f58525b, this.f58527d, this.f58528e, (b) this.f58529f) : new e(this.f58524a, this.f58526c, this.f58527d, this.f58528e, (b) this.f58529f);
        }

        @Override // androidx.media2.session.MediaController.d
        @NonNull
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public d b(@NonNull Bundle bundle) {
            return (d) super.b(bundle);
        }

        @Override // androidx.media2.session.MediaController.d
        @NonNull
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public d c(@NonNull Executor executor, @NonNull b bVar) {
            return (d) super.c(executor, bVar);
        }

        @Override // androidx.media2.session.MediaController.d
        @NonNull
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public d d(@NonNull MediaSessionCompat.Token token) {
            return (d) super.d(token);
        }

        @Override // androidx.media2.session.MediaController.d
        @NonNull
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public d e(@NonNull SessionToken sessionToken) {
            return (d) super.e(sessionToken);
        }
    }

    /* JADX INFO: renamed from: androidx.media2.session.e$e, reason: collision with other inner class name */
    interface InterfaceC0547e extends MediaController.g {
        t1<LibraryResult> D5(@NonNull String str, @p0 MediaLibraryService.LibraryParams libraryParams);

        t1<LibraryResult> G4(@NonNull String str);

        t1<LibraryResult> S1(@NonNull String str, @p0 MediaLibraryService.LibraryParams libraryParams);

        t1<LibraryResult> S4(@NonNull String str);

        t1<LibraryResult> Sd(@NonNull String str, int i10, int i11, @p0 MediaLibraryService.LibraryParams libraryParams);

        t1<LibraryResult> Wd(@p0 MediaLibraryService.LibraryParams libraryParams);

        t1<LibraryResult> h7(@NonNull String str, int i10, int i11, @p0 MediaLibraryService.LibraryParams libraryParams);
    }

    e(@NonNull Context context, @NonNull SessionToken sessionToken, @p0 Bundle bundle, @p0 Executor executor, @p0 b bVar) {
        super(context, sessionToken, bundle, executor, bVar);
    }

    private static t1<LibraryResult> c() {
        return LibraryResult.j(-100);
    }

    @NonNull
    public t1<LibraryResult> D5(@NonNull String str, @p0 MediaLibraryService.LibraryParams libraryParams) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId shouldn't be empty");
        }
        return isConnected() ? f().D5(str, libraryParams) : c();
    }

    @NonNull
    public t1<LibraryResult> G4(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("mediaId shouldn't be empty");
        }
        return isConnected() ? f().G4(str) : c();
    }

    @NonNull
    public t1<LibraryResult> S1(@NonNull String str, @p0 MediaLibraryService.LibraryParams libraryParams) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("query shouldn't be empty");
        }
        return isConnected() ? f().S1(str, libraryParams) : c();
    }

    @NonNull
    public t1<LibraryResult> S4(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId shouldn't be empty");
        }
        return isConnected() ? f().S4(str) : c();
    }

    @NonNull
    public t1<LibraryResult> Sd(@NonNull String str, @g0(from = 0) int i10, @g0(from = 1) int i11, @p0 MediaLibraryService.LibraryParams libraryParams) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("query shouldn't be empty");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("page shouldn't be negative");
        }
        if (i11 >= 1) {
            return isConnected() ? f().Sd(str, i10, i11, libraryParams) : c();
        }
        throw new IllegalArgumentException("pageSize shouldn't be less than 1");
    }

    @NonNull
    public t1<LibraryResult> Wd(@p0 MediaLibraryService.LibraryParams libraryParams) {
        return isConnected() ? f().Wd(libraryParams) : c();
    }

    @NonNull
    public t1<LibraryResult> h7(@NonNull String str, @g0(from = 0) int i10, @g0(from = 1) int i11, @p0 MediaLibraryService.LibraryParams libraryParams) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId shouldn't be empty");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("page shouldn't be negative");
        }
        if (i11 >= 1) {
            return isConnected() ? f().h7(str, i10, i11, libraryParams) : c();
        }
        throw new IllegalArgumentException("pageSize shouldn't be less than 1");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.media2.session.MediaController
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public InterfaceC0547e d(@NonNull Context context, @NonNull SessionToken sessionToken, @p0 Bundle bundle) {
        return sessionToken.g5() ? new g(context, this, sessionToken) : new f(context, this, sessionToken, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.media2.session.MediaController
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public InterfaceC0547e f() {
        return (InterfaceC0547e) super.f();
    }

    void x(c cVar) {
        Executor executor;
        if (this.f58508d == null || (executor = this.f58509e) == null) {
            return;
        }
        executor.execute(new a(cVar));
    }

    e(@NonNull Context context, @NonNull MediaSessionCompat.Token token, @p0 Bundle bundle, @p0 Executor executor, @p0 b bVar) {
        super(context, token, bundle, executor, bVar);
    }
}
