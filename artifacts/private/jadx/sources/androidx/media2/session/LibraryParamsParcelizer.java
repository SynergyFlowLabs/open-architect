package androidx.media2.session;

import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY})
public final class LibraryParamsParcelizer {
    public static MediaLibraryService.LibraryParams read(androidx.versionedparcelable.e eVar) {
        MediaLibraryService.LibraryParams libraryParams = new MediaLibraryService.LibraryParams();
        libraryParams.f58611q = eVar.q(libraryParams.f58611q, 1);
        libraryParams.f58612r = eVar.M(libraryParams.f58612r, 2);
        libraryParams.f58613s = eVar.M(libraryParams.f58613s, 3);
        libraryParams.f58614t = eVar.M(libraryParams.f58614t, 4);
        return libraryParams;
    }

    public static void write(MediaLibraryService.LibraryParams libraryParams, androidx.versionedparcelable.e eVar) {
        eVar.j0(false, false);
        eVar.r0(libraryParams.f58611q, 1);
        eVar.M0(libraryParams.f58612r, 2);
        eVar.M0(libraryParams.f58613s, 3);
        eVar.M0(libraryParams.f58614t, 4);
    }
}
