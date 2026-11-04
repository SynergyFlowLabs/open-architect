package androidx.media2.player;

import android.media.MediaFormat;
import android.util.SparseArray;
import androidx.annotation.p0;
import androidx.media2.common.MediaItem;
import androidx.media2.common.SessionPlayer;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.source.TrackGroup;
import androidx.media2.exoplayer.external.source.TrackGroupArray;
import androidx.media2.exoplayer.external.trackselection.DefaultTrackSelector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@e.a({"RestrictedApi"})
final class u {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f58458o = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f58459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MediaItem f58460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s f58461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final DefaultTrackSelector f58462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SparseArray<b> f58463e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final SparseArray<b> f58464f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final SparseArray<b> f58465g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final SparseArray<a> f58466h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f58467i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private b f58468j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private b f58469k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private b f58470l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private a f58471m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f58472n;

    static final class a extends b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final String f58473f = "text/cea-608";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final String f58474g = "text/cea-708";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        static final int f58475h = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f58476c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f58477d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @p0
        final Format f58478e;

        a(int i10, int i11, @p0 Format format, int i12, int i13) {
            super(i10, b(i11), a(i11, format, i12), i13);
            this.f58476c = i11;
            this.f58477d = i12;
            this.f58478e = format;
        }

        private static MediaFormat a(int i10, @p0 Format format, int i11) {
            int i12;
            if (i10 == 0 && i11 == 0) {
                i12 = 5;
            } else if (i10 == 1 && i11 == 1) {
                i12 = 1;
            } else {
                i12 = format == null ? 0 : format.f53095c;
            }
            String str = format == null ? "und" : format.f53100g3;
            MediaFormat mediaFormat = new MediaFormat();
            if (i10 == 0) {
                mediaFormat.setString("mime", f58473f);
            } else if (i10 == 1) {
                mediaFormat.setString("mime", f58474g);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                mediaFormat.setString("mime", "text/vtt");
            }
            mediaFormat.setString("language", str);
            mediaFormat.setInteger("is-forced-subtitle", (i12 & 2) != 0 ? 1 : 0);
            mediaFormat.setInteger("is-autoselect", (i12 & 4) != 0 ? 1 : 0);
            mediaFormat.setInteger("is-default", (i12 & 1) != 0 ? 1 : 0);
            return mediaFormat;
        }

        private static int b(int i10) {
            return i10 == 2 ? 0 : 4;
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f58479a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final SessionPlayer.TrackInfo f58480b;

        b(int i10, int i11, @p0 MediaFormat mediaFormat, int i12) {
            this.f58479a = i10;
            this.f58480b = new SessionPlayer.TrackInfo(i12, i11, mediaFormat, i11 != 1);
        }
    }

    u(s sVar) {
        this.f58461c = sVar;
        DefaultTrackSelector defaultTrackSelector = new DefaultTrackSelector();
        this.f58462d = defaultTrackSelector;
        this.f58463e = new SparseArray<>();
        this.f58464f = new SparseArray<>();
        this.f58465g = new SparseArray<>();
        this.f58466h = new SparseArray<>();
        this.f58468j = null;
        this.f58469k = null;
        this.f58470l = null;
        this.f58471m = null;
        this.f58472n = -1;
        defaultTrackSelector.T(new DefaultTrackSelector.d().e(true).H(3, true));
    }

    private static int d(String str) {
        str.getClass();
        switch (str) {
            case "text/vtt":
                return 2;
            case "application/cea-608":
                return 0;
            case "application/cea-708":
                return 1;
            default:
                throw new IllegalArgumentException("Unexpected text MIME type " + str);
        }
    }

    public void a(int i10) {
        boolean z10 = false;
        androidx.core.util.t.b(this.f58464f.get(i10) == null, "Video track deselection is not supported");
        androidx.core.util.t.b(this.f58463e.get(i10) == null, "Audio track deselection is not supported");
        if (this.f58465g.get(i10) != null) {
            this.f58470l = null;
            DefaultTrackSelector defaultTrackSelector = this.f58462d;
            defaultTrackSelector.T(defaultTrackSelector.m().H(3, true));
            return;
        }
        a aVar = this.f58471m;
        if (aVar != null && aVar.f58480b.k() == i10) {
            z10 = true;
        }
        androidx.core.util.t.a(z10);
        this.f58461c.K();
        this.f58471m = null;
    }

    public DefaultTrackSelector b() {
        return this.f58462d;
    }

