package androidx.media;

import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;
import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY})
public class c {
    private c() {
    }

    public static boolean a(Bundle options1, Bundle options2) {
        if (options1 == options2) {
            return true;
        }
        if (options1 == null) {
            return options2.getInt(MediaBrowserCompat.f9287d, -1) == -1 && options2.getInt(MediaBrowserCompat.f9288e, -1) == -1;
        }
        if (options2 == null) {
            return options1.getInt(MediaBrowserCompat.f9287d, -1) == -1 && options1.getInt(MediaBrowserCompat.f9288e, -1) == -1;
        }
        return options1.getInt(MediaBrowserCompat.f9287d, -1) == options2.getInt(MediaBrowserCompat.f9287d, -1) && options1.getInt(MediaBrowserCompat.f9288e, -1) == options2.getInt(MediaBrowserCompat.f9288e, -1);
    }

    public static boolean b(Bundle options1, Bundle options2) {
        int i10;
        int i11;
        int i12;
        int i13 = options1 == null ? -1 : options1.getInt(MediaBrowserCompat.f9287d, -1);
        int i14 = options2 == null ? -1 : options2.getInt(MediaBrowserCompat.f9287d, -1);
        int i15 = options1 == null ? -1 : options1.getInt(MediaBrowserCompat.f9288e, -1);
        int i16 = options2 == null ? -1 : options2.getInt(MediaBrowserCompat.f9288e, -1);
        int i17 = Integer.MAX_VALUE;
        if (i13 == -1 || i15 == -1) {
            i10 = Integer.MAX_VALUE;
            i11 = 0;
        } else {
            i11 = i13 * i15;
            i10 = (i15 + i11) - 1;
        }
        if (i14 == -1 || i16 == -1) {
            i12 = 0;
        } else {
            i12 = i14 * i16;
            i17 = (i16 + i12) - 1;
        }
        return i10 >= i12 && i17 >= i11;
    }
}
