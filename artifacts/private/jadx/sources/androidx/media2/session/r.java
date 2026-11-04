package androidx.media2.session;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.media2.common.MediaItem;
import androidx.media2.common.MediaMetadata;
import androidx.media2.common.SessionPlayer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
class r extends t implements MediaLibraryService.a.c {

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private final boolean f59192h3;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    @androidx.annotation.b0("mLock")
    private final androidx.collection.a<MediaSession.c, Set<String>> f59193i3;

    class a implements t.w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f59194a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f59195b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ MediaLibraryService.LibraryParams f59196c;

        a(String str, int i10, MediaLibraryService.LibraryParams libraryParams) {
            this.f59194a = str;
            this.f59195b = i10;
            this.f59196c = libraryParams;
        }

        @Override // androidx.media2.session.t.w0
        public void a(MediaSession.c cVar, int i10) throws RemoteException {
            if (r.this.T(cVar, this.f59194a)) {
                cVar.c(i10, this.f59194a, this.f59195b, this.f59196c);
            }
        }
    }

    class b implements t.w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f59198a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MediaSession.d f59199b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f59200c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ MediaLibraryService.LibraryParams f59201d;

        b(String str, MediaSession.d dVar, int i10, MediaLibraryService.LibraryParams libraryParams) {
            this.f59198a = str;
            this.f59199b = dVar;
            this.f59200c = i10;
            this.f59201d = libraryParams;
        }

        @Override // androidx.media2.session.t.w0
        public void a(MediaSession.c cVar, int i10) throws RemoteException {
            if (r.this.T(cVar, this.f59198a)) {
                cVar.c(i10, this.f59198a, this.f59200c, this.f59201d);
            } else if (t.f59220p2) {
                Objects.toString(this.f59199b);
                r.this.y();
            }
        }
    }

    class c implements t.w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f59203a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f59204b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ MediaLibraryService.LibraryParams f59205c;

        c(String str, int i10, MediaLibraryService.LibraryParams libraryParams) {
            this.f59203a = str;
            this.f59204b = i10;
            this.f59205c = libraryParams;
        }

        @Override // androidx.media2.session.t.w0
        public void a(MediaSession.c cVar, int i10) throws RemoteException {
            cVar.p(i10, this.f59203a, this.f59204b, this.f59205c);
        }
    }

    r(MediaSession mediaSession, Context context, String str, SessionPlayer sessionPlayer, PendingIntent pendingIntent, Executor executor, MediaSession.f fVar, Bundle bundle, boolean z10) {
        super(mediaSession, context, str, sessionPlayer, pendingIntent, executor, fVar, bundle);
        this.f59193i3 = new androidx.collection.a<>();
        this.f59192h3 = z10;
    }

    private LibraryResult E(LibraryResult libraryResult) {
        if (libraryResult != null) {
            return libraryResult;
        }
        R("LibraryResult shouldn't be null");
        return new LibraryResult(-1);
    }

    private LibraryResult H(LibraryResult libraryResult) {
        LibraryResult libraryResultE = E(libraryResult);
        return (libraryResultE.i() != 0 || X(libraryResultE.g())) ? libraryResultE : new LibraryResult(-1);
    }

    private LibraryResult I(LibraryResult libraryResult, int i10) {
        LibraryResult libraryResultE = E(libraryResult);
        if (libraryResultE.i() == 0) {
            List<MediaItem> listL = libraryResultE.l();
            if (listL == null) {
                R("List shouldn't be null for the success");
                return new LibraryResult(-1);
            }
            if (listL.size() > i10) {
                R("List shouldn't contain items more than pageSize, size=" + libraryResultE.l().size() + ", pageSize" + i10);
                return new LibraryResult(-1);
            }
            Iterator<MediaItem> it = listL.iterator();
            while (it.hasNext()) {
                if (!X(it.next())) {
                    return new LibraryResult(-1);
                }
            }
        }
        return libraryResultE;
    }

    private void R(@NonNull String str) {
        if (this.f59192h3) {
            throw new RuntimeException(str);
        }
    }

    private boolean X(MediaItem mediaItem) {
        if (mediaItem == null) {
            R("Item shouldn't be null for the success");
            return false;
        }
        if (TextUtils.isEmpty(mediaItem.l())) {
            R("Media ID of an item shouldn't be empty for the success");
            return false;
        }
        MediaMetadata mediaMetadataM = mediaItem.m();
        if (mediaMetadataM == null) {
            R("Metadata of an item shouldn't be null for the success");
            return false;
        }
        if (!mediaMetadataM.j(MediaMetadata.Y)) {
            R("METADATA_KEY_BROWSABLE should be specified in metadata of an item");
            return false;
        }
        if (mediaMetadataM.j(MediaMetadata.f53003h0)) {
            return true;
        }
        R("METADATA_KEY_PLAYABLE should be specified in metadata of an item");
        return false;
    }

    @Override // androidx.media2.session.MediaLibraryService.a.c
    public void Ce(@NonNull MediaSession.d dVar, @NonNull String str, int i10, MediaLibraryService.LibraryParams libraryParams) {
        j(dVar, new c(str, i10, libraryParams));
    }

    @Override // androidx.media2.session.MediaLibraryService.a.c
    public int G9(@NonNull MediaSession.d dVar, @NonNull String str) {
        int iW = u().w(k(), dVar, str);
        synchronized (this.f59221a) {
            try {
                this.f59193i3.remove(dVar.c());
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iW;
    }

    @Override // androidx.media2.session.MediaLibraryService.a.c
    public void Hb(@NonNull String str, int i10, MediaLibraryService.LibraryParams libraryParams) {
        l(new a(str, i10, libraryParams));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.media2.session.t
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public q m() {
        return (q) super.m();
    }

    @Override // androidx.media2.session.t, androidx.media2.session.MediaSession.e
    public boolean P7(@NonNull MediaSession.d dVar) {
        if (super.P7(dVar)) {
            return true;
        }
        q qVarM = m();
        if (qVarM != null) {
            return qVarM.z().h(dVar);
        }
        return false;
    }

    @Override // androidx.media2.session.MediaLibraryService.a.c
    public int Qb(@NonNull MediaSession.d dVar, @NonNull String str, MediaLibraryService.LibraryParams libraryParams) {
        return u().u(k(), dVar, str, libraryParams);
    }

    @Override // androidx.media2.session.t, androidx.media2.session.MediaSession.e
    @NonNull
    public List<MediaSession.d> Sc() {
        List<MediaSession.d> listSc = super.Sc();
        q qVarM = m();
        if (qVarM != null) {
            listSc.addAll(qVarM.z().b());
        }
        return listSc;
    }

    boolean T(MediaSession.c cVar, String str) {
        synchronized (this.f59221a) {
            try {
                Set<String> set = this.f59193i3.get(cVar);
                if (set != null && set.contains(str)) {
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.session.MediaLibraryService.a.c
    public int W8(@NonNull MediaSession.d dVar, @NonNull String str, MediaLibraryService.LibraryParams libraryParams) {
        synchronized (this.f59221a) {
            try {
                Set<String> hashSet = this.f59193i3.get(dVar.c());
                if (hashSet == null) {
                    hashSet = new HashSet<>();
                    this.f59193i3.put(dVar.c(), hashSet);
                }
                hashSet.add(str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int iV = u().v(k(), dVar, str, libraryParams);
        if (iV == 0) {
            return iV;
        }
        synchronized (this.f59221a) {
            try {
                this.f59193i3.remove(dVar.c());
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return iV;
    }

    @Override // androidx.media2.session.MediaLibraryService.a.c
    public LibraryResult b5(@NonNull MediaSession.d dVar, @NonNull String str, int i10, int i11, MediaLibraryService.LibraryParams libraryParams) {
        return I(u().q(k(), dVar, str, i10, i11, libraryParams), i11);
    }

    @Override // androidx.media2.session.t
    androidx.media.e d(Context context, SessionToken sessionToken, MediaSessionCompat.Token token) {
        return new q(context, this, token);
    }

    @Override // androidx.media2.session.MediaLibraryService.a.c
    public LibraryResult ff(@NonNull MediaSession.d dVar, MediaLibraryService.LibraryParams libraryParams) {
        return H(u().s(k(), dVar, libraryParams));
    }

    @Override // androidx.media2.session.MediaLibraryService.a.c
    public LibraryResult g7(@NonNull MediaSession.d dVar, @NonNull String str, int i10, int i11, MediaLibraryService.LibraryParams libraryParams) {
        return I(u().t(k(), dVar, str, i10, i11, libraryParams), i11);
    }

    @Override // androidx.media2.session.t
    void l(@NonNull t.w0 w0Var) {
        super.l(w0Var);
        q qVarM = m();
        if (qVarM != null) {
            try {
                w0Var.a(qVarM.A(), 0);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // androidx.media2.session.MediaLibraryService.a.c
    public LibraryResult m4(@NonNull MediaSession.d dVar, @NonNull String str) {
        return H(u().r(k(), dVar, str));
    }

    void y() {
        if (t.f59220p2) {
            synchronized (this.f59221a) {
                try {
                    this.f59193i3.size();
                    for (int i10 = 0; i10 < this.f59193i3.size(); i10++) {
                        Objects.toString(this.f59193i3.k(i10));
                        for (String str : this.f59193i3.k(i10)) {
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // androidx.media2.session.MediaLibraryService.a.c
    public void za(@NonNull MediaSession.d dVar, @NonNull String str, int i10, MediaLibraryService.LibraryParams libraryParams) {
        j(dVar, new b(str, dVar, i10, libraryParams));
    }

    @Override // androidx.media2.session.t, androidx.media2.session.MediaSession.e
    @NonNull
    public MediaLibraryService.a k() {
        return (MediaLibraryService.a) super.k();
    }

    @Override // androidx.media2.session.t, androidx.media2.session.MediaSession.e
    public MediaLibraryService.a.b u() {
        return (MediaLibraryService.a.b) super.u();
    }
}
