package androidx.media2.session;

import androidx.annotation.b1;
import androidx.media2.common.MediaItem;
import androidx.media2.common.ParcelImplListSlice;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY})
public final class LibraryResultParcelizer {
    public static LibraryResult read(androidx.versionedparcelable.e eVar) {
        LibraryResult libraryResult = new LibraryResult();
        libraryResult.f58497q = eVar.M(libraryResult.f58497q, 1);
        libraryResult.f58498r = eVar.R(libraryResult.f58498r, 2);
        libraryResult.f58500t = (MediaItem) eVar.h0(libraryResult.f58500t, 3);
        int i10 = 7 ^ 4;
        libraryResult.f58501u = (MediaLibraryService.LibraryParams) eVar.h0(libraryResult.f58501u, 4);
        libraryResult.f58503w = (ParcelImplListSlice) eVar.W(libraryResult.f58503w, 5);
        libraryResult.d();
        return libraryResult;
    }

    public static void write(LibraryResult libraryResult, androidx.versionedparcelable.e eVar) {
        eVar.j0(false, false);
        libraryResult.f(eVar.i());
        eVar.M0(libraryResult.f58497q, 1);
        eVar.R0(libraryResult.f58498r, 2);
        eVar.m1(libraryResult.f58500t, 3);
        int i10 = 0 << 4;
        eVar.m1(libraryResult.f58501u, 4);
        eVar.X0(libraryResult.f58503w, 5);
    }
}
