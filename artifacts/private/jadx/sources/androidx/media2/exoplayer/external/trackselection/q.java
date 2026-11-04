package androidx.media2.exoplayer.external.trackselection;

import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.source.TrackGroupArray;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class q {

    public interface a {
        m a(m.a trackSelectionDefinition);
    }

    private q() {
    }

    public static m[] a(m.a[] definitions, a adaptiveTrackSelectionFactory) {
        m[] mVarArr = new m[definitions.length];
        boolean z10 = false;
        for (int i10 = 0; i10 < definitions.length; i10++) {
            m.a aVar = definitions[i10];
            if (aVar != null) {
                int[] iArr = aVar.f57219b;
                if (iArr.length <= 1 || z10) {
                    mVarArr[i10] = new h(aVar.f57218a, iArr[0], aVar.f57220c, aVar.f57221d);
                } else {
                    mVarArr[i10] = adaptiveTrackSelectionFactory.a(aVar);
                    z10 = true;
                }
            }
        }
        return mVarArr;
    }

    public static DefaultTrackSelector.Parameters b(DefaultTrackSelector.Parameters parameters, int rendererIndex, TrackGroupArray trackGroupArray, boolean isDisabled, @p0 DefaultTrackSelector.SelectionOverride override) {
        DefaultTrackSelector.d dVarH = parameters.a().i(rendererIndex).H(rendererIndex, isDisabled);
        if (override != null) {
            dVarH.J(rendererIndex, trackGroupArray, override);
        }
        return dVarH.a();
    }
}