    public SessionPlayer.TrackInfo c(int i10) {
        b bVar;
        if (i10 == 1) {
            b bVar2 = this.f58469k;
            if (bVar2 == null) {
                return null;
            }
            return bVar2.f58480b;
        }
        if (i10 == 2) {
            b bVar3 = this.f58468j;
            if (bVar3 == null) {
                return null;
            }
            return bVar3.f58480b;
        }
        if (i10 != 4) {
            if (i10 == 5 && (bVar = this.f58470l) != null) {
                return bVar.f58480b;
            }
            return null;
        }
        a aVar = this.f58471m;
        if (aVar == null) {
            return null;
        }
        return aVar.f58480b;
    }

    public List<SessionPlayer.TrackInfo> e() {
        ArrayList arrayList = new ArrayList();
        for (SparseArray sparseArray : Arrays.asList(this.f58463e, this.f58464f, this.f58465g, this.f58466h)) {
            boolean z10 = false & false;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                arrayList.add(((b) sparseArray.valueAt(i10)).f58480b);
            }
        }
        return arrayList;
    }

    public void f(MediaItem mediaItem, androidx.media2.exoplayer.external.trackselection.p pVar) {
        boolean z10 = this.f58460b != mediaItem;
        this.f58460b = mediaItem;
        this.f58467i = true;
        DefaultTrackSelector defaultTrackSelector = this.f58462d;
        defaultTrackSelector.T(defaultTrackSelector.m().h());
        this.f58468j = null;
        this.f58469k = null;
        this.f58470l = null;
        this.f58471m = null;
        this.f58472n = -1;
        this.f58461c.K();
        if (z10) {
            this.f58463e.clear();
            this.f58464f.clear();
            this.f58465g.clear();
            this.f58466h.clear();
        }
        androidx.media2.exoplayer.external.trackselection.i.a aVarG = this.f58462d.g();
        if (aVarG == null) {
            return;
        }
        androidx.media2.exoplayer.external.trackselection.m mVarA = pVar.a(1);
        TrackGroup trackGroupG = mVarA == null ? null : mVarA.g();
        androidx.media2.exoplayer.external.trackselection.m mVarA2 = pVar.a(0);
        TrackGroup trackGroupG2 = mVarA2 == null ? null : mVarA2.g();
        androidx.media2.exoplayer.external.trackselection.m mVarA3 = pVar.a(3);
        TrackGroup trackGroupG3 = mVarA3 == null ? null : mVarA3.g();
        androidx.media2.exoplayer.external.trackselection.m mVarA4 = pVar.a(2);
        TrackGroup trackGroupG4 = mVarA4 != null ? mVarA4.g() : null;
        TrackGroupArray trackGroupArrayG = aVarG.g(1);
        for (int size = this.f58463e.size(); size < trackGroupArrayG.f55657a; size++) {
            TrackGroup trackGroupA = trackGroupArrayG.a(size);
            MediaFormat mediaFormatF = e.f(trackGroupA.a(0));
            int i10 = this.f58459a;
            this.f58459a = i10 + 1;
            b bVar = new b(size, 2, mediaFormatF, i10);
            this.f58463e.put(bVar.f58480b.k(), bVar);
            if (trackGroupA.equals(trackGroupG)) {
                this.f58468j = bVar;
            }
        }
        TrackGroupArray trackGroupArrayG2 = aVarG.g(0);
        for (int size2 = this.f58464f.size(); size2 < trackGroupArrayG2.f55657a; size2++) {
            TrackGroup trackGroupA2 = trackGroupArrayG2.a(size2);
            MediaFormat mediaFormatF2 = e.f(trackGroupA2.a(0));
            int i11 = this.f58459a;
            this.f58459a = i11 + 1;
            b bVar2 = new b(size2, 1, mediaFormatF2, i11);
            this.f58464f.put(bVar2.f58480b.k(), bVar2);
            if (trackGroupA2.equals(trackGroupG2)) {
                this.f58469k = bVar2;
            }
        }
        TrackGroupArray trackGroupArrayG3 = aVarG.g(3);
        for (int size3 = this.f58465g.size(); size3 < trackGroupArrayG3.f55657a; size3++) {
            TrackGroup trackGroupA3 = trackGroupArrayG3.a(size3);
            MediaFormat mediaFormatF3 = e.f(trackGroupA3.a(0));
            int i12 = this.f58459a;
            this.f58459a = i12 + 1;
            b bVar3 = new b(size3, 5, mediaFormatF3, i12);
            this.f58465g.put(bVar3.f58480b.k(), bVar3);
            if (trackGroupA3.equals(trackGroupG3)) {
                this.f58470l = bVar3;
            }
        }
        TrackGroupArray trackGroupArrayG4 = aVarG.g(2);
        for (int size4 = this.f58466h.size(); size4 < trackGroupArrayG4.f55657a; size4++) {
            TrackGroup trackGroupA4 = trackGroupArrayG4.a(size4);
            Format format = (Format) androidx.core.util.t.l(trackGroupA4.a(0));
            int iD = d(format.f53103i);
            int i13 = this.f58459a;
            this.f58459a = i13 + 1;
            a aVar = new a(size4, iD, format, -1, i13);
            this.f58466h.put(aVar.f58480b.k(), aVar);
            if (trackGroupA4.equals(trackGroupG4)) {
                this.f58472n = size4;
            }
        }
    }

    public void g(int i10, int i11) {
        for (int i12 = 0; i12 < this.f58466h.size(); i12++) {
            a aVarValueAt = this.f58466h.valueAt(i12);
            if (aVarValueAt.f58476c == i10 && aVarValueAt.f58477d == -1) {
                int iK = aVarValueAt.f58480b.k();
                this.f58466h.put(iK, new a(aVarValueAt.f58479a, i10, aVarValueAt.f58478e, i11, iK));
                a aVar = this.f58471m;
                if (aVar == null || aVar.f58479a != i12) {
                    return;
                }
                this.f58461c.Q(i10, i11);
                return;
            }
        }
        int i13 = this.f58472n;
        int i14 = this.f58459a;
        this.f58459a = i14 + 1;
        a aVar2 = new a(i13, i10, null, i11, i14);
        this.f58466h.put(aVar2.f58480b.k(), aVar2);
        this.f58467i = true;
    }

    public boolean h() {
        boolean z10 = this.f58467i;
        this.f58467i = false;
        return z10;
    }

    public void i(int i10) {
        androidx.core.util.t.b(this.f58464f.get(i10) == null, "Video track selection is not supported");
        b bVar = this.f58463e.get(i10);
        if (bVar != null) {
            this.f58468j = bVar;
            TrackGroupArray trackGroupArrayG = ((androidx.media2.exoplayer.external.trackselection.i.a) androidx.core.util.t.l(this.f58462d.g())).g(1);
            int i11 = trackGroupArrayG.a(bVar.f58479a).f55653a;
            int[] iArr = new int[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                iArr[i12] = i12;
            }
            DefaultTrackSelector.SelectionOverride selectionOverride = new DefaultTrackSelector.SelectionOverride(bVar.f58479a, iArr);
            DefaultTrackSelector defaultTrackSelector = this.f58462d;
            defaultTrackSelector.S(defaultTrackSelector.m().J(1, trackGroupArrayG, selectionOverride).a());
            return;
        }
        b bVar2 = this.f58465g.get(i10);
        if (bVar2 != null) {
            this.f58470l = bVar2;
            TrackGroupArray trackGroupArrayG2 = ((androidx.media2.exoplayer.external.trackselection.i.a) androidx.core.util.t.l(this.f58462d.g())).g(3);
            DefaultTrackSelector.SelectionOverride selectionOverride2 = new DefaultTrackSelector.SelectionOverride(bVar2.f58479a, 0);
            DefaultTrackSelector defaultTrackSelector2 = this.f58462d;
            defaultTrackSelector2.S(defaultTrackSelector2.m().H(3, false).J(3, trackGroupArrayG2, selectionOverride2).a());
            return;
        }
        a aVar = this.f58466h.get(i10);
        androidx.core.util.t.a(aVar != null);
        if (this.f58472n != aVar.f58479a) {
            this.f58461c.K();
            this.f58472n = aVar.f58479a;
            TrackGroupArray trackGroupArrayG3 = ((androidx.media2.exoplayer.external.trackselection.i.a) androidx.core.util.t.l(this.f58462d.g())).g(2);
            DefaultTrackSelector.SelectionOverride selectionOverride3 = new DefaultTrackSelector.SelectionOverride(this.f58472n, 0);
            DefaultTrackSelector defaultTrackSelector3 = this.f58462d;
            defaultTrackSelector3.S(defaultTrackSelector3.m().J(2, trackGroupArrayG3, selectionOverride3).a());
        }
        int i13 = aVar.f58477d;
        if (i13 != -1) {
            this.f58461c.Q(aVar.f58476c, i13);
        }
        this.f58471m = aVar;
    }
}
