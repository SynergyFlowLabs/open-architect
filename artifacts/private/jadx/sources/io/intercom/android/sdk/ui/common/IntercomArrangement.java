package io.intercom.android.sdk.ui.common;

import androidx.compose.foundation.layout.q;
import androidx.compose.runtime.k7;
import androidx.compose.runtime.o2;
import androidx.compose.ui.unit.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@o2
public final class IntercomArrangement {
    public static final int $stable = 0;

    @NotNull
    public static final IntercomArrangement INSTANCE = new IntercomArrangement();

    private IntercomArrangement() {
    }

    @k7
    @NotNull
    public final q.m itemAtBottom(final int i10) {
        return new q.m() { // from class: io.intercom.android.sdk.ui.common.IntercomArrangement.itemAtBottom.1
            @Override // androidx.compose.foundation.layout.q.m
            public void arrange(d dVar, int i11, int[] sizes, int[] outPositions) {
                Intrinsics.checkNotNullParameter(dVar, "<this>");
                Intrinsics.checkNotNullParameter(sizes, "sizes");
                Intrinsics.checkNotNullParameter(outPositions, "outPositions");
                int i12 = i10;
                int length = sizes.length;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                while (i13 < length) {
                    int i16 = sizes[i13];
                    int i17 = i14 + 1;
                    if (i14 == i12) {
                        outPositions[i14] = i11 - i16;
                    } else {
                        outPositions[i14] = i15;
                        i15 += i16;
                    }
                    i13++;
                    i14 = i17;
                }
            }

            public String toString() {
                return "Arrangement#itemAtBottom(" + i10 + ')';
            }
        };
    }
}
