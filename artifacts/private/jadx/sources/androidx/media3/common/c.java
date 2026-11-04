package androidx.media3.common;

import android.view.ViewGroup;
import com.google.common.collect.l6;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface c {
    default List<a> getAdOverlayInfos() {
        return l6.F();
    }

    @androidx.annotation.p0
    ViewGroup getAdViewGroup();
}
